package xyz.adscope.common.v2.dev.oaid.cn.oa.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LenovoDeviceIDHelper {
    xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface lenovoIDInterface;
    private android.content.Context mContext;
    android.content.ServiceConnection serviceConnection;


    public LenovoDeviceIDHelper(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.LenovoDeviceIDHelper$1 r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.LenovoDeviceIDHelper$1
            r0.<init>(r1)
            r1.serviceConnection = r0
            r1.mContext = r2
            return
    }

    public void getIdRun(xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper.AppIdsUpdater r5) {
            r4 = this;
            android.content.Context r0 = r4.mContext
            r0.getPackageName()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.zui.deviceidservice"
            java.lang.String r2 = "com.zui.deviceidservice.DeviceidService"
            r0.setClassName(r1, r2)
            android.content.Context r1 = r4.mContext
            android.content.ServiceConnection r2 = r4.serviceConnection
            r3 = 1
            boolean r0 = r1.bindService(r0, r2, r3)
            if (r0 == 0) goto L29
            xyz.adscope.common.v2.dev.oaid.cn.oa.interfaces.LenovoIDInterface r0 = r4.lenovoIDInterface
            if (r0 == 0) goto L29
            java.lang.String r0 = r0.a()
            if (r5 == 0) goto L29
            r5.OnIdsValid(r0)
        L29:
            return
    }
}
