package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField value;

    @FXML
    private Button currency;

    @FXML
    private Label resultOfCurrency;

    @FXML
    private Button temperature;

    @FXML
    private Label resultOfTemperature;

    @FXML
    private Button weight;

    @FXML
    private Label resultOfWeight;

    @FXML
    private Button height;

    @FXML
    private Label resultOfHeight;

    @FXML
    private Button speed;

    @FXML
    private Label resultOfSpeed;

    @FXML
    private Button size;

    @FXML
    private Label resultOfSize;

    @FXML
    private void click1(ActionEvent event){
        try {
            System.out.println("You clicked me!");
            int eur = Integer.valueOf(value.getText());
            double result;
            double course = 1.129885;

            result = eur * course;

            if (result < 0){
                resultOfCurrency.setText("ERROR! Try to write positive number :)");
            }else if (eur > 1_000_000) {
                resultOfCurrency.setText("U haven`t got all that money!");
            }else resultOfCurrency.setText(" = " + result + " USD");

        }catch (NumberFormatException e) {
            resultOfCurrency.setText("ERROR! Try to write some number :)");
        }
    }

    @FXML
    private void click2(ActionEvent event){
        try {
            System.out.println("You clicked me!");
            int celsius = Integer.valueOf(value.getText());
            double result;

            result = celsius * 9 / 5 + 32;;

            if (celsius > 10000){
                resultOfTemperature.setText("U have defenitely burnt.");
            }else if (celsius < -1000){
                resultOfTemperature.setText("U have defenitely frozen.");
            }
            else resultOfTemperature.setText(" = " + Math.round(result) + " °F");

        }catch (NumberFormatException e){
            resultOfTemperature.setText("ERROR! Try to write some number :)");
        }
    }

    @FXML
    private void click3(ActionEvent event){
        try {
            System.out.println("You clicked me!");
            int kg = Integer.valueOf(value.getText());
            double result;
            double libras = 2.2046;

            result = kg * libras;

            if (result < 0){
                resultOfWeight.setText("ERROR! Try to write positive number :)");
            }else if (kg > 500){
                resultOfWeight.setText("Sorry :( U r too fat.");
            }else resultOfWeight.setText(" = " + result + " lb");

        }catch (NumberFormatException e){
            resultOfWeight.setText("ERROR! Try to write some number :)");
        }
    }

    @FXML
    private void click4(ActionEvent event){
        try {
            System.out.println("You clicked me!");
            int heigh = Integer.valueOf(value.getText());
            double result;
            double foot = 30.48;

            result = heigh / foot;

            if (result < 0){
                resultOfHeight.setText("ERROR! Try to write positive number :)");
            }else if (heigh > 300){
                resultOfHeight.setText("Too tall guy :(");
            }else resultOfHeight.setText(" = " + Math.round(result) + " ft");

        }catch (NumberFormatException e){
            resultOfHeight.setText("ERROR! Try to write some number :)");
        }
    }

    @FXML
    private void click5(ActionEvent event){
        try {
            System.out.println("You clicked me!");
            int km = Integer.valueOf(value.getText());
            double result;
            double miles = 0.621371192;

            result = km * miles;


            if (result < 0){
                resultOfSpeed.setText("ERROR! Try to write positive number :)");
            } else if (km > 100_000_000){
                resultOfSpeed.setText("U r too fast...:)");
            }
            else resultOfSpeed.setText(" = " + Math.round(result) + " mph");

        }catch (NumberFormatException e){
            resultOfSpeed.setText("ERROR! Try to write some number :)");
        }
    }

    @FXML
    private void click6(ActionEvent event){
        try {
            System.out.println("You clicked me!");
            int eu = Integer.valueOf(value.getText());
            double result;
            double cm = 1.53508772;

            result = eu / cm;

            if (result < 0){
                resultOfSize.setText("ERROR! Try to write positive number :)");
            }else if (eu < 17 || eu > 50){
                resultOfSize.setText("Size can be between 17 & 50");
            }else resultOfSize.setText(" = " + Math.round(result) + " cm");

        }catch (NumberFormatException e) {
            resultOfSize.setText("ERROR! Try to write some number :)");
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
