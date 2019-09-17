/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmqnrcalculategrades;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author dmqnr
 */
public class DmqnrCalculateGrades extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Grade Calculator");
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        
        Label labelOne = new Label("Score 1 (70%):");
        Label labelTwo = new Label("Score 2 (30%):");
        Label labelThree = new Label("Bonus:");
        Label labelFour = new Label("Final Score");
        
        root.add(labelOne,0,0);
        root.add(labelTwo,0,1);
        root.add(labelThree, 0, 2);
        root.add(labelFour, 0, 3);
        
        TextField Score1 = new TextField();
        Score1.setPrefWidth(350);
        TextField Score2 = new TextField();
        Score1.setPrefWidth(350);
        TextField Score3 = new TextField();
        Score1.setPrefWidth(350);
        TextField FinalScore = new TextField();
        Score1.setPrefWidth(350);
        
        root.add(Score1, 1,0);
        root.add(Score2, 1,1);
        root.add(Score3, 1,2);
        root.add(FinalScore,1,3);
       
        Button fullScoreButton = new Button("Full Score");
        fullScoreButton.setMaxWidth(Double.MAX_VALUE);
        
        Button calculateButton = new Button("Calculate");
        calculateButton.setMaxWidth(Double.MAX_VALUE);
        
        Button clearButton = new Button("Clear");
        clearButton.setMaxWidth(Double.MAX_VALUE);
        
        Button alertButton = new Button("Alert");
        alertButton.setMaxWidth(Double.MAX_VALUE);
        
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10,0,15,0));
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(fullScoreButton,calculateButton,clearButton,alertButton);
        root.add(vbox,0,4,2,1);
        
        fullScoreButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Score1.setText("100");
                Score2.setText("100");
                Score3.setText("10");
            }
        });
        
        calculateButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String field1 = Score1.getText();
                String field2 = Score2.getText();
                String field3 = Score3.getText();
                
                double num1 = Double.parseDouble(field1);
                double num2 = Double.parseDouble(field2);
                double num3 = Double.parseDouble(field3);
                
                double grade = num1 * 0.7 + num2 *0.3 + num3;
                
                FinalScore.setText("My final score should be " + num1 + "* 0.7 + " + num2 + "* 0.3 + " + num3 + " = " + String.format("%.2f",grade));
                
            }
        });
        
        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Score1.setText("");
                Score2.setText("");
                Score3.setText("");
                FinalScore.setText("");
            }
        });
        
        alertButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                String field1 = Score1.getText();
                String field2 = Score2.getText();
                String field3 = Score3.getText();
                
                double num1 = Double.parseDouble(field1);
                double num2 = Double.parseDouble(field2);
                double num3 = Double.parseDouble(field3);
                
                double grade = num1 * 0.7 + num2 *0.3 + num3;
                
                
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("ALERT");
                alert.setHeaderText("Message");
                alert.setContentText("My final score should be " + num1 + "* 0.7 + " + num2 + "* 0.3 + " + num3 + " = " + String.format("%.2f",grade));
                alert.showAndWait();
            }
        });
        
        Scene scene = new Scene(root,500,360);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
