package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ia {
    private java.util.Map<java.lang.String, java.lang.Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f3517b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static com.amap.api.col.p0003l.ia a;

        static {
                com.amap.api.col.3l.ia r0 = new com.amap.api.col.3l.ia
                r1 = 0
                r0.<init>(r1)
                com.amap.api.col.3l.ia.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.amap.api.col.p0003l.ia a() {
                com.amap.api.col.3l.ia r0 = com.amap.api.col.3l.ia.a.a
                return r0
        }
    }

    private ia() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.a = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f3517b = r0
            r2.e()
            return
    }

    /* synthetic */ ia(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.amap.api.col.p0003l.ia a() {
            com.amap.api.col.3l.ia r0 = com.amap.api.col.3l.ia.a.a()
            return r0
    }

    private void e() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r3.a
            java.lang.String r1 = "feature_mvt"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r3.a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "feature_gltf"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r3.a
            java.lang.String r2 = "feature_terrain"
            r0.put(r2, r1)
            return
    }

    public final void b(org.json.JSONObject r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "mvt_able"
            java.lang.String r0 = r6.optString(r0)
            r1 = 1
            com.amap.api.col.p0003l.g4.x(r0, r1)
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r5.a
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r3 = "feature_mvt"
            r2.put(r3, r0)
            java.lang.String r0 = "gltf_able"
            java.lang.String r0 = r6.optString(r0)
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r5.a
            r3 = 0
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r4 = "feature_gltf"
            r2.put(r4, r0)
            java.lang.String r0 = "terrain_able"
            java.lang.String r6 = r6.optString(r0)
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r5.a
            boolean r6 = com.amap.api.col.p0003l.g4.x(r6, r3)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r2 = "feature_terrain"
            r0.put(r2, r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f3517b
            r6.set(r1)
            return
    }

    public final boolean c(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r1.a
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L15:
            r2 = 0
            return r2
    }

    public final boolean d() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f3517b
            boolean r0 = r0.get()
            return r0
    }
}
