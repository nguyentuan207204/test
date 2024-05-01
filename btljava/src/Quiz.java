import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    JLabel question, qno;
    JButton opt1;
    JButton opt2;
    JButton opt3;
    JButton opt4;
    public static int timer = 15;

    public Quiz() {
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("img/img.png"));
        JLabel i = new JLabel(i2);
        i.setBounds(0, 0, 1440, 392);
        add(i);

        qno = new JLabel("1.");
        qno.setBounds(330, 450, 50, 30);
        qno.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(qno);

        question = new JLabel("Con nào dưới đây không phải động vật có vú ?");
        question.setBounds(343, 450, 900, 30);
        question.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(question);

        opt1 = new JButton(" A.cá heo");
        opt1.setBounds(343, 500, 300, 70); // Điều chỉnh tọa độ X và Y
        opt1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(opt1);

        opt2 = new JButton("B.Cá sấu");
        opt2.setBounds(655, 500, 300, 70); // Điều chỉnh tọa độ X và Y
        opt2.setFont(new Font("Open Sans Semibold", Font.BOLD, 20));
        add(opt2);

        opt3 = new JButton("C.Cá voi");
        opt3.setBounds(343, 590, 300, 70); // Điều chỉnh tọa độ X và Y
        opt3.setFont(new Font("Open Sans Semibold", Font.BOLD, 20));
        add(opt3);

        opt4 = new JButton("D.Dơi");
        opt4.setBounds(655, 590, 300, 70); // Điều chỉnh tọa độ X và Y
        opt4.setFont(new Font("Open Sans Semibold", Font.BOLD, 20));
        add(opt4);

        ButtonGroup group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);

        JButton next = new JButton("NEXT");
        next.setBounds(1100, 510, 200, 50);
        add(next);

        JButton skip = new JButton("SKIP");
        skip.setBounds(1100, 570, 200, 50);
        add(skip);

        JButton help = new JButton("50:50");
        help.setBounds(1100, 630, 200, 50);
        add(help);

        JButton sumbit = new JButton("SUBMIT");
        sumbit.setBounds(1100, 690, 200, 50);
        sumbit.setEnabled(false);
        add(sumbit);

        setVisible(true);
        start(0);

        startTimer();
    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ".");
    }

    public void startTimer() {
        Thread timerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (timer > 0) {
                    try {
                        Thread.sleep(1000); // Ngủ 1 giây
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    timer--;
                    repaint();
                }
            }
        });
        timerThread.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left " + timer + " seconds";

        g.setFont(new Font("Times New Roman", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        }else {
            g.drawString("Time up!", 1100, 500);
        }
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
