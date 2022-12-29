class Sum{
  public void OddSum(){
    int s=0;
  for(int i=0;i<10;i++){
      s=s+i;
     }
    System.out.print("Sum of even no. is "+s);
    }      
}
public class Odd {
    public static void main(String args[]){
        int sum=0;
        for(int i=1;i<=10;i++){
         if(i%2!=0){
             System.out.println(i+" ");
         }
        }
        Sum s=new Sum();
        s.OddSum();
     }
}
