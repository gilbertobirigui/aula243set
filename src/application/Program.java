/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *  Set é um tipo generico igual lista <T>
 *  Set representa um conjunto de elementos (similar ao Algebra)
 *  nao admite repetiçoes
 *  elementos nao posui posicao - podem ate pusuir ordem mas nao posicao 
 * 
 * principais implementacoes
 * HastSet - mais rapido 
 * TreeSet - mais lento
 * LinkdHashSet - velocidade intermediaria
 * 
 * SET - na verdade é uma interface
 * https://docs.oracle.com/javase/10/docs/api/java/util/Set.html
 * 
 * add(obj), remove(obj), contains(obj)    == contains = se objeto existe
 * 
 * clear() - esvazia elementos
 * size() - tamanho elementos
 * removeIf(predicate)
 * 
 * 
 * addAll(other)- uniao  - adiciona no conjunto os elementos do outro conjunto, sem repeticao
 * retainAll(other) intersecao - remove o conjunto de elementos nao cintidos em other
 * removeAll(other) diferença - remove do conjunto os elementos contidos em other
 * 
 * 
 */
public class Program {
    
    
    public static void main(String[] args){
        
       // Set<String> set = new HashSet<>();  // hashset mais rapido
        
        // vou usar o TreeSet - ele ordena a lista por ondem alfabetica
       // Set<String> set = new TreeSet<>();  
        
        
        //
        Set<String> set = new LinkedHashSet<>();  // ele mantem a ordem que os elementos foi inseridos
        
        
        set.add("TV");
        set.add("TABLET");
        set.add("NOTEBOOK");
        
        
       // System.out.println(set.contains("NOTEBOOK"));
        
       // vamos testar algumas operacoes
       
       // remover O TABLET do meu conjunto
      // set.remove("TABLET");
       
       // removeIf - ele vai fazer quando eu colocar um predicado (predicado)
       
       // predicado - vou remover todo mundo que tiver pelo menos 3 caracter
       // set.removeIf(x -> x.length() >=3);   // vou remover elemento x tal que lenght() seja maior ou igual 3
       
        set.removeIf(x -> x.charAt(0) == 'T');  // remover todo mundo que tenha letra T
        // aqui vc pode por um predicado que x tal que x alguma coisa
        
       
        for( String p : set){
            System.out.println(p);
        }
        
        
    }
    
}
