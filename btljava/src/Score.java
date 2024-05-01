import javax.swing.*;
import java.awt.*;

public class Score extends JPanel {

    public Score() {
        setPreferredSize(new Dimension(684, 400));
        setBackground(Color.WHITE);
        setLayout(null);

        JLabel resultLabel = new JLabel("Result");
        resultLabel.setBounds(298, 42, 150, 30);
        resultLabel.setFont(new Font("Open Sans Extrabold", Font.PLAIN, 27));
        add(resultLabel);

        JLabel remarkLabel = new JLabel("<html>Very good work!! This is your hard work and dedication which helped you to reach the zenith of success.</html>");
        remarkLabel.setBounds(32, 92, 623, 70);
        remarkLabel.setFont(new Font("Open Sans Semibold", Font.PLAIN, 15));
        add(remarkLabel);

        JLabel marksLabel = new JLabel("9/10");
        marksLabel.setBounds(49, 184, 200, 70);
        marksLabel.setForeground(new Color(31, 62, 255));
        marksLabel.setBackground(Color.CYAN);
        marksLabel.setOpaque(true);
        marksLabel.setFont(new Font("Open Sans Extrabold", Font.PLAIN, 30));
        add(marksLabel);

        JLabel marksTextLabel = new JLabel("9 Marks Scored");
        marksTextLabel.setBounds(51, 317, 150, 30);
        marksTextLabel.setForeground(new Color(31, 62, 255));
        marksTextLabel.setFont(new Font("Open Sans Semibold", Font.PLAIN, 17));
        add(marksTextLabel);

        JProgressBar correctProgress = new JProgressBar(JProgressBar.HORIZONTAL);
        correctProgress.setBounds(277, 172, 130, 30);
        correctProgress.setMinimum(0);
        correctProgress.setMaximum(10);
        correctProgress.setValue(9);
        correctProgress.setStringPainted(true);
        correctProgress.setForeground(Color.GREEN);
        correctProgress.setFont(new Font("Open Sans", Font.BOLD, 12));
        add(correctProgress);

        JProgressBar wrongProgress = new JProgressBar(JProgressBar.HORIZONTAL);
        wrongProgress.setBounds(492, 172, 130, 30);
        wrongProgress.setMinimum(0);
        wrongProgress.setMaximum(10);
        wrongProgress.setValue(1);
        wrongProgress.setStringPainted(true);
        wrongProgress.setForeground(Color.RED);
        wrongProgress.setFont(new Font("Open Sans", Font.BOLD, 12));
        add(wrongProgress);

        JLabel correctTextLabel = new JLabel("Correct Answers: 9");
        correctTextLabel.setBounds(263, 317, 150, 30);
        correctTextLabel.setForeground(Color.GREEN);
        correctTextLabel.setFont(new Font("Open Sans Semibold", Font.PLAIN, 17));
        add(correctTextLabel);

        JLabel wrongTextLabel = new JLabel("Incorrect Answers: 1");
        wrongTextLabel.setBounds(471, 317, 160, 30);
        wrongTextLabel.setForeground(Color.RED);
        wrongTextLabel.setFont(new Font("Open Sans Semibold", Font.PLAIN, 17));
        add(wrongTextLabel);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Result Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Score());
        frame.pack();
        frame.setVisible(true);
    }
}
