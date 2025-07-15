package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton start, back;
    String name;

    Rules(String name) {
        this.name = name;

        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to QUIZ TEST");
        heading.setBounds(150, 100, 700, 30);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 26));
        heading.setForeground(new Color(46, 134, 222));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(70, 150, 700, 350);
        rules.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        rules.setForeground(new Color(40, 55, 71));
        rules.setText(
                "<html>" +
                        "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                        "2. There are a total of 10 questions." + "<br><br>" +
                        "3. You only have 15 seconds to answer each question." + "<br><br>" +
                        "4. No mobile phones or secondary devices allowed during the quiz." + "<br><br>" +
                        "5. No talking or outside help allowed." + "<br><br>" +
                        "6. Stay focused and good luck!" + "<br><br>" +
                        "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(300, 500, 100, 30);
        back.setFont(new Font("Segoe UI", Font.BOLD, 16));
        back.setBackground(new Color(231, 76, 60)); // Red
        back.setForeground(Color.WHITE);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(this);
        add(back);




        start = new JButton("Start");
        start.setBounds(450, 500, 100, 30);
        start.setFont(new Font("Segoe UI", Font.BOLD, 16));
        start.setBackground(new Color(39, 174, 96)); // Green
        start.setForeground(Color.WHITE);
        start.setCursor(new Cursor(Cursor.HAND_CURSOR));
        start.addActionListener(this);
        add(start);


        // ✅✅✅ ===== CUT BUTTON (X) ===== ✅✅✅
        JButton close = new JButton("X");
        close.setBounds(760, 10, 30, 30);
        close.setFont(new Font("Arial", Font.BOLD, 16));
        close.setForeground(Color.WHITE);
        close.setBackground(Color.RED);
        close.setFocusPainted(false);
        close.setCursor(new Cursor(Cursor.HAND_CURSOR));
        close.setBorder(null);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(close); // 👈 Isse frame mein X button add hota hai


        // Background Image (optional to remove and replace with plain color)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i = i1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 800, 650);
        add(image);




        // Frame Setup
        setSize(800, 650);
        setLocation(350, 100);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else if (e.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
