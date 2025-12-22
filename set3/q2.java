package set3;

class q2 {
    public void moveZeroes(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] != 0) {
                        int t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                        break;
                    }
                }
            }
        }
    }
}
 //https://leetcode.com/problems/move-zeroes/submissions/1862146204