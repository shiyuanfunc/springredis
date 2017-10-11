package com.song.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/10/11.
 */
@Controller
@Scope("prototype")
@RequestMapping("/view")
public class DafaultController  {

    @RequestMapping(value = "/{defaultName}")
    public String defaultController(
            @PathVariable String defaultName) {
        return defaultName;
    }

    @RequestMapping("/{f}/{ff}")
    public String deaultCon(@PathVariable("f") String f,@PathVariable("ff") String ff){
        return f +"/"+ ff;
    }
}
