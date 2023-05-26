/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import QuanLy.DAO.MyConnect;
import QuanLy.GUI.DangNhap;

public class Main {

    public static void main(String[] args) {
        new MyConnect();
        System.out.println(MyConnect.conn);
        changLNF("Nimbus");
        DangNhap login = new DangNhap();
        login.showWindow();
    }
    public static void changLNF(String nameLNF) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (nameLNF.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
    }
    
}
