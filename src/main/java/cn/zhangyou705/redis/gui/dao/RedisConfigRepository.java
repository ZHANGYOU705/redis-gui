package cn.zhangyou705.redis.gui.dao;

import cn.zhangyou705.redis.gui.bean.po.RedisConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Repository
public interface RedisConfigRepository extends JpaRepository<RedisConfig, String> {

    List<RedisConfig> findByHost(String host);

    RedisConfig findByHostAndPort(String host, int port);
}
