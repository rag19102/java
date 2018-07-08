import java.util.*;
import java.lang.*;
public class HelloWorld{

     public static void main(String []args){
       // System.out.println("Hello World");
        int a[];
        a = new int[10];
        int b,i,j,k=0;
        //System.out.println("enter the size of an array:");
        Scanner sc =new Scanner(System.in);
        b=sc.nextInt();
        //System.out.println("enter the elements of an array:");
        for(i=0;i<b;i++){
            a[i]=sc.nextInt();
        }
        /*for(i=0;i<b;i++){
            //a[i]=sc.nextInt();
            System.out.println(a[i]);
            
        }*/
        //below code is for swaping.
        
       /*for(i=0;i<b;i++){
            if(a[i]>a[i+1]){
                j=a[i];
                a[i]=a[i+1];
                a[i+1]=j;
                k++;
            }
            
        }*/
        //below code is for bubble sort
        /*for(i=0;i<b-1;i++){
            for(j=0;j<b-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    k++;
                }
            }
        }
        
        */
        //below code is for insertion sort
        //sorry no code done yet
        for(i=0;i<b;i++){
            //a[i]=sc.nextInt();
            System.out.print(a[i] + " ");
            
        }
        System.out.println(" "+k);
        
        
         
     }
}
