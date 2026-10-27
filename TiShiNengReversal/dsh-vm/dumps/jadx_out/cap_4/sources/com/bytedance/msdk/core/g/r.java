package com.bytedance.msdk.core.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    public static final java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> j = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.core.g.r.j = r0
            return
    }

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int j(java.lang.String r7, int r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L85
            r0 = 1
            if (r8 == r0) goto Lc
            goto L85
        Lc:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.oq.r r0 = r0.up(r7)
            if (r0 == 0) goto L85
            int r2 = r0.cw()
            java.lang.String r3 = r0.r()
            if (r2 <= 0) goto L85
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L27
            goto L85
        L27:
            com.bytedance.msdk.core.g.xt r3 = com.bytedance.msdk.core.g.xt.r()
            r4 = 3
            double r2 = r3.j(r4, r7, r2)
            com.bytedance.msdk.core.ws.cw r7 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.util.List r7 = r7.m(r8)
            if (r7 == 0) goto L7a
            int r8 = r7.size()
            if (r8 <= 0) goto L7a
            java.util.Iterator r7 = r7.iterator()
        L48:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r7.next()
            com.bytedance.msdk.core.oq.cw r8 = (com.bytedance.msdk.core.oq.cw) r8
            double r4 = r8.m()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L48
            double r4 = r8.up()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L48
            int r7 = r8.cw()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r7 = r0.j(r7)
            java.lang.String r8 = "refresh_time"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r9.put(r8, r0)
            goto L7b
        L7a:
            r7 = 0
        L7b:
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r7 < r8) goto L85
            r8 = 180000(0x2bf20, float:2.52234E-40)
            if (r7 > r8) goto L85
            return r7
        L85:
            return r1
    }

    public static com.bytedance.msdk.core.oq.xt j(com.bytedance.msdk.core.oq.xt r8, int r9) {
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            if (r8 == 0) goto Lc6
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()
            boolean r3 = r3.hl()
            if (r3 != 0) goto L13
            goto Lc6
        L13:
            r3 = 101(0x65, float:1.42E-43)
            if (r9 != r3) goto L24
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> r9 = com.bytedance.msdk.core.g.r.j
            java.lang.String r8 = r8.rn()
            java.lang.Object r8 = r9.get(r8)
            com.bytedance.msdk.core.oq.xt r8 = (com.bytedance.msdk.core.oq.xt) r8
            return r8
        L24:
            r3 = 100
            if (r9 != r3) goto Lc6
            int r9 = r8.m()
            r3 = 2
            if (r9 == r3) goto L3d
            int r9 = r8.m()
            r3 = 3
            if (r9 == r3) goto L3d
            int r9 = r8.m()
            r3 = 4
            if (r9 != r3) goto Lc6
        L3d:
            java.lang.String r9 = r8.rn()
            java.util.List r9 = com.bytedance.msdk.core.g.cw.j(r8, r9)
            java.util.Map r2 = r8.up()
            java.lang.String r3 = "rule_in_use"
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L58
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L59
        L58:
            r2 = -1
        L59:
            java.util.Map r3 = r8.up()
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "cost_time"
            r3.put(r5, r4)
            if (r9 == 0) goto Lc5
            if (r2 != 0) goto L70
            goto Lc5
        L70:
            com.bytedance.msdk.core.oq.xt r2 = r8.av()
            boolean r3 = r2.qv()
            if (r3 == 0) goto L7e
            r2.xt(r9)
            goto L81
        L7e:
            r2.j(r9)
        L81:
            java.util.Map r9 = r2.up()
            java.lang.String r3 = "max_ecpm"
            java.lang.Object r9 = r9.get(r3)
            java.util.Map r3 = r2.up()
            java.lang.String r4 = "min_ecpm"
            java.lang.Object r3 = r3.get(r4)
            if (r9 == 0) goto La0
            java.lang.Double r9 = (java.lang.Double) r9
            double r6 = r9.doubleValue()
            r2.r(r6)
        La0:
            if (r3 == 0) goto Lab
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r2.up(r3)
        Lab:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> r9 = com.bytedance.msdk.core.g.r.j
            java.lang.String r8 = r8.rn()
            r9.put(r8, r2)
            java.util.Map r8 = r2.up()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r8.put(r5, r9)
            return r2
        Lc5:
            return r8
        Lc6:
            return r2
    }

    public static void j(int r3, java.lang.String r4, int r5, double r6) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Lb
            goto L5c
        Lb:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            r1 = 101(0x65, float:1.42E-43)
            com.bytedance.msdk.core.oq.xt r0 = r0.j(r4, r5, r1)
            if (r0 == 0) goto L5c
            int r1 = r0.m()
            r2 = 1
            if (r1 != r2) goto L28
            if (r3 != r2) goto L28
            com.bytedance.msdk.core.g.up r3 = com.bytedance.msdk.core.g.up.r()
            r3.j(r5, r6)
            return
        L28:
            int r5 = r0.m()
            r0 = 2
            if (r5 != r0) goto L5c
            com.bytedance.msdk.core.ws.cw r5 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.oq.r r5 = r5.up(r4)
            if (r5 == 0) goto L5c
            if (r3 != r0) goto L49
            int r1 = r5.cw()
            if (r1 != r0) goto L49
            com.bytedance.msdk.core.g.xt r3 = com.bytedance.msdk.core.g.xt.r()
            r3.j(r4, r0, r6)
            return
        L49:
            if (r3 != r2) goto L5c
            int r3 = r5.cw()
            if (r3 == r0) goto L5c
            com.bytedance.msdk.core.g.xt r3 = com.bytedance.msdk.core.g.xt.r()
            int r5 = r5.cw()
            r3.j(r4, r5, r6)
        L5c:
            return
    }

    public static void j(int r1, java.lang.String r2, org.json.JSONObject r3) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Lb
            goto L26
        Lb:
            r0 = 2
            if (r1 != r0) goto L26
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.oq.r r1 = r1.up(r2)
            if (r1 == 0) goto L26
            java.lang.String r2 = "dynamic_rule_id"
            java.lang.String r1 = r1.r()     // Catch: org.json.JSONException -> L22
            r3.putOpt(r2, r1)     // Catch: org.json.JSONException -> L22
            return
        L22:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L26:
            return
    }

    public static void j(int r2, java.util.List<com.bytedance.msdk.core.oq.oq> r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            if (r3 == 0) goto L35
            int r2 = r3.size()
            if (r2 != 0) goto L9
            goto L35
        L9:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r3.next()
            com.bytedance.msdk.core.oq.oq r0 = (com.bytedance.msdk.core.oq.oq) r0
            if (r0 == 0) goto L12
            int r1 = r0.mi()
            if (r1 != 0) goto L12
            java.lang.String r0 = r0.w()
            r2.put(r0)
            goto L12
        L2e:
            if (r4 == 0) goto L35
            java.lang.String r3 = "rit_ids"
            r4.put(r3, r2)
        L35:
            return
    }

    public static void j(com.bytedance.msdk.core.oq.xt r6, double r7, java.lang.String r9, int r10) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 == 0) goto L38
            if (r6 != 0) goto Ld
            goto L38
        Ld:
            int r0 = r6.m()
            r1 = 2
            if (r0 != r1) goto L18
            j(r1, r9, r10, r7)
            return
        L18:
            int r9 = r6.m()
            r10 = 3
            if (r9 == r10) goto L26
            int r9 = r6.m()
            r10 = 4
            if (r9 != r10) goto L38
        L26:
            com.bytedance.msdk.core.g.xt r0 = com.bytedance.msdk.core.g.xt.r()
            java.lang.String r1 = r6.rn()
            java.lang.String r2 = "_last_load_cpm_"
            java.lang.String r3 = r6.la()
            r4 = r7
            r0.j(r1, r2, r3, r4)
        L38:
            return
    }

    public static void j(java.lang.String r2, java.lang.String r3, int r4, org.json.JSONObject r5) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Lc
            goto L83
        Lc:
            com.bytedance.msdk.ae.j.cw r0 = com.bytedance.msdk.ae.j.cw.j()
            r1 = 101(0x65, float:1.42E-43)
            com.bytedance.msdk.core.oq.xt r2 = r0.j(r2, r4, r1)
            if (r2 == 0) goto L83
            java.lang.String r0 = "mediation_request"
            boolean r0 = r0.equals(r3)
            r1 = 2
            if (r0 == 0) goto L4e
            int r3 = r2.m()
            r0 = 1
            if (r3 != r0) goto L38
            com.bytedance.msdk.core.g.up r3 = com.bytedance.msdk.core.g.up.r()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.util.Map r2 = r2.up()
            r3.j(r4, r5, r2)
            return
        L38:
            int r3 = r2.m()
            if (r3 != r1) goto L83
            com.bytedance.msdk.core.g.xt r3 = com.bytedance.msdk.core.g.xt.r()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.util.Map r2 = r2.up()
            r3.j(r4, r5, r2)
            return
        L4e:
            int r0 = r2.m()
            if (r0 != r1) goto L83
            java.lang.String r0 = "sdk_init"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L83
            java.lang.String r0 = "sdk_init_end"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L83
            java.lang.String r0 = "get_config_start"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L83
            java.lang.String r0 = "get_config_final"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L83
            com.bytedance.msdk.core.g.xt r3 = com.bytedance.msdk.core.g.xt.r()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.util.Map r2 = r2.up()
            r3.cw(r4, r5, r2)
        L83:
            return
    }

    public static void j(java.util.List<com.bytedance.msdk.xt.cw> r4, com.bytedance.msdk.core.oq.xt r5) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 == 0) goto L5b
            if (r4 == 0) goto L5b
            if (r5 != 0) goto Lf
            goto L5b
        Lf:
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r4.next()
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
            if (r0 == 0) goto L13
            int r1 = r5.m()
            r2 = 1
            java.lang.String r3 = "gm_usb"
            if (r1 != r2) goto L3a
            java.util.Map r0 = r0.p()
            int r1 = r5.wq()
            java.lang.String r1 = com.bytedance.msdk.core.g.up.cw(r1)
            r0.put(r3, r1)
            goto L13
        L3a:
            int r1 = r5.m()
            r2 = 2
            if (r1 != r2) goto L13
            java.util.Map r1 = r5.up()
            java.lang.String r2 = "user_label_value"
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L13
            com.bytedance.msdk.core.oq.cw r1 = (com.bytedance.msdk.core.oq.cw) r1
            java.util.Map r0 = r0.p()
            java.lang.String r1 = r1.j()
            r0.put(r3, r1)
            goto L13
        L5b:
            return
    }

    public static void j(boolean r1, com.bytedance.msdk.up.r r2, org.json.JSONObject r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            if (r2 == 0) goto L14
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            com.bytedance.msdk.core.g.up r0 = com.bytedance.msdk.core.g.up.r()
            r0.j(r1, r2, r3, r4)
        L14:
            return
    }
}
