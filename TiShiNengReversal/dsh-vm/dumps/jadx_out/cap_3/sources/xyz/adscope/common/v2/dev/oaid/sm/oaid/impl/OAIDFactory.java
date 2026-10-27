package xyz.adscope.common.v2.dev.oaid.sm.oaid.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class OAIDFactory {
    private static xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID igaid;
    private static xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID ioaid;

    private OAIDFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID create(android.content.Context r1) {
            if (r1 == 0) goto Le
            boolean r0 = r1 instanceof android.app.Application
            if (r0 != 0) goto Le
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
        Le:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.ioaid
            if (r0 == 0) goto L13
            return r0
        L13:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r0 = createManufacturerImpl(r1)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.ioaid = r0
            if (r0 == 0) goto L42
            boolean r0 = r0.supported()
            if (r0 == 0) goto L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Manufacturer interface has been found: "
            r1.append(r0)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.ioaid
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r1)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.ioaid
            return r1
        L42:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r1 = createUniversalImpl(r1)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.ioaid = r1
            return r1
    }

    public static xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID createGaid(android.content.Context r1) {
            if (r1 == 0) goto Le
            boolean r0 = r1 instanceof android.app.Application
            if (r0 != 0) goto Le
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
        Le:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.igaid
            if (r0 == 0) goto L13
            return r0
        L13:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r1 = createGaidUniversalImpl(r1)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.igaid = r1
            return r1
    }

    private static xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID createGaidUniversalImpl(android.content.Context r1) {
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.GmsImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.GmsImpl
            r0.<init>(r1)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.igaid = r0
            boolean r1 = r0.supported()
            if (r1 == 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Google Play Service has been found: "
            r1.append(r0)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.igaid
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r1)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.igaid
            return r1
        L2e:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDFactory.igaid
            return r1
    }

    private static xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID createManufacturerImpl(android.content.Context r1) {
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isLenovo()
            if (r0 != 0) goto Lb0
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isMotolora()
            if (r0 == 0) goto Le
            goto Lb0
        Le:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isMeizu()
            if (r0 == 0) goto L1a
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.MeizuImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.MeizuImpl
            r0.<init>(r1)
            return r0
        L1a:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isNubia()
            if (r0 == 0) goto L26
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.NubiaImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.NubiaImpl
            r0.<init>(r1)
            return r0
        L26:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isXiaomi()
            if (r0 != 0) goto Laa
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isMiui()
            if (r0 != 0) goto Laa
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isBlackShark()
            if (r0 == 0) goto L3a
            goto Laa
        L3a:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isSamsung()
            if (r0 == 0) goto L46
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.SamsungImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.SamsungImpl
            r0.<init>(r1)
            return r0
        L46:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isVivo()
            if (r0 == 0) goto L52
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.VivoImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.VivoImpl
            r0.<init>(r1)
            return r0
        L52:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isASUS()
            if (r0 == 0) goto L5e
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.AsusImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.AsusImpl
            r0.<init>(r1)
            return r0
        L5e:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isHuawei()
            if (r0 != 0) goto La4
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isEmui()
            if (r0 == 0) goto L6b
            goto La4
        L6b:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isOppo()
            if (r0 != 0) goto L9e
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isOnePlus()
            if (r0 == 0) goto L78
            goto L9e
        L78:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isCoolpad(r1)
            if (r0 == 0) goto L84
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.CoolpadImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.CoolpadImpl
            r0.<init>(r1)
            return r0
        L84:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isCoosea()
            if (r0 == 0) goto L90
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.CooseaImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.CooseaImpl
            r0.<init>(r1)
            return r0
        L90:
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDRom.isFreeme()
            if (r0 == 0) goto L9c
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.FreemeImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.FreemeImpl
            r0.<init>(r1)
            return r0
        L9c:
            r1 = 0
            return r1
        L9e:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OppoImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OppoImpl
            r0.<init>(r1)
            return r0
        La4:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.HuaweiImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.HuaweiImpl
            r0.<init>(r1)
            return r0
        Laa:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.XiaomiImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.XiaomiImpl
            r0.<init>(r1)
            return r0
        Lb0:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.LenovoImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.LenovoImpl
            r0.<init>(r1)
            return r0
    }

    private static xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID createUniversalImpl(android.content.Context r2) {
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.MsaImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.MsaImpl
            r0.<init>(r2)
            boolean r1 = r0.supported()
            if (r1 == 0) goto L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "Mobile Security Alliance has been found: "
            r2.append(r1)
            java.lang.Class<xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.MsaImpl> r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.MsaImpl.class
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r2)
            return r0
        L26:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.GmsImpl r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.GmsImpl
            r0.<init>(r2)
            boolean r2 = r0.supported()
            if (r2 == 0) goto L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "Google Play Service has been found: "
            r2.append(r1)
            java.lang.Class<xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.GmsImpl> r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.GmsImpl.class
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r2)
            return r0
        L4c:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.DefaultImpl r2 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.DefaultImpl
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OAID was not supported: "
            r0.append(r1)
            java.lang.Class<xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.DefaultImpl> r1 = xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.DefaultImpl.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)
            return r2
    }
}
