package pl.droidsonroids.relinker.elf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends pl.droidsonroids.relinker.elf.c.AbstractC0092c {
    public h(pl.droidsonroids.relinker.elf.f r6, pl.droidsonroids.relinker.elf.c.b r7, long r8) throws java.io.IOException {
            r5 = this;
            r5.<init>()
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r1 = r7.a
            if (r1 == 0) goto L10
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L12
        L10:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
        L12:
            r0.order(r1)
            long r1 = r7.c
            int r7 = r7.e
            long r3 = (long) r7
            long r8 = r8 * r3
            long r1 = r1 + r8
            long r7 = r6.i(r0, r1)
            r5.a = r7
            r7 = 8
            long r7 = r7 + r1
            long r7 = r6.g(r0, r7)
            r5.b = r7
            r7 = 16
            long r7 = r7 + r1
            long r7 = r6.g(r0, r7)
            r5.c = r7
            r7 = 40
            long r1 = r1 + r7
            long r6 = r6.g(r0, r1)
            r5.d = r6
            return
    }
}
