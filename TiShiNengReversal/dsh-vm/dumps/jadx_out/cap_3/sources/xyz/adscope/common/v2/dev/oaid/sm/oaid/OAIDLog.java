package xyz.adscope.common.v2.dev.oaid.sm.oaid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class OAIDLog {
    private static final java.lang.String TAG = "OAID";
    private static boolean enable;

    static {
            return
    }

    private OAIDLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void enable() {
            r0 = 1
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.enable = r0
            return
    }

    public static void print(java.lang.Object r1) {
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.enable
            if (r0 != 0) goto L5
            return
        L5:
            if (r1 != 0) goto L9
            java.lang.String r1 = "<null>"
        L9:
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "OAID"
            xyz.adscope.common.v2.log.SDKLog.d(r0, r1)
            return
    }
}
