package xyz.adscope.common.v2.dev.oaid.cn.oa.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ZTEDeviceIDHelper {
    private static final java.lang.String TAG = "ZTEDeviceIDHelper";
    java.lang.String idPkgName;
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> linkedBlockingQueue;
    android.content.Context mContext;
    android.content.ServiceConnection serviceConnection;


    public ZTEDeviceIDHelper(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "com.mdid.msa"
            r2.idPkgName = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.linkedBlockingQueue = r0
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ZTEDeviceIDHelper$1 r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ZTEDeviceIDHelper$1
            r0.<init>(r2)
            r2.serviceConnection = r0
            r2.mContext = r3
            return
    }

    private int checkService() {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.mContext     // Catch: java.lang.Exception -> Le
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> Le
            java.lang.String r2 = r3.idPkgName     // Catch: java.lang.Exception -> Le
            r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> Le
            r0 = 1
            return r0
        Le:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            return r0
    }

    private void startMsaklServer(java.lang.String r4) {
            r3 = this;
            r3.checkService()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r3.idPkgName
            java.lang.String r2 = "com.mdid.msa.service.MsaKlService"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "com.bun.msa.action.start.service"
            r0.setAction(r1)
            java.lang.String r1 = "com.bun.msa.param.pkgname"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "com.bun.msa.param.runinset"
            r1 = 1
            r0.putExtra(r4, r1)     // Catch: java.lang.Exception -> L25
            android.content.Context r4 = r3.mContext     // Catch: java.lang.Exception -> L25
            r4.startService(r0)     // Catch: java.lang.Exception -> L25
            return
        L25:
            r4 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r4)
            return
    }

    public void getID(xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper.AppIdsUpdater r5) {
            r4 = this;
            android.content.Context r0 = r4.mContext     // Catch: java.lang.Exception -> Ld
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> Ld
            java.lang.String r1 = r4.idPkgName     // Catch: java.lang.Exception -> Ld
            r2 = 0
            r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> Ld
            goto L11
        Ld:
            r0 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
        L11:
            android.content.Context r0 = r4.mContext
            java.lang.String r0 = r0.getPackageName()
            r4.startMsaklServer(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.mdid.msa"
            java.lang.String r3 = "com.mdid.msa.service.MsaIdService"
            r1.setClassName(r2, r3)
            java.lang.String r2 = "com.bun.msa.action.bindto.service"
            r1.setAction(r2)
            java.lang.String r2 = "com.bun.msa.param.pkgname"
            r1.putExtra(r2, r0)
            android.content.Context r0 = r4.mContext
            android.content.ServiceConnection r2 = r4.serviceConnection
            r3 = 1
            boolean r0 = r0.bindService(r1, r2, r3)
            if (r0 == 0) goto L62
            java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> r0 = r4.linkedBlockingQueue     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.ZTEIDInterface$up$down r1 = new xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.ZTEIDInterface$up$down     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r0 = r1.getOAID()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            if (r5 == 0) goto L56
            r5.OnIdsValid(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            goto L56
        L52:
            r5 = move-exception
            goto L5e
        L54:
            r5 = move-exception
            goto L5f
        L56:
            android.content.Context r5 = r4.mContext     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            android.content.ServiceConnection r0 = r4.serviceConnection     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r5.unbindService(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            goto L62
        L5e:
            throw r5
        L5f:
            xyz.adscope.common.v2.log.SDKLog.stack(r5)
        L62:
            return
    }
}
