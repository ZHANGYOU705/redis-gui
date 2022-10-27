package cn.zhangyou705.redis.gui.bean.po;

import cn.hutool.core.util.IdUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class SysUserHost implements Serializable {

    @Id
    private String id;

    private String username;

    private String host;

    private int port;

    public SysUserHost() {

    }

    public SysUserHost(String username, String host) {
        long nextId = IdUtil.createSnowflake(1, 1).nextId();
        this.id = "U" + nextId;
        this.username = username;
        this.host = host;
        this.port = 6379;
    }

    public SysUserHost(String username, String host, int port) {
        long nextId = IdUtil.createSnowflake(1, 1).nextId();
        this.id = "U" + nextId;
        this.username = username;
        this.host = host;
        this.port = port;
    }
}
