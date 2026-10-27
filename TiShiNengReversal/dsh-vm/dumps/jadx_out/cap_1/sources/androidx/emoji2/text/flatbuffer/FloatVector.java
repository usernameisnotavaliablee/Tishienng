package androidx.emoji2.text.flatbuffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FloatVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public FloatVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.FloatVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 4
            r1.__reset(r2, r0, r3)
            return r1
    }

    public float get(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            int r2 = r1.__element(r2)
            float r2 = r0.getFloat(r2)
            return r2
    }
}
