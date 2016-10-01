import java.awt.Graphics;
import java.io.IOException;

class Map{
	Platform base;
	Platform base2;
	Platform base3;
	Map() throws IOException{
		base = new Platform(0,800,1);
		base2 = new Platform(400,650,2);
		base3 = new Platform(980,750,2);
		//Platform base = new Platform(0,1080,1);
		//Instantiate however many platforms im wanting by "Platform 1 = new Platform(xcoord,ycoord,imageNumber)"
		//Make new map everytime character crosses into... door? portal? idk
	}
	
	
	void draw(Graphics g){
		//At some point, Link through abstract linked list.
		if(base != null)
			base.draw(g);
		if(base2 != null)
			base2.draw(g);
		if(base3 != null)
			base3.draw(g);
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