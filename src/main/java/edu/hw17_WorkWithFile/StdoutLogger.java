package edu.hw17_WorkWithFile;

    public class StdoutLogger extends Logger {
        @Override
        protected void log(String msg) {
            System.out.println(msg);
        }
    }
