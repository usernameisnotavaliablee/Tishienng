package com.kwai.adclient.kscommerciallogger.snapshot;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private final java.lang.String bfc;
    private final java.util.LinkedList<com.kwai.adclient.kscommerciallogger.snapshot.d> bfd;
    private int bfe;
    private final int bff;
    private long bfg;

    c(java.lang.String r2) {
            r1 = this;
            r0 = 10
            r1.<init>(r2, r0)
            return
    }

    c(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
        L7:
            r0.bfc = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.bfd = r1
            r1 = 30
            int r1 = java.lang.Math.min(r2, r1)
            r0.bff = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.bfg = r1
            return
    }

    public final synchronized long Tr() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.bfg     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            com.kwai.adclient.kscommerciallogger.snapshot.c r3 = (com.kwai.adclient.kscommerciallogger.snapshot.c) r3
            java.lang.String r0 = r2.bfc
            java.lang.String r3 = r3.bfc
            boolean r3 = r0.equals(r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.bfc
            return r0
    }

    public synchronized com.kwai.adclient.kscommerciallogger.snapshot.d hP(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.LinkedList<com.kwai.adclient.kscommerciallogger.snapshot.d> r0 = r3.bfd     // Catch: java.lang.Throwable -> L11
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L11
            int r1 = r3.bff     // Catch: java.lang.Throwable -> L11
            if (r0 < r1) goto L13
            java.util.LinkedList<com.kwai.adclient.kscommerciallogger.snapshot.d> r0 = r3.bfd     // Catch: java.lang.Throwable -> L11
            r0.removeFirst()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r4 = move-exception
            goto L3f
        L13:
            com.kwai.adclient.kscommerciallogger.snapshot.d r0 = new com.kwai.adclient.kscommerciallogger.snapshot.d     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            r1.append(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "_"
            r1.append(r4)     // Catch: java.lang.Throwable -> L11
            int r4 = r3.bfe     // Catch: java.lang.Throwable -> L11
            int r2 = r4 + 1
            r3.bfe = r2     // Catch: java.lang.Throwable -> L11
            r1.append(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L11
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L11
            java.util.LinkedList<com.kwai.adclient.kscommerciallogger.snapshot.d> r4 = r3.bfd     // Catch: java.lang.Throwable -> L11
            r4.addLast(r0)     // Catch: java.lang.Throwable -> L11
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11
            r3.bfg = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return r0
        L3f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    synchronized org.json.JSONObject hQ(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            java.util.LinkedList<com.kwai.adclient.kscommerciallogger.snapshot.d> r2 = r4.bfd     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            com.kwai.adclient.kscommerciallogger.snapshot.d r3 = (com.kwai.adclient.kscommerciallogger.snapshot.d) r3     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            org.json.JSONObject r3 = r3.Tq()     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            r1.put(r3)     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            goto L11
        L25:
            r5 = move-exception
            goto L40
        L27:
            java.lang.String r2 = "session_id"
            r0.put(r2, r5)     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            java.lang.String r5 = "segment_name"
            java.lang.String r2 = r4.bfc     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            r0.put(r5, r2)     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            java.lang.String r5 = "spans"
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
            r4.bfg = r1     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L3e
        L3e:
            monitor-exit(r4)
            return r0
        L40:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r5
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.bfc
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }
}
