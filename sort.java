import java.util.Scanner;

public class sort {
    public static void selectionSort(int arr[] , int n){
        for(int i=0;i<=n-2;i++){
             int min =i;
             for(int j=i;j<=n-1;j++) {
                 if(arr[j]< arr[min]){
                    min=j;
                 }
         }   
         
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
        }

    }
}
    public static void main(String[] args) {
        int n=6;       
        int arr[6];
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        n=sc.nextInt();  
       

        for(int i=0; i<n; i++)  
            {  
                 arr[i]=sc.nextInt();  
            }  
            selectionSort(arr,n);
        System.out.println("Array elements are: ");  
            for (int i=0; i<n; i++)   
                    {  
                        System.out.println(arr[i]);  
                    }  
}    
        
