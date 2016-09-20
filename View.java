import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.Graphics;
import java.io.File;

class View extends JPanel {
	Model model;
	//Image person_image;

	View(Model m) throws IOException {
		this.model = m;
		//this.person_image = ImageIO.read(new File("person1.png"));
	}

	public void paintComponent(Graphics g) {
		//Draw the Person
		model.person.draw(g);
		model.demoMap.draw(g);
		//g.drawImage(this.person_image, this.model.person_x, this.model.person_y, null);
	}
}
