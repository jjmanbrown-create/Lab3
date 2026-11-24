package classpractice;
/*
* File: Task4.java
* Author: Jalen Brown
* Course: CISC230
* Lab: Lab3
* Date: 10/14/2026
* 
* Description:
* Program uses javafx to design a student ID card
* for a St. Thomas student. Uses various shape objects such
* as circle and rectangle objects. Uses set function to set
* the color of the shape in the scene.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Task4 extends Application{
	
	public void start(Stage stage) {
		
		//creating text objects and setting the color of them
		Text a = new Text(250, 170, "Student Name: Jalen Brown");
		Text b = new Text(250, 200, "Major: Computer Science");
		Text c = new Text(250, 230, "Graduation Year: 2028");
		Text d = new Text(100, 80, "UNIVERSITY OF ST. THOMAS");
		d.setFill(Color.PURPLE);
		Text t = new Text(405, 295, "GO TOMMIES!");
		t.setFill(Color.WHITE);
		
		//creating circle object and setting color/stroke color
		Circle circle = new Circle (40);
		circle.setFill(Color.LIGHTGRAY);
		circle.setStroke(Color.PURPLE);
		//using transformations to move objects from their
		//set position
		circle.setTranslateX(0);
		circle.setTranslateY(-70);

		//creating circle object and setting color/stroke color
		Circle circle1 = new Circle (60);
		circle1.setFill(Color.LIGHTGRAY);
		circle1.setStroke(Color.PURPLE);
		
		//creating group to store circle objects into
		Group object = new Group(circle, circle1);
		//applying transformations to all objects in the group
		object.setTranslateX(120);
		object.setTranslateY(240);

		//creating rectangle objects and setting color/stroke color
		Rectangle r = new Rectangle(370, 275, 150, 35);
		r.setFill(Color.PURPLE);
		r.setStroke(Color.BLACK);
		r.setStrokeWidth(2);
		Rectangle r1 = new Rectangle(20, 50, 540, 325);
		r1.setFill(Color.GHOSTWHITE);
		r1.setStroke(Color.PURPLE);
		r1.setStrokeWidth(5);

		//creating line objects and setting color/stroke color
		Line top = new Line(40, 100, 540, 100);
		top.setStroke(Color.PURPLE);
		top.setStrokeWidth(5);
		Line bottom = new Line(40, 325, 540, 325);
		bottom.setStroke(Color.PURPLE);
		bottom.setStrokeWidth(5);
		
		//creating group and storing all objects as well as
		//seprate group with circles in it
		Group graph = new Group(r1, r, top, bottom, d, t, a, b, c,
				object);
		//storing the main group in the scene
		Scene background = new Scene(graph, 600, 400);	
		
		//displaying scene with the title
		stage.setTitle("Tommie Student ID Card");
		stage.setScene(background);
		stage.show();
	}
}