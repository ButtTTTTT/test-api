package top.lhit.module.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lhit.common.constant.blog.CommonResult;
import top.lhit.module.entity.User;
import java.util.concurrent.CompletionStage;

public interface IUserService extends IService<User> {
    CompletionStage<CommonResult> listUser();

    CompletionStage<CommonResult> queryUser(String userId);
}
