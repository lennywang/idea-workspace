package com.bwj.springboot02.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoPrototypeService
 * @Description TODO
 * @Author wll
 * @Date 2019/5/22 1:00
 * @Version 1.0
 **/
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
