package ma.projet.test;

import java.util.Calendar;
import java.util.Date;
import ma.projet.entities.Employe;
import ma.projet.entities.EmployeTache;
import ma.projet.entities.EmployeTacheKey;
import ma.projet.entities.Projet;
import ma.projet.entities.Tache;
import ma.projet.service.EmployeService;
import ma.projet.service.EmployeTacheService;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
 public static Date generateDateFormat(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, 0, 0, 0);
        Date date = calendar.getTime();
        return date;
    }
    public static void main(String[] args) {
      EmployeService es=new EmployeService();
      EmployeTacheService ets=new EmployeTacheService();
      ProjetService ps=new ProjetService();
      TacheService ts=new TacheService();
      
//      Employe employe1=new Employe("test1","test1",06);
//      es.create(employe1);
//      
//      Projet projet1=new Projet("mmmm1",generateDateFormat(2022,01,01),generateDateFormat(2023,01,01));
//      ps.create(projet1);
//      
//      Tache tache1=new Tache("test1",generateDateFormat(2022,01,01),generateDateFormat(2023,01,01),500);
//      ts.create(tache1);
//      
//      EmployeTache  employeetache1 =new EmployeTache(new EmployeTacheKey(1,1,generateDateFormat(2022,01,01),generateDateFormat(2023,01,01)));
//      ets.create(employeetache1);
//      
      //3
      //es.afficherTachesRealiseesParEmploye(1);
      //4
    //  es.afficherProjetsRealiseesParEmploye(1);
      //5
        // ps.afficherTachesPlanifieesPourProjet(1) ;
//6
      ps.afficherTachesRealiseesPourProjet(1);
      
    }
}
