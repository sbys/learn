package com.example.rabbitmqhello;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {
        RabbitConfig.class,
        Receiver.class,
        Sender.class
})
@SpringBootTest
class RabbitmqHelloApplicationTests {

    @Autowired
    private Sender sender;
    @Test
    public void hello() throws Exception{
        sender.send();
    }

}
