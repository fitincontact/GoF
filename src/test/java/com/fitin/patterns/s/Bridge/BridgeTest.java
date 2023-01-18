package com.fitin.patterns.s.Bridge;

import com.fitin.patterns.s.Bridge.impl.Radio;
import com.fitin.patterns.s.Bridge.impl.Tv;
import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    void tvTest() {
        var tv = new Tv();
        var remote = new Remote(tv);
        remote.volumeUp();
        remote.info();
        remote.togglePower();
        remote.info();
    }

    @Test
    void radioTest() {
        var radio = new Radio();
        var remote = new AdvancedRemote(radio);
        remote.channelUp();
        remote.volumeUp();
        remote.info();
        remote.mute();
        remote.info();
    }
}
