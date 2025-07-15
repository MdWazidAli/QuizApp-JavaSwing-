package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JTextField text;
    JButton Next, Back;

    Login() {

        setLayout(null);

        // ===== IMAGE CODE =====
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i = i1.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450, 0, 550, 500);
        add(image);

        // ===== HEADING =====
        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(120, 60, 350, 45);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 36));
        heading.setForeground(new Color(34, 124, 112)); // modern teal
        add(heading);

        // ===== NAME LABEL =====
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160, 150, 300, 25);
        name.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        name.setForeground(new Color(50, 50, 50)); // dark gray
        add(name);

        // ===== TEXT FIELD =====
        text = new JTextField();
        text.setBounds(80, 200, 300, 28);
        text.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        text.setBackground(Color.WHITE);
        text.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        text.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        add(text);

        // ===== NEXT BUTTON =====
        Next = new JButton("Next");
        Next.setBounds(100, 270, 120, 30);
        Next.setFont(new Font("Segoe UI", Font.BOLD, 16));
        Next.setBackground(new Color(0, 123, 92)); // soft green
        Next.setForeground(Color.WHITE);
        Next.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Next.addActionListener(this);
        add(Next);

        // ===== BACK BUTTON =====
        Back = new JButton("Back");
        Back.setBounds(250, 270, 120, 30);
        Back.setFont(new Font("Segoe UI", Font.BOLD, 16));
        Back.setBackground(new Color(0, 123, 92));
        Back.setForeground(Color.WHITE);
        Back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Back.addActionListener(this);
        add(Back);

        // ✅✅✅ ===== CLOSE BUTTON CODE (X) ===== ✅✅✅
        JButton close = new JButton("X");
        close.setBounds(960, 10, 30, 30);
        close.setFont(new Font("Arial", Font.BOLD, 16));
        close.setForeground(Color.WHITE);
        close.setBackground(Color.RED);
        close.setFocusPainted(false);
        close.setCursor(new Cursor(Cursor.HAND_CURSOR));
        close.setBorder(null);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // exits the program
            }
        });
        add(close); // 👈 isse component frame mein add hota hai

        // ===== FRAME SETTINGS =====
        setSize(1000, 500);
        setLocation(220, 150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Next) {
            String name = text.getText();
            setVisible(false);
            new Rules(name);
        } else if (e.getSource() == Back) {
            System.exit(50);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
