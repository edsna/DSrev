public class SortingArrays {
  // 
  
  public static void main(String[] args){
    int integer[]={8, 3, 6, 2, 4,};
    int temp;
    boolean fixed=false;
    while(fixed==false){
    fixed = true;
    for(int i=0; i<integer.length-1; i++){
      if (integer[i] > integer[i+1]){
        //if 8 >3 switch positions
        temp = integer[i+1]; 
        //store greatest number in temp
        integer[i+1]= integer[i];
        //store 8 in 3's place
        integer[i]=temp;
        fixed = false;
      }
    }
    }
    for (int i=0; i<integer.length;i++){
      System.out.print(integer[i]);
    }
    
    
  }//End of main

}//End of class
