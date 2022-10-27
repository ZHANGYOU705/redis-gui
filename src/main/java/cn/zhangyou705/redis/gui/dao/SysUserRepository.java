package cn.zhangyou705.redis.gui.dao;

import cn.zhangyou705.redis.gui.bean.po.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Repository
public interface SysUserRepository extends JpaRepository<SysUser, String> {

    SysUser findByUsername(String username);

}
