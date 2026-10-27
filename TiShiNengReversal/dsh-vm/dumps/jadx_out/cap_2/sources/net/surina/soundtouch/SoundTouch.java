package net.surina.soundtouch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SoundTouch {
    long a;

    static {
            java.lang.String r0 = "soundtouch"
            java.lang.System.loadLibrary(r0)
            return
    }

    public SoundTouch() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            long r0 = newInstance()
            r2.a = r0
            return
    }

    private final native void deleteInstance(long r1);

    public static final native java.lang.String getErrorString();

    public static final native java.lang.String getVersionString();

    private static final native long newInstance();

    private final native int processFile(long r1, java.lang.String r3, java.lang.String r4);

    private final native void setPitchSemiTones(long r1, float r3);

    private final native void setSpeed(long r1, float r3);

    private final native void setTempo(long r1, float r3);

    public void a() {
            r2 = this;
            long r0 = r2.a
            r2.deleteInstance(r0)
            r0 = 0
            r2.a = r0
            return
    }

    public int b(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.a
            int r3 = r2.processFile(r0, r3, r4)
            return r3
    }

    public void c(float r3) {
            r2 = this;
            long r0 = r2.a
            r2.setPitchSemiTones(r0, r3)
            return
    }

    public void d(float r3) {
            r2 = this;
            long r0 = r2.a
            r2.setSpeed(r0, r3)
            return
    }

    public void e(float r3) {
            r2 = this;
            long r0 = r2.a
            r2.setTempo(r0, r3)
            return
    }
}
