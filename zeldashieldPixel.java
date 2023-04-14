package Extra;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class zeldashieldPixel {
	static int width = 1850;
    static int height = 2400;
    
    static Color darkGray = new Color(82,82,78);
    static Color lightGray = new Color(163,163,155);
    static Color red = new Color(255,43,43);
    static Color darkBlue = new Color(7,21,107);
    static Color midBlue = new Color(10,29,148);
    static Color lightBlue = new Color(36,65,145);
    static Color yellow = new Color(255,242,56);
    
    static Graphics2D g;
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    private final static int PIXEL_SIZE = 50;
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
        
    	putPixel(18,1,darkGray);
    	drawHorizontalLine(17,19,2,darkGray);
    	drawHorizontalLine(16,20,3,darkGray);
    	drawHorizontalLine(15,21,4,darkGray);
    	drawHorizontalLine(14,22,5,darkGray);
    	drawHorizontalLine(13,23,6,darkGray);
    	drawHorizontalLine(11,25,7,darkGray);
    	drawHorizontalLine(9,27,8,darkGray);
    	fillRect(1, 9, 35, 20, darkGray);
    	drawHorizontalLine(2,34,29,darkGray);
    	drawHorizontalLine(2,34,30,darkGray);
    	drawHorizontalLine(3,33,31,darkGray);
    	drawHorizontalLine(3,33,32,darkGray);
    	fillRect(4, 33, 29, 4, darkGray);
    	drawHorizontalLine(5,31,37,darkGray);
    	drawHorizontalLine(7,29,38,darkGray);
    	drawHorizontalLine(8,28,39,darkGray);
    	drawHorizontalLine(9,27,40,darkGray);
    	drawHorizontalLine(10,26,41,darkGray);
    	drawHorizontalLine(12,24,42,darkGray);
    	drawHorizontalLine(13,23,43,darkGray);
    	drawHorizontalLine(15,21,44,darkGray);
    	drawHorizontalLine(17,19,45,darkGray);
    	putPixel(18,46,darkGray);
    	
    	
    	
    	drawVerticalLine(16,28,2,lightGray);
    	drawVerticalLine(16,28,34,lightGray);
    	drawVerticalLine(28,30,3,lightGray);
    	drawVerticalLine(30,32,4,lightGray);
    	drawVerticalLine(28,30,33,lightGray);
    	drawVerticalLine(30,32,32,lightGray);
    	drawVerticalLine(37,38,8,lightGray);
    	drawVerticalLine(38,39,9,lightGray);
    	drawVerticalLine(39,40,10,lightGray);
    	putPixel(11,40,lightGray);
    	drawVerticalLine(40,41,12,lightGray);
    	drawVerticalLine(41,42,13,lightGray);
    	drawVerticalLine(41,42,14,lightGray);
    	drawVerticalLine(37,38,28,lightGray);
    	drawVerticalLine(38,39,27,lightGray);
    	drawVerticalLine(39,40,26,lightGray);
    	drawVerticalLine(40,41,24,lightGray);
    	putPixel(25,40,lightGray);
    	drawVerticalLine(41,42,23,lightGray);
    	drawVerticalLine(41,42,22,lightGray);
    	fillRect(2, 10, 3, 3, lightGray);
    	fillRect(3, 11, 3, 3, lightGray);
    	fillRect(32, 10, 3, 3, lightGray);
    	fillRect(31, 11, 3, 3, lightGray);
    	fillRect(5, 34, 3, 3, lightGray);
    	fillRect(29, 34, 3, 3, lightGray);
    	fillRect(17, 40, 3, 4, lightGray);
    	putPixel(18,3,lightGray);
    	putPixel(15,43,lightGray);
    	putPixel(21,43,lightGray);
    	drawHorizontalLine(16,20,41,lightGray);
    	putPixel(18,44,lightGray);
    	drawHorizontalLine(17,19,4,lightGray);
    	drawHorizontalLine(15,21,5,lightGray);
    	fillRect(16, 6, 5, 4, lightGray);
    	putPixel(13,7,lightGray);
    	putPixel(23,7,lightGray);
    	drawHorizontalLine(11,14,8,lightGray);
    	drawHorizontalLine(22,25,8,lightGray);
    	drawHorizontalLine(9,11,9,lightGray);
    	drawHorizontalLine(25,27,9,lightGray);
    	drawHorizontalLine(7,9,10,lightGray);
    	drawHorizontalLine(27,29,10,lightGray);
    	
    	drawVerticalLine(16,27,3,darkBlue);
    	drawVerticalLine(16,27,33,darkBlue);
    	drawVerticalLine(27,29,4,darkBlue);
    	drawVerticalLine(27,29,32,darkBlue);
    	drawVerticalLine(29,32,5,darkBlue);
    	drawVerticalLine(29,32,31,darkBlue);
    	drawVerticalLine(32,33,8,darkBlue);
    	drawVerticalLine(32,33,28,darkBlue);
    	drawVerticalLine(33,37,9,darkBlue);
    	drawVerticalLine(33,37,27,darkBlue);
    	drawVerticalLine(37,38,10,darkBlue);
    	drawVerticalLine(37,38,26,darkBlue);
    	drawVerticalLine(38,39,11,darkBlue);
    	drawVerticalLine(38,39,25,darkBlue);
    	drawHorizontalLine(6,7,32,darkBlue);
    	drawHorizontalLine(29,30,32,darkBlue);
    	drawHorizontalLine(15,21,38,darkBlue);
    	drawHorizontalLine(12,15,39,darkBlue);
    	drawHorizontalLine(21,24,39,darkBlue);
    	drawHorizontalLine(12,14,9,darkBlue);
    	drawHorizontalLine(22,24,9,darkBlue);
    	drawHorizontalLine(10,15,10,darkBlue);
    	drawHorizontalLine(21,26,10,darkBlue);
    	drawHorizontalLine(7,29,11,darkBlue);
    	drawVerticalLine(11,14,7,darkBlue);
    	drawVerticalLine(11,14,29,darkBlue);
    	drawVerticalLine(14,15,6,darkBlue);
    	drawVerticalLine(14,15,30,darkBlue);
    	drawHorizontalLine(3,6,15,darkBlue);
    	drawHorizontalLine(30,33,15,darkBlue);
    	drawHorizontalLine(13,14,40,darkBlue);
    	drawHorizontalLine(22,23,40,darkBlue);
    	fillRect(8, 12, 21, 20, midBlue);
    	fillRect(7, 15, 23, 17, midBlue);
    	fillRect(4, 16, 29, 12, midBlue);
    	fillRect(10, 32, 17, 5, midBlue);
    	putPixel(9,32,midBlue);
    	putPixel(27,32,darkBlue);
    	putPixel(5,28,midBlue);
    	putPixel(31,28,midBlue);
    	drawHorizontalLine(11,25,37,midBlue);
    	drawHorizontalLine(12,14,38,midBlue);
    	drawHorizontalLine(22,24,38,midBlue);
    	fillRect(6, 28, 25, 4, midBlue);
    	putPixel(23,10,midBlue);
    	putPixel(13,10,midBlue);
    	putPixel(27,32,midBlue);
    	drawHorizontalLine(11,14,11,midBlue);
    	drawHorizontalLine(22,25,11,midBlue);
    	putPixel(4,27,darkBlue);
    	putPixel(32,27,darkBlue);
    	
    	putPixel(31,27,midBlue);
    	
    	drawHorizontalLine(23,24,12,lightBlue);
    	drawHorizontalLine(12,13,12,lightBlue);
    	fillRect(9, 13, 19, 18, lightBlue);
    	fillRect(6, 17, 25, 11, lightBlue);
    	fillRect(7, 28, 23, 3, lightBlue);
    	fillRect(11, 29, 15, 8, lightBlue);
    	putPixel(18,13,yellow);
    	drawHorizontalLine(17,19,14,yellow);
    	drawHorizontalLine(17,19,15,yellow);
    	drawHorizontalLine(16,20,16,yellow);
    	drawHorizontalLine(15,21,17,yellow);
    	drawHorizontalLine(14,22,18,yellow);
    	drawHorizontalLine(14,22,19,yellow);
    	drawHorizontalLine(13,23,20,yellow);
    	drawHorizontalLine(16,20,17,lightBlue);
    	drawHorizontalLine(17,19,18,lightBlue);
    	drawHorizontalLine(17,19,19,lightBlue);
    	putPixel(18,20,lightBlue);
    	putPixel(10,31,lightBlue);
    	putPixel(26,31,lightBlue);
    	putPixel(13,37,lightBlue);
    	putPixel(23,37,lightBlue);
    	
    	fillRect(6, 23, 25, 4, red);
    	fillRect(10, 27, 17, 4, red);
    	fillRect(8, 28, 21, 1, red);
    	drawHorizontalLine(9,27,27,red);
    	
    	drawHorizontalLine(6,11,23,lightBlue);
    	drawHorizontalLine(13,23,23,lightBlue);
    	drawHorizontalLine(25,30,23,lightBlue);
    	
    	drawHorizontalLine(13,23,24,lightBlue);
    	drawHorizontalLine(13,23,25,lightBlue);
    	drawHorizontalLine(8,10,24,lightBlue);
    	drawHorizontalLine(26,28,24,lightBlue);
    	drawHorizontalLine(6,11,26,lightBlue);
    	drawHorizontalLine(25,30,26,lightBlue);
    	drawHorizontalLine(14,22,26,lightBlue);
    	drawHorizontalLine(14,22,27,lightBlue);
    	putPixel(26,29,lightBlue);
    	putPixel(10,29,lightBlue);
    	drawHorizontalLine(10,11,28,lightBlue);
    	drawHorizontalLine(25,26,28,lightBlue);
    	drawHorizontalLine(12,13,30,lightBlue);
    	drawHorizontalLine(23,24,30,lightBlue);
    	putPixel(13,29,lightBlue);
    	putPixel(23,29,lightBlue);
    	fillRect(16, 28, 5, 3, lightBlue);
    	drawHorizontalLine(15,21,30,lightBlue);
    	
    	drawVerticalLine(24,26,18,red);
    	drawVerticalLine(28,30,18,red);
    	drawVerticalLine(32,34,18,red);
    	drawVerticalLine(25,26,17,red);
    	drawVerticalLine(29,30,17,red);
    	drawVerticalLine(25,26,19,red);
    	drawVerticalLine(29,30,19,red);
    	drawVerticalLine(32,33,20,red);
    	drawVerticalLine(32,33,16,red);
    	putPixel(15,33,red);
    	putPixel(21,33,red);
    	drawHorizontalLine(13,14,31,red);
    	drawHorizontalLine(22,23,31,red);
    	putPixel(13,32,red);
    	putPixel(23,32,red);
    	putPixel(5,13,darkGray);
    	putPixel(31,13,darkGray);
    	
    	drawHorizontalLine(13,14,13,lightGray);
    	drawVerticalLine(14,15,12,lightGray);
    	drawVerticalLine(15,17,7,lightGray);
    	drawHorizontalLine(9,11,18,lightGray);
    	
    	drawHorizontalLine(22,23,13,lightGray);
    	drawVerticalLine(14,15,24,lightGray);
    	drawVerticalLine(15,17,29,lightGray);
    	drawHorizontalLine(25,27,18,lightGray);
    	putPixel(28,14,lightGray);
    	putPixel(21,14,lightGray);
    	putPixel(28,17,lightGray);
    	putPixel(8,17,lightGray);
    	putPixel(8,14,lightGray);
    	putPixel(28,16,lightBlue);
    	putPixel(8,16,lightBlue);
    	
    	drawHorizontalLine(7,8,18,Color.black);
    	drawHorizontalLine(9,10,19,Color.black);
    	putPixel(12,16,Color.black);
    	putPixel(13,17,Color.black);
    	putPixel(12,17,lightGray);
    	putPixel(13,16,lightGray);
    	putPixel(12,18,Color.black);
    	
    	putPixel(24,16,Color.black);
    	putPixel(23,17,Color.black);
    	putPixel(24,17,lightGray);
    	putPixel(23,16,lightGray);
    	putPixel(24,18,Color.black);
    	
    	putPixel(22,14,Color.black);
    	putPixel(24,14,lightGray);
    	putPixel(14,14,Color.black);
    	putPixel(15,14,lightGray);
    	drawHorizontalLine(26,27,19,Color.black);
    	drawHorizontalLine(26,27,19,Color.black);
    	drawHorizontalLine(28,29,18,Color.black);
    	drawHorizontalLine(26,27,19,Color.black);
    	putPixel(3,11,Color.black);
    	putPixel(4,12,Color.black);
    	putPixel(33,11,Color.black);
    	putPixel(32,12,Color.black);
    	putPixel(5,36,Color.black);
    	putPixel(6,35,Color.black);
    	putPixel(7,34,Color.black);
    	drawVerticalLine(41,43,18,Color.black);
    	putPixel(31,36,Color.black);
    	putPixel(30,35,Color.black);
    	putPixel(29,34,Color.black);
    	drawVerticalLine(6,8,18,Color.black);
    	drawVerticalLine(7,8,16,Color.black);
    	drawVerticalLine(6,7,15,Color.black);
    	drawVerticalLine(7,8,20,Color.black);
    	drawVerticalLine(6,7,21,Color.black);
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("HylianShield.jpg"));
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