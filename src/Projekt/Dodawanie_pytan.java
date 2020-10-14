package Projekt;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import static Projekt.Kategoria.kategorie;
import static Projekt.Poziom_trudnosci.trudnosc;
import static Projekt.Wczytywanie_pytan.*;

public class Dodawanie_pytan
{

    public static TextArea pytanie = new TextArea();
    public static TextArea poprawna_odpowiedz = new TextArea();
    public static TextArea bledna_odpowiedz1 = new TextArea();
    public static TextArea bledna_odpowiedz2 = new TextArea();
    public static TextArea bledna_odpowiedz3 = new TextArea();

    public static int sprawdzenie;

    public static void dodawanie (String Title)
    {
        Stage window = new Stage();
        window.setTitle(Title);

        Label tekst = new Label();
        tekst.setText("Happy Knowledge umożliwia dodawanie własnych pytań w celu urozmaicenia gry lub podniesienia jej poziomu. Pola należy wypełniać uważnie! Pytania można również dodawać przez dokumenty tekstowe txt.");
        tekst.setWrapText(true);
        tekst.setTextAlignment(TextAlignment.CENTER);
        tekst.setTranslateY(-225);
        tekst.setMaxSize(800,300);
        tekst.setFont(Font.font("Verdana",20));


        pytanie.setMaxHeight(100);
        pytanie.setMaxWidth(600);
        pytanie.setTranslateX(50);
        pytanie.setTranslateY(-100);
        pytanie.setFont(Font.font("Verdana",20));
        pytanie.setWrapText(true);
        pytanie.setEditable(true);


        poprawna_odpowiedz.setMaxHeight(50);
        poprawna_odpowiedz.setMaxWidth(200);
        poprawna_odpowiedz.setTranslateX(-125);
        poprawna_odpowiedz.setTranslateY(0);
        poprawna_odpowiedz.setFont(Font.font("Verdana",16));
        poprawna_odpowiedz.setEditable(true);


        bledna_odpowiedz1.setMaxHeight(50);
        bledna_odpowiedz1.setMaxWidth(200);
        bledna_odpowiedz1.setTranslateX(320);
        bledna_odpowiedz1.setTranslateY(0);
        bledna_odpowiedz1.setFont(Font.font("Verdana",16));
        bledna_odpowiedz1.setEditable(true);


        bledna_odpowiedz2.setMaxHeight(50);
        bledna_odpowiedz2.setMaxWidth(200);
        bledna_odpowiedz2.setTranslateX(-125);
        bledna_odpowiedz2.setTranslateY(100);
        bledna_odpowiedz2.setFont(Font.font("Verdana",16));
        bledna_odpowiedz2.setEditable(true);


        bledna_odpowiedz3.setMaxHeight(50);
        bledna_odpowiedz3.setMaxWidth(200);
        bledna_odpowiedz3.setTranslateX(320);
        bledna_odpowiedz3.setTranslateY(100);
        bledna_odpowiedz3.setFont(Font.font("Verdana",16));
        bledna_odpowiedz3.setEditable(true);

        Button button = new Button("Zaczynamy!");
        button.setTranslateX(320);
        button.setTranslateY(200);
        button.setPrefSize(200,100);
        button.setOnAction(e->
                {
                    Pierwsze_Okno.gracze("Happy Knowledge");
                    window.close();
                }
        );

        Label label1 = new Label("Pytanie:");
        label1.setTranslateX(-350);
        label1.setTranslateY(-100);
        label1.setFont(Font.font("Verdana",20));

        Label label2 = new Label("Poprawna odpowiedź:");
        label2.setTranslateX(-350);
        label2.setTranslateY(0);
        label2.setFont(Font.font("Verdana",20));

        Label label3 = new Label("Błędna odpowiedź:");
        label3.setTranslateX(100);
        label3.setTranslateY(0);
        label3.setFont(Font.font("Verdana",20));

        Label label4 = new Label("Błędna odpowiedź:");
        label4.setTranslateX(-350);
        label4.setTranslateY(100);
        label4.setFont(Font.font("Verdana",20));

        Label label5 = new Label("Błędna odpowiedź:");
        label5.setTranslateX(100);
        label5.setTranslateY(100);
        label5.setFont(Font.font("Verdana",20));

        Button dodawanie = new Button("Dodaj pytanie");
        dodawanie.setTranslateX(0);
        dodawanie.setTranslateY(200);
        dodawanie.setPrefSize(200,100);
        dodawanie.setOnAction((ActionEvent e) ->
                {
                    String pytanie1 = new String();
                    pytanie1 = pytanie.getText();
                    System.out.println(pytanie1);

                    String poprawna_odpowiedz1 = new String();
                    poprawna_odpowiedz1 = poprawna_odpowiedz.getText();
                    System.out.println(poprawna_odpowiedz1);

                    String bledna_odpowiedz11 = new String();
                    bledna_odpowiedz11 = bledna_odpowiedz1.getText();
                    System.out.println(bledna_odpowiedz11);

                    String bledna_odpowiedz22 = new String();
                    bledna_odpowiedz22 = bledna_odpowiedz2.getText();
                    System.out.println(bledna_odpowiedz22);

                    String bledna_odpowiedz33 = new String();
                    bledna_odpowiedz33 = bledna_odpowiedz3.getText();
                    System.out.println(bledna_odpowiedz33);

/*
                    if (kategorie == 1 && trudnosc == 1)
                    {
                        int a = geog_lat.size();
                        System.out.println(geog_lat.size());

                            geog_lat.set(a + 1, pytanie1);
                            geog_lat.set(a + 2, poprawna_odpowiedz);
                            geog_lat.set(a + 3, bledna_odpowiedz1);
                            geog_lat.set(a + 4, bledna_odpowiedz2);
                            geog_lat.set(a + 5, bledna_odpowiedz3);
                            System.out.println(geog_lat);
                    }*/
                    /*
                    if (kategorie == 2 && trudność == 1)
                    {
                        int a = his_lat.size();
                        System.out.println(geog_lat.size());
                        his_lat.set(a+1,pytanie.getText());
                        his_lat.set(a+2,poprawna_odpowiedź.getText());
                        his_lat.set(a+3,błędna_odpowiedź1.getText());
                        his_lat.set(a+4,błędna_odpowiedź2.getText());
                        his_lat.set(a+5,błędna_odpowiedź3.getText());
                    }
                    if (kategorie == 3 && trudność == 1)
                    {
                        int a = scis_lat.size();
                        System.out.println(geog_lat.size());
                        scis_lat.set(a+1,pytanie.getText());
                        scis_lat.set(a+2,poprawna_odpowiedź.getText());
                        scis_lat.set(a+3,błędna_odpowiedź1.getText());
                        scis_lat.set(a+4,błędna_odpowiedź2.getText());
                        scis_lat.set(a+5,błędna_odpowiedź3.getText());
                    }
                    if (kategorie == 4 && trudność == 1)
                    {
                        int a = inne_lat.size();
                        System.out.println(geog_lat.size());
                        inne_lat.set(a+1,pytanie.getText());
                        inne_lat.set(a+2,poprawna_odpowiedź.getText());
                        inne_lat.set(a+3,błędna_odpowiedź1.getText());
                        inne_lat.set(a+4,błędna_odpowiedź2.getText());
                        inne_lat.set(a+5,błędna_odpowiedź3.getText());
                    }
                    if (kategorie == 1 && trudność == 2)
                    {
                        int a = geog_tru.size();
                        System.out.println(geog_lat.size());
                        geog_tru.set(a+1,pytanie.getText());
                        geog_tru.set(a+2,poprawna_odpowiedź.getText());
                        geog_tru.set(a+3,błędna_odpowiedź1.getText());
                        geog_tru.set(a+4,błędna_odpowiedź2.getText());
                        geog_tru.set(a+5,błędna_odpowiedź3.getText());
                    }
                    if (kategorie == 2 && trudność == 2)
                    {
                        int a = his_tru.size();
                        System.out.println(geog_lat.size());
                        his_tru.set(a+1,pytanie.getText());
                        his_tru.set(a+2,poprawna_odpowiedź.getText());
                        his_tru.set(a+3,błędna_odpowiedź1.getText());
                        his_tru.set(a+4,błędna_odpowiedź2.getText());
                        his_tru.set(a+5,błędna_odpowiedź3.getText());
                    }
                    if (kategorie == 3 && trudność == 2)
                    {
                        int a = scis_tru.size();
                        System.out.println(geog_lat.size());
                        scis_tru.set(a+1,pytanie.getText());
                        scis_tru.set(a+2,poprawna_odpowiedź.getText());
                        scis_tru.set(a+3,błędna_odpowiedź1.getText());
                        scis_tru.set(a+4,błędna_odpowiedź2.getText());
                        scis_tru.set(a+5,błędna_odpowiedź3.getText());
                    }
                    if (kategorie == 4 && trudność == 2)
                    {
                        int a = inne_tru.size();
                        System.out.println(geog_lat.size());
                        inne_tru.set(a+1,pytanie.getText());
                        inne_tru.set(a+2,poprawna_odpowiedź.getText());
                        inne_tru.set(a+3,błędna_odpowiedź1.getText());
                        inne_tru.set(a+4,błędna_odpowiedź2.getText());
                        inne_tru.set(a+5,błędna_odpowiedź3.getText());
                    }*/
                }
        );
        StackPane layout1 = new StackPane();
        Scene scene = new Scene (layout1,1000,600);
        layout1.getChildren().addAll(tekst, pytanie,poprawna_odpowiedz,bledna_odpowiedz1,bledna_odpowiedz2,bledna_odpowiedz3, button, label1, label2, label3, label4, label5, dodawanie);
        window.setScene(scene);
        window.show();
    }
}
