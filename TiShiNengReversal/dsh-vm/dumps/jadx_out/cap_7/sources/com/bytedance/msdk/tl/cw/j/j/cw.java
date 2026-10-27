package com.bytedance.msdk.tl.cw.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw implements com.bytedance.sdk.openadsdk.core.wq.j.r.j {
    private com.bytedance.msdk.tl.j.j j;

    public cw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            com.bytedance.msdk.tl.j.j r1 = r0.j
            if (r1 == 0) goto L9
            r1.xt(r2, r3)
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public java.lang.String getTableName() {
            r1 = this;
            java.lang.String r0 = "gromore_prime_rit_adn_perform"
            return r0
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public void init() {
            r2 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 == 0) goto L11
            com.bytedance.msdk.tl.j.j r0 = new com.bytedance.msdk.tl.j.j
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            r0.<init>(r1)
            r2.j = r0
        L11:
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
            com.bytedance.msdk.tl.j.j r0 = r1.j
            if (r0 == 0) goto L8
            r0.j(r3)
            return r2
        L8:
            r2 = 0
            return r2
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            com.bytedance.msdk.tl.j.j r1 = r0.j
            if (r1 == 0) goto L9
            android.database.Cursor r1 = r1.j(r3, r4)
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.j.r.j
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}
