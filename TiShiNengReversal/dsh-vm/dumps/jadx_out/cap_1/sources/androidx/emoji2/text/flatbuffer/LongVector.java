package androidx.emoji2.text.flatbuffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LongVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public LongVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.LongVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 8
            r1.__reset(r2, r0, r3)
            return r1
    }

    public long get(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r3 = r2.__element(r3)
            long r0 = r0.getLong(r3)
            return r0
    }
}
