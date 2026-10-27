package com.bytedance.msdk.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class qv implements com.bytedance.sdk.component.tl.j.m {
    public static final com.bytedance.msdk.up.qv j = null;
    private volatile android.database.sqlite.SQLiteDatabase xt;

    static {
            com.bytedance.msdk.up.qv r0 = new com.bytedance.msdk.up.qv
            r0.<init>()
            com.bytedance.msdk.up.qv.j = r0
            return
    }

    public qv() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.sdk.component.tl.j.m
    public java.lang.String cw() {
            r1 = this;
            java.lang.String r0 = "adevent_applog"
            return r0
    }

    @Override // com.bytedance.sdk.component.tl.j.m
    public android.database.sqlite.SQLiteDatabase j(android.content.Context r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.xt
            if (r0 != 0) goto L23
            monitor-enter(r1)
            android.database.sqlite.SQLiteDatabase r0 = r1.xt     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            com.bytedance.msdk.up.j.m r2 = com.bytedance.msdk.up.j.m.j(r2)     // Catch: java.lang.Throwable -> L1d
            com.bytedance.msdk.up.j.ae$j r2 = r2.j()     // Catch: java.lang.Throwable -> L1d
            android.database.sqlite.SQLiteDatabase r2 = r2.j()     // Catch: java.lang.Throwable -> L1d
            r1.xt = r2     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "---------------DB CREATE  SUCCESS new------------"
            com.bytedance.msdk.j.up.cw.j(r2)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r2 = move-exception
            goto L21
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            goto L23
        L21:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r2
        L23:
            android.database.sqlite.SQLiteDatabase r2 = r1.xt
            return r2
    }

    @Override // com.bytedance.sdk.component.tl.j.m
    public java.lang.String j() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.sdk.component.tl.j.m
    public java.lang.String m() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.sdk.component.tl.j.m
    public java.lang.String r() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.sdk.component.tl.j.m
    public java.lang.String up() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.sdk.component.tl.j.m
    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = "adevent"
            return r0
    }
}
