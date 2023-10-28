import Expection.WrongLoginException;
import Expection.WrongPasswordException;

import java.util.regex.Pattern;

public class Checker {
    final static private String LOGIN_ALLOW =
            "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_";
    final static private int PASS_LENGTH_ALLOW = 20;

    public static void checker(
            String login,
            String password,
            String confirmPassword
    ) {
        Checker.logginCheck(login);
        Checker.passwordCheck(password);
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("the password is not similar");
        }


    }

    private static void logginCheck(String login) {
        if (!LOGIN_ALLOW.contains(login)) {
            throw new WrongLoginException("the logins symbols is not allowed");
        }
        if (login.length()>PASS_LENGTH_ALLOW) {
            throw new WrongLoginException("the logins length is not allowed");
        }
    }
    private static void passwordCheck(String password) {
        if (!LOGIN_ALLOW.contains(password)) {
            throw new WrongPasswordException("the password symbols is not allowed");
        }
        if (password.length()>PASS_LENGTH_ALLOW) {
            throw new WrongPasswordException("the password length is not allowed");
        }
    }



}
