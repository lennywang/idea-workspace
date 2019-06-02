package com.spring.controller;

        import com.spring.service.AccountService;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

        import javax.annotation.Resource;

/**
 * @ClassName TXTest
 * @Description TODO
 * @Author wll
 * @Date 2019/4/27 21:37
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TXTest {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void fun1(){
        accountService.transfer(1,2,100d);
    }
}
