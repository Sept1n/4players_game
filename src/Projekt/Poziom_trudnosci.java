package Projekt;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Poziom_trudnosci
{

    static int trudnosc;

    public static void poziom (String Title)
    {
        Stage window = new Stage();
        window.setTitle(Title);
        Label poziom_trudnosci = new Label("Wybierz poziom trudności");
        poziom_trudnosci.setTranslateY(-250);
        poziom_trudnosci.setFont(Font.font("Verdana",40));
        poziom_trudnosci.setTextFill(Color.RED);

        HBox downMenu = new HBox();
        Button poziom_trudnosci_1 = new Button ("Latwy");
        Button poziom_trudnosci_2 = new Button ("Trudny");
        downMenu.getChildren().addAll(poziom_trudnosci,poziom_trudnosci_1,poziom_trudnosci_2);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(downMenu);

        poziom_trudnosci_1.setTranslateX(-200);
        poziom_trudnosci_2.setTranslateX(200);
        poziom_trudnosci_1.setPrefSize(200,100);
        poziom_trudnosci_2.setPrefSize(200,100);


        poziom_trudnosci_1.setOnAction( e ->
        {
            trudnosc=1;
            Dodawanie_pytan.dodawanie("Happy Knowledge");
            window.close();
        });

        poziom_trudnosci_2.setOnAction( e ->
        {
            trudnosc=2;
            Dodawanie_pytan.dodawanie("Happy Knowledge");
            window.close();
        });


        StackPane layout1 = new StackPane();
        Scene scene = new Scene (layout1,1000,600);
        layout1.getChildren().addAll(poziom_trudnosci,poziom_trudnosci_1,poziom_trudnosci_2);
        window.setScene(scene);
        window.show();
    }


}
