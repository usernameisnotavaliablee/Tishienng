package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class y0 {
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> A = null;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> B = null;
    private static java.util.ArrayList<com.amap.api.col.s.x2.a> C = null;
    private static volatile boolean D = false;
    private static java.util.Queue<com.amap.api.col.s.x2.c> E = null;
    public static int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f4857b = "";

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f4858c = "6";

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f4859d = "4";

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f4860e = "9";

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.String f4861f = "8";

    /* renamed from: g, reason: collision with root package name */
    public static android.content.Context f4862g = null;

    /* renamed from: h, reason: collision with root package name */
    private static volatile boolean f4863h = true;

    /* renamed from: i, reason: collision with root package name */
    private static java.util.Vector<com.amap.api.col.s.y0.f> f4864i;

    /* renamed from: j, reason: collision with root package name */
    private static java.util.Map<java.lang.String, java.lang.Integer> f4865j;

    /* renamed from: k, reason: collision with root package name */
    private static java.lang.String f4866k;
    private static long l;
    public static volatile boolean m;
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0.h> n;
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> o;
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0.e> p;
    private static boolean q;
    private static boolean r;
    public static int s;
    public static boolean t;
    public static boolean u;
    private static int v;
    public static boolean w;
    public static boolean x;
    private static int y;
    public static boolean z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.s.z3 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f4867b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.String f4868c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.lang.String f4869d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ java.lang.String f4870e;

        a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.f4867b = r1
                r0.f4868c = r2
                r0.f4869d = r3
                r0.f4870e = r4
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.s.z3
        public final void a() {
                r8 = this;
                java.util.concurrent.ConcurrentHashMap r0 = com.amap.api.col.s.y0.Q()
                java.lang.String r1 = r8.f4867b
                java.lang.Object r0 = r0.get(r1)
                com.amap.api.col.s.y0$e r0 = (com.amap.api.col.s.y0.e) r0
                if (r0 != 0) goto Lf
                goto L28
            Lf:
                com.amap.api.col.s.y0$b r1 = r0.f4882c
                com.amap.api.col.s.i1 r3 = r0.a
                java.lang.String r4 = r0.f4881b
                android.content.Context r2 = com.amap.api.col.s.y0.f4862g
                java.lang.String r5 = r8.f4868c
                java.lang.String r6 = r8.f4869d
                java.lang.String r7 = r8.f4870e
                com.amap.api.col.s.y0$c r0 = com.amap.api.col.s.y0.b(r2, r3, r4, r5, r6, r7)
                if (r0 == 0) goto L28
                if (r1 == 0) goto L28
                r1.a(r0)
            L28:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(com.amap.api.col.s.y0.c r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c {

        @java.lang.Deprecated
        public org.json.JSONObject a;

        /* renamed from: b, reason: collision with root package name */
        @java.lang.Deprecated
        public org.json.JSONObject f4871b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f4872c;

        /* renamed from: d, reason: collision with root package name */
        public int f4873d;

        /* renamed from: e, reason: collision with root package name */
        public long f4874e;

        /* renamed from: f, reason: collision with root package name */
        public org.json.JSONObject f4875f;

        /* renamed from: g, reason: collision with root package name */
        public com.amap.api.col.s.y0.c.a f4876g;

        /* renamed from: h, reason: collision with root package name */
        public com.amap.api.col.s.y0.c.b f4877h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f4878i;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class a {
            public boolean a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f4879b;

            /* renamed from: c, reason: collision with root package name */
            public org.json.JSONObject f4880c;

            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class b {
            public boolean a;

            public b() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public c() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.f4873d = r0
                r0 = 0
                r2.f4874e = r0
                return
        }

        static /* synthetic */ boolean a(com.amap.api.col.s.y0.c r0, boolean r1) {
                r0.f4878i = r1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d extends com.amap.api.col.s.v2 {
        private java.lang.String p;
        private java.util.Map<java.lang.String, java.lang.String> q;
        private java.lang.String r;
        private java.lang.String s;
        private java.lang.String t;

        d(android.content.Context r1, com.amap.api.col.s.i1 r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.p = r3
                r1 = 0
                r0.q = r1
                r0.r = r4
                r0.s = r5
                r0.t = r6
                com.amap.api.col.s.dz$c r1 = com.amap.api.col.s.dz.c.f4428b
                r0.g(r1)
                com.amap.api.col.s.dz$a r1 = com.amap.api.col.s.dz.a.f4416d
                r0.e(r1)
                return
        }

        private static java.lang.String P(java.lang.String r1, java.lang.String r2) {
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1a
                if (r0 != 0) goto L1a
                android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L1a
                android.net.Uri$Builder r0 = r0.buildUpon()     // Catch: java.lang.Throwable -> L1a
                android.net.Uri$Builder r2 = r0.encodedAuthority(r2)     // Catch: java.lang.Throwable -> L1a
                android.net.Uri r2 = r2.build()     // Catch: java.lang.Throwable -> L1a
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L1a
            L1a:
                return r1
        }

        @Override // com.amap.api.col.s.v2
        public final byte[] L() {
                r4 = this;
                android.content.Context r0 = r4.m
                java.lang.String r0 = com.amap.api.col.s.c1.K(r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L1d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.StringBuilder r0 = r1.reverse()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = com.amap.api.col.s.g1.a(r0)
            L1d:
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.lang.String r2 = r4.p
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L2d
                java.lang.String r2 = ""
                goto L2f
            L2d:
                java.lang.String r2 = r4.p
            L2f:
                java.lang.String r3 = "authkey"
                r1.put(r3, r2)
                java.lang.String r2 = "plattype"
                java.lang.String r3 = "android"
                r1.put(r2, r3)
                java.lang.String r2 = "ccver"
                java.lang.String r3 = "1"
                r1.put(r2, r3)
                com.amap.api.col.s.i1 r2 = r4.n
                java.lang.String r2 = r2.d()
                java.lang.String r3 = "product"
                r1.put(r3, r2)
                com.amap.api.col.s.i1 r2 = r4.n
                java.lang.String r2 = r2.e()
                java.lang.String r3 = "version"
                r1.put(r3, r2)
                java.lang.String r2 = "output"
                java.lang.String r3 = "json"
                r1.put(r2, r3)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r3 = android.os.Build.VERSION.SDK_INT
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "androidversion"
                r1.put(r3, r2)
                java.lang.String r2 = "deviceId"
                r1.put(r2, r0)
                java.lang.String r0 = "manufacture"
                java.lang.String r2 = android.os.Build.MANUFACTURER
                r1.put(r0, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r4.q
                if (r0 == 0) goto L8d
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L8d
                java.util.Map<java.lang.String, java.lang.String> r0 = r4.q
                r1.putAll(r0)
            L8d:
                android.content.Context r0 = r4.m
                java.lang.String r0 = com.amap.api.col.s.j1.d(r0)
                java.lang.String r2 = "abitype"
                r1.put(r2, r0)
                com.amap.api.col.s.i1 r0 = r4.n
                java.lang.String r0 = r0.g()
                java.lang.String r2 = "ext"
                r1.put(r2, r0)
                java.lang.String r0 = com.amap.api.col.s.j1.f(r1)
                byte[] r0 = com.amap.api.col.s.j1.o(r0)
                return r0
        }

        @Override // com.amap.api.col.s.v2
        protected final java.lang.String M() {
                r1 = this;
                java.lang.String r0 = "3.0"
                return r0
        }

        @Override // com.amap.api.col.s.f1, com.amap.api.col.s.dz
        public final java.lang.String a() {
                r2 = this;
                java.lang.String r0 = "https://dualstack-arestapi.amap.com/v3/iasdkauth"
                java.lang.String r1 = r2.s
                java.lang.String r0 = P(r0, r1)
                return r0
        }

        @Override // com.amap.api.col.s.dz
        public final java.lang.String h() {
                r2 = this;
                java.lang.String r0 = "https://restsdk.amap.com/v3/iasdkauth"
                java.lang.String r1 = r2.r
                java.lang.String r0 = P(r0, r1)
                return r0
        }

        @Override // com.amap.api.col.s.dz
        public final java.util.Map<java.lang.String, java.lang.String> p() {
                r3 = this;
                java.lang.String r0 = r3.t
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L15
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.String r1 = "host"
                java.lang.String r2 = r3.t
                r0.put(r1, r2)
                return r0
            L15:
                r0 = 0
                return r0
        }

        @Override // com.amap.api.col.s.dz
        protected final java.lang.String r() {
                r1 = this;
                java.lang.String r0 = r1.t
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto Lb
                java.lang.String r0 = r1.t
                return r0
            Lb:
                java.lang.String r0 = super.r()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e {
        com.amap.api.col.s.i1 a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f4881b;

        /* renamed from: c, reason: collision with root package name */
        com.amap.api.col.s.y0.b f4882c;

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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f4883b;

        /* renamed from: c, reason: collision with root package name */
        private java.util.concurrent.atomic.AtomicInteger f4884c;

        public f(java.lang.String r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f4883b = r2
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>(r3)
                r0.f4884c = r1
                return
        }

        static /* synthetic */ java.lang.String b(com.amap.api.col.s.y0.f r0) {
                java.lang.String r0 = r0.f4883b
                return r0
        }

        public static com.amap.api.col.s.y0.f d(java.lang.String r5) {
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
                r0.<init>(r5)     // Catch: java.lang.Throwable -> L25
                com.amap.api.col.s.y0$f r5 = new com.amap.api.col.s.y0$f     // Catch: java.lang.Throwable -> L25
                java.lang.String r2 = "a"
                java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Throwable -> L25
                java.lang.String r3 = "f"
                java.lang.String r3 = r0.optString(r3)     // Catch: java.lang.Throwable -> L25
                java.lang.String r4 = "h"
                int r0 = r0.optInt(r4)     // Catch: java.lang.Throwable -> L25
                r5.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> L25
                return r5
            L25:
                return r1
        }

        static /* synthetic */ java.util.concurrent.atomic.AtomicInteger f(com.amap.api.col.s.y0.f r0) {
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f4884c
                return r0
        }

        static /* synthetic */ java.lang.String g(com.amap.api.col.s.y0.f r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        public final int a() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f4884c
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.get()
                return r0
        }

        public final void c(java.lang.String r1) {
                r0 = this;
                r0.f4883b = r1
                return
        }

        public final java.lang.String e() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L23
                r0.<init>()     // Catch: java.lang.Throwable -> L23
                java.lang.String r1 = "a"
                java.lang.String r2 = r3.a     // Catch: java.lang.Throwable -> L23
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L23
                java.lang.String r1 = "f"
                java.lang.String r2 = r3.f4883b     // Catch: java.lang.Throwable -> L23
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L23
                java.lang.String r1 = "h"
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f4884c     // Catch: java.lang.Throwable -> L23
                int r2 = r2.get()     // Catch: java.lang.Throwable -> L23
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L23
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
                return r0
            L23:
                java.lang.String r0 = ""
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class g {
        public static boolean a = true;

        /* renamed from: b, reason: collision with root package name */
        public static boolean f4885b = false;

        /* renamed from: c, reason: collision with root package name */
        public static boolean f4886c = true;

        /* renamed from: d, reason: collision with root package name */
        public static int f4887d;

        /* renamed from: e, reason: collision with root package name */
        public static boolean f4888e;

        /* renamed from: f, reason: collision with root package name */
        public static int f4889f;

        static {
                return
        }

        public g() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class h {
        public long a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f4890b;

        h(java.lang.Long r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                java.lang.String r0 = ""
                r2.f4890b = r0
                long r0 = r3.longValue()
                r2.a = r0
                r2.f4890b = r4
                return
        }
    }

    static {
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            com.amap.api.col.s.y0.f4864i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.amap.api.col.s.y0.f4865j = r0
            r0 = 0
            com.amap.api.col.s.y0.f4866k = r0
            r0 = 0
            com.amap.api.col.s.y0.l = r0
            r0 = 0
            com.amap.api.col.s.y0.m = r0
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r2 = 8
            r1.<init>(r2)
            com.amap.api.col.s.y0.n = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>(r2)
            com.amap.api.col.s.y0.o = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>(r2)
            com.amap.api.col.s.y0.p = r1
            com.amap.api.col.s.y0.q = r0
            com.amap.api.col.s.y0.r = r0
            r1 = 5000(0x1388, float:7.006E-42)
            com.amap.api.col.s.y0.s = r1
            r1 = 1
            com.amap.api.col.s.y0.t = r1
            com.amap.api.col.s.y0.u = r0
            r2 = 3
            com.amap.api.col.s.y0.v = r2
            com.amap.api.col.s.y0.w = r1
            com.amap.api.col.s.y0.x = r0
            com.amap.api.col.s.y0.y = r2
            com.amap.api.col.s.y0.z = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.amap.api.col.s.y0.A = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.amap.api.col.s.y0.B = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.amap.api.col.s.y0.C = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.amap.api.col.s.y0.E = r0
            return
    }

    public y0() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void A(android.content.Context r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "a2"
            r1 = 1
            java.lang.String r2 = "open_common"
            boolean r3 = com.amap.api.col.s.j2.l(r3, r2, r0, r1)
            com.amap.api.col.s.y0.f4863h = r3
            return
    }

    public static void B(com.amap.api.col.s.x2.c r8) {
            java.util.ArrayList<com.amap.api.col.s.x2$a> r0 = com.amap.api.col.s.y0.C
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L5:
            java.util.ArrayList<com.amap.api.col.s.x2$a> r3 = com.amap.api.col.s.y0.C     // Catch: java.lang.Throwable -> L4c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L4c
            if (r1 >= r3) goto L56
            java.util.ArrayList<com.amap.api.col.s.x2$a> r3 = com.amap.api.col.s.y0.C     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L4c
            com.amap.api.col.s.x2$a r3 = (com.amap.api.col.s.x2.a) r3     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r8.f4818c     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = r3.f4807b     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L53
            java.lang.String r4 = r8.f4819d     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = r3.f4810e     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L53
            int r4 = r8.m     // Catch: java.lang.Throwable -> L4c
            int r5 = r3.f4811f     // Catch: java.lang.Throwable -> L4c
            if (r4 != r5) goto L53
            r2 = 1
            if (r5 != r2) goto L4e
            java.util.concurrent.atomic.AtomicInteger r4 = r3.f4815j     // Catch: java.lang.Throwable -> L4c
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L4c
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L4c
            long r6 = r3.f4814i     // Catch: java.lang.Throwable -> L4c
            long r4 = r4 * r6
            long r6 = r8.f4821f     // Catch: java.lang.Throwable -> L4c
            long r4 = r4 + r6
            java.util.concurrent.atomic.AtomicInteger r6 = r3.f4815j     // Catch: java.lang.Throwable -> L4c
            int r6 = r6.get()     // Catch: java.lang.Throwable -> L4c
            int r6 = r6 + r2
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L4c
            long r4 = r4 / r6
            r3.f4814i = r4     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L67
        L4e:
            java.util.concurrent.atomic.AtomicInteger r3 = r3.f4815j     // Catch: java.lang.Throwable -> L4c
            r3.getAndIncrement()     // Catch: java.lang.Throwable -> L4c
        L53:
            int r1 = r1 + 1
            goto L5
        L56:
            if (r2 != 0) goto L62
            java.util.ArrayList<com.amap.api.col.s.x2$a> r1 = com.amap.api.col.s.y0.C     // Catch: java.lang.Throwable -> L4c
            com.amap.api.col.s.x2$a r2 = new com.amap.api.col.s.x2$a     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L4c
            r1.add(r2)     // Catch: java.lang.Throwable -> L4c
        L62:
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r8
    }

    public static synchronized void C(java.lang.String r2, boolean r3) {
            java.lang.Class<com.amap.api.col.s.y0> r0 = com.amap.api.col.s.y0.class
            monitor-enter(r0)
            r1 = 0
            o(r2, r3, r1, r1, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public static boolean D() {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = com.amap.api.col.s.c1.I(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L11
            return r1
        L11:
            java.util.Map<java.lang.String, java.lang.Integer> r2 = com.amap.api.col.s.y0.f4865j
            java.lang.String r0 = r0.toUpperCase()
            java.lang.Object r0 = r2.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L20
            return r1
        L20:
            int r0 = r0.intValue()
            r2 = 2
            if (r0 < r2) goto L29
            r0 = 1
            return r0
        L29:
            return r1
    }

    public static java.lang.String E(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ";15K;16H;17I;1A4;17S;183"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L17:
            return r1
    }

    public static void F() {
            java.lang.String r0 = "IPV6_CONFIG_NAME"
            java.lang.String r1 = "open_common"
            android.content.Context r2 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L35
            com.amap.api.col.s.y0$f r2 = c(r2, r0, r1)     // Catch: java.lang.Throwable -> L35
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "yyyyMMdd"
            java.lang.String r3 = com.amap.api.col.s.j1.c(r3, r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = com.amap.api.col.s.y0.f.b(r2)     // Catch: java.lang.Throwable -> L35
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L29
            r2.c(r3)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.atomic.AtomicInteger r3 = com.amap.api.col.s.y0.f.f(r2)     // Catch: java.lang.Throwable -> L35
            r4 = 0
            r3.set(r4)     // Catch: java.lang.Throwable -> L35
        L29:
            java.util.concurrent.atomic.AtomicInteger r3 = com.amap.api.col.s.y0.f.f(r2)     // Catch: java.lang.Throwable -> L35
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L35
            android.content.Context r3 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L35
            j(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }

    private static void G(android.content.Context r4) {
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "a13"
            java.lang.String r1 = "open_common"
            r2 = 1
            boolean r0 = com.amap.api.col.s.j2.l(r4, r1, r0, r2)
            com.amap.api.col.s.y0.t = r0
            java.lang.String r0 = "a6"
            boolean r0 = com.amap.api.col.s.j2.l(r4, r1, r0, r2)
            com.amap.api.col.s.y0.w = r0
            java.lang.String r0 = "a7"
            r2 = 0
            boolean r0 = com.amap.api.col.s.j2.l(r4, r1, r0, r2)
            com.amap.api.col.s.y0.u = r0
            java.lang.String r0 = "a8"
            r3 = 5000(0x1388, float:7.006E-42)
            int r0 = com.amap.api.col.s.j2.a(r4, r1, r0, r3)
            com.amap.api.col.s.y0.s = r0
            java.lang.String r0 = "a9"
            r3 = 3
            int r0 = com.amap.api.col.s.j2.a(r4, r1, r0, r3)
            com.amap.api.col.s.y0.v = r0
            java.lang.String r0 = "a10"
            boolean r0 = com.amap.api.col.s.j2.l(r4, r1, r0, r2)
            com.amap.api.col.s.y0.x = r0
            java.lang.String r0 = "a11"
            int r0 = com.amap.api.col.s.j2.a(r4, r1, r0, r3)
            com.amap.api.col.s.y0.y = r0
            java.lang.String r0 = "a12"
            boolean r4 = com.amap.api.col.s.j2.l(r4, r1, r0, r2)
            com.amap.api.col.s.y0.z = r4
            return
    }

    public static void H(com.amap.api.col.s.x2.c r2) {
            if (r2 != 0) goto L3
            goto L7
        L3:
            boolean r0 = com.amap.api.col.s.y0.z
            if (r0 != 0) goto L8
        L7:
            return
        L8:
            java.util.Queue<com.amap.api.col.s.x2$c> r0 = com.amap.api.col.s.y0.E
            monitor-enter(r0)
            java.util.Queue<com.amap.api.col.s.x2$c> r1 = com.amap.api.col.s.y0.E     // Catch: java.lang.Throwable -> L15
            r1.offer(r2)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    public static void I() {
            java.lang.String r0 = "open_common"
            boolean r1 = com.amap.api.col.s.y0.m
            if (r1 == 0) goto L7
            goto L58
        L7:
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto Lc
            goto L58
        Lc:
            r2 = 1
            com.amap.api.col.s.y0.m = r2     // Catch: java.lang.Throwable -> L58
            com.amap.api.col.s.e1 r2 = com.amap.api.col.s.e1.a()     // Catch: java.lang.Throwable -> L58
            r2.c(r1)     // Catch: java.lang.Throwable -> L58
            A(r1)     // Catch: java.lang.Throwable -> L58
            G(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "ucf"
            boolean r3 = com.amap.api.col.s.y0.g.a     // Catch: java.lang.Throwable -> L58
            boolean r2 = com.amap.api.col.s.j2.l(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            com.amap.api.col.s.y0.g.a = r2     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "fsv2"
            boolean r3 = com.amap.api.col.s.y0.g.f4885b     // Catch: java.lang.Throwable -> L58
            boolean r2 = com.amap.api.col.s.j2.l(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            com.amap.api.col.s.y0.g.f4885b = r2     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "usc"
            boolean r3 = com.amap.api.col.s.y0.g.f4886c     // Catch: java.lang.Throwable -> L58
            boolean r2 = com.amap.api.col.s.j2.l(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            com.amap.api.col.s.y0.g.f4886c = r2     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "umv"
            int r3 = com.amap.api.col.s.y0.g.f4887d     // Catch: java.lang.Throwable -> L58
            int r2 = com.amap.api.col.s.j2.a(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            com.amap.api.col.s.y0.g.f4887d = r2     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "ust"
            boolean r3 = com.amap.api.col.s.y0.g.f4888e     // Catch: java.lang.Throwable -> L58
            boolean r2 = com.amap.api.col.s.j2.l(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            com.amap.api.col.s.y0.g.f4888e = r2     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "ustv"
            int r3 = com.amap.api.col.s.y0.g.f4889f     // Catch: java.lang.Throwable -> L58
            int r0 = com.amap.api.col.s.j2.a(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            com.amap.api.col.s.y0.g.f4889f = r0     // Catch: java.lang.Throwable -> L58
        L58:
            return
    }

    private static void J(android.content.Context r3) {
            java.lang.String r0 = "open_common"
            boolean r1 = com.amap.api.col.s.y0.q     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L7
            goto L1a
        L7:
            java.lang.String r1 = "a4"
            r2 = 1
            boolean r1 = com.amap.api.col.s.j2.l(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.s.s1.f4676e = r1     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "a5"
            boolean r3 = com.amap.api.col.s.j2.l(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.s.s1.f4677f = r3     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.s.y0.q = r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    public static synchronized boolean K(java.lang.String r5) {
            java.lang.Class<com.amap.api.col.s.y0> r0 = com.amap.api.col.s.y0.class
            monitor-enter(r0)
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto Lc
            monitor-exit(r0)
            return r1
        Lc:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r2 = com.amap.api.col.s.y0.p     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L12
            monitor-exit(r0)
            return r1
        L12:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L20
            r3 = 8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.y0.o = r2     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r5 = move-exception
            goto L42
        L22:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r2 = com.amap.api.col.s.y0.p     // Catch: java.lang.Throwable -> L20
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L49
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L20
            boolean r2 = r2.containsKey(r5)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L49
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L20
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L20
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L20
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            r5 = 1
            return r5
        L42:
            java.lang.String r2 = "at"
            java.lang.String r3 = "cslct"
            com.amap.api.col.s.d2.e(r5, r2, r3)     // Catch: java.lang.Throwable -> L4b
        L49:
            monitor-exit(r0)
            return r1
        L4b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r5
    }

    public static com.amap.api.col.s.x2.a L() {
            boolean r0 = com.amap.api.col.s.y0.D
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.util.ArrayList<com.amap.api.col.s.x2$a> r0 = com.amap.api.col.s.y0.C
            monitor-enter(r0)
            boolean r2 = com.amap.api.col.s.y0.D     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            goto L32
        L11:
            java.util.ArrayList<com.amap.api.col.s.x2$a> r2 = com.amap.api.col.s.y0.C     // Catch: java.lang.Throwable -> Lf
            java.util.Collections.sort(r2)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList<com.amap.api.col.s.x2$a> r2 = com.amap.api.col.s.y0.C     // Catch: java.lang.Throwable -> Lf
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lf
            if (r2 <= 0) goto L30
            java.util.ArrayList<com.amap.api.col.s.x2$a> r1 = com.amap.api.col.s.y0.C     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lf
            com.amap.api.col.s.x2$a r1 = (com.amap.api.col.s.x2.a) r1     // Catch: java.lang.Throwable -> Lf
            com.amap.api.col.s.x2$a r1 = r1.a()     // Catch: java.lang.Throwable -> Lf
            r2 = 1
            com.amap.api.col.s.y0.D = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    private static void M(android.content.Context r5) {
            java.lang.String r0 = "open_common"
            boolean r1 = com.amap.api.col.s.y0.r     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L7
            goto L22
        L7:
            java.lang.String r1 = "a16"
            java.lang.String r2 = ""
            java.lang.String r1 = com.amap.api.col.s.j2.o(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L22
            r2 = 1
            boolean r1 = u(r1, r2)     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.s.l1.f4556d = r1     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "a17"
            long r3 = com.amap.api.col.s.l1.a     // Catch: java.lang.Throwable -> L22
            long r0 = com.amap.api.col.s.j2.b(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.s.l1.f4554b = r0     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.s.y0.r = r2     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    public static synchronized void N(java.lang.String r2) {
            java.lang.Class<com.amap.api.col.s.y0> r0 = com.amap.api.col.s.y0.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r1 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L9
            monitor-exit(r0)
            return
        L9:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r1 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r1 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L17
            r1.remove(r2)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public static synchronized com.amap.api.col.s.y0.h O(java.lang.String r3) {
            java.lang.Class<com.amap.api.col.s.y0> r0 = com.amap.api.col.s.y0.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$h> r1 = com.amap.api.col.s.y0.n     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L11
            r2 = 8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.s.y0.n = r1     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r3 = move-exception
            goto L25
        L13:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$h> r1 = com.amap.api.col.s.y0.n     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L2c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$h> r1 = com.amap.api.col.s.y0.n     // Catch: java.lang.Throwable -> L11
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.s.y0$h r3 = (com.amap.api.col.s.y0.h) r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r3
        L25:
            java.lang.String r1 = "at"
            java.lang.String r2 = "glcut"
            com.amap.api.col.s.d2.e(r3, r1, r2)     // Catch: java.lang.Throwable -> L3b
        L2c:
            com.amap.api.col.s.y0$h r3 = new com.amap.api.col.s.y0$h     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = ""
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)
            return r3
        L3b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r3
    }

    public static com.amap.api.col.s.x2.c P() {
            java.util.Queue<com.amap.api.col.s.x2$c> r0 = com.amap.api.col.s.y0.E
            monitor-enter(r0)
            java.util.Queue<com.amap.api.col.s.x2$c> r1 = com.amap.api.col.s.y0.E     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> Lf
            com.amap.api.col.s.x2$c r1 = (com.amap.api.col.s.x2.c) r1     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            goto L14
        L11:
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    static /* synthetic */ java.util.concurrent.ConcurrentHashMap Q() {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r0 = com.amap.api.col.s.y0.p
            return r0
    }

    public static boolean R(java.lang.String r4) {
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L8
            return r0
        L8:
            boolean r1 = com.amap.api.col.s.y0.t     // Catch: java.lang.Throwable -> L34
            r2 = 0
            if (r1 != 0) goto Le
            return r2
        Le:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r1 = com.amap.api.col.s.y0.A     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L33
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L1b
            return r0
        L1b:
            java.lang.String r3 = "a14"
            java.lang.String r4 = y(r4, r3)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "open_common"
            com.amap.api.col.s.y0$f r4 = c(r1, r4, r3)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L2a
            return r0
        L2a:
            int r4 = r4.a()     // Catch: java.lang.Throwable -> L34
            int r1 = com.amap.api.col.s.y0.v     // Catch: java.lang.Throwable -> L34
            if (r4 >= r1) goto L33
            return r0
        L33:
            return r2
        L34:
            return r0
    }

    private static void S() {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto L37
            java.lang.String r0 = com.amap.api.col.s.c1.I(r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = com.amap.api.col.s.y0.f4866k     // Catch: java.lang.Throwable -> Lee
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lee
            if (r1 != 0) goto L2e
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lee
            if (r1 != 0) goto L2e
            java.lang.String r1 = com.amap.api.col.s.y0.f4866k     // Catch: java.lang.Throwable -> Lee
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto L2e
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lee
            long r3 = com.amap.api.col.s.y0.l     // Catch: java.lang.Throwable -> Lee
            long r1 = r1 - r3
            r3 = 60000(0xea60, double:2.9644E-319)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2e
            goto Led
        L2e:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lee
            if (r1 != 0) goto L46
            com.amap.api.col.s.y0.f4866k = r0     // Catch: java.lang.Throwable -> Lee
            goto L46
        L37:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lee
            long r2 = com.amap.api.col.s.y0.l     // Catch: java.lang.Throwable -> Lee
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L46
            goto Led
        L46:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lee
            com.amap.api.col.s.y0.l = r0     // Catch: java.lang.Throwable -> Lee
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.amap.api.col.s.y0.f4865j     // Catch: java.lang.Throwable -> Lee
            r0.clear()     // Catch: java.lang.Throwable -> Lee
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> Lee
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.lang.Throwable -> Lee
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lee
        L5d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto Led
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lee
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.lang.Throwable -> Lee
            java.util.List r2 = r1.getInterfaceAddresses()     // Catch: java.lang.Throwable -> Lee
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lee
            if (r2 != 0) goto L5d
            java.lang.String r2 = r1.getDisplayName()     // Catch: java.lang.Throwable -> Lee
            java.util.List r1 = r1.getInterfaceAddresses()     // Catch: java.lang.Throwable -> Lee
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lee
            r3 = 0
        L80:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> Lee
            if (r4 == 0) goto Lbe
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> Lee
            java.net.InterfaceAddress r4 = (java.net.InterfaceAddress) r4     // Catch: java.lang.Throwable -> Lee
            java.net.InetAddress r4 = r4.getAddress()     // Catch: java.lang.Throwable -> Lee
            boolean r5 = r4 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> Lee
            if (r5 == 0) goto L9f
            java.net.Inet6Address r4 = (java.net.Inet6Address) r4     // Catch: java.lang.Throwable -> Lee
            boolean r4 = v(r4)     // Catch: java.lang.Throwable -> Lee
            if (r4 != 0) goto L80
            r3 = r3 | 2
            goto L80
        L9f:
            boolean r5 = r4 instanceof java.net.Inet4Address     // Catch: java.lang.Throwable -> Lee
            if (r5 == 0) goto L80
            java.net.Inet4Address r4 = (java.net.Inet4Address) r4     // Catch: java.lang.Throwable -> Lee
            boolean r5 = v(r4)     // Catch: java.lang.Throwable -> Lee
            if (r5 != 0) goto L80
            java.lang.String r4 = r4.getHostAddress()     // Catch: java.lang.Throwable -> Lee
            java.lang.String r5 = "FMTkyLjE2OC40My4"
            java.lang.String r5 = com.amap.api.col.s.j1.t(r5)     // Catch: java.lang.Throwable -> Lee
            boolean r4 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> Lee
            if (r4 != 0) goto L80
            r3 = r3 | 1
            goto L80
        Lbe:
            if (r3 == 0) goto L5d
            if (r2 == 0) goto Ld6
            java.lang.String r1 = "wlan"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto Ld6
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.amap.api.col.s.y0.f4865j     // Catch: java.lang.Throwable -> Lee
            java.lang.String r2 = "WIFI"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lee
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lee
            goto L5d
        Ld6:
            if (r2 == 0) goto L5d
            java.lang.String r1 = "rmnet"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto L5d
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.amap.api.col.s.y0.f4865j     // Catch: java.lang.Throwable -> Lee
            java.lang.String r2 = "MOBILE"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lee
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lee
            goto L5d
        Led:
            return
        Lee:
            r0 = move-exception
            java.lang.String r1 = "at"
            java.lang.String r2 = "ipstack"
            com.amap.api.col.s.d2.e(r0, r1, r2)
            return
    }

    public static boolean T(java.lang.String r4) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L8
            return r0
        L8:
            boolean r1 = com.amap.api.col.s.y0.x     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r1 = com.amap.api.col.s.y0.B     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L33
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L33
            r2 = 1
            if (r1 != 0) goto L1b
            return r2
        L1b:
            java.lang.String r3 = "a15"
            java.lang.String r4 = y(r4, r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "open_common"
            com.amap.api.col.s.y0$f r4 = c(r1, r4, r3)     // Catch: java.lang.Throwable -> L33
            if (r4 != 0) goto L2a
            return r2
        L2a:
            int r4 = r4.a()     // Catch: java.lang.Throwable -> L33
            int r1 = com.amap.api.col.s.y0.y     // Catch: java.lang.Throwable -> L33
            if (r4 >= r1) goto L33
            return r2
        L33:
            return r0
    }

    private static boolean U() {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = com.amap.api.col.s.c1.I(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L11
            return r1
        L11:
            java.util.Map<java.lang.String, java.lang.Integer> r2 = com.amap.api.col.s.y0.f4865j
            java.lang.String r0 = r0.toUpperCase()
            java.lang.Object r0 = r2.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L20
            return r1
        L20:
            int r0 = r0.intValue()
            r2 = 2
            if (r0 != r2) goto L29
            r0 = 1
            return r0
        L29:
            return r1
    }

    public static long a(java.util.List<java.lang.String> r2) {
            if (r2 == 0) goto L1e
            int r0 = r2.size()     // Catch: java.lang.Exception -> L1e
            if (r0 <= 0) goto L1e
            r0 = 0
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L1e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1e
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1e
            if (r0 != 0) goto L1e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L1e
            long r0 = r2.longValue()     // Catch: java.lang.Exception -> L1e
            return r0
        L1e:
            r0 = 0
            return r0
    }

    public static com.amap.api.col.s.y0.c b(android.content.Context r0, com.amap.api.col.s.i1 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            com.amap.api.col.s.y0$c r0 = w(r0, r1, r2, r3, r4, r5)
            return r0
    }

    private static synchronized com.amap.api.col.s.y0.f c(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
            java.lang.Class<com.amap.api.col.s.y0> r0 = com.amap.api.col.s.y0.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L2e
            r1 = 0
        Lc:
            java.util.Vector<com.amap.api.col.s.y0$f> r4 = com.amap.api.col.s.y0.f4864i     // Catch: java.lang.Throwable -> L29
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L29
            if (r1 >= r4) goto L2e
            java.util.Vector<com.amap.api.col.s.y0$f> r4 = com.amap.api.col.s.y0.f4864i     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.s.y0$f r4 = (com.amap.api.col.s.y0.f) r4     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L2b
            java.lang.String r5 = com.amap.api.col.s.y0.f.g(r4)     // Catch: java.lang.Throwable -> L29
            boolean r5 = r7.equals(r5)     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L2b
            goto L2f
        L29:
            r6 = move-exception
            goto L6d
        L2b:
            int r1 = r1 + 1
            goto Lc
        L2e:
            r4 = r2
        L2f:
            if (r4 == 0) goto L33
            monitor-exit(r0)
            return r4
        L33:
            if (r6 != 0) goto L37
            monitor-exit(r0)
            return r2
        L37:
            java.lang.String r1 = ""
            java.lang.String r6 = com.amap.api.col.s.j2.o(r6, r8, r7, r1)     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.s.y0$f r6 = com.amap.api.col.s.y0.f.d(r6)     // Catch: java.lang.Throwable -> L29
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L29
            java.lang.String r8 = "yyyyMMdd"
            java.lang.String r8 = com.amap.api.col.s.j1.c(r1, r8)     // Catch: java.lang.Throwable -> L29
            if (r6 != 0) goto L52
            com.amap.api.col.s.y0$f r6 = new com.amap.api.col.s.y0$f     // Catch: java.lang.Throwable -> L29
            r6.<init>(r7, r8, r3)     // Catch: java.lang.Throwable -> L29
        L52:
            java.lang.String r7 = com.amap.api.col.s.y0.f.b(r6)     // Catch: java.lang.Throwable -> L29
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L29
            if (r7 != 0) goto L66
            r6.c(r8)     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.atomic.AtomicInteger r7 = com.amap.api.col.s.y0.f.f(r6)     // Catch: java.lang.Throwable -> L29
            r7.set(r3)     // Catch: java.lang.Throwable -> L29
        L66:
            java.util.Vector<com.amap.api.col.s.y0$f> r7 = com.amap.api.col.s.y0.f4864i     // Catch: java.lang.Throwable -> L29
            r7.add(r6)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)
            return r6
        L6d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r6
    }

    public static java.lang.String d(java.lang.String r1) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r0 = com.amap.api.col.s.y0.p
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L15
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r0 = com.amap.api.col.s.y0.p
            java.lang.Object r1 = r0.get(r1)
            com.amap.api.col.s.y0$e r1 = (com.amap.api.col.s.y0.e) r1
            if (r1 == 0) goto L15
            java.lang.String r1 = r1.f4881b
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static void e(android.content.Context r0) {
            if (r0 == 0) goto Lc
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.amap.api.col.s.y0.f4862g = r0
        Lc:
            return
    }

    private static void f(android.content.Context r3, com.amap.api.col.s.i1 r4, java.lang.String r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "amap_sdk_auth_fail"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.lang.String r1 = "amap_sdk_auth_fail_type"
            r0.put(r1, r5)
            java.lang.String r5 = "amap_sdk_name"
            java.lang.String r1 = r4.d()
            r0.put(r5, r1)
            java.lang.String r5 = "amap_sdk_version"
            java.lang.String r4 = r4.f()
            r0.put(r5, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r0)
            java.lang.String r4 = r4.toString()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L33
            goto L44
        L33:
            com.amap.api.col.s.g3 r5 = new com.amap.api.col.s.g3     // Catch: com.amap.api.col.s.bv -> L44
            java.lang.String r0 = "core"
            java.lang.String r1 = "2.0"
            java.lang.String r2 = "O001"
            r5.<init>(r3, r0, r1, r2)     // Catch: com.amap.api.col.s.bv -> L44
            r5.a(r4)     // Catch: com.amap.api.col.s.bv -> L44
            com.amap.api.col.s.h3.d(r5, r3)     // Catch: com.amap.api.col.s.bv -> L44
        L44:
            return
    }

    public static synchronized void g(android.content.Context r4, com.amap.api.col.s.i1 r5, java.lang.String r6, com.amap.api.col.s.y0.b r7) {
            java.lang.Class<com.amap.api.col.s.y0> r0 = com.amap.api.col.s.y0.class
            monitor-enter(r0)
            if (r4 == 0) goto Lb1
            if (r5 != 0) goto L9
            goto Lb1
        L9:
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1b
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L18
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L18
            com.amap.api.col.s.y0.f4862g = r4     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r4 = move-exception
            goto La5
        L1b:
            java.lang.String r4 = r5.d()     // Catch: java.lang.Throwable -> L18
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L27
            monitor-exit(r0)
            return
        L27:
            k(r5)     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r1 = com.amap.api.col.s.y0.p     // Catch: java.lang.Throwable -> L18
            r2 = 8
            if (r1 != 0) goto L37
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            com.amap.api.col.s.y0.p = r1     // Catch: java.lang.Throwable -> L18
        L37:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r1 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L42
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            com.amap.api.col.s.y0.o = r1     // Catch: java.lang.Throwable -> L18
        L42:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$h> r1 = com.amap.api.col.s.y0.n     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L4d
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            com.amap.api.col.s.y0.n = r1     // Catch: java.lang.Throwable -> L18
        L4d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r1 = com.amap.api.col.s.y0.p     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto La3
            com.amap.api.col.s.y0$e r1 = new com.amap.api.col.s.y0$e     // Catch: java.lang.Throwable -> L18
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            r1.a = r5     // Catch: java.lang.Throwable -> L18
            r1.f4881b = r6     // Catch: java.lang.Throwable -> L18
            r1.f4882c = r7     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r5 = com.amap.api.col.s.y0.p     // Catch: java.lang.Throwable -> L18
            r5.put(r4, r1)     // Catch: java.lang.Throwable -> L18
            android.content.Context r5 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "open_common"
            r1 = 0
            long r5 = com.amap.api.col.s.j2.b(r5, r6, r4, r1)     // Catch: java.lang.Throwable -> L18
            android.content.Context r7 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "open_common"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r2.<init>()     // Catch: java.lang.Throwable -> L18
            r2.append(r4)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "lct-info"
            r2.append(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = ""
            java.lang.String r7 = com.amap.api.col.s.j2.o(r7, r1, r2, r3)     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$h> r1 = com.amap.api.col.s.y0.n     // Catch: java.lang.Throwable -> L18
            com.amap.api.col.s.y0$h r2 = new com.amap.api.col.s.y0$h     // Catch: java.lang.Throwable -> L18
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L18
            r2.<init>(r5, r7)     // Catch: java.lang.Throwable -> L18
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L18
            android.content.Context r4 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L18
            J(r4)     // Catch: java.lang.Throwable -> L18
            android.content.Context r4 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L18
            M(r4)     // Catch: java.lang.Throwable -> L18
        La3:
            monitor-exit(r0)
            return
        La5:
            java.lang.String r5 = "at"
            java.lang.String r6 = "rglc"
            com.amap.api.col.s.d2.e(r4, r5, r6)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)
            return
        Lae:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r4
        Lb1:
            monitor-exit(r0)
            return
    }

    private static void h(android.content.Context r20, com.amap.api.col.s.i1 r21, java.lang.String r22, com.amap.api.col.s.y0.c r23, org.json.JSONObject r24) throws org.json.JSONException {
            r1 = r20
            r2 = r23
            r3 = r24
            java.lang.String r4 = "ustv"
            java.lang.String r5 = "ust"
            java.lang.String r6 = "umv"
            java.lang.String r7 = "usc"
            java.lang.String r8 = "fsv2"
            java.lang.String r9 = "ucf"
            java.lang.String r10 = "off"
            com.amap.api.col.s.y0$c$a r11 = new com.amap.api.col.s.y0$c$a
            r11.<init>()
            r12 = 0
            r11.a = r12
            r11.f4879b = r12
            r2.f4876g = r11
            java.lang.String r0 = ";"
            r13 = r22
            java.lang.String[] r0 = r13.split(r0)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L56
            int r13 = r0.length     // Catch: java.lang.Throwable -> L45
            if (r13 <= 0) goto L56
            int r13 = r0.length     // Catch: java.lang.Throwable -> L45
            r14 = 0
        L2f:
            if (r14 >= r13) goto L56
            r15 = r0[r14]     // Catch: java.lang.Throwable -> L45
            boolean r16 = r3.has(r15)     // Catch: java.lang.Throwable -> L45
            if (r16 == 0) goto L47
            org.json.JSONObject r12 = r2.f4875f     // Catch: java.lang.Throwable -> L45
            r22 = r0
            java.lang.Object r0 = r3.get(r15)     // Catch: java.lang.Throwable -> L45
            r12.putOpt(r15, r0)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r0 = move-exception
            goto L4f
        L47:
            r22 = r0
        L49:
            int r14 = r14 + 1
            r0 = r22
            r12 = 0
            goto L2f
        L4f:
            java.lang.String r12 = "at"
            java.lang.String r13 = "co"
            com.amap.api.col.s.d2.e(r0, r12, r13)
        L56:
            java.lang.String r0 = "16H"
            boolean r12 = com.amap.api.col.s.j1.m(r3, r0)
            java.lang.String r13 = "able"
            java.lang.String r14 = "AuthConfigManager"
            if (r12 == 0) goto L79
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r0.optString(r13)     // Catch: java.lang.Throwable -> L73
            r12 = 0
            boolean r0 = u(r0, r12)     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.s.y0.c.a(r2, r0)     // Catch: java.lang.Throwable -> L73
            goto L79
        L73:
            r0 = move-exception
            java.lang.String r12 = "load 16H"
            com.amap.api.col.s.d2.e(r0, r14, r12)
        L79:
            java.lang.String r0 = "11K"
            boolean r12 = com.amap.api.col.s.j1.m(r3, r0)
            if (r12 == 0) goto La3
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r12 = r0.getString(r13)     // Catch: java.lang.Throwable -> L9d
            r15 = 0
            boolean r12 = u(r12, r15)     // Catch: java.lang.Throwable -> L9d
            r11.a = r12     // Catch: java.lang.Throwable -> L9d
            boolean r12 = r0.has(r10)     // Catch: java.lang.Throwable -> L9d
            if (r12 == 0) goto La3
            org.json.JSONObject r0 = r0.getJSONObject(r10)     // Catch: java.lang.Throwable -> L9d
            r11.f4880c = r0     // Catch: java.lang.Throwable -> L9d
            goto La3
        L9d:
            r0 = move-exception
            java.lang.String r10 = "load 11K"
            com.amap.api.col.s.d2.e(r0, r14, r10)
        La3:
            java.lang.String r0 = "145"
            boolean r10 = com.amap.api.col.s.j1.m(r3, r0)
            if (r10 == 0) goto Lb8
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> Lb2
            r2.a = r0     // Catch: java.lang.Throwable -> Lb2
            goto Lb8
        Lb2:
            r0 = move-exception
            java.lang.String r10 = "load 145"
            com.amap.api.col.s.d2.e(r0, r14, r10)
        Lb8:
            java.lang.String r0 = "14D"
            boolean r10 = com.amap.api.col.s.j1.m(r3, r0)
            if (r10 == 0) goto Lcd
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> Lc7
            r2.f4871b = r0     // Catch: java.lang.Throwable -> Lc7
            goto Lcd
        Lc7:
            r0 = move-exception
            java.lang.String r10 = "load 14D"
            com.amap.api.col.s.d2.e(r0, r14, r10)
        Lcd:
            java.lang.String r0 = "151"
            boolean r10 = com.amap.api.col.s.j1.m(r3, r0)
            if (r10 == 0) goto Lf6
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.s.y0$c$b r10 = new com.amap.api.col.s.y0$c$b     // Catch: java.lang.Throwable -> Lec
            r10.<init>()     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto Lee
            java.lang.String r0 = r0.optString(r13)     // Catch: java.lang.Throwable -> Lec
            r12 = 0
            boolean r0 = u(r0, r12)     // Catch: java.lang.Throwable -> Lec
            r10.a = r0     // Catch: java.lang.Throwable -> Lec
            goto Lee
        Lec:
            r0 = move-exception
            goto Lf1
        Lee:
            r2.f4877h = r10     // Catch: java.lang.Throwable -> Lec
            goto Lf6
        Lf1:
            java.lang.String r2 = "load 151"
            com.amap.api.col.s.d2.e(r0, r14, r2)
        Lf6:
            java.lang.String r0 = "17S"
            boolean r2 = com.amap.api.col.s.j1.m(r3, r0)
            java.lang.String r10 = "open_common"
            if (r2 == 0) goto L203
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> L124
            if (r0 == 0) goto L12d
            java.lang.String r2 = r0.optString(r13)     // Catch: java.lang.Throwable -> L124
            r12 = 0
            boolean r2 = u(r2, r12)     // Catch: java.lang.Throwable -> L124
            boolean r11 = com.amap.api.col.s.y0.f4863h     // Catch: java.lang.Throwable -> L124
            if (r2 == r11) goto L12d
            com.amap.api.col.s.y0.f4863h = r2     // Catch: java.lang.Throwable -> L124
            if (r1 == 0) goto L12d
            android.content.SharedPreferences$Editor r11 = com.amap.api.col.s.j2.c(r1, r10)     // Catch: java.lang.Throwable -> L124
            java.lang.String r12 = "a2"
            com.amap.api.col.s.j2.k(r11, r12, r2)     // Catch: java.lang.Throwable -> L124
            com.amap.api.col.s.j2.f(r11)     // Catch: java.lang.Throwable -> L124
            goto L12d
        L124:
            r0 = move-exception
            r17 = r4
        L127:
            r18 = r5
        L129:
            r19 = r6
            goto L1fd
        L12d:
            if (r0 == 0) goto L203
            java.lang.String r2 = "static_enable"
            java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Throwable -> L124
            r11 = 1
            boolean r2 = u(r2, r11)     // Catch: java.lang.Throwable -> L124
            java.lang.String r12 = "static_ip_direct_enable"
            java.lang.String r12 = r0.optString(r12)     // Catch: java.lang.Throwable -> L124
            r15 = 0
            boolean r12 = u(r12, r15)     // Catch: java.lang.Throwable -> L124
            java.lang.String r13 = "static_timeout"
            r15 = 5
            int r13 = r0.optInt(r13, r15)     // Catch: java.lang.Throwable -> L124
            int r13 = r13 * 1000
            java.lang.String r15 = "static_retry"
            r11 = 3
            int r15 = r0.optInt(r15, r11)     // Catch: java.lang.Throwable -> L124
            java.lang.String r11 = "bgp_enable"
            java.lang.String r11 = r0.optString(r11)     // Catch: java.lang.Throwable -> L124
            r17 = r4
            r4 = 1
            boolean r4 = u(r11, r4)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r11 = "bgp_ip_direct_enable"
            java.lang.String r11 = r0.optString(r11)     // Catch: java.lang.Throwable -> L1fa
            r18 = r5
            r5 = 0
            boolean r11 = u(r11, r5)     // Catch: java.lang.Throwable -> L1f7
            java.lang.String r5 = "bgp_retry"
            r19 = r6
            r6 = 3
            int r5 = r0.optInt(r5, r6)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r6 = "perf_data_upload_enable"
            java.lang.String r0 = r0.optString(r6)     // Catch: java.lang.Throwable -> L1a4
            r6 = 0
            boolean r0 = u(r0, r6)     // Catch: java.lang.Throwable -> L1a4
            boolean r6 = com.amap.api.col.s.y0.t     // Catch: java.lang.Throwable -> L1a4
            if (r2 != r6) goto L1a6
            boolean r6 = com.amap.api.col.s.y0.u     // Catch: java.lang.Throwable -> L1a4
            if (r12 != r6) goto L1a6
            int r6 = com.amap.api.col.s.y0.s     // Catch: java.lang.Throwable -> L1a4
            if (r13 != r6) goto L1a6
            int r6 = com.amap.api.col.s.y0.v     // Catch: java.lang.Throwable -> L1a4
            if (r15 != r6) goto L1a6
            boolean r6 = com.amap.api.col.s.y0.w     // Catch: java.lang.Throwable -> L1a4
            if (r4 != r6) goto L1a6
            boolean r6 = com.amap.api.col.s.y0.x     // Catch: java.lang.Throwable -> L1a4
            if (r11 != r6) goto L1a6
            int r6 = com.amap.api.col.s.y0.y     // Catch: java.lang.Throwable -> L1a4
            if (r5 != r6) goto L1a6
            boolean r6 = com.amap.api.col.s.y0.z     // Catch: java.lang.Throwable -> L1a4
            if (r0 == r6) goto L1e7
            goto L1a6
        L1a4:
            r0 = move-exception
            goto L1fd
        L1a6:
            com.amap.api.col.s.y0.t = r2     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.y0.u = r12     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.y0.s = r13     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.y0.v = r15     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.y0.w = r4     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.y0.x = r11     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.y0.y = r5     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.y0.z = r0     // Catch: java.lang.Throwable -> L1a4
            if (r1 == 0) goto L1e7
            android.content.SharedPreferences$Editor r6 = com.amap.api.col.s.j2.c(r1, r10)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = "a13"
            com.amap.api.col.s.j2.k(r6, r1, r2)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = "a6"
            com.amap.api.col.s.j2.k(r6, r1, r4)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = "a7"
            com.amap.api.col.s.j2.k(r6, r1, r12)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = "a8"
            com.amap.api.col.s.j2.h(r6, r1, r13)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = "a9"
            com.amap.api.col.s.j2.h(r6, r1, r15)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = "a10"
            com.amap.api.col.s.j2.k(r6, r1, r11)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = "a11"
            com.amap.api.col.s.j2.h(r6, r1, r5)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = "a12"
            com.amap.api.col.s.j2.k(r6, r1, r0)     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.j2.f(r6)     // Catch: java.lang.Throwable -> L1a4
        L1e7:
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L1a4
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L1a4
            goto L209
        L1f7:
            r0 = move-exception
            goto L129
        L1fa:
            r0 = move-exception
            goto L127
        L1fd:
            java.lang.String r1 = "load 17S"
            com.amap.api.col.s.d2.e(r0, r14, r1)
            goto L209
        L203:
            r17 = r4
            r18 = r5
            r19 = r6
        L209:
            java.lang.String r0 = "15K"
            boolean r1 = com.amap.api.col.s.j1.m(r3, r0)
            if (r1 == 0) goto L2a4
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> L26a
            if (r0 == 0) goto L2a4
            java.lang.String r1 = r0.optString(r9)     // Catch: java.lang.Throwable -> L26a
            boolean r2 = com.amap.api.col.s.y0.g.a     // Catch: java.lang.Throwable -> L26a
            boolean r1 = u(r1, r2)     // Catch: java.lang.Throwable -> L26a
            java.lang.String r2 = r0.optString(r8)     // Catch: java.lang.Throwable -> L26a
            boolean r4 = com.amap.api.col.s.y0.g.f4885b     // Catch: java.lang.Throwable -> L26a
            boolean r2 = u(r2, r4)     // Catch: java.lang.Throwable -> L26a
            java.lang.String r4 = r0.optString(r7)     // Catch: java.lang.Throwable -> L26a
            boolean r5 = com.amap.api.col.s.y0.g.f4886c     // Catch: java.lang.Throwable -> L26a
            boolean r4 = u(r4, r5)     // Catch: java.lang.Throwable -> L26a
            int r5 = com.amap.api.col.s.y0.g.f4887d     // Catch: java.lang.Throwable -> L26a
            r6 = r19
            int r5 = r0.optInt(r6, r5)     // Catch: java.lang.Throwable -> L26a
            r11 = r18
            java.lang.String r12 = r0.optString(r11)     // Catch: java.lang.Throwable -> L26a
            boolean r13 = com.amap.api.col.s.y0.g.f4888e     // Catch: java.lang.Throwable -> L26a
            boolean r12 = u(r12, r13)     // Catch: java.lang.Throwable -> L26a
            int r13 = com.amap.api.col.s.y0.g.f4889f     // Catch: java.lang.Throwable -> L26a
            r15 = r17
            int r0 = r0.optInt(r15, r13)     // Catch: java.lang.Throwable -> L26a
            boolean r13 = com.amap.api.col.s.y0.g.a     // Catch: java.lang.Throwable -> L26a
            if (r1 != r13) goto L26e
            boolean r13 = com.amap.api.col.s.y0.g.f4885b     // Catch: java.lang.Throwable -> L26a
            if (r2 != r13) goto L26e
            boolean r13 = com.amap.api.col.s.y0.g.f4886c     // Catch: java.lang.Throwable -> L26a
            if (r4 != r13) goto L26e
            int r13 = com.amap.api.col.s.y0.g.f4887d     // Catch: java.lang.Throwable -> L26a
            if (r5 != r13) goto L26e
            boolean r13 = com.amap.api.col.s.y0.g.f4888e     // Catch: java.lang.Throwable -> L26a
            if (r12 != r13) goto L26e
            int r13 = com.amap.api.col.s.y0.g.f4887d     // Catch: java.lang.Throwable -> L26a
            if (r0 == r13) goto L2a4
            goto L26e
        L26a:
            r0 = move-exception
            r1 = r20
            goto L2a7
        L26e:
            com.amap.api.col.s.y0.g.a = r1     // Catch: java.lang.Throwable -> L26a
            com.amap.api.col.s.y0.g.f4885b = r2     // Catch: java.lang.Throwable -> L26a
            com.amap.api.col.s.y0.g.f4886c = r4     // Catch: java.lang.Throwable -> L26a
            com.amap.api.col.s.y0.g.f4887d = r5     // Catch: java.lang.Throwable -> L26a
            com.amap.api.col.s.y0.g.f4888e = r12     // Catch: java.lang.Throwable -> L26a
            com.amap.api.col.s.y0.g.f4889f = r0     // Catch: java.lang.Throwable -> L26a
            r1 = r20
            android.content.SharedPreferences$Editor r0 = com.amap.api.col.s.j2.c(r1, r10)     // Catch: java.lang.Throwable -> L2a2
            boolean r2 = com.amap.api.col.s.y0.g.a     // Catch: java.lang.Throwable -> L2a2
            com.amap.api.col.s.j2.k(r0, r9, r2)     // Catch: java.lang.Throwable -> L2a2
            boolean r2 = com.amap.api.col.s.y0.g.f4885b     // Catch: java.lang.Throwable -> L2a2
            com.amap.api.col.s.j2.k(r0, r8, r2)     // Catch: java.lang.Throwable -> L2a2
            boolean r2 = com.amap.api.col.s.y0.g.f4886c     // Catch: java.lang.Throwable -> L2a2
            com.amap.api.col.s.j2.k(r0, r7, r2)     // Catch: java.lang.Throwable -> L2a2
            int r2 = com.amap.api.col.s.y0.g.f4887d     // Catch: java.lang.Throwable -> L2a2
            com.amap.api.col.s.j2.h(r0, r6, r2)     // Catch: java.lang.Throwable -> L2a2
            boolean r2 = com.amap.api.col.s.y0.g.f4888e     // Catch: java.lang.Throwable -> L2a2
            com.amap.api.col.s.j2.k(r0, r11, r2)     // Catch: java.lang.Throwable -> L2a2
            int r2 = com.amap.api.col.s.y0.g.f4889f     // Catch: java.lang.Throwable -> L2a2
            com.amap.api.col.s.j2.h(r0, r15, r2)     // Catch: java.lang.Throwable -> L2a2
            com.amap.api.col.s.j2.f(r0)     // Catch: java.lang.Throwable -> L2a2
            goto L2ac
        L2a2:
            goto L2ac
        L2a4:
            r1 = r20
            goto L2ac
        L2a7:
            java.lang.String r2 = "load 15K"
            com.amap.api.col.s.d2.e(r0, r14, r2)
        L2ac:
            java.lang.String r0 = "183"
            boolean r2 = com.amap.api.col.s.j1.m(r3, r0)
            if (r2 == 0) goto L2c4
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> L2be
            r2 = r21
            com.amap.api.col.s.w2.c(r2, r0)     // Catch: java.lang.Throwable -> L2be
            goto L2c4
        L2be:
            r0 = move-exception
            java.lang.String r2 = "load 183"
            com.amap.api.col.s.d2.e(r0, r14, r2)
        L2c4:
            java.lang.String r0 = "17I"
            boolean r2 = com.amap.api.col.s.j1.m(r3, r0)
            if (r2 == 0) goto L301
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> L2fb
            java.lang.String r2 = "na"
            java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Throwable -> L2fb
            r12 = 0
            boolean r2 = u(r2, r12)     // Catch: java.lang.Throwable -> L2fb
            java.lang.String r4 = "aa"
            java.lang.String r0 = r0.optString(r4)     // Catch: java.lang.Throwable -> L2fb
            boolean r0 = u(r0, r12)     // Catch: java.lang.Throwable -> L2fb
            com.amap.api.col.s.s1.f4676e = r2     // Catch: java.lang.Throwable -> L2fb
            com.amap.api.col.s.s1.f4677f = r0     // Catch: java.lang.Throwable -> L2fb
            android.content.SharedPreferences$Editor r4 = com.amap.api.col.s.j2.c(r1, r10)     // Catch: java.lang.Throwable -> L2fb
            java.lang.String r5 = "a4"
            com.amap.api.col.s.j2.k(r4, r5, r2)     // Catch: java.lang.Throwable -> L2fb
            java.lang.String r2 = "a5"
            com.amap.api.col.s.j2.k(r4, r2, r0)     // Catch: java.lang.Throwable -> L2fb
            com.amap.api.col.s.j2.f(r4)     // Catch: java.lang.Throwable -> L2fb
            goto L301
        L2fb:
            r0 = move-exception
            java.lang.String r2 = "load 17I"
            com.amap.api.col.s.d2.e(r0, r14, r2)
        L301:
            java.lang.String r0 = "1A4"
            boolean r0 = com.amap.api.col.s.j1.m(r3, r0)
            if (r0 == 0) goto L33f
            java.lang.String r0 = "1A4"
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> L339
            java.lang.String r2 = "ada"
            java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Throwable -> L339
            boolean r3 = com.amap.api.col.s.l1.f4555c     // Catch: java.lang.Throwable -> L339
            boolean r3 = u(r2, r3)     // Catch: java.lang.Throwable -> L339
            java.lang.String r4 = "iv"
            long r5 = com.amap.api.col.s.l1.a     // Catch: java.lang.Throwable -> L339
            long r4 = r0.optLong(r4, r5)     // Catch: java.lang.Throwable -> L339
            com.amap.api.col.s.l1.f4556d = r3     // Catch: java.lang.Throwable -> L339
            com.amap.api.col.s.l1.f4554b = r4     // Catch: java.lang.Throwable -> L339
            android.content.SharedPreferences$Editor r0 = com.amap.api.col.s.j2.c(r1, r10)     // Catch: java.lang.Throwable -> L339
            java.lang.String r1 = "a16"
            com.amap.api.col.s.j2.j(r0, r1, r2)     // Catch: java.lang.Throwable -> L339
            java.lang.String r1 = "a17"
            com.amap.api.col.s.j2.i(r0, r1, r4)     // Catch: java.lang.Throwable -> L339
            com.amap.api.col.s.j2.f(r0)     // Catch: java.lang.Throwable -> L339
            goto L33f
        L339:
            r0 = move-exception
            java.lang.String r1 = "load 1A4"
            com.amap.api.col.s.d2.e(r0, r14, r1)
        L33f:
            return
    }

    private static void i(android.content.Context r0, com.amap.api.col.s.i1 r1, java.lang.Throwable r2) {
            java.lang.String r2 = r2.getMessage()
            f(r0, r1, r2)
            return
    }

    private static void j(android.content.Context r1, java.lang.String r2, java.lang.String r3, com.amap.api.col.s.y0.f r4) {
            if (r4 == 0) goto L25
            java.lang.String r0 = com.amap.api.col.s.y0.f.g(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            goto L25
        Ld:
            java.lang.String r4 = r4.e()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L18
            goto L25
        L18:
            if (r1 != 0) goto L1b
            goto L25
        L1b:
            android.content.SharedPreferences$Editor r1 = com.amap.api.col.s.j2.c(r1, r3)
            r1.putString(r2, r4)
            com.amap.api.col.s.j2.f(r1)
        L25:
            return
    }

    private static void k(com.amap.api.col.s.i1 r2) {
            if (r2 == 0) goto L29
            java.lang.String r0 = r2.d()     // Catch: java.lang.Throwable -> L29
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto Ld
            goto L29
        Ld:
            java.lang.String r0 = r2.f()     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L1b
            java.lang.String r0 = r2.e()     // Catch: java.lang.Throwable -> L29
        L1b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L22
            goto L29
        L22:
            java.lang.String r2 = r2.d()     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.s.s1.b(r2, r0)     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }

    public static void l(com.amap.api.col.s.x2.c r5) {
            if (r5 == 0) goto Lb6
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g
            if (r0 != 0) goto L8
            goto Lb6
        L8:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "serverip"
            java.lang.String r2 = r5.f4818c
            r0.put(r1, r2)
            java.lang.String r1 = "hostname"
            java.lang.String r2 = r5.f4820e
            r0.put(r1, r2)
            java.lang.String r1 = "path"
            java.lang.String r2 = r5.f4819d
            r0.put(r1, r2)
            java.lang.String r1 = "csid"
            java.lang.String r2 = r5.a
            r0.put(r1, r2)
            com.amap.api.col.s.dz$b r1 = r5.f4817b
            int r1 = r1.a()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "degrade"
            r0.put(r2, r1)
            int r1 = r5.m
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "errorcode"
            r0.put(r2, r1)
            int r1 = r5.n
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "errorsubcode"
            r0.put(r2, r1)
            long r1 = r5.f4823h
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "connecttime"
            r0.put(r2, r1)
            long r1 = r5.f4824i
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "writetime"
            r0.put(r2, r1)
            long r1 = r5.f4825j
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "readtime"
            r0.put(r2, r1)
            java.lang.String r1 = r5.l
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "datasize"
            r0.put(r2, r1)
            long r1 = r5.f4821f
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "totaltime"
            r0.put(r1, r5)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "--埋点--"
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r0.concat(r1)
            com.amap.api.col.s.x2.i()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto La1
            goto Lb6
        La1:
            com.amap.api.col.s.g3 r0 = new com.amap.api.col.s.g3     // Catch: com.amap.api.col.s.bv -> Lb6
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g     // Catch: com.amap.api.col.s.bv -> Lb6
            java.lang.String r2 = "core"
            java.lang.String r3 = "2.0"
            java.lang.String r4 = "O008"
            r0.<init>(r1, r2, r3, r4)     // Catch: com.amap.api.col.s.bv -> Lb6
            r0.a(r5)     // Catch: com.amap.api.col.s.bv -> Lb6
            android.content.Context r5 = com.amap.api.col.s.y0.f4862g     // Catch: com.amap.api.col.s.bv -> Lb6
            com.amap.api.col.s.h3.d(r0, r5)     // Catch: com.amap.api.col.s.bv -> Lb6
        Lb6:
            return
    }

    private static synchronized void m(java.lang.String r4, long r5, java.lang.String r7) {
            java.lang.Class<com.amap.api.col.s.y0> r0 = com.amap.api.col.s.y0.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r1 = com.amap.api.col.s.y0.p     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L54
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r1 = com.amap.api.col.s.y0.p     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L10
            goto L54
        L10:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$h> r1 = com.amap.api.col.s.y0.n     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L20
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L1e
            r2 = 8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.s.y0.n = r1     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r4 = move-exception
            goto L56
        L20:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$h> r1 = com.amap.api.col.s.y0.n     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.s.y0$h r2 = new com.amap.api.col.s.y0$h     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r3, r7)     // Catch: java.lang.Throwable -> L1e
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L1e
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L52
            java.lang.String r2 = "open_common"
            android.content.SharedPreferences$Editor r1 = com.amap.api.col.s.j2.c(r1, r2)     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.s.j2.i(r1, r4, r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r5.<init>()     // Catch: java.lang.Throwable -> L1e
            r5.append(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "lct-info"
            r5.append(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.s.j2.j(r1, r4, r7)     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.s.j2.f(r1)     // Catch: java.lang.Throwable -> L1e
        L52:
            monitor-exit(r0)
            return
        L54:
            monitor-exit(r0)
            return
        L56:
            java.lang.String r5 = "at"
            java.lang.String r6 = "ucut"
            com.amap.api.col.s.d2.e(r4, r5, r6)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)
            return
        L5f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r4
    }

    private static void n(java.lang.String r4, java.lang.String r5) {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g
            com.amap.api.col.s.y0$f r0 = c(r0, r4, r5)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "yyyyMMdd"
            java.lang.String r1 = com.amap.api.col.s.j1.c(r1, r3)
            java.lang.String r2 = com.amap.api.col.s.y0.f.b(r0)
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L25
            r0.c(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = com.amap.api.col.s.y0.f.f(r0)
            r2 = 0
            r1.set(r2)
        L25:
            java.util.concurrent.atomic.AtomicInteger r1 = com.amap.api.col.s.y0.f.f(r0)
            r1.incrementAndGet()
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g
            j(r1, r4, r5, r0)
            return
    }

    public static synchronized void o(java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            java.lang.Class<com.amap.api.col.s.y0> r0 = com.amap.api.col.s.y0.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto Lb
            monitor-exit(r0)
            return
        Lb:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r1 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L19
            r2 = 8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.s.y0.o = r1     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r4 = move-exception
            goto L54
        L1b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r1 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L19
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L19
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r1 = com.amap.api.col.s.y0.p     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L2e
            monitor-exit(r0)
            return
        L2e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r1 = com.amap.api.col.s.y0.p     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L38
            monitor-exit(r0)
            return
        L38:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L40
            monitor-exit(r0)
            return
        L40:
            if (r5 == 0) goto L46
            r5 = 1
            com.amap.api.col.s.w2.j(r5, r4)     // Catch: java.lang.Throwable -> L19
        L46:
            com.amap.api.col.s.y3 r5 = com.amap.api.col.s.y3.e()     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.s.y0$a r1 = new com.amap.api.col.s.y0$a     // Catch: java.lang.Throwable -> L19
            r1.<init>(r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L19
            r5.c(r1)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L54:
            java.lang.String r5 = "at"
            java.lang.String r6 = "lca"
            com.amap.api.col.s.d2.e(r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r0)
            return
        L5d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            throw r4
    }

    public static void p(java.lang.String r4, boolean r5, boolean r6, boolean r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L79
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g
            if (r0 != 0) goto Lc
            goto L79
        Lc:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "url"
            r0.put(r1, r4)
            java.lang.String r4 = "downLevel"
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r0.put(r4, r1)
            android.content.Context r4 = com.amap.api.col.s.y0.f4862g
            int r4 = com.amap.api.col.s.c1.D(r4)
            java.lang.String r1 = "1"
            java.lang.String r2 = "0"
            if (r4 != 0) goto L2d
            r4 = r2
            goto L2e
        L2d:
            r4 = r1
        L2e:
            java.lang.String r3 = "ant"
            r0.put(r3, r4)
            java.lang.String r4 = "type"
            if (r7 == 0) goto L42
            if (r5 == 0) goto L3c
            java.lang.String r5 = com.amap.api.col.s.y0.f4860e
            goto L3e
        L3c:
            java.lang.String r5 = com.amap.api.col.s.y0.f4861f
        L3e:
            r0.put(r4, r5)
            goto L4c
        L42:
            if (r5 == 0) goto L47
            java.lang.String r5 = com.amap.api.col.s.y0.f4858c
            goto L49
        L47:
            java.lang.String r5 = com.amap.api.col.s.y0.f4859d
        L49:
            r0.put(r4, r5)
        L4c:
            if (r6 == 0) goto L4f
            r1 = r2
        L4f:
            java.lang.String r4 = "status"
            r0.put(r4, r1)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r0)
            java.lang.String r4 = r4.toString()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L64
            goto L79
        L64:
            com.amap.api.col.s.g3 r5 = new com.amap.api.col.s.g3     // Catch: com.amap.api.col.s.bv -> L79
            android.content.Context r6 = com.amap.api.col.s.y0.f4862g     // Catch: com.amap.api.col.s.bv -> L79
            java.lang.String r7 = "core"
            java.lang.String r0 = "2.0"
            java.lang.String r1 = "O002"
            r5.<init>(r6, r7, r0, r1)     // Catch: com.amap.api.col.s.bv -> L79
            r5.a(r4)     // Catch: com.amap.api.col.s.bv -> L79
            android.content.Context r4 = com.amap.api.col.s.y0.f4862g     // Catch: com.amap.api.col.s.bv -> L79
            com.amap.api.col.s.h3.d(r5, r4)     // Catch: com.amap.api.col.s.bv -> L79
        L79:
            return
    }

    public static void q(boolean r4, com.amap.api.col.s.x2.a r5) {
            boolean r0 = com.amap.api.col.s.y0.D
            if (r0 == 0) goto L88
            if (r5 != 0) goto L8
            goto L88
        L8:
            java.util.ArrayList<com.amap.api.col.s.x2$a> r0 = com.amap.api.col.s.y0.C
            monitor-enter(r0)
            if (r4 == 0) goto L5e
            java.util.ArrayList<com.amap.api.col.s.x2$a> r4 = com.amap.api.col.s.y0.C     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L46
        L13:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L46
            com.amap.api.col.s.x2$a r1 = (com.amap.api.col.s.x2.a) r1     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r1.f4807b     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r5.f4807b     // Catch: java.lang.Throwable -> L46
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L13
            java.lang.String r2 = r1.f4810e     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r5.f4810e     // Catch: java.lang.Throwable -> L46
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L13
            int r2 = r1.f4811f     // Catch: java.lang.Throwable -> L46
            int r3 = r5.f4811f     // Catch: java.lang.Throwable -> L46
            if (r2 != r3) goto L13
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f4815j     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.atomic.AtomicInteger r3 = r5.f4815j     // Catch: java.lang.Throwable -> L46
            if (r2 != r3) goto L48
            r4.remove()     // Catch: java.lang.Throwable -> L46
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L46
            goto L13
        L46:
            r4 = move-exception
            goto L86
        L48:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f4815j     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f4815j     // Catch: java.lang.Throwable -> L46
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.atomic.AtomicInteger r3 = r5.f4815j     // Catch: java.lang.Throwable -> L46
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L46
            int r1 = r1 - r3
            r2.set(r1)     // Catch: java.lang.Throwable -> L46
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L46
            goto L13
        L5e:
            r4 = 0
            com.amap.api.col.s.y0.D = r4     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList<com.amap.api.col.s.x2$a> r4 = com.amap.api.col.s.y0.C     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L46
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L46
        L6a:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L46
            com.amap.api.col.s.x2$a r5 = (com.amap.api.col.s.x2.a) r5     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r5.f4810e     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.atomic.AtomicInteger r5 = r5.f4815j     // Catch: java.lang.Throwable -> L46
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L46
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L46
            goto L6a
        L81:
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r4
        L88:
            return
    }

    public static void r(boolean r2, java.lang.String r3) {
            java.lang.String r0 = "--markHostNameFailed---hostname="
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L58
            r0.concat(r1)     // Catch: java.lang.Throwable -> L58
            com.amap.api.col.s.x2.i()     // Catch: java.lang.Throwable -> L58
            boolean r0 = com.amap.api.col.s.y0.t     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L13
            if (r2 != 0) goto L13
            goto L58
        L13:
            boolean r0 = com.amap.api.col.s.y0.x     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L1a
            if (r2 == 0) goto L1a
            goto L58
        L1a:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L21
            goto L58
        L21:
            java.lang.String r0 = "open_common"
            if (r2 != 0) goto L3f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = com.amap.api.col.s.y0.A     // Catch: java.lang.Throwable -> L58
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L2e
            goto L58
        L2e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = com.amap.api.col.s.y0.A     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L58
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "a14"
            java.lang.String r2 = y(r3, r2)     // Catch: java.lang.Throwable -> L58
            n(r2, r0)     // Catch: java.lang.Throwable -> L58
            return
        L3f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = com.amap.api.col.s.y0.B     // Catch: java.lang.Throwable -> L58
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L48
            goto L58
        L48:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = com.amap.api.col.s.y0.B     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L58
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "a15"
            java.lang.String r2 = y(r3, r2)     // Catch: java.lang.Throwable -> L58
            n(r2, r0)     // Catch: java.lang.Throwable -> L58
        L58:
            return
    }

    public static boolean s() {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            S()
            boolean r0 = D()
            if (r0 != 0) goto L10
            return r2
        L10:
            boolean r0 = U()
            if (r0 == 0) goto L17
            return r1
        L17:
            boolean r0 = com.amap.api.col.s.y0.f4863h
            if (r0 != 0) goto L1c
            return r2
        L1c:
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g
            java.lang.String r3 = "IPV6_CONFIG_NAME"
            java.lang.String r4 = "open_common"
            com.amap.api.col.s.y0$f r0 = c(r0, r3, r4)
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r0.a()
            r3 = 5
            if (r0 >= r3) goto L31
            return r1
        L31:
            return r2
    }

    public static synchronized boolean t(java.lang.String r7, long r8) {
            java.lang.Class<com.amap.api.col.s.y0> r0 = com.amap.api.col.s.y0.class
            monitor-enter(r0)
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto Lc
            monitor-exit(r0)
            return r1
        Lc:
            com.amap.api.col.s.y0$h r2 = O(r7)     // Catch: java.lang.Throwable -> L40
            r3 = 0
            if (r2 == 0) goto L17
            long r5 = r2.a     // Catch: java.lang.Throwable -> L40
            goto L18
        L17:
            r5 = r3
        L18:
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 == 0) goto L40
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r8 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L40
            if (r8 == 0) goto L34
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r8 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L40
            boolean r8 = r8.containsKey(r7)     // Catch: java.lang.Throwable -> L40
            if (r8 == 0) goto L34
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r8 = com.amap.api.col.s.y0.o     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r8.get(r7)     // Catch: java.lang.Throwable -> L40
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L40
            long r3 = r7.longValue()     // Catch: java.lang.Throwable -> L40
        L34:
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L40
            long r7 = r7 - r3
            r2 = 30000(0x7530, double:1.4822E-319)
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 <= 0) goto L40
            r1 = 1
        L40:
            monitor-exit(r0)
            return r1
    }

    public static boolean u(java.lang.String r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L7
            goto L22
        L7:
            java.lang.String r2 = java.net.URLDecoder.decode(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "/"
            java.lang.String[] r2 = r2.split(r0)     // Catch: java.lang.Throwable -> L22
            int r0 = r2.length     // Catch: java.lang.Throwable -> L22
            r1 = 1
            int r0 = r0 - r1
            r2 = r2[r0]     // Catch: java.lang.Throwable -> L22
            r0 = 4
            char r2 = r2.charAt(r0)     // Catch: java.lang.Throwable -> L22
            int r2 = r2 % 2
            if (r2 != r1) goto L20
            return r1
        L20:
            r2 = 0
            return r2
        L22:
            return r3
    }

    private static boolean v(java.net.InetAddress r1) {
            boolean r0 = r1.isLoopbackAddress()
            if (r0 != 0) goto L15
            boolean r0 = r1.isLinkLocalAddress()
            if (r0 != 0) goto L15
            boolean r1 = r1.isAnyLocalAddress()
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    private static com.amap.api.col.s.y0.c w(android.content.Context r22, com.amap.api.col.s.i1 r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
            java.lang.String r7 = "result"
            java.lang.String r8 = "ver"
            java.lang.String r9 = "infocode"
            java.lang.String r10 = "info"
            java.lang.String r11 = "status"
            java.lang.String r12 = "lc"
            java.lang.String r13 = "lct"
            java.lang.String r14 = "at"
            com.amap.api.col.s.y0$c r15 = new com.amap.api.col.s.y0$c
            r15.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r15.f4875f = r0
            if (r22 == 0) goto L28
            android.content.Context r0 = r22.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.amap.api.col.s.y0.f4862g = r0
        L28:
            I()
            r1 = 0
            r16 = 0
            k(r23)     // Catch: java.lang.Throwable -> L175 javax.crypto.IllegalBlockSizeException -> L17f com.amap.api.col.s.bv -> L189
            com.amap.api.col.s.u2 r0 = new com.amap.api.col.s.u2     // Catch: java.lang.Throwable -> L175 javax.crypto.IllegalBlockSizeException -> L17f com.amap.api.col.s.bv -> L189
            r0.<init>()     // Catch: java.lang.Throwable -> L175 javax.crypto.IllegalBlockSizeException -> L17f com.amap.api.col.s.bv -> L189
            boolean r17 = android.text.TextUtils.isEmpty(r24)     // Catch: java.lang.Throwable -> L175 javax.crypto.IllegalBlockSizeException -> L17f com.amap.api.col.s.bv -> L189
            if (r17 != 0) goto L57
            java.lang.String r0 = E(r24)     // Catch: java.lang.Throwable -> L42 com.amap.api.col.s.bv -> L4c
            r3 = r0
            goto L59
        L42:
            r1 = r22
            r2 = r23
        L46:
            r18 = r7
        L48:
            r3 = r24
            goto L15d
        L4c:
            r0 = move-exception
            r1 = r22
            r2 = r23
            r3 = r24
        L53:
            r18 = r7
            goto L174
        L57:
            r3 = r24
        L59:
            J(r22)     // Catch: java.lang.Throwable -> L14c com.amap.api.col.s.bv -> L154
            M(r22)     // Catch: java.lang.Throwable -> L14c com.amap.api.col.s.bv -> L154
            com.amap.api.col.s.y0$d r0 = new com.amap.api.col.s.y0$d     // Catch: java.lang.Throwable -> L14c com.amap.api.col.s.bv -> L154
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r26
            r6 = r27
            r18 = r7
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L144 com.amap.api.col.s.bv -> L148
            com.amap.api.col.s.b3 r4 = com.amap.api.col.s.u2.d(r0)     // Catch: java.lang.Throwable -> L144 com.amap.api.col.s.bv -> L148
            if (r17 == 0) goto L79
            goto L27a
        L79:
            if (r4 == 0) goto Lfd
            byte[] r5 = r4.a     // Catch: java.lang.Throwable -> Le2 javax.crypto.IllegalBlockSizeException -> Leb com.amap.api.col.s.bv -> Lf4
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.f4315b     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto Lbf
            boolean r6 = r0.containsKey(r13)     // Catch: java.lang.Throwable -> Lc4
            if (r6 == 0) goto Lbf
            java.lang.Object r6 = r0.get(r13)     // Catch: java.lang.Throwable -> Lc4
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = "lct-info"
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> Lc4
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lc4
            long r6 = a(r6)     // Catch: java.lang.Throwable -> Lc4
            r15.f4874e = r6     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = z(r0)     // Catch: java.lang.Throwable -> Lc4
            long r6 = r15.f4874e     // Catch: java.lang.Throwable -> Lc4
            r19 = 0
            int r21 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r21 == 0) goto Lbf
            if (r2 == 0) goto Lbf
            java.lang.String r6 = r2.d()     // Catch: java.lang.Throwable -> Lc4
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto Lbf
            r24 = r3
            r25 = r4
            long r3 = r15.f4874e     // Catch: java.lang.Throwable -> Lbd
            m(r6, r3, r0)     // Catch: java.lang.Throwable -> Lbd
            goto L103
        Lbd:
            r0 = move-exception
            goto Lc9
        Lbf:
            r24 = r3
            r25 = r4
            goto L103
        Lc4:
            r0 = move-exception
            r24 = r3
            r25 = r4
        Lc9:
            com.amap.api.col.s.g2.o(r0, r14, r13)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            goto L103
        Lcd:
            r0 = move-exception
            r3 = r24
            r4 = r25
            goto L193
        Ld4:
            r0 = move-exception
            r3 = r24
            r4 = r25
            goto L19b
        Ldb:
            r0 = move-exception
            r3 = r24
            r4 = r25
            goto L19f
        Le2:
            r0 = move-exception
            r24 = r3
            r25 = r4
            r5 = r16
            goto L193
        Leb:
            r0 = move-exception
            r24 = r3
            r25 = r4
            r5 = r16
            goto L19b
        Lf4:
            r0 = move-exception
            r24 = r3
            r25 = r4
            r5 = r16
            goto L19f
        Lfd:
            r24 = r3
            r25 = r4
            r5 = r16
        L103:
            r0 = 16
            byte[] r3 = new byte[r0]     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            int r4 = r5.length     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            int r4 = r4 - r0
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            r7 = 0
            java.lang.System.arraycopy(r5, r7, r3, r7, r0)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            int r6 = r5.length     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            int r6 = r6 - r0
            java.lang.System.arraycopy(r5, r0, r4, r7, r6)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            java.lang.String r6 = "EQUVT"
            java.lang.String r6 = com.amap.api.col.s.j1.t(r6)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            r0.<init>(r3, r6)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            java.lang.String r3 = "CQUVTL0NCQy9QS0NTNVBhZGRpbmc"
            java.lang.String r3 = com.amap.api.col.s.j1.t(r3)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            javax.crypto.spec.IvParameterSpec r6 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            byte[] r7 = com.amap.api.col.s.j1.u()     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            r7 = 2
            r3.init(r7, r0, r6)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            byte[] r0 = r3.doFinal(r4)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            java.lang.String r16 = com.amap.api.col.s.j1.g(r0)     // Catch: java.lang.Throwable -> Lcd javax.crypto.IllegalBlockSizeException -> Ld4 com.amap.api.col.s.bv -> Ldb
            r7 = r24
            r4 = r25
            goto L1b2
        L144:
            r24 = r3
            goto L48
        L148:
            r0 = move-exception
            r24 = r3
            goto L174
        L14c:
            r1 = r22
            r2 = r23
            r24 = r3
            goto L46
        L154:
            r0 = move-exception
            r1 = r22
            r2 = r23
            r24 = r3
            goto L53
        L15d:
            com.amap.api.col.s.bv r0 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L165 javax.crypto.IllegalBlockSizeException -> L16a com.amap.api.col.s.bv -> L16f
            java.lang.String r4 = "未知的错误"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L165 javax.crypto.IllegalBlockSizeException -> L16a com.amap.api.col.s.bv -> L16f
            throw r0     // Catch: java.lang.Throwable -> L165 javax.crypto.IllegalBlockSizeException -> L16a com.amap.api.col.s.bv -> L16f
        L165:
            r0 = move-exception
        L166:
            r4 = r16
            r5 = r4
            goto L193
        L16a:
            r0 = move-exception
        L16b:
            r4 = r16
            r5 = r4
            goto L19b
        L16f:
            r0 = move-exception
        L170:
            r4 = r16
            r5 = r4
            goto L19f
        L174:
            throw r0     // Catch: java.lang.Throwable -> L165 javax.crypto.IllegalBlockSizeException -> L16a com.amap.api.col.s.bv -> L16f
        L175:
            r0 = move-exception
            r1 = r22
            r2 = r23
            r18 = r7
            r3 = r24
            goto L166
        L17f:
            r0 = move-exception
            r1 = r22
            r2 = r23
            r18 = r7
            r3 = r24
            goto L16b
        L189:
            r0 = move-exception
            r1 = r22
            r2 = r23
            r18 = r7
            r3 = r24
            goto L170
        L193:
            com.amap.api.col.s.g2.o(r0, r14, r12)
            i(r1, r2, r0)
        L199:
            r7 = r3
            goto L1b2
        L19b:
            i(r1, r2, r0)
            goto L199
        L19f:
            java.lang.String r6 = r0.a()
            r15.f4872c = r6
            java.lang.String r6 = r0.a()
            f(r1, r2, r6)
            java.lang.String r6 = "/v3/iasdkauth"
            com.amap.api.col.s.g2.h(r2, r6, r0)
            goto L199
        L1b2:
            if (r5 != 0) goto L1b6
            goto L27a
        L1b6:
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 == 0) goto L1c0
            java.lang.String r16 = com.amap.api.col.s.j1.g(r5)
        L1c0:
            r0 = r16
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L1cd
            java.lang.String r3 = "result is null"
            f(r1, r2, r3)
        L1cd:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1e3
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L1e3
            boolean r0 = r13.has(r11)     // Catch: java.lang.Throwable -> L1e3
            if (r0 == 0) goto L27a
            int r0 = r13.getInt(r11)     // Catch: java.lang.Throwable -> L1e3
            r3 = 1
            if (r0 != r3) goto L1e6
            com.amap.api.col.s.y0.a = r3     // Catch: java.lang.Throwable -> L1e3
        L1e1:
            r9 = r1
            goto L228
        L1e3:
            r0 = move-exception
            goto L277
        L1e6:
            if (r0 != 0) goto L1e1
            java.lang.String r0 = "authcsid"
            java.lang.String r3 = "authgsid"
            if (r4 == 0) goto L1f2
            java.lang.String r0 = r4.f4316c     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r3 = r4.f4317d     // Catch: java.lang.Throwable -> L1e3
        L1f2:
            r5 = r0
            r4 = r3
            com.amap.api.col.s.j1.i(r1, r5, r4, r13)     // Catch: java.lang.Throwable -> L1e3
            r17 = 0
            com.amap.api.col.s.y0.a = r17     // Catch: java.lang.Throwable -> L1e3
            boolean r0 = r13.has(r10)     // Catch: java.lang.Throwable -> L1e3
            if (r0 == 0) goto L207
            java.lang.String r0 = r13.getString(r10)     // Catch: java.lang.Throwable -> L1e3
            com.amap.api.col.s.y0.f4857b = r0     // Catch: java.lang.Throwable -> L1e3
        L207:
            java.lang.String r0 = ""
            boolean r3 = r13.has(r9)     // Catch: java.lang.Throwable -> L1e3
            if (r3 == 0) goto L213
            java.lang.String r0 = r13.getString(r9)     // Catch: java.lang.Throwable -> L1e3
        L213:
            r6 = r0
            java.lang.String r2 = "/v3/iasdkauth"
            java.lang.String r3 = com.amap.api.col.s.y0.f4857b     // Catch: java.lang.Throwable -> L1e3
            r9 = r1
            r1 = r23
            com.amap.api.col.s.g2.j(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1e3
            r2 = r1
            int r0 = com.amap.api.col.s.y0.a     // Catch: java.lang.Throwable -> L1e3
            if (r0 != 0) goto L228
            java.lang.String r0 = com.amap.api.col.s.y0.f4857b     // Catch: java.lang.Throwable -> L1e3
            r15.f4872c = r0     // Catch: java.lang.Throwable -> L1e3
            goto L27a
        L228:
            boolean r0 = r13.has(r8)     // Catch: java.lang.Throwable -> L235
            if (r0 == 0) goto L237
            int r0 = r13.getInt(r8)     // Catch: java.lang.Throwable -> L235
            r15.f4873d = r0     // Catch: java.lang.Throwable -> L235
            goto L237
        L235:
            r0 = move-exception
            goto L23a
        L237:
            r1 = r18
            goto L23e
        L23a:
            com.amap.api.col.s.d2.e(r0, r14, r12)     // Catch: java.lang.Throwable -> L1e3
            goto L237
        L23e:
            boolean r0 = com.amap.api.col.s.j1.m(r13, r1)     // Catch: java.lang.Throwable -> L1e3
            if (r0 == 0) goto L27a
            org.json.JSONObject r0 = r13.getJSONObject(r1)     // Catch: java.lang.Throwable -> L1e3
            h(r9, r2, r7, r15, r0)     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r1 = "15K"
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch: java.lang.Throwable -> L27a
            java.lang.String r1 = "isTargetAble"
            java.lang.String r1 = r0.optString(r1)     // Catch: java.lang.Throwable -> L27a
            r7 = 0
            boolean r1 = u(r1, r7)     // Catch: java.lang.Throwable -> L27a
            java.lang.String r2 = "able"
            java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Throwable -> L27a
            boolean r0 = u(r0, r7)     // Catch: java.lang.Throwable -> L27a
            if (r0 != 0) goto L26f
            com.amap.api.col.s.e1.a()     // Catch: java.lang.Throwable -> L27a
            com.amap.api.col.s.e1.f(r9)     // Catch: java.lang.Throwable -> L27a
            goto L27a
        L26f:
            com.amap.api.col.s.e1 r0 = com.amap.api.col.s.e1.a()     // Catch: java.lang.Throwable -> L27a
            r0.d(r9, r1)     // Catch: java.lang.Throwable -> L27a
            goto L27a
        L277:
            com.amap.api.col.s.d2.e(r0, r14, r12)
        L27a:
            return r15
    }

    public static com.amap.api.col.s.i1 x(java.lang.String r1) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.y0$e> r0 = com.amap.api.col.s.y0.p
            java.lang.Object r1 = r0.get(r1)
            com.amap.api.col.s.y0$e r1 = (com.amap.api.col.s.y0.e) r1
            if (r1 == 0) goto Ld
            com.amap.api.col.s.i1 r1 = r1.a
            return r1
        Ld:
            r1 = 0
            return r1
    }

    private static java.lang.String y(java.lang.String r1, java.lang.String r2) {
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = com.amap.api.col.s.g1.b(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String z(java.util.List<java.lang.String> r1) {
            if (r1 == 0) goto L16
            int r0 = r1.size()     // Catch: java.lang.Exception -> L16
            if (r0 <= 0) goto L16
            r0 = 0
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L16
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L16
            return r1
        L16:
            java.lang.String r1 = ""
            return r1
    }
}
