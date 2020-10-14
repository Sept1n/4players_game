package Projekt;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;

public class Kategoria
{

    static int kategorie;

    public static int kategoria (String Title)
    {
        Stage window = new Stage();
        window.setTitle(Title);

        Label liczba_graczy = new Label("Wybierz kategorię:");

        liczba_graczy.setTranslateY(-250);
        liczba_graczy.setFont(Font.font("Verdana",40));
        liczba_graczy.setTextFill(Color.RED);

        HBox downMenu = new HBox();
        Button geo = new Button ("Geografia");
        Button his = new Button ("Historia");
        Button scis = new Button ("Nauki ścisłe");
        Button inne = new Button ("Inne");
        downMenu.getChildren().addAll(geo, his, scis, inne);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(downMenu);

        geo.setTranslateY(-100);
        his.setTranslateY(-100);
        scis.setTranslateY(100);
        inne.setTranslateY(100);
        geo.setTranslateX(-200);
        his.setTranslateX(200);
        scis.setTranslateX(-200);
        inne.setTranslateX(200);
        geo.setPrefSize(200,100);
        his.setPrefSize(200,100);
        inne.setPrefSize(200,100);
        scis.setPrefSize(200,100);


        geo.setOnAction( e ->
        {
            kategorie=1;
            Poziom_trudnosci.poziom("Happy Knowledge");
            window.close();
        });
        his.setOnAction( e ->
        {
            kategorie=2;
            Poziom_trudnosci.poziom("Happy Knowledge");
            window.close();
        });
        scis.setOnAction( e ->
        {
            kategorie=3;
            Poziom_trudnosci.poziom("Happy Knowledge");
            window.close();
        });
        inne.setOnAction( e ->
        {
            kategorie=4;
            Poziom_trudnosci.poziom("Happy Knowledge");
            window.close();
        });


        StackPane layout1 = new StackPane();
        Scene scene = new Scene (layout1,1000,600);
        layout1.getChildren().addAll(liczba_graczy,geo,his,scis,inne);
        window.setScene(scene);

        window.show();
        return kategorie;
    }
}
