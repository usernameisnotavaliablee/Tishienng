package com.bytedance.msdk.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class g implements com.bytedance.sdk.component.tl.j.qv {
    private static final java.lang.Runnable cw = null;
    private static final android.os.Handler xt = null;
    public com.bytedance.msdk.up.xt.j<com.bytedance.msdk.up.j> j;



    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = com.bytedance.msdk.j.up.m.xt()
            r0.<init>(r1)
            com.bytedance.msdk.up.g.xt = r0
            com.bytedance.msdk.up.g$2 r0 = new com.bytedance.msdk.up.g$2
            r0.<init>()
            com.bytedance.msdk.up.g.cw = r0
            return
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.bytedance.msdk.up.up j(com.bytedance.msdk.up.g r0, java.util.List r1) {
            com.bytedance.msdk.up.up r0 = r0.j(r1)
            return r0
    }

    private com.bytedance.msdk.up.up j(java.util.List<com.bytedance.msdk.up.j> r2) {
            r1 = this;
            com.bytedance.msdk.up.xt.j<com.bytedance.msdk.up.j> r0 = r1.j     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto Lc
            com.bytedance.msdk.up.xt.j r0 = com.bytedance.msdk.core.xt.j()     // Catch: java.lang.Exception -> Lb
            r1.j = r0     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
        Lc:
            com.bytedance.msdk.up.xt.j<com.bytedance.msdk.up.j> r0 = r1.j
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            com.bytedance.msdk.up.up r2 = r0.j(r2)
            return r2
    }

    static /* synthetic */ void j() {
            xt()
            return
    }

    private void j(org.json.JSONObject r4, int r5, long r6, int r8, org.json.JSONObject r9) {
            r3 = this;
            java.lang.String r0 = "event_extra"
            if (r4 == 0) goto L45
            java.lang.String r1 = r4.optString(r0)     // Catch: java.lang.Throwable -> L45
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L45
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "size"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L45
            r2.putOpt(r1, r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "batchId"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L45
            r2.putOpt(r5, r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "batchIndex"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L45
            r2.putOpt(r5, r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "preEventId"
            if (r9 == 0) goto L39
            java.lang.String r6 = "event_id"
            java.lang.String r6 = r9.optString(r6)     // Catch: java.lang.Throwable -> L45
            goto L3b
        L39:
            java.lang.String r6 = "-1"
        L3b:
            r2.putOpt(r5, r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L45
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L45
        L45:
            return
    }

    private static void xt() {
            android.os.Handler r0 = com.bytedance.msdk.up.g.xt
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            java.lang.Runnable r1 = com.bytedance.msdk.up.g.cw
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            long r2 = r2.a()
            r0.postDelayed(r1, r2)
            return
    }

    private void xt(org.json.JSONObject r9, int r10, long r11, int r13, org.json.JSONObject r14) {
            r8 = this;
            java.lang.String r0 = "params"
            if (r9 == 0) goto L1b
            org.json.JSONObject r2 = r9.optJSONObject(r0)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
            if (r14 == 0) goto L16
            org.json.JSONObject r9 = r14.optJSONObject(r0)     // Catch: java.lang.Throwable -> L1b
        L10:
            r1 = r8
            r7 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            goto L18
        L16:
            r9 = 0
            goto L10
        L18:
            r1.j(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    @Override // com.bytedance.sdk.component.tl.j.qv
    public void j(java.util.List<com.bytedance.sdk.component.tl.j.xt> r12, @androidx.annotation.Nullable com.bytedance.sdk.component.tl.j.oq r13) {
            r11 = this;
            if (r12 == 0) goto L84
            int r0 = r12.size()
            if (r0 <= 0) goto L84
            long r4 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r12.iterator()
            r1 = 0
            r2 = 0
            r6 = 0
        L18:
            r7 = r2
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r8.next()
            r9 = r1
            com.bytedance.sdk.component.tl.j.xt r9 = (com.bytedance.sdk.component.tl.j.xt) r9
            org.json.JSONObject r2 = r9.ae()
            byte r1 = r9.up()
            byte r3 = r9.r()
            r10 = 2
            if (r1 != r10) goto L4d
            r1 = 3
            if (r3 != r1) goto L4d
            int r3 = r12.size()
            r1 = r11
            r1.xt(r2, r3, r4, r6, r7)
            com.bytedance.msdk.up.ae r3 = new com.bytedance.msdk.up.ae
            java.lang.String r7 = r9.cw()
            r3.<init>(r7, r2)
            r0.add(r3)
            goto L6d
        L4d:
            r1 = r11
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "not_v3"
            r3.putOpt(r7, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "batchId"
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L6d
            r3.putOpt(r7, r9)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "batchIndex"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L6d
            r3.putOpt(r7, r9)     // Catch: java.lang.Throwable -> L6d
            com.bytedance.msdk.tl.l.j(r3)     // Catch: java.lang.Throwable -> L6d
        L6d:
            int r6 = r6 + 1
            goto L18
        L70:
            r1 = r11
            int r2 = r0.size()
            if (r2 <= 0) goto L85
            java.util.concurrent.Executor r2 = com.bytedance.msdk.j.up.m.ae()
            com.bytedance.msdk.up.g$1 r3 = new com.bytedance.msdk.up.g$1
            r3.<init>(r11, r0, r13, r12)
            r2.execute(r3)
            goto L85
        L84:
            r1 = r11
        L85:
            return
    }
}
