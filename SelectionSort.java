public class SelectionSort{
  
  public static void main(String[] args){
    
    //Initializing the array
    int testing[] = {5, 8, 3, 9, 1};
    int temp;
    
    
    //Attempting to 
    for (int i=0; i<testing.length; i++){
      for (int j=0; j<testing.length-1; j++){
        int k = j+1;
        int a = testing[j];
        int b = testing[k];
        if (b<a){
          int temp1=a;
          int temp2=b;
          testing[j] = b;
          testing[k] = a;
        }
      
      }
      
    }
    for(int d=0; d<testing.length; d++){
      System.out.println(testing[d]);
    }
  
  }//End of Main's Class

}//End of bubleSorting class