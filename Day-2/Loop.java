public class Loop {

    public static void main(String[] args) {
        
        // if statement nested statement 
        int a=45;
        int b=33;

        String result= a>b ? "a is greater than b" : "b is greater than a";
        System.out.println(result);

        // single line if else
        System.out.println( );

        System.out.println("Nested if statement\n");
        if(a>b){
            System.out.println("a is greater than b ");
        }else if(b>a){
            System.out.println("b is greater than a ");
        }else{
            System.out.println("a and b are equal..");
        }

        // for loop 
        //  it will print * with space 5 times
        for(int i=0;i<5;i++){
            System.out.print("* ");
        }

        // while loop --> it will run untile the condition is true
        System.out.println("---------------------- While loop ---------------------");
        int i=7;
        while (i<6) {
            System.out.println("* ");            
        }

    }


}
