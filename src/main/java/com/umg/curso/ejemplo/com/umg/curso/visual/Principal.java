package com.umg.curso.ejemplo.com.umg.curso.visual;

import com.umg.curso.ejemplo.domain.Estudiante;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by ore on 10/07/17.
 */

@SpringUI
public class Principal extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout layout = new VerticalLayout();

        Button addEstudianteButton=new Button();
        //addEstudianteButton.

        Grid<Estudiante> grid=new Grid<>();
        grid.addColumn(Estudiante::getNombre).setCaption("Nombre");
        grid.addColumn(Estudiante::getEdad).setCaption("Edad");


        layout.addComponent(grid);

        setContent(layout);


    }
}
