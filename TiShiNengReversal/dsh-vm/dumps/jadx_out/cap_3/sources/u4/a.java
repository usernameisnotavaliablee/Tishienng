package u4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface a {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: u4.a$a, reason: collision with other inner class name */
    public static class C0057a {
        public final float[] a;
        private int b;
        private int c;

        public C0057a() {
                r1 = this;
                r1.<init>()
                r0 = 4
                float[] r0 = new float[r0]
                r1.a = r0
                return
        }

        public void a() {
                r3 = this;
                int r0 = r3.c
                float r0 = (float) r0
                int r1 = r3.b
                float r1 = (float) r1
                r2 = 0
                r3.c(r0, r1, r2, r2)
                return
        }

        public void b() {
                r3 = this;
                int r0 = r3.c
                float r0 = (float) r0
                int r1 = r3.b
                float r1 = (float) r1
                r2 = 0
                r3.c(r2, r2, r0, r1)
                return
        }

        public void c(float r3, float r4, float r5, float r6) {
                r2 = this;
                float[] r0 = r2.a
                r1 = 0
                r0[r1] = r3
                r3 = 1
                r0[r3] = r4
                r3 = 2
                r0[r3] = r5
                r3 = 3
                r0[r3] = r6
                return
        }

        public void d(int r1, int r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(master.flame.danmaku.danmaku.model.d r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c {
        public static final int v = -1;
        public boolean a;
        public master.flame.danmaku.danmaku.model.f b;
        public int c;
        public int d;
        public master.flame.danmaku.danmaku.model.d e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public long m;
        public long n;
        public long o;
        public boolean p;
        public long q;
        public long r;
        public long s;
        private master.flame.danmaku.danmaku.model.m t;
        private boolean u;

        public c() {
                r2 = this;
                r2.<init>()
                master.flame.danmaku.danmaku.model.f r0 = new master.flame.danmaku.danmaku.model.f
                r0.<init>()
                r2.b = r0
                master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
                r1 = 4
                r0.<init>(r1)
                r2.t = r0
                return
        }

        public int a(int r2, int r3) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto L29
                r0 = 4
                if (r2 == r0) goto L23
                r0 = 5
                if (r2 == r0) goto L1d
                r0 = 6
                if (r2 == r0) goto L17
                r0 = 7
                if (r2 == r0) goto L11
                r2 = 0
                return r2
            L11:
                int r2 = r1.j
                int r2 = r2 + r3
                r1.j = r2
                return r2
            L17:
                int r2 = r1.g
                int r2 = r2 + r3
                r1.g = r2
                return r2
            L1d:
                int r2 = r1.h
                int r2 = r2 + r3
                r1.h = r2
                return r2
            L23:
                int r2 = r1.i
                int r2 = r2 + r3
                r1.i = r2
                return r2
            L29:
                int r2 = r1.f
                int r2 = r2 + r3
                r1.f = r2
                return r2
        }

        public int b(int r2) {
                r1 = this;
                int r0 = r1.k
                int r0 = r0 + r2
                r1.k = r0
                return r0
        }

        public void c(master.flame.danmaku.danmaku.model.d r2) {
                r1 = this;
                boolean r0 = r1.u
                if (r0 != 0) goto L9
                master.flame.danmaku.danmaku.model.m r0 = r1.t
                r0.j(r2)
            L9:
                return
        }

        public master.flame.danmaku.danmaku.model.m d() {
                r3 = this;
                r0 = 1
                r3.u = r0
                monitor-enter(r3)
                master.flame.danmaku.danmaku.model.m r0 = r3.t     // Catch: java.lang.Throwable -> L13
                master.flame.danmaku.danmaku.model.android.e r1 = new master.flame.danmaku.danmaku.model.android.e     // Catch: java.lang.Throwable -> L13
                r2 = 4
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
                r3.t = r1     // Catch: java.lang.Throwable -> L13
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
                r1 = 0
                r3.u = r1
                return r0
            L13:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
                throw r0
        }

        public void e() {
                r3 = this;
                int r0 = r3.k
                r3.l = r0
                r0 = 0
                r3.k = r0
                r3.j = r0
                r3.i = r0
                r3.h = r0
                r3.g = r0
                r3.f = r0
                r1 = 0
                r3.m = r1
                r3.o = r1
                r3.n = r1
                r3.q = r1
                r3.p = r0
                monitor-enter(r3)
                master.flame.danmaku.danmaku.model.m r0 = r3.t     // Catch: java.lang.Throwable -> L25
                r0.clear()     // Catch: java.lang.Throwable -> L25
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                return
            L25:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                throw r0
        }

        public void f(u4.a.c r3) {
                r2 = this;
                if (r3 != 0) goto L3
                return
            L3:
                int r0 = r3.l
                r2.l = r0
                int r0 = r3.f
                r2.f = r0
                int r0 = r3.g
                r2.g = r0
                int r0 = r3.h
                r2.h = r0
                int r0 = r3.i
                r2.i = r0
                int r0 = r3.j
                r2.j = r0
                int r0 = r3.k
                r2.k = r0
                long r0 = r3.m
                r2.m = r0
                long r0 = r3.n
                r2.n = r0
                long r0 = r3.o
                r2.o = r0
                boolean r0 = r3.p
                r2.p = r0
                long r0 = r3.q
                r2.q = r0
                long r0 = r3.r
                r2.r = r0
                long r0 = r3.s
                r2.s = r0
                return
        }
    }

    void a(u4.a.b r1);

    void b(boolean r1);

    void c(master.flame.danmaku.danmaku.model.n r1, master.flame.danmaku.danmaku.model.m r2, long r3, u4.a.c r5);

    void clear();

    void d(boolean r1);

    void e(master.flame.danmaku.danmaku.model.k r1);

    void f();

    void g();

    void release();
}
