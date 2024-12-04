//while loop//
/**public class rose{
   
    public static void main(String[]args)
    {
        int i=10;
        while(i<=50){
            System.out.println(i);
            i++;
        }
        }
}**/
//Scanner//
/**import java.util.Scanner;
public class rose{
    public static void main(String[]args){
         Scanner scanner = new Scanner(System.in); 
         System.out.println("Enter a number:");
         int num= scanner.nextInt();
            if(num>0){System.out.println("POSITIVE");}
               
            else{System.out.println("NEGATIVE");}
               
        }
    }**/
//Reverse the number//
/**public class rose{
    public static void main (String[]args){
        int num=876;
        int reversedNum = 0;
        while(num!=0);
        {
            int digit=num%10;
            reversedNum=reversedNum*10+digit;
           num= num/=10;
        }
        System.out.println("Reverse of 876 is:"+reversedNum);
    }}
**/
//GREATER NUMBER
 /**import java.util.Scanner;
public class rose{
    public static void main(String[]args){
        Scanner  num1= new Scanner (System.in);
        System.out.println("Enter a number:");
        int a= num1.nextInt();
        Scanner num2=new Scanner(System.in);
        System.out.println("Enter a number:");
        int b= num2.nextInt();
        Scanner num3=new Scanner(System.in);
        System.out.println("Enter a number:");
        int c= num3.nextInt();
        if (a>b && a>c){
        System.out.println("num1 is greater");}
        else if ( b>c  && b>a){
        System.out.println("num2 is greater");}
        else {
            System.out.println("num3 is greater");
        }


    }
}
**/
//PAYABLE AMOUNT//
/**import java.util.Scanner;
public class rose{
    public static void main(String[]args){
       Scanner amount = new Scanner(System.in);
       System.out.println("Enter the price:");
       double price=amount.nextDouble();
       double payableamount=doublecalculatepayableamount(price);
       System.out.println("The final payable amount is:"+payableamount);
       public static  void main( doublecalculatepayableamount(double price)){
        double discount=0;
        if (price<500){
            System.out.println("NO DISCOUNT IS APPLIED");}
            else if(price>500 && price<1000){
                System.out.println("10% DISCOUNT IS APPLIED");
            discount=price*0.10;}
            else{System.out.println("20% DISCONT APPLIED");
        discount=price*0.20;} return price-discount;   }}}**/
        //PATTERN//
   /**  public class rose{
        public static void main(String[]args){
            int rows=5;
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=rows-i+1;j++){
                    System.out.println("5");
                }
                for(int k=1;k<=i-1;k++){
                    System.out.print((5-k)+"");
                }
                System.err.println();
            }
        }
**/

    
            
           
           
        
    

       
       