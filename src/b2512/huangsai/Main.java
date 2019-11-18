package b2512.huangsai;
//定义一组数组 将数组中的元素向右移动k个位,其中k是非复数
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        for (int i=0;i<k;i++){
            int a = number[number.length-1];
            System.arraycopy(number,0,number,1,number.length-1);
            //原数组 原数组起始索引 目标数组 目标数组的起始索引 要复制的数组长度
            number[0] = a;
            System.out.println(Arrays.toString(number));
        }
        /*for (int i=0;i<k;i++){
            int a = number[number.length-1];
            for (int j=number.length-1;j>=0;j--){
                if (j-1<0){
                    number[j] = a;
                }else{
                    number[j] = number[j-1];
                }
            }
        }
        for (int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }*/
    }
}
