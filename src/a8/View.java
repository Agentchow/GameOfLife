package a8;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class View extends JApplet {
    private static final int ROWS_NUMBER = 50;
    private static final int COLS_NUMBER = 70;
    private boolean leftButtonPressed;
    private boolean change = false;
    private boolean click = false;
    protected boolean isStandalone = false;
    private Model model = new Model(ROWS_NUMBER, COLS_NUMBER, false);
    private JLabel[][] area = new JLabel[ROWS_NUMBER][COLS_NUMBER];
    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();
    private JPanel jPanel3 = new JPanel();
    private JPanel jPanel4 = new JPanel();
    private GridLayout gridLayout1 = new GridLayout();
    private JButton goButton = new JButton();
    private JButton eraseButton = new JButton();
    private JButton stopButton = new JButton();
    private JCheckBox ballCheckbox = new JCheckBox();
    private Boolean holder = true;
    private static int count = 0;



    @Override
    public void start() {
        try {
            this.setSize(new Dimension(840, 620));
            jPanel1.setLayout(null);
            jPanel2.setBounds(new Rectangle(32, 22, 724, 454));
            jPanel2.setLayout(gridLayout1);
            gridLayout1.setColumns(COLS_NUMBER);
            gridLayout1.setHgap(0);
            gridLayout1.setRows(ROWS_NUMBER);
            gridLayout1.setVgap(0);
            jPanel3.setBounds(new Rectangle(38, 536, 768, 78));
            jPanel3.setLayout(null);
            //Go Button
            goButton.setBounds(new Rectangle(182, 6, 163, 26));
            goButton.setMargin(new Insets(2, 1, 2, 1));
            goButton.setText("Start/SpeedUp");
            JLabel jlabel = new JLabel("Test Label");
            jPanel3.add(jlabel);

            goButton.addKeyListener(new KeyListener(){
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyChar() == KeyEvent.VK_ENTER) {
                    	for (int i=0; i<1; i++) {
                            nextGen();
                            int iasdf =0;
                    	}
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {}

                @Override
                public void keyTyped(KeyEvent e) {}
            });
            goButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                	
                	Timer timer = new Timer(120 ,this);
                    timer.setRepeats(false);
                    
                    if (holder) {
                    	timer.start();
                    	runner();                    
                    } else {
                    	timer.stop();

                    }
                    
                    holder=true;

                }
            });
            //Clear Button
            eraseButton.setText("Clear");
            eraseButton.setMargin(new Insets(2, 1, 2, 1));
            eraseButton.setBounds(new Rectangle(86, 6, 83, 26));
            eraseButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i < area.length; i++) {
                        for (int j = 0; j < area[0].length; j++) {
                            area[i][j].setBackground(Color.black);
                        }
                    }
                    model.clearArea();
                    
                }
            });
            //Stop Button
            stopButton.setText("Stop/Slowdown");
            stopButton.setMargin(new Insets(2, 1, 2, 1));
            stopButton.setBounds(new Rectangle(356, 6, 163, 26));
            stopButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                	holder=false;
                }
            });


            
            jPanel4.setBackground(Color.BLACK);
            jPanel4.setBorder(BorderFactory.createLoweredBevelBorder());
            jPanel4.setBounds(new Rectangle(28, 16, 784, 500));
            jPanel4.setLayout(null);
            jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
            this.getContentPane().add(jPanel1, BorderLayout.CENTER);
            jPanel3.add(ballCheckbox, null);
            jPanel3.add(eraseButton, null);
            jPanel3.add(stopButton, null);
            jPanel3.add(goButton, null);
            jPanel1.add(jPanel4, null);
            jPanel4.add(jPanel2, null);
            jPanel1.add(jPanel3, null);

            for (int i = 0; i < area.length; i++)
            {
                for (int j = 0; j < area[0].length; j++) {
                    area[i][j] = new JLabel();
                    area[i][j].setBackground(Color.black);
                    area[i][j].setOpaque(true);
                    area[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                    area[i][j].addMouseListener(new MouseListener(){
                        @Override
                        public void mouseClicked(MouseEvent e) {}

                        @Override
                        public void mouseEntered(MouseEvent e) {
                            if (click) {
                                Object o = e.getSource();
                                if (leftButtonPressed) {
                                    ((JLabel) o).setBackground(Color.white);
                                } else {
                                    ((JLabel) o).setBackground(Color.black);
                                }
                            }

                            boolean[][] area2 = new boolean[ROWS_NUMBER][COLS_NUMBER];
                            for (int i = 0; i < area2.length; i++) {
                                for (int j = 0; j < area2[0].length; j++) {
                                    if (area[i][j].getBackground().equals(Color.white)) {
                                        area2[i][j] = true;	
                                    } else {
                                        area2[i][j] = false;
                                    }
                                }
                            }

                            model.setArea(area2);
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            change = true;
                            click = true;
                            Object o = e.getSource();
                            if (e.getButton() == MouseEvent.BUTTON1) {
                                leftButtonPressed = true;
                                ((JLabel) o).setBackground(Color.white);
                            } else if (e.getButton() == MouseEvent.BUTTON3) {
                                leftButtonPressed = false;
                                ((JLabel) o).setBackground(Color.black);
                            }
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                            click = false;
                        }
                    });
                    jPanel2.add(area[i][j]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void timer() {
    	
    }
    
    private void nextGen() {
        model.nextGen();

        boolean[][] area2 = model.getArea();
        for (int i = 0; i < area2.length; i++) {
            for (int j = 0; j < area2[0].length; j++) {
                if (area2[i][j]) {
                    area[i][j].setBackground(Color.white);
                } else {
                    area[i][j].setBackground(Color.black);
                }
            }
            
        }
    }
    private void runner() {
        model.nextGen();

        boolean[][] area2 = model.getArea();
        for (int i = 0; i < area2.length; i++) {
            for (int j = 0; j < area2[0].length; j++) {
                if (area2[i][j]) {
                    area[i][j].setBackground(Color.white);
                } else {
                    area[i][j].setBackground(Color.black);
                }
            }
            
        }
    }

}
