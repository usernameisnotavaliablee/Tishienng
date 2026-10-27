package tv.danmaku.ijk.media.player.misc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IMediaDataSource {
    void close() throws java.io.IOException;

    long getSize() throws java.io.IOException;

    int readAt(long r1, byte[] r3, int r4, int r5) throws java.io.IOException;
}
