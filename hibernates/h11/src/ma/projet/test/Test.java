package ma.projet.test;

import java.util.Date;
import ma.projet.entities.Produit;
import ma.projet.service.ProduitService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    public static void main(String[] args)  {
        ProduitService produit = new ProduitService() ;
        Produit p = new Produit() ;
        produit.create(new Produit("bic", "F555", new Date(), 1.5, "stylo"));
        produit.create(new Produit("zara", "F532", new Date(), 1600.0, "t-shirt"));
        produit.create(new Produit("dell", "C765", new Date(),4000.0, "pc"));
        produit.create(new Produit("kioxa", "N870", new Date(),60.5, "USB"));
        
          produit.findAll().stream().forEach((pr) -> {
          System.out.println(pr.getMarque());
        });
        
        produit.findById(2);
        produit.delete(produit.findById(3));
        produit.update(produit.findById(1));
        
        if(p.getPrix() >= 100.0){
            System.out.println("les produits dont le prix ext supérieur à 100 dh sont : \n" + produit.findAll());
    }
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("entrer date debut intervalle sous cette forme yyyy-MM-dd");
        String datedebut = sc.nextLine();
        Date datedebutFormat = null;
        try {
            datedebutFormat = dateFormat.parse(datedebut);
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("entrer date fin intervalle sous cette forme yyyy-MM-dd");
        String datefin = sc.nextLine();
        Date datefinFormat = null;
        try {
            datefinFormat = dateFormat.parse(datefin);
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(" la liste des produits Commander entre " + datedebut + "et" + datefin + " sont:");
        for (Produit pr : produit.findAll()) {
            if (pr.getDateAchat().after(datedebutFormat) && pr.getDateAchat().before(datefinFormat)) {
                System.out.println("le produit:" + pr.getId());
        
     }     
       
    }
    }

}
