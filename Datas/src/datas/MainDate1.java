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
public class MainDate1 {
    public static void main(String[] args) {
        Date dataAtual = new Date();
        System.out.println("Data no formato padrão da classe: " + dataAtual);
        System.out.println("Retorna a data atual no seu formato Long: " + dataAtual.getTime());
        
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataAtual);
        System.out.println("Dia do mês: " + calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia no mês: " + calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Mês: " + calendario.get(Calendar.MONTH));
        System.out.println("Ano: " + calendario.get(Calendar.YEAR));
        //System.out.println("" + calendario.get(Calendar.);
        //System.out.println("" + calendario.get(Calendar.);
        //System.out.println("" + calendario.get(Calendar.);
        
    }
}
