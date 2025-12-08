class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] list=mergeSortedArrays(nums1,nums2);
        int orta=(list.length-1)/2;
        if(list.length==1) return list[0];
        if(list.length%2!=0){
            return list[orta];
        }
        else {
           double result=(list[orta]+list[orta+1]);
           return result/2;
        }
    }
      public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // 1.dizi ve 2.dizi için index tutuyoruz ve dönecek dizide birleştiriyoruz
        int n1 = 0;
        int n2 = 0;
        int k = 0;
        int[] result = new int[arr1.length + arr2.length];
        while (n1 < arr1.length && n2 < arr2.length) {
            // hangisi daha küçük ise sonuc dizisine ilk onu ekliyoruz
            if (arr1[n1] < arr2[n2]) {
                result[k] = arr1[n1];
                n1++;
            } else {
                result[k] = arr2[n2];
                n2++;
            }
            k++;     
        }
        // n1 veya n2 bittiği için kalanları ekliyoruz
        while (n1<arr1.length){
            result[k]=arr1[n1];
            n1++;
            k++;
        }
        while (n2<arr2.length){
            result[k]=arr2[n2];
            n2++;
            k++;
        }

        return result;

    }
}