package xyz.adscope.common.v2.dev.oaid.sm.oaid.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class MeizuImpl implements xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID {
    private final android.content.Context context;

    public MeizuImpl(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public void doGet(xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r8) {
            r7 = this;
            android.content.Context r0 = r7.context
            if (r0 == 0) goto L74
            if (r8 != 0) goto L7
            goto L74
        L7:
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            android.content.Context r0 = r7.context     // Catch: java.lang.Exception -> L56
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Exception -> L56
            java.lang.String r0 = "oaid"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L56
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L56
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L58
            r0 = r1
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> L58
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "value"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L5b
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "OAID query success: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L58
            r2.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L58
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r2)     // Catch: java.lang.Throwable -> L58
            r8.onOAIDGetComplete(r0)     // Catch: java.lang.Throwable -> L58
            r1.close()     // Catch: java.lang.Exception -> L56
            return
        L56:
            r0 = move-exception
            goto L6e
        L58:
            r0 = move-exception
            r2 = r0
            goto L63
        L5b:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "OAID query failed"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L63:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.lang.Throwable -> L69
            goto L6d
        L69:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Exception -> L56
        L6d:
            throw r2     // Catch: java.lang.Exception -> L56
        L6e:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)
            r8.onOAIDGetError(r0)
        L74:
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public boolean supported() {
            r3 = this;
            android.content.Context r0 = r3.context
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
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)
            return r1
    }
}
