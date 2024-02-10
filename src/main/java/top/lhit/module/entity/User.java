package top.lhit.module.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@TableName("user")
public class User {
    private static final long serialVersionUID = 1L;
    @TableId(value = "user_id")
    private String userId;
    private String username;
    private Date createTime;
}
