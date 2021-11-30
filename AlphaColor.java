/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s791187
 */
public class AlphaColor extends Color {
    private int alpha;
    
    public AlphaColor(int r, int g, int b, int a){
        super(r,g,b);
        alpha = a;
    }
    
    public AlphaColor(double c, double m, double y, double k, int a){
        super(conversion(k, c), conversion(k, m), conversion(k, y));
        alpha = a;
    }
    
    public static int conversion(double b, double c){
        double w = 1 - b;
        return (int) Math.round(255 * w * (1-c));
    }
    
    public void dissolve(){
        if(alpha < 255){
            alpha++;
            if(getRed() < 255){
                setRed(getRed() + 1);
            }
            if(getGreen() < 255){
                setGreen(getGreen() + 1);
            }
            if(getBlue() < 255){
                setBlue(getBlue() + 1);
            }
        }
    }
    
    public void precipitate(){
        if(alpha > 0){
            alpha--;
            if(getRed() > 0){
                setRed(getRed() - 1);
            }
            if(getGreen() > 0){
                setGreen(getGreen() - 1);
            }
            if(getBlue() > 0){
                setBlue(getBlue() - 1);
            }
        }
    }
    
    @Override
    public String toString(){
        String d = "";
        if(alpha >= 0 && alpha <= 100){
            d = "transparent";
        }
        else if(alpha >= 101 && alpha <= 200){
            d = "translucent";
        }
        else {
            d = "opaque";
        }
        return super.toString() + String.format("(%s:%d)", d, alpha);
    }
    
    
    
    
    public static void main(String[] args){
        
        Color c = new Color(255,0,0);
        System.out.println(c);
        
        c.setBlue(255);
        c.setGreen(255);
        System.out.println(c);
        
        AlphaColor green = new AlphaColor(0, 255, 0, 255);
        System.out.println(green);
        
        green.precipitate();
        System.out.println(green);
        green.dissolve();
        System.out.println(green);
        
        AlphaColor magenta = new AlphaColor(0.0,1.0,0.0,0.0,0);
        System.out.println(magenta);
        
        AlphaColor orange = new AlphaColor(0.0, 0.4392156862745098,1.0,0.0,200);
        System.out.println(orange);

        
    }
    
}
