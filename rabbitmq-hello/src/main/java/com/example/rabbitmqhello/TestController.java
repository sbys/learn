package com.example.rabbitmqhello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @RequestMapping("/send")
    @ResponseBody
    public String  send(@RequestParam("message")String message){
        rabbitTemplate.convertAndSend("hello",message);
        return "ok";
    }
}
