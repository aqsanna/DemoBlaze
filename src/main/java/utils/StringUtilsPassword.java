package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class StringUtilsPassword {
    public static String randomString(int targetStringLength) {
        Random random = new Random();
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String incorrectPasswordLessThan8() {
        int rndm = getRandomNumber(1, 7);
        return randomString(rndm);
    }

    public static String correctPassword() {
        int rndm = getRandomNumber(8, 20);
        return randomString(rndm);
    }

    public static String incorrectPasswordGreaterThan20() {
        int rndm = getRandomNumber(20, 100);
        return randomString(rndm);
    }

}



