package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class x2 {
    private static java.lang.ref.SoftReference<javax.net.ssl.SSLContext> t;
    private static java.lang.ref.SoftReference<com.amap.api.col.s.y2> u;
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private javax.net.ssl.SSLContext f4797b;

    /* renamed from: c, reason: collision with root package name */
    private java.net.Proxy f4798c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f4799d;

    /* renamed from: e, reason: collision with root package name */
    private long f4800e;

    /* renamed from: f, reason: collision with root package name */
    private long f4801f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f4802g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.s.u2.a f4803h;

    /* renamed from: i, reason: collision with root package name */
    private com.amap.api.col.s.x2.d f4804i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f4805j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4806k;
    private java.lang.String l;
    private java.lang.String m;
    private boolean n;
    private boolean o;
    private java.lang.String p;
    private java.lang.String q;
    private java.lang.String r;
    private com.amap.api.col.s.x2.f s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements java.lang.Cloneable, java.lang.Comparable {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f4807b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f4808c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f4809d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f4810e;

        /* renamed from: f, reason: collision with root package name */
        public int f4811f;

        /* renamed from: g, reason: collision with root package name */
        public int f4812g;

        /* renamed from: h, reason: collision with root package name */
        public int f4813h;

        /* renamed from: i, reason: collision with root package name */
        public long f4814i;

        /* renamed from: j, reason: collision with root package name */
        public volatile java.util.concurrent.atomic.AtomicInteger f4815j;

        public a(com.amap.api.col.s.x2.c r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r3.f4818c
                r2.f4807b = r0
                java.lang.String r0 = r3.f4820e
                r2.f4808c = r0
                java.lang.String r0 = r3.f4819d
                r2.f4810e = r0
                int r0 = r3.m
                r2.f4811f = r0
                int r0 = r3.n
                r2.f4812g = r0
                com.amap.api.col.s.dz$b r0 = r3.f4817b
                int r0 = r0.a()
                r2.f4813h = r0
                java.lang.String r0 = r3.a
                r2.f4809d = r0
                long r0 = r3.f4821f
                r2.f4814i = r0
                java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
                r0 = 1
                r3.<init>(r0)
                r2.f4815j = r3
                int r3 = r2.f4811f
                r0 = 10
                if (r3 != r0) goto L38
                r3 = 0
                r2.a = r3
            L38:
                return
        }

        public final com.amap.api.col.s.x2.a a() {
                r1 = this;
                java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
                com.amap.api.col.s.x2$a r0 = (com.amap.api.col.s.x2.a) r0     // Catch: java.lang.CloneNotSupportedException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        public final java.lang.String b() {
                r5 = this;
                java.lang.String r0 = "#"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r1.<init>()     // Catch: java.lang.Exception -> L121
                int r2 = r5.f4811f     // Catch: java.lang.Exception -> L121
                r1.append(r2)     // Catch: java.lang.Exception -> L121
                r1.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L121
                java.lang.String r2 = r5.f4810e     // Catch: java.lang.Exception -> L121
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L121
                java.lang.String r3 = "-#"
                if (r2 != 0) goto L32
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r5.f4810e     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
                goto L41
            L32:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r3)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
            L41:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                int r1 = r5.f4813h     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                java.util.concurrent.atomic.AtomicInteger r1 = r5.f4815j     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
                java.lang.String r2 = r5.f4807b     // Catch: java.lang.Exception -> L121
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L121
                if (r2 != 0) goto L86
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r5.f4807b     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
                goto L95
            L86:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r3)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
            L95:
                int r2 = r5.f4811f     // Catch: java.lang.Exception -> L121
                r4 = 1
                if (r2 != r4) goto Laf
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r5.f4809d     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
                goto Lbe
            Laf:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r3)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
            Lbe:
                int r2 = r5.f4811f     // Catch: java.lang.Exception -> L121
                if (r2 != r4) goto Ld7
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                long r3 = r5.f4814i     // Catch: java.lang.Exception -> L121
                r2.append(r3)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
                goto Le6
            Ld7:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r3)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
            Le6:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r5.f4808c     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L121
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r1.<init>()     // Catch: java.lang.Exception -> L121
                r1.append(r0)     // Catch: java.lang.Exception -> L121
                int r0 = r5.f4812g     // Catch: java.lang.Exception -> L121
                r1.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L121
                byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = "YXBtX25ldHdvcmtf"
                byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L121
                byte[] r0 = com.amap.api.col.s.q2.a(r0, r1)     // Catch: java.lang.Exception -> L121
                java.lang.String r0 = com.amap.api.col.s.d1.f(r0)     // Catch: java.lang.Exception -> L121
                com.amap.api.col.s.x2.i()     // Catch: java.lang.Exception -> L121
                return r0
            L121:
                r0 = 0
                return r0
        }

        public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.col.s.x2$a r0 = r1.a()
                return r0
        }

        @Override // java.lang.Comparable
        public final int compareTo(java.lang.Object r2) {
                r1 = this;
                int r0 = r1.a
                com.amap.api.col.s.x2$a r2 = (com.amap.api.col.s.x2.a) r2
                int r2 = r2.a
                int r0 = r0 - r2
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        public java.net.HttpURLConnection a;

        /* renamed from: b, reason: collision with root package name */
        public int f4816b;

        public b(java.net.HttpURLConnection r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                int r1 = r0.f4816b
                r0.f4816b = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c implements java.lang.Cloneable {
        public java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public com.amap.api.col.s.dz.b f4817b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f4818c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f4819d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f4820e;

        /* renamed from: f, reason: collision with root package name */
        public long f4821f;

        /* renamed from: g, reason: collision with root package name */
        public long f4822g;

        /* renamed from: h, reason: collision with root package name */
        public long f4823h;

        /* renamed from: i, reason: collision with root package name */
        public long f4824i;

        /* renamed from: j, reason: collision with root package name */
        public long f4825j;

        /* renamed from: k, reason: collision with root package name */
        public java.lang.String f4826k;
        public java.lang.String l;
        public int m;
        public int n;

        public c() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.a = r0
                com.amap.api.col.s.dz$b r1 = com.amap.api.col.s.dz.b.a
                r2.f4817b = r1
                r2.f4818c = r0
                r2.f4819d = r0
                r2.f4820e = r0
                r0 = 0
                r2.f4821f = r0
                r2.f4822g = r0
                r2.f4823h = r0
                r2.f4824i = r0
                r2.f4825j = r0
                java.lang.String r0 = "-"
                r2.f4826k = r0
                r2.l = r0
                r0 = 0
                r2.m = r0
                r2.n = r0
                return
        }

        protected final com.amap.api.col.s.x2.c a() {
                r1 = this;
                java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
                com.amap.api.col.s.x2$c r0 = (com.amap.api.col.s.x2.c) r0     // Catch: java.lang.CloneNotSupportedException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        protected final java.lang.String b() {
                r5 = this;
                java.lang.String r0 = r5.f4818c
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                java.lang.String r1 = "-#"
                java.lang.String r2 = "#"
                if (r0 != 0) goto L1e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r5.f4818c
                r0.append(r3)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                goto L1f
            L1e:
                r0 = r1
            L1f:
                java.lang.String r3 = r5.f4819d
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L3c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = r5.f4819d
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                goto L4b
            L3c:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
            L4b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                com.amap.api.col.s.dz$b r0 = r5.f4817b
                int r0 = r0.a()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                long r3 = r5.f4823h
                r1.append(r3)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                long r3 = r5.f4825j
                r1.append(r3)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                long r2 = r5.f4821f
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                byte[] r0 = r0.getBytes()
                java.lang.String r1 = "YXBtX25ldHdvcmtf"
                byte[] r1 = r1.getBytes()
                byte[] r0 = com.amap.api.col.s.q2.a(r0, r1)
                java.lang.String r0 = com.amap.api.col.s.d1.f(r0)
                com.amap.api.col.s.x2.i()
                return r0
        }

        protected final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.col.s.x2$c r0 = r1.a()
                return r0
        }

        public final java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "RequestInfo{csid='"
                r0.<init>(r1)
                java.lang.String r1 = r4.a
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", degradeType="
                r0.append(r2)
                com.amap.api.col.s.dz$b r2 = r4.f4817b
                r0.append(r2)
                java.lang.String r2 = ", serverIp='"
                r0.append(r2)
                java.lang.String r2 = r4.f4818c
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", path='"
                r0.append(r2)
                java.lang.String r2 = r4.f4819d
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", hostname='"
                r0.append(r2)
                java.lang.String r2 = r4.f4820e
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", totalTime="
                r0.append(r2)
                long r2 = r4.f4821f
                r0.append(r2)
                java.lang.String r2 = ", DNSTime="
                r0.append(r2)
                long r2 = r4.f4822g
                r0.append(r2)
                java.lang.String r2 = ", connectionTime="
                r0.append(r2)
                long r2 = r4.f4823h
                r0.append(r2)
                java.lang.String r2 = ", writeTime="
                r0.append(r2)
                long r2 = r4.f4824i
                r0.append(r2)
                java.lang.String r2 = ", readTime="
                r0.append(r2)
                long r2 = r4.f4825j
                r0.append(r2)
                java.lang.String r2 = ", serverTime='"
                r0.append(r2)
                java.lang.String r2 = r4.f4826k
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", datasize='"
                r0.append(r2)
                java.lang.String r2 = r4.l
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = ", errorcode="
                r0.append(r1)
                int r1 = r4.m
                r0.append(r1)
                java.lang.String r1 = ", errorcodeSub="
                r0.append(r1)
                int r1 = r4.n
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d {
        private java.util.Vector<com.amap.api.col.s.x2.e> a;

        /* renamed from: b, reason: collision with root package name */
        private volatile com.amap.api.col.s.x2.e f4827b;

        private d() {
                r2 = this;
                r2.<init>()
                java.util.Vector r0 = new java.util.Vector
                r0.<init>()
                r2.a = r0
                com.amap.api.col.s.x2$e r0 = new com.amap.api.col.s.x2$e
                r1 = 0
                r0.<init>(r1)
                r2.f4827b = r0
                return
        }

        /* synthetic */ d(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.amap.api.col.s.x2.e a(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 == 0) goto L9
                com.amap.api.col.s.x2$e r5 = r4.f4827b
                return r5
            L9:
                r0 = 0
                r1 = 0
            Lb:
                java.util.Vector<com.amap.api.col.s.x2$e> r2 = r4.a
                int r2 = r2.size()
                if (r1 >= r2) goto L2b
                java.util.Vector<com.amap.api.col.s.x2$e> r2 = r4.a
                java.lang.Object r2 = r2.get(r1)
                com.amap.api.col.s.x2$e r2 = (com.amap.api.col.s.x2.e) r2
                if (r2 == 0) goto L28
                java.lang.String r3 = r2.a()
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L28
                return r2
            L28:
                int r1 = r1 + 1
                goto Lb
            L2b:
                com.amap.api.col.s.x2$e r1 = new com.amap.api.col.s.x2$e
                r1.<init>(r0)
                r1.c(r5)
                java.util.Vector<com.amap.api.col.s.x2$e> r5 = r4.a
                r5.add(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e implements javax.net.ssl.HostnameVerifier {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f4828b;

        private e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ e(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.f4828b
                return r0
        }

        public final void b(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = r2.a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L1f
                java.lang.String r0 = ":"
                boolean r1 = r3.contains(r0)
                if (r1 == 0) goto L1f
                java.lang.String[] r0 = r3.split(r0)
                if (r0 == 0) goto L1f
                int r1 = r0.length
                if (r1 <= 0) goto L1f
                r3 = 0
                r3 = r0[r3]
                r2.a = r3
                return
            L1f:
                r2.a = r3
                return
        }

        public final void c(java.lang.String r1) {
                r0 = this;
                r0.f4828b = r1
                return
        }

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(java.lang.String r3, javax.net.ssl.SSLSession r4) {
                r2 = this;
                javax.net.ssl.HostnameVerifier r0 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()
                java.lang.String r1 = r2.a
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L13
                java.lang.String r4 = r2.a
                boolean r3 = r4.equals(r3)
                return r3
            L13:
                java.lang.String r1 = r2.f4828b
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L22
                java.lang.String r3 = r2.f4828b
                boolean r3 = r0.verify(r3, r4)
                return r3
            L22:
                boolean r3 = r0.verify(r3, r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f {
        long a;

        /* renamed from: b, reason: collision with root package name */
        long f4829b;

        /* renamed from: c, reason: collision with root package name */
        com.amap.api.col.s.x2.c f4830c;

        /* renamed from: d, reason: collision with root package name */
        com.amap.api.col.s.x2.a f4831d;

        /* renamed from: e, reason: collision with root package name */
        com.amap.api.col.s.x2.c f4832e;

        /* renamed from: f, reason: collision with root package name */
        java.lang.String f4833f;

        /* renamed from: g, reason: collision with root package name */
        java.net.URL f4834g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.x2 f4835h;

        f(com.amap.api.col.s.x2 r3) {
                r2 = this;
                r2.f4835h = r3
                r2.<init>()
                r0 = 0
                r2.a = r0
                r2.f4829b = r0
                com.amap.api.col.s.x2$c r3 = new com.amap.api.col.s.x2$c
                r3.<init>()
                r2.f4830c = r3
                return
        }

        public final void a() {
                r5 = this;
                com.amap.api.col.s.x2$c r0 = r5.f4830c
                long r1 = android.os.SystemClock.elapsedRealtime()
                long r3 = r5.f4829b
                long r1 = r1 - r3
                r0.f4823h = r1
                return
        }

        public final void b(int r6) {
                r5 = this;
                java.lang.String r0 = "----errorcode-----"
                java.lang.String r1 = java.lang.String.valueOf(r6)
                r0.concat(r1)
                com.amap.api.col.s.x2.i()
                com.amap.api.col.s.x2$c r0 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L9a
                long r3 = r5.a     // Catch: java.lang.Throwable -> L9a
                long r1 = r1 - r3
                r0.f4821f = r1     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.x2$c r0 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                r0.m = r6     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.dz$b r6 = r0.f4817b     // Catch: java.lang.Throwable -> L9a
                boolean r6 = r6.e()     // Catch: java.lang.Throwable -> L9a
                r0 = 0
                if (r6 == 0) goto L2b
                com.amap.api.col.s.x2$c r6 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                java.lang.String r6 = r6.f4820e     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.y0.r(r0, r6)     // Catch: java.lang.Throwable -> L9a
            L2b:
                com.amap.api.col.s.x2 r6 = r5.f4835h     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.x2$c r1 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                java.lang.String r1 = r1.f4820e     // Catch: java.lang.Throwable -> L9a
                boolean r6 = com.amap.api.col.s.x2.k(r6, r1)     // Catch: java.lang.Throwable -> L9a
                if (r6 == 0) goto L80
                com.amap.api.col.s.x2 r1 = r5.f4835h     // Catch: java.lang.Throwable -> L9a
                boolean r1 = com.amap.api.col.s.x2.q(r1)     // Catch: java.lang.Throwable -> L9a
                if (r1 == 0) goto L58
                com.amap.api.col.s.x2 r1 = r5.f4835h     // Catch: java.lang.Throwable -> L9a
                java.lang.String r1 = com.amap.api.col.s.x2.e(r1)     // Catch: java.lang.Throwable -> L9a
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L9a
                if (r1 != 0) goto L58
                com.amap.api.col.s.x2$c r1 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.dz$b r1 = r1.f4817b     // Catch: java.lang.Throwable -> L9a
                boolean r1 = r1.b()     // Catch: java.lang.Throwable -> L9a
                if (r1 == 0) goto L58
                com.amap.api.col.s.y0.F()     // Catch: java.lang.Throwable -> L9a
            L58:
                com.amap.api.col.s.x2$c r1 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.dz$b r1 = r1.f4817b     // Catch: java.lang.Throwable -> L9a
                boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L9a
                if (r1 == 0) goto L71
                com.amap.api.col.s.x2$c r1 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.dz$b r1 = r1.f4817b     // Catch: java.lang.Throwable -> L9a
                boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.x2$c r2 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = r2.f4820e     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.y0.r(r1, r2)     // Catch: java.lang.Throwable -> L9a
            L71:
                com.amap.api.col.s.x2$c r1 = r5.f4832e     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.y0.H(r1)     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.x2$a r1 = r5.f4831d     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.y0.q(r0, r1)     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.x2$c r0 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.y0.B(r0)     // Catch: java.lang.Throwable -> L9a
            L80:
                java.net.URL r0 = r5.f4834g     // Catch: java.lang.Throwable -> L9a
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.x2$c r1 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.dz$b r1 = r1.f4817b     // Catch: java.lang.Throwable -> L9a
                boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L9a
                r2 = 1
                com.amap.api.col.s.y0.p(r0, r1, r2, r6)     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.x2$c r6 = r5.f4830c     // Catch: java.lang.Throwable -> L9a
                r6.toString()     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L9a
            L9a:
                return
        }

        public final void c(long r3) {
                r2 = this;
                java.text.DecimalFormat r0 = new java.text.DecimalFormat
                java.lang.String r1 = "0.00"
                r0.<init>(r1)
                com.amap.api.col.s.x2$c r1 = r2.f4830c
                float r3 = (float) r3
                r4 = 1149239296(0x44800000, float:1024.0)
                float r3 = r3 / r4
                double r3 = (double) r3
                java.lang.String r3 = r0.format(r3)
                r1.l = r3
                return
        }

        public final void d(com.amap.api.col.s.dz r4, java.net.URL r5) {
                r3 = this;
                r3.f4834g = r5
                com.amap.api.col.s.x2$c r0 = r3.f4830c
                java.lang.String r1 = r5.getPath()
                r0.f4819d = r1
                com.amap.api.col.s.x2$c r0 = r3.f4830c
                java.lang.String r5 = r5.getHost()
                r0.f4820e = r5
                com.amap.api.col.s.x2 r5 = r3.f4835h
                java.lang.String r5 = com.amap.api.col.s.x2.e(r5)
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L46
                com.amap.api.col.s.dz$b r5 = r4.B()
                boolean r5 = r5.b()
                if (r5 == 0) goto L46
                com.amap.api.col.s.x2$c r5 = r3.f4830c
                java.lang.String r0 = r5.f4820e
                java.lang.String r1 = "["
                java.lang.String r2 = ""
                java.lang.String r0 = r0.replace(r1, r2)
                java.lang.String r1 = "]"
                java.lang.String r0 = r0.replace(r1, r2)
                r5.f4818c = r0
                com.amap.api.col.s.x2$c r5 = r3.f4830c
                com.amap.api.col.s.x2 r0 = r3.f4835h
                java.lang.String r0 = com.amap.api.col.s.x2.e(r0)
                r5.f4820e = r0
            L46:
                com.amap.api.col.s.dz$b r5 = r4.B()
                boolean r5 = r5.b()
                if (r5 == 0) goto L57
                com.amap.api.col.s.x2$c r5 = r3.f4830c
                java.lang.String r5 = r5.f4820e
                r4.n(r5)
            L57:
                com.amap.api.col.s.dz$b r5 = r4.B()
                boolean r5 = r5.d()
                if (r5 == 0) goto L67
                java.lang.String r4 = r4.E()
                r3.f4833f = r4
            L67:
                return
        }

        public final void e(com.amap.api.col.s.b3 r9) {
                r8 = this;
                com.amap.api.col.s.x2$c r0 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L8c
                long r3 = r8.a     // Catch: java.lang.Throwable -> L8c
                long r1 = r1 - r3
                r0.f4821f = r1     // Catch: java.lang.Throwable -> L8c
                if (r9 == 0) goto L17
                com.amap.api.col.s.x2$c r0 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.dz$b r0 = r0.f4817b     // Catch: java.lang.Throwable -> L8c
                boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L8c
                r9.f4319f = r0     // Catch: java.lang.Throwable -> L8c
            L17:
                com.amap.api.col.s.x2$c r9 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.dz$b r9 = r9.f4817b     // Catch: java.lang.Throwable -> L8c
                boolean r9 = r9.b()     // Catch: java.lang.Throwable -> L8c
                r0 = 0
                if (r9 == 0) goto L31
                com.amap.api.col.s.x2$c r9 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                long r1 = r9.f4821f     // Catch: java.lang.Throwable -> L8c
                r3 = 10000(0x2710, double:4.9407E-320)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L31
                java.lang.String r9 = r9.f4820e     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.y0.r(r0, r9)     // Catch: java.lang.Throwable -> L8c
            L31:
                com.amap.api.col.s.x2$c r9 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.dz$b r9 = r9.f4817b     // Catch: java.lang.Throwable -> L8c
                boolean r9 = r9.d()     // Catch: java.lang.Throwable -> L8c
                if (r9 == 0) goto L40
                java.lang.String r9 = r8.f4833f     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.y0.r(r0, r9)     // Catch: java.lang.Throwable -> L8c
            L40:
                com.amap.api.col.s.x2 r9 = r8.f4835h     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.x2$c r1 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                java.lang.String r1 = r1.f4820e     // Catch: java.lang.Throwable -> L8c
                boolean r9 = com.amap.api.col.s.x2.k(r9, r1)     // Catch: java.lang.Throwable -> L8c
                if (r9 == 0) goto L73
                com.amap.api.col.s.x2$c r1 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.y0.H(r1)     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.x2$a r1 = r8.f4831d     // Catch: java.lang.Throwable -> L8c
                r2 = 1
                com.amap.api.col.s.y0.q(r2, r1)     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.x2$c r1 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                long r3 = r1.f4821f     // Catch: java.lang.Throwable -> L8c
                int r5 = com.amap.api.col.s.y0.s     // Catch: java.lang.Throwable -> L8c
                long r5 = (long) r5     // Catch: java.lang.Throwable -> L8c
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L73
                com.amap.api.col.s.x2$c r1 = r1.a()     // Catch: java.lang.Throwable -> L8c
                if (r1 == 0) goto L73
                r1.m = r2     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.y0.B(r1)     // Catch: java.lang.Throwable -> L8c
                r1.toString()     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L8c
            L73:
                java.net.URL r1 = r8.f4834g     // Catch: java.lang.Throwable -> L8c
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.x2$c r2 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.dz$b r2 = r2.f4817b     // Catch: java.lang.Throwable -> L8c
                boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.y0.p(r1, r2, r0, r9)     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.x2$c r9 = r8.f4830c     // Catch: java.lang.Throwable -> L8c
                r9.toString()     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L8c
            L8c:
                return
        }

        public final void f() {
                r5 = this;
                com.amap.api.col.s.x2$c r0 = r5.f4830c
                long r1 = android.os.SystemClock.elapsedRealtime()
                long r3 = r5.f4829b
                long r1 = r1 - r3
                r0.f4824i = r1
                return
        }

        public final void g(int r2) {
                r1 = this;
                com.amap.api.col.s.x2$c r0 = r1.f4830c
                r0.n = r2
                return
        }

        public final void h() {
                r5 = this;
                com.amap.api.col.s.x2$c r0 = r5.f4830c
                long r1 = android.os.SystemClock.elapsedRealtime()
                long r3 = r5.f4829b
                long r1 = r1 - r3
                r0.f4825j = r1
                return
        }

        public final void i() {
                r6 = this;
                com.amap.api.col.s.x2$c r0 = r6.f4830c
                com.amap.api.col.s.x2$c r0 = r0.a()
                com.amap.api.col.s.x2$c r1 = r6.f4830c
                long r1 = r1.f4821f
                int r3 = com.amap.api.col.s.y0.s
                long r3 = (long) r3
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L14
                r1 = 1
                r0.m = r1
            L14:
                com.amap.api.col.s.y0.l(r0)
                return
        }
    }

    static {
            return
    }

    x2() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f4799d = r0
            r1 = -1
            r3.f4800e = r1
            r1 = 0
            r3.f4801f = r1
            java.lang.String r1 = ""
            r3.f4805j = r1
            r3.n = r0
            r3.o = r0
            r3.p = r1
            r3.q = r1
            r3.r = r1
            com.amap.api.col.s.x2$f r0 = new com.amap.api.col.s.x2$f
            r0.<init>(r3)
            r3.s = r0
            com.amap.api.col.s.y0.I()
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "-"
            java.lang.String r0 = r0.replaceAll(r2, r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L3b
            r3.f4802g = r0     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r0 = move-exception
            java.lang.String r1 = "ht"
            java.lang.String r2 = "ic"
            com.amap.api.col.s.d2.e(r0, r1, r2)
            return
    }

    private static int a(java.lang.Exception r1) {
            boolean r0 = r1 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L7
            r1 = 4101(0x1005, float:5.747E-42)
            return r1
        L7:
            boolean r0 = r1 instanceof javax.net.ssl.SSLKeyException
            if (r0 == 0) goto Le
            r1 = 4102(0x1006, float:5.748E-42)
            return r1
        Le:
            boolean r0 = r1 instanceof javax.net.ssl.SSLProtocolException
            if (r0 == 0) goto L15
            r1 = 4103(0x1007, float:5.75E-42)
            return r1
        L15:
            boolean r0 = r1 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L1c
            r1 = 4104(0x1008, float:5.751E-42)
            return r1
        L1c:
            boolean r0 = r1 instanceof java.net.ConnectException
            if (r0 == 0) goto L23
            r1 = 6101(0x17d5, float:8.55E-42)
            return r1
        L23:
            boolean r0 = r1 instanceof java.net.SocketException
            if (r0 == 0) goto L2a
            r1 = 6102(0x17d6, float:8.551E-42)
            return r1
        L2a:
            boolean r0 = r1 instanceof org.apache.http.conn.ConnectTimeoutException
            if (r0 == 0) goto L31
            r1 = 2101(0x835, float:2.944E-42)
            return r1
        L31:
            boolean r1 = r1 instanceof java.net.SocketTimeoutException
            if (r1 == 0) goto L38
            r1 = 2102(0x836, float:2.946E-42)
            return r1
        L38:
            r1 = 0
            return r1
    }

    private com.amap.api.col.s.x2.b b(com.amap.api.col.s.dz r14, boolean r15) throws java.io.IOException, com.amap.api.col.s.bv {
            r13 = this;
            java.lang.String r0 = "TLS"
            com.amap.api.col.s.x2$f r1 = r13.s
            com.amap.api.col.s.dz$b r2 = r14.B()
            com.amap.api.col.s.x2$c r3 = r1.f4830c
            com.amap.api.col.s.x2 r4 = r1.f4835h
            java.lang.String r4 = r4.f4802g
            r3.a = r4
            r3.f4817b = r2
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.a = r2
            java.util.Map r1 = r14.p()
            if (r1 != 0) goto L23
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L23:
            com.amap.api.col.s.x2$d r2 = r13.f4804i
            java.lang.String r3 = r13.m
            com.amap.api.col.s.x2$e r2 = r2.a(r3)
            int r3 = com.amap.api.col.s.u2.a
            java.lang.String r4 = r13.l
            android.net.Uri r5 = android.net.Uri.parse(r4)
            java.lang.String r6 = r5.getHost()
            java.lang.String r7 = ""
            r8 = 0
            r9 = 1
            if (r3 == r9) goto L51
            r10 = 2
            if (r3 == r10) goto L43
            r3 = r7
        L41:
            r10 = 1
            goto L54
        L43:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.amap.api.col.s.u2.f4727c
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
        L4d:
            r10 = 0
            goto L54
        L4f:
            r3 = r7
            goto L4d
        L51:
            java.lang.String r3 = com.amap.api.col.s.u2.f4726b
            goto L41
        L54:
            boolean r11 = android.text.TextUtils.isEmpty(r3)
            if (r11 != 0) goto L7f
            r14.D()
            android.net.Uri$Builder r4 = r5.buildUpon()
            android.net.Uri$Builder r4 = r4.encodedAuthority(r3)
            android.net.Uri r4 = r4.build()
            java.lang.String r4 = r4.toString()
            if (r10 == 0) goto L76
            java.lang.String r5 = "targetHost"
            r1.put(r5, r6)
            r13.r = r6
        L76:
            if (r10 == 0) goto L7f
            boolean r5 = r13.a
            if (r5 == 0) goto L7f
            r2.b(r3)
        L7f:
            r13.l = r4
            java.net.URL r3 = new java.net.URL
            java.lang.String r4 = r13.l
            r3.<init>(r4)
            com.amap.api.col.s.x2$f r4 = r13.s
            r4.d(r14, r3)
            java.lang.String r3 = r3.getHost()
            boolean r3 = r(r3)
            if (r3 == 0) goto L1a9
            boolean r3 = r14.k()
            if (r3 == 0) goto L1a9
            com.amap.api.col.s.dz$b r3 = r14.B()
            com.amap.api.col.s.x2$f r4 = r13.s
            com.amap.api.col.s.x2$c r4 = r4.f4830c
            java.lang.String r4 = r4.f4820e
            boolean r6 = r13.l(r4)
            if (r6 == 0) goto L1a9
            boolean r6 = r3.b()
            if (r6 == 0) goto Lb8
            boolean r6 = com.amap.api.col.s.y0.u
            if (r6 == 0) goto Lb8
            goto Lc4
        Lb8:
            boolean r3 = r3.c()
            if (r3 == 0) goto L1a9
            boolean r3 = com.amap.api.col.s.y0.T(r4)
            if (r3 == 0) goto L1a9
        Lc4:
            com.amap.api.col.s.x2$f r3 = r13.s     // Catch: java.lang.Throwable -> Lf1
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf1
            r3.f4829b = r10     // Catch: java.lang.Throwable -> Lf1
            com.amap.api.col.s.x2$f r3 = r13.s     // Catch: java.lang.Throwable -> Lf1
            com.amap.api.col.s.x2$c r3 = r3.f4830c     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r3 = r3.f4820e     // Catch: java.lang.Throwable -> Lf1
            java.net.InetAddress[] r3 = java.net.InetAddress.getAllByName(r3)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = "]"
            java.lang.String r6 = "["
            if (r3 == 0) goto L156
            int r10 = r3.length     // Catch: java.lang.Throwable -> Lf1
            if (r10 <= 0) goto L156
            r10 = r3[r8]     // Catch: java.lang.Throwable -> Lf1
            if (r10 == 0) goto L156
            boolean r10 = com.amap.api.col.s.y0.s()     // Catch: java.lang.Throwable -> Lf1
            if (r10 == 0) goto Lf4
            boolean r10 = com.amap.api.col.s.y0.D()     // Catch: java.lang.Throwable -> Lf1
            if (r10 == 0) goto Lf4
            r10 = 1
            goto Lf5
        Lf1:
            goto L1a9
        Lf4:
            r10 = 0
        Lf5:
            java.lang.String r11 = "---canUseIpv6---"
            java.lang.String r12 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> Lf1
            r11.concat(r12)     // Catch: java.lang.Throwable -> Lf1
            if (r10 == 0) goto L123
            r10 = 0
        L101:
            int r11 = r3.length     // Catch: java.lang.Throwable -> Lf1
            if (r10 >= r11) goto L135
            r11 = r3[r10]     // Catch: java.lang.Throwable -> Lf1
            boolean r11 = r11 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> Lf1
            if (r11 == 0) goto L120
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            r11.<init>(r6)     // Catch: java.lang.Throwable -> Lf1
            r10 = r3[r10]     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r10 = r10.getHostAddress()     // Catch: java.lang.Throwable -> Lf1
            r11.append(r10)     // Catch: java.lang.Throwable -> Lf1
            r11.append(r4)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> Lf1
            goto L136
        L120:
            int r10 = r10 + 1
            goto L101
        L123:
            r10 = 0
        L124:
            int r11 = r3.length     // Catch: java.lang.Throwable -> Lf1
            if (r10 >= r11) goto L135
            r11 = r3[r10]     // Catch: java.lang.Throwable -> Lf1
            boolean r12 = r11 instanceof java.net.Inet4Address     // Catch: java.lang.Throwable -> Lf1
            if (r12 == 0) goto L132
            java.lang.String r10 = r11.getHostAddress()     // Catch: java.lang.Throwable -> Lf1
            goto L136
        L132:
            int r10 = r10 + 1
            goto L124
        L135:
            r10 = r7
        L136:
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lf1
            if (r11 == 0) goto L157
            r3 = r3[r8]     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r10 = r3.getHostAddress()     // Catch: java.lang.Throwable -> Lf1
            boolean r3 = r3 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> Lf1
            if (r3 == 0) goto L157
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            r3.<init>(r6)     // Catch: java.lang.Throwable -> Lf1
            r3.append(r10)     // Catch: java.lang.Throwable -> Lf1
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> Lf1
            goto L157
        L156:
            r10 = r7
        L157:
            com.amap.api.col.s.x2$f r3 = r13.s     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r11 = "---onDNSEnd---ip="
            java.lang.String r12 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> Lf1
            r11.concat(r12)     // Catch: java.lang.Throwable -> Lf1
            com.amap.api.col.s.x2$c r11 = r3.f4830c     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r6 = r10.replace(r6, r7)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = r6.replace(r4, r7)     // Catch: java.lang.Throwable -> Lf1
            r11.f4818c = r4     // Catch: java.lang.Throwable -> Lf1
            com.amap.api.col.s.x2$c r4 = r3.f4830c     // Catch: java.lang.Throwable -> Lf1
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf1
            long r11 = r3.f4829b     // Catch: java.lang.Throwable -> Lf1
            long r6 = r6 - r11
            r4.f4822g = r6     // Catch: java.lang.Throwable -> Lf1
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lf1
            if (r3 != 0) goto L1a9
            java.lang.String r3 = r13.l     // Catch: java.lang.Throwable -> Lf1
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = r3.getHost()     // Catch: java.lang.Throwable -> Lf1
            android.net.Uri$Builder r3 = r3.buildUpon()     // Catch: java.lang.Throwable -> Lf1
            android.net.Uri$Builder r3 = r3.encodedAuthority(r10)     // Catch: java.lang.Throwable -> Lf1
            android.net.Uri r3 = r3.build()     // Catch: java.lang.Throwable -> Lf1
            r13.m = r4     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r6 = "host"
            r1.put(r6, r4)     // Catch: java.lang.Throwable -> Lf1
            boolean r6 = r13.a     // Catch: java.lang.Throwable -> Lf1
            if (r6 == 0) goto L1a3
            r2.c(r4)     // Catch: java.lang.Throwable -> Lf1
        L1a3:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf1
            r13.l = r3     // Catch: java.lang.Throwable -> Lf1
        L1a9:
            boolean r3 = r13.a
            if (r3 == 0) goto L1b5
            java.lang.String r3 = r13.l
            java.lang.String r3 = com.amap.api.col.s.e1.b(r3)
            r13.l = r3
        L1b5:
            com.amap.api.col.s.dz$b r3 = r14.B()
            java.util.Objects.toString(r3)
            java.net.URL r3 = new java.net.URL
            java.lang.String r4 = r13.l
            r3.<init>(r4)
            com.amap.api.col.s.u2$a r4 = r13.f4803h
            r6 = 0
            if (r4 == 0) goto L1cd
            java.net.URLConnection r4 = r4.a()
            goto L1ce
        L1cd:
            r4 = r6
        L1ce:
            if (r4 != 0) goto L1dd
            java.net.Proxy r4 = r13.f4798c
            if (r4 == 0) goto L1d9
            java.net.URLConnection r4 = r3.openConnection(r4)
            goto L1dd
        L1d9:
            java.net.URLConnection r4 = r3.openConnection()
        L1dd:
            boolean r3 = r13.a
            if (r3 == 0) goto L245
            java.lang.ref.SoftReference<javax.net.ssl.SSLContext> r3 = com.amap.api.col.s.x2.t     // Catch: java.lang.Throwable -> L1ec
            if (r3 == 0) goto L1ee
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L1ec
            if (r3 != 0) goto L1f9
            goto L1ee
        L1ec:
            goto L204
        L1ee:
            java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L1ec
            javax.net.ssl.SSLContext r7 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.lang.Throwable -> L1ec
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L1ec
            com.amap.api.col.s.x2.t = r3     // Catch: java.lang.Throwable -> L1ec
        L1f9:
            java.lang.ref.SoftReference<javax.net.ssl.SSLContext> r3 = com.amap.api.col.s.x2.t     // Catch: java.lang.Throwable -> L1ec
            if (r3 == 0) goto L204
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L1ec
            javax.net.ssl.SSLContext r3 = (javax.net.ssl.SSLContext) r3     // Catch: java.lang.Throwable -> L1ec
            goto L205
        L204:
            r3 = r6
        L205:
            if (r3 != 0) goto L20e
            javax.net.ssl.SSLContext r3 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.lang.Throwable -> L20c
            goto L20e
        L20c:
            r0 = move-exception
            goto L214
        L20e:
            r3.init(r6, r6, r6)     // Catch: java.lang.Throwable -> L20c
            r13.f4797b = r3     // Catch: java.lang.Throwable -> L20c
            goto L21b
        L214:
            java.lang.String r3 = "ht"
            java.lang.String r6 = "ne"
            com.amap.api.col.s.d2.e(r0, r3, r6)
        L21b:
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            boolean r0 = com.amap.api.col.s.y0.g.a
            if (r0 == 0) goto L238
            com.amap.api.col.s.y2 r0 = r13.n()
            if (r0 == 0) goto L22e
            r4.setSSLSocketFactory(r0)
            r0.b()
            goto L241
        L22e:
            javax.net.ssl.SSLContext r0 = r13.f4797b
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            r4.setSSLSocketFactory(r0)
            goto L241
        L238:
            javax.net.ssl.SSLContext r0 = r13.f4797b
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            r4.setSSLSocketFactory(r0)
        L241:
            r4.setHostnameVerifier(r2)
            goto L247
        L245:
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4
        L247:
            java.lang.String r0 = android.os.Build.VERSION.SDK
            if (r0 == 0) goto L252
            java.lang.String r0 = "Connection"
            java.lang.String r2 = "close"
            r4.setRequestProperty(r0, r2)
        L252:
            int r0 = r14.C()
            long r2 = (long) r0
            com.amap.api.col.s.x2$f r0 = r13.s
            com.amap.api.col.s.x2$c r0 = r0.f4830c
            long r5 = r0.f4822g
            r10 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r10
            long r2 = r2 - r5
            int r0 = (int) r2
            r13.j(r1, r4)
            r4.setConnectTimeout(r0)
            r4.setReadTimeout(r0)
            if (r15 == 0) goto L27c
            java.lang.String r0 = "POST"
            r4.setRequestMethod(r0)
            r4.setUseCaches(r8)
            r4.setDoInput(r9)
            r4.setDoOutput(r9)
            goto L284
        L27c:
            java.lang.String r0 = "GET"
            r4.setRequestMethod(r0)
            r4.setDoInput(r9)
        L284:
            com.amap.api.col.s.x2$b r0 = new com.amap.api.col.s.x2$b
            r0.<init>(r4)
            return r0
    }

    private com.amap.api.col.s.b3 c(com.amap.api.col.s.x2.b r15) throws com.amap.api.col.s.bv, java.io.IOException {
            r14 = this;
            java.lang.String r0 = "par"
            java.lang.String r1 = "ht"
            java.lang.String r2 = ""
            r3 = 0
            com.amap.api.col.s.w2.b()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.net.HttpURLConnection r15 = r15.a     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.util.Map r4 = r15.getHeaderFields()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            int r5 = r15.getResponseCode()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto Lbb
            java.lang.String r9 = "gsid"
            java.lang.Object r9 = r4.get(r9)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            if (r9 == 0) goto L49
            int r10 = r9.size()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            if (r10 <= 0) goto L49
            java.lang.Object r9 = r9.get(r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r2 = r9
            goto L49
        L31:
            r15 = move-exception
            r4 = r3
            r10 = r4
            r11 = r10
            goto L20a
        L37:
            r15 = move-exception
            r4 = r3
            r10 = r4
            r11 = r10
            goto L1da
        L3d:
            r15 = move-exception
            r2 = r3
            r10 = r2
            r11 = r10
            goto L205
        L43:
            r15 = move-exception
            r2 = r3
            r10 = r2
            r11 = r10
            goto L209
        L49:
            com.amap.api.col.s.x2$f r9 = r14.s     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r10 = p(r4)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            com.amap.api.col.s.x2$c r9 = r9.f4830c     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r9.f4826k = r10     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r9 = r14.f4805j     // Catch: java.lang.Throwable -> L6d
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L6d
            if (r9 != 0) goto Lbb
            boolean r9 = r14.n     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto L77
            java.lang.String r9 = "sc"
            boolean r9 = r4.containsKey(r9)     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto L6f
            boolean r9 = r14.m(r4, r8)     // Catch: java.lang.Throwable -> L6d
            r10 = 1
            goto L7c
        L6d:
            goto Lbb
        L6f:
            java.lang.String r9 = r14.f4805j     // Catch: java.lang.Throwable -> L6d
            com.amap.api.col.s.y0.N(r9)     // Catch: java.lang.Throwable -> L6d
            r9 = 0
            r10 = 0
            goto L7c
        L77:
            boolean r9 = r14.m(r4, r7)     // Catch: java.lang.Throwable -> L6d
            r10 = 2
        L7c:
            if (r9 == 0) goto Lb3
            java.lang.String r11 = r14.f4805j     // Catch: java.lang.Throwable -> L99
            java.lang.String r12 = "loc"
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> L99
            if (r11 == 0) goto La8
            java.lang.String r11 = r14.r     // Catch: java.lang.Throwable -> L99
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L99
            if (r12 == 0) goto L9b
            java.net.URL r11 = r15.getURL()     // Catch: java.lang.Throwable -> L99
            java.lang.String r11 = r11.getHost()     // Catch: java.lang.Throwable -> L99
            goto L9b
        L99:
            goto Lbc
        L9b:
            java.lang.String r12 = r14.f4805j     // Catch: java.lang.Throwable -> L99
            if (r10 != r6) goto La1
            r10 = 1
            goto La2
        La1:
            r10 = 0
        La2:
            java.lang.String r13 = r14.m     // Catch: java.lang.Throwable -> L99
            com.amap.api.col.s.y0.o(r12, r10, r11, r11, r13)     // Catch: java.lang.Throwable -> L99
            goto Lbc
        La8:
            java.lang.String r11 = r14.f4805j     // Catch: java.lang.Throwable -> L99
            if (r10 != r6) goto Lae
            r10 = 1
            goto Laf
        Lae:
            r10 = 0
        Laf:
            com.amap.api.col.s.y0.C(r11, r10)     // Catch: java.lang.Throwable -> L99
            goto Lbc
        Lb3:
            if (r10 != r7) goto Lbc
            java.lang.String r10 = r14.f4805j     // Catch: java.lang.Throwable -> L99
            com.amap.api.col.s.w2.j(r8, r10)     // Catch: java.lang.Throwable -> L99
            goto Lbc
        Lbb:
            r9 = 0
        Lbc:
            r10 = 200(0xc8, float:2.8E-43)
            if (r5 != r10) goto L18d
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r5.<init>()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            com.amap.api.col.s.x2$f r10 = r14.s     // Catch: java.lang.Throwable -> L175 java.io.IOException -> L17b java.net.SocketTimeoutException -> L181 org.apache.http.conn.ConnectTimeoutException -> L187
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L175 java.io.IOException -> L17b java.net.SocketTimeoutException -> L181 org.apache.http.conn.ConnectTimeoutException -> L187
            r10.f4829b = r11     // Catch: java.lang.Throwable -> L175 java.io.IOException -> L17b java.net.SocketTimeoutException -> L181 org.apache.http.conn.ConnectTimeoutException -> L187
            java.io.InputStream r10 = r15.getInputStream()     // Catch: java.lang.Throwable -> L175 java.io.IOException -> L17b java.net.SocketTimeoutException -> L181 org.apache.http.conn.ConnectTimeoutException -> L187
            java.io.PushbackInputStream r11 = new java.io.PushbackInputStream     // Catch: java.lang.Throwable -> L165 java.io.IOException -> L169 java.net.SocketTimeoutException -> L16d org.apache.http.conn.ConnectTimeoutException -> L171
            r11.<init>(r10, r6)     // Catch: java.lang.Throwable -> L165 java.io.IOException -> L169 java.net.SocketTimeoutException -> L16d org.apache.http.conn.ConnectTimeoutException -> L171
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r11.read(r6)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r11.unread(r6)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r12 = r6[r8]     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r13 = 31
            if (r12 != r13) goto L105
            r6 = r6[r7]     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r7 = -117(0xffffffffffffff8b, float:NaN)
            if (r6 != r7) goto L105
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r6.<init>(r11)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r3 = r6
            goto L106
        Lf1:
            r15 = move-exception
            r4 = r3
        Lf3:
            r3 = r5
            goto L20a
        Lf6:
            r15 = move-exception
            r4 = r3
        Lf8:
            r3 = r5
            goto L1da
        Lfb:
            r15 = move-exception
            r2 = r3
        Lfd:
            r3 = r5
            goto L205
        L100:
            r15 = move-exception
            r2 = r3
        L102:
            r3 = r5
            goto L209
        L105:
            r3 = r11
        L106:
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
        L10a:
            int r7 = r3.read(r6)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r12 = -1
            if (r7 == r12) goto L115
            r5.write(r6, r8, r7)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            goto L10a
        L115:
            com.amap.api.col.s.x2$f r6 = r14.s     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r6.h()     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            com.amap.api.col.s.g2.k()     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            com.amap.api.col.s.b3 r6 = new com.amap.api.col.s.b3     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r6.<init>()     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            byte[] r7 = r5.toByteArray()     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r6.a = r7     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r6.f4315b = r4     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            java.lang.String r4 = r14.f4802g     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r6.f4316c = r4     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r6.f4317d = r2     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r6.f4318e = r9     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            java.net.URL r15 = r15.getURL()     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            com.amap.api.col.s.w2.i(r15, r6)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            com.amap.api.col.s.x2$f r15 = r14.s     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            byte[] r4 = r6.a     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            int r4 = r4.length     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            long r7 = (long) r4     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r15.c(r7)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf6 java.net.SocketTimeoutException -> Lfb org.apache.http.conn.ConnectTimeoutException -> L100
            r5.close()     // Catch: java.lang.Throwable -> L146
            goto L14a
        L146:
            r15 = move-exception
            com.amap.api.col.s.d2.e(r15, r1, r0)
        L14a:
            if (r10 == 0) goto L154
            r10.close()     // Catch: java.lang.Throwable -> L150
            goto L154
        L150:
            r15 = move-exception
            com.amap.api.col.s.d2.e(r15, r1, r0)
        L154:
            r11.close()     // Catch: java.lang.Throwable -> L158
            goto L15c
        L158:
            r15 = move-exception
            com.amap.api.col.s.d2.e(r15, r1, r0)
        L15c:
            r3.close()     // Catch: java.lang.Throwable -> L160
            goto L164
        L160:
            r15 = move-exception
            com.amap.api.col.s.d2.e(r15, r1, r0)
        L164:
            return r6
        L165:
            r15 = move-exception
            r4 = r3
            r11 = r4
            goto Lf3
        L169:
            r15 = move-exception
            r4 = r3
            r11 = r4
            goto Lf8
        L16d:
            r15 = move-exception
            r2 = r3
            r11 = r2
            goto Lfd
        L171:
            r15 = move-exception
            r2 = r3
            r11 = r2
            goto L102
        L175:
            r15 = move-exception
            r4 = r3
            r10 = r4
            r11 = r10
            goto Lf3
        L17b:
            r15 = move-exception
            r4 = r3
            r10 = r4
            r11 = r10
            goto Lf8
        L181:
            r15 = move-exception
            r2 = r3
            r10 = r2
            r11 = r10
            goto Lfd
        L187:
            r15 = move-exception
            r2 = r3
            r10 = r2
            r11 = r10
            goto L102
        L18d:
            com.amap.api.col.s.bv r6 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r8 = "网络异常原因："
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r8 = r15.getResponseMessage()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r7.append(r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r8 = " 网络异常状态码："
            r7.append(r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r7.append(r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r8 = "  "
            r7.append(r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r7.append(r2)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r8 = " "
            r7.append(r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r8 = r14.f4802g     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r7.append(r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r8 = r14.f4802g     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r6.<init>(r7, r2, r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            java.lang.String r15 = r15.getResponseMessage()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r6.a(r15)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r6.a(r4)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            com.amap.api.col.s.x2$f r15 = r14.s     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r15.g(r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            com.amap.api.col.s.x2$f r15 = r14.s     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r4 = 10
            r15.b(r4)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            r6.h()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
            throw r6     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L37 java.net.SocketTimeoutException -> L3d org.apache.http.conn.ConnectTimeoutException -> L43
        L1da:
            boolean r5 = r15 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L201
            if (r5 == 0) goto L204
            com.amap.api.col.s.bv r5 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L201
            java.lang.String r6 = "IO 操作异常 - IOException"
            java.lang.String r7 = r14.f4802g     // Catch: java.lang.Throwable -> L201
            r5.<init>(r6, r2, r7)     // Catch: java.lang.Throwable -> L201
            java.lang.String r2 = r15.getMessage()     // Catch: java.lang.Throwable -> L201
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L201
            if (r2 != 0) goto L203
            java.lang.String r15 = r15.getMessage()     // Catch: java.lang.Throwable -> L201
            java.lang.String r2 = "thread interrupted"
            boolean r15 = r15.equals(r2)     // Catch: java.lang.Throwable -> L201
            if (r15 == 0) goto L203
            r5.j()     // Catch: java.lang.Throwable -> L201
            goto L203
        L201:
            r15 = move-exception
            goto L20a
        L203:
            throw r5     // Catch: java.lang.Throwable -> L201
        L204:
            throw r15     // Catch: java.lang.Throwable -> L201
        L205:
            throw r15     // Catch: java.lang.Throwable -> L206
        L206:
            r15 = move-exception
            r4 = r2
            goto L20a
        L209:
            throw r15     // Catch: java.lang.Throwable -> L206
        L20a:
            if (r3 == 0) goto L214
            r3.close()     // Catch: java.lang.Throwable -> L210
            goto L214
        L210:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L214:
            if (r10 == 0) goto L21e
            r10.close()     // Catch: java.lang.Throwable -> L21a
            goto L21e
        L21a:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L21e:
            if (r11 == 0) goto L228
            r11.close()     // Catch: java.lang.Throwable -> L224
            goto L228
        L224:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L228:
            if (r4 == 0) goto L232
            r4.close()     // Catch: java.lang.Throwable -> L22e
            goto L232
        L22e:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L232:
            throw r15
    }

    static /* synthetic */ java.lang.String e(com.amap.api.col.s.x2 r0) {
            java.lang.String r0 = r0.m
            return r0
    }

    private static java.lang.String f(java.lang.String r3, java.lang.String r4) {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g
            if (r0 == 0) goto L9
            java.lang.String r0 = com.amap.api.col.s.j1.d(r0)
            goto Lb
        L9:
            java.lang.String r0 = ""
        Lb:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = android.os.Build.MANUFACTURER
            r4 = 2
            r1[r4] = r3
            r3 = 3
            r1[r3] = r0
            java.lang.String r3 = "platform=Android&sdkversion=%s&product=%s&manufacture=%s&abitype=%s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            return r3
    }

    private static java.lang.String g(java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L8
            goto La7
        L8:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.amap.api.col.s.u2.f4729e
            if (r0 == 0) goto L13
            if (r10 == 0) goto L12
            r10.putAll(r0)
            goto L13
        L12:
            r10 = r0
        L13:
            if (r10 == 0) goto La7
            int r0 = r10.size()
            if (r0 > 0) goto L1d
            goto La7
        L1d:
            java.lang.String r0 = "?"
            int r1 = r9.indexOf(r0)
            if (r1 < 0) goto L74
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = r9.substring(r1)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L36:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L73
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L52
            java.lang.String r4 = ""
        L52:
            java.lang.String r6 = java.net.URLEncoder.encode(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = ".*[\\?\\&]"
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = "=.*"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            boolean r6 = r3.matches(r6)
            if (r6 != 0) goto L36
            r2.put(r5, r4)
            goto L36
        L73:
            r10 = r2
        L74:
            int r2 = r10.size()
            if (r2 != 0) goto L7b
            return r9
        L7b:
            java.lang.String r10 = h(r10)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r9)
            if (r1 < 0) goto L9b
            boolean r0 = r9.endsWith(r0)
            if (r0 != 0) goto L9e
            java.lang.String r0 = "&"
            boolean r9 = r9.endsWith(r0)
            if (r9 != 0) goto L9e
            r2.append(r0)
            goto L9e
        L9b:
            r2.append(r0)
        L9e:
            if (r10 == 0) goto La3
            r2.append(r10)
        La3:
            java.lang.String r9 = r2.toString()
        La7:
            return r9
    }

    static java.lang.String h(java.util.Map<java.lang.String, java.lang.String> r4) {
            if (r4 == 0) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L2b
            java.lang.String r1 = ""
        L2b:
            int r3 = r0.length()
            if (r3 <= 0) goto L36
            java.lang.String r3 = "&"
            r0.append(r3)
        L36:
            java.lang.String r2 = java.net.URLEncoder.encode(r2)
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.String r1 = java.net.URLEncoder.encode(r1)
            r0.append(r1)
            goto Lf
        L4a:
            java.lang.String r4 = r0.toString()
            return r4
        L4f:
            r4 = 0
            return r4
    }

    public static void i() {
            return
    }

    private void j(java.util.Map<java.lang.String, java.lang.String> r5, java.net.HttpURLConnection r6) {
            r4 = this;
            if (r5 == 0) goto L23
            java.util.Set r0 = r5.keySet()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r5.get(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L20
            r6.addRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L20
            goto La
        L20:
            r5 = move-exception
            goto L11c
        L23:
            java.util.HashMap<java.lang.String, java.lang.String> r5 = com.amap.api.col.s.u2.f4728d     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L47
            java.util.Set r5 = r5.keySet()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L20
        L2f:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L47
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L20
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.amap.api.col.s.u2.f4728d     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            r6.addRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> L20
            goto L2f
        L47:
            java.lang.String r5 = r4.l     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "/v3/iasdkauth"
            boolean r5 = r5.contains(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = ""
            if (r5 != 0) goto Lac
            java.lang.String r5 = r4.f4805j     // Catch: java.lang.Throwable -> L20
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L20
            if (r5 != 0) goto Lac
            java.lang.String r5 = r4.f4805j     // Catch: java.lang.Throwable -> L20
            boolean r5 = com.amap.api.col.s.y0.K(r5)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto Lac
            r5 = 1
            r4.n = r5     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r4.f4805j     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.y0$h r5 = com.amap.api.col.s.y0.O(r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "lct"
            long r2 = r5.a     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L20
            r6.addRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "lct-info"
            java.lang.String r5 = r5.f4890b     // Catch: java.lang.Throwable -> L20
            r6.addRequestProperty(r1, r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r4.f4805j     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = com.amap.api.col.s.y0.d(r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "aks"
            java.lang.String r5 = com.amap.api.col.s.y0.E(r5)     // Catch: java.lang.Throwable -> L20
            r6.addRequestProperty(r1, r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r4.f4805j     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.i1 r5 = com.amap.api.col.s.y0.x(r5)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto La0
            java.lang.String r5 = r4.f4805j     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.i1 r5 = com.amap.api.col.s.y0.x(r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.e()     // Catch: java.lang.Throwable -> L20
            goto La1
        La0:
            r5 = r0
        La1:
            java.lang.String r1 = "lct-args"
            java.lang.String r2 = r4.f4805j     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = f(r5, r2)     // Catch: java.lang.Throwable -> L20
            r6.addRequestProperty(r1, r5)     // Catch: java.lang.Throwable -> L20
        Lac:
            java.lang.String r5 = "csid"
            java.lang.String r1 = r4.f4802g     // Catch: java.lang.Throwable -> L20
            r6.addRequestProperty(r5, r1)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.x2$f r5 = r4.s     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.x2$c r5 = r5.f4830c     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.f4820e     // Catch: java.lang.Throwable -> L20
            boolean r5 = r4.l(r5)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L11b
            com.amap.api.col.s.x2$f r5 = r4.s     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.x2$c r1 = r5.f4830c     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.f4818c     // Catch: java.lang.Throwable -> L20
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto Lcc
            goto Le6
        Lcc:
            com.amap.api.col.s.x2$c r0 = r5.f4830c     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r0.f4818c     // Catch: java.lang.Throwable -> L20
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "YXBtX25ldHdvcmtf"
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L20
            byte[] r0 = com.amap.api.col.s.q2.a(r0, r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = com.amap.api.col.s.d1.f(r0)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.x2$c r5 = r5.f4830c     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.f4818c     // Catch: java.lang.Throwable -> L20
        Le6:
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L20
            if (r5 != 0) goto Lf1
            java.lang.String r5 = "sip"
            r6.addRequestProperty(r5, r0)     // Catch: java.lang.Throwable -> L20
        Lf1:
            boolean r5 = com.amap.api.col.s.y0.z     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L108
            com.amap.api.col.s.x2$c r5 = com.amap.api.col.s.y0.P()     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L108
            java.lang.String r0 = "nls"
            java.lang.String r1 = r5.b()     // Catch: java.lang.Throwable -> L20
            r6.addRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.x2$f r0 = r4.s     // Catch: java.lang.Throwable -> L20
            r0.f4832e = r5     // Catch: java.lang.Throwable -> L20
        L108:
            com.amap.api.col.s.x2$a r5 = com.amap.api.col.s.y0.L()     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L11b
            java.lang.String r0 = "nlf"
            java.lang.String r1 = r5.b()     // Catch: java.lang.Throwable -> L20
            r6.addRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.x2$f r6 = r4.s     // Catch: java.lang.Throwable -> L20
            r6.f4831d = r5     // Catch: java.lang.Throwable -> L20
        L11b:
            return
        L11c:
            java.lang.String r6 = "ht"
            java.lang.String r0 = "adh"
            com.amap.api.col.s.d2.e(r5, r6, r0)
            return
    }

    static /* synthetic */ boolean k(com.amap.api.col.s.x2 r0, java.lang.String r1) {
            boolean r0 = r0.l(r1)
            return r0
    }

    private boolean l(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.f4806k
            if (r0 != 0) goto L29
            java.lang.String r0 = r2.m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L20
            java.lang.String r0 = r2.m
            java.lang.String r1 = "rest"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L29
            java.lang.String r0 = r2.m
            java.lang.String r1 = "apilocate"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L29
        L20:
            boolean r3 = r(r3)
            if (r3 == 0) goto L27
            goto L29
        L27:
            r3 = 0
            return r3
        L29:
            r3 = 1
            return r3
    }

    private boolean m(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "lct"
            java.lang.String r1 = "#"
            r2 = 0
            java.lang.String r3 = "sc"
            java.lang.Object r3 = r7.get(r3)     // Catch: java.lang.Throwable -> L5c
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5c
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L5c
            if (r4 <= 0) goto L5c
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5c
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L5c
            boolean r4 = r3.contains(r1)     // Catch: java.lang.Throwable -> L5c
            r5 = 1
            if (r4 != 0) goto L29
            goto L3a
        L29:
            java.lang.String[] r1 = r3.split(r1)     // Catch: java.lang.Throwable -> L5c
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5c
            if (r3 <= r5) goto L5c
            java.lang.String r3 = "1"
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L5c
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L5c
        L3a:
            if (r8 == 0) goto L5b
            boolean r8 = r7.containsKey(r0)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L5a
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Throwable -> L5c
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L5a
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L5c
            if (r8 <= 0) goto L5a
            long r7 = com.amap.api.col.s.y0.a(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r6.f4805j     // Catch: java.lang.Throwable -> L5c
            boolean r2 = com.amap.api.col.s.y0.t(r0, r7)     // Catch: java.lang.Throwable -> L5c
        L5a:
            return r2
        L5b:
            return r5
        L5c:
            return r2
    }

    private com.amap.api.col.s.y2 n() {
            r5 = this;
            r0 = 0
            java.lang.ref.SoftReference<com.amap.api.col.s.y2> r1 = com.amap.api.col.s.x2.u     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto L1e
            goto Le
        Lc:
            r1 = move-exception
            goto L38
        Le:
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.y2 r2 = new com.amap.api.col.s.y2     // Catch: java.lang.Throwable -> Lc
            android.content.Context r3 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> Lc
            javax.net.ssl.SSLContext r4 = r5.f4797b     // Catch: java.lang.Throwable -> Lc
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.x2.u = r1     // Catch: java.lang.Throwable -> Lc
        L1e:
            java.lang.ref.SoftReference<javax.net.ssl.SSLContext> r1 = com.amap.api.col.s.x2.t     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L2b
            java.lang.ref.SoftReference<com.amap.api.col.s.y2> r1 = com.amap.api.col.s.x2.u     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.y2 r1 = (com.amap.api.col.s.y2) r1     // Catch: java.lang.Throwable -> Lc
            goto L2c
        L2b:
            r1 = r0
        L2c:
            if (r1 != 0) goto L37
            com.amap.api.col.s.y2 r1 = new com.amap.api.col.s.y2     // Catch: java.lang.Throwable -> Lc
            android.content.Context r2 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> Lc
            javax.net.ssl.SSLContext r3 = r5.f4797b     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
        L37:
            return r1
        L38:
            java.lang.String r2 = "ht"
            java.lang.String r3 = "gsf"
            com.amap.api.col.s.g2.o(r1, r2, r3)
            return r0
    }

    private static java.lang.String p(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3) {
            java.lang.String r0 = "#"
            java.lang.String r1 = "sc"
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L31
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L31
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L31
            if (r1 <= 0) goto L31
            r1 = 0
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L31
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L31
            boolean r2 = r3.contains(r0)     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L26
            return r3
        L26:
            java.lang.String[] r3 = r3.split(r0)     // Catch: java.lang.Throwable -> L31
            int r0 = r3.length     // Catch: java.lang.Throwable -> L31
            r2 = 1
            if (r0 <= r2) goto L31
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L31
            return r3
        L31:
            java.lang.String r3 = ""
            return r3
    }

    static /* synthetic */ boolean q(com.amap.api.col.s.x2 r0) {
            boolean r0 = r0.o
            return r0
    }

    private static boolean r(java.lang.String r1) {
            java.lang.String r0 = "rest"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L13
            java.lang.String r0 = "apilocate"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    private void s(com.amap.api.col.s.dz r3) throws com.amap.api.col.s.bv {
            r2 = this;
            com.amap.api.col.s.x2$d r0 = new com.amap.api.col.s.x2$d
            r1 = 0
            r0.<init>(r1)
            r2.f4804i = r0
            boolean r0 = r3.F()
            r2.o = r0
            java.net.Proxy r0 = r3.v()
            r2.f4798c = r0
            com.amap.api.col.s.u2$a r0 = r3.A()
            r2.f4803h = r0
            boolean r0 = r3.x()
            r2.f4806k = r0
            java.lang.String r0 = r3.G()
            r2.f4805j = r0
            com.amap.api.col.s.e1 r0 = com.amap.api.col.s.e1.a()
            boolean r1 = r3.z()
            boolean r0 = r0.i(r1)
            r2.a = r0
            com.amap.api.col.s.dz$b r0 = r3.B()
            boolean r0 = r0.b()
            if (r0 == 0) goto L43
            java.lang.String r0 = r3.t()
            goto L47
        L43:
            java.lang.String r0 = r3.s()
        L47:
            r2.l = r0
            java.lang.String r1 = r2.f4805j
            java.lang.String r0 = com.amap.api.col.s.w2.a(r0, r1)
            r2.l = r0
            java.lang.String r0 = r3.r()
            r2.m = r0
            java.lang.String r0 = "loc"
            java.lang.String r1 = r2.f4805j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9a
            java.lang.String r0 = r3.s()
            java.lang.String r3 = r3.t()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L7c
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L7b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L7b
            java.lang.String r0 = r1.getHost()     // Catch: java.lang.Exception -> L7b
            r2.q = r0     // Catch: java.lang.Exception -> L7b
            goto L7c
        L7b:
        L7c:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L9a
            java.lang.String r0 = r2.m     // Catch: java.lang.Exception -> L9a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L9a
            if (r0 != 0) goto L8f
            java.lang.String r3 = r2.m     // Catch: java.lang.Exception -> L9a
            r2.p = r3     // Catch: java.lang.Exception -> L9a
            goto L9a
        L8f:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L9a
            r0.<init>(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r0.getHost()     // Catch: java.lang.Exception -> L9a
            r2.p = r3     // Catch: java.lang.Exception -> L9a
        L9a:
            return
    }

    final com.amap.api.col.s.b3 d(com.amap.api.col.s.dz r13) throws com.amap.api.col.s.bv {
            r12 = this;
            java.lang.String r0 = "未知的错误"
            java.lang.String r1 = "mgr"
            java.lang.String r2 = "ht"
            java.lang.String r3 = "IO 操作异常 - IOException"
            r4 = 6
            r5 = 2
            r6 = 7
            r7 = 9
            r8 = 0
            r12.s(r13)     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            java.lang.String r9 = r12.l     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            java.util.Map r10 = r13.o()     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            java.lang.String r9 = g(r9, r10)     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            r12.l = r9     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            java.lang.String r10 = r12.f4805j     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            com.amap.api.col.s.b3 r9 = com.amap.api.col.s.w2.o(r9, r10)     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            if (r9 == 0) goto L2b
            com.amap.api.col.s.x2$f r13 = r12.s
            r13.i()
            return r9
        L2b:
            r9 = 0
            com.amap.api.col.s.x2$b r13 = r12.b(r13, r9)     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            java.net.HttpURLConnection r8 = r13.a     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            com.amap.api.col.s.x2$f r9 = r12.s     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            r9.f4829b = r10     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            r8.connect()     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            com.amap.api.col.s.x2$f r9 = r12.s     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            r9.a()     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            com.amap.api.col.s.b3 r13 = r12.c(r13)     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            com.amap.api.col.s.x2$f r9 = r12.s     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            r9.e(r13)     // Catch: com.amap.api.col.s.bv -> L59 java.net.SocketTimeoutException -> L5b java.net.SocketException -> L5d org.apache.http.conn.ConnectTimeoutException -> L5f javax.net.ssl.SSLException -> L62 java.net.ConnectException -> L65 java.lang.Throwable -> L68 java.io.IOException -> L8e java.io.InterruptedIOException -> L99 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Le4
            r8.disconnect()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r0 = move-exception
            com.amap.api.col.s.d2.e(r0, r2, r1)
        L53:
            com.amap.api.col.s.x2$f r0 = r12.s
            r0.i()
            return r13
        L59:
            r13 = move-exception
            goto L76
        L5b:
            r13 = move-exception
            goto Lab
        L5d:
            r13 = move-exception
            goto Lc1
        L5f:
            r13 = move-exception
            goto Lf3
        L62:
            r13 = move-exception
            goto L107
        L65:
            r13 = move-exception
            goto L11c
        L68:
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r13.b(r7)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        L73:
            r13 = move-exception
            goto L132
        L76:
            boolean r0 = r13.i()     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L8d
            int r0 = r13.g()     // Catch: java.lang.Throwable -> L73
            r3 = 10
            if (r0 == r3) goto L8d
            com.amap.api.col.s.x2$f r0 = r12.s     // Catch: java.lang.Throwable -> L73
            int r3 = r13.f()     // Catch: java.lang.Throwable -> L73
            r0.b(r3)     // Catch: java.lang.Throwable -> L73
        L8d:
            throw r13     // Catch: java.lang.Throwable -> L73
        L8e:
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r13.b(r6)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            r13.<init>(r3)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        L99:
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r3 = 7101(0x1bbd, float:9.95E-42)
            r13.g(r3)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r13.b(r6)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        Lab:
            com.amap.api.col.s.x2$f r0 = r12.s     // Catch: java.lang.Throwable -> L73
            int r13 = a(r13)     // Catch: java.lang.Throwable -> L73
            r0.g(r13)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r13.b(r5)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "socket 连接超时 - SocketTimeoutException"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        Lc1:
            com.amap.api.col.s.x2$f r0 = r12.s     // Catch: java.lang.Throwable -> L73
            int r13 = a(r13)     // Catch: java.lang.Throwable -> L73
            r0.g(r13)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r13.b(r4)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "socket 连接异常 - SocketException"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        Ld7:
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r13.b(r7)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "未知主机 - UnKnowHostException"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        Le4:
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r0 = 8
            r13.b(r0)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "url异常 - MalformedURLException"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        Lf3:
            com.amap.api.col.s.x2$f r0 = r12.s     // Catch: java.lang.Throwable -> L73
            int r13 = a(r13)     // Catch: java.lang.Throwable -> L73
            r0.g(r13)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r13.b(r5)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            r13.<init>(r3)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        L107:
            com.amap.api.col.s.x2$f r0 = r12.s     // Catch: java.lang.Throwable -> L73
            int r13 = a(r13)     // Catch: java.lang.Throwable -> L73
            r0.g(r13)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r0 = 4
            r13.b(r0)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            r13.<init>(r3)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        L11c:
            com.amap.api.col.s.x2$f r0 = r12.s     // Catch: java.lang.Throwable -> L73
            int r13 = a(r13)     // Catch: java.lang.Throwable -> L73
            r0.g(r13)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.x2$f r13 = r12.s     // Catch: java.lang.Throwable -> L73
            r13.b(r4)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.bv r13 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "http连接失败 - ConnectionException"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        L132:
            if (r8 == 0) goto L13c
            r8.disconnect()     // Catch: java.lang.Throwable -> L138
            goto L13c
        L138:
            r0 = move-exception
            com.amap.api.col.s.d2.e(r0, r2, r1)
        L13c:
            com.amap.api.col.s.x2$f r0 = r12.s
            r0.i()
            throw r13
    }

    final com.amap.api.col.s.b3 o(com.amap.api.col.s.dz r14) throws com.amap.api.col.s.bv {
            r13 = this;
            java.lang.String r0 = "未知的错误"
            java.lang.String r1 = "IO 操作异常 - IOException"
            java.lang.String r2 = "mPt"
            java.lang.String r3 = "ht"
            r4 = 6
            r5 = 2
            r6 = 7
            r7 = 0
            r13.s(r14)     // Catch: java.lang.Throwable -> Ldc com.amap.api.col.s.bv -> Lde java.net.SocketTimeoutException -> Le0 java.net.SocketException -> Le2 org.apache.http.conn.ConnectTimeoutException -> Le4 java.net.ConnectException -> Le7 javax.net.ssl.SSLException -> Lea java.io.IOException -> L11b java.io.InterruptedIOException -> L126 java.net.UnknownHostException -> L164 java.net.MalformedURLException -> L172
            java.lang.String r8 = r13.l     // Catch: java.lang.Throwable -> Ldc com.amap.api.col.s.bv -> Lde java.net.SocketTimeoutException -> Le0 java.net.SocketException -> Le2 org.apache.http.conn.ConnectTimeoutException -> Le4 java.net.ConnectException -> Le7 javax.net.ssl.SSLException -> Lea java.io.IOException -> L11b java.io.InterruptedIOException -> L126 java.net.UnknownHostException -> L164 java.net.MalformedURLException -> L172
            java.lang.String r9 = r13.f4805j     // Catch: java.lang.Throwable -> Ldc com.amap.api.col.s.bv -> Lde java.net.SocketTimeoutException -> Le0 java.net.SocketException -> Le2 org.apache.http.conn.ConnectTimeoutException -> Le4 java.net.ConnectException -> Le7 javax.net.ssl.SSLException -> Lea java.io.IOException -> L11b java.io.InterruptedIOException -> L126 java.net.UnknownHostException -> L164 java.net.MalformedURLException -> L172
            com.amap.api.col.s.b3 r8 = com.amap.api.col.s.w2.o(r8, r9)     // Catch: java.lang.Throwable -> Ldc com.amap.api.col.s.bv -> Lde java.net.SocketTimeoutException -> Le0 java.net.SocketException -> Le2 org.apache.http.conn.ConnectTimeoutException -> Le4 java.net.ConnectException -> Le7 javax.net.ssl.SSLException -> Lea java.io.IOException -> L11b java.io.InterruptedIOException -> L126 java.net.UnknownHostException -> L164 java.net.MalformedURLException -> L172
            if (r8 == 0) goto L1f
            com.amap.api.col.s.x2$f r14 = r13.s
            r14.i()
            return r8
        L1f:
            r8 = 1
            com.amap.api.col.s.x2$b r8 = r13.b(r14, r8)     // Catch: java.lang.Throwable -> Ldc com.amap.api.col.s.bv -> Lde java.net.SocketTimeoutException -> Le0 java.net.SocketException -> Le2 org.apache.http.conn.ConnectTimeoutException -> Le4 java.net.ConnectException -> Le7 javax.net.ssl.SSLException -> Lea java.io.IOException -> L11b java.io.InterruptedIOException -> L126 java.net.UnknownHostException -> L164 java.net.MalformedURLException -> L172
            java.net.HttpURLConnection r9 = r8.a     // Catch: java.lang.Throwable -> Ldc com.amap.api.col.s.bv -> Lde java.net.SocketTimeoutException -> Le0 java.net.SocketException -> Le2 org.apache.http.conn.ConnectTimeoutException -> Le4 java.net.ConnectException -> Le7 javax.net.ssl.SSLException -> Lea java.io.IOException -> L11b java.io.InterruptedIOException -> L126 java.net.UnknownHostException -> L164 java.net.MalformedURLException -> L172
            com.amap.api.col.s.x2$f r10 = r13.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            r10.f4829b = r11     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            r9.connect()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            com.amap.api.col.s.x2$f r10 = r13.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            r10.a()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            byte[] r10 = r14.q()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            if (r10 == 0) goto L65
            int r11 = r10.length     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            if (r11 != 0) goto L82
            goto L65
        L40:
            r14 = move-exception
            r7 = r9
            goto Led
        L44:
            r14 = move-exception
            r7 = r9
            goto L100
        L48:
            r7 = r9
            goto L11b
        L4b:
            r14 = move-exception
            r7 = r9
            goto L138
        L4f:
            r14 = move-exception
            r7 = r9
            goto L14e
        L53:
            r7 = r9
            goto L164
        L56:
            r7 = r9
            goto L172
        L59:
            r14 = move-exception
            r7 = r9
            goto L181
        L5d:
            r14 = move-exception
            r7 = r9
            goto L195
        L61:
            r14 = move-exception
            r7 = r9
            goto L1ab
        L65:
            java.util.Map r14 = r14.o()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            java.util.HashMap<java.lang.String, java.lang.String> r11 = com.amap.api.col.s.u2.f4729e     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            if (r11 == 0) goto L74
            if (r14 == 0) goto L73
            r14.putAll(r11)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            goto L74
        L73:
            r14 = r11
        L74:
            java.lang.String r14 = h(r14)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            boolean r11 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            if (r11 != 0) goto L82
            byte[] r10 = com.amap.api.col.s.j1.o(r14)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
        L82:
            if (r10 == 0) goto Lc3
            int r14 = r10.length     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            if (r14 <= 0) goto Lc3
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Laf
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Laf
            r14.f4829b = r11     // Catch: java.lang.Throwable -> Laf
            java.io.OutputStream r14 = r9.getOutputStream()     // Catch: java.lang.Throwable -> Laf
            java.io.DataOutputStream r11 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> Lab
            r11.<init>(r14)     // Catch: java.lang.Throwable -> Lab
            r11.write(r10)     // Catch: java.lang.Throwable -> La9
            r11.close()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            if (r14 == 0) goto La3
            r14.close()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
        La3:
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            r14.f()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            goto Lc3
        La9:
            r7 = move-exception
            goto Lb3
        Lab:
            r8 = move-exception
            r11 = r7
            r7 = r8
            goto Lb3
        Laf:
            r14 = move-exception
            r11 = r7
            r7 = r14
            r14 = r11
        Lb3:
            if (r11 == 0) goto Lb8
            r11.close()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
        Lb8:
            if (r14 == 0) goto Lbd
            r14.close()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
        Lbd:
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            r14.f()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            throw r7     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
        Lc3:
            com.amap.api.col.s.b3 r14 = r13.c(r8)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            com.amap.api.col.s.x2$f r7 = r13.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            r7.e(r14)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.s.bv -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Lda
            r9.disconnect()     // Catch: java.lang.Throwable -> Ld0
            goto Ld4
        Ld0:
            r0 = move-exception
            com.amap.api.col.s.d2.e(r0, r3, r2)
        Ld4:
            com.amap.api.col.s.x2$f r0 = r13.s
            r0.i()
            return r14
        Lda:
            r7 = r9
            goto L126
        Ldc:
            r14 = move-exception
            goto Led
        Lde:
            r14 = move-exception
            goto L100
        Le0:
            r14 = move-exception
            goto L138
        Le2:
            r14 = move-exception
            goto L14e
        Le4:
            r14 = move-exception
            goto L181
        Le7:
            r14 = move-exception
            goto L195
        Lea:
            r14 = move-exception
            goto L1ab
        Led:
            com.amap.api.col.s.d2.e(r14, r3, r2)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r1 = 9
            r14.b(r1)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        Lfd:
            r14 = move-exception
            goto L1c0
        L100:
            boolean r0 = r14.i()     // Catch: java.lang.Throwable -> Lfd
            if (r0 != 0) goto L117
            int r0 = r14.g()     // Catch: java.lang.Throwable -> Lfd
            r1 = 10
            if (r0 == r1) goto L117
            com.amap.api.col.s.x2$f r0 = r13.s     // Catch: java.lang.Throwable -> Lfd
            int r1 = r14.g()     // Catch: java.lang.Throwable -> Lfd
            r0.b(r1)     // Catch: java.lang.Throwable -> Lfd
        L117:
            com.amap.api.col.s.d2.e(r14, r3, r2)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L11b:
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r14.b(r6)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            r14.<init>(r1)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L126:
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r1 = 7101(0x1bbd, float:9.95E-42)
            r14.g(r1)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r14.b(r6)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L138:
            com.amap.api.col.s.x2$f r0 = r13.s     // Catch: java.lang.Throwable -> Lfd
            int r14 = a(r14)     // Catch: java.lang.Throwable -> Lfd
            r0.g(r14)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r14.b(r5)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = "socket 连接超时 - SocketTimeoutException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L14e:
            com.amap.api.col.s.x2$f r0 = r13.s     // Catch: java.lang.Throwable -> Lfd
            int r14 = a(r14)     // Catch: java.lang.Throwable -> Lfd
            r0.g(r14)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r14.b(r4)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = "socket 连接异常 - SocketException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L164:
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r0 = 5
            r14.b(r0)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = "未知主机 - UnKnowHostException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L172:
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r0 = 8
            r14.b(r0)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = "url异常 - MalformedURLException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L181:
            com.amap.api.col.s.x2$f r0 = r13.s     // Catch: java.lang.Throwable -> Lfd
            int r14 = a(r14)     // Catch: java.lang.Throwable -> Lfd
            r0.g(r14)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r14.b(r5)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            r14.<init>(r1)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L195:
            com.amap.api.col.s.x2$f r0 = r13.s     // Catch: java.lang.Throwable -> Lfd
            int r14 = a(r14)     // Catch: java.lang.Throwable -> Lfd
            r0.g(r14)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r14.b(r4)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = "http连接失败 - ConnectionException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L1ab:
            com.amap.api.col.s.x2$f r0 = r13.s     // Catch: java.lang.Throwable -> Lfd
            int r14 = a(r14)     // Catch: java.lang.Throwable -> Lfd
            r0.g(r14)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.x2$f r14 = r13.s     // Catch: java.lang.Throwable -> Lfd
            r0 = 4
            r14.b(r0)     // Catch: java.lang.Throwable -> Lfd
            com.amap.api.col.s.bv r14 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> Lfd
            r14.<init>(r1)     // Catch: java.lang.Throwable -> Lfd
            throw r14     // Catch: java.lang.Throwable -> Lfd
        L1c0:
            if (r7 == 0) goto L1ca
            r7.disconnect()     // Catch: java.lang.Throwable -> L1c6
            goto L1ca
        L1c6:
            r0 = move-exception
            com.amap.api.col.s.d2.e(r0, r3, r2)
        L1ca:
            com.amap.api.col.s.x2$f r0 = r13.s
            r0.i()
            throw r14
    }
}
