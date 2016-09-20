
import java.io.IOException;

class Model
{
	Person person;
	Map demoMap;
	int person_x;
	int person_y;
	Model() throws IOException {
		person = new Person();
		demoMap = new Map();
	}
	
	Model(Model m) {		
	}

	public void update() {
		this.person.update();
		if(collision()){
			
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
	boolean collision(){
		if(person.x+person.width > demoMap.base.x && person.x < demoMap.base.x + demoMap.base.width && person.y + person.height+5> demoMap.base.y){
			person.collision = true;
			return true;
		}
		else{
			person.collision = false;
			return false;
		}
	}
		
	/*public void onClick(){
		this.bird.flap();
	}
	
	public void onClick2(){
		ListIterator<Sprite> iterator;
		iterator = sprites.listIterator();
		iterator.add(new Pie(bird.x, bird.y, sprites));		
	}*/
	
}


