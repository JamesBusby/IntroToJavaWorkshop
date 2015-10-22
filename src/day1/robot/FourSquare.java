package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
Robot jim = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
jim.setSpeed(10);
		// 5. Set the pen width to 5
jim.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...

	

			// 7. Set the pen color to random
	jim.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
jim.turn(90);
}
	

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 200; i++) {
			
jim.penDown();
jim.move(100);
jim.turn(100);
		}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
