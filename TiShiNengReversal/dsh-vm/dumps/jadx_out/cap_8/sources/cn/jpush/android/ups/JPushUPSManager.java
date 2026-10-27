package cn.jpush.android.ups;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JPushUPSManager {
    private static final java.lang.String TAG = "JPushUPSManager";

    public JPushUPSManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void registerToken(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, cn.jpush.android.ups.UPSRegisterCallBack r4) {
            int r2 = cn.jpush.android.ups.UPSPushHelper.getNextRid()     // Catch: java.lang.Throwable -> Lc
            long r2 = (long) r2     // Catch: java.lang.Throwable -> Lc
            cn.jpush.android.ups.UPSPushHelper.createMapping(r0, r2, r4)     // Catch: java.lang.Throwable -> Lc
            cn.jiguang.api.JCoreManager.register(r0, r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[registerToken] failed:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JPushUPSManager"
            cn.jpush.android.helper.Logger.e(r1, r0)
            if (r4 == 0) goto L35
            cn.jpush.android.ups.TokenResult r0 = new cn.jpush.android.ups.TokenResult
            java.lang.String r1 = ""
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1, r2)
            r4.onResult(r0)
        L35:
            return
    }

    public static void turnOffPush(android.content.Context r2, cn.jpush.android.ups.UPSTurnCallBack r3) {
            java.lang.String r0 = "ups.turnOff"
            r1 = 0
            cn.jpush.android.ups.UPSPushHelper.callResult(r2, r0, r1, r3)
            return
    }

    public static void turnOnPush(android.content.Context r2, cn.jpush.android.ups.UPSTurnCallBack r3) {
            java.lang.String r0 = "ups.turnOn"
            r1 = 0
            cn.jpush.android.ups.UPSPushHelper.callResult(r2, r0, r1, r3)
            return
    }

    public static void unRegisterToken(android.content.Context r2, cn.jpush.android.ups.UPSUnRegisterCallBack r3) {
            int r0 = cn.jpush.android.ups.UPSPushHelper.getNextRid()     // Catch: java.lang.Throwable -> Lc
            long r0 = (long) r0     // Catch: java.lang.Throwable -> Lc
            cn.jpush.android.ups.UPSPushHelper.createMapping(r2, r0, r3)     // Catch: java.lang.Throwable -> Lc
            cn.jiguang.api.JCoreManager.unRegister(r2)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[unRegisterToken] failed:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "JPushUPSManager"
            cn.jpush.android.helper.Logger.e(r0, r2)
            if (r3 == 0) goto L35
            cn.jpush.android.ups.TokenResult r2 = new cn.jpush.android.ups.TokenResult
            java.lang.String r0 = ""
            r1 = 1000(0x3e8, float:1.401E-42)
            r2.<init>(r0, r1)
            r3.onResult(r2)
        L35:
            return
    }
}
