package set3;
class sortedarr {
    public int removeDuplicates(int[] a) {
        if (a.length == 0)
            return 0;

        int b = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                a[b] = a[i];
                b++;
            }
        }
        return b;
    }
}
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1862141696