package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f0 extends com.amap.api.col.p0003l.b1<java.lang.String, com.amap.api.col.p0003l.d0> {
    public f0(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static com.amap.api.col.p0003l.d0 h(org.json.JSONObject r4) throws com.amap.api.maps.AMapException {
            java.lang.String r0 = ""
            com.amap.api.col.3l.d0 r1 = new com.amap.api.col.3l.d0
            r1.<init>()
            java.lang.String r2 = "update"
            java.lang.String r2 = r4.optString(r2, r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "0"
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            r2 = 0
            r1.b(r2)     // Catch: java.lang.Throwable -> L1a
            goto L28
        L1a:
            r4 = move-exception
            goto L32
        L1c:
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L28
            r2 = 1
            r1.b(r2)     // Catch: java.lang.Throwable -> L1a
        L28:
            java.lang.String r2 = "version"
            java.lang.String r4 = r4.optString(r2, r0)     // Catch: java.lang.Throwable -> L1a
            r1.a(r4)     // Catch: java.lang.Throwable -> L1a
            return r1
        L32:
            java.lang.String r0 = "OfflineInitHandlerAbstract"
            java.lang.String r2 = "loadData parseJson"
            com.amap.api.col.p0003l.w5.p(r4, r0, r2)
            return r1
    }

    @Override // com.amap.api.col.p0003l.b1
    protected final /* synthetic */ com.amap.api.col.p0003l.d0 a(org.json.JSONObject r1) throws com.amap.api.maps.AMapException {
            r0 = this;
            com.amap.api.col.3l.d0 r1 = h(r1)
            return r1
    }

    @Override // com.amap.api.col.p0003l.b1
    protected final java.lang.String b() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "016"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.p0003l.b1
    protected final org.json.JSONObject c(com.amap.api.col.3l.g4.c r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            org.json.JSONObject r2 = r2.f3393f
            if (r2 == 0) goto Ld
            java.lang.String r0 = "016"
            org.json.JSONObject r2 = r2.optJSONObject(r0)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.amap.api.col.p0003l.b1
    protected final java.util.Map<java.lang.String, java.lang.String> e() {
            r3 = this;
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 16
            r0.<init>(r1)
            java.lang.String r1 = "mapver"
            T r2 = r3.a
            r0.put(r1, r2)
            return r0
    }
}
