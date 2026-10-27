package pl.droidsonroids.relinker.elf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f implements java.io.Closeable, pl.droidsonroids.relinker.elf.c {
    private final int a;
    private final java.nio.channels.FileChannel b;

    public f(java.io.File r2) throws java.io.FileNotFoundException {
            r1 = this;
            r1.<init>()
            r0 = 1179403647(0x464c457f, float:13073.374)
            r1.a = r0
            if (r2 == 0) goto L1c
            boolean r0 = r2.exists()
            if (r0 == 0) goto L1c
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.nio.channels.FileChannel r2 = r0.getChannel()
            r1.b = r2
            return
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "File is null or does not exist"
            r2.<init>(r0)
            throw r2
    }

    private long a(pl.droidsonroids.relinker.elf.c.b r11, long r12, long r14) throws java.io.IOException {
            r10 = this;
            r0 = 0
        L2:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L26
            pl.droidsonroids.relinker.elf.c$c r2 = r11.b(r0)
            long r3 = r2.a
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            long r3 = r2.c
            int r7 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r7 > 0) goto L24
            long r7 = r2.d
            long r7 = r7 + r3
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 > 0) goto L24
            long r14 = r14 - r3
            long r11 = r2.b
            long r14 = r14 + r11
            return r14
        L24:
            long r0 = r0 + r5
            goto L2
        L26:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Could not map vma to file offset!"
            r11.<init>(r12)
            throw r11
    }

    public pl.droidsonroids.relinker.elf.c.b b() throws java.io.IOException {
            r6 = this;
            java.nio.channels.FileChannel r0 = r6.b
            r1 = 0
            r0.position(r1)
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            long r1 = r6.i(r0, r1)
            r3 = 1179403647(0x464c457f, double:5.827028246E-315)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L48
            r1 = 4
            short r1 = r6.e(r0, r1)
            r2 = 5
            short r0 = r6.e(r0, r2)
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r1 != r2) goto L38
            pl.droidsonroids.relinker.elf.d r1 = new pl.droidsonroids.relinker.elf.d
            r1.<init>(r0, r6)
            return r1
        L38:
            if (r1 != r3) goto L40
            pl.droidsonroids.relinker.elf.e r1 = new pl.droidsonroids.relinker.elf.e
            r1.<init>(r0, r6)
            return r1
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid class type!"
            r0.<init>(r1)
            throw r0
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid ELF Magic!"
            r0.<init>(r1)
            throw r0
    }

    public java.util.List<java.lang.String> c() throws java.io.IOException {
            r22 = this;
            r0 = r22
            java.nio.channels.FileChannel r1 = r0.b
            r2 = 0
            r1.position(r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            pl.droidsonroids.relinker.elf.c$b r1 = r0.b()
            r4 = 8
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r4)
            boolean r4 = r1.a
            if (r4 == 0) goto L1f
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            goto L21
        L1f:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
        L21:
            r7.order(r4)
            int r4 = r1.f
            long r4 = (long) r4
            r8 = 65535(0xffff, double:3.23786E-319)
            r10 = 0
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 != 0) goto L35
            pl.droidsonroids.relinker.elf.c$d r4 = r1.c(r10)
            long r4 = r4.a
        L35:
            r8 = r2
        L36:
            r11 = 1
            int r13 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r13 >= 0) goto L4d
            pl.droidsonroids.relinker.elf.c$c r13 = r1.b(r8)
            long r14 = r13.a
            r16 = 2
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 != 0) goto L4b
            long r8 = r13.b
            goto L4e
        L4b:
            long r8 = r8 + r11
            goto L36
        L4d:
            r8 = r2
        L4e:
            int r13 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r13 != 0) goto L57
            java.util.List r1 = java.util.Collections.unmodifiableList(r6)
            return r1
        L57:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r14 = r2
            r16 = r14
        L5f:
            pl.droidsonroids.relinker.elf.c$a r2 = r1.a(r8, r10)
            r18 = r11
            long r11 = r2.a
            int r3 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r3 != 0) goto L75
            long r11 = r2.b
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r13.add(r3)
            goto L7d
        L75:
            r20 = 5
            int r3 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r3 != 0) goto L7d
            long r14 = r2.b
        L7d:
            int r10 = r10 + 1
            long r2 = r2.a
            int r11 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r11 != 0) goto Lb5
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 == 0) goto Lad
            r2 = r4
            r4 = r14
            long r1 = r0.a(r1, r2, r4)
            java.util.Iterator r3 = r13.iterator()
        L93:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r3.next()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = r4 + r1
            java.lang.String r4 = r0.h(r7, r4)
            r6.add(r4)
            goto L93
        Lac:
            return r6
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "String table offset not found!"
            r1.<init>(r2)
            throw r1
        Lb5:
            r2 = r4
            r4 = r14
            r11 = r18
            r4 = r2
            goto L5f
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.b
            r0.close()
            return
    }

    protected void d(java.nio.ByteBuffer r7, long r8, int r10) throws java.io.IOException {
            r6 = this;
            r0 = 0
            r7.position(r0)
            r7.limit(r10)
            r1 = 0
        L9:
            long r3 = (long) r10
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L22
            java.nio.channels.FileChannel r3 = r6.b
            long r4 = r8 + r1
            int r3 = r3.read(r7, r4)
            r4 = -1
            if (r3 == r4) goto L1c
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L9
        L1c:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>()
            throw r7
        L22:
            r7.position(r0)
            return
    }

    protected short e(java.nio.ByteBuffer r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.d(r2, r3, r0)
            byte r2 = r2.get()
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r2 = (short) r2
            return r2
    }

    protected int f(java.nio.ByteBuffer r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.d(r2, r3, r0)
            short r2 = r2.getShort()
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            return r2
    }

    protected long g(java.nio.ByteBuffer r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 8
            r1.d(r2, r3, r0)
            long r2 = r2.getLong()
            return r2
    }

    protected java.lang.String h(java.nio.ByteBuffer r4, long r5) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            r1 = 1
            long r1 = r1 + r5
            short r5 = r3.e(r4, r5)
            if (r5 == 0) goto L14
            char r5 = (char) r5
            r0.append(r5)
            r5 = r1
            goto L5
        L14:
            java.lang.String r4 = r0.toString()
            return r4
    }

    protected long i(java.nio.ByteBuffer r3, long r4) throws java.io.IOException {
            r2 = this;
            r0 = 4
            r2.d(r3, r4, r0)
            int r3 = r3.getInt()
            long r3 = (long) r3
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            return r3
    }
}
