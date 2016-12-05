/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeste;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class Celeste {

    private static ArrayList<String[]> planetas;

    public Celeste() throws FileNotFoundException, IOException {
        this.planetas = new ArrayList();
         CSVReader reader = new CSVReader(new FileReader("planetas.csv"));
         planetas = (ArrayList<String[]>) reader.readAll();
    }

    public void pintarTrayectoriaPlaneta(int n_plat) {
        XYSeriesCollection coleccion = new XYSeriesCollection();
        String name = planetas.get(n_plat)[0];
        double a = Double.parseDouble(planetas.get(n_plat)[1]);
        double epsilon = Double.parseDouble(planetas.get(n_plat)[2]);
        double p = Double.parseDouble(planetas.get(n_plat)[3]);
        Planeta planeta = new Planeta(a, epsilon, p);
        XYSeries serie = planeta.generarPosiciones();
        serie.setKey(name);
        coleccion.addSeries(serie);
        generarGrafica(coleccion);
    }
    
     public void pintarPlaneta(int n_plat,double t) {
        XYSeriesCollection coleccion = new XYSeriesCollection();
        String name = planetas.get(n_plat)[0];
        double a = Double.parseDouble(planetas.get(n_plat)[1]);
        double epsilon = Double.parseDouble(planetas.get(n_plat)[2]);
        double p = Double.parseDouble(planetas.get(n_plat)[3]);
        Planeta planeta = new Planeta(a, epsilon, p);
        XYSeries serie = planeta.generarPosiciones();
        XYSeries serie2 = new XYSeries("posicion");
        serie.setKey(name);
        serie.add(planeta.posicion(t).getX1(), planeta.posicion(t).getX2());
        coleccion.addSeries(serie);
        coleccion.addSeries(serie2);
      
        generarGrafica(coleccion);
    }

    public void pintarTodosTrayectorias() {
        XYSeriesCollection coleccion = new XYSeriesCollection();
        for (int i = 0; i < planetas.size(); i++) {
            String name = planetas.get(i)[0];
            double a = Double.parseDouble(planetas.get(i)[1]);
            double epsilon = Double.parseDouble(planetas.get(i)[2]);
            double p = Double.parseDouble(planetas.get(i)[3]);
            Planeta planeta = new Planeta(a, epsilon, p);
            XYSeries serie = planeta.generarPosiciones();
            serie.setKey(name);
            coleccion.addSeries(serie);
        }
        generarGrafica(coleccion);
    }

    public void generarGrafica(XYSeriesCollection coleccion) {
        JFreeChart grafica;

        grafica = ChartFactory.createXYLineChart("", "", "", coleccion, PlotOrientation.HORIZONTAL, true, true, false);
        ChartPanel Panel = new ChartPanel(grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

      

    }
}
