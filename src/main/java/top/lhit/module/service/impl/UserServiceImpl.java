package top.lhit.module.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lhit.common.constant.blog.CommonResult;
import top.lhit.module.entity.User;
import top.lhit.module.mapper.UserMapper;
import top.lhit.module.service.IUserService;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
@Service@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private IUserService userService;
    @Override
    public CompletionStage<CommonResult> listUser() {

        return CompletableFuture.supplyAsync(()->{

        List<User> list = userService.list();

        log.info("IUserService.listUser : {}",CommonResult.success(list));

            return  CommonResult.success(list);
        });
    }

    @Override
    public CompletionStage<CommonResult> queryUser(String userId) {
        return CompletableFuture.supplyAsync(()->{
            User user = userService.getById(userId);
            return CommonResult.success(user);
        });
    }
}
