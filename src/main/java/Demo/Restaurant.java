/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
/**
 *
 * @author ducmy
 */
public class Restaurant {
    
    private List<Table> tables = new ArrayList<>();
    
    public String reserveTable(String dateString, int numOfGuests, String customerName, String tel) {
        LocalDateTime arrDateTime = toDateTime(dateString);
        
        for(Table table: tables) {
            if(table.getSlot() >= numOfGuests && table.isBooked(arrDateTime)) {
                table.reserve(arrDateTime, numOfGuests, customerName, tel);
                return table.getId();
            }
        }
        
        return "No valid table";
    }
    
    public void addTable(String id, int slot) {
        tables.add(new Table(id,slot));
    }
    
    private LocalDateTime toDateTime(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH");
        return LocalDateTime.parse(dateString, formatter);
    }
}
