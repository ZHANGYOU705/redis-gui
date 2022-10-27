package cn.zhangyou705.redis.gui.service;

import cn.zhangyou705.redis.gui.framework.common.Response;
import cn.zhangyou705.redis.gui.bean.dto.SysUserDTO;
import cn.zhangyou705.redis.gui.bean.po.SysUser;
import cn.zhangyou705.redis.gui.bean.vo.LoginUserVO;
import cn.zhangyou705.redis.gui.bean.vo.SysUserQueryVO;

import java.util.List;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
public interface AdminUserService {

    /**
     * 用户登录
     *
     * @param loginUser 登录用户
     * @return 登录成功后的用户信息
     */
    Response<SysUser> login(LoginUserVO loginUser);

    /**
     * 保存或修改用户信息
     *
     * @param user 用户信息
     * @return 是否操作成功
     */
    Response<Boolean> saveOrUpdateUser(SysUser user);

    /**
     * 保存或修改用户信息
     *
     * @param user 用户信息
     * @return 是否操作成功
     */
    Response<Boolean> enabledOrDisabledUser(SysUser user);

    /**
     * 删除用户
     *
     * @param ids 用户唯一ID集合
     * @return 是否操作成功
     */
    Response<Boolean> deleteBatchUser(List<String> ids);

    /**
     * 查询用户列表（分页）
     *
     * @param vo 查询参数
     * @return 用户列表
     */
    Response<List<SysUserDTO>> queryList(SysUserQueryVO vo);

    /**
     * 查询用户详情
     *
     * @param vo 查询参数
     * @return 用户详情
     */
    Response<SysUser> queryDetails(SysUserQueryVO vo);
}
