package Main;

import MyCustom.DrawChartTool;
import MyCustom.Helpers;
import QuanLy.BUS.ThongKeBUS;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test{
    public static void set() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap ");
            int c = sc.nextInt();
            System.out.println(c);
        } catch (Exception e ) {
            set();
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World Java Swing");
        Date end = Helpers.getCurrentDate();
        Date start = Helpers.calculateDate(end,Calendar.DATE, -15);

        // set frame siten
        frame.setMinimumSize(new Dimension(1000, 800));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JPanel parent = new JPanel();
        parent.setBackground(Color.RED);
        parent.setBounds(50,50,900,600);
        ArrayList<String> objects =new ArrayList<>();
        objects.add("Spend");
        objects.add("InCome");
        ArrayList<String> timeLineLB = DrawChartTool.getTimeLineLabel(2022);
        ArrayList<Date> timeLine = DrawChartTool.getTimeLine(timeLineLB);
        ArrayList<ArrayList<Double>> values = DrawChartTool.getValues(objects, timeLine, new ThongKeBUS());
        JPanel chart = DrawChartTool.createLineChartPanel("Biểu đồ thống kê thu chi năm ", "Thời gian", "VND", true, false,false, objects, timeLineLB, values);
        chart.setPreferredSize(new Dimension(900,600));
        parent.add(chart, BorderLayout.CENTER);
        frame.add(parent);


        // display it
        frame.pack();
        frame.setVisible(true);








    }
}
