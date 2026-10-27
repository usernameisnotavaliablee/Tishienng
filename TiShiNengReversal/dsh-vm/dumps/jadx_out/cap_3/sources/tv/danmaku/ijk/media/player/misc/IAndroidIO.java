package tv.danmaku.ijk.media.player.misc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IAndroidIO {
    int close() throws java.io.IOException;

    int open(java.lang.String r1) throws java.io.IOException;

    int read(byte[] r1, int r2) throws java.io.IOException;

    long seek(long r1, int r3) throws java.io.IOException;
}
