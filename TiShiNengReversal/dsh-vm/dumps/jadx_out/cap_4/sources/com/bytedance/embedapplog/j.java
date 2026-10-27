package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j {
    private static boolean ae = false;
    public static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> cw = null;

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    public static com.bytedance.embedapplog.wq j = null;

    /* renamed from: m, reason: collision with root package name */
    private static boolean f2082m = true;

    /* renamed from: r, reason: collision with root package name */
    public static com.bytedance.embedapplog.xt f2083r = null;
    private static volatile com.bytedance.embedapplog.r tl = null;

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static volatile com.bytedance.embedapplog.rn up = null;
    public static boolean xt = true;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 4
            r0.<init>(r1)
            com.bytedance.embedapplog.j.cw = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean ae() {
            r0 = 1
            return r0
    }

    public static com.bytedance.embedapplog.r cw() {
            com.bytedance.embedapplog.r r0 = com.bytedance.embedapplog.j.tl
            return r0
    }

    public static java.lang.String g() {
            com.bytedance.embedapplog.wq r0 = com.bytedance.embedapplog.j.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.g()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public static <T> T j(java.lang.String r1, T r2) {
            com.bytedance.embedapplog.wq r0 = com.bytedance.embedapplog.j.j
            if (r0 == 0) goto L9
            java.lang.Object r1 = r0.j(r1, r2)
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static void j() {
            boolean r0 = com.bytedance.embedapplog.j.xt
            if (r0 == 0) goto Lb
            com.bytedance.embedapplog.wq r0 = com.bytedance.embedapplog.j.j
            if (r0 == 0) goto Lb
            r0.r()
        Lb:
            return
    }

    public static void j(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull com.bytedance.embedapplog.tl r5) {
            com.bytedance.embedapplog.rn r0 = com.bytedance.embedapplog.j.up
            if (r0 == 0) goto Lf
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Init Twice!"
            r4.<init>(r5)
            com.bytedance.embedapplog.uc.xt(r4)
            return
        Lf:
            com.bytedance.embedapplog.ae r0 = r5.h()
            if (r0 != 0) goto L20
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "need to involve setSensitiveInfoProvider!"
            r4.<init>(r5)
            com.bytedance.embedapplog.uc.xt(r4)
            return
        L20:
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            android.app.Application r4 = (android.app.Application) r4
            com.bytedance.embedapplog.f r0 = com.bytedance.embedapplog.f.m()
            com.bytedance.embedapplog.rn r1 = new com.bytedance.embedapplog.rn
            r1.<init>(r4, r5)
            com.bytedance.embedapplog.j.up = r1
            com.bytedance.embedapplog.wq r2 = new com.bytedance.embedapplog.wq
            r2.<init>(r4, r1)
            com.bytedance.embedapplog.w r3 = new com.bytedance.embedapplog.w
            com.bytedance.embedapplog.m r5 = r5.oq()
            r3.<init>(r5)
            r0.j(r4, r1, r2, r3)
            com.bytedance.embedapplog.j.j = r2
            com.bytedance.embedapplog.rn r5 = com.bytedance.embedapplog.j.up
            boolean r5 = r5.i()
            if (r5 == 0) goto L5d
            com.bytedance.embedapplog.collector.Collector r5 = new com.bytedance.embedapplog.collector.Collector
            r5.<init>()
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            r4.registerReceiver(r5, r0)
        L5d:
            java.lang.String r4 = "Inited"
            r5 = 0
            com.bytedance.embedapplog.uc.r(r4, r5)
            return
    }

    @androidx.annotation.AnyThread
    public static void j(@androidx.annotation.Nullable com.bytedance.embedapplog.up r0) {
            com.bytedance.embedapplog.wo.j(r0)
            return
    }

    public static void j(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            r0 = 0
            if (r5 == 0) goto L33
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L33
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.util.Set r0 = r5.keySet()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L16:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Throwable -> L2a
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L2a
            goto L16
        L2a:
            r5 = move-exception
            r0 = r1
            goto L30
        L2d:
            r0 = r1
            goto L33
        L2f:
            r5 = move-exception
        L30:
            com.bytedance.embedapplog.uc.xt(r5)
        L33:
            j(r4, r0)
            return
    }

    public static void j(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable android.os.Bundle r5, int r6) {
            r0 = 0
            if (r5 == 0) goto L33
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L33
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.util.Set r0 = r5.keySet()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L16:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Throwable -> L2a
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L2a
            goto L16
        L2a:
            r5 = move-exception
            r0 = r1
            goto L30
        L2d:
            r0 = r1
            goto L33
        L2f:
            r5 = move-exception
        L30:
            com.bytedance.embedapplog.uc.xt(r5)
        L33:
            j(r4, r0, r6)
            return
    }

    public static void j(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable org.json.JSONObject r3) {
            com.bytedance.embedapplog.ff r0 = new com.bytedance.embedapplog.ff
            if (r3 == 0) goto L9
            java.lang.String r3 = r3.toString()
            goto La
        L9:
            r3 = 0
        La:
            r1 = 0
            r0.<init>(r2, r1, r3)
            com.bytedance.embedapplog.f.j(r0)
            return
    }

    public static void j(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable org.json.JSONObject r3, int r4) {
            com.bytedance.embedapplog.ff r0 = new com.bytedance.embedapplog.ff
            if (r3 == 0) goto L9
            java.lang.String r3 = r3.toString()
            goto La
        L9:
            r3 = 0
        La:
            r1 = 0
            r0.<init>(r2, r1, r3, r4)
            com.bytedance.embedapplog.f.j(r0)
            return
    }

    public static void j(java.util.HashMap<java.lang.String, java.lang.Object> r1) {
            com.bytedance.embedapplog.wq r0 = com.bytedance.embedapplog.j.j
            if (r0 == 0) goto L7
            r0.j(r1)
        L7:
            return
    }

    public static void j(boolean r0) {
            com.bytedance.embedapplog.j.xt = r0
            return
    }

    @androidx.annotation.Nullable
    public static org.json.JSONObject m() {
            com.bytedance.embedapplog.rn r0 = com.bytedance.embedapplog.j.up
            if (r0 == 0) goto Lb
            com.bytedance.embedapplog.rn r0 = com.bytedance.embedapplog.j.up
            org.json.JSONObject r0 = r0.kt()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static java.lang.String oq() {
            com.bytedance.embedapplog.wq r0 = com.bytedance.embedapplog.j.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.oq()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @androidx.annotation.NonNull
    public static com.bytedance.embedapplog.cw qv() {
            com.bytedance.embedapplog.rr r0 = com.bytedance.embedapplog.rr.j()
            return r0
    }

    public static com.bytedance.embedapplog.xt r() {
            com.bytedance.embedapplog.xt r0 = com.bytedance.embedapplog.j.f2083r
            return r0
    }

    public static java.lang.String tl() {
            com.bytedance.embedapplog.wq r0 = com.bytedance.embedapplog.j.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.ae()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String up() {
            com.bytedance.embedapplog.wq r0 = com.bytedance.embedapplog.j.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.jy()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static com.bytedance.embedapplog.tl vl() {
            com.bytedance.embedapplog.rn r0 = com.bytedance.embedapplog.j.up
            if (r0 == 0) goto Lb
            com.bytedance.embedapplog.rn r0 = com.bytedance.embedapplog.j.up
            com.bytedance.embedapplog.tl r0 = r0.hh()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static void xt() {
            com.bytedance.embedapplog.f.j()
            return
    }

    public static void xt(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull org.json.JSONObject r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1f
            if (r2 == 0) goto L1f
            int r0 = r2.length()
            if (r0 > 0) goto Lf
            goto L1f
        Lf:
            com.bytedance.embedapplog.k r0 = new com.bytedance.embedapplog.k     // Catch: java.lang.Exception -> L18
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L18
            com.bytedance.embedapplog.f.j(r0)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r1 = move-exception
            java.lang.String r2 = "call onEventData get exception: "
            com.bytedance.embedapplog.uc.cw(r2, r1)
            return
        L1f:
            java.lang.String r1 = "call onEventData with invalid params, return"
            r2 = 0
            com.bytedance.embedapplog.uc.xt(r1, r2)
            return
    }
}
