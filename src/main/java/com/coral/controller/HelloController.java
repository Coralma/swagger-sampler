package com.coral.controller;

import com.coral.model.Person;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 */
@Api(value = "HelloController", description = "Hello World to Swagger")
@Controller
@RequestMapping("/base")
public class HelloController {
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public ModelAndView helloWorld() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        System.out.println("Version 1");
        System.out.println("Version 2");
        System.out.println("Version 3");
        return mv;
    }

    @ApiOperation("用户登录验证")
    @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "string"), @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "string")})
    @RequestMapping(value="/login", method= RequestMethod.POST)
    public ModelAndView login(String username, String password) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        return mv;
    }

    @ApiOperation("json返回测试")
    @ResponseBody
    @RequestMapping(value="/json", method= RequestMethod.GET)
    public Person testJson() {
        Person person = new Person("gude", "111111");
        return person;
    }

    @ApiOperation("根据VIN码查询VTM接口")
    @RequestMapping(value = "/queryByVtm", method= RequestMethod.GET)
    @ResponseBody
    public String queryByVtm(@ApiParam(name = "code", value = "VIN码", required = true)  @RequestParam("code") String code) {
        return "VIN - " + code;
    }
}
