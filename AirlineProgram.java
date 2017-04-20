/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineprogram;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lscurbel
 * apologies for this, this was a really last minute attempt. Instead of passengers i tried using 
 * packages (shipping company) as passengers in theory.
 */
public class AirlineProgram {
    private ArrayList<String> fcshipments = new ArrayList();
    private ArrayList<String> ecshipments = new ArrayList();
    
    private String ClassPref;
    private String nptt;
    private String pref;

    public AirlineProgram(String ClassPref, String nptt, String pref) {
        this.ClassPref = ClassPref;
        this.nptt = nptt;
        this.pref = pref;
    }

    public AirlineProgram(){}
    
    
    public void addShipment(String clas,String nptt,String pref){
        this.ClassPref = clas;
        this.nptt = nptt;
       this.pref = pref;
       Scanner scanner = new Scanner(System.in);

       if (clas == "Economy")
          ecshipments.add("Economy");
        // boolean fcorec = false;
       if(clas =="First Class"){
            fcshipments.add("First Class");
        //    fcorec = true;
       }
     
           if((clas == "First Class") || (clas == "first class")) {
               System.out.println("For First Class only 1 or 2 persons allowed");
          //     fcorec = false;
       for(int i = 0; i <= 2; i++){
        fcshipments.add("1");
           System.out.println("Aisle or Window?");
           //pref = scanner.nextLine();
           pref = scanner.nextLine();
           fcshipments.add(pref);
    }}
       
           if((clas == "Economy") || (clas == "economy")){
               System.out.println("For Economy only one to three persons allowed");
          // fcorec = true;
           for(int i = 0; i <= 3; i++){
           ecshipments.add("1");
           System.out.println("Aisle, Center or Window?");
           pref = scanner.nextLine();
           ecshipments.add(pref);
    }}}
    
       
    public ArrayList<String> viewShipments(){
      ArrayList<String> totshipments = new ArrayList();
        totshipments.addAll(fcshipments);
        totshipments.addAll(ecshipments);
        totshipments.toString();
        return (totshipments);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        AirlineProgram beta1 = new AirlineProgram();
        while(true){
            int choices;
            System.out.println("ORD Air Export\n");
            System.out.println("--------------------------");
            System.out.println("Enter 1 to add a shipment");
            System.out.println("Enter 2 to view shipments");
            System.out.println("Enter 5 to quit the program.");
            choices = scanner.nextInt();
            
            switch (choices) {
                case 1:
                    {
                        System.out.println("Enter the desired class (Economy or First Class):");
                        String inClass = scanner.nextLine();
                        System.out.println("How many passengers will be traveling together?");
                        String inTrav = scanner.nextLine();
                      System.out.println("Enter the desired seating position:");
                        String inPref = scanner.nextLine();
                        beta1.addShipment(inClass,inTrav,inPref);
                        break;
                    }
                case 2:
                    {
                        beta1.viewShipments();
                        break;
                    }
                case 5:
                    System.exit(0); 
              
                   
               default:
                    break;
    }
        }
    }

}