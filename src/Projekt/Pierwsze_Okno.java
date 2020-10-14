package Projekt;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;


public class Pierwsze_Okno
{

   static int ilosc_graczy;


    public static int gracze (String Title)
    {
        Stage window = new Stage();
        window.setTitle(Title);

        Label liczba_graczy = new Label("Wybierz liczbę graczy");

        liczba_graczy.setTranslateY(-250);
        liczba_graczy.setFont(Font.font("Verdana",40));
        liczba_graczy.setTextFill(Color.RED);

        HBox downMenu = new HBox();
        Button liczba_graczy_1 = new Button ("1 Gracz");
        Button liczba_graczy_2 = new Button ("2 Graczy");
        Button liczba_graczy_3 = new Button ("3 Graczy");
        Button liczba_graczy_4 = new Button ("4 Graczy");
        downMenu.getChildren().addAll(liczba_graczy_1,liczba_graczy_2,liczba_graczy_3,liczba_graczy_4);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(downMenu);

        liczba_graczy_1.setTranslateY(-100);
        liczba_graczy_2.setTranslateY(-100);
        liczba_graczy_3.setTranslateY(100);
        liczba_graczy_4.setTranslateY(100);
        liczba_graczy_1.setTranslateX(-200);
        liczba_graczy_2.setTranslateX(200);
        liczba_graczy_3.setTranslateX(-200);
        liczba_graczy_4.setTranslateX(200);
        liczba_graczy_1.setPrefSize(200,100);
        liczba_graczy_2.setPrefSize(200,100);
        liczba_graczy_3.setPrefSize(200,100);
        liczba_graczy_4.setPrefSize(200,100);


        liczba_graczy_1.setOnAction( e ->
        {
            ilosc_graczy=1;
            Drugie_Okno.poziom("Happy Knowledge");
            window.close();
        });
        liczba_graczy_2.setOnAction( e ->
        {
            ilosc_graczy=2;
            Drugie_Okno.poziom("Happy Knowledge");
            window.close();
        });
        liczba_graczy_3.setOnAction( e ->
        {
            ilosc_graczy=3;
            Drugie_Okno.poziom("Happy Knowledge");
            window.close();
        });
        liczba_graczy_4.setOnAction( e ->
        {
            ilosc_graczy=4;
            Drugie_Okno.poziom("Happy Knowledge");
            window.close();
        });


        StackPane layout1 = new StackPane();
        Scene scene = new Scene (layout1,1000,600);
        layout1.getChildren().addAll(liczba_graczy,liczba_graczy_1,liczba_graczy_2,liczba_graczy_3,liczba_graczy_4);
        window.setScene(scene);

        window.show();
        return ilosc_graczy;
    }
}
