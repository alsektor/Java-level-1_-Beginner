/*
 * Java 1. Lesson 8. Game Krestiki Noliki
 * 
 * @author Ali Al-Vasiti
 * @version 0.3 dated May 31, 2017
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TicTacToe extends JFrame  {

    final String TITLE_OF_PROGRAM = "Krestiki Noliki!";
    final int START_POSITION = 300;
    final int WINDOW_SIZE = 300;
    final int WINDOW_DX = 9;
    final int WINDOW_DY = 57;
    final int FIELD_SIZE = 3;
    final int CELL_SIZE = WINDOW_SIZE / FIELD_SIZE; //300/3 Видимо, поле делится на 3
    ImageIcon tick = new ImageIcon( "tick.png" ) ;
    ImageIcon cross = new ImageIcon( "cross.png" ) ; 
    JLabel lbl1 = new JLabel(tick) ;
    ClassLoader ldr = this.getClass().getClassLoader() ;
    java.applet.AudioClip audio = JApplet.newAudioClip( ldr.getResource( "music.wav" ) ) ;
    

    Canvas canvas = new Canvas();
    Field field = new Field(FIELD_SIZE, CELL_SIZE);
    Human human = new Human(field.getHumanDot());
    AI ai = new AI(field.getAIDot());

    public static void main(String args[]) {
        new TicTacToe();
    }

    TicTacToe() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(START_POSITION, START_POSITION, WINDOW_SIZE + WINDOW_DX, WINDOW_SIZE + WINDOW_DY);
        canvas.setBackground(Color.orange);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                human.turn(e.getX()/CELL_SIZE, e.getY()/CELL_SIZE, field, ai);
                canvas.repaint();
                if (field.isGameOver())
                    JOptionPane.showMessageDialog(TicTacToe.this, field.getGameOverMsg());
            }
        });

        JButton init = new JButton("START",tick);
        //init.addActionListener(this) ;
        lbl1.setToolTipText( "Stranno,no eta technologiya ne rabotaet s vivodom teksta" ) ;
        init.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                audio.play();
            //if (event.getSource() == init) audio.play() ;
                field.init();
                canvas.repaint();
            }
        });
        JButton exit = new JButton("STOP",cross);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel bp = new JPanel();
        bp.setLayout(new GridLayout()); // for button panel
        bp.add(init);
        bp.add(exit);

        setLayout(new BorderLayout()); // for main window
        add(bp, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);
        setVisible(true);
    }

    class Canvas extends JPanel { // for painting
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            field.paint(g);
        }
    }
}