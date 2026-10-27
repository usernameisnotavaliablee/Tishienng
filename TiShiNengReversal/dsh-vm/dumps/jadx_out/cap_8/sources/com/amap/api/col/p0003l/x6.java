package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class x6 {
    private static java.lang.ref.SoftReference<javax.net.ssl.SSLContext> t;
    private static java.lang.ref.SoftReference<com.amap.api.col.p0003l.y6> u;
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private javax.net.ssl.SSLContext f4160b;

    /* renamed from: c, reason: collision with root package name */
    private java.net.Proxy f4161c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f4162d;

    /* renamed from: e, reason: collision with root package name */
    private long f4163e;

    /* renamed from: f, reason: collision with root package name */
    private long f4164f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f4165g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.3l.s6.a f4166h;

    /* renamed from: i, reason: collision with root package name */
    private com.amap.api.col.3l.x6.d f4167i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f4168j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4169k;
    private java.lang.String l;
    private java.lang.String m;
    private boolean n;
    private boolean o;
    private java.lang.String p;
    private java.lang.String q;
    private java.lang.String r;
    private com.amap.api.col.3l.x6.f s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements java.lang.Cloneable, java.lang.Comparable {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f4170b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f4171c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f4172d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f4173e;

        /* renamed from: f, reason: collision with root package name */
        public int f4174f;

        /* renamed from: g, reason: collision with root package name */
        public int f4175g;

        /* renamed from: h, reason: collision with root package name */
        public int f4176h;

        /* renamed from: i, reason: collision with root package name */
        public long f4177i;

        /* renamed from: j, reason: collision with root package name */
        public volatile java.util.concurrent.atomic.AtomicInteger f4178j;

        public a(com.amap.api.col.3l.x6.c r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r3.f4181c
                r2.f4170b = r0
                java.lang.String r0 = r3.f4183e
                r2.f4171c = r0
                java.lang.String r0 = r3.f4182d
                r2.f4173e = r0
                int r0 = r3.m
                r2.f4174f = r0
                int r0 = r3.n
                r2.f4175g = r0
                com.amap.api.col.3l.if$b r0 = r3.f4180b
                int r0 = r0.a()
                r2.f4176h = r0
                java.lang.String r0 = r3.a
                r2.f4172d = r0
                long r0 = r3.f4184f
                r2.f4177i = r0
                java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
                r0 = 1
                r3.<init>(r0)
                r2.f4178j = r3
                int r3 = r2.f4174f
                r0 = 10
                if (r3 != r0) goto L38
                r3 = 0
                r2.a = r3
            L38:
                return
        }

        public final com.amap.api.col.3l.x6.a a() {
                r1 = this;
                java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
                com.amap.api.col.3l.x6$a r0 = (com.amap.api.col.3l.x6.a) r0     // Catch: java.lang.CloneNotSupportedException -> L7
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
                int r2 = r5.f4174f     // Catch: java.lang.Exception -> L121
                r1.append(r2)     // Catch: java.lang.Exception -> L121
                r1.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L121
                java.lang.String r2 = r5.f4173e     // Catch: java.lang.Exception -> L121
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L121
                java.lang.String r3 = "-#"
                if (r2 != 0) goto L32
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r5.f4173e     // Catch: java.lang.Exception -> L121
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
                int r1 = r5.f4176h     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                java.util.concurrent.atomic.AtomicInteger r1 = r5.f4178j     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L121
                java.lang.String r2 = r5.f4170b     // Catch: java.lang.Exception -> L121
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L121
                if (r2 != 0) goto L86
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r5.f4170b     // Catch: java.lang.Exception -> L121
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
                int r2 = r5.f4174f     // Catch: java.lang.Exception -> L121
                r4 = 1
                if (r2 != r4) goto Laf
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = r5.f4172d     // Catch: java.lang.Exception -> L121
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
                int r2 = r5.f4174f     // Catch: java.lang.Exception -> L121
                if (r2 != r4) goto Ld7
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r2.<init>()     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                long r3 = r5.f4177i     // Catch: java.lang.Exception -> L121
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
                java.lang.String r1 = r5.f4171c     // Catch: java.lang.Exception -> L121
                r2.append(r1)     // Catch: java.lang.Exception -> L121
                r2.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L121
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
                r1.<init>()     // Catch: java.lang.Exception -> L121
                r1.append(r0)     // Catch: java.lang.Exception -> L121
                int r0 = r5.f4175g     // Catch: java.lang.Exception -> L121
                r1.append(r0)     // Catch: java.lang.Exception -> L121
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L121
                byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L121
                java.lang.String r1 = "YXBtX25ldHdvcmtf"
                byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L121
                byte[] r0 = com.amap.api.col.p0003l.o6.a(r0, r1)     // Catch: java.lang.Exception -> L121
                java.lang.String r0 = com.amap.api.col.p0003l.j4.f(r0)     // Catch: java.lang.Exception -> L121
                com.amap.api.col.p0003l.x6.s()     // Catch: java.lang.Exception -> L121
                return r0
            L121:
                r0 = 0
                return r0
        }

        public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.col.3l.x6$a r0 = r1.a()
                return r0
        }

        @Override // java.lang.Comparable
        public final int compareTo(java.lang.Object r2) {
                r1 = this;
                int r0 = r1.a
                com.amap.api.col.3l.x6$a r2 = (com.amap.api.col.3l.x6.a) r2
                int r2 = r2.a
                int r0 = r0 - r2
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        public java.net.HttpURLConnection a;

        /* renamed from: b, reason: collision with root package name */
        public int f4179b;

        public b(java.net.HttpURLConnection r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                int r1 = r0.f4179b
                r0.f4179b = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c implements java.lang.Cloneable {
        public java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public com.amap.api.col.p0003l.Cif.b f4180b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f4181c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f4182d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f4183e;

        /* renamed from: f, reason: collision with root package name */
        public long f4184f;

        /* renamed from: g, reason: collision with root package name */
        public long f4185g;

        /* renamed from: h, reason: collision with root package name */
        public long f4186h;

        /* renamed from: i, reason: collision with root package name */
        public long f4187i;

        /* renamed from: j, reason: collision with root package name */
        public long f4188j;

        /* renamed from: k, reason: collision with root package name */
        public java.lang.String f4189k;
        public java.lang.String l;
        public int m;
        public int n;

        public c() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.a = r0
                com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.a
                r2.f4180b = r1
                r2.f4181c = r0
                r2.f4182d = r0
                r2.f4183e = r0
                r0 = 0
                r2.f4184f = r0
                r2.f4185g = r0
                r2.f4186h = r0
                r2.f4187i = r0
                r2.f4188j = r0
                java.lang.String r0 = "-"
                r2.f4189k = r0
                r2.l = r0
                r0 = 0
                r2.m = r0
                r2.n = r0
                return
        }

        protected final com.amap.api.col.3l.x6.c a() {
                r1 = this;
                java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
                com.amap.api.col.3l.x6$c r0 = (com.amap.api.col.3l.x6.c) r0     // Catch: java.lang.CloneNotSupportedException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        protected final java.lang.String b() {
                r5 = this;
                java.lang.String r0 = r5.f4181c
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                java.lang.String r1 = "-#"
                java.lang.String r2 = "#"
                if (r0 != 0) goto L1e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r5.f4181c
                r0.append(r3)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                goto L1f
            L1e:
                r0 = r1
            L1f:
                java.lang.String r3 = r5.f4182d
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L3c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = r5.f4182d
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
                com.amap.api.col.3l.if$b r0 = r5.f4180b
                int r0 = r0.a()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                long r3 = r5.f4186h
                r1.append(r3)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                long r3 = r5.f4188j
                r1.append(r3)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                long r2 = r5.f4184f
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                byte[] r0 = r0.getBytes()
                java.lang.String r1 = "YXBtX25ldHdvcmtf"
                byte[] r1 = r1.getBytes()
                byte[] r0 = com.amap.api.col.p0003l.o6.a(r0, r1)
                java.lang.String r0 = com.amap.api.col.p0003l.j4.f(r0)
                com.amap.api.col.p0003l.x6.s()
                return r0
        }

        protected final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.col.3l.x6$c r0 = r1.a()
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
                com.amap.api.col.3l.if$b r2 = r4.f4180b
                r0.append(r2)
                java.lang.String r2 = ", serverIp='"
                r0.append(r2)
                java.lang.String r2 = r4.f4181c
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", path='"
                r0.append(r2)
                java.lang.String r2 = r4.f4182d
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", hostname='"
                r0.append(r2)
                java.lang.String r2 = r4.f4183e
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", totalTime="
                r0.append(r2)
                long r2 = r4.f4184f
                r0.append(r2)
                java.lang.String r2 = ", DNSTime="
                r0.append(r2)
                long r2 = r4.f4185g
                r0.append(r2)
                java.lang.String r2 = ", connectionTime="
                r0.append(r2)
                long r2 = r4.f4186h
                r0.append(r2)
                java.lang.String r2 = ", writeTime="
                r0.append(r2)
                long r2 = r4.f4187i
                r0.append(r2)
                java.lang.String r2 = ", readTime="
                r0.append(r2)
                long r2 = r4.f4188j
                r0.append(r2)
                java.lang.String r2 = ", serverTime='"
                r0.append(r2)
                java.lang.String r2 = r4.f4189k
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
        private java.util.Vector<com.amap.api.col.3l.x6.e> a;

        /* renamed from: b, reason: collision with root package name */
        private volatile com.amap.api.col.3l.x6.e f4190b;

        private d() {
                r2 = this;
                r2.<init>()
                java.util.Vector r0 = new java.util.Vector
                r0.<init>()
                r2.a = r0
                com.amap.api.col.3l.x6$e r0 = new com.amap.api.col.3l.x6$e
                r1 = 0
                r0.<init>(r1)
                r2.f4190b = r0
                return
        }

        /* synthetic */ d(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.amap.api.col.3l.x6.e a(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 == 0) goto L9
                com.amap.api.col.3l.x6$e r5 = r4.f4190b
                return r5
            L9:
                r0 = 0
                r1 = 0
            Lb:
                java.util.Vector<com.amap.api.col.3l.x6$e> r2 = r4.a
                int r2 = r2.size()
                if (r1 >= r2) goto L2b
                java.util.Vector<com.amap.api.col.3l.x6$e> r2 = r4.a
                java.lang.Object r2 = r2.get(r1)
                com.amap.api.col.3l.x6$e r2 = (com.amap.api.col.3l.x6.e) r2
                if (r2 == 0) goto L28
                java.lang.String r3 = r2.a()
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L28
                return r2
            L28:
                int r1 = r1 + 1
                goto Lb
            L2b:
                com.amap.api.col.3l.x6$e r1 = new com.amap.api.col.3l.x6$e
                r1.<init>(r0)
                r1.c(r5)
                java.util.Vector<com.amap.api.col.3l.x6$e> r5 = r4.a
                r5.add(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e implements javax.net.ssl.HostnameVerifier {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f4191b;

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
                java.lang.String r0 = r1.f4191b
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
                r0.f4191b = r1
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
                java.lang.String r1 = r2.f4191b
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L22
                java.lang.String r3 = r2.f4191b
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
        long f4192b;

        /* renamed from: c, reason: collision with root package name */
        com.amap.api.col.3l.x6.c f4193c;

        /* renamed from: d, reason: collision with root package name */
        com.amap.api.col.3l.x6.a f4194d;

        /* renamed from: e, reason: collision with root package name */
        com.amap.api.col.3l.x6.c f4195e;

        /* renamed from: f, reason: collision with root package name */
        java.lang.String f4196f;

        /* renamed from: g, reason: collision with root package name */
        java.net.URL f4197g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.x6 f4198h;

        f(com.amap.api.col.p0003l.x6 r3) {
                r2 = this;
                r2.f4198h = r3
                r2.<init>()
                r0 = 0
                r2.a = r0
                r2.f4192b = r0
                com.amap.api.col.3l.x6$c r3 = new com.amap.api.col.3l.x6$c
                r3.<init>()
                r2.f4193c = r3
                return
        }

        public final void a() {
                r5 = this;
                com.amap.api.col.3l.x6$c r0 = r5.f4193c
                long r1 = android.os.SystemClock.elapsedRealtime()
                long r3 = r5.f4192b
                long r1 = r1 - r3
                r0.f4186h = r1
                return
        }

        public final void b(int r6) {
                r5 = this;
                java.lang.String r0 = "----errorcode-----"
                java.lang.String r1 = java.lang.String.valueOf(r6)
                r0.concat(r1)
                com.amap.api.col.p0003l.x6.s()
                com.amap.api.col.3l.x6$c r0 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L9a
                long r3 = r5.a     // Catch: java.lang.Throwable -> L9a
                long r1 = r1 - r3
                r0.f4184f = r1     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.x6$c r0 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                r0.m = r6     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.if$b r6 = r0.f4180b     // Catch: java.lang.Throwable -> L9a
                boolean r6 = r6.e()     // Catch: java.lang.Throwable -> L9a
                r0 = 0
                if (r6 == 0) goto L2b
                com.amap.api.col.3l.x6$c r6 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                java.lang.String r6 = r6.f4183e     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.p0003l.g4.u(r0, r6)     // Catch: java.lang.Throwable -> L9a
            L2b:
                com.amap.api.col.3l.x6 r6 = r5.f4198h     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.x6$c r1 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                java.lang.String r1 = r1.f4183e     // Catch: java.lang.Throwable -> L9a
                boolean r6 = com.amap.api.col.p0003l.x6.o(r6, r1)     // Catch: java.lang.Throwable -> L9a
                if (r6 == 0) goto L80
                com.amap.api.col.3l.x6 r1 = r5.f4198h     // Catch: java.lang.Throwable -> L9a
                boolean r1 = com.amap.api.col.p0003l.x6.u(r1)     // Catch: java.lang.Throwable -> L9a
                if (r1 == 0) goto L58
                com.amap.api.col.3l.x6 r1 = r5.f4198h     // Catch: java.lang.Throwable -> L9a
                java.lang.String r1 = com.amap.api.col.p0003l.x6.d(r1)     // Catch: java.lang.Throwable -> L9a
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L9a
                if (r1 != 0) goto L58
                com.amap.api.col.3l.x6$c r1 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.if$b r1 = r1.f4180b     // Catch: java.lang.Throwable -> L9a
                boolean r1 = r1.b()     // Catch: java.lang.Throwable -> L9a
                if (r1 == 0) goto L58
                com.amap.api.col.p0003l.g4.L()     // Catch: java.lang.Throwable -> L9a
            L58:
                com.amap.api.col.3l.x6$c r1 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.if$b r1 = r1.f4180b     // Catch: java.lang.Throwable -> L9a
                boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L9a
                if (r1 == 0) goto L71
                com.amap.api.col.3l.x6$c r1 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.if$b r1 = r1.f4180b     // Catch: java.lang.Throwable -> L9a
                boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.x6$c r2 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = r2.f4183e     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.p0003l.g4.u(r1, r2)     // Catch: java.lang.Throwable -> L9a
            L71:
                com.amap.api.col.3l.x6$c r1 = r5.f4195e     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.p0003l.g4.J(r1)     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.x6$a r1 = r5.f4194d     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.p0003l.g4.t(r0, r1)     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.x6$c r0 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.p0003l.g4.E(r0)     // Catch: java.lang.Throwable -> L9a
            L80:
                java.net.URL r0 = r5.f4197g     // Catch: java.lang.Throwable -> L9a
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.x6$c r1 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.if$b r1 = r1.f4180b     // Catch: java.lang.Throwable -> L9a
                boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L9a
                r2 = 1
                com.amap.api.col.p0003l.g4.s(r0, r1, r2, r6)     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.3l.x6$c r6 = r5.f4193c     // Catch: java.lang.Throwable -> L9a
                r6.toString()     // Catch: java.lang.Throwable -> L9a
                com.amap.api.col.p0003l.x6.s()     // Catch: java.lang.Throwable -> L9a
            L9a:
                return
        }

        public final void c(long r3) {
                r2 = this;
                java.text.DecimalFormat r0 = new java.text.DecimalFormat
                java.lang.String r1 = "0.00"
                r0.<init>(r1)
                com.amap.api.col.3l.x6$c r1 = r2.f4193c
                float r3 = (float) r3
                r4 = 1149239296(0x44800000, float:1024.0)
                float r3 = r3 / r4
                double r3 = (double) r3
                java.lang.String r3 = r0.format(r3)
                r1.l = r3
                return
        }

        public final void d(com.amap.api.col.p0003l.Cif r4, java.net.URL r5) {
                r3 = this;
                r3.f4197g = r5
                com.amap.api.col.3l.x6$c r0 = r3.f4193c
                java.lang.String r1 = r5.getPath()
                r0.f4182d = r1
                com.amap.api.col.3l.x6$c r0 = r3.f4193c
                java.lang.String r5 = r5.getHost()
                r0.f4183e = r5
                com.amap.api.col.3l.x6 r5 = r3.f4198h
                java.lang.String r5 = com.amap.api.col.p0003l.x6.d(r5)
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L46
                com.amap.api.col.3l.if$b r5 = r4.getDegradeType()
                boolean r5 = r5.b()
                if (r5 == 0) goto L46
                com.amap.api.col.3l.x6$c r5 = r3.f4193c
                java.lang.String r0 = r5.f4183e
                java.lang.String r1 = "["
                java.lang.String r2 = ""
                java.lang.String r0 = r0.replace(r1, r2)
                java.lang.String r1 = "]"
                java.lang.String r0 = r0.replace(r1, r2)
                r5.f4181c = r0
                com.amap.api.col.3l.x6$c r5 = r3.f4193c
                com.amap.api.col.3l.x6 r0 = r3.f4198h
                java.lang.String r0 = com.amap.api.col.p0003l.x6.d(r0)
                r5.f4183e = r0
            L46:
                com.amap.api.col.3l.if$b r5 = r4.getDegradeType()
                boolean r5 = r5.b()
                if (r5 == 0) goto L57
                com.amap.api.col.3l.x6$c r5 = r3.f4193c
                java.lang.String r5 = r5.f4183e
                r4.setNon_degrade_final_Host(r5)
            L57:
                com.amap.api.col.3l.if$b r5 = r4.getDegradeType()
                boolean r5 = r5.d()
                if (r5 == 0) goto L67
                java.lang.String r4 = r4.getNon_degrade_final_Host()
                r3.f4196f = r4
            L67:
                return
        }

        public final void e(com.amap.api.col.p0003l.a7 r9) {
                r8 = this;
                com.amap.api.col.3l.x6$c r0 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L8c
                long r3 = r8.a     // Catch: java.lang.Throwable -> L8c
                long r1 = r1 - r3
                r0.f4184f = r1     // Catch: java.lang.Throwable -> L8c
                if (r9 == 0) goto L17
                com.amap.api.col.3l.x6$c r0 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.3l.if$b r0 = r0.f4180b     // Catch: java.lang.Throwable -> L8c
                boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L8c
                r9.f2964f = r0     // Catch: java.lang.Throwable -> L8c
            L17:
                com.amap.api.col.3l.x6$c r9 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.3l.if$b r9 = r9.f4180b     // Catch: java.lang.Throwable -> L8c
                boolean r9 = r9.b()     // Catch: java.lang.Throwable -> L8c
                r0 = 0
                if (r9 == 0) goto L31
                com.amap.api.col.3l.x6$c r9 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                long r1 = r9.f4184f     // Catch: java.lang.Throwable -> L8c
                r3 = 10000(0x2710, double:4.9407E-320)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L31
                java.lang.String r9 = r9.f4183e     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.p0003l.g4.u(r0, r9)     // Catch: java.lang.Throwable -> L8c
            L31:
                com.amap.api.col.3l.x6$c r9 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.3l.if$b r9 = r9.f4180b     // Catch: java.lang.Throwable -> L8c
                boolean r9 = r9.d()     // Catch: java.lang.Throwable -> L8c
                if (r9 == 0) goto L40
                java.lang.String r9 = r8.f4196f     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.p0003l.g4.u(r0, r9)     // Catch: java.lang.Throwable -> L8c
            L40:
                com.amap.api.col.3l.x6 r9 = r8.f4198h     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.3l.x6$c r1 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                java.lang.String r1 = r1.f4183e     // Catch: java.lang.Throwable -> L8c
                boolean r9 = com.amap.api.col.p0003l.x6.o(r9, r1)     // Catch: java.lang.Throwable -> L8c
                if (r9 == 0) goto L73
                com.amap.api.col.3l.x6$c r1 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.p0003l.g4.J(r1)     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.3l.x6$a r1 = r8.f4194d     // Catch: java.lang.Throwable -> L8c
                r2 = 1
                com.amap.api.col.p0003l.g4.t(r2, r1)     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.3l.x6$c r1 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                long r3 = r1.f4184f     // Catch: java.lang.Throwable -> L8c
                int r5 = com.amap.api.col.p0003l.g4.s     // Catch: java.lang.Throwable -> L8c
                long r5 = (long) r5     // Catch: java.lang.Throwable -> L8c
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L73
                com.amap.api.col.3l.x6$c r1 = r1.a()     // Catch: java.lang.Throwable -> L8c
                if (r1 == 0) goto L73
                r1.m = r2     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.p0003l.g4.E(r1)     // Catch: java.lang.Throwable -> L8c
                r1.toString()     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.p0003l.x6.s()     // Catch: java.lang.Throwable -> L8c
            L73:
                java.net.URL r1 = r8.f4197g     // Catch: java.lang.Throwable -> L8c
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.3l.x6$c r2 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.3l.if$b r2 = r2.f4180b     // Catch: java.lang.Throwable -> L8c
                boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.p0003l.g4.s(r1, r2, r0, r9)     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.3l.x6$c r9 = r8.f4193c     // Catch: java.lang.Throwable -> L8c
                r9.toString()     // Catch: java.lang.Throwable -> L8c
                com.amap.api.col.p0003l.x6.s()     // Catch: java.lang.Throwable -> L8c
            L8c:
                return
        }

        public final void f() {
                r5 = this;
                com.amap.api.col.3l.x6$c r0 = r5.f4193c
                long r1 = android.os.SystemClock.elapsedRealtime()
                long r3 = r5.f4192b
                long r1 = r1 - r3
                r0.f4187i = r1
                return
        }

        public final void g(int r2) {
                r1 = this;
                com.amap.api.col.3l.x6$c r0 = r1.f4193c
                r0.n = r2
                return
        }

        public final void h() {
                r5 = this;
                com.amap.api.col.3l.x6$c r0 = r5.f4193c
                long r1 = android.os.SystemClock.elapsedRealtime()
                long r3 = r5.f4192b
                long r1 = r1 - r3
                r0.f4188j = r1
                return
        }

        public final void i() {
                r6 = this;
                com.amap.api.col.3l.x6$c r0 = r6.f4193c
                com.amap.api.col.3l.x6$c r0 = r0.a()
                com.amap.api.col.3l.x6$c r1 = r6.f4193c
                long r1 = r1.f4184f
                int r3 = com.amap.api.col.p0003l.g4.s
                long r3 = (long) r3
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L14
                r1 = 1
                r0.m = r1
            L14:
                com.amap.api.col.p0003l.g4.o(r0)
                return
        }
    }

    static {
            return
    }

    x6() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f4162d = r0
            r1 = -1
            r3.f4163e = r1
            r1 = 0
            r3.f4164f = r1
            java.lang.String r1 = ""
            r3.f4168j = r1
            r3.n = r0
            r3.o = r0
            r3.p = r1
            r3.q = r1
            r3.r = r1
            com.amap.api.col.3l.x6$f r0 = new com.amap.api.col.3l.x6$f
            r0.<init>(r3)
            r3.s = r0
            com.amap.api.col.p0003l.g4.O()
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "-"
            java.lang.String r0 = r0.replaceAll(r2, r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L3b
            r3.f4165g = r0     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r0 = move-exception
            java.lang.String r1 = "ht"
            java.lang.String r2 = "ic"
            com.amap.api.col.p0003l.r5.e(r0, r1, r2)
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

    private com.amap.api.col.3l.x6.b b(com.amap.api.col.p0003l.Cif r17, boolean r18, boolean r19) throws java.io.IOException, com.amap.api.col.p0003l.fk {
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "TLS"
            com.amap.api.col.3l.x6$f r3 = r1.s
            com.amap.api.col.3l.if$b r4 = r2.getDegradeType()
            com.amap.api.col.3l.x6$c r5 = r3.f4193c
            com.amap.api.col.3l.x6 r6 = r3.f4198h
            java.lang.String r6 = r6.f4165g
            r5.a = r6
            r5.f4180b = r4
            long r4 = android.os.SystemClock.elapsedRealtime()
            r3.a = r4
            java.util.Map r3 = r2.getRequestHead()
            if (r3 != 0) goto L27
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L27:
            com.amap.api.col.3l.x6$d r4 = r1.f4167i
            java.lang.String r5 = r1.m
            com.amap.api.col.3l.x6$e r4 = r4.a(r5)
            int r5 = com.amap.api.col.p0003l.s6.a
            java.lang.String r6 = r1.l
            android.net.Uri r7 = android.net.Uri.parse(r6)
            java.lang.String r8 = r7.getHost()
            java.lang.String r9 = ""
            r10 = 0
            r11 = 1
            if (r5 == r11) goto L55
            r12 = 2
            if (r5 == r12) goto L47
            r5 = r9
        L45:
            r12 = 1
            goto L58
        L47:
            java.util.HashMap<java.lang.String, java.lang.String> r5 = com.amap.api.col.p0003l.s6.f3974c
            if (r5 == 0) goto L53
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
        L51:
            r12 = 0
            goto L58
        L53:
            r5 = r9
            goto L51
        L55:
            java.lang.String r5 = com.amap.api.col.p0003l.s6.f3973b
            goto L45
        L58:
            boolean r13 = android.text.TextUtils.isEmpty(r5)
            if (r13 != 0) goto L83
            r2.setHostToIP(r10)
            android.net.Uri$Builder r6 = r7.buildUpon()
            android.net.Uri$Builder r6 = r6.encodedAuthority(r5)
            android.net.Uri r6 = r6.build()
            java.lang.String r6 = r6.toString()
            if (r12 == 0) goto L7a
            java.lang.String r7 = "targetHost"
            r3.put(r7, r8)
            r1.r = r8
        L7a:
            if (r12 == 0) goto L83
            boolean r7 = r1.a
            if (r7 == 0) goto L83
            r4.b(r5)
        L83:
            r1.l = r6
            java.net.URL r5 = new java.net.URL
            java.lang.String r6 = r1.l
            r5.<init>(r6)
            com.amap.api.col.3l.x6$f r6 = r1.s
            r6.d(r2, r5)
            java.lang.String r5 = r5.getHost()
            boolean r5 = y(r5)
            if (r5 == 0) goto L1ad
            boolean r5 = r2.isHostToIP()
            if (r5 == 0) goto L1ad
            com.amap.api.col.3l.if$b r5 = r2.getDegradeType()
            com.amap.api.col.3l.x6$f r6 = r1.s
            com.amap.api.col.3l.x6$c r6 = r6.f4193c
            java.lang.String r6 = r6.f4183e
            boolean r7 = r1.v(r6)
            if (r7 == 0) goto L1ad
            boolean r7 = r5.b()
            if (r7 == 0) goto Lbc
            boolean r7 = com.amap.api.col.p0003l.g4.u
            if (r7 == 0) goto Lbc
            goto Lc8
        Lbc:
            boolean r5 = r5.c()
            if (r5 == 0) goto L1ad
            boolean r5 = com.amap.api.col.p0003l.g4.W(r6)
            if (r5 == 0) goto L1ad
        Lc8:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> Lf5
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf5
            r5.f4192b = r6     // Catch: java.lang.Throwable -> Lf5
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> Lf5
            com.amap.api.col.3l.x6$c r5 = r5.f4193c     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r5 = r5.f4183e     // Catch: java.lang.Throwable -> Lf5
            java.net.InetAddress[] r5 = java.net.InetAddress.getAllByName(r5)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r6 = "]"
            java.lang.String r7 = "["
            if (r5 == 0) goto L15a
            int r8 = r5.length     // Catch: java.lang.Throwable -> Lf5
            if (r8 <= 0) goto L15a
            r8 = r5[r10]     // Catch: java.lang.Throwable -> Lf5
            if (r8 == 0) goto L15a
            boolean r8 = com.amap.api.col.p0003l.g4.v()     // Catch: java.lang.Throwable -> Lf5
            if (r8 == 0) goto Lf8
            boolean r8 = com.amap.api.col.p0003l.g4.K()     // Catch: java.lang.Throwable -> Lf5
            if (r8 == 0) goto Lf8
            r8 = 1
            goto Lf9
        Lf5:
            goto L1ad
        Lf8:
            r8 = 0
        Lf9:
            java.lang.String r12 = "---canUseIpv6---"
            java.lang.String r13 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lf5
            r12.concat(r13)     // Catch: java.lang.Throwable -> Lf5
            if (r8 == 0) goto L127
            r8 = 0
        L105:
            int r12 = r5.length     // Catch: java.lang.Throwable -> Lf5
            if (r8 >= r12) goto L139
            r12 = r5[r8]     // Catch: java.lang.Throwable -> Lf5
            boolean r12 = r12 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> Lf5
            if (r12 == 0) goto L124
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf5
            r12.<init>(r7)     // Catch: java.lang.Throwable -> Lf5
            r8 = r5[r8]     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r8 = r8.getHostAddress()     // Catch: java.lang.Throwable -> Lf5
            r12.append(r8)     // Catch: java.lang.Throwable -> Lf5
            r12.append(r6)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r8 = r12.toString()     // Catch: java.lang.Throwable -> Lf5
            goto L13a
        L124:
            int r8 = r8 + 1
            goto L105
        L127:
            r8 = 0
        L128:
            int r12 = r5.length     // Catch: java.lang.Throwable -> Lf5
            if (r8 >= r12) goto L139
            r12 = r5[r8]     // Catch: java.lang.Throwable -> Lf5
            boolean r13 = r12 instanceof java.net.Inet4Address     // Catch: java.lang.Throwable -> Lf5
            if (r13 == 0) goto L136
            java.lang.String r8 = r12.getHostAddress()     // Catch: java.lang.Throwable -> Lf5
            goto L13a
        L136:
            int r8 = r8 + 1
            goto L128
        L139:
            r8 = r9
        L13a:
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lf5
            if (r12 == 0) goto L15b
            r5 = r5[r10]     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r8 = r5.getHostAddress()     // Catch: java.lang.Throwable -> Lf5
            boolean r5 = r5 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> Lf5
            if (r5 == 0) goto L15b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf5
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Lf5
            r5.append(r8)     // Catch: java.lang.Throwable -> Lf5
            r5.append(r6)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> Lf5
            goto L15b
        L15a:
            r8 = r9
        L15b:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r12 = "---onDNSEnd---ip="
            java.lang.String r13 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lf5
            r12.concat(r13)     // Catch: java.lang.Throwable -> Lf5
            com.amap.api.col.3l.x6$c r12 = r5.f4193c     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = r8.replace(r7, r9)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r6 = r7.replace(r6, r9)     // Catch: java.lang.Throwable -> Lf5
            r12.f4181c = r6     // Catch: java.lang.Throwable -> Lf5
            com.amap.api.col.3l.x6$c r6 = r5.f4193c     // Catch: java.lang.Throwable -> Lf5
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf5
            long r14 = r5.f4192b     // Catch: java.lang.Throwable -> Lf5
            long r12 = r12 - r14
            r6.f4185g = r12     // Catch: java.lang.Throwable -> Lf5
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lf5
            if (r5 != 0) goto L1ad
            java.lang.String r5 = r1.l     // Catch: java.lang.Throwable -> Lf5
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r6 = r5.getHost()     // Catch: java.lang.Throwable -> Lf5
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch: java.lang.Throwable -> Lf5
            android.net.Uri$Builder r5 = r5.encodedAuthority(r8)     // Catch: java.lang.Throwable -> Lf5
            android.net.Uri r5 = r5.build()     // Catch: java.lang.Throwable -> Lf5
            r1.m = r6     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = "host"
            r3.put(r7, r6)     // Catch: java.lang.Throwable -> Lf5
            boolean r7 = r1.a     // Catch: java.lang.Throwable -> Lf5
            if (r7 == 0) goto L1a7
            r4.c(r6)     // Catch: java.lang.Throwable -> Lf5
        L1a7:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lf5
            r1.l = r5     // Catch: java.lang.Throwable -> Lf5
        L1ad:
            boolean r5 = r1.a
            if (r5 == 0) goto L1b9
            java.lang.String r5 = r1.l
            java.lang.String r5 = com.amap.api.col.p0003l.k4.b(r5)
            r1.l = r5
        L1b9:
            com.amap.api.col.3l.if$b r5 = r2.getDegradeType()
            java.util.Objects.toString(r5)
            java.net.URL r5 = new java.net.URL
            java.lang.String r6 = r1.l
            r5.<init>(r6)
            com.amap.api.col.3l.s6$a r6 = r1.f4166h
            r7 = 0
            if (r6 == 0) goto L1d1
            java.net.URLConnection r6 = r6.a()
            goto L1d2
        L1d1:
            r6 = r7
        L1d2:
            if (r6 != 0) goto L1e1
            java.net.Proxy r6 = r1.f4161c
            if (r6 == 0) goto L1dd
            java.net.URLConnection r6 = r5.openConnection(r6)
            goto L1e1
        L1dd:
            java.net.URLConnection r6 = r5.openConnection()
        L1e1:
            boolean r5 = r1.a
            if (r5 == 0) goto L249
            java.lang.ref.SoftReference<javax.net.ssl.SSLContext> r5 = com.amap.api.col.p0003l.x6.t     // Catch: java.lang.Throwable -> L1f0
            if (r5 == 0) goto L1f2
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L1f0
            if (r5 != 0) goto L1fd
            goto L1f2
        L1f0:
            goto L208
        L1f2:
            java.lang.ref.SoftReference r5 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L1f0
            javax.net.ssl.SSLContext r8 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.lang.Throwable -> L1f0
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L1f0
            com.amap.api.col.p0003l.x6.t = r5     // Catch: java.lang.Throwable -> L1f0
        L1fd:
            java.lang.ref.SoftReference<javax.net.ssl.SSLContext> r5 = com.amap.api.col.p0003l.x6.t     // Catch: java.lang.Throwable -> L1f0
            if (r5 == 0) goto L208
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L1f0
            javax.net.ssl.SSLContext r5 = (javax.net.ssl.SSLContext) r5     // Catch: java.lang.Throwable -> L1f0
            goto L209
        L208:
            r5 = r7
        L209:
            if (r5 != 0) goto L212
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.lang.Throwable -> L210
            goto L212
        L210:
            r0 = move-exception
            goto L218
        L212:
            r5.init(r7, r7, r7)     // Catch: java.lang.Throwable -> L210
            r1.f4160b = r5     // Catch: java.lang.Throwable -> L210
            goto L21f
        L218:
            java.lang.String r5 = "ht"
            java.lang.String r7 = "ne"
            com.amap.api.col.p0003l.r5.e(r0, r5, r7)
        L21f:
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6
            boolean r0 = com.amap.api.col.3l.g4.g.a
            if (r0 == 0) goto L23c
            com.amap.api.col.3l.y6 r0 = r1.w()
            if (r0 == 0) goto L232
            r6.setSSLSocketFactory(r0)
            r0.b()
            goto L245
        L232:
            javax.net.ssl.SSLContext r0 = r1.f4160b
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            r6.setSSLSocketFactory(r0)
            goto L245
        L23c:
            javax.net.ssl.SSLContext r0 = r1.f4160b
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            r6.setSSLSocketFactory(r0)
        L245:
            r6.setHostnameVerifier(r4)
            goto L24b
        L249:
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6
        L24b:
            java.lang.String r0 = android.os.Build.VERSION.SDK
            if (r0 == 0) goto L256
            java.lang.String r0 = "Connection"
            java.lang.String r4 = "close"
            r6.setRequestProperty(r0, r4)
        L256:
            int r0 = r2.getReal_max_timeout()
            long r4 = (long) r0
            com.amap.api.col.3l.x6$f r0 = r1.s
            com.amap.api.col.3l.x6$c r0 = r0.f4193c
            long r7 = r0.f4185g
            r12 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r12
            long r4 = r4 - r7
            int r0 = (int) r4
            r2 = r19
            r1.n(r3, r6, r2)
            r6.setConnectTimeout(r0)
            r6.setReadTimeout(r0)
            if (r18 == 0) goto L282
            java.lang.String r0 = "POST"
            r6.setRequestMethod(r0)
            r6.setUseCaches(r10)
            r6.setDoInput(r11)
            r6.setDoOutput(r11)
            goto L28a
        L282:
            java.lang.String r0 = "GET"
            r6.setRequestMethod(r0)
            r6.setDoInput(r11)
        L28a:
            com.amap.api.col.3l.x6$b r0 = new com.amap.api.col.3l.x6$b
            r0.<init>(r6)
            return r0
    }

    private com.amap.api.col.p0003l.a7 c(com.amap.api.col.3l.x6.b r17, boolean r18) throws com.amap.api.col.p0003l.fk, java.io.IOException {
            r16 = this;
            r1 = r16
            java.lang.String r2 = "par"
            java.lang.String r3 = "ht"
            java.lang.String r4 = ""
            r5 = 0
            com.amap.api.col.p0003l.w6.b()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r0 = r17
            java.net.HttpURLConnection r0 = r0.a     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.util.Map r6 = r0.getHeaderFields()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            int r7 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto Lc0
            java.lang.String r11 = "gsid"
            java.lang.Object r11 = r6.get(r11)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            if (r11 == 0) goto L4e
            int r12 = r11.size()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            if (r12 <= 0) goto L4e
            java.lang.Object r11 = r11.get(r10)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r4 = r11
            goto L4e
        L35:
            r0 = move-exception
            r4 = r0
            r6 = r5
            r12 = r6
            r13 = r12
            goto L215
        L3c:
            r0 = move-exception
            r6 = r5
            r12 = r6
            r13 = r12
            goto L1e4
        L42:
            r0 = move-exception
            r4 = r5
            r12 = r4
            r13 = r12
            goto L210
        L48:
            r0 = move-exception
            r4 = r5
            r12 = r4
            r13 = r12
            goto L214
        L4e:
            com.amap.api.col.3l.x6$f r11 = r1.s     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r12 = r(r6)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            com.amap.api.col.3l.x6$c r11 = r11.f4193c     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r11.f4189k = r12     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r11 = r1.f4168j     // Catch: java.lang.Throwable -> L72
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto Lc0
            boolean r11 = r1.n     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto L7c
            java.lang.String r11 = "sc"
            boolean r11 = r6.containsKey(r11)     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto L74
            boolean r11 = r1.p(r6, r10)     // Catch: java.lang.Throwable -> L72
            r12 = 1
            goto L81
        L72:
            goto Lc0
        L74:
            java.lang.String r11 = r1.f4168j     // Catch: java.lang.Throwable -> L72
            com.amap.api.col.p0003l.g4.Q(r11)     // Catch: java.lang.Throwable -> L72
            r11 = 0
            r12 = 0
            goto L81
        L7c:
            boolean r11 = r1.p(r6, r9)     // Catch: java.lang.Throwable -> L72
            r12 = 2
        L81:
            if (r11 == 0) goto Lb8
            java.lang.String r13 = r1.f4168j     // Catch: java.lang.Throwable -> L9e
            java.lang.String r14 = "loc"
            boolean r13 = r13.equals(r14)     // Catch: java.lang.Throwable -> L9e
            if (r13 == 0) goto Lad
            java.lang.String r13 = r1.r     // Catch: java.lang.Throwable -> L9e
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L9e
            if (r14 == 0) goto La0
            java.net.URL r13 = r0.getURL()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r13 = r13.getHost()     // Catch: java.lang.Throwable -> L9e
            goto La0
        L9e:
            goto Lc1
        La0:
            java.lang.String r14 = r1.f4168j     // Catch: java.lang.Throwable -> L9e
            if (r12 != r8) goto La6
            r12 = 1
            goto La7
        La6:
            r12 = 0
        La7:
            java.lang.String r15 = r1.m     // Catch: java.lang.Throwable -> L9e
            com.amap.api.col.p0003l.g4.r(r14, r12, r13, r13, r15)     // Catch: java.lang.Throwable -> L9e
            goto Lc1
        Lad:
            java.lang.String r13 = r1.f4168j     // Catch: java.lang.Throwable -> L9e
            if (r12 != r8) goto Lb3
            r12 = 1
            goto Lb4
        Lb3:
            r12 = 0
        Lb4:
            com.amap.api.col.p0003l.g4.F(r13, r12)     // Catch: java.lang.Throwable -> L9e
            goto Lc1
        Lb8:
            if (r12 != r9) goto Lc1
            java.lang.String r12 = r1.f4168j     // Catch: java.lang.Throwable -> L9e
            com.amap.api.col.p0003l.w6.j(r10, r12)     // Catch: java.lang.Throwable -> L9e
            goto Lc1
        Lc0:
            r11 = 0
        Lc1:
            r12 = 200(0xc8, float:2.8E-43)
            if (r7 != r12) goto L197
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r7.<init>()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            com.amap.api.col.3l.x6$f r12 = r1.s     // Catch: java.lang.Throwable -> L17e java.io.IOException -> L185 java.net.SocketTimeoutException -> L18b org.apache.http.conn.ConnectTimeoutException -> L191
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L17e java.io.IOException -> L185 java.net.SocketTimeoutException -> L18b org.apache.http.conn.ConnectTimeoutException -> L191
            r12.f4192b = r13     // Catch: java.lang.Throwable -> L17e java.io.IOException -> L185 java.net.SocketTimeoutException -> L18b org.apache.http.conn.ConnectTimeoutException -> L191
            java.io.InputStream r12 = r0.getInputStream()     // Catch: java.lang.Throwable -> L17e java.io.IOException -> L185 java.net.SocketTimeoutException -> L18b org.apache.http.conn.ConnectTimeoutException -> L191
            java.io.PushbackInputStream r13 = new java.io.PushbackInputStream     // Catch: java.lang.Throwable -> L16d java.io.IOException -> L172 java.net.SocketTimeoutException -> L176 org.apache.http.conn.ConnectTimeoutException -> L17a
            r13.<init>(r12, r8)     // Catch: java.lang.Throwable -> L16d java.io.IOException -> L172 java.net.SocketTimeoutException -> L176 org.apache.http.conn.ConnectTimeoutException -> L17a
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r13.read(r8)     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r13.unread(r8)     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r14 = r8[r10]     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r15 = 31
            if (r14 != r15) goto L10d
            r8 = r8[r9]     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r9 = -117(0xffffffffffffff8b, float:NaN)
            if (r8 != r9) goto L10d
            if (r18 != 0) goto L10d
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r8.<init>(r13)     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r5 = r8
            goto L10e
        Lf8:
            r0 = move-exception
            r4 = r0
            r6 = r5
        Lfb:
            r5 = r7
            goto L215
        Lfe:
            r0 = move-exception
            r6 = r5
        L100:
            r5 = r7
            goto L1e4
        L103:
            r0 = move-exception
            r4 = r5
        L105:
            r5 = r7
            goto L210
        L108:
            r0 = move-exception
            r4 = r5
        L10a:
            r5 = r7
            goto L214
        L10d:
            r5 = r13
        L10e:
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
        L112:
            int r9 = r5.read(r8)     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r14 = -1
            if (r9 == r14) goto L11d
            r7.write(r8, r10, r9)     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            goto L112
        L11d:
            com.amap.api.col.3l.x6$f r8 = r1.s     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r8.h()     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            com.amap.api.col.p0003l.w5.q()     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            com.amap.api.col.3l.a7 r8 = new com.amap.api.col.3l.a7     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r8.<init>()     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            byte[] r9 = r7.toByteArray()     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r8.a = r9     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r8.f2960b = r6     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            java.lang.String r6 = r1.f4165g     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r8.f2961c = r6     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r8.f2962d = r4     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r8.f2963e = r11     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            java.net.URL r0 = r0.getURL()     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            com.amap.api.col.p0003l.w6.i(r0, r8)     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            com.amap.api.col.3l.x6$f r0 = r1.s     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            byte[] r6 = r8.a     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            int r6 = r6.length     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            long r9 = (long) r6     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r0.c(r9)     // Catch: java.lang.Throwable -> Lf8 java.io.IOException -> Lfe java.net.SocketTimeoutException -> L103 org.apache.http.conn.ConnectTimeoutException -> L108
            r7.close()     // Catch: java.lang.Throwable -> L14e
            goto L152
        L14e:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        L152:
            if (r12 == 0) goto L15c
            r12.close()     // Catch: java.lang.Throwable -> L158
            goto L15c
        L158:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        L15c:
            r13.close()     // Catch: java.lang.Throwable -> L160
            goto L164
        L160:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        L164:
            r5.close()     // Catch: java.lang.Throwable -> L168
            goto L16c
        L168:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        L16c:
            return r8
        L16d:
            r0 = move-exception
            r4 = r0
            r6 = r5
            r13 = r6
            goto Lfb
        L172:
            r0 = move-exception
            r6 = r5
            r13 = r6
            goto L100
        L176:
            r0 = move-exception
            r4 = r5
            r13 = r4
            goto L105
        L17a:
            r0 = move-exception
            r4 = r5
            r13 = r4
            goto L10a
        L17e:
            r0 = move-exception
            r4 = r0
            r6 = r5
            r12 = r6
            r13 = r12
            goto Lfb
        L185:
            r0 = move-exception
            r6 = r5
            r12 = r6
            r13 = r12
            goto L100
        L18b:
            r0 = move-exception
            r4 = r5
            r12 = r4
            r13 = r12
            goto L105
        L191:
            r0 = move-exception
            r4 = r5
            r12 = r4
            r13 = r12
            goto L10a
        L197:
            com.amap.api.col.3l.fk r8 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r10 = "网络异常原因："
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r10 = r0.getResponseMessage()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r9.append(r10)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r10 = " 网络异常状态码："
            r9.append(r10)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r9.append(r7)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r10 = "  "
            r9.append(r10)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r9.append(r4)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r10 = " "
            r9.append(r10)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r10 = r1.f4165g     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r9.append(r10)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r10 = r1.f4165g     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r8.<init>(r9, r4, r10)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            java.lang.String r0 = r0.getResponseMessage()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r8.a(r0)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r8.a(r6)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            com.amap.api.col.3l.x6$f r0 = r1.s     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r0.g(r7)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            com.amap.api.col.3l.x6$f r0 = r1.s     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r6 = 10
            r0.b(r6)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            r8.h()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
            throw r8     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3c java.net.SocketTimeoutException -> L42 org.apache.http.conn.ConnectTimeoutException -> L48
        L1e4:
            boolean r7 = r0 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L20b
            if (r7 == 0) goto L20f
            com.amap.api.col.3l.fk r7 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L20b
            java.lang.String r8 = "IO 操作异常 - IOException"
            java.lang.String r9 = r1.f4165g     // Catch: java.lang.Throwable -> L20b
            r7.<init>(r8, r4, r9)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L20b
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L20b
            if (r4 != 0) goto L20e
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L20b
            java.lang.String r4 = "thread interrupted"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L20b
            if (r0 == 0) goto L20e
            r7.j()     // Catch: java.lang.Throwable -> L20b
            goto L20e
        L20b:
            r0 = move-exception
        L20c:
            r4 = r0
            goto L215
        L20e:
            throw r7     // Catch: java.lang.Throwable -> L20b
        L20f:
            throw r0     // Catch: java.lang.Throwable -> L20b
        L210:
            throw r0     // Catch: java.lang.Throwable -> L211
        L211:
            r0 = move-exception
            r6 = r4
            goto L20c
        L214:
            throw r0     // Catch: java.lang.Throwable -> L211
        L215:
            if (r5 == 0) goto L21f
            r5.close()     // Catch: java.lang.Throwable -> L21b
            goto L21f
        L21b:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        L21f:
            if (r12 == 0) goto L229
            r12.close()     // Catch: java.lang.Throwable -> L225
            goto L229
        L225:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        L229:
            if (r13 == 0) goto L233
            r13.close()     // Catch: java.lang.Throwable -> L22f
            goto L233
        L22f:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        L233:
            if (r6 == 0) goto L23d
            r6.close()     // Catch: java.lang.Throwable -> L239
            goto L23d
        L239:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        L23d:
            throw r4
    }

    static /* synthetic */ java.lang.String d(com.amap.api.col.p0003l.x6 r0) {
            java.lang.String r0 = r0.m
            return r0
    }

    private static java.lang.String e(java.lang.String r7) {
            m.b r0 = m.a.a()
            if (r0 != 0) goto L7
            goto L5b
        L7:
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Exception -> Le
            r2.<init>(r7)     // Catch: java.lang.Exception -> Le
            goto L10
        Le:
            r2 = r1
        L10:
            if (r2 != 0) goto L13
            goto L5b
        L13:
            java.lang.String r3 = r2.getHost()
            java.lang.String r4 = r2.getPath()
            java.lang.String r0 = r0.a(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L26
            goto L5b
        L26:
            java.lang.String r3 = ":"
            java.lang.String[] r3 = r0.split(r3)
            int r4 = r3.length
            r5 = 2
            r6 = 0
            if (r4 != r5) goto L3e
            r0 = 1
            r0 = r3[r0]     // Catch: java.lang.Exception -> L39
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            r3 = r3[r6]
            r6 = r0
            r0 = r3
        L3e:
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L58
            java.lang.String r4 = r2.getProtocol()     // Catch: java.lang.Exception -> L58
            if (r6 == 0) goto L47
            goto L4b
        L47:
            int r6 = r2.getPort()     // Catch: java.lang.Exception -> L58
        L4b:
            java.lang.String r2 = r2.getFile()     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L58
            r3.<init>(r4, r0, r6, r2)     // Catch: java.lang.Exception -> L58
            r1 = r3
            goto L59
        L58:
        L59:
            if (r1 != 0) goto L5c
        L5b:
            return r7
        L5c:
            java.lang.String r7 = r1.toString()
            return r7
    }

    private static java.lang.String f(java.lang.String r3, java.lang.String r4) {
            android.content.Context r0 = com.amap.api.col.p0003l.g4.f3380g
            if (r0 == 0) goto L9
            java.lang.String r0 = com.amap.api.col.p0003l.q4.d(r0)
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
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.amap.api.col.p0003l.s6.f3976e
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
            java.lang.String r10 = i(r10)
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

    private static java.lang.String h(java.net.HttpURLConnection r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            java.util.Map r2 = r2.getHeaderFields()     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto Lc
            return r0
        Lc:
            java.lang.String r1 = "gsid"
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L24
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L24
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L24
            if (r1 <= 0) goto L24
            r1 = 0
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L24
            return r2
        L24:
            return r0
    }

    static java.lang.String i(java.util.Map<java.lang.String, java.lang.String> r4) {
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

    private void n(java.util.Map<java.lang.String, java.lang.String> r4, java.net.HttpURLConnection r5, boolean r6) {
            r3 = this;
            if (r4 == 0) goto L23
            java.util.Set r0 = r4.keySet()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L20
            r5.addRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L20
            goto La
        L20:
            r4 = move-exception
            goto L11e
        L23:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = com.amap.api.col.p0003l.s6.f3975d     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L47
            java.util.Set r4 = r4.keySet()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L20
        L2f:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L20
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.amap.api.col.p0003l.s6.f3975d     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            r5.addRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> L20
            goto L2f
        L47:
            java.lang.String r4 = ""
            if (r6 == 0) goto Lae
            java.lang.String r6 = r3.l     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "/v3/iasdkauth"
            boolean r6 = r6.contains(r0)     // Catch: java.lang.Throwable -> L20
            if (r6 != 0) goto Lae
            java.lang.String r6 = r3.f4168j     // Catch: java.lang.Throwable -> L20
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L20
            if (r6 != 0) goto Lae
            java.lang.String r6 = r3.f4168j     // Catch: java.lang.Throwable -> L20
            boolean r6 = com.amap.api.col.p0003l.g4.N(r6)     // Catch: java.lang.Throwable -> L20
            if (r6 == 0) goto Lae
            r6 = 1
            r3.n = r6     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r3.f4168j     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.g4$h r6 = com.amap.api.col.p0003l.g4.R(r6)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "lct"
            long r1 = r6.a     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L20
            r5.addRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "lct-info"
            java.lang.String r6 = r6.f3408b     // Catch: java.lang.Throwable -> L20
            r5.addRequestProperty(r0, r6)     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r3.f4168j     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = com.amap.api.col.p0003l.g4.f(r6)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "aks"
            java.lang.String r6 = com.amap.api.col.p0003l.g4.H(r6)     // Catch: java.lang.Throwable -> L20
            r5.addRequestProperty(r0, r6)     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r3.f4168j     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.p4 r6 = com.amap.api.col.p0003l.g4.A(r6)     // Catch: java.lang.Throwable -> L20
            if (r6 == 0) goto La2
            java.lang.String r6 = r3.f4168j     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.p4 r6 = com.amap.api.col.p0003l.g4.A(r6)     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r6.e()     // Catch: java.lang.Throwable -> L20
            goto La3
        La2:
            r6 = r4
        La3:
            java.lang.String r0 = "lct-args"
            java.lang.String r1 = r3.f4168j     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = f(r6, r1)     // Catch: java.lang.Throwable -> L20
            r5.addRequestProperty(r0, r6)     // Catch: java.lang.Throwable -> L20
        Lae:
            java.lang.String r6 = "csid"
            java.lang.String r0 = r3.f4165g     // Catch: java.lang.Throwable -> L20
            r5.addRequestProperty(r6, r0)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.x6$f r6 = r3.s     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.x6$c r6 = r6.f4193c     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r6.f4183e     // Catch: java.lang.Throwable -> L20
            boolean r6 = r3.v(r6)     // Catch: java.lang.Throwable -> L20
            if (r6 == 0) goto L11d
            com.amap.api.col.3l.x6$f r6 = r3.s     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.x6$c r0 = r6.f4193c     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r0.f4181c     // Catch: java.lang.Throwable -> L20
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lce
            goto Le8
        Lce:
            com.amap.api.col.3l.x6$c r4 = r6.f4193c     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = r4.f4181c     // Catch: java.lang.Throwable -> L20
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "YXBtX25ldHdvcmtf"
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L20
            byte[] r4 = com.amap.api.col.p0003l.o6.a(r4, r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = com.amap.api.col.p0003l.j4.f(r4)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.x6$c r6 = r6.f4193c     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r6.f4181c     // Catch: java.lang.Throwable -> L20
        Le8:
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L20
            if (r6 != 0) goto Lf3
            java.lang.String r6 = "sip"
            r5.addRequestProperty(r6, r4)     // Catch: java.lang.Throwable -> L20
        Lf3:
            boolean r4 = com.amap.api.col.p0003l.g4.z     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L10a
            com.amap.api.col.3l.x6$c r4 = com.amap.api.col.p0003l.g4.T()     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L10a
            java.lang.String r6 = "nls"
            java.lang.String r0 = r4.b()     // Catch: java.lang.Throwable -> L20
            r5.addRequestProperty(r6, r0)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.x6$f r6 = r3.s     // Catch: java.lang.Throwable -> L20
            r6.f4195e = r4     // Catch: java.lang.Throwable -> L20
        L10a:
            com.amap.api.col.3l.x6$a r4 = com.amap.api.col.p0003l.g4.S()     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L11d
            java.lang.String r6 = "nlf"
            java.lang.String r0 = r4.b()     // Catch: java.lang.Throwable -> L20
            r5.addRequestProperty(r6, r0)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.x6$f r5 = r3.s     // Catch: java.lang.Throwable -> L20
            r5.f4194d = r4     // Catch: java.lang.Throwable -> L20
        L11d:
            return
        L11e:
            java.lang.String r5 = "ht"
            java.lang.String r6 = "adh"
            com.amap.api.col.p0003l.r5.e(r4, r5, r6)
            return
    }

    static /* synthetic */ boolean o(com.amap.api.col.p0003l.x6 r0, java.lang.String r1) {
            boolean r0 = r0.v(r1)
            return r0
    }

    private boolean p(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, boolean r8) {
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
            long r7 = com.amap.api.col.p0003l.g4.a(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r6.f4168j     // Catch: java.lang.Throwable -> L5c
            boolean r2 = com.amap.api.col.p0003l.g4.w(r0, r7)     // Catch: java.lang.Throwable -> L5c
        L5a:
            return r2
        L5b:
            return r5
        L5c:
            return r2
    }

    private static java.lang.String r(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3) {
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

    public static void s() {
            return
    }

    static /* synthetic */ boolean u(com.amap.api.col.p0003l.x6 r0) {
            boolean r0 = r0.o
            return r0
    }

    private boolean v(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.f4169k
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
            boolean r3 = y(r3)
            if (r3 == 0) goto L27
            goto L29
        L27:
            r3 = 0
            return r3
        L29:
            r3 = 1
            return r3
    }

    private com.amap.api.col.p0003l.y6 w() {
            r5 = this;
            r0 = 0
            java.lang.ref.SoftReference<com.amap.api.col.3l.y6> r1 = com.amap.api.col.p0003l.x6.u     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto L1e
            goto Le
        Lc:
            r1 = move-exception
            goto L38
        Le:
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.3l.y6 r2 = new com.amap.api.col.3l.y6     // Catch: java.lang.Throwable -> Lc
            android.content.Context r3 = com.amap.api.col.p0003l.g4.f3380g     // Catch: java.lang.Throwable -> Lc
            javax.net.ssl.SSLContext r4 = r5.f4160b     // Catch: java.lang.Throwable -> Lc
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.p0003l.x6.u = r1     // Catch: java.lang.Throwable -> Lc
        L1e:
            java.lang.ref.SoftReference<javax.net.ssl.SSLContext> r1 = com.amap.api.col.p0003l.x6.t     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L2b
            java.lang.ref.SoftReference<com.amap.api.col.3l.y6> r1 = com.amap.api.col.p0003l.x6.u     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.3l.y6 r1 = (com.amap.api.col.p0003l.y6) r1     // Catch: java.lang.Throwable -> Lc
            goto L2c
        L2b:
            r1 = r0
        L2c:
            if (r1 != 0) goto L37
            com.amap.api.col.3l.y6 r1 = new com.amap.api.col.3l.y6     // Catch: java.lang.Throwable -> Lc
            android.content.Context r2 = com.amap.api.col.p0003l.g4.f3380g     // Catch: java.lang.Throwable -> Lc
            javax.net.ssl.SSLContext r3 = r5.f4160b     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
        L37:
            return r1
        L38:
            java.lang.String r2 = "ht"
            java.lang.String r3 = "gsf"
            com.amap.api.col.p0003l.w5.p(r1, r2, r3)
            return r0
    }

    private static boolean y(java.lang.String r1) {
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

    private void z(com.amap.api.col.p0003l.Cif r4) throws com.amap.api.col.p0003l.fk {
            r3 = this;
            com.amap.api.col.3l.x6$d r0 = new com.amap.api.col.3l.x6$d
            r1 = 0
            r0.<init>(r1)
            r3.f4167i = r0
            boolean r0 = r4.isIPV6Request()
            r3.o = r0
            java.net.Proxy r0 = r4.getProxy()
            r3.f4161c = r0
            com.amap.api.col.3l.s6$a r0 = r4.getUrlConnectionImpl()
            r3.f4166h = r0
            boolean r0 = r4.isBinary()
            r3.f4169k = r0
            java.lang.String r0 = r4.parseSdkNameFromRequest()
            r3.f4168j = r0
            com.amap.api.col.3l.k4 r0 = com.amap.api.col.p0003l.k4.a()
            boolean r1 = r4.isHttps()
            boolean r0 = r0.e(r1)
            r3.a = r0
            com.amap.api.col.3l.if$b r0 = r4.getDegradeType()
            boolean r0 = r0.b()
            if (r0 == 0) goto L43
            java.lang.String r0 = r4.b()
            goto L47
        L43:
            java.lang.String r0 = r4.a()
        L47:
            r3.l = r0
            java.lang.String r0 = e(r0)
            r3.l = r0
            java.lang.String r1 = r3.f4168j
            java.lang.String r0 = com.amap.api.col.p0003l.w6.a(r0, r1)
            r3.l = r0
            java.lang.String r1 = "restrictionURLTest: "
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1.concat(r2)
            com.amap.api.col.3l.c7 r1 = com.amap.api.col.p0003l.c7.b()
            boolean r1 = r1.c(r0)
            if (r1 != 0) goto Lb4
            java.lang.String r0 = r4.getIPDNSName()
            r3.m = r0
            java.lang.String r0 = "loc"
            java.lang.String r1 = r3.f4168j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r4.a()
            java.lang.String r4 = r4.b()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L95
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L94
            r1.<init>(r0)     // Catch: java.lang.Exception -> L94
            java.lang.String r0 = r1.getHost()     // Catch: java.lang.Exception -> L94
            r3.q = r0     // Catch: java.lang.Exception -> L94
            goto L95
        L94:
        L95:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto Lb3
            java.lang.String r0 = r3.m     // Catch: java.lang.Exception -> Lb3
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lb3
            if (r0 != 0) goto La8
            java.lang.String r4 = r3.m     // Catch: java.lang.Exception -> Lb3
            r3.p = r4     // Catch: java.lang.Exception -> Lb3
            goto Lb3
        La8:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> Lb3
            r0.<init>(r4)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r4 = r0.getHost()     // Catch: java.lang.Exception -> Lb3
            r3.p = r4     // Catch: java.lang.Exception -> Lb3
        Lb3:
            return
        Lb4:
            java.lang.String r4 = "restriction hit: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.concat(r0)
            com.amap.api.col.3l.fk r4 = new com.amap.api.col.3l.fk
            java.lang.String r0 = "限制访问的接口"
            r4.<init>(r0)
            throw r4
    }

    final java.util.Map<java.lang.String, java.lang.String> j(com.amap.api.col.p0003l.Cif r14) throws com.amap.api.col.p0003l.fk {
            r13 = this;
            java.lang.String r0 = "未知的错误"
            java.lang.String r1 = "mgr"
            java.lang.String r2 = "hth"
            java.lang.String r3 = "IO 操作异常 - IOException"
            r4 = 6
            r5 = 2
            r6 = 7
            r7 = 9
            r8 = 0
            r13.z(r14)     // Catch: com.amap.api.col.p0003l.fk -> La8 java.net.SocketTimeoutException -> Laa java.net.SocketException -> Lac org.apache.http.conn.ConnectTimeoutException -> Lae javax.net.ssl.SSLException -> Lb1 java.net.ConnectException -> Lb4 java.lang.Throwable -> Lb7 java.io.IOException -> Lcf java.io.InterruptedIOException -> Lda java.net.UnknownHostException -> L118 java.net.MalformedURLException -> L125
            java.lang.String r9 = r13.l     // Catch: com.amap.api.col.p0003l.fk -> La8 java.net.SocketTimeoutException -> Laa java.net.SocketException -> Lac org.apache.http.conn.ConnectTimeoutException -> Lae javax.net.ssl.SSLException -> Lb1 java.net.ConnectException -> Lb4 java.lang.Throwable -> Lb7 java.io.IOException -> Lcf java.io.InterruptedIOException -> Lda java.net.UnknownHostException -> L118 java.net.MalformedURLException -> L125
            java.util.Map r10 = r14.getParams()     // Catch: com.amap.api.col.p0003l.fk -> La8 java.net.SocketTimeoutException -> Laa java.net.SocketException -> Lac org.apache.http.conn.ConnectTimeoutException -> Lae javax.net.ssl.SSLException -> Lb1 java.net.ConnectException -> Lb4 java.lang.Throwable -> Lb7 java.io.IOException -> Lcf java.io.InterruptedIOException -> Lda java.net.UnknownHostException -> L118 java.net.MalformedURLException -> L125
            java.lang.String r9 = g(r9, r10)     // Catch: com.amap.api.col.p0003l.fk -> La8 java.net.SocketTimeoutException -> Laa java.net.SocketException -> Lac org.apache.http.conn.ConnectTimeoutException -> Lae javax.net.ssl.SSLException -> Lb1 java.net.ConnectException -> Lb4 java.lang.Throwable -> Lb7 java.io.IOException -> Lcf java.io.InterruptedIOException -> Lda java.net.UnknownHostException -> L118 java.net.MalformedURLException -> L125
            r13.l = r9     // Catch: com.amap.api.col.p0003l.fk -> La8 java.net.SocketTimeoutException -> Laa java.net.SocketException -> Lac org.apache.http.conn.ConnectTimeoutException -> Lae javax.net.ssl.SSLException -> Lb1 java.net.ConnectException -> Lb4 java.lang.Throwable -> Lb7 java.io.IOException -> Lcf java.io.InterruptedIOException -> Lda java.net.UnknownHostException -> L118 java.net.MalformedURLException -> L125
            r9 = 0
            com.amap.api.col.3l.x6$b r14 = r13.b(r14, r9, r9)     // Catch: com.amap.api.col.p0003l.fk -> La8 java.net.SocketTimeoutException -> Laa java.net.SocketException -> Lac org.apache.http.conn.ConnectTimeoutException -> Lae javax.net.ssl.SSLException -> Lb1 java.net.ConnectException -> Lb4 java.lang.Throwable -> Lb7 java.io.IOException -> Lcf java.io.InterruptedIOException -> Lda java.net.UnknownHostException -> L118 java.net.MalformedURLException -> L125
            java.net.HttpURLConnection r14 = r14.a     // Catch: com.amap.api.col.p0003l.fk -> La8 java.net.SocketTimeoutException -> Laa java.net.SocketException -> Lac org.apache.http.conn.ConnectTimeoutException -> Lae javax.net.ssl.SSLException -> Lb1 java.net.ConnectException -> Lb4 java.lang.Throwable -> Lb7 java.io.IOException -> Lcf java.io.InterruptedIOException -> Lda java.net.UnknownHostException -> L118 java.net.MalformedURLException -> L125
            com.amap.api.col.3l.x6$f r10 = r13.s     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r10.f4192b = r11     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r14.connect()     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            com.amap.api.col.3l.x6$f r10 = r13.s     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r10.a()     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            int r10 = r14.getResponseCode()     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r11 = 400(0x190, float:5.6E-43)
            if (r10 >= r11) goto L87
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r10.<init>()     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
        L41:
            r11 = 50
            if (r9 >= r11) goto L74
            java.lang.String r11 = r14.getHeaderFieldKey(r9)     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            if (r11 == 0) goto L74
            java.lang.String r12 = r14.getHeaderField(r11)     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            java.lang.String r11 = r11.toLowerCase()     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            int r9 = r9 + 1
            goto L41
        L59:
            r8 = r14
            goto Lb7
        L5c:
            r0 = move-exception
            r8 = r14
            goto Lc5
        L60:
            r0 = move-exception
            r8 = r14
            goto Lec
        L64:
            r0 = move-exception
            r8 = r14
            goto L102
        L68:
            r0 = move-exception
            r8 = r14
            goto L134
        L6c:
            r0 = move-exception
            r8 = r14
            goto L148
        L70:
            r0 = move-exception
            r8 = r14
            goto L15d
        L74:
            com.amap.api.col.3l.x6$f r9 = r13.s     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r9.e(r8)     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r14.disconnect()     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r14 = move-exception
            com.amap.api.col.p0003l.r5.e(r14, r2, r1)
        L81:
            com.amap.api.col.3l.x6$f r14 = r13.s
            r14.i()
            return r10
        L87:
            com.amap.api.col.3l.x6$f r8 = r13.s     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r8.g(r10)     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            com.amap.api.col.3l.x6$f r8 = r13.s     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r9 = 10
            r8.b(r9)     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            com.amap.api.col.3l.fk r8 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            java.lang.String r9 = "http读取header失败"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            r8.a(r10)     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
            throw r8     // Catch: java.lang.Throwable -> L59 com.amap.api.col.p0003l.fk -> L5c java.net.SocketTimeoutException -> L60 java.net.SocketException -> L64 org.apache.http.conn.ConnectTimeoutException -> L68 javax.net.ssl.SSLException -> L6c java.net.ConnectException -> L70 java.io.IOException -> L9e java.io.InterruptedIOException -> La0 java.net.UnknownHostException -> La2 java.net.MalformedURLException -> La5
        L9e:
            r8 = r14
            goto Lcf
        La0:
            r8 = r14
            goto Lda
        La2:
            r8 = r14
            goto L118
        La5:
            r8 = r14
            goto L125
        La8:
            r0 = move-exception
            goto Lc5
        Laa:
            r0 = move-exception
            goto Lec
        Lac:
            r0 = move-exception
            goto L102
        Lae:
            r0 = move-exception
            goto L134
        Lb1:
            r0 = move-exception
            goto L148
        Lb4:
            r0 = move-exception
            goto L15d
        Lb7:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r14.b(r7)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r14 = move-exception
            goto L173
        Lc5:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            int r3 = r0.g()     // Catch: java.lang.Throwable -> Lc2
            r14.b(r3)     // Catch: java.lang.Throwable -> Lc2
            throw r0     // Catch: java.lang.Throwable -> Lc2
        Lcf:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r14.b(r6)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            r14.<init>(r3)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        Lda:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r3 = 7101(0x1bbd, float:9.95E-42)
            r14.g(r3)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r14.b(r6)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        Lec:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            int r0 = a(r0)     // Catch: java.lang.Throwable -> Lc2
            r14.g(r0)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r14.b(r5)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "socket 连接超时 - SocketTimeoutException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        L102:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            int r0 = a(r0)     // Catch: java.lang.Throwable -> Lc2
            r14.g(r0)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r14.b(r4)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "socket 连接异常 - SocketException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        L118:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r14.b(r7)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "未知主机 - UnKnowHostException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        L125:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r0 = 8
            r14.b(r0)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "url异常 - MalformedURLException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        L134:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            int r0 = a(r0)     // Catch: java.lang.Throwable -> Lc2
            r14.g(r0)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r14.b(r5)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            r14.<init>(r3)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        L148:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            int r0 = a(r0)     // Catch: java.lang.Throwable -> Lc2
            r14.g(r0)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r0 = 4
            r14.b(r0)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            r14.<init>(r3)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        L15d:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            int r0 = a(r0)     // Catch: java.lang.Throwable -> Lc2
            r14.g(r0)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> Lc2
            r14.b(r4)     // Catch: java.lang.Throwable -> Lc2
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "http连接失败 - ConnectionException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r14     // Catch: java.lang.Throwable -> Lc2
        L173:
            if (r8 == 0) goto L17d
            r8.disconnect()     // Catch: java.lang.Throwable -> L179
            goto L17d
        L179:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r2, r1)
        L17d:
            com.amap.api.col.3l.x6$f r0 = r13.s
            r0.i()
            throw r14
    }

    final void k() {
            r1 = this;
            r0 = 1
            r1.f4162d = r0
            return
    }

    final void l(long r1) {
            r0 = this;
            r0.f4164f = r1
            return
    }

    final void m(com.amap.api.col.p0003l.Cif r20, com.amap.api.col.3l.v6.a r21) {
            r19 = this;
            r1 = r19
            r2 = r21
            java.lang.String r3 = "mdr"
            java.lang.String r4 = "ht"
            if (r2 != 0) goto Lb
            return
        Lb:
            r19.z(r20)     // Catch: java.lang.Throwable -> L29e com.amap.api.col.p0003l.fk -> L2a5 java.io.IOException -> L2ac java.io.InterruptedIOException -> L2b3 java.net.SocketTimeoutException -> L2ba java.net.SocketException -> L2c1 java.net.UnknownHostException -> L2c8 java.net.MalformedURLException -> L2cf org.apache.http.conn.ConnectTimeoutException -> L2d6 javax.net.ssl.SSLException -> L2dd java.net.ConnectException -> L2e4
            java.lang.String r0 = r1.l     // Catch: java.lang.Throwable -> L29e com.amap.api.col.p0003l.fk -> L2a5 java.io.IOException -> L2ac java.io.InterruptedIOException -> L2b3 java.net.SocketTimeoutException -> L2ba java.net.SocketException -> L2c1 java.net.UnknownHostException -> L2c8 java.net.MalformedURLException -> L2cf org.apache.http.conn.ConnectTimeoutException -> L2d6 javax.net.ssl.SSLException -> L2dd java.net.ConnectException -> L2e4
            java.util.Map r9 = r20.getParams()     // Catch: java.lang.Throwable -> L29e com.amap.api.col.p0003l.fk -> L2a5 java.io.IOException -> L2ac java.io.InterruptedIOException -> L2b3 java.net.SocketTimeoutException -> L2ba java.net.SocketException -> L2c1 java.net.UnknownHostException -> L2c8 java.net.MalformedURLException -> L2cf org.apache.http.conn.ConnectTimeoutException -> L2d6 javax.net.ssl.SSLException -> L2dd java.net.ConnectException -> L2e4
            java.lang.String r0 = g(r0, r9)     // Catch: java.lang.Throwable -> L29e com.amap.api.col.p0003l.fk -> L2a5 java.io.IOException -> L2ac java.io.InterruptedIOException -> L2b3 java.net.SocketTimeoutException -> L2ba java.net.SocketException -> L2c1 java.net.UnknownHostException -> L2c8 java.net.MalformedURLException -> L2cf org.apache.http.conn.ConnectTimeoutException -> L2d6 javax.net.ssl.SSLException -> L2dd java.net.ConnectException -> L2e4
            r1.l = r0     // Catch: java.lang.Throwable -> L29e com.amap.api.col.p0003l.fk -> L2a5 java.io.IOException -> L2ac java.io.InterruptedIOException -> L2b3 java.net.SocketTimeoutException -> L2ba java.net.SocketException -> L2c1 java.net.UnknownHostException -> L2c8 java.net.MalformedURLException -> L2cf org.apache.http.conn.ConnectTimeoutException -> L2d6 javax.net.ssl.SSLException -> L2dd java.net.ConnectException -> L2e4
            byte[] r0 = r20.getEntityBytes()     // Catch: java.lang.Throwable -> L29e com.amap.api.col.p0003l.fk -> L2a5 java.io.IOException -> L2ac java.io.InterruptedIOException -> L2b3 java.net.SocketTimeoutException -> L2ba java.net.SocketException -> L2c1 java.net.UnknownHostException -> L2c8 java.net.MalformedURLException -> L2cf org.apache.http.conn.ConnectTimeoutException -> L2d6 javax.net.ssl.SSLException -> L2dd java.net.ConnectException -> L2e4
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L6b
            int r11 = r0.length     // Catch: java.lang.Throwable -> L29 com.amap.api.col.p0003l.fk -> L2f java.io.IOException -> L35 java.io.InterruptedIOException -> L3b java.net.SocketTimeoutException -> L41 java.net.SocketException -> L47 java.net.UnknownHostException -> L4d java.net.MalformedURLException -> L53 org.apache.http.conn.ConnectTimeoutException -> L59 javax.net.ssl.SSLException -> L5f java.net.ConnectException -> L65
            if (r11 <= 0) goto L6b
            r12 = 1
        L26:
            r11 = r20
            goto L6d
        L29:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L2c:
            r13 = 0
            goto L2eb
        L2f:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L32:
            r13 = 0
            goto L316
        L35:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L38:
            r13 = 0
            goto L33f
        L3b:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L3e:
            r13 = 0
            goto L365
        L41:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L44:
            r13 = 0
            goto L392
        L47:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L4a:
            r13 = 0
            goto L3c1
        L4d:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L50:
            r13 = 0
            goto L3f0
        L53:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L56:
            r13 = 0
            goto L416
        L59:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L5c:
            r13 = 0
            goto L43d
        L5f:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L62:
            r13 = 0
            goto L46c
        L65:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L68:
            r13 = 0
            goto L49b
        L6b:
            r12 = 0
            goto L26
        L6d:
            com.amap.api.col.3l.x6$b r11 = r1.b(r11, r12, r10)     // Catch: java.lang.Throwable -> L29e com.amap.api.col.p0003l.fk -> L2a5 java.io.IOException -> L2ac java.io.InterruptedIOException -> L2b3 java.net.SocketTimeoutException -> L2ba java.net.SocketException -> L2c1 java.net.UnknownHostException -> L2c8 java.net.MalformedURLException -> L2cf org.apache.http.conn.ConnectTimeoutException -> L2d6 javax.net.ssl.SSLException -> L2dd java.net.ConnectException -> L2e4
            java.net.HttpURLConnection r11 = r11.a     // Catch: java.lang.Throwable -> L29e com.amap.api.col.p0003l.fk -> L2a5 java.io.IOException -> L2ac java.io.InterruptedIOException -> L2b3 java.net.SocketTimeoutException -> L2ba java.net.SocketException -> L2c1 java.net.UnknownHostException -> L2c8 java.net.MalformedURLException -> L2cf org.apache.http.conn.ConnectTimeoutException -> L2d6 javax.net.ssl.SSLException -> L2dd java.net.ConnectException -> L2e4
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            java.lang.String r14 = "bytes="
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            long r14 = r1.f4164f     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            r13.append(r14)     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            java.lang.String r14 = "-"
            r13.append(r14)     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            java.lang.String r14 = "RANGE"
            r11.setRequestProperty(r14, r13)     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            com.amap.api.col.3l.x6$f r13 = r1.s     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            r13.f4192b = r14     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            r11.connect()     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            com.amap.api.col.3l.x6$f r13 = r1.s     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            r13.a()     // Catch: java.lang.Throwable -> L25c com.amap.api.col.p0003l.fk -> L262 java.io.IOException -> L268 java.io.InterruptedIOException -> L26e java.net.SocketTimeoutException -> L274 java.net.SocketException -> L27a java.net.UnknownHostException -> L280 java.net.MalformedURLException -> L286 org.apache.http.conn.ConnectTimeoutException -> L28c javax.net.ssl.SSLException -> L292 java.net.ConnectException -> L298
            if (r12 == 0) goto L117
            com.amap.api.col.3l.x6$f r12 = r1.s     // Catch: java.lang.Throwable -> Leb com.amap.api.col.p0003l.fk -> Lef java.io.IOException -> Lf3 java.io.InterruptedIOException -> Lf7 java.net.SocketTimeoutException -> Lfb java.net.SocketException -> Lff java.net.UnknownHostException -> L103 java.net.MalformedURLException -> L107 org.apache.http.conn.ConnectTimeoutException -> L10b javax.net.ssl.SSLException -> L10f java.net.ConnectException -> L113
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Leb com.amap.api.col.p0003l.fk -> Lef java.io.IOException -> Lf3 java.io.InterruptedIOException -> Lf7 java.net.SocketTimeoutException -> Lfb java.net.SocketException -> Lff java.net.UnknownHostException -> L103 java.net.MalformedURLException -> L107 org.apache.http.conn.ConnectTimeoutException -> L10b javax.net.ssl.SSLException -> L10f java.net.ConnectException -> L113
            r12.f4192b = r13     // Catch: java.lang.Throwable -> Leb com.amap.api.col.p0003l.fk -> Lef java.io.IOException -> Lf3 java.io.InterruptedIOException -> Lf7 java.net.SocketTimeoutException -> Lfb java.net.SocketException -> Lff java.net.UnknownHostException -> L103 java.net.MalformedURLException -> L107 org.apache.http.conn.ConnectTimeoutException -> L10b javax.net.ssl.SSLException -> L10f java.net.ConnectException -> L113
            java.io.OutputStream r12 = r11.getOutputStream()     // Catch: java.lang.Throwable -> Leb com.amap.api.col.p0003l.fk -> Lef java.io.IOException -> Lf3 java.io.InterruptedIOException -> Lf7 java.net.SocketTimeoutException -> Lfb java.net.SocketException -> Lff java.net.UnknownHostException -> L103 java.net.MalformedURLException -> L107 org.apache.http.conn.ConnectTimeoutException -> L10b javax.net.ssl.SSLException -> L10f java.net.ConnectException -> L113
            java.io.DataOutputStream r13 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> Leb com.amap.api.col.p0003l.fk -> Lef java.io.IOException -> Lf3 java.io.InterruptedIOException -> Lf7 java.net.SocketTimeoutException -> Lfb java.net.SocketException -> Lff java.net.UnknownHostException -> L103 java.net.MalformedURLException -> L107 org.apache.http.conn.ConnectTimeoutException -> L10b javax.net.ssl.SSLException -> L10f java.net.ConnectException -> L113
            r13.<init>(r12)     // Catch: java.lang.Throwable -> Leb com.amap.api.col.p0003l.fk -> Lef java.io.IOException -> Lf3 java.io.InterruptedIOException -> Lf7 java.net.SocketTimeoutException -> Lfb java.net.SocketException -> Lff java.net.UnknownHostException -> L103 java.net.MalformedURLException -> L107 org.apache.http.conn.ConnectTimeoutException -> L10b javax.net.ssl.SSLException -> L10f java.net.ConnectException -> L113
            r13.write(r0)     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r13.close()     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r12.close()     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            com.amap.api.col.3l.x6$f r0 = r1.s     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r0.f()     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            goto L118
        Lbf:
            r0 = move-exception
            r8 = 0
            goto L2eb
        Lc3:
            r0 = move-exception
            r8 = 0
            goto L316
        Lc7:
            r0 = move-exception
            r8 = 0
            goto L33f
        Lcb:
            r0 = move-exception
            r8 = 0
            goto L365
        Lcf:
            r0 = move-exception
            r8 = 0
            goto L392
        Ld3:
            r0 = move-exception
            r8 = 0
            goto L3c1
        Ld7:
            r0 = move-exception
            r8 = 0
            goto L3f0
        Ldb:
            r0 = move-exception
            r8 = 0
            goto L416
        Ldf:
            r0 = move-exception
            r8 = 0
            goto L43d
        Le3:
            r0 = move-exception
            r8 = 0
            goto L46c
        Le7:
            r0 = move-exception
            r8 = 0
            goto L49b
        Leb:
            r0 = move-exception
            r8 = 0
            goto L2c
        Lef:
            r0 = move-exception
            r8 = 0
            goto L32
        Lf3:
            r0 = move-exception
            r8 = 0
            goto L38
        Lf7:
            r0 = move-exception
            r8 = 0
            goto L3e
        Lfb:
            r0 = move-exception
            r8 = 0
            goto L44
        Lff:
            r0 = move-exception
            r8 = 0
            goto L4a
        L103:
            r0 = move-exception
            r8 = 0
            goto L50
        L107:
            r0 = move-exception
            r8 = 0
            goto L56
        L10b:
            r0 = move-exception
            r8 = 0
            goto L5c
        L10f:
            r0 = move-exception
            r8 = 0
            goto L62
        L113:
            r0 = move-exception
            r8 = 0
            goto L68
        L117:
            r13 = 0
        L118:
            java.lang.String r0 = h(r11)     // Catch: java.lang.Throwable -> L225 com.amap.api.col.p0003l.fk -> L22a java.io.IOException -> L22f java.io.InterruptedIOException -> L234 java.net.SocketTimeoutException -> L239 java.net.SocketException -> L23e java.net.UnknownHostException -> L243 java.net.MalformedURLException -> L248 org.apache.http.conn.ConnectTimeoutException -> L24d javax.net.ssl.SSLException -> L252 java.net.ConnectException -> L257
            int r12 = r11.getResponseCode()     // Catch: java.lang.Throwable -> L225 com.amap.api.col.p0003l.fk -> L22a java.io.IOException -> L22f java.io.InterruptedIOException -> L234 java.net.SocketTimeoutException -> L239 java.net.SocketException -> L23e java.net.UnknownHostException -> L243 java.net.MalformedURLException -> L248 org.apache.http.conn.ConnectTimeoutException -> L24d javax.net.ssl.SSLException -> L252 java.net.ConnectException -> L257
            r14 = 200(0xc8, float:2.8E-43)
            if (r12 == r14) goto L126
            r14 = 1
            goto L127
        L126:
            r14 = 0
        L127:
            r15 = 206(0xce, float:2.89E-43)
            if (r12 == r15) goto L12c
            goto L12d
        L12c:
            r9 = 0
        L12d:
            r9 = r9 & r14
            if (r9 == 0) goto L178
            com.amap.api.col.3l.x6$f r9 = r1.s     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r9.g(r12)     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            com.amap.api.col.3l.x6$f r9 = r1.s     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r10 = 10
            r9.b(r10)     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            com.amap.api.col.3l.fk r9 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            java.lang.String r14 = "网络异常原因："
            r10.<init>(r14)     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            java.lang.String r14 = r11.getResponseMessage()     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r10.append(r14)     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            java.lang.String r14 = " 网络异常状态码："
            r10.append(r14)     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r10.append(r12)     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            java.lang.String r12 = r1.f4165g     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r9.<init>(r10, r0, r12)     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r2.onException(r9)     // Catch: java.lang.Throwable -> Lbf com.amap.api.col.p0003l.fk -> Lc3 java.io.IOException -> Lc7 java.io.InterruptedIOException -> Lcb java.net.SocketTimeoutException -> Lcf java.net.SocketException -> Ld3 java.net.UnknownHostException -> Ld7 java.net.MalformedURLException -> Ldb org.apache.http.conn.ConnectTimeoutException -> Ldf javax.net.ssl.SSLException -> Le3 java.net.ConnectException -> Le7
            r11.disconnect()     // Catch: java.lang.Throwable -> L164
            goto L168
        L164:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L168:
            if (r13 == 0) goto L172
        L16a:
            r13.close()     // Catch: java.lang.Throwable -> L16e
            goto L172
        L16e:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L172:
            com.amap.api.col.3l.x6$f r0 = r1.s
            r0.i()
            return
        L178:
            com.amap.api.col.3l.x6$f r0 = r1.s     // Catch: java.lang.Throwable -> L225 com.amap.api.col.p0003l.fk -> L22a java.io.IOException -> L22f java.io.InterruptedIOException -> L234 java.net.SocketTimeoutException -> L239 java.net.SocketException -> L23e java.net.UnknownHostException -> L243 java.net.MalformedURLException -> L248 org.apache.http.conn.ConnectTimeoutException -> L24d javax.net.ssl.SSLException -> L252 java.net.ConnectException -> L257
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L225 com.amap.api.col.p0003l.fk -> L22a java.io.IOException -> L22f java.io.InterruptedIOException -> L234 java.net.SocketTimeoutException -> L239 java.net.SocketException -> L23e java.net.UnknownHostException -> L243 java.net.MalformedURLException -> L248 org.apache.http.conn.ConnectTimeoutException -> L24d javax.net.ssl.SSLException -> L252 java.net.ConnectException -> L257
            r0.f4192b = r14     // Catch: java.lang.Throwable -> L225 com.amap.api.col.p0003l.fk -> L22a java.io.IOException -> L22f java.io.InterruptedIOException -> L234 java.net.SocketTimeoutException -> L239 java.net.SocketException -> L23e java.net.UnknownHostException -> L243 java.net.MalformedURLException -> L248 org.apache.http.conn.ConnectTimeoutException -> L24d javax.net.ssl.SSLException -> L252 java.net.ConnectException -> L257
            java.io.InputStream r9 = r11.getInputStream()     // Catch: java.lang.Throwable -> L225 com.amap.api.col.p0003l.fk -> L22a java.io.IOException -> L22f java.io.InterruptedIOException -> L234 java.net.SocketTimeoutException -> L239 java.net.SocketException -> L23e java.net.UnknownHostException -> L243 java.net.MalformedURLException -> L248 org.apache.http.conn.ConnectTimeoutException -> L24d javax.net.ssl.SSLException -> L252 java.net.ConnectException -> L257
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r12 = new byte[r0]     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            r14 = 0
        L189:
            boolean r15 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            if (r15 != 0) goto L1ee
            boolean r15 = r1.f4162d     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            if (r15 != 0) goto L1ee
            int r15 = r9.read(r12, r10, r0)     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            if (r15 <= 0) goto L1ee
            long r5 = r1.f4163e     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            r16 = -1
            int r18 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r18 == 0) goto L1d4
            long r7 = r1.f4164f     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            int r18 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r18 >= 0) goto L1ee
            goto L1d4
        L1a8:
            r0 = move-exception
            r8 = r9
            goto L2eb
        L1ac:
            r0 = move-exception
            r8 = r9
            goto L316
        L1b0:
            r0 = move-exception
            r8 = r9
            goto L33f
        L1b4:
            r0 = move-exception
            r8 = r9
            goto L365
        L1b8:
            r0 = move-exception
            r8 = r9
            goto L392
        L1bc:
            r0 = move-exception
            r8 = r9
            goto L3c1
        L1c0:
            r0 = move-exception
            r8 = r9
            goto L3f0
        L1c4:
            r0 = move-exception
            r8 = r9
            goto L416
        L1c8:
            r0 = move-exception
            r8 = r9
            goto L43d
        L1cc:
            r0 = move-exception
            r8 = r9
            goto L46c
        L1d0:
            r0 = move-exception
            r8 = r9
            goto L49b
        L1d4:
            if (r15 != r0) goto L1dc
            long r5 = r1.f4164f     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            r2.onDownload(r12, r5)     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            goto L1e6
        L1dc:
            byte[] r5 = new byte[r15]     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            java.lang.System.arraycopy(r12, r10, r5, r10, r15)     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            long r6 = r1.f4164f     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            r2.onDownload(r5, r6)     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
        L1e6:
            long r5 = r1.f4164f     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            long r7 = (long) r15     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            long r5 = r5 + r7
            r1.f4164f = r5     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            int r14 = r14 + r15
            goto L189
        L1ee:
            com.amap.api.col.3l.x6$f r0 = r1.s     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            long r5 = (long) r14     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            r0.c(r5)     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            com.amap.api.col.3l.x6$f r0 = r1.s     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            r0.h()     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            boolean r0 = r1.f4162d     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            if (r0 == 0) goto L201
            r2.onStop()     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            goto L204
        L201:
            r2.onFinish()     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
        L204:
            com.amap.api.col.3l.x6$f r0 = r1.s     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            r5 = 0
            r0.e(r5)     // Catch: java.lang.Throwable -> L1a8 com.amap.api.col.p0003l.fk -> L1ac java.io.IOException -> L1b0 java.io.InterruptedIOException -> L1b4 java.net.SocketTimeoutException -> L1b8 java.net.SocketException -> L1bc java.net.UnknownHostException -> L1c0 java.net.MalformedURLException -> L1c4 org.apache.http.conn.ConnectTimeoutException -> L1c8 javax.net.ssl.SSLException -> L1cc java.net.ConnectException -> L1d0
            if (r9 == 0) goto L219
            r9.close()     // Catch: java.lang.Throwable -> L210 java.io.IOException -> L215
            goto L219
        L210:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L219
        L215:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L219:
            r11.disconnect()     // Catch: java.lang.Throwable -> L21d
            goto L221
        L21d:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L221:
            if (r13 == 0) goto L172
            goto L16a
        L225:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L2eb
        L22a:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L316
        L22f:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L33f
        L234:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L365
        L239:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L392
        L23e:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L3c1
        L243:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L3f0
        L248:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L416
        L24d:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L43d
        L252:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L46c
        L257:
            r0 = move-exception
            r5 = 0
            r8 = r5
            goto L49b
        L25c:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L2eb
        L262:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L316
        L268:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L33f
        L26e:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L365
        L274:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L392
        L27a:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L3c1
        L280:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L3f0
        L286:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L416
        L28c:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L43d
        L292:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L46c
        L298:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r13 = r8
            goto L49b
        L29e:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L2eb
        L2a5:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L316
        L2ac:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L33f
        L2b3:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L365
        L2ba:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L392
        L2c1:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L3c1
        L2c8:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L3f0
        L2cf:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L416
        L2d6:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L43d
        L2dd:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L46c
        L2e4:
            r0 = move-exception
            r5 = 0
            r8 = r5
            r11 = r8
            r13 = r11
            goto L49b
        L2eb:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 9
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L304
            r8.close()     // Catch: java.lang.Throwable -> L2fb java.io.IOException -> L300
            goto L304
        L2fb:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L304
        L300:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L304:
            if (r11 == 0) goto L30e
            r11.disconnect()     // Catch: java.lang.Throwable -> L30a
            goto L30e
        L30a:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L30e:
            if (r13 == 0) goto L172
            goto L16a
        L312:
            r0 = move-exception
            r2 = r0
            goto L4ca
        L316:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            int r6 = r0.g()     // Catch: java.lang.Throwable -> L312
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L331
            r8.close()     // Catch: java.lang.Throwable -> L328 java.io.IOException -> L32d
            goto L331
        L328:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L331
        L32d:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L331:
            if (r11 == 0) goto L33b
            r11.disconnect()     // Catch: java.lang.Throwable -> L337
            goto L33b
        L337:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L33b:
            if (r13 == 0) goto L172
            goto L16a
        L33f:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 7
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L357
            r8.close()     // Catch: java.lang.Throwable -> L34e java.io.IOException -> L353
            goto L357
        L34e:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L357
        L353:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L357:
            if (r11 == 0) goto L361
            r11.disconnect()     // Catch: java.lang.Throwable -> L35d
            goto L361
        L35d:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L361:
            if (r13 == 0) goto L172
            goto L16a
        L365:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 7101(0x1bbd, float:9.95E-42)
            r5.g(r6)     // Catch: java.lang.Throwable -> L312
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 7
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L384
            r8.close()     // Catch: java.lang.Throwable -> L37b java.io.IOException -> L380
            goto L384
        L37b:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L384
        L380:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L384:
            if (r11 == 0) goto L38e
            r11.disconnect()     // Catch: java.lang.Throwable -> L38a
            goto L38e
        L38a:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L38e:
            if (r13 == 0) goto L172
            goto L16a
        L392:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            int r6 = a(r0)     // Catch: java.lang.Throwable -> L312
            r5.g(r6)     // Catch: java.lang.Throwable -> L312
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 2
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L3b3
            r8.close()     // Catch: java.lang.Throwable -> L3aa java.io.IOException -> L3af
            goto L3b3
        L3aa:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L3b3
        L3af:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L3b3:
            if (r11 == 0) goto L3bd
            r11.disconnect()     // Catch: java.lang.Throwable -> L3b9
            goto L3bd
        L3b9:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L3bd:
            if (r13 == 0) goto L172
            goto L16a
        L3c1:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            int r6 = a(r0)     // Catch: java.lang.Throwable -> L312
            r5.g(r6)     // Catch: java.lang.Throwable -> L312
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 6
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L3e2
            r8.close()     // Catch: java.lang.Throwable -> L3d9 java.io.IOException -> L3de
            goto L3e2
        L3d9:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L3e2
        L3de:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L3e2:
            if (r11 == 0) goto L3ec
            r11.disconnect()     // Catch: java.lang.Throwable -> L3e8
            goto L3ec
        L3e8:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L3ec:
            if (r13 == 0) goto L172
            goto L16a
        L3f0:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 5
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L408
            r8.close()     // Catch: java.lang.Throwable -> L3ff java.io.IOException -> L404
            goto L408
        L3ff:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L408
        L404:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L408:
            if (r11 == 0) goto L412
            r11.disconnect()     // Catch: java.lang.Throwable -> L40e
            goto L412
        L40e:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L412:
            if (r13 == 0) goto L172
            goto L16a
        L416:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 8
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L42f
            r8.close()     // Catch: java.lang.Throwable -> L426 java.io.IOException -> L42b
            goto L42f
        L426:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L42f
        L42b:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L42f:
            if (r11 == 0) goto L439
            r11.disconnect()     // Catch: java.lang.Throwable -> L435
            goto L439
        L435:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L439:
            if (r13 == 0) goto L172
            goto L16a
        L43d:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            int r6 = a(r0)     // Catch: java.lang.Throwable -> L312
            r5.g(r6)     // Catch: java.lang.Throwable -> L312
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 2
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L45e
            r8.close()     // Catch: java.lang.Throwable -> L455 java.io.IOException -> L45a
            goto L45e
        L455:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L45e
        L45a:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L45e:
            if (r11 == 0) goto L468
            r11.disconnect()     // Catch: java.lang.Throwable -> L464
            goto L468
        L464:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L468:
            if (r13 == 0) goto L172
            goto L16a
        L46c:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            int r6 = a(r0)     // Catch: java.lang.Throwable -> L312
            r5.g(r6)     // Catch: java.lang.Throwable -> L312
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 4
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L48d
            r8.close()     // Catch: java.lang.Throwable -> L484 java.io.IOException -> L489
            goto L48d
        L484:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L48d
        L489:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L48d:
            if (r11 == 0) goto L497
            r11.disconnect()     // Catch: java.lang.Throwable -> L493
            goto L497
        L493:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L497:
            if (r13 == 0) goto L172
            goto L16a
        L49b:
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            int r6 = a(r0)     // Catch: java.lang.Throwable -> L312
            r5.g(r6)     // Catch: java.lang.Throwable -> L312
            com.amap.api.col.3l.x6$f r5 = r1.s     // Catch: java.lang.Throwable -> L312
            r6 = 6
            r5.b(r6)     // Catch: java.lang.Throwable -> L312
            r2.onException(r0)     // Catch: java.lang.Throwable -> L312
            if (r8 == 0) goto L4bc
            r8.close()     // Catch: java.lang.Throwable -> L4b3 java.io.IOException -> L4b8
            goto L4bc
        L4b3:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L4bc
        L4b8:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L4bc:
            if (r11 == 0) goto L4c6
            r11.disconnect()     // Catch: java.lang.Throwable -> L4c2
            goto L4c6
        L4c2:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L4c6:
            if (r13 == 0) goto L172
            goto L16a
        L4ca:
            if (r8 == 0) goto L4d9
            r8.close()     // Catch: java.lang.Throwable -> L4d0 java.io.IOException -> L4d5
            goto L4d9
        L4d0:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
            goto L4d9
        L4d5:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L4d9:
            if (r11 == 0) goto L4e3
            r11.disconnect()     // Catch: java.lang.Throwable -> L4df
            goto L4e3
        L4df:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L4e3:
            if (r13 == 0) goto L4ed
            r13.close()     // Catch: java.lang.Throwable -> L4e9
            goto L4ed
        L4e9:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r4, r3)
        L4ed:
            com.amap.api.col.3l.x6$f r0 = r1.s
            r0.i()
            throw r2
    }

    final com.amap.api.col.p0003l.a7 q(com.amap.api.col.p0003l.Cif r14) throws com.amap.api.col.p0003l.fk {
            r13 = this;
            java.lang.String r0 = "未知的错误"
            java.lang.String r1 = "mgr"
            java.lang.String r2 = "ht"
            java.lang.String r3 = "IO 操作异常 - IOException"
            r4 = 6
            r5 = 2
            r6 = 7
            r7 = 9
            r8 = 0
            r13.z(r14)     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            java.lang.String r9 = r13.l     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            java.util.Map r10 = r14.getParams()     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            java.lang.String r9 = g(r9, r10)     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            r13.l = r9     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            java.lang.String r10 = r13.f4168j     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            com.amap.api.col.3l.a7 r9 = com.amap.api.col.p0003l.w6.o(r9, r10)     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            if (r9 == 0) goto L2b
            com.amap.api.col.3l.x6$f r14 = r13.s
            r14.i()
            return r9
        L2b:
            r9 = 0
            r10 = 1
            com.amap.api.col.3l.x6$b r9 = r13.b(r14, r9, r10)     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            java.net.HttpURLConnection r8 = r9.a     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            com.amap.api.col.3l.x6$f r10 = r13.s     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            r10.f4192b = r11     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            r8.connect()     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            com.amap.api.col.3l.x6$f r10 = r13.s     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            r10.a()     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            boolean r14 = r14.isIgnoreGZip()     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            com.amap.api.col.3l.a7 r14 = r13.c(r9, r14)     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            com.amap.api.col.3l.x6$f r9 = r13.s     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            r9.e(r14)     // Catch: com.amap.api.col.p0003l.fk -> L5e java.net.SocketTimeoutException -> L60 java.net.SocketException -> L62 org.apache.http.conn.ConnectTimeoutException -> L64 javax.net.ssl.SSLException -> L67 java.net.ConnectException -> L6a java.lang.Throwable -> L6d java.io.IOException -> L93 java.io.InterruptedIOException -> L9e java.net.UnknownHostException -> Ldc java.net.MalformedURLException -> Le9
            r8.disconnect()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r2, r1)
        L58:
            com.amap.api.col.3l.x6$f r0 = r13.s
            r0.i()
            return r14
        L5e:
            r14 = move-exception
            goto L7b
        L60:
            r14 = move-exception
            goto Lb0
        L62:
            r14 = move-exception
            goto Lc6
        L64:
            r14 = move-exception
            goto Lf8
        L67:
            r14 = move-exception
            goto L10c
        L6a:
            r14 = move-exception
            goto L121
        L6d:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r14.b(r7)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        L78:
            r14 = move-exception
            goto L137
        L7b:
            boolean r0 = r14.i()     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L92
            int r0 = r14.g()     // Catch: java.lang.Throwable -> L78
            r3 = 10
            if (r0 == r3) goto L92
            com.amap.api.col.3l.x6$f r0 = r13.s     // Catch: java.lang.Throwable -> L78
            int r3 = r14.f()     // Catch: java.lang.Throwable -> L78
            r0.b(r3)     // Catch: java.lang.Throwable -> L78
        L92:
            throw r14     // Catch: java.lang.Throwable -> L78
        L93:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r14.b(r6)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        L9e:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r3 = 7101(0x1bbd, float:9.95E-42)
            r14.g(r3)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r14.b(r6)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        Lb0:
            com.amap.api.col.3l.x6$f r0 = r13.s     // Catch: java.lang.Throwable -> L78
            int r14 = a(r14)     // Catch: java.lang.Throwable -> L78
            r0.g(r14)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r14.b(r5)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "socket 连接超时 - SocketTimeoutException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        Lc6:
            com.amap.api.col.3l.x6$f r0 = r13.s     // Catch: java.lang.Throwable -> L78
            int r14 = a(r14)     // Catch: java.lang.Throwable -> L78
            r0.g(r14)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r14.b(r4)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "socket 连接异常 - SocketException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        Ldc:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r14.b(r7)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "未知主机 - UnKnowHostException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        Le9:
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r0 = 8
            r14.b(r0)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "url异常 - MalformedURLException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        Lf8:
            com.amap.api.col.3l.x6$f r0 = r13.s     // Catch: java.lang.Throwable -> L78
            int r14 = a(r14)     // Catch: java.lang.Throwable -> L78
            r0.g(r14)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r14.b(r5)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        L10c:
            com.amap.api.col.3l.x6$f r0 = r13.s     // Catch: java.lang.Throwable -> L78
            int r14 = a(r14)     // Catch: java.lang.Throwable -> L78
            r0.g(r14)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r0 = 4
            r14.b(r0)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        L121:
            com.amap.api.col.3l.x6$f r0 = r13.s     // Catch: java.lang.Throwable -> L78
            int r14 = a(r14)     // Catch: java.lang.Throwable -> L78
            r0.g(r14)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.x6$f r14 = r13.s     // Catch: java.lang.Throwable -> L78
            r14.b(r4)     // Catch: java.lang.Throwable -> L78
            com.amap.api.col.3l.fk r14 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "http连接失败 - ConnectionException"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L78
        L137:
            if (r8 == 0) goto L141
            r8.disconnect()     // Catch: java.lang.Throwable -> L13d
            goto L141
        L13d:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r2, r1)
        L141:
            com.amap.api.col.3l.x6$f r0 = r13.s
            r0.i()
            throw r14
    }

    final void t(long r1) {
            r0 = this;
            r0.f4163e = r1
            return
    }

    final com.amap.api.col.p0003l.a7 x(com.amap.api.col.p0003l.Cif r15) throws com.amap.api.col.p0003l.fk {
            r14 = this;
            java.lang.String r0 = "未知的错误"
            java.lang.String r1 = "IO 操作异常 - IOException"
            java.lang.String r2 = "mPt"
            java.lang.String r3 = "ht"
            r4 = 6
            r5 = 2
            r6 = 7
            r7 = 0
            r14.z(r15)     // Catch: java.lang.Throwable -> Ldd com.amap.api.col.p0003l.fk -> Ldf java.net.SocketTimeoutException -> Le1 java.net.SocketException -> Le3 org.apache.http.conn.ConnectTimeoutException -> Le5 java.net.ConnectException -> Le8 javax.net.ssl.SSLException -> Leb java.io.IOException -> L11c java.io.InterruptedIOException -> L127 java.net.UnknownHostException -> L165 java.net.MalformedURLException -> L173
            java.lang.String r8 = r14.l     // Catch: java.lang.Throwable -> Ldd com.amap.api.col.p0003l.fk -> Ldf java.net.SocketTimeoutException -> Le1 java.net.SocketException -> Le3 org.apache.http.conn.ConnectTimeoutException -> Le5 java.net.ConnectException -> Le8 javax.net.ssl.SSLException -> Leb java.io.IOException -> L11c java.io.InterruptedIOException -> L127 java.net.UnknownHostException -> L165 java.net.MalformedURLException -> L173
            java.lang.String r9 = r14.f4168j     // Catch: java.lang.Throwable -> Ldd com.amap.api.col.p0003l.fk -> Ldf java.net.SocketTimeoutException -> Le1 java.net.SocketException -> Le3 org.apache.http.conn.ConnectTimeoutException -> Le5 java.net.ConnectException -> Le8 javax.net.ssl.SSLException -> Leb java.io.IOException -> L11c java.io.InterruptedIOException -> L127 java.net.UnknownHostException -> L165 java.net.MalformedURLException -> L173
            com.amap.api.col.3l.a7 r8 = com.amap.api.col.p0003l.w6.o(r8, r9)     // Catch: java.lang.Throwable -> Ldd com.amap.api.col.p0003l.fk -> Ldf java.net.SocketTimeoutException -> Le1 java.net.SocketException -> Le3 org.apache.http.conn.ConnectTimeoutException -> Le5 java.net.ConnectException -> Le8 javax.net.ssl.SSLException -> Leb java.io.IOException -> L11c java.io.InterruptedIOException -> L127 java.net.UnknownHostException -> L165 java.net.MalformedURLException -> L173
            if (r8 == 0) goto L1f
            com.amap.api.col.3l.x6$f r15 = r14.s
            r15.i()
            return r8
        L1f:
            r8 = 1
            com.amap.api.col.3l.x6$b r8 = r14.b(r15, r8, r8)     // Catch: java.lang.Throwable -> Ldd com.amap.api.col.p0003l.fk -> Ldf java.net.SocketTimeoutException -> Le1 java.net.SocketException -> Le3 org.apache.http.conn.ConnectTimeoutException -> Le5 java.net.ConnectException -> Le8 javax.net.ssl.SSLException -> Leb java.io.IOException -> L11c java.io.InterruptedIOException -> L127 java.net.UnknownHostException -> L165 java.net.MalformedURLException -> L173
            java.net.HttpURLConnection r9 = r8.a     // Catch: java.lang.Throwable -> Ldd com.amap.api.col.p0003l.fk -> Ldf java.net.SocketTimeoutException -> Le1 java.net.SocketException -> Le3 org.apache.http.conn.ConnectTimeoutException -> Le5 java.net.ConnectException -> Le8 javax.net.ssl.SSLException -> Leb java.io.IOException -> L11c java.io.InterruptedIOException -> L127 java.net.UnknownHostException -> L165 java.net.MalformedURLException -> L173
            com.amap.api.col.3l.x6$f r10 = r14.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            r10.f4192b = r11     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            r9.connect()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            com.amap.api.col.3l.x6$f r10 = r14.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            r10.a()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            byte[] r10 = r15.getEntityBytes()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            if (r10 == 0) goto L65
            int r11 = r10.length     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            if (r11 != 0) goto L82
            goto L65
        L40:
            r15 = move-exception
            r7 = r9
            goto Lee
        L44:
            r15 = move-exception
            r7 = r9
            goto L101
        L48:
            r7 = r9
            goto L11c
        L4b:
            r15 = move-exception
            r7 = r9
            goto L139
        L4f:
            r15 = move-exception
            r7 = r9
            goto L14f
        L53:
            r7 = r9
            goto L165
        L56:
            r7 = r9
            goto L173
        L59:
            r15 = move-exception
            r7 = r9
            goto L182
        L5d:
            r15 = move-exception
            r7 = r9
            goto L196
        L61:
            r15 = move-exception
            r7 = r9
            goto L1ac
        L65:
            java.util.Map r11 = r15.getParams()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            java.util.HashMap<java.lang.String, java.lang.String> r12 = com.amap.api.col.p0003l.s6.f3976e     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            if (r12 == 0) goto L74
            if (r11 == 0) goto L73
            r11.putAll(r12)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            goto L74
        L73:
            r11 = r12
        L74:
            java.lang.String r11 = i(r11)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            if (r12 != 0) goto L82
            byte[] r10 = com.amap.api.col.p0003l.q4.o(r11)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
        L82:
            if (r10 == 0) goto Lc0
            int r11 = r10.length     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            if (r11 <= 0) goto Lc0
            com.amap.api.col.3l.x6$f r11 = r14.s     // Catch: java.lang.Throwable -> Lae
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lae
            r11.f4192b = r12     // Catch: java.lang.Throwable -> Lae
            java.io.OutputStream r11 = r9.getOutputStream()     // Catch: java.lang.Throwable -> Lae
            java.io.DataOutputStream r12 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> Lac
            r12.<init>(r11)     // Catch: java.lang.Throwable -> Lac
            r12.write(r10)     // Catch: java.lang.Throwable -> La9
            r12.close()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            if (r11 == 0) goto La3
            r11.close()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
        La3:
            com.amap.api.col.3l.x6$f r7 = r14.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            r7.f()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            goto Lc0
        La9:
            r15 = move-exception
            r7 = r12
            goto Lb0
        Lac:
            r15 = move-exception
            goto Lb0
        Lae:
            r15 = move-exception
            r11 = r7
        Lb0:
            if (r7 == 0) goto Lb5
            r7.close()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
        Lb5:
            if (r11 == 0) goto Lba
            r11.close()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
        Lba:
            com.amap.api.col.3l.x6$f r7 = r14.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            r7.f()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            throw r15     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
        Lc0:
            boolean r15 = r15.isIgnoreGZip()     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            com.amap.api.col.3l.a7 r15 = r14.c(r8, r15)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            com.amap.api.col.3l.x6$f r7 = r14.s     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            r7.e(r15)     // Catch: java.lang.Throwable -> L40 com.amap.api.col.p0003l.fk -> L44 java.io.IOException -> L48 java.net.SocketTimeoutException -> L4b java.net.SocketException -> L4f java.net.UnknownHostException -> L53 java.net.MalformedURLException -> L56 org.apache.http.conn.ConnectTimeoutException -> L59 java.net.ConnectException -> L5d javax.net.ssl.SSLException -> L61 java.io.InterruptedIOException -> Ldb
            r9.disconnect()     // Catch: java.lang.Throwable -> Ld1
            goto Ld5
        Ld1:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        Ld5:
            com.amap.api.col.3l.x6$f r0 = r14.s
            r0.i()
            return r15
        Ldb:
            r7 = r9
            goto L127
        Ldd:
            r15 = move-exception
            goto Lee
        Ldf:
            r15 = move-exception
            goto L101
        Le1:
            r15 = move-exception
            goto L139
        Le3:
            r15 = move-exception
            goto L14f
        Le5:
            r15 = move-exception
            goto L182
        Le8:
            r15 = move-exception
            goto L196
        Leb:
            r15 = move-exception
            goto L1ac
        Lee:
            com.amap.api.col.p0003l.r5.e(r15, r3, r2)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r1 = 9
            r15.b(r1)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            r15.<init>(r0)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        Lfe:
            r15 = move-exception
            goto L1c1
        L101:
            boolean r0 = r15.i()     // Catch: java.lang.Throwable -> Lfe
            if (r0 != 0) goto L118
            int r0 = r15.g()     // Catch: java.lang.Throwable -> Lfe
            r1 = 10
            if (r0 == r1) goto L118
            com.amap.api.col.3l.x6$f r0 = r14.s     // Catch: java.lang.Throwable -> Lfe
            int r1 = r15.g()     // Catch: java.lang.Throwable -> Lfe
            r0.b(r1)     // Catch: java.lang.Throwable -> Lfe
        L118:
            com.amap.api.col.p0003l.r5.e(r15, r3, r2)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L11c:
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r15.b(r6)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            r15.<init>(r1)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L127:
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r1 = 7101(0x1bbd, float:9.95E-42)
            r15.g(r1)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r15.b(r6)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            r15.<init>(r0)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L139:
            com.amap.api.col.3l.x6$f r0 = r14.s     // Catch: java.lang.Throwable -> Lfe
            int r15 = a(r15)     // Catch: java.lang.Throwable -> Lfe
            r0.g(r15)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r15.b(r5)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r0 = "socket 连接超时 - SocketTimeoutException"
            r15.<init>(r0)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L14f:
            com.amap.api.col.3l.x6$f r0 = r14.s     // Catch: java.lang.Throwable -> Lfe
            int r15 = a(r15)     // Catch: java.lang.Throwable -> Lfe
            r0.g(r15)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r15.b(r4)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r0 = "socket 连接异常 - SocketException"
            r15.<init>(r0)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L165:
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r0 = 5
            r15.b(r0)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r0 = "未知主机 - UnKnowHostException"
            r15.<init>(r0)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L173:
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r0 = 8
            r15.b(r0)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r0 = "url异常 - MalformedURLException"
            r15.<init>(r0)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L182:
            com.amap.api.col.3l.x6$f r0 = r14.s     // Catch: java.lang.Throwable -> Lfe
            int r15 = a(r15)     // Catch: java.lang.Throwable -> Lfe
            r0.g(r15)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r15.b(r5)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            r15.<init>(r1)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L196:
            com.amap.api.col.3l.x6$f r0 = r14.s     // Catch: java.lang.Throwable -> Lfe
            int r15 = a(r15)     // Catch: java.lang.Throwable -> Lfe
            r0.g(r15)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r15.b(r4)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r0 = "http连接失败 - ConnectionException"
            r15.<init>(r0)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L1ac:
            com.amap.api.col.3l.x6$f r0 = r14.s     // Catch: java.lang.Throwable -> Lfe
            int r15 = a(r15)     // Catch: java.lang.Throwable -> Lfe
            r0.g(r15)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.x6$f r15 = r14.s     // Catch: java.lang.Throwable -> Lfe
            r0 = 4
            r15.b(r0)     // Catch: java.lang.Throwable -> Lfe
            com.amap.api.col.3l.fk r15 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> Lfe
            r15.<init>(r1)     // Catch: java.lang.Throwable -> Lfe
            throw r15     // Catch: java.lang.Throwable -> Lfe
        L1c1:
            if (r7 == 0) goto L1cb
            r7.disconnect()     // Catch: java.lang.Throwable -> L1c7
            goto L1cb
        L1c7:
            r0 = move-exception
            com.amap.api.col.p0003l.r5.e(r0, r3, r2)
        L1cb:
            com.amap.api.col.3l.x6$f r0 = r14.s
            r0.i()
            throw r15
    }
}
