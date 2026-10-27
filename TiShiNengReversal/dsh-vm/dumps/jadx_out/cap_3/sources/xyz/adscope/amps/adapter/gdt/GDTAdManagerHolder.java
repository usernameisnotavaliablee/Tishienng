package xyz.adscope.amps.adapter.gdt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTAdManagerHolder {
    public GDTAdManagerHolder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getBidSdkInfo(java.lang.String r1) {
            com.qq.e.comm.managers.IGDTAdManager r0 = com.qq.e.comm.managers.GDTAdSdk.getGDTAdManger()     // Catch: java.lang.Exception -> L9
            java.lang.String r1 = r0.getSDKInfo(r1)     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static java.lang.String getBidToken() {
            r0 = 0
            com.qq.e.comm.managers.IGDTAdManager r1 = com.qq.e.comm.managers.GDTAdSdk.getGDTAdManger()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = r1.getBuyerId(r0)     // Catch: java.lang.Exception -> L9
        L9:
            return r0
    }

    public static void sendLossNotification(com.qq.e.comm.pi.IBidding r2, int r3) {
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GDTSDK sendLossNotification reason:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            r0 = 1
            if (r3 == r0) goto L21
            r0 = 2
            if (r3 == r0) goto L21
            r0 = 10001(0x2711, float:1.4014E-41)
        L21:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "lossReason"
            r3.put(r1, r0)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "adnId"
            r3.put(r1, r0)
            r2.sendLossNotification(r3)
            return
    }

    public static void sendWinNotification(com.qq.e.comm.pi.IBidding r3, int r4) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GDTSDK sendWinNotification ecpm:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r2 = "expectCostPrice"
            r0.put(r2, r1)
            int r4 = r4 + (-1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "highestLossPrice"
            r0.put(r1, r4)
            r3.sendWinNotification(r0)
            return
    }
}
