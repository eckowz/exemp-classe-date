/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datas;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 631120345
 */
public class MainDate2 {

    public static void main(String[] args) {
        Date dataAtual = new Date();

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataAtual);
        calendario.set(Calendar.YEAR,2010);
        //calendario.set(Calendar.MONTH, 11);
        calendario.set(Calendar.MONTH, Calendar.DECEMBER);
        
        dataAtual = calendario.getTime();
        System.out.println("Data: " + dataAtual);
    }

}
