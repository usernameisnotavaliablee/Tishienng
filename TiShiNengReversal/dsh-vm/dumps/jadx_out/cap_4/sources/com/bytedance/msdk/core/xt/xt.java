package com.bytedance.msdk.core.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private final java.util.Map<java.lang.String, com.bytedance.msdk.core.xt.r> cw;
    private int j;
    private final java.util.Map<java.lang.String, java.lang.Float> xt;

    public xt(org.json.JSONObject r9) {
            r8 = this;
            r8.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r8.xt = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r8.cw = r0
            if (r9 == 0) goto L92
            java.lang.String r0 = "lt_days"
            int r0 = r9.optInt(r0)
            r8.j = r0
            java.lang.String r0 = "estimate"
            org.json.JSONObject r0 = r9.optJSONObject(r0)
            if (r0 == 0) goto L48
            int r1 = r0.length()
            if (r1 <= 0) goto L48
            java.util.Iterator r1 = r0.keys()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.lang.Float> r3 = r8.xt
            double r4 = r0.optDouble(r2)
            float r4 = (float) r4
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.put(r2, r4)
            goto L2d
        L48:
            java.lang.String r0 = "rule_excs"
            org.json.JSONObject r9 = r9.optJSONObject(r0)
            if (r9 == 0) goto L92
            int r0 = r9.length()
            if (r0 == 0) goto L92
            java.util.Iterator r0 = r9.keys()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r2 = r9.optJSONObject(r1)
            if (r2 == 0) goto L5a
            java.lang.String r3 = "prime_rits"
            org.json.JSONArray r3 = r2.optJSONArray(r3)
            if (r3 == 0) goto L5a
            int r4 = r3.length()
            if (r4 <= 0) goto L5a
            r4 = 0
        L7b:
            int r5 = r3.length()
            if (r4 >= r5) goto L5a
            java.lang.String r5 = r3.optString(r4)
            java.util.Map<java.lang.String, com.bytedance.msdk.core.xt.r> r6 = r8.cw
            com.bytedance.msdk.core.xt.r r7 = new com.bytedance.msdk.core.xt.r
            r7.<init>(r1, r5, r2)
            r6.put(r5, r7)
            int r4 = r4 + 1
            goto L7b
        L92:
            return
    }

    private float j(java.lang.String r3, float r4, float r5) {
            r2 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return r4
        L7:
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case 42: goto L34;
                case 43: goto L29;
                case 107876: goto L1e;
                case 108114: goto L13;
                default: goto L12;
            }
        L12:
            goto L3e
        L13:
            java.lang.String r0 = "min"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1c
            goto L3e
        L1c:
            r1 = 3
            goto L3e
        L1e:
            java.lang.String r0 = "max"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L27
            goto L3e
        L27:
            r1 = 2
            goto L3e
        L29:
            java.lang.String r0 = "+"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L32
            goto L3e
        L32:
            r1 = 1
            goto L3e
        L34:
            java.lang.String r0 = "*"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3d
            goto L3e
        L3d:
            r1 = 0
        L3e:
            switch(r1) {
                case 0: goto L4e;
                case 1: goto L4c;
                case 2: goto L47;
                case 3: goto L42;
                default: goto L41;
            }
        L41:
            return r5
        L42:
            float r3 = java.lang.Math.min(r4, r5)
            return r3
        L47:
            float r3 = java.lang.Math.max(r4, r5)
            return r3
        L4c:
            float r5 = r5 + r4
            return r5
        L4e:
            float r5 = r5 * r4
            return r5
    }

    public java.lang.String cw(java.lang.String r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            com.bytedance.msdk.core.xt.r r2 = r1.xt(r2)
            if (r2 == 0) goto Lf
            java.lang.String r2 = r2.j()
            return r2
        Lf:
            return r0
    }

    public float j(java.lang.String r7) {
            r6 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.xt.r> r0 = r6.cw
            java.lang.Object r0 = r0.get(r7)
            com.bytedance.msdk.core.xt.r r0 = (com.bytedance.msdk.core.xt.r) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L151
            java.util.Map r2 = r0.xt()
            java.lang.String r0 = r0.r()
            if (r2 == 0) goto L151
            java.lang.String r3 = "lt_x_times"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L35
            java.lang.Object r3 = r2.get(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            int r4 = com.bytedance.msdk.core.xt.j.xt()
            if (r3 == 0) goto L35
            float r3 = r3.floatValue()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r1 = r6.j(r0, r3, r1)
        L35:
            java.lang.String r3 = "active_duration"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L54
            java.lang.Object r3 = r2.get(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            long r4 = com.bytedance.msdk.core.xt.j.m()
            if (r3 == 0) goto L54
            float r3 = r3.floatValue()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r1 = r6.j(r0, r3, r1)
        L54:
            java.lang.String r3 = "active_count"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L73
            java.lang.Object r3 = r2.get(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            int r4 = com.bytedance.msdk.core.xt.j.r()
            if (r3 == 0) goto L73
            float r3 = r3.floatValue()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r1 = r6.j(r0, r3, r1)
        L73:
            java.lang.String r3 = "show_period"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L92
            java.lang.Object r3 = r2.get(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            long r4 = com.bytedance.msdk.core.xt.j.tl(r7)
            if (r3 == 0) goto L92
            float r3 = r3.floatValue()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r1 = r6.j(r0, r3, r1)
        L92:
            java.lang.String r3 = "show_count"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto Lb1
            java.lang.Object r3 = r2.get(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            int r4 = com.bytedance.msdk.core.xt.j.r(r7)
            if (r3 == 0) goto Lb1
            float r3 = r3.floatValue()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r1 = r6.j(r0, r3, r1)
        Lb1:
            java.lang.String r3 = "dislike_count"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto Ld0
            java.lang.Object r3 = r2.get(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            int r4 = com.bytedance.msdk.core.xt.j.xt(r7)
            if (r3 == 0) goto Ld0
            float r3 = r3.floatValue()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r1 = r6.j(r0, r3, r1)
        Ld0:
            java.lang.String r3 = "click_count"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto Lef
            java.lang.Object r3 = r2.get(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            int r7 = com.bytedance.msdk.core.xt.j.m(r7)
            if (r3 == 0) goto Lef
            float r3 = r3.floatValue()
            float r7 = (float) r7
            float r3 = r3 * r7
            float r1 = r6.j(r0, r3, r1)
        Lef:
            java.lang.String r7 = "install_days"
            boolean r3 = r2.containsKey(r7)
            if (r3 == 0) goto L10e
            java.lang.Object r7 = r2.get(r7)
            java.lang.Float r7 = (java.lang.Float) r7
            int r3 = com.bytedance.msdk.core.xt.j.up()
            if (r7 == 0) goto L10e
            float r7 = r7.floatValue()
            float r3 = (float) r3
            float r7 = r7 * r3
            float r1 = r6.j(r0, r7, r1)
        L10e:
            java.util.Map<java.lang.String, java.lang.Float> r7 = r6.xt
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L151
            java.util.Map<java.lang.String, java.lang.Float> r7 = r6.xt
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L120:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L151
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L120
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            java.lang.Object r4 = r2.get(r4)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L120
            float r4 = r4.floatValue()
            float r4 = r4 * r3
            float r1 = r6.j(r0, r4, r1)
            goto L120
        L151:
            return r1
    }

    public int j() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public org.json.JSONObject j(java.lang.String r11, @androidx.annotation.NonNull com.bytedance.msdk.tl.tj r12) {
            r10 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L9e
            if (r11 != 0) goto Le
            goto L9e
        Le:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto L1a
            return r0
        L1a:
            float r1 = r10.j(r11)
            java.util.Map<java.lang.String, com.bytedance.msdk.core.xt.r> r2 = r10.cw
            java.lang.Object r2 = r2.get(r11)
            com.bytedance.msdk.core.xt.r r2 = (com.bytedance.msdk.core.xt.r) r2
            if (r2 == 0) goto L88
            java.util.Map r3 = r2.up()
            java.lang.String[] r2 = r2.cw()
            if (r3 == 0) goto L88
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L88
            if (r2 == 0) goto L88
            int r4 = r2.length
            if (r4 <= 0) goto L88
            int r4 = r2.length
            r5 = 0
        L3f:
            if (r5 >= r4) goto L88
            r6 = r2[r5]
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L85
            java.lang.Object r7 = r3.get(r6)
            com.bytedance.msdk.core.xt.up r7 = (com.bytedance.msdk.core.xt.up) r7
            if (r7 == 0) goto L85
            int r7 = r7.j(r1)     // Catch: java.lang.Exception -> L5d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L5d
            r0.putOpt(r6, r7)     // Catch: java.lang.Exception -> L5d
            goto L85
        L5d:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "calculateRangeByScore计算异常：(tableName："
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = ",primeRit:"
            r8.append(r6)
            r8.append(r11)
            java.lang.String r6 = "），"
            r8.append(r6)
            java.lang.String r6 = r7.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = ""
            com.bytedance.msdk.j.up.cw.r(r7, r6)
        L85:
            int r5 = r5 + 1
            goto L3f
        L88:
            java.lang.String r2 = "gm_policy"
            r12.j(r2, r0)
            java.lang.String r2 = "adl_scr"
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            r12.j(r2, r3)
            com.bytedance.msdk.core.j r12 = com.bytedance.msdk.core.j.qv()
            r12.j(r11, r1)
            return r0
        L9e:
            r11 = 0
            return r11
    }

    public com.bytedance.msdk.core.xt.r xt(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.xt.r> r0 = r1.cw
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.msdk.core.xt.r r2 = (com.bytedance.msdk.core.xt.r) r2
            return r2
    }
}
