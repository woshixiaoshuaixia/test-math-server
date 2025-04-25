package cn.hrfax.test.math.server.config;

import cn.hrfax.test.math.server.service.MathService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingfei
 * @since 2025-04-22
 */
@Configuration
public class AppConfig {
    @Bean
    public ToolCallbackProvider weatherTools(MathService mathService) {
        return MethodToolCallbackProvider.builder().toolObjects(mathService).build();
    }

}