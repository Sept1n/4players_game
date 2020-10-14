package Projekt;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import java.util.Random;
import static Projekt.Gra.*;
import static Projekt.Gra.gracz4;
import static Projekt.Gra.z;
import static Projekt.Wczytywanie_pytan.scis_lat;
import static Projekt.Wczytywanie_pytan.scis_tru;
public class Pyt_scis
{
    public static void pytania(String Title)
    {

        if(Drugie_Okno.poziom_trud==1) {

            Stage window = new Stage();
            window.setTitle(Title);
            window.initModality(Modality.APPLICATION_MODAL);
            window.setOnCloseRequest(e->e.consume());

            scis_lat.size();
            int a = scis_lat.size() / 5;
            Random rnd1 = new Random();
            int b = rnd1.nextInt(a);
            int c = b*5;

            Random rnd2 = new Random();
            int d = rnd2.nextInt(3);
            int f = d + 1 + c;

            Label pytanie = new Label();
            javafx.scene.control.Button odpowiedz1 = new javafx.scene.control.Button();
            javafx.scene.control.Button odpowiedz2 = new javafx.scene.control.Button();
            javafx.scene.control.Button odpowiedz3 = new javafx.scene.control.Button();
            javafx.scene.control.Button odpowiedz4 = new javafx.scene.control.Button();

            pytanie.setTranslateY(-75);
            pytanie.setText((String)scis_lat.get(c));
            pytanie.setFont(Font.font("Verdana", 20));
            pytanie.setTextAlignment(TextAlignment.CENTER);
            pytanie.setWrapText(true);

            odpowiedz1.setTranslateX(-350);
            odpowiedz1.setTranslateY(50);
            odpowiedz1.setTextAlignment(TextAlignment.CENTER);
            odpowiedz1.setWrapText(true);
            odpowiedz1.setTextAlignment(TextAlignment.CENTER);
            odpowiedz1.setPrefSize(200,100);
            odpowiedz1.setText((String)scis_lat.get(f));
            odpowiedz1.setOnAction(e ->
                    {
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz1.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz1.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_lat.get(c+1) != odpowiedz1.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 1 && scis_lat.get(c+1) != odpowiedz1.getText() && z==1))
                        {
                            gracz1.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz1.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz1.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_lat.get(c+1) != odpowiedz1.getText() && z==1))
                        {
                            gracz2.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz1.getText() && z==4) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz1.getText() && z==1))
                        {
                            gracz3.setText("Stoisz");
                        }
                        if ( scis_lat.get(c+1) != odpowiedz1.getText() && z==1)
                        {
                            gracz4.setText("Stoisz");
                        }

                        window.close();
                    }
            );

            odpowiedz2.setTranslateX(-125);
            odpowiedz2.setTranslateY(50);
            odpowiedz2.setWrapText(true);
            odpowiedz2.setTextAlignment(TextAlignment.CENTER);
            odpowiedz2.setPrefSize(200,100);
            if (f%5==1)
                odpowiedz2.setText((String)scis_lat.get(f+2));
            if (f%5==2)
                odpowiedz2.setText((String)scis_lat.get(f+2));
            if (f%5==3)
                odpowiedz2.setText((String)scis_lat.get(f-2));
            if (f%5==4)
                odpowiedz2.setText((String)scis_lat.get(f-2));
            odpowiedz2.setOnAction(e ->
                    {
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz2.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz2.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_lat.get(c+1) != odpowiedz2.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 1 && scis_lat.get(c+1) != odpowiedz2.getText() && z==1))
                        {
                            gracz1.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz2.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz2.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_lat.get(c+1) != odpowiedz2.getText() && z==1))
                        {
                            gracz2.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz2.getText() && z==4) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz2.getText() && z==1))
                        {
                            gracz3.setText("Stoisz");
                        }
                        if ( scis_lat.get(c+1) != odpowiedz2.getText() && z==1)
                        {
                            gracz4.setText("Stoisz");
                        }

                        window.close();
                    }
            );

            odpowiedz3.setTranslateX(125);
            odpowiedz3.setTranslateY(50);
            odpowiedz3.setWrapText(true);
            odpowiedz3.setTextAlignment(TextAlignment.CENTER);
            odpowiedz3.setPrefSize(200,100);
            if (f%5==1)
                odpowiedz3.setText((String)scis_lat.get(f+1));
            if (f%5==2)
                odpowiedz3.setText((String)scis_lat.get(f-1));
            if (f%5==3)
                odpowiedz3.setText((String)scis_lat.get(f-1));
            if (f%5==4)
                odpowiedz3.setText((String)scis_lat.get(f-1));
            odpowiedz3.setOnAction(e ->
                    {
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz3.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz3.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_lat.get(c+1) != odpowiedz3.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 1 && scis_lat.get(c+1) != odpowiedz3.getText() && z==1))
                        {
                            gracz1.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz3.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz3.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_lat.get(c+1) != odpowiedz3.getText() && z==1))
                        {
                            gracz2.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz3.getText() && z==4) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz3.getText() && z==1))
                        {
                            gracz3.setText("Stoisz");
                        }
                        if ( scis_lat.get(c+1) != odpowiedz3.getText() && z==1)
                        {
                            gracz4.setText("Stoisz");
                        }

                        window.close();
                    }
            );

            odpowiedz4.setTranslateX(350);
            odpowiedz4.setTranslateY(50);
            odpowiedz4.setWrapText(true);
            odpowiedz4.setTextAlignment(TextAlignment.CENTER);
            odpowiedz4.setPrefSize(200,100);
            if (f%5==1)
                odpowiedz4.setText((String)scis_lat.get(f+3));
            if (f%5==2)
                odpowiedz4.setText((String)scis_lat.get(f+1));
            if (f%5==3)
                odpowiedz4.setText((String)scis_lat.get(f+1));
            if (f%5==4)
                odpowiedz4.setText((String)scis_lat.get(f-3));
            odpowiedz4.setOnAction(e ->
                    {
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz4.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz4.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_lat.get(c+1) != odpowiedz4.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 1 && scis_lat.get(c+1) != odpowiedz4.getText() && z==1))
                        {
                            gracz1.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz4.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz4.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_lat.get(c+1) != odpowiedz4.getText() && z==1))
                        {
                            gracz2.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_lat.get(c+1) != odpowiedz4.getText() && z==4) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_lat.get(c+1) != odpowiedz4.getText() && z==1))
                        {
                            gracz3.setText("Stoisz");
                        }
                        if ( scis_lat.get(c+1) != odpowiedz4.getText() && z==1)
                        {
                            gracz4.setText("Stoisz");
                        }

                        window.close();
                    }
            );

            StackPane layout1 = new StackPane();
            Scene scene = new Scene(layout1, 1000, 300);
            layout1.getChildren().addAll(pytanie, odpowiedz1, odpowiedz2, odpowiedz3, odpowiedz4);
            window.setScene(scene);

            window.show();
        }

        if(Drugie_Okno.poziom_trud==2) {

            Stage window = new Stage();
            window.setTitle(Title);
            window.initModality(Modality.APPLICATION_MODAL);

            scis_tru.size();
            int a = scis_tru.size() / 5;
            Random rnd1 = new Random();
            int b = rnd1.nextInt(a);
            int c = b*5;

            Random rnd2 = new Random();
            int d = rnd2.nextInt(3);
            int f = d + 1 + c;

            Label pytanie = new Label();
            javafx.scene.control.Button odpowiedz1 = new javafx.scene.control.Button();
            javafx.scene.control.Button odpowiedz2 = new javafx.scene.control.Button();
            javafx.scene.control.Button odpowiedz3 = new javafx.scene.control.Button();
            javafx.scene.control.Button odpowiedz4 = new javafx.scene.control.Button();

            pytanie.setTranslateY(-75);
            pytanie.setText((String)scis_tru.get(c));
            pytanie.setFont(Font.font("Verdana", 20));
            pytanie.setTextAlignment(TextAlignment.CENTER);
            pytanie.setWrapText(true);

            odpowiedz1.setTranslateX(-350);
            odpowiedz1.setTranslateY(50);
            odpowiedz1.setWrapText(true);
            odpowiedz1.setTextAlignment(TextAlignment.CENTER);
            odpowiedz1.setPrefSize(200,100);
            odpowiedz1.setText((String)scis_tru.get(f));
            odpowiedz1.setOnAction(e ->
                    {
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz1.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz1.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_tru.get(c+1) != odpowiedz1.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 1 && scis_tru.get(c+1) != odpowiedz1.getText() && z==1))
                        {
                            gracz1.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz1.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz1.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_tru.get(c+1) != odpowiedz1.getText() && z==1))
                        {
                            gracz2.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz1.getText() && z==4) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz1.getText() && z==1))
                        {
                            gracz3.setText("Stoisz");
                        }
                        if ( scis_tru.get(c+1) != odpowiedz1.getText() && z==1)
                        {
                            gracz4.setText("Stoisz");
                        }

                        window.close();                    }
            );

            odpowiedz2.setTranslateX(-125);
            odpowiedz2.setTranslateY(50);
            odpowiedz2.setWrapText(true);
            odpowiedz2.setTextAlignment(TextAlignment.CENTER);
            odpowiedz2.setPrefSize(200,100);
            if (f%5==1)
                odpowiedz2.setText((String)scis_tru.get(f+2));
            if (f%5==2)
                odpowiedz2.setText((String)scis_tru.get(f+2));
            if (f%5==3)
                odpowiedz2.setText((String)scis_tru.get(f-2));
            if (f%5==4)
                odpowiedz2.setText((String)scis_tru.get(f-2));
            odpowiedz2.setOnAction(e ->
                    {
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz2.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz2.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_tru.get(c+1) != odpowiedz2.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 1 && scis_tru.get(c+1) != odpowiedz2.getText() && z==1))
                        {
                            gracz1.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz2.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz2.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_tru.get(c+1) != odpowiedz2.getText() && z==1))
                        {
                            gracz2.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz2.getText() && z==4) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz2.getText() && z==1))
                        {
                            gracz3.setText("Stoisz");
                        }
                        if ( scis_tru.get(c+1) != odpowiedz2.getText() && z==1)
                        {
                            gracz4.setText("Stoisz");
                        }

                        window.close();
                    }
            );

            odpowiedz3.setTranslateX(125);
            odpowiedz3.setTranslateY(50);
            odpowiedz3.setWrapText(true);
            odpowiedz3.setTextAlignment(TextAlignment.CENTER);
            odpowiedz3.setPrefSize(200,100);
            if (f%5==1)
                odpowiedz3.setText((String)scis_tru.get(f+1));
            if (f%5==2)
                odpowiedz3.setText((String)scis_tru.get(f-1));
            if (f%5==3)
                odpowiedz3.setText((String)scis_tru.get(f-1));
            if (f%5==4)
                odpowiedz3.setText((String)scis_tru.get(f-1));
            odpowiedz3.setOnAction(e ->
                    {
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz3.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz3.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_tru.get(c+1) != odpowiedz3.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 1 && scis_tru.get(c+1) != odpowiedz3.getText() && z==1))
                        {
                            gracz1.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz3.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz3.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_tru.get(c+1) != odpowiedz3.getText() && z==1))
                        {
                            gracz2.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz3.getText() && z==4) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz3.getText() && z==1))
                        {
                            gracz3.setText("Stoisz");
                        }
                        if ( scis_tru.get(c+1) != odpowiedz3.getText() && z==1)
                        {
                            gracz4.setText("Stoisz");
                        }

                        window.close();
                    }
            );

            odpowiedz4.setTranslateX(350);
            odpowiedz4.setTranslateY(50);
            odpowiedz4.setWrapText(true);
            odpowiedz4.setTextAlignment(TextAlignment.CENTER);
            odpowiedz4.setPrefSize(200,100);
            if (f%5==1)
                odpowiedz4.setText((String)scis_tru.get(f+3));
            if (f%5==2)
                odpowiedz4.setText((String)scis_tru.get(f+1));
            if (f%5==3)
                odpowiedz4.setText((String)scis_tru.get(f+1));
            if (f%5==4)
                odpowiedz4.setText((String)scis_tru.get(f-3));
            odpowiedz4.setOnAction(e ->
                    {
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz4.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz4.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_tru.get(c+1) != odpowiedz4.getText() && z==2) || (Pierwsze_Okno.ilosc_graczy == 1 && scis_tru.get(c+1) != odpowiedz4.getText() && z==1))
                        {
                            gracz1.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz4.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz4.getText() && z==3) || (Pierwsze_Okno.ilosc_graczy == 2 && scis_tru.get(c+1) != odpowiedz4.getText() && z==1))
                        {
                            gracz2.setText("Stoisz");
                        }
                        if ( (Pierwsze_Okno.ilosc_graczy == 4 && scis_tru.get(c+1) != odpowiedz4.getText() && z==4) || (Pierwsze_Okno.ilosc_graczy == 3 && scis_tru.get(c+1) != odpowiedz4.getText() && z==1))
                        {
                            gracz3.setText("Stoisz");
                        }
                        if ( scis_tru.get(c+1) != odpowiedz4.getText() && z==1)
                        {
                            gracz4.setText("Stoisz");
                        }

                        window.close();
                    }
            );


            StackPane layout1 = new StackPane();
            Scene scene = new Scene(layout1, 1000, 300);
            layout1.getChildren().addAll(pytanie, odpowiedz1, odpowiedz2, odpowiedz3, odpowiedz4);
            window.setScene(scene);

            window.show();
        }
    }
}