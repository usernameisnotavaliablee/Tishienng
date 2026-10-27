package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o1 {

    /* renamed from: b, reason: collision with root package name */
    private static com.amap.api.col.s.o1 f4593b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4594c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4595d;
    private android.content.Context a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.s.z3 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.o1 f4596b;

        a(com.amap.api.col.s.o1 r1) {
                r0 = this;
                r0.f4596b = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.s.z3
        public final void a() {
                r1 = this;
                com.amap.api.col.s.o1 r0 = r1.f4596b
                com.amap.api.col.s.o1.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b extends com.amap.api.col.s.z3 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.o1 f4597b;

        b(com.amap.api.col.s.o1 r1) {
                r0 = this;
                r0.f4597b = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.s.z3
        public final void a() {
                r1 = this;
                com.amap.api.col.s.o1 r0 = r1.f4597b
                com.amap.api.col.s.o1.e(r0)
                return
        }
    }

    static {
            return
    }

    private o1(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static com.amap.api.col.s.o1 a(android.content.Context r2) {
            com.amap.api.col.s.o1 r0 = com.amap.api.col.s.o1.f4593b
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.s.o1> r0 = com.amap.api.col.s.o1.class
            monitor-enter(r0)
            com.amap.api.col.s.o1 r1 = com.amap.api.col.s.o1.f4593b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.s.o1 r1 = new com.amap.api.col.s.o1     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.s.o1.f4593b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.amap.api.col.s.o1 r2 = com.amap.api.col.s.o1.f4593b
            return r2
    }

    static /* synthetic */ void c(com.amap.api.col.s.o1 r0) {
            r0.d()
            return
    }

    private void d() {
            r7 = this;
            java.lang.String r0 = ""
            r1 = 0
            boolean r2 = com.amap.api.col.s.o1.f4594c     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto La
            com.amap.api.col.s.o1.f4594c = r1
            return
        La:
            r2 = 1
            com.amap.api.col.s.o1.f4594c = r2     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.m1 r2 = new com.amap.api.col.s.m1     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.u2 r3 = new com.amap.api.col.s.u2     // Catch: java.lang.Throwable -> Lbe
            r3.<init>()     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.b3 r3 = com.amap.api.col.s.u2.d(r2)     // Catch: java.lang.Throwable -> Lbe
            if (r3 == 0) goto Lbb
            byte[] r3 = r3.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "YWDR1a2R2WEd0M3RXdHRocg=="
            java.lang.String r4 = com.amap.api.col.s.j1.t(r4)     // Catch: java.lang.Throwable -> Lbe
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> Lbe
            byte[] r3 = com.amap.api.col.s.n1.d(r3, r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = com.amap.api.col.s.j1.g(r3)     // Catch: java.lang.Throwable -> Lbe
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lbe
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "suc"
            boolean r3 = r4.optBoolean(r3)     // Catch: java.lang.Throwable -> Lbe
            if (r3 == 0) goto Lbb
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.n     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.m(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.o     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.o(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.p     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.q(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.q     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.s(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.r     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.u(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.s     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.w(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.t     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.y(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.v     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.e(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = r2.u     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.A(r3, r2)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r2 = r7.a     // Catch: java.lang.Throwable -> Lbe
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.b(r2, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = "aaid"
            java.lang.String r2 = r4.optString(r2, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "resetToken"
            java.lang.String r3 = r4.optString(r3, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = "uabc"
            java.lang.String r0 = r4.optString(r5, r0)     // Catch: java.lang.Throwable -> Lbe
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lbe
            if (r4 != 0) goto La5
            android.content.Context r4 = r7.a     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.g(r4, r2)     // Catch: java.lang.Throwable -> Lbe
        La5:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto Lb0
            android.content.Context r2 = r7.a     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.k(r2, r3)     // Catch: java.lang.Throwable -> Lbe
        Lb0:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto Lbb
            android.content.Context r2 = r7.a     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.i(r2, r0)     // Catch: java.lang.Throwable -> Lbe
        Lbb:
            com.amap.api.col.s.o1.f4594c = r1
            return
        Lbe:
            com.amap.api.col.s.o1.f4594c = r1
            return
    }

    static /* synthetic */ void e(com.amap.api.col.s.o1 r0) {
            r0.f()
            return
    }

    private void f() {
            r7 = this;
            java.lang.String r0 = ""
            r1 = 0
            boolean r2 = com.amap.api.col.s.o1.f4595d     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto La
            com.amap.api.col.s.o1.f4595d = r1
            return
        La:
            r2 = 1
            com.amap.api.col.s.o1.f4595d = r2     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.p1 r2 = new com.amap.api.col.s.p1     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.u2 r3 = new com.amap.api.col.s.u2     // Catch: java.lang.Throwable -> Lbe
            r3.<init>()     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.b3 r3 = com.amap.api.col.s.u2.d(r2)     // Catch: java.lang.Throwable -> Lbe
            if (r3 == 0) goto Lbb
            byte[] r3 = r3.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "YWDR1a2R2WEd0M3RXdHRocg=="
            java.lang.String r4 = com.amap.api.col.s.j1.t(r4)     // Catch: java.lang.Throwable -> Lbe
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> Lbe
            byte[] r3 = com.amap.api.col.s.n1.d(r3, r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = com.amap.api.col.s.j1.g(r3)     // Catch: java.lang.Throwable -> Lbe
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lbe
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "suc"
            boolean r3 = r4.optBoolean(r3)     // Catch: java.lang.Throwable -> Lbe
            if (r3 == 0) goto Lbb
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.n     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.m(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.o     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.o(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.p     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.q(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.q     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.s(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.r     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.u(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.s     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.w(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.t     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.y(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r2.v     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.e(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = r2.u     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.A(r3, r2)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r2 = r7.a     // Catch: java.lang.Throwable -> Lbe
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.b(r2, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = "aaid"
            java.lang.String r2 = r4.optString(r2, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "resetToken"
            java.lang.String r3 = r4.optString(r3, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = "uabc"
            java.lang.String r0 = r4.optString(r5, r0)     // Catch: java.lang.Throwable -> Lbe
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lbe
            if (r4 != 0) goto La5
            android.content.Context r4 = r7.a     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.g(r4, r2)     // Catch: java.lang.Throwable -> Lbe
        La5:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto Lb0
            android.content.Context r2 = r7.a     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.k(r2, r3)     // Catch: java.lang.Throwable -> Lbe
        Lb0:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto Lbb
            android.content.Context r2 = r7.a     // Catch: java.lang.Throwable -> Lbe
            com.amap.api.col.s.k1.i(r2, r0)     // Catch: java.lang.Throwable -> Lbe
        Lbb:
            com.amap.api.col.s.o1.f4595d = r1
            return
        Lbe:
            com.amap.api.col.s.o1.f4595d = r1
            return
    }

    public final java.lang.String b() {
            r6 = this;
            java.lang.String r0 = ""
            boolean r1 = com.amap.api.col.s.l1.f4556d     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3c
            android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = com.amap.api.col.s.k1.f(r1)     // Catch: java.lang.Throwable -> L3c
            android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L3c
            long r1 = com.amap.api.col.s.k1.h(r1)     // Catch: java.lang.Throwable -> L3c
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L3c
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L29
            com.amap.api.col.s.y3 r1 = com.amap.api.col.s.y3.e()     // Catch: java.lang.Throwable -> L3c
            com.amap.api.col.s.o1$a r2 = new com.amap.api.col.s.o1$a     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3c
            r1.c(r2)     // Catch: java.lang.Throwable -> L3c
            return r0
        L29:
            long r3 = r3 - r1
            long r1 = com.amap.api.col.s.l1.f4554b     // Catch: java.lang.Throwable -> L3c
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L3c
            com.amap.api.col.s.y3 r1 = com.amap.api.col.s.y3.e()     // Catch: java.lang.Throwable -> L3c
            com.amap.api.col.s.o1$b r2 = new com.amap.api.col.s.o1$b     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3c
            r1.c(r2)     // Catch: java.lang.Throwable -> L3c
        L3c:
            return r0
    }
}
