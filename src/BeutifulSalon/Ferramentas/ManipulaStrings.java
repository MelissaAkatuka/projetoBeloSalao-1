/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.Ferramentas;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class ManipulaStrings {

    public String abreviarNome(String nome) {
        
        String nomeInteiro = nome;
        nomeInteiro = nomeInteiro.replace(' ', ';');
        String nomePedacos[] = nomeInteiro.split(";");
   
        int k;
        String saida = "";
        for (k = 0; k <= nomePedacos.length - 1; k++) {
            if (k == 0 || k == (nomePedacos.length - 1)) {
                saida = saida + " " + nomePedacos[k];
            } else {
                if(!nomePedacos[k].equals(" ") ){
                    if( !nomePedacos[k].equals("de") &&
                        !nomePedacos[k].equals("da") && 
                        !nomePedacos[k].equals("do") && 
                        !nomePedacos[k].equals("das") && 
                        !nomePedacos[k].equals("dos")){
                        
                        saida = saida + " " + nomePedacos[k].charAt(0) + ". ";
                    }else if(nomePedacos[k].equals("de") ||
                        nomePedacos[k].equals("da") || 
                        nomePedacos[k].equals("do") || 
                        nomePedacos[k].equals("das") || 
                        nomePedacos[k].equals("dos")){
                        saida = saida + " " + nomePedacos[k];
                    }
                }
                
            }

        }
        return saida;
    }
}
