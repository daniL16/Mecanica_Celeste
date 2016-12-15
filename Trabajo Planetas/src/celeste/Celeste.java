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
import java.awt.geom.Ellipse2D;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
/**
 *
 * @author dani
 */
public class Celeste {

    private static ArrayList<String[]> planetas;
    private ArrayList<Planeta> planetas_obj = new ArrayList();

    public Celeste() throws FileNotFoundException, IOException {
        //obtenemos los datos del csv
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
        
        generarGrafica(coleccion,false);
    }
    
    public void pintarPlaneta(int n_plat,double t) {
        XYSeriesCollection coleccion = new XYSeriesCollection();
        
        String name = planetas.get(n_plat)[0];
        double a = Double.parseDouble(planetas.get(n_plat)[1]);
        double epsilon = Double.parseDouble(planetas.get(n_plat)[2]);
        double p = Double.parseDouble(planetas.get(n_plat)[3]);
        Planeta planeta = new Planeta(a, epsilon, p);
        
        XYSeries serie = planeta.generarPosiciones();
        XYSeries serie2 = new XYSeries("posicion",false);
        
        serie.setKey(name);
        serie2.add(planeta.posicion(t).getX1(), planeta.posicion(t).getX2());
        
        coleccion.addSeries(serie);
        coleccion.addSeries(serie2);
      
        generarGrafica(coleccion,true);
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
        generarGrafica(coleccion,false);
    }
    
    public void todasPosiciones(double t){
        XYSeriesCollection coleccion = new XYSeriesCollection();
        
        for (int i = 0; i < planetas.size(); i++) {
            String name = planetas.get(i)[0];
            double a = Double.parseDouble(planetas.get(i)[1]);
            double epsilon = Double.parseDouble(planetas.get(i)[2]);
            double p = Double.parseDouble(planetas.get(i)[3]);
            Planeta planeta = new Planeta(a, epsilon, p);
            
            XYSeries serie2 = planeta.generarPosiciones();
            serie2.setKey(name);
            
            Vector pos = planeta.posicion(t);
            
            XYSeries serie = new XYSeries(name+" en t");
            serie.add(pos.getX1(),pos.getX2());
            coleccion.addSeries(serie2);
            coleccion.addSeries(serie);
        }
        generarGrafica(coleccion,true);
    }
    
    public void generarGrafica(XYSeriesCollection coleccion,boolean shapes) {
        JFreeChart grafica;

        grafica = ChartFactory.createXYLineChart("", "", "", coleccion, PlotOrientation.HORIZONTAL, true, true, false);
        // configuracion de la grafica
        XYPlot xyplot = (XYPlot) grafica.getPlot();
        XYLineAndShapeRenderer xylineandshaperenderer = (XYLineAndShapeRenderer) xyplot.getRenderer();
        int n = coleccion.getSeriesCount();
        for (int l = 1 ; l < n; l=l+2){
            xylineandshaperenderer.setSeriesShape(l, new Ellipse2D.Double(-3+l, -3+l, 15, 15));
            xylineandshaperenderer.setSeriesShapesVisible(l, shapes);
        }
        
        //generacion ventana grafica
        ChartPanel Panel = new ChartPanel(grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public  ArrayList<Planeta> getPlanetas() {
        if (planetas_obj.isEmpty()){
            for (int i = 0; i < planetas.size(); i++) {
                String name = planetas.get(i)[0];
                double a = Double.parseDouble(planetas.get(i)[1]);
                double epsilon = Double.parseDouble(planetas.get(i)[2]);
                double p = Double.parseDouble(planetas.get(i)[3]);
                 
                planetas_obj.add(new Planeta(a, epsilon, p));
        }
        
    }
    
    return planetas_obj;
   
}
    
    
};

