//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JButton rules;
    JButton quit;
    JTextField username;

    Login() {
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout((LayoutManager)null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/img.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 650, 500);
        this.add(image);
        JLabel heading = new JLabel("Chào mừng đến với trò chơi ");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Times New Roman", 1, 19));
        this.add(heading);
        JLabel name = new JLabel("Tên đăng nhập");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Times New Roman", 1, 20));
        this.add(name);
        this.username = new JTextField();
        this.username.setBounds(735, 200, 300, 25);
        this.username.setFont(new Font("Times New Roman", 1, 20));
        this.add(this.username);
        this.rules = new JButton("Login");
        this.rules.setBounds(734, 270, 120, 25);
        this.rules.setFont(new Font("Times New Roman", 1, 10));
        this.rules.setForeground(new Color(30, 144, 254));
        this.rules.addActionListener(this);
        this.add(this.rules);
        this.quit = new JButton("Exit");
        this.quit.setBounds(915, 270, 120, 25);
        this.quit.setFont(new Font("Times New Roman", 1, 10));
        this.quit.setForeground(new Color(30, 144, 254));
        this.quit.addActionListener(this);
        this.add(this.quit);
        this.setSize(1200, 500);
        this.setLocation(400, 200);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.rules) {
            String name = this.username.getText();
            this.setVisible(false);

        } else if (ae.getSource() == this.quit) {
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
