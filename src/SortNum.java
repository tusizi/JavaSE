
public class SortNum {
    public static void main(String[] args) {
       String s  = "2,4,8,6,9,1,3,5,7";
        String [] a = s.split(",");
        int[] num;
        num = new int[a.length];
       for(int i = 0; i<num.length;i++){
          num[i] = Integer.parseInt(a[i]);
       }
    print(num);
        selectionSort(num);
        System.out.println();
        print(num);

    }
    private static  void print(int[] num){
        for(int i = 0; i<num.length;i++)
        System.out.print(num[i] + "   ");
    }
    private  static void  selectionSort(int[] num){
        for(int i=0;i<num.length;i++){
            int k=i;
            for(int j=k+1;j<num.length;j++){
                if(num[j]<num[k]){
                    k=j;
                }
            }
            if(k!=i){
                int temp = num[i];
                num[i]=num[k];
                num[k]=temp;
            }
        }
    }
}
