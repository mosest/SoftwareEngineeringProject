
import java.io.IOException;

class Model
{
	Map demoMap;
	Person person;
	int person_x;
	int person_y;
	Model() throws IOException {
		demoMap = new Map();
		person = new Person();
	}
	
	Model(Model m) {		
	}

	public void update() {
		//Update person
		this.person.update();
		
		if(collision()){
			person.gravity = 0;
		}
		else{
			
		}
	}
	public void LeftArrow(){
		this.person.walkLeft();
	}
	public void RightArrow(){
		this.person.walkRight();
	}
	public void Jump(){
		this.person.jump();
	}
	public void stopLeftArrow(){
		this.person.stopWalkLeft();
	}
	public void stopRightArrow(){
		this.person.stopWalkRight();
	}
	
	boolean collision(){
		//Only collides with bottom floor, need to fix by iteration through list
		if(person.x+person.width > demoMap.base.x && person.x < demoMap.base.x + demoMap.base.width && person.y+person.height+5> demoMap.base.y && person.y+person.height < demoMap.base.y){
			person.collision = true;
			return true;
		}
		else{
			person.collision = false;
			return false;
		}
		
	}
}


