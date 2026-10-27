package xyz.adscope.common.info.deviceinfo;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SysProp {
    private static java.lang.reflect.Method a;
    private static java.lang.reflect.Method b;
    private static java.lang.reflect.Method c;

    static {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.ClassNotFoundException -> L38
            int r1 = r0.length     // Catch: java.lang.ClassNotFoundException -> L38
            r2 = 0
        Lc:
            if (r2 >= r1) goto L37
            r3 = r0[r2]     // Catch: java.lang.ClassNotFoundException -> L38
            java.lang.String r4 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L38
            java.lang.String r5 = "getLong"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L38
            if (r5 == 0) goto L1f
            xyz.adscope.common.info.deviceinfo.SysProp.a = r3     // Catch: java.lang.ClassNotFoundException -> L38
            goto L34
        L1f:
            java.lang.String r5 = "set"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L38
            if (r5 == 0) goto L2a
            xyz.adscope.common.info.deviceinfo.SysProp.c = r3     // Catch: java.lang.ClassNotFoundException -> L38
            goto L34
        L2a:
            java.lang.String r5 = "get"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L38
            if (r4 == 0) goto L34
            xyz.adscope.common.info.deviceinfo.SysProp.b = r3     // Catch: java.lang.ClassNotFoundException -> L38
        L34:
            int r2 = r2 + 1
            goto Lc
        L37:
            return
        L38:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r1, r0)
            return
    }

    private SysProp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String get(java.lang.String r3, java.lang.String r4) {
            java.lang.reflect.Method r0 = xyz.adscope.common.info.deviceinfo.SysProp.b     // Catch: java.lang.Throwable -> L13
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L13
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L13
            r3 = 1
            r1[r3] = r4     // Catch: java.lang.Throwable -> L13
            r3 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r0, r3)
            return r4
    }

    public static long getLong(java.lang.String r4, long r5) {
            java.lang.reflect.Method r0 = xyz.adscope.common.info.deviceinfo.SysProp.a     // Catch: java.lang.Throwable -> L1b
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L1b
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r2[r4] = r1     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            java.lang.Object r4 = r0.invoke(r4, r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L1b
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L1b
            return r4
        L1b:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r0, r4)
            return r5
    }

    public static void set(java.lang.String r3, java.lang.String r4) {
            java.lang.reflect.Method r0 = xyz.adscope.common.info.deviceinfo.SysProp.c     // Catch: java.lang.Throwable -> L10
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L10
            r3 = 1
            r1[r3] = r4     // Catch: java.lang.Throwable -> L10
            r3 = 0
            r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "e : "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r4, r3)
            return
    }
}
