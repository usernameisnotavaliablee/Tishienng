package xyz.adscope.amps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSSDK {
    public AMPSSDK() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context getContext() {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            return r0
    }

    public static xyz.adscope.amps.init.AMPSInitConfig getInitConfig() {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.init.AMPSInitConfig r0 = r0.getAMPSAdConfig()
            return r0
    }

    public static java.lang.String getSdkVersion() {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            java.lang.String r0 = r0.getSdkVersion()
            return r0
    }

    public static void init(android.content.Context r1, xyz.adscope.amps.init.AMPSInitConfig r2, xyz.adscope.amps.init.inter.IAMPSInitCallback r3) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            r0.initialize(r1, r2, r3)
            return
    }

    public static boolean isInterrupterIntent(android.content.Context r1, android.content.Intent r2) {
            xyz.adscope.amps.tool.util.AMPSIntentInterrupter r0 = xyz.adscope.amps.tool.util.AMPSIntentInterrupter.getInstance()
            boolean r1 = r0.interruptRpkDeeplink(r1, r2)
            return r1
    }

    public static xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus sdkInitStatus() {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r0 = r0.sdkInitStatus()
            return r0
    }

    public static void setPersonalRecommend(boolean r1) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.init.AMPSInitConfig r0 = r0.getAMPSAdConfig()
            if (r0 == 0) goto Ld
            r0.setPersonalRecommend(r1)
        Ld:
            return
    }

    public static void updatePrivacyConfig(xyz.adscope.amps.config.AMPSPrivacyConfig r1) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            r0.setAMPSPrivacyConfig(r1)
            return
    }
}
