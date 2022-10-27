package cn.zhangyou705.redis.gui.bean.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CacheSynchVO extends BaseVO {

    private String keyword;

    /**
     * 数据类型
     */
    private String type;

    /**
     * 目标主机
     */
    private String targetHost;

    private int targetPort = 6379;
    /**
     * 目标db
     */
    private String targetDb;

    private int pageNo = 1;
}
