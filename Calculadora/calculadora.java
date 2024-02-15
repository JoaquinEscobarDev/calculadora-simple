import javax.swing.JOptionPane;

public class calculadora {

    public static void main(String[] args) {
        // Pedir al usuario que ingrese el primer número
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        double numero1 = Double.parseDouble(input1);

        // Pedir al usuario que seleccione la operación
        String[] operaciones = {"Suma", "Resta", "Multiplicación", "División"};
        int operacionSeleccionada = JOptionPane.showOptionDialog(
                null,
                "Seleccione una operación:",
                "Calculadora",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                operaciones,
                operaciones[0]
        );

        // Pedir al usuario que ingrese el segundo número
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        double numero2 = Double.parseDouble(input2);

        // Realizar la operación seleccionada
        double resultado = 0;
        switch (operacionSeleccionada) {
            case 0:
                resultado = numero1 + numero2;
                break;
            case 1:
                resultado = numero1 - numero2;
                break;
            case 2:
                resultado = numero1 * numero2;
                break;
            case 3:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero");
                    System.exit(0);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
                System.exit(0);
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}
