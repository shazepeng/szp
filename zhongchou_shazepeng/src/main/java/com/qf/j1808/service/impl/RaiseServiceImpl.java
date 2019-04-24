package com.qf.j1808.service.impl;

import com.qf.j1808.dto.RaiseDto;
import com.qf.j1808.mapper.RaiseMapper;
import com.qf.j1808.pojo.Raise;
import com.qf.j1808.pojo.UserRaise;
import com.qf.j1808.service.RaiseService;
import com.qf.j1808.vo.RaiseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaiseServiceImpl implements RaiseService {
    @Autowired
    RaiseMapper raiseMapper;

    public void addRaise(RaiseVo raiseVo) {
        raiseMapper.addRaise(raiseVo);
    }

    public List<RaiseDto> selectRaise() {
        return raiseMapper.selectRaise();
    }

    public void updateRaise(Raise raise) {
        raiseMapper.updateRaise(raise);
    }

    public List<Raise> selectAll() {
        return raiseMapper.selectAll();
    }

    public int selectNum(int raiseid) {
        return raiseMapper.selectNum(raiseid);
    }

    public void addSupport(UserRaise userRaise) {
        raiseMapper.addSupport(userRaise);
    }

    public List<Raise> selectStartRaise(int userId) {
        return raiseMapper.selectStartRaise(userId);
    }

    public List<Raise> selectSupportRaise(int userId) {
        return raiseMapper.selectSupportRaise(userId);
    }

    public Raise getOneRaise(int raiseId) {
        return raiseMapper.getOneRaise(raiseId);
    }

}
