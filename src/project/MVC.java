/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Asus
 */
public class MVC {
    
    public void Admin(){
        AdminView viewAdmin = new AdminView();
        AdminModel modelAdmin = new AdminModel();
        Controller controller = new Controller(viewAdmin, modelAdmin);
    }
    
    public void Tamu(){
        GuestView viewGuest = new GuestView();
        GuestModel modelGuest = new GuestModel();
        Controller controller = new Controller(viewGuest, modelGuest);
    }
}
