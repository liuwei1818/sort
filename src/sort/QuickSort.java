package sort;
/*
 * 快速排序
 * 不稳定
 * 时间nlogn，空间logn
 * */
public class QuickSort {
	public static int partition(int[] a,int begin,int end) {
		int i = begin,j = end+1;
		int v = a[begin];
		while(true) {
			while(a[++i]<v) if(i==end) break;
			while(a[--j]>v) if(j==begin) break;
			if(i>=j) break;
			exch(a,i,j);
		}
		exch(a,begin,j);
		return j;
	}
	
	public static void exch(int[] a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void sort(int[] a,int begin,int end) {
		if(begin>=end) return;
		int q = partition(a, begin, end);
		sort(a,begin,q-1);
		sort(a,q+1,end);
	}
	
	public static void sort(int[] a) {
		sort(a,0,a.length-1);
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,4,5,2,6,9,7,8,0};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
