import javax.swing.*;
import java.awt.*;

public class guestMainMenu {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;


    public guestMainMenu() {
        JFrame frame = new JFrame("Guest Main Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.add(panel1);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);



        // Load the image
        ImageIcon movieIcon1 = new ImageIcon(getClass().getResource("/images/titanic.jpeg"));
        // Scale the image
        Image image1 = movieIcon1.getImage();
        Image scaledImage1 = image1.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        // Create a new ImageIcon from the scaled image
        ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
        // Set the icon of button1 to the scaled image
        label1.setIcon(scaledIcon1);

        // Load the image
        ImageIcon movieIcon2 = new ImageIcon(getClass().getResource("/images/mario_movie.jpeg"));
        // Scale the image
        Image image2 = movieIcon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        // Create a new ImageIcon from the scaled image
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
        // Set the icon of button1 to the scaled image
        label2.setIcon(scaledIcon2);

    }

}
