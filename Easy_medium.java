package TUF_DSA;

// public class Easy_medium {
//     //****
//     //****
//     //****
//     //****
    
//     public void pattern1(int n) {

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Easy_medium obj = new Easy_medium();
//         obj.pattern1(5);
//     }
// }







//*
//** 
//***
//****
public class Easy_medium{
        
    public void pattern2(int n) {
        for(int i = 1; i<= n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String [] args){
        Easy_medium obj = new Easy_medium();
        obj.pattern2(5);
    }
}
    
