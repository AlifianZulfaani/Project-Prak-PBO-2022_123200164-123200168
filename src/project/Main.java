/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Home home = new Home();
    }
}
    //Halaman Utama
    class Home extends JFrame {
    Menu menu;
    
    JButton btnAdmin = new JButton("ADMIN LOGIN");
    JButton btnTamu = new JButton("GUEST LOGIN");
    
    Home(){
        setTitle("Indonesian Sea Games 2022 Schedule App");
	setSize(350,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        
        add(btnAdmin);
        add(btnTamu);
        
        setVisible(true);
        btnAdmin.setBounds(90,200,150,40);
        btnTamu.setBounds(90,300,150,40);
        
         btnAdmin.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  dispose();
                  Login login = new Login();        
              }
         });
         
         btnTamu.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  dispose();
                  MVC mvc = new MVC();
                  mvc.Tamu();
              }
         });
     
   }
}
    //Halaman Login
   class Login extends JFrame {
   final JTextField funame = new JTextField(10);
   final JPasswordField fpass = new JPasswordField(10);
   
   JLabel lTitle = new JLabel("ADMIN LOGIN");
   JLabel luname = new JLabel("Username");
   JLabel lpass = new JLabel("Password");
   
   JButton btnLoginAdmin = new JButton(" LOGIN ");
   JButton btnBack = new JButton("HOME");
        Login() {
	setTitle("ADMIN LOGIN");
	setSize(350,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        
        add(lTitle);
	add(luname);
	add(funame);
        add(lpass);
	add(fpass);
	add(btnLoginAdmin);  
        add(btnBack);
        
        setVisible(true);
        lTitle.setBounds(130,50,140,20);
	luname.setBounds(55,106,120,20);
	funame.setBounds(120,100,150,30);
	lpass.setBounds(55,145,120,20);
	fpass.setBounds(120,140,150,30);
        btnLoginAdmin.setBounds(120,200,120,30);
	btnBack.setBounds(120,250,120,30);
        
        
        btnLoginAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = funame.getText();
                String pass = fpass.getText();
                
                if(uname.equals("admin") && pass.equals("admin")){
                    dispose();
                    MVC mvc = new MVC();
                    mvc.Admin();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Login Failed");
                }
            }
        });
        
                btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Home home = new Home();
            }
        });
	
    }
  }

