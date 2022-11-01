package com.example.solution.service;


import com.example.solution.logic.ISolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/service")
public class SolvetService {

    @Autowired
    private ISolver solver;

    @GetMapping("/ping")
    public @ResponseBody Messages.Message ping() {
        return new Messages.Message("pong");
    }

    @GetMapping("/status")
    public @ResponseBody Messages.Message status(){
        return new Messages.Message("Server status OK at port 8080");
    }

    @PostMapping("/solve")
    public @ResponseBody Messages.IMessage solve(@RequestBody Messages.InputMessage input) {
        System.out.println("Received data: " + input);
        Messages.OutputMessage out = solver.solve(input);
        if(out == null){
            return new Messages.ErrorMessage("Triangle doesn't exist");
            }
        return out;
        }
    }



