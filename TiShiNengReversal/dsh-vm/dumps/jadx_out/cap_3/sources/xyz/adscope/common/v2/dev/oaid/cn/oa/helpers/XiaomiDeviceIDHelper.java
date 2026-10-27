package xyz.adscope.common.v2.dev.oaid.cn.oa.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class XiaomiDeviceIDHelper {
    private static final java.lang.String TAG = "XiaomiDeviceIDHelper";
    private java.lang.Object idImpl;
    private java.lang.Class idProvider;
    private android.content.Context mContext;
    private java.lang.reflect.Method oaid;

    public XiaomiDeviceIDHelper(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            r4.mContext = r5
            java.lang.String r5 = "com.android.id.impl.IdProviderImpl"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L14
            r4.idProvider = r5     // Catch: java.lang.Exception -> L14
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Exception -> L14
            r4.idImpl = r5     // Catch: java.lang.Exception -> L14
            goto L18
        L14:
            r5 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r5)
        L18:
            java.lang.Class r5 = r4.idProvider     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "getOAID"
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L2b
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r5 = r5.getMethod(r0, r1)     // Catch: java.lang.Exception -> L2b
            r4.oaid = r5     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r5 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r5)
        L2f:
            return
    }

    private java.lang.String invokeMethod(android.content.Context r4, java.lang.reflect.Method r5) {
            r3 = this;
            java.lang.Object r0 = r3.idImpl
            if (r0 == 0) goto L17
            if (r5 == 0) goto L17
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L13
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L13
            java.lang.Object r4 = r5.invoke(r0, r1)     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L13
            return r4
        L13:
            r4 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r4)
        L17:
            r4 = 0
            return r4
    }

    public java.lang.String getOAID() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.reflect.Method r1 = r2.oaid
            java.lang.String r0 = r2.invokeMethod(r0, r1)
            return r0
    }
}
