package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class et implements com.bytedance.embedapplog.tk {
    private static final com.bytedance.embedapplog.wf<java.lang.Boolean> j = null;


    static {
            com.bytedance.embedapplog.et$1 r0 = new com.bytedance.embedapplog.et$1
            r0.<init>()
            com.bytedance.embedapplog.et.j = r0
            return
    }

    et(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    private static java.lang.String j(@androidx.annotation.NonNull android.content.Context r8, int r9, java.lang.String r10) {
            r1 = 0
            if (r9 == 0) goto L2a
            r0 = 1
            if (r9 == r0) goto L1b
            r0 = 2
            if (r9 == r0) goto Lb
            r3 = r1
            goto L31
        Lb:
            java.lang.String r9 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r9 = r9.concat(r10)
            android.net.Uri r9 = android.net.Uri.parse(r9)
        L19:
            r3 = r9
            goto L31
        L1b:
            java.lang.String r9 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r9 = r9.concat(r10)
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L19
        L2a:
            java.lang.String r9 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L19
        L31:
            if (r3 == 0) goto L6e
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            if (r8 == 0) goto L59
            boolean r9 = r8.moveToNext()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            if (r9 == 0) goto L59
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            java.lang.String r1 = r8.getString(r9)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L56
            goto L59
        L52:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L6a
        L56:
            r0 = move-exception
            r9 = r0
            goto L63
        L59:
            com.bytedance.embedapplog.ri.j(r8)
            return r1
        L5d:
            r0 = move-exception
            r9 = r0
            goto L6a
        L60:
            r0 = move-exception
            r9 = r0
            r8 = r1
        L63:
            com.bytedance.embedapplog.uc.j(r9)     // Catch: java.lang.Throwable -> L52
            com.bytedance.embedapplog.ri.j(r8)
            goto L6e
        L6a:
            com.bytedance.embedapplog.ri.j(r1)
            throw r9
        L6e:
            return r1
    }

    static /* synthetic */ java.lang.String j(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = xt(r0, r1)
            return r0
    }

    static boolean j() {
            com.bytedance.embedapplog.wf<java.lang.Boolean> r0 = com.bytedance.embedapplog.et.j
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.xt(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private static java.lang.String xt(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = android.os.SystemProperties.get(r0, r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            return r1
    }

    @Override // com.bytedance.embedapplog.tk
    public boolean j(android.content.Context r1) {
            r0 = this;
            boolean r1 = j()
            return r1
    }

    @Override // com.bytedance.embedapplog.tk
    public com.bytedance.embedapplog.tk.j xt(android.content.Context r4) {
            r3 = this;
            com.bytedance.embedapplog.tk$j r0 = new com.bytedance.embedapplog.tk$j
            r0.<init>()
            r1 = 0
            r2 = 0
            java.lang.String r4 = j(r4, r1, r2)
            r0.xt = r4
            return r0
    }
}
