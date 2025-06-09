package com.gmail.onishchenko.homework.printer;

public class ConsolePrinter implements Printer {
    public static class Message {
        private String text;
        private String sender;

        public Message(String sender, String text) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if (isEmpty(message.text) && isEmpty(message.sender)) {
            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Empty message from anonymous sender is processing...");
                }
            };
            anonymousPrinter.print(message);
        } else if (isEmpty(message.sender)){
            System.out.println("Anonymous sender sent a message: " + message.text);
        } else {
            System.out.println(message.sender + " sent a message: " + message.text);
        }
    }

    private boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }
}
