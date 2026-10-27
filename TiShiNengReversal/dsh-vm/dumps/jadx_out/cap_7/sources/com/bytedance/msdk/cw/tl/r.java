package com.bytedance.msdk.cw.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r {
    public static java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.oq.up>> j;
    public static java.util.Map<java.lang.String, java.lang.String> xt;



    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.cw.tl.r.j = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.cw.tl.r.xt = r0
            return
    }

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void cw() {
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.cw()
            java.lang.String r1 = "mediation_adn_map"
            java.lang.String r0 = r0.xt(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L11
            goto L3e
        L11:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r1.<init>(r0)     // Catch: org.json.JSONException -> L3f
            java.util.Iterator r0 = r1.keys()     // Catch: org.json.JSONException -> L3f
            if (r0 == 0) goto L3e
        L1c:
            boolean r2 = r0.hasNext()     // Catch: org.json.JSONException -> L3f
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L3f
            java.lang.String r3 = r1.getString(r2)     // Catch: org.json.JSONException -> L3f
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L3f
            if (r4 != 0) goto L1c
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L3f
            if (r4 != 0) goto L1c
            java.util.Map<java.lang.String, java.lang.String> r4 = com.bytedance.msdk.cw.tl.r.xt     // Catch: org.json.JSONException -> L3f
            r4.put(r2, r3)     // Catch: org.json.JSONException -> L3f
            goto L1c
        L3e:
            return
        L3f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public static com.bykv.vk.openvk.api.proto.PluginValueSet j(java.lang.String r13, com.bytedance.sdk.openadsdk.i.cw.cw.xt.j r14, int r15) {
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto Lf
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r13 = r14.j()
            com.bykv.vk.openvk.api.proto.PluginValueSet r13 = com.bytedance.sdk.openadsdk.mediation.xt.xt.j.j(r13)
            return r13
        Lf:
            com.bytedance.msdk.core.qv.j r0 = com.bytedance.msdk.core.qv.j.j()
            boolean r0 = r0.j(r13)
            if (r0 == 0) goto L22
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r13 = r14.j()
            com.bykv.vk.openvk.api.proto.PluginValueSet r13 = com.bytedance.sdk.openadsdk.mediation.xt.xt.j.j(r13)
            return r13
        L22:
            java.lang.String r0 = j(r13)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4a
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = xt(r13)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L47
            r8 = 2
        L42:
            r11 = r13
            r7 = r15
            r12 = r4
        L45:
            r9 = r5
            goto L51
        L47:
            r0 = 3
            r8 = 3
            goto L42
        L4a:
            r5 = 0
            r8 = 1
            r11 = r13
            r7 = r15
            r12 = r0
            goto L45
        L51:
            com.bytedance.msdk.up.m.j(r7, r8, r9, r11, r12)
            r0 = r8
            r4 = r12
            boolean r13 = android.text.TextUtils.isEmpty(r4)
            if (r13 == 0) goto L65
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r13 = r14.j()
            com.bykv.vk.openvk.api.proto.PluginValueSet r13 = com.bytedance.sdk.openadsdk.mediation.xt.xt.j.j(r13)
            return r13
        L65:
            r14.r(r4)
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r13 = r14.j()
            if (r0 != r2) goto L6f
            goto L70
        L6f:
            r3 = 0
        L70:
            com.bykv.vk.openvk.api.proto.PluginValueSet r13 = com.bytedance.sdk.openadsdk.mediation.xt.xt.j.j(r13, r11, r3)
            return r13
    }

    private static java.lang.String j(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.oq.up>> r0 = com.bytedance.msdk.cw.tl.r.j
            int r0 = r0.size()
            if (r0 != 0) goto L13
            xt()
        L13:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.oq.up>> r0 = com.bytedance.msdk.cw.tl.r.j
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.oq.up>> r3 = com.bytedance.msdk.cw.tl.r.j
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L1d
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1d
            java.lang.Object r4 = r3.next()
            com.bytedance.msdk.core.oq.up r4 = (com.bytedance.msdk.core.oq.up) r4
            java.lang.String r4 = r4.j()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L37
            return r2
        L4e:
            return r1
    }

    public static void j() {
            java.util.Map<java.lang.String, java.lang.String> r0 = com.bytedance.msdk.cw.tl.r.xt
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = com.bytedance.msdk.cw.tl.r.xt
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            if (r3 == 0) goto L18
            java.lang.Object r3 = r2.getValue()
            if (r3 == 0) goto L18
            java.lang.Object r3 = r2.getKey()     // Catch: org.json.JSONException -> L3e
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L3e
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> L3e
            r0.put(r3, r2)     // Catch: org.json.JSONException -> L3e
            goto L18
        L3e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L45:
            com.bytedance.msdk.cw.tl.r$2 r1 = new com.bytedance.msdk.cw.tl.r$2
            r1.<init>(r0)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void j(org.json.JSONObject r15) {
            if (r15 != 0) goto L3
            return
        L3:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.oq.up>> r0 = com.bytedance.msdk.cw.tl.r.j
            r0.clear()
            java.util.Iterator r0 = r15.keys()     // Catch: java.lang.Throwable -> L64
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L64
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L64
            if (r2 != 0) goto Lc
            org.json.JSONArray r2 = r15.optJSONArray(r1)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto Lc
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Throwable -> L64
            r3.<init>()     // Catch: java.lang.Throwable -> L64
            r4 = 0
        L2a:
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L64
            if (r4 >= r5) goto L5e
            org.json.JSONObject r5 = r2.getJSONObject(r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "price"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = "csj_code_id"
            long r7 = r5.optLong(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.Double r5 = java.lang.Double.valueOf(r6)     // Catch: java.lang.Throwable -> L4a
            double r5 = r5.doubleValue()     // Catch: java.lang.Throwable -> L4a
        L48:
            r11 = r5
            goto L4d
        L4a:
            r5 = 0
            goto L48
        L4d:
            com.bytedance.msdk.core.oq.up r9 = new com.bytedance.msdk.core.oq.up     // Catch: java.lang.Throwable -> L64
            java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L64
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r13, r14)     // Catch: java.lang.Throwable -> L64
            r3.add(r9)     // Catch: java.lang.Throwable -> L64
            int r4 = r4 + 1
            goto L2a
        L5e:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.oq.up>> r2 = com.bytedance.msdk.cw.tl.r.j     // Catch: java.lang.Throwable -> L64
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L64
            goto Lc
        L64:
            com.bytedance.msdk.cw.tl.r$1 r0 = new com.bytedance.msdk.cw.tl.r$1
            r0.<init>(r15)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static boolean j(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 1
            if (r0 != 0) goto L35
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Le
            goto L35
        Le:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.oq.up>> r0 = com.bytedance.msdk.cw.tl.r.j
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L35
            int r0 = r2.size()
            if (r0 != 0) goto L1f
            goto L35
        L1f:
            com.bytedance.msdk.tl.la.j(r2)
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.msdk.core.oq.up r2 = (com.bytedance.msdk.core.oq.up) r2
            java.lang.String r2 = r2.j()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
            return r1
        L34:
            return r0
        L35:
            return r1
    }

    private static java.lang.String xt(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.Map<java.lang.String, java.lang.String> r0 = com.bytedance.msdk.cw.tl.r.xt
            int r0 = r0.size()
            if (r0 != 0) goto L13
            cw()
        L13:
            java.util.Map<java.lang.String, java.lang.String> r0 = com.bytedance.msdk.cw.tl.r.xt
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    private static void xt() {
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.cw()
            java.lang.String r1 = "mediation_csj_map"
            java.lang.String r0 = r0.xt(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L11
            goto L83
        L11:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L84
            r1.<init>(r0)     // Catch: org.json.JSONException -> L84
            java.util.Iterator r0 = r1.keys()     // Catch: org.json.JSONException -> L84
            if (r0 == 0) goto L83
        L1c:
            boolean r2 = r0.hasNext()     // Catch: org.json.JSONException -> L84
            if (r2 == 0) goto L83
            java.lang.Object r2 = r0.next()     // Catch: org.json.JSONException -> L84
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L84
            org.json.JSONArray r3 = r1.getJSONArray(r2)     // Catch: org.json.JSONException -> L84
            int r4 = r3.length()     // Catch: org.json.JSONException -> L84
            if (r4 <= 0) goto L1c
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList     // Catch: org.json.JSONException -> L84
            r4.<init>()     // Catch: org.json.JSONException -> L84
            r5 = 0
        L38:
            int r6 = r3.length()     // Catch: org.json.JSONException -> L84
            if (r5 >= r6) goto L7d
            org.json.JSONObject r6 = r3.optJSONObject(r5)     // Catch: org.json.JSONException -> L84
            java.lang.String r7 = "csj_code_id"
            java.lang.String r7 = r6.optString(r7)     // Catch: org.json.JSONException -> L84
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L84
            if (r8 == 0) goto L54
            java.lang.String r7 = "csj_rit_id"
            java.lang.String r7 = r6.optString(r7)     // Catch: org.json.JSONException -> L84
        L54:
            java.lang.String r8 = "price"
            double r8 = r6.optDouble(r8)     // Catch: org.json.JSONException -> L84
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L66
            java.lang.String r8 = "ecpm"
            double r8 = r6.optDouble(r8)     // Catch: org.json.JSONException -> L84
        L66:
            java.lang.String r10 = "load_sort"
            int r10 = r6.optInt(r10)     // Catch: org.json.JSONException -> L84
            java.lang.String r11 = "show_sort"
            int r11 = r6.optInt(r11)     // Catch: org.json.JSONException -> L84
            com.bytedance.msdk.core.oq.up r6 = new com.bytedance.msdk.core.oq.up     // Catch: org.json.JSONException -> L84
            r6.<init>(r7, r8, r10, r11)     // Catch: org.json.JSONException -> L84
            r4.add(r6)     // Catch: org.json.JSONException -> L84
            int r5 = r5 + 1
            goto L38
        L7d:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.oq.up>> r3 = com.bytedance.msdk.cw.tl.r.j     // Catch: org.json.JSONException -> L84
            r3.put(r2, r4)     // Catch: org.json.JSONException -> L84
            goto L1c
        L83:
            return
        L84:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
