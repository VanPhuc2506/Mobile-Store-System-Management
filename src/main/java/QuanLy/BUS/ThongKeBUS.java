/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy.BUS;


import MyCustom.Helpers;
import QuanLy.DAO.ThongKeDAO;
import QuanLy.DTO.ThongKe;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @author User
 */
public class ThongKeBUS {

    public ThongKeDAO thongKeDAO = new ThongKeDAO();
    private ArrayList<Double> doanhThuThang;

    public ThongKe thongKe(int nam) {
        return thongKeDAO.getThongKe(nam);
    }

    public double getDoanhThuThang(int thang, int nam) {
        return thongKeDAO.getDoanhThuThang(thang, nam);
    }



    public double getNhanVien() {
        return 0.1;
    }


    public double getSpend(Date start, Date end) {
        return thongKeDAO.getSpend(start, end);
    }
    public double getSpend(Date date) { return thongKeDAO.getSpend(date);}
    public double getInCome(Date start, Date end) {
        return thongKeDAO.getInCome(start, end);
    }
    public double getInCome(Date date) { return  thongKeDAO.getInCome(date);}

    public double getProfit(Date start, Date end) {
        return  getInCome(start, end) - getSpend(start, end);
    }
    public double getProfit(Date date) {
        return  getInCome(date) - getSpend(date);
    }
    public double getGrowthRate(Date start, Date end) {
        int days = (int) Helpers.getDays(start, end);
        Date preEndPeriod = Helpers.calculateDate(start, Calendar.DATE,  -1);
        Date preStartPeriod =  Helpers.calculateDate(preEndPeriod, Calendar.DATE, 0-days);
        double currentRevenue= getInCome(start, end);

        double preRevenue = getInCome(preStartPeriod, preEndPeriod);
        System.out.println("pre: "+ preRevenue);
        double rate = (currentRevenue - preRevenue)/preRevenue*100;

        return rate;
    }
    public double getGrowthRate(Date date) {
        Date preDate = Helpers.calculateDate(date, Calendar.DATE, -1);
        double currentRevenue = getInCome(date);
        double preRevenue = getInCome(date);

        double rate = (currentRevenue - preRevenue)/preRevenue*100;

        return rate;
    }
}