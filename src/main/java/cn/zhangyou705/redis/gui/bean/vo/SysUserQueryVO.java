package cn.zhangyou705.redis.gui.bean.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class SysUserQueryVO implements Serializable {

    private String id;
    private String username;
}
