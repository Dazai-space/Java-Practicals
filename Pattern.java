/**
 * Pattern
 */
public class Pattern {

// Pattern 1:

//             *****
//             *****
//             *****
//             *****

//     public static void main(String[] args) {
//         for (int i = 1; i <=4; i++) {
//             for (int j = 1; j <=5; j++) {
//                 System.out.print("*");
                
//             }System.out.println();
            
//         }
//     }

// Pattern 2
// *****
// *   *
// *   *
// *****

    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=5; j++) {
                if (i==1 || j==1 || i==4 || j==5) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
            }
            
        System.out.println();
    }
    }


// Pattern 3:
// *
// **
// ***
// ****
    // public static void main(String[] args) {
    //     for (int i = 1; i <=4; i++) {
    //         for (int j = 1; j<=i; j++) {
    //             System.out.print("*");
    //         }System.out.println("");
    //     }
    // }

}