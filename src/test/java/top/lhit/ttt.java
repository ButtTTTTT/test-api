package top.lhit;

import cn.hutool.core.util.IdUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lhit.module.entity.User;
import top.lhit.module.service.IUserService;

import java.util.Date;

@SpringBootTest
public class ttt {
    @Autowired
    private IUserService userService;
    @Test
    public void t1(){
        for (int i = 0; i < 30; i++) {
        userService.save(new User(IdUtil.fastUUID(),IdUtil.fastUUID(),new Date()));
        }
    }
}
