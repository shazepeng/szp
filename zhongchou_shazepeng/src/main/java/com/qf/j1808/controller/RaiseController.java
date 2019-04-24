package com.qf.j1808.controller;

import com.qf.j1808.pojo.Raise;
import com.qf.j1808.pojo.UserRaise;
import com.qf.j1808.service.RaiseService;
import com.qf.j1808.vo.RaiseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RaiseController {
    @Autowired
    RaiseService raiseService;

    @RequestMapping(value = "addRaise")
    public Object addRasie(@Valid @RequestBody RaiseVo raiseVo, BindingResult result, ModelMap modelMap){
        if(result.hasErrors()){
            List<FieldError> fieldError = result.getFieldErrors();
            for(FieldError error : fieldError){
                modelMap.put("ERR_" + error.getField(),error.getDefaultMessage());
                return error.getField()+ "*" +error.getDefaultMessage();
            }
        }
        raiseService.addRaise(raiseVo);
        return true;
    }

    @RequestMapping(value = "selectRaise")
    public Object selectRaise(){
        return raiseService.selectRaise();
    }

    @RequestMapping(value = "updateRaise")
    public Object updateRaise(@RequestBody Raise raise){
        raiseService.updateRaise(raise);
        return true;
    }
    @RequestMapping(value = "selectAll")
    public Object selectAll(){
        return raiseService.selectAll();
    }

    @RequestMapping(value = "selectNum")
    public Object selectNum(@RequestParam int raiseid){
        return raiseService.selectNum(raiseid);
    }

    @RequestMapping(value = "addSupport")
    public Object addSupport(@RequestBody UserRaise userRaise){
        raiseService.addSupport(userRaise);
        return true;
    }

    @RequestMapping(value = "selectStartRaise",method = RequestMethod.GET)
    public Object selectStartRaise(@RequestParam int userid){
        List<Raise> raises = raiseService.selectStartRaise(userid);
        return raises;
    }

    @RequestMapping(value = "selectSupportRaise",method = RequestMethod.GET)
    public Object selectSupportRaise(@RequestParam int userId){
        List<Raise> raises = raiseService.selectSupportRaise(userId);
        return raises;
    }
    @RequestMapping(value = "getOneRaise")
    public Object getOneRaise(@RequestParam int raiseId){
        return raiseService.getOneRaise(raiseId);
    }
}
