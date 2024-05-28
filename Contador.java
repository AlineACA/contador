import java.util.Scanner;

// Define the custom exception class
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner terminal = new Scanner(System.in);

        // Prompt the user to enter the first parameter
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // Prompt the user to enter the second parameter
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        // Try block to handle potential exception during counting logic
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Print the error message if invalid parameters are provided
            System.err.println(e.getMessage());
        }
        catch (Exception InputMismatchException)
        {
            System.err.println("Parametro precisa ser um número!");
        }
    }

    // This method performs the counting logic and throws an exception if parameters are invalid
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Check if the first parameter is greater than or equal to the second
        if (parametroUm >= parametroDois) {
            // Throw an exception with a descriptive message
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calculate the difference between the two parameters (number of elements to count)
        int contagem = parametroDois - parametroUm;

        // Loop through the numbers from the first parameter to the second (inclusive) and print them
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}

