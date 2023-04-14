package Extra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class marioPixel {
	static int width = 760;
    static int height = 640;
    
    static Color red = new Color(255,0,0);
    static Color skin = new Color(255,200,158);
    static Color blue = new Color(0,38,255);
    static Color brown = new Color(127,51,0);
    static Color yellow = new Color(255,216,0);
    
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
        
    	drawHorizontalLine(9,10,3,skin);
    	drawHorizontalLine(8,10,4,skin);
    	drawHorizontalLine(9,11,5,skin);
    	drawHorizontalLine(7,10,6,skin);
    	drawHorizontalLine(7,13,7,skin);
    	drawHorizontalLine(1,3,8,skin);
    	drawHorizontalLine(1,3,9,skin);
    	drawVerticalLine(3,4,11,Color.black);
    	putPixel(12,5,Color.black);
    	drawHorizontalLine(11,14,6,Color.black);
    	drawHorizontalLine(12,14,4,skin);
    	drawHorizontalLine(13,15,5,skin);
    	putPixel(2,10,skin);
    	drawHorizontalLine(14,16,1,skin);
    	drawHorizontalLine(15,16,2,skin);
    	drawVerticalLine(4,5,6,skin);
    	
    	drawHorizontalLine(7,11,1,red);
    	drawHorizontalLine(6,14,2,red);
    	drawHorizontalLine(14,16,3,red);
    	drawHorizontalLine(15,16,4,red);
    	putPixel(16,5,red);
    	drawHorizontalLine(4,7,8,red);
    	drawHorizontalLine(9,11,8,red);
    	drawHorizontalLine(13,14,8,red);
    	drawHorizontalLine(14,15,7,red);
    	putPixel(15,6,red);
    	putPixel(8,8,blue);
    	putPixel(12,8,blue);
    	drawHorizontalLine(4,12,9,red);
    	drawHorizontalLine(6,8,10,red);
    	putPixel(9,9,blue);
    	
    	putPixel(13,9,blue);
    	fillRect(9, 10, 7, 3, blue);
    	fillRect(7, 11, 6, 3, blue);
    	fillRect(5, 12, 2, 2, brown);
    	fillRect(4, 13, 2, 2, brown);
    	drawVerticalLine(9,12,16,brown);
    	drawVerticalLine(8,12,17,brown);
    	
    	drawHorizontalLine(6,8,3,brown);
    	putPixel(7,4,brown);
    	drawHorizontalLine(7,8,5,brown);
    	drawVerticalLine(4,6,5,brown);
    	putPixel(6,6,brown);
    	putPixel(10,11,yellow);
    	putPixel(13,10,yellow);
        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("itsa_me_mario_art.jpg"));
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