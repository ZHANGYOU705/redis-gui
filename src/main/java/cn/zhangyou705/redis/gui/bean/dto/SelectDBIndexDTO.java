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
public class SelectDBIndexDTO implements Serializable {

    private String name;
    private String db;
}
