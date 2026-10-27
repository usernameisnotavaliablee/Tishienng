package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class ov implements com.bytedance.embedapplog.tk {
    private final com.bytedance.embedapplog.tk j;
    private com.bytedance.embedapplog.wf<java.lang.Boolean> xt;



    ov() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    ov(com.bytedance.embedapplog.tk r2) {
            r1 = this;
            r1.<init>()
            com.bytedance.embedapplog.ov$1 r0 = new com.bytedance.embedapplog.ov$1
            r0.<init>(r1)
            r1.xt = r0
            r1.j = r2
            return
    }

    private java.lang.String cw(android.content.Context r8) {
            r7 = this;
            r0 = 0
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: java.lang.Exception -> L14
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> L14
            r2 = 64
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r8, r2)     // Catch: java.lang.Exception -> L14
            if (r8 == 0) goto L16
            android.content.pm.Signature[] r8 = r8.signatures     // Catch: java.lang.Exception -> L14
            goto L1c
        L14:
            r8 = move-exception
            goto L18
        L16:
            r8 = r0
            goto L1c
        L18:
            com.bytedance.embedapplog.uc.j(r8)
            goto L16
        L1c:
            if (r8 == 0) goto L5c
            int r1 = r8.length
            if (r1 <= 0) goto L5c
            r1 = 0
            r8 = r8[r1]
            byte[] r8 = r8.toByteArray()
            java.lang.String r2 = "SHA1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Exception -> L52
            if (r2 == 0) goto L5c
            byte[] r8 = r2.digest(r8)     // Catch: java.lang.Exception -> L52
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L52
            r2.<init>()     // Catch: java.lang.Exception -> L52
            int r3 = r8.length     // Catch: java.lang.Exception -> L52
        L3a:
            if (r1 >= r3) goto L54
            r4 = r8[r1]     // Catch: java.lang.Exception -> L52
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | 256(0x100, float:3.59E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Exception -> L52
            r5 = 3
            r6 = 1
            java.lang.String r4 = r4.substring(r6, r5)     // Catch: java.lang.Exception -> L52
            r2.append(r4)     // Catch: java.lang.Exception -> L52
            int r1 = r1 + 1
            goto L3a
        L52:
            r8 = move-exception
            goto L59
        L54:
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L52
            return r8
        L59:
            com.bytedance.embedapplog.uc.j(r8)
        L5c:
            return r0
    }

    static /* synthetic */ java.lang.String j(com.bytedance.embedapplog.ov r0, android.content.Context r1) {
            java.lang.String r0 = r0.cw(r1)
            return r0
    }

    @Override // com.bytedance.embedapplog.tk
    public boolean j(android.content.Context r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.bytedance.embedapplog.wf<java.lang.Boolean> r1 = r3.xt
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r4
            java.lang.Object r0 = r1.xt(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            com.bytedance.embedapplog.tk r1 = r3.j
            if (r1 == 0) goto L22
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L22
            com.bytedance.embedapplog.tk r0 = r3.j
            boolean r4 = r0.j(r4)
            return r4
        L22:
            boolean r4 = r0.booleanValue()
            return r4
    }

    @Override // com.bytedance.embedapplog.tk
    public com.bytedance.embedapplog.tk.j xt(android.content.Context r5) {
            r4 = this;
            com.bytedance.embedapplog.tk r0 = r4.j
            if (r0 == 0) goto L1c
            com.bytedance.embedapplog.wf<java.lang.Boolean> r0 = r4.xt
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.xt(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1c
            com.bytedance.embedapplog.tk r0 = r4.j
            com.bytedance.embedapplog.tk$j r5 = r0.xt(r5)
            return r5
        L1c:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.heytap.openid"
            java.lang.String r3 = "com.heytap.openid.IdentifyService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            java.lang.String r1 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r0.setAction(r1)
            com.bytedance.embedapplog.oq r1 = new com.bytedance.embedapplog.oq
            com.bytedance.embedapplog.ov$2 r2 = new com.bytedance.embedapplog.ov$2
            r2.<init>(r4, r5)
            r1.<init>(r5, r0, r2)
            java.lang.Object r5 = r1.j()
            java.lang.String r5 = (java.lang.String) r5
            com.bytedance.embedapplog.tk$j r0 = new com.bytedance.embedapplog.tk$j
            r0.<init>()
            r0.xt = r5
            return r0
    }
}
