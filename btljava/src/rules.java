//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class rules extends JFrame implements ActionListener {
    JButton start;
    JButton back;

    public rules() {
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout((LayoutManager)null);
        JLabel heading = new JLabel("Giới Thiệu Trò Chơi  ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Chewy", 1, 30));
        this.add(heading);
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Chewy", 0, 20));
        rules.setText("<html>1. Trò chơi bao gồm nhiều câu hỏi với nhiều chủ đề khác nhau<br><br>2. Mỗi câu hỏi tương đương với 5 điểm<br><br>3. Mỗi câu hỏi có thời gian trả lời là 15 giây<br><br>4. Trò chơi kết khi người chơi trả lời sai <br><br>5. Chúc may mắn <html>");
        this.add(rules);
        this.start = new JButton("Start");
        this.start.setBounds(400, 500, 100, 30);
        this.start.setFont(new Font("Times New Roman", 1, 10));
        this.start.setForeground(new Color(30, 144, 254));
        this.add(this.start);
        this.back = new JButton("Back");
        this.back.setBounds(250, 500, 100, 30);
        this.back.setFont(new Font("Times New Roman", 1, 10));
        this.back.setForeground(new Color(30, 144, 254));
        this.back.addActionListener(this);
        this.add(this.back);
        this.setSize(800, 650);
        this.setLocation(350, 100);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() != this.start) {
            this.setVisible(false);
            new Quiz();
        }else if(ae.getSource() == this.back){
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new rules();
    }
}
