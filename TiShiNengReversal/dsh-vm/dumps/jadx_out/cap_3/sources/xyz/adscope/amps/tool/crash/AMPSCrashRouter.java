package xyz.adscope.amps.tool.crash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSCrashRouter implements xyz.adscope.amps.tool.crash.inter.ICrashRouter {
    public AMPSCrashRouter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.amps.tool.crash.inter.ICrashRouter
    public boolean lastLaunchCrashedBecauseOfSDK() {
            r2 = this;
            java.lang.String r0 = "amps_crash_reason_key"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.get(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
