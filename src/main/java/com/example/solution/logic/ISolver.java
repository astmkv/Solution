package com.example.solution.logic;

import com.example.solution.service.Messages;

public interface ISolver {

    Messages.OutputMessage solve(Messages.InputMessage input);
}
