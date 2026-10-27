package pl.droidsonroids.relinker.elf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends pl.droidsonroids.relinker.elf.c.b {
    private final pl.droidsonroids.relinker.elf.f m;

    public d(boolean r4, pl.droidsonroids.relinker.elf.f r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r3.a = r4
            r3.m = r5
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            if (r4 == 0) goto L11
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            goto L13
        L11:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
        L13:
            r0.order(r4)
            r1 = 16
            int r4 = r5.f(r0, r1)
            r3.b = r4
            r1 = 28
            long r1 = r5.i(r0, r1)
            r3.c = r1
            r1 = 32
            long r1 = r5.i(r0, r1)
            r3.d = r1
            r1 = 42
            int r4 = r5.f(r0, r1)
            r3.e = r4
            r1 = 44
            int r4 = r5.f(r0, r1)
            r3.f = r4
            r1 = 46
            int r4 = r5.f(r0, r1)
            r3.g = r4
            r1 = 48
            int r4 = r5.f(r0, r1)
            r3.h = r4
            r1 = 50
            int r4 = r5.f(r0, r1)
            r3.i = r4
            return
    }

    @Override // pl.droidsonroids.relinker.elf.c.b
    public pl.droidsonroids.relinker.elf.c.a a(long r7, int r9) throws java.io.IOException {
            r6 = this;
            pl.droidsonroids.relinker.elf.a r0 = new pl.droidsonroids.relinker.elf.a
            pl.droidsonroids.relinker.elf.f r1 = r6.m
            r2 = r6
            r3 = r7
            r5 = r9
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // pl.droidsonroids.relinker.elf.c.b
    public pl.droidsonroids.relinker.elf.c.AbstractC0092c b(long r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.relinker.elf.g r0 = new pl.droidsonroids.relinker.elf.g
            pl.droidsonroids.relinker.elf.f r1 = r2.m
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // pl.droidsonroids.relinker.elf.c.b
    public pl.droidsonroids.relinker.elf.c.d c(int r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.relinker.elf.i r0 = new pl.droidsonroids.relinker.elf.i
            pl.droidsonroids.relinker.elf.f r1 = r2.m
            r0.<init>(r1, r2, r3)
            return r0
    }
}
