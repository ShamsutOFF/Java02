package Lesson04;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Chat ( );
    }

    public static class Chat extends JFrame {
        public Chat() {
            setTitle ("Chat");
            setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
            setSize (500, 600);
            setLocationRelativeTo (null);

            JMenuBar mainMenu = new JMenuBar ( );
            JMenu mFile = new JMenu ("Файл");
            JMenuItem miFileExit = new JMenuItem ("Выход");
            setJMenuBar (mainMenu);
            mainMenu.add (mFile);

            TextArea textArea = new TextArea ( );
            textArea.setEditable (false);
            textArea.setText ("Здесь будут сообщения");

            TextField textField = new TextField (2);

            JButton btnSendMessage = new JButton ("Отправить");

            JPanel panelBottom = new JPanel ( );
            panelBottom.setLayout (new GridLayout (2, 1));

            add (textArea, BorderLayout.CENTER);
            add (panelBottom, BorderLayout.SOUTH);
            panelBottom.add (textField);
            panelBottom.add (btnSendMessage);
            mFile.add (miFileExit);

            setVisible (true);

            ArrayList <String> messages = new ArrayList<String> ();

            messages.add ("TEST");

            miFileExit.addActionListener (e -> System.exit (0));

            btnSendMessage.addActionListener ( e -> textArea.setText (messages + textField.getText ()));
//            btnSendMessage.addActionListener (e -> System.out.println (textField.getText ()));


        }public static String story() {
            return null;
        }
    }
}