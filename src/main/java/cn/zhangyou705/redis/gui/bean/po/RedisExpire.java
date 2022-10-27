package cn.zhangyou705.redis.gui.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class RedisExpire implements Serializable {
    private long expire;
    private String expireStr;
}
