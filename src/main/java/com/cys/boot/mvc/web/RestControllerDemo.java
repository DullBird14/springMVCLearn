package com.cys.boot.mvc.web;

import com.cys.boot.mvc.entity.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/rest")
public class RestControllerDemo {
    @RequestMapping(value = "/getjson",produces = {"application/json;charset=UTF-8"})
    public DemoObj getJson(DemoObj demoObj){
        return new DemoObj(demoObj.getId() + 1, demoObj.getName() + "yy");
    }

    @RequestMapping(value = "/getxml",produces = {"application/xml;charset=UTF-8"})
    public DemoObj getXml(DemoObj demoObj){
        return new DemoObj(demoObj.getId() + 1, demoObj.getName() + "yy");
    }
}
