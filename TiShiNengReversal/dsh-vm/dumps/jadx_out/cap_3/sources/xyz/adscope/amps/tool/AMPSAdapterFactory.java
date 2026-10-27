package xyz.adscope.amps.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSAdapterFactory {
    protected static xyz.adscope.amps.tool.AMPSAdapterFactory instance;

    static {
            xyz.adscope.amps.tool.AMPSAdapterFactory r0 = new xyz.adscope.amps.tool.AMPSAdapterFactory
            r0.<init>()
            xyz.adscope.amps.tool.AMPSAdapterFactory.instance = r0
            return
    }

    public AMPSAdapterFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.amps.base.AMPSBaseAdapter createAdapterClass(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L14
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<xyz.adscope.amps.base.AMPSBaseAdapter> r1 = xyz.adscope.amps.base.AMPSBaseAdapter.class
            java.lang.Class r2 = r2.asSubclass(r1)     // Catch: java.lang.Throwable -> L14
            xyz.adscope.amps.tool.AMPSAdapterFactory r1 = xyz.adscope.amps.tool.AMPSAdapterFactory.instance     // Catch: java.lang.Throwable -> L14
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = r1.internalCreateClass(r2)     // Catch: java.lang.Throwable -> L14
            return r2
        L14:
            return r0
    }

    public static xyz.adscope.amps.init.inter.AMPSChannelInitMediation createAdapterInit(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L14
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<xyz.adscope.amps.init.inter.AMPSChannelInitMediation> r1 = xyz.adscope.amps.init.inter.AMPSChannelInitMediation.class
            java.lang.Class r2 = r2.asSubclass(r1)     // Catch: java.lang.Throwable -> L14
            xyz.adscope.amps.tool.AMPSAdapterFactory r1 = xyz.adscope.amps.tool.AMPSAdapterFactory.instance     // Catch: java.lang.Throwable -> L14
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r2 = r1.internalCreateInit(r2)     // Catch: java.lang.Throwable -> L14
            return r2
        L14:
            return r0
    }

    protected xyz.adscope.amps.base.AMPSBaseAdapter internalCreateClass(java.lang.Class<? extends xyz.adscope.amps.base.AMPSBaseAdapter> r3) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L13
            r1 = 1
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = r3.newInstance(r0)     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.base.AMPSBaseAdapter r3 = (xyz.adscope.amps.base.AMPSBaseAdapter) r3     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            return r0
    }

    protected xyz.adscope.amps.init.inter.AMPSChannelInitMediation internalCreateInit(java.lang.Class<? extends xyz.adscope.amps.init.inter.AMPSChannelInitMediation> r3) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "getInstance"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L14
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L14
            java.lang.Object r3 = r3.invoke(r1, r0)     // Catch: java.lang.Throwable -> L14
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r3 = (xyz.adscope.amps.init.inter.AMPSChannelInitMediation) r3     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            return r0
    }
}
