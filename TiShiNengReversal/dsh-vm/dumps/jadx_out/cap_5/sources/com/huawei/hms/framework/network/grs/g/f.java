package com.huawei.hms.framework.network.grs.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f extends com.huawei.hms.framework.network.grs.g.a implements java.util.concurrent.Callable<com.huawei.hms.framework.network.grs.g.d> {
    private static final java.lang.String i = "f";

    public f(java.lang.String r1, int r2, com.huawei.hms.framework.network.grs.g.c r3, android.content.Context r4, java.lang.String r5, com.huawei.hms.framework.network.grs.GrsBaseInfo r6, n1.c r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public com.huawei.hms.framework.network.grs.g.d call() {
            r21 = this;
            r1 = r21
            java.lang.String r2 = "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException"
            java.lang.String r3 = "RequestCallableV2 disconnect HttpsURLConnection catch Throwable"
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.f.i
            java.lang.String r4 = "Post call execute"
            com.huawei.hms.framework.common.Logger.i(r0, r4)
            r4 = 0
            r6 = 0
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Le8 java.io.IOException -> Lee
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Le8 java.io.IOException -> Lea
            java.lang.String r9 = r1.c()     // Catch: java.lang.Throwable -> Le8 java.io.IOException -> Lea
            android.content.Context r10 = r1.a()     // Catch: java.lang.Throwable -> Le8 java.io.IOException -> Lea
            java.lang.String r11 = r1.e()     // Catch: java.lang.Throwable -> Le8 java.io.IOException -> Lea
            javax.net.ssl.HttpsURLConnection r9 = r1.a.a(r9, r10, r11)     // Catch: java.lang.Throwable -> Le8 java.io.IOException -> Lea
            if (r9 != 0) goto L4d
            java.lang.String r10 = "create HttpsURLConnection instance by url return null."
            com.huawei.hms.framework.common.Logger.w(r0, r10)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            if (r9 == 0) goto L40
            r9.disconnect()     // Catch: java.lang.Throwable -> L35 java.lang.RuntimeException -> L3b
            return r6
        L35:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.f.i
            com.huawei.hms.framework.common.Logger.w(r0, r3)
            goto L40
        L3b:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.f.i
            com.huawei.hms.framework.common.Logger.w(r0, r2)
        L40:
            return r6
        L41:
            r0 = move-exception
            r6 = r9
            goto L14c
        L45:
            r0 = move-exception
        L46:
            r19 = r7
            r6 = r4
            r4 = r19
            goto Lf1
        L4d:
            java.lang.String r10 = "Content-Type"
            java.lang.String r11 = "application/json; charset=UTF-8"
            r9.setRequestProperty(r10, r11)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            java.lang.String r10 = "Connection"
            java.lang.String r11 = "close"
            r9.setRequestProperty(r10, r11)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            java.lang.String r10 = "POST"
            r9.setRequestMethod(r10)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r10 = 1
            r9.setDoOutput(r10)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r9.setDoInput(r10)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            com.huawei.hms.framework.network.grs.g.c r10 = r1.b()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            java.lang.String r11 = ""
            if (r10 == 0) goto L78
            com.huawei.hms.framework.network.grs.g.c r10 = r1.b()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            java.lang.String r10 = r10.c()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            goto L79
        L78:
            r10 = r11
        L79:
            java.lang.String r12 = "If-None-Match"
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            if (r13 == 0) goto L83
            java.lang.String r10 = "&"
        L83:
            r9.setRequestProperty(r12, r10)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r9.connect()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            n1.c r10 = r1.f()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            java.lang.String r12 = "services"
            java.lang.String r10 = r10.a(r12, r11)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r1.a.b(r9, r10)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            int r12 = r9.getResponseCode()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r10.<init>()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            java.lang.String r11 = "httpsURLConnection result code:"
            r10.append(r11)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r10.append(r12)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            com.huawei.hms.framework.common.Logger.i(r0, r10)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 != r0) goto Lc4
            java.io.InputStream r6 = r9.getInputStream()     // Catch: java.lang.Throwable -> Lbf
            byte[] r0 = com.huawei.hms.framework.common.IoUtils.toByteArray(r6)     // Catch: java.lang.Throwable -> Lbf
            com.huawei.hms.framework.common.IoUtils.closeSecure(r6)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r6 = r0
            goto Lc4
        Lbf:
            r0 = move-exception
            com.huawei.hms.framework.common.IoUtils.closeSecure(r6)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            throw r0     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
        Lc4:
            java.util.Map r13 = r9.getHeaderFields()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r9.disconnect()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            long r17 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            if (r6 != 0) goto Ld8
            r0 = 0
            byte[] r6 = new byte[r0]     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
        Ld8:
            r14 = r6
            r15 = r10
            com.huawei.hms.framework.network.grs.g.d r11 = new com.huawei.hms.framework.network.grs.g.d     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            long r15 = r15 - r7
            r11.<init>(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r1.a = r11     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r9.disconnect()     // Catch: java.lang.Throwable -> L10f java.lang.RuntimeException -> L116
        Le5:
            r2 = r17
            goto L11e
        Le8:
            r0 = move-exception
            goto L14c
        Lea:
            r0 = move-exception
            r9 = r6
            goto L46
        Lee:
            r0 = move-exception
            r9 = r6
            r6 = r4
        Lf1:
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L41
            long r17 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = com.huawei.hms.framework.network.grs.g.f.i     // Catch: java.lang.Throwable -> L41
            java.lang.String r12 = "RequestCallableV2 run task catch IOException"
            com.huawei.hms.framework.common.Logger.w(r8, r12, r0)     // Catch: java.lang.Throwable -> L41
            com.huawei.hms.framework.network.grs.g.d r8 = new com.huawei.hms.framework.network.grs.g.d     // Catch: java.lang.Throwable -> L41
            long r10 = r10 - r4
            r8.<init>(r0, r10)     // Catch: java.lang.Throwable -> L41
            r1.a = r8     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto L11c
            r9.disconnect()     // Catch: java.lang.Throwable -> L10e java.lang.RuntimeException -> L115
            goto L11c
        L10e:
            r4 = r6
        L10f:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.f.i
            com.huawei.hms.framework.common.Logger.w(r0, r3)
            goto Le5
        L115:
            r4 = r6
        L116:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.f.i
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            goto Le5
        L11c:
            r4 = r6
            goto Le5
        L11e:
            com.huawei.hms.framework.network.grs.g.d r0 = r1.a
            java.lang.String r6 = r1.c()
            r0.i(r6)
            com.huawei.hms.framework.network.grs.g.d r0 = r1.a
            int r6 = r1.d()
            r0.b(r6)
            com.huawei.hms.framework.network.grs.g.d r0 = r1.a
            r0.h(r4)
            com.huawei.hms.framework.network.grs.g.d r0 = r1.a
            r0.c(r2)
            com.huawei.hms.framework.network.grs.g.c r0 = r1.b()
            if (r0 == 0) goto L149
            com.huawei.hms.framework.network.grs.g.c r0 = r1.b()
            com.huawei.hms.framework.network.grs.g.d r2 = r1.a
            r0.d(r2)
        L149:
            com.huawei.hms.framework.network.grs.g.d r0 = r1.a
            return r0
        L14c:
            if (r6 == 0) goto L15d
            r6.disconnect()     // Catch: java.lang.Throwable -> L152 java.lang.RuntimeException -> L158
            goto L15d
        L152:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.g.f.i
            com.huawei.hms.framework.common.Logger.w(r2, r3)
            goto L15d
        L158:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.f.i
            com.huawei.hms.framework.common.Logger.w(r3, r2)
        L15d:
            throw r0
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ com.huawei.hms.framework.network.grs.g.d call() {
            r1 = this;
            com.huawei.hms.framework.network.grs.g.d r0 = r1.call()
            return r0
    }
}
