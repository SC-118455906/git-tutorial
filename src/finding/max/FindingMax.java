/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding.max;

/**
 *
 * @author seanc
 */
public class FindingMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intArray = {23,14,68,34,7,44};
        
        int tempNo;
        boolean sorted = false;
        int max;
        while(!sorted){
            sorted = true;
            for(int i =0; i < intArray.length-1; i++){
                int j = i+1;

                if(intArray[i]>intArray[j]){
                    tempNo = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = tempNo;
                    sorted = false;
                }
            }
        }
        
        max = intArray[intArray.length-1];
        System.out.println("Max in this array is " + max);
    }
    
}
    

