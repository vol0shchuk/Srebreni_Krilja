/*

//Task 1

import java.util.Scanner;

class error extends Exception {
    public error(String message) {
        super(message);
    }
}

class pasword {

    public static void validate(String password) throws error {
        if (password.length() <= 8) {
            throw new error("Password must be longer than 8 characters.");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new error("Password must contain at least one uppercase letter.");
        }

        if (password.matches("\\d+")) {
            throw new error("Password must not consist solely of digits.");
        }

        System.out.println("Password is valid.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            validate(password);
        } catch (error e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }
}
*/


/*

//Task 2

import java.util.Scanner;

class notovar extends Exception {
    public notovar(String message) {
        super(message);
    }
}

class Shop {

    public static void main(String[] args) {
        String[] products = {"Milk", "Bread", "Butter", "Eggs", "Cheese", "Chocolate", "Cookies", "Coca-Cola"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Product you want to buy: ");
        String user = scanner.nextLine();

        try {
            check(products, user);
            System.out.println("The product " + user + " is available for purchase.");
        } catch (notovar e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void check(String[] products, String product) throws notovar {
        for (String p : products) {
            if (p.equalsIgnoreCase(product)) {
                return;
            }
        }
        throw new notovar("The product '" + product + "' is not available in the shop.");
    }
}
*/