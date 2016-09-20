import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

class Person {
	static Image personLeft = null;
	static Image personRight = null;
	//static Image feathers = null;
	int leftCounter, rightCounter;
	int x, y, width, height;
	boolean collision, leftDirection;
	double gravity;
	int gravityCounter;
	
	
	Person()throws IOException{
		x = 0;
		y = 700;
		width = 44;
		height = 64;
		personLeft = ImageIO.read(new File("personLeft.png"));
		personRight = ImageIO.read(new File("personRight.png"));
	}
	
	public void update() {
		leftCounter -= 1;
		rightCounter -= 1;
		if (collision == false){
			gravity += 1.6;
			gravityCounter -= 1;
			y += gravity;
		}
		else{
			gravity = 0;
		}
	}
	
	
	void draw(Graphics g){
		if(leftDirection){
			if (leftCounter < 2){
				g.drawImage(personLeft, x, y, null);
			}
			//else if (leftCounter >= 2){
			//	g.drawImage(personLeftWalking, x, y, null);
			//}
		}
		else{
			if (rightCounter < 2){
				g.drawImage(personRight, x, y, null);
			}
			//else if (leftCounter >= 2){
			//	g.drawImage(personLeftWalking, x, y, null);
			//}
		}
		
	}
	
	public void walkLeft() {
		//if (leftCounter < -5)
		//	leftCounter = 8;
		x = x - 9;
		leftDirection = true;
	}
	public void walkRight() {
		//if (rightCounter < -5)
		//	rightCounter = 8;
		x = x + 9;
		leftDirection = false;
	}
	public void jump(){
		if (collision){
			gravity = 0;
			gravity -= 75;
			y += gravity;
			gravityCounter = 8;
		}
		else{
			//do nothing -- fall
		}
	}
}
	