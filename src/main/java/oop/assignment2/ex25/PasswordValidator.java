package oop.assignment2.ex25;

public class PasswordValidator {
    int passwordValidator(String password) {
        if(password.length() < 8)
        {
            try {
                long checker = Long.parseLong(password);
            } catch (NumberFormatException nfe) {
                return 2;
            }
            return 1;
        }
        else if(!specialCharChecker(password)) {
            return 3;
        }
        else if(specialCharChecker(password)){
            return 4;
        }
        else {
            return 5;
        }
    }

    public static boolean specialCharChecker(String password) {
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '(' || password.charAt(i) == ')'|| password.charAt(i) == '-' || password.charAt(i) == '_' || password.charAt(i) == '=' || password.charAt(i) == '+' || password.charAt(i) == '~' || password.charAt(i) == '`' || password.charAt(i) == '[' || password.charAt(i) == ']' || password.charAt(i) == '{' ||password.charAt(i) == '}' || password.charAt(i) == '|' || password.charAt(i) == '/' || password.charAt(i) == '\\' || password.charAt(i) == ':' || password.charAt(i) == ';' || password.charAt(i) == '?' || password.charAt(i) == '<' || password.charAt(i) == '>' || password.charAt(i) == '.' || password.charAt(i) == ',') {
                return true;
            }
        }
        return false;
    }
}
