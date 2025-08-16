package org.example.Assignment;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.util.concurrent.*;

public class AttendanceMailer {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable emailTask = () -> {
//            if (LocalDate.now().getDayOfWeek() == DayOfWeek.FRIDAY)
            if(true){
                try {
                    String attendanceList = getAttendanceList(); // Replace with actual logic
                    sendEmail("gokulgadkar8501@gmail.com", "Weekly Attendance Report", attendanceList);
                    System.out.println("Attendance email sent.");
                } catch (Exception e) {
                    System.err.println("Failed to send attendance email: " + e.getMessage());
                }
            }
        };

        // Schedule task to run once a day
        scheduler.scheduleAtFixedRate(emailTask, 0, 1, TimeUnit.DAYS);
    }

    public static String getAttendanceList() {
        return "John Doe - Present\nJane Smith - Absent\n...";
    }

    public static void sendEmail(String to, String subject, String body) throws MessagingException {
        final String from = "prateekkanaujia20@gmail.com";
        final String password = "lrkkzthfjgrojgtm";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // e.g., smtp.gmail.com
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject(subject);
        message.setText(body);
        Transport.send(message);
    }
}
