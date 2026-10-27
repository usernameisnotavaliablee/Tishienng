package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class n extends com.acse.ottn.j {

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList<com.acse.ottn.j> f2489b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashMap<com.acse.ottn.j, com.acse.ottn.n.f> f2490c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList<com.acse.ottn.n.f> f2491d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList<com.acse.ottn.n.f> f2492e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2493f;

    /* renamed from: g, reason: collision with root package name */
    public com.acse.ottn.n.b f2494g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2495h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2496i;

    /* renamed from: j, reason: collision with root package name */
    public long f2497j;

    /* renamed from: k, reason: collision with root package name */
    public com.acse.ottn.r4 f2498k;
    public long l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends com.acse.ottn.l {
        public boolean a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.util.ArrayList f2499b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.n f2500c;

        public a(com.acse.ottn.n r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f2500c = r1
                r0.f2499b = r2
                r0.<init>()
                r1 = 0
                r0.a = r1
                return
        }

        @Override // com.acse.ottn.l, com.acse.ottn.j.a
        public void b(com.acse.ottn.j r4) {
                r3 = this;
                boolean r4 = r3.a
                if (r4 != 0) goto L28
                java.util.ArrayList r4 = r3.f2499b
                int r4 = r4.size()
                r0 = 0
            Lb:
                if (r0 >= r4) goto L28
                java.util.ArrayList r1 = r3.f2499b
                java.lang.Object r1 = r1.get(r0)
                com.acse.ottn.n$f r1 = (com.acse.ottn.n.f) r1
                com.acse.ottn.j r2 = r1.a
                r2.k()
                com.acse.ottn.n r2 = r3.f2500c
                java.util.ArrayList r2 = com.acse.ottn.n.a(r2)
                com.acse.ottn.j r1 = r1.a
                r2.add(r1)
                int r0 = r0 + 1
                goto Lb
            L28:
                return
        }

        @Override // com.acse.ottn.l, com.acse.ottn.j.a
        public void d(com.acse.ottn.j r1) {
                r0 = this;
                r1 = 1
                r0.a = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.j.a {
        public com.acse.ottn.n a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.n f2501b;

        public b(com.acse.ottn.n r1, com.acse.ottn.n r2) {
                r0 = this;
                r0.f2501b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // com.acse.ottn.j.a
        public void a(com.acse.ottn.j r1) {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.j.a
        public void b(com.acse.ottn.j r6) {
                r5 = this;
                r6.b(r5)
                com.acse.ottn.n r0 = r5.f2501b
                java.util.ArrayList r0 = com.acse.ottn.n.a(r0)
                r0.remove(r6)
                com.acse.ottn.n r0 = r5.a
                java.util.HashMap r0 = com.acse.ottn.n.b(r0)
                java.lang.Object r6 = r0.get(r6)
                com.acse.ottn.n$f r6 = (com.acse.ottn.n.f) r6
                r0 = 1
                r6.f2512f = r0
                com.acse.ottn.n r6 = r5.f2501b
                boolean r6 = r6.f2495h
                if (r6 != 0) goto L63
                com.acse.ottn.n r6 = r5.a
                java.util.ArrayList r6 = com.acse.ottn.n.c(r6)
                int r0 = r6.size()
                r1 = 0
                r2 = 0
            L2d:
                if (r2 >= r0) goto L3d
                java.lang.Object r3 = r6.get(r2)
                com.acse.ottn.n$f r3 = (com.acse.ottn.n.f) r3
                boolean r3 = r3.f2512f
                if (r3 != 0) goto L3a
                return
            L3a:
                int r2 = r2 + 1
                goto L2d
            L3d:
                com.acse.ottn.n r6 = r5.f2501b
                java.util.ArrayList<com.acse.ottn.j$a> r6 = r6.a
                if (r6 == 0) goto L5e
                java.lang.Object r6 = r6.clone()
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                int r0 = r6.size()
                r2 = 0
            L4e:
                if (r2 >= r0) goto L5e
                java.lang.Object r3 = r6.get(r2)
                com.acse.ottn.j$a r3 = (com.acse.ottn.j.a) r3
                com.acse.ottn.n r4 = r5.a
                r3.b(r4)
                int r2 = r2 + 1
                goto L4e
            L5e:
                com.acse.ottn.n r6 = r5.a
                com.acse.ottn.n.a(r6, r1)
            L63:
                return
        }

        @Override // com.acse.ottn.j.a
        public void c(com.acse.ottn.j r1) {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.j.a
        public void d(com.acse.ottn.j r4) {
                r3 = this;
                com.acse.ottn.n r4 = r3.f2501b
                boolean r0 = r4.f2495h
                if (r0 != 0) goto L2f
                java.util.ArrayList r4 = com.acse.ottn.n.a(r4)
                int r4 = r4.size()
                if (r4 != 0) goto L2f
                com.acse.ottn.n r4 = r3.f2501b
                java.util.ArrayList<com.acse.ottn.j$a> r4 = r4.a
                if (r4 == 0) goto L2f
                int r4 = r4.size()
                r0 = 0
            L1b:
                if (r0 >= r4) goto L2f
                com.acse.ottn.n r1 = r3.f2501b
                java.util.ArrayList<com.acse.ottn.j$a> r1 = r1.a
                java.lang.Object r1 = r1.get(r0)
                com.acse.ottn.j$a r1 = (com.acse.ottn.j.a) r1
                com.acse.ottn.n r2 = r3.a
                r1.d(r2)
                int r0 = r0 + 1
                goto L1b
            L2f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c {
        public com.acse.ottn.n.f a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.n f2502b;

        public c(com.acse.ottn.n r3, com.acse.ottn.j r4) {
                r2 = this;
                r2.f2502b = r3
                r2.<init>()
                java.util.HashMap r0 = com.acse.ottn.n.b(r3)
                java.lang.Object r0 = r0.get(r4)
                com.acse.ottn.n$f r0 = (com.acse.ottn.n.f) r0
                r2.a = r0
                if (r0 != 0) goto L2c
                com.acse.ottn.n$f r0 = new com.acse.ottn.n$f
                r0.<init>(r4)
                r2.a = r0
                java.util.HashMap r0 = com.acse.ottn.n.b(r3)
                com.acse.ottn.n$f r1 = r2.a
                r0.put(r4, r1)
                java.util.ArrayList r3 = com.acse.ottn.n.d(r3)
                com.acse.ottn.n$f r4 = r2.a
                r3.add(r4)
            L2c:
                return
        }

        public com.acse.ottn.n.c a(long r2) {
                r1 = this;
                r0 = 2
                float[] r0 = new float[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                com.acse.ottn.r4 r0 = com.acse.ottn.r4.a(r0)
                r0.f(r2)
                r1.a(r0)
                return r1
        }

        public com.acse.ottn.n.c a(com.acse.ottn.j r3) {
                r2 = this;
                com.acse.ottn.n r0 = r2.f2502b
                java.util.HashMap r0 = com.acse.ottn.n.b(r0)
                java.lang.Object r0 = r0.get(r3)
                com.acse.ottn.n$f r0 = (com.acse.ottn.n.f) r0
                if (r0 != 0) goto L25
                com.acse.ottn.n$f r0 = new com.acse.ottn.n$f
                r0.<init>(r3)
                com.acse.ottn.n r1 = r2.f2502b
                java.util.HashMap r1 = com.acse.ottn.n.b(r1)
                r1.put(r3, r0)
                com.acse.ottn.n r3 = r2.f2502b
                java.util.ArrayList r3 = com.acse.ottn.n.d(r3)
                r3.add(r0)
            L25:
                com.acse.ottn.n$d r3 = new com.acse.ottn.n$d
                r1 = 1
                r3.<init>(r0, r1)
                com.acse.ottn.n$f r0 = r2.a
                r0.a(r3)
                return r2
        }

        public com.acse.ottn.n.c b(com.acse.ottn.j r4) {
                r3 = this;
                com.acse.ottn.n r0 = r3.f2502b
                java.util.HashMap r0 = com.acse.ottn.n.b(r0)
                java.lang.Object r0 = r0.get(r4)
                com.acse.ottn.n$f r0 = (com.acse.ottn.n.f) r0
                if (r0 != 0) goto L25
                com.acse.ottn.n$f r0 = new com.acse.ottn.n$f
                r0.<init>(r4)
                com.acse.ottn.n r1 = r3.f2502b
                java.util.HashMap r1 = com.acse.ottn.n.b(r1)
                r1.put(r4, r0)
                com.acse.ottn.n r4 = r3.f2502b
                java.util.ArrayList r4 = com.acse.ottn.n.d(r4)
                r4.add(r0)
            L25:
                com.acse.ottn.n$d r4 = new com.acse.ottn.n$d
                com.acse.ottn.n$f r1 = r3.a
                r2 = 1
                r4.<init>(r1, r2)
                r0.a(r4)
                return r3
        }

        public com.acse.ottn.n.c c(com.acse.ottn.j r4) {
                r3 = this;
                com.acse.ottn.n r0 = r3.f2502b
                java.util.HashMap r0 = com.acse.ottn.n.b(r0)
                java.lang.Object r0 = r0.get(r4)
                com.acse.ottn.n$f r0 = (com.acse.ottn.n.f) r0
                if (r0 != 0) goto L25
                com.acse.ottn.n$f r0 = new com.acse.ottn.n$f
                r0.<init>(r4)
                com.acse.ottn.n r1 = r3.f2502b
                java.util.HashMap r1 = com.acse.ottn.n.b(r1)
                r1.put(r4, r0)
                com.acse.ottn.n r4 = r3.f2502b
                java.util.ArrayList r4 = com.acse.ottn.n.d(r4)
                r4.add(r0)
            L25:
                com.acse.ottn.n$d r4 = new com.acse.ottn.n$d
                com.acse.ottn.n$f r1 = r3.a
                r2 = 0
                r4.<init>(r1, r2)
                r0.a(r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d {

        /* renamed from: c, reason: collision with root package name */
        public static final int f2503c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f2504d = 1;
        public com.acse.ottn.n.f a;

        /* renamed from: b, reason: collision with root package name */
        public int f2505b;

        public d(com.acse.ottn.n.f r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f2505b = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class e implements com.acse.ottn.j.a {
        public com.acse.ottn.n a;

        /* renamed from: b, reason: collision with root package name */
        public com.acse.ottn.n.f f2506b;

        /* renamed from: c, reason: collision with root package name */
        public int f2507c;

        public e(com.acse.ottn.n r1, com.acse.ottn.n.f r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f2506b = r2
                r0.f2507c = r3
                return
        }

        @Override // com.acse.ottn.j.a
        public void a(com.acse.ottn.j r2) {
                r1 = this;
                int r0 = r1.f2507c
                if (r0 != 0) goto L7
                r1.e(r2)
            L7:
                return
        }

        @Override // com.acse.ottn.j.a
        public void b(com.acse.ottn.j r3) {
                r2 = this;
                int r0 = r2.f2507c
                r1 = 1
                if (r0 != r1) goto L8
                r2.e(r3)
            L8:
                return
        }

        @Override // com.acse.ottn.j.a
        public void c(com.acse.ottn.j r1) {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.j.a
        public void d(com.acse.ottn.j r1) {
                r0 = this;
                return
        }

        public final void e(com.acse.ottn.j r6) {
                r5 = this;
                com.acse.ottn.n r0 = r5.a
                boolean r0 = r0.f2495h
                if (r0 == 0) goto L7
                goto L55
            L7:
                com.acse.ottn.n$f r0 = r5.f2506b
                java.util.ArrayList<com.acse.ottn.n$d> r0 = r0.f2509c
                int r0 = r0.size()
                r1 = 0
            L10:
                if (r1 >= r0) goto L2f
                com.acse.ottn.n$f r2 = r5.f2506b
                java.util.ArrayList<com.acse.ottn.n$d> r2 = r2.f2509c
                java.lang.Object r2 = r2.get(r1)
                com.acse.ottn.n$d r2 = (com.acse.ottn.n.d) r2
                int r3 = r2.f2505b
                int r4 = r5.f2507c
                if (r3 != r4) goto L2c
                com.acse.ottn.n$f r3 = r2.a
                com.acse.ottn.j r3 = r3.a
                if (r3 != r6) goto L2c
                r6.b(r5)
                goto L30
            L2c:
                int r1 = r1 + 1
                goto L10
            L2f:
                r2 = 0
            L30:
                com.acse.ottn.n$f r6 = r5.f2506b
                java.util.ArrayList<com.acse.ottn.n$d> r6 = r6.f2509c
                r6.remove(r2)
                com.acse.ottn.n$f r6 = r5.f2506b
                java.util.ArrayList<com.acse.ottn.n$d> r6 = r6.f2509c
                int r6 = r6.size()
                if (r6 != 0) goto L55
                com.acse.ottn.n$f r6 = r5.f2506b
                com.acse.ottn.j r6 = r6.a
                r6.k()
                com.acse.ottn.n r6 = r5.a
                java.util.ArrayList r6 = com.acse.ottn.n.a(r6)
                com.acse.ottn.n$f r0 = r5.f2506b
                com.acse.ottn.j r0 = r0.a
                r6.add(r0)
            L55:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f implements java.lang.Cloneable {
        public com.acse.ottn.j a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.ArrayList<com.acse.ottn.n.d> f2508b;

        /* renamed from: c, reason: collision with root package name */
        public java.util.ArrayList<com.acse.ottn.n.d> f2509c;

        /* renamed from: d, reason: collision with root package name */
        public java.util.ArrayList<com.acse.ottn.n.f> f2510d;

        /* renamed from: e, reason: collision with root package name */
        public java.util.ArrayList<com.acse.ottn.n.f> f2511e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2512f;

        public f(com.acse.ottn.j r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f2508b = r0
                r1.f2509c = r0
                r1.f2510d = r0
                r1.f2511e = r0
                r0 = 0
                r1.f2512f = r0
                r1.a = r2
                return
        }

        public com.acse.ottn.n.f a() {
                r2 = this;
                java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> Lf
                com.acse.ottn.n$f r0 = (com.acse.ottn.n.f) r0     // Catch: java.lang.CloneNotSupportedException -> Lf
                com.acse.ottn.j r1 = r2.a     // Catch: java.lang.CloneNotSupportedException -> Lf
                com.acse.ottn.j r1 = r1.a()     // Catch: java.lang.CloneNotSupportedException -> Lf
                r0.a = r1     // Catch: java.lang.CloneNotSupportedException -> Lf
                return r0
            Lf:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        public void a(com.acse.ottn.n.d r3) {
                r2 = this;
                java.util.ArrayList<com.acse.ottn.n$d> r0 = r2.f2508b
                if (r0 != 0) goto L12
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f2508b = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f2510d = r0
            L12:
                java.util.ArrayList<com.acse.ottn.n$d> r0 = r2.f2508b
                r0.add(r3)
                java.util.ArrayList<com.acse.ottn.n$f> r0 = r2.f2510d
                com.acse.ottn.n$f r1 = r3.a
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L28
                java.util.ArrayList<com.acse.ottn.n$f> r0 = r2.f2510d
                com.acse.ottn.n$f r1 = r3.a
                r0.add(r1)
            L28:
                com.acse.ottn.n$f r3 = r3.a
                java.util.ArrayList<com.acse.ottn.n$f> r0 = r3.f2511e
                if (r0 != 0) goto L35
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.f2511e = r0
            L35:
                java.util.ArrayList<com.acse.ottn.n$f> r3 = r3.f2511e
                r3.add(r2)
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.acse.ottn.n$f r0 = r1.a()
                return r0
        }
    }

    public n() {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f2489b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f2490c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f2491d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f2492e = r0
            r0 = 1
            r3.f2493f = r0
            r0 = 0
            r3.f2494g = r0
            r1 = 0
            r3.f2495h = r1
            r3.f2496i = r1
            r1 = 0
            r3.f2497j = r1
            r3.f2498k = r0
            r0 = -1
            r3.l = r0
            return
    }

    public static /* synthetic */ java.util.ArrayList a(com.acse.ottn.n r0) {
            java.util.ArrayList<com.acse.ottn.j> r0 = r0.f2489b
            return r0
    }

    public static /* synthetic */ boolean a(com.acse.ottn.n r0, boolean r1) {
            r0.f2496i = r1
            return r1
    }

    public static /* synthetic */ java.util.HashMap b(com.acse.ottn.n r0) {
            java.util.HashMap<com.acse.ottn.j, com.acse.ottn.n$f> r0 = r0.f2490c
            return r0
    }

    public static /* synthetic */ java.util.ArrayList c(com.acse.ottn.n r0) {
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r0.f2492e
            return r0
    }

    public static /* synthetic */ java.util.ArrayList d(com.acse.ottn.n r0) {
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r0.f2491d
            return r0
    }

    @Override // com.acse.ottn.j
    public /* bridge */ /* synthetic */ com.acse.ottn.j a() {
            r1 = this;
            com.acse.ottn.n r0 = r1.l()
            return r0
    }

    @Override // com.acse.ottn.j
    public /* bridge */ /* synthetic */ com.acse.ottn.j a(long r1) {
            r0 = this;
            com.acse.ottn.n r1 = r0.c(r1)
            return r1
    }

    public com.acse.ottn.n.c a(com.acse.ottn.j r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            r0 = 1
            r1.f2493f = r0
            com.acse.ottn.n$c r0 = new com.acse.ottn.n$c
            r0.<init>(r1, r2)
            return r0
        Lb:
            r2 = 0
            return r2
    }

    @Override // com.acse.ottn.j
    public void a(android.view.animation.Interpolator r3) {
            r2 = this;
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r2.f2491d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.acse.ottn.n$f r1 = (com.acse.ottn.n.f) r1
            com.acse.ottn.j r1 = r1.a
            r1.a(r3)
            goto L6
        L18:
            return
    }

    @Override // com.acse.ottn.j
    public void a(java.lang.Object r4) {
            r3 = this;
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r3.f2491d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.acse.ottn.n$f r1 = (com.acse.ottn.n.f) r1
            com.acse.ottn.j r1 = r1.a
            boolean r2 = r1 instanceof com.acse.ottn.n
            if (r2 == 0) goto L1e
            com.acse.ottn.n r1 = (com.acse.ottn.n) r1
            r1.a(r4)
            goto L6
        L1e:
            boolean r2 = r1 instanceof com.acse.ottn.z2
            if (r2 == 0) goto L6
            com.acse.ottn.z2 r1 = (com.acse.ottn.z2) r1
            r1.a(r4)
            goto L6
        L28:
            return
    }

    public void a(java.util.Collection<com.acse.ottn.j> r3) {
            r2 = this;
            if (r3 == 0) goto L27
            int r0 = r3.size()
            if (r0 <= 0) goto L27
            r0 = 1
            r2.f2493f = r0
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            com.acse.ottn.j r1 = (com.acse.ottn.j) r1
            if (r0 != 0) goto L23
            com.acse.ottn.n$c r0 = r2.a(r1)
            goto L10
        L23:
            r0.c(r1)
            goto L10
        L27:
            return
    }

    public void a(java.util.List<com.acse.ottn.j> r5) {
            r4 = this;
            if (r5 == 0) goto L39
            int r0 = r5.size()
            if (r0 <= 0) goto L39
            r0 = 1
            r4.f2493f = r0
            int r1 = r5.size()
            r2 = 0
            if (r1 != r0) goto L1c
            java.lang.Object r5 = r5.get(r2)
            com.acse.ottn.j r5 = (com.acse.ottn.j) r5
            r4.a(r5)
            return
        L1c:
            int r1 = r5.size()
            int r1 = r1 - r0
            if (r2 >= r1) goto L39
            java.lang.Object r1 = r5.get(r2)
            com.acse.ottn.j r1 = (com.acse.ottn.j) r1
            com.acse.ottn.n$c r1 = r4.a(r1)
            int r2 = r2 + 1
            java.lang.Object r3 = r5.get(r2)
            com.acse.ottn.j r3 = (com.acse.ottn.j) r3
            r1.b(r3)
            goto L1c
        L39:
            return
    }

    public void a(com.acse.ottn.j... r5) {
            r4 = this;
            if (r5 == 0) goto L21
            r0 = 1
            r4.f2493f = r0
            int r1 = r5.length
            r2 = 0
            if (r1 != r0) goto Lf
            r5 = r5[r2]
            r4.a(r5)
            return
        Lf:
            int r1 = r5.length
            int r1 = r1 - r0
            if (r2 >= r1) goto L21
            r1 = r5[r2]
            com.acse.ottn.n$c r1 = r4.a(r1)
            int r2 = r2 + 1
            r3 = r5[r2]
            r1.b(r3)
            goto Lf
        L21:
            return
    }

    @Override // com.acse.ottn.j
    public void b() {
            r3 = this;
            r0 = 1
            r3.f2495h = r0
            boolean r0 = r3.g()
            if (r0 == 0) goto L87
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r3.f2492e
            int r0 = r0.size()
            java.util.ArrayList<com.acse.ottn.n$f> r1 = r3.f2491d
            int r1 = r1.size()
            if (r0 == r1) goto L3f
            r3.n()
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r3.f2492e
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            com.acse.ottn.n$f r1 = (com.acse.ottn.n.f) r1
            com.acse.ottn.n$b r2 = r3.f2494g
            if (r2 != 0) goto L37
            com.acse.ottn.n$b r2 = new com.acse.ottn.n$b
            r2.<init>(r3, r3)
            r3.f2494g = r2
        L37:
            com.acse.ottn.j r1 = r1.a
            com.acse.ottn.n$b r2 = r3.f2494g
            r1.a(r2)
            goto L20
        L3f:
            com.acse.ottn.r4 r0 = r3.f2498k
            if (r0 == 0) goto L46
            r0.cancel()
        L46:
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r3.f2492e
            int r0 = r0.size()
            if (r0 <= 0) goto L66
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r3.f2492e
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            com.acse.ottn.n$f r1 = (com.acse.ottn.n.f) r1
            com.acse.ottn.j r1 = r1.a
            r1.b()
            goto L54
        L66:
            java.util.ArrayList<com.acse.ottn.j$a> r0 = r3.a
            if (r0 == 0) goto L84
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r0.next()
            com.acse.ottn.j$a r1 = (com.acse.ottn.j.a) r1
            r1.b(r3)
            goto L74
        L84:
            r0 = 0
            r3.f2496i = r0
        L87:
            return
    }

    @Override // com.acse.ottn.j
    public void b(long r1) {
            r0 = this;
            r0.f2497j = r1
            return
    }

    public void b(com.acse.ottn.j... r4) {
            r3 = this;
            if (r4 == 0) goto L17
            r0 = 1
            r3.f2493f = r0
            r1 = 0
            r1 = r4[r1]
            com.acse.ottn.n$c r1 = r3.a(r1)
        Lc:
            int r2 = r4.length
            if (r0 >= r2) goto L17
            r2 = r4[r0]
            r1.c(r2)
            int r0 = r0 + 1
            goto Lc
        L17:
            return
    }

    @Override // com.acse.ottn.j
    public long c() {
            r2 = this;
            long r0 = r2.l
            return r0
    }

    public com.acse.ottn.n c(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L21
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r3.f2491d
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.acse.ottn.n$f r1 = (com.acse.ottn.n.f) r1
            com.acse.ottn.j r1 = r1.a
            r1.a(r4)
            goto Lc
        L1e:
            r3.l = r4
            return r3
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "duration must be a value of zero or greater"
            r4.<init>(r5)
            throw r4
    }

    @Override // com.acse.ottn.j
    public void cancel() {
            r3 = this;
            r0 = 1
            r3.f2495h = r0
            boolean r0 = r3.g()
            if (r0 == 0) goto L71
            java.util.ArrayList<com.acse.ottn.j$a> r0 = r3.a
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            com.acse.ottn.j$a r2 = (com.acse.ottn.j.a) r2
            r2.d(r3)
            goto L17
        L27:
            r0 = 0
        L28:
            com.acse.ottn.r4 r1 = r3.f2498k
            if (r1 == 0) goto L38
            boolean r1 = r1.f()
            if (r1 == 0) goto L38
            com.acse.ottn.r4 r1 = r3.f2498k
            r1.cancel()
            goto L58
        L38:
            java.util.ArrayList<com.acse.ottn.n$f> r1 = r3.f2492e
            int r1 = r1.size()
            if (r1 <= 0) goto L58
            java.util.ArrayList<com.acse.ottn.n$f> r1 = r3.f2492e
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            com.acse.ottn.n$f r2 = (com.acse.ottn.n.f) r2
            com.acse.ottn.j r2 = r2.a
            r2.cancel()
            goto L46
        L58:
            if (r0 == 0) goto L6e
            java.util.Iterator r0 = r0.iterator()
        L5e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()
            com.acse.ottn.j$a r1 = (com.acse.ottn.j.a) r1
            r1.b(r3)
            goto L5e
        L6e:
            r0 = 0
            r3.f2496i = r0
        L71:
            return
    }

    @Override // com.acse.ottn.j
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.acse.ottn.n r0 = r1.l()
            return r0
    }

    @Override // com.acse.ottn.j
    public long e() {
            r2 = this;
            long r0 = r2.f2497j
            return r0
    }

    @Override // com.acse.ottn.j
    public boolean f() {
            r2 = this;
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r2.f2491d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.acse.ottn.n$f r1 = (com.acse.ottn.n.f) r1
            com.acse.ottn.j r1 = r1.a
            boolean r1 = r1.f()
            if (r1 == 0) goto L6
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // com.acse.ottn.j
    public boolean g() {
            r1 = this;
            boolean r0 = r1.f2496i
            return r0
    }

    @Override // com.acse.ottn.j
    public void i() {
            r2 = this;
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r2.f2491d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.acse.ottn.n$f r1 = (com.acse.ottn.n.f) r1
            com.acse.ottn.j r1 = r1.a
            r1.i()
            goto L6
        L18:
            return
    }

    @Override // com.acse.ottn.j
    public void j() {
            r2 = this;
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r2.f2491d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.acse.ottn.n$f r1 = (com.acse.ottn.n.f) r1
            com.acse.ottn.j r1 = r1.a
            r1.j()
            goto L6
        L18:
            return
    }

    @Override // com.acse.ottn.j
    public void k() {
            r10 = this;
            r0 = 0
            r10.f2495h = r0
            r1 = 1
            r10.f2496i = r1
            r10.n()
            java.util.ArrayList<com.acse.ottn.n$f> r1 = r10.f2492e
            int r1 = r1.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L4e
            java.util.ArrayList<com.acse.ottn.n$f> r3 = r10.f2492e
            java.lang.Object r3 = r3.get(r2)
            com.acse.ottn.n$f r3 = (com.acse.ottn.n.f) r3
            com.acse.ottn.j r4 = r3.a
            java.util.ArrayList r4 = r4.d()
            if (r4 == 0) goto L4b
            int r5 = r4.size()
            if (r5 <= 0) goto L4b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L31:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r4.next()
            com.acse.ottn.j$a r5 = (com.acse.ottn.j.a) r5
            boolean r6 = r5 instanceof com.acse.ottn.n.e
            if (r6 != 0) goto L45
            boolean r6 = r5 instanceof com.acse.ottn.n.b
            if (r6 == 0) goto L31
        L45:
            com.acse.ottn.j r6 = r3.a
            r6.b(r5)
            goto L31
        L4b:
            int r2 = r2 + 1
            goto L10
        L4e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L54:
            if (r3 >= r1) goto Lae
            java.util.ArrayList<com.acse.ottn.n$f> r4 = r10.f2492e
            java.lang.Object r4 = r4.get(r3)
            com.acse.ottn.n$f r4 = (com.acse.ottn.n.f) r4
            com.acse.ottn.n$b r5 = r10.f2494g
            if (r5 != 0) goto L69
            com.acse.ottn.n$b r5 = new com.acse.ottn.n$b
            r5.<init>(r10, r10)
            r10.f2494g = r5
        L69:
            java.util.ArrayList<com.acse.ottn.n$d> r5 = r4.f2508b
            if (r5 == 0) goto La1
            int r5 = r5.size()
            if (r5 != 0) goto L74
            goto La1
        L74:
            java.util.ArrayList<com.acse.ottn.n$d> r5 = r4.f2508b
            int r5 = r5.size()
            r6 = 0
        L7b:
            if (r6 >= r5) goto L96
            java.util.ArrayList<com.acse.ottn.n$d> r7 = r4.f2508b
            java.lang.Object r7 = r7.get(r6)
            com.acse.ottn.n$d r7 = (com.acse.ottn.n.d) r7
            com.acse.ottn.n$f r8 = r7.a
            com.acse.ottn.j r8 = r8.a
            com.acse.ottn.n$e r9 = new com.acse.ottn.n$e
            int r7 = r7.f2505b
            r9.<init>(r10, r4, r7)
            r8.a(r9)
            int r6 = r6 + 1
            goto L7b
        L96:
            java.util.ArrayList<com.acse.ottn.n$d> r5 = r4.f2508b
            java.lang.Object r5 = r5.clone()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.f2509c = r5
            goto La4
        La1:
            r2.add(r4)
        La4:
            com.acse.ottn.j r4 = r4.a
            com.acse.ottn.n$b r5 = r10.f2494g
            r4.a(r5)
            int r3 = r3 + 1
            goto L54
        Lae:
            long r3 = r10.f2497j
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto Ld3
            java.util.Iterator r1 = r2.iterator()
        Lba:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r1.next()
            com.acse.ottn.n$f r2 = (com.acse.ottn.n.f) r2
            com.acse.ottn.j r3 = r2.a
            r3.k()
            java.util.ArrayList<com.acse.ottn.j> r3 = r10.f2489b
            com.acse.ottn.j r2 = r2.a
            r3.add(r2)
            goto Lba
        Ld3:
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x013e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            com.acse.ottn.r4 r1 = com.acse.ottn.r4.a(r1)
            r10.f2498k = r1
            long r3 = r10.f2497j
            r1.f(r3)
            com.acse.ottn.r4 r1 = r10.f2498k
            com.acse.ottn.n$a r3 = new com.acse.ottn.n$a
            r3.<init>(r10, r2)
            r1.a(r3)
            com.acse.ottn.r4 r1 = r10.f2498k
            r1.k()
        Lf3:
            java.util.ArrayList<com.acse.ottn.j$a> r1 = r10.a
            if (r1 == 0) goto L110
            java.lang.Object r1 = r1.clone()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
        L102:
            if (r3 >= r2) goto L110
            java.lang.Object r4 = r1.get(r3)
            com.acse.ottn.j$a r4 = (com.acse.ottn.j.a) r4
            r4.a(r10)
            int r3 = r3 + 1
            goto L102
        L110:
            java.util.ArrayList<com.acse.ottn.n$f> r1 = r10.f2491d
            int r1 = r1.size()
            if (r1 != 0) goto L13c
            long r1 = r10.f2497j
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L13c
            r10.f2496i = r0
            java.util.ArrayList<com.acse.ottn.j$a> r1 = r10.a
            if (r1 == 0) goto L13c
            java.lang.Object r1 = r1.clone()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
        L12e:
            if (r0 >= r2) goto L13c
            java.lang.Object r3 = r1.get(r0)
            com.acse.ottn.j$a r3 = (com.acse.ottn.j.a) r3
            r3.b(r10)
            int r0 = r0 + 1
            goto L12e
        L13c:
            return
    }

    public com.acse.ottn.n l() {
            r8 = this;
            com.acse.ottn.j r0 = super.a()
            com.acse.ottn.n r0 = (com.acse.ottn.n) r0
            r1 = 1
            r0.f2493f = r1
            r1 = 0
            r0.f2495h = r1
            r0.f2496i = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f2489b = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f2490c = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f2491d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f2492e = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.ArrayList<com.acse.ottn.n$f> r2 = r8.f2491d
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r2.next()
            com.acse.ottn.n$f r3 = (com.acse.ottn.n.f) r3
            com.acse.ottn.n$f r4 = r3.a()
            r1.put(r3, r4)
            java.util.ArrayList<com.acse.ottn.n$f> r3 = r0.f2491d
            r3.add(r4)
            java.util.HashMap<com.acse.ottn.j, com.acse.ottn.n$f> r3 = r0.f2490c
            com.acse.ottn.j r5 = r4.a
            r3.put(r5, r4)
            r3 = 0
            r4.f2508b = r3
            r4.f2509c = r3
            r4.f2511e = r3
            r4.f2510d = r3
            com.acse.ottn.j r4 = r4.a
            java.util.ArrayList r4 = r4.d()
            if (r4 == 0) goto L35
            java.util.Iterator r5 = r4.iterator()
        L69:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L84
            java.lang.Object r6 = r5.next()
            com.acse.ottn.j$a r6 = (com.acse.ottn.j.a) r6
            boolean r7 = r6 instanceof com.acse.ottn.n.b
            if (r7 == 0) goto L69
            if (r3 != 0) goto L80
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L80:
            r3.add(r6)
            goto L69
        L84:
            if (r3 == 0) goto L35
            java.util.Iterator r3 = r3.iterator()
        L8a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L35
            java.lang.Object r5 = r3.next()
            com.acse.ottn.j$a r5 = (com.acse.ottn.j.a) r5
            r4.remove(r5)
            goto L8a
        L9a:
            java.util.ArrayList<com.acse.ottn.n$f> r2 = r8.f2491d
            java.util.Iterator r2 = r2.iterator()
        La0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld9
            java.lang.Object r3 = r2.next()
            com.acse.ottn.n$f r3 = (com.acse.ottn.n.f) r3
            java.lang.Object r4 = r1.get(r3)
            com.acse.ottn.n$f r4 = (com.acse.ottn.n.f) r4
            java.util.ArrayList<com.acse.ottn.n$d> r3 = r3.f2508b
            if (r3 == 0) goto La0
            java.util.Iterator r3 = r3.iterator()
        Lba:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La0
            java.lang.Object r5 = r3.next()
            com.acse.ottn.n$d r5 = (com.acse.ottn.n.d) r5
            com.acse.ottn.n$f r6 = r5.a
            java.lang.Object r6 = r1.get(r6)
            com.acse.ottn.n$f r6 = (com.acse.ottn.n.f) r6
            com.acse.ottn.n$d r7 = new com.acse.ottn.n$d
            int r5 = r5.f2505b
            r7.<init>(r6, r5)
            r4.a(r7)
            goto Lba
        Ld9:
            return r0
    }

    public java.util.ArrayList<com.acse.ottn.j> m() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.acse.ottn.n$f> r1 = r3.f2491d
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            com.acse.ottn.n$f r2 = (com.acse.ottn.n.f) r2
            com.acse.ottn.j r2 = r2.a
            r0.add(r2)
            goto Lb
        L1d:
            return r0
    }

    public final void n() {
            r10 = this;
            boolean r0 = r10.f2493f
            r1 = 0
            if (r0 == 0) goto L99
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r10.f2492e
            r0.clear()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.acse.ottn.n$f> r2 = r10.f2491d
            int r2 = r2.size()
            r3 = 0
        L16:
            if (r3 >= r2) goto L30
            java.util.ArrayList<com.acse.ottn.n$f> r4 = r10.f2491d
            java.lang.Object r4 = r4.get(r3)
            com.acse.ottn.n$f r4 = (com.acse.ottn.n.f) r4
            java.util.ArrayList<com.acse.ottn.n$d> r5 = r4.f2508b
            if (r5 == 0) goto L2a
            int r5 = r5.size()
            if (r5 != 0) goto L2d
        L2a:
            r0.add(r4)
        L2d:
            int r3 = r3 + 1
            goto L16
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L35:
            int r3 = r0.size()
            if (r3 <= 0) goto L80
            int r3 = r0.size()
            r4 = 0
        L40:
            if (r4 >= r3) goto L76
            java.lang.Object r5 = r0.get(r4)
            com.acse.ottn.n$f r5 = (com.acse.ottn.n.f) r5
            java.util.ArrayList<com.acse.ottn.n$f> r6 = r10.f2492e
            r6.add(r5)
            java.util.ArrayList<com.acse.ottn.n$f> r6 = r5.f2511e
            if (r6 == 0) goto L73
            int r6 = r6.size()
            r7 = 0
        L56:
            if (r7 >= r6) goto L73
            java.util.ArrayList<com.acse.ottn.n$f> r8 = r5.f2511e
            java.lang.Object r8 = r8.get(r7)
            com.acse.ottn.n$f r8 = (com.acse.ottn.n.f) r8
            java.util.ArrayList<com.acse.ottn.n$f> r9 = r8.f2510d
            r9.remove(r5)
            java.util.ArrayList<com.acse.ottn.n$f> r9 = r8.f2510d
            int r9 = r9.size()
            if (r9 != 0) goto L70
            r2.add(r8)
        L70:
            int r7 = r7 + 1
            goto L56
        L73:
            int r4 = r4 + 1
            goto L40
        L76:
            r0.clear()
            r0.addAll(r2)
            r2.clear()
            goto L35
        L80:
            r10.f2493f = r1
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r10.f2492e
            int r0 = r0.size()
            java.util.ArrayList<com.acse.ottn.n$f> r1 = r10.f2491d
            int r1 = r1.size()
            if (r0 != r1) goto L91
            goto Le9
        L91:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Circular dependencies cannot exist in AnimatorSet"
            r0.<init>(r1)
            throw r0
        L99:
            java.util.ArrayList<com.acse.ottn.n$f> r0 = r10.f2491d
            int r0 = r0.size()
            r2 = 0
        La0:
            if (r2 >= r0) goto Le9
            java.util.ArrayList<com.acse.ottn.n$f> r3 = r10.f2491d
            java.lang.Object r3 = r3.get(r2)
            com.acse.ottn.n$f r3 = (com.acse.ottn.n.f) r3
            java.util.ArrayList<com.acse.ottn.n$d> r4 = r3.f2508b
            if (r4 == 0) goto Le4
            int r4 = r4.size()
            if (r4 <= 0) goto Le4
            java.util.ArrayList<com.acse.ottn.n$d> r4 = r3.f2508b
            int r4 = r4.size()
            r5 = 0
        Lbb:
            if (r5 >= r4) goto Le4
            java.util.ArrayList<com.acse.ottn.n$d> r6 = r3.f2508b
            java.lang.Object r6 = r6.get(r5)
            com.acse.ottn.n$d r6 = (com.acse.ottn.n.d) r6
            java.util.ArrayList<com.acse.ottn.n$f> r7 = r3.f2510d
            if (r7 != 0) goto Ld0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.f2510d = r7
        Ld0:
            java.util.ArrayList<com.acse.ottn.n$f> r7 = r3.f2510d
            com.acse.ottn.n$f r8 = r6.a
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto Le1
            java.util.ArrayList<com.acse.ottn.n$f> r7 = r3.f2510d
            com.acse.ottn.n$f r6 = r6.a
            r7.add(r6)
        Le1:
            int r5 = r5 + 1
            goto Lbb
        Le4:
            r3.f2512f = r1
            int r2 = r2 + 1
            goto La0
        Le9:
            return
    }
}
