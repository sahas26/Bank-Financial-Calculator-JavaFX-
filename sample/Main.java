package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;
import java.text.DecimalFormat;


public class Main extends Application {


    Scene scene1, scene2, scene3, scene4, scene5, scene6,scene7;
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Bank Program");


        Image main_img = new Image("hand.jpg");
        ImageView first = new ImageView();
        first.setImage(main_img);
        first.setFitWidth(650);
        first.setFitHeight(525);





        Label lb = new Label("HOME PAGE");
        lb.setLayoutX(200);
        lb.setLayoutY(60);
        lb.setStyle("-fx-font-size:40px;-fx-text-fill:black");



        Button bt1 = new Button("Fixed Deposits");
        bt1.setLayoutX(230);
        bt1.setLayoutY(160);
        bt1.setPrefWidth(170);
        bt1.setPrefHeight(40);
        bt1.setStyle("-fx-font-size:16px");
        bt1.setOnAction(e -> primaryStage.setScene(scene2));


        Button bt2 = new Button("Savings");
        bt2.setLayoutX(230);
        bt2.setLayoutY(220);
        bt2.setPrefWidth(170);
        bt2.setPrefHeight(40);
        bt2.setStyle("-fx-font-size:16px");
        bt2.setOnAction(e -> primaryStage.setScene(scene3));

        Button bt3 = new Button("Loans");
        bt3.setLayoutX(230);
        bt3.setLayoutY(280);
        bt3.setPrefWidth(170);
        bt3.setPrefHeight(40);
        bt3.setStyle("-fx-font-size:16px");
        bt3.setOnAction(e -> primaryStage.setScene(scene4));

        Button bt4 = new Button("Mortgage");
        bt4.setLayoutX(230);
        bt4.setLayoutY(340);
        bt4.setPrefWidth(170);
        bt4.setPrefHeight(40);
        bt4.setStyle("-fx-font-size:16px");
        bt4.setOnAction(e -> primaryStage.setScene(scene5));

        Button bt5 = new Button("help");
        bt5.setLayoutX(100);
        bt5.setLayoutY(450);
        bt5.setPrefWidth(100);
        bt5.setPrefHeight(40);
        bt5.setStyle("-fx-font-size:16px");
        bt5.setOnAction(e ->
            primaryStage.setScene(scene6)
        );

        Button bt6 = new Button("Exit");
        bt6.setLayoutX(460);
        bt6.setLayoutY(450);
        bt6.setPrefWidth(100);
        bt6.setPrefHeight(40);
        bt6.setStyle("-fx-font-size:16px");
        bt6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = (Stage) bt6.getScene().getWindow();
                stage.close();
            }
        });
        //-----------------------------(history scene)
        Pane root7 = new Pane();

       TextArea ta_1=new TextArea();
       ta_1.setPrefWidth(620);
       ta_1.setPrefHeight(400);
       ta_1.setLayoutX(20);
       ta_1.setLayoutY(50);

       Button bt_hi= new Button("Back");
       bt_hi.setLayoutX(540);
       bt_hi.setLayoutY(455);
       bt_hi.setStyle("-fx-font-size:25;-fx-text-alignment:center");
       bt_hi.setOnAction(event -> primaryStage.setScene(scene1));

       Label lb_hi=new Label("HISTORY");
       lb_hi.setLayoutX(260);
       lb_hi.setLayoutY(2);
       lb_hi.setStyle("-fx-font-size:40px;-fx-text-fill:black");







        root7.getChildren().addAll(ta_1,bt_hi,lb_hi);
        scene7 = new Scene(root7, 650, 525);





        Button bt7 = new Button("History");
        bt7.setLayoutX(60);
        bt7.setLayoutY(70);
        bt7.setPrefWidth(100);
        bt7.setPrefHeight(40);
        bt7.setStyle("-fx-font-size:16px");
        bt7.setOnAction(e ->{
            primaryStage.setScene(scene7);
            readfile(ta_1);

        });

