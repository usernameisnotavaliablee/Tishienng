package xyz.adscope.amps.tool.persistent.sp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSSpUtil {
    private static final java.lang.String FILE_NAME = "amps_share_preference_config";

    public AMPSSpUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clear(android.content.Context r0) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            xyz.adscope.common.sp.CommonSpUtil.clear(r0)
            return
    }

    public static boolean contains(java.lang.String r1) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            boolean r1 = xyz.adscope.common.sp.CommonSpUtil.contains(r0, r1)
            return r1
    }

    public static java.lang.Object get(java.lang.String r2, java.lang.Object r3) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "amps_share_preference_config"
            java.lang.Object r2 = xyz.adscope.common.sp.CommonSpUtil.get(r0, r1, r2, r3)
            return r2
    }

    public static java.util.Map<java.lang.String, ?> getAll() {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            java.util.Map r0 = xyz.adscope.common.sp.CommonSpUtil.getAll(r0)
            return r0
    }

    public static java.lang.String getString(java.lang.String r2) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "amps_share_preference_config"
            java.lang.String r2 = xyz.adscope.common.sp.CommonSpUtil.getString(r0, r1, r2)
            return r2
    }

    public static void put(java.lang.String r2, java.lang.Object r3) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "amps_share_preference_config"
            xyz.adscope.common.sp.CommonSpUtil.putCommit(r0, r1, r2, r3)
            return
    }

    public static void putString(java.lang.String r2, java.lang.String r3) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "amps_share_preference_config"
            xyz.adscope.common.sp.CommonSpUtil.putString(r0, r1, r2, r3)
            return
    }

    public static void remove(java.lang.String r1) {
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            xyz.adscope.common.sp.CommonSpUtil.remove(r0, r1)
            return
    }
}
