/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 631120345
 */
public class MainDate3 {
    public static void main(String[] args) {
        Date dataAtual = new Date();
        
        SimpleDateFormat formatador = new SimpleDateFormat("'Data: 'dd/MM/yyyy 'Hora: 'HH:mm:ss");
        
        System.out.println(formatador.format(dataAtual));
    }
}
