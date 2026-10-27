package com.bytedance.msdk.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class cw {
    private final java.util.concurrent.atomic.AtomicBoolean cw;
    private com.bytedance.msdk.j.j.cw j;
    private final java.util.Set<java.lang.String> xt;


    public cw() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r2.xt = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.cw = r0
            return
    }

    private synchronized void cw(com.bytedance.msdk.api.r.qv r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.up()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L9
            monitor-exit(r3)
            return
        L9:
            java.lang.String r0 = r3.cw()     // Catch: java.lang.Throwable -> L5a
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L6c
            java.util.Map r0 = r3.j()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L64
            java.lang.String r1 = "adn_name"
            java.lang.String r2 = r3.xt()     // Catch: java.lang.Throwable -> L5a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "q_x_c"
            com.bytedance.msdk.ae.j.j r2 = com.bytedance.msdk.ae.j.j.j()     // Catch: java.lang.Throwable -> L5a
            int r2 = r2.r()     // Catch: java.lang.Throwable -> L5a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "wf_q_x_c"
            com.bytedance.msdk.ae.j.j r2 = com.bytedance.msdk.ae.j.j.j()     // Catch: java.lang.Throwable -> L5a
            int r2 = r2.up()     // Catch: java.lang.Throwable -> L5a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L5a
            com.bytedance.msdk.m.xt.xt r1 = com.bytedance.msdk.m.xt.xt.j()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r3.xt()     // Catch: java.lang.Throwable -> L5a
            com.bytedance.msdk.j.j.r r4 = r1.j(r2, r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L5c
            r3.j(r4, r0)     // Catch: java.lang.Throwable -> L5a
            r3.r()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r3)
            return
        L5a:
            r4 = move-exception
            goto L7c
        L5c:
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "configuration is null"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            throw r4     // Catch: java.lang.Throwable -> L5a
        L64:
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "adn init getConfig() is null"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            throw r4     // Catch: java.lang.Throwable -> L5a
        L6c:
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "adn init "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            throw r4     // Catch: java.lang.Throwable -> L5a
        L7c:
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = r3.xt()     // Catch: java.lang.Throwable -> L93
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.Throwable -> L93
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L93
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L93
            com.bytedance.msdk.m.xt.j.j(r0, r1)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r3)
            return
        L93:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L93
            throw r4
    }

    static /* synthetic */ com.bytedance.msdk.j.j.cw j(com.bytedance.msdk.m.j.cw r0) {
            com.bytedance.msdk.j.j.cw r0 = r0.j
            return r0
    }

    private synchronized void j(com.bytedance.msdk.j.j.r r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
            r5 = this;
            monitor-enter(r5)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "TMe"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "--==--time: start "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r5.xt()     // Catch: java.lang.Throwable -> L2a
            r3.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            com.bytedance.msdk.j.up.cw.j(r2, r3)     // Catch: java.lang.Throwable -> L2a
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L2a
            com.bytedance.msdk.m.j.cw$1 r3 = new com.bytedance.msdk.m.j.cw$1     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L2a
            r6.j(r2, r7, r3)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r5)
            return
        L2a:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
            throw r6
    }

    static /* synthetic */ java.util.Set xt(com.bytedance.msdk.m.j.cw r0) {
            java.util.Set<java.lang.String> r0 = r0.xt
            return r0
    }

    private void xt(com.bytedance.msdk.api.r.qv r3) {
            r2 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r1 = r2.xt()
            com.bytedance.msdk.core.oq.j r0 = r0.j(r1)
            if (r3 != 0) goto L2a
            if (r0 != 0) goto L2a
            java.lang.String r0 = "pangle_custom"
            java.lang.String r1 = r2.xt()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "pangle"
            java.lang.String r1 = r2.xt()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            goto L2a
        L29:
            return
        L2a:
            r2.cw(r3)
            return
    }

    protected com.bytedance.msdk.core.oq.j ae() {
            r2 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r1 = r2.xt()
            com.bytedance.msdk.core.oq.j r0 = r0.j(r1)
            return r0
    }

    protected abstract java.lang.String cw();

    protected abstract java.util.Map<java.lang.String, java.lang.Object> j();

    public void j(com.bytedance.msdk.api.r.qv r1) {
            r0 = this;
            r0.xt(r1)
            return
    }

    public void j(com.bytedance.msdk.api.r.qv r1, com.bytedance.msdk.j.j.cw r2) {
            r0 = this;
            r0.j = r2
            r0.xt(r1)
            return
    }

    public void m() {
            r1 = this;
            r0 = 0
            r1.xt(r0)
            return
    }

    public final synchronized void r() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.cw     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized void tl() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.up()     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            r1.m()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto Lf
        Ld:
            monitor-exit(r1)
            return
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public final synchronized boolean up() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.cw     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    protected abstract java.lang.String xt();
}
