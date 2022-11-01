package com.example.solution.service;

import java.util.Date;

public class Messages {

    public interface IMessage {

    }

    public static class Message implements IMessage {
        public String message;  // строка сообщения
        public Date time;       // время

        public Message(String message) {
            this.message = message;
            this.time = new Date();
        }

        @Override
        public String toString() {
            return time + ": " + message;
        }
    }

    public static class InputMessage implements IMessage {
        public String typeLine1;     // типы стороны1
        public int line1;         // сторона1
        public String typeLine2;     // типы стороны2
        public int line2;         // сторона2


        InputMessage(String typeLine1, int line1, String typeLine2, int line2) {
            this.typeLine1 = typeLine1;
            this.line1 = line1;
            this.typeLine2 = typeLine2;
            this.line2 = line2;
        }

        @Override
        public String toString() {
            return typeLine1 + " = " + line1 + "\n" + typeLine2 + " = " + line2;
        }
    }

    public static class OutputMessage implements IMessage {

        public String typeLine3;        // тип стороны3
        public double line3;            // сторона3


        public OutputMessage(String typeLine3, double line3) {
            this.typeLine3 = typeLine3;
            if (typeLine3 == null) {
                this.line3 = Integer.parseInt(null);
            } else {
                this.typeLine3 = typeLine3;
                this.line3 = line3;
            }
        }

        @Override
        public String toString() {
            return typeLine3 + " = " + line3;
        }
    }

    public static class ErrorMessage extends Message{
        public ErrorMessage (String error) {
            super(error);
        }
    }
}