package top.lhit.common.utils;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.FileNotFoundException;
public class FileUtil {
    /**
     * 获取当前项目路径
     */
    public static String getClasspath(){
        File path = null;
        try {
            path = new File(ResourceUtils.getURL("classpath:").getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (!path.exists()) {
            path = new File("");
        }

        return path.getAbsolutePath();
    }
}
