package com.qf.j1808.mapper;

import com.qf.j1808.pojo.Apply;
import com.qf.j1808.vo.ApplyVo;

import java.util.List;

public interface ApplyMapper {
    public void addApply(ApplyVo applyVo);

    public Apply selectApply(int userid);

    public List<Apply> allApply();

    public void updateApply(Apply apply);

    public Apply getOneApply(int applyId);
}
