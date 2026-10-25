package Lab5;

//Перетворити String, що представляє собою число у двійковій системі числення, у значення int
public class Task5 {
    public static void main(String[] args) {
        System.out.println(binaryStringToInt("1001"));
        System.out.println(binaryStringToInt("101101"));
        try {
            binaryStringToInt("100017");
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        try {
            binaryStringToInt("");
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

    }
    public static int binaryStringToInt(String s) {
        if (s == null) {
            throw new NullPointerException("Ввід = null");
        }
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Ви нічого не ввели");
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (element != '0' && element != '1') {
                throw new IllegalArgumentException("Ви ввели не бінарне число");
            }

            if (result > Integer.MAX_VALUE / 2) {
                throw new IllegalArgumentException("Число більше ніж може вмістити int");
            }

            result = result * 2 + (element - '0');
        }
        return result;
    }
}
