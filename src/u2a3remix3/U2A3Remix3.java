/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2a3remix3;

/**
 *
 * @author Jack
 */
import java.util.Scanner;
public class U2A3Remix3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define variables and inputs
        Scanner keyedInput = new Scanner (System.in);
   	 
    	double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2,65.8,44.8,88.6};
    	double total=0;
    	double average;
   	//output marks 
    	System.out.println("These are the marks:");
    	for (int i = 0; i<=8; i= i + 1)
    	{
       	System.out.println(marks[i]);
    	}
   	//calculate average 
    	for (int i = 0; i<=8; i= i + 1)
    	{
        	total = total + marks[i];
    	}
   	 
    	average = total/9;
   	 
    	average = average * 10;
    	average = Math.round(average);
    	average = average/10;
   	//output average 
    	System.out.println("The average mark is:");
    	System.out.println(average);

    }
    
}
