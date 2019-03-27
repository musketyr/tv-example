package tv;

import org.junit.Test;

import static org.junit.Assert.*;

public class TVTest {

    @Test
    public void testVolumeUp() {
        TV tv = new TV();

        assertEquals(0, tv.getVolume());

        tv.volumeDown();

        assertEquals(0, tv.getVolume());

        tv.volumeUp();

        assertEquals(1, tv.getVolume());

        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();

        assertEquals(4, tv.getVolume());

        tv.volumeDown();

        assertEquals(3, tv.getVolume());

        tv.volumeDown();
        tv.volumeDown();
        tv.volumeDown();

        assertEquals(0, tv.getVolume());

        tv.volumeDown();

        assertEquals(0, tv.getVolume());

        for (int i = 0; i < 1000; i++) {
            tv.volumeUp();
        }

        assertEquals(100, tv.getVolume());
    }
}