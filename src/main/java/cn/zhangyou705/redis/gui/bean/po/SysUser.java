package cn.zhangyou705.redis.gui.bean.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class SysUser implements Serializable {

    @Id
    private String id;

    private String username;

    private String password;

    private String avatar;

    private String nickname;

    private String sex;

    private String qq;

    private String tel;

    private String addr;

    private String birth;

    private Boolean status = false;

    private String role;

    @Transient
    private List<String> hosts;
}
