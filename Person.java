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
	boolean collision, leftDirection, jump;
	double gravity;
	int gravityCounter, jumpCounter;
	//Boolean values for Walking
	boolean WalkLeft, WalkRight;
	
	
	Person()throws IOException{
		x = 100;
		y = 700;
		width = 44;
		height = 64;
		personLeft = ImageIO.read(new File("personLeft.png"));
		personRight = ImageIO.read(new File("personRight.png"));
	}
	
	public void update() {
		
		//Image Rendering Frame Counters
		leftCounter -= 1;
		rightCounter -= 1;
		
		//Walking Left or Right based off Boolean Value
		if (WalkLeft){
			x = x - 6;
		}
		if(WalkRight){
			x = x + 6;
		}
		if (gravity >= 25){
			gravity = 25;
		}
		if (collision == false && gravity <= 25){
			gravity += 3.6;
			gravityCounter -= 1;
			y += gravity;
			jump = false;
		}
		else if(jumpCounter <= 0 && gravity <= 25 && jump == true){
			gravity += 77;
			gravityCounter -= 1;
			y+= gravity;
			jumpCounter++;
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
			//else if (gravityCounter >= 2){
			//	g.drawImage(personLeftJump, x, y, null);
			//}
		}
		else{
			if (rightCounter < 2){
				g.drawImage(personRight, x, y, null);
			}
			//else if (leftCounter >= 2){
			//	g.drawImage(personLeftWalking, x, y, null);
			//}
			//else if (gravityCounter >= 2){
			//	g.drawImage(personRightJump, x, y, null);
			//}
		}
		
	}
	
	public void walkLeft() {
		//Image Rendering
		//if (leftCounter < -5)
		//	leftCounter = 8;
		
		//Set Boolean Value to True for Update
		WalkLeft = true;
		//WalkRight = false;
		leftDirection = true;
	}
	
	public void walkRight() {
		//Image Rendering
		//if (rightCounter < -5)
		//	rightCounter = 8;
		
		//Set Boolean Value to True for Update
		WalkRight = true;
		//WalkLeft = false;
		leftDirection = false;
	}
	
	public void stopWalkLeft(){
		//Set Boolean Value to False for Update
		WalkLeft = false;
		if(WalkRight == true){
			leftDirection = false;
		}
	}
	
	public void stopWalkRight(){
		//Set Boolean Value to False for Update
		WalkRight = false;
		if(WalkLeft == true){
			leftDirection = true;
		}
	}
	
	
	public void jump(){
		jumpCounter = 0;
		jump = true;
		if (collision){
			if (jumpCounter == 0)
				gravity = 0;
				gravity -= 100;
				//y += gravity;
				gravityCounter = 8;
		}
		else{
			//do nothing -- fall
		}
	}
}
	