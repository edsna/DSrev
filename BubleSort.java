public class BubleSort {
  // 
  
  public static void main(String[] args){
    int integer[]={8, 3, 6, 2, 4,};
    int temp;
    
    boolean fixed=false;
    while(fixed==false){//Keep doing this untill the array is fully sorted
    fixed = true;
    for(int i=0; i<integer.length-1; i++){ //its length-1 because we're using the idex positions of the elements in the array
      if (integer[i] > integer[i+1]){ //if 8 >3 switch positions-buble sort
        temp = integer[i+1]; //stores smalest integer in temp (on this case=3)
        integer[i+1]= integer[i];//move 8 in 3's place
        integer[i]=temp;// move 3 on temp to 8t's place
        fixed = false; //keep doing this untill you exit the if statement
      }
    }
    }//End of while loop
    for (int i=0; i<integer.length;i++){
      System.out.print("Least To Greatest: ");
      System.out.println(integer[i]);
    }
    
    
  }//End of main

}//End of class