/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.validation;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ravidra
 */

public class ValidationMethods {



    public static boolean isIntegerPositive(String text) {
        if (text != null && text.length() > 0) {
            Pattern pattern = Pattern.compile("\\b\\d+\\b");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                if(Long.parseLong(text) > 0){
                     return true;
                }
               
            }
        }
        return false;
    }

    public static boolean isStringValid(String text) {
        if (text != null && text.length() > 0) {
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]+$");
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return true;
            }
        }

        return false;
    }

    public static boolean isOnlyString(String text) {
        if (text != null && text.length() > 0) {
            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return true;
            }
        }

        return false;
    }

    public static boolean isEmailValid(String email) {

        if (email != null && email.length() > 0) {
            String regex = "^[A-Za-z0-9._]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$";
            if (email.matches(regex)) {
                return true;
            }

        }
        return false;
    }

    public static boolean isPasswordAndConfirmPasswordSame(String password, String confirm) {

        if (password != null && password.length() > 0 && confirm != null && confirm.length() > 0) {

            if (password.equalsIgnoreCase(confirm)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isMobileNumberValid(String a_number) {

        if (a_number != null && a_number.length() > 0) {

            Pattern pattern = Pattern.compile("\"\\\\d{3}-\\\\d{7}\"");
            Matcher matcher = pattern.matcher(a_number);
            if (matcher.matches()) {
                return true;
            }
        }

        return false;
    }

    public static boolean isMonthValid(String a_text) {

        if (isIntegerPositive(a_text)) {
            int mm = Integer.parseInt(a_text);
            if (mm > 0 && mm <= 12) {
                return true;
            }
        }

        return false;
    }

    public static boolean isDateValid(String a_text) {

        if (isIntegerPositive(a_text)) {
            int dd = Integer.parseInt(a_text);
            if (dd > 0 && dd <= 31) {
                return true;
            }
        }

        return false;
    }

    public static boolean isYearValid(String a_text) {

        if (isIntegerPositive(a_text)) {
            int yyyy = Integer.parseInt(a_text);
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            if (yyyy > 1900 && yyyy <= currentYear) {
                return true;
            }
        }

        return false;
    }


public static boolean isStringValidWithSpace(String text) {
        if (text != null && text.length() > 0) {
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9_ ]+$");
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return true;
            }
        }

        return false;
    }

public static boolean isStringValidContact(String text) {
        if (text != null && text.length() > 0) {
            Pattern pattern = Pattern.compile("^[0-9]+$");
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                return true;
            }
        }

        return false;
    }

}
