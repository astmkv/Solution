package com.example.solution.logic;

import com.example.solution.service.Messages;

public class Solver implements ISolver {

    private boolean checkTriangle(int l1, int l2){
        if (l1 == l2/2) return true;
        else return false;
    }


    @Override
    public Messages.OutputMessage solve(Messages.InputMessage input){
        String typeLine1 = input.typeLine1;
        int line1 = input.line1;
        String typeLine2 = input.typeLine2;
        int line2 = input.line2;

        String typeLine3;
        double line3;
        if (typeLine1.equals(typeLine2) & typeLine1.equals("cathet")){
            typeLine3 = "hypotenuse";
            line3 = Math.sqrt(Math.pow(line1,2) + Math.pow(line2,2));
            return new Messages.OutputMessage(typeLine3,line3);
        } else if (typeLine1.equals("cathet") & typeLine2.equals("hypotenuse") & checkTriangle(line1,line2)){
            typeLine3 = "cathet";
            line3 = Math.sqrt(Math.pow(line2,2) - Math.pow(line1,2));
            return new Messages.OutputMessage(typeLine3,line3);
        } else if (typeLine1.equals("hypotenuse") & typeLine2.equals("cathet") & checkTriangle(line2,line1)){
            typeLine3 = "cathet";
            line3 = Math.sqrt(Math.pow(line1,2) - Math.pow(line2,2));
            return new Messages.OutputMessage(typeLine3,line3);
        }
        return null;
    }


}
