package com.bytedance.msdk.m.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private static volatile com.bytedance.msdk.m.xt.xt cw;
    public com.bytedance.msdk.api.r.qv j;
    private final java.util.Map<java.lang.String, com.bytedance.msdk.j.j.r> xt;

    private xt() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.xt = r0
            return
    }

    private com.bytedance.msdk.j.j.r cw(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "pangle"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto Le
            com.bytedance.msdk.j.cw.j r2 = new com.bytedance.msdk.j.cw.j
            r2.<init>()
            return r2
        Le:
            com.bytedance.msdk.m.xt.r r2 = new com.bytedance.msdk.m.xt.r
            r2.<init>()
            return r2
    }

    public static com.bytedance.msdk.m.xt.xt j() {
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.cw
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.m.xt.xt> r0 = com.bytedance.msdk.m.xt.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.m.xt.xt r1 = com.bytedance.msdk.m.xt.xt.cw     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.m.xt.xt r1 = new com.bytedance.msdk.m.xt.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.m.xt.xt.cw = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.cw
            return r0
    }

    private void j(java.lang.String r2, com.bytedance.msdk.j.j.r r3) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.Map<java.lang.String, com.bytedance.msdk.j.j.r> r0 = r1.xt
            r0.put(r2, r3)
            return
    }

    private com.bytedance.msdk.j.j.r xt(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.Map<java.lang.String, com.bytedance.msdk.j.j.r> r0 = r1.xt
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.msdk.j.j.r r2 = (com.bytedance.msdk.j.j.r) r2
            return r2
    }

    public java.util.Collection<com.bytedance.msdk.j.j.r> cw() {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.j.j.r> r0 = r1.xt
            java.util.Collection r0 = r0.values()
            return r0
    }

    public synchronized com.bytedance.msdk.j.j.r j(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            com.bytedance.msdk.j.j.r r0 = r4.xt(r5)     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L3b
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L28
            com.bytedance.msdk.core.oq.j r1 = r1.j(r5)     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L2a
            com.bytedance.msdk.api.r.qv r2 = r4.j     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2a
            com.bytedance.msdk.core.oq.j r1 = new com.bytedance.msdk.core.oq.j     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.cw()     // Catch: java.lang.Throwable -> L28
            com.bytedance.msdk.api.r.qv r3 = r4.j     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.r()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r4.j = r2     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r5 = move-exception
            goto L3d
        L2a:
            if (r1 == 0) goto L36
            boolean r1 = r1.r()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L36
            com.bytedance.msdk.j.j.r r0 = r4.cw(r5)     // Catch: java.lang.Throwable -> L28
        L36:
            if (r0 == 0) goto L3b
            r4.j(r5, r0)     // Catch: java.lang.Throwable -> L28
        L3b:
            monitor-exit(r4)
            return r0
        L3d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            throw r5
    }

    public com.bytedance.msdk.j.j.r j(java.lang.String r1, com.bytedance.msdk.api.r.qv r2) {
            r0 = this;
            r0.j = r2
            com.bytedance.msdk.j.j.r r1 = r0.j(r1)
            return r1
    }

    public synchronized java.util.Map<java.lang.String, com.bytedance.msdk.j.j.r> xt() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.bytedance.msdk.j.j.r> r0 = r1.xt     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }
}
