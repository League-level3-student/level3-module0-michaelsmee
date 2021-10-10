package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		
	
        // 2. create an array of 5 robots.
Robot[] robot = new Robot[6];
        // 3. use a for loop to initialize the robots.
	for(int i=0;i<robot.length; i++) {
		robot[i] = new Robot();
		robot[i].setSpeed(20);
	}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    for(int i=0; i<robot.length; i++) {	
		robot[i].setX(50+(100*i));
    	robot[i].setY(450);
    	
    }
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    Random rand = new Random();
    for(int i=0; i<robot.length; i++) {
    	robot[i].move(rand.nextInt(50));
    }
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    boolean isFinished = false;
    while(!isFinished) {
    	for(int i=0; i<robot.length; i++) {
    		int score = i+1;
    		robot[i].move(rand.nextInt(50));
    		if(robot[i].getY()<0) {
    			isFinished = true;
    			System.out.println("The winner is robot " + score);
    		}
    	}
    }
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
	}
}
