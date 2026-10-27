package com.bytedance.adsdk.ugeno.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static float[] cw(java.lang.String r7) {
            r0 = 2
            float[] r1 = new float[r0]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            r3 = 0
            org.json.JSONArray r7 = com.bytedance.adsdk.ugeno.m.xt.j(r7, r3)
            if (r7 == 0) goto L26
            int r3 = r7.length()
            if (r3 == r0) goto L18
            goto L26
        L18:
            double r5 = r7.optDouble(r2)
            float r0 = (float) r5
            r1[r2] = r0
            double r2 = r7.optDouble(r4)
            float r7 = (float) r2
            r1[r4] = r7
        L26:
            return r1
    }

    public static int j(int r1) {
            if (r1 >= 0) goto L4
            r1 = -1
            return r1
        L4:
            r0 = 1
            if (r1 != 0) goto L8
            return r0
        L8:
            int r1 = r1 - r0
            return r1
    }

    public static int j(java.lang.String r2) {
            int r0 = r2.hashCode()
            r1 = -1408024454(0xffffffffac13407a, float:-2.0925748E-12)
            if (r0 == r1) goto L15
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto Lf
            goto L1f
        Lf:
            java.lang.String r0 = "normal"
            r2.equals(r0)
            goto L1f
        L15:
            java.lang.String r0 = "alternate"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1f
            r2 = 2
            return r2
        L1f:
            r2 = 1
            return r2
    }

    public static int j(java.lang.String r5, int r6) {
            int r0 = r6 / 2
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto La
            goto L75
        La:
            r5.getClass()
            int r1 = r5.hashCode()
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r1) {
                case -1383228885: goto L44;
                case -1364013995: goto L39;
                case 115029: goto L2e;
                case 3317767: goto L23;
                case 108511772: goto L18;
                default: goto L17;
            }
        L17:
            goto L4e
        L18:
            java.lang.String r1 = "right"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L21
            goto L4e
        L21:
            r4 = 4
            goto L4e
        L23:
            java.lang.String r1 = "left"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L2c
            goto L4e
        L2c:
            r4 = 3
            goto L4e
        L2e:
            java.lang.String r1 = "top"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L37
            goto L4e
        L37:
            r4 = 2
            goto L4e
        L39:
            java.lang.String r1 = "center"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L42
            goto L4e
        L42:
            r4 = 1
            goto L4e
        L44:
            java.lang.String r1 = "bottom"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L4d
            goto L4e
        L4d:
            r4 = 0
        L4e:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L75;
                case 2: goto L74;
                case 3: goto L74;
                case 4: goto L76;
                default: goto L51;
            }
        L51:
            java.lang.String r1 = "%"
            boolean r1 = r5.endsWith(r1)
            if (r1 == 0) goto L6e
            int r1 = r5.length()     // Catch: java.lang.NumberFormatException -> L75
            int r1 = r1 - r2
            java.lang.String r5 = r5.substring(r3, r1)     // Catch: java.lang.NumberFormatException -> L75
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L75
            float r6 = (float) r6
            float r6 = r6 * r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r5
            int r5 = (int) r6
            return r5
        L6e:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L73
            return r5
        L73:
            return r0
        L74:
            return r3
        L75:
            return r0
        L76:
            return r6
    }

    public static com.bytedance.adsdk.ugeno.j.cw j(org.json.JSONObject r6, org.json.JSONObject r7) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            com.bytedance.adsdk.ugeno.j.cw r0 = new com.bytedance.adsdk.ugeno.j.cw
            r0.<init>()
            java.lang.String r1 = "delay"
            java.lang.String r1 = r6.optString(r1)
            java.lang.String r1 = com.bytedance.adsdk.ugeno.r.xt.j(r1, r7)
            r2 = 0
            long r4 = com.bytedance.adsdk.ugeno.m.cw.j(r1, r2)
            r0.xt(r4)
            java.lang.String r1 = "name"
            java.lang.String r1 = r6.optString(r1)
            java.lang.String r1 = com.bytedance.adsdk.ugeno.r.xt.j(r1, r7)
            r0.cw(r1)
            java.lang.String r1 = "playState"
            java.lang.String r1 = r6.optString(r1)
            java.lang.String r1 = com.bytedance.adsdk.ugeno.r.xt.j(r1, r7)
            r4 = 1
            int r1 = com.bytedance.adsdk.ugeno.m.cw.j(r1, r4)
            r0.xt(r1)
            java.lang.String r1 = "duration"
            java.lang.String r1 = r6.optString(r1)
            java.lang.String r1 = com.bytedance.adsdk.ugeno.r.xt.j(r1, r7)
            long r1 = com.bytedance.adsdk.ugeno.m.cw.j(r1, r2)
            r0.j(r1)
            java.lang.String r1 = "playCount"
            java.lang.String r1 = r6.optString(r1)
            java.lang.String r1 = com.bytedance.adsdk.ugeno.r.xt.j(r1, r7)
            int r1 = com.bytedance.adsdk.ugeno.m.cw.j(r1, r4)
            r0.j(r1)
            java.lang.String r1 = "playDirection"
            java.lang.String r1 = r6.optString(r1)
            java.lang.String r1 = com.bytedance.adsdk.ugeno.r.xt.j(r1, r7)
            r0.j(r1)
            java.lang.String r1 = "transformOrigin"
            java.lang.String r1 = r6.optString(r1)
            com.bytedance.adsdk.ugeno.j.cw$j r1 = r(r1)
            r0.j(r1)
            java.lang.String r1 = "timingFunction"
            java.lang.String r2 = "linear"
            java.lang.String r1 = r6.optString(r1, r2)
            java.lang.String r1 = com.bytedance.adsdk.ugeno.r.xt.j(r1, r7)
            r0.xt(r1)
            java.lang.String r1 = "effect"
            org.json.JSONObject r1 = r6.optJSONObject(r1)
            r0.j(r1)
            java.lang.String r1 = "keyframes"
            org.json.JSONArray r6 = r6.optJSONArray(r1)
            java.util.Map r6 = j(r6, r7)
            r0.j(r6)
            return r0
    }

    public static java.util.List<com.bytedance.adsdk.ugeno.j.cw> j(java.lang.String r3, org.json.JSONObject r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L31
            r2.<init>(r3)     // Catch: org.json.JSONException -> L31
            int r3 = r2.length()     // Catch: org.json.JSONException -> L31
            if (r3 > 0) goto L19
            return r1
        L19:
            r3 = 0
        L1a:
            int r1 = r2.length()     // Catch: org.json.JSONException -> L31
            if (r3 >= r1) goto L30
            org.json.JSONObject r1 = r2.optJSONObject(r3)     // Catch: org.json.JSONException -> L31
            if (r1 == 0) goto L2d
            com.bytedance.adsdk.ugeno.j.cw r1 = j(r1, r4)     // Catch: org.json.JSONException -> L31
            r0.add(r1)     // Catch: org.json.JSONException -> L31
        L2d:
            int r3 = r3 + 1
            goto L1a
        L30:
            return r0
        L31:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static java.util.Map<java.lang.String, java.util.TreeMap<java.lang.Float, java.lang.String>> j(org.json.JSONArray r10, org.json.JSONObject r11) {
            if (r10 == 0) goto L72
            int r0 = r10.length()
            if (r0 > 0) goto L9
            goto L72
        L9:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
        Lf:
            int r2 = r10.length()
            if (r1 >= r2) goto L71
            org.json.JSONObject r2 = r10.optJSONObject(r1)
            if (r2 == 0) goto L6e
            java.lang.String r3 = "offset"
            double r4 = r2.optDouble(r3)
            float r4 = (float) r4
            java.util.Iterator r5 = r2.keys()
        L26:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.get(r6)
            java.util.TreeMap r7 = (java.util.TreeMap) r7
            boolean r8 = android.text.TextUtils.equals(r6, r3)
            if (r8 != 0) goto L26
            boolean r8 = r0.containsKey(r6)
            if (r8 == 0) goto L56
            if (r7 == 0) goto L56
            java.lang.String r6 = r2.optString(r6)
            java.lang.String r6 = com.bytedance.adsdk.ugeno.r.xt.j(r6, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r4)
            r7.put(r8, r6)
            goto L26
        L56:
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            java.lang.String r8 = r2.optString(r6)
            java.lang.String r8 = com.bytedance.adsdk.ugeno.r.xt.j(r8, r11)
            java.lang.Float r9 = java.lang.Float.valueOf(r4)
            r7.put(r9, r8)
            r0.put(r6, r7)
            goto L26
        L6e:
            int r1 = r1 + 1
            goto Lf
        L71:
            return r0
        L72:
            r10 = 0
            return r10
    }

    public static com.bytedance.adsdk.ugeno.j.cw.j r(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONArray r3 = com.bytedance.adsdk.ugeno.m.xt.j(r3, r1)
            if (r3 == 0) goto L2a
            int r0 = r3.length()
            r2 = 2
            if (r0 == r2) goto L16
            goto L2a
        L16:
            com.bytedance.adsdk.ugeno.j.cw$j r0 = new com.bytedance.adsdk.ugeno.j.cw$j
            r0.<init>()
            r1 = 0
            java.lang.String r1 = r3.optString(r1)
            r0.j = r1
            r1 = 1
            java.lang.String r3 = r3.optString(r1)
            r0.xt = r3
            return r0
        L2a:
            return r1
    }

    public static android.view.animation.Interpolator xt(java.lang.String r1) {
            int r0 = r1.hashCode()
            switch(r0) {
                case -1965072618: goto L2b;
                case -1102672091: goto L24;
                case -787702915: goto L16;
                case 1065009829: goto L8;
                default: goto L7;
            }
        L7:
            goto L39
        L8:
            java.lang.String r0 = "ease_in_out"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L39
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            return r1
        L16:
            java.lang.String r0 = "ease_out"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L39
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            return r1
        L24:
            java.lang.String r0 = "linear"
            boolean r1 = r1.equals(r0)
            goto L39
        L2b:
            java.lang.String r0 = "ease_in"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L39
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            return r1
        L39:
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            return r1
    }
}
