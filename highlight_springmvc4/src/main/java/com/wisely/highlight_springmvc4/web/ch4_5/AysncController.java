package com.wisely.highlight_springmvc4.web.ch4_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import com.wisely.highlight_springmvc4.service.PushService;

@Controller
public class AysncController {
    @Autowired
    PushService pushService; //1

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall() { //2
        return pushService.getAsyncUpdate();
    }

}

