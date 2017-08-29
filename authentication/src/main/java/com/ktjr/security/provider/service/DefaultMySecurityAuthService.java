package com.ktjr.security.provider.service;

import com.ktjr.security.api.entity.MyRole;
import com.ktjr.security.api.entity.MyUser;
import com.ktjr.security.api.service.MySecurityAuthService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用于用户的登录处理
 * 提供两个需要子类实现的方法getUser、getUserRoles，
 * Created by ljj on 17/6/28.
 */
@Service
public class DefaultMySecurityAuthService implements MySecurityAuthService {

    /**
     * 登录时根据用户登录名称获取MyUser类型的用户信息（需要子类实现）
     *
     * @param username
     * @return
     */
    public MyUser getUser(String username) {
        return null;
    }

    /**
     * 登录时，根据用户登录名称获取用户的角色列表（需要子类实现）
     *
     * @param username
     * @return
     */
    public List<MyRole> getUserRoles(String username) {
        return null;
    }
}
