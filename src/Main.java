//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            inputDataUser("SunnySunny", "Sungo6676", "Sungo6676");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
        }
        try {
            test();
        } catch (TestException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test() {
        throw new TestException();
    }
//[hAloz] {1,20}]

    public static void inputDataUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String regexLogin = "Sanny";
        Pattern patternLogin = Pattern.compile(regexLogin);
        Matcher matcherLogin = patternLogin.matcher(login);

        String regexPassword = "[237727890w]&w";
        Pattern patternPassword = Pattern.compile(regexPassword);
        Matcher matcherPassword = patternPassword.matcher(password);


        if (!matcherLogin.matches()) {
            throw new WrongLoginException("Неверный логин");
        }
        if (!matcherPassword.matches()) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}