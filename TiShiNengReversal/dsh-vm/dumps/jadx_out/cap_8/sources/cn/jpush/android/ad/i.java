package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {
    private static java.lang.String a;

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r0 = androidx.work.impl.utils.d.a()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static java.lang.String a(android.content.Context r0) {
            java.lang.String r0 = cn.jpush.android.ad.i.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = cn.jpush.android.ad.i.a
            return r0
        Lb:
            java.lang.String r0 = a()
            cn.jpush.android.ad.i.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = cn.jpush.android.ad.i.a
            return r0
        L1a:
            java.lang.String r0 = b()
            cn.jpush.android.ad.i.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r0 = cn.jpush.android.ad.i.a
            return r0
        L29:
            java.lang.String r0 = c()
            cn.jpush.android.ad.i.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L38
            java.lang.String r0 = cn.jpush.android.ad.i.a
            goto L3a
        L38:
            java.lang.String r0 = ""
        L3a:
            cn.jpush.android.ad.i.a = r0
            return r0
    }

    private static java.lang.String b() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L23
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "currentProcessName"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L23
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L23
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r1 = move-exception
            goto L26
        L25:
            return r0
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getCurrentProcessNameByActivityThread failed, "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ProcessUtil"
            cn.jpush.android.helper.Logger.w(r2, r1)
            return r0
    }

    private static java.lang.String c() {
            r0 = 0
            java.lang.String r1 = "/proc/self/cmdline"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L31
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L31
            r0 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r4 = 0
        Le:
            int r5 = r2.read()     // Catch: java.lang.Throwable -> L1d
            if (r5 <= 0) goto L20
            if (r4 >= r0) goto L20
            int r6 = r4 + 1
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1d
            r1[r4] = r5     // Catch: java.lang.Throwable -> L1d
            r4 = r6
            goto Le
        L1d:
            r0 = r2
            goto L32
        L20:
            if (r4 <= 0) goto L2d
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "UTF-8"
            r0.<init>(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
            r2.close()     // Catch: java.lang.Throwable -> L2c
        L2c:
            return r0
        L2d:
            r2.close()     // Catch: java.lang.Throwable -> L37
            goto L37
        L31:
        L32:
            if (r0 == 0) goto L37
            r0.close()     // Catch: java.lang.Throwable -> L37
        L37:
            java.lang.String r0 = ""
            return r0
    }
}
