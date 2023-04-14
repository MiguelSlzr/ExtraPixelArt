package Extra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class batmanPixel {

	static int width = 1400;
    static int height = 1000;
    
    static Color yellow = new Color(238,243,12);
    
    
    static Graphics2D g;
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    private final static int PIXEL_SIZE = 40;
    /*private final static Color[][] PIXELS = {
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
    };
    */
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);     
        
        drawHorizontalLine(12,22,2,Color.black);
        drawHorizontalLine(9,11,3,Color.black);
        drawHorizontalLine(7,8,4,Color.black);
        drawHorizontalLine(5,7,5,Color.black);
        drawHorizontalLine(4,5,6,Color.black);
        drawHorizontalLine(3,4,7,Color.black);
        drawVerticalLine(7,9,3,Color.black);
        drawVerticalLine(9,15,2,Color.black);
        drawVerticalLine(15,17,3,Color.black);
        drawVerticalLine(17,18,4,Color.black);
        drawVerticalLine(18,19,5,Color.black);
        drawHorizontalLine(5,7,19,Color.black);
        drawHorizontalLine(7,9,20,Color.black);
        drawHorizontalLine(9,13,21,Color.black);
        drawHorizontalLine(12,22,22,Color.black);
        drawHorizontalLine(21,25,21,Color.black);
        drawHorizontalLine(25,27,20,Color.black);
        drawHorizontalLine(27,29,19,Color.black);
        drawHorizontalLine(29,30,18,Color.black);
        drawHorizontalLine(30,31,17,Color.black);
        drawHorizontalLine(31,32,15,Color.black);
        putPixel(31,16,Color.black);
        drawVerticalLine(9,15,32,Color.black);
        drawVerticalLine(7,9,31,Color.black);
        drawVerticalLine(6,7,30,Color.black);
        drawVerticalLine(5,6,29,Color.black);
        drawHorizontalLine(27,28,5,Color.black);
        drawHorizontalLine(25,27,4,Color.black);
        drawHorizontalLine(23,25,3,Color.black);
        
        
        
        fillRect(9, 4, 16, 16, yellow);
        fillRect(8, 5, 19, 15, yellow);
        fillRect(6, 6, 23, 13, yellow);
        fillRect(3, 10, 29, 5, yellow);
        fillRect(4, 8, 27, 9, yellow);
        fillRect(5, 7, 25, 11, yellow);
        
        drawHorizontalLine(12,22,3,yellow);
        drawHorizontalLine(10,24,20,yellow);
        drawHorizontalLine(14,20,21,yellow);
   
        
        drawVerticalLine(4,16,15,Color.black);
        drawVerticalLine(4,16,19,Color.black);
        drawVerticalLine(14,19,17,Color.black);
        drawVerticalLine(14,17,12,Color.black);
        drawVerticalLine(14,17,22,Color.black);
        
        fillRect(4, 10, 27, 5, Color.black);
        fillRect(15, 5, 4, 12, Color.black);
        drawHorizontalLine(16,18,17,Color.black);
        drawHorizontalLine(11,23,15,Color.black);
        drawHorizontalLine(14,20,9,Color.black);
        drawHorizontalLine(5,8,15,Color.black);
        drawHorizontalLine(5,7,16,Color.black);
        drawHorizontalLine(26,29,15,Color.black);
        drawHorizontalLine(27,29,16,Color.black);
        putPixel(7,17,Color.black);
        putPixel(8,18,Color.black);
        putPixel(27,17,Color.black);
        putPixel(26,18,Color.black);
        drawHorizontalLine(9,10,6,Color.black);
        drawHorizontalLine(9,11,5,Color.black);
        drawHorizontalLine(24,25,6,Color.black);
        drawHorizontalLine(23,24,5,Color.black);
        fillRect(7, 7, 4, 8, Color.black);
        fillRect(5, 8, 2, 2, Color.black);
        fillRect(24, 7, 4, 8, Color.black);
        fillRect(28, 8, 2, 2, Color.black);
        
        drawSquareGrid(PIXEL_SIZE, Color.gray);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("batiseñal_art.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		g = image.createGraphics();        
        paint();
	}
	
	private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }

}