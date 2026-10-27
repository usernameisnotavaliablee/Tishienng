package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DefaultDatabaseErrorHandler implements net.sqlcipher.DatabaseErrorHandler {
    private final java.lang.String TAG;

    public DefaultDatabaseErrorHandler() {
            r1 = this;
            r1.<init>()
            java.lang.Class<net.sqlcipher.DefaultDatabaseErrorHandler> r0 = net.sqlcipher.DefaultDatabaseErrorHandler.class
            java.lang.String r0 = r0.getSimpleName()
            r1.TAG = r0
            return
    }

    private void deleteDatabaseFile(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ":memory:"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L20
            java.lang.String r0 = r2.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L13
            goto L20
        L13:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L1c
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1c
            r0.delete()     // Catch: java.lang.Exception -> L1c
            return
        L1c:
            r2 = move-exception
            r2.getMessage()
        L20:
            return
    }

    @Override // net.sqlcipher.DatabaseErrorHandler
    public void onCorruption(net.sqlcipher.database.SQLiteDatabase r2) {
            r1 = this;
            r2.getPath()
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto Lc
            r2.close()     // Catch: java.lang.Exception -> Lc
        Lc:
            java.lang.String r2 = r2.getPath()
            r1.deleteDatabaseFile(r2)
            return
    }
}
