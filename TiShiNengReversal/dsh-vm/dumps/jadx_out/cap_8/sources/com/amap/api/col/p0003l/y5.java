package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class y5 {
    private com.amap.api.col.p0003l.p4 a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        public static java.util.Map<java.lang.String, com.amap.api.col.p0003l.y5> a;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.amap.api.col.3l.y5.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private y5(com.amap.api.col.p0003l.p4 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static com.amap.api.col.p0003l.y5 a(com.amap.api.col.p0003l.p4 r3) {
            java.util.Map<java.lang.String, com.amap.api.col.3l.y5> r0 = com.amap.api.col.3l.y5.a.a
            java.lang.String r1 = r3.a()
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L1a
            java.util.Map<java.lang.String, com.amap.api.col.3l.y5> r0 = com.amap.api.col.3l.y5.a.a
            java.lang.String r1 = r3.a()
            com.amap.api.col.3l.y5 r2 = new com.amap.api.col.3l.y5
            r2.<init>(r3)
            r0.put(r1, r2)
        L1a:
            java.util.Map<java.lang.String, com.amap.api.col.3l.y5> r0 = com.amap.api.col.3l.y5.a.a
            java.lang.String r3 = r3.a()
            java.lang.Object r3 = r0.get(r3)
            com.amap.api.col.3l.y5 r3 = (com.amap.api.col.p0003l.y5) r3
            return r3
    }

    public final void b(android.content.Context r4, boolean r5, boolean r6) {
            r3 = this;
            com.amap.api.col.3l.p4 r0 = r3.a
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "sckey"
            com.amap.api.col.p0003l.b6.b(r4, r0, r2, r1)
            if (r5 == 0) goto L18
            com.amap.api.col.3l.p4 r5 = r3.a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "scisf"
            com.amap.api.col.p0003l.b6.b(r4, r5, r0, r6)
        L18:
            return
    }

    public final boolean c(android.content.Context r3) {
            r2 = this;
            com.amap.api.col.3l.p4 r0 = r2.a
            java.lang.String r1 = "sckey"
            java.lang.String r3 = com.amap.api.col.p0003l.b6.a(r3, r0, r1)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public final boolean d(android.content.Context r3) {
            r2 = this;
            com.amap.api.col.3l.p4 r0 = r2.a
            java.lang.String r1 = "scisf"
            java.lang.String r3 = com.amap.api.col.p0003l.b6.a(r3, r0, r1)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = 1
            return r3
    }
}
