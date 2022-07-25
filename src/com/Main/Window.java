package com.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

public class Window extends JFrame implements WindowListener, ActionListener {
    private String inputString = "0";
    private JTextField f = new JTextField();

    private Font font1 = new Font("San Francisco", Font.PLAIN, 26);
    private Font font2 = new Font("San Francisco", Font.PLAIN, 17);

    //--1--
    private JButton ac = new JButton("AC");
    private JButton c = new JButton("C");
    private JButton firstBr = new JButton("(");
    private JButton lastBr = new JButton(")");
    //--2--
    private JButton sqrt = new JButton("sqrt");
    private JButton pow = new JButton("x^2");
    private JButton plMin = new JButton("+/-");
    private JButton div = new JButton("/");
    //--3--
    private JButton num7 = new JButton("7");
    private JButton num8 = new JButton("8");
    private JButton num9 = new JButton("9");
    private JButton mult = new JButton("*");
    //--4--
    private JButton num4 = new JButton("4");
    private JButton num5 = new JButton("5");
    private JButton num6 = new JButton("6");
    private JButton diff = new JButton("-");
    //--5--
    private JButton num1 = new JButton("1");
    private JButton num2 = new JButton("2");
    private JButton num3 = new JButton("3");
    private JButton plus = new JButton("+");
    //--6--
    private JButton zero = new JButton("0");
    private JButton point = new JButton(".");
    private JButton res = new JButton("=");

    private JButton allBtns[] = {ac, c, firstBr, lastBr, sqrt, pow, plMin, div};

