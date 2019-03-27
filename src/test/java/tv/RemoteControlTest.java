package tv;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoteControlTest {

    @Test
    public void setVolume() {
        RemoteControl control = new RemoteControl(new TV());

        assertEquals(0, control.getTv().getVolume());

        control.setVolume(20);

        assertEquals(20, control.getTv().getVolume());

        control.setVolume(15);

        assertEquals(15, control.getTv().getVolume());

        control.setVolume(15);

        assertEquals(15, control.getTv().getVolume());

        control.setVolume(30);

        assertEquals(30, control.getTv().getVolume());
    }

    @Test
    public void volumeUpBy() {
        RemoteControl control = new RemoteControl(new TV());

        assertEquals(0, control.getTv().getVolume());

        control.volumeUpBy(5);

        assertEquals(5, control.getTv().getVolume());

        control.volumeUpBy(20);

        assertEquals(25, control.getTv().getVolume());

    }
}