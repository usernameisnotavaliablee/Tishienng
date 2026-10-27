package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class v7 extends com.amap.api.col.p0003l.y7 {

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f4064b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f4065c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4066d;

    /* renamed from: e, reason: collision with root package name */
    private int f4067e;

    /* renamed from: f, reason: collision with root package name */
    private int f4068f;

    /* renamed from: g, reason: collision with root package name */
    private int f4069g;

    public v7(android.content.Context r9, boolean r10, int r11, int r12, java.lang.String r13) {
            r8 = this;
            r8.<init>()
            java.lang.String r0 = "iKey"
            r8.f4064b = r0
            r0 = 0
            r8.f4069g = r0
            r7 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.f(r2, r3, r4, r5, r6, r7)
            return
    }

    public v7(android.content.Context r2, boolean r3, int r4, int r5, java.lang.String r6, int r7) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "iKey"
            r1.f4064b = r0
            r0 = 0
            r1.f4069g = r0
            r1.f(r2, r3, r4, r5, r6, r7)
            return
    }

    private void f(android.content.Context r1, boolean r2, int r3, int r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.f4065c = r1
            r0.f4066d = r2
            r0.f4067e = r3
            r0.f4068f = r4
            r0.f4064b = r5
            r0.f4069g = r6
            return
    }

    @Override // com.amap.api.col.p0003l.y7
    public final int a() {
            r2 = this;
            android.content.Context r0 = r2.f4065c
            int r0 = com.amap.api.col.p0003l.i4.M(r0)
            r1 = 1
            if (r0 == r1) goto Ld
            int r0 = r2.f4067e
            if (r0 > 0) goto L1a
        Ld:
            int r0 = r2.f4069g
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 <= 0) goto L17
            if (r0 >= r1) goto L17
            goto L1a
        L17:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L1a:
            com.amap.api.col.3l.y7 r1 = r2.a
            if (r1 == 0) goto L26
            int r1 = r1.a()
            int r0 = java.lang.Math.max(r0, r1)
        L26:
            return r0
    }

    @Override // com.amap.api.col.p0003l.y7
    public final void b(int r6) {
            r5 = this;
            android.content.Context r0 = r5.f4065c
            int r0 = com.amap.api.col.p0003l.i4.M(r0)
            r1 = 1
            if (r0 != r1) goto La
            return
        La:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "yyyyMMdd"
            java.lang.String r0 = com.amap.api.col.p0003l.q4.c(r2, r0)
            android.content.Context r2 = r5.f4065c
            java.lang.String r3 = r5.f4064b
            java.lang.String r2 = com.amap.api.col.p0003l.s5.a(r2, r3)
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
            android.content.Context r1 = r5.f4065c
            java.lang.String r2 = r5.f4064b
            com.amap.api.col.p0003l.s5.g(r1, r2)
        L47:
            android.content.Context r1 = r5.f4065c
            java.lang.String r2 = r5.f4064b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "|"
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.amap.api.col.p0003l.s5.d(r1, r2, r6)
            return
    }

    @Override // com.amap.api.col.p0003l.y7
    protected final boolean d() {
            r7 = this;
            android.content.Context r0 = r7.f4065c
            int r0 = com.amap.api.col.p0003l.i4.M(r0)
            r1 = 1
            if (r0 != r1) goto La
            return r1
        La:
            boolean r0 = r7.f4066d
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            android.content.Context r0 = r7.f4065c
            java.lang.String r3 = r7.f4064b
            java.lang.String r0 = com.amap.api.col.p0003l.s5.a(r0, r3)
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
            java.lang.String r4 = com.amap.api.col.p0003l.q4.c(r4, r6)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L49
            r0 = r0[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            int r3 = r7.f4068f
            if (r0 < r3) goto L49
            return r2
        L49:
            return r1
        L4a:
            android.content.Context r0 = r7.f4065c
            java.lang.String r2 = r7.f4064b
            com.amap.api.col.p0003l.s5.g(r0, r2)
            return r1
    }
}
