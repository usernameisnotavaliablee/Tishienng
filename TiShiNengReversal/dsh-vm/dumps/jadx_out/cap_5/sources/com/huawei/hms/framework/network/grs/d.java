package com.huawei.hms.framework.network.grs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private static final java.util.Map<java.lang.String, com.huawei.hms.framework.network.grs.c> a = null;
    private static final java.lang.Object b = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            com.huawei.hms.framework.network.grs.d.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.huawei.hms.framework.network.grs.d.b = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.huawei.hms.framework.network.grs.c a(com.huawei.hms.framework.network.grs.GrsBaseInfo r5, android.content.Context r6) {
            java.lang.Object r0 = com.huawei.hms.framework.network.grs.d.b
            monitor-enter(r0)
            int r1 = r5.uniqueCode()     // Catch: java.lang.Throwable -> L31
            java.util.Map<java.lang.String, com.huawei.hms.framework.network.grs.c> r2 = com.huawei.hms.framework.network.grs.d.a     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r6.getPackageName()     // Catch: java.lang.Throwable -> L31
            r3.append(r4)     // Catch: java.lang.Throwable -> L31
            r3.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Throwable -> L31
            com.huawei.hms.framework.network.grs.c r3 = (com.huawei.hms.framework.network.grs.c) r3     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L56
            com.huawei.hms.framework.network.grs.c r4 = new com.huawei.hms.framework.network.grs.c     // Catch: java.lang.Throwable -> L31
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L31
            boolean r4 = r3.o(r4)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L33
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return r3
        L31:
            r5 = move-exception
            goto L76
        L33:
            java.lang.String r3 = "GrsClientManager"
            java.lang.String r4 = "The app_name, ser_country, reg_country and issue_country is equal, but other not."
            com.huawei.hms.framework.common.Logger.i(r3, r4)     // Catch: java.lang.Throwable -> L31
            com.huawei.hms.framework.network.grs.c r3 = new com.huawei.hms.framework.network.grs.c     // Catch: java.lang.Throwable -> L31
            r3.<init>(r6, r5)     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> L31
            r5.append(r6)     // Catch: java.lang.Throwable -> L31
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L31
        L52:
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L31
            goto L2f
        L56:
            java.lang.String r3 = "GrsClientManager"
            java.lang.String r4 = "grsClientImpl == null, and new GrsClientImpl"
            com.huawei.hms.framework.common.Logger.i(r3, r4)     // Catch: java.lang.Throwable -> L31
            com.huawei.hms.framework.network.grs.c r3 = new com.huawei.hms.framework.network.grs.c     // Catch: java.lang.Throwable -> L31
            r3.<init>(r6, r5)     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> L31
            r5.append(r6)     // Catch: java.lang.Throwable -> L31
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L31
            goto L52
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r5
    }
}
