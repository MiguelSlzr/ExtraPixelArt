package Extra;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class totoroPixel {
	static int width = 2450;
    static int height = 3200;
    
    static Color gris1 = new Color(161,162,144);
    static Color gris2 = new Color(83,83,73);
    static Color gris3 = new Color(126,124,109);
    static Color gris4 = new Color(226,220,186);
    static Color gris5 = new Color(98,98,86);
    static Color gris6 = new Color(51,51,44);
    static Color gris7 = new Color(50,60,58);
    static Color verdeClaro = new Color(94,130,86);
    static Color verdeOscuro = new Color(75,110,68);
    static Color azulFondo = new Color(56,103,145);
    
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
    	drawBackground(PIXEL_SIZE, azulFondo);  
    	
    	fillRect(0, 49, 49, 15, azulFondo);
        
    	drawVerticalLine(3,7,16,gris2);
    	drawVerticalLine(3,8,17,gris2);
    	drawVerticalLine(4,10,18,gris2);
    	drawVerticalLine(5,10,19,gris2);
    	drawVerticalLine(5,10,31,gris2);
    	drawVerticalLine(4,10,32,gris2);
    	drawVerticalLine(3,8,33,gris2);    	
    	drawVerticalLine(3,7,34,gris2); 
    	
    	drawHorizontalLine(17,32,11,gris2);
    	drawHorizontalLine(15,34,12,gris2);
    	drawHorizontalLine(14,35,13,gris2);
    	drawHorizontalLine(13,36,14,gris2);
    	drawHorizontalLine(13,36,15,gris2);
    	drawHorizontalLine(12,37,16,gris2);
    	drawHorizontalLine(11,38,17,gris2);
    	drawHorizontalLine(11,38,18,gris2);
    	drawHorizontalLine(11,38,19,gris2);
    	drawHorizontalLine(10,39,20,gris2);
    	drawHorizontalLine(10,39,21,gris2);
    	drawHorizontalLine(10,39,22,gris2);
    	drawHorizontalLine(10,39,23,gris2);
    	drawHorizontalLine(9,40,24,gris2);
    	drawHorizontalLine(9,40,25,gris2);
    	drawHorizontalLine(8,41,26,gris2);
    	drawHorizontalLine(8,41,27,gris2);
    	drawHorizontalLine(7,42,28,gris2);
    	drawHorizontalLine(7,42,29,gris2);
    	drawHorizontalLine(6,43,30,gris2);
    	drawHorizontalLine(6,43,31,gris2);
    	drawHorizontalLine(6,43,32,gris2);
    	drawHorizontalLine(5,44,33,gris2);
    	drawHorizontalLine(5,44,34,gris2);
    	drawHorizontalLine(4,45,35,gris2);
    	drawHorizontalLine(4,45,36,gris2);
    	drawHorizontalLine(3,46,37,gris2);
    	drawHorizontalLine(3,46,38,gris2);
    	drawHorizontalLine(3,46,39,gris2);
    	drawHorizontalLine(3,46,40,gris2);
    	drawHorizontalLine(2,47,41,gris2);
    	drawHorizontalLine(2,47,42,gris2);
    	drawHorizontalLine(2,47,43,gris2);
    	drawHorizontalLine(2,47,44,gris2);
    	drawHorizontalLine(2,47,45,gris2);
    	drawHorizontalLine(2,47,46,gris2);
    	drawHorizontalLine(2,47,47,gris2);
    	drawHorizontalLine(2,47,48,gris2);
    	drawHorizontalLine(2,47,49,gris2);
    	drawHorizontalLine(2,47,50,gris2);
    	drawHorizontalLine(3,46,51,gris2);
    	drawHorizontalLine(3,46,52,gris2);
    	drawHorizontalLine(6,43,53,gris2);
    	drawHorizontalLine(6,43,54,gris2);
    	drawHorizontalLine(6,43,55,gris2);
    	drawHorizontalLine(6,43,56,gris2);
    	drawHorizontalLine(7,42,57,gris2);
    	drawHorizontalLine(7,42,58,gris2);
    	drawHorizontalLine(8,41,59,gris2);
    	drawHorizontalLine(9,40,60,gris2);
    	drawHorizontalLine(10,39,61,gris2);
    	drawHorizontalLine(11,38,62,gris2);
    	drawHorizontalLine(8,41,63,gris2);
    	
    	drawHorizontalLine(8,9,27,gris1);
    	drawHorizontalLine(7,11,28,gris1);
    	drawHorizontalLine(7,13,29,gris1);
    	drawHorizontalLine(6,14,30,gris1);
    	drawHorizontalLine(6,14,31,gris1);
    	drawHorizontalLine(6,12,32,gris1);
    	drawHorizontalLine(5,11,33,gris1);
    	drawHorizontalLine(5,10,34,gris1);
    	drawHorizontalLine(4,10,35,gris1);
    	drawHorizontalLine(4,9,36,gris1);
    	drawHorizontalLine(3,8,37,gris1);
    	drawHorizontalLine(3,8,38,gris1);
    	drawHorizontalLine(3,7,39,gris1);
    	drawHorizontalLine(3,7,40,gris1);
    	drawHorizontalLine(2,7,41,gris1);
    	drawHorizontalLine(2,6,42,gris1);
    	drawHorizontalLine(2,6,43,gris1);
    	drawHorizontalLine(2,6,44,gris1);
    	drawHorizontalLine(2,6,45,gris1);
    	drawHorizontalLine(2,6,46,gris1);
    	drawHorizontalLine(2,6,47,gris1);
    	drawHorizontalLine(2,6,48,gris1);
    	drawHorizontalLine(2,6,49,gris1);
    	drawHorizontalLine(2,7,50,gris1);
    	drawHorizontalLine(3,7,51,gris1);
    	drawHorizontalLine(3,7,52,gris1);
    	drawHorizontalLine(6,8,53,gris1);
    	drawHorizontalLine(6,8,54,gris1);
    	drawHorizontalLine(6,9,55,gris1);
    	drawHorizontalLine(6,10,56,gris1);
    	drawHorizontalLine(7,10,57,gris1);
    	drawHorizontalLine(7,11,58,gris1);
    	drawHorizontalLine(8,12,59,gris1);
    	drawHorizontalLine(9,14,60,gris1);
    	drawHorizontalLine(10,15,61,gris1);
    	drawHorizontalLine(11,17,62,gris1);
    	drawHorizontalLine(8,20,63,gris1);
    	
    	drawHorizontalLine(15,16,31,gris4);
    	drawHorizontalLine(13,17,32,gris4);
    	drawHorizontalLine(12,18,33,gris4);
    	drawHorizontalLine(11,19,34,gris4);
    	drawHorizontalLine(11,20,35,gris4);
    	drawHorizontalLine(10,21,36,gris4);
    	drawHorizontalLine(9,22,37,gris4);
    	drawHorizontalLine(9,23,38,gris4);
    	drawHorizontalLine(8,23,39,gris4);
    	drawHorizontalLine(8,24,40,gris4);
    	drawHorizontalLine(8,24,41,gris4);
    	drawHorizontalLine(7,25,42,gris4);
    	drawHorizontalLine(7,25,43,gris4);
    	drawHorizontalLine(7,26,44,gris4);
    	drawHorizontalLine(7,26,45,gris4);
    	drawHorizontalLine(7,26,46,gris4);
    	drawHorizontalLine(7,27,47,gris4);
    	drawHorizontalLine(7,27,48,gris4);
    	drawHorizontalLine(7,27,49,gris4);
    	drawHorizontalLine(8,28,50,gris4);
    	drawHorizontalLine(8,28,51,gris4);
    	drawHorizontalLine(8,28,52,gris4);
    	drawHorizontalLine(9,28,53,gris4);
    	drawHorizontalLine(9,28,54,gris4);
    	drawHorizontalLine(10,28,55,gris4);
    	drawHorizontalLine(11,28,56,gris4);
    	drawHorizontalLine(11,28,57,gris4);
    	drawHorizontalLine(12,27,58,gris4);
    	drawHorizontalLine(13,26,59,gris4);
    	drawHorizontalLine(15,26,60,gris4);
    	drawHorizontalLine(16,25,61,gris4);
    	drawHorizontalLine(18,24,62,gris4);
    	
    	drawHorizontalLine(21,28,28,gris3);
    	drawHorizontalLine(18,31,29,gris3);
    	drawHorizontalLine(15,33,30,gris3);
    	drawHorizontalLine(17,35,31,gris3);
    	drawHorizontalLine(18,36,32,gris3);
    	drawHorizontalLine(19,37,33,gris3);
    	drawHorizontalLine(20,38,34,gris3);
    	drawHorizontalLine(21,38,35,gris3);
    	drawHorizontalLine(22,39,36,gris3);
    	drawHorizontalLine(23,40,37,gris3);
    	drawHorizontalLine(24,40,38,gris3);
    	drawHorizontalLine(24,41,39,gris3);
    	drawHorizontalLine(25,41,40,gris3);
    	drawHorizontalLine(25,41,41,gris3);
    	drawHorizontalLine(26,42,42,gris3);
    	drawHorizontalLine(26,42,43,gris3);
    	drawHorizontalLine(27,42,44,gris3);
    	drawHorizontalLine(27,42,45,gris3);
    	drawHorizontalLine(27,42,46,gris3);
    	drawHorizontalLine(28,42,47,gris3);
    	drawHorizontalLine(28,42,48,gris3);
    	drawHorizontalLine(28,42,49,gris3);
    	drawHorizontalLine(29,41,50,gris3);
    	drawHorizontalLine(29,41,51,gris3);
    	drawHorizontalLine(29,41,52,gris3);
    	drawHorizontalLine(29,40,53,gris3);
    	drawHorizontalLine(29,40,54,gris3);
    	drawHorizontalLine(29,39,55,gris3);
    	drawHorizontalLine(29,38,56,gris3);
    	drawHorizontalLine(29,38,57,gris3);
    	drawHorizontalLine(28,37,58,gris3);
    	drawHorizontalLine(27,36,59,gris3);
    	drawHorizontalLine(27,34,60,gris3);
    	drawHorizontalLine(26,33,61,gris3);
    	drawHorizontalLine(25,31,62,gris3);
    	drawHorizontalLine(21,28,63,gris3);
    	
    	fillRect(12,38,5,3,gris1);
    	drawHorizontalLine(13,15,37,gris1);
    	drawHorizontalLine(13,15,40,gris4);
    	putPixel(14,39,gris4);
    	
    	fillRect(19,38,5,3,gris1);
    	drawHorizontalLine(20,22,37,gris1);
    	drawHorizontalLine(20,22,40,gris4);
    	putPixel(21,39,gris4);
    	
    	fillRect(26,38,5,3,gris2);
    	drawHorizontalLine(27,29,37,gris2);
    	drawHorizontalLine(27,29,40,gris3);
    	putPixel(28,39,gris3);
    	
    	fillRect(33,38,5,3,gris2);
    	drawHorizontalLine(34,36,37,gris2);
    	drawHorizontalLine(34,36,40,gris3);
    	putPixel(35,39,gris3);
    	
    	fillRect(16,33,5,3,gris1);
    	drawHorizontalLine(17,19,32,gris1);
    	drawHorizontalLine(17,19,35,gris4);
    	putPixel(18,34,gris4);
    	drawHorizontalLine(18,19,32,gris2);
    	drawHorizontalLine(19,20,33,gris2);
    	putPixel(20,34,gris2);
    	
    	fillRect(23,33,5,3,gris2);
    	drawHorizontalLine(24,26,32,gris2);
    	drawHorizontalLine(24,26,35,gris3);
    	putPixel(25,34,gris3);
    	
    	fillRect(30,33,5,3,gris2);
    	drawHorizontalLine(31,33,32,gris2);
    	drawHorizontalLine(31,33,35,gris3);
    	putPixel(32,34,gris3);
    	
    	drawVerticalLine(40,48,5,gris5);
    	drawVerticalLine(37,40,6,gris5);
    	drawVerticalLine(36,37,7,gris5);
    	drawVerticalLine(34,36,8,gris5);
    	drawVerticalLine(33,34,9,gris5);
    	
    	drawVerticalLine(40,48,44,gris6);
    	drawVerticalLine(37,40,43,gris6);
    	drawVerticalLine(36,37,42,gris6);
    	drawVerticalLine(34,36,41,gris6);
    	drawVerticalLine(33,34,40,gris6);
    	
    	fillRect(16,15,3,5,Color.white);
    	fillRect(15,16,5,3,Color.white);
    	fillRect(17,16,2,2,Color.black);
    	
    	fillRect(31,15,3,5,Color.white);
    	fillRect(30,16,5,3,Color.white);
    	fillRect(31,16,2,2,Color.black);
    	
    	fillRect(23,18,4,2,gris7);
    	
    	fillRect(22,9,5,4,verdeClaro);
    	fillRect(21,10,9,2,verdeClaro);
    	fillRect(24,9,3,6,verdeClaro);
    	fillRect(23,11,6,3,verdeClaro);
    	drawVerticalLine(7,9,24,verdeClaro);
    	putPixel(25,6,verdeClaro);
    	
    	putPixel(28,13,verdeOscuro);
    	drawHorizontalLine(27,28,12,verdeOscuro);
    	drawHorizontalLine(25,26,11,verdeOscuro);
    	
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("totoro.jpg"));
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