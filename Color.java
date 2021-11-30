/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s791187
 */
public class Color {
    private int red;
    private int green;
    private int blue;
    
    public Color() {
        red = 0;
        green = 0;
        blue = 0;
    }
    
    public Color(int r, int g, int b){
        red = r;
        green = g;
        blue = b;
    }
    
    public int getRed(){
        return red;
    }
    
    public void setRed(int r){
        
            this.red = r;
        
    }
    
    public int getGreen(){
        return green;
    }
    
    public void setGreen(int g){
        
            this.green = g;
        
    }
    
    public int getBlue(){
        return blue;
    }
    
    public void setBlue(int b){
       
            this.blue = b;
        
    }
    
    @Override
    public String toString(){
        return String.format("#(%d,%d,%d)", red, green, blue);
    }
    
}
