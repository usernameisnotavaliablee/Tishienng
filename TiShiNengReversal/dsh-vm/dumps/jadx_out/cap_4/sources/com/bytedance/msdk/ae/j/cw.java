package com.bytedance.msdk.ae.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private static volatile com.bytedance.msdk.ae.j.cw j;
    private java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> cw;
    private volatile java.util.Map<java.lang.Integer, com.bytedance.msdk.tl.l> xt;



    private cw() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.xt = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cw = r0
            return
    }

    private void cw(org.json.JSONArray r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.bytedance.msdk.ae.j.cw$1 r0 = new com.bytedance.msdk.ae.j.cw$1
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static com.bytedance.msdk.ae.j.cw j() {
            com.bytedance.msdk.ae.j.cw r0 = com.bytedance.msdk.ae.j.cw.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.ae.j.cw> r0 = com.bytedance.msdk.ae.j.cw.class
            monitor-enter(r0)
            com.bytedance.msdk.ae.j.cw r1 = com.bytedance.msdk.ae.j.cw.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.ae.j.cw r1 = new com.bytedance.msdk.ae.j.cw     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.ae.j.cw.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.ae.j.cw r0 = com.bytedance.msdk.ae.j.cw.j
            return r0
    }

    private synchronized com.bytedance.msdk.tl.l j(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Integer, com.bytedance.msdk.tl.l> r0 = r2.xt     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1d
            com.bytedance.msdk.tl.l r0 = (com.bytedance.msdk.tl.l) r0     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.j(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Map<java.lang.Integer, com.bytedance.msdk.tl.l> r1 = r2.xt     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1d
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            goto L21
        L1f:
            monitor-exit(r2)
            return r0
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    static /* synthetic */ com.bytedance.msdk.tl.l j(com.bytedance.msdk.ae.j.cw r0, int r1) {
            com.bytedance.msdk.tl.l r0 = r0.j(r1)
            return r0
    }

    private java.lang.String j(int r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 != 0) goto L53
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            r4 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            r4 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            r4 = 9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            goto L5a
        L53:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
        L5a:
            java.util.Iterator r4 = r0.iterator()
        L5e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.bytedance.msdk.tl.l r0 = r3.j(r0)
            java.lang.String r0 = r0.xt(r5)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L5e
            return r0
        L7d:
            return r1
    }

    static /* synthetic */ java.util.Map j(com.bytedance.msdk.ae.j.cw r0) {
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> r0 = r0.cw
            return r0
    }

    static /* synthetic */ void j(com.bytedance.msdk.ae.j.cw r0, com.bytedance.msdk.core.oq.xt r1) {
            r0.j(r1)
            return
    }

    private synchronized void j(com.bytedance.msdk.core.oq.xt r6) {
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto Lfa
            java.lang.String r0 = r6.rn()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto Lfa
            boolean r0 = r6.oq()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L46
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.g r1 = r6.g()     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2c
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.g r1 = r6.g()     // Catch: java.lang.Throwable -> L29
            r0.xt(r1)     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            r6 = move-exception
            goto Lf8
        L2c:
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.ae r1 = r6.tl()     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L74
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.ae r1 = r6.tl()     // Catch: java.lang.Throwable -> L29
            r0.xt(r1)     // Catch: java.lang.Throwable -> L29
            goto L74
        L46:
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r6.rn()     // Catch: java.lang.Throwable -> L29
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r0.r(r1)     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r6.rn()     // Catch: java.lang.Throwable -> L29
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r0.g(r1)     // Catch: java.lang.Throwable -> L29
        L74:
            java.util.List r0 = r6.ol()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L29
        L7c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto Lfa
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1     // Catch: java.lang.Throwable -> L29
            boolean r2 = r1.r()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto Lc1
            com.bytedance.msdk.core.tl.vl r2 = com.bytedance.msdk.core.tl.vl.j()     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.g r3 = r1.cw()     // Catch: java.lang.Throwable -> L29
            boolean r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto La7
            com.bytedance.msdk.core.tl.vl r2 = com.bytedance.msdk.core.tl.vl.j()     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.g r3 = r1.cw()     // Catch: java.lang.Throwable -> L29
            r2.xt(r3)     // Catch: java.lang.Throwable -> L29
        La7:
            com.bytedance.msdk.core.tl.qv r2 = com.bytedance.msdk.core.tl.qv.j()     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.ae r3 = r1.xt()     // Catch: java.lang.Throwable -> L29
            boolean r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L7c
            com.bytedance.msdk.core.tl.qv r2 = com.bytedance.msdk.core.tl.qv.j()     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.ae r1 = r1.xt()     // Catch: java.lang.Throwable -> L29
            r2.xt(r1)     // Catch: java.lang.Throwable -> L29
            goto L7c
        Lc1:
            com.bytedance.msdk.core.tl.vl r2 = com.bytedance.msdk.core.tl.vl.j()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r6.rn()     // Catch: java.lang.Throwable -> L29
            r3.append(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r1.w()     // Catch: java.lang.Throwable -> L29
            r2.delete(r3, r4)     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.core.tl.qv r2 = com.bytedance.msdk.core.tl.qv.j()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r6.rn()     // Catch: java.lang.Throwable -> L29
            r3.append(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.w()     // Catch: java.lang.Throwable -> L29
            r2.delete(r3, r1)     // Catch: java.lang.Throwable -> L29
            goto L7c
        Lf8:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L29
            throw r6
        Lfa:
            monitor-exit(r5)
            return
    }

    private synchronized void j(java.util.Map<java.lang.String, java.lang.String> r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L17
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto La
            goto L17
        La:
            com.bytedance.msdk.ae.j.cw$2 r0 = new com.bytedance.msdk.ae.j.cw$2     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L14
            com.bytedance.msdk.j.up.m.r(r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
        L17:
            monitor-exit(r1)
            return
    }

    private synchronized void xt(org.json.JSONArray r8) {
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L6b
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L49
            if (r0 <= 0) goto L6b
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> r0 = r7.cw     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            r0.clear()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            java.util.Map r0 = com.bytedance.msdk.cw.tl.r.xt     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            r0.clear()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            r1 = 0
            r2 = 0
        L1a:
            int r3 = r8.length()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            if (r2 >= r3) goto L50
            org.json.JSONObject r3 = r8.getJSONObject(r2)     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            com.bytedance.msdk.core.oq.xt r4 = com.bytedance.msdk.core.oq.xt.j(r3, r1)     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            if (r4 == 0) goto L4d
            java.lang.String r5 = r4.rn()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            if (r5 != 0) goto L4d
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> r5 = r7.cw     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            java.lang.String r6 = r4.rn()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            r5.put(r6, r4)     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            java.lang.String r4 = r4.rn()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            goto L4d
        L49:
            r8 = move-exception
            goto L69
        L4b:
            r8 = move-exception
            goto L65
        L4d:
            int r2 = r2 + 1
            goto L1a
        L50:
            r7.j(r0)     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            com.bytedance.msdk.cw.tl.r.j()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.j()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            java.lang.String r1 = "prime_rit_count"
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            r0.j(r1, r8)     // Catch: java.lang.Throwable -> L49 org.json.JSONException -> L4b
            monitor-exit(r7)
            return
        L65:
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Throwable -> L49
            goto L6b
        L69:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L49
            throw r8
        L6b:
            monitor-exit(r7)
            return
    }

    public synchronized boolean cw() {
            r3 = this;
            monitor-enter(r3)
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.j()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "prime_rit_count"
            r2 = -1
            int r0 = r0.xt(r1, r2)     // Catch: java.lang.Throwable -> L14
            if (r0 <= 0) goto L11
            monitor-exit(r3)
            r0 = 0
            return r0
        L11:
            monitor-exit(r3)
            r0 = 1
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public synchronized com.bytedance.msdk.core.oq.xt j(java.lang.String r2, int r3, int r4) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L33
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> r0 = r1.cw     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L21
            com.bytedance.msdk.core.oq.xt r0 = (com.bytedance.msdk.core.oq.xt) r0     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L23
            java.lang.String r3 = r1.j(r3, r2)     // Catch: java.lang.Throwable -> L21
            com.bytedance.msdk.core.oq.xt r0 = com.bytedance.msdk.core.oq.xt.ae(r3)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L23
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> r3 = r1.cw     // Catch: java.lang.Throwable -> L21
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r2 = move-exception
            goto L36
        L23:
            r2 = 102(0x66, float:1.43E-43)
            if (r4 != r2) goto L29
            monitor-exit(r1)
            return r0
        L29:
            com.bytedance.msdk.core.oq.xt r2 = com.bytedance.msdk.core.g.r.j(r0, r4)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L31
            monitor-exit(r1)
            return r2
        L31:
            monitor-exit(r1)
            return r0
        L33:
            monitor-exit(r1)
            r2 = 0
            return r2
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r2
    }

    public synchronized void j(org.json.JSONArray r1) {
            r0 = this;
            monitor-enter(r0)
            r0.xt(r1)     // Catch: java.lang.Throwable -> L9
            r0.cw(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public synchronized void xt() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.xt> r0 = r1.cw     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.clear()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }
}
