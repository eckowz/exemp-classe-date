/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import util.Console;

/**
 *
 * @author 631120345
 */
public class MainDate4 {

    public static void main(String[] args) {
        String dataString = Console.scanString("Data(dd/mm/aaa): ");
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            Date minhaData = formatador.parse(dataString);
            System.out.println("Data digitada: " + minhaData);
        } catch (ParseException ex) {
            //Logger.getLogger(MainDate4.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data no formato inválido.");
        }
        
    }
}
