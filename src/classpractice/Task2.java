package classpractice;
/*
* File: Task2.java
* Author: Jalen Brown
* Course: CISC230
* Lab: Lab3
* Date: 10/14/2026
* 
* Description:
* Program uses javafx to display a mini solar system. 
* Uses various shapes from shape class to accomplish this.
* Also uses a function to set the color of the shape.
* Lastly, places all object created into a group to display
* in the scene.
*/
//imports the java application
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
//imports ellipse from shape class
import javafx.scene.shape.Ellipse;
//imports circle from shape class
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class Task2 extends Application{

	public void start(Stage stage) {
		
		//creating circle object and setting color to yellow
		Circle sun = new Circle(250, 250, 50);
		sun.setFill(Color.YELLOW);
		//creating circle object and setting color to blue
		Circle mercury = new Circle(105, 250, 30);
		mercury.setFill(Color.BLUE);
		//creating circle object and setting color to red
		Circle venus = new Circle(250, 105, 20);
		venus.setFill(Color.RED);
		//creating circle object and setting color to green
		Circle earth = new Circle(250, 450, 25);
		earth.setFill(Color.GREEN);
		
		//creating ellipses with different sizes as orbits
		//setting color of ellipses to black
		Ellipse ellipse1 = new Ellipse(250, 250, 150, 100);
		ellipse1.setFill(null);
		ellipse1.setStroke(Color.BLACK);
		Ellipse ellipse2 = new Ellipse(250, 250, 200, 150);
		ellipse2.setFill(null);
		ellipse2.setStroke(Color.BLACK);
		Ellipse ellipse3 = new Ellipse(250, 250, 250, 200);
		ellipse3.setFill(null);
		ellipse3.setStroke(Color.BLACK);
		
		//creating text objects to display the different names of the 
		//planets
		Text s = new Text(240, 250, "Sun");
		Text e = new Text(240, 415, "Earth");
		Text m = new Text(75, 300, "Mercury");
		Text v = new Text(240, 140, "Venus");
		
		//putting all created objects in group
		Group root = new Group(sun, s, ellipse1, ellipse2, ellipse3, 
				mercury, m, venus, v, earth, e);
		//storing the grouped objects in the scene
		Scene space = new Scene(root, 500, 500);

		//displaying scene with title
		stage.setTitle("Solar System");
		stage.setScene(space);
		stage.show();
	}
}