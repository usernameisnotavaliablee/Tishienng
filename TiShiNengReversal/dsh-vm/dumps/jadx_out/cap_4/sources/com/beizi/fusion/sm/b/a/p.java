package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class p implements com.beizi.fusion.sm.b.c {
    private final android.content.Context a;

    public p(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public void a(com.beizi.fusion.sm.b.b r8) {
            r7 = this;
            android.content.Context r0 = r7.a
            if (r0 == 0) goto L72
            if (r8 != 0) goto L7
            goto L72
        L7:
            java.lang.String r0 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            android.content.Context r0 = r7.a     // Catch: java.lang.Exception -> L51
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Exception -> L51
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L51
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L53
            r0 = r1
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> L53
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "value"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L56
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L56
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r2.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "OAID query success: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L53
            r2.append(r0)     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L53
            com.beizi.fusion.sm.b.e.a(r2)     // Catch: java.lang.Throwable -> L53
            r8.a(r0)     // Catch: java.lang.Throwable -> L53
            r1.close()     // Catch: java.lang.Exception -> L51
            return
        L51:
            r0 = move-exception
            goto L6c
        L53:
            r0 = move-exception
            r2 = r0
            goto L5e
        L56:
            com.beizi.fusion.sm.b.d r0 = new com.beizi.fusion.sm.b.d     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "OAID query failed"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L53
            throw r0     // Catch: java.lang.Throwable -> L53
        L5e:
            throw r2     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            r3 = r0
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Exception -> L51
        L6b:
            throw r3     // Catch: java.lang.Exception -> L51
        L6c:
            com.beizi.fusion.sm.b.e.a(r0)
            r8.a(r0)
        L72:
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public boolean a() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = "persist.sys.identifierid.supported"
            java.lang.String r1 = "0"
            java.lang.String r0 = com.beizi.fusion.sm.b.f.a(r0, r1)
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            return r0
    }
}
