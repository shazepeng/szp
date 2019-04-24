package com.qf.j1808.controller;

import com.qf.j1808.pojo.Apply;
import com.qf.j1808.service.ApplyService;
import com.qf.j1808.util.SendEmail;
import com.qf.j1808.vo.ApplyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
public class ApplyController {
    @Autowired
    ApplyService applyService;

    @RequestMapping(value = "addApply")
    public Object addAply(@Valid @RequestBody ApplyVo applyVo, BindingResult result, ModelMap modelMap){
        if(result.hasErrors()){
            List<FieldError> fieldError = result.getFieldErrors();
            for(FieldError error : fieldError){
                modelMap.put("ERR_" + error.getField(),error.getDefaultMessage());
                return error.getField()+ "*" +error.getDefaultMessage();
            }
        }
        applyService.addApply(applyVo);
        return true;
    }


    @RequestMapping(value = "uploadFile",method = RequestMethod.POST)
    public Object uploadFile(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        String url = request.getSession().getServletContext().getRealPath("apply/");
        String fileName = new Date().getTime() + file.getOriginalFilename();
        String path = url + fileName;
        File newFile = new File(path);
        file.transferTo(newFile);
        return "apply/"+fileName;
    }

    @RequestMapping(value = "selectApply")
    public Object selectApply(@RequestParam int userid){
        Apply apply = applyService.selectApply(userid);
        return apply;
    }

    @RequestMapping(value = "allApply")
    public Object allApply(){
        return applyService.allApply();
    }

    @RequestMapping(value = "updateApply")
    public Object updateApply(@RequestBody Apply apply){
        applyService.updateApply(apply);
        return true;
    }
    @RequestMapping(value = "getOneApply")
    public Object getOneApply(@RequestParam int applyId){
        return applyService.getOneApply(applyId);
    }

    @RequestMapping(value = "sendEmail")
    private String sendEmail(@RequestParam String emailaddress){
        String s = SendEmail.sendEmail(emailaddress);
        return s;
    }
}
