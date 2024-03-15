import javax.swing.JOptionPane;

public class InverterString {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        String fraseInvertida = inverterString(frase);
        JOptionPane.showMessageDialog(null, fraseInvertida);
    }

    public static String inverterString(String original) {
        char[] caracteres = original.toCharArray();
        int tamanho = caracteres.length;
        char[] invertida = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            invertida[i] = caracteres[tamanho - 1 - i];
        }

        return new String(invertida);
    }
}
