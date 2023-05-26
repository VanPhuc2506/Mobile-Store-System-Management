package MyCustom;

import QuanLy.BUS.ThongKeBUS;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class DrawChartTool {


    public static JPanel createLineChartPanel(String title, String categoryLabel, String valueLabel, boolean viewLegend, boolean createUrl, boolean createToolTip, ArrayList<String> objects, ArrayList<String> categories, ArrayList<ArrayList<Double>> values) {
        String chartTitle = title;
        String categoryAxisLabel = categoryLabel;
        String valueAxisLabel = valueLabel;
        boolean showLegend = viewLegend;
        boolean createURL = createUrl;
        boolean createTooltip = createToolTip;

        CategoryDataset dataset = createDatasetLineChart(objects, categories, values);

        JFreeChart chart = ChartFactory.createLineChart(chartTitle,
                categoryAxisLabel, valueAxisLabel, dataset,
                PlotOrientation.VERTICAL, showLegend, createTooltip, createURL);
        ChartPanel chartPanel = new ChartPanel(chart);

        return chartPanel;

    }
    private static CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String series1 = "Java";
        String series2 = "PHP";
        String series3 = "C++";
        String series4 = "C#";

        dataset.addValue(5.0, series1, "2005");
        dataset.addValue(4.8, series1, "2006");
        dataset.addValue(4.5, series1, "2007");
        dataset.addValue(4.3, series1, "2008");
        dataset.addValue(4.0, series1, "2009");
        dataset.addValue(4.1, series1, "2010");
        dataset.addValue(4.2, series1, "2011");
        dataset.addValue(4.2, series1, "2012");
        dataset.addValue(4.0, series1, "2013");


        dataset.addValue(4.0, series2, "2005");
        dataset.addValue(4.2, series2, "2006");
        dataset.addValue(3.8, series2, "2007");
        dataset.addValue(3.6, series2, "2008");
        dataset.addValue(3.4, series2, "2009");
        dataset.addValue(3.4, series2, "2010");
        dataset.addValue(3.3, series2, "2011");
        dataset.addValue(3.1, series2, "2012");
        dataset.addValue(3.2, series2, "2013");

        dataset.addValue(3.6, series3, "2005");
        dataset.addValue(3.4, series3, "2006");
        dataset.addValue(3.5, series3, "2007");
        dataset.addValue(3.2, series3, "2008");
        dataset.addValue(3.2, series3, "2009");
        dataset.addValue(3.0, series3, "2010");
        dataset.addValue(2.8, series3, "2011");
        dataset.addValue(2.8, series3, "2012");
        dataset.addValue(2.6, series3, "2013");

        dataset.addValue(3.2, series4, "2005");
        dataset.addValue(3.2, series4, "2006");
        dataset.addValue(3.0, series4, "2007");
        dataset.addValue(3.0, series4, "2008");
        dataset.addValue(2.8, series4, "2009");
        dataset.addValue(2.7, series4, "2010");
        dataset.addValue(2.6, series4, "2011");
        dataset.addValue(2.6, series4, "2012");
        dataset.addValue(2.4, series4, "2013");

        return dataset;
    }
    private static CategoryDataset createDatasetLineChart(ArrayList<String> objects, ArrayList<String> categories, ArrayList<ArrayList<Double>> values) {
        for (int index =0; index<categories.size()-1; index++) {
            String[] month =  categories.get(index).split("-");
            categories.set(index, month[1]);
        }
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int objectIndex = 0; objectIndex < objects.size(); objectIndex++ ) {
            for (int categoriesIndex = 0; categoriesIndex < categories.size()-1; categoriesIndex++) {
                dataset.addValue(values.get(objectIndex).get(categoriesIndex), objects.get(objectIndex), categories.get(categoriesIndex));
            }
        }

        return dataset;
    }
    public static ArrayList<Date> getTimeLine(Date start, Date end, int  number) {
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(start);
        long numberDay = Helpers.getDays(start, end);
        long numberDayWithoutBorder = numberDay - 2;

        long numberTimelineWithoutBorder = number -2;
        int step = 0;
        if (numberDayWithoutBorder <= numberTimelineWithoutBorder) {
            step = 1;
            numberTimelineWithoutBorder = numberDayWithoutBorder;
        } else {
            step = (int) (numberDayWithoutBorder / numberTimelineWithoutBorder);
        }
        Date temp = start;
        while (numberTimelineWithoutBorder > 0) {
            temp = Helpers.calculateDate(temp, Calendar.DATE, step);
            dates.add(temp);
            numberTimelineWithoutBorder -=1;
        }
        dates.add(end);
        return dates;
    }
    public static ArrayList<String> getTimeLineLabel(int year) {
        String[] mothLineArr = {"01-01", "02-01", "03-01", "04-01", "05-01", "06-01", "07-01","08-01", "09-01", "10-01", "11-01", "12-01"};
        ArrayList<String> monthLine = new ArrayList<>(Arrays.asList(mothLineArr));
        for (int index = 0; index < monthLine.size(); index++) {
            monthLine.set(index, year+"-"+monthLine.get(index));
        }
        monthLine.add((year+1)+"-01-01");
        return monthLine;
    }

    public static ArrayList<Date> getTimeLine(ArrayList<String> monthLine) {
        ArrayList<Date> dates = new ArrayList<>();
        for (String index: monthLine) {
            dates.add(Helpers.stringToDate(index));
        }

        return dates;
    }
    public static ArrayList<ArrayList<Double>> getValues(ArrayList<String> objects, ArrayList<Date> timeLines, ThongKeBUS thongKeBUS) {
        ArrayList<ArrayList<Double>> values = new ArrayList<>();
        for (int objectIndex = 0; objectIndex < objects.size(); objectIndex ++) {
            ArrayList<Double> temp = new ArrayList<>();
            for (int timeLineIndex = 0; timeLineIndex < timeLines.size()-1; timeLineIndex++) {
                switch (objects.get(objectIndex)) {
                    case "Spend": {
                        temp.add(thongKeBUS.getSpend(timeLines.get(timeLineIndex), Helpers.calculateDate(timeLines.get(timeLineIndex+1),Calendar.DATE,-1)));
                        break;
                    }
                    case "InCome": {
                        temp.add(thongKeBUS.getInCome(timeLines.get(timeLineIndex), Helpers.calculateDate(timeLines.get(timeLineIndex+1),Calendar.DATE,-1)));
                        break;
                    }
                }
            }
            values.add(temp);
        }
        return values;
    }

}
