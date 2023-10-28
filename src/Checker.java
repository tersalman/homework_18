import Expection.WrongLoginException;
import Expection.WrongPasswordException;

public class Checker {
    final static private String LOGIN_ALLOW =
            "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_";
    final static private int PASS_LENGTH_ALLOW = 20;

    public static void checker(
            String login,
            String password,
            String confirmPassword
    ) {
        Checker.loginCheck(login);
        Checker.passwordCheck(password, confirmPassword);


    }

    private static void loginCheck(String login) throws WrongLoginException {
        for (int i = 0; i < login.length(); ++i) {
            if (LOGIN_ALLOW.indexOf(login.charAt(i)) == -1) {
                throw new WrongLoginException("the logins symbols is not allowed");
            }
        }
        if (login.length() > PASS_LENGTH_ALLOW) {
            throw new WrongLoginException("the logins length is not allowed");
        }
    }

    private static void passwordCheck(String password, String confirmPassword) {
        for (int i = 0; i < password.length(); ++i) {
            if (LOGIN_ALLOW.indexOf(password.charAt(i)) == -1) {
                throw new WrongLoginException("the password symbols is not allowed");
            }
        }
        if (password.length() > PASS_LENGTH_ALLOW) {
            throw new WrongPasswordException("the password length is not allowed");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("the password is not similar");
        }
    }


}
