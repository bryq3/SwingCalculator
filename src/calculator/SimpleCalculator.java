package calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 2018-02-13.
 */
public class SimpleCalculator {
    private JPanel panel1;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton plus;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton minus;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton multiply;
    private JButton equals;
    private JButton delete;
    private JButton backspace;
    private JTextField textfield;
    private JButton comma;
    private JButton btn0;
    private JButton plusMinus;
    private JButton divide;
    private JLabel time;


    public static void main(String[] args) {


        //initializing frame:
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new SimpleCalculator().panel1);

        //setting behaviour of window after closing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setting fixed size of the window
        frame.setSize(300, 400);

        //setting frame in the middle of te screen
        //frame parametres
        int frameWidth = frame.getSize().width;
        int frameHeight= frame.getSize().height;
        //screen parametres:
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;


        frame.setLocation((width-frameWidth)/2, (height-frameHeight)/2);


        //disable resize option for window
        frame.setResizable(false);
        //frame.pack();
        // set frame visible
        frame.setVisible(true);


    }




}
