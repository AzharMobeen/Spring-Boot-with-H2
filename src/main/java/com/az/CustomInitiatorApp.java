package com.az;

import com.az.service.UserService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Log
@Component
public class CustomInitiatorApp implements ApplicationRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.info("CustomInitiatorApp run method ...");
        userService.insertDummyData();
        log.info("CustomInitiatorApp run method end");
    }
}
