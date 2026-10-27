package xyz.adscope.common.v2.dev.oaid.sm.oaid.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class XiaomiImpl implements xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID {
    private final android.content.Context context;
    private java.lang.Class<?> idProviderClass;
    private java.lang.Object idProviderImpl;

    @android.annotation.SuppressLint({"PrivateApi"})
    public XiaomiImpl(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            java.lang.String r1 = "com.android.id.impl.IdProviderImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L14
            r0.idProviderClass = r1     // Catch: java.lang.Exception -> L14
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L14
            r0.idProviderImpl = r1     // Catch: java.lang.Exception -> L14
            return
        L14:
            r1 = move-exception
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r1)
            return
    }

    private java.lang.String getOAID() {
            r5 = this;
            java.lang.Class<?> r0 = r5.idProviderClass
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r2[r3] = r4
            java.lang.String r4 = "getOAID"
            java.lang.reflect.Method r0 = r0.getMethod(r4, r2)
            java.lang.Object r2 = r5.idProviderImpl
            android.content.Context r4 = r5.context
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            java.lang.Object r0 = r0.invoke(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public void doGet(xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r4) {
            r3 = this;
            android.content.Context r0 = r3.context
            if (r0 == 0) goto L4f
            if (r4 != 0) goto L7
            goto L4f
        L7:
            java.lang.Class<?> r0 = r3.idProviderClass
            if (r0 == 0) goto L45
            java.lang.Object r0 = r3.idProviderImpl
            if (r0 != 0) goto L10
            goto L45
        L10:
            java.lang.String r0 = r3.getOAID()     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L36
            int r1 = r0.length()     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L34
            r1.<init>()     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "OAID query success: "
            r1.append(r2)     // Catch: java.lang.Exception -> L34
            r1.append(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L34
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r1)     // Catch: java.lang.Exception -> L34
            r4.onOAIDGetComplete(r0)     // Catch: java.lang.Exception -> L34
            return
        L34:
            r0 = move-exception
            goto L3e
        L36:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = "OAID query failed"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L34
            throw r0     // Catch: java.lang.Exception -> L34
        L3e:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)
            r4.onOAIDGetError(r0)
            return
        L45:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException
            java.lang.String r1 = "Xiaomi IdProvider not exists"
            r0.<init>(r1)
            r4.onOAIDGetError(r0)
        L4f:
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public boolean supported() {
            r1 = this;
            java.lang.Object r0 = r1.idProviderImpl
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
