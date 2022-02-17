public class arrays {
    public static void main(String[] args) {
//        char[] a = new char[5];
//        a[0] = 'a';
//        a[1] = 'b';
//        a[2] = 'c';
//        a[3] = 'd';
//        a[4] = 'e';
//        for (int i = 0; i < 5; i++) {
//            System.out.println(a[i]);
//        }
//        //values store in array using for loop
//        System.out.println("First array");
//        int[] x=new int[8];
//        for (int i=0; i<8; i++){
//            x[i]=i;
//        }
//        for (int i=0; i<8; i++){
//            System.out.println(x[i]);
//        }
//
//        //adding of arrays:
//        int[] y =new int[8];
//        for (int i=0;i<8;i++){
//            y[i]=i;
//        }
//        System.out.println("Second array");
//        for (int i=0;i<8;i++) {
//            System.out.println(y[i]);
//        }
        //addition perform
//        int[] c =new int[8];
//        for (int i=0;i<8;i++) {
//           c[i]=x[i]+y[i];
//            System.out.println("Third array after addition "+ c[i]);
//        }

        //Multidimensional array
        System.out.println(" First multi dimensional array");
        int [][] p = new int[3][3];
        int num1=1;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                p[i][j]=num1;
                ++num1;
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" Second multidimensional array");

//Second multidimensional array
        int [][] q = new int[3][3];
        int num2=10;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                q[i][j]=num2;
                ++num2;
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(q[i][j]+" ");
            }
            System.out.println(" ");
        }

//Third multidimensional array for addition
        int [][] r = new int[3][3];

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){

                r[i][j]=p[i][j]+q[i][j];
            }
        }
        System.out.println("Third multidimensional array after addition ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(r[i][j]+" ");
            }
            System.out.println(" ");
        }












    }
}