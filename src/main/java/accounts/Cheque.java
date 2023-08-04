package accounts;

import models.Compte;
import models.ICompte;

public class Cheque extends Compte implements ICompte {
    static private    long frais;

    public Cheque(Compte co){
        super(co);
        Cheque.frais=200;
    }
    @Override
    public void virement(Compte co, double montant) throws  Exception {
        super.virement(co, montant-Cheque.frais);
    }

    @Override
    public void retrait(double montant) throws Exception {
        super.retrait(montant);
    }

}
