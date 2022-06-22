/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Demo.Restaurant;
import java.util.Scanner;

/**
 *
 * @author ducmy
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Restaurant r = new Restaurant();
//        r.addTable("T1",4);
//        r.addTable("T2",6);
//        r.addTable("T3",2);

    // MENU
    Scanner s = new Scanner(System.in);
    while(1>0) {
        System.out.println("***** Restaurant Management System *****");
        System.out.println("1. Manage a");
        System.out.println("2. Manage b");
        System.out.println("3. Manage c");
        System.out.println("4. Exit");
        int option = s.nextInt();
        switch(option) {
            case 1: {
                subMenu("a");
                break;
            }
            
            case 2: {
                subMenu("b");
                break;
            }
            
            case 3: {
                subMenu("c");
                break;
            }
            
            case 4: {
                System.out.println("See you again");
                System.exit(0);
            }
            
            default: {
                System.out.println("Please choose from 1 to 4");
                break;
            }
        }
    }
    }
    
    public static void subMenu(String title) {
        Scanner s = new Scanner(System.in);
        int option = 0;
        while(option != 5) {
            System.out.println("Manage " + title);
            System.out.println("1. Add " + title);
            System.out.println("2. Update " + title);
            System.out.println("3. Delete " + title);
            System.out.println("4. Display " + title + "'s list");
            System.out.println("5. Back to main menu");
            System.out.println("6. Quit");
            option = s.nextInt();
            switch(option) {
                case 1: {
                    System.out.println("Please add " + title);
                    break;
                }
                case 2: {
                    System.out.println("Please add " + title);
                    break;
                }
                case 3: {
                    System.out.println("Please add " + title);
                    break;
                }
                case 4: {
                    System.out.println("Please add " + title);
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
