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
public class SysRedisCreateVO extends BaseVO implements Serializable {

    private int port;

    private String password;

    private String name;

    private Boolean status;

    private String env;
}
