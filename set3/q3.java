package set3;

class Solution {
    public void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;

        rev(a, 0, n - 1);
        rev(a, 0, k - 1);
        rev(a, k, n - 1);
    }

    void rev(int[] a, int l, int r) {
        while (l < r) {
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }
}
