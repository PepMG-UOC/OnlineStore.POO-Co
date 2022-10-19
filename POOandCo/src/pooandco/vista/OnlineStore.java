package pooandco.vista;

import pooandco.modelo.ClienteEstandar;
import pooandco.modelo.ClientePremium;

public class OnlineStore {
    public static void main(String[] args) {


            GestionOS gestion = new GestionOS();
            gestion.inicio();


        System.out.println("Hello world!");

        ClienteEstandar cliente1 = new ClienteEstandar("Pedro", "calle 1", "9003482F", "pedro@mail.com", "Estandar");
        ClienteEstandar cliente2 = new ClienteEstandar("Ana", "calle 2", "5033471B", "ana@mail.com", "Estandar");
        ClientePremium cliente3 = new ClientePremium("Julian", "calle 3", "6663564G", "julian@mail.com", "Premium", 30, 20);
        ClientePremium cliente4 = new ClientePremium("Lara", "calle 4", "8963450H", "lara@mail.com", "Premium",30, 20);


    }

}
