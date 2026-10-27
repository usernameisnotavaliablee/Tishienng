package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class z5 {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.p0003l.p4 f4291b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4292c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f4293d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.p0003l.c6 f4294e;

    public z5() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f4292c = r0
            java.lang.String r0 = "40C27E38DCAD404B5465362914090908"
            r2.f4293d = r0
            com.amap.api.col.3l.c6 r1 = new com.amap.api.col.3l.c6
            r1.<init>(r0)
            r2.f4294e = r1
            return
    }

    public final void a(android.content.Context r2, boolean r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String[] r7) {
            r1 = this;
            com.amap.api.col.3l.p4$a r0 = new com.amap.api.col.3l.p4$a     // Catch: com.amap.api.col.p0003l.fk -> L26
            r0.<init>(r4, r5, r4)     // Catch: com.amap.api.col.p0003l.fk -> L26
            com.amap.api.col.3l.p4$a r4 = r0.b(r7)     // Catch: com.amap.api.col.p0003l.fk -> L26
            com.amap.api.col.3l.p4$a r4 = r4.a(r6)     // Catch: com.amap.api.col.p0003l.fk -> L26
            com.amap.api.col.3l.p4 r4 = r4.c()     // Catch: com.amap.api.col.p0003l.fk -> L26
            if (r2 == 0) goto L26
            android.content.Context r2 = r2.getApplicationContext()     // Catch: com.amap.api.col.p0003l.fk -> L26
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: com.amap.api.col.p0003l.fk -> L26
            r1.a = r2     // Catch: com.amap.api.col.p0003l.fk -> L26
            r1.f4291b = r4     // Catch: com.amap.api.col.p0003l.fk -> L26
            r1.f4292c = r3     // Catch: com.amap.api.col.p0003l.fk -> L26
            com.amap.api.col.3l.c6 r3 = r1.f4294e     // Catch: com.amap.api.col.p0003l.fk -> L26
            r3.c(r2, r4)     // Catch: com.amap.api.col.p0003l.fk -> L26
        L26:
            return
    }

    public final void b(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            com.amap.api.col.3l.c6 r0 = r8.f4294e
            android.content.Context r1 = r8.a
            java.util.List r5 = r0.b(r1)
            com.amap.api.col.3l.a6 r0 = com.amap.api.col.3l.a6.a.a
            android.content.Context r2 = r8.a
            boolean r6 = r8.f4292c
            com.amap.api.col.3l.p4 r7 = r8.f4291b
            r3 = r9
            r4 = r10
            com.amap.api.col.p0003l.a6.b(r2, r3, r4, r5, r6, r7)
            return
    }
}
