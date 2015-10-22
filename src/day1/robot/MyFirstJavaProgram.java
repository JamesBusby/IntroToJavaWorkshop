package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	 Robot steve = new Robot("batman");
	
	
	 public static void main(String[] args) {
		 
			for (int i = 0; i < 4; i++) {
	
steve.setRandomPenColor();
 steve.penDown();
 steve.sparkle();
 steve.setSpeed(5);
steve.move(100);
steve.turn(90);

}


}
}