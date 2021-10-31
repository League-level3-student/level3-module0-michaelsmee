package _02_Firework_Display;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * 
 * You can think of a fire work as an array of sparks. Run the demo jar to see the finished product
 * then complete the steps. 
 *
 */

public class Firework{
	int x = FireworkDisplay.WIDTH/2;
	int y = FireworkDisplay.HEIGHT;
    public static final int GRAVITY = 1;

    // 1. Create an array of Spark objects called sparks. Don't initialize it.
    Spark[] spark;
    public boolean dead = false;

    public Firework() {
        // 2. Initialize the Spark array to contain 100 Sparks. 
    	spark = new Spark[100];
    	
        // 3. Iterate through the sparks and initialize each one to a new Spark.
        //    Make each spark start at the middle bottom of the screen.
    	
    	for(int i=0; i<spark.length; i++) {
    		spark[i] = new Spark(x, y);
    	}
    }

    public void launch() {
        // 4. Iterate through the sparks and reset their x and y location
        //    to their original starting point.
    	for(int i = 0; i<spark.length; i++) {
    		spark[i] = new Spark(x, y);
    	}
    }

    public void updateSparks() {
        // 8. Uncomment this code. See if you can understand what it is doing.

        for(int i = 0; i < spark.length; i++) {
         
             Spark s = spark[i];
             s.x += s.xVelocity;
             s.y += s.yVelocity;
             s.yVelocity += GRAVITY;
         
             if(s.yVelocity >= 0 && !s.fire) {
                 Random r = new Random();
                 s.xVelocity = r.nextInt(40) - 20;
                 s.yVelocity += -r.nextInt(10) - 5;
                 s.size = r.nextInt(7) + 2;
                 s.fire = true;
             }
        
             if(s.y >= FireworkDisplay.HEIGHT) {
                 s.dead = true;
             }
         }
         
         for(int i = 0; i < spark.length; i++) {
             if(!spark[i].dead) {
                 dead = false;
                 break;
             }
             dead = true;
         }
    }

    public void drawSparks(Graphics g) {
        // 5. Iterate through each spark
    	for(int i = 0; i<spark.length; i++) {
    		g.setColor(Color.cyan);
    		g.fillOval(spark[i].x, spark[i].y, spark[i].size, spark[i].size);
    	}
        // 6. Set the color to the spark's color with g.setColor()
        // 7. Fill in an oval using the spark's x, y, and size with g.fillOval()
    }
}
