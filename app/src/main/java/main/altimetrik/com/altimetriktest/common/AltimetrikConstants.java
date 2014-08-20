package main.altimetrik.com.altimetriktest.common;

/**
 * Created by ssadan on 8/20/2014.
 */
public class AltimetrikConstants {
    /*
   * (?=.*[a-z]) --> Must contain one lower case character. (?=.*[A-Z]) -->
   * Must contain one upper case character. (?=.*[@#$%]) --> Must contain one
   * special symbol containing in the list "@#$%". (?=.*\d) --> Must contain
   * one digit from 0 to 9. . {8,40} --> Length of characters should be
   * minimum of 8 and max of 12.
   *
   * As user name and password should accept only alphanumeric().
   */
    public static final String COMMON_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])).{6,12})";
}
