package com.example.solution;

import com.example.solution.logic.ISolver;
import com.example.solution.logic.Solver;
import com.example.solution.service.Messages;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    ISolver solver() {
        return new Solver();
    }
}

