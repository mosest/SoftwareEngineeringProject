import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class Platform
{
	int x, y, image;
	int width, height;
	static Image Base = null;
	
	Platform(int x_coordinate, int y_coordinate, int imageNumber) throws IOException{
		this.x = x_coordinate;
		this.y = y_coordinate;
		this.image = imageNumber;
		Base = ImageIO.read(new File("1920.png"));
		if (image == 1){
			width = 1920;
			height = 20;
		}
		else{
			
		}
	}
	
	
	void draw(Graphics g){
		if (image == 1){
			g.drawImage(Base, x, y, null);
		}
		else if(image == 2){
			//Set image to ~500x20
		}
		else if(image == 3){
			//Set image to ~800x20
		}
		//Continue for however many sizes of platforms you want
		
		//Image platform should be height of 20, but clearly have an indication between the collision and design
	}
	
	void collision(){
		//Set collision algorithm to only detect for roughly Width x '5'
		//Less variation for "hitting head" when trying to jump up.
		
	}
	void update(){
		//Should require nothing, unless needing to shift to keep camera focused on character
		//If focused on character, need to only call this update when the character moves a certain direction
		//Need 2 updates then, one being used for walking left, one used walking right
	}
	
	//If camera is actually sidescroller, need to shift existing design i have for walking
	//to making the entire map shift instead??? Unless theres a way to make it focus on a character.
}