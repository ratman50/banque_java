package models;

public class Compte implements  ICompte{

    long numero;
    double solde;


    public  Compte(){};

    public Compte(long numero, float solde){
        this();
        this.solde=solde;
        this.numero=numero;

    }
    public  Compte(Compte compte){
        this.solde=compte.solde;
        this.numero=compte.numero;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }



    @Override
    public void retrait(double montant) throws Exception {
        if(this.solde-montant<0 || montant<=0)
            throw new Exception("impossible de faire le retrait");
        this.solde-=montant;

    }

    @Override
    public void depot(double montant) throws  Exception{
        if (montant<0)
            throw new Exception();
        this.solde+=montant;
    }

    /**
     * @return solde of the compte
     */
    @Override
    public double getSolde() {
        return this.solde;
    }

    @Override
    public void virement(Compte co, double montant) throws Exception{
        if(montant<0)
            throw  new Exception("virement impossible car montant negatif");
        this.retrait(montant);
        co.depot(montant);
    }
}