    public Window () {
        setTitle("Calculator");
        setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(264, 429);
        setVisible(true);
        setLocation(630, 230);
        getContentPane().setBackground(new Color(43, 45, 47));

        //------TextField-----
        f.setHorizontalAlignment(JTextField.RIGHT);
        f.setEditable(false);

        f.setBackground(new Color(43, 45, 47));
        f.setForeground(Color.WHITE);
        f.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(43, 45, 47)));
        f.setFont(font1);
        f.setSize(248, 60);
        f.setLocation(0, 0);
        f.setVisible(true);
        add(f);
        f.setText(inputString.replaceAll("\\s",""));;

        //------Buttons-----
        //----1---
        ac.setBackground(Color.WHITE);
        ac.setFont(font2);
        ac.setSize(62, 55);
        ac.setLocation(0 , 60);
        ac.setVisible(true);
        ac.setFocusPainted(false);
        ac.setBackground(new Color(63, 65, 67));
        ac.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, new Color(43, 45, 47)));
        ac.setForeground(Color.WHITE);
        add(ac);
        ac.addActionListener(this);

        c.setBackground(Color.WHITE);
        c.setFont(font2);
        c.setSize(62, 55);
        c.setLocation(62 , 60);
        c.setVisible(true);
        c.setFocusPainted(false);
        c.setBackground(new Color(63, 65, 67));
        c.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(43, 45, 47)));
        c.setForeground(Color.WHITE);
        add(c);
        c.addActionListener(this);

        firstBr.setBackground(Color.WHITE);
        firstBr.setFont(font2);
        firstBr.setSize(62, 55);
        firstBr.setLocation(124 , 60);
        firstBr.setVisible(true);
        firstBr.setFocusPainted(false);
        firstBr.setBackground(new Color(63, 65, 67));
        firstBr.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(43, 45, 47)));
        firstBr.setForeground(Color.WHITE);
        add(firstBr);
        firstBr.addActionListener(this);

        lastBr.setBackground(Color.WHITE);
        lastBr.setFont(font2);
        lastBr.setSize(62, 55);
        lastBr.setLocation(186 , 60);
        lastBr.setVisible(true);
        lastBr.setFocusPainted(false);
        lastBr.setBackground(new Color(63, 65, 67));
        lastBr.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, new Color(43, 45, 47)));
        lastBr.setForeground(Color.WHITE);
        add(lastBr);
        lastBr.addActionListener(this);

        //----2-----
        sqrt.setBackground(Color.WHITE);
        sqrt.setFont(font2);
        sqrt.setSize(62, 55);
        sqrt.setLocation(0 , 115);
        sqrt.setVisible(true);
        sqrt.setFocusPainted(false);
        sqrt.setBackground(new Color(255, 159, 12));
        sqrt.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, new Color(43, 45, 47)));
        sqrt.setForeground(Color.WHITE);
        add(sqrt);
        sqrt.addActionListener(this);

        plMin.setBackground(Color.WHITE);
        plMin.setFont(font2);
        plMin.setSize(62, 55);
        plMin.setLocation(124 , 115);
        plMin.setVisible(true);
        plMin.setFocusPainted(false);
        plMin.setBackground(new Color(255, 159, 12));
        plMin.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(43, 45, 47)));
        plMin.setForeground(Color.WHITE);
        add(plMin);
        plMin.addActionListener(this);

        pow.setBackground(Color.WHITE);
        pow.setFont(font2);
        pow.setSize(62, 55);
        pow.setLocation(62 , 115);
        pow.setVisible(true);
        pow.setFocusPainted(false);
        pow.setBackground(new Color(255, 159, 12));
        pow.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(43, 45, 47)));
        pow.setForeground(Color.WHITE);
        add(pow);
        pow.addActionListener(this);

        div.setBackground(Color.WHITE);
        div.setFont(font2);
        div.setSize(62, 55);
        div.setLocation(186 , 115);
        div.setVisible(true);
        div.setFocusPainted(false);
        div.setBackground(new Color(255, 159, 12));
        div.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 0, new Color(43, 45, 47)));
        div.setForeground(Color.WHITE);
        add(div);
        div.addActionListener(this);

        //----3-----
        num7.setBackground(Color.WHITE);
        num7.setFont(font2);
        num7.setSize(62, 55);
        num7.setLocation(0 , 170);
        num7.setVisible(true);
        num7.setFocusPainted(false);
        num7.setBackground(new Color(95, 96, 98));
        num7.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, new Color(43, 45, 47)));
        num7.setForeground(Color.WHITE);
        add(num7);
        num7.addActionListener(this);

        num8.setBackground(Color.WHITE);
        num8.setFont(font2);
        num8.setSize(62, 55);
        num8.setLocation(62 , 170);
        num8.setVisible(true);
        num8.setFocusPainted(false);
        num8.setBackground(new Color(95, 96, 98));
        num8.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(43, 45, 47)));
        num8.setForeground(Color.WHITE);
        add(num8);
        num8.addActionListener(this);

        num9.setBackground(Color.WHITE);
        num9.setFont(font2);
        num9.setSize(62, 55);
        num9.setLocation(124 , 170);
        num9.setVisible(true);
        num9.setFocusPainted(false);
        num9.setBackground(new Color(95, 96, 98));
        num9.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(43, 45, 47)));
        num9.setForeground(Color.WHITE);
        add(num9);
        num9.addActionListener(this);

        mult.setBackground(Color.WHITE);
        mult.setFont(font2);
        mult.setSize(62, 55);
        mult.setLocation(186 , 170);
        mult.setVisible(true);
        mult.setFocusPainted(false);
        mult.setBackground(new Color(255, 159, 12));
        mult.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 0, new Color(43, 45, 47)));
        mult.setForeground(Color.WHITE);
        add(mult);
        mult.addActionListener(this);

        //----4-----
        num4.setBackground(Color.WHITE);
        num4.setFont(font2);
        num4.setSize(62, 55);
        num4.setLocation(0 , 225);
        num4.setVisible(true);
        num4.setFocusPainted(false);
        num4.setBackground(new Color(95, 96, 98));
        num4.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, new Color(43, 45, 47)));
        num4.setForeground(Color.WHITE);
        add(num4);
        num4.addActionListener(this);

        num5.setBackground(Color.WHITE);
        num5.setFont(font2);
        num5.setSize(62, 55);
        num5.setLocation(62 , 225);
        num5.setVisible(true);
        num5.setFocusPainted(false);
        num5.setBackground(new Color(95, 96, 98));
        num5.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(43, 45, 47)));
        num5.setForeground(Color.WHITE);
        add(num5);
        num5.addActionListener(this);

        num6.setBackground(Color.WHITE);
        num6.setFont(font2);
        num6.setSize(62, 55);
        num6.setLocation(124 , 225);
        num6.setVisible(true);
        num6.setFocusPainted(false);
        num6.setBackground(new Color(95, 96, 98));
        num6.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(43, 45, 47)));
        num6.setForeground(Color.WHITE);
        add(num6);
        num6.addActionListener(this);

        diff.setBackground(Color.WHITE);
        diff.setFont(font2);
        diff.setSize(62, 55);
        diff.setLocation(186 , 225);
        diff.setVisible(true);
        diff.setFocusPainted(false);
        diff.setBackground(new Color(255, 159, 12));
        diff.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 0, new Color(43, 45, 47)));
        diff.setForeground(Color.WHITE);
        add(diff);
        diff.addActionListener(this);

        //----5-----
        num1.setBackground(Color.WHITE);
        num1.setFont(font2);
        num1.setSize(62, 55);
        num1.setLocation(0 , 280);
        num1.setVisible(true);
        num1.setFocusPainted(false);
        add(num1);
        num1.setBackground(new Color(95, 96, 98));
        num1.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, new Color(43, 45, 47)));
        num1.setForeground(Color.WHITE);
        num1.addActionListener(this);

        num2.setBackground(Color.WHITE);
        num2.setFont(font2);
        num2.setSize(62, 55);
        num2.setLocation(62 , 280);
        num2.setVisible(true);
        num2.setFocusPainted(false);
        add(num2);
        num2.setBackground(new Color(95, 96, 98));
        num2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(43, 45, 47)));
        num2.setForeground(Color.WHITE);
        num2.addActionListener(this);

        num3.setBackground(Color.WHITE);
        num3.setFont(font2);
        num3.setSize(62, 55);
        num3.setLocation(124 , 280);
        num3.setVisible(true);
        num3.setFocusPainted(false);
        add(num3);
        num3.setBackground(new Color(95, 96, 98));
        num3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(43, 45, 47)));
        num3.setForeground(Color.WHITE);
        num3.addActionListener(this);

        plus.setBackground(Color.WHITE);
        plus.setFont(font2);
        plus.setSize(62, 55);
        plus.setLocation(186 , 280);
        plus.setVisible(true);
        plus.setFocusPainted(false);
        plus.setBackground(new Color(255, 159, 12));
        plus.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 0, new Color(43, 45, 47)));
        plus.setForeground(Color.WHITE);
        add(plus);
        plus.addActionListener(this);

        //----6-----
        zero.setBackground(Color.WHITE);
        zero.setFont(font2);
        zero.setSize(124, 55);
        zero.setLocation(0 , 335);
        zero.setVisible(true);
        zero.setFocusPainted(false);
        zero.setBackground(new Color(95, 96, 98));
        zero.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1, new Color(43, 45, 47)));
        zero.setForeground(Color.WHITE);
        add(zero);
        zero.addActionListener(this);

        point.setBackground(Color.WHITE);
        point.setFont(font2);
        point.setSize(62, 55);
        point.setLocation(124 , 335);
        point.setVisible(true);
        point.setFocusPainted(false);
        point.setBackground(new Color(95, 96, 98));
        point.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, new Color(43, 45, 47)));
        point.setForeground(Color.WHITE);
        add(point);
        point.addActionListener(this);

        res.setBackground(Color.WHITE);
        res.setFont(font2);
        res.setSize(62, 55);
        res.setLocation(186 , 335);
        res.setVisible(true);
        res.setFocusPainted(false);
        res.setBackground(new Color(255, 159, 12));
        res.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, new Color(43, 45, 47)));
        res.setForeground(Color.WHITE);
        add(res);
        res.addActionListener(this);
    }

    public static Double parseDouble (String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<JButton> numBtns = new ArrayList<>();
        numBtns.add(zero);
        numBtns.add(num1);
        numBtns.add(num2);
        numBtns.add(num3);
        numBtns.add(num4);
        numBtns.add(num5);
        numBtns.add(num6);
        numBtns.add(num7);
        numBtns.add(num8);
        numBtns.add(num9);
        numBtns.add(point);
        ArrayList<JButton> actions = new ArrayList<>();
        actions.add(plus);
        actions.add(diff);
        actions.add(mult);
        actions.add(div);
        actions.add(sqrt);
        actions.add(pow);
        actions.add(firstBr);
        actions.add(lastBr);

        //f.setText(inputString.replaceAll("\\s",""));
        char inpStrFirstEl = inputString.charAt(0);
        char inpStrLastEl = inputString.charAt(inputString.length() - 1);
        
        for (var num : numBtns) {
            if (e.getSource() == num) {
                if (inputString.equals("Ошибка")) {
                    inputString = "";
                    inputString += num.getText();
                    f.setText(inputString.replaceAll("\\s",""));;
                } else {
                    if (num != point && inpStrLastEl != ')') {
                        if (inpStrFirstEl == '0' && inputString.length() < 2) {
                            inputString = "";
                        }
                        inputString += num.getText();
                    } else if (num == point && parseDouble(String.valueOf(inpStrLastEl)) != null) {
                        int endOfNumIndex = inputString.length() - 1;
                        String number = "";
                        for (int i = endOfNumIndex; i >= 0; i--) {
                            if (inputString.charAt(i) == ' ' || i == inputString.indexOf(inpStrFirstEl)) {
                                break;
                            }
                            number += inputString.charAt(i);
                        }
                        Boolean pointContainns = false;
                        for (int j = 0; j < number.length(); j++) {
                            if (number.charAt(j) == '.') {
                                pointContainns = true;
                                break;
                            }
                        }
                        if (!pointContainns) {
                            inputString += point.getText();
                        }
                    } else if (inpStrLastEl == ')') {
                        inputString += " * " + num.getText();
                    }
                    f.setText(inputString.replaceAll("\\s",""));;
                }

            }
        }

        for (var act : actions) {
            if (e.getSource() == act) {
                if (inputString != "Ошибка") {
                    if (inputString.length() != 0) {
                        if (parseDouble(String.valueOf(inpStrLastEl)) != null || inpStrLastEl == ')' || act == firstBr || act == pow) {
                            if (act == firstBr && parseDouble(String.valueOf(inpStrLastEl)) == null && inpStrLastEl != ')') {
                                if (inpStrLastEl != '.') {
                                    inputString += act.getText() + " ";
                                }
                            } else if (act == lastBr) {
                                for (int i = 0; i < inputString.length(); i++) {
                                    if (inputString.charAt(i) == '(') {
                                        inputString += " " + act.getText();
                                        break;
                                    }
                                }
                            } else if (act == firstBr && inputString.length() == 1 && inpStrFirstEl == '0') {
                                inputString = act.getText() + " ";
                            } else if (act == firstBr && (parseDouble(String.valueOf(inpStrLastEl)) != null || inpStrLastEl == ')')) {
                                inputString += " * " + act.getText() + " ";
                            } else if (act != firstBr && act != lastBr && act != sqrt && act != pow) {
                                inputString += " " + act.getText() + " ";
                            }
                        } else if (inpStrLastEl == ' ' && (act == plus || act == diff || act == mult || act == div)) {
                            if (inputString.charAt(inputString.length() - 2) == '+' || inputString.charAt(inputString.length() - 2) == '-' || inputString.charAt(inputString.length() - 2) == '*' || inputString.charAt(inputString.length() - 2) == '/') {
                                inputString = inputString.substring(0 , inputString.length() - 2);
                                inputString += act.getText() + " ";
                            }
                        }
                        if (act == sqrt) {
                            if (inputString.length() == 1 && inpStrFirstEl == '0') {
                                inputString = inputString.substring(0, inputString.length() - 1);
                                inputString += act.getText() + " ( ";
                            } else if (parseDouble(String.valueOf(inpStrLastEl)) != null || inpStrLastEl == ')') {
                                inputString += " * " + act.getText() + " ( ";
                            } else {
                                inputString += act.getText() + " ( ";
                            }
                        }
                        if (act == pow) {
                            if (inputString.length() == 1) {
                                inputString += " ^2";
                            } else if (inputString.length() >= 2 && inputString.charAt(inputString.length() - 2) != '^') {
                                if (parseDouble(String.valueOf(inpStrLastEl)) != null || inpStrLastEl == ')') {
                                    inputString += " ^2";

                                }
                            }
                        }
                    }
                    f.setText(inputString.replaceAll("\\s",""));;
                }
            }
        }

        if (e.getSource() == ac) {
            inputString = "0";
            f.setText(inputString.replaceAll("\\s",""));;
        }

        if (e.getSource() == c) {
            if (inputString.equals("Ошибка")){
                inputString = "0";
                f.setText(inputString.replaceAll("\\s",""));;
            } else {
                if (inputString.length() != 0) {
                    if (inputString.length() == 1 && inpStrLastEl != '0') {
                        inputString = inputString.substring(0, inputString.length() - 1);
                    } else {
                        if (inputString.length() >= 7 && inputString.charAt(inputString.length() - 4) == 't') {
                            inputString = inputString.substring(0, inputString.length() - 4);
                        }
                        if (inputString.length() >= 2 && inputString.charAt(inputString.length() - 2) == '^') {
                            inputString = inputString.substring(0, inputString.length() - 2);
                        }
                        if (inpStrLastEl == ' ') {
                            if (inputString.charAt(inputString.length() - 2) == '(') {
                                inputString = inputString.substring(0, inputString.length() - 2);
                            } else {
                                inputString = inputString.substring(0, inputString.length() - 3);
                            }
                        } else if (inpStrLastEl == ')') {
                            inputString = inputString.substring(0, inputString.length() - 2);
                        } else if (inputString.indexOf(inpStrFirstEl) != inputString.indexOf(inputString.length() - 1)) {
                            if (inputString.length() > 1 && inputString.charAt(inputString.length() - 2) == '-') {
                                inputString = inputString.substring(0, inputString.length() - 2);
                            } else {
                                inputString = inputString.substring(0, inputString.length() - 1);
                            }
                        } else {
                            inputString = inputString.substring(0, inputString.length() - 1);
                        }
                    }
                    if (inputString.length() == 0) {
                        inputString = "0";
                    }
                    f.setText(inputString.replaceAll("\\s",""));;
                }
            }
        }

        if (e.getSource() == plMin) {
            if (inputString.length() != 0 && parseDouble(String.valueOf(inpStrLastEl)) != null) {
                for (int i = inputString.length() - 1; i >= 0; i--) {
                    if (inputString.charAt(i) == ' ' || i == inputString.indexOf(inpStrFirstEl)) {
                        String num = "";
                        for (int j = i; j < inputString.length(); j++) {
                            num += inputString.charAt(j);
                        }
                        num = num.replaceAll("\\s", "");
                        if (Double.valueOf(num) > 0) {
                            num = "-" + num;
                        } else if (inpStrFirstEl == '0') {
                            num = "0";
                        } else {
                            num = num.substring(1);
                        }
                        if (inputString.charAt(i) == inpStrFirstEl) {
                            inputString = inputString.substring(0, inputString.length() - (inputString.length() - i));
                        } else {
                            inputString = inputString.substring(0, inputString.length() - (inputString.length() - i - 1));
                        }
                        inputString += num;
                        f.setText(inputString.replaceAll("\\s",""));;
                        break;
                    }
                }
            }
        }

        if (e.getSource() == res) {
            if (inputString != "Ошибка" && inputString.length() != 0 && inpStrLastEl != '.') {
                Calculate calculate = new Calculate();
                calculate.calculateString(inputString);
                inputString = calculate.printResult();
                f.setText(inputString.replaceAll("\\s",""));;
            }
        }
        
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
