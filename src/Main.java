import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private JLabel inputLabel;
    private JTextField inputField;
    private JLabel outputLabel;

    public Main() {
        super("Temp Converter (F to C)");
        setLayout(new FlowLayout());
        inputLabel = new JLabel("F: ");
        inputField = new JTextField(10);
        outputLabel = new JLabel("C: ");
        JButton convertButton = new JButton("Convert");

        convertButton.addActionListener(e -> {
            double fahrenheit = Double.parseDouble(inputField.getText());
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            outputLabel.setText("Celsius: " + String.format("%.2f", celsius));
        });

        add(inputLabel); // Add this line
        add(inputField);
        add(convertButton);
        add(outputLabel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}