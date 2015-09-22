import javax.xml.crypto.Data;

/**
 * Created by tusizi on 2015/9/18.
 */
public class TestDataSort {
    public static void main(String[] args) {
        Date[] datas = new Date[5];
        datas[0] = new Date(2006, 5, 4);
        datas[0] = new Date(2006, 7, 4);
        datas[0] = new Date(2008, 5, 4);
        datas[0] = new Date(2004, 5, 9);
        datas[0] = new Date(2004, 5, 4);
        bubbleSort(datas);
        for(int i=0;i<datas.length;i++){
            System.out.println(datas[i]);
        }
    }
    public static void bubbleSort(Date[] datas){
        int len = datas.length;
        for(int i = len-1;i>=1;i--){
            for(int j = 0;j<=i-1;j++){
                if(datas[j].compare(datas[j+1])>0){
                    Date temp = datas[j];
                    datas[j] = datas[j+1];
                    datas[j+1] = temp;
                }
            }
        }

    }
}
 class Date {
    int year, month, day;
    Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }
    public  int compare(Date date){
        return year>date.year ? 1
                :year<date.year? -1
                :month>date.month ? 1
                :month<date.month ?-1
                :day>date.day ? 1
                :day<date.day ? -1 :0;
    }
}


