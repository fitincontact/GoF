package com.fitin.patterns.b.State;

import org.junit.jupiter.api.Test;

import static com.fitin.patterns.b.State.PlayerState.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateTest {
    @Test
    void test() {
        var player = new Player(new NewWorldAlbum());

        var result = player.exec(PLAY);
        assertEquals("1. Berlin song: la-la-la!", result);

        result = player.exec(NEXT);
        assertEquals("2. Dog March", result);
        result = player.exec(PLAY);
        assertEquals("2. Dog March: la-la-la!", result);

        result = player.exec(NEXT);
        assertEquals("3. Go To The Cinema", result);
        result = player.exec(NEXT);
        assertEquals("4. I'm uzbek", result);
        result = player.exec(NEXT);
        assertEquals("5. Seva is uzbek too", result);
        result = player.exec(PLAY);
        assertEquals("5. Seva is uzbek too: la-la-la!", result);

        result = player.exec(PREVIOUS);
        assertEquals("4. I'm uzbek", result);
        result = player.exec(PLAY);
        assertEquals("4. I'm uzbek: la-la-la!", result);
    }
}
