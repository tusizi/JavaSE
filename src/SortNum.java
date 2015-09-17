
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
    }
    private static  void print(int[] num){
        for(int i:num)
        System.out.println(num[i]);
    }
}
