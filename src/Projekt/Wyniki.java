package Projekt;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static Projekt.Gra.*;

public class Wyniki
{
    public static void podsumowanie (String Title)
    {
        Stage window = new Stage();
        window.setTitle(Title);

        Button button1 = new Button("Zagraj jeszcze raz");
        Button button2 = new Button("Wyjdź");
        Label wyniki = new Label("Zwyciężył");

        button1.setTranslateX(200);
        button1.setTranslateY(200);
        button1.setPrefSize(200,100);
        button1.setVisible(true);
        button1.setOnAction(e->
                {
                    window.close();
                    Pierwsze_Okno.gracze("Happy Knowledge");
                    gracz1.setText("Gracz 1");
                    gracz2.setText("Gracz 2");
                    gracz3.setText("Gracz 3");
                    gracz4.setText("Gracz 4");
                    z=1;
                    gracz1.setTextFill(Color.RED);
                    gracz2.setTextFill(Color.BLACK);
                    gracz3.setTextFill(Color.BLACK);
                    gracz4.setTextFill(Color.BLACK);
                }
        );

        button2.setTranslateX(-200);
        button2.setTranslateY(200);
        button2.setPrefSize(200,100);
        button2.setVisible(true);
        button2.setOnAction(e->
                {
                    window.close();
                }
        );

        wyniki.setTranslateX(0);
        wyniki.setTranslateY(-250);
        wyniki.setVisible(true);
        wyniki.setFont(Font.font("Verdana",40));

        Label label1 = new Label();

        label1.setTranslateX(40);
        label1.setTranslateY(-50);
        label1.setFont(Font.font("Verdana",60));
        label1.setMaxSize(300,100);
        label1.setTextFill(Color.RED);

        if(pionek1.getTranslateX() == 430 && pionek1.getTranslateY() == -250)
        {
            label1.setText("Gracz 1");
        }
        if(pionek2.getTranslateX() == 470 && pionek2.getTranslateY() == -250)
        {
            label1.setText("Gracz 2");
        }
        if(pionek3.getTranslateX() == 430 && pionek3.getTranslateY() == -220)
        {
            label1.setText("Gracz 3");
        }
        if(pionek4.getTranslateX() == 470 && pionek4.getTranslateY() == -220)
        {
            label1.setText("Gracz 4");
        }

        StackPane layout1 = new StackPane();
        Scene scene = new Scene (layout1,1000,600);
        layout1.getChildren().addAll(button1,button2,wyniki,label1);
        window.setScene(scene);
        window.show();
    }
}
