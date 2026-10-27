package com.bytedance.msdk.tl.cw.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private final com.bytedance.sdk.openadsdk.core.multipro.j j;
    private com.bytedance.sdk.openadsdk.core.wq.j.r.j xt;

    public j() {
            r3 = this;
            r3.<init>()
            com.bytedance.sdk.openadsdk.core.multipro.j r0 = new com.bytedance.sdk.openadsdk.core.multipro.j
            com.bytedance.sdk.component.tl.xt.xt.xt.j r1 = new com.bytedance.sdk.component.tl.xt.xt.xt.j
            java.lang.String r2 = "csj_mediation"
            r1.<init>(r2)
            r0.<init>(r1)
            r3.j = r0
            return
    }

    private com.bytedance.sdk.openadsdk.core.wq.j.r.j j(android.net.Uri r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r5 = r5.getPath()
            java.lang.String r1 = "/"
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            r2 = 2
            java.lang.String r3 = "TTMediationSDK"
            if (r1 >= r2) goto L1a
            java.lang.String r5 = "uri is error2"
            com.bytedance.msdk.j.up.cw.j(r3, r5)
            return r0
        L1a:
            r1 = 1
            r5 = r5[r1]
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L29
            java.lang.String r5 = "uri is error3"
            com.bytedance.msdk.j.up.cw.j(r3, r5)
            return r0
        L29:
            com.bytedance.sdk.openadsdk.core.wq.j.r$j r1 = r4.xt
            if (r1 != 0) goto L37
            com.bytedance.msdk.tl.cw.j.j.cw r1 = new com.bytedance.msdk.tl.cw.j.j.cw
            r1.<init>()
            r4.xt = r1
            r1.init()
        L37:
            com.bytedance.sdk.openadsdk.core.wq.j.r$j r1 = r4.xt
            java.lang.String r1 = r1.getTableName()
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L46
            com.bytedance.sdk.openadsdk.core.wq.j.r$j r5 = r4.xt
            return r5
        L46:
            com.bytedance.sdk.openadsdk.core.multipro.j r1 = r4.j
            java.lang.String r1 = r1.getTableName()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L55
            com.bytedance.sdk.openadsdk.core.multipro.j r5 = r4.j
            return r5
        L55:
            java.lang.String r5 = "uri is error4"
            com.bytedance.msdk.j.up.cw.j(r3, r5)
            return r0
    }

    public int delete(@androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4) {
            r1 = this;
            com.bytedance.sdk.openadsdk.core.wq.j.r$j r0 = r1.j(r2)
            if (r0 == 0) goto Lb
            int r2 = r0.delete(r2, r3, r4)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public java.lang.String getType(@androidx.annotation.NonNull android.net.Uri r2) {
            r1 = this;
            com.bytedance.sdk.openadsdk.core.wq.j.r$j r0 = r1.j(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = r0.getType(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public android.net.Uri insert(@androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.Nullable android.content.ContentValues r3) {
            r1 = this;
            com.bytedance.sdk.openadsdk.core.wq.j.r$j r0 = r1.j(r2)
            if (r0 == 0) goto Lb
            android.net.Uri r2 = r0.insert(r2, r3)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public android.database.Cursor query(@androidx.annotation.NonNull android.net.Uri r7, @androidx.annotation.Nullable java.lang.String[] r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable java.lang.String[] r10, @androidx.annotation.Nullable java.lang.String r11) {
            r6 = this;
            com.bytedance.sdk.openadsdk.core.wq.j.r$j r0 = r6.j(r7)
            if (r0 == 0) goto L10
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            return r7
        L10:
            r7 = 0
            return r7
    }

    public int update(@androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.Nullable android.content.ContentValues r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String[] r5) {
            r1 = this;
            com.bytedance.sdk.openadsdk.core.wq.j.r$j r0 = r1.j(r2)
            if (r0 == 0) goto Lb
            int r2 = r0.update(r2, r3, r4, r5)
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
