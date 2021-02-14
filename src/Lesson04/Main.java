package Lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

            miFileExit.addActionListener (e -> System.exit (0));

            btnSendMessage.addActionListener (new ActionListener ( ) {
                @Override
                public void actionPerformed(ActionEvent e) {
                    messages.add  ("\n" + textField.getText ());
                    textArea.setText(String.valueOf (messages));
                    textField.setText ("");
                    }
            });
//            btnSendMessage.addActionListener ( e -> textArea.setText (messages + textField.getText ()));

            textField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    messages.add  ("\n" + textField.getText ());
                    textArea.setText(String.valueOf (messages));
                    textField.setText ("");
                }
            });
        }
    }
}