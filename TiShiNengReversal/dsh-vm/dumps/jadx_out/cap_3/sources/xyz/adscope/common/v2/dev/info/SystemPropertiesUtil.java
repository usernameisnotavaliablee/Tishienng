package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class SystemPropertiesUtil {
    public static final java.lang.String PROP_UTC = "ro.build.date.utc";
    private java.lang.reflect.Method sysPropGet;
    private java.lang.reflect.Method sysPropGetLong;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.dev.info.SystemPropertiesUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.dev.info.SystemPropertiesUtil instance;

        static {
                xyz.adscope.common.v2.dev.info.SystemPropertiesUtil r0 = new xyz.adscope.common.v2.dev.info.SystemPropertiesUtil
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.dev.info.SystemPropertiesUtil access$100() {
                xyz.adscope.common.v2.dev.info.SystemPropertiesUtil r0 = xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.InstanceHolder.instance
                return r0
        }
    }

    private SystemPropertiesUtil() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.dev.info.SystemPropertiesUtil r0 = xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.InstanceHolder.access$100()
            if (r0 != 0) goto Ld
            r2.initMethod()
            return
        Ld:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ SystemPropertiesUtil(xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String get(java.lang.String r3, java.lang.String r4) {
            xyz.adscope.common.v2.dev.info.SystemPropertiesUtil r0 = xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.InstanceHolder.access$100()     // Catch: java.lang.Throwable -> L21
            java.lang.reflect.Method r0 = r0.sysPropGet     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L21
            xyz.adscope.common.v2.dev.info.SystemPropertiesUtil r0 = xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.InstanceHolder.access$100()     // Catch: java.lang.Throwable -> L21
            java.lang.reflect.Method r0 = r0.sysPropGet     // Catch: java.lang.Throwable -> L21
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L21
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L21
            r3 = 1
            r1[r3] = r4     // Catch: java.lang.Throwable -> L21
            r3 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L21
            return r3
        L21:
            return r4
    }

    public static long getLong(java.lang.String r4, long r5) {
            xyz.adscope.common.v2.dev.info.SystemPropertiesUtil r0 = xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.InstanceHolder.access$100()     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r0 = r0.sysPropGetLong     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            xyz.adscope.common.v2.dev.info.SystemPropertiesUtil r0 = xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.InstanceHolder.access$100()     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r0 = r0.sysPropGetLong     // Catch: java.lang.Throwable -> L27
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L27
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L27
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.Throwable -> L27
            r4 = 1
            r2[r4] = r1     // Catch: java.lang.Throwable -> L27
            r4 = 0
            java.lang.Object r4 = r0.invoke(r4, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L27
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L27
            return r4
        L27:
            return r5
    }

    private void initMethod() {
            r6 = this;
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L2c
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.ClassNotFoundException -> L2c
            int r1 = r0.length     // Catch: java.lang.ClassNotFoundException -> L2c
            r2 = 0
        Lc:
            if (r2 >= r1) goto L2c
            r3 = r0[r2]     // Catch: java.lang.ClassNotFoundException -> L2c
            java.lang.String r4 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L2c
            java.lang.String r5 = "getLong"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L2c
            if (r5 == 0) goto L1f
            r6.sysPropGetLong = r3     // Catch: java.lang.ClassNotFoundException -> L2c
            goto L29
        L1f:
            java.lang.String r5 = "get"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L2c
            if (r4 == 0) goto L29
            r6.sysPropGet = r3     // Catch: java.lang.ClassNotFoundException -> L2c
        L29:
            int r2 = r2 + 1
            goto Lc
        L2c:
            return
    }
}
