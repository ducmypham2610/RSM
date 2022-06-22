/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author ducmy
 */
class Reservation {
    private String customerName;
    private int numOfGuests;
    
    Reservation(int numOfGuests, String customerName) {
        this.customerName = customerName;
        this.numOfGuests = numOfGuests;
    }
}
