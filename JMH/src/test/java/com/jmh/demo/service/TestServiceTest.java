package com.jmh.demo.service;

import com.jmh.demo.utils.BeanHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;


/**
 * @authoer:WangMengqiang
 * @createDate:2023/3/10
 * @description:
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@BenchmarkMode(Mode.AverageTime) // 吞吐量
@OutputTimeUnit(TimeUnit.MILLISECONDS) // 结果所使用的时间单位
@State(Scope.Thread) // 每个测试线程分配一个实例
@Fork(0) // Fork进行的数目，一定要设成0，benchmark和启动方法在同一个jvm中执行
@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.MILLISECONDS) // 先预热1轮
@Measurement(iterations = 2, time = 1, timeUnit = TimeUnit.MILLISECONDS) // 进行2轮测试
public class TestServiceTest {

    @Autowired
    public void inject(TestService testService){
        BeanHolder.setBean(testService);
    }

    private TestService testService;

    @Setup
    public void setUp(){
        testService = BeanHolder.getBean();
    }

//    private static TestService testService;
//
//    @Autowired
//    public void setTestService(TestService testService){
//        TestServiceTest.testService = testService;
//    }

    @Test
    @Benchmark
    public void test(){
        testService.print();
    }

    @Test
    public void JmhTest() throws RunnerException {
        Options options = new OptionsBuilder()
                .include(TestServiceTest.class.getSimpleName())
                .build();
        new Runner(options).run();
    }


}