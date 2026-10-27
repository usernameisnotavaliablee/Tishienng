package com.huawei.hms.framework.network.grs.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static final java.util.Map<java.lang.String, com.huawei.hms.framework.network.grs.f.b> b = null;
    private static final java.lang.Object c = null;
    private com.huawei.hms.framework.network.grs.f.a a;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            com.huawei.hms.framework.network.grs.f.b.b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.huawei.hms.framework.network.grs.f.b.c = r0
            return
    }

    public b(android.content.Context r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.e(r1, r2)
            java.util.Map<java.lang.String, com.huawei.hms.framework.network.grs.f.b> r2 = com.huawei.hms.framework.network.grs.f.b.b
            java.lang.String r1 = r1.getPackageName()
            r2.put(r1, r0)
            return
    }

    public static com.huawei.hms.framework.network.grs.f.b a(java.lang.String r1) {
            java.util.Map<java.lang.String, com.huawei.hms.framework.network.grs.f.b> r0 = com.huawei.hms.framework.network.grs.f.b.b
            java.lang.Object r1 = r0.get(r1)
            com.huawei.hms.framework.network.grs.f.b r1 = (com.huawei.hms.framework.network.grs.f.b) r1
            return r1
    }

    private void e(android.content.Context r10, boolean r11) {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "grs_route_config_files_list.txt"
            java.lang.String r2 = q1.c.a(r2, r10)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r0
            r0 = 1
            r1[r0] = r2
            java.lang.String r4 = "initLocalManager configFileListContent TimeCost:%d  Content:%s"
            java.lang.String r5 = "LocalManagerProxy"
            com.huawei.hms.framework.common.Logger.i(r5, r4, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L55
            long r1 = java.lang.System.currentTimeMillis()
            com.huawei.hms.framework.network.grs.GrsApp r4 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getBrand(r6)
            java.lang.String[] r4 = com.huawei.hms.framework.common.AssetsUtil.list(r10, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "list by AssetsManager, timeCost:"
            r6.append(r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r1
            r6.append(r7)
            java.lang.String r1 = r6.toString()
            com.huawei.hms.framework.common.Logger.i(r5, r1)
            goto L5b
        L55:
            java.lang.String r1 = "#"
            java.lang.String[] r4 = r2.split(r1)
        L5b:
            if (r4 != 0) goto L63
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L67
        L63:
            java.util.List r1 = java.util.Arrays.asList(r4)
        L67:
            com.huawei.hms.framework.network.grs.GrsApp r2 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()
            java.lang.String r2 = r2.getAppConfigName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "appConfigName is: "
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.huawei.hms.framework.common.Logger.i(r5, r4)
            com.huawei.hms.framework.network.grs.f.d r4 = new com.huawei.hms.framework.network.grs.f.d
            r4.<init>(r3, r11)
            r9.a = r4
            java.lang.String r4 = "grs_app_global_route_config.json"
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L98
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L9f
        L98:
            com.huawei.hms.framework.network.grs.f.d r4 = new com.huawei.hms.framework.network.grs.f.d
            r4.<init>(r10, r2, r11)
            r9.a = r4
        L9f:
            com.huawei.hms.framework.network.grs.f.a r2 = r9.a
            boolean r2 = r2.n()
            if (r2 != 0) goto Lb6
            java.lang.String r2 = "grs_sdk_global_route_config.json"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto Lb6
            com.huawei.hms.framework.network.grs.f.c r2 = new com.huawei.hms.framework.network.grs.f.c
            r2.<init>(r10, r11)
            r9.a = r2
        Lb6:
            com.huawei.hms.framework.network.grs.f.a r11 = r9.a
            r11.h(r10, r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "on initLocalManager finish, check appGrs: "
            r10.append(r11)
            com.huawei.hms.framework.network.grs.f.a r11 = r9.a
            t1.a r11 = r11.a
            if (r11 != 0) goto Lcc
            r3 = 1
        Lcc:
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.huawei.hms.framework.common.Logger.i(r5, r10)
            return
    }

    public java.lang.String b(android.content.Context r10, n1.a r11, com.huawei.hms.framework.network.grs.GrsBaseInfo r12, java.lang.String r13, java.lang.String r14, boolean r15) {
            r9 = this;
            java.lang.Object r1 = com.huawei.hms.framework.network.grs.f.b.c
            monitor-enter(r1)
            com.huawei.hms.framework.network.grs.f.a r2 = r9.a     // Catch: java.lang.Throwable -> L11
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.String r10 = r2.b(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return r10
        L11:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r10
    }

    public java.util.Map<java.lang.String, java.lang.String> c(android.content.Context r9, n1.a r10, com.huawei.hms.framework.network.grs.GrsBaseInfo r11, java.lang.String r12, boolean r13) {
            r8 = this;
            java.lang.Object r1 = com.huawei.hms.framework.network.grs.f.b.c
            monitor-enter(r1)
            com.huawei.hms.framework.network.grs.f.a r2 = r8.a     // Catch: java.lang.Throwable -> L10
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.util.Map r9 = r2.e(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r9
        L10:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r9
    }

    public t1.a d() {
            r1 = this;
            com.huawei.hms.framework.network.grs.f.a r0 = r1.a
            t1.a r0 = r0.g()
            return r0
    }

    public java.util.Set<java.lang.String> f() {
            r1 = this;
            com.huawei.hms.framework.network.grs.f.a r0 = r1.a
            java.util.Set r0 = r0.k()
            return r0
    }
}
