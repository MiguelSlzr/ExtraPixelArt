package Extra;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class SansPixel {
	
	static int width = 4240;
    static int height = 5920;
    
    static Color blue = new Color(59,163,255);
    static Color gray = new Color(110,110,110);
    static Color pink = new Color(255,171,247);
    
    static Graphics2D g;
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    private final static int PIXEL_SIZE = 80;
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
        
    	drawHorizontalLine(20,31,1,Color.black);
    	drawHorizontalLine(17,34,2,Color.black);
    	drawHorizontalLine(15,36,3,Color.black);
    	drawHorizontalLine(14,37,4,Color.black);
    	drawHorizontalLine(13,38,5,Color.black);
    	drawHorizontalLine(12,39,6,Color.black);
    	drawHorizontalLine(11,40,7,Color.black);
    	drawHorizontalLine(11,40,8,Color.black);
    	drawHorizontalLine(10,41,9,Color.black);
    	drawHorizontalLine(10,41,10,Color.black);
    	drawHorizontalLine(10,41,11,Color.black);
    	drawHorizontalLine(10,41,12,Color.black);
    	drawHorizontalLine(10,41,13,Color.black);
    	drawHorizontalLine(10,41,14,Color.black);
    	drawHorizontalLine(10,41,15,Color.black);
    	drawHorizontalLine(10,41,16,Color.black);
    	drawHorizontalLine(11,40,17,Color.black);
    	drawHorizontalLine(11,40,18,Color.black);
    	drawHorizontalLine(12,39,19,Color.black);
    	drawHorizontalLine(12,39,20,Color.black);
    	drawHorizontalLine(11,40,21,Color.black);
    	drawHorizontalLine(11,40,22,Color.black);
    	drawHorizontalLine(11,40,23,Color.black);
    	drawHorizontalLine(11,40,24,Color.black);
    	drawHorizontalLine(12,39,25,Color.black);
    	drawHorizontalLine(12,43,26,Color.black);
    	drawHorizontalLine(8,44,27,Color.black);
    	drawHorizontalLine(7,45,28,Color.black);
    	drawHorizontalLine(7,44,29,Color.black);
    	drawHorizontalLine(6,45,30,Color.black);
    	drawHorizontalLine(5,45,31,Color.black);
    	drawHorizontalLine(4,46,32,Color.black);
    	drawHorizontalLine(5,47,33,Color.black);
    	drawHorizontalLine(4,48,34,Color.black);
    	drawHorizontalLine(3,48,35,Color.black);
    	drawHorizontalLine(2,49,36,Color.black);
    	drawHorizontalLine(2,50,37,Color.black);
    	drawHorizontalLine(1,50,38,Color.black);
    	drawHorizontalLine(1,50,39,Color.black);
    	drawHorizontalLine(1,51,40,Color.black);
    	drawHorizontalLine(1,51,41,Color.black);
    	drawHorizontalLine(1,51,42,Color.black);
    	drawHorizontalLine(2,51,43,Color.black);
    	drawHorizontalLine(3,50,44,Color.black);
    	drawHorizontalLine(4,49,45,Color.black);
    	drawHorizontalLine(5,48,46,Color.black);
    	drawHorizontalLine(6,47,47,Color.black);
    	drawHorizontalLine(6,46,48,Color.black);
    	drawHorizontalLine(7,43,49,Color.black);
    	drawHorizontalLine(10,41,50,Color.black);
    	drawHorizontalLine(10,41,51,Color.black);
    	drawHorizontalLine(11,41,52,Color.black);
    	drawHorizontalLine(10,41,53,Color.black);
    	drawHorizontalLine(9,42,54,Color.black);
    	drawHorizontalLine(9,42,55,Color.black);
    	drawHorizontalLine(9,42,56,Color.black);
    	drawHorizontalLine(9,42,57,Color.black);
    	drawHorizontalLine(9,43,58,Color.black);
    	drawHorizontalLine(8,43,59,Color.black);
    	drawHorizontalLine(8,43,60,Color.black);
    	drawHorizontalLine(8,43,61,Color.black);
    	drawHorizontalLine(8,43,62,Color.black);
    	drawHorizontalLine(8,43,63,Color.black);
    	drawHorizontalLine(8,43,64,Color.black);
    	drawHorizontalLine(9,42,65,Color.black);
    	drawHorizontalLine(14,38,66,Color.black);
    	drawHorizontalLine(14,38,67,Color.black);
    	drawHorizontalLine(42,44,67,Color.black);
    	drawHorizontalLine(8,11,67,Color.black);
    	drawHorizontalLine(7,46,68,Color.black);
    	drawHorizontalLine(6,47,69,Color.black);
    	drawHorizontalLine(5,48,70,Color.black);
    	drawHorizontalLine(5,48,71,Color.black);
    	drawHorizontalLine(5,47,72,Color.black);
    	drawHorizontalLine(6,46,73,Color.black);
    	
    	drawHorizontalLine(20,31,2,Color.white);
    	drawHorizontalLine(17,34,3,Color.white);
    	drawHorizontalLine(15,36,4,Color.white);
    	drawHorizontalLine(14,37,5,Color.white);
    	drawHorizontalLine(13,38,6,Color.white);
    	drawHorizontalLine(12,39,7,Color.white);
    	drawHorizontalLine(12,39,8,Color.white);
    	drawHorizontalLine(11,40,9,Color.white);
    	drawHorizontalLine(11,40,10,Color.white);
    	drawHorizontalLine(11,40,11,Color.white);
    	drawHorizontalLine(11,40,12,Color.white);
    	drawHorizontalLine(11,40,13,Color.white);
    	drawHorizontalLine(11,40,14,Color.white);
    	drawHorizontalLine(11,40,15,Color.white);
    	drawHorizontalLine(11,40,16,Color.white);
    	drawHorizontalLine(12,39,17,Color.white);
    	drawHorizontalLine(12,39,18,Color.white);
    	drawHorizontalLine(13,38,19,Color.white);
    	drawHorizontalLine(13,38,20,Color.white);
    	drawHorizontalLine(12,39,21,Color.white);
    	drawHorizontalLine(12,39,22,Color.white);
    	drawHorizontalLine(12,39,23,Color.white);
    	drawHorizontalLine(12,39,24,Color.white);
    	drawHorizontalLine(13,38,25,Color.white);
    	drawHorizontalLine(13,38,26,Color.white);
    	drawHorizontalLine(14,37,27,Color.white);
    	drawHorizontalLine(15,36,28,Color.white);
    	drawHorizontalLine(17,34,29,Color.white);
    	drawHorizontalLine(20,31,30,Color.white);
    	
    	drawHorizontalLine(8,13,28,gray);
    	drawHorizontalLine(11,14,29,gray);
    	drawHorizontalLine(13,16,30,gray);
    	drawHorizontalLine(14,19,31,gray);
    	drawHorizontalLine(16,20,32,gray);
    	drawHorizontalLine(17,20,33,gray);
    	
    	drawHorizontalLine(39,42,27,gray);
    	drawHorizontalLine(38,41,28,gray);
    	drawHorizontalLine(37,40,29,gray);
    	drawHorizontalLine(35,39,30,gray);
    	drawHorizontalLine(32,38,31,gray);
    	drawHorizontalLine(30,36,32,gray);
    	drawHorizontalLine(30,34,33,gray);
    	
    	drawHorizontalLine(22,28,32,Color.white);
    	drawHorizontalLine(23,27,32,Color.black);
    	drawHorizontalLine(22,28,33,Color.white);
    	drawHorizontalLine(23,27,34,Color.white);
    	drawHorizontalLine(24,27,35,Color.white);
    	
    	drawHorizontalLine(24,27,38,Color.white);
    	fillRect(24,39,5,9,Color.white);
    	
    	drawHorizontalLine(43,44,28,blue);
    	drawHorizontalLine(42,43,29,blue);
    	drawHorizontalLine(41,44,30,blue);
    	drawHorizontalLine(40,44,31,blue);
    	drawHorizontalLine(39,45,32,blue);
    	drawHorizontalLine(37,46,33,blue);
    	drawHorizontalLine(35,47,34,blue);
    	
    	drawHorizontalLine(34,47,35,blue);
    	drawHorizontalLine(34,48,36,blue);
    	drawHorizontalLine(34,49,37,blue);
    	drawHorizontalLine(34,49,38,blue);
    	drawHorizontalLine(34,49,39,blue);
    	drawHorizontalLine(34,50,40,blue);
    	drawHorizontalLine(34,50,41,blue);
    	drawHorizontalLine(34,50,42,blue);
    	drawHorizontalLine(34,50,43,blue);
    	drawHorizontalLine(35,49,44,blue);
    	drawHorizontalLine(35,48,45,blue);
    	drawHorizontalLine(35,47,46,blue);
    	drawHorizontalLine(34,46,47,blue);
    	drawHorizontalLine(34,39,48,blue);
    	drawHorizontalLine(33,40,49,blue);
    	putPixel(43,48,blue);
    	putPixel(42,49,Color.white);
    	
    	
    	
    	drawHorizontalLine(7,9,30,blue);
    	drawHorizontalLine(6,12,31,blue);
    	drawHorizontalLine(5,13,32,blue);
    	drawHorizontalLine(6,15,33,blue);
    	drawHorizontalLine(5,16,34,blue);
    	drawHorizontalLine(4,16,35,blue);
    	drawHorizontalLine(3,16,36,blue);
    	drawHorizontalLine(3,16,37,blue);
    	drawHorizontalLine(2,16,38,blue);
    	drawHorizontalLine(2,16,39,blue);
    	drawHorizontalLine(2,16,40,blue);
    	drawHorizontalLine(2,17,41,blue);
    	drawHorizontalLine(2,17,42,blue);
    	drawHorizontalLine(3,17,43,blue);
    	drawHorizontalLine(4,17,44,blue);
    	drawHorizontalLine(5,17,45,blue);
    	drawHorizontalLine(7,18,46,blue);
    	drawHorizontalLine(7,18,47,blue);
    	drawHorizontalLine(7,18,48,blue);
    	drawHorizontalLine(11,18,49,blue);
    	drawVerticalLine(45,46,33,blue);
    	
    	drawVerticalLine(42,49,9,Color.black);
    	drawVerticalLine(34,41,10,Color.black);
    	drawVerticalLine(40,41,11,Color.black);
    	putPixel(12,41,Color.black);
    	drawHorizontalLine(13,16,40,Color.black);
    	
    	drawHorizontalLine(35,37,43,Color.black);
    	drawHorizontalLine(37,39,42,Color.black);
    	drawHorizontalLine(39,42,41,Color.black);
    	drawHorizontalLine(40,41,40,Color.black);
    	drawVerticalLine(41,48,42,Color.black);
    	putPixel(41,47,Color.black);
    	drawVerticalLine(34,39,41,Color.black);
    	putPixel(42,33,Color.black);
    	
    	putPixel(11,53,gray);
    	drawVerticalLine(54,58,10,gray);
    	drawVerticalLine(59,64,9,gray);
    	drawHorizontalLine(9,13,64,gray);
    	fillRect(14,53,2,2,gray);
    	fillRect(13,55,2,4,gray);
    	fillRect(12,59,2,5,gray);
    	drawHorizontalLine(14,22,65,gray);
    	drawVerticalLine(61,64,23,gray);
    	drawVerticalLine(56,60,24,gray);
    	putPixel(25,55,gray);
    	drawVerticalLine(56,58,26,gray);
    	drawVerticalLine(59,64,27,gray);
    	drawHorizontalLine(28,38,65,gray);
    	drawHorizontalLine(39,42,64,gray);
    	drawVerticalLine(58,64,42,gray);
    	drawVerticalLine(54,57,41,gray);
    	drawVerticalLine(52,53,40,gray);
    	fillRect(33,52,2,6,gray);
    	fillRect(34,57,2,8,gray);
    	putPixel(36,64,gray);
    	
    	drawVerticalLine(61,64,25,Color.white);
    	drawHorizontalLine(24,26,65,Color.white);
    	drawHorizontalLine(23,27,66,Color.white);
    	drawHorizontalLine(18,30,67,Color.white);
    	drawHorizontalLine(19,30,68,Color.white);
    	drawHorizontalLine(19,29,69,Color.white);
    	drawHorizontalLine(19,29,70,Color.white);
    	drawHorizontalLine(19,29,71,Color.white);
    	putPixel(32,67,Color.white);
    	drawHorizontalLine(32,38,68,Color.white);
    	drawHorizontalLine(31,37,69,Color.white);
    	drawHorizontalLine(31,36,70,Color.white);
    	drawHorizontalLine(30,35,72,pink);
    	drawHorizontalLine(20,28,72,Color.white);
    	drawHorizontalLine(19,29,73,Color.white);
    	drawHorizontalLine(17,18,72,pink);
    	putPixel(16,73,Color.white);
    	putPixel(36,73,Color.white);
    	
    	drawHorizontalLine(8,11,68,pink);
    	drawHorizontalLine(7,13,69,pink);
    	drawHorizontalLine(6,14,70,pink);
    	drawHorizontalLine(6,14,71,pink);
    	drawHorizontalLine(6,15,72,pink);
    	
    	drawHorizontalLine(14,17,68,Color.white);
    	drawHorizontalLine(15,17,69,Color.white);
    	drawHorizontalLine(16,17,70,Color.white);
    	putPixel(16,71,Color.white);
    	
    	
    	drawHorizontalLine(42,44,68,pink);
    	drawHorizontalLine(40,46,69,pink);
    	drawHorizontalLine(38,47,70,pink);
    	drawHorizontalLine(37,47,71,pink);
    	drawHorizontalLine(37,46,72,pink);
    	
    	
    	drawHorizontalLine(37,32,23,Color.black);
    	drawHorizontalLine(18,19,23,Color.black);
    	drawHorizontalLine(16,17,22,Color.black);
    	drawHorizontalLine(14,16,23,Color.black);
    	drawHorizontalLine(20,32,24,Color.black);
    	drawHorizontalLine(33,37,23,Color.black);
    	drawHorizontalLine(35,36,22,Color.black);
    	putPixel(35,21,Color.black);
    	drawHorizontalLine(22,30,28,Color.black);
    	drawHorizontalLine(31,32,27,Color.black);
    	drawHorizontalLine(20,21,27,Color.black);
    	drawHorizontalLine(18,19,26,Color.black);
    	putPixel(17,25,Color.black);
    	drawHorizontalLine(32,33,26,Color.black);
    	drawVerticalLine(21,24,16,Color.black);
    	drawVerticalLine(23,26,18,Color.black);
    	drawVerticalLine(24,27,22,Color.black);
    	drawVerticalLine(24,27,25,Color.black);
    	drawVerticalLine(24,27,29,Color.black);
    	drawVerticalLine(24,26,32,Color.black);
    	drawVerticalLine(24,25,34,Color.black);
    	putPixel(35,24,Color.black);
    	
    	drawVerticalLine(19,21,24,Color.black);
    	drawVerticalLine(17,21,25,Color.black);
    	drawVerticalLine(17,21,26,Color.black);
    	drawVerticalLine(19,21,27,Color.black);
    	putPixel(20,19,Color.black);
    	drawHorizontalLine(18,19,20,Color.black);
    	drawHorizontalLine(16,21,18,Color.black);
    	drawHorizontalLine(14,21,17,Color.black);
    	drawHorizontalLine(13,22,16,Color.black);
    	drawHorizontalLine(13,22,15,Color.black);
    	drawHorizontalLine(13,22,14,Color.black);
    	drawHorizontalLine(14,22,13,Color.black);
    	drawHorizontalLine(16,21,12,Color.black);
    	
    	putPixel(31,19,Color.black);
    	drawHorizontalLine(32,33,20,Color.black);
    	drawHorizontalLine(30,35,18,Color.black);
    	drawHorizontalLine(30,37,17,Color.black);
    	drawHorizontalLine(29,38,16,Color.black);
    	drawHorizontalLine(29,38,15,Color.black);
    	drawHorizontalLine(29,38,14,Color.black);
    	drawHorizontalLine(29,37,13,Color.black);
    	drawHorizontalLine(30,36,12,Color.black);
    	putPixel(30,15,blue);
    	drawVerticalLine(14,16,31,blue);
    	drawVerticalLine(13,17,32,blue);
    	drawVerticalLine(13,17,33,blue);
    	drawVerticalLine(13,17,34,blue);
    	drawVerticalLine(13,16,35,blue);
    	drawVerticalLine(12,15,36,blue);
    	putPixel(33,15,Color.black);
    	drawVerticalLine(11,12,37,blue);
    	drawVerticalLine(11,12,38,blue);
    	drawVerticalLine(10,11,39,blue);
    	drawVerticalLine(9,10,40,blue);
    	putPixel(41,8,blue);
    	drawVerticalLine(6,7,42,blue);
    	putPixel(43,6,blue);
    	putPixel(43,3,blue);
    	drawVerticalLine(3,4,44,blue);
    	
    	putPixel(32,37,gray);
    	putPixel(31,41,gray);
    	drawVerticalLine(40,41,32,gray);
    	fillRect(31,43,2,2,gray);
    	drawVerticalLine(46,48,31,gray);
    	
    	drawVerticalLine(46,48,20,gray);
    	drawVerticalLine(44,45,19,gray);
    	drawVerticalLine(43,44,20,gray);
    	drawVerticalLine(40,42,19,gray);
    	putPixel(20,41,gray);
    	putPixel(18,40,gray);
    	fillRect(18,36,2,3,gray);
    	
        drawSquareGrid(PIXEL_SIZE, Color.gray);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("sans_undertale.jpg"));
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