package androidx.emoji2.text.flatbuffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Struct {
    protected java.nio.ByteBuffer bb;
    protected int bb_pos;

    public Struct() {
            r0 = this;
            r0.<init>()
            return
    }

    public void __reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r1)
            return
    }

    protected void __reset(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.bb = r2
            if (r2 == 0) goto L7
            r0.bb_pos = r1
            return
        L7:
            r1 = 0
            r0.bb_pos = r1
            return
    }
}