//------------------------------------------------


        Pane root = new Pane();
        root.getChildren().addAll( first,bt1, bt2, bt3, bt4, bt5, bt6,bt7, lb);
        scene1 = new Scene(root, 650, 525);
        primaryStage.setScene(scene1);
        primaryStage.show();



        //---------------------------------------------------------------------(Fixed Deposits)

        Image FD_img = new Image("locker.jpg");
        ImageView second = new ImageView();
        second.setImage(FD_img);
        second.setFitWidth(650);
        second.setFitHeight(525);


        Label lb1_f = new Label("Fixed Deposit");
        lb1_f.setLayoutX(200);
        lb1_f.setLayoutY(30);
        lb1_f.setStyle("-fx-font-size:40px;-fx-text-alignment:center");

        Label lb2_f = new Label("Principle Amount");
        lb2_f.setLayoutX(25);
        lb2_f.setLayoutY(130);
        lb2_f.setStyle("-fx-font-size:22px");

        Label lb3_f = new Label("Interest Rate");
        lb3_f.setLayoutX(25);
        lb3_f.setLayoutY(195);
        lb3_f.setStyle("-fx-font-size:22px");

        Label lb4_f = new Label("Period");
        lb4_f.setLayoutX(25);
        lb4_f.setLayoutY(260);
        lb4_f.setStyle("-fx-font-size:22px");

        Label lb5_f = new Label("Future Value");
        lb5_f.setLayoutX(25);
        lb5_f.setLayoutY(325);
        lb5_f.setStyle("-fx-font-size:22px");


        TextField tf1_f = new TextField();
        tf1_f.setLayoutX(210);
        tf1_f.setLayoutY(130);
        tf1_f.setPrefWidth(180);
        tf1_f.setPrefHeight(34);

        TextField tf2_f = new TextField();
        tf2_f.setLayoutX(210);
        tf2_f.setLayoutY(195);
        tf2_f.setPrefWidth(180);
        tf2_f.setPrefHeight(34);

        TextField tf3_f = new TextField();
        tf3_f.setLayoutX(210);
        tf3_f.setLayoutY(260);
        tf3_f.setPrefWidth(180);
        tf3_f.setPrefHeight(34);

        TextField tf4_f = new TextField();
        tf4_f.setLayoutX(210);
        tf4_f.setLayoutY(325);
        tf4_f.setPrefWidth(180);
        tf4_f.setPrefHeight(34);


        Button bt_1 = new Button("Back");
        bt_1.setLayoutX(100);
        bt_1.setLayoutY(450);
        bt_1.setPrefWidth(100);
        bt_1.setPrefHeight(40);
        bt_1.setStyle("-fx-font-size:15px");
        bt_1.setOnAction(e -> primaryStage.setScene(scene1));


        Button bt_2 = new Button("Calculate");
        bt_2.setLayoutX(400);
        bt_2.setLayoutY(450);
        bt_2.setPrefWidth(120);
        bt_2.setPrefHeight(40);
        bt_2.setStyle("-fx-font-size:15px");
        bt_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double r = Double.parseDouble(tf2_f.getText()) / 100; //interest rate
                double p = Double.parseDouble(tf1_f.getText()); //principle value
                double t = Double.parseDouble(tf3_f.getText()); //Period in years
                double fv = p * (Math.pow(1 + r / 12, 12 * t)); //future value calculation
                tf4_f.setText(decimalFormat.format(fv)); //future value
                addfile(tf1_f,tf2_f,tf3_f,tf4_f,"Principle amount","Interest Rate","Period","Future Value","FIXED DEPOSIT");
            }
        });

        Button bt_3 = new Button("Clear All");
        bt_3.setLayoutX(470);
        bt_3.setLayoutY(330);
        bt_3.setPrefWidth(100);
        bt_3.setPrefHeight(40);
        bt_3.setStyle("-fx-font-size:15px");
        bt_3.setOnAction(event -> {
            tf1_f.clear();
            tf2_f.clear();
            tf3_f.clear();
            tf4_f.clear();
        });


        Pane root2 = new Pane();
        //TextField 1
        tf1_f.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root2.getChildren().addAll(keyboard.keyboard1(tf1_f));

            }
        });
        //TextField 2
        tf2_f.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root2.getChildren().addAll(keyboard.keyboard1(tf2_f));

            }
        });
        //TextField 3
        tf3_f.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root2.getChildren().addAll(keyboard.keyboard1(tf3_f));

            }
        });
        //TextField 4
        tf4_f.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root2.getChildren().addAll(keyboard.keyboard1(tf4_f));

            }
        });


        root2.getChildren().addAll(second, lb1_f, lb2_f, lb3_f, lb4_f, lb5_f, tf1_f, tf2_f, tf3_f, tf4_f, bt_1, bt_2,bt_3);
        scene2 = new Scene(root2, 650, 525);


        //-------------------------------------------------------------------(savings)

        Image saving_img = new Image("saved.jpg");
        ImageView third = new ImageView();
        third.setImage(saving_img);
        third.setFitWidth(650);
        third.setFitHeight(525);


        Label lb1_s = new Label("Savings");
        lb1_s.setLayoutX(200);
        lb1_s.setLayoutY(10);
        lb1_s.setStyle("-fx-font-size:40px;-fx-text-alignment:center");

        Label lb2_s = new Label("Principle amount");
        lb2_s.setLayoutX(25);
        lb2_s.setLayoutY(90);
        lb2_s.setStyle("-fx-font-size:22px");

        Label lb3_s = new Label("Interest Rate");
        lb3_s.setLayoutX(25);
        lb3_s.setLayoutY(150);
        lb3_s.setStyle("-fx-font-size:22px");

        Label lb4_s = new Label("Period");
        lb4_s.setLayoutX(25);
        lb4_s.setLayoutY(230);
        lb4_s.setStyle("-fx-font-size:22px");


        Label lb5_s = new Label("Monthly Payment");
        lb5_s.setLayoutX(25);
        lb5_s.setLayoutY(310);
        lb5_s.setStyle("-fx-font-size:22px");

        Label lb6_s = new Label("Future Value");
        lb6_s.setLayoutX(25);
        lb6_s.setLayoutY(390);
        lb6_s.setStyle("-fx-font-size:22px");

        TextField tf1_s = new TextField();
        tf1_s.setLayoutX(210);
        tf1_s.setLayoutY(90);
        tf1_s.setPrefWidth(180);
        tf1_s.setPrefHeight(34);

        TextField tf2_s = new TextField();
        tf2_s.setLayoutX(210);
        tf2_s.setLayoutY(150);
        tf2_s.setPrefWidth(180);
        tf2_s.setPrefHeight(34);

        TextField tf3_s = new TextField();
        tf3_s.setLayoutX(210);
        tf3_s.setLayoutY(230);
        tf3_s.setPrefWidth(180);
        tf3_s.setPrefHeight(34);

        TextField tf4_s = new TextField();
        tf4_s.setLayoutX(210);
        tf4_s.setLayoutY(310);
        tf4_s.setPrefWidth(180);
        tf4_s.setPrefHeight(34);

        TextField tf5_s = new TextField();
        tf5_s.setLayoutX(210);
        tf5_s.setLayoutY(390);
        tf5_s.setPrefWidth(180);
        tf5_s.setPrefHeight(34);


        Button bt1_s = new Button("Back");
        bt1_s.setLayoutX(100);
        bt1_s.setLayoutY(450);
        bt1_s.setPrefWidth(100);
        bt1_s.setPrefHeight(40);
        bt1_s.setStyle("-fx-font-size:15px");
        bt1_s.setOnAction(e -> primaryStage.setScene(scene1));

        Button bt2_s = new Button("Calculate");
        bt2_s.setLayoutX(400);
        bt2_s.setLayoutY(450);
        bt2_s.setPrefWidth(120);
        bt2_s.setPrefHeight(40);
        bt2_s.setStyle("-fx-font-size:20px");
        bt2_s.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double p = Double.parseDouble(tf1_s.getText());  //principle amount
                double pmt = Double.parseDouble(tf4_s.getText()); //monthly payment
                double t = Double.parseDouble(tf3_s.getText()); //period
                double r = Double.parseDouble(tf2_s.getText())/100; //interest rate
                double A = pmt * (((Math.pow(1 + r / 12, 12 * t)) - 1) / (r / 12)) + p * (Math.pow(1 + r / 12, 12 * t)); //future value calculation
                tf5_s.setText(decimalFormat.format(A)); //future value
                addfile1(tf1_s,tf2_s,tf3_s,tf4_s,tf5_s,"Principle amount","Interest Rate","Period","Monthly Payment","Future Value","SAVINGS");
            }
        });



        Button bt3_s = new Button("Clear All");
        bt3_s.setLayoutX(470);
        bt3_s.setLayoutY(330);
        bt3_s.setPrefWidth(100);
        bt3_s.setPrefHeight(40);
        bt3_s.setStyle("-fx-font-size:15px");
        bt3_s.setOnAction(event -> {
            tf1_s.clear();
            tf2_s.clear();
            tf3_s.clear();
            tf4_s.clear();
            tf5_s.clear();
        });


        Pane root3 = new Pane();
        //TextField 1
        tf1_s.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root3.getChildren().addAll(keyboard.keyboard1(tf1_s));

            }
        });
        //TextField 2
        tf2_s.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root3.getChildren().addAll(keyboard.keyboard1(tf2_s));

            }
        });
        //TextField 3
        tf3_s.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root3.getChildren().addAll(keyboard.keyboard1(tf3_s));

            }
        });
        //TextField 4
        tf4_s.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root3.getChildren().addAll(keyboard.keyboard1(tf4_s));

            }
        });
        //TextField 5
        tf5_s.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root3.getChildren().addAll(keyboard.keyboard1(tf5_s));

            }
        });
        root3.getChildren().addAll(third, lb1_s, lb2_s, lb3_s, lb4_s, lb5_s, lb6_s, tf1_s, tf2_s, tf3_s, tf4_s, tf5_s, bt1_s, bt2_s,bt3_s);
        scene3 = new Scene(root3, 650, 525);


        //------------------------------------------------------------------(Loans)


        Image Loan_img = new Image("lloan.jpg");
        ImageView fourth = new ImageView();
        fourth.setImage(Loan_img);
        fourth.setFitWidth(650);
        fourth.setFitHeight(525);



        Label lb1_L = new Label("Loans");
        lb1_L.setLayoutX(240);
        lb1_L.setLayoutY(10);
        lb1_L.setStyle("-fx-font-size:40px;-fx-text-alignment:center;-fx-text-fill:black");

        Label lb2_L = new Label("Principle amount");
        lb2_L.setLayoutX(25);
        lb2_L.setLayoutY(100);
        lb2_L.setStyle("-fx-font-size:22px;-fx-text-fill:white");


        Label lb3_L = new Label("Interest Rate");
        lb3_L.setLayoutX(25);
        lb3_L.setLayoutY(180);
        lb3_L.setStyle("-fx-font-size:22px;-fx-text-fill:white");

        Label lb4_L = new Label("Period");
        lb4_L.setLayoutX(25);
        lb4_L.setLayoutY(260);
        lb4_L.setStyle("-fx-font-size:22px;-fx-text-fill:white");


        Label lb5_L = new Label("Monthly Payment");
        lb5_L.setLayoutX(25);
        lb5_L.setLayoutY(340);
        lb5_L.setStyle("-fx-font-size:22px;-fx-text-fill:white");


        TextField tf1_L = new TextField();
        tf1_L.setLayoutX(210);
        tf1_L.setLayoutY(100);
        tf1_L.setPrefWidth(180);
        tf1_L.setPrefHeight(34);

        TextField tf2_L = new TextField();
        tf2_L.setLayoutX(210);
        tf2_L.setLayoutY(180);
        tf2_L.setPrefWidth(180);
        tf2_L.setPrefHeight(34);

        TextField tf3_L = new TextField();
        tf3_L.setLayoutX(210);
        tf3_L.setLayoutY(260);
        tf3_L.setPrefWidth(180);
        tf3_L.setPrefHeight(34);


        TextField tf4_L = new TextField();
        tf4_L.setLayoutX(210);
        tf4_L.setLayoutY(340);
        tf4_L.setPrefWidth(180);
        tf4_L.setPrefHeight(34);


        Button bt1_L = new Button("Back");
        bt1_L.setLayoutX(100);
        bt1_L.setLayoutY(450);
        bt1_L.setPrefWidth(100);
        bt1_L.setPrefHeight(40);
        bt1_L.setOnAction(e -> primaryStage.setScene(scene1));

        Button bt2_L = new Button("Calculate");
        bt2_L.setLayoutX(400);
        bt2_L.setLayoutY(450);
        bt2_L.setPrefWidth(120);
        bt2_L.setPrefHeight(40);
        bt2_L.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double r = Double.parseDouble(tf2_L.getText())/100 ;//interest rating
                double t = Double.parseDouble(tf3_L.getText());
                double p = Double.parseDouble(tf1_L.getText());

               double n=12;
               double x1=Math.pow(1+(r/n),(t*n));
               double x2=p*(r/n);
               double x3 =x1*x2;
               double x4=x1- 1;
               double x5= x3/x4;
               double mo_pay= (x5*100.0)/100.0;
                tf4_L.setText(decimalFormat.format(mo_pay));
                addfile(tf1_L,tf2_L,tf3_L,tf4_L,"Principle amount ","Interest Rate","Period","Monthly Payment","LOANS");

            }
        });

        Button bt3_L=new Button("Clear");
        bt3_L.setLayoutX(460);
        bt3_L.setLayoutY(340);
        bt3_L.setPrefWidth(80);
        bt3_L.setPrefHeight(40);
        bt3_L.setOnAction(event -> {
            tf1_L.clear();
            tf2_L.clear();
            tf3_L.clear();
            tf4_L.clear();

        });


        Pane root4 = new Pane();
        //TextField 1
        tf1_L.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root4.getChildren().addAll(keyboard.keyboard1(tf1_L));

            }
        });
        //TextField 2
        tf2_L.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root4.getChildren().addAll(keyboard.keyboard1(tf2_L));

            }
        });
        //TextField 3
        tf3_L.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root4.getChildren().addAll(keyboard.keyboard1(tf3_L));

            }
        });
        //TextField 4
        tf4_L.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root4.getChildren().addAll(keyboard.keyboard1(tf4_L));

            }
        });

        root4.getChildren().addAll(fourth, lb1_L, lb2_L, lb3_L, lb4_L, lb5_L, tf1_L, tf2_L, tf3_L, tf4_L, bt1_L, bt2_L,bt3_L);
        scene4 = new Scene(root4, 650, 525);


        //---------------------------------------------------------------(Mortgage)

        Image Mort_img = new Image("wall.jpg");
        ImageView fifth = new ImageView();
        fifth.setImage(Mort_img);
        fifth.setFitWidth(650);
        fifth.setFitHeight(525);


        Label lb1_MOR = new Label("Mortgage");
        lb1_MOR.setLayoutX(240);
        lb1_MOR.setLayoutY(10);
        lb1_MOR.setStyle("-fx-font-size:40px;-fx-text-alignment:center;-fx-text-fill:white");

        Label lb2_MOR = new Label("Principle amount");
        lb2_MOR.setLayoutX(25);
        lb2_MOR.setLayoutY(80);
        lb2_MOR.setStyle("-fx-font-size:22px;-fx-text-fill:white");

        Label lb3_MOR = new Label("Down Payment");
        lb3_MOR.setLayoutX(25);
        lb3_MOR.setLayoutY(150);
        lb3_MOR.setStyle("-fx-font-size:22px;-fx-text-fill:white");

        Label lb4_MOR = new Label("Interest Rate");
        lb4_MOR.setLayoutX(25);
        lb4_MOR.setLayoutY(220);
        lb4_MOR.setStyle("-fx-font-size:22px;-fx-text-fill:white");


        Label lb5_MOR = new Label("Period");
        lb5_MOR.setLayoutX(25);
        lb5_MOR.setLayoutY(290);
        lb5_MOR.setStyle("-fx-font-size:21px;-fx-text-fill:white");

        Label lb6_MOR = new Label("Monthly Payment");
        lb6_MOR.setLayoutX(25);
        lb6_MOR.setLayoutY(360);
        lb6_MOR.setStyle("-fx-font-size:21px;-fx-text-fill:white");



        TextField tf1_MOR = new TextField();
        tf1_MOR.setLayoutX(210);
        tf1_MOR.setLayoutY(80);
        tf1_MOR.setPrefWidth(180);
        tf1_MOR.setPrefHeight(34);

        TextField tf2_MOR = new TextField();
        tf2_MOR.setLayoutX(210);
        tf2_MOR.setLayoutY(150);
        tf2_MOR.setPrefWidth(180);
        tf2_MOR.setPrefHeight(34);

        TextField tf3_MOR = new TextField();
        tf3_MOR.setLayoutX(210);
        tf3_MOR.setLayoutY(220);
        tf3_MOR.setPrefWidth(180);
        tf3_MOR.setPrefHeight(34);


        TextField tf4_MOR = new TextField();
        tf4_MOR.setLayoutX(210);
        tf4_MOR.setLayoutY(290);
        tf4_MOR.setPrefWidth(180);
        tf4_MOR.setPrefHeight(34);

        TextField tf5_MOR = new TextField();
        tf5_MOR.setLayoutX(210);
        tf5_MOR.setLayoutY(360);
        tf5_MOR.setPrefWidth(180);
        tf5_MOR.setPrefHeight(34);




        Button bt1_MOR = new Button("Back");      //back to the main window
        bt1_MOR.setLayoutX(100);
        bt1_MOR.setLayoutY(450);
        bt1_MOR.setPrefWidth(100);
        bt1_MOR.setPrefHeight(40);
        bt1_MOR.setStyle("-fx-font-size:15px");
        bt1_MOR.setOnAction(e -> primaryStage.setScene(scene1));


        Button bt2_MOR = new Button("Calculate");   //calculate my monthly payment
        bt2_MOR.setLayoutX(400);
        bt2_MOR.setLayoutY(450);
        bt2_MOR.setPrefWidth(120);
        bt2_MOR.setPrefHeight(40);
        bt2_MOR.setStyle("-fx-font-size:15px");
        bt2_MOR.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double p = Double.parseDouble(tf1_MOR.getText()); //principle amount
                double r = Double.parseDouble(tf3_MOR.getText())/100;//interest rating
                double d = Double.parseDouble(tf2_MOR.getText());//down payment
                double ti=Double.parseDouble(tf4_MOR.getText());//period

                double n=12;

                double mp1= ( (p-d) * (r/12) * Math.pow(1 + (r/n), n * ti) );
                double mp2=  (Math.pow(1 + (r/n), n * ti) - 1);
                double mp= mp1/mp2;


                tf5_MOR.setText(decimalFormat.format(mp));
                addfile1(tf1_MOR,tf2_MOR,tf3_MOR,tf4_MOR,tf5_MOR,"Principle amount","Down Payment","Interest Rate","Period","Monthly Payment","MORTGAGE");

            }
        });


        Button bt3_MOR=new Button("Clear");
        bt3_MOR.setLayoutX(460);
        bt3_MOR.setLayoutY(340);
        bt3_MOR.setPrefWidth(80);
        bt3_MOR.setPrefHeight(40);
        bt3_MOR.setOnAction(event -> {
            tf1_MOR.clear();
            tf2_MOR.clear();
            tf3_MOR.clear();
            tf4_MOR.clear();
            tf5_MOR.clear();
        });


        Pane root5 = new Pane();
        //TextField 1
        tf1_MOR.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root5.getChildren().addAll(keyboard.keyboard1(tf1_MOR));

            }
        });
        //TextField 2
        tf2_MOR.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root5.getChildren().addAll(keyboard.keyboard1(tf2_MOR));

            }
        });
        //TextField 3
        tf3_MOR.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root5.getChildren().addAll(keyboard.keyboard1(tf3_MOR));

            }
        });
        //TextField 4
        tf4_MOR.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root5.getChildren().addAll(keyboard.keyboard1(tf4_MOR));

            }
        });
        //TextField 5
        tf5_MOR.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root5.getChildren().addAll(keyboard.keyboard1(tf5_MOR));

            }
        });


        root5.getChildren().addAll(fifth, lb1_MOR, lb2_MOR, lb3_MOR, lb4_MOR, lb5_MOR,lb6_MOR, tf1_MOR, tf2_MOR, tf3_MOR, tf4_MOR,tf5_MOR, bt1_MOR, bt2_MOR,bt3_MOR);
        scene5 = new Scene(root5, 650, 525);


        //--------------------------------------------------------(Help)


        Image help_img = new Image("eek.jpg");
        ImageView six = new ImageView();
        six.setImage(help_img);
        six.setFitWidth(650);
        six.setFitHeight(525);

        Label lb1_hel = new Label("HELP");
        lb1_hel.setLayoutX(240);
        lb1_hel.setLayoutY(10);
        lb1_hel.setStyle("-fx-font-size:70px;-fx-text-alignment:center");


        Button bt1_hel = new Button("Back");
        bt1_hel.setLayoutX(100);
        bt1_hel.setLayoutY(450);
        bt1_hel.setPrefWidth(100);
        bt1_hel.setPrefHeight(40);
        bt1_hel.setStyle("-fx-font-size:15px");
        bt1_hel.setOnAction(e -> primaryStage.setScene(scene1));


        Pane root6 = new Pane();
        root6.getChildren().addAll(six, lb1_hel, bt1_hel);
        scene6 = new Scene(root6, 650, 525);



    }
    //4_textfield file adding
    public void addfile(TextField t1 ,TextField t2,TextField t3,TextField t4,String s1,String s2,String s3,String s4,String s5){
        File file=new File("history.txt");
        PrintWriter p_w;
        FileWriter f_w;
        try{
            f_w=new FileWriter(file,true);
            p_w=new PrintWriter(f_w,true);


            p_w.println(s5);
            p_w.println(s1+"="+t1.getText());
            p_w.println(s2+"="+t2.getText());
            p_w.println(s3+"="+t3.getText());
            p_w.println(s4+"="+t4.getText());
            p_w.println("------------------------------");
            p_w.close();

        }catch (IOException e){
            System.out.println("error");
        }
    }
    //5_Textfield file adding
    public void addfile1(TextField t1 ,TextField t2,TextField t3,TextField t4, TextField t5,String s1,String s2,String s3,String s4,String s5,String s6){
        File file=new File("history.txt");
        PrintWriter p_w;
        FileWriter f_w;
        try{
            f_w=new FileWriter(file,true);
            p_w=new PrintWriter(f_w,true);

            p_w.println(s6);
            p_w.println(s1+"="+t1.getText());
            p_w.println(s2+"="+t2.getText());
            p_w.println(s3+"="+t3.getText());
            p_w.println(s4+"="+t4.getText());
            p_w.println(s5+"="+t5.getText());
            p_w.println("------------------------------");
            p_w.close();

        }catch (IOException e){
            System.out.println("error");
        }
    }
    //show to text file
    public void readfile(TextArea l1){

        try{
            FileReader fr=new FileReader("history.txt");
            BufferedReader br= new BufferedReader(fr);

            String str;
            while ((str=br.readLine())!=null){
                String m=l1.getText();

                l1.setText(m+str+"\n");
            }
            br.close();
        }catch (IOException e){
            System.out.println("file not found");
        }

    }
    //show to text file
    public void help(TextArea l1){

        try{
            FileReader fr=new FileReader("help.txt");
            BufferedReader br= new BufferedReader(fr);

            String str;
            while ((str=br.readLine())!=null){
                String m=l1.getText();

                l1.setText(m+str+"\n");
            }
            br.close();
        }catch (IOException e){
            System.out.println("file not found");
        }

    }






}



