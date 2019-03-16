package sort;
/*
 * 插入排序
 * 稳定
 * 时间 n^2,空间 1
 * */
public class InsertSort {
	public static void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i-1; j >=0; j--) {
				if(a[j+1]<a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,9,7,3,8,2,41,9,7,3,8,41,9,7,3,8,2,67,3,82,67,3,8,2,41,9,5,0};
		insertSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
