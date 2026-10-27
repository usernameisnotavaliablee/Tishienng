package androidx.emoji2.text.flatbuffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BaseVector {
    protected java.nio.ByteBuffer bb;
    private int element_size;
    private int length;
    private int vector;

    public BaseVector() {
            r0 = this;
            r0.<init>()
            return
    }

    protected int __element(int r3) {
            r2 = this;
            int r0 = r2.vector
            int r1 = r2.element_size
            int r3 = r3 * r1
            int r0 = r0 + r3
            return r0
    }

    protected void __reset(int r1, int r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.bb = r3
            if (r3 == 0) goto L11
            r0.vector = r1
            int r1 = r1 + (-4)
            int r1 = r3.getInt(r1)
            r0.length = r1
            r0.element_size = r2
            return
        L11:
            r1 = 0
            r0.vector = r1
            r0.length = r1
            r0.element_size = r1
            return
    }

    protected int __vector() {
            r1 = this;
            int r0 = r1.vector
            return r0
    }

    public int length() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r0, r1)
            return
    }
}
