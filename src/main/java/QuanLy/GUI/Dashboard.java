/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy.GUI;

import Main.Main;
import QuanLy.BUS.PhanQuyenBUS;
import QuanLy.DTO.PhanQuyen;
import QuanLy.DTO.TaiKhoan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import java.util.ArrayList;



/**
 *
 * @author Pero
 */
public class Dashboard extends javax.swing.JFrame {


    public Dashboard(TaiKhoan tk) {
        initComponents(tk);
        
        //Sidemenu button hover
       menu_banhang.addMouseListener(new PanelButtonAdapter(menu_banhang));
       menu_hoadon.addMouseListener(new PanelButtonAdapter(menu_hoadon));
       menu_sanpham.addMouseListener(new PanelButtonAdapter(menu_sanpham));
       menu_loaisanpham.addMouseListener(new PanelButtonAdapter(menu_loaisanpham));
       menu_nhaphang.addMouseListener(new PanelButtonAdapter(menu_nhaphang));
       menu_khachhang.addMouseListener(new PanelButtonAdapter(menu_khachhang));
       menu_khuyenmai.addMouseListener(new PanelButtonAdapter(menu_khuyenmai));
       menu_nhanvien.addMouseListener(new PanelButtonAdapter(menu_nhanvien));
       menu_thongke.addMouseListener(new PanelButtonAdapter(menu_thongke));

              
    }
    
