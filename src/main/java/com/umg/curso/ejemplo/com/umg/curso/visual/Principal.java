package com.umg.curso.ejemplo.com.umg.curso.visual;

import com.umg.curso.ejemplo.domain.Estudiante;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by ore on 10/07/17.
 */

@SpringUI
public class Principal extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout layout = new VerticalLayout();

        TextField txtNombre = new TextField("Ingrese un nombre");
        TextField txtEdad= new TextField("Ingrese la edad");
        final Button addEstudianteButton=new Button("Haz clic!",
                new Button.ClickListener() {
                    @Override
                    public void buttonClick(Button.ClickEvent clickEvent) {
                        clickEvent.getButton().setCaption("Listo!!");
                    }

                    //@Override
                    //public void buttonClick(ClickEvent event) {
                      //  event.getButton().setCaption("Done!");
                    //}
                });
        //addEstudianteButton.

        Grid<Estudiante> grid=new Grid<>();
        grid.addColumn(Estudiante::getNombre).setCaption("Nombre");
        grid.addColumn(Estudiante::getEdad).setCaption("Edad");



        layout.addComponent(txtNombre);
        layout.addComponent(txtEdad);
        layout.addComponent(addEstudianteButton);
        layout.addComponent(grid);


        setContent(layout);


    }
}
