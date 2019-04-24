package com.qf.j1808.mapper;

import com.qf.j1808.dto.RaiseDto;
import com.qf.j1808.pojo.Raise;
import com.qf.j1808.pojo.UserRaise;
import com.qf.j1808.vo.RaiseVo;

import java.util.List;

public interface RaiseMapper {
    public void addRaise(RaiseVo raiseVo);

    public List<RaiseDto> selectRaise();

    public void updateRaise(Raise raise);

    public List<Raise> selectAll();

    public int selectNum(int raiseid);

    public void addSupport(UserRaise userRaise);

    public List<Raise> selectStartRaise(int userId);

    public List<Raise> selectSupportRaise(int userId);

    public Raise getOneRaise(int raiseId);
}
