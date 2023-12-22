package SOLID.DependencyInversionPrinciple;

/* Dependency Inversion Principle */
// A. High-level module should not depend on low-level modules.
// Both should depend on abstractions.
// Abstractions means either abstract class or interface

// B. Abstractions should not depend on details.
// Details should depend on abstractions


/*
In this example, the high-level module (MessageProcessor) does not depend directly on the low-level
modules (EmailService or SMSService). Instead, it depends on the MessageService abstraction.
This setup makes it easy to introduce new messaging services without changing
the MessageProcessor logic, adhering to the Dependency Inversion Principle.
 */

interface MessageService {
    void sendMessage(String message, String recipient);
}

class EmailService implements MessageService {
    public void sendMessage(String message, String recipient) {
        // Logic to send email
        System.out.println("Email sent to " + recipient + " with message: " + message);
    }
}

class SMSService implements MessageService {
    public void sendMessage(String message, String recipient) {
        // Logic to send SMS
        System.out.println("SMS sent to " + recipient + " with message: " + message);
    }
}

class MessageProcessor {
    private MessageService messageService;

    public MessageProcessor(MessageService service) {
        this.messageService = service;
    }

    public void processMessages(String message, String recipient) {
        // Some validation or logic
        this.messageService.sendMessage(message, recipient);
    }
}

class Application {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageProcessor processor = new MessageProcessor(emailService);
        processor.processMessages("Hello, Email", "email@example.com");

        MessageService smsService = new SMSService();
        processor = new MessageProcessor(smsService);
        processor.processMessages("Hello, SMS", "123456789");
    }
}