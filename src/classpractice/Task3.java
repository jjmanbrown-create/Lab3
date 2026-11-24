package classpractice;
/*
* File: Task3.java
* Author: Jalen Brown
* Course: CISC230
* Lab: Lab3
* Date: 10/14/2026
* 
* Description:
* Program displays scene of a college dorm room.
* Includes different shaped rectangle objects in
* the form of a desk, desk legs, window, and decorations.
* Also uses random class to generate a different color
* for the dorm wall each time the program is ran.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
//importing rectangle from shape class
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import java.util.Random;

public class Task3 extends Application{
	
	public void start(Stage stage) {
		
		//creating random object
		Random rand = new Random();
		//creating 3 different integers that will store
		//randomly generated values ranging from 0-255
		int r = rand.nextInt(0, 256);
		int g = rand.nextInt(0, 256);
		int b = rand.nextInt(0, 256);
		//creating color object that uses rgb to store integers into
		Color c = Color.rgb(r, g, b);
				
		//creating rectangle object
		Rectangle window = new Rectangle(150, 75, 100, 80);
		//setting color of rectangle
		window.setFill(Color.LIGHTBLUE);
		//setting outline color of rectangle
		window.setStroke(Color.BLACK);
		//setting the width of the outlined color
		window.setStrokeWidth(3.0);
		
		//creating rectangle object
		Rectangle desk = new Rectangle (125, 250, 150, 30);
		//setting color of rectangle
		desk.setFill(Color.BEIGE);
		//setting outline color of rectangle
		desk.setStroke(Color.BLACK);
		//setting the width of the outlined color
		desk.setStrokeWidth(1.5);
		
		//creating rectangle objects and using set function
		//to color them
		Rectangle leg1 = new Rectangle(150, 280, 20, 75);
		leg1.setFill(Color.BEIGE);
		leg1.setStroke(Color.BLACK);
		leg1.setStrokeWidth(1.5);
		Rectangle leg2 = new Rectangle(230, 280, 20, 75);
		leg2.setFill(Color.BEIGE);
		leg2.setStroke(Color.BLACK);
		leg2.setStrokeWidth(1.5);
		
		Rectangle decor = new Rectangle(275, 80, 100, 75);
		decor.setFill(Color.MEDIUMPURPLE);
		decor.setStroke(Color.WHITE);
		decor.setStrokeWidth(2);;

		//creating line objects
		Line line1 = new Line(150, 118, 250,118);
		Line line2 = new Line(200, 155, 200,75);
		
		//creating text object 
		Text title = new Text(140, 25, "Tommie Dorm Room");
		title.setStroke(Color.BLACK);
		title.setStrokeWidth(0.5);
		
		//creating text object and setting color
		Text poster = new Text(290, 120, "GO TOMMIES");
		poster.setFill(Color.WHITE);
		poster.setStroke(Color.WHITE);
		poster.setStrokeWidth(1);
		
		//displaying the randomly generated integers used to create my
		//color in the rgb
		Text rgb = new Text(15, 375, "Wall Color: RGB: (" + r + ", " + g + 
				", " + b + ")");
		rgb.setStroke(Color.BLACK);
		rgb.setStrokeWidth(0.5);

		//putting all objects in a group
		Group root = new Group(window, line1, line2, desk, leg1, 
				leg2, decor, title, poster, rgb);
		//storing group in scene
		Scene room = new Scene(root, 400, 400);
		
		//setting color of scene background
		room.setFill(c);

		//displaying my scene witgh the title
		stage.setTitle("Tommie Dorm Room");
		stage.setScene(room);
		stage.show();
	}
}