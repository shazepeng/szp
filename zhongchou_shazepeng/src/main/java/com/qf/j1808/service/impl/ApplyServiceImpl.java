package com.qf.j1808.service.impl;

import com.qf.j1808.mapper.ApplyMapper;
import com.qf.j1808.pojo.Apply;
import com.qf.j1808.service.ApplyService;
import com.qf.j1808.vo.ApplyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyServiceImpl implements ApplyService {
    @Autowired
    ApplyMapper applyMapper;
    public void addApply(ApplyVo applyVo) {
        applyMapper.addApply(applyVo);
    }

    public Apply selectApply(int userid) {
        return applyMapper.selectApply(userid);
    }

    public List<Apply> allApply() {
        return applyMapper.allApply();
    }

    public void updateApply(Apply apply) {
        applyMapper.updateApply(apply);
    }

    public Apply getOneApply(int applyId) {
        return applyMapper.getOneApply(applyId);
    }
}
