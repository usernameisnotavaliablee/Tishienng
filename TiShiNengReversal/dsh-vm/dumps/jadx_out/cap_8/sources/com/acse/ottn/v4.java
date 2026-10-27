package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class v4 extends com.acse.ottn.u4 {
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 4;
    public static final int r = 8;
    public static final int s = 16;
    public static final int t = 32;
    public static final int u = 64;
    public static final int v = 128;
    public static final int w = 256;
    public static final int x = 512;
    public static final int y = 511;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference<android.view.View> f2833b;

    /* renamed from: c, reason: collision with root package name */
    public long f2834c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2835d;

    /* renamed from: e, reason: collision with root package name */
    public long f2836e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2837f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.Interpolator f2838g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2839h;

    /* renamed from: i, reason: collision with root package name */
    public com.acse.ottn.j.a f2840i;

    /* renamed from: j, reason: collision with root package name */
    public com.acse.ottn.v4.b f2841j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.ArrayList<com.acse.ottn.v4.c> f2842k;
    public java.lang.Runnable l;
    public java.util.HashMap<com.acse.ottn.j, com.acse.ottn.v4.d> m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.v4 a;

        public a(com.acse.ottn.v4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.acse.ottn.v4 r0 = r1.a
                com.acse.ottn.v4.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.j.a, com.acse.ottn.r4.g {
        public final /* synthetic */ com.acse.ottn.v4 a;

        public b(com.acse.ottn.v4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ b(com.acse.ottn.v4 r1, com.acse.ottn.v4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.acse.ottn.j.a
        public void a(com.acse.ottn.j r2) {
                r1 = this;
                com.acse.ottn.v4 r0 = r1.a
                com.acse.ottn.j$a r0 = com.acse.ottn.v4.b(r0)
                if (r0 == 0) goto L11
                com.acse.ottn.v4 r0 = r1.a
                com.acse.ottn.j$a r0 = com.acse.ottn.v4.b(r0)
                r0.a(r2)
            L11:
                return
        }

        @Override // com.acse.ottn.r4.g
        public void a(com.acse.ottn.r4 r7) {
                r6 = this;
                float r0 = r7.u()
                com.acse.ottn.v4 r1 = r6.a
                java.util.HashMap r1 = com.acse.ottn.v4.c(r1)
                java.lang.Object r7 = r1.get(r7)
                com.acse.ottn.v4$d r7 = (com.acse.ottn.v4.d) r7
                int r1 = r7.a
                r1 = r1 & 511(0x1ff, float:7.16E-43)
                if (r1 == 0) goto L27
                com.acse.ottn.v4 r1 = r6.a
                java.lang.ref.WeakReference r1 = com.acse.ottn.v4.d(r1)
                java.lang.Object r1 = r1.get()
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L27
                r1.invalidate()
            L27:
                java.util.ArrayList<com.acse.ottn.v4$c> r7 = r7.f2845b
                if (r7 == 0) goto L49
                int r1 = r7.size()
                r2 = 0
            L30:
                if (r2 >= r1) goto L49
                java.lang.Object r3 = r7.get(r2)
                com.acse.ottn.v4$c r3 = (com.acse.ottn.v4.c) r3
                float r4 = r3.f2843b
                float r5 = r3.f2844c
                float r5 = r5 * r0
                float r4 = r4 + r5
                com.acse.ottn.v4 r5 = r6.a
                int r3 = r3.a
                com.acse.ottn.v4.a(r5, r3, r4)
                int r2 = r2 + 1
                goto L30
            L49:
                com.acse.ottn.v4 r7 = r6.a
                java.lang.ref.WeakReference r7 = com.acse.ottn.v4.d(r7)
                java.lang.Object r7 = r7.get()
                android.view.View r7 = (android.view.View) r7
                if (r7 == 0) goto L5a
                r7.invalidate()
            L5a:
                return
        }

        @Override // com.acse.ottn.j.a
        public void b(com.acse.ottn.j r2) {
                r1 = this;
                com.acse.ottn.v4 r0 = r1.a
                com.acse.ottn.j$a r0 = com.acse.ottn.v4.b(r0)
                if (r0 == 0) goto L11
                com.acse.ottn.v4 r0 = r1.a
                com.acse.ottn.j$a r0 = com.acse.ottn.v4.b(r0)
                r0.b(r2)
            L11:
                com.acse.ottn.v4 r0 = r1.a
                java.util.HashMap r0 = com.acse.ottn.v4.c(r0)
                r0.remove(r2)
                com.acse.ottn.v4 r2 = r1.a
                java.util.HashMap r2 = com.acse.ottn.v4.c(r2)
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L2c
                com.acse.ottn.v4 r2 = r1.a
                r0 = 0
                com.acse.ottn.v4.a(r2, r0)
            L2c:
                return
        }

        @Override // com.acse.ottn.j.a
        public void c(com.acse.ottn.j r2) {
                r1 = this;
                com.acse.ottn.v4 r0 = r1.a
                com.acse.ottn.j$a r0 = com.acse.ottn.v4.b(r0)
                if (r0 == 0) goto L11
                com.acse.ottn.v4 r0 = r1.a
                com.acse.ottn.j$a r0 = com.acse.ottn.v4.b(r0)
                r0.c(r2)
            L11:
                return
        }

        @Override // com.acse.ottn.j.a
        public void d(com.acse.ottn.j r2) {
                r1 = this;
                com.acse.ottn.v4 r0 = r1.a
                com.acse.ottn.j$a r0 = com.acse.ottn.v4.b(r0)
                if (r0 == 0) goto L11
                com.acse.ottn.v4 r0 = r1.a
                com.acse.ottn.j$a r0 = com.acse.ottn.v4.b(r0)
                r0.d(r2)
            L11:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public float f2843b;

        /* renamed from: c, reason: collision with root package name */
        public float f2844c;

        public c(int r1, float r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f2843b = r2
                r0.f2844c = r3
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.ArrayList<com.acse.ottn.v4.c> f2845b;

        public d(int r1, java.util.ArrayList<com.acse.ottn.v4.c> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f2845b = r2
                return
        }

        public boolean a(int r5) {
                r4 = this;
                int r0 = r4.a
                r0 = r0 & r5
                r1 = 0
                if (r0 == 0) goto L2d
                java.util.ArrayList<com.acse.ottn.v4$c> r0 = r4.f2845b
                if (r0 == 0) goto L2d
                int r0 = r0.size()
                r2 = 0
            Lf:
                if (r2 >= r0) goto L2d
                java.util.ArrayList<com.acse.ottn.v4$c> r3 = r4.f2845b
                java.lang.Object r3 = r3.get(r2)
                com.acse.ottn.v4$c r3 = (com.acse.ottn.v4.c) r3
                int r3 = r3.a
                if (r3 != r5) goto L2a
                java.util.ArrayList<com.acse.ottn.v4$c> r0 = r4.f2845b
                r0.remove(r2)
                int r0 = r4.a
                int r5 = ~r5
                r5 = r5 & r0
                r4.a = r5
                r5 = 1
                return r5
            L2a:
                int r2 = r2 + 1
                goto Lf
            L2d:
                return r1
        }
    }

    public v4(android.view.View r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f2835d = r0
            r1 = 0
            r3.f2836e = r1
            r3.f2837f = r0
            r3.f2839h = r0
            r0 = 0
            r3.f2840i = r0
            com.acse.ottn.v4$b r1 = new com.acse.ottn.v4$b
            r1.<init>(r3, r0)
            r3.f2841j = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f2842k = r0
            com.acse.ottn.v4$a r0 = new com.acse.ottn.v4$a
            r0.<init>(r3)
            r3.l = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.m = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.f2833b = r0
            return
    }

    public static /* synthetic */ com.acse.ottn.j.a a(com.acse.ottn.v4 r0, com.acse.ottn.j.a r1) {
            r0.f2840i = r1
            return r1
    }

    public static /* synthetic */ void a(com.acse.ottn.v4 r0) {
            r0.e()
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.v4 r0, int r1, float r2) {
            r0.c(r1, r2)
            return
    }

    public static /* synthetic */ com.acse.ottn.j.a b(com.acse.ottn.v4 r0) {
            com.acse.ottn.j$a r0 = r0.f2840i
            return r0
    }

    public static /* synthetic */ java.util.HashMap c(com.acse.ottn.v4 r0) {
            java.util.HashMap<com.acse.ottn.j, com.acse.ottn.v4$d> r0 = r0.m
            return r0
    }

    public static /* synthetic */ java.lang.ref.WeakReference d(com.acse.ottn.v4 r0) {
            java.lang.ref.WeakReference<android.view.View> r0 = r0.f2833b
            return r0
    }

    public final float a(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f2833b
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L62
            r1 = 1
            if (r3 == r1) goto L5d
            r1 = 2
            if (r3 == r1) goto L58
            r1 = 4
            if (r3 == r1) goto L53
            r1 = 8
            if (r3 == r1) goto L4e
            r1 = 16
            if (r3 == r1) goto L49
            r1 = 32
            if (r3 == r1) goto L44
            r1 = 64
            if (r3 == r1) goto L3f
            r1 = 128(0x80, float:1.8E-43)
            if (r3 == r1) goto L3a
            r1 = 256(0x100, float:3.59E-43)
            if (r3 == r1) goto L35
            r1 = 512(0x200, float:7.17E-43)
            if (r3 == r1) goto L30
            goto L62
        L30:
            float r3 = r0.getAlpha()
            return r3
        L35:
            float r3 = r0.getY()
            return r3
        L3a:
            float r3 = r0.getX()
            return r3
        L3f:
            float r3 = r0.getRotationY()
            return r3
        L44:
            float r3 = r0.getRotationX()
            return r3
        L49:
            float r3 = r0.getRotation()
            return r3
        L4e:
            float r3 = r0.getScaleY()
            return r3
        L53:
            float r3 = r0.getScaleX()
            return r3
        L58:
            float r3 = r0.getTranslationY()
            return r3
        L5d:
            float r3 = r0.getTranslationX()
            return r3
        L62:
            r3 = 0
            return r3
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 a(float r2) {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            r1.a(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 a(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lc
            r0 = 1
            r3.f2835d = r0
            r3.f2834c = r4
            return r3
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Animators cannot have negative duration: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 a(android.view.animation.Interpolator r2) {
            r1 = this;
            r0 = 1
            r1.f2839h = r0
            r1.f2838g = r2
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 a(com.acse.ottn.j.a r1) {
            r0 = this;
            r0.f2840i = r1
            return r0
    }

    @Override // com.acse.ottn.u4
    public void a() {
            r2 = this;
            java.util.HashMap<com.acse.ottn.j, com.acse.ottn.v4$d> r0 = r2.m
            int r0 = r0.size()
            if (r0 <= 0) goto L28
            java.util.HashMap<com.acse.ottn.j, com.acse.ottn.v4$d> r0 = r2.m
            java.lang.Object r0 = r0.clone()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.acse.ottn.j r1 = (com.acse.ottn.j) r1
            r1.cancel()
            goto L18
        L28:
            java.util.ArrayList<com.acse.ottn.v4$c> r0 = r2.f2842k
            r0.clear()
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f2833b
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L3c
            java.lang.Runnable r1 = r2.l
            r0.removeCallbacks(r1)
        L3c:
            return
    }

    public final void a(int r2, float r3) {
            r1 = this;
            float r0 = r1.a(r2)
            float r3 = r3 - r0
            r1.a(r2, r0, r3)
            return
    }

    public final void a(int r5, float r6, float r7) {
            r4 = this;
            java.util.HashMap<com.acse.ottn.j, com.acse.ottn.v4$d> r0 = r4.m
            int r0 = r0.size()
            if (r0 <= 0) goto L37
            java.util.HashMap<com.acse.ottn.j, com.acse.ottn.v4$d> r0 = r4.m
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            com.acse.ottn.j r1 = (com.acse.ottn.j) r1
            java.util.HashMap<com.acse.ottn.j, com.acse.ottn.v4$d> r2 = r4.m
            java.lang.Object r2 = r2.get(r1)
            com.acse.ottn.v4$d r2 = (com.acse.ottn.v4.d) r2
            boolean r3 = r2.a(r5)
            if (r3 == 0) goto L12
            int r2 = r2.a
            if (r2 != 0) goto L12
            goto L32
        L31:
            r1 = 0
        L32:
            if (r1 == 0) goto L37
            r1.cancel()
        L37:
            com.acse.ottn.v4$c r0 = new com.acse.ottn.v4$c
            r0.<init>(r5, r6, r7)
            java.util.ArrayList<com.acse.ottn.v4$c> r5 = r4.f2842k
            r5.add(r0)
            java.lang.ref.WeakReference<android.view.View> r5 = r4.f2833b
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L55
            java.lang.Runnable r6 = r4.l
            r5.removeCallbacks(r6)
            java.lang.Runnable r6 = r4.l
            r5.post(r6)
        L55:
            return
    }

    @Override // com.acse.ottn.u4
    public long b() {
            r2 = this;
            boolean r0 = r2.f2835d
            if (r0 == 0) goto L7
            long r0 = r2.f2834c
            return r0
        L7:
            com.acse.ottn.r4 r0 = new com.acse.ottn.r4
            r0.<init>()
            long r0 = r0.c()
            return r0
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 b(float r2) {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            r1.b(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 b(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lc
            r0 = 1
            r3.f2837f = r0
            r3.f2836e = r4
            return r3
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Animators cannot have negative duration: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final void b(int r2, float r3) {
            r1 = this;
            float r0 = r1.a(r2)
            r1.a(r2, r0, r3)
            return
    }

    @Override // com.acse.ottn.u4
    public long c() {
            r2 = this;
            boolean r0 = r2.f2837f
            if (r0 == 0) goto L7
            long r0 = r2.f2836e
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 c(float r2) {
            r1 = this;
            r0 = 16
            r1.a(r0, r2)
            return r1
    }

    public final void c(int r3, float r4) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f2833b
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L57
            r1 = 1
            if (r3 == r1) goto L54
            r1 = 2
            if (r3 == r1) goto L50
            r1 = 4
            if (r3 == r1) goto L4c
            r1 = 8
            if (r3 == r1) goto L48
            r1 = 16
            if (r3 == r1) goto L44
            r1 = 32
            if (r3 == r1) goto L40
            r1 = 64
            if (r3 == r1) goto L3c
            r1 = 128(0x80, float:1.8E-43)
            if (r3 == r1) goto L38
            r1 = 256(0x100, float:3.59E-43)
            if (r3 == r1) goto L34
            r1 = 512(0x200, float:7.17E-43)
            if (r3 == r1) goto L30
            goto L57
        L30:
            r0.setAlpha(r4)
            return
        L34:
            r0.setY(r4)
            return
        L38:
            r0.setX(r4)
            return
        L3c:
            r0.setRotationY(r4)
            return
        L40:
            r0.setRotationX(r4)
            return
        L44:
            r0.setRotation(r4)
            return
        L48:
            r0.setScaleY(r4)
            return
        L4c:
            r0.setScaleX(r4)
            return
        L50:
            r0.setTranslationY(r4)
            return
        L54:
            r0.setTranslationX(r4)
        L57:
            return
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 d(float r2) {
            r1 = this;
            r0 = 16
            r1.b(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public void d() {
            r0 = this;
            r0.e()
            return
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 e(float r2) {
            r1 = this;
            r0 = 32
            r1.a(r0, r2)
            return r1
    }

    public final void e() {
            r6 = this;
            r0 = 1
            float[] r0 = new float[r0]
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            com.acse.ottn.r4 r0 = com.acse.ottn.r4.a(r0)
            java.util.ArrayList<com.acse.ottn.v4$c> r2 = r6.f2842k
            java.lang.Object r2 = r2.clone()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.ArrayList<com.acse.ottn.v4$c> r3 = r6.f2842k
            r3.clear()
            int r3 = r2.size()
            r4 = 0
        L1e:
            if (r1 >= r3) goto L2c
            java.lang.Object r5 = r2.get(r1)
            com.acse.ottn.v4$c r5 = (com.acse.ottn.v4.c) r5
            int r5 = r5.a
            r4 = r4 | r5
            int r1 = r1 + 1
            goto L1e
        L2c:
            java.util.HashMap<com.acse.ottn.j, com.acse.ottn.v4$d> r1 = r6.m
            com.acse.ottn.v4$d r3 = new com.acse.ottn.v4$d
            r3.<init>(r4, r2)
            r1.put(r0, r3)
            com.acse.ottn.v4$b r1 = r6.f2841j
            r0.a(r1)
            com.acse.ottn.v4$b r1 = r6.f2841j
            r0.a(r1)
            boolean r1 = r6.f2837f
            if (r1 == 0) goto L49
            long r1 = r6.f2836e
            r0.b(r1)
        L49:
            boolean r1 = r6.f2835d
            if (r1 == 0) goto L52
            long r1 = r6.f2834c
            r0.f(r1)
        L52:
            boolean r1 = r6.f2839h
            if (r1 == 0) goto L5b
            android.view.animation.Interpolator r1 = r6.f2838g
            r0.a(r1)
        L5b:
            r0.k()
            return
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 f(float r2) {
            r1 = this;
            r0 = 32
            r1.b(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 g(float r2) {
            r1 = this;
            r0 = 64
            r1.a(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 h(float r2) {
            r1 = this;
            r0 = 64
            r1.b(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 i(float r2) {
            r1 = this;
            r0 = 4
            r1.a(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 j(float r2) {
            r1 = this;
            r0 = 4
            r1.b(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 k(float r2) {
            r1 = this;
            r0 = 8
            r1.a(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 l(float r2) {
            r1 = this;
            r0 = 8
            r1.b(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 m(float r2) {
            r1 = this;
            r0 = 1
            r1.a(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 n(float r2) {
            r1 = this;
            r0 = 1
            r1.b(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 o(float r2) {
            r1 = this;
            r0 = 2
            r1.a(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 p(float r2) {
            r1 = this;
            r0 = 2
            r1.b(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 q(float r2) {
            r1 = this;
            r0 = 128(0x80, float:1.8E-43)
            r1.a(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 r(float r2) {
            r1 = this;
            r0 = 128(0x80, float:1.8E-43)
            r1.b(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 s(float r2) {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1.a(r0, r2)
            return r1
    }

    @Override // com.acse.ottn.u4
    public com.acse.ottn.u4 t(float r2) {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1.b(r0, r2)
            return r1
    }
}
