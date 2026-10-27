package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ws {
    public ws() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.msdk.api.cw j(com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.xt.cw r4, boolean r5) {
            r0 = 0
            if (r4 == 0) goto L111
            if (r3 != 0) goto L7
            goto L111
        L7:
            com.bytedance.msdk.api.cw r1 = new com.bytedance.msdk.api.cw
            r1.<init>()
            int r2 = r4.pz()
            r1.j(r2)
            java.lang.String r2 = r4.ff()
            r1.tl(r2)
            java.lang.String r2 = r4.ry()
            r1.g(r2)
            java.lang.String r2 = r4.qa()
            r1.oq(r2)
            java.lang.String r2 = r4.q()
            r1.vl(r2)
            java.lang.String r2 = "-3"
            if (r5 == 0) goto L57
            boolean r5 = j()
            if (r5 != 0) goto L4f
            boolean r5 = r4.qo()
            if (r5 != 0) goto L4b
            boolean r5 = r4.oy()
            if (r5 != 0) goto L4b
            boolean r5 = r4.yl()
            if (r5 == 0) goto L4f
        L4b:
            r1.qv(r2)
            goto L6e
        L4f:
            java.lang.String r5 = r4.u()
            r1.qv(r5)
            goto L6e
        L57:
            boolean r5 = xt()
            if (r5 != 0) goto L67
            boolean r5 = r4.qo()
            if (r5 == 0) goto L67
            r1.qv(r2)
            goto L6e
        L67:
            java.lang.String r5 = r4.wo()
            r1.qv(r5)
        L6e:
            java.lang.String r5 = r4.o()
            r1.ws(r5)
            int r5 = r4.xw()
            r1.xt(r5)
            java.lang.String r5 = r4.e()
            r1.jy(r5)
            java.lang.String r5 = j(r3)
            r1.j(r5)
            java.lang.String r4 = j(r4)
            r1.xt(r4)
            java.lang.String r4 = r3.x()
            r1.ae(r4)
            java.lang.String r4 = r3.e()
            java.lang.String r4 = j(r4)
            r1.m(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r3.q()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.cw(r4)
            com.bytedance.msdk.core.j r4 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.m r4 = r4.l()
            if (r4 == 0) goto Lc5
            java.lang.String r5 = r4.cw()
            goto Lc6
        Lc5:
            r5 = r0
        Lc6:
            r1.r(r5)
            if (r4 == 0) goto Ld0
            java.lang.String r4 = r4.r()
            goto Ld1
        Ld0:
            r4 = r0
        Ld1:
            r1.up(r4)
            java.util.Map r3 = r3.c()
            if (r3 == 0) goto L110
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L110
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Led:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L10d
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getValue()
            java.lang.Object r5 = r5.getKey()
            if (r2 != 0) goto L105
            r2 = r0
            goto L109
        L105:
            java.lang.String r2 = r2.toString()
        L109:
            r4.put(r5, r2)
            goto Led
        L10d:
            r1.j(r4)
        L110:
            return r1
        L111:
            return r0
    }

    public static com.bytedance.msdk.api.j j(com.bytedance.msdk.api.j.xt r4, com.bytedance.msdk.api.j r5, java.util.List<com.bytedance.msdk.api.xt> r6) {
            if (r5 == 0) goto L84
            if (r4 != 0) goto L6
            goto L84
        L6:
            if (r6 == 0) goto L84
            int r0 = r6.size()
            if (r0 != 0) goto L10
            goto L84
        L10:
            java.util.Map r4 = r4.c()
            boolean r4 = j(r4)
            if (r4 != 0) goto L1b
            goto L84
        L1b:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.Iterator r6 = r6.iterator()
        L24:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r6.next()
            com.bytedance.msdk.api.xt r0 = (com.bytedance.msdk.api.xt) r0
            if (r0 == 0) goto L24
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "adn_name"
            java.lang.String r3 = r0.cw()     // Catch: org.json.JSONException -> L77
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L77
            if (r3 == 0) goto L48
            java.lang.String r3 = r0.r()     // Catch: org.json.JSONException -> L77
            goto L4c
        L48:
            java.lang.String r3 = r0.cw()     // Catch: org.json.JSONException -> L77
        L4c:
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L77
            java.lang.String r2 = "mediation_rit"
            java.lang.String r3 = r0.xt()     // Catch: org.json.JSONException -> L77
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L77
            java.lang.String r2 = "ad_type"
            java.lang.String r3 = r0.j()     // Catch: org.json.JSONException -> L77
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L77
            java.lang.String r2 = "error_code"
            int r3 = r0.up()     // Catch: org.json.JSONException -> L77
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L77
            java.lang.String r2 = "error_msg"
            java.lang.String r0 = r0.m()     // Catch: org.json.JSONException -> L77
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L77
            r4.put(r1)
            goto L24
        L77:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L7e:
            java.lang.String r4 = r4.toString()
            r5.xt = r4
        L84:
            return r5
    }

    private static java.lang.String j(com.bytedance.msdk.api.j.xt r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            int r1 = r1.f()
            switch(r1) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto Lb;
                case 5: goto L18;
                case 6: goto Lb;
                case 7: goto L15;
                case 8: goto L12;
                case 9: goto Lf;
                case 10: goto Lc;
                default: goto Lb;
            }
        Lb:
            return r0
        Lc:
            java.lang.String r1 = "interstitialFull"
            return r1
        Lf:
            java.lang.String r1 = "draw"
            return r1
        L12:
            java.lang.String r1 = "fullVideo"
            return r1
        L15:
            java.lang.String r1 = "rewardVideo"
            return r1
        L18:
            java.lang.String r1 = "feed"
            return r1
        L1b:
            java.lang.String r1 = "splash"
            return r1
        L1e:
            java.lang.String r1 = "interstitial"
            return r1
        L21:
            java.lang.String r1 = "banner"
            return r1
    }

    private static java.lang.String j(com.bytedance.msdk.xt.cw r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.rh()
            java.lang.String r2 = "banner"
            java.lang.String r3 = "feed"
            java.lang.String r4 = "rewardVideo"
            switch(r1) {
                case 1: goto L2b;
                case 2: goto L28;
                case 3: goto L27;
                case 4: goto L26;
                case 5: goto L23;
                case 6: goto L22;
                case 7: goto L28;
                default: goto L11;
            }
        L11:
            int r5 = r5.om()
            r1 = 1
            if (r5 == r1) goto L21
            r1 = 5
            if (r5 == r1) goto L20
            r1 = 7
            if (r5 == r1) goto L1f
            return r0
        L1f:
            return r4
        L20:
            return r3
        L21:
            return r2
        L22:
            return r4
        L23:
            java.lang.String r5 = "draw"
            return r5
        L26:
            return r3
        L27:
            return r2
        L28:
            java.lang.String r5 = "fullVideo"
            return r5
        L2b:
            java.lang.String r5 = "interstitial"
            return r5
    }

    private static java.lang.String j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L14
            r0.<init>(r2)     // Catch: org.json.JSONException -> L14
            java.lang.String r2 = "experiment_detail_id"
            java.lang.String r2 = r0.optString(r2)     // Catch: org.json.JSONException -> L14
            return r2
        L14:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return r1
    }

    private static boolean j() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.v()
            return r0
    }

    public static boolean j(java.util.List<com.bytedance.msdk.xt.cw> r7, java.util.List<com.bytedance.msdk.xt.cw> r8, java.util.List<com.bytedance.msdk.xt.cw> r9, com.bytedance.msdk.api.j.xt r10, boolean r11, java.lang.String r12, int r13, java.util.List<com.bytedance.msdk.core.oq.oq> r14) {
            int r0 = com.bytedance.msdk.cw.r.xt.xt(r12)
            com.bytedance.msdk.up.m.j(r7, r8, r9, r10, r0)
            r1 = 0
            if (r11 == 0) goto Lb
            return r1
        Lb:
            if (r0 == 0) goto Le
            return r1
        Le:
            int r11 = r7.size()
            java.lang.String r0 = "isReady-》广告类型："
            java.lang.String r2 = ",是否已准备好？isReady()："
            java.lang.String r3 = "TTMediationSDK"
            r4 = 1
            if (r11 <= 0) goto L69
            java.util.Iterator r7 = r7.iterator()
        L1f:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L69
            java.lang.Object r11 = r7.next()
            com.bytedance.msdk.xt.cw r11 = (com.bytedance.msdk.xt.cw) r11
            if (r11 == 0) goto L1f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r11.qa()
            java.lang.String r6 = com.bytedance.msdk.j.up.up.xt(r12, r6)
            r5.append(r6)
            r5.append(r0)
            int r6 = r11.pz()
            java.lang.String r6 = com.bytedance.msdk.xt.j.j(r6)
            r5.append(r6)
            r5.append(r2)
            boolean r6 = r11.wq(r12)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r5)
            boolean r5 = r11.wq(r12)
            if (r5 == 0) goto L1f
            boolean r11 = r11.qb()
            if (r11 != 0) goto L1f
            return r4
        L69:
            if (r9 == 0) goto Lbf
            int r7 = r9.size()
            if (r7 <= 0) goto Lbf
            java.util.Iterator r7 = r9.iterator()
        L75:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lbf
            java.lang.Object r9 = r7.next()
            com.bytedance.msdk.xt.cw r9 = (com.bytedance.msdk.xt.cw) r9
            if (r9 == 0) goto L75
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r5 = r9.qa()
            java.lang.String r5 = com.bytedance.msdk.j.up.up.xt(r12, r5)
            r11.append(r5)
            r11.append(r0)
            int r5 = r9.pz()
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r5)
            r11.append(r5)
            r11.append(r2)
            boolean r5 = r9.wq(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r11)
            boolean r11 = r9.wq(r12)
            if (r11 == 0) goto L75
            boolean r9 = r9.qb()
            if (r9 != 0) goto L75
            return r4
        Lbf:
            if (r8 == 0) goto L117
            int r7 = r8.size()
            if (r7 <= 0) goto L117
            java.util.Iterator r7 = r8.iterator()
        Lcb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L117
            java.lang.Object r8 = r7.next()
            com.bytedance.msdk.xt.cw r8 = (com.bytedance.msdk.xt.cw) r8
            if (r8 == 0) goto Lcb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r8.qa()
            java.lang.String r11 = com.bytedance.msdk.j.up.up.xt(r12, r11)
            r9.append(r11)
            java.lang.String r11 = "isReady--->biding-->广告类型："
            r9.append(r11)
            int r11 = r8.pz()
            java.lang.String r11 = com.bytedance.msdk.xt.j.j(r11)
            r9.append(r11)
            r9.append(r2)
            boolean r11 = r8.wq(r12)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r9)
            boolean r9 = r8.wq(r12)
            if (r9 == 0) goto Lcb
            boolean r8 = r8.qb()
            if (r8 != 0) goto Lcb
            return r4
        L117:
            if (r14 == 0) goto L14f
            int r7 = r14.size()
            if (r7 <= 0) goto L14f
            java.util.Iterator r7 = r14.iterator()
        L123:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L14f
            java.lang.Object r8 = r7.next()
            com.bytedance.msdk.core.oq.oq r8 = (com.bytedance.msdk.core.oq.oq) r8
            java.lang.String r9 = r8.w()
            boolean r8 = r8.kt()
            if (r8 == 0) goto L123
            com.bytedance.msdk.core.up.j.j r8 = com.bytedance.msdk.core.up.j.j.j()
            boolean r8 = r8.r(r12, r9, r13)
            if (r8 == 0) goto L123
            com.bytedance.msdk.core.up.j.j r8 = com.bytedance.msdk.core.up.j.j.j()
            int r8 = r8.j(r9, r10, r1)
            r9 = 3
            if (r8 != r9) goto L123
            return r4
        L14f:
            return r1
    }

    public static boolean j(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "show_adn_load_error_detail"
            java.lang.Object r2 = r2.get(r1)
            boolean r1 = r2 instanceof java.lang.Boolean
            if (r1 == 0) goto L15
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L15:
            return r0
    }

    private static boolean xt() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ch()
            return r0
    }
}
