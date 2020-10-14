package Projekt;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.Scene;

public class Gra
{
    Button kostka = new Button("Rzuć kostką");
    static int z = 1;

    static Circle pionek1 = new Circle();
    static Circle pionek2 = new Circle();
    static Circle pionek3 = new Circle();
    static Circle pionek4 = new Circle();
    static javafx.scene.control.Label gracz1 = new javafx.scene.control.Label(" Gracz 1 ");
    static javafx.scene.control.Label gracz2 = new javafx.scene.control.Label(" Gracz 2 ");
    static javafx.scene.control.Label gracz3 = new javafx.scene.control.Label(" Gracz 3 ");
    static javafx.scene.control.Label gracz4 = new javafx.scene.control.Label(" Gracz 4 ");


    public void planszax(String Title)
    {

        Stage window = new Stage();
        window.setTitle(Title);

        javafx.scene.image.ImageView image1 = new javafx.scene.image.ImageView(new Image(getClass().getResourceAsStream("kostka1.png"), 100, 100, true, true));
        javafx.scene.image.ImageView image2 = new javafx.scene.image.ImageView(new Image(getClass().getResourceAsStream("kostka2.png"), 100, 100, true, true));
        javafx.scene.image.ImageView image3 = new javafx.scene.image.ImageView(new Image(getClass().getResourceAsStream("kostka3.png"), 100, 100, true, true));
        javafx.scene.image.ImageView image4 = new javafx.scene.image.ImageView(new Image(getClass().getResourceAsStream("kostka4.png"), 100, 100, true, true));
        javafx.scene.image.ImageView image5 = new javafx.scene.image.ImageView(new Image(getClass().getResourceAsStream("kostka5.png"), 100, 100, true, true));
        javafx.scene.image.ImageView image6 = new javafx.scene.image.ImageView(new Image(getClass().getResourceAsStream("kostka6.png"), 100, 100, true, true));

        image1.setTranslateX(350);
        image1.setTranslateY(250);
        image2.setTranslateX(350);
        image2.setTranslateY(250);
        image3.setTranslateX(350);
        image3.setTranslateY(250);
        image4.setTranslateX(350);
        image4.setTranslateY(250);
        image5.setTranslateX(350);
        image5.setTranslateY(250);
        image6.setTranslateX(350);
        image6.setTranslateY(250);

        image1.setVisible(false);
        image2.setVisible(false);
        image3.setVisible(false);
        image4.setVisible(false);
        image5.setVisible(false);
        image6.setVisible(false);


        pionek1.setRadius(10);
        pionek1.setTranslateX(-470);
        pionek1.setTranslateY(150);
        pionek1.setFill(Color.RED);


        pionek2.setRadius(10);
        pionek2.setTranslateX(-430);
        pionek2.setTranslateY(150);
        pionek2.setFill(Color.GREEN);


        pionek3.setRadius(10);
        pionek3.setTranslateX(-470);
        pionek3.setTranslateY(180);
        pionek3.setFill(Color.BLUE);


        pionek4.setRadius(10);
        pionek4.setTranslateX(-430);
        pionek4.setTranslateY(180);
        pionek4.setFill(Color.YELLOW);

        if (Pierwsze_Okno.ilosc_graczy == 1) {
            pionek1.setVisible(true);
            pionek2.setVisible(false);
            pionek3.setVisible(false);
            pionek4.setVisible(false);
        }
        if (Pierwsze_Okno.ilosc_graczy == 2) {
            pionek1.setVisible(true);
            pionek2.setVisible(true);
            pionek3.setVisible(false);
            pionek4.setVisible(false);
        }
        if (Pierwsze_Okno.ilosc_graczy == 3) {
            pionek1.setVisible(true);
            pionek2.setVisible(true);
            pionek3.setVisible(true);
            pionek4.setVisible(false);
        }
        if (Pierwsze_Okno.ilosc_graczy == 4) {
            pionek1.setVisible(true);
            pionek2.setVisible(true);
            pionek3.setVisible(true);
            pionek4.setVisible(true);
        }


        gracz1.setTranslateX(-400);
        gracz1.setTranslateY(250);
        gracz1.setFont(Font.font("Verdana", 40));
        gracz1.setTextFill(Color.RED);


        gracz2.setTranslateX(-200);
        gracz2.setTranslateY(250);
        gracz2.setFont(Font.font("Verdana", 40));


        gracz3.setTranslateX(0);
        gracz3.setTranslateY(250);
        gracz3.setFont(Font.font("Verdana", 40));


        gracz4.setTranslateX(200);
        gracz4.setTranslateY(250);
        gracz4.setFont(Font.font("Verdana", 40));

        if (Pierwsze_Okno.ilosc_graczy == 1) {
            gracz1.setVisible(true);
            gracz2.setVisible(false);
            gracz3.setVisible(false);
            gracz4.setVisible(false);
        }
        if (Pierwsze_Okno.ilosc_graczy == 2) {
            gracz1.setVisible(true);
            gracz2.setVisible(true);
            gracz3.setVisible(false);
            gracz4.setVisible(false);
        }
        if (Pierwsze_Okno.ilosc_graczy == 3) {
            gracz1.setVisible(true);
            gracz2.setVisible(true);
            gracz3.setVisible(true);
            gracz4.setVisible(false);
        }
        if (Pierwsze_Okno.ilosc_graczy == 4) {
            gracz1.setVisible(true);
            gracz2.setVisible(true);
            gracz3.setVisible(true);
            gracz4.setVisible(true);
        }

        kostka.setPrefSize(100, 100);
        kostka.setTranslateX(450);
        kostka.setTranslateY(250);

        javafx.scene.shape.Rectangle rectangle1 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle2 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle3 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle4 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle5 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle6 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle7 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle8 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle9 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle10 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle11 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle12 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle13 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle14 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle15 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle16 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle17 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle18 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle19 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle20 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle21 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle22 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle23 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle24 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle25 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle26 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle27 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle28 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle29 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle30 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle31 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle32 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle33 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle34 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle35 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle36 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle37 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle38 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle39 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle40 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle41 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle42 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle43 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle44 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle45 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle46 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle47 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle48 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle49 = new javafx.scene.shape.Rectangle();
        javafx.scene.shape.Rectangle rectangle50 = new javafx.scene.shape.Rectangle();

        Text text1 = new Text("START");
        Text text2 = new Text("2");
        Text text3 = new Text("3");
        Text text4 = new Text("4");
        Text text5 = new Text("5");
        Text text6 = new Text("6");
        Text text7 = new Text("7");
        Text text8 = new Text("8");
        Text text9 = new Text("9");
        Text text10 = new Text("10");
        Text text11 = new Text("11");
        Text text12 = new Text("12");
        Text text13 = new Text("13");
        Text text14 = new Text("14");
        Text text15 = new Text("15");
        Text text16 = new Text("16");
        Text text17 = new Text("17");
        Text text18 = new Text("18");
        Text text19 = new Text("19");
        Text text20 = new Text("20");
        Text text21 = new Text("21");
        Text text22 = new Text("22");
        Text text23 = new Text("23");
        Text text24 = new Text("24");
        Text text25 = new Text("25");
        Text text26 = new Text("26");
        Text text27 = new Text("27");
        Text text28 = new Text("28");
        Text text29 = new Text("29");
        Text text30 = new Text("30");
        Text text31 = new Text("31");
        Text text32 = new Text("32");
        Text text33 = new Text("33");
        Text text34 = new Text("34");
        Text text35 = new Text("35");
        Text text36 = new Text("36");
        Text text37 = new Text("37");
        Text text38 = new Text("38");
        Text text39 = new Text("39");
        Text text40 = new Text("40");
        Text text41 = new Text("41");
        Text text42 = new Text("42");
        Text text43 = new Text("43");
        Text text44 = new Text("44");
        Text text45 = new Text("45");
        Text text46 = new Text("46");
        Text text47 = new Text("47");
        Text text48 = new Text("48");
        Text text49 = new Text("49");
        Text text50 = new Text("META");

        rectangle1.setTranslateX(-450);
        rectangle1.setTranslateY(150);
        rectangle1.setWidth(100);
        rectangle1.setHeight(100);
        rectangle1.setFill(Color.rgb(194, 173, 127));
        text1.setTranslateX(-450);
        text1.setTranslateY(120);
        text1.setFont(Font.font("Verdana", 20));

        rectangle2.setTranslateX(-350);
        rectangle2.setTranslateY(150);
        rectangle2.setWidth(100);
        rectangle2.setHeight(100);
        rectangle2.setFill(Color.rgb(87, 167, 194));
        text2.setTranslateX(-350);
        text2.setTranslateY(120);
        text2.setFont(Font.font("Verdana", 20));

        rectangle3.setTranslateX(-250);
        rectangle3.setTranslateY(150);
        rectangle3.setWidth(100);
        rectangle3.setHeight(100);
        rectangle3.setFill(Color.rgb(130, 194, 84));
        text3.setTranslateX(-250);
        text3.setTranslateY(120);
        text3.setFont(Font.font("Verdana", 20));

        rectangle4.setTranslateX(-150);
        rectangle4.setTranslateY(150);
        rectangle4.setWidth(100);
        rectangle4.setHeight(100);
        rectangle4.setFill(Color.rgb(193, 194, 51));
        text4.setTranslateX(-150);
        text4.setTranslateY(120);
        text4.setFont(Font.font("Verdana", 20));

        rectangle5.setTranslateX(-50);
        rectangle5.setTranslateY(150);
        rectangle5.setWidth(100);
        rectangle5.setHeight(100);
        rectangle5.setFill(Color.rgb(194, 60, 164));
        text5.setTranslateX(-50);
        text5.setTranslateY(120);
        text5.setFont(Font.font("Verdana", 20));

        rectangle6.setTranslateX(50);
        rectangle6.setTranslateY(150);
        rectangle6.setWidth(100);
        rectangle6.setHeight(100);
        rectangle6.setFill(Color.rgb(87, 167, 194));
        text6.setTranslateX(50);
        text6.setTranslateY(120);
        text6.setFont(Font.font("Verdana", 20));

        rectangle7.setTranslateX(150);
        rectangle7.setTranslateY(150);
        rectangle7.setWidth(100);
        rectangle7.setHeight(100);
        rectangle7.setFill(Color.rgb(130, 194, 84));
        text7.setTranslateX(150);
        text7.setTranslateY(120);
        text7.setFont(Font.font("Verdana", 20));

        rectangle8.setTranslateX(250);
        rectangle8.setTranslateY(150);
        rectangle8.setWidth(100);
        rectangle8.setHeight(100);
        rectangle8.setFill(Color.rgb(193, 194, 51));
        text8.setTranslateX(250);
        text8.setTranslateY(120);
        text8.setFont(Font.font("Verdana", 20));

        rectangle9.setTranslateX(350);
        rectangle9.setTranslateY(150);
        rectangle9.setWidth(100);
        rectangle9.setHeight(100);
        rectangle9.setFill(Color.rgb(194, 60, 164));
        text9.setTranslateX(350);
        text9.setTranslateY(120);
        text9.setFont(Font.font("Verdana", 20));

        rectangle10.setTranslateX(450);
        rectangle10.setTranslateY(150);
        rectangle10.setWidth(100);
        rectangle10.setHeight(100);
        rectangle10.setFill(Color.rgb(87, 167, 194));
        text10.setTranslateX(450);
        text10.setTranslateY(120);
        text10.setFont(Font.font("Verdana", 20));

        rectangle11.setTranslateX(-450);
        rectangle11.setTranslateY(50);
        rectangle11.setWidth(100);
        rectangle11.setHeight(100);
        rectangle11.setFill(Color.rgb(130, 194, 84));
        text11.setTranslateX(-450);
        text11.setTranslateY(20);
        text11.setFont(Font.font("Verdana", 20));

        rectangle12.setTranslateX(-350);
        rectangle12.setTranslateY(50);
        rectangle12.setWidth(100);
        rectangle12.setHeight(100);
        rectangle12.setFill(Color.rgb(193, 194, 51));
        text12.setTranslateX(-350);
        text12.setTranslateY(20);
        text12.setFont(Font.font("Verdana", 20));

        rectangle13.setTranslateX(-250);
        rectangle13.setTranslateY(50);
        rectangle13.setWidth(100);
        rectangle13.setHeight(100);
        rectangle13.setFill(Color.rgb(194, 60, 164));
        text13.setTranslateX(-250);
        text13.setTranslateY(20);
        text13.setFont(Font.font("Verdana", 20));

        rectangle14.setTranslateX(-150);
        rectangle14.setTranslateY(50);
        rectangle14.setWidth(100);
        rectangle14.setHeight(100);
        rectangle14.setFill(Color.rgb(87, 167, 194));
        text14.setTranslateX(-150);
        text14.setTranslateY(20);
        text14.setFont(Font.font("Verdana", 20));

        rectangle15.setTranslateX(-50);
        rectangle15.setTranslateY(50);
        rectangle15.setWidth(100);
        rectangle15.setHeight(100);
        rectangle15.setFill(Color.rgb(130, 194, 84));
        text15.setTranslateX(-50);
        text15.setTranslateY(20);
        text15.setFont(Font.font("Verdana", 20));

        rectangle16.setTranslateX(50);
        rectangle16.setTranslateY(50);
        rectangle16.setWidth(100);
        rectangle16.setHeight(100);
        rectangle16.setFill(Color.rgb(193, 194, 51));
        text16.setTranslateX(50);
        text16.setTranslateY(20);
        text16.setFont(Font.font("Verdana", 20));

        rectangle17.setTranslateX(150);
        rectangle17.setTranslateY(50);
        rectangle17.setWidth(100);
        rectangle17.setHeight(100);
        rectangle17.setFill(Color.rgb(194, 60, 164));
        text17.setTranslateX(150);
        text17.setTranslateY(20);
        text17.setFont(Font.font("Verdana", 20));

        rectangle18.setTranslateX(250);
        rectangle18.setTranslateY(50);
        rectangle18.setWidth(100);
        rectangle18.setHeight(100);
        rectangle18.setFill(Color.rgb(87, 167, 194));
        text18.setTranslateX(250);
        text18.setTranslateY(20);
        text18.setFont(Font.font("Verdana", 20));

        rectangle19.setTranslateX(350);
        rectangle19.setTranslateY(50);
        rectangle19.setWidth(100);
        rectangle19.setHeight(100);
        rectangle19.setFill(Color.rgb(130, 194, 84));
        text19.setTranslateX(350);
        text19.setTranslateY(20);
        text19.setFont(Font.font("Verdana", 20));

        rectangle20.setTranslateX(450);
        rectangle20.setTranslateY(50);
        rectangle20.setWidth(100);
        rectangle20.setHeight(100);
        rectangle20.setFill(Color.rgb(193, 194, 51));
        text20.setTranslateX(450);
        text20.setTranslateY(20);
        text20.setFont(Font.font("Verdana", 20));

        rectangle21.setTranslateX(-450);
        rectangle21.setTranslateY(-50);
        rectangle21.setWidth(100);
        rectangle21.setHeight(100);
        rectangle21.setFill(Color.rgb(194, 60, 164));
        text21.setTranslateX(-450);
        text21.setTranslateY(-80);
        text21.setFont(Font.font("Verdana", 20));

        rectangle22.setTranslateX(-350);
        rectangle22.setTranslateY(-50);
        rectangle22.setWidth(100);
        rectangle22.setHeight(100);
        rectangle22.setFill(Color.rgb(87, 167, 194));
        text22.setTranslateX(-350);
        text22.setTranslateY(-80);
        text22.setFont(Font.font("Verdana", 20));

        rectangle23.setTranslateX(-250);
        rectangle23.setTranslateY(-50);
        rectangle23.setWidth(100);
        rectangle23.setHeight(100);
        rectangle23.setFill(Color.rgb(130, 194, 84));
        text23.setTranslateX(-250);
        text23.setTranslateY(-80);
        text23.setFont(Font.font("Verdana", 20));

        rectangle24.setTranslateX(-150);
        rectangle24.setTranslateY(-50);
        rectangle24.setWidth(100);
        rectangle24.setHeight(100);
        rectangle24.setFill(Color.rgb(193, 194, 51));
        text24.setTranslateX(-150);
        text24.setTranslateY(-80);
        text24.setFont(Font.font("Verdana", 20));

        rectangle25.setTranslateX(-50);
        rectangle25.setTranslateY(-50);
        rectangle25.setWidth(100);
        rectangle25.setHeight(100);
        rectangle25.setFill(Color.rgb(194, 60, 164));
        text25.setTranslateX(-50);
        text25.setTranslateY(-80);
        text25.setFont(Font.font("Verdana", 20));

        rectangle26.setTranslateX(50);
        rectangle26.setTranslateY(-50);
        rectangle26.setWidth(100);
        rectangle26.setHeight(100);
        rectangle26.setFill(Color.rgb(87, 167, 194));
        text26.setTranslateX(50);
        text26.setTranslateY(-80);
        text26.setFont(Font.font("Verdana", 20));

        rectangle27.setTranslateX(150);
        rectangle27.setTranslateY(-50);
        rectangle27.setWidth(100);
        rectangle27.setHeight(100);
        rectangle27.setFill(Color.rgb(130, 194, 84));
        text27.setTranslateX(150);
        text27.setTranslateY(-80);
        text27.setFont(Font.font("Verdana", 20));

        rectangle28.setTranslateX(250);
        rectangle28.setTranslateY(-50);
        rectangle28.setWidth(100);
        rectangle28.setHeight(100);
        rectangle28.setFill(Color.rgb(193, 194, 51));
        text28.setTranslateX(250);
        text28.setTranslateY(-80);
        text28.setFont(Font.font("Verdana", 20));

        rectangle29.setTranslateX(350);
        rectangle29.setTranslateY(-50);
        rectangle29.setWidth(100);
        rectangle29.setHeight(100);
        rectangle29.setFill(Color.rgb(194, 60, 164));
        text29.setTranslateX(350);
        text29.setTranslateY(-80);
        text29.setFont(Font.font("Verdana", 20));

        rectangle30.setTranslateX(450);
        rectangle30.setTranslateY(-50);
        rectangle30.setWidth(100);
        rectangle30.setHeight(100);
        rectangle30.setFill(Color.rgb(87, 167, 194));
        text30.setTranslateX(450);
        text30.setTranslateY(-80);
        text30.setFont(Font.font("Verdana", 20));

        rectangle31.setTranslateX(-450);
        rectangle31.setTranslateY(-150);
        rectangle31.setWidth(100);
        rectangle31.setHeight(100);
        rectangle31.setFill(Color.rgb(130, 194, 84));
        text31.setTranslateX(-450);
        text31.setTranslateY(-180);
        text31.setFont(Font.font("Verdana", 20));

        rectangle32.setTranslateX(-350);
        rectangle32.setTranslateY(-150);
        rectangle32.setWidth(100);
        rectangle32.setHeight(100);
        rectangle32.setFill(Color.rgb(193, 194, 51));
        text32.setTranslateX(-350);
        text32.setTranslateY(-180);
        text32.setFont(Font.font("Verdana", 20));

        rectangle33.setTranslateX(-250);
        rectangle33.setTranslateY(-150);
        rectangle33.setWidth(100);
        rectangle33.setHeight(100);
        rectangle33.setFill(Color.rgb(194, 60, 164));
        text33.setTranslateX(-250);
        text33.setTranslateY(-180);
        text33.setFont(Font.font("Verdana", 20));

        rectangle34.setTranslateX(-150);
        rectangle34.setTranslateY(-150);
        rectangle34.setWidth(100);
        rectangle34.setHeight(100);
        rectangle34.setFill(Color.rgb(87, 167, 194));
        text34.setTranslateX(-150);
        text34.setTranslateY(-180);
        text34.setFont(Font.font("Verdana", 20));

        rectangle35.setTranslateX(-50);
        rectangle35.setTranslateY(-150);
        rectangle35.setWidth(100);
        rectangle35.setHeight(100);
        rectangle35.setFill(Color.rgb(130, 194, 84));
        text35.setTranslateX(-50);
        text35.setTranslateY(-180);
        text35.setFont(Font.font("Verdana", 20));

        rectangle36.setTranslateX(50);
        rectangle36.setTranslateY(-150);
        rectangle36.setWidth(100);
        rectangle36.setHeight(100);
        rectangle36.setFill(Color.rgb(193, 194, 51));
        text36.setTranslateX(50);
        text36.setTranslateY(-180);
        text36.setFont(Font.font("Verdana", 20));

        rectangle37.setTranslateX(150);
        rectangle37.setTranslateY(-150);
        rectangle37.setWidth(100);
        rectangle37.setHeight(100);
        rectangle37.setFill(Color.rgb(194, 60, 164));
        text37.setTranslateX(150);
        text37.setTranslateY(-180);
        text37.setFont(Font.font("Verdana", 20));

        rectangle38.setTranslateX(250);
        rectangle38.setTranslateY(-150);
        rectangle38.setWidth(100);
        rectangle38.setHeight(100);
        rectangle38.setFill(Color.rgb(87, 167, 194));
        text38.setTranslateX(250);
        text38.setTranslateY(-180);
        text38.setFont(Font.font("Verdana", 20));

        rectangle39.setTranslateX(350);
        rectangle39.setTranslateY(-150);
        rectangle39.setWidth(100);
        rectangle39.setHeight(100);
        rectangle39.setFill(Color.rgb(130, 194, 84));
        text39.setTranslateX(350);
        text39.setTranslateY(-180);
        text39.setFont(Font.font("Verdana", 20));

        rectangle40.setTranslateX(450);
        rectangle40.setTranslateY(-150);
        rectangle40.setWidth(100);
        rectangle40.setHeight(100);
        rectangle40.setFill(Color.rgb(193, 194, 51));
        text40.setTranslateX(450);
        text40.setTranslateY(-180);
        text40.setFont(Font.font("Verdana", 20));

        rectangle41.setTranslateX(-450);
        rectangle41.setTranslateY(-250);
        rectangle41.setWidth(100);
        rectangle41.setHeight(100);
        rectangle41.setFill(Color.rgb(194, 60, 164));
        text41.setTranslateX(-450);
        text41.setTranslateY(-280);
        text41.setFont(Font.font("Verdana", 20));

        rectangle42.setTranslateX(-350);
        rectangle42.setTranslateY(-250);
        rectangle42.setWidth(100);
        rectangle42.setHeight(100);
        rectangle42.setFill(Color.rgb(87, 167, 194));
        text42.setTranslateX(-350);
        text42.setTranslateY(-280);
        text42.setFont(Font.font("Verdana", 20));

        rectangle43.setTranslateX(-250);
        rectangle43.setTranslateY(-250);
        rectangle43.setWidth(100);
        rectangle43.setHeight(100);
        rectangle43.setFill(Color.rgb(130, 194, 84));
        text43.setTranslateX(-250);
        text43.setTranslateY(-280);
        text43.setFont(Font.font("Verdana", 20));

        rectangle44.setTranslateX(-150);
        rectangle44.setTranslateY(-250);
        rectangle44.setWidth(100);
        rectangle44.setHeight(100);
        rectangle44.setFill(Color.rgb(193, 194, 51));
        text44.setTranslateX(-150);
        text44.setTranslateY(-280);
        text44.setFont(Font.font("Verdana", 20));

        rectangle45.setTranslateX(-50);
        rectangle45.setTranslateY(-250);
        rectangle45.setWidth(100);
        rectangle45.setHeight(100);
        rectangle45.setFill(Color.rgb(194, 60, 164));
        text45.setTranslateX(-50);
        text45.setTranslateY(-280);
        text45.setFont(Font.font("Verdana", 20));

        rectangle46.setTranslateX(50);
        rectangle46.setTranslateY(-250);
        rectangle46.setWidth(100);
        rectangle46.setHeight(100);
        rectangle46.setFill(Color.rgb(87, 167, 194));
        text46.setTranslateX(50);
        text46.setTranslateY(-280);
        text46.setFont(Font.font("Verdana", 20));

        rectangle47.setTranslateX(150);
        rectangle47.setTranslateY(-250);
        rectangle47.setWidth(100);
        rectangle47.setHeight(100);
        rectangle47.setFill(Color.rgb(130, 194, 84));
        text47.setTranslateX(150);
        text47.setTranslateY(-280);
        text47.setFont(Font.font("Verdana", 20));

        rectangle48.setTranslateX(250);
        rectangle48.setTranslateY(-250);
        rectangle48.setWidth(100);
        rectangle48.setHeight(100);
        rectangle48.setFill(Color.rgb(193, 194, 51));
        text48.setTranslateX(250);
        text48.setTranslateY(-280);
        text48.setFont(Font.font("Verdana", 20));

        rectangle49.setTranslateX(350);
        rectangle49.setTranslateY(-250);
        rectangle49.setWidth(100);
        rectangle49.setHeight(100);
        rectangle49.setFill(Color.rgb(194, 60, 164));
        text49.setTranslateX(350);
        text49.setTranslateY(-280);
        text49.setFont(Font.font("Verdana", 20));

        rectangle50.setTranslateX(450);
        rectangle50.setTranslateY(-250);
        rectangle50.setWidth(100);
        rectangle50.setHeight(100);
        rectangle50.setFill(Color.rgb(194, 173, 127));
        text50.setTranslateX(450);
        text50.setTranslateY(-280);
        text50.setFont(Font.font("Verdana", 20));

        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6, rectangle7, rectangle8, rectangle9, rectangle10, rectangle11, rectangle12,
                rectangle13, rectangle14, rectangle15, rectangle16, rectangle17, rectangle18, rectangle19, rectangle20, rectangle21, rectangle22, rectangle23, rectangle24, rectangle25,
                rectangle26, rectangle27, rectangle28, rectangle29, rectangle30, rectangle31, rectangle32, rectangle33, rectangle34, rectangle35, rectangle36, rectangle37, rectangle38,
                rectangle39, rectangle40, rectangle41, rectangle42, rectangle43, rectangle44, rectangle45, rectangle46, rectangle47, rectangle48, rectangle49, rectangle50, kostka, image1,
                image2, image3, image4, image5, image6, text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18, text19,
                text20, text21, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text32, text33, text34, text35, text36, text37, text38, text39, text40, text41,
                text42, text43, text44, text45, text46, text47, text48, text49, text50, pionek1, pionek2, pionek3, pionek4, gracz1, gracz2, gracz3, gracz4);
        Scene scene = new Scene(layout1, 1000, 600);
        window.setScene(scene);
        window.show();

