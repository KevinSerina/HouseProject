import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class House extends Application {
	
	Group group;
	GraphicsContext gc;
	//This program displays the picture of a house
	
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("A House");
		
		Canvas canvas = new Canvas(500, 500);
		gc = canvas.getGraphicsContext2D();
		
		group = new Group(canvas);
		
		//GROUND with coordinates (x, y, width, height)
		Rectangle ground = new Rectangle(0, 250, 500, 250);
		ground.setFill(Color.GREEN);
		group.getChildren().add(ground);
		
		
		//Triangle ROOF with coordinates of each point
		Polygon roof = new Polygon();
		roof.getPoints().addAll(new Double[]{
				250.0, 50.0,
				50.0, 150.0,
				450.0, 150.0,
		});
		roof.setFill(Color.WHITE);
		roof.setStroke(Color.BLACK);
		roof.setStrokeWidth(1);
		group.getChildren().add(roof);
		
		
		//ROOF2 with coordinates (x, y, width, height)
		Rectangle roof2 = new Rectangle(80, 150, 340, 20);
		roof2.setFill(Color.WHITE);
		roof2.setStroke(Color.BLACK);
		roof2.setStrokeWidth(1);
		group.getChildren().add(roof2);
		
		//Main building with coordinates (x, y, width, height)
		Rectangle building = new Rectangle(80, 170, 340, 250);
		building.setFill(Color.FIREBRICK);
		building.setStroke(Color.BLACK);
		building.setStrokeWidth(1);
		group.getChildren().add(building);
		
		
		//Pillar #1 Column
		Rectangle column1 = new Rectangle(90, 170, 30, 175); //column1 coordinates (x, y, width, height)
		column1.setFill(Color.WHITE);
		column1.setStroke(Color.BLACK);
		column1.setStrokeWidth(1);
		group.getChildren().add(column1);
		
		//Pillar #1 Circle 1
		Circle circle1 = new Circle(90, 180, 10); //circle1 specified by (centerX, centerY, radius)
		circle1.setFill(Color.WHITE);
		circle1.setStroke(Color.BLACK);
		circle1.setStrokeWidth(1);
		group.getChildren().add(circle1);
		
		
		//Pillar #1 Circle 2
		Circle circle2 = new Circle(120, 180, 10); //circle2 (centerX, centerY, radius)
		circle2.setFill(Color.WHITE);
		circle2.setStroke(Color.BLACK);
		circle2.setStrokeWidth(1);
		group.getChildren().add(circle2);
		
		//Pillar #1 UpperBase
		Rectangle upperBase1 = new Rectangle(85, 345, 40, 15); //upperBase1 coordinates (x, y, width, height)
		upperBase1.setFill(Color.WHITE);
		upperBase1.setStroke(Color.BLACK);
		upperBase1.setStrokeWidth(1);
		group.getChildren().add(upperBase1);
		
		//Pillar #1 Lower Base
		Rectangle lowerBase1 = new Rectangle(80, 360, 50, 8); //lowerBase1 coordinates (x, y, width, height)
		lowerBase1.setFill(Color.WHITE);
		lowerBase1.setStroke(Color.BLACK);
		lowerBase1.setStrokeWidth(1);
		group.getChildren().add(lowerBase1);
		
		
		//Pillar #2 Column
		Rectangle column2 = new Rectangle(185, 170, 30, 175); //column2 coordinates (x, y, width, height)
		column2.setFill(Color.WHITE);
		column2.setStroke(Color.BLACK);
		column2.setStrokeWidth(1);
		group.getChildren().add(column2);
		
		//Pillar #2 Circle 1
		Circle circle3 = new Circle(185, 180, 10); //circle3 coordinates (centerX, centerY, radius)
		circle3.setFill(Color.WHITE);
		circle3.setStroke(Color.BLACK);
		circle3.setStrokeWidth(1);
		group.getChildren().add(circle3);
		
		//Pillar #2 Circle 2
		Circle circle4 = new Circle(215, 180, 10); //circle4 coordinates (centerX, centerY, radius)
		circle4.setFill(Color.WHITE);
		circle4.setStroke(Color.BLACK);
		circle4.setStrokeWidth(1);
		group.getChildren().add(circle4);
		
		//Pillar #2 Upper Base
		Rectangle upperBase2 = new Rectangle(180, 345, 40, 15); //upperBase2 coordinates (x, y, width, height)
		upperBase2.setFill(Color.WHITE);
		upperBase2.setStroke(Color.BLACK);
		upperBase2.setStrokeWidth(1);
		group.getChildren().add(upperBase2);
		
		//Pillar  #2 Lower Base
		Rectangle lowerBase2 = new Rectangle(175, 360, 50, 8); //lowerBase2 coordinates (x, y, width, height)
		lowerBase2.setFill(Color.WHITE);
		lowerBase2.setStroke(Color.BLACK);
		lowerBase2.setStrokeWidth(1);
		group.getChildren().add(lowerBase2);
		
		
		//Pillar #3 Column
		Rectangle column3 = new Rectangle(285, 170, 30, 175); //column3 coordinates (x, y, width, height)
		column3.setFill(Color.WHITE);
		column3.setStroke(Color.BLACK);
		column3.setStrokeWidth(1);
		group.getChildren().add(column3);
		
		//Pillar #3 Circle 1
		Circle circle5 = new Circle(285, 180, 10); //circle5 coordinates (centerX, centerY, radius)
		circle5.setFill(Color.WHITE);
		circle5.setStroke(Color.BLACK);
		circle5.setStrokeWidth(1);
		group.getChildren().add(circle5);
		
		//Pillar #3 Circle 2
		Circle circle6 = new Circle(315, 180, 10); //circle6 coordinates (centerX, centerY, radius)
		circle6.setFill(Color.WHITE);
		circle6.setStroke(Color.BLACK);
		circle6.setStrokeWidth(1);
		group.getChildren().add(circle6);
		
		//Pillar #3 Upper Base
		Rectangle upperBase3 = new Rectangle(280, 345, 40, 15); //upperBase3 coordinates (x, y, width, height)
		upperBase3.setFill(Color.WHITE);
		upperBase3.setStroke(Color.BLACK);
		upperBase3.setStrokeWidth(1);
		group.getChildren().add(upperBase3);
		
		//Pillar #3 Lower Base
		Rectangle lowerBase3 = new Rectangle(275, 360, 50, 8); //lowerBase3 coordinates (x, y, width, height)
		lowerBase3.setFill(Color.WHITE);
		lowerBase3.setStroke(Color.BLACK);
		lowerBase3.setStrokeWidth(1);
		group.getChildren().add(lowerBase3);
		
		
		//Pillar #4 Column
		Rectangle column4 = new Rectangle(380, 170, 30, 175); //column3 coordinates (x, y, width, height)
		column4.setFill(Color.WHITE);
		column4.setStroke(Color.BLACK);
		column4.setStrokeWidth(1);
		group.getChildren().add(column4);
		
		//Pillar #4 Circle1
		Circle circle7 = new Circle(380, 180, 10); //circle7 coordinates (centerX, centerY, radius)
		circle7.setFill(Color.WHITE);
		circle7.setStroke(Color.BLACK);
		circle7.setStrokeWidth(1);
		group.getChildren().add(circle7);
		
		//Pillar #4 Circle2
		Circle circle8 = new Circle(410, 180, 10); //circle8 coordinates (centerX, centerY, radius)
		circle8.setFill(Color.WHITE);
		circle8.setStroke(Color.BLACK);
		circle8.setStrokeWidth(1);
		group.getChildren().add(circle8);
		
		//Pillar #4 Upper Base
		Rectangle upperBase4 = new Rectangle(375, 345, 40, 15); //upperBase4 coordinates (x, y, width, height)
		upperBase4.setFill(Color.WHITE);
		upperBase4.setStroke(Color.BLACK);
		upperBase4.setStrokeWidth(1);
		group.getChildren().add(upperBase4);
		
		//Pillar #4 Lower Base
		Rectangle lowerBase4 = new Rectangle(370, 360, 50, 8); //lowerBase3 coordinates (x, y, width, height)
		lowerBase4.setFill(Color.WHITE);
		lowerBase4.setStroke(Color.BLACK);
		lowerBase4.setStrokeWidth(1);
		group.getChildren().add(lowerBase4);
		
		
		//Top Window
		Rectangle topWindow = new Rectangle(230, 200, 40, 25); //coordinates
		topWindow.setFill(Color.DIMGRAY);
		topWindow.setStroke(Color.BLACK);
		topWindow.setStrokeWidth(1);
		group.getChildren().add(topWindow);
		
		//Door #1 Frame
		Rectangle frame1 = new Rectangle(130, 268, 45, 100); //door #1 coordinates
		frame1.setFill(Color.WHITE);
		frame1.setStroke(Color.BLACK);
		frame1.setStrokeWidth(1);
		group.getChildren().add(frame1);
		
		
		//Door #1 Windows
		Rectangle window1 = new Rectangle(140, 275, 10, 15); //window1 coordinates
		window1.setFill(Color.BLACK);
		window1.setStroke(Color.BLACK);
		window1.setStrokeWidth(1);
		group.getChildren().add(window1);
		
		Rectangle window2 = new Rectangle(140, 295, 10, 15); //window2 coordinates
		window2.setFill(Color.BLACK);
		window2.setStroke(Color.BLACK);
		window2.setStrokeWidth(1);
		group.getChildren().add(window2);
		
		Rectangle window3 = new Rectangle(140, 315, 10, 15); //window3 coordinates
		window3.setFill(Color.BLACK);
		window3.setStroke(Color.BLACK);
		window3.setStrokeWidth(1);
		group.getChildren().add(window3);
		
		Rectangle window4 = new Rectangle(140, 335, 10, 15); //window4 coordinates
		window4.setFill(Color.BLACK);
		window4.setStroke(Color.BLACK);
		window4.setStrokeWidth(1);
		group.getChildren().add(window4);
		
		Rectangle window5 = new Rectangle(155, 275, 10, 15); //window5 coordinates
		window5.setFill(Color.BLACK);
		window5.setStroke(Color.BLACK);
		window5.setStrokeWidth(1);
		group.getChildren().add(window5);
		
		Rectangle window6 = new Rectangle(155, 295, 10, 15); //window6 coordinates
		window6.setFill(Color.BLACK);
		window6.setStroke(Color.BLACK);
		window6.setStrokeWidth(1);
		group.getChildren().add(window6);
		
		Rectangle window7 = new Rectangle(155, 315, 10, 15); //window7 coordinates
		window7.setFill(Color.BLACK);
		window7.setStroke(Color.BLACK);
		window7.setStrokeWidth(1);
		group.getChildren().add(window7);
		
		Rectangle window8 = new Rectangle(155, 335, 10, 15); //window8 coordinates
		window8.setFill(Color.BLACK);
		window8.setStroke(Color.BLACK);
		window8.setStrokeWidth(1);
		group.getChildren().add(window8);
		
		
		//Door #2 Frame
		Rectangle frame2 = new Rectangle(225, 250, 50, 118); //door #2 coordinates
		frame2.setFill(Color.WHITE);
		frame2.setStroke(Color.BLACK);
		frame2.setStrokeWidth(1);
		group.getChildren().add(frame2);
		
		//Door #2 Windows
		Rectangle window9 = new Rectangle(233, 275, 10, 15); //window9 coordinates
		window9.setFill(Color.BLACK);
		window9.setStroke(Color.BLACK);
		window9.setStrokeWidth(1);
		group.getChildren().add(window9);
		
		Rectangle window10 = new Rectangle(233, 295, 10, 15); //window10 coordinates
		window10.setFill(Color.BLACK);
		window10.setStroke(Color.BLACK);
		window10.setStrokeWidth(1);
		group.getChildren().add(window10);
		
		Rectangle window11 = new Rectangle(233, 315, 10, 15); //window11 coordinates
		window11.setFill(Color.BLACK);
		window11.setStroke(Color.BLACK);
		window11.setStrokeWidth(1);
		group.getChildren().add(window11);
		
		Rectangle window12 = new Rectangle(233, 335, 10, 15); //window12 coordinates
		window12.setFill(Color.BLACK);
		window12.setStroke(Color.BLACK);
		window12.setStrokeWidth(1);
		group.getChildren().add(window12);
		
		Rectangle window13 = new Rectangle(255, 275, 10, 15); //window13 coordinates
		window13.setFill(Color.BLACK);
		window13.setStroke(Color.BLACK);
		window13.setStrokeWidth(1);
		group.getChildren().add(window13);
		
		Rectangle window14 = new Rectangle(255, 295, 10, 15); //window14 coordinates
		window14.setFill(Color.BLACK);
		window14.setStroke(Color.BLACK);
		window14.setStrokeWidth(1);
		group.getChildren().add(window14);
		
		Rectangle window15 = new Rectangle(255, 315, 10, 15); //window15 coordinates
		window15.setFill(Color.BLACK);
		window15.setStroke(Color.BLACK);
		window15.setStrokeWidth(1);
		group.getChildren().add(window15);
		
		Rectangle window16 = new Rectangle(255, 335, 10, 15); //window16 coordinates
		window16.setFill(Color.BLACK);
		window16.setStroke(Color.BLACK);
		window16.setStrokeWidth(1);
		group.getChildren().add(window16);
		
		
		//Door #3
		Rectangle frame3 = new Rectangle(325, 268, 45, 100); //door #3 coordinates
		frame3.setFill(Color.WHITE);
		frame3.setStroke(Color.BLACK);
		frame3.setStrokeWidth(1);
		group.getChildren().add(frame3);
		
		//Door #3 Windows
		Rectangle window17 = new Rectangle(332, 275, 10, 15); //window17 coordinates
		window17.setFill(Color.BLACK);
		window17.setStroke(Color.BLACK);
		window17.setStrokeWidth(1);
		group.getChildren().add(window17);
		
		Rectangle window18 = new Rectangle(332, 295, 10, 15); //window18 coordinates
		window18.setFill(Color.BLACK);
		window18.setStroke(Color.BLACK);
		window18.setStrokeWidth(1);
		group.getChildren().add(window18);
		
		Rectangle window19 = new Rectangle(332, 315, 10, 15); //window19 coordinates
		window19.setFill(Color.BLACK);
		window19.setStroke(Color.BLACK);
		window19.setStrokeWidth(1);
		group.getChildren().add(window19);
		
		Rectangle window20 = new Rectangle(332, 335, 10, 15); //window20 coordinates
		window20.setFill(Color.BLACK);
		window20.setStroke(Color.BLACK);
		window20.setStrokeWidth(1);
		group.getChildren().add(window20);
		
		Rectangle window21 = new Rectangle(350, 275, 10, 15); //window21 coordinates
		window21.setFill(Color.BLACK);
		window21.setStroke(Color.BLACK);
		window21.setStrokeWidth(1);
		group.getChildren().add(window21);
		
		Rectangle window22 = new Rectangle(350, 295, 10, 15); //window22 coordinates
		window22.setFill(Color.BLACK);
		window22.setStroke(Color.BLACK);
		window22.setStrokeWidth(1);
		group.getChildren().add(window22);
		
		Rectangle window23 = new Rectangle(350, 315, 10, 15); //window23 coordinates
		window23.setFill(Color.BLACK);
		window23.setStroke(Color.BLACK);
		window23.setStrokeWidth(1);
		group.getChildren().add(window23);
		
		Rectangle window24 = new Rectangle(350, 335, 10, 15); //window24 coordinates
		window24.setFill(Color.BLACK);
		window24.setStroke(Color.BLACK);
		window24.setStrokeWidth(1);
		group.getChildren().add(window24);
		
		stairs(130, 360);
		
		//Create a scene
		Scene scene = new Scene(group, 500, 500, Color.CYAN);
		
		primaryStage.setTitle("A House");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	//Loop function to make stairs
	public void stairs(int x, int y) 
	{
		Rectangle stair;
		
		int width = 240;
		int height = 10;
		
		for(int i = 0; i < 10; i++) 
		{
			stair = new Rectangle(x, y, width, 10);
			stair.setFill(Color.DARKGRAY);
			stair.setStroke(Color.BLACK);
			stair.setStrokeWidth(1);
			group.getChildren().add(stair);
			x = x - 10;
			y = y + height;
			width = width + 20;
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}

}
