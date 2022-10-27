package cn.zhangyou705.redis.gui.bean.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysUserDTO implements Serializable {

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

    private List<String> hosts;
}
