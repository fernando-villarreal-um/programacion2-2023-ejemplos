package ar.edu.um.programacion2.anio2023.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Arranque arranque = context.getBean(Arranque.class);
        ApplicationContextProvider applicationContextProvider = new ApplicationContextProvider();
        applicationContextProvider.setApplicationContext(context);
        arranque.arranque();
    }
}
