/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author morgennebesenschek
 */
public class Question5 {
    
   public void insertionSort(int[] n){
      
       
        //loop through the array until all numbers are sorted
        for(int i = 1; i < n.length; i++)
        {
            //set variable j equal to i
            int j = i;
            //while int at position j is greater than 0
            //and while int at position j-1 is greater than int at position j
            while(j > 0 && n[j-1] < n[j])
            {
              //assign int at position j to a temporary variable
              int temp = n[j];
              //set int at position j to int at position j-1
              n[j] = n[j-1];
              //set int at position j-1 to the original value of int at position j
              n[j-1] = temp;
              //subtract 1 from j each loop around
              j--;
            }
        }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creates an array for testing insertionSort
        int[] n = {25,30,20,80,40,60};
        
        Question5 test = new Question5();
        //runs insertionSort to sort the array
        test.insertionSort(n);
        
        //prints the results of the sort
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
        
        
    }
    
}
