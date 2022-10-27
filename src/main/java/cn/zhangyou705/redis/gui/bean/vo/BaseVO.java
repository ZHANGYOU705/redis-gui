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
public class BaseVO implements Serializable {
    /**
     * 主机
     */
    private String host = "127.0.0.1";

    private int port = 6379;

    /**
     * db
     */
    private String db = "0";
}
