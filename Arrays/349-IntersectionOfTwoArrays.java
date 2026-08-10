import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for (int num:nums1)
            set.add(num);
        int[] ans=new int[set.size()];
        int i=0;
        for (int num:nums2) {
            if (set.remove(num))
                ans[i++]=num;
        }
        return Arrays.copyOf(ans,i);
    }
}
