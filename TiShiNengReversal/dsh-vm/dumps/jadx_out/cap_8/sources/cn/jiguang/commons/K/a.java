package cn.jiguang.commons.K;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String f836g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f837h = null;

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f838i = null;

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.String f839j = null;

    /* renamed from: k, reason: collision with root package name */
    private static final java.lang.String f840k = null;
    private static java.util.LinkedList l;
    private static final cn.jiguang.commons.K.a.c m = null;
    private java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f841c;

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f842d;

    /* renamed from: e, reason: collision with root package name */
    private long f843e;

    /* renamed from: f, reason: collision with root package name */
    private long f844f;

    /* renamed from: cn.jiguang.commons.K.a$a, reason: collision with other inner class name */
    class RunnableC0032a implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.K.a a;

        RunnableC0032a(cn.jiguang.commons.K.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()
                cn.jiguang.commons.K.a$c r1 = cn.jiguang.commons.K.a.a()
                cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.f772e
                r0.a(r1, r2)
                return
        }
    }

    class b extends android.net.ConnectivityManager.NetworkCallback {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f846c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.lang.String f847d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ java.lang.String f848e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.net.ConnectivityManager f849f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.K.a f850g;

        b(cn.jiguang.commons.K.a r1, java.lang.String r2, java.lang.String r3, org.json.JSONObject r4, java.lang.String r5, java.lang.String r6, android.net.ConnectivityManager r7) {
                r0 = this;
                r0.f850g = r1
                r0.a = r2
                r0.f845b = r3
                r0.f846c = r4
                r0.f847d = r5
                r0.f848e = r6
                r0.f849f = r7
                r0.<init>()
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network r10) {
                r9 = this;
                java.lang.String r0 = "JUaidManager"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
                r1.<init>()     // Catch: java.lang.Throwable -> L34
                java.lang.String r2 = "Network available: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L34
                r1.append(r10)     // Catch: java.lang.Throwable -> L34
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L34
                cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L34
                cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L34
                r1 = 1049(0x419, float:1.47E-42)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L34
                r0.m(r1)     // Catch: java.lang.Throwable -> L34
                cn.jiguang.commons.K.a r2 = r9.f850g     // Catch: java.lang.Throwable -> L34
                java.lang.String r4 = r9.a     // Catch: java.lang.Throwable -> L34
                java.lang.String r5 = r9.f845b     // Catch: java.lang.Throwable -> L34
                org.json.JSONObject r6 = r9.f846c     // Catch: java.lang.Throwable -> L34
                java.lang.String r7 = r9.f847d     // Catch: java.lang.Throwable -> L34
                java.lang.String r8 = r9.f848e     // Catch: java.lang.Throwable -> L34
                r3 = r10
                cn.jiguang.commons.K.a.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L34
                goto L39
            L34:
                cn.jiguang.commons.K.a r10 = r9.f850g     // Catch: java.lang.Throwable -> L3f
                cn.jiguang.commons.K.a.a(r10)     // Catch: java.lang.Throwable -> L3f
            L39:
                android.net.ConnectivityManager r10 = r9.f849f
                r10.unregisterNetworkCallback(r9)
                return
            L3f:
                r0 = move-exception
                r10 = r0
                android.net.ConnectivityManager r0 = r9.f849f
                r0.unregisterNetworkCallback(r9)
                throw r10
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
                r8 = this;
                java.lang.String r0 = "JUaidManager"
                java.lang.String r1 = "Network unavailable"
                cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L24
                cn.jiguang.commons.K.a r2 = r8.f850g     // Catch: java.lang.Throwable -> L24
                java.lang.String r3 = r8.a     // Catch: java.lang.Throwable -> L24
                java.lang.String r4 = r8.f845b     // Catch: java.lang.Throwable -> L24
                org.json.JSONObject r5 = r8.f846c     // Catch: java.lang.Throwable -> L24
                java.lang.String r6 = r8.f847d     // Catch: java.lang.Throwable -> L24
                java.lang.String r7 = r8.f848e     // Catch: java.lang.Throwable -> L24
                cn.jiguang.commons.K.a.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L24
                cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L24
                r1 = 1050(0x41a, float:1.471E-42)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L24
                r0.m(r1)     // Catch: java.lang.Throwable -> L24
                goto L29
            L24:
                cn.jiguang.commons.K.a r0 = r8.f850g     // Catch: java.lang.Throwable -> L2f
                cn.jiguang.commons.K.a.a(r0)     // Catch: java.lang.Throwable -> L2f
            L29:
                android.net.ConnectivityManager r0 = r8.f849f
                r0.unregisterNetworkCallback(r8)
                return
            L2f:
                r0 = move-exception
                android.net.ConnectivityManager r1 = r8.f849f
                r1.unregisterNetworkCallback(r8)
                throw r0
        }
    }

    private static class c implements java.lang.Runnable {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(cn.jiguang.commons.K.a.RunnableC0032a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L15
                r1 = 1047(0x417, float:1.467E-42)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L15
                r0.m(r1)     // Catch: java.lang.Throwable -> L15
                cn.jiguang.commons.K.a r0 = cn.jiguang.commons.K.a.e()     // Catch: java.lang.Throwable -> L15
                r0.c()     // Catch: java.lang.Throwable -> L15
                return
            L15:
                r0 = move-exception
                cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
                r2 = 1039(0x40f, float:1.456E-42)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.m(r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "throwable e="
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "JUaidManager"
                cn.jiguang.commons.w.a.f(r1, r0)
                return
        }
    }

    private static final class d {
        private static final cn.jiguang.commons.K.a a = null;

        static {
                cn.jiguang.commons.K.a r0 = new cn.jiguang.commons.K.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.K.a.d.a = r0
                return
        }

        public d() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.K.a a() {
                cn.jiguang.commons.K.a r0 = cn.jiguang.commons.K.a.d.a
                return r0
        }
    }

    static {
            r0 = 16
            byte[] r1 = new byte[r0]
            r1 = {x0054: FILL_ARRAY_DATA , data: [88, 99, 23, 33, 91, 70, 122, 67, 18, 113, 127, 85, 75, 114, 108, 120} // fill-array
            java.lang.String r1 = cn.jiguang.commons.L.n.c(r1)
            cn.jiguang.commons.K.a.f836g = r1
            byte[] r0 = new byte[r0]
            r0 = {x0060: FILL_ARRAY_DATA , data: [65, 8, 65, 72, 109, 123, 93, 64, 118, 122, 88, 68, 82, 67, 76, 43} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.K.a.f837h = r0
            r0 = 29
            byte[] r0 = new byte[r0]
            r0 = {x006c: FILL_ARRAY_DATA , data: [88, 84, 109, 120, 101, 43, 31, 15, 122, 109, 37, 116, 7, 21, 125, 61, 56, 123, 64, 85, 106, 96, 56, 114, 94, 15, 110, 97, 57} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.K.a.f838i = r0
            r1 = 34
            byte[] r1 = new byte[r1]
            r1 = {x0080: FILL_ARRAY_DATA , data: [121, 68, 84, 105, 123, 44, 62, 31, 67, 124, 59, 115, 38, 5, 68, 44, 37, 127, 97, 70, 22, 55, 98, 102, 100, 67, 72, 55, 107, 120, 62, 71, 73, 54} // fill-array
            java.lang.String r1 = cn.jiguang.commons.L.n.c(r1)
            cn.jiguang.commons.K.a.f839j = r1
            cn.jiguang.commons.K.a.f840k = r0
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            cn.jiguang.commons.K.a.l = r2
            cn.jiguang.commons.K.a$c r2 = new cn.jiguang.commons.K.a$c
            r3 = 0
            r2.<init>(r3)
            cn.jiguang.commons.K.a.m = r2
            java.util.LinkedList r2 = cn.jiguang.commons.K.a.l
            r2.clear()
            java.util.LinkedList r2 = cn.jiguang.commons.K.a.l
            r2.add(r0)
            java.util.LinkedList r0 = cn.jiguang.commons.K.a.l
            r0.add(r1)
            return
    }

    private a() {
            r3 = this;
            r3.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = g()
            r0.append(r1)
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x004a: FILL_ARRAY_DATA , data: [82, 120, 56, 117, 117, 85} // fill-array
            java.lang.String r2 = cn.jiguang.commons.L.n.c(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = g()
            r0.append(r2)
            byte[] r1 = new byte[r1]
            r1 = {x0052: FILL_ARRAY_DATA , data: [66, 125, 56, 100, 32, 65} // fill-array
            java.lang.String r1 = cn.jiguang.commons.L.n.c(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.f841c = r0
            r0 = 0
            r3.f843e = r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r3.f844f = r0
            return
    }

    /* synthetic */ a(cn.jiguang.commons.K.a.RunnableC0032a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ cn.jiguang.commons.K.a.c a() {
            cn.jiguang.commons.K.a$c r0 = cn.jiguang.commons.K.a.m
            return r0
    }

    private cn.jiguang.commons.x.d a(android.net.Network r2, java.lang.String r3, java.lang.String r4, org.json.JSONObject r5, java.lang.String r6) {
            r1 = this;
            cn.jiguang.commons.x.c r0 = new cn.jiguang.commons.x.c
            r0.<init>(r4)
            r0.c(r3)
            if (r2 == 0) goto Ld
            r0.a(r2)
        Ld:
            r3.getClass()
            int r2 = r3.hashCode()
            r4 = -1
            switch(r2) {
                case 70454: goto L2f;
                case 79599: goto L24;
                case 2461856: goto L19;
                default: goto L18;
            }
        L18:
            goto L39
        L19:
            java.lang.String r2 = "POST"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L22
            goto L39
        L22:
            r4 = 2
            goto L39
        L24:
            java.lang.String r2 = "PUT"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2d
            goto L39
        L2d:
            r4 = 1
            goto L39
        L2f:
            java.lang.String r2 = "GET"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L38
            goto L39
        L38:
            r4 = 0
        L39:
            switch(r4) {
                case 0: goto L56;
                case 1: goto L4b;
                case 2: goto L4b;
                default: goto L3c;
            }
        L3c:
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()
            r3 = 1038(0x40e, float:1.455E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.m(r3)
            r2 = 0
            return r2
        L4b:
            r1.a(r0, r5)
            r0.a(r6)
            cn.jiguang.commons.x.d r2 = cn.jiguang.commons.x.e.a(r0)
            return r2
        L56:
            cn.jiguang.commons.x.d r2 = cn.jiguang.commons.x.e.a(r0)
            return r2
    }

    private java.lang.String a(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            r0 = 2
            byte[] r5 = android.util.Base64.decode(r5, r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = cn.jiguang.commons.K.a.f837h     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = cn.jiguang.commons.K.a.f836g     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            byte[] r5 = cn.jiguang.commons.L.z.a(r5, r0, r2, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            return r1
    }

    private org.json.JSONObject a(java.lang.String r12, org.json.JSONObject r13, boolean r14) {
            r11 = this;
            java.lang.String r0 = "application/json"
            java.lang.String r1 = "JUaidManager"
            r2 = 0
            java.lang.String r3 = "uid"
            java.lang.String r3 = r13.optString(r3)     // Catch: java.lang.Throwable -> L77
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = r4.j()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = cn.jiguang.commons.L.k.d(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = r4.toUpperCase()     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r5.<init>()     // Catch: java.lang.Throwable -> L77
            r5.append(r3)     // Catch: java.lang.Throwable -> L77
            r5.append(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = cn.jiguang.commons.L.k.d(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = r4.toUpperCase()     // Catch: java.lang.Throwable -> L77
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L39
            return r2
        L39:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r5.<init>()     // Catch: java.lang.Throwable -> L77
            r5.append(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = ":"
            r5.append(r3)     // Catch: java.lang.Throwable -> L77
            r5.append(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L77
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L77
            r4 = 10
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch: java.lang.Throwable -> L77
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L5e
            return r2
        L5e:
            r4 = 0
            r6 = r12
            r5 = 0
        L61:
            java.util.LinkedList r7 = cn.jiguang.commons.K.a.l     // Catch: java.lang.Throwable -> L77
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L77
            if (r4 >= r7) goto L19f
            r7 = 1
            if (r5 != 0) goto L7a
            java.lang.String r5 = cn.jiguang.commons.K.a.f838i     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = cn.jiguang.commons.K.a.f839j     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = r6.replace(r5, r8)     // Catch: java.lang.Throwable -> L77
            r6 = r5
            r5 = 1
            goto L8f
        L77:
            goto L18d
        L7a:
            if (r5 != 0) goto L8e
            java.util.LinkedList r6 = cn.jiguang.commons.K.a.l     // Catch: java.lang.Throwable -> L77
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L77
            int r6 = r6 - r7
            if (r4 != r6) goto L8e
            java.lang.String r6 = cn.jiguang.commons.K.a.f838i     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = cn.jiguang.commons.K.a.f839j     // Catch: java.lang.Throwable -> L77
            java.lang.String r6 = r12.replace(r6, r7)     // Catch: java.lang.Throwable -> L77
            goto L8f
        L8e:
            r6 = r12
        L8f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r7.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "url:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L77
            r7.append(r6)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = ", param json:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = r13.toString()     // Catch: java.lang.Throwable -> L77
            r7.append(r8)     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L77
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Throwable -> L77
            cn.jiguang.commons.x.c r7 = new cn.jiguang.commons.x.c     // Catch: java.lang.Throwable -> L77
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "Content-Type"
            r7.a(r8, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "Accept"
            r7.a(r8, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "X-Http-Platform"
            java.lang.String r9 = "android"
            r7.a(r8, r9)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "X-Http-Appkey"
            java.lang.String r9 = "appkey"
            java.lang.String r9 = r13.optString(r9)     // Catch: java.lang.Throwable -> L77
            r7.a(r8, r9)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "Authorization"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r9.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = "Basic "
            r9.append(r10)     // Catch: java.lang.Throwable -> L77
            r9.append(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L77
            r7.a(r8, r9)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "Charset"
            java.lang.String r9 = "UTF-8"
            r7.a(r8, r9)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = r13.toString()     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = r11.c(r8)     // Catch: java.lang.Throwable -> L77
            r7.a(r8)     // Catch: java.lang.Throwable -> L77
            cn.jiguang.commons.x.d r7 = cn.jiguang.commons.x.e.e(r7)     // Catch: java.lang.Throwable -> L77
            int r8 = r7.d()     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r9.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = "responseCode:"
            r9.append(r10)     // Catch: java.lang.Throwable -> L77
            r9.append(r8)     // Catch: java.lang.Throwable -> L77
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L77
            cn.jiguang.commons.w.a.a(r1, r9)     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = r7.a()     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r9.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = "response:"
            r9.append(r10)     // Catch: java.lang.Throwable -> L77
            r9.append(r7)     // Catch: java.lang.Throwable -> L77
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L77
            cn.jiguang.commons.w.a.a(r1, r9)     // Catch: java.lang.Throwable -> L77
            r9 = 200(0xc8, float:2.8E-43)
            if (r9 != r8) goto L17a
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L77
            if (r8 != 0) goto L16e
            java.lang.String r7 = r11.a(r7)     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r8.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r9 = "request success,response body:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L77
            r8.append(r7)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L77
            cn.jiguang.commons.w.a.a(r1, r8)     // Catch: java.lang.Throwable -> L77
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L77
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = "code"
            int r7 = r8.optInt(r7)     // Catch: java.lang.Throwable -> L77
            r9 = 2000(0x7d0, float:2.803E-42)
            if (r9 != r7) goto L15e
            return r8
        L15e:
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L77
            if (r14 == 0) goto L167
            r8 = 1020(0x3fc, float:1.43E-42)
            goto L169
        L167:
            r8 = 1033(0x409, float:1.448E-42)
        L169:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L77
            goto L186
        L16e:
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L77
            if (r14 == 0) goto L177
            r8 = 1019(0x3fb, float:1.428E-42)
            goto L169
        L177:
            r8 = 1032(0x408, float:1.446E-42)
            goto L169
        L17a:
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L77
            if (r14 == 0) goto L183
            r8 = 1016(0x3f8, float:1.424E-42)
            goto L169
        L183:
            r8 = 1018(0x3fa, float:1.427E-42)
            goto L169
        L186:
            r7.m(r8)     // Catch: java.lang.Throwable -> L77
            int r4 = r4 + 1
            goto L61
        L18d:
            cn.jiguang.commons.A.a r12 = cn.jiguang.commons.A.a.f()
            if (r14 == 0) goto L196
            r13 = 1036(0x40c, float:1.452E-42)
            goto L198
        L196:
            r13 = 1037(0x40d, float:1.453E-42)
        L198:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.m(r13)
        L19f:
            return r2
    }

    private org.json.JSONObject a(java.util.Map r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3a
        Ld:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L3a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3a
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L36
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L35
            java.lang.String r2 = "空key"
            goto L36
        L35:
            r2 = r1
        L36:
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L3a
            goto Ld
        L3a:
            return r0
    }

    private void a(long r3) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.a(r0, r3)
            return
    }

    private void a(long r3, long r5) {
            r2 = this;
            r2.f843e = r3
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto Lb
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
        Lb:
            android.content.Context r3 = r2.f842d
            java.lang.String r4 = "cn.jiguang.common"
            r0 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            if (r3 == 0) goto L2b
            android.content.SharedPreferences$Editor r3 = r3.edit()
            long r0 = r2.f843e
            java.lang.String r4 = "uaid_last_time"
            android.content.SharedPreferences$Editor r3 = r3.putLong(r4, r0)
            java.lang.String r4 = "uaid_internal_time"
            android.content.SharedPreferences$Editor r3 = r3.putLong(r4, r5)
            r3.apply()
        L2b:
            r2.f844f = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "save reqTime requestTime="
            r3.append(r4)
            long r4 = r2.f843e
            r3.append(r4)
            java.lang.String r4 = " next_time="
            r3.append(r4)
            long r4 = r2.f844f
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "JUaidManager"
            cn.jiguang.commons.w.a.a(r4, r3)
            return
    }

    private void a(android.net.ConnectivityManager r11, boolean r12) {
            r10 = this;
            r0 = 1044(0x414, float:1.463E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.net.NetworkInfo r11 = r11.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "old network no activeNetworkInfo, hadChangePermission= "
            java.lang.String r2 = "JUaidManager"
            if (r11 != 0) goto L33
            cn.jiguang.commons.A.a r11 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lc4
            r3 = 1009(0x3f1, float:1.414E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lc4
            r11.m(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r11.<init>()     // Catch: java.lang.Throwable -> Lc4
            r11.append(r1)     // Catch: java.lang.Throwable -> Lc4
            r11.append(r12)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lc4
            cn.jiguang.commons.w.a.a(r2, r11)     // Catch: java.lang.Throwable -> Lc4
            r10.a(r12)     // Catch: java.lang.Throwable -> Lc4
            return
        L33:
            int r3 = r11.getType()     // Catch: java.lang.Throwable -> Lc4
            boolean r4 = r10.a(r3)     // Catch: java.lang.Throwable -> Lc4
            r5 = 0
            r6 = 1
            if (r6 != r3) goto L41
            r7 = 1
            goto L42
        L41:
            r7 = 0
        L42:
            if (r4 == 0) goto L51
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L79
            r9 = 1040(0x410, float:1.457E-42)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L79
            r8.m(r9)     // Catch: java.lang.Throwable -> L79
        L51:
            if (r7 == 0) goto L60
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L79
            r8 = 1041(0x411, float:1.459E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L79
            r7.m(r8)     // Catch: java.lang.Throwable -> L79
        L60:
            cn.jiguang.commons.A.a r7 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r8.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = "o"
            r8.append(r9)     // Catch: java.lang.Throwable -> L79
            r8.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L79
            r7.m(r3)     // Catch: java.lang.Throwable -> L79
            goto L80
        L79:
            cn.jiguang.commons.A.a r3 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lc4
            r3.m(r0)     // Catch: java.lang.Throwable -> Lc4
        L80:
            boolean r11 = r11.isConnected()     // Catch: java.lang.Throwable -> Lc4
            if (r11 != 0) goto L94
            cn.jiguang.commons.A.a r11 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lc4
            r12 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Lc4
            r11.m(r12)     // Catch: java.lang.Throwable -> Lc4
            goto Lcb
        L94:
            cn.jiguang.commons.A.a r11 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lc4
            r3 = 1048(0x418, float:1.469E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lc4
            r11.m(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r11.<init>()     // Catch: java.lang.Throwable -> Lc4
            r11.append(r1)     // Catch: java.lang.Throwable -> Lc4
            r11.append(r12)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = " mobileNetworkType="
            r11.append(r1)     // Catch: java.lang.Throwable -> Lc4
            r11.append(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lc4
            cn.jiguang.commons.w.a.a(r2, r11)     // Catch: java.lang.Throwable -> Lc4
            if (r12 == 0) goto Lc0
            if (r4 != 0) goto Lc0
            r5 = 1
        Lc0:
            r10.a(r5)     // Catch: java.lang.Throwable -> Lc4
            goto Lcb
        Lc4:
            cn.jiguang.commons.A.a r11 = cn.jiguang.commons.A.a.f()
            r11.m(r0)
        Lcb:
            return
    }

    private void a(android.net.Network r1, java.lang.String r2, java.lang.String r3, org.json.JSONObject r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            cn.jiguang.commons.x.d r1 = r0.a(r1, r2, r3, r4, r5)
            r2 = r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "performRequest httpResponse="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "JUaidManager"
            cn.jiguang.commons.w.a.a(r4, r3)
            r0.a(r1, r6)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.K.a r0) {
            r0.h()
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.K.a r0, android.net.Network r1, java.lang.String r2, java.lang.String r3, org.json.JSONObject r4, java.lang.String r5, java.lang.String r6) {
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.K.a r0, java.lang.String r1, java.lang.String r2, org.json.JSONObject r3, java.lang.String r4, java.lang.String r5) {
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    private void a(cn.jiguang.commons.x.c r4, org.json.JSONObject r5) {
            r3 = this;
            java.util.Iterator r0 = r5.keys()     // Catch: java.lang.Throwable -> L18
        L4:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r5.getString(r1)     // Catch: java.lang.Throwable -> L18
            r4.a(r1, r2)     // Catch: java.lang.Throwable -> L18
            goto L4
        L18:
            return
    }

    private void a(cn.jiguang.commons.x.d r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "JUaidManager"
            if (r6 == 0) goto Lf6
            int r1 = r6.d()     // Catch: java.lang.Throwable -> L102
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L102
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L102
            r3.<init>()     // Catch: java.lang.Throwable -> L102
            java.lang.String r4 = "token code:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L102
            r3.append(r1)     // Catch: java.lang.Throwable -> L102
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L102
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Throwable -> L102
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L102
            r3.<init>()     // Catch: java.lang.Throwable -> L102
            java.lang.String r4 = "tokenResponse:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L102
            r3.append(r2)     // Catch: java.lang.Throwable -> L102
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L102
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Throwable -> L102
            r3 = 200(0xc8, float:2.8E-43)
            if (r3 != r1) goto Lea
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L102
            if (r1 != 0) goto Lde
            org.json.JSONObject r1 = r5.f()     // Catch: java.lang.Throwable -> L102
            if (r1 != 0) goto L52
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L102
            r7 = 1015(0x3f7, float:1.422E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L102
        L4e:
            r6.m(r7)     // Catch: java.lang.Throwable -> L102
            return
        L52:
            java.lang.String r3 = "channelId"
            r1.put(r3, r7)     // Catch: java.lang.Throwable -> L102
            java.lang.String r7 = "core_sdk_ver"
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L102
            java.lang.String r3 = r3.g()     // Catch: java.lang.Throwable -> L102
            r1.put(r7, r3)     // Catch: java.lang.Throwable -> L102
            java.lang.String r7 = "respBody"
            r1.put(r7, r2)     // Catch: java.lang.Throwable -> L102
            java.lang.String r7 = "respHeader"
            java.util.Map r6 = r6.e()     // Catch: java.lang.Throwable -> L102
            org.json.JSONObject r6 = r5.a(r6)     // Catch: java.lang.Throwable -> L102
            r1.put(r7, r6)     // Catch: java.lang.Throwable -> L102
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L102
            r6.<init>()     // Catch: java.lang.Throwable -> L102
            java.lang.String r7 = "start to reportToken paramJson="
            r6.append(r7)     // Catch: java.lang.Throwable -> L102
            r6.append(r1)     // Catch: java.lang.Throwable -> L102
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L102
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Throwable -> L102
            java.lang.String r6 = r5.a     // Catch: java.lang.Throwable -> L102
            r7 = 0
            org.json.JSONObject r6 = r5.a(r6, r1, r7)     // Catch: java.lang.Throwable -> L102
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L102
            r7.<init>()     // Catch: java.lang.Throwable -> L102
            java.lang.String r1 = "reportToken response="
            r7.append(r1)     // Catch: java.lang.Throwable -> L102
            r7.append(r6)     // Catch: java.lang.Throwable -> L102
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L102
            cn.jiguang.commons.w.a.a(r0, r7)     // Catch: java.lang.Throwable -> L102
            if (r6 == 0) goto Ld2
            java.lang.String r7 = "code"
            int r6 = r6.optInt(r7)     // Catch: java.lang.Throwable -> L102
            r7 = 2000(0x7d0, float:2.803E-42)
            if (r6 != r7) goto Lc1
            java.lang.String r6 = "reportToken success"
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Throwable -> L102
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L102
            r7 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L102
            goto L4e
        Lc1:
            java.lang.String r6 = "reportToken fail"
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Throwable -> L102
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L102
            r7 = 1033(0x409, float:1.448E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L102
            goto L4e
        Ld2:
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L102
            r7 = 1032(0x408, float:1.446E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L102
            goto L4e
        Lde:
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L102
            r7 = 1031(0x407, float:1.445E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L102
            goto L4e
        Lea:
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L102
            r7 = 1030(0x406, float:1.443E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L102
            goto L4e
        Lf6:
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L102
            r7 = 1028(0x404, float:1.44E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L102
            goto L4e
        L102:
            cn.jiguang.commons.A.a r6 = cn.jiguang.commons.A.a.f()
            r7 = 1034(0x40a, float:1.449E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.m(r7)
            return
    }

    private void a(java.lang.String r8, java.lang.String r9, org.json.JSONObject r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            r1 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    private void a(org.json.JSONObject r11, boolean r12) {
            r10 = this;
            java.lang.String r0 = "JUaidManager"
            cn.jiguang.commons.g.l r1 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Throwable -> Lcd
            r2 = 1037(0x40d, float:1.453E-42)
            boolean r1 = r1.a(r2)     // Catch: java.lang.Throwable -> Lcd
            r2 = 0
            if (r1 == 0) goto L13
            if (r12 == 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r4.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r5 = "first enable="
            r4.append(r5)     // Catch: java.lang.Throwable -> Lcd
            r4.append(r12)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = " server enable="
            r4.append(r12)     // Catch: java.lang.Throwable -> Lcd
            r4.append(r1)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = " final enable="
            r4.append(r12)     // Catch: java.lang.Throwable -> Lcd
            r4.append(r3)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = r4.toString()     // Catch: java.lang.Throwable -> Lcd
            cn.jiguang.commons.w.a.a(r0, r12)     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r12.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = "startReqTokenFromOperator startReqTokenFromOperator= "
            r12.append(r1)     // Catch: java.lang.Throwable -> Lcd
            r12.append(r11)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lcd
            cn.jiguang.commons.w.a.a(r0, r12)     // Catch: java.lang.Throwable -> Lcd
            if (r11 != 0) goto L5c
            cn.jiguang.commons.A.a r11 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lcd
            r12 = 1023(0x3ff, float:1.434E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Lcd
        L58:
            r11.m(r12)     // Catch: java.lang.Throwable -> Lcd
            return
        L5c:
            java.lang.String r12 = "list"
            org.json.JSONArray r11 = r11.optJSONArray(r12)     // Catch: java.lang.Throwable -> Lcd
            if (r11 != 0) goto L6f
            cn.jiguang.commons.A.a r11 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lcd
            r12 = 1027(0x403, float:1.439E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Lcd
            goto L58
        L6f:
            int r12 = r11.length()     // Catch: java.lang.Throwable -> Lcd
            if (r2 >= r12) goto Lcc
            org.json.JSONObject r12 = r11.getJSONObject(r2)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "channelId"
            java.lang.String r9 = r12.optString(r0)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "headers"
            org.json.JSONObject r7 = r12.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "method"
            java.lang.String r0 = r12.optString(r0)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = "requestBody"
            java.lang.String r8 = r12.optString(r1)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = "url"
            java.lang.String r6 = r12.optString(r1)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r5 = r0.toUpperCase()     // Catch: java.lang.Throwable -> Lcd
            cn.jiguang.commons.A.a r12 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lcd
            r0 = 1055(0x41f, float:1.478E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lcd
            r12.m(r0)     // Catch: java.lang.Throwable -> Lcd
            r4 = r10
            if (r3 == 0) goto Lb9
            r4.c(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lcd
            cn.jiguang.commons.A.a r12 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lcd
            r0 = 1051(0x41b, float:1.473E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lcd
            goto Lc6
        Lb9:
            r4.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lcd
            cn.jiguang.commons.A.a r12 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> Lcd
            r0 = 1052(0x41c, float:1.474E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lcd
        Lc6:
            r12.m(r0)     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2 + 1
            goto L6f
        Lcc:
            return
        Lcd:
            cn.jiguang.commons.A.a r11 = cn.jiguang.commons.A.a.f()
            r12 = 1029(0x405, float:1.442E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.m(r12)
            return
    }

    private void a(boolean r8) {
            r7 = this;
            java.lang.String r0 = "JUaidManager"
            org.json.JSONObject r1 = r7.j()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L16
            r1 = 1022(0x3fe, float:1.432E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L16
        L12:
            r8.m(r1)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r8 = move-exception
            goto L80
        L18:
            java.lang.String r2 = "data"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L70
            java.lang.String r2 = "token_switch"
            boolean r2 = r1.optBoolean(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = "next_time"
            long r3 = r1.optLong(r3)     // Catch: java.lang.Throwable -> L16
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r5.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r6 = "mSwitch="
            r5.append(r6)     // Catch: java.lang.Throwable -> L16
            r5.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r6 = " internalTime="
            r5.append(r6)     // Catch: java.lang.Throwable -> L16
            r5.append(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L16
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L16
            r7.a(r3)     // Catch: java.lang.Throwable -> L16
            cn.jiguang.commons.y.a.c(r0)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L65
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L16
            r3 = 1053(0x41d, float:1.476E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16
            r2.m(r3)     // Catch: java.lang.Throwable -> L16
            r7.a(r1, r8)     // Catch: java.lang.Throwable -> L16
            return
        L65:
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L16
            r1 = 1021(0x3fd, float:1.431E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L16
            goto L12
        L70:
            long r1 = r7.f844f     // Catch: java.lang.Throwable -> L16
            r7.a(r1)     // Catch: java.lang.Throwable -> L16
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L16
            r1 = 1023(0x3ff, float:1.434E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L16
            goto L12
        L80:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
            r2 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.m(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startReq throwable:"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r8)
            return
    }

    private boolean a(int r2) {
            r1 = this;
            if (r2 == 0) goto L14
            r0 = 4
            if (r2 == r0) goto L14
            r0 = 5
            if (r2 == r0) goto L14
            r0 = 2
            if (r2 == r0) goto L14
            r0 = 6
            if (r2 == r0) goto L14
            r0 = 3
            if (r2 != r0) goto L12
            goto L14
        L12:
            r2 = 0
            return r2
        L14:
            r2 = 1
            return r2
    }

    private java.lang.String c(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = cn.jiguang.commons.K.a.f837h     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = cn.jiguang.commons.K.a.f836g     // Catch: java.lang.Throwable -> L15
            r2 = 1
            byte[] r4 = cn.jiguang.commons.L.z.a(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L15
            r0 = 2
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r0)     // Catch: java.lang.Throwable -> L15
            return r4
        L15:
            java.lang.String r4 = ""
            return r4
    }

    private void c(java.lang.String r11, java.lang.String r12, org.json.JSONObject r13, java.lang.String r14, java.lang.String r15) {
            r10 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L42
            android.net.ConnectivityManager r8 = r10.d()     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L13
            java.lang.String r0 = "JUaidManager"
            java.lang.String r1 = "No connectivity manager available"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L42
            r10.a(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L42
            return
        L13:
            android.net.NetworkRequest$Builder r9 = new android.net.NetworkRequest$Builder     // Catch: java.lang.Throwable -> L42
            r9.<init>()     // Catch: java.lang.Throwable -> L42
            r1 = 12
            r9.addCapability(r1)     // Catch: java.lang.Throwable -> L42
            r1 = 0
            r9.addTransportType(r1)     // Catch: java.lang.Throwable -> L42
            cn.jiguang.commons.K.a$b r1 = new cn.jiguang.commons.K.a$b     // Catch: java.lang.Throwable -> L42
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L42
            r11 = 26
            if (r0 < r11) goto L3a
            android.net.NetworkRequest r11 = r9.build()     // Catch: java.lang.Throwable -> L42
            r12 = 15000(0x3a98, float:2.102E-41)
            cn.jiguang.commons.K.b.a(r8, r11, r1, r12)     // Catch: java.lang.Throwable -> L42
            return
        L3a:
            android.net.NetworkRequest r11 = r9.build()     // Catch: java.lang.Throwable -> L42
            r8.requestNetwork(r11, r1)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r10.h()
            return
    }

    public static cn.jiguang.commons.K.a e() {
            cn.jiguang.commons.K.a r0 = cn.jiguang.commons.K.a.d.a()
            return r0
    }

    private org.json.JSONObject f() {
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.d()     // Catch: java.lang.Throwable -> L68
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L68
            r3 = 0
            java.lang.String r4 = "JUaidManager"
            if (r2 == 0) goto L29
            java.lang.String r1 = "appKey is null, no need req"
            cn.jiguang.commons.w.a.f(r4, r1)     // Catch: java.lang.Throwable -> L68
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L68
            r2 = 1013(0x3f5, float:1.42E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            r1.m(r2)     // Catch: java.lang.Throwable -> L68
            return r3
        L29:
            cn.jiguang.commons.g.p r2 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L68
            long r5 = r2.l()     // Catch: java.lang.Throwable -> L68
            r7 = 0
            r2 = 1014(0x3f6, float:1.421E-42)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L4a
            java.lang.String r1 = "uid is 0,no need req"
            cn.jiguang.commons.w.a.f(r4, r1)     // Catch: java.lang.Throwable -> L68
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            r1.m(r2)     // Catch: java.lang.Throwable -> L68
            return r3
        L4a:
            java.lang.String r3 = "appkey"
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "uid"
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "os_ver"
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r3.d(r2)     // Catch: java.lang.Throwable -> L68
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "platform"
            java.lang.String r2 = "a"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L68
        L68:
            return r0
    }

    private static java.lang.String g() {
            java.lang.String r0 = cn.jiguang.commons.K.a.f840k
            return r0
    }

    private void h() {
            r2 = this;
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r1 = 1029(0x405, float:1.442E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.m(r1)
            return
    }

    private void i() {
            r5 = this;
            long r0 = r5.f843e
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Le
            long r0 = r5.f844f
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L2c
        Le:
            android.content.Context r0 = r5.f842d
            java.lang.String r1 = "cn.jiguang.common"
            r4 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r4)
            if (r0 == 0) goto L2c
            java.lang.String r1 = "uaid_last_time"
            long r1 = r0.getLong(r1, r2)
            r5.f843e = r1
            java.lang.String r1 = "uaid_internal_time"
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0.getLong(r1, r2)
            r5.f844f = r0
        L2c:
            return
    }

    private org.json.JSONObject j() {
            r5 = this;
            r0 = 0
            org.json.JSONObject r1 = r5.f()     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L15
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L40
            r2 = 1035(0x40b, float:1.45E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L40
            r1.m(r2)     // Catch: java.lang.Throwable -> L40
            return r0
        L15:
            java.lang.String r2 = "core_sdk_ver"
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = r3.g()     // Catch: java.lang.Throwable -> L40
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "JUaidManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r3.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "start to reqUrlInternal paramJson="
            r3.append(r4)     // Catch: java.lang.Throwable -> L40
            r3.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L40
            cn.jiguang.commons.w.a.a(r2, r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r5.f841c     // Catch: java.lang.Throwable -> L40
            r3 = 1
            org.json.JSONObject r0 = r5.a(r2, r1, r3)     // Catch: java.lang.Throwable -> L40
            return r0
        L40:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
            r2 = 1017(0x3f9, float:1.425E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.m(r2)
            return r0
    }

    public void a(android.content.Context r8) {
            r7 = this;
            android.content.Context r0 = r7.f842d
            if (r0 != 0) goto L6
            r7.f842d = r8
        L6:
            r7.i()
            java.lang.String r8 = "getUaidAsyn"
            java.lang.String r0 = "JUaidManager"
            cn.jiguang.commons.w.a.a(r0, r8)
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()
            r1 = 999(0x3e7, float:1.4E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.m(r1)
            cn.jiguang.commons.f.k r8 = cn.jiguang.commons.f.k.a()
            r1 = 2201(0x899, float:3.084E-42)
            boolean r8 = r8.a(r1)
            if (r8 == 0) goto L6c
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()
            r1 = 1025(0x401, float:1.436E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.m(r1)
            long r1 = r7.f843e
            long r3 = r7.f844f
            boolean r8 = cn.jiguang.commons.y.a.a(r0, r1, r3)
            if (r8 != 0) goto L4e
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()
            r0 = 1012(0x3f4, float:1.418E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.m(r0)
            return
        L4e:
            long r2 = r7.f843e
            long r4 = r7.f844f
            cn.jiguang.commons.K.a$a r6 = new cn.jiguang.commons.K.a$a
            r6.<init>(r7)
            java.lang.String r1 = "JUaidManager"
            boolean r8 = cn.jiguang.commons.y.a.a(r1, r2, r4, r6)
            if (r8 == 0) goto L60
            return
        L60:
            cn.jiguang.commons.C.a r8 = cn.jiguang.commons.C.a.c()
            cn.jiguang.commons.K.a$c r0 = cn.jiguang.commons.K.a.m
            cn.jiguang.commons.C.a$g r1 = cn.jiguang.commons.C.a.g.f772e
            r8.a(r0, r1)
            return
        L6c:
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()
            r0 = 1026(0x402, float:1.438E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.m(r0)
            return
    }

    public void c() {
            r11 = this;
            r0 = 1044(0x414, float:1.463E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r1 = r11.f844f     // Catch: java.lang.Throwable -> L180
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1d
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            r2 = 1056(0x420, float:1.48E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L180
        L19:
            r1.m(r2)     // Catch: java.lang.Throwable -> L180
            goto L35
        L1d:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L180
            r2.<init>()     // Catch: java.lang.Throwable -> L180
            java.lang.String r3 = "stime"
            r2.append(r3)     // Catch: java.lang.Throwable -> L180
            long r3 = r11.f844f     // Catch: java.lang.Throwable -> L180
            r2.append(r3)     // Catch: java.lang.Throwable -> L180
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L180
            goto L19
        L35:
            java.lang.String r1 = "android.permission.CHANGE_NETWORK_STATE"
            boolean r1 = cn.jiguang.commons.L.u.c(r1)     // Catch: java.lang.Throwable -> L180
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            if (r1 == 0) goto L44
            r3 = 1045(0x415, float:1.464E-42)
            goto L46
        L44:
            r3 = 1046(0x416, float:1.466E-42)
        L46:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L180
            r2.m(r3)     // Catch: java.lang.Throwable -> L180
            android.net.ConnectivityManager r2 = r11.d()     // Catch: java.lang.Throwable -> L180
            java.lang.String r3 = "JUaidManager"
            if (r2 != 0) goto L7a
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            r4 = 1003(0x3eb, float:1.406E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L180
            r2.m(r4)     // Catch: java.lang.Throwable -> L180
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L180
            r2.<init>()     // Catch: java.lang.Throwable -> L180
            java.lang.String r4 = "no connectivityManager hadChangePermission= "
            r2.append(r4)     // Catch: java.lang.Throwable -> L180
            r2.append(r1)     // Catch: java.lang.Throwable -> L180
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L180
            cn.jiguang.commons.w.a.a(r3, r2)     // Catch: java.lang.Throwable -> L180
            r11.a(r1)     // Catch: java.lang.Throwable -> L180
            return
        L7a:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L180
            r5 = 23
            if (r4 < r5) goto L93
            android.net.Network r4 = androidx.work.impl.constraints.trackers.a.a(r2)     // Catch: java.lang.Throwable -> L180
            if (r4 != 0) goto L97
            cn.jiguang.commons.A.a r3 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            r4 = 1004(0x3ec, float:1.407E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L180
        L90:
            r3.m(r4)     // Catch: java.lang.Throwable -> L180
        L93:
            r11.a(r2, r1)     // Catch: java.lang.Throwable -> L180
            return
        L97:
            android.net.NetworkCapabilities r4 = r2.getNetworkCapabilities(r4)     // Catch: java.lang.Throwable -> L180
            if (r4 != 0) goto La8
            cn.jiguang.commons.A.a r3 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            r4 = 1005(0x3ed, float:1.408E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L180
            goto L90
        La8:
            r5 = 0
            boolean r6 = r4.hasTransport(r5)     // Catch: java.lang.Throwable -> L180
            r7 = 1
            boolean r8 = r4.hasTransport(r7)     // Catch: java.lang.Throwable -> L11b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11b
            java.lang.String r10 = "n"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L11b
            if (r8 == 0) goto Lcb
            r9.append(r7)     // Catch: java.lang.Throwable -> L11b
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L11b
            r10 = 1043(0x413, float:1.462E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L11b
            r8.m(r10)     // Catch: java.lang.Throwable -> L11b
        Lcb:
            if (r6 == 0) goto Ldd
            r9.append(r5)     // Catch: java.lang.Throwable -> L11b
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L11b
            r10 = 1042(0x412, float:1.46E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L11b
            r8.m(r10)     // Catch: java.lang.Throwable -> L11b
        Ldd:
            r8 = 3
            boolean r10 = r4.hasTransport(r8)     // Catch: java.lang.Throwable -> L11b
            if (r10 == 0) goto Le7
            r9.append(r8)     // Catch: java.lang.Throwable -> L11b
        Le7:
            r8 = 2
            boolean r10 = r4.hasTransport(r8)     // Catch: java.lang.Throwable -> L11b
            if (r10 == 0) goto Lf1
            r9.append(r8)     // Catch: java.lang.Throwable -> L11b
        Lf1:
            r8 = 4
            boolean r10 = r4.hasTransport(r8)     // Catch: java.lang.Throwable -> L11b
            if (r10 == 0) goto Lfb
            r9.append(r8)     // Catch: java.lang.Throwable -> L11b
        Lfb:
            r8 = 5
            boolean r10 = r4.hasTransport(r8)     // Catch: java.lang.Throwable -> L11b
            if (r10 == 0) goto L105
            r9.append(r8)     // Catch: java.lang.Throwable -> L11b
        L105:
            r8 = 6
            boolean r10 = r4.hasTransport(r8)     // Catch: java.lang.Throwable -> L11b
            if (r10 == 0) goto L10f
            r9.append(r8)     // Catch: java.lang.Throwable -> L11b
        L10f:
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L11b
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L11b
            r8.m(r9)     // Catch: java.lang.Throwable -> L11b
            goto L122
        L11b:
            cn.jiguang.commons.A.a r8 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            r8.m(r0)     // Catch: java.lang.Throwable -> L180
        L122:
            r8 = 12
            boolean r8 = r4.hasCapability(r8)     // Catch: java.lang.Throwable -> L180
            r9 = 16
            boolean r4 = r4.hasCapability(r9)     // Catch: java.lang.Throwable -> L180
            if (r8 != 0) goto L141
            cn.jiguang.commons.A.a r3 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            r4 = 1006(0x3ee, float:1.41E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L180
        L13a:
            r3.m(r4)     // Catch: java.lang.Throwable -> L180
            r11.a(r2, r1)     // Catch: java.lang.Throwable -> L180
            goto L187
        L141:
            if (r4 != 0) goto L14e
            cn.jiguang.commons.A.a r3 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            r4 = 1007(0x3ef, float:1.411E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L180
            goto L13a
        L14e:
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L180
            r4 = 1048(0x418, float:1.469E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L180
            r2.m(r4)     // Catch: java.lang.Throwable -> L180
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L180
            r2.<init>()     // Catch: java.lang.Throwable -> L180
            java.lang.String r4 = "new network, hadChangePermission= "
            r2.append(r4)     // Catch: java.lang.Throwable -> L180
            r2.append(r1)     // Catch: java.lang.Throwable -> L180
            java.lang.String r4 = " hasTransportCell="
            r2.append(r4)     // Catch: java.lang.Throwable -> L180
            r2.append(r6)     // Catch: java.lang.Throwable -> L180
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L180
            cn.jiguang.commons.w.a.a(r3, r2)     // Catch: java.lang.Throwable -> L180
            if (r1 == 0) goto L17c
            if (r6 != 0) goto L17c
            r5 = 1
        L17c:
            r11.a(r5)     // Catch: java.lang.Throwable -> L180
            goto L187
        L180:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
            r1.m(r0)
        L187:
            return
    }

    public void c(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "JUaidManager"
            if (r6 != 0) goto La
            java.lang.String r6 = "updateImmediately failed: context is null"
            cn.jiguang.commons.w.a.f(r0, r6)
            return
        La:
            long r1 = r5.f843e
            long r3 = r5.f844f
            boolean r1 = cn.jiguang.commons.y.a.a(r0, r1, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateImmediately: businessCondition="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r0, r2)
            if (r1 != 0) goto L34
            java.lang.String r1 = "Reset request time and continue update"
            cn.jiguang.commons.w.a.a(r0, r1)
            long r0 = r5.f844f
            r2 = 0
            r5.a(r2, r0)
        L34:
            r5.a(r6)
            return
    }

    public android.net.ConnectivityManager d() {
            r3 = this;
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            r1 = 0
            if (r0 != 0) goto L15
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r2 = 1001(0x3e9, float:1.403E-42)
        Ld:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.m(r2)
            return r1
        L15:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = cn.jiguang.commons.L.u.a(r2)
            if (r2 != 0) goto L24
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r2 = 1002(0x3ea, float:1.404E-42)
            goto Ld
        L24:
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            return r0
    }
}
