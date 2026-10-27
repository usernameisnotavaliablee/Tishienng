package pl.droidsonroids.relinker.elf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j extends pl.droidsonroids.relinker.elf.c.d {
    public j(pl.droidsonroids.relinker.elf.f r4, pl.droidsonroids.relinker.elf.c.b r5, int r6) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r1 = r5.a
            if (r1 == 0) goto L10
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L12
        L10:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
        L12:
            r0.order(r1)
            long r1 = r5.d
            int r5 = r5.g
            int r6 = r6 * r5
            long r5 = (long) r6
            long r1 = r1 + r5
            r5 = 44
            long r1 = r1 + r5
            long r4 = r4.i(r0, r1)
            r3.a = r4
            return
    }
}
