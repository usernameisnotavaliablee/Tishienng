package com.bytedance.msdk.core.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private final java.util.Map<java.lang.String, java.lang.Float> cw;
    private final java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.bytedance.msdk.core.xt.up> f2304m;

    /* renamed from: r, reason: collision with root package name */
    private final java.lang.String f2305r;
    private java.lang.String[] up;
    private final java.lang.String xt;

    public r(java.lang.String r6, java.lang.String r7, @androidx.annotation.NonNull org.json.JSONObject r8) {
            r5 = this;
            r5.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.cw = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.f2304m = r0
            r5.j = r6
            r5.xt = r7
            java.lang.String r6 = "symbol"
            java.lang.String r6 = r8.optString(r6)
            r5.f2305r = r6
            java.lang.String r6 = "score_fit_type"
            org.json.JSONArray r6 = r8.optJSONArray(r6)
            if (r6 == 0) goto L7d
            int r7 = r6.length()
            if (r7 <= 0) goto L7d
            int r7 = r6.length()
            java.lang.String[] r7 = new java.lang.String[r7]
            r5.up = r7
            r7 = 0
        L34:
            int r0 = r6.length()
            if (r7 >= r0) goto L7d
            java.lang.String r0 = r6.optString(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L7a
            java.lang.String[] r1 = r5.up
            r1[r7] = r0
            org.json.JSONObject r1 = r8.optJSONObject(r0)
            if (r1 == 0) goto L7a
            int r2 = r1.length()
            if (r2 <= 0) goto L7a
            java.lang.String r2 = "range"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            java.lang.String r3 = "value"
            org.json.JSONArray r1 = r1.optJSONArray(r3)
            if (r2 == 0) goto L7a
            int r3 = r2.length()
            if (r3 <= 0) goto L7a
            if (r1 == 0) goto L7a
            int r3 = r1.length()
            if (r3 <= 0) goto L7a
            java.util.Map<java.lang.String, com.bytedance.msdk.core.xt.up> r3 = r5.f2304m
            com.bytedance.msdk.core.xt.up r4 = new com.bytedance.msdk.core.xt.up
            r4.<init>(r0, r2, r1)
            r3.put(r0, r4)
        L7a:
            int r7 = r7 + 1
            goto L34
        L7d:
            java.lang.String r6 = "rule_exc_mode"
            org.json.JSONObject r6 = r8.optJSONObject(r6)
            if (r6 == 0) goto Lac
            int r7 = r6.length()
            if (r7 <= 0) goto Lac
            java.util.Iterator r7 = r6.keys()
        L8f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lac
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, java.lang.Float> r0 = r5.cw
            r1 = 0
            double r1 = r6.optDouble(r8, r1)
            float r1 = (float) r1
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.put(r8, r1)
            goto L8f
        Lac:
            return
    }

    public java.lang.String[] cw() {
            r1 = this;
            java.lang.String[] r0 = r1.up
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.f2305r
            return r0
    }

    public java.util.Map<java.lang.String, com.bytedance.msdk.core.xt.up> up() {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.xt.up> r0 = r1.f2304m
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Float> xt() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r1.cw
            return r0
    }
}
