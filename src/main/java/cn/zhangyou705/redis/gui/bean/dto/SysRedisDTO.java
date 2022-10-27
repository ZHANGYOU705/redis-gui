package cn.zhangyou705.redis.gui.bean.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysRedisDTO implements Serializable {
    /**
     * 数据类型
     */
    private String dataType;
    /**
     * 原始的缓存key
     */
    private String oldRedisKey;
    /**
     * 缓存键
     */
    private String redisKey;
    /**
     * 缓存值
     */
    private String redisValue;
    /**
     * 过期时间
     */
    private String expire;

    private String expireStr;
    /**
     * 集合元素总数
     */
    private long elCount;

    private List<Map<String, Object>> values;
}
