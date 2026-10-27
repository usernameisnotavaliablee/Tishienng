package xyz.adscope.common.v2.dev.oaid.cn.oa.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SamsungDeviceIDHelper {
    private static final java.lang.String TAG = "SamsungDeviceIDHelper";
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> linkedBlockingQueue;
    private android.content.Context mContext;
    android.content.ServiceConnection serviceConnection;


    public SamsungDeviceIDHelper(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.linkedBlockingQueue = r0
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.SamsungDeviceIDHelper$1 r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.SamsungDeviceIDHelper$1
            r0.<init>(r2)
            r2.serviceConnection = r0
            r2.mContext = r3
            return
    }

    public void getSumsungID(xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper.AppIdsUpdater r5) {
            r4 = this;
            java.lang.String r0 = "com.samsung.android.deviceidservice"
            android.content.Context r1 = r4.mContext     // Catch: java.lang.Exception -> Ld
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> Ld
            r2 = 0
            r1.getPackageInfo(r0, r2)     // Catch: java.lang.Exception -> Ld
            goto L11
        Ld:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
        L11:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.samsung.android.deviceidservice.DeviceIdService"
            r1.setClassName(r0, r2)
            android.content.Context r0 = r4.mContext
            android.content.ServiceConnection r2 = r4.serviceConnection
            r3 = 1
            boolean r0 = r0.bindService(r1, r2, r3)
            if (r0 == 0) goto L41
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.linkedBlockingQueue     // Catch: java.lang.Exception -> L3d
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Exception -> L3d
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Exception -> L3d
            xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.SamsungIDInterface$Proxy r1 = new xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.SamsungIDInterface$Proxy     // Catch: java.lang.Exception -> L3d
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = r1.getID()     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L41
            r5.OnIdsValid(r0)     // Catch: java.lang.Exception -> L3d
            goto L41
        L3d:
            r5 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r5)
        L41:
            return
    }
}
