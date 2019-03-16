package sort;
/*
 * 归并排序
 * 稳定
 * 时间nlogn，空间n+logn
 * */
public class MergeSort {
	private static int[] aux;
	public static void mergeSort(int[] a) {
		int length = a.length;
		aux = new int[length];
		mergeSort(a, 0, length-1);
	}
	public static void mergeSort(int[] a,int lo,int hi) {
		if(lo>=hi) return;
		int mid = (lo+hi)/2;
		mergeSort(a,lo,mid);
		mergeSort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	} 
	public static void merge(int[] a,int lo,int mid,int hi) {
		int i = lo,j = mid+1;
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		for(int k=lo;k<=hi;k++) {
			if(i>mid) a[k] = aux[j++];
			else if(j>hi) a[k] = aux[i++];
			else if(aux[j]<aux[i]) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
	}
	public static void main(String[] args) {
		int[] a = {1,9,7,3,8,2,41,9,7,3,8,41,9,7,3,8,2,67,3,82,67,3,8,2,41,9,5,0};
		mergeSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
