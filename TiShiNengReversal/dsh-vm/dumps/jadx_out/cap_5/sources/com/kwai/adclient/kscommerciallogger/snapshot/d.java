package com.kwai.adclient.kscommerciallogger.snapshot;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private final java.lang.String bfi;
    private final java.util.LinkedHashMap<java.lang.String, java.lang.String> bfj;
    private final long time;

    d(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.bfj = r0
            r2.bfi = r3
            long r0 = java.lang.System.nanoTime()
            r2.time = r0
            return
    }

    synchronized org.json.JSONObject Tq() {
            r4 = this;
            monitor-enter(r4)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r4.bfj     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
        L10:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            goto L10
        L2a:
            r0 = move-exception
            goto L3c
        L2c:
            java.lang.String r1 = "time"
            long r2 = r4.time     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            java.lang.String r1 = "span_name"
            java.lang.String r2 = r4.bfi     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2a org.json.JSONException -> L3a
        L3a:
            monitor-exit(r4)
            return r0
        L3c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }
}
