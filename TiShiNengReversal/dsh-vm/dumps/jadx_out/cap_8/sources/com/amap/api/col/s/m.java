package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class m {
    private static volatile boolean a;

    static {
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized void a() {
            java.lang.Class<com.amap.api.col.s.m> r0 = com.amap.api.col.s.m.class
            monitor-enter(r0)
            boolean r1 = com.amap.api.col.s.m.a     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L5d
            com.amap.api.col.s.n r1 = com.amap.api.col.s.n.b()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "regeo"
            com.amap.api.col.s.p r3 = new com.amap.api.col.s.p     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "/geocode/regeo"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            r1.g(r2, r3)     // Catch: java.lang.Throwable -> L5b
            com.amap.api.col.s.n r1 = com.amap.api.col.s.n.b()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "placeAround"
            com.amap.api.col.s.p r3 = new com.amap.api.col.s.p     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "/place/around"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            r1.g(r2, r3)     // Catch: java.lang.Throwable -> L5b
            com.amap.api.col.s.n r1 = com.amap.api.col.s.n.b()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "placeText"
            com.amap.api.col.s.o r3 = new com.amap.api.col.s.o     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "/place/text"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            r1.g(r2, r3)     // Catch: java.lang.Throwable -> L5b
            com.amap.api.col.s.n r1 = com.amap.api.col.s.n.b()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "geo"
            com.amap.api.col.s.o r3 = new com.amap.api.col.s.o     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "/geocode/geo"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            r1.g(r2, r3)     // Catch: java.lang.Throwable -> L5b
            r1 = 1
            com.amap.api.col.s.m.a = r1     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r1 = move-exception
            goto L5f
        L5d:
            monitor-exit(r0)
            return
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r1
    }
}
