package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ax extends com.amap.api.maps.offlinemap.OfflineMapCity implements com.amap.api.col.p0003l.l0, com.amap.api.col.p0003l.c1 {
    public static final android.os.Parcelable.Creator<com.amap.api.col.p0003l.ax> CREATOR = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.amap.api.col.p0003l.g1 f2985f;

    /* renamed from: g, reason: collision with root package name */
    public final com.amap.api.col.p0003l.g1 f2986g;

    /* renamed from: h, reason: collision with root package name */
    public final com.amap.api.col.p0003l.g1 f2987h;

    /* renamed from: i, reason: collision with root package name */
    public final com.amap.api.col.p0003l.g1 f2988i;

    /* renamed from: j, reason: collision with root package name */
    public final com.amap.api.col.p0003l.g1 f2989j;

    /* renamed from: k, reason: collision with root package name */
    public final com.amap.api.col.p0003l.g1 f2990k;
    public final com.amap.api.col.p0003l.g1 l;
    public final com.amap.api.col.p0003l.g1 m;
    public final com.amap.api.col.p0003l.g1 n;
    public final com.amap.api.col.p0003l.g1 o;
    public final com.amap.api.col.p0003l.g1 p;
    com.amap.api.col.p0003l.g1 q;
    android.content.Context r;
    private java.lang.String s;
    private java.lang.String t;
    boolean u;
    private long v;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements com.amap.api.col.3l.u0.a {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.io.File f2991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.ax f2992c;

        a(com.amap.api.col.p0003l.ax r1, java.lang.String r2, java.io.File r3) {
                r0 = this;
                r0.f2992c = r1
                r0.a = r2
                r0.f2991b = r3
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.3l.u0.a
        public final void a() {
                r2 = this;
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L22
                java.lang.String r1 = r2.a     // Catch: java.lang.Exception -> L22
                r0.<init>(r1)     // Catch: java.lang.Exception -> L22
                boolean r0 = r0.delete()     // Catch: java.lang.Exception -> L22
                if (r0 != 0) goto Le
                return
            Le:
                java.io.File r0 = r2.f2991b     // Catch: java.lang.Exception -> L22
                com.amap.api.col.p0003l.a1.l(r0)     // Catch: java.lang.Exception -> L22
                com.amap.api.col.3l.ax r0 = r2.f2992c     // Catch: java.lang.Exception -> L22
                r1 = 100
                r0.setCompleteCode(r1)     // Catch: java.lang.Exception -> L22
                com.amap.api.col.3l.ax r0 = r2.f2992c     // Catch: java.lang.Exception -> L22
                com.amap.api.col.3l.g1 r0 = r0.q     // Catch: java.lang.Exception -> L22
                r0.k()     // Catch: java.lang.Exception -> L22
                return
            L22:
                com.amap.api.col.3l.ax r0 = r2.f2992c
                com.amap.api.col.3l.g1 r1 = r0.q
                com.amap.api.col.3l.g1 r0 = r0.p
                int r0 = r0.d()
                r1.b(r0)
                return
        }

        @Override // com.amap.api.col.3l.u0.a
        public final void a(float r6) {
                r5 = this;
                com.amap.api.col.3l.ax r0 = r5.f2992c
                int r0 = r0.getcompleteCode()
                double r1 = (double) r6
                r3 = 4600697235336603894(0x3fd8f5c28f5c28f6, double:0.39)
                double r1 = r1 * r3
                r3 = 4633641066610819072(0x404e000000000000, double:60.0)
                double r1 = r1 + r3
                int r6 = (int) r1
                int r0 = r6 - r0
                if (r0 <= 0) goto L35
                long r0 = java.lang.System.currentTimeMillis()
                com.amap.api.col.3l.ax r2 = r5.f2992c
                long r2 = com.amap.api.col.p0003l.ax.j(r2)
                long r0 = r0 - r2
                r2 = 1000(0x3e8, double:4.94E-321)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L35
                com.amap.api.col.3l.ax r0 = r5.f2992c
                r0.setCompleteCode(r6)
                com.amap.api.col.3l.ax r6 = r5.f2992c
                long r0 = java.lang.System.currentTimeMillis()
                com.amap.api.col.p0003l.ax.k(r6, r0)
            L35:
                return
        }

        @Override // com.amap.api.col.3l.u0.a
        public final void b() {
                r2 = this;
                com.amap.api.col.3l.ax r0 = r2.f2992c
                com.amap.api.col.3l.g1 r1 = r0.q
                com.amap.api.col.3l.g1 r0 = r0.p
                int r0 = r0.d()
                r1.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements android.os.Parcelable.Creator<com.amap.api.col.p0003l.ax> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        private static com.amap.api.col.p0003l.ax a(android.os.Parcel r1) {
                com.amap.api.col.3l.ax r0 = new com.amap.api.col.3l.ax
                r0.<init>(r1)
                return r0
        }

        private static com.amap.api.col.p0003l.ax[] b(int r0) {
                com.amap.api.col.3l.ax[] r0 = new com.amap.api.col.p0003l.ax[r0]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.col.p0003l.ax createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.amap.api.col.3l.ax r1 = a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.col.p0003l.ax[] newArray(int r1) {
                r0 = this;
                com.amap.api.col.3l.ax[] r1 = b(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class c {
        static final /* synthetic */ int[] a = null;

        static {
                com.amap.api.col.3l.by$a[] r0 = com.amap.api.col.3l.by.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.amap.api.col.3l.ax.c.a = r0
                com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.a     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.amap.api.col.3l.ax.c.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.f3026c     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.amap.api.col.3l.ax.c.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.f3025b     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            com.amap.api.col.3l.ax$b r0 = new com.amap.api.col.3l.ax$b
            r0.<init>()
            com.amap.api.col.p0003l.ax.CREATOR = r0
            return
    }

    private ax(android.content.Context r3, int r4) {
            r2 = this;
            r2.<init>()
            com.amap.api.col.3l.i1 r0 = new com.amap.api.col.3l.i1
            r0.<init>(r2)
            r2.f2985f = r0
            com.amap.api.col.3l.p1 r0 = new com.amap.api.col.3l.p1
            r0.<init>(r2)
            r2.f2986g = r0
            com.amap.api.col.3l.l1 r0 = new com.amap.api.col.3l.l1
            r0.<init>(r2)
            r2.f2987h = r0
            com.amap.api.col.3l.n1 r0 = new com.amap.api.col.3l.n1
            r0.<init>(r2)
            r2.f2988i = r0
            com.amap.api.col.3l.o1 r0 = new com.amap.api.col.3l.o1
            r0.<init>(r2)
            r2.f2989j = r0
            com.amap.api.col.3l.h1 r0 = new com.amap.api.col.3l.h1
            r0.<init>(r2)
            r2.f2990k = r0
            com.amap.api.col.3l.m1 r0 = new com.amap.api.col.3l.m1
            r0.<init>(r2)
            r2.l = r0
            com.amap.api.col.3l.j1 r0 = new com.amap.api.col.3l.j1
            r1 = -1
            r0.<init>(r1, r2)
            r2.m = r0
            com.amap.api.col.3l.j1 r0 = new com.amap.api.col.3l.j1
            r1 = 101(0x65, float:1.42E-43)
            r0.<init>(r1, r2)
            r2.n = r0
            com.amap.api.col.3l.j1 r0 = new com.amap.api.col.3l.j1
            r1 = 102(0x66, float:1.43E-43)
            r0.<init>(r1, r2)
            r2.o = r0
            com.amap.api.col.3l.j1 r0 = new com.amap.api.col.3l.j1
            r1 = 103(0x67, float:1.44E-43)
            r0.<init>(r1, r2)
            r2.p = r0
            r0 = 0
            r2.s = r0
            java.lang.String r0 = ""
            r2.t = r0
            r0 = 0
            r2.u = r0
            r0 = 0
            r2.v = r0
            r2.r = r3
            r2.m(r4)
            return
    }

    public ax(android.content.Context r3, com.amap.api.maps.offlinemap.OfflineMapCity r4) {
            r2 = this;
            int r0 = r4.getState()
            r2.<init>(r3, r0)
            java.lang.String r3 = r4.getCity()
            r2.setCity(r3)
            java.lang.String r3 = r4.getUrl()
            r2.setUrl(r3)
            int r3 = r4.getState()
            r2.setState(r3)
            int r3 = r4.getcompleteCode()
            r2.setCompleteCode(r3)
            java.lang.String r3 = r4.getAdcode()
            r2.setAdcode(r3)
            java.lang.String r3 = r4.getVersion()
            r2.setVersion(r3)
            long r0 = r4.getSize()
            r2.setSize(r0)
            java.lang.String r3 = r4.getCode()
            r2.setCode(r3)
            java.lang.String r3 = r4.getJianpin()
            r2.setJianpin(r3)
            java.lang.String r3 = r4.getPinyin()
            r2.setPinyin(r3)
            r2.F()
            return
    }

    public ax(android.os.Parcel r3) {
            r2 = this;
            r2.<init>(r3)
            com.amap.api.col.3l.i1 r0 = new com.amap.api.col.3l.i1
            r0.<init>(r2)
            r2.f2985f = r0
            com.amap.api.col.3l.p1 r0 = new com.amap.api.col.3l.p1
            r0.<init>(r2)
            r2.f2986g = r0
            com.amap.api.col.3l.l1 r0 = new com.amap.api.col.3l.l1
            r0.<init>(r2)
            r2.f2987h = r0
            com.amap.api.col.3l.n1 r0 = new com.amap.api.col.3l.n1
            r0.<init>(r2)
            r2.f2988i = r0
            com.amap.api.col.3l.o1 r0 = new com.amap.api.col.3l.o1
            r0.<init>(r2)
            r2.f2989j = r0
            com.amap.api.col.3l.h1 r0 = new com.amap.api.col.3l.h1
            r0.<init>(r2)
            r2.f2990k = r0
            com.amap.api.col.3l.m1 r0 = new com.amap.api.col.3l.m1
            r0.<init>(r2)
            r2.l = r0
            com.amap.api.col.3l.j1 r0 = new com.amap.api.col.3l.j1
            r1 = -1
            r0.<init>(r1, r2)
            r2.m = r0
            com.amap.api.col.3l.j1 r0 = new com.amap.api.col.3l.j1
            r1 = 101(0x65, float:1.42E-43)
            r0.<init>(r1, r2)
            r2.n = r0
            com.amap.api.col.3l.j1 r0 = new com.amap.api.col.3l.j1
            r1 = 102(0x66, float:1.43E-43)
            r0.<init>(r1, r2)
            r2.o = r0
            com.amap.api.col.3l.j1 r0 = new com.amap.api.col.3l.j1
            r1 = 103(0x67, float:1.44E-43)
            r0.<init>(r1, r2)
            r2.p = r0
            r0 = 0
            r2.s = r0
            java.lang.String r0 = ""
            r2.t = r0
            r0 = 0
            r2.u = r0
            r0 = 0
            r2.v = r0
            java.lang.String r3 = r3.readString()
            r2.t = r3
            return
    }

    private void H() {
            r1 = this;
            android.content.Context r0 = r1.r
            com.amap.api.col.3l.c0 r0 = com.amap.api.col.p0003l.c0.b(r0)
            if (r0 == 0) goto Lb
            r0.e(r1)
        Lb:
            return
    }

    private java.lang.String f() {
            r3 = this;
            java.lang.String r0 = r3.s
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r3.s
            java.lang.String r1 = "."
            int r1 = r0.lastIndexOf(r1)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            return r0
    }

    private java.lang.String h() {
            r3 = this;
            java.lang.String r0 = r3.s
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r3.f()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            return r0
    }

    private boolean i() {
            r1 = this;
            com.amap.api.col.p0003l.a1.a()
            r1.getSize()
            r1.getcompleteCode()
            r1.getSize()
            r0 = 0
            return r0
    }

    static /* synthetic */ long j(com.amap.api.col.p0003l.ax r2) {
            long r0 = r2.v
            return r0
    }

    static /* synthetic */ long k(com.amap.api.col.p0003l.ax r0, long r1) {
            r0.v = r1
            return r1
    }

    private void o(java.io.File r9, java.io.File r10, java.lang.String r11) {
            r8 = this;
            com.amap.api.col.3l.u0 r0 = new com.amap.api.col.3l.u0
            r0.<init>()
            long r5 = com.amap.api.col.p0003l.a1.b(r9)
            com.amap.api.col.3l.ax$a r7 = new com.amap.api.col.3l.ax$a
            r7.<init>(r8, r11, r9)
            r3 = -1
            r1 = r9
            r2 = r10
            r0.b(r1, r2, r3, r5, r7)
            return
    }

    public final void A() {
            r2 = this;
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.p
            int r1 = r1.d()
            r0.b(r1)
            return
    }

    public final void B() {
            r1 = this;
            com.amap.api.col.3l.g1 r0 = r1.q
            r0.a()
            boolean r0 = r1.u
            if (r0 == 0) goto Le
            com.amap.api.col.3l.g1 r0 = r1.q
            r0.h()
        Le:
            r0 = 0
            r1.u = r0
            return
    }

    public final void C() {
            r2 = this;
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.f2990k
            r0.equals(r1)
            com.amap.api.col.3l.g1 r0 = r2.q
            r0.j()
            return
    }

    public final void D() {
            r1 = this;
            android.content.Context r0 = r1.r
            com.amap.api.col.3l.c0 r0 = com.amap.api.col.p0003l.c0.b(r0)
            if (r0 == 0) goto Lb
            r0.k(r1)
        Lb:
            return
    }

    public final void E() {
            r1 = this;
            android.content.Context r0 = r1.r
            com.amap.api.col.3l.c0 r0 = com.amap.api.col.p0003l.c0.b(r0)
            if (r0 == 0) goto Lb
            r0.u(r1)
        Lb:
            return
    }

    protected final void F() {
            r4 = this;
            java.lang.String r0 = com.amap.api.col.p0003l.c0.o
            java.lang.String r1 = r4.getUrl()
            java.lang.String r1 = com.amap.api.col.p0003l.a1.i(r1)
            java.lang.String r2 = ".zip.tmp"
            if (r1 == 0) goto L23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r4.s = r0
            return
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r4.getPinyin()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r4.s = r0
            return
    }

    public final com.amap.api.col.p0003l.n0 G() {
            r2 = this;
            com.amap.api.col.3l.g1 r0 = r2.q
            int r0 = r0.d()
            r2.setState(r0)
            com.amap.api.col.3l.n0 r0 = new com.amap.api.col.3l.n0
            android.content.Context r1 = r2.r
            r0.<init>(r2, r1)
            java.lang.String r1 = r2.l()
            r0.m(r1)
            r2.l()
            return r0
    }

    @Override // com.amap.api.col.p0003l.by
    public final void a() {
            r0 = this;
            r0.u()
            return
    }

    @Override // com.amap.api.col.p0003l.v0
    public final void a(long r8) {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.v
            long r2 = r0 - r2
            r4 = 500(0x1f4, double:2.47E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1d
            int r9 = (int) r8
            int r8 = r7.getcompleteCode()
            if (r9 <= r8) goto L1b
            r7.setCompleteCode(r9)
            r7.t()
        L1b:
            r7.v = r0
        L1d:
            return
    }

    @Override // com.amap.api.col.p0003l.by
    public final void a(long r3, long r5) {
            r2 = this;
            r0 = 100
            long r5 = r5 * r0
            long r5 = r5 / r3
            int r3 = (int) r5
            int r4 = r2.getcompleteCode()
            if (r3 == r4) goto L12
            r2.setCompleteCode(r3)
            r2.t()
        L12:
            return
    }

    @Override // com.amap.api.col.p0003l.l0
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.getUrl()
            return r0
    }

    @Override // com.amap.api.col.p0003l.by
    public final void b(com.amap.api.col.3l.by.a r3) {
            r2 = this;
            int[] r0 = com.amap.api.col.3l.ax.c.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L21
            r0 = 2
            if (r3 == r0) goto L1a
            r0 = 3
            if (r3 == r0) goto L13
            r3 = 6
            goto L27
        L13:
            com.amap.api.col.3l.g1 r3 = r2.n
            int r3 = r3.d()
            goto L27
        L1a:
            com.amap.api.col.3l.g1 r3 = r2.p
            int r3 = r3.d()
            goto L27
        L21:
            com.amap.api.col.3l.g1 r3 = r2.o
            int r3 = r3.d()
        L27:
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.f2987h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.f2986g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            return
        L3c:
            com.amap.api.col.3l.g1 r0 = r2.q
            r0.b(r3)
            return
    }

    @Override // com.amap.api.col.p0003l.v0
    public final void b(java.lang.String r5) {
            r4 = this;
            com.amap.api.col.3l.g1 r0 = r4.q
            com.amap.api.col.3l.g1 r1 = r4.f2989j
            r0.equals(r1)
            r4.t = r5
            java.lang.String r5 = r4.f()
            java.lang.String r0 = r4.h()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L7e
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1e
            goto L7e
        L1e:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "/"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = r4.r
            java.lang.String r3 = com.amap.api.col.p0003l.b3.v(r3)
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = "map/"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r4.r
            java.lang.String r3 = com.amap.api.col.p0003l.b3.v(r3)
            r2.<init>(r3)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L6d
            boolean r2 = r2.mkdir()
            if (r2 != 0) goto L6d
            goto L79
        L6d:
            boolean r2 = r0.exists()
            if (r2 != 0) goto L7a
            boolean r2 = r0.mkdir()
            if (r2 != 0) goto L7a
        L79:
            return
        L7a:
            r4.o(r1, r0, r5)
            return
        L7e:
            r4.c()
            return
    }

    @Override // com.amap.api.col.p0003l.v0
    public final void c() {
            r2 = this;
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.f2989j
            r0.equals(r1)
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.m
            int r1 = r1.d()
            r0.b(r1)
            return
    }

    @Override // com.amap.api.col.p0003l.c1
    public final boolean d() {
            r1 = this;
            boolean r0 = r1.i()
            return r0
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.w0
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.h()
            return r0
    }

    public final java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.t
            return r0
    }

    @Override // com.amap.api.col.p0003l.by
    public final void m() {
            r2 = this;
            r0 = 0
            r2.v = r0
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.f2986g
            r0.equals(r1)
            com.amap.api.col.3l.g1 r0 = r2.q
            r0.f()
            return
    }

    public final void m(int r2) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L53
            if (r2 == 0) goto L4e
            r0 = 1
            if (r2 == r0) goto L49
            r0 = 2
            if (r2 == r0) goto L44
            r0 = 3
            if (r2 == r0) goto L3f
            r0 = 4
            if (r2 == r0) goto L3a
            r0 = 6
            if (r2 == r0) goto L35
            r0 = 7
            if (r2 == r0) goto L30
            switch(r2) {
                case 101: goto L2b;
                case 102: goto L26;
                case 103: goto L21;
                default: goto L1a;
            }
        L1a:
            if (r2 >= 0) goto L57
            com.amap.api.col.3l.g1 r0 = r1.m
            r1.q = r0
            goto L57
        L21:
            com.amap.api.col.3l.g1 r0 = r1.p
            r1.q = r0
            goto L57
        L26:
            com.amap.api.col.3l.g1 r0 = r1.o
            r1.q = r0
            goto L57
        L2b:
            com.amap.api.col.3l.g1 r0 = r1.n
            r1.q = r0
            goto L57
        L30:
            com.amap.api.col.3l.g1 r0 = r1.l
            r1.q = r0
            goto L57
        L35:
            com.amap.api.col.3l.g1 r0 = r1.f2985f
            r1.q = r0
            goto L57
        L3a:
            com.amap.api.col.3l.g1 r0 = r1.f2990k
            r1.q = r0
            goto L57
        L3f:
            com.amap.api.col.3l.g1 r0 = r1.f2988i
            r1.q = r0
            goto L57
        L44:
            com.amap.api.col.3l.g1 r0 = r1.f2986g
            r1.q = r0
            goto L57
        L49:
            com.amap.api.col.3l.g1 r0 = r1.f2989j
            r1.q = r0
            goto L57
        L4e:
            com.amap.api.col.3l.g1 r0 = r1.f2987h
            r1.q = r0
            goto L57
        L53:
            com.amap.api.col.3l.g1 r0 = r1.m
            r1.q = r0
        L57:
            r1.setState(r2)
            return
    }

    @Override // com.amap.api.col.p0003l.by
    public final void n() {
            r2 = this;
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.f2987h
            r0.equals(r1)
            com.amap.api.col.3l.g1 r0 = r2.q
            r0.k()
            return
    }

    public final void n(com.amap.api.col.p0003l.g1 r1) {
            r0 = this;
            r0.q = r1
            int r1 = r1.d()
            r0.setState(r1)
            return
    }

    @Override // com.amap.api.col.p0003l.v0
    public final void p() {
            r2 = this;
            r0 = 0
            r2.v = r0
            r0 = 0
            r2.setCompleteCode(r0)
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.f2989j
            r0.equals(r1)
            com.amap.api.col.3l.g1 r0 = r2.q
            r0.f()
            return
    }

    public final void p(java.lang.String r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public final com.amap.api.col.p0003l.g1 q(int r1) {
            r0 = this;
            switch(r1) {
                case 101: goto Lc;
                case 102: goto L9;
                case 103: goto L6;
                default: goto L3;
            }
        L3:
            com.amap.api.col.3l.g1 r1 = r0.m
            return r1
        L6:
            com.amap.api.col.3l.g1 r1 = r0.p
            return r1
        L9:
            com.amap.api.col.3l.g1 r1 = r0.o
            return r1
        Lc:
            com.amap.api.col.3l.g1 r1 = r0.n
            return r1
    }

    @Override // com.amap.api.col.p0003l.v0
    public final void r() {
            r0 = this;
            r0.u()
            return
    }

    public final com.amap.api.col.p0003l.g1 s() {
            r1 = this;
            com.amap.api.col.3l.g1 r0 = r1.q
            return r0
    }

    public final void t() {
            r1 = this;
            android.content.Context r0 = r1.r
            com.amap.api.col.3l.c0 r0 = com.amap.api.col.p0003l.c0.b(r0)
            if (r0 == 0) goto Lb
            r0.q(r1)
        Lb:
            return
    }

    public final void u() {
            r1 = this;
            android.content.Context r0 = r1.r
            com.amap.api.col.3l.c0 r0 = com.amap.api.col.p0003l.c0.b(r0)
            if (r0 == 0) goto Le
            r0.x(r1)
            r1.t()
        Le:
            return
    }

    @Override // com.amap.api.col.p0003l.c1
    public final java.lang.String v() {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r2.getUrl()
            java.lang.String r1 = com.amap.api.col.p0003l.a1.i(r1)
            if (r1 == 0) goto L13
            r0.append(r1)
            goto L1a
        L13:
            java.lang.String r1 = r2.getPinyin()
            r0.append(r1)
        L1a:
            java.lang.String r1 = ".zip"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.p0003l.c1
    public final java.lang.String w() {
            r1 = this;
            java.lang.String r0 = r1.getAdcode()
            return r0
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            java.lang.String r2 = r0.t
            r1.writeString(r2)
            return
    }

    @Override // com.amap.api.col.p0003l.w0
    public final java.lang.String x() {
            r1 = this;
            java.lang.String r0 = r1.f()
            return r0
    }

    public final void y() {
            r2 = this;
            com.amap.api.col.3l.g1 r0 = r2.s()
            r0.d()
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.f2988i
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            com.amap.api.col.3l.g1 r0 = r2.q
            r0.g()
            return
        L17:
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.f2987h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            com.amap.api.col.3l.g1 r0 = r2.q
            r0.i()
            return
        L27:
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.l
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.m
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            goto L69
        L3c:
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.o
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.n
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            com.amap.api.col.3l.g1 r0 = r2.q
            com.amap.api.col.3l.g1 r1 = r2.p
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L5b
            goto L63
        L5b:
            com.amap.api.col.3l.g1 r0 = r2.s()
            r0.h()
            return
        L63:
            com.amap.api.col.3l.g1 r0 = r2.q
            r0.f()
            return
        L69:
            r2.H()
            r0 = 1
            r2.u = r0
            return
    }

    public final void z() {
            r1 = this;
            com.amap.api.col.3l.g1 r0 = r1.q
            r0.i()
            return
    }
}
