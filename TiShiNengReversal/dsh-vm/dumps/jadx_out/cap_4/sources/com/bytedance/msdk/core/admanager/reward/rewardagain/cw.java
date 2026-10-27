package com.bytedance.msdk.core.admanager.reward.rewardagain;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private static final java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.xt> oq = null;
    private static final java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.j> qv = null;
    private static com.bytedance.msdk.core.admanager.reward.rewardagain.cw.j vl;
    private java.lang.String ae;
    private com.bytedance.msdk.api.r.j.tl.j cw;
    private volatile boolean g;
    private final java.lang.ref.SoftReference<android.content.Context> j;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.Object f2189m;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.msdk.api.r.j.tl.j f2190r;
    private volatile boolean tl;
    private android.app.Activity up;
    private final com.bytedance.msdk.api.j.xt xt;









    public static class j {
        public java.lang.Runnable cw;
        public com.bytedance.msdk.core.admanager.reward.rewardagain.xt j;
        public java.lang.Runnable xt;

        public j() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw.oq = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw.qv = r0
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j r0 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j
            r0.<init>()
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw.vl = r0
            return
    }

    public cw(android.content.Context r2, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.api.r.j.tl.j r4, com.bytedance.msdk.api.r.j.tl.j r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.tl = r0
            r1.g = r0
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.j = r0
            r1.xt = r3
            if (r4 == 0) goto L15
            r1.cw = r4
        L15:
            if (r5 == 0) goto L19
            r1.f2190r = r5
        L19:
            return
    }

    public static double ae(java.lang.String r4) {
            java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.j> r0 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.qv
            java.lang.Object r4 = r0.get(r4)
            com.bytedance.msdk.core.admanager.reward.rewardagain.j r4 = (com.bytedance.msdk.core.admanager.reward.rewardagain.j) r4
            if (r4 == 0) goto L1b
            double r0 = r4.cw()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1b
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L1b
            return r0
        L1b:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.api.j.xt ae(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0) {
            com.bytedance.msdk.api.j.xt r0 = r0.xt
            return r0
    }

    private static java.lang.String ae() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "dd-MM-yyyy HH"
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static int cw(java.lang.String r3) {
            r0 = 0
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            java.lang.String r1 = "ra_show_count_in_hour"
            java.lang.String r0 = r0.xt(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L2e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2a
            r1.<init>(r0)     // Catch: org.json.JSONException -> L2a
            java.lang.String r0 = ae()     // Catch: org.json.JSONException -> L2a
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L2a
            if (r0 == 0) goto L2e
            int r3 = r0.optInt(r3, r2)     // Catch: org.json.JSONException -> L2a
            return r3
        L2a:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L2e:
            return r2
    }

    static /* synthetic */ com.bytedance.msdk.api.r.j.tl.j cw(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0) {
            com.bytedance.msdk.api.r.j.tl.j r0 = r0.cw
            return r0
    }

    public static com.bytedance.msdk.core.admanager.reward.rewardagain.cw.j cw() {
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j r0 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.vl
            return r0
    }

    private void cw(com.bytedance.msdk.core.admanager.reward.rewardagain.j r2, com.bytedance.msdk.xt.cw r3) {
            r1 = this;
            com.bytedance.msdk.api.j.xt r0 = r1.xt
            int r2 = r1.j(r0, r2, r3)
            com.bytedance.msdk.api.j.xt r3 = r1.xt
            com.bytedance.msdk.up.m.cw(r3, r2)
            if (r2 != 0) goto L11
            r1.j()
            return
        L11:
            com.bytedance.msdk.api.r.j.tl.j r2 = r1.cw
            if (r2 == 0) goto L18
            r2.cw()
        L18:
            return
    }

    public static com.bytedance.msdk.core.admanager.reward.rewardagain.j g(java.lang.String r1) {
            java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.j> r0 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.qv
            java.lang.Object r1 = r0.get(r1)
            com.bytedance.msdk.core.admanager.reward.rewardagain.j r1 = (com.bytedance.msdk.core.admanager.reward.rewardagain.j) r1
            return r1
    }

    public static int j(java.lang.String r3) {
            r0 = 0
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            java.lang.String r1 = "ra_show_count"
            java.lang.String r0 = r0.xt(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L2e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2a
            r1.<init>(r0)     // Catch: org.json.JSONException -> L2a
            java.lang.String r0 = m()     // Catch: org.json.JSONException -> L2a
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L2a
            if (r0 == 0) goto L2e
            int r3 = r0.optInt(r3, r2)     // Catch: org.json.JSONException -> L2a
            return r3
        L2a:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L2e:
            return r2
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0) {
            r0.up()
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0, com.bytedance.msdk.core.admanager.reward.rewardagain.j r1, com.bytedance.msdk.xt.cw r2) {
            r0.cw(r1, r2)
            return
    }

    private void j(com.bytedance.msdk.cw.r.vl r2) {
            r1 = this;
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$7 r0 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$7
            r0.<init>(r1)
            r2.j(r0)
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$8 r0 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$8
            r0.<init>(r1)
            r2.xt(r0)
            return
    }

    public static void j(java.lang.String r1, com.bytedance.msdk.core.admanager.reward.rewardagain.j r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Le
            if (r2 != 0) goto L9
            goto Le
        L9:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.j> r0 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.qv
            r0.put(r1, r2)
        Le:
            return
    }

    public static void j(org.json.JSONArray r4) {
            if (r4 == 0) goto L53
            int r0 = r4.length()
            if (r0 <= 0) goto L53
            r0 = 0
        L9:
            int r1 = r4.length()
            if (r0 >= r1) goto L53
            org.json.JSONObject r1 = r4.optJSONObject(r0)
            if (r1 == 0) goto L50
            com.bytedance.msdk.core.admanager.reward.rewardagain.xt r2 = new com.bytedance.msdk.core.admanager.reward.rewardagain.xt
            r2.<init>()
            java.lang.String r3 = "ra_id"
            java.lang.String r3 = r1.optString(r3)
            r2.j(r3)
            java.lang.String r3 = "title"
            java.lang.String r3 = r1.optString(r3)
            r2.xt(r3)
            java.lang.String r3 = "pic_url"
            java.lang.String r3 = r1.optString(r3)
            r2.cw(r3)
            java.lang.String r3 = "btn_ok"
            java.lang.String r3 = r1.optString(r3)
            r2.r(r3)
            java.lang.String r3 = "btn_cancel"
            java.lang.String r1 = r1.optString(r3)
            r2.up(r1)
            java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.xt> r1 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.oq
            java.lang.String r3 = r2.j()
            r1.put(r3, r2)
        L50:
            int r0 = r0 + 1
            goto L9
        L53:
            return
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0, boolean r1) {
            r0.tl = r1
            return r1
    }

    public static long m(java.lang.String r4) {
            r0 = 0
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            java.lang.String r1 = "ra_play_rit_ts"
            java.lang.String r0 = r0.xt(r1)
            r1 = -1
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L25
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L21
            long r0 = r3.optLong(r4, r1)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L25:
            return r1
    }

    private static java.lang.String m() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "dd-MM-yyyy"
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    static /* synthetic */ java.lang.String m(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0) {
            java.lang.String r0 = r0.ae
            return r0
    }

    public static void oq(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb
            java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.j> r0 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.qv
            r0.remove(r1)
        Lb:
            return
    }

    static /* synthetic */ android.app.Activity r(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0) {
            android.app.Activity r0 = r0.up
            return r0
    }

    static /* synthetic */ void r() {
            tl()
            return
    }

    public static void r(java.lang.String r7) {
            r0 = 0
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            java.lang.String r1 = "ra_show_count_in_hour"
            java.lang.String r2 = r0.xt(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            if (r3 != 0) goto L48
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L43
            r3.<init>(r2)     // Catch: org.json.JSONException -> L43
            java.lang.String r2 = ae()     // Catch: org.json.JSONException -> L43
            org.json.JSONObject r5 = r3.optJSONObject(r2)     // Catch: org.json.JSONException -> L43
            if (r5 != 0) goto L2f
            java.lang.String r5 = ""
            r0.j(r1, r5)     // Catch: org.json.JSONException -> L43
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L43
            r5.<init>()     // Catch: org.json.JSONException -> L43
        L2f:
            r6 = 0
            int r6 = r5.optInt(r7, r6)     // Catch: org.json.JSONException -> L43
            int r6 = r6 + r4
            r5.put(r7, r6)     // Catch: org.json.JSONException -> L43
            r3.put(r2, r5)     // Catch: org.json.JSONException -> L43
            java.lang.String r7 = r3.toString()     // Catch: org.json.JSONException -> L43
            r0.j(r1, r7)     // Catch: org.json.JSONException -> L43
            return
        L43:
            r7 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
        L48:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L64
            r2.<init>()     // Catch: org.json.JSONException -> L64
            r2.put(r7, r4)     // Catch: org.json.JSONException -> L64
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L64
            r7.<init>()     // Catch: org.json.JSONException -> L64
            java.lang.String r3 = ae()     // Catch: org.json.JSONException -> L64
            r7.put(r3, r2)     // Catch: org.json.JSONException -> L64
            java.lang.String r7 = r7.toString()     // Catch: org.json.JSONException -> L64
            r0.j(r1, r7)     // Catch: org.json.JSONException -> L64
            return
        L64:
            r7 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
    }

    public static double tl(java.lang.String r2) {
            java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.j> r0 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.qv
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.msdk.core.admanager.reward.rewardagain.j r2 = (com.bytedance.msdk.core.admanager.reward.rewardagain.j) r2
            if (r2 == 0) goto Lf
            double r0 = r2.m()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.api.r.j.tl.j tl(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0) {
            com.bytedance.msdk.api.r.j.tl.j r0 = r0.f2190r
            return r0
    }

    private static void tl() {
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j r0 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.vl
            r1 = 0
            r0.j = r1
            r0.xt = r1
            r0.cw = r1
            return
    }

    static /* synthetic */ java.lang.Object up(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0) {
            java.lang.Object r0 = r0.f2189m
            return r0
    }

    private void up() {
            r1 = this;
            com.bytedance.msdk.api.r.j.tl.j r0 = r1.cw
            if (r0 == 0) goto L7
            r0.cw()
        L7:
            com.bytedance.msdk.api.j.xt r0 = r1.xt
            com.bytedance.msdk.up.m.xt(r0)
            return
    }

    public static void up(java.lang.String r5) {
            r0 = 0
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            java.lang.String r1 = "ra_play_rit_ts"
            java.lang.String r2 = r0.xt(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L1b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            goto L21
        L1b:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L30
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L30
            r2 = r3
        L21:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L30
            r0.j(r1, r5)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
            return
    }

    private void xt(com.bytedance.msdk.core.admanager.reward.rewardagain.j r4, com.bytedance.msdk.xt.cw r5) {
            r3 = this;
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j r0 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j
            r0.<init>()
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw.vl = r0
            java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.xt> r1 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.oq
            java.lang.String r2 = r4.r()
            java.lang.Object r1 = r1.get(r2)
            com.bytedance.msdk.core.admanager.reward.rewardagain.xt r1 = (com.bytedance.msdk.core.admanager.reward.rewardagain.xt) r1
            r0.j = r1
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j r0 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.vl
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$3 r1 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$3
            r1.<init>(r3, r4, r5)
            r0.xt = r1
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j r4 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.vl
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$4 r5 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$4
            r5.<init>(r3)
            r4.cw = r5
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()
            java.lang.Class<com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity> r0 = com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity.class
            r4.<init>(r5, r0)
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r4.setFlags(r5)
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()
            r5.startActivity(r4)
            return
    }

    public static void xt(java.lang.String r7) {
            r0 = 0
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            java.lang.String r1 = "ra_show_count"
            java.lang.String r2 = r0.xt(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            if (r3 != 0) goto L48
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L43
            r3.<init>(r2)     // Catch: org.json.JSONException -> L43
            java.lang.String r2 = m()     // Catch: org.json.JSONException -> L43
            org.json.JSONObject r5 = r3.optJSONObject(r2)     // Catch: org.json.JSONException -> L43
            if (r5 != 0) goto L2f
            java.lang.String r5 = ""
            r0.j(r1, r5)     // Catch: org.json.JSONException -> L43
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L43
            r5.<init>()     // Catch: org.json.JSONException -> L43
        L2f:
            r6 = 0
            int r6 = r5.optInt(r7, r6)     // Catch: org.json.JSONException -> L43
            int r6 = r6 + r4
            r5.put(r7, r6)     // Catch: org.json.JSONException -> L43
            r3.put(r2, r5)     // Catch: org.json.JSONException -> L43
            java.lang.String r7 = r3.toString()     // Catch: org.json.JSONException -> L43
            r0.j(r1, r7)     // Catch: org.json.JSONException -> L43
            return
        L43:
            r7 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
        L48:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L64
            r2.<init>()     // Catch: org.json.JSONException -> L64
            r2.put(r7, r4)     // Catch: org.json.JSONException -> L64
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L64
            r7.<init>()     // Catch: org.json.JSONException -> L64
            java.lang.String r3 = m()     // Catch: org.json.JSONException -> L64
            r7.put(r3, r2)     // Catch: org.json.JSONException -> L64
            java.lang.String r7 = r7.toString()     // Catch: org.json.JSONException -> L64
            r0.j(r1, r7)     // Catch: org.json.JSONException -> L64
            return
        L64:
            r7 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
    }

    static /* synthetic */ boolean xt(com.bytedance.msdk.core.admanager.reward.rewardagain.cw r0) {
            boolean r0 = r0.tl
            return r0
    }

    public int j(com.bytedance.msdk.api.j.xt r17, com.bytedance.msdk.core.admanager.reward.rewardagain.j r18, com.bytedance.msdk.xt.cw r19) {
            r16 = this;
            r0 = r16
            boolean r1 = r0.g
            java.lang.String r2 = "TTMediationSDK"
            if (r1 != 0) goto Lf
            java.lang.String r1 = "--==--ra: 还未触发rewardVerify"
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 1
            return r1
        Lf:
            java.lang.String r1 = r17.v()
            int r3 = r18.up()
            int r4 = j(r1)
            java.lang.String r5 = ", 已经展示: "
            if (r4 < r3) goto L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "--==--ra: 激励再得展示次数超过天级别限制，限制: "
            r1.<init>(r6)
            r1.append(r3)
            r1.append(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 2
            return r1
        L38:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.xt> r3 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.oq
            java.lang.String r4 = r18.r()
            java.lang.Object r3 = r3.get(r4)
            com.bytedance.msdk.core.admanager.reward.rewardagain.xt r3 = (com.bytedance.msdk.core.admanager.reward.rewardagain.xt) r3
            if (r3 != 0) goto L4d
            java.lang.String r1 = "--==--ra: 激励再得样式为空"
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 3
            return r1
        L4d:
            com.bytedance.msdk.core.ae.j r3 = com.bytedance.msdk.core.ae.j.j()
            boolean r3 = r3.xt()
            if (r3 == 0) goto L5e
            java.lang.String r1 = "--==--ra: 命中请求熔断"
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 4
            return r1
        L5e:
            com.bytedance.msdk.core.tl.jy r3 = com.bytedance.msdk.core.tl.jy.j()
            boolean r3 = r3.tl(r1)
            if (r3 != 0) goto L6f
            java.lang.String r1 = "--==--ra: 命中展示频控"
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 5
            return r1
        L6f:
            com.bytedance.msdk.core.tl.jy r3 = com.bytedance.msdk.core.tl.jy.j()
            boolean r3 = r3.cw(r1)
            if (r3 != 0) goto L80
            java.lang.String r1 = "--==--ra: 命中展示间隔"
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 6
            return r1
        L80:
            com.bytedance.msdk.core.up.xt.r r3 = com.bytedance.msdk.core.up.xt.r.j()
            r4 = r17
            double r3 = r3.xt(r1, r4)
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L97
            java.lang.String r1 = "--==--ra: 激励再得无缓存可用"
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 7
            return r1
        L97:
            double r8 = tl(r1)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto La7
            java.lang.String r1 = "--==--ra: 激励再得有缓存，但是ecpm不符合"
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 8
            return r1
        La7:
            int r8 = r18.j()
            int r9 = cw(r1)
            if (r9 < r8) goto Lcb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "--==--ra: 激励再得展示次数超过小时级别限制，限制: "
            r1.<init>(r3)
            r1.append(r8)
            r1.append(r5)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 9
            return r1
        Lcb:
            long r8 = r18.xt()
            long r10 = m(r1)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r10
            r14 = -1
            int r5 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r5 == 0) goto Lfe
            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r5 >= 0) goto Lfe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "--==--ra: 激励再得展示间隔超过限制，config间隔: "
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r3 = ", 实际间隔: "
            r1.append(r3)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 10
            return r1
        Lfe:
            double r8 = ae(r1)
            if (r19 == 0) goto L11a
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L11a
            double r5 = r19.t()
            double r5 = r5 * r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L11a
            java.lang.String r1 = "--==--ra: 激励再得ecpm下探期间不满足"
            com.bytedance.msdk.j.up.cw.j(r2, r1)
            r1 = 11
            return r1
        L11a:
            r1 = 0
            return r1
    }

    public void j() {
            r3 = this;
            java.lang.ref.SoftReference<android.content.Context> r0 = r3.j
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L2c
            com.bytedance.msdk.api.j.xt r1 = r3.xt
            r2 = 1
            r1.up(r2)
            com.bytedance.msdk.cw.r.vl r1 = new com.bytedance.msdk.cw.r.vl
            r1.<init>(r0)
            r3.j(r1)
            com.bytedance.msdk.api.j.xt r0 = r3.xt
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$5 r2 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$5
            r2.<init>(r3, r1)
            r1.j(r0, r2)
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$6 r0 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$6
            r0.<init>(r3)
            r1 = 500(0x1f4, double:2.47E-321)
            com.bytedance.msdk.j.up.m.xt(r0, r1)
        L2c:
            return
    }

    public void j(android.app.Activity r1, java.lang.Object r2, java.lang.String r3) {
            r0 = this;
            r0.up = r1
            r0.f2189m = r2
            r0.ae = r3
            return
    }

    public void j(com.bytedance.msdk.api.r.j.tl.j r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.cw = r1
        L4:
            return
    }

    public void j(com.bytedance.msdk.core.admanager.reward.rewardagain.j r9, com.bytedance.msdk.xt.cw r10) {
            r8 = this;
            android.app.Activity r0 = r8.up
            if (r0 == 0) goto La9
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto La9
            android.app.Activity r0 = r8.up
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto La9
            android.app.Dialog r0 = new android.app.Dialog
            android.app.Activity r1 = r8.up
            r0.<init>(r1)
            android.app.Activity r1 = r8.up
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.bytedance.gromore.R.layout.reward_again_dialog
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            int r2 = com.bytedance.gromore.R.id.ra_pic
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r3 = com.bytedance.gromore.R.id.ra_title
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = com.bytedance.gromore.R.id.ra_btn_ok
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r5 = com.bytedance.gromore.R.id.ra_btn_cancel
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.util.Map<java.lang.String, com.bytedance.msdk.core.admanager.reward.rewardagain.xt> r6 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.oq
            java.lang.String r7 = r9.r()
            java.lang.Object r6 = r6.get(r7)
            com.bytedance.msdk.core.admanager.reward.rewardagain.xt r6 = (com.bytedance.msdk.core.admanager.reward.rewardagain.xt) r6
            if (r6 == 0) goto L8b
            java.lang.String r7 = r6.xt()
            r3.setText(r7)
            java.lang.String r3 = r6.r()
            r4.setText(r3)
            java.lang.String r3 = r6.up()
            r5.setText(r3)
            java.lang.String r3 = r6.cw()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L8b
            com.bytedance.msdk.j.up.xt r3 = new com.bytedance.msdk.j.up.xt
            r3.<init>(r2)
            java.lang.String r2 = r6.cw()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r3.j(r2)
        L8b:
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$1 r2 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$1
            r2.<init>(r8, r9, r10, r0)
            r4.setOnClickListener(r2)
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw$2 r9 = new com.bytedance.msdk.core.admanager.reward.rewardagain.cw$2
            r9.<init>(r8, r0)
            r5.setOnClickListener(r9)
            r0.setContentView(r1)
            r9 = 0
            r0.setCanceledOnTouchOutside(r9)
            r0.setCancelable(r9)
            r0.show()
            return
        La9:
            java.lang.String r0 = "TTMediationSDK"
            java.lang.String r1 = "--==-- reward again show activity dialog"
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            r8.xt(r9, r10)
            return
    }

    public void xt() {
            r1 = this;
            r0 = 1
            r1.g = r0
            return
    }

    public void xt(com.bytedance.msdk.api.r.j.tl.j r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.f2190r = r1
        L4:
            return
    }
}
