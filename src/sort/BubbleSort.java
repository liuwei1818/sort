package sort;
/**
 * 冒泡排序
 * 稳定
 * 时间n^2,空间1
 * */
public class BubbleSort {
	public static void sort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			int temp;
			for (int j = a.length-1; j >= i+1; j--) {
				if(a[j]<a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1,9,7,3,8,2,41,9,7,3,8,41,9,7,3,8,2,67,3,82,67,3,8,2,41,9,5,0};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
