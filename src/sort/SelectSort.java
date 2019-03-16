package sort;
/*
 * 选择排序
 * 不稳定
 * 时间n^2,空间1
 * */
public class SelectSort {
	public static void selectSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,9,7,3,8,2,41,9,7,3,8,41,9,7,3,8,2,67,3,82,67,3,8,2,41,9,5,0};
		selectSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
