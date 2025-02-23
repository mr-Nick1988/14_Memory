package telran.memory.test;

import org.junit.jupiter.api.Test;
import telran.memory.utils.MemoryService;
import static org.junit.jupiter.api.Assertions.*;

public class MemoryServiceTest {
    private int[] arr;

    @Test
    void testGetAvailableMemory() {
        int maxMemory = MemoryService.getMaxAvailableMemory();
        boolean flag;
        try {
            arr = new int[maxMemory];
            flag = true;
        } catch (Throwable e) {
            flag = false;
        }
        assertTrue(flag);
        try {
            arr = new int[maxMemory + 1];
            flag = true;
        } catch (Throwable e) {
            flag = false;
        }
        assertFalse(flag);
    }
}
