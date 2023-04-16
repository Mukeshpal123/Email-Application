package org.geekster;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

public class MailAuthentication extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication() {

        return new PasswordAuthentication("mukeshmech294@gmail.com","xyz");
    }
}
