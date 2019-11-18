package b2512.zhangguihong;

public class Main {
    public static void main(String[] args){
        int [] a={1,2,3,4,5,6,7};
        for(int i=1; i<=3; i++){
//			int c=a[a.length-1];
//			for(int j=a.length-1; j>=0; j--){
//
//					if(j-1<0){
//						a[j]=c;
//					}else{
//						a[j]=a[j-1];
//					}
//			}
//		}
//
//		for(int j=0; j<a.length; j++){
//			System.out.print(a[j]);
            int c=a[a.length-1];
            System.arraycopy(a, 0, a, 1, a.length-1);
            a[0]=c;
        }
        for(int j=0; j<a.length; j++){
            System.out.print(a[j]);
        }
    }
}
