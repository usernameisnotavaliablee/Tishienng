package androidx.emoji2.text.flatbuffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class IntVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public IntVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.IntVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 4
            r1.__reset(r2, r0, r3)
            return r1
    }

    public int get(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            int r2 = r1.__element(r2)
            int r2 = r0.getInt(r2)
            return r2
    }

    public long getAsUnsigned(int r5) {
            r4 = this;
            int r5 = r4.get(r5)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }
}
