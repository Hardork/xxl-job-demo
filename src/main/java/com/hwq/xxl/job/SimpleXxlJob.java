package com.hwq.xxl.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author HWQ
 * @date 2024/7/11 09:35
 * @description
 */
@Component
public class SimpleXxlJob {
    @XxlJob("demoJobHandler")
    public void domoJobHandler() throws Exception {
        System.out.println("执行定时任务，执行时间:" + new Date());
    }

    public void test(){}


}
