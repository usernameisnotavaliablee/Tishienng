package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class i implements com.beizi.fusion.sm.b.c {
    private final android.content.Context a;

    public i(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public void a(com.beizi.fusion.sm.b.b r8) {
            r7 = this;
            android.content.Context r0 = r7.a
            if (r0 == 0) goto L78
            if (r8 != 0) goto L8
            goto L78
        L8:
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            android.content.Context r0 = r7.a     // Catch: java.lang.Exception -> L57
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = "oaid"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L57
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L57
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L59
            r0 = r1
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> L59
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = "value"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5c
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L5c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "OAID query success: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L59
            r2.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L59
            com.beizi.fusion.sm.b.e.a(r2)     // Catch: java.lang.Throwable -> L59
            r8.a(r0)     // Catch: java.lang.Throwable -> L59
            r1.close()     // Catch: java.lang.Exception -> L57
            return
        L57:
            r0 = move-exception
            goto L72
        L59:
            r0 = move-exception
            r2 = r0
            goto L64
        L5c:
            com.beizi.fusion.sm.b.d r0 = new com.beizi.fusion.sm.b.d     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "OAID query failed"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L59
            throw r0     // Catch: java.lang.Throwable -> L59
        L64:
            throw r2     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            r3 = r0
            if (r1 == 0) goto L71
            r1.close()     // Catch: java.lang.Throwable -> L6d
            goto L71
        L6d:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Exception -> L57
        L71:
            throw r3     // Catch: java.lang.Exception -> L57
        L72:
            com.beizi.fusion.sm.b.e.a(r0)
            r8.a(r0)
        L78:
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public boolean a() {
            r3 = this;
            android.content.Context r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "com.meizu.flyme.openidsdk"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r1)     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            return r1
        L15:
            r0 = move-exception
            com.beizi.fusion.sm.b.e.a(r0)
            return r1
    }
}
