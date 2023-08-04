package models;

public interface ICompte {
    public void retrait(double montant) throws Exception;
    public void depot(double montant)throws Exception;
    public double getSolde();
    public  void virement(Compte co, double montant) throws Exception;
}
