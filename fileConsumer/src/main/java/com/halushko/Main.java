package com.halushko;

public class Main {
    public static final String TELEGRAM_OUTPUT_TEXT_QUEUE = System.getenv("TELEGRAM_OUTPUT_TEXT_QUEUE");

    public static void main(String[] args) {
        System.out.println("Hello world! I'm fileConsumer!");
        UserMessageHandler handler = new UserMessageHandler();
        for(;;) {
            try {
                handler.run();
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }
}