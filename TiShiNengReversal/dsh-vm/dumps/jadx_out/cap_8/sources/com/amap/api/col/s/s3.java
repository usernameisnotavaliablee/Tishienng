package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class s3 extends com.amap.api.col.s.v3 {

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f4688b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f4689c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4690d;

    /* renamed from: e, reason: collision with root package name */
    private int f4691e;

    /* renamed from: f, reason: collision with root package name */
    private int f4692f;

    /* renamed from: g, reason: collision with root package name */
    private int f4693g;

    public s3(android.content.Context r2, boolean r3, int r4, int r5, java.lang.String r6, int r7) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "iKey"
            r1.f4688b = r0
            r0 = 0
            r1.f4693g = r0
            r1.f(r2, r3, r4, r5, r6, r7)
            return
    }

    private void f(android.content.Context r1, boolean r2, int r3, int r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.f4689c = r1
            r0.f4690d = r2
            r0.f4691e = r3
            r0.f4692f = r4
            r0.f4688b = r5
            r0.f4693g = r6
            return
    }

    @Override // com.amap.api.col.s.v3
    public final void a(int r6) {
            r5 = this;
            android.content.Context r0 = r5.f4689c
            int r0 = com.amap.api.col.s.c1.D(r0)
            r1 = 1
            if (r0 != r1) goto La
            return
        La:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "yyyyMMdd"
            java.lang.String r0 = com.amap.api.col.s.j1.c(r2, r0)
            android.content.Context r2 = r5.f4689c
            java.lang.String r3 = r5.f4688b
            java.lang.String r2 = com.amap.api.col.s.e2.a(r2, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L47
            java.lang.String r3 = "\\|"
            java.lang.String[] r2 = r2.split(r3)
            if (r2 == 0) goto L40
            int r3 = r2.length
            r4 = 2
            if (r3 >= r4) goto L2f
            goto L40
        L2f:
            r3 = 0
            r3 = r2[r3]
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L47
            r1 = r2[r1]
            int r1 = java.lang.Integer.parseInt(r1)
            int r6 = r6 + r1
            goto L47
        L40:
            android.content.Context r1 = r5.f4689c
            java.lang.String r2 = r5.f4688b
            com.amap.api.col.s.e2.g(r1, r2)
        L47:
            android.content.Context r1 = r5.f4689c
            java.lang.String r2 = r5.f4688b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "|"
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.amap.api.col.s.e2.d(r1, r2, r6)
            return
    }

    @Override // com.amap.api.col.s.v3
    protected final boolean c() {
            r7 = this;
            android.content.Context r0 = r7.f4689c
            int r0 = com.amap.api.col.s.c1.D(r0)
            r1 = 1
            if (r0 != r1) goto La
            return r1
        La:
            boolean r0 = r7.f4690d
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            android.content.Context r0 = r7.f4689c
            java.lang.String r3 = r7.f4688b
            java.lang.String r0 = com.amap.api.col.s.e2.a(r0, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L1f
            return r1
        L1f:
            java.lang.String r3 = "\\|"
            java.lang.String[] r0 = r0.split(r3)
            if (r0 == 0) goto L4a
            int r3 = r0.length
            r4 = 2
            if (r3 >= r4) goto L2c
            goto L4a
        L2c:
            r3 = r0[r2]
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "yyyyMMdd"
            java.lang.String r4 = com.amap.api.col.s.j1.c(r4, r6)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L49
            r0 = r0[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            int r3 = r7.f4692f
            if (r0 < r3) goto L49
            return r2
        L49:
            return r1
        L4a:
            android.content.Context r0 = r7.f4689c
            java.lang.String r2 = r7.f4688b
            com.amap.api.col.s.e2.g(r0, r2)
            return r1
    }

    @Override // com.amap.api.col.s.v3
    public final int d() {
            r2 = this;
            android.content.Context r0 = r2.f4689c
            int r0 = com.amap.api.col.s.c1.D(r0)
            r1 = 1
            if (r0 == r1) goto Ld
            int r0 = r2.f4691e
            if (r0 > 0) goto L1a
        Ld:
            int r0 = r2.f4693g
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 <= 0) goto L17
            if (r0 >= r1) goto L17
            goto L1a
        L17:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L1a:
            com.amap.api.col.s.v3 r1 = r2.a
            if (r1 == 0) goto L26
            int r1 = r1.d()
            int r0 = java.lang.Math.max(r0, r1)
        L26:
            return r0
    }
}
