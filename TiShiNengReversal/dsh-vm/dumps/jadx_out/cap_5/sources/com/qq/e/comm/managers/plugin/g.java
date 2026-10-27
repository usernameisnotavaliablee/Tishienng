package com.qq.e.comm.managers.plugin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class g {
    private final java.io.File a;
    private final java.io.File b;
    private java.lang.String c;
    private int d;
    private java.lang.String e;

    public g(java.io.File r1, java.io.File r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private int a(java.lang.String r1, int r2) {
            r0 = this;
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            return r2
    }

    java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    boolean a(android.content.Context r7, boolean r8) {
            r6 = this;
            r0 = 0
            java.io.File r1 = r6.b     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L7d
            java.io.File r1 = r6.a     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L7d
            java.io.File r1 = r6.b     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = com.qq.e.comm.managers.plugin.h.a(r1)     // Catch: java.lang.Throwable -> L7d
            r6.e = r1     // Catch: java.lang.Throwable -> L7d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L20
            return r0
        L20:
            java.lang.String r1 = r6.e     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "#####"
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Throwable -> L7d
            int r2 = r1.length     // Catch: java.lang.Throwable -> L7d
            r3 = 2
            if (r2 != r3) goto L7d
            r2 = 1
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L7d
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L7d
            int r1 = r6.a(r1, r0)     // Catch: java.lang.Throwable -> L7d
            com.qq.e.comm.managers.plugin.c r4 = com.qq.e.comm.managers.plugin.c.a()     // Catch: java.lang.Throwable -> L7d
            java.io.File r5 = r6.a     // Catch: java.lang.Throwable -> L7d
            boolean r4 = r4.a(r3, r5)     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L7d
            r6.c = r3     // Catch: java.lang.Throwable -> L7d
            r6.d = r1     // Catch: java.lang.Throwable -> L7d
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7d
            r3 = 34
            if (r1 < r3) goto L7c
            if (r7 == 0) goto L7c
            android.content.pm.ApplicationInfo r1 = r7.getApplicationInfo()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L7c
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()     // Catch: java.lang.Throwable -> L7d
            int r7 = r7.targetSdkVersion     // Catch: java.lang.Throwable -> L7d
            if (r7 < r3) goto L7c
            if (r8 == 0) goto L7c
            java.io.File r7 = r6.a     // Catch: java.lang.Throwable -> L7d
            boolean r7 = r7.canWrite()     // Catch: java.lang.Throwable -> L7d
            if (r7 != 0) goto L75
            java.io.File r7 = r6.a     // Catch: java.lang.Throwable -> L7d
            boolean r7 = r7.canExecute()     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L6e
            goto L75
        L6e:
            java.io.File r7 = r6.a     // Catch: java.lang.Throwable -> L7d
            boolean r7 = r7.canRead()     // Catch: java.lang.Throwable -> L7d
            return r7
        L75:
            java.io.File r7 = r6.a     // Catch: java.lang.Throwable -> L7d
            boolean r7 = r7.setReadOnly()     // Catch: java.lang.Throwable -> L7d
            return r7
        L7c:
            return r2
        L7d:
            return r0
    }

    boolean a(java.io.File r4, java.io.File r5, android.content.Context r6) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2a
            if (r5 != 0) goto L6
            goto L2a
        L6:
            java.io.File r1 = r3.a
            boolean r1 = r4.equals(r1)
            r2 = 1
            if (r1 != 0) goto L17
            java.io.File r1 = r3.a
            boolean r4 = com.qq.e.comm.managers.plugin.h.a(r1, r4, r6, r2)
            if (r4 == 0) goto L28
        L17:
            java.io.File r4 = r3.b
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L29
            java.io.File r4 = r3.b
            boolean r4 = com.qq.e.comm.managers.plugin.h.a(r4, r5, r6, r0)
            if (r4 == 0) goto L28
            goto L29
        L28:
            return r0
        L29:
            return r2
        L2a:
            return r0
    }

    int b() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }
}
