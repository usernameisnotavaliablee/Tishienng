package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class z implements com.umeng.analytics.pro.ag {
    private java.lang.String a;
    private java.util.ArrayList<com.umeng.analytics.pro.aa> b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;

    public z(java.lang.String r2, java.util.ArrayList<com.umeng.analytics.pro.aa> r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r0 = ""
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.a = r2
            r1.b = r3
            return
    }

    private java.lang.String c(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = ","
            java.lang.String[] r10 = r10.split(r0)
            int r0 = r10.length
            java.lang.String r1 = ""
            if (r0 <= 0) goto L69
            java.lang.String r0 = r9.a
            java.util.ArrayList r0 = com.umeng.ccg.CcgAgent.getForbidSdkArray(r0)
            r2 = 0
            if (r0 == 0) goto L35
            int r3 = r0.size()
            if (r3 <= 0) goto L35
            java.lang.String r3 = r0.toString()
            r9.f = r3
            int r3 = r10.length
        L21:
            if (r2 >= r3) goto L69
            r4 = r10[r2]
            com.umeng.ccg.ActionInfo r5 = com.umeng.ccg.CcgAgent.getActionInfo(r4)
            if (r5 == 0) goto L32
            boolean r5 = r0.contains(r4)
            if (r5 != 0) goto L32
            return r4
        L32:
            int r2 = r2 + 1
            goto L21
        L35:
            int r0 = r10.length
            r3 = 0
        L37:
            if (r3 >= r0) goto L69
            r4 = r10[r3]
            com.umeng.ccg.ActionInfo r5 = com.umeng.ccg.CcgAgent.getActionInfo(r4)
            if (r5 == 0) goto L66
            android.content.Context r6 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            java.lang.String[] r5 = r5.getSupportAction(r6)
            int r6 = r5.length
            if (r6 <= 0) goto L66
            r6 = 0
        L4d:
            int r7 = r5.length
            if (r6 >= r7) goto L5f
            java.lang.String r7 = r9.a
            r8 = r5[r6]
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L5c
            r1 = r4
            goto L5f
        L5c:
            int r6 = r6 + 1
            goto L4d
        L5f:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L66
            return r1
        L66:
            int r3 = r3 + 1
            goto L37
        L69:
            return r1
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // com.umeng.analytics.pro.ag
    public org.json.JSONObject a(java.lang.String r4, org.json.JSONObject r5) {
            r3 = this;
            r4 = 0
            java.util.ArrayList<com.umeng.analytics.pro.aa> r5 = r3.b     // Catch: java.lang.Throwable -> Lca
            int r5 = r5.size()     // Catch: java.lang.Throwable -> Lca
            if (r5 != 0) goto La
            return r4
        La:
            r0 = 0
        Lb:
            if (r0 >= r5) goto L1f
            java.util.ArrayList<com.umeng.analytics.pro.aa> r1 = r3.b     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> Lca
            com.umeng.analytics.pro.aa r1 = (com.umeng.analytics.pro.aa) r1     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r1.b()     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto L1c
            return r4
        L1c:
            int r0 = r0 + 1
            goto Lb
        L1f:
            boolean r0 = com.umeng.ccg.CcgAgent.hasRegistedActionInfo()     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto L86
            java.lang.String r0 = r3.d     // Catch: java.lang.Throwable -> Lca
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lca
            if (r0 != 0) goto L86
            java.lang.String r0 = r3.d     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r3.c(r0)     // Catch: java.lang.Throwable -> Lca
            r3.e = r0     // Catch: java.lang.Throwable -> Lca
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = "采集项："
            java.lang.String r2 = "MobclickRT"
            if (r0 != 0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca
            r0.<init>()     // Catch: java.lang.Throwable -> Lca
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = r3.a     // Catch: java.lang.Throwable -> Lca
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = "; 选中Module: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = r3.e     // Catch: java.lang.Throwable -> Lca
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = "; sdk: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = r3.d     // Catch: java.lang.Throwable -> Lca
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lca
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)     // Catch: java.lang.Throwable -> Lca
            goto L86
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca
            r0.<init>()     // Catch: java.lang.Throwable -> Lca
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = r3.a     // Catch: java.lang.Throwable -> Lca
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = "; 未选中可用Module ; sdk: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = r3.d     // Catch: java.lang.Throwable -> Lca
            r0.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lca
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)     // Catch: java.lang.Throwable -> Lca
        L86:
            java.util.ArrayList<com.umeng.analytics.pro.aa> r0 = r3.b     // Catch: java.lang.Throwable -> Lca
            int r5 = r5 + (-1)
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> Lca
            com.umeng.analytics.pro.aa r5 = (com.umeng.analytics.pro.aa) r5     // Catch: java.lang.Throwable -> Lca
            if (r5 == 0) goto Lca
            boolean r0 = r5 instanceof com.umeng.analytics.pro.ac     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Lca
            long r0 = r5.c()     // Catch: java.lang.Throwable -> Lca
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lca
            r5.<init>()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r4 = "actionName"
            java.lang.String r2 = r3.a     // Catch: java.lang.Throwable -> Lc8
            r5.put(r4, r2)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r4 = "sdk"
            java.lang.String r2 = r3.d     // Catch: java.lang.Throwable -> Lc8
            r5.put(r4, r2)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r4 = "hit_sdk"
            java.lang.String r2 = r3.c     // Catch: java.lang.Throwable -> Lc8
            r5.put(r4, r2)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r4 = "delay"
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r4 = "local_hit_sdk"
            java.lang.String r0 = r3.e     // Catch: java.lang.Throwable -> Lc8
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r4 = "forbid_sdk"
            java.lang.String r0 = r3.f     // Catch: java.lang.Throwable -> Lc8
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> Lc8
            return r5
        Lc8:
            r4 = r5
        Lca:
            return r4
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }
}
