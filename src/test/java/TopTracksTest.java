import org.example.service.music.service.tracks.topTracks.MusicTopTracks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopTracksTest {

    private MusicTopTracks musicTopTracks;

    @BeforeEach
    void init() {
        musicTopTracks = new MusicTopTracks();
    }

    @DisplayName("Test name")
    @Test
    void getTopTrackTest() {
        assertEquals("My Love Mine All Mine", musicTopTracks.getTopTracks().get(0).getName());
        assertEquals("Cruel Summer", musicTopTracks.getTopTracks().get(1).getName());
    }
}
