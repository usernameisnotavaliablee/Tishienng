package com.baidu.liantian;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c {
    private static java.util.Map<java.lang.String, com.baidu.liantian.d> a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.baidu.liantian.c.a = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r2, int r3, java.io.File r4, java.io.File r5) {
            boolean r0 = com.baidu.liantian.b.e.a(r4)     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L7
            goto L25
        L7:
            boolean r0 = com.baidu.liantian.b.e.a(r5)     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L10
            com.baidu.liantian.b.e.a(r4, r5)     // Catch: java.lang.Throwable -> L40
        L10:
            java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L40
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L40
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L40
            java.util.Map<java.lang.String, com.baidu.liantian.d> r0 = com.baidu.liantian.c.a     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L40
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L26
        L25:
            return
        L26:
            com.baidu.liantian.d r0 = new com.baidu.liantian.d     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L40
            r0.<init>(r2, r3, r1, r5)     // Catch: java.lang.Throwable -> L40
            r0.startWatching()     // Catch: java.lang.Throwable -> L40
            java.util.Map<java.lang.String, com.baidu.liantian.d> r2 = com.baidu.liantian.c.a     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L40
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            com.baidu.liantian.b.e.a()
            return
    }

    public static void a(java.io.File r2) {
            if (r2 != 0) goto L3
            goto L26
        L3:
            r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L27
            java.util.Map<java.lang.String, com.baidu.liantian.d> r0 = com.baidu.liantian.c.a     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L27
            com.baidu.liantian.d r0 = (com.baidu.liantian.d) r0     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L26
            r0.stopWatching()     // Catch: java.lang.Throwable -> L27
            java.util.Map<java.lang.String, com.baidu.liantian.d> r1 = com.baidu.liantian.c.a     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            r1.remove(r2)     // Catch: java.lang.Throwable -> L27
            r0.a()     // Catch: java.lang.Throwable -> L27
        L26:
            return
        L27:
            com.baidu.liantian.b.e.a()
            return
    }
}
