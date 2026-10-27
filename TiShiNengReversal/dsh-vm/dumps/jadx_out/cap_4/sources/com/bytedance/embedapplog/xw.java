package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class xw implements com.bytedance.embedapplog.tk {
    private com.bytedance.embedapplog.wf<java.lang.Boolean> j;


    xw() {
            r1 = this;
            r1.<init>()
            com.bytedance.embedapplog.xw$1 r0 = new com.bytedance.embedapplog.xw$1
            r0.<init>(r1)
            r1.j = r0
            return
    }

    private java.lang.String j(android.database.Cursor r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.isClosed()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r3.moveToFirst()
            java.lang.String r1 = "value"
            int r1 = r3.getColumnIndex(r1)
            if (r1 < 0) goto L1b
            java.lang.String r3 = r3.getString(r1)
            return r3
        L1b:
            return r0
    }

    @Override // com.bytedance.embedapplog.tk
    public boolean j(android.content.Context r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.bytedance.embedapplog.wf<java.lang.Boolean> r1 = r3.j
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r4
            java.lang.Object r4 = r1.xt(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
    }

    @Override // com.bytedance.embedapplog.tk
    public com.bytedance.embedapplog.tk.j xt(android.content.Context r8) {
            r7 = this;
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            android.content.ContentResolver r1 = r8.getContentResolver()
            r8 = 0
            java.lang.String r0 = "oaid"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L1e
            com.bytedance.embedapplog.ri.j(r1)
            return r8
        L1e:
            com.bytedance.embedapplog.tk$j r0 = new com.bytedance.embedapplog.tk$j     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r7.j(r1)     // Catch: java.lang.Throwable -> L2d
            r0.xt = r2     // Catch: java.lang.Throwable -> L2d
            com.bytedance.embedapplog.ri.j(r1)
            return r0
        L2d:
            r0 = move-exception
            goto L31
        L2f:
            r0 = move-exception
            r1 = r8
        L31:
            com.bytedance.embedapplog.uc.j(r0)     // Catch: java.lang.Throwable -> L38
            com.bytedance.embedapplog.ri.j(r1)
            return r8
        L38:
            r0 = move-exception
            r8 = r0
            com.bytedance.embedapplog.ri.j(r1)
            throw r8
    }
}
