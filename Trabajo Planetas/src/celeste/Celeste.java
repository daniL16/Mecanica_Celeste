/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeste;

import java.awt.Color;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import javax.swing.JFrame;
import jdk.nashorn.internal.parser.TokenType;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import com.opencsv.CSVReader;
import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class Celeste {
   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Planeta tierra = new Planeta(1.0, 0.017, 365.26);
        Planeta test = new Planeta(0.865, 0.07, 233.5496);
             
        CSVReader reader = new CSVReader(new FileReader("planetas.csv"));
        ArrayList<String[]> planetas = new ArrayList();
        planetas = (ArrayList<String[]>) reader.readAll();
        XYSeriesCollection coleccion = new XYSeriesCollection();
        for (int i = 0 ; i< planetas.size() ; i++){
            String name = planetas.get(i)[0];
            double a = Double.parseDouble(planetas.get(i)[1]);
            double epsilon = Double.parseDouble(planetas.get(i)[2]);
            double p = Double.parseDouble(planetas.get(i)[3]);
            Planeta planeta = new Planeta (a,epsilon,p);
            XYSeries serie = planeta.generarPosiciones();
            serie.setKey(name);
            coleccion.addSeries(serie);
        }
       
        JFreeChart grafica;
        
        
        grafica = ChartFactory.createXYLineChart("", "", "", coleccion,PlotOrientation.HORIZONTAL,true, true, false);
        ChartPanel Panel = new ChartPanel(grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
