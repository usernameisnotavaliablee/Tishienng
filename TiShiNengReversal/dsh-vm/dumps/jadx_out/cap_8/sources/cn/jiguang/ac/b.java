package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private java.nio.ByteBuffer a;

    /* renamed from: b, reason: collision with root package name */
    private int f332b;

    /* renamed from: c, reason: collision with root package name */
    private int f333c;

    public b(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            r0.a = r1
            r1 = -1
            r0.f332b = r1
            r0.f333c = r1
            return
    }

    private void c(int r2) {
            r1 = this;
            int r0 = r1.b()
            if (r2 > r0) goto L7
            return
        L7:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "end of input"
            r2.<init>(r0)
            throw r2
    }

    public int a() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.a
            int r0 = r0.position()
            return r0
    }

    public void a(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            int r0 = r0.capacity()
            java.nio.ByteBuffer r1 = r2.a
            int r1 = r1.position()
            int r0 = r0 - r1
            if (r3 > r0) goto L1a
            java.nio.ByteBuffer r0 = r2.a
            int r1 = r0.position()
            int r1 = r1 + r3
            r0.limit(r1)
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cannot set active region past end of input"
            r3.<init>(r0)
            throw r3
    }

    public void a(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.c(r4)
            java.nio.ByteBuffer r0 = r1.a
            r0.get(r2, r3, r4)
            return
    }

    public int b() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.a
            int r0 = r0.remaining()
            return r0
    }

    public void b(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.a
            int r0 = r0.capacity()
            if (r2 >= r0) goto L17
            java.nio.ByteBuffer r0 = r1.a
            r0.position(r2)
            java.nio.ByteBuffer r2 = r1.a
            int r0 = r2.capacity()
            r2.limit(r0)
            return
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cannot jump past end of input"
            r2.<init>(r0)
            throw r2
    }

    public void c() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            int r1 = r0.capacity()
            r0.limit(r1)
            return
    }

    public void d() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.a
            int r0 = r0.position()
            r1.f332b = r0
            java.nio.ByteBuffer r0 = r1.a
            int r0 = r0.limit()
            r1.f333c = r0
            return
    }

    public void e() {
            r2 = this;
            int r0 = r2.f332b
            if (r0 < 0) goto L16
            java.nio.ByteBuffer r1 = r2.a
            r1.position(r0)
            java.nio.ByteBuffer r0 = r2.a
            int r1 = r2.f333c
            r0.limit(r1)
            r0 = -1
            r2.f332b = r0
            r2.f333c = r0
            return
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no previous state"
            r0.<init>(r1)
            throw r0
    }

    public int f() {
            r1 = this;
            r0 = 1
            r1.c(r0)
            java.nio.ByteBuffer r0 = r1.a
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public int g() {
            r2 = this;
            r0 = 2
            r2.c(r0)
            java.nio.ByteBuffer r0 = r2.a
            short r0 = r0.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    public long h() {
            r4 = this;
            r0 = 4
            r4.c(r0)
            java.nio.ByteBuffer r0 = r4.a
            int r0 = r0.getInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }
}
