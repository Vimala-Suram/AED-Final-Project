/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author ashis
 */
public class PasswordValidator {
    public static boolean validatePassword(String password) {
        // Define password policy
        int minLength = 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Check password length
        if (password.length() < minLength) {
            System.out.println("Password must be at least " + minLength + " characters long.");
            return false;
        }

        // Iterate through the password and check for required characters
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isDigit(c)) hasDigit = true;
            if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
        }

        // Validate presence of required character types
        if (!hasUpperCase) {
            System.out.println("Password must include at least one uppercase letter.");
            return false;
        }
        if (!hasLowerCase) {
            System.out.println("Password must include at least one lowercase letter.");
            return false;
        }
        if (!hasDigit) {
            System.out.println("Password must include at least one digit.");
            return false;
        }
        if (!hasSpecialChar) {
            System.out.println("Password must include at least one special character.");
            return false;
        }

        // If all checks pass, the password is valid
        return true;
    }
}
