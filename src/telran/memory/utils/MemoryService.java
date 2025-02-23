package telran.memory.utils;

public class MemoryService {
    public static int getMaxAvailableMemory() {
        int low = 0;
        int high = Math.min(500_000_000,Integer.MAX_VALUE);
        int res = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            try {
                int[] arr = new int[mid];
                res = mid;
                low = mid + 1;
            } catch (OutOfMemoryError e) {
                high = mid - 1;
            }
        }
        return res;
    }
}
