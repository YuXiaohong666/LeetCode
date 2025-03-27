package easy;

public class _35SearchInsertPosition {
    public static void main(String[] args) {
        _35SearchInsertPosition test = new _35SearchInsertPosition();
        test.searchInsert(new int[]{1, 2, 3, 4, 5}, 3);
    }

    public int searchInsert(int[] nums, int target) {
        // 使用二分查找
        return binarySearch(nums, target);
    }

    public int binarySearch(int[] nums, int target) {
        // 初始化头指针和尾指针
        int head = 0;
        int tail = nums.length - 1;
        while (head <= tail) {
            int mid = (head + tail) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                head = mid + 1;
            } else if (nums[mid] > target) {
                tail = mid - 1;
            }
        }

        return head;
    }
}
