package cn.zhangyou705.redis.gui.dao;

import cn.zhangyou705.redis.gui.bean.po.SysUserHost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Repository
public interface SysUserHostRepository extends JpaRepository<SysUserHost, String> {

    List<SysUserHost> findByUsername(String username);
}
