/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01;

/**
 *
 * @author 0wner
 */
public class ArrayFunctions {
    public static int linearSearch(int[] data, int target){
        for (int i = 0; i < data.length; i++) {
            if(target == data[i]) return i;
        }
        return -1;
    }
    
    public static String acronym(String phrase){
        StringBuilder result = new StringBuilder();
        for(String token : phrase.split("\\s+")){
            result.append(token.toUpperCase().charAt(0));
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        int[] data = {3,14,7,22,45,12,19,42,6};
        System.out.println("Search for 7: " + linearSearch(data, 7));
        System.out.println("Search for 6: " + linearSearch(data, 6));
    }
}
