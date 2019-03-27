package tv;

public class TV {

    private String channel;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public String getChannel() {
        return channel;
    }

    public void volumeUp() {
        if (volume < 100) {
            volume = volume + 1;
        }

    }

    public void volumeDown() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }

    public void selectChannel(String ch) {

    }

}
