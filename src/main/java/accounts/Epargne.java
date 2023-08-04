package accounts;

import models.Compte;
import models.ICompte;

import java.util.Date;

public class Epargne extends Compte implements ICompte {
    private Date debut;
    private  Date fin;
    double taux;

    public  Epargne(Compte co,Date debut, Date fin, double taux){
        super(co);
        this.debut=debut;
        this.fin=fin;
        this.taux=taux;
    }
    @Override
    public double getSolde() {
        Date date=new Date();
        double solde=super.getSolde();
        return solde*(1+this.taux);
    }

}
