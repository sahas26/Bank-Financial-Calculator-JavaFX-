package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class keyboard {

    public static Pane keyboard1(TextField selected_text) {

            Pane pane1 = new Pane();
            pane1.setPrefHeight(150);
            pane1.setPrefWidth(250);
            pane1.setLayoutX(350);
            pane1.setLayoutY(10);


            //(keypad)
            Button bt_k1 = new Button("1");
            bt_k1.setLayoutX(100);
            bt_k1.setLayoutY(160);
            bt_k1.setPrefSize(50, 30);
            bt_k1.setStyle("-fx-background-color:LightCyan");
            bt_k1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("1");
                }
            });


            Button bt_k2 = new Button("2");
            bt_k2.setLayoutX(155);
            bt_k2.setLayoutY(160);
            bt_k2.setPrefSize(50, 30);
            bt_k2.setStyle("-fx-background-color:LightCyan");
            bt_k2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("2");
                }
            });

            Button bt_k3 = new Button("3");
            bt_k3.setLayoutX(210);
            bt_k3.setLayoutY(160);
            bt_k3.setPrefSize(50, 30);
            bt_k3.setStyle("-fx-background-color:LightCyan");
            bt_k3.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("3");
                }
            });

            Button bt_k4 = new Button("4");
            bt_k4.setLayoutX(100);
            bt_k4.setLayoutY(192);
            bt_k4.setPrefSize(50, 30);
            bt_k4.setStyle("-fx-background-color:LightCyan");
            bt_k4.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("4");
                }
            });

            Button bt_k5 = new Button("5");
            bt_k5.setLayoutX(155);
            bt_k5.setLayoutY(192);
            bt_k5.setPrefSize(50, 30);
            bt_k5.setStyle("-fx-background-color:LightCyan");
            bt_k5.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("5");
                }
            });

            Button bt_k6 = new Button("6");
            bt_k6.setLayoutX(210);
            bt_k6.setLayoutY(192);
            bt_k6.setPrefSize(50, 30);
            bt_k6.setStyle("-fx-background-color:LightCyan");
            bt_k6.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("6");
                }
            });

            Button bt_k7 = new Button("7");
            bt_k7.setLayoutX(100);
            bt_k7.setLayoutY(224);
            bt_k7.setPrefSize(50, 30);
            bt_k7.setStyle("-fx-background-color:LightCyan");
            bt_k7.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("7");
                }
            });

            Button bt_k8 = new Button("8");
            bt_k8.setLayoutX(155);
            bt_k8.setLayoutY(224);
            bt_k8.setPrefSize(50, 30);
            bt_k8.setStyle("-fx-background-color:LightCyan");
            bt_k8.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("8");
                }
            });

            Button bt_k9 = new Button("9");
            bt_k9.setLayoutX(210);
            bt_k9.setLayoutY(224);
            bt_k9.setPrefSize(50, 30);
            bt_k9.setStyle("-fx-background-color:LightCyan");
            bt_k9.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("9");
                }
            });

            Button bt_k10 = new Button(".");
            bt_k10.setLayoutX(100);
            bt_k10.setLayoutY(256);
            bt_k10.setPrefSize(50, 30);
            bt_k10.setStyle("-fx-background-color:LightCyan");
            bt_k10.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText(".");
                }
            });

            Button bt_k0 = new Button("0");
            bt_k0.setLayoutX(155);
            bt_k0.setLayoutY(256);
            bt_k0.setPrefSize(50, 30);
            bt_k0.setStyle("-fx-background-color:LightCyan");
            bt_k0.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    selected_text.appendText("0");
                }
            });

            Button bt_kc = new Button("C");
            bt_kc.setLayoutX(210);
            bt_kc.setLayoutY(256);
            bt_kc.setPrefSize(50, 30);
            bt_kc.setStyle("-fx-background-color:LightBlue");
            bt_kc.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    selected_text.setText(selected_text.getText().substring(0, selected_text.getText().length() - 1));
                }
            });


            pane1.getChildren().addAll(bt_k1, bt_k2, bt_k3, bt_k4, bt_k5, bt_k6, bt_k7, bt_k8, bt_k9, bt_k10, bt_k0, bt_kc);
            return pane1;


        }


    }


