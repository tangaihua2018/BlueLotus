package com.shengruitn.bluelotusmanager.controller;

import com.shengruitn.bluelotusmanager.dataobject.foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.objects.NativeDebug.map;

/**
 * @author tangah
 * @Title: index
 * @ProjectName blueLotus
 * @Description: 测试页面
 * @date 2018/7/28     1:26
 */
@Controller
@RequestMapping("/")
@Slf4j
public class indexController {
    @RequestMapping("/")
    public String index(ModelMap model){

        foo foo = new foo();
        List<foo> fooList = new ArrayList<>();
        foo.setId("213");
        foo.setName("tangah");
        foo.setOld(123);
        foo.setDate(new Date());

        fooList.add(foo);
        fooList.add(foo);
        fooList.add(foo);
        fooList.add(foo);
        model.put("foo",foo);
        log.info("foo:{}", fooList.get(0).getName());
        model.put("foolist",fooList);
        model.put("admin","admin");
        return "index";
    }
}
