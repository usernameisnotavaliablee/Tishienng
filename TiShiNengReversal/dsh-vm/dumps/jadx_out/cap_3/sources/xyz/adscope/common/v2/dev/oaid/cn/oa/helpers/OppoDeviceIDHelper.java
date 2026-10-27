package xyz.adscope.common.v2.dev.oaid.cn.oa.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class OppoDeviceIDHelper {
    private static final java.lang.String TAG = "OppoDeviceIDHelper";
    private android.content.Context mContext;
    public java.lang.String oaid;
    xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OppoIDInterface oppoIDInterface;
    android.content.ServiceConnection serviceConnection;
    private java.lang.String sign;


    public OppoDeviceIDHelper(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "OUID"
            r1.oaid = r0
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.OppoDeviceIDHelper$1 r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.OppoDeviceIDHelper$1
            r0.<init>(r1)
            r1.serviceConnection = r0
            r1.mContext = r2
            return
    }

    private boolean isSupportOppo() {
            r7 = this;
            r0 = 1
            android.content.Context r1 = r7.mContext     // Catch: java.lang.Exception -> L1c
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = "com.heytap.openid"
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Exception -> L1c
            if (r1 != 0) goto L11
            return r3
        L11:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1c
            r4 = 28
            if (r2 < r4) goto L1e
            long r1 = cn.jiguang.v.n.a(r1)     // Catch: java.lang.Exception -> L1c
            goto L21
        L1c:
            r1 = move-exception
            goto L29
        L1e:
            int r1 = r1.versionCode     // Catch: java.lang.Exception -> L1c
            long r1 = (long) r1
        L21:
            r4 = 1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L28
            return r3
        L28:
            return r0
        L29:
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            return r0
    }

    private java.lang.String realoGetIds(java.lang.String r10) {
            r9 = this;
            android.content.Context r0 = r9.mContext
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = r9.sign
            if (r1 != 0) goto L61
            r1 = 0
            android.content.Context r2 = r9.mContext     // Catch: java.lang.Exception -> L1a
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L1a
            r3 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r3)     // Catch: java.lang.Exception -> L1a
            android.content.pm.Signature[] r2 = r2.signatures     // Catch: java.lang.Exception -> L1a
            goto L1f
        L1a:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            r2 = r1
        L1f:
            if (r2 == 0) goto L5f
            int r3 = r2.length
            if (r3 <= 0) goto L5f
            r3 = 0
            r2 = r2[r3]
            byte[] r2 = r2.toByteArray()
            java.lang.String r4 = "SHA1"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Exception -> L55
            if (r4 == 0) goto L5f
            byte[] r2 = r4.digest(r2)     // Catch: java.lang.Exception -> L55
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L55
            r4.<init>()     // Catch: java.lang.Exception -> L55
            int r5 = r2.length     // Catch: java.lang.Exception -> L55
        L3d:
            if (r3 >= r5) goto L57
            r6 = r2[r3]     // Catch: java.lang.Exception -> L55
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | 256(0x100, float:3.59E-43)
            java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch: java.lang.Exception -> L55
            r7 = 3
            r8 = 1
            java.lang.String r6 = r6.substring(r8, r7)     // Catch: java.lang.Exception -> L55
            r4.append(r6)     // Catch: java.lang.Exception -> L55
            int r3 = r3 + 1
            goto L3d
        L55:
            r2 = move-exception
            goto L5c
        L57:
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L55
            goto L5f
        L5c:
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
        L5f:
            r9.sign = r1
        L61:
            xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OppoIDInterface r1 = r9.oppoIDInterface
            xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OppoIDInterface$up$down r1 = (xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OppoIDInterface.up.down) r1
            java.lang.String r2 = r9.sign
            java.lang.String r10 = r1.getSerID(r0, r2, r10)
            return r10
    }

    public java.lang.String getID(xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper.AppIdsUpdater r5) {
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L47
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.heytap.openid"
            java.lang.String r3 = "com.heytap.openid.IdentifyService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            java.lang.String r1 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r0.setAction(r1)
            android.content.Context r1 = r4.mContext
            android.content.ServiceConnection r2 = r4.serviceConnection
            r3 = 1
            boolean r0 = r1.bindService(r0, r2, r3)
            if (r0 == 0) goto L45
            r0 = 3000(0xbb8, double:1.482E-320)
            android.os.SystemClock.sleep(r0)     // Catch: java.lang.Exception -> L31
            goto L35
        L31:
            r0 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
        L35:
            xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.OppoIDInterface r0 = r4.oppoIDInterface
            if (r0 == 0) goto L45
            java.lang.String r0 = "OUID"
            java.lang.String r0 = r4.realoGetIds(r0)
            if (r5 == 0) goto L46
            r5.OnIdsValid(r0)
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
        L47:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot run on MainThread"
            r5.<init>(r0)
            throw r5
    }
}
