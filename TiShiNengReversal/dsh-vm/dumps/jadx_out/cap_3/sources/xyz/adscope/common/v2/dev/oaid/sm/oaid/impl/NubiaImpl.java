package xyz.adscope.common.v2.dev.oaid.sm.oaid.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class NubiaImpl implements xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID {
    private final android.content.Context context;

    public NubiaImpl(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public void doGet(xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r6) {
            r5 = this;
            android.content.Context r0 = r5.context
            if (r0 == 0) goto La1
            if (r6 != 0) goto L8
            goto La1
        L8:
            boolean r0 = r5.supported()
            if (r0 != 0) goto L1c
            java.lang.String r0 = "Only supports Android 10.0 and above for Nubia"
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r1 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException
            r1.<init>(r0)
            r6.onOAIDGetError(r1)
            return
        L1c:
            java.lang.String r0 = "content://cn.nubia.identity/identity"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L40
            android.content.Context r1 = r5.context     // Catch: java.lang.Exception -> L40
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L40
            android.content.ContentProviderClient r0 = r1.acquireContentProviderClient(r0)     // Catch: java.lang.Exception -> L40
            if (r0 != 0) goto L2f
            goto La1
        L2f:
            java.lang.String r1 = "getOAID"
            r2 = 0
            android.os.Bundle r1 = r0.call(r1, r2, r2)     // Catch: java.lang.Exception -> L40
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L40
            r4 = 24
            if (r3 < r4) goto L42
            androidx.core.provider.c.a(r0)     // Catch: java.lang.Exception -> L40
            goto L45
        L40:
            r0 = move-exception
            goto L9b
        L42:
            r0.release()     // Catch: java.lang.Exception -> L40
        L45:
            if (r1 == 0) goto L93
            java.lang.String r0 = "code"
            r3 = -1
            int r0 = r1.getInt(r0, r3)     // Catch: java.lang.Exception -> L40
            if (r0 != 0) goto L56
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)     // Catch: java.lang.Exception -> L40
        L56:
            if (r2 == 0) goto L76
            int r0 = r2.length()     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r0.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = "OAID query success: "
            r0.append(r1)     // Catch: java.lang.Exception -> L40
            r0.append(r2)     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L40
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)     // Catch: java.lang.Exception -> L40
            r6.onOAIDGetComplete(r2)     // Catch: java.lang.Exception -> L40
            return
        L76:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException     // Catch: java.lang.Exception -> L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r2.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = "OAID query failed: "
            r2.append(r3)     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = "message"
            java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Exception -> L40
            r2.append(r1)     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L40
            r0.<init>(r1)     // Catch: java.lang.Exception -> L40
            throw r0     // Catch: java.lang.Exception -> L40
        L93:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = "OAID query failed: bundle is null"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L40
            throw r0     // Catch: java.lang.Exception -> L40
        L9b:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)
            r6.onOAIDGetError(r0)
        La1:
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    @android.annotation.SuppressLint({"AnnotateVersionCheck"})
    public boolean supported() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
