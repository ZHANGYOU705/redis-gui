package cn.zhangyou705.redis.gui.controller;

import cn.zhangyou705.redis.gui.framework.exception.ServerException;
import cn.zhangyou705.redis.gui.bean.po.SysUser;
import cn.zhangyou705.redis.gui.dao.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
//@CrossOrigin
public class BaseController {

    @Autowired
    private SysUserRepository sysUserRepository;

    public SysUser getLoginUser() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert requestAttributes != null;
        HttpServletRequest httpServletRequest = requestAttributes.getRequest();
        String username = httpServletRequest.getHeader("x-username");
        SysUser sysUser = sysUserRepository.findByUsername(username);
        if (sysUser == null) {
            throw new ServerException("用户不存在");
        }
        if (Boolean.FALSE.equals(sysUser.getStatus())) {
            throw new ServerException("用户已停用");
        }
        return sysUser;
    }

}
