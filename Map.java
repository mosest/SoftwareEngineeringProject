import java.awt.Graphics;
import java.io.IOException;

class Map{
	Platform base = new Platform(0,800,1);
	//Platform above;
	Map() throws IOException{
		//Platform base = new Platform(0,1080,1);
		//Platform above = new Platform(900, 900, 2);
		//Instantiate however many platforms im wanting by "Platform 1 = new Platform(xcoord,ycoord,imageNumber)"
		//Make new map everytime character crosses into... door? portal? idk
	}
	
	
	void draw(Graphics g){
		if(base != null)
			base.draw(g);
		//above.draw(g);
	}
	
	void update(){
		//Nothing, ATM
	}
	
	void collision(){
		//Possibly something to stop the character from falling out map,
		//Ex: if char.x > map.x, set char.x back to "starting position"
	}
	
	//Any other functions???
}