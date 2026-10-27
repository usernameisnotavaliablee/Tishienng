package xyz.adscope.common.v2.dev.oaid.sm.oaid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class DeviceIdentifier {
    private static volatile java.lang.String clientId;
    private static volatile java.lang.String oaid;
    private static volatile boolean registered;


    static {
            return
    }

    private DeviceIdentifier() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.String access$002(java.lang.String r0) {
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.oaid = r0
            return r0
    }

    public static java.lang.String getOAID(android.content.Context r2) {
            java.lang.String r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.oaid
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L34
            java.lang.Class<xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier> r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.class
            monitor-enter(r0)
            java.lang.String r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.oaid     // Catch: java.lang.Throwable -> L26
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L30
            java.lang.String r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.getOAID()     // Catch: java.lang.Throwable -> L26
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.oaid = r1     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.oaid     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L28
            java.lang.String r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.oaid     // Catch: java.lang.Throwable -> L26
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L30
            goto L28
        L26:
            r2 = move-exception
            goto L32
        L28:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier$1 r1 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier$1     // Catch: java.lang.Throwable -> L26
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.getOAID(r2, r1)     // Catch: java.lang.Throwable -> L26
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            goto L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r2
        L34:
            java.lang.String r2 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.oaid
            if (r2 != 0) goto L3c
            java.lang.String r2 = ""
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.oaid = r2
        L3c:
            java.lang.String r2 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.oaid
            return r2
    }

    public static void register(android.app.Application r2) {
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.registered
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Class<xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier> r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.class
            monitor-enter(r0)
            boolean r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.registered     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.register(r2)     // Catch: java.lang.Throwable -> L13
            r2 = 1
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.registered = r2     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }
}
