package sort;
/*
 * 堆排序
 * 不稳定
 * 时间nlogn,空间n+logn
 * */
public class HeapSort {
	public static void heapsort(int[] a) {
		int heapsize = a.length;
		buildheap(a);
		for (int i = 0; i < a.length-1; i++) {
			int temp = a[0];
			a[0] = a[heapsize-1];
			a[heapsize-1] = temp;
			heapsize = heapsize - 1;
			heapify(a,0,heapsize);
		}
	}
	
	public static void buildheap(int[] a) {
		int len = a.length;
		int heapsize = len;
		int nonleaf = len/2-1;
		for(int i=nonleaf;i>=0;i--) {
			heapify(a,i,heapsize);
		}
	}
	
	public static void heapify(int[] a,int i,int heapsize) {
		int biggest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<heapsize) {
			if(a[i]<a[left]) {
				biggest = left;
			}else {
				biggest = i;
			}
		}
		if(right<heapsize) {
			if(a[biggest]<a[right]) {
				biggest = right;
			}
		}
		if(biggest!=i) {
			int temp = a[biggest];
			a[biggest] = a[i];
			a[i] = temp;
			heapify(a,biggest,heapsize);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,4,5,2,6,9,7,8,0};
		heapsort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
