package com.bytedance.msdk.core.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r6, com.bytedance.msdk.api.j.xt r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            java.lang.String r6 = "put 元素异常："
            java.lang.String r0 = "AdLoadEventManager"
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            boolean r1 = r1.ed()
            if (r1 != 0) goto L10
            goto L104
        L10:
            if (r7 == 0) goto L17
            java.lang.String r1 = r7.v()
            goto L18
        L17:
            r1 = 0
        L18:
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.xt.xt r2 = r2.gx()
            if (r2 == 0) goto L104
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "lt_days"
            int r5 = r2.j()     // Catch: java.lang.Exception -> L3e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L3e
            r3.putOpt(r4, r5)     // Catch: java.lang.Exception -> L3e
            java.lang.String r4 = "rule_id"
            java.lang.String r2 = r2.cw(r1)     // Catch: java.lang.Exception -> L3e
            r3.putOpt(r4, r2)     // Catch: java.lang.Exception -> L3e
            goto L54
        L3e:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "put 元素 异常："
            r4.<init>(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r2)
        L54:
            java.lang.String r2 = "score"
            com.bytedance.msdk.core.j r4 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Exception -> L66
            float r4 = r4.j(r1)     // Catch: java.lang.Exception -> L66
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Exception -> L66
            r3.putOpt(r2, r4)     // Catch: java.lang.Exception -> L66
            goto L7a
        L66:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r2)
        L7a:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r4 = "dis_c"
            int r1 = com.bytedance.msdk.core.xt.j.xt(r1)     // Catch: java.lang.Exception -> Lb9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lb9
            r2.putOpt(r4, r1)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = "ins_d"
            int r4 = com.bytedance.msdk.core.xt.j.up()     // Catch: java.lang.Exception -> Lb9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Lb9
            r2.putOpt(r1, r4)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = "act_d"
            int r4 = com.bytedance.msdk.core.xt.j.xt()     // Catch: java.lang.Exception -> Lb9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Lb9
            r2.putOpt(r1, r4)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = "act_times"
            int r4 = com.bytedance.msdk.core.xt.j.r()     // Catch: java.lang.Exception -> Lb9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Lb9
            r2.putOpt(r1, r4)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = "active_target"
            r3.putOpt(r1, r2)     // Catch: java.lang.Exception -> Lb9
            goto Lcd
        Lb9:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r1)
        Lcd:
            if (r7 == 0) goto Lff
            java.util.Map r1 = r7.c()
            if (r1 == 0) goto Lff
            java.util.Map r7 = r7.c()
            java.lang.String r1 = "usePolicy"
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto Lff
            java.lang.String r2 = "user_enter"
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Exception -> Leb
            r3.putOpt(r2, r7)     // Catch: java.lang.Exception -> Leb
            goto Lff
        Leb:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            java.lang.String r6 = r7.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r6)
        Lff:
            java.lang.String r6 = "dynamic_policy"
            r8.put(r6, r3)
        L104:
            return
    }
}
