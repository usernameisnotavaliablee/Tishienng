package xyz.adscope.common.v2.dev.oaid.cn.oa.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class MeizuDeviceIDHelper {
    private static final java.lang.String TAG = "MeizuDeviceIDHelper";
    private android.content.Context mContext;

    public MeizuDeviceIDHelper(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    private java.lang.String getOaid(android.database.Cursor r3) {
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
            if (r1 <= 0) goto L1a
            java.lang.String r0 = r3.getString(r1)
        L1a:
            java.lang.String r1 = "code"
            int r1 = r3.getColumnIndex(r1)
            if (r1 <= 0) goto L25
            r3.getInt(r1)
        L25:
            java.lang.String r1 = "expired"
            int r1 = r3.getColumnIndex(r1)
            if (r1 <= 0) goto L30
            r3.getLong(r1)
        L30:
            return r0
    }

    private boolean isMeizuSupport() {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.mContext     // Catch: java.lang.Exception -> L12
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L12
            if (r1 == 0) goto L12
            java.lang.String r2 = "com.meizu.flyme.openidsdk"
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r2, r0)     // Catch: java.lang.Exception -> L12
            if (r1 == 0) goto L12
            r0 = 1
        L12:
            return r0
    }

    public void getMeizuID(xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper.AppIdsUpdater r8) {
            r7 = this;
            android.content.Context r0 = r7.mContext     // Catch: java.lang.Exception -> Ld
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> Ld
            java.lang.String r1 = "com.meizu.flyme.openidsdk"
            r2 = 0
            r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> Ld
            goto L11
        Ld:
            r0 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
        L11:
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            android.content.Context r0 = r7.mContext
            android.content.ContentResolver r1 = r0.getContentResolver()
            java.lang.String r0 = "oaid"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L36
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r7.getOaid(r0)     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L33
            r8.OnIdsValid(r1)     // Catch: java.lang.Throwable -> L36
        L33:
            r0.close()     // Catch: java.lang.Throwable -> L36
        L36:
            return
    }
}
