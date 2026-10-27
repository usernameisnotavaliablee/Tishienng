package master.flame.danmaku.danmaku.model.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class f implements master.flame.danmaku.danmaku.model.o<master.flame.danmaku.danmaku.model.android.g>, master.flame.danmaku.danmaku.model.objectpool.c<master.flame.danmaku.danmaku.model.android.f> {
    private final master.flame.danmaku.danmaku.model.android.g a;
    private int b;
    private master.flame.danmaku.danmaku.model.android.f c;
    private boolean d;
    private int e;

    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.e = r0
            master.flame.danmaku.danmaku.model.android.g r0 = new master.flame.danmaku.danmaku.model.android.g
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public int a() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.g r0 = r1.a
            int r0 = r0.f
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.objectpool.c
    public /* bridge */ /* synthetic */ master.flame.danmaku.danmaku.model.android.f b() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.f r0 = r1.l()
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public synchronized void c() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.e     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + (-1)
            r1.e = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public void d(int r7, int r8, int r9, boolean r10, int r11) {
            r6 = this;
            master.flame.danmaku.danmaku.model.android.g r0 = r6.a
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.a(r1, r2, r3, r4, r5)
            master.flame.danmaku.danmaku.model.android.g r7 = r6.a
            android.graphics.Bitmap r7 = r7.b
            int r7 = r7.getRowBytes()
            master.flame.danmaku.danmaku.model.android.g r8 = r6.a
            android.graphics.Bitmap r8 = r8.b
            int r8 = r8.getHeight()
            int r7 = r7 * r8
            r6.b = r7
            return
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public void destroy() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.g r0 = r1.a
            if (r0 == 0) goto L7
            r0.f()
        L7:
            r0 = 0
            r1.b = r0
            r1.e = r0
            return
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public int e() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.g r0 = r1.a
            int r0 = r0.e
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public void f() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.g r0 = r1.a
            r0.c()
            return
    }

    @Override // master.flame.danmaku.danmaku.model.objectpool.c
    public /* bridge */ /* synthetic */ void g(master.flame.danmaku.danmaku.model.android.f r1) {
            r0 = this;
            master.flame.danmaku.danmaku.model.android.f r1 = (master.flame.danmaku.danmaku.model.android.f) r1
            r0.m(r1)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public /* bridge */ /* synthetic */ master.flame.danmaku.danmaku.model.android.g get() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.g r0 = r1.k()
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.objectpool.c
    public void h(boolean r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public synchronized boolean hasReferences() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.e     // Catch: java.lang.Throwable -> La
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // master.flame.danmaku.danmaku.model.objectpool.c
    public boolean i() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public synchronized void j() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.e     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.e = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public master.flame.danmaku.danmaku.model.android.g k() {
            r2 = this;
            master.flame.danmaku.danmaku.model.android.g r0 = r2.a
            android.graphics.Bitmap r1 = r0.b
            if (r1 != 0) goto L7
            r0 = 0
        L7:
            return r0
    }

    public master.flame.danmaku.danmaku.model.android.f l() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.f r0 = r1.c
            return r0
    }

    public void m(master.flame.danmaku.danmaku.model.android.f r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // master.flame.danmaku.danmaku.model.o
    public int size() {
            r1 = this;
            int r0 = r1.b
            return r0
    }
}
