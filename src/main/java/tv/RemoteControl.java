package tv;

public class RemoteControl {

    private final TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    public void setVolume(int volume) {
        while (tv.getVolume() < volume) {
            tv.volumeUp();
        }
        while (tv.getVolume() > volume) {
            tv.volumeDown();
        }
    }

    public void volumeUpBy(int delta) {
        for (int i = 0; i < delta; i++) {
            tv.volumeUp();
        }
    }
}
