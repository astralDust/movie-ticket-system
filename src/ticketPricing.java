import javax.swing.*;
import java.awt.event.*;

public class ticketPricing extends JFrame {
    private JLabel adultLabel, childLabel, priceLabel, totalLabel;
    private JTextField adultTextField, childTextField, priceTextField, totalTextField;
    private JButton calculateButton;

    public ticketPricing() {
        setTitle("Movie Ticket Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        adultLabel = new JLabel("Number of Adults:");
        adultTextField = new JTextField(10);
        childLabel = new JLabel("Number of Children:");
        childTextField = new JTextField(10);
        priceLabel = new JLabel("Ticket Price:");
        priceTextField = new JTextField(10);
        totalLabel = new JLabel("Total Cost:");
        totalTextField = new JTextField(10);
        totalTextField.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateTotalCost();
            }
        });

        JPanel panel = new JPanel();
        panel.add(adultLabel);
        panel.add(adultTextField);
        panel.add(childLabel);
        panel.add(childTextField);
        panel.add(priceLabel);
        panel.add(priceTextField);
        panel.add(totalLabel);
        panel.add(totalTextField);
        panel.add(calculateButton);

        add(panel);

        setVisible(true);
    }

    private void calculateTotalCost() {
        try {
            int adults = Integer.parseInt(adultTextField.getText());
            int children = Integer.parseInt(childTextField.getText());
            double price = Double.parseDouble(priceTextField.getText());

            double totalCost = (adults * price) + (children * (price * 0.5));
            totalTextField.setText(String.format("%.2f", totalCost));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
