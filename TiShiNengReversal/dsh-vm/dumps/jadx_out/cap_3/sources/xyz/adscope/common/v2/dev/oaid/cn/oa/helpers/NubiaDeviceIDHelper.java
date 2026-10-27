package xyz.adscope.common.v2.dev.oaid.cn.oa.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class NubiaDeviceIDHelper {
    private static final java.lang.String TAG = "NubiaDeviceIDHelper";
    private android.content.Context mConetxt;

    public NubiaDeviceIDHelper(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mConetxt = r1
            return
    }

    public java.lang.String getNubiaID() {
            r5 = this;
            java.lang.String r0 = "content://cn.nubia.identity/identity"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L21
            android.content.Context r3 = r5.mConetxt     // Catch: java.lang.Exception -> L21
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L21
            android.content.ContentProviderClient r0 = r3.acquireContentProviderClient(r0)     // Catch: java.lang.Exception -> L21
            java.lang.String r3 = "getOAID"
            android.os.Bundle r3 = r0.call(r3, r1, r1)     // Catch: java.lang.Exception -> L21
            r4 = 24
            if (r2 < r4) goto L23
            androidx.core.provider.c.a(r0)     // Catch: java.lang.Exception -> L21
            goto L26
        L21:
            r0 = move-exception
            goto L3c
        L23:
            r0.release()     // Catch: java.lang.Exception -> L21
        L26:
            java.lang.String r0 = "code"
            r2 = -1
            int r0 = r3.getInt(r0, r2)     // Catch: java.lang.Exception -> L21
            if (r0 != 0) goto L36
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Exception -> L21
            return r0
        L36:
            java.lang.String r0 = "message"
            r3.getString(r0)     // Catch: java.lang.Exception -> L21
            return r1
        L3c:
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
            return r1
    }
}
