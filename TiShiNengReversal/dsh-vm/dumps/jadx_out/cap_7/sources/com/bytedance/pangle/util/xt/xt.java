package com.bytedance.pangle.util.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void j(int r4, java.lang.String r5, int r6, long r7, java.lang.Throwable r9, java.lang.String r10) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "status_code"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = com.bytedance.pangle.log.xt.j(r4)     // Catch: org.json.JSONException -> L5c
            r0.putOpt(r3, r4)     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = "plugin_package_name"
            java.lang.String r5 = com.bytedance.pangle.log.xt.j(r5)     // Catch: org.json.JSONException -> L5c
            r0.putOpt(r4, r5)     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = "version_code"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: org.json.JSONException -> L5c
            java.lang.String r5 = com.bytedance.pangle.log.xt.j(r5)     // Catch: org.json.JSONException -> L5c
            r0.putOpt(r4, r5)     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = "duration"
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch: org.json.JSONException -> L5c
            int r5 = com.bytedance.pangle.log.xt.xt(r5)     // Catch: org.json.JSONException -> L5c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: org.json.JSONException -> L5c
            r2.putOpt(r4, r5)     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = "message"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L5c
            r5.<init>()     // Catch: org.json.JSONException -> L5c
            r5.append(r10)     // Catch: org.json.JSONException -> L5c
            java.lang.String r6 = com.bytedance.pangle.log.xt.j(r9)     // Catch: org.json.JSONException -> L5c
            r5.append(r6)     // Catch: org.json.JSONException -> L5c
            java.lang.String r5 = r5.toString()     // Catch: org.json.JSONException -> L5c
            r1.putOpt(r4, r5)     // Catch: org.json.JSONException -> L5c
            goto L60
        L5c:
            r4 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r4)
        L60:
            com.bytedance.pangle.r.xt r4 = com.bytedance.pangle.r.xt.j()
            java.lang.String r5 = com.bytedance.pangle.r.xt.oq
            r4.j(r5, r0, r2, r1)
            return
    }

    public static boolean j(java.lang.String r21, boolean r22, boolean r23, java.lang.String r24, int r25, int r26) {
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r26
            java.lang.String r5 = "[shootsTag]"
            java.lang.String r6 = "Zeus_pangle"
            java.lang.String r7 = "rmSo:"
            java.lang.String r8 = " rmDex:"
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 2
            r12 = 1
            com.bytedance.pangle.util.xt.j.j r0 = new com.bytedance.pangle.util.xt.j.j     // Catch: java.lang.Throwable -> L62
            r0.<init>()     // Catch: java.lang.Throwable -> L62
            com.bytedance.pangle.util.xt.xt.r r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L62
            com.bytedance.pangle.util.xt.j r14 = new com.bytedance.pangle.util.xt.j     // Catch: java.lang.Throwable -> L62
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L62
            r14.j(r2, r3)     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto L61
            if (r4 != r12) goto L2f
            int r13 = com.bytedance.pangle.r.xt.j.j
        L2d:
            r14 = r13
            goto L35
        L2f:
            if (r4 != r11) goto L34
            int r13 = com.bytedance.pangle.r.xt.j.xt
            goto L2d
        L34:
            r14 = 0
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r0.append(r3)
            r0.append(r8)
            r0.append(r2)
            java.lang.String r20 = r0.toString()
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r0 = r5.concat(r0)
            com.bytedance.pangle.log.ZeusLogger.d(r6, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r17 = r0 - r9
            r19 = 0
            r15 = r24
            r16 = r25
            j(r14, r15, r16, r17, r19, r20)
        L61:
            return r12
        L62:
            r0 = move-exception
            r14 = r0
            java.lang.String r0 = "Zeus/install_pangle"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            r16 = 0
            java.lang.String r13 = "rmEntries failed. zipFile:"
            r15.<init>(r13)     // Catch: java.lang.Throwable -> Lc1
            r15.append(r1)     // Catch: java.lang.Throwable -> Lc1
            r15.append(r8)     // Catch: java.lang.Throwable -> Lc1
            r15.append(r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = " rmSO:"
            r15.append(r1)     // Catch: java.lang.Throwable -> Lc1
            r15.append(r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = r15.toString()     // Catch: java.lang.Throwable -> Lc1
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r1, r14)     // Catch: java.lang.Throwable -> Lc1
            if (r4 == 0) goto Lc0
            if (r4 != r12) goto L8e
            int r0 = com.bytedance.pangle.r.xt.j.cw
            goto L94
        L8e:
            if (r4 != r11) goto L93
            int r0 = com.bytedance.pangle.r.xt.j.r
            goto L94
        L93:
            r0 = 0
        L94:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r3)
            r1.append(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r5.concat(r2)
            com.bytedance.pangle.log.ZeusLogger.d(r6, r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r9
            r6 = r1
            r3 = r2
            r5 = r14
            r1 = r24
            r2 = r25
            j(r0, r1, r2, r3, r5, r6)
        Lc0:
            return r16
        Lc1:
            r0 = move-exception
            r1 = r14
        Lc3:
            r13 = r0
            goto Lca
        Lc5:
            r0 = move-exception
            r1 = r14
            r16 = 0
            goto Lc3
        Lca:
            if (r4 == 0) goto L102
            if (r4 == r12) goto Ld5
            if (r4 != r11) goto Ld3
            int r0 = com.bytedance.pangle.r.xt.j.r
            goto Ld7
        Ld3:
            r0 = 0
            goto Ld7
        Ld5:
            int r0 = com.bytedance.pangle.r.xt.j.cw
        Ld7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            r4.append(r3)
            r4.append(r8)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r5.concat(r3)
            com.bytedance.pangle.log.ZeusLogger.d(r6, r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r9
            r5 = r1
            r6 = r2
            r1 = r24
            r2 = r25
            j(r0, r1, r2, r3, r5, r6)
        L102:
            throw r13
    }
}
