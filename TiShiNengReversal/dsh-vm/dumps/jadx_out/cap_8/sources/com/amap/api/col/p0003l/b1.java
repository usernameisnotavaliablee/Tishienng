package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class b1<T, V> {
    protected T a;

    /* renamed from: b, reason: collision with root package name */
    protected int f3003b;

    /* renamed from: c, reason: collision with root package name */
    protected android.content.Context f3004c;

    public b1(android.content.Context r2, T r3) {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.f3003b = r0
            r1.d(r2, r3)
            return
    }

    private void d(android.content.Context r1, T r2) {
            r0 = this;
            r0.f3004c = r1
            r0.a = r2
            return
    }

    private V g() throws com.amap.api.maps.AMapException {
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
        L4:
            int r4 = r8.f3003b
            if (r1 >= r4) goto L44
            android.content.Context r4 = r8.f3004c     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.3l.p4 r5 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r8.b()     // Catch: java.lang.Throwable -> L25
            java.util.Map r7 = r8.e()     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.3l.g4$c r3 = com.amap.api.col.p0003l.g4.c(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25
            org.json.JSONObject r4 = r8.c(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r8.a(r4)     // Catch: java.lang.Throwable -> L25
            int r1 = r8.f3003b     // Catch: java.lang.Throwable -> L25
            goto L4
        L25:
            r4 = move-exception
            java.lang.String r5 = "AbstractProtocalHandler"
            java.lang.String r6 = "getDataMayThrow AMapException"
            com.amap.api.col.p0003l.w5.p(r4, r5, r6)
            int r1 = r1 + 1
            int r4 = r8.f3003b
            if (r1 < r4) goto L4
            if (r3 == 0) goto L42
            java.lang.String r2 = r3.f3390c
            if (r2 != 0) goto L3a
            goto L42
        L3a:
            com.amap.api.maps.AMapException r0 = new com.amap.api.maps.AMapException
            java.lang.String r1 = r3.f3390c
            r0.<init>(r1)
            throw r0
        L42:
            r2 = r0
            goto L4
        L44:
            return r2
    }

    protected abstract V a(org.json.JSONObject r1) throws com.amap.api.maps.AMapException;

    protected abstract java.lang.String b();

    protected abstract org.json.JSONObject c(com.amap.api.col.3l.g4.c r1);

    protected abstract java.util.Map<java.lang.String, java.lang.String> e();

    public final V f() throws com.amap.api.maps.AMapException {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto L9
            java.lang.Object r0 = r1.g()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
