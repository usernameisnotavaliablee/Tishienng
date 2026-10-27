package com.umeng.commonsdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static java.util.HashMap<java.lang.String, android.content.pm.PackageInfo> a;
    private static java.lang.Object b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.utils.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.commonsdk.utils.b a = null;

        static {
                com.umeng.commonsdk.utils.b r0 = new com.umeng.commonsdk.utils.b
                r1 = 0
                r0.<init>(r1)
                com.umeng.commonsdk.utils.b.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.commonsdk.utils.b a() {
                com.umeng.commonsdk.utils.b r0 = com.umeng.commonsdk.utils.b.a.a
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.utils.b.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.utils.b.b = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ b(com.umeng.commonsdk.utils.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.commonsdk.utils.b a() {
            com.umeng.commonsdk.utils.b r0 = com.umeng.commonsdk.utils.b.a.a()
            return r0
    }

    public android.content.pm.PackageInfo a(android.content.Context r4, java.lang.String r5, int r6) {
            r3 = this;
            java.lang.Object r0 = com.umeng.commonsdk.utils.b.b
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, android.content.pm.PackageInfo> r1 = com.umeng.commonsdk.utils.b.a     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            java.lang.String r4 = "MobclickRT"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r6.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "--->>> pkg： "
            r6.append(r1)     // Catch: java.lang.Throwable -> L2f
            r6.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = ", pkgInfo缓存命中，直接返回"
            r6.append(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2f
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r6)     // Catch: java.lang.Throwable -> L2f
            java.util.HashMap<java.lang.String, android.content.pm.PackageInfo> r4 = com.umeng.commonsdk.utils.b.a     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L2f
            android.content.pm.PackageInfo r4 = (android.content.pm.PackageInfo) r4     // Catch: java.lang.Throwable -> L2f
            goto L7c
        L2f:
            r4 = move-exception
            goto L7e
        L31:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L2f
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r6)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r6 = "MobclickRT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            r1.<init>()     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r2 = "--->>> pkg： "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            r1.append(r5)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r2 = ", 获取pkgInfo并缓存"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            com.umeng.commonsdk.debug.UMRTLog.e(r6, r1)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.util.HashMap<java.lang.String, android.content.pm.PackageInfo> r6 = com.umeng.commonsdk.utils.b.a     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            r6.put(r5, r4)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L5a
            goto L7c
        L5a:
            java.util.HashMap<java.lang.String, android.content.pm.PackageInfo> r4 = com.umeng.commonsdk.utils.b.a     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "MobclickRT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "--->>> pkg: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            r1.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "，目标包未安装。"
            r1.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r5)     // Catch: java.lang.Throwable -> L2f
            r4 = r6
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r4
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r4
    }
}
