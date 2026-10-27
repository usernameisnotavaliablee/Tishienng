package master.flame.danmaku.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b {
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    public static final int j = 16;
    public static final int k = 32;
    public static final int l = 64;
    public static final int m = 128;
    public static final int n = 256;
    public static final int o = 512;
    public static final java.lang.String p = "1010_Filter";
    public static final java.lang.String q = "1011_Filter";
    public static final java.lang.String r = "1012_Filter";
    public static final java.lang.String s = "1013_Filter";
    public static final java.lang.String t = "1014_Filter";
    public static final java.lang.String u = "1015_Filter";
    public static final java.lang.String v = "1016_Filter";
    public static final java.lang.String w = "1017_Filter";
    public static final java.lang.String x = "1018_Filter";
    public static final java.lang.String y = "1019_Filter";
    public final java.lang.Exception a;
    private final java.util.Map<java.lang.String, master.flame.danmaku.controller.b.e<?>> b;
    private final java.util.Map<java.lang.String, master.flame.danmaku.controller.b.e<?>> c;
    master.flame.danmaku.controller.b.e<?>[] d;
    master.flame.danmaku.controller.b.e<?>[] e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a<T> implements master.flame.danmaku.controller.b.e<T> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public void clear() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: master.flame.danmaku.controller.b$b, reason: collision with other inner class name */
    public static class C0121b extends master.flame.danmaku.controller.b.a<java.lang.Void> {
        protected final master.flame.danmaku.danmaku.model.m a;
        protected final java.util.LinkedHashMap<java.lang.String, master.flame.danmaku.danmaku.model.d> b;
        private final master.flame.danmaku.danmaku.model.m c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: master.flame.danmaku.controller.b$b$a */
        class a extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
            long e;
            final /* synthetic */ long f;
            final /* synthetic */ master.flame.danmaku.controller.b.C0121b g;

            a(master.flame.danmaku.controller.b.C0121b r1, long r2) {
                    r0 = this;
                    r0.g = r1
                    r0.f = r2
                    r0.<init>()
                    long r1 = v4.c.b()
                    r0.e = r1
                    return
            }

            @Override // master.flame.danmaku.danmaku.model.m.b
            public /* bridge */ /* synthetic */ int a(java.lang.Object r1) {
                    r0 = this;
                    master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                    int r1 = r0.e(r1)
                    return r1
            }

            public int e(master.flame.danmaku.danmaku.model.d r7) {
                    r6 = this;
                    r0 = 1
                    long r1 = v4.c.b()     // Catch: java.lang.Exception -> L17
                    long r3 = r6.e     // Catch: java.lang.Exception -> L17
                    long r1 = r1 - r3
                    long r3 = r6.f     // Catch: java.lang.Exception -> L17
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 <= 0) goto Lf
                    return r0
                Lf:
                    boolean r7 = r7.w()     // Catch: java.lang.Exception -> L17
                    if (r7 == 0) goto L17
                    r7 = 2
                    return r7
                L17:
                    return r0
            }
        }

        public C0121b() {
                r2 = this;
                r2.<init>()
                master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
                r1 = 4
                r0.<init>(r1)
                r2.a = r0
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r2.b = r0
                master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
                r0.<init>(r1)
                r2.c = r0
                return
        }

        private void d(java.util.LinkedHashMap<java.lang.String, master.flame.danmaku.danmaku.model.d> r8, int r9) {
                r7 = this;
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
                long r0 = v4.c.b()
            Lc:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L31
                java.lang.Object r2 = r8.next()     // Catch: java.lang.Exception -> L31
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> L31
                java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L31
                master.flame.danmaku.danmaku.model.d r2 = (master.flame.danmaku.danmaku.model.d) r2     // Catch: java.lang.Exception -> L31
                boolean r2 = r2.w()     // Catch: java.lang.Exception -> L31
                if (r2 == 0) goto L31
                r8.remove()     // Catch: java.lang.Exception -> L31
                long r2 = v4.c.b()
                long r2 = r2 - r0
                long r4 = (long) r9
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto Lc
            L31:
                return
        }

        private final void e(master.flame.danmaku.danmaku.model.m r2, long r3) {
                r1 = this;
                master.flame.danmaku.controller.b$b$a r0 = new master.flame.danmaku.controller.b$b$a
                r0.<init>(r1, r3)
                r2.a(r0)
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                r0.f(r1)
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6) {
                r0 = this;
                boolean r2 = r0.c(r1, r2, r3, r4, r5)
                if (r2 == 0) goto Lc
                int r3 = r1.G
                r3 = r3 | 128(0x80, float:1.8E-43)
                r1.G = r3
            Lc:
                return r2
        }

        public synchronized boolean c(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5) {
                r0 = this;
                monitor-enter(r0)
                master.flame.danmaku.danmaku.model.m r2 = r0.a     // Catch: java.lang.Throwable -> L24
                r3 = 2
                r0.e(r2, r3)     // Catch: java.lang.Throwable -> L24
                master.flame.danmaku.danmaku.model.m r2 = r0.c     // Catch: java.lang.Throwable -> L24
                r0.e(r2, r3)     // Catch: java.lang.Throwable -> L24
                java.util.LinkedHashMap<java.lang.String, master.flame.danmaku.danmaku.model.d> r2 = r0.b     // Catch: java.lang.Throwable -> L24
                r3 = 3
                r0.d(r2, r3)     // Catch: java.lang.Throwable -> L24
                master.flame.danmaku.danmaku.model.m r2 = r0.a     // Catch: java.lang.Throwable -> L24
                boolean r2 = r2.g(r1)     // Catch: java.lang.Throwable -> L24
                r3 = 1
                if (r2 == 0) goto L26
                boolean r2 = r1.s()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L26
                monitor-exit(r0)
                return r3
            L24:
                r1 = move-exception
                goto L64
            L26:
                master.flame.danmaku.danmaku.model.m r2 = r0.c     // Catch: java.lang.Throwable -> L24
                boolean r2 = r2.g(r1)     // Catch: java.lang.Throwable -> L24
                r4 = 0
                if (r2 == 0) goto L31
                monitor-exit(r0)
                return r4
            L31:
                java.util.LinkedHashMap<java.lang.String, master.flame.danmaku.danmaku.model.d> r2 = r0.b     // Catch: java.lang.Throwable -> L24
                java.lang.CharSequence r5 = r1.c     // Catch: java.lang.Throwable -> L24
                boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L24
                if (r2 == 0) goto L52
                java.util.LinkedHashMap<java.lang.String, master.flame.danmaku.danmaku.model.d> r2 = r0.b     // Catch: java.lang.Throwable -> L24
                java.lang.CharSequence r4 = r1.c     // Catch: java.lang.Throwable -> L24
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L24
                r2.put(r4, r1)     // Catch: java.lang.Throwable -> L24
                master.flame.danmaku.danmaku.model.m r2 = r0.a     // Catch: java.lang.Throwable -> L24
                r2.e(r1)     // Catch: java.lang.Throwable -> L24
                master.flame.danmaku.danmaku.model.m r2 = r0.a     // Catch: java.lang.Throwable -> L24
                r2.j(r1)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r0)
                return r3
            L52:
                java.util.LinkedHashMap<java.lang.String, master.flame.danmaku.danmaku.model.d> r2 = r0.b     // Catch: java.lang.Throwable -> L24
                java.lang.CharSequence r3 = r1.c     // Catch: java.lang.Throwable -> L24
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L24
                r2.put(r3, r1)     // Catch: java.lang.Throwable -> L24
                master.flame.danmaku.danmaku.model.m r2 = r0.c     // Catch: java.lang.Throwable -> L24
                r2.j(r1)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r0)
                return r4
            L64:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                throw r1
        }

        @Override // master.flame.danmaku.controller.b.a, master.flame.danmaku.controller.b.e
        public void clear() {
                r0 = this;
                r0.reset()
                return
        }

        public void f(java.lang.Void r1) {
                r0 = this;
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public synchronized void reset() {
                r1 = this;
                monitor-enter(r1)
                master.flame.danmaku.danmaku.model.m r0 = r1.c     // Catch: java.lang.Throwable -> L12
                r0.clear()     // Catch: java.lang.Throwable -> L12
                master.flame.danmaku.danmaku.model.m r0 = r1.a     // Catch: java.lang.Throwable -> L12
                r0.clear()     // Catch: java.lang.Throwable -> L12
                java.util.LinkedHashMap<java.lang.String, master.flame.danmaku.danmaku.model.d> r0 = r1.b     // Catch: java.lang.Throwable -> L12
                r0.clear()     // Catch: java.lang.Throwable -> L12
                monitor-exit(r1)
                return
            L12:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends master.flame.danmaku.controller.b.a<java.lang.Object> {
        long a;

        public c() {
                r2 = this;
                r2.<init>()
                r0 = 20
                r2.a = r0
                return
        }

        private synchronized boolean c(master.flame.danmaku.danmaku.model.d r3, int r4, int r5, master.flame.danmaku.danmaku.model.f r6, boolean r7) {
                r2 = this;
                monitor-enter(r2)
                r4 = 0
                if (r6 == 0) goto L20
                boolean r3 = r3.s()     // Catch: java.lang.Throwable -> L1d
                if (r3 != 0) goto Lb
                goto L20
            Lb:
                long r0 = v4.c.b()     // Catch: java.lang.Throwable -> L1d
                long r5 = r6.a     // Catch: java.lang.Throwable -> L1d
                long r0 = r0 - r5
                long r5 = r2.a     // Catch: java.lang.Throwable -> L1d
                int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r3 < 0) goto L1b
                monitor-exit(r2)
                r3 = 1
                return r3
            L1b:
                monitor-exit(r2)
                return r4
            L1d:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                throw r3
            L20:
                monitor-exit(r2)
                return r4
        }

        @Override // master.flame.danmaku.controller.b.e
        public void a(java.lang.Object r1) {
                r0 = this;
                r0.reset()
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6) {
                r0 = this;
                boolean r2 = r0.c(r1, r2, r3, r4, r5)
                if (r2 == 0) goto Lc
                int r3 = r1.G
                r3 = r3 | 4
                r1.G = r3
            Lc:
                return r2
        }

        @Override // master.flame.danmaku.controller.b.a, master.flame.danmaku.controller.b.e
        public void clear() {
                r0 = this;
                r0.reset()
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public synchronized void reset() {
                r0 = this;
                monitor-enter(r0)
                monitor-exit(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d extends master.flame.danmaku.controller.b.a<java.lang.Boolean> {
        private java.lang.Boolean a;

        public d() {
                r1 = this;
                r1.<init>()
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r1.a = r0
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                r0.c(r1)
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6) {
                r0 = this;
                java.lang.Boolean r2 = r0.a
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto Le
                boolean r2 = r1.D
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                if (r2 == 0) goto L17
                int r3 = r1.G
                r3 = r3 | 64
                r1.G = r3
            L17:
                return r2
        }

        public void c(java.lang.Boolean r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public void reset() {
                r1 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r1.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e<T> {
        void a(T r1);

        boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6);

        void clear();

        void reset();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f extends master.flame.danmaku.controller.b.a<java.util.Map<java.lang.Integer, java.lang.Integer>> {
        private java.util.Map<java.lang.Integer, java.lang.Integer> a;

        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                java.util.Map r1 = (java.util.Map) r1
                r0.c(r1)
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6) {
                r0 = this;
                java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r0.a
                r4 = 0
                if (r3 == 0) goto L24
                int r5 = r1.getType()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r3 = r3.get(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L1c
                int r3 = r3.intValue()
                if (r2 < r3) goto L1c
                r4 = 1
            L1c:
                if (r4 == 0) goto L24
                int r2 = r1.G
                r2 = r2 | 256(0x100, float:3.59E-43)
                r1.G = r2
            L24:
                return r4
        }

        public void c(java.util.Map<java.lang.Integer, java.lang.Integer> r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public void reset() {
                r1 = this;
                r0 = 0
                r1.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class g extends master.flame.danmaku.controller.b.a<java.util.Map<java.lang.Integer, java.lang.Boolean>> {
        private java.util.Map<java.lang.Integer, java.lang.Boolean> a;

        public g() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                java.util.Map r1 = (java.util.Map) r1
                r0.c(r1)
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6) {
                r0 = this;
                java.util.Map<java.lang.Integer, java.lang.Boolean> r2 = r0.a
                r3 = 0
                if (r2 == 0) goto L26
                int r4 = r1.getType()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object r2 = r2.get(r4)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L1e
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L1e
                if (r5 == 0) goto L1e
                r3 = 1
            L1e:
                if (r3 == 0) goto L26
                int r2 = r1.G
                r2 = r2 | 512(0x200, float:7.17E-43)
                r1.G = r2
            L26:
                return r3
        }

        public void c(java.util.Map<java.lang.Integer, java.lang.Boolean> r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public void reset() {
                r1 = this;
                r0 = 0
                r1.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class h extends master.flame.danmaku.controller.b.a<java.lang.Integer> {
        protected int a;
        protected master.flame.danmaku.danmaku.model.d b;
        private float c;

        public h() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.a = r0
                r0 = 0
                r1.b = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.c = r0
                return
        }

        private boolean c(master.flame.danmaku.danmaku.model.d r5, int r6, int r7, master.flame.danmaku.danmaku.model.f r8, boolean r9, master.flame.danmaku.danmaku.model.android.DanmakuContext r10) {
                r4 = this;
                int r7 = r4.a
                r8 = 0
                if (r7 <= 0) goto L46
                int r7 = r5.getType()
                r9 = 1
                if (r7 == r9) goto Ld
                goto L46
            Ld:
                master.flame.danmaku.danmaku.model.d r7 = r4.b
                if (r7 == 0) goto L44
                boolean r7 = r7.w()
                if (r7 == 0) goto L18
                goto L44
            L18:
                long r0 = r5.b()
                master.flame.danmaku.danmaku.model.d r7 = r4.b
                long r2 = r7.b()
                long r0 = r0 - r2
                master.flame.danmaku.danmaku.model.android.d r7 = r10.D
                master.flame.danmaku.danmaku.model.g r7 = r7.f
                r2 = 0
                int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r10 < 0) goto L3c
                if (r7 == 0) goto L3c
                float r10 = (float) r0
                long r0 = r7.c
                float r7 = (float) r0
                float r0 = r4.c
                float r7 = r7 * r0
                int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r7 >= 0) goto L3c
                return r9
            L3c:
                int r7 = r4.a
                if (r6 <= r7) goto L41
                return r9
            L41:
                r4.b = r5
                return r8
            L44:
                r4.b = r5
            L46:
                return r8
        }

        @Override // master.flame.danmaku.controller.b.e
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                r0.d(r1)
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public synchronized boolean b(master.flame.danmaku.danmaku.model.d r2, int r3, int r4, master.flame.danmaku.danmaku.model.f r5, boolean r6, master.flame.danmaku.danmaku.model.android.DanmakuContext r7) {
                r1 = this;
                monitor-enter(r1)
                boolean r3 = r1.c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L15
                r4 = r2
                r2 = r1
                if (r3 == 0) goto L13
                int r5 = r4.G     // Catch: java.lang.Throwable -> L10
                r5 = r5 | 2
                r4.G = r5     // Catch: java.lang.Throwable -> L10
                goto L13
            L10:
                r0 = move-exception
            L11:
                r3 = r0
                goto L18
            L13:
                monitor-exit(r1)
                return r3
            L15:
                r0 = move-exception
                r2 = r1
                goto L11
            L18:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r3
        }

        @Override // master.flame.danmaku.controller.b.a, master.flame.danmaku.controller.b.e
        public void clear() {
                r0 = this;
                r0.reset()
                return
        }

        public void d(java.lang.Integer r3) {
                r2 = this;
                r2.reset()
                if (r3 != 0) goto L6
                goto L21
            L6:
                int r0 = r3.intValue()
                int r1 = r2.a
                if (r0 == r1) goto L21
                int r0 = r3.intValue()
                int r3 = r3.intValue()
                int r3 = r3 / 5
                int r0 = r0 + r3
                r2.a = r0
                r3 = 1065353216(0x3f800000, float:1.0)
                float r0 = (float) r0
                float r3 = r3 / r0
                r2.c = r3
            L21:
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public synchronized void reset() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.b = r0     // Catch: java.lang.Throwable -> L6
                monitor-exit(r1)
                return
            L6:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class i extends master.flame.danmaku.controller.b.a<java.util.List<java.lang.Integer>> {
        public java.util.List<java.lang.Integer> a;

        public i() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.a = r0
                return
        }

        private void c(java.lang.Integer r2) {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.a
                boolean r0 = r0.contains(r2)
                if (r0 != 0) goto Ld
                java.util.List<java.lang.Integer> r0 = r1.a
                r0.add(r2)
            Ld:
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                r0.d(r1)
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6) {
                r0 = this;
                if (r1 == 0) goto L12
                java.util.List<java.lang.Integer> r2 = r0.a
                int r3 = r1.g
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                boolean r2 = r2.contains(r3)
                if (r2 != 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                if (r2 == 0) goto L1b
                int r3 = r1.G
                r3 = r3 | 8
                r1.G = r3
            L1b:
                return r2
        }

        public void d(java.util.List<java.lang.Integer> r2) {
                r1 = this;
                r1.reset()
                if (r2 == 0) goto L19
                java.util.Iterator r2 = r2.iterator()
            L9:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L19
                java.lang.Object r0 = r2.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.c(r0)
                goto L9
            L19:
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public void reset() {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.a
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class j extends master.flame.danmaku.controller.b.a<java.util.List<java.lang.Integer>> {
        final java.util.List<java.lang.Integer> a;

        public j() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = java.util.Collections.synchronizedList(r0)
                r1.a = r0
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                r0.e(r1)
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6) {
                r0 = this;
                r2 = 1
                if (r1 == 0) goto L15
                java.util.List<java.lang.Integer> r3 = r0.a
                int r4 = r1.getType()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                boolean r3 = r3.contains(r4)
                if (r3 == 0) goto L15
                r3 = 1
                goto L16
            L15:
                r3 = 0
            L16:
                if (r3 == 0) goto L1d
                int r4 = r1.G
                r2 = r2 | r4
                r1.G = r2
            L1d:
                return r3
        }

        public void c(java.lang.Integer r2) {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.a
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto Ld
                java.util.List<java.lang.Integer> r0 = r1.a
                r0.remove(r2)
            Ld:
                return
        }

        public void d(java.lang.Integer r2) {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.a
                boolean r0 = r0.contains(r2)
                if (r0 != 0) goto Ld
                java.util.List<java.lang.Integer> r0 = r1.a
                r0.add(r2)
            Ld:
                return
        }

        public void e(java.util.List<java.lang.Integer> r2) {
                r1 = this;
                r1.reset()
                if (r2 == 0) goto L19
                java.util.Iterator r2 = r2.iterator()
            L9:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L19
                java.lang.Object r0 = r2.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.d(r0)
                goto L9
            L19:
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public void reset() {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.a
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class k<T> extends master.flame.danmaku.controller.b.a<java.util.List<T>> {
        public java.util.List<T> a;

        public k() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.a = r0
                return
        }

        private void c(T r2) {
                r1 = this;
                java.util.List<T> r0 = r1.a
                boolean r0 = r0.contains(r2)
                if (r0 != 0) goto Ld
                java.util.List<T> r0 = r1.a
                r0.add(r2)
            Ld:
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                r0.d(r1)
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public abstract boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6);

        public void d(java.util.List<T> r2) {
                r1 = this;
                r1.reset()
                if (r2 == 0) goto L17
                java.util.Iterator r2 = r2.iterator()
            L9:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L17
                java.lang.Object r0 = r2.next()
                r1.c(r0)
                goto L9
            L17:
                return
        }

        @Override // master.flame.danmaku.controller.b.e
        public void reset() {
                r1 = this;
                java.util.List<T> r0 = r1.a
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class l extends master.flame.danmaku.controller.b.k<java.lang.String> {
        public l() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.controller.b.k, master.flame.danmaku.controller.b.e
        public boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6) {
                r0 = this;
                if (r1 == 0) goto Le
                java.util.List<T> r2 = r0.a
                java.lang.String r3 = r1.C
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                if (r2 == 0) goto L17
                int r3 = r1.G
                r3 = r3 | 32
                r1.G = r3
            L17:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class m extends master.flame.danmaku.controller.b.k<java.lang.Integer> {
        public m() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.controller.b.k, master.flame.danmaku.controller.b.e
        public boolean b(master.flame.danmaku.danmaku.model.d r1, int r2, int r3, master.flame.danmaku.danmaku.model.f r4, boolean r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6) {
                r0 = this;
                if (r1 == 0) goto L12
                java.util.List<T> r2 = r0.a
                int r3 = r1.B
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                if (r2 == 0) goto L1b
                int r3 = r1.G
                r3 = r3 | 16
                r1.G = r3
            L1b:
                return r2
        }
    }

    public b() {
            r2 = this;
            r2.<init>()
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "not suuport this filter tag"
            r0.<init>(r1)
            r2.a = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.SortedMap r0 = java.util.Collections.synchronizedSortedMap(r0)
            r2.b = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.SortedMap r0 = java.util.Collections.synchronizedSortedMap(r0)
            r2.c = r0
            r0 = 0
            master.flame.danmaku.controller.b$e[] r1 = new master.flame.danmaku.controller.b.e[r0]
            r2.d = r1
            master.flame.danmaku.controller.b$e[] r0 = new master.flame.danmaku.controller.b.e[r0]
            r2.e = r0
            return
    }

    private void j() {
            r1 = this;
            java.lang.Exception r0 = r1.a     // Catch: java.lang.Exception -> L3
            throw r0     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    public void a() {
            r5 = this;
            master.flame.danmaku.controller.b$e<?>[] r0 = r5.d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L11
            r4 = r0[r3]
            if (r4 == 0) goto Le
            r4.clear()
        Le:
            int r3 = r3 + 1
            goto L5
        L11:
            master.flame.danmaku.controller.b$e<?>[] r0 = r5.e
            int r1 = r0.length
        L14:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            if (r3 == 0) goto L1d
            r3.clear()
        L1d:
            int r2 = r2 + 1
            goto L14
        L20:
            return
    }

    public void b(master.flame.danmaku.danmaku.model.d r11, int r12, int r13, master.flame.danmaku.danmaku.model.f r14, boolean r15, master.flame.danmaku.danmaku.model.android.DanmakuContext r16) {
            r10 = this;
            master.flame.danmaku.controller.b$e<?>[] r0 = r10.d
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L23
            r3 = r0[r2]
            if (r3 == 0) goto L1e
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            boolean r3 = r3.b(r4, r5, r6, r7, r8, r9)
            master.flame.danmaku.danmaku.model.j r5 = r9.B
            int r5 = r5.c
            r11.H = r5
            if (r3 == 0) goto L20
            goto L23
        L1e:
            r9 = r16
        L20:
            int r2 = r2 + 1
            goto L4
        L23:
            return
    }

    public boolean c(master.flame.danmaku.danmaku.model.d r12, int r13, int r14, master.flame.danmaku.danmaku.model.f r15, boolean r16, master.flame.danmaku.danmaku.model.android.DanmakuContext r17) {
            r11 = this;
            master.flame.danmaku.controller.b$e<?>[] r0 = r11.e
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L26
            r4 = r0[r3]
            if (r4 == 0) goto L21
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            boolean r4 = r4.b(r5, r6, r7, r8, r9, r10)
            master.flame.danmaku.danmaku.model.j r6 = r10.B
            int r6 = r6.c
            r12.H = r6
            if (r4 == 0) goto L23
            r12 = 1
            return r12
        L21:
            r10 = r17
        L23:
            int r3 = r3 + 1
            goto L5
        L26:
            return r2
    }

    public master.flame.danmaku.controller.b.e<?> d(java.lang.String r2) {
            r1 = this;
            r0 = 1
            master.flame.danmaku.controller.b$e r2 = r1.e(r2, r0)
            return r2
    }

    public master.flame.danmaku.controller.b.e<?> e(java.lang.String r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r0 = r1.b
        L4:
            java.lang.Object r0 = r0.get(r2)
            master.flame.danmaku.controller.b$e r0 = (master.flame.danmaku.controller.b.e) r0
            goto Le
        Lb:
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r0 = r1.c
            goto L4
        Le:
            if (r0 != 0) goto L15
            master.flame.danmaku.controller.b$e r2 = r1.g(r2, r3)
            return r2
        L15:
            return r0
    }

    public master.flame.danmaku.controller.b.e<?> f(java.lang.String r2) {
            r1 = this;
            r0 = 1
            master.flame.danmaku.controller.b$e r2 = r1.g(r2, r0)
            return r2
    }

    public master.flame.danmaku.controller.b.e<?> g(java.lang.String r4, boolean r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L7
            r3.j()
            return r0
        L7:
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r1 = r3.b
            java.lang.Object r1 = r1.get(r4)
            master.flame.danmaku.controller.b$e r1 = (master.flame.danmaku.controller.b.e) r1
            if (r1 != 0) goto L9e
            java.lang.String r2 = "1010_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L20
            master.flame.danmaku.controller.b$j r1 = new master.flame.danmaku.controller.b$j
            r1.<init>()
            goto L9e
        L20:
            java.lang.String r2 = "1011_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L2f
            master.flame.danmaku.controller.b$h r1 = new master.flame.danmaku.controller.b$h
            r1.<init>()
            goto L9e
        L2f:
            java.lang.String r2 = "1012_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L3d
            master.flame.danmaku.controller.b$c r1 = new master.flame.danmaku.controller.b$c
            r1.<init>()
            goto L9e
        L3d:
            java.lang.String r2 = "1013_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4b
            master.flame.danmaku.controller.b$i r1 = new master.flame.danmaku.controller.b$i
            r1.<init>()
            goto L9e
        L4b:
            java.lang.String r2 = "1014_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L59
            master.flame.danmaku.controller.b$m r1 = new master.flame.danmaku.controller.b$m
            r1.<init>()
            goto L9e
        L59:
            java.lang.String r2 = "1015_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L67
            master.flame.danmaku.controller.b$l r1 = new master.flame.danmaku.controller.b$l
            r1.<init>()
            goto L9e
        L67:
            java.lang.String r2 = "1016_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L75
            master.flame.danmaku.controller.b$d r1 = new master.flame.danmaku.controller.b$d
            r1.<init>()
            goto L9e
        L75:
            java.lang.String r2 = "1017_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L83
            master.flame.danmaku.controller.b$b r1 = new master.flame.danmaku.controller.b$b
            r1.<init>()
            goto L9e
        L83:
            java.lang.String r2 = "1018_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L91
            master.flame.danmaku.controller.b$f r1 = new master.flame.danmaku.controller.b$f
            r1.<init>()
            goto L9e
        L91:
            java.lang.String r2 = "1019_Filter"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L9e
            master.flame.danmaku.controller.b$g r1 = new master.flame.danmaku.controller.b$g
            r1.<init>()
        L9e:
            if (r1 != 0) goto La4
            r3.j()
            return r0
        La4:
            r1.a(r0)
            if (r5 == 0) goto Lbf
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r5 = r3.b
            r5.put(r4, r1)
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r4 = r3.b
            java.util.Collection r4 = r4.values()
            master.flame.danmaku.controller.b$e<?>[] r5 = r3.d
            java.lang.Object[] r4 = r4.toArray(r5)
            master.flame.danmaku.controller.b$e[] r4 = (master.flame.danmaku.controller.b.e[]) r4
            r3.d = r4
            return r1
        Lbf:
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r5 = r3.c
            r5.put(r4, r1)
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r4 = r3.c
            java.util.Collection r4 = r4.values()
            master.flame.danmaku.controller.b$e<?>[] r5 = r3.e
            java.lang.Object[] r4 = r4.toArray(r5)
            master.flame.danmaku.controller.b$e[] r4 = (master.flame.danmaku.controller.b.e[]) r4
            r3.e = r4
            return r1
    }

    public void h() {
            r2 = this;
            r2.a()
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r0 = r2.b
            r0.clear()
            r0 = 0
            master.flame.danmaku.controller.b$e[] r1 = new master.flame.danmaku.controller.b.e[r0]
            r2.d = r1
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r1 = r2.c
            r1.clear()
            master.flame.danmaku.controller.b$e[] r0 = new master.flame.danmaku.controller.b.e[r0]
            r2.e = r0
            return
    }

    public void i() {
            r5 = this;
            master.flame.danmaku.controller.b$e<?>[] r0 = r5.d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L11
            r4 = r0[r3]
            if (r4 == 0) goto Le
            r4.reset()
        Le:
            int r3 = r3 + 1
            goto L5
        L11:
            master.flame.danmaku.controller.b$e<?>[] r0 = r5.e
            int r1 = r0.length
        L14:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            if (r3 == 0) goto L1d
            r3.reset()
        L1d:
            int r2 = r2 + 1
            goto L14
        L20:
            return
    }

    public void k(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.l(r2, r0)
            return
    }

    public void l(java.lang.String r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r0 = r1.b
        L4:
            java.lang.Object r2 = r0.remove(r2)
            master.flame.danmaku.controller.b$e r2 = (master.flame.danmaku.controller.b.e) r2
            goto Le
        Lb:
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r0 = r1.c
            goto L4
        Le:
            if (r2 == 0) goto L36
            r2.clear()
            if (r3 == 0) goto L26
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r2 = r1.b
            java.util.Collection r2 = r2.values()
            master.flame.danmaku.controller.b$e<?>[] r3 = r1.d
            java.lang.Object[] r2 = r2.toArray(r3)
            master.flame.danmaku.controller.b$e[] r2 = (master.flame.danmaku.controller.b.e[]) r2
            r1.d = r2
            return
        L26:
            java.util.Map<java.lang.String, master.flame.danmaku.controller.b$e<?>> r2 = r1.c
            java.util.Collection r2 = r2.values()
            master.flame.danmaku.controller.b$e<?>[] r3 = r1.e
            java.lang.Object[] r2 = r2.toArray(r3)
            master.flame.danmaku.controller.b$e[] r2 = (master.flame.danmaku.controller.b.e[]) r2
            r1.e = r2
        L36:
            return
    }
}
