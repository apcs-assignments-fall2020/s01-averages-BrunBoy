public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double yuzu=0;
        double mk=0;
        for (int row=0; row<mat.length; row++){
            for (int column=0; column<mat[0].length; column++){
                mk+=mat[row][column];
                yuzu+=1;
            }
        }
        return mk/yuzu;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        double[]huah=new double[mat.length*mat[0].length];
        double smeerkat=0;
        int i=0;
        for (int row=0; row<mat.length; row++){
            for (int column=0; column<mat[0].length; column++){
                huah[i]=mat[row][column];
                i++;
            }
        }
        if (huah.length%2!=0){
            smeerkat=huah[huah.length/2];
        }
        else{
            smeerkat=huah[huah.length/2]+huah[(huah.length/2)-1];
            smeerkat=smeerkat/2;
        }
        return smeerkat;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        double[]huah=new double[mat.length*mat[0].length];
        double smeerkat=0;
        int i=0;
        for (int row=0; row<mat.length; row++){
            for (int column=0; column<mat[0].length; column++){
                huah[i]=mat[row][column];
                i++;
            }
        }
        double modenumber=0;
        int modecount=0;
        for (int a=0; a<huah.length; a++){
            int count=0;
            for (int j=0; j<huah.length; j++){
                if (huah[a]==huah[j]){
                    count++;
                    if (count>modecount){
                        modecount=count-1;
                        modenumber=huah[a];
                    }
                }
            }
        }
        return modenumber;   
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
