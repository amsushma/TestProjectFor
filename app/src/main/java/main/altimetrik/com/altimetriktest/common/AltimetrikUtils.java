package main.altimetrik.com.altimetriktest.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ssadan on 8/20/2014.
 */
public class AltimetrikUtils {

    /**
     * This function checks whether the password is valid.
     *
     * @param input
     *            - The password is input.
     * @return true if password is valid.
     */
    public final static boolean isNotValidFormField(final String input) {
        String patternExp = "((?=.*[a-z])(?=.*\\d).{6,12})";
        Pattern p = Pattern.compile(patternExp);
        Matcher m = p.matcher(input);
        boolean isAlphaNum = m.matches();
        return isAlphaNum;
    }
}
