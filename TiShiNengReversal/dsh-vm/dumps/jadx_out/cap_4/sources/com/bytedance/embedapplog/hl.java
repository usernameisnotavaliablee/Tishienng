package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class hl extends com.bytedance.embedapplog.l {
    private final android.content.Context up;

    hl(android.content.Context r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            r2.up = r3
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r5) {
            r4 = this;
            android.content.Context r0 = r4.up
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            android.content.Context r2 = r4.up     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L14
            r3 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L14
            goto L19
        L14:
            r0 = move-exception
            com.bytedance.embedapplog.uc.xt(r0)
            r0 = r1
        L19:
            if (r0 == 0) goto L2f
            android.content.pm.Signature[] r0 = r0.signatures
            if (r0 == 0) goto L2f
            int r2 = r0.length
            if (r2 <= 0) goto L2f
            r2 = 0
            r0 = r0[r2]
            if (r0 == 0) goto L2f
            byte[] r0 = r0.toByteArray()
            java.lang.String r1 = com.bytedance.embedapplog.st.xt(r0)
        L2f:
            if (r1 == 0) goto L36
            java.lang.String r0 = "sig_hash"
            r5.put(r0, r1)
        L36:
            r5 = 1
            return r5
    }
}
