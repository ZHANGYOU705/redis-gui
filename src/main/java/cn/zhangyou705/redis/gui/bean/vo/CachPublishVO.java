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
public class CachPublishVO extends BaseVO {

    private String channel;

    private String message;

}
