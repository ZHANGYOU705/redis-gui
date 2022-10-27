package cn.zhangyou705.redis.gui.controller;

import cn.zhangyou705.redis.gui.bean.dto.SysUserDTO;
import cn.zhangyou705.redis.gui.bean.po.SysUser;
import cn.zhangyou705.redis.gui.bean.vo.LoginUserVO;
import cn.zhangyou705.redis.gui.bean.vo.SysUserQueryVO;
import cn.zhangyou705.redis.gui.framework.common.Response;
import cn.zhangyou705.redis.gui.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@RestController
@RequestMapping("/user")
public class AdminUserController extends BaseController {

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<SysUser> login(@RequestBody LoginUserVO vo) {

        return adminUserService.login(vo);
    }

    @GetMapping(path = "/query", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<List<SysUserDTO>> query() {

        return adminUserService.queryList(new SysUserQueryVO());
    }

    @PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<Boolean> save(@RequestBody SysUser user) {

        return adminUserService.saveOrUpdateUser(user);
    }

    @PostMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<Boolean> delete(@RequestBody List<String> ids) {

        return adminUserService.deleteBatchUser(ids);
    }
}
