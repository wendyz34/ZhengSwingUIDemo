import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener{
    private JPanel mainPanel;
    private JLabel label1;
    private JTextArea myTextArea;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    public MainGUIWindow(){
        createUIComponents();
    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();
            if(text.equals("Send")){
                myTextArea.append("button 1 clicked!");
            }else{
                myTextArea.append("button 2 clicked!");
            }
        }

    }
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void keyPressed(KeyEvent e){}
    @Override
    public void keyReleased(KeyEvent e){}


    public void createUIComponents(){
        setContentPane(mainPanel);
        setTitle("MY GUI!");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       //myTextArea = setLineWrap(true);
        button1.addActionListener(this);
        button2.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);

        mainPanel = new JPanel();
        label1 = new JLabel("Welcome to my GUI!");
        mainPanel.add(label1);
        textField1 = new JTextField();
        mainPanel.add(textField1);
        myTextArea = new JTextArea();
        mainPanel.add(myTextArea);
        button1 = new JButton("Send");
        mainPanel.add(button1);
        button2 = new JButton("Click me for a good time");
        mainPanel.add(button2);
        mainPanel.setLayout((new GridLayout(3,1)));
        add(mainPanel);
        setVisible(true);




    }
}
