package cn.zhangyou705.redis.gui.service;

import cn.zhangyou705.redis.gui.bean.dto.SysRedisDTO;
import cn.zhangyou705.redis.gui.bean.po.SysRedis;
import cn.zhangyou705.redis.gui.bean.vo.CachPublishVO;
import cn.zhangyou705.redis.gui.bean.vo.CacheRedisQueryVO;
import cn.zhangyou705.redis.gui.bean.vo.CacheRedisVO;
import cn.zhangyou705.redis.gui.bean.vo.CacheSynchVO;
import cn.zhangyou705.redis.gui.framework.common.Response;

import java.util.List;

/**
 * @author ZhangYou
 * @description Redis CRUD操作
 * @date 2022/10/27
 */
public interface RedisOperationService {

    /**
     * 缓存 - 列表查询
     *
     * @param vo 查询参数
     * @return 缓存列表
     */
    Response<List<SysRedis>> cacheList(CacheRedisQueryVO vo);

    /**
     * 缓存 - 详情
     *
     * @param vo 参数
     * @return 缓存详情
     */
    Response<SysRedisDTO> cacheDetails(CacheRedisQueryVO vo);

    /**
     * 缓存 - 创建
     *
     * @param vo 参数
     * @return 是否缓存成功
     */
    Response<Boolean> cacheCreate(CacheRedisVO vo);

    /**
     * 缓存 - 删除
     *
     * @param vo 参数
     * @return 是否成功
     */
    Response<Boolean> cacheDelete(CacheRedisVO vo);

    /**
     * 缓存 - 更新名称
     *
     * @param vo 参数
     * @return 是否成功
     */
    Response<Boolean> cacheNameUpdate(CacheRedisVO vo);

    /**
     * 缓存 - 创建缓存值
     *
     * @param vo 参数
     * @return 是否成功
     */
    Response<Boolean> cacheValueCreate(CacheRedisVO vo);

    /**
     * 缓存 - 更新缓存值
     *
     * @param vo 参数
     * @return 是否成功
     */
    Response<Boolean> cacheValueUpdate(CacheRedisVO vo);

    /**
     * 更新过期时间
     *
     * @param vo 参数
     * @return 是否成功
     */
    Response<Boolean> cacheExpireUpdate(CacheRedisVO vo);

    Response<Boolean> cacheSynch(CacheSynchVO vo);

    Response<Long> cachePublish(CachPublishVO vo);

}
