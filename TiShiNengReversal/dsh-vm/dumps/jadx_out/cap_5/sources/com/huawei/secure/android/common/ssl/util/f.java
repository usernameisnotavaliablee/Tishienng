package com.huawei.secure.android.common.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f extends android.os.AsyncTask<android.content.Context, java.lang.Integer, java.lang.Boolean> {
    private static final java.lang.String a = "f";
    private static final long b = 432000000;
    private static final java.lang.String c = "lastCheckTime";
    private static volatile boolean d;

    static {
            return
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void b() {
            boolean r0 = e()
            if (r0 == 0) goto L21
            java.lang.String r0 = com.huawei.secure.android.common.ssl.util.f.a
            java.lang.String r1 = "checkUpgradeBks, execute check task"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            com.huawei.secure.android.common.ssl.util.f r0 = new com.huawei.secure.android.common.ssl.util.f
            r0.<init>()
            android.content.Context r1 = com.huawei.secure.android.common.ssl.util.c.a()
            r2 = 1
            android.content.Context[] r2 = new android.content.Context[r2]
            r3 = 0
            r2[r3] = r1
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            r0.executeOnExecutor(r1, r2)
        L21:
            return
    }

    private static boolean e() {
            boolean r0 = com.huawei.secure.android.common.ssl.util.f.d
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            android.content.Context r0 = com.huawei.secure.android.common.ssl.util.c.a()
            if (r0 != 0) goto L14
            java.lang.String r0 = com.huawei.secure.android.common.ssl.util.f.a
            java.lang.String r2 = "checkUpgradeBks, context is null"
            com.huawei.secure.android.common.ssl.util.h.g(r0, r2)
            return r1
        L14:
            r2 = 1
            com.huawei.secure.android.common.ssl.util.f.d = r2
            r3 = 0
            java.lang.String r5 = "lastCheckTime"
            long r3 = com.huawei.secure.android.common.ssl.util.j.b(r5, r3, r0)
            long r6 = java.lang.System.currentTimeMillis()
            long r3 = r6 - r3
            r8 = 432000000(0x19bfcc00, double:2.13436359E-315)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto L30
            com.huawei.secure.android.common.ssl.util.j.h(r5, r6, r0)
            return r2
        L30:
            java.lang.String r0 = com.huawei.secure.android.common.ssl.util.f.a
            java.lang.String r2 = "checkUpgradeBks, ignore"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r2)
            return r1
    }

    protected java.lang.Boolean a(android.content.Context... r7) {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r7 = r7[r2]     // Catch: java.lang.Exception -> Lc
            java.io.InputStream r7 = com.huawei.secure.android.common.ssl.util.a.n(r7)     // Catch: java.lang.Exception -> Lc
            goto L28
        Lc:
            r7 = move-exception
            java.lang.String r2 = com.huawei.secure.android.common.ssl.util.f.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "doInBackground: exception : "
            r3.append(r4)
            java.lang.String r7 = r7.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r2, r7)
            r7 = 0
        L28:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.util.f.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "doInBackground: get bks from hms tss cost : "
            r3.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            r3.append(r4)
            java.lang.String r0 = " ms"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r2, r0)
            if (r7 == 0) goto L50
            com.huawei.secure.android.common.ssl.util.g.g(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L50:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
    }

    protected void c(java.lang.Boolean r2) {
            r1 = this;
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Le
            java.lang.String r2 = com.huawei.secure.android.common.ssl.util.f.a
            java.lang.String r0 = "onPostExecute: upate done"
            com.huawei.secure.android.common.ssl.util.h.e(r2, r0)
            return
        Le:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.util.f.a
            java.lang.String r0 = "onPostExecute: upate failed"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r0)
            return
    }

    protected void d(java.lang.Integer... r2) {
            r1 = this;
            java.lang.String r2 = com.huawei.secure.android.common.ssl.util.f.a
            java.lang.String r0 = "onProgressUpdate"
            com.huawei.secure.android.common.ssl.util.h.e(r2, r0)
            return
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ java.lang.Boolean doInBackground(android.content.Context[] r1) {
            r0 = this;
            android.content.Context[] r1 = (android.content.Context[]) r1
            java.lang.Boolean r1 = r0.a(r1)
            return r1
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onPostExecute(java.lang.Boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0.c(r1)
            return
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
            r2 = this;
            java.lang.String r0 = com.huawei.secure.android.common.ssl.util.f.a
            java.lang.String r1 = "onPreExecute"
            com.huawei.secure.android.common.ssl.util.h.b(r0, r1)
            return
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onProgressUpdate(java.lang.Integer[] r1) {
            r0 = this;
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1
            r0.d(r1)
            return
    }
}