    public void showWindow() {
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(TaiKhoan tk) {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu_banhang = new javax.swing.JPanel();
        icon_banhang = new javax.swing.JLabel();
        txt_menubanhang = new javax.swing.JLabel();
        menu_hoadon = new javax.swing.JPanel();
        icon_hoadon = new javax.swing.JLabel();
        txt_menuhoadon = new javax.swing.JLabel();
        menu_sanpham = new javax.swing.JPanel();
        icon_sanpham = new javax.swing.JLabel();
        txt_menusanpham = new javax.swing.JLabel();
        menu_loaisanpham = new javax.swing.JPanel();
        icon_loaisanpham = new javax.swing.JLabel();
        txt_menuloaisanpham = new javax.swing.JLabel();
        menu_nhaphang = new javax.swing.JPanel();
        icon_nhaphang = new javax.swing.JLabel();
        txt_menunhaphang = new javax.swing.JLabel();
        menu_khachhang = new javax.swing.JPanel();
        icon_khachhang = new javax.swing.JLabel();
        txt_menukhachhang = new javax.swing.JLabel();
        menu_khuyenmai = new javax.swing.JPanel();
        icon_khuyenmai = new javax.swing.JLabel();
        txt_menukhuyenmai = new javax.swing.JLabel();
        menu_nhanvien = new javax.swing.JPanel();
        icon_nhanvien = new javax.swing.JLabel();
        txt_menunhanvien = new javax.swing.JLabel();
        menu_thongke = new javax.swing.JPanel();
        icon_thongke = new javax.swing.JLabel();
        txt_menuthongke = new javax.swing.JLabel();
        panel_header = new QuanLy.GUI.Panel_Header();
        form = new javax.swing.JPanel();
        form_banhang = new QuanLy.GUI.FormBanHang();
        form_hoadon = new QuanLy.GUI.FormHoaDon();
        form_sanpham = new QuanLy.GUI.FormSanPham();
        form_loaisanpham = new QuanLy.GUI.FormLoaiSanPham();
        form_nhaphang = new QuanLy.GUI.FormNhapHang();
        form_khachhang = new QuanLy.GUI.FormKhachHang();
        form_khuyenmai = new QuanLy.GUI.FormKhuyenMai();
        form_nhanvien = new QuanLy.GUI.FormNhanVien();
        form_thongke = new QuanLy.GUI.Form_ThongKe();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 800));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(17, 16, 16));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 800));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(".\\image\\Menu_logo.png")); // NOI18N

        menu_banhang.setBackground(new java.awt.Color(17, 16, 16));
        menu_banhang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_banhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_banhangMouseClicked(evt);
            }
        });

        icon_banhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_cart.png")); // NOI18N
        icon_banhang.setMaximumSize(new java.awt.Dimension(48, 48));
        icon_banhang.setPreferredSize(new java.awt.Dimension(48, 48));

        txt_menubanhang.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_menubanhang.setForeground(new java.awt.Color(255, 255, 255));
        txt_menubanhang.setText("Bán hàng");

        javax.swing.GroupLayout menu_banhangLayout = new javax.swing.GroupLayout(menu_banhang);
        menu_banhang.setLayout(menu_banhangLayout);
        menu_banhangLayout.setHorizontalGroup(
            menu_banhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_banhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_banhang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_menubanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_banhangLayout.setVerticalGroup(
            menu_banhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_banhangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_banhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_menubanhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_banhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_hoadon.setBackground(new java.awt.Color(17, 16, 16));
        menu_hoadon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_hoadonMouseClicked(evt);
            }
        });

        icon_hoadon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\icon_bill.png")); // NOI18N
        icon_hoadon.setMaximumSize(new java.awt.Dimension(48, 48));
        icon_hoadon.setPreferredSize(new java.awt.Dimension(48, 48));

        txt_menuhoadon.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_menuhoadon.setForeground(new java.awt.Color(255, 255, 255));
        txt_menuhoadon.setText("Hóa đơn");

        javax.swing.GroupLayout menu_hoadonLayout = new javax.swing.GroupLayout(menu_hoadon);
        menu_hoadon.setLayout(menu_hoadonLayout);
        menu_hoadonLayout.setHorizontalGroup(
            menu_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_hoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_menuhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_hoadonLayout.setVerticalGroup(
            menu_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_hoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_menuhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_hoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_sanpham.setBackground(new java.awt.Color(17, 16, 16));
        menu_sanpham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_sanphamMouseClicked(evt);
            }
        });

        icon_sanpham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_product.png")); // NOI18N
        System.out.println(icon_sanpham.getIcon());
        icon_sanpham.setMaximumSize(new java.awt.Dimension(48, 48));
        icon_sanpham.setPreferredSize(new java.awt.Dimension(48, 48));

        txt_menusanpham.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_menusanpham.setForeground(new java.awt.Color(255, 255, 255));
        txt_menusanpham.setText("Sản phẩm");

        javax.swing.GroupLayout menu_sanphamLayout = new javax.swing.GroupLayout(menu_sanpham);
        menu_sanpham.setLayout(menu_sanphamLayout);
        menu_sanphamLayout.setHorizontalGroup(
            menu_sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_sanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_menusanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_sanphamLayout.setVerticalGroup(
            menu_sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_sanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_menusanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_sanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_loaisanpham.setBackground(new java.awt.Color(17, 16, 16));
        menu_loaisanpham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_loaisanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_loaisanphamMouseClicked(evt);
            }
        });

        icon_loaisanpham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_grid.png")); // NOI18N
        icon_loaisanpham.setMaximumSize(new java.awt.Dimension(48, 48));
        icon_loaisanpham.setPreferredSize(new java.awt.Dimension(48, 48));

        txt_menuloaisanpham.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_menuloaisanpham.setForeground(new java.awt.Color(255, 255, 255));
        txt_menuloaisanpham.setText("Loại sản phẩm");

        javax.swing.GroupLayout menu_loaisanphamLayout = new javax.swing.GroupLayout(menu_loaisanpham);
        menu_loaisanpham.setLayout(menu_loaisanphamLayout);
        menu_loaisanphamLayout.setHorizontalGroup(
            menu_loaisanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_loaisanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_loaisanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_menuloaisanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_loaisanphamLayout.setVerticalGroup(
            menu_loaisanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_loaisanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_loaisanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_menuloaisanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_loaisanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_nhaphang.setBackground(new java.awt.Color(17, 16, 16));
        menu_nhaphang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_nhaphang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_nhaphangMouseClicked(evt);
            }
        });

        icon_nhaphang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_supply.png")); // NOI18N
        icon_nhaphang.setMaximumSize(new java.awt.Dimension(48, 48));
        icon_nhaphang.setPreferredSize(new java.awt.Dimension(48, 48));

        txt_menunhaphang.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_menunhaphang.setForeground(new java.awt.Color(255, 255, 255));
        txt_menunhaphang.setText("Nhập hàng");

        javax.swing.GroupLayout menu_nhaphangLayout = new javax.swing.GroupLayout(menu_nhaphang);
        menu_nhaphang.setLayout(menu_nhaphangLayout);
        menu_nhaphangLayout.setHorizontalGroup(
            menu_nhaphangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_nhaphangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_nhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_menunhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_nhaphangLayout.setVerticalGroup(
            menu_nhaphangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_nhaphangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_nhaphangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_menunhaphang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_nhaphang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_khachhang.setBackground(new java.awt.Color(17, 16, 16));
        menu_khachhang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_khachhangMouseClicked(evt);
            }
        });

        icon_khachhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_customer.png")); // NOI18N
        icon_khachhang.setMaximumSize(new java.awt.Dimension(48, 48));
        icon_khachhang.setPreferredSize(new java.awt.Dimension(48, 48));

        txt_menukhachhang.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_menukhachhang.setForeground(new java.awt.Color(255, 255, 255));
        txt_menukhachhang.setText("Khách hàng");

        javax.swing.GroupLayout menu_khachhangLayout = new javax.swing.GroupLayout(menu_khachhang);
        menu_khachhang.setLayout(menu_khachhangLayout);
        menu_khachhangLayout.setHorizontalGroup(
            menu_khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_khachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_menukhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_khachhangLayout.setVerticalGroup(
            menu_khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_khachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_menukhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_khachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_khuyenmai.setBackground(new java.awt.Color(17, 16, 16));
        menu_khuyenmai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_khuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_khuyenmaiMouseClicked(evt);
            }
        });

        icon_khuyenmai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\icon_promo.png")); // NOI18N
        icon_khuyenmai.setMaximumSize(new java.awt.Dimension(48, 48));
        icon_khuyenmai.setPreferredSize(new java.awt.Dimension(48, 48));

        txt_menukhuyenmai.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_menukhuyenmai.setForeground(new java.awt.Color(255, 255, 255));
        txt_menukhuyenmai.setText("Khuyến mãi");

        javax.swing.GroupLayout menu_khuyenmaiLayout = new javax.swing.GroupLayout(menu_khuyenmai);
        menu_khuyenmai.setLayout(menu_khuyenmaiLayout);
        menu_khuyenmaiLayout.setHorizontalGroup(
            menu_khuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_khuyenmaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_khuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_menukhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_khuyenmaiLayout.setVerticalGroup(
            menu_khuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_khuyenmaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_khuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_menukhuyenmai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_khuyenmai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_nhanvien.setBackground(new java.awt.Color(17, 16, 16));
        menu_nhanvien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_nhanvienMouseClicked(evt);
            }
        });

        icon_nhanvien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\icon_user.png")); // NOI18N
        icon_nhanvien.setMaximumSize(new java.awt.Dimension(48, 48));
        icon_nhanvien.setPreferredSize(new java.awt.Dimension(48, 48));

        txt_menunhanvien.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_menunhanvien.setForeground(new java.awt.Color(255, 255, 255));
        txt_menunhanvien.setText("Nhân viên");

        javax.swing.GroupLayout menu_nhanvienLayout = new javax.swing.GroupLayout(menu_nhanvien);
        menu_nhanvien.setLayout(menu_nhanvienLayout);
        menu_nhanvienLayout.setHorizontalGroup(
            menu_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_nhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_menunhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_nhanvienLayout.setVerticalGroup(
            menu_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_nhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_menunhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_nhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_thongke.setBackground(new java.awt.Color(17, 16, 16));
        menu_thongke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_thongkeMouseClicked(evt);
            }
        });

        icon_thongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\icon_chart.png")); // NOI18N
        icon_thongke.setMaximumSize(new java.awt.Dimension(48, 48));
        icon_thongke.setPreferredSize(new java.awt.Dimension(48, 48));

        txt_menuthongke.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_menuthongke.setForeground(new java.awt.Color(255, 255, 255));
        txt_menuthongke.setText("Thống kê");

        javax.swing.GroupLayout menu_thongkeLayout = new javax.swing.GroupLayout(menu_thongke);
        menu_thongke.setLayout(menu_thongkeLayout);
        menu_thongkeLayout.setHorizontalGroup(
                menu_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menu_thongkeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(icon_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_menuthongke, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        menu_thongkeLayout.setVerticalGroup(
                menu_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menu_thongkeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(menu_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_menuthongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(icon_thongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        PhanQuyenBUS modelquyen = new PhanQuyenBUS();
        PhanQuyen quyen = new PhanQuyen();
        ArrayList<PhanQuyen> dsloai = modelquyen.getListQuyen();
        for(PhanQuyen q : dsloai)
        {
            if(q.getQuyen().equals(tk.getQuyen()))
            {
                quyen=q;
                break;
            }
        }



        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        ParallelGroup p;
        jPanel2Layout.setHorizontalGroup(
                p = jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING));

        p.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        p.addComponent(menu_banhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        p.addComponent(menu_hoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        if(quyen.getQlSanPham()==1)
        {
            p.addComponent(menu_sanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
            p.addComponent(menu_loaisanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        }
        if(quyen.getNhapHang()==1)
            p.addComponent(menu_nhaphang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        if(quyen.getQlKhachHang()==1)
            p.addComponent(menu_khachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        p.addComponent(menu_khuyenmai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        if(quyen.getQlNhanVien()==1)
            p.addComponent(menu_nhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        if(quyen.getThongKe()==1)
            p.addComponent(menu_thongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);

        SequentialGroup p2;
        p2 = jPanel2Layout.createSequentialGroup();
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(p2));

        p2.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        p2.addComponent(menu_banhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        p2.addComponent(menu_hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        if(quyen.getQlSanPham()==1)
        {
            p2.addComponent(menu_sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
            p2.addComponent(menu_loaisanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        }
        if(quyen.getNhapHang()==1)
            p2.addComponent(menu_nhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        if(quyen.getQlKhachHang()==1)
            p2.addComponent(menu_khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        p2.addComponent(menu_khuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        if(quyen.getQlNhanVien()==1)
            p2.addComponent(menu_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
        if(quyen.getThongKe()==1)
            p2.addComponent(menu_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 85, Short.MAX_VALUE);

        form.setDoubleBuffered(false);
        form.setLayout(new java.awt.CardLayout());
        form.add(form_banhang, "card9");
        form.add(form_hoadon, "card4");
        form.add(form_sanpham, "card5");
        form.add(form_loaisanpham, "card6");
        form.add(form_nhaphang, "card7");
        form.add(form_khachhang, "card8");
        form.add(form_khuyenmai, "card9");
        form.add(form_nhanvien, "card10");
        form.add(form_thongke, "card10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void menu_banhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_banhangMouseClicked
        
        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\selected_cart.png"));
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\icon_bill.png"));
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_product.png"));
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_grid.png"));
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_supply.png"));
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\icon_promo.png"));
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_customer.png"));
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\icon_user.png"));
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\icon_chart.png"));
        
        txt_menubanhang.setForeground(new Color(241,131,24));
        txt_menuhoadon.setForeground(new Color(255,255,255));
        txt_menusanpham.setForeground(new Color(255,255,255));
        txt_menuloaisanpham.setForeground(new Color(255,255,255));
        txt_menunhaphang.setForeground(new Color(255,255,255));
        txt_menukhachhang.setForeground(new Color(255,255,255));
        txt_menukhuyenmai.setForeground(new Color(255,255,255));
        txt_menunhanvien.setForeground(new Color(255,255,255));
        txt_menuthongke.setForeground(new Color(255,255,255));      
        
        form_banhang.setVisible(true);
        form_hoadon.setVisible(false);
        form_sanpham.setVisible(false);
        form_loaisanpham.setVisible(false);
        form_nhaphang.setVisible(false);
        form_khuyenmai.setVisible(false);
        form_khachhang.setVisible(false);
        form_nhanvien.setVisible(false);
        form_thongke.setVisible(false);
        
    }//GEN-LAST:event_menu_banhangMouseClicked

    private void menu_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_hoadonMouseClicked

        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_cart.png"));
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\selected_bill.png"));
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_product.png"));
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_grid.png"));
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_supply.png"));
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\icon_promo.png"));
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_customer.png"));
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\icon_user.png"));
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\icon_chart.png"));
        
        txt_menubanhang.setForeground(new Color(255,255,255));
        txt_menuhoadon.setForeground(new Color(241,131,24));
        txt_menusanpham.setForeground(new Color(255,255,255));
        txt_menuloaisanpham.setForeground(new Color(255,255,255));
        txt_menunhaphang.setForeground(new Color(255,255,255));
        txt_menukhachhang.setForeground(new Color(255,255,255));
        txt_menukhuyenmai.setForeground(new Color(255,255,255));
        txt_menunhanvien.setForeground(new Color(255,255,255));
        txt_menuthongke.setForeground(new Color(255,255,255)); 
        
        form_banhang.setVisible(false);
        form_hoadon.setVisible(true);
        form_sanpham.setVisible(false);
        form_loaisanpham.setVisible(false);
        form_nhaphang.setVisible(false);
        form_khuyenmai.setVisible(false);
        form_khachhang.setVisible(false);
        form_nhanvien.setVisible(false);
        form_thongke.setVisible(false);
    }//GEN-LAST:event_menu_hoadonMouseClicked

    private void menu_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sanphamMouseClicked

        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_cart.png"));
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\icon_bill.png"));
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\selected_product.png"));
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_grid.png"));
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_supply.png"));
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\icon_promo.png"));
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_customer.png"));
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\icon_user.png"));
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\icon_chart.png"));
        
        txt_menubanhang.setForeground(new Color(255,255,255));
        txt_menuhoadon.setForeground(new Color(255,255,255));
        txt_menusanpham.setForeground(new Color(241,131,24));
        txt_menuloaisanpham.setForeground(new Color(255,255,255));
        txt_menunhaphang.setForeground(new Color(255,255,255));
        txt_menukhachhang.setForeground(new Color(255,255,255));
        txt_menukhuyenmai.setForeground(new Color(255,255,255));
        txt_menunhanvien.setForeground(new Color(255,255,255));
        txt_menuthongke.setForeground(new Color(255,255,255)); 
        
        form_banhang.setVisible(false);
        form_hoadon.setVisible(false);
        form_sanpham.setVisible(true);
        form_loaisanpham.setVisible(false);
        form_nhaphang.setVisible(false);
        form_khuyenmai.setVisible(false);
        form_khachhang.setVisible(false);
        form_nhanvien.setVisible(false);
        form_thongke.setVisible(false);
    }//GEN-LAST:event_menu_sanphamMouseClicked

    private void menu_loaisanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_loaisanphamMouseClicked
        
        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_cart.png"));
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\icon_bill.png"));
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_product.png"));
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\selected_grid.png"));
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_supply.png"));
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\icon_promo.png"));
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_customer.png"));
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\icon_user.png"));
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\icon_chart.png"));
        
        txt_menubanhang.setForeground(new Color(255,255,255));
        txt_menuhoadon.setForeground(new Color(255,255,255));
        txt_menusanpham.setForeground(new Color(255,255,255));
        txt_menuloaisanpham.setForeground(new Color(241,131,24));
        txt_menunhaphang.setForeground(new Color(255,255,255));
        txt_menukhachhang.setForeground(new Color(255,255,255));
        txt_menukhuyenmai.setForeground(new Color(255,255,255));
        txt_menunhanvien.setForeground(new Color(255,255,255));
        txt_menuthongke.setForeground(new Color(255,255,255)); 
        
        form_banhang.setVisible(false);
        form_hoadon.setVisible(false);
        form_sanpham.setVisible(false);
        form_loaisanpham.setVisible(true);
        form_nhaphang.setVisible(false);
        form_khuyenmai.setVisible(false);
        form_khachhang.setVisible(false);
        form_nhanvien.setVisible(false);
        form_thongke.setVisible(false);
    }//GEN-LAST:event_menu_loaisanphamMouseClicked

    private void menu_nhaphangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_nhaphangMouseClicked
        
        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_cart.png"));
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\icon_bill.png"));
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_product.png"));
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_grid.png"));
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\selected_supply.png"));
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\icon_promo.png"));
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_customer.png"));
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\icon_user.png"));
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\icon_chart.png"));
        
        txt_menubanhang.setForeground(new Color(255,255,255));
        txt_menuhoadon.setForeground(new Color(255,255,255));
        txt_menusanpham.setForeground(new Color(255,255,255));
        txt_menuloaisanpham.setForeground(new Color(255,255,255));
        txt_menunhaphang.setForeground(new Color(241,131,24));
        txt_menukhachhang.setForeground(new Color(255,255,255));
        txt_menukhuyenmai.setForeground(new Color(255,255,255));
        txt_menunhanvien.setForeground(new Color(255,255,255));
        txt_menuthongke.setForeground(new Color(255,255,255)); 
        
        form_banhang.setVisible(false);
        form_hoadon.setVisible(false);
        form_sanpham.setVisible(false);
        form_loaisanpham.setVisible(false);
        form_nhaphang.setVisible(true);
        form_khuyenmai.setVisible(false);
        form_khachhang.setVisible(false);
        form_nhanvien.setVisible(false);
        form_thongke.setVisible(false);
    }//GEN-LAST:event_menu_nhaphangMouseClicked

    private void menu_khuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_khuyenmaiMouseClicked
       
        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_cart.png"));
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\icon_bill.png"));
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_product.png"));
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_grid.png"));
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_supply.png"));
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\selected_promo.png"));
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_customer.png"));
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\icon_user.png"));
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\icon_chart.png"));
        
        txt_menubanhang.setForeground(new Color(255,255,255));
        txt_menuhoadon.setForeground(new Color(255,255,255));
        txt_menusanpham.setForeground(new Color(255,255,255));
        txt_menuloaisanpham.setForeground(new Color(255,255,255));
        txt_menunhaphang.setForeground(new Color(255,255,255));
        txt_menukhachhang.setForeground(new Color(255,255,255));
        txt_menukhuyenmai.setForeground(new Color(241,131,24));
        txt_menunhanvien.setForeground(new Color(255,255,255));
        txt_menuthongke.setForeground(new Color(255,255,255)); 
        
        form_banhang.setVisible(false);
        form_hoadon.setVisible(false);
        form_sanpham.setVisible(false);
        form_loaisanpham.setVisible(false);
        form_nhaphang.setVisible(false);
        form_khuyenmai.setVisible(true);
        form_khachhang.setVisible(false);
        form_nhanvien.setVisible(false);
        form_thongke.setVisible(false);
    }//GEN-LAST:event_menu_khuyenmaiMouseClicked

    private void menu_khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_khachhangMouseClicked
       
        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_cart.png"));
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\icon_bill.png"));
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_product.png"));
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_grid.png"));
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_supply.png"));
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\icon_promo.png"));
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\selected_customer.png"));
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\icon_user.png"));
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\icon_chart.png"));
        
        txt_menubanhang.setForeground(new Color(255,255,255));
        txt_menuhoadon.setForeground(new Color(255,255,255));
        txt_menusanpham.setForeground(new Color(255,255,255));
        txt_menuloaisanpham.setForeground(new Color(255,255,255));
        txt_menunhaphang.setForeground(new Color(255,255,255));
        txt_menukhachhang.setForeground(new Color(241,131,24));
        txt_menukhuyenmai.setForeground(new Color(255,255,255));
        txt_menunhanvien.setForeground(new Color(255,255,255));
        txt_menuthongke.setForeground(new Color(255,255,255)); 
        
        form_banhang.setVisible(false);
        form_hoadon.setVisible(false);
        form_sanpham.setVisible(false);
        form_loaisanpham.setVisible(false);
        form_nhaphang.setVisible(false);
        form_khuyenmai.setVisible(false);
        form_khachhang.setVisible(true);
        form_nhanvien.setVisible(false);
        form_thongke.setVisible(false);
    }//GEN-LAST:event_menu_khachhangMouseClicked

    private void menu_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_nhanvienMouseClicked
      
        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_cart.png"));
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\icon_bill.png"));
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_product.png"));
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_grid.png"));
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_supply.png"));
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\icon_promo.png"));
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_customer.png"));
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\selected_user.png"));
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\icon_chart.png"));
        
        txt_menubanhang.setForeground(new Color(255,255,255));
        txt_menuhoadon.setForeground(new Color(255,255,255));
        txt_menusanpham.setForeground(new Color(255,255,255));
        txt_menuloaisanpham.setForeground(new Color(255,255,255));
        txt_menunhaphang.setForeground(new Color(255,255,255));
        txt_menukhachhang.setForeground(new Color(255,255,255));
        txt_menukhuyenmai.setForeground(new Color(255,255,255));
        txt_menunhanvien.setForeground(new Color(241,131,24));
        txt_menuthongke.setForeground(new Color(255,255,255)); 
        
        form_banhang.setVisible(false);
        form_hoadon.setVisible(false);
        form_sanpham.setVisible(false);
        form_loaisanpham.setVisible(false);
        form_nhaphang.setVisible(false);
        form_khuyenmai.setVisible(false);
        form_khachhang.setVisible(false);
        form_nhanvien.setVisible(true);
        form_thongke.setVisible(false);
    }//GEN-LAST:event_menu_nhanvienMouseClicked

    private void menu_thongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_thongkeMouseClicked

        icon_banhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_cart.png"));
        icon_hoadon.setIcon(new javax.swing.ImageIcon(".\\image\\icon_bill.png"));
        icon_sanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_product.png"));
        icon_loaisanpham.setIcon(new javax.swing.ImageIcon(".\\image\\icon_grid.png"));
        icon_nhaphang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_supply.png"));
        icon_khuyenmai.setIcon(new javax.swing.ImageIcon(".\\image\\icon_promo.png"));
        icon_khachhang.setIcon(new javax.swing.ImageIcon(".\\image\\icon_customer.png"));
        icon_nhanvien.setIcon(new javax.swing.ImageIcon(".\\image\\icon_user.png"));
        icon_thongke.setIcon(new javax.swing.ImageIcon(".\\image\\selected_chart.png"));
        
        txt_menubanhang.setForeground(new Color(255,255,255));
        txt_menuhoadon.setForeground(new Color(255,255,255));
        txt_menusanpham.setForeground(new Color(255,255,255));
        txt_menuloaisanpham.setForeground(new Color(255,255,255));
        txt_menunhaphang.setForeground(new Color(255,255,255));
        txt_menukhachhang.setForeground(new Color(255,255,255));
        txt_menukhuyenmai.setForeground(new Color(255,255,255));
        txt_menunhanvien.setForeground(new Color(255,255,255));
        txt_menuthongke.setForeground(new Color(241,131,24)); 
        
        form_banhang.setVisible(false);
        form_hoadon.setVisible(false);
        form_sanpham.setVisible(false);
        form_loaisanpham.setVisible(false);
        form_nhaphang.setVisible(false);
        form_khuyenmai.setVisible(false);
        form_khachhang.setVisible(false);
        form_nhanvien.setVisible(false);
        form_thongke.setVisible(true);
    }//GEN-LAST:event_menu_thongkeMouseClicked



    
    private class PanelButtonAdapter extends MouseAdapter{
        JPanel panel;
        public PanelButtonAdapter(JPanel panel){
            this.panel = panel;
        }
        
        @Override
        public void mouseEntered(MouseEvent e){
            panel.setBackground(new Color(28,26,26));
        }
        
        @Override
        public void mouseExited(MouseEvent e){
            panel.setBackground(new Color(17,16,16));
        }
        
        @Override
        public void mousePressed(MouseEvent e){
            panel.setBackground(new Color(181,117,40));
        }
        
        @Override
        public void mouseReleased(MouseEvent e){
            panel.setBackground(new Color(28,26,26));
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel form;
    private QuanLy.GUI.FormBanHang form_banhang;
    private QuanLy.GUI.FormHoaDon form_hoadon;
    private QuanLy.GUI.FormKhachHang form_khachhang;
    private QuanLy.GUI.FormKhuyenMai form_khuyenmai;
    private QuanLy.GUI.FormLoaiSanPham form_loaisanpham;
    private QuanLy.GUI.FormNhanVien form_nhanvien;
    private QuanLy.GUI.FormNhapHang form_nhaphang;
    private QuanLy.GUI.FormSanPham form_sanpham;
    private QuanLy.GUI.Form_ThongKe form_thongke;
    private javax.swing.JLabel icon_banhang;
    private javax.swing.JLabel icon_hoadon;
    private javax.swing.JLabel icon_khachhang;
    private javax.swing.JLabel icon_khuyenmai;
    private javax.swing.JLabel icon_loaisanpham;
    private javax.swing.JLabel icon_nhanvien;
    private javax.swing.JLabel icon_nhaphang;
    private javax.swing.JLabel icon_sanpham;
    private javax.swing.JLabel icon_thongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menu_banhang;
    private javax.swing.JPanel menu_hoadon;
    private javax.swing.JPanel menu_khachhang;
    private javax.swing.JPanel menu_khuyenmai;
    private javax.swing.JPanel menu_loaisanpham;
    private javax.swing.JPanel menu_nhanvien;
    private javax.swing.JPanel menu_nhaphang;
    private javax.swing.JPanel menu_sanpham;
    private javax.swing.JPanel menu_thongke;
    private QuanLy.GUI.Panel_Header panel_header;
    private javax.swing.JLabel txt_menubanhang;
    private javax.swing.JLabel txt_menuhoadon;
    private javax.swing.JLabel txt_menukhachhang;
    private javax.swing.JLabel txt_menukhuyenmai;
    private javax.swing.JLabel txt_menuloaisanpham;
    private javax.swing.JLabel txt_menunhanvien;
    private javax.swing.JLabel txt_menunhaphang;
    private javax.swing.JLabel txt_menusanpham;
    private javax.swing.JLabel txt_menuthongke;
    // End of variables declaration//GEN-END:variables
}
