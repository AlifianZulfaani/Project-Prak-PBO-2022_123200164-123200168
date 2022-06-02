/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class AdminModel {
    Connector connector = new Connector(); 
    public int getBanyakData(){
        int jmlData=0;
        try{
            String query = "Select * from jadwal_seagames"; 
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //menghitung banyak baris yang ada di database
                jmlData++; 
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        return jmlData;
    }
    
    public String[][] readData(){ //dua dimensi baris-kolom
        try{
            int jmlData = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya
            String data[][] = new String[getBanyakData()][5]; // nemampung array. barisnya isinya di getBanyakData,kolomnya itu atribut
            String query = "Select * from `jadwal_seagames`"; 
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query);// result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                data[jmlData][0] = resultSet.getString("id"); // Harus sesuai database
                data[jmlData][1] = resultSet.getString("pertandingan"); // Harus sesuai database
                data[jmlData][2] = resultSet.getString("hari"); // Harus sesuai database
                data[jmlData][3] = resultSet.getString("jam");
                data[jmlData][4] = resultSet.getString("channel");
                jmlData++; //barisnya berpindah terus sampai habis        
            }
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void addData(String id,String pertandingan,String hari,String jam,String channel){
        
         try {
            String query = "INSERT INTO jadwal_seagames VALUES ('"+id+"','"+pertandingan+"','"+hari+"','"+jam+"','"+channel+"')";  
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null,"Add Data Success !!");
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"Data Already Exist !!");  
        }
         
    }
    
    public void updateData(String nama,String id,String pertandingan,String hari,String jam,String channel){
            
        try {
            String query = "update jadwal_seagames set id=?, "
                    + "pertandingan=?, hari=?, jam=?, channel=? where id=?";
            PreparedStatement preparedStmt = connector.koneksi.prepareStatement(query);
            preparedStmt.setString(1, id);
            preparedStmt.setString(2, pertandingan);
            preparedStmt.setString(3, hari);
            preparedStmt.setString(4, jam);
            preparedStmt.setString(5, channel);
            preparedStmt.setString(6, nama);
            preparedStmt.execute();
            
           if(nama.compareTo(id)!=0)
            JOptionPane.showMessageDialog(null,"Update Data Success !!");
           else if(nama.compareTo(jam)!=0)
            JOptionPane.showMessageDialog(null,"Update Data Success !!");
           else if(nama.compareTo(hari)!=0)
            JOptionPane.showMessageDialog(null,"Update Data Success !!");
           else
                JOptionPane.showMessageDialog(null,"No Data !!");
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public void deleteData(String id){
        try{
            String query = "DELETE from jadwal_seagames WHERE id = '"+id+"'";
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Delete Data Success !!");
            
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
}
