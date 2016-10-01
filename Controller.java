import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class Controller implements KeyListener
{
	Model model;

	Controller(Model m) {
		this.model = m;
	}

	public void keyReleased(KeyEvent e){ 
		int keyCode = e.getKeyCode();
		 if (keyCode == KeyEvent.VK_LEFT){
			 //System.out.println("LEFT ARROW!");
			 this.model.stopLeftArrow();
		 }
		 else if (keyCode == KeyEvent.VK_RIGHT){
			 //System.out.println("RIGHT ARROW!");
			 this.model.stopRightArrow();
		 }
		 //else if (keyCode == KeyEvent.VK_SHIFT){
			 //System.out.println("JUMP!");
		//	 this.model.Jump();
		//}
	}
	public void keyTyped(KeyEvent e){ 	}
	
	public void keyPressed(KeyEvent e){
		int keyCode = e.getKeyCode();
			 if (keyCode == KeyEvent.VK_LEFT){
				 //System.out.println("LEFT ARROW!");
				 this.model.LeftArrow();
			 }
			 else if (keyCode == KeyEvent.VK_RIGHT){
				 //System.out.println("RIGHT ARROW!");
				 this.model.RightArrow();
			 }
			 else if (keyCode == KeyEvent.VK_SHIFT){
				 //System.out.println("JUMP!");
				 this.model.Jump();
			
			 }
	}
}
