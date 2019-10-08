/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author oracle
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] cod={"p1","p2","p3"};
        String[] desc ={"parafusos","cravos","tachas"};
        Double[] prezo ={3.0,4.0,5.0};
        
        try {
            PrintWriter a = new PrintWriter(new BufferedWriter(new FileWriter("/home/oracle/Desktop/ProbaExer4/produtosej8.txt")));
            BufferedReader read=new BufferedReader(new FileReader("/home/oracle/Desktop/ProbaExer4/produtosej8.txt"));
            for (int i = 0; i < prezo.length; i++) {
                a.print(cod[i]+"\t");
                a.print(desc[i]+"\t");
                a.println(prezo[i]);
            }
            a.close();
            String linea;   
            while ((linea=read.readLine())!=null) {
            // cada vez que ve un tabulador mete un separador de array.Este es el delimitador
            String [] leer= linea.split("\t"); 
            Product producto= new Product(leer[0],leer[1],Double.parseDouble(leer[2]));
                System.out.println(producto.toString());
                
}
                read.close();
            
            
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 

    }
}

    

