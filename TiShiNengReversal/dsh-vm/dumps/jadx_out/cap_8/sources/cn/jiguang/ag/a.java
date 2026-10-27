package cn.jiguang.ag;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a implements java.io.Closeable {

    /* renamed from: j, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicInteger f454j;
    protected java.nio.ByteBuffer a;

    /* renamed from: b, reason: collision with root package name */
    protected java.nio.channels.SocketChannel f455b;

    /* renamed from: c, reason: collision with root package name */
    protected int f456c;

    /* renamed from: d, reason: collision with root package name */
    protected java.nio.channels.Selector f457d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile boolean f458e;

    /* renamed from: f, reason: collision with root package name */
    protected int f459f;

    /* renamed from: g, reason: collision with root package name */
    public int f460g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461h;

    /* renamed from: i, reason: collision with root package name */
    public int f462i;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.ag.a.f454j = r0
            return
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 20
            r2.f459f = r0
            r0 = 0
            r2.f460g = r0
            r1 = 49152(0xc000, float:6.8877E-41)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r2.a = r1
            r2.f458e = r0
            java.util.concurrent.atomic.AtomicInteger r0 = cn.jiguang.ag.a.f454j
            int r0 = r0.incrementAndGet()
            r2.f460g = r0
            return
    }

    public int a(java.lang.String r3, int r4) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            if (r0 != 0) goto Ld
            r0 = 49152(0xc000, float:6.8877E-41)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2.a = r0
        Ld:
            java.nio.ByteBuffer r0 = r2.a
            r0.clear()
            r0 = 0
            r2.f456c = r0
            r1 = 1
            r2.f458e = r1
            r2.f461h = r3
            r2.f462i = r4
            return r0
    }

    public abstract int a(byte[] r1);

    public java.nio.ByteBuffer a() {
            r1 = this;
            r0 = 0
            java.nio.ByteBuffer r0 = r1.a(r0)
            return r0
    }

    public abstract java.nio.ByteBuffer a(int r1);

    protected java.nio.ByteBuffer b(int r4) {
            r3 = this;
            int r0 = r3.f456c
            if (r0 < r4) goto L1e
            int r0 = r0 - r4
            r3.f456c = r0
            byte[] r0 = new byte[r4]
            java.nio.ByteBuffer r1 = r3.a
            r1.flip()
            java.nio.ByteBuffer r1 = r3.a
            r2 = 0
            r1.get(r0, r2, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r3.a
            r0.compact()
            return r4
        L1e:
            r4 = 0
            return r4
    }

    public boolean b() {
            r1 = this;
            boolean r0 = r1.f458e
            if (r0 == 0) goto L10
            java.nio.channels.SocketChannel r0 = r1.f455b
            if (r0 == 0) goto L10
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    protected int c() {
            r3 = this;
            int r0 = r3.f456c
            int r1 = r3.f459f
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            java.nio.ByteBuffer r0 = r3.a
            int r0 = r0.position()
            java.nio.ByteBuffer r1 = r3.a
            r1.position(r2)
            java.nio.ByteBuffer r1 = r3.a
            short r1 = r1.getShort()
            r1 = r1 & 32767(0x7fff, float:4.5916E-41)
            java.nio.ByteBuffer r2 = r3.a
            r2.position(r0)
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            r0 = 0
            r2.f458e = r0
            java.nio.ByteBuffer r1 = r2.a
            if (r1 == 0) goto La
            r1.clear()
        La:
            r2.f456c = r0
            return
    }
}
