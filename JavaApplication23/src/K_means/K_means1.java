/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_means;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Angel Ricardo Lopez Jimenez 
 * @author Caroline Araceli Albarrán Barragán 
 */
public class K_means1 {
  
    public  ArrayList<Integer> X = new ArrayList<Integer>();
    public  ArrayList<Integer> Y = new ArrayList<Integer>();
    public  ArrayList<Integer> claseX = new ArrayList<Integer>();
    public  ArrayList<Integer> claseY = new ArrayList<Integer>();
    public  ArrayList<Integer> color = new ArrayList<Integer>();

    int centro = 0;
    int centroY = 0;
    int centroX = 0;
    private Object jTextField1;
    private Object JTextField2;
    
    public void colores(Graphics g ,ArrayList<Integer> X,ArrayList<Integer> Y,ArrayList<Integer> color){
        this.X = X;
        this.Y = Y;
        this.color = color;
        //this.g = g;
        int punto;
        for(int i=1; i<X.size(); i++){
                punto=color.get(i);
                switch(punto){
                    case 1:
                    g.setColor(Color.BLACK);
                    g.drawLine(X.get(i)-5,Y.get(i),X.get(i)+5,Y.get(i));
                    g.drawLine(X.get(i),Y.get(i)-5,X.get(i),Y.get(i)+5);
                    break;
                    case 2:
                    g.setColor(Color.RED);
                    g.drawLine(X.get(i)-5,Y.get(i),X.get(i)+5,Y.get(i));
                    g.drawLine(X.get(i),Y.get(i)-5,X.get(i),Y.get(i)+5);
                    break;
                    case 3:
                    g.setColor(Color.ORANGE);
                    g.drawLine(X.get(i)-5,Y.get(i),X.get(i)+5,Y.get(i));
                    g.drawLine(X.get(i),Y.get(i)-5,X.get(i),Y.get(i)+5);
                    break;
                   
                }
            }
        
    }
    
}
