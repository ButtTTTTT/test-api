package top.lhit.module.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.lhit.common.utils.CommonResult;
import top.lhit.module.service.IUserService;

import javax.validation.constraints.NotNull;
import java.util.concurrent.CompletionStage;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @ResponseBody
    @GetMapping("/query/list")
    public CompletionStage<CommonResult> userQuery() {
        return userService.listUser();
    }
    @ResponseBody
    @GetMapping("/query")
    public CompletionStage<CommonResult> userQuery(@NotNull String userId) {
        return userService.queryUser(userId);
    }
}
