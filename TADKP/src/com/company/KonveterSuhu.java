package com.company;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.event.*;


public class KonveterSuhu{

    private JTextField Input;
    private JTextField Output;
    private JComboBox Inputawal;
    private JComboBox Inputakhir;
    private JButton submitButton;
    private JButton clearButton;
    private JLabel Labelinp;
    private JLabel Labelawal;
    private JLabel Labelakhir;
    private JPanel panel;
    private JButton exitButton;
    String input = Input.getText();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Konversi Suhu");
        frame.setContentPane(new KonveterSuhu().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setResizable(true);
    }

    public KonveterSuhu() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = Input.getText();
                float a = Float.parseFloat(input);
                Inputawal.getSelectedItem();
                String inputawal = (String) Inputawal.getSelectedItem();
                Inputakhir.getSelectedItem();
                String inputakhir = (String) Inputakhir.getSelectedItem();



                while (a == Math.round(a)) {
                    if (inputawal.equals("Kelvin")) {
                        if (inputakhir.equals("Celcius")) {
                            float j;
                            j = a - 273;
                            Output.setText("Hasil = " + j + "Celcius");
                            break;
                        }
                        else if (inputakhir.equals("Reamur")){
                            float y ;
                            double o;
                            y = a + 273;
                            o = y * 0.8;
                            Output.setText("Hasil = " + o +"Reamur");
                            break;
                        }
                        else if (inputakhir.equals("Farenheit")){
                            float j;
                            double k;
                            j = a - 273;
                            k = j * 1.8 + 32;
                            Output.setText("Hasil =" + k + "Farenheit");
                            break;

                        }
                        else {
                            PopUp.infoBox("Harap Memilih satuan yang berbeda", "Error");
                            break;
                        }

                    }
                    else if(inputawal.equals("Celcius")){
                        if(inputakhir.equals("Kelvin")){
                            float f = a + 273;
                            Output.setText("Hasil =" + f + "Kelvin");
                            break;
                        }
                        else if(inputakhir.equals("Reamur")){
                            double j;
                            j = 0.8 * a;
                            Output.setText("Hasil =" + j + "Reamur");
                            break;
                        }
                        else if (inputakhir.equals("Farenheit")){
                            double f, j;
                            j = 1.8 * a;
                            f = j + 32;
                            Output.setText("Hasil =" + f + "Farenheit");
                            break;
                        }
                        else {
                            PopUp.infoBox("Harap Memilih satuan yang berbeda", "Error");
                            break;
                        }

                    }
                    else if(inputawal.equals("Reamur")) {
                        if (inputakhir.equals("Celcius")) {
                            double j;
                            j = 1.25 * a;
                            Output.setText("Hasil =" + j + "Celcius");
                            break;
                        } else if (inputakhir.equals("Farenheit")) {
                            double f;
                            double j;
                            f = 2.25 * a;
                            j = f + 32;
                            Output.setText("Hasil =" + j + "Farenheit");
                            break;
                        } else if (inputakhir.equals("Kelvin")) {
                            double f;
                            f = 1.25 * a;
                            double j;
                            j = f + 273;
                            Output.setText("Hasil =" + j + "Kelvin");
                            break;
                        }
                        else {
                            PopUp.infoBox("Harap Memilih satuan yang berbeda", "Error");
                            break;
                        }

                    }
                    else if(inputawal.equals("Farenheit")){
                        if (inputakhir.equals("Celcius")){
                            double f, j;
                            f = a - 32;
                            j = 0.5555555 * f ;
                            Output.setText("Hasil =" + j + "Celcius");
                            break;
                        }
                        else if(inputakhir.equals("Kelvin")){
                            double f, j;
                            f = a - 32;
                            j = f * 0.5555 + 273;
                            Output.setText("Hasil =" + j + "Kelvin");
                            break;
                        }
                        else if(inputakhir.equals("Reamur")){
                            double f,j ;
                            f = a - 32;
                             j = f * 0.4444444;
                            Output.setText("Hasil =" + j + "Reamur");
                            break;
                        }
                        else {
                            PopUp.infoBox("Harap Memilih satuan yang berbeda", "Error");
                            break;
                        }
                    }

                }
                while (a != Math.round(a)){
                    PopUp.infoBox("Harap Memasukkan Angka", "Error");
                }

            }
        });


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Input.setText("");
                Output.setText("");

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }
        });
    }



}

