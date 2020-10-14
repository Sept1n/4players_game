package Projekt;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application
{

    Button przycisk1;
    Button przycisk2;
    Button przycisk3;

    public static void main(String[] args)
    {
	    launch(args);
    }

    public void start (Stage pierwsza) throws Exception
    {
        Wczytywanie_pytan.wczytywanie();
        pierwsza.setTitle("Happy Knowledge");
        przycisk1 = new Button("Rozpocznij grę");
        przycisk1.setTranslateX(0);
        przycisk1.setTranslateY(-100);
        przycisk1.setOnAction(e->
                {
                    Pierwsze_Okno.gracze("Happy Knowledge");
                    pierwsza.close();
                }
        );
        przycisk2 = new Button("Zasady");
        przycisk2.setTranslateX(200);
        przycisk2.setTranslateY(100);
        przycisk2.setOnAction(e->
                {
                    Zasady.xD("Happy Knowledge");
                    pierwsza.close();
                }
        );
        przycisk3 = new Button("Dodaj pytania");
        przycisk3.setTranslateX(-200);
        przycisk3.setTranslateY(100);
        przycisk3.setOnAction(e->
                {
                    Kategoria.kategoria("Happy Knowldge");
                    pierwsza.close();
                }
        );
        StackPane panel = new StackPane();
        przycisk1.setPrefSize(200,100);
        przycisk2.setPrefSize(200,100);
        przycisk3.setPrefSize(200,100);

        panel.getChildren().addAll(przycisk1,przycisk2,przycisk3);
        Scene scena = new Scene(panel,1000,600);
        pierwsza.setScene(scena);
        pierwsza.show();
    }
}
