package org.example;

import accounts.Epargne;
import models.Compte;
import repository.Repository;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        Compte co=new Compte(1234,2000);
        Epargne ep=new Epargne(co, new Date(), new Date(), 2.3);
        String[] colums={"id","cni"};
        //ep.virement();
        HashMap<String, String> params=new HashMap<>();
        HashMap<String, String> columns=new HashMap<>();
        HashMap<String, String> conditions=new HashMap<>();


        params.put("id","1");
        columns.put("id","2");
        conditions.put("id","1");


        Repository rep=new Repository();
        try {
            int op=rep.executeUpdate("clients", columns,conditions );
           // while (re.next())
           // {
           //     System.out.println(re.getString("id")+" "+re.getString("cni"));
            //}
        }catch (Exception e)
        {
            System.out.println(e);
        }


    }
}