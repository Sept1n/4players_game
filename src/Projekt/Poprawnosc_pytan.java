package Projekt;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static Projekt.Dodawanie_pytan.*;


public class Poprawnosc_pytan
{
    public static void pytania(String Title)
    {

        if ( sprawdzenie==1 )
        {

            Stage window = new Stage();
            window.setTitle(Title);
            window.initModality(Modality.APPLICATION_MODAL);

            Button git = new Button ("Dodano");

            git.setOnAction(e->
                    {
                        window.close();
                    }
            );


            StackPane layout1 = new StackPane();
            Scene scene = new Scene(layout1, 200, 100);
            layout1.getChildren().addAll(git);
            window.setScene(scene);

            window.show();
        }

        if ( sprawdzenie==2 )
        {

            Stage window = new Stage();
            window.setTitle(Title);
            window.initModality(Modality.APPLICATION_MODAL);

            Button git = new Button ("Błąd");

            git.setOnAction(e->
                    {
                        window.close();
                    }
            );

            StackPane layout1 = new StackPane();
            Scene scene = new Scene(layout1, 200, 100);
            layout1.getChildren().addAll(git);
            window.setScene(scene);

            window.show();
        }
    }
}
