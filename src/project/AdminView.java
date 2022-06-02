/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AdminView extends JFrame {
    //DEKLARASI KOMPONEN
    String nama;
    JTable tabel;
    DefaultTableModel tableModel; //otomatis dibuat kalo buat JTable
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID","PERTANDINGAN","HARI","JAM","CHANNEL"}; //membuat kolom dgn array tipe object;
    final JTextField fid = new JTextField(50);
    final JTextField fpertandingan = new JTextField(20);
    final JTextField fhari = new JTextField(20);
    final JTextField fjam = new JTextField(10);
    final JTextField fchannel = new JTextField(10);
    JLabel ltitle = new JLabel("INDONESIA SEA GAMES SCHEDULE 2022");
    JLabel lid= new JLabel("ID");
    JLabel lpertandingan = new JLabel("Pertandingan");
    JLabel lhari = new JLabel("Hari");
    JLabel ljam = new JLabel("Jam");
    JLabel lchannel = new JLabel("Channel");
    JButton btnAdd = new JButton("Add");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");
    JButton btnClear = new JButton("Clear");
    JButton btnBack = new JButton("HOME");
    
    public AdminView(){
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        setLayout(null);
        setSize(600,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ADMIN");
        setDefaultCloseOperation(3);
  
        add(ltitle);
        add(scrollPane);
        add(lid);
        add(fid);
        add(lpertandingan);
        add(fpertandingan);
        add(lhari);
        add(fhari);
        add(ljam);
        add(fjam);
        add(lchannel);
        add(fchannel);
        add(btnAdd);
        add(btnUpdate);
        add(btnDelete);
        add(btnClear);
        add(btnBack);

        scrollPane.setBounds(20, 35, 550, 345);
        
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        ltitle.setBounds(150, 10, 500, 20);
        lid.setBounds(20, 380, 120, 20);
        fid.setBounds(20, 400, 150, 20);
        lpertandingan.setBounds(180, 380, 120, 20);
        fpertandingan.setBounds(180, 400, 150, 20);
        lhari.setBounds(340, 380, 120, 20);
        fhari.setBounds(340, 400, 150, 20);
        ljam.setBounds(20, 430, 120, 20);
        fjam.setBounds(20, 450, 150, 20);
        lchannel.setBounds(180, 430, 120, 20);
        fchannel.setBounds(180, 450, 150, 20);
        btnAdd.setBounds(20, 510, 80, 20);
        btnUpdate.setBounds(20, 540, 80, 20);
        btnDelete.setBounds(110, 510, 80, 20);
        btnClear.setBounds(110, 540, 80, 20);
        btnBack.setBounds(470, 540, 100, 20);
        
        //mengambil data dari tabel yang di klik
        tabel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                JTable target = (JTable)me.getSource();
                int baris = target.getSelectedRow(); // select a row
                nama =tabel.getValueAt(baris, 0).toString();
                fid.setText(tabel.getValueAt(baris, 0).toString());
                fpertandingan.setText(tabel.getValueAt(baris, 1).toString());
                fhari.setText( tabel.getValueAt(baris, 2).toString());
                fjam.setText(tabel.getValueAt(baris, 3).toString());
                fchannel.setText(tabel.getValueAt(baris, 4).toString());         
            }
        });
        
    }
    
    public JTextField getFid() {
        return fid;
    }

    public JTextField getFpertandingan() {
        return fpertandingan;
    }

    public JTextField getFhari() {
        return fhari;
    }
    
    public JTextField getFjam() {
        return fjam;
    }
    
    public JTextField getFchannel() {
        return fchannel;
    }
}
