/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class GuestView extends JFrame{
    JTable tabel;
    DefaultTableModel tableModel; //otomatis dibuat kalo buat JTable
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID","PERTANDINGAN","HARI","JAM","CHANNEL"};
    JLabel ltitle = new JLabel("INDONESIA SEA GAMES SCHEDULE 2022");
    JButton btnBack = new JButton("HOME");
    public GuestView(){
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        setLayout(null);
        setSize(600,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("GUEST");
        setDefaultCloseOperation(3);
        add(ltitle);
        add(btnBack);
        add(scrollPane);
        
        ltitle.setBounds(150, 10, 500, 20);
        scrollPane.setBounds(20, 35, 500, 345);
        btnBack.setBounds(470, 540, 100, 20);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
}
