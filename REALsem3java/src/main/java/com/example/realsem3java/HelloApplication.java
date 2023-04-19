/*
Harlan Ferguson 101133838
Raleigh Desmond 101374701
Owen Beattie 101379668
 */
package com.example.realsem3java;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        int[] randos = fiveRandos();
        String[][] questions = pullFiveRandos(randos);
        //--Components
        Label nameLabel = new Label("Please enter your name.");
        TextField nameBox = new TextField();

        //--Q1
        Label q1Label = new Label("1. " + questions[0][1]);
        ToggleGroup q1answerGroup = new ToggleGroup();
        VBox q1Box = new VBox();
        RadioButton q1a1Button = new RadioButton(questions[0][2]);
        RadioButton q1a2Button = new RadioButton(questions[0][3]);
        RadioButton q1a3Button = new RadioButton(questions[0][4]);
        RadioButton q1a4Button = new RadioButton(questions[0][5]);
        q1a1Button.setToggleGroup(q1answerGroup);
        q1a2Button.setToggleGroup(q1answerGroup);
        q1a3Button.setToggleGroup(q1answerGroup);
        q1a4Button.setToggleGroup(q1answerGroup);
        q1Box.getChildren().add(q1a1Button);
        q1Box.getChildren().add(q1a2Button);
        q1Box.getChildren().add(q1a3Button);
        q1Box.getChildren().add(q1a4Button);

        //--Q2
        Label q2Label = new Label("2. " + questions[1][1]);
        ToggleGroup q2answerGroup = new ToggleGroup();
        VBox q2Box = new VBox();
        RadioButton q2a1Button = new RadioButton(questions[1][2]);
        RadioButton q2a2Button = new RadioButton(questions[1][3]);
        RadioButton q2a3Button = new RadioButton(questions[1][4]);
        RadioButton q2a4Button = new RadioButton(questions[1][5]);
        q2a1Button.setToggleGroup(q2answerGroup);
        q2a2Button.setToggleGroup(q2answerGroup);
        q2a3Button.setToggleGroup(q2answerGroup);
        q2a4Button.setToggleGroup(q2answerGroup);
        q2Box.getChildren().add(q2a1Button);
        q2Box.getChildren().add(q2a2Button);
        q2Box.getChildren().add(q2a3Button);
        q2Box.getChildren().add(q2a4Button);

        //--Q3
        Label q3Label = new Label("3. " + questions[2][1]);
        ToggleGroup q3answerGroup = new ToggleGroup();
        VBox q3Box = new VBox();
        RadioButton q3a1Button = new RadioButton(questions[2][2]);
        RadioButton q3a2Button = new RadioButton(questions[2][3]);
        RadioButton q3a3Button = new RadioButton(questions[2][4]);
        RadioButton q3a4Button = new RadioButton(questions[2][5]);
        q3a1Button.setToggleGroup(q3answerGroup);
        q3a2Button.setToggleGroup(q3answerGroup);
        q3a3Button.setToggleGroup(q3answerGroup);
        q3a4Button.setToggleGroup(q3answerGroup);
        q3Box.getChildren().add(q3a1Button);
        q3Box.getChildren().add(q3a2Button);
        q3Box.getChildren().add(q3a3Button);
        q3Box.getChildren().add(q3a4Button);

        //--Q4
        Label q4Label = new Label("4. " + questions[3][1]);
        ToggleGroup q4answerGroup = new ToggleGroup();
        VBox q4Box = new VBox();
        RadioButton q4a1Button = new RadioButton(questions[3][2]);
        RadioButton q4a2Button = new RadioButton(questions[3][3]);
        RadioButton q4a3Button = new RadioButton(questions[3][4]);
        RadioButton q4a4Button = new RadioButton(questions[3][5]);
        q4a1Button.setToggleGroup(q4answerGroup);
        q4a2Button.setToggleGroup(q4answerGroup);
        q4a3Button.setToggleGroup(q4answerGroup);
        q4a4Button.setToggleGroup(q4answerGroup);
        q4Box.getChildren().add(q4a1Button);
        q4Box.getChildren().add(q4a2Button);
        q4Box.getChildren().add(q4a3Button);
        q4Box.getChildren().add(q4a4Button);

        //--Q5
        Label q5Label = new Label("5. " + questions[4][1]);
        ToggleGroup q5answerGroup = new ToggleGroup();
        VBox q5Box = new VBox();
        RadioButton q5a1Button = new RadioButton(questions[4][2]);
        RadioButton q5a2Button = new RadioButton(questions[4][3]);
        RadioButton q5a3Button = new RadioButton(questions[4][4]);
        RadioButton q5a4Button = new RadioButton(questions[4][5]);
        q5a1Button.setToggleGroup(q5answerGroup);
        q5a2Button.setToggleGroup(q5answerGroup);
        q5a3Button.setToggleGroup(q5answerGroup);
        q5a4Button.setToggleGroup(q5answerGroup);
        q5Box.getChildren().add(q5a1Button);
        q5Box.getChildren().add(q5a2Button);
        q5Box.getChildren().add(q5a3Button);
        q5Box.getChildren().add(q5a4Button);

        //Buttons
        Button writeStudentInfo = new Button("Submit Information");
        Label studentInfoLabel = new Label();
        Button calcCurrentGrade = new Button("Calculate Current Grade");
        Label currentGradeBox = new Label();
        Button calcAverageGrade = new Button("Calculate Average Grade");
        Label averageGradeBox = new Label();
        Label error = new Label();

        //--Scene
        GridPane exam = new GridPane();
        exam.add(nameLabel,0,0);
        exam.add(nameBox,1,0);
        exam.add(q1Label,0,1);
        exam.add(q1Box,0,2);
        exam.add(q2Label,0,3);
        exam.add(q2Box,0,4);
        exam.add(q3Label,0,5);
        exam.add(q3Box,0,6);
        exam.add(q4Label,0,7);
        exam.add(q4Box,0,8);
        exam.add(q5Label,0,9);
        exam.add(q5Box,0,10);
        exam.add(writeStudentInfo,0,11);
        exam.add(studentInfoLabel,1,11);
        exam.add(calcCurrentGrade,0,12);
        exam.add(currentGradeBox,1,12);
        exam.add(calcAverageGrade,0,13);
        exam.add(averageGradeBox,1,13);
        exam.add(error,0,14);
        Scene fullExam = new Scene(exam);
        exam.setPadding(new Insets(5));
        exam.setHgap(10);
        exam.setVgap(10);


        //--Stage
        stage.setTitle("Exam");
        stage.setScene(fullExam);
        stage.show();


        //--Actions
        writeStudentInfo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String studentInfo = "";
                String name = "";
                String answers = "";
                String q1Ans = "";
                String q2Ans = "";
                String q3Ans = "";
                String q4Ans = "";
                String q5Ans = "";
                int grade = 0;
                if (nameBox.getText().isEmpty() || nameBox.getText().isBlank()){
                    error.setText("Please input your name");
                }
                else{
                    boolean q1Set = false;
                    boolean q2Set = false;
                    boolean q3Set = false;
                    boolean q4Set = false;
                    boolean q5Set = false;
                    name = nameBox.getText();
                    if (q1a1Button.isSelected()){answers = answers + "A"; q1Set = true; q1Ans = "A";}
                    if (q1a2Button.isSelected()){answers = answers + "B"; q1Set = true; q1Ans = "B";}
                    if (q1a3Button.isSelected()){answers = answers + "C"; q1Set = true; q1Ans = "C";}
                    if (q1a4Button.isSelected()){answers = answers + "D"; q1Set = true; q1Ans = "D";}
                    if (!q1Set){answers = answers + "X"; q1Ans = "X";}
                    if (q1Ans.equals("X")){grade = grade + 0;}
                    else if (q1Ans.equals(questions[0][6])){grade = grade + 20;}
                    else {grade = grade - 5;}
                    if (q2a1Button.isSelected()){answers = answers + "A"; q2Set = true; q2Ans = "A";}
                    if (q2a2Button.isSelected()){answers = answers + "B"; q2Set = true; q2Ans = "B";}
                    if (q2a3Button.isSelected()){answers = answers + "C"; q2Set = true; q2Ans = "C";}
                    if (q2a4Button.isSelected()){answers = answers + "D"; q2Set = true; q2Ans = "D";}
                    if (!q2Set){answers = answers + "X"; q2Ans = "X";}
                    if (q2Ans.equals("X")){grade = grade + 0;}
                    else if (q2Ans.equals(questions[1][6])){grade = grade + 20;}
                    else {grade = grade - 5;}
                    if (q3a1Button.isSelected()){answers = answers + "A"; q3Set = true; q3Ans = "A";}
                    if (q3a2Button.isSelected()){answers = answers + "B"; q3Set = true; q3Ans = "B";}
                    if (q3a3Button.isSelected()){answers = answers + "C"; q3Set = true; q3Ans = "C";}
                    if (q3a4Button.isSelected()){answers = answers + "D"; q3Set = true; q3Ans = "D";}
                    if (!q3Set){answers = answers + "X"; q3Ans = "X";}
                    if (q3Ans.equals("X")){grade = grade + 0;}
                    else if (q3Ans.equals(questions[2][6])){grade = grade + 20;}
                    else {grade = grade - 5;}
                    if (q4a1Button.isSelected()){answers = answers + "A"; q4Set = true; q4Ans = "A";}
                    if (q4a2Button.isSelected()){answers = answers + "B"; q4Set = true; q4Ans = "B";}
                    if (q4a3Button.isSelected()){answers = answers + "C"; q4Set = true; q4Ans = "C";}
                    if (q4a4Button.isSelected()){answers = answers + "D"; q4Set = true; q4Ans = "D";}
                    if (!q4Set){answers = answers + "X"; q4Ans = "X";}
                    if (q4Ans.equals("X")){grade = grade + 0;}
                    else if (q4Ans.equals(questions[3][6])){grade = grade + 20;}
                    else {grade = grade - 5;}
                    if (q5a1Button.isSelected()){answers = answers + "A"; q5Set = true; q5Ans = "A";}
                    if (q5a2Button.isSelected()){answers = answers + "B"; q5Set = true; q5Ans = "B";}
                    if (q5a3Button.isSelected()){answers = answers + "C"; q5Set = true; q5Ans = "C";}
                    if (q5a4Button.isSelected()){answers = answers + "D"; q5Set = true; q5Ans = "D";}
                    if (!q5Set){answers = answers + "X"; q5Ans = "X";}
                    if (q5Ans.equals("X")){grade = grade + 0;}
                    else if (q5Ans.equals(questions[4][6])){grade = grade + 20;}
                    else {grade = grade - 5;}
                    studentInfo = studentInfo + name + "," + answers + "," + grade;
                    studentInfoLabel.setText(studentInfo);
                    try {
                        FileWriter write = new FileWriter("result.txt",true);
                        write.write(studentInfo + "\n");
                        write.close();
                    }catch (IOException ex){
                        error.setText("Error Writing to File");
                    }
                }
            }
        });
        calcAverageGrade.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    int lineCounter = 0;
                    int total = 0;
                    File result = new File("result.txt");
                    Scanner scan = new Scanner(result);
                    while(scan.hasNextLine()){
                        String resultLine = scan.nextLine();
                        String[] resultLineArr = resultLine.split(",");
                        total = total + Integer.parseInt(resultLineArr[2]);
                        lineCounter++;
                    }
                    double average = total / lineCounter;
                    String avgStr = Double.toString(average);
                    averageGradeBox.setText(avgStr);
                }catch (FileNotFoundException ex){
                    error.setText("Error finding File");
                }
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }

    static int[] fiveRandos() {
        Random questionNumGen = new Random(); //class to generate random num
        int[] questions = new int[5]; //random num array (empty)
        int questionNum1 = questionNumGen.nextInt(1, 20); //create random num

        int questionNum2 = questionNumGen.nextInt(1, 20);
        while (questionNum2 == questionNum1) {
            questionNum2 = questionNumGen.nextInt(1, 20);
        }

        int questionNum3 = questionNumGen.nextInt(1, 20);
        while (questionNum3 == questionNum1 || questionNum3 == questionNum2) {
            questionNum3 = questionNumGen.nextInt(1, 20);
        }

        int questionNum4 = questionNumGen.nextInt(1, 20);
        while (questionNum4 == questionNum1 || questionNum4 == questionNum2 || questionNum4 == questionNum3) {
            questionNum4 = questionNumGen.nextInt(1, 20);
        }

        int questionNum5 = questionNumGen.nextInt(1, 20);
        while (questionNum5 == questionNum1 || questionNum5 == questionNum2 || questionNum5 == questionNum3 || questionNum5 == questionNum4) {
            questionNum5 = questionNumGen.nextInt(1, 20);
        }

        questions[0] = questionNum1;
        questions[1] = questionNum2;
        questions[2] = questionNum3;
        questions[3] = questionNum4;
        questions[4] = questionNum5;
        return questions;
    }

    static String[][] pullFiveRandos(int[] randos) {
        try {
            //creating all necessary parts for code; file, scanner, return array, counter
            File exam = new File("exam.txt");
            String[][] twoDimQuestions = new String[5][7];
            int counter = 0;
            Scanner scan = new Scanner(exam);

            //only run while the file still has lines
            while (scan.hasNextLine()) {
                String question = scan.nextLine();
                String[] questionLineArr = question.split(","); //blow up the line based on commas
                for (int z = 0; z < randos.length; z++) {
                    int questionNumber = Integer.parseInt(questionLineArr[0]); //check if the question number exists in the random numbers
                    if (questionNumber == randos[z]) { //if the question number exists in random number array...
                        for (int x = 0; x < questionLineArr.length; x++) {
                            twoDimQuestions[counter][x] = questionLineArr[x]; //add it segment by segment based on the counter number
                        }
                        if (counter < 4) {
                            counter++; //increase the base index of the 2d array
                        } else break;
                    }
                }
            }
            return twoDimQuestions;
        } catch (FileNotFoundException ex) {
            String[][] twoDimQuestions = new String[5][7];
            return twoDimQuestions;
        }
    }
}