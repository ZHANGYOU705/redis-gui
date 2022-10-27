package cn.zhangyou705.redis.gui.bean.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CacheRedisQueryVO extends BaseVO implements Serializable {

    private String keyword;

    private String cacheKeyword;

    /**
     * 数据类型
     */
    private String type;

    private int pageNo = 1;

    /**
     * 默认100条分页
     */
    private int pageSize = 100;
}
