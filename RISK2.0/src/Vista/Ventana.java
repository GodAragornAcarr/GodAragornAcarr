/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Carlos Rojas
 */
public class Ventana extends JFrame{
    
    public FondoPanel fondo = new FondoPanel();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    public JPanel panel4 = new JPanel();
    public JPanel panel5 = new JPanel();
    public JLabel risk = new JLabel("RISK");
    public JLabel label1= new JLabel("Soldados disponibles:");
    public JLabel label2= new JLabel("10");
    public JLabel label3= new JLabel("Indice del territorio a fortalecer:");
    public JLabel label4= new JLabel("Ingrese cantidad de soldados:");
    public JButton btn1 = new JButton("Planificar");
    public JButton btn2 = new JButton("Atacar");
    public JButton btn3 = new JButton("Fortificar");
    public JButton btn4 = new JButton("Siguiente");
    public JTextField txt1 = new JTextField();
    public JTextField txt2 = new JTextField();
    public JPanel panel6 = new JPanel();
    public JPanel panel7 = new JPanel();
    

   
    private Controlador c;
    
    public Ventana(){
       // this.setContentPane(fondo);
        this.setSize(1300,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Risk2.0");
        this.setVisible(true);
        this.initComponents();
       
    }
    
    public void initComponents(){
        
        this.fondo.setBounds(0, 0, 1280, 720);
        this.setVisible(true);
        this.add(fondo);
        
        risk.setBackground(new java.awt.Color(0, 0, 0));
        this.risk.setBounds(90, 10, 70, 30);
        risk.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        risk.setForeground(new java.awt.Color(0, 0, 0));
        this.panel5.add(risk);
        
        this.panel5.setBounds(500, 10, 220, 50);
        this.panel5.setBackground(new Color(255, 255, 255));
        this.setVisible(true);
        this.panel1.add(panel5);
        
        this.label1.setBounds(220,80,135,20);
        this.panel1.add(label1);
        this.label2.setBounds(360,80,90,20);
        this.panel1.add(label2);
        
        this.label3.setBounds(220,120,200,20);
        this.panel1.add(label3);
        this.txt1.setBounds(405,120,90,20);
        this.panel1.add(txt1);
        
        this.label4.setBounds(220,160,170,20);
        this.panel1.add(label4);
        this.txt2.setBounds(395,160,90,20);
        this.panel1.add(txt2);
        
        this.btn1.setBounds(70, 10, 120, 40);
        this.btn1.setBackground(new Color(149, 207, 247));
        this.panel7.add(btn1);
        
        this.btn2.setBounds(70,70, 120, 40);
        this.btn2.setBackground(new Color(149, 207, 247));
        this.panel7.add(btn2);
        
        this.btn3.setBounds(210, 10, 120, 40);
        this.btn3.setBackground(new Color(149, 207, 247));
        this.panel7.add(btn3);
        
        this.btn4.setBounds(210, 70, 120, 40);
        this.btn4.setBackground(new Color(149, 207, 247));
        this.panel7.add(btn4);
        
        this.panel6.setBounds(200, 70, 400, 120);
        this.panel6.setBackground(new Color(255,255,255));
        this.setVisible(true);
        this.panel1.add(panel6);
        
        this.panel7.setBounds(610, 70, 400, 120);
        this.panel7.setBackground(new Color(255,255,255));
        this.setVisible(true);
        this.panel1.add(panel7);
        
        this.panel1.setBounds(10, 10, 1240, 200);
        this.panel1.setBackground(new Color(251,236,220));
        this.setVisible(true);
        this.panel3.add(panel1);

        
        this.panel3.setBounds(10, 10, 1260, 220);
        this.panel3.setBackground(new Color(255, 255, 255));
        this.setVisible(true);
        this.panel4.add(panel3);
        
        this.panel4.setBounds(0, 720, 1300, 280);
        this.panel4.setBackground(new Color(95, 182, 222));
        this.setVisible(true);
        this.panel2.add(panel4);
        
        this.panel2.setBounds(0, 0, 1300, 1000);
        this.panel2.setBackground(new Color(251,236,220));
        this.setVisible(true);
        this.add(panel2);
        
     
        
    }
     public void JPanel(){
        
    }
   
   
   
    public void setController(Controlador cont){
        this.c = cont;
   
    
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }
    
     
    
   public FondoPanel getPanel(){
       return this.fondo;
   }
    
    
    
}
 