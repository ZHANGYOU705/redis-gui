package cn.zhangyou705.redis.gui.service;

import cn.zhangyou705.redis.gui.bean.dto.RedisConfigDTO;
import cn.zhangyou705.redis.gui.bean.dto.SelectDBIndexDTO;
import cn.zhangyou705.redis.gui.bean.po.RedisConfig;
import cn.zhangyou705.redis.gui.bean.po.SysUser;
import cn.zhangyou705.redis.gui.framework.common.Response;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @author ZhangYou
 * @description Redis 配置管理service
 * @date 2022/10/27
 */
public interface RedisManagerService {

    Response<List<RedisConfig>> list();

    Response<Boolean> saveOrUpdateConfig(RedisConfig config);

    Response<Boolean> enabledOrDisabled(String host, int port, boolean status);

    Response<Boolean> deleteConfig(String host, int port);


    /**
     * 根据host 获取ERR数据库索引
     *
     * @param host IP or URL地址
     * @return ERR数据库索引 集合
     */
    Response<List<SelectDBIndexDTO>> selectDBIndex(String host, int port);

    RedisConfig getRedisConfig(String host, int port);

    Jedis getJedis(RedisConfig redisConfig, String db);

    Response<List<RedisConfigDTO>> select(SysUser sysUser);
}
