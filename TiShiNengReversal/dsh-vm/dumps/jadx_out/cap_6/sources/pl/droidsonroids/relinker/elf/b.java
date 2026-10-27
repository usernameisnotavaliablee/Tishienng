package pl.droidsonroids.relinker.elf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends pl.droidsonroids.relinker.elf.c.a {
    public b(pl.droidsonroids.relinker.elf.f r4, pl.droidsonroids.relinker.elf.c.b r5, long r6, int r8) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r5 = r5.a
            if (r5 == 0) goto L10
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            goto L12
        L10:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
        L12:
            r0.order(r5)
            int r8 = r8 * 16
            long r1 = (long) r8
            long r6 = r6 + r1
            long r1 = r4.g(r0, r6)
            r3.a = r1
            r1 = 8
            long r6 = r6 + r1
            long r4 = r4.g(r0, r6)
            r3.b = r4
            return
    }
}
