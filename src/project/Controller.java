/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class Controller {
    AdminModel adminModel;
    AdminView adminView ;
    GuestModel guestModel;
    GuestView guestView;

    Controller(AdminView viewAdmin, AdminModel modelAdmin) {
    this.adminModel = modelAdmin;
    this.adminView = viewAdmin;
    
    //mengecek data yang ada dari database dan memasukkan ke dalam tabel
    if(modelAdmin.getBanyakData() != 0){
            String data[][] = modelAdmin.readData();
            viewAdmin.tabel.setModel((new JTable(data, viewAdmin.namaKolom)).getModel());
        } else{
            JOptionPane.showMessageDialog(null, "Data Kosong");
        }
    
    //aksi ketika menekan tombol add
    viewAdmin.btnAdd.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
        String id = viewAdmin.getFid().getText();
        String pertandingan = viewAdmin.getFpertandingan().getText();
        String hari = viewAdmin.getFhari().getText();
        String jam = viewAdmin.getFjam().getText();
        String channel = viewAdmin.getFchannel().getText();
        if (id.equals("") || pertandingan.equals("")||hari.equals("")||jam.equals("")||channel.equals("")) {
            JOptionPane.showMessageDialog(viewAdmin, "Mohon isi kolom yang masih kosong !!");
        }else {
            modelAdmin.addData(id,pertandingan,hari,jam,channel);
            viewAdmin.dispose();
            MVC mvc = new MVC();
            mvc.Admin();
        }
        }
    });
    
    //aksi ketika menekan tombol update
    viewAdmin.btnUpdate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
        String nama = viewAdmin.nama;
        String id = viewAdmin.getFid().getText();
        String pertandingan = viewAdmin.getFpertandingan().getText();
        String hari = viewAdmin.getFhari().getText();
        String jam = viewAdmin.getFjam().getText();
        String channel = viewAdmin.getFchannel().getText();
        if (id.equals("") || pertandingan.equals("")||hari.equals("")||jam.equals("")||channel.equals("")) {
            JOptionPane.showMessageDialog(viewAdmin, "Isi Kolom Kosong Terlebih Dahulu !");
        }else {
            modelAdmin.updateData(nama,id,pertandingan,hari,jam,channel);
            viewAdmin.dispose();
            MVC mvc = new MVC();
            mvc.Admin();
        }
        }
    });
    
    //aksi ketika menekan tombol delete
    viewAdmin.btnDelete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
        String id = viewAdmin.getFid().getText();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(viewAdmin, "Mohon isi ID jadwal!!");
        }else {
            modelAdmin.deleteData(id);
            viewAdmin.dispose();
            MVC mvc = new MVC();
            mvc.Admin();
        }
        }
    });
    
    //aksi ketika menekan tombol clear
     viewAdmin.btnClear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAdmin.fid.setText("");
                viewAdmin.fpertandingan.setText("");
                viewAdmin.fhari.setText("");
                viewAdmin.fjam.setText("");
                viewAdmin.fchannel.setText("");
            }
        });
     
     //aksi ketika menekan tombol HOME
     viewAdmin.btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAdmin.dispose();
                Home home = new Home();
            }
        });
    
    }
    
    Controller(GuestView viewTamu, GuestModel modelTamu) {
    this.guestModel = modelTamu;
    this.guestView = viewTamu;
    
    //mengecek data yang ada dari database dan memasukkan ke dalam tabel
    if(modelTamu.getBanyakData() != 0){
            String data[][] = modelTamu.readData();
            viewTamu.tabel.setModel((new JTable(data, viewTamu.namaKolom)).getModel());
        } else{
            JOptionPane.showMessageDialog(null, "Data Kosong!!\nTidak ada pertandingan dalam waktu dekat!!");
        }
    
    //aksi ketika menekan tombol Menu Utama
    viewTamu.btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTamu.dispose();
                Home home = new Home();
            }
        });
    

    
    }
    
}
