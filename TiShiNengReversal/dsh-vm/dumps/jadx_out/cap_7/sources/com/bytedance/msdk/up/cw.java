package com.bytedance.msdk.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    private static volatile boolean j;
    private static final java.util.concurrent.atomic.AtomicLong xt = null;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            com.bytedance.msdk.up.cw.xt = r0
            return
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void cw() {
            java.lang.String r0 = "csj_mediation"
            com.bytedance.sdk.component.tl.xt.j.r(r0)
            return
    }

    public static void j() {
            r0 = 1
            com.bytedance.msdk.up.cw.j = r0
            return
    }

    public static void j(android.content.Context r4) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            int r0 = r0.s()
            com.bytedance.sdk.component.tl.j.j$j r1 = new com.bytedance.sdk.component.tl.j.j$j
            r1.<init>()
            com.bytedance.msdk.up.g r2 = new com.bytedance.msdk.up.g
            r2.<init>()
            com.bytedance.sdk.component.tl.j.j$j r1 = r1.j(r2)
            r2 = 172800000(0xa4cb800, double:8.53745436E-316)
            com.bytedance.sdk.component.tl.xt.r.xt.j r0 = com.bytedance.sdk.component.tl.xt.r.xt.j.j(r0, r0, r2)
            com.bytedance.sdk.component.tl.j.j$j r0 = r1.xt(r0)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r1.jy()
            com.bytedance.sdk.component.tl.j.j$j r0 = r0.xt(r1)
            com.bytedance.msdk.up.oq r1 = new com.bytedance.msdk.up.oq
            r1.<init>()
            com.bytedance.sdk.component.tl.j.j$j r0 = r0.j(r1)
            com.bytedance.msdk.up.qv r1 = com.bytedance.msdk.up.qv.j
            com.bytedance.sdk.component.tl.j.j$j r0 = r0.j(r1)
            java.lang.String r1 = "csj_mediation"
            com.bytedance.sdk.component.tl.j.j$j r0 = r0.j(r1)
            com.bytedance.sdk.component.tl.j.j$j r4 = r0.j(r4)
            com.bytedance.sdk.component.tl.j.j r4 = r4.j()
            com.bytedance.sdk.component.tl.xt.j.j(r4)
            com.bytedance.sdk.component.tl.xt.j.xt(r1)
            return
    }

    public static void j(android.content.Context r4, com.bytedance.msdk.up.r r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ws()
            if (r0 != 0) goto Lb
            return
        Lb:
            if (r4 != 0) goto L12
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            goto L13
        L12:
            r0 = r4
        L13:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r6 == 0) goto L3e
            java.util.Set r6 = r6.entrySet()     // Catch: org.json.JSONException -> L3c
            java.util.Iterator r6 = r6.iterator()     // Catch: org.json.JSONException -> L3c
        L22:
            boolean r2 = r6.hasNext()     // Catch: org.json.JSONException -> L3c
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r6.next()     // Catch: org.json.JSONException -> L3c
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: org.json.JSONException -> L3c
            java.lang.Object r3 = r2.getKey()     // Catch: org.json.JSONException -> L3c
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L3c
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> L3c
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L3c
            goto L22
        L3c:
            goto L70
        L3e:
            java.lang.String r6 = "eventIndex"
            java.util.concurrent.atomic.AtomicLong r2 = com.bytedance.msdk.up.cw.xt     // Catch: org.json.JSONException -> L3c
            long r2 = r2.getAndIncrement()     // Catch: org.json.JSONException -> L3c
            r1.put(r6, r2)     // Catch: org.json.JSONException -> L3c
            java.lang.String r6 = "is_main_process"
            boolean r4 = com.bytedance.msdk.tl.s.j(r4)     // Catch: org.json.JSONException -> L3c
            r1.put(r6, r4)     // Catch: org.json.JSONException -> L3c
            java.lang.String r4 = "is_cypher_v4"
            com.bytedance.msdk.up.xt.j r6 = com.bytedance.msdk.core.xt.j()     // Catch: org.json.JSONException -> L3c
            boolean r6 = r6.j()     // Catch: org.json.JSONException -> L3c
            r1.put(r4, r6)     // Catch: org.json.JSONException -> L3c
            com.bytedance.msdk.core.j r4 = com.bytedance.msdk.core.j.qv()     // Catch: org.json.JSONException -> L3c
            boolean r4 = r4.g()     // Catch: org.json.JSONException -> L3c
            if (r4 == 0) goto L70
            java.lang.String r4 = "e2e_test_flag"
            java.lang.String r6 = "1"
            r1.put(r4, r6)     // Catch: org.json.JSONException -> L3c
        L70:
            if (r5 == 0) goto L7f
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "event_id"
            r5.j(r6, r4)
        L7f:
            org.json.JSONObject r4 = com.bytedance.msdk.up.j.j(r5, r1)
            boolean r6 = com.bytedance.msdk.up.cw.j
            if (r6 != 0) goto L8f
            com.bytedance.msdk.up.xt r6 = com.bytedance.msdk.up.xt.j()
            r6.j(r5, r4)
            return
        L8f:
            j(r0, r5, r4)
            return
    }

    private static void j(android.content.Context r2, com.bytedance.msdk.up.r r3, org.json.JSONObject r4) {
            java.lang.String r0 = "csj_mediation"
            boolean r1 = com.bytedance.sdk.component.tl.xt.j.j(r0)
            if (r1 == 0) goto Lb
            j(r2)
        Lb:
            com.bytedance.msdk.up.ae r2 = com.bytedance.msdk.up.ae.j(r2, r3, r4)
            r3 = 1
            com.bytedance.msdk.tl.r.xt.j(r2, r3)
            com.bytedance.sdk.component.tl.xt.r.j.j r3 = new com.bytedance.sdk.component.tl.xt.r.j.j
            java.lang.String r4 = r2.j
            r3.<init>(r4, r2)
            r2 = 3
            r3.j(r2)
            r2 = 2
            r3.xt(r2)
            com.bytedance.sdk.component.tl.xt.j.j(r3, r0)
            return
    }

    public static void xt(android.content.Context r3) {
            com.bytedance.msdk.up.xt r0 = com.bytedance.msdk.up.xt.j()     // Catch: java.lang.Throwable -> L30
            java.util.List r0 = r0.xt()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L30
            com.bytedance.msdk.up.xt$j r1 = (com.bytedance.msdk.up.xt.j) r1     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto Le
            com.bytedance.msdk.up.r r2 = r1.j()     // Catch: java.lang.Throwable -> L30
            org.json.JSONObject r1 = r1.xt()     // Catch: java.lang.Throwable -> L30
            j(r3, r2, r1)     // Catch: java.lang.Throwable -> L30
            goto Le
        L28:
            com.bytedance.msdk.up.xt r3 = com.bytedance.msdk.up.xt.j()     // Catch: java.lang.Throwable -> L30
            r3.cw()     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    public static boolean xt() {
            boolean r0 = com.bytedance.msdk.up.cw.j
            return r0
    }
}
