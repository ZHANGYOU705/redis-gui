package cn.zhangyou705.redis.gui.framework.handler;

import cn.zhangyou705.redis.gui.bean.enu.RoleType;
import cn.zhangyou705.redis.gui.bean.po.SysUser;
import cn.zhangyou705.redis.gui.dao.SysUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@Slf4j
@Component
public class InitSysUserHandler implements ApplicationRunner {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public void run(ApplicationArguments args) {
        long count = sysUserRepository.count();
        log.info("检测系统用户数量：{}", count);
        if (count == 0) {
            log.info("开始初始化用户信息...");
            sysUserRepository.save(adminUser());
            log.info("初始化完成！");
        }
    }

    private SysUser adminUser() {
        SysUser sysUser = new SysUser();
        sysUser.setId("1");
        sysUser.setUsername("zhangyou");
        sysUser.setNickname("系统管理员");
        sysUser.setAddr("北京");

        String autoPwd = UUID.randomUUID().toString().substring(0, 10);
        System.out.println("随机生成的密码是：" + autoPwd);

        sysUser.setPassword(autoPwd);
        sysUser.setQq("123456789");
        sysUser.setSex("男");
        sysUser.setRole(RoleType.ADMIN.name());
        sysUser.setStatus(Boolean.TRUE);
        sysUser.setAvatar("https://www.zhangyou705.cn/pics/%E4%BD%91%E4%BD%91%E5%B0%8F%E5%93%A5%E5%93%A5.jpg");

        log.info("Role:{} - username:{} - password:{}", sysUser.getRole(), sysUser.getUsername(), sysUser.getPassword());
        return sysUser;
    }
}
