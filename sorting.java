import java.util.Scanner;

public class sorting {

    public static void arrayElements(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");

        int size = scanner.nextInt();

        int array[] = new int[size];
        

        if(array.length ==0){
            System.out.println("Array is empty");
            return;
        }
        else{
        System.out.println("Enter " + size + " elements");

        for(int p = 0; p<size;p++){
            System.out.println("Element" + (p+1) + " :"); 
            array[p]=scanner.nextInt();
        } 
    }     
        System.out.println("The array you have entered is: ");    

        for(int p=0;p<size;p++){
            System.out.print(array[p] +" "+'\n');
        }

        selSorting(array);
    }

    public static void selSorting(int array[]){

        System.out.println("Array after selection sorting is: ");

        for(int i=0;i<array.length-1;i++){
            int minIndex = i;
            
            for(int j=i+1;j<array.length;j++){
                if(array[minIndex] > array[j]){
                    minIndex= j;
                    
                }
            }
            if(minIndex!=i){
                int temp = array[i];
                array[i]=array[minIndex];
                array[minIndex]=temp;
            }
        }
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+'\n');
        }
    }



    public static void main(String[] args) {
    
        arrayElements();
    }
}
