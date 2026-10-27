package com.baidu.liantian;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {


    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r7, android.content.Intent r8) {
            java.lang.String[] r0 = com.baidu.liantian.b.e.g(r7)     // Catch: java.lang.Throwable -> L79
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L79
            r2 = 1
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L79
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L79
            com.baidu.liantian.core.e.a(r7, r1, r2)     // Catch: java.lang.Throwable -> L79
            r3 = 0
        L11:
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L79
            int r3 = r3 + r2
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L79
            r4 = 60
            if (r3 <= r4) goto L45
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L79
            r3.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "0"
            java.lang.String r5 = "152"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "1"
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L79
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L79
            android.content.Context r0 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L79
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "1014115"
            com.baidu.liantian.b.e.a(r0, r4, r3)     // Catch: java.lang.Throwable -> L79
            r3.toString()     // Catch: java.lang.Throwable -> L79
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L79
            goto L57
        L45:
            com.baidu.liantian.core.g r4 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L4f
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L79
            goto L11
        L4f:
            java.lang.String r5 = "com.baidu.liantian.x24"
            com.baidu.liantian.core.ApkInfo r4 = r4.d(r5)     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L11
        L57:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "onReceiveAwakeMessage"
            com.baidu.liantian.a$1 r3 = new com.baidu.liantian.a$1     // Catch: java.lang.Throwable -> L79
            r3.<init>()     // Catch: java.lang.Throwable -> L79
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L79
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r1] = r6     // Catch: java.lang.Throwable -> L79
            java.lang.Class<android.content.Intent> r6 = android.content.Intent.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L79
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L79
            r4[r1] = r7     // Catch: java.lang.Throwable -> L79
            r4[r2] = r8     // Catch: java.lang.Throwable -> L79
            r7 = 100028(0x186bc, float:1.40169E-40)
            com.baidu.liantian.core.e.a(r7, r0, r3, r5, r4)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            com.baidu.liantian.b.a()
            com.baidu.liantian.b.e.a()
            return
    }
}
