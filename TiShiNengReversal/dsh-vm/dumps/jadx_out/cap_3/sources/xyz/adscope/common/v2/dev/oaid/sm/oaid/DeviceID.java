package xyz.adscope.common.v2.dev.oaid.sm.oaid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class DeviceID implements xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter {
    private android.app.Application application;
    private java.lang.String gaid;
    private java.lang.String oaid;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Holder {
        static final xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID INSTANCE = null;

        static {
                xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.Holder.INSTANCE = r0
                return
        }

        private Holder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private DeviceID() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ DeviceID(xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static void getGAID(android.content.Context r0, xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r1) {
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.createGaid(r0)
            r0.doGet(r1)
            return
    }

    public static java.lang.String getOAID() {
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.Holder.INSTANCE
            java.lang.String r0 = r0.oaid
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            return r0
    }

    public static void getOAID(android.content.Context r0, xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r1) {
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.create(r0)
            r0.doGet(r1)
            return
    }

    public static void register(android.app.Application r1) {
            if (r1 != 0) goto L3
            return
        L3:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.Holder.INSTANCE
            r0.application = r1
            getOAID(r1, r0)
            return
    }

    public static boolean supportedOAID(android.content.Context r0) {
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.create(r0)
            boolean r0 = r0.supported()
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter
    public void onOAIDGetComplete(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L11
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r2 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException
            java.lang.String r0 = "OAID is empty"
            r2.<init>(r0)
            r1.onOAIDGetError(r2)
            return
        L11:
            r1.oaid = r2
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter
    public void onOAIDGetError(java.lang.Exception r1) {
            r0 = this;
            return
    }
}
