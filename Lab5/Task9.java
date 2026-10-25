package Lab5;

//Об’єкт String представляє собою речення, що містить слова (складаються з літер a-z, A-Z), цілі числа
// (складаються з цифр 0-9), та комбінації літер та цифр. Підрахувати кількість комбінацій літер та цифр.
public class Task9 {
    public static void main(String[] args) {
        System.out.println(countLettersAndNumbers("The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago"));
        try {
            countLettersAndNumbers(null);
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        try {
            countLettersAndNumbers("I've got a message from bobr2@gmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public static int countLettersAndNumbers(String text) {
        if (text == null)
            throw new NullPointerException("Текст = null");
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Ви нічого не ввели");
        }
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!isLatinLetter(c) && !isNumber(c) && c != ' ') {
                throw new IllegalArgumentException("Ведено символ який не відповідає умові");
            }
        }
        int counter = 0;
        String[] words = text.strip().split(" ");
        for (String word : words) {
            if (letterAndNum(word)) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean letterAndNum(String word) {
        boolean letter = false;
        boolean number = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isLatinLetter(c)) {
                letter = true;
            }
            if (isNumber(c)) {
                number = true;
            }
        }
        return letter && number;
    }
    public static boolean isLatinLetter (char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }
    public static boolean isNumber (char c) {
        return (c >= '0' && c <= '9');
    }
}