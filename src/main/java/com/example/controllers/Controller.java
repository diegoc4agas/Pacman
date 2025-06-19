/*package com.example.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Arc;


public class Controller {
    @FXML
    private Arc pacman;

    private double x,y;

    public void atacar(ActionEvent e){
        System.out.println("Movendo para a direita");
        pacman.setCenterX(x+=10);
    }
}*/
/*
package com.example.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Arc;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Arc pacman;

    private double x, y;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Inicializa x e y com a posição atual do pacman
        x = pacman.getCenterX();
        y = pacman.getCenterY();
    }

    @FXML
    public void moverDireita(ActionEvent e){
        System.out.println("Movendo para a direita");
        pacman.setCenterX(x += 10);
    }

    @FXML
    public void moverEsquerda(ActionEvent e){
        System.out.println("Movendo para a esquerda");
        pacman.setCenterX(x -= 10);
    }

    @FXML
    public void moverCima(ActionEvent e){
        System.out.println("Movendo para cima");
        pacman.setCenterY(y -= 10);
    }

    @FXML
    public void moverBaixo(ActionEvent e){
        System.out.println("Movendo para baixo");
        pacman.setCenterY(y += 10);
    }
}*/

package com.example.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Arc;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Arc pacman;

    private double x, y;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Inicializa x e y com a posição atual do pacman
        x = pacman.getCenterX();
        y = pacman.getCenterY();
    }

    @FXML
    public void moverDireita(ActionEvent e){
        System.out.println("Movendo para a direita");
        pacman.setCenterX(x += 10);
    }

    @FXML
    public void moverEsquerda(ActionEvent e){
        System.out.println("Movendo para a esquerda");
        pacman.setCenterX(x -= 10);
    }

    @FXML
    public void moverCima(ActionEvent e){
        System.out.println("Movendo para cima");
        pacman.setCenterY(y -= 10);
    }

    @FXML
    public void moverBaixo(ActionEvent e){
        System.out.println("Movendo para baixo");
        pacman.setCenterY(y += 10);
    }
}

