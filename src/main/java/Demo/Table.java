/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ducmy
 */
public class Table {
    private String id;
    private int slot;
    
    // Create a Map obj called reservations
    // => Key: datetime, value:cusName & numOfGuests
    Map<LocalDateTime, Reservation> reservations;
    
    Table(String id, int slot) {
        this.id = id;
        this.slot = slot;
        this.reservations = new HashMap<>();
    }
    
    boolean isBooked(LocalDateTime arrDateHour) {
        return !reservations.containsKey(arrDateHour);
    }
    
    public void reserve(LocalDateTime arrDateHour, int numOfGuests, String customerName, String tel) {
        reservations.put(arrDateHour, new Reservation(numOfGuests, customerName));
    }
    
    public int getSlot() {
        return this.slot;
    }
    
    public String getId() {
        return this.id;
    }
}
