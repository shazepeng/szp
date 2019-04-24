package com.qf.j1808.service.impl;

import com.qf.j1808.mapper.CretMapper;
import com.qf.j1808.pojo.Cret;
import com.qf.j1808.service.CretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CretServiceImpl implements CretService {
    @Autowired
    CretMapper cretMapper;

    public List<Cret> selectCret() {
        return cretMapper.selectCret();
    }
}
