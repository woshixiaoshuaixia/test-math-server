package cn.hrfax.test.math.server.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

/**
 * @author jingfei
 * @since 2025/4/25
 */
@Slf4j
@Service
public class MathService {

    @Tool(description = "求一个正整数的最大因数（不包含本身）")
    public String getMaxCommonFactorByParam(@ToolParam(description = "输入的正整数") Integer number) {
        return number + "的最大因数是：" + getMaxCommonFactor(number);
    }

    public Integer getMaxCommonFactor(Integer number) {

        if (number <= 1) {
            return null;
        }

        if (number == 2) {
            return number >> 1;
        }

        // 求出平方根
        int sqrt = (int) Math.sqrt(number);

        for (int i = 2; i<=sqrt; i++) {
            if ((number % i) == 0) {
                return number / i;
            }
        }

        return 1;
    }

}
