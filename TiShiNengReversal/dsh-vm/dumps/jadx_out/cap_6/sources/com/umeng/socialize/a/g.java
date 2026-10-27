package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class g implements java.lang.Runnable {
    private static final int a = 1;
    private static final int b = 2;
    private static final java.lang.String c = "AZX";


    g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r18 = this;
            boolean r0 = com.umeng.socialize.UMShareAPI.getSmartEnableFlag()
            if (r0 != 0) goto L8
            goto L1e2
        L8:
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            com.umeng.socialize.a.e r1 = com.umeng.socialize.a.e.a(r0)
            r1.e()
            int r0 = r1.c()
            long r2 = r1.d()
            long r4 = (long) r0
            r6 = 2
            r7 = 1
            r8 = 0
            java.lang.String r9 = "AZX"
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L45
            boolean r1 = com.umeng.socialize.a.a.c
            if (r1 == 0) goto L1e2
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "launch times skipped. times:"
            r2[r8] = r3
            r2[r7] = r1
            java.lang.String r1 = " config:"
            r2[r6] = r1
            r1 = 3
            r2[r1] = r0
            com.umeng.socialize.a.m.a(r9, r2)
            return
        L45:
            boolean r0 = r1.b()
            if (r0 != 0) goto L59
            boolean r0 = com.umeng.socialize.a.a.c
            if (r0 == 0) goto L1e2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r1 = "interval skipped."
            r0[r8] = r1
            com.umeng.socialize.a.m.a(r9, r0)
            return
        L59:
            android.content.Context r12 = com.umeng.socialize.utils.ContextUtil.getContext()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r15 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r12)     // Catch: java.lang.Throwable -> Lc2
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc2
            r0.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "zid"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getZid(r12)     // Catch: java.lang.Throwable -> Lc2
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "imei"
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getImeiNew(r12)     // Catch: java.lang.Throwable -> L81
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "oaid"
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getOaid(r12)     // Catch: java.lang.Throwable -> L81
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L81
        L81:
            java.lang.String r2 = "idfa"
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getIdfa(r12)     // Catch: java.lang.Throwable -> L8a
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8a
        L8a:
            java.lang.String r2 = "umid"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getUMId(r12)     // Catch: java.lang.Throwable -> Lc2
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "android_id"
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAndroidId(r12)     // Catch: java.lang.Throwable -> Lc2
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "sdk_v"
            java.lang.String r3 = "7.3.2"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "os_v"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lc2
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "lvl"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc2
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String[] r2 = com.umeng.commonsdk.utils.UMUtils.getNetworkAccessMode(r12)     // Catch: java.lang.Throwable -> Lc2
            r3 = r2[r8]     // Catch: java.lang.Throwable -> Lc2
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lc2
            if (r3 == 0) goto Lc5
            java.lang.String r3 = "Unknown"
            r2[r8] = r3     // Catch: java.lang.Throwable -> Lc2
            goto Lc5
        Lc2:
            r0 = move-exception
            goto L1d3
        Lc5:
            java.lang.String r3 = "net"
            r2 = r2[r8]     // Catch: java.lang.Throwable -> Lc2
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "brand"
            java.lang.String r3 = com.umeng.socialize.a.c.a()     // Catch: java.lang.Throwable -> Lc2
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            long r2 = r1.a()     // Catch: java.lang.Throwable -> Lc2
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto Le4
            java.lang.String r10 = "last"
            r0.put(r10, r2)     // Catch: java.lang.Throwable -> Lc2
        Le4:
            java.lang.String r2 = "https://ccs.umeng.com/sa"
            boolean r3 = com.umeng.socialize.a.a.c     // Catch: java.lang.Throwable -> Lc2 java.lang.Exception -> Led
            org.json.JSONObject r0 = com.umeng.socialize.a.d.a(r0, r2, r15, r3)     // Catch: java.lang.Throwable -> Lc2 java.lang.Exception -> Led
            goto L102
        Led:
            r0 = move-exception
            boolean r2 = com.umeng.socialize.a.a.c     // Catch: java.lang.Throwable -> Lc2
            if (r2 == 0) goto L101
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = "request failed. "
            r2[r8] = r3     // Catch: java.lang.Throwable -> Lc2
            r2[r7] = r0     // Catch: java.lang.Throwable -> Lc2
            com.umeng.socialize.a.m.d(r9, r2)     // Catch: java.lang.Throwable -> Lc2
        L101:
            r0 = 0
        L102:
            r2 = 7200(0x1c20, double:3.5573E-320)
            if (r0 != 0) goto L118
            boolean r0 = com.umeng.socialize.a.a.c     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L113
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "response == null"
            r0[r8] = r4     // Catch: java.lang.Throwable -> Lc2
            com.umeng.socialize.a.m.a(r9, r0)     // Catch: java.lang.Throwable -> Lc2
        L113:
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc2
            goto L1e2
        L118:
            java.lang.String r10 = "data"
            org.json.JSONObject r0 = r0.optJSONObject(r10)     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto L132
            boolean r0 = com.umeng.socialize.a.a.c     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L12d
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "data empty skipped."
            r0[r8] = r4     // Catch: java.lang.Throwable -> Lc2
            com.umeng.socialize.a.m.a(r9, r0)     // Catch: java.lang.Throwable -> Lc2
        L12d:
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc2
            goto L1e2
        L132:
            java.lang.String r2 = "aa"
            org.json.JSONObject r2 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> Lc2
            if (r2 != 0) goto L13f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc2
            r2.<init>()     // Catch: java.lang.Throwable -> Lc2
        L13f:
            java.lang.String r3 = "launch"
            r10 = 5
            int r3 = r2.optInt(r3, r10)     // Catch: java.lang.Throwable -> Lc2
            r1.a(r3)     // Catch: java.lang.Throwable -> Lc2
            long r10 = r1.d()     // Catch: java.lang.Throwable -> Lc2
            long r13 = (long) r3     // Catch: java.lang.Throwable -> Lc2
            int r16 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r16 >= 0) goto L167
            boolean r0 = com.umeng.socialize.a.a.c     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L1e2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "launch times skipped. config:"
            r1[r8] = r2     // Catch: java.lang.Throwable -> Lc2
            r1[r7] = r0     // Catch: java.lang.Throwable -> Lc2
            com.umeng.socialize.a.m.a(r9, r1)     // Catch: java.lang.Throwable -> Lc2
            goto L1e2
        L167:
            java.lang.String r3 = "ttl"
            r10 = 86400(0x15180, double:4.26873E-319)
            long r10 = r0.optLong(r3, r10)     // Catch: java.lang.Throwable -> Lc2
            r1.a(r10)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "id"
            r10 = -1
            long r16 = r0.optLong(r1, r10)     // Catch: java.lang.Throwable -> Lc2
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 > 0) goto L193
            boolean r0 = com.umeng.socialize.a.a.c     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L1e2
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "id skipped, id:"
            r1[r8] = r2     // Catch: java.lang.Throwable -> Lc2
            r1[r7] = r0     // Catch: java.lang.Throwable -> Lc2
            com.umeng.socialize.a.m.a(r9, r1)     // Catch: java.lang.Throwable -> Lc2
            goto L1e2
        L193:
            java.lang.String r0 = "batch"
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = r2.optInt(r0, r1)     // Catch: java.lang.Throwable -> Lc2
            r1 = 100
            int r14 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "action"
            int r13 = r2.optInt(r0, r7)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "delay"
            int r0 = r2.optInt(r0)     // Catch: java.lang.Throwable -> Lc2
            if (r13 == r7) goto L1c5
            if (r13 == r6) goto L1c5
            boolean r0 = com.umeng.socialize.a.a.c     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L1e2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "action skipped. "
            r1[r8] = r2     // Catch: java.lang.Throwable -> Lc2
            r1[r7] = r0     // Catch: java.lang.Throwable -> Lc2
            com.umeng.socialize.a.m.a(r9, r1)     // Catch: java.lang.Throwable -> Lc2
            goto L1e2
        L1c5:
            com.umeng.socialize.a.g$1 r10 = new com.umeng.socialize.a.g$1     // Catch: java.lang.Throwable -> Lc2
            r11 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lc2
            long r0 = (long) r0     // Catch: java.lang.Throwable -> Lc2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lc2
            com.umeng.socialize.a.j.a(r10, r0, r2)     // Catch: java.lang.Throwable -> Lc2
            goto L1e2
        L1d3:
            boolean r1 = com.umeng.socialize.a.a.c
            if (r1 == 0) goto L1e2
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r8] = r0
            com.umeng.socialize.a.m.d(r9, r1)
        L1e2:
            return
    }
}
