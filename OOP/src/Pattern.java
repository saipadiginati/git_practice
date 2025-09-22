public class Pattern {

    public static void main(String[] args) {

        int n=10;
        //int row=0;


        for(int row = 0;row < n/2 ;row++){

           // int col=0;

            int space =0;
            int count=0;

            for(int col =0;col<= row;col++){
                System.out.print(col+1);
                count++;

            }


            while(space < n- (2*row) -2 ){
                System.out.print(" ");
                space++;
            }
            int value=count;
            for(int nextValue= 0; nextValue <count;nextValue++){

                System.out.print(value--);
            }


            System.out.println();
        }
    }
}