        kostka.setOnAction((ActionEvent e) ->
        {

            if (z == 1) {
                if (gracz1.getText() == "Stoisz") {
                    if (Pierwsze_Okno.ilosc_graczy == 2 || Pierwsze_Okno.ilosc_graczy == 3 || Pierwsze_Okno.ilosc_graczy == 4)
                    {
                        z=2;
                        gracz1.setText("Gracz 1");
                    }
                    if (Pierwsze_Okno.ilosc_graczy == 1)
                    {
                        z=1;
                        gracz1.setText("Gracz 1");
                    }
                }
            }
            if (z == 2) {
                if (gracz2.getText() == "Stoisz" && z == 2) {
                    if (Pierwsze_Okno.ilosc_graczy == 3 || Pierwsze_Okno.ilosc_graczy == 4)
                    {
                        z=3;
                        gracz2.setText("Gracz 2");
                    }
                    if (Pierwsze_Okno.ilosc_graczy == 2) {
                        z = 1;
                        gracz2.setText("Gracz 2");
                    }

                }
            }

            if (z == 3) {
                if (gracz3.getText() == "Stoisz" && z == 3) {
                    if (Pierwsze_Okno.ilosc_graczy == 4)
                    {
                        z=4;
                        gracz3.setText("Gracz 3");
                    }
                    if (Pierwsze_Okno.ilosc_graczy == 3)
                    {
                        z=1;
                        gracz3.setText("Gracz 3");

                        if(z==1 && gracz1.getText() == "Stoisz")
                        {
                            z=2;
                            gracz1.setText("Gracz 1");
                        }
                    }


                }
            }
            if (z == 4) {
                if (gracz4.getText() == "Stoisz" && z == 4)
                {
                    z=1;
                    gracz4.setText("Gracz 4");
                    if(z==1 && gracz1.getText() == "Stoisz")
                    {
                        z=2;
                        gracz1.setText("Gracz 1");
                        if(z==2 && gracz2.getText() == "Stoisz")
                        {
                            z=3;
                            gracz2.setText("Gracz 2");
                        }
                    }
                }
            }

            Random rnd = new Random();
            int a = rnd.nextInt(6);
            a = a + 1;

            switch (a) {
                case 1:
                    image1.setVisible(true);
                    image2.setVisible(false);
                    image3.setVisible(false);
                    image4.setVisible(false);
                    image5.setVisible(false);
                    image6.setVisible(false);

                    if (z % 4 == 1) {
                        gracz1.setTextFill(Color.RED);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 2) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.RED);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 3) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.RED);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 0) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.RED);
                    }
                    Warunki1.warunki1();

                    break;

                case 2:
                    image1.setVisible(false);
                    image2.setVisible(true);
                    image3.setVisible(false);
                    image4.setVisible(false);
                    image5.setVisible(false);
                    image6.setVisible(false);

                    if (z % 4 == 1) {
                        gracz1.setTextFill(Color.RED);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 2) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.RED);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 3) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.RED);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 0) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.RED);
                    }

                    Warunki2.warunki2();

                    break;

                case 3:
                    image1.setVisible(false);
                    image2.setVisible(false);
                    image3.setVisible(true);
                    image4.setVisible(false);
                    image5.setVisible(false);
                    image6.setVisible(false);

                    if (z % 4 == 1) {
                        gracz1.setTextFill(Color.RED);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 2) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.RED);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 3) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.RED);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 0) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.RED);
                    }

                    Warunki3.warunki3();

                    break;

                case 4:
                    image1.setVisible(false);
                    image2.setVisible(false);
                    image3.setVisible(false);
                    image4.setVisible(true);
                    image5.setVisible(false);
                    image6.setVisible(false);

                    if (z % 4 == 1) {
                        gracz1.setTextFill(Color.RED);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 2) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.RED);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 3) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.RED);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 0) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.RED);
                    }

                    Warunki4.warunki4();

                    break;

                case 5:
                    image1.setVisible(false);
                    image2.setVisible(false);
                    image3.setVisible(false);
                    image4.setVisible(false);
                    image5.setVisible(true);
                    image6.setVisible(false);

                    if (z % 4 == 1) {
                        gracz1.setTextFill(Color.RED);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 2) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.RED);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 3) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.RED);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 0) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.RED);
                    }

                    Warunki5.warunki5();

                    break;

                case 6:
                    image1.setVisible(false);
                    image2.setVisible(false);
                    image3.setVisible(false);
                    image4.setVisible(false);
                    image5.setVisible(false);
                    image6.setVisible(true);

                    if (z % 4 == 1) {
                        gracz1.setTextFill(Color.RED);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 2) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.RED);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 3) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.RED);
                        gracz4.setTextFill(Color.BLACK);
                    }
                    if (z % 4 == 0) {
                        gracz1.setTextFill(Color.BLACK);
                        gracz2.setTextFill(Color.BLACK);
                        gracz3.setTextFill(Color.BLACK);
                        gracz4.setTextFill(Color.RED);
                    }

                    Warunki6.warunki6();

                    break;
            }

            if (pionek1.getTranslateX() == 430 && pionek1.getTranslateY() == -250 || pionek2.getTranslateX() == 470 && pionek2.getTranslateY() == -250 ||
                    pionek3.getTranslateX() == 430 && pionek3.getTranslateY() == -220 || pionek4.getTranslateX() == 470 && pionek4.getTranslateY() == -220) {
                window.close();
                Wyniki.podsumowanie("Happy Knowledge");
            }
            z++;

            if (z > Pierwsze_Okno.ilosc_graczy)
            {
                z = 1;
            }
        });
    }
}
