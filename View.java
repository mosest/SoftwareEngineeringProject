import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.IOException;

class View extends JPanel {
	Model model;
	//Image person_image;

	View(Model m) throws IOException {
		this.model = m;
		//this.person_image = ImageIO.read(new File("person1.png"));
	}

	public void paintComponent(Graphics g) {
		//Draw the Person & Map, Map first so person overlaps platforms
		model.demoMap.draw(g);
		model.person.draw(g);
		//g.drawImage(this.person_image, this.model.person_x, this.model.person_y, null);
	}
}
