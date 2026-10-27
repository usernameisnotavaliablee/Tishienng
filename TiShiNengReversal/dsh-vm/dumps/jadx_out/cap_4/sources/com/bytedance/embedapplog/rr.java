package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class rr implements com.bytedance.embedapplog.cw {
    private static volatile com.bytedance.embedapplog.rr j;
    private final java.util.concurrent.CopyOnWriteArraySet<com.bytedance.embedapplog.cw> xt;

    private rr() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.xt = r0
            return
    }

    public static com.bytedance.embedapplog.rr j() {
            com.bytedance.embedapplog.rr r0 = com.bytedance.embedapplog.rr.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.embedapplog.rr> r0 = com.bytedance.embedapplog.rr.class
            monitor-enter(r0)
            com.bytedance.embedapplog.rr r1 = com.bytedance.embedapplog.rr.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.embedapplog.rr r1 = new com.bytedance.embedapplog.rr     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.embedapplog.rr.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.embedapplog.rr r0 = com.bytedance.embedapplog.rr.j
            return r0
    }

    @Override // com.bytedance.embedapplog.cw
    public void j(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.bytedance.embedapplog.cw> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.bytedance.embedapplog.cw r1 = (com.bytedance.embedapplog.cw) r1
            r1.j(r3, r4, r5)
            goto L6
        L16:
            return
    }

    @Override // com.bytedance.embedapplog.cw
    public void j(boolean r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
            r10 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.bytedance.embedapplog.cw> r0 = r10.xt
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.bytedance.embedapplog.cw r2 = (com.bytedance.embedapplog.cw) r2
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r2.j(r3, r4, r5, r6, r7, r8, r9)
            goto L6
        L20:
            return
    }

    @Override // com.bytedance.embedapplog.cw
    public void j(boolean r3, org.json.JSONObject r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.bytedance.embedapplog.cw> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.bytedance.embedapplog.cw r1 = (com.bytedance.embedapplog.cw) r1
            r1.j(r3, r4)
            goto L6
        L16:
            return
    }

    @Override // com.bytedance.embedapplog.cw
    public void xt(boolean r3, org.json.JSONObject r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.bytedance.embedapplog.cw> r0 = r2.xt
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.bytedance.embedapplog.cw r1 = (com.bytedance.embedapplog.cw) r1
            r1.xt(r3, r4)
            goto L6
        L16:
            return
    }
}
