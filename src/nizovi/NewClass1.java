package nizovi;

public class NewClass1 {

    public static void main(String[] args) {
 int[] array = {15, 22, 71, -27, 33, -44, 0, 334, -82};
int numPositives = 0;
int numNegatives = 0;
for(int i=0;i<array.length;i++){
    if (array[i] >= 0) {
        numPositives++;
    } else {
        numNegatives++;
    }
}

int[] negative = new int[numNegatives];
int[] positive = new int[numPositives];
int n = 0;
int p = 0;

for(int i=0;i<array.length;i++){
    if(array[i]<0){
        negative[n] = array[i];
        n++;
    }else{
        positive[p] = array[i];
        p++;
    }
}
       
    }

}
