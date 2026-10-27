package com.bytedance.msdk.tl.cw.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt implements com.bytedance.sdk.openadsdk.core.wq.j.r.j {
    private static volatile com.bytedance.msdk.tl.cw.j.j.xt j;
    private com.bytedance.msdk.tl.cw.j.j.j xt;

    private xt() {
            r1 = this;
            r1.<init>()
            com.bytedance.msdk.tl.cw.j.j.j r0 = new com.bytedance.msdk.tl.cw.j.j.j
            r0.<init>()
            r1.xt = r0
            return
    }

    public static com.bytedance.msdk.tl.cw.j.j.xt j() {
            com.bytedance.msdk.tl.cw.j.j.xt r0 = com.bytedance.msdk.tl.cw.j.j.xt.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.tl.cw.j.j.xt> r0 = com.bytedance.msdk.tl.cw.j.j.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.tl.cw.j.j.xt r1 = com.bytedance.msdk.tl.cw.j.j.xt.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.tl.cw.j.j.xt r1 = new com.bytedance.msdk.tl.cw.j.j.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.tl.cw.j.j.xt.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.tl.cw.j.j.xt r0 = com.bytedance.msdk.tl.cw.j.j.xt.j
            return r0
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public int delete(android.net.Uri r2, java.lang.String r3, java.lang.String[] r4) {
            r1 = this;
            com.bytedance.msdk.tl.cw.j.j.j r0 = r1.xt
            int r2 = r0.delete(r2, r3, r4)
            return r2
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public java.lang.String getTableName() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public java.lang.String getType(android.net.Uri r2) {
            r1 = this;
            com.bytedance.msdk.tl.cw.j.j.j r0 = r1.xt
            java.lang.String r2 = r0.getType(r2)
            return r2
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public void init() {
            r0 = this;
            return
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public void injectContext(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public android.net.Uri insert(android.net.Uri r2, android.content.ContentValues r3) {
            r1 = this;
            com.bytedance.msdk.tl.cw.j.j.j r0 = r1.xt
            android.net.Uri r2 = r0.insert(r2, r3)
            return r2
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public android.database.Cursor query(android.net.Uri r7, java.lang.String[] r8, java.lang.String r9, java.lang.String[] r10, java.lang.String r11) {
            r6 = this;
            com.bytedance.msdk.tl.cw.j.j.j r0 = r6.xt
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public int update(android.net.Uri r2, android.content.ContentValues r3, java.lang.String r4, java.lang.String[] r5) {
            r1 = this;
            com.bytedance.msdk.tl.cw.j.j.j r0 = r1.xt
            int r2 = r0.update(r2, r3, r4, r5)
            return r2
    }
}
