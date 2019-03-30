package application;

	

import java.util.ArrayList;



import javafx.animation.AnimationTimer;

import javafx.application.Application;

import javafx.event.EventHandler;

import javafx.stage.Stage;

import javafx.scene.Group;

import javafx.scene.Scene;

import javafx.scene.canvas.Canvas;

import javafx.scene.canvas.GraphicsContext;

import javafx.scene.image.Image;

import javafx.scene.input.KeyEvent;

import javafx.scene.layout.BorderPane;





public class Main extends Application {

	public void start(Stage theStage) 

    {

        theStage.setTitle( "Aiiaoiaa caaaiea io 16.03.19" );



        Group root = new Group();

        Scene theScene = new Scene( root );

        theStage.setScene( theScene );

 

        Canvas canvas = new Canvas( 800, 380);
        root.getChildren().add( canvas );

 

        ArrayList<String> input = new ArrayList<String>();


        theScene.setOnKeyPressed(

            new EventHandler<KeyEvent>()

            {

                public void handle(KeyEvent e)

                {


                    String code = e.getCode().toString(); 

                    if ( !input.contains(code) )

                        input.add( code );

                }

            });


        theScene.setOnKeyReleased(

            new EventHandler<KeyEvent>()

            {

                public void handle(KeyEvent e)

                {

                    String code = e.getCode().toString();

                    input.remove( code );

                }

            });

 

        GraphicsContext gc = canvas.getGraphicsContext2D();

          
        
        Image road = new Image( "Road4.jpg" );
        
        Image car = new Image("Car22.png");
          
                
                
        Image left = new Image( "left.png" );

        Image leftG = new Image( "leftG.png" );

 

        Image right = new Image( "right.png" );

        Image rightG = new Image( "rightG.png" );
        
        
        final long startTime = System.nanoTime();

        new AnimationTimer()

        {
        	double x2 = 0; 
        	double y = 220;

            public void handle(long currentNanoTime)

            {

                if (input.contains("LEFT")) {

                    gc.drawImage( leftG, 64, 400 );
                     y = y - 8;
                }

                else {
                	gc.drawImage( left, 64, 400 );
                }
 
                    

 

                if (input.contains("RIGHT")) {
                	y = y + 8;
                	gc.drawImage( rightG, 256, 400 );
                }

                    

                else {
                	gc.drawImage( right, 256, 400 );
                }

                    

                
                
                double diff = (currentNanoTime - startTime) / 1000000000.0;
           	 
           	 
           	 double x1 = x2 - diff * 200;
           	  gc.drawImage(road,x1,0);
           	
               if ( x1 <= -200) {
           	 x2 = x2 + 200;

               }
               
               gc.drawImage( car, 20, y);
              	
               
               
               
               

            }

        }.start();

 

        theStage.show();

    }

        
	public static void main(String[] args)

    {

        launch(args);

    }



}