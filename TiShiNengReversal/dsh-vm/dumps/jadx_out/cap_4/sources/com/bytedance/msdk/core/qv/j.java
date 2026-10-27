package com.bytedance.msdk.core.qv;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static volatile com.bytedance.msdk.core.qv.j j;
    private boolean cw;

    /* renamed from: m, reason: collision with root package name */
    private java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> f2248m;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.msdk.core.qv.xt f2249r;
    private boolean up;
    private boolean xt;

    static {
            return
    }

    private j() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.xt = r0
            r1.cw = r0
            r1.up = r0
            return
    }

    public static com.bytedance.msdk.core.qv.j j() {
            com.bytedance.msdk.core.qv.j r0 = com.bytedance.msdk.core.qv.j.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.qv.j> r0 = com.bytedance.msdk.core.qv.j.class
            monitor-enter(r0)
            com.bytedance.msdk.core.qv.j r1 = com.bytedance.msdk.core.qv.j.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.qv.j r1 = new com.bytedance.msdk.core.qv.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.qv.j.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.core.qv.j r0 = com.bytedance.msdk.core.qv.j.j
            return r0
    }

    public java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> ae() {
            r1 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r1.f2248m
            return r0
    }

    public java.lang.String cw(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9
            r1.<init>(r3)     // Catch: org.json.JSONException -> L9
            goto Lb
        L9:
        La:
            r1 = r0
        Lb:
            org.json.JSONObject r3 = r2.xt(r1)
            if (r3 == 0) goto L16
            java.lang.String r3 = r3.toString()
            return r3
        L16:
            return r0
    }

    public boolean cw() {
            r1 = this;
            boolean r0 = r1.xt
            return r0
    }

    public org.json.JSONObject j(org.json.JSONObject r5) {
            r4 = this;
            com.bytedance.sdk.openadsdk.core.oq r0 = com.bytedance.sdk.openadsdk.core.oq.i()
            java.lang.String r0 = r0.ff()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lf
            return r5
        Lf:
            java.lang.String r1 = "app_ab_version"
            if (r5 != 0) goto L1e
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L1c
            return r5
        L1c:
            r5 = 0
            return r5
        L1e:
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L4a
            java.lang.String r2 = r5.optString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L32
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L4d
            return r5
        L32:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L4d
            r3.<init>()     // Catch: org.json.JSONException -> L4d
            r3.append(r2)     // Catch: org.json.JSONException -> L4d
            java.lang.String r2 = ","
            r3.append(r2)     // Catch: org.json.JSONException -> L4d
            r3.append(r0)     // Catch: org.json.JSONException -> L4d
            java.lang.String r0 = r3.toString()     // Catch: org.json.JSONException -> L4d
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L4d
            return r5
        L4a:
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L4d
        L4d:
            return r5
    }

    public void j(int r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.core.qv.xt r0 = r1.f2249r
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    public void j(com.bytedance.msdk.core.qv.xt r1) {
            r0 = this;
            r0.f2249r = r1
            return
    }

    public void j(java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1) {
            r0 = this;
            r0.f2248m = r1
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public boolean j(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r0 = "200000000"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L12
            r2 = 1
            return r2
        L12:
            java.lang.String r0 = "^1[0-9]{8}$"
            boolean r2 = r2.matches(r0)
            return r2
    }

    public boolean j(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            r0 = 1
            if (r5 == 0) goto L4
            return r0
        L4:
            boolean r5 = r2.j(r3)
            if (r5 == 0) goto Lb
            return r0
        Lb:
            com.bytedance.msdk.core.ws.cw r5 = com.bytedance.msdk.core.xt.xt()
            r1 = 101(0x65, float:1.42E-43)
            com.bytedance.msdk.core.oq.xt r3 = r5.j(r3, r4, r1)
            if (r3 == 0) goto L18
            return r0
        L18:
            r3 = 0
            return r3
    }

    public void m() {
            r1 = this;
            r0 = 1
            r1.up = r0
            return
    }

    public boolean r() {
            r1 = this;
            boolean r0 = r1.cw
            return r0
    }

    public void up() {
            r1 = this;
            com.bytedance.msdk.core.qv.xt r0 = r1.f2249r
            if (r0 == 0) goto L7
            r0.j()
        L7:
            return
    }

    public java.lang.String xt(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9
            r1.<init>(r3)     // Catch: org.json.JSONException -> L9
            goto Lb
        L9:
        La:
            r1 = r0
        Lb:
            org.json.JSONObject r3 = r2.j(r1)
            if (r3 == 0) goto L16
            java.lang.String r3 = r3.toString()
            return r3
        L16:
            return r0
    }

    public org.json.JSONObject xt(org.json.JSONObject r5) {
            r4 = this;
            com.bytedance.sdk.openadsdk.core.oq r0 = com.bytedance.sdk.openadsdk.core.oq.i()
            java.lang.String r0 = r0.ff()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lf
            return r5
        Lf:
            java.lang.String r1 = "waterfall_ab_version"
            if (r5 != 0) goto L1e
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L1c
            return r5
        L1c:
            r5 = 0
            return r5
        L1e:
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L4a
            java.lang.String r2 = r5.optString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L32
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L4d
            return r5
        L32:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L4d
            r3.<init>()     // Catch: org.json.JSONException -> L4d
            r3.append(r2)     // Catch: org.json.JSONException -> L4d
            java.lang.String r2 = ","
            r3.append(r2)     // Catch: org.json.JSONException -> L4d
            r3.append(r0)     // Catch: org.json.JSONException -> L4d
            java.lang.String r0 = r3.toString()     // Catch: org.json.JSONException -> L4d
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L4d
            return r5
        L4a:
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L4d
        L4d:
            return r5
    }

    public void xt() {
            r1 = this;
            r0 = 1
            r1.xt = r0
            return
    }
}
