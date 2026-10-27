package com.ss.android.socialbase.downloader.jy;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private static com.ss.android.socialbase.downloader.jy.j ae;
    private static org.json.JSONObject cw;
    private static final com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.jy.j> j = null;
    private static boolean m;
    private static org.json.JSONObject r;
    private static java.lang.Boolean up;
    private static final com.ss.android.socialbase.downloader.jy.j xt = null;
    private final org.json.JSONObject g;
    private final java.lang.Boolean oq;
    private int qv;
    private final org.json.JSONObject tl;

    static {
            com.ss.android.socialbase.downloader.az.tl r0 = new com.ss.android.socialbase.downloader.az.tl
            r1 = 16
            r0.<init>(r1, r1)
            com.ss.android.socialbase.downloader.jy.j.j = r0
            com.ss.android.socialbase.downloader.jy.j r0 = new com.ss.android.socialbase.downloader.jy.j
            r1 = 0
            r0.<init>(r1)
            com.ss.android.socialbase.downloader.jy.j.xt = r0
            j()
            return
    }

    private j(org.json.JSONObject r5) {
            r4 = this;
            r4.<init>()
            r4.tl = r5
            r0 = 0
            if (r5 == 0) goto L35
            java.lang.String r1 = "bugfix"
            boolean r2 = m(r1)
            if (r2 != 0) goto L35
            org.json.JSONObject r5 = r5.optJSONObject(r1)
            if (r5 == 0) goto L31
            java.lang.String r1 = "default"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L31
            boolean r2 = m(r1)
            if (r2 != 0) goto L31
            r0 = 0
            int r1 = r5.optInt(r1, r0)
            r2 = 1
            if (r1 != r2) goto L2d
            r0 = 1
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L31:
            r3 = r0
            r0 = r5
            r5 = r3
            goto L36
        L35:
            r5 = r0
        L36:
            r4.g = r0
            r4.oq = r5
            return
    }

    @androidx.annotation.NonNull
    public static com.ss.android.socialbase.downloader.jy.j cw() {
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.xt
            return r0
    }

    private static com.ss.android.socialbase.downloader.jy.j cw(int r1) {
            boolean r0 = com.ss.android.socialbase.downloader.jy.j.m
            if (r0 == 0) goto L7
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.xt
            return r1
        L7:
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            if (r0 == 0) goto L1c
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            com.ss.android.socialbase.downloader.ae.cw r1 = r0.tl(r1)
            if (r1 == 0) goto L1c
            com.ss.android.socialbase.downloader.jy.j r1 = xt(r1)
            return r1
        L1c:
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.xt
            return r1
    }

    @androidx.annotation.NonNull
    public static com.ss.android.socialbase.downloader.jy.j j(int r1) {
            r0 = 0
            com.ss.android.socialbase.downloader.jy.j r1 = j(r1, r0)
            return r1
    }

    private static com.ss.android.socialbase.downloader.jy.j j(int r2, com.ss.android.socialbase.downloader.ae.cw r3) {
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.ae
            if (r0 == 0) goto L9
            int r1 = r0.qv
            if (r1 != r2) goto L9
            return r0
        L9:
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.jy.j> r0 = com.ss.android.socialbase.downloader.jy.j.j
            monitor-enter(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L38
            com.ss.android.socialbase.downloader.jy.j r1 = (com.ss.android.socialbase.downloader.jy.j) r1     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L33
            if (r3 != 0) goto L21
            com.ss.android.socialbase.downloader.jy.j r3 = cw(r2)
        L1f:
            r1 = r3
            goto L26
        L21:
            com.ss.android.socialbase.downloader.jy.j r3 = xt(r3)
            goto L1f
        L26:
            monitor-enter(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L30
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r2
        L33:
            r1.qv = r2
            com.ss.android.socialbase.downloader.jy.j.ae = r1
            return r1
        L38:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r2
    }

    @androidx.annotation.NonNull
    public static com.ss.android.socialbase.downloader.jy.j j(com.ss.android.socialbase.downloader.ae.cw r1) {
            if (r1 != 0) goto L5
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.xt
            return r1
        L5:
            int r0 = r1.ae()
            com.ss.android.socialbase.downloader.jy.j r1 = j(r0, r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.ss.android.socialbase.downloader.jy.j j(org.json.JSONObject r4) {
            if (r4 == 0) goto L42
            org.json.JSONObject r0 = xt()
            if (r4 == r0) goto L42
            boolean r0 = com.ss.android.socialbase.downloader.jy.j.m
            if (r0 == 0) goto Ld
            goto L42
        Ld:
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.ae
            if (r0 == 0) goto L16
            org.json.JSONObject r1 = r0.tl
            if (r1 != r4) goto L16
            return r0
        L16:
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.jy.j> r0 = com.ss.android.socialbase.downloader.jy.j.j
            monitor-enter(r0)
            java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        L21:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
            com.ss.android.socialbase.downloader.jy.j r2 = (com.ss.android.socialbase.downloader.jy.j) r2     // Catch: java.lang.Throwable -> L35
            org.json.JSONObject r3 = r2.tl     // Catch: java.lang.Throwable -> L35
            if (r3 != r4) goto L21
            com.ss.android.socialbase.downloader.jy.j.ae = r2     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r2
        L35:
            r4 = move-exception
            goto L40
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.socialbase.downloader.jy.j r0 = new com.ss.android.socialbase.downloader.jy.j
            r0.<init>(r4)
            com.ss.android.socialbase.downloader.jy.j.ae = r0
            return r0
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r4
        L42:
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.xt
            return r4
    }

    public static void j() {
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.downloader.cw.la()
            java.lang.String r1 = "disable_task_setting"
            r2 = 0
            int r1 = r0.optInt(r1, r2)
            r3 = 1
            if (r1 != r3) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            com.ss.android.socialbase.downloader.jy.j.m = r1
            java.lang.String r1 = "disabled_task_keys"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            com.ss.android.socialbase.downloader.jy.j.cw = r1
            java.lang.String r1 = "bugfix"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            if (r0 == 0) goto L37
            java.lang.String r1 = "default"
            boolean r4 = r0.has(r1)
            if (r4 == 0) goto L37
            int r1 = r0.optInt(r1, r2)
            if (r1 != r3) goto L32
            r2 = 1
        L32:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L38
        L37:
            r1 = 0
        L38:
            com.ss.android.socialbase.downloader.jy.j.r = r0
            com.ss.android.socialbase.downloader.jy.j.up = r1
            return
    }

    public static void j(int r4, org.json.JSONObject r5) {
            if (r5 == 0) goto L53
            org.json.JSONObject r0 = xt()
            if (r5 == r0) goto L53
            boolean r0 = com.ss.android.socialbase.downloader.jy.j.m
            if (r0 == 0) goto Ld
            goto L53
        Ld:
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.jy.j> r0 = com.ss.android.socialbase.downloader.jy.j.j
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.ae     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            org.json.JSONObject r2 = r1.tl     // Catch: java.lang.Throwable -> L1b
            if (r2 != r5) goto L1d
            r1.qv = r4     // Catch: java.lang.Throwable -> L1b
            goto L46
        L1b:
            r4 = move-exception
            goto L51
        L1d:
            java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L25:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            com.ss.android.socialbase.downloader.jy.j r2 = (com.ss.android.socialbase.downloader.jy.j) r2     // Catch: java.lang.Throwable -> L1b
            org.json.JSONObject r3 = r2.tl     // Catch: java.lang.Throwable -> L1b
            if (r3 != r5) goto L25
            r2.qv = r4     // Catch: java.lang.Throwable -> L1b
            goto L39
        L38:
            r2 = 0
        L39:
            if (r2 != 0) goto L43
            com.ss.android.socialbase.downloader.jy.j r1 = new com.ss.android.socialbase.downloader.jy.j     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L1b
            r1.qv = r4     // Catch: java.lang.Throwable -> L1b
            goto L44
        L43:
            r1 = r2
        L44:
            com.ss.android.socialbase.downloader.jy.j.ae = r1     // Catch: java.lang.Throwable -> L1b
        L46:
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.jy.j> r5 = com.ss.android.socialbase.downloader.jy.j.j     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1b
            r5.put(r4, r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L53:
            return
    }

    public static void j(java.lang.String r1, boolean r2) {
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.jy.j.r     // Catch: org.json.JSONException -> L10
            if (r0 != 0) goto Lb
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L10
            r0.<init>()     // Catch: org.json.JSONException -> L10
            com.ss.android.socialbase.downloader.jy.j.r = r0     // Catch: org.json.JSONException -> L10
        Lb:
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.jy.j.r     // Catch: org.json.JSONException -> L10
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L10
        L10:
            return
    }

    public static boolean m(java.lang.String r2) {
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.jy.j.cw
            r1 = 0
            if (r0 == 0) goto Ld
            int r2 = r0.optInt(r2, r1)
            r0 = 1
            if (r2 != r0) goto Ld
            return r0
        Ld:
            return r1
    }

    private static com.ss.android.socialbase.downloader.jy.j xt(com.ss.android.socialbase.downloader.ae.cw r1) {
            boolean r0 = com.ss.android.socialbase.downloader.jy.j.m
            if (r0 == 0) goto L7
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.xt
            return r1
        L7:
            java.lang.String r1 = r1.hl()     // Catch: java.lang.Throwable -> L1c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L20
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            com.ss.android.socialbase.downloader.jy.j r1 = new com.ss.android.socialbase.downloader.jy.j     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1c
            return r1
        L1c:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L20:
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.xt
            return r1
    }

    @androidx.annotation.NonNull
    public static org.json.JSONObject xt() {
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.downloader.cw.la()
            return r0
    }

    public static void xt(int r1) {
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.ae
            if (r0 == 0) goto Lb
            int r0 = r0.qv
            if (r0 != r1) goto Lb
            r0 = 0
            com.ss.android.socialbase.downloader.jy.j.ae = r0
        Lb:
            com.ss.android.socialbase.downloader.az.tl<java.lang.Integer, com.ss.android.socialbase.downloader.jy.j> r0 = com.ss.android.socialbase.downloader.jy.j.j
            monitor-enter(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L17
            r0.remove(r1)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public java.lang.String cw(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = r1.j(r2, r0)
            return r2
    }

    public double j(java.lang.String r2, double r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.tl
            if (r0 == 0) goto L17
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L17
            boolean r0 = m(r2)
            if (r0 != 0) goto L17
            org.json.JSONObject r0 = r1.tl
            double r2 = r0.optDouble(r2, r3)
            return r2
        L17:
            org.json.JSONObject r0 = xt()
            double r2 = r0.optDouble(r2, r3)
            return r2
    }

    public int j(java.lang.String r2, int r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.tl
            if (r0 == 0) goto L17
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L17
            boolean r0 = m(r2)
            if (r0 != 0) goto L17
            org.json.JSONObject r0 = r1.tl
            int r2 = r0.optInt(r2, r3)
            return r2
        L17:
            org.json.JSONObject r0 = xt()
            int r2 = r0.optInt(r2, r3)
            return r2
    }

    public long j(java.lang.String r2, long r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.tl
            if (r0 == 0) goto L17
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L17
            boolean r0 = m(r2)
            if (r0 != 0) goto L17
            org.json.JSONObject r0 = r1.tl
            long r2 = r0.optLong(r2, r3)
            return r2
        L17:
            org.json.JSONObject r0 = xt()
            long r2 = r0.optLong(r2, r3)
            return r2
    }

    public java.lang.String j(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.tl
            if (r0 == 0) goto L17
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L17
            boolean r0 = m(r2)
            if (r0 != 0) goto L17
            org.json.JSONObject r0 = r1.tl
            java.lang.String r2 = r0.optString(r2, r3)
            return r2
        L17:
            org.json.JSONObject r0 = xt()
            java.lang.String r2 = r0.optString(r2, r3)
            return r2
    }

    public boolean j(java.lang.String r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.xt(r2, r0)
            return r2
    }

    public org.json.JSONObject r(java.lang.String r2) {
            r1 = this;
            org.json.JSONObject r0 = r1.tl
            if (r0 == 0) goto L17
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L17
            boolean r0 = m(r2)
            if (r0 != 0) goto L17
            org.json.JSONObject r0 = r1.tl
            org.json.JSONObject r2 = r0.optJSONObject(r2)
            return r2
        L17:
            org.json.JSONObject r0 = xt()
            org.json.JSONObject r2 = r0.optJSONObject(r2)
            return r2
    }

    public org.json.JSONArray up(java.lang.String r2) {
            r1 = this;
            org.json.JSONObject r0 = r1.tl
            if (r0 == 0) goto L17
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L17
            boolean r0 = m(r2)
            if (r0 != 0) goto L17
            org.json.JSONObject r0 = r1.tl
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            return r2
        L17:
            org.json.JSONObject r0 = xt()
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            return r2
    }

    public int xt(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.j(r2, r0)
            return r2
    }

    public boolean xt(java.lang.String r4, boolean r5) {
            r3 = this;
            org.json.JSONObject r0 = r3.g
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L27
            boolean r0 = m(r4)
            if (r0 != 0) goto L27
            org.json.JSONObject r0 = r3.g
            boolean r0 = r0.has(r4)
            if (r0 == 0) goto L1e
            org.json.JSONObject r0 = r3.g
            int r4 = r0.optInt(r4, r5)
            if (r4 != r2) goto L1d
            return r2
        L1d:
            return r1
        L1e:
            java.lang.Boolean r0 = r3.oq
            if (r0 == 0) goto L27
            boolean r4 = r0.booleanValue()
            return r4
        L27:
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.jy.j.r
            if (r0 == 0) goto L44
            boolean r0 = r0.has(r4)
            if (r0 == 0) goto L3b
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.jy.j.r
            int r4 = r0.optInt(r4, r5)
            if (r4 != r2) goto L3a
            return r2
        L3a:
            return r1
        L3b:
            java.lang.Boolean r4 = com.ss.android.socialbase.downloader.jy.j.up
            if (r4 == 0) goto L44
            boolean r4 = r4.booleanValue()
            return r4
        L44:
            return r5
    }
}
