package cn.zhangyou705.redis.gui.bean.dto;

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
public class RedisConfigDTO implements Serializable {
    private String id;

    /**
     * 主机
     */
    private String host;

    /**
     * 端口
     */
    private int port;

    /**
     * 密码
     */
    private String password;

    /**
     * 别名
     */
    private String name;

    /**
     * 可用状态
     */
    private Boolean status = false;

    /**
     * 环境
     */
    private String env;
}
