package top.lhit.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.lhit.module.entity.User;
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
