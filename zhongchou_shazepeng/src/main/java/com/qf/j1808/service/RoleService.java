package com.qf.j1808.service;

import com.qf.j1808.pojo.RoleInfo;
import com.qf.j1808.pojo.UserRole;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface RoleService {
    public List<RoleInfo> selectAllRole();

    public void undateRoleInfo(RoleInfo roleInfo);

    public List<RoleInfo> selectUid(int uid);
    public List<RoleInfo> selectNoUid(int uid);
    public RoleInfo selectRoleByName(String param);
    public void insertUR(UserRole userRole);
    public void deleteUR(UserRole userRole);

}
