package com.example.JavaAssignment.validation;

import de.creativecouple.validation.isbn.ISBNValidator;
import org.springframework.stereotype.Service;

@Service
public class ISBNValidationService {

    public boolean isValidISBN(String isbn) {
        return isValidISBN13(isbn) || isValidISBN10(isbn);
    }
    public static boolean isValidISBN10(String isbn) {
        if (isbn == null || isbn.length() != 10 || !isbn.matches("[0-9xX]")) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            sum += digit * (i + 1);
        }

        int lastDigit = isbn.charAt(9)-'0';
        int checkSum = (sum % 11) % 10;

        return (checkSum == 10 && lastDigit == 'X') || checkSum == lastDigit;
    }
    public static boolean isValidISBN13(String isbn) {
        if (isbn == null || isbn.length() != 13 || !isbn.matches("\\d{13}")) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            sum += (i % 2 == 0) ? digit : digit * 3;
        }

        int checkSum = (10 - (sum % 10)) % 10;
        return checkSum == Character.getNumericValue(isbn.charAt(12));
    }
}