package Projekt;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;


public class Zasady
{
    public static void xD (String Title)
    {
        Stage window = new Stage();
        window.setTitle(Title);

        Label zasady = new Label("Zasady gry:");

        zasady.setTranslateY(-250);
        zasady.setFont(Font.font("Verdana",40));
        zasady.setTextFill(Color.RED);

        Label tekst = new Label();
        tekst.setText("Zadaniem gracza/graczy jest jak najszybsze pokonanie całej planszy. Zwycięży  tylko ten gracz, który wykaże się rozległą wiedzą z odpowiednich dziedzin " +
                "oraz odrobiną szczęścia. Błędna odpowiedź oznacza utratę kolejki. Dodatkowe pytania można dopisywać do dokumentów .txt znajdujących się w folderze z grą" +
                " w Projekt_WJP\\src\\Pytania.");
        tekst.setWrapText(true);
        tekst.setTextAlignment(TextAlignment.CENTER);
        tekst.setTranslateY(-175);
        tekst.setMaxSize(800,300);
        tekst.setFont(Font.font("Verdana",20));

        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();

        label1.setTranslateY(-75);
        label1.setText("Mam nadzieję, że wiesz gdzie leży Mont Everest");
        label1.setFont(Font.font("Verdana",20));
        label1.setMaxSize(600,100);
        label1.setTextAlignment(TextAlignment.CENTER);

        label2.setTranslateY(25);
        label2.setText("Tutaj natchniesz się na pytania z Historii");
        label2.setFont(Font.font("Verdana",20));
        label2.setMaxSize(600,100);
        label2.setTextAlignment(TextAlignment.CENTER);

        label3.setTranslateY(125);
        label3.setText("Nauki ścisłe (na Twoje nieszczęście wszystkie...)");
        label3.setFont(Font.font("Verdana",20));
        label3.setMaxSize(600,100);
        label3.setTextAlignment(TextAlignment.CENTER);

        label4.setTranslateY(225);
        label4.setText("Z pozostałych dziedzin");
        label4.setFont(Font.font("Verdana",20));
        label4.setMaxSize(600,100);
        label4.setTextAlignment(TextAlignment.CENTER);

        javafx.scene.shape.Rectangle rectangle1 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle2 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle3 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle4 = new javafx.scene.shape.Rectangle();

        rectangle1.setTranslateX(-350);
        rectangle1.setTranslateY(-75);
        rectangle1.setWidth(50);
        rectangle1.setHeight(50);
        rectangle1.setFill(Color.rgb(194,60,164));

        rectangle2.setTranslateX(-350);
        rectangle2.setTranslateY(25);
        rectangle2.setWidth(50);
        rectangle2.setHeight(50);
        rectangle2.setFill(Color.rgb(87,167,194));

        rectangle3.setTranslateX(-350);
        rectangle3.setTranslateY(125);
        rectangle3.setWidth(50);
        rectangle3.setHeight(50);
        rectangle3.setFill(Color.rgb(130,194,84));

        rectangle4.setTranslateX(-350);
        rectangle4.setTranslateY(225);
        rectangle4.setWidth(50);
        rectangle4.setHeight(50);
        rectangle4.setFill(Color.rgb(193,194,51));

        Button button = new Button("Zaczynamy!");
        button.setTranslateX(350);
        button.setTranslateY(50);
        button.setPrefSize(200,100);
        button.setOnAction(e->
                {
                    Pierwsze_Okno.gracze("Happy Knowledge");
                    window.close();
                }
        );



        StackPane layout1 = new StackPane();
        Scene scene = new Scene (layout1,1000,600);
        layout1.getChildren().addAll(zasady,tekst,label1,label2,label3,label4,rectangle1,rectangle2,rectangle3,rectangle4,button);
        window.setScene(scene);

        window.show();
    }
}
