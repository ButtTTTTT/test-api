package top.lhit.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan(value = "top.lhit.module.mapper")
@EnableTransactionManagement
public class MybatisPlusConfig {
//    /**
//     * 添加分页插件
//     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        //创建一个分页拦截器
//        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//
//        //设置请求的页面大于最大页后操作，true 调回到首页，false继续请求 default false
//        //PaginationInterceptor.setOverflow(false);
//
//        //设置最大单页限制数量，默认 500条，-1 不受限制
//        paginationInterceptor.setLimit(50);
//
//        //开启count 的join 优化，只针对部分left join
//        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
//        return paginationInterceptor;
//    }
}