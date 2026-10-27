package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g {
    public static int a = 1;

    static {
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r7) {
            java.lang.String r0 = b(r7)
            boolean r1 = cn.jiguang.av.v.i(r0)
            if (r1 == 0) goto L11
            r1 = 3
        Lb:
            cn.jiguang.av.g.a = r1
            c(r7, r0)
            return r0
        L11:
            java.lang.String r0 = b(r7, r0)
            boolean r1 = cn.jiguang.av.v.i(r0)
            if (r1 == 0) goto L1d
            r1 = 1
            goto Lb
        L1d:
            java.lang.String r0 = d(r7)
            boolean r1 = cn.jiguang.av.v.i(r0)
            if (r1 == 0) goto L29
            r1 = 2
            goto Lb
        L29:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L38
            cn.jiguang.av.a r1 = cn.jiguang.av.a.a()
            java.lang.String r0 = r1.c(r7, r0)
            goto L3a
        L38:
            java.lang.String r0 = ""
        L3a:
            cn.jiguang.av.a r1 = cn.jiguang.av.a.a()
            java.lang.String r1 = r1.l(r7)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r1)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = cn.jiguang.av.v.d(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L6e
            r5 = r2
        L6e:
            r6 = 0
            cn.jiguang.av.g.a = r6
            cn.jiguang.ai.c r6 = new cn.jiguang.ai.c
            r6.<init>()
            cn.jiguang.ai.c r0 = r6.b(r0)
            cn.jiguang.ai.c r0 = r0.c(r1)
            cn.jiguang.ai.c r0 = r0.d(r2)
            cn.jiguang.ai.c r0 = r0.a(r3)
            cn.jiguang.ai.c r0 = r0.a(r5)
            r0.a(r7)
            c(r7, r5)
            return r5
    }

    private static java.lang.String a(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r2)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            java.lang.String r0 = "DeviceIdUtils"
            java.lang.String r2 = "Can not read from settings"
            cn.jiguang.w.f.l(r0, r2)
            return r1
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto La
            r0 = 1
            a(r1, r2, r0)
        La:
            return
    }

    private static void a(android.content.Context r2, java.lang.String r3, boolean r4) {
            java.lang.String r0 = cn.jiguang.a.a.f243j
            java.lang.String r3 = cn.jiguang.av.t.a(r3, r0)
            r0 = 1
            if (r4 != 0) goto Lf
            int r1 = cn.jiguang.av.g.a
            if (r1 == r0) goto Lf
            if (r1 != 0) goto L12
        Lf:
            d(r2, r3)
        L12:
            if (r4 != 0) goto L1b
            int r4 = cn.jiguang.av.g.a
            r1 = 2
            if (r4 == r1) goto L1b
            if (r4 != 0) goto L1e
        L1b:
            e(r2, r3)
        L1e:
            cn.jiguang.e.a r4 = cn.jiguang.e.a.b()
            cn.jiguang.e.a r3 = r4.a(r3)
            cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r0]
            r0 = 0
            r4[r0] = r3
            cn.jiguang.e.b.a(r2, r4)
            c(r2)
            return
    }

    public static java.lang.String b(android.content.Context r2) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.b()
            java.lang.Object r0 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L17
            java.lang.String r2 = cn.jiguang.a.a.f243j
            java.lang.String r2 = cn.jiguang.av.t.b(r0, r2)
            return r2
        L17:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.a()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L28
            return r2
        L28:
            r2 = 0
            return r2
    }

    private static java.lang.String b(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r0 = cn.jiguang.av.p.a(r2, r0)
            if (r0 == 0) goto L28
            java.lang.String r0 = "dig_n"
            java.lang.String r0 = a(r2, r3, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1b
            java.lang.String r2 = cn.jiguang.a.a.f243j
            java.lang.String r2 = cn.jiguang.av.t.b(r0, r2)
            return r2
        L1b:
            java.lang.String r0 = "dig"
            java.lang.String r2 = a(r2, r3, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L28
            return r2
        L28:
            r2 = 0
            return r2
    }

    private static void c(android.content.Context r4) {
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r0 = cn.jiguang.av.p.a(r4, r0)
            if (r0 == 0) goto L15
            android.content.ContentResolver r0 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "dig"
            java.lang.String r2 = ""
            android.provider.Settings.System.putString(r0, r1, r2)     // Catch: java.lang.Throwable -> L14
            goto L15
        L14:
        L15:
            java.lang.String r0 = "not write deviceId to SD"
            r1 = 1
            boolean r0 = cn.jiguang.internal.JConstants.isAndroidQ(r4, r1, r0)
            if (r0 != 0) goto L49
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = cn.jiguang.av.p.a(r4, r0)
            if (r0 == 0) goto L49
            java.lang.String r0 = cn.jiguang.av.a.g(r4)     // Catch: java.lang.Throwable -> L49
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L49
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r3.<init>()     // Catch: java.lang.Throwable -> L49
            r3.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = ".push_deviceid"
            r3.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L49
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.av.i.b(r2)     // Catch: java.lang.Throwable -> L49
        L49:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.a()
            r2 = 0
            cn.jiguang.e.a r0 = r0.a(r2)
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]
            r2 = 0
            r1[r2] = r0
            cn.jiguang.e.b.a(r4, r1)
            return
    }

    private static void c(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            a(r1, r2, r0)
            return
    }

    private static java.lang.String d(android.content.Context r3) {
            r0 = 1
            java.lang.String r1 = "do not get deviceId from SD"
            boolean r0 = cn.jiguang.internal.JConstants.isAndroidQ(r3, r0, r1)
            r1 = 0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r0 = cn.jiguang.av.p.a(r3, r0)
            if (r0 == 0) goto L33
            java.lang.String r0 = ".p"
            java.lang.String r0 = f(r3, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L26
            java.lang.String r3 = cn.jiguang.a.a.f243j
            java.lang.String r3 = cn.jiguang.av.t.b(r0, r3)
            return r3
        L26:
            java.lang.String r0 = ".push_deviceid"
            java.lang.String r3 = f(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L33
            return r3
        L33:
            return r1
    }

    private static java.lang.String d(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r0 = cn.jiguang.av.p.a(r1, r0)
            if (r0 == 0) goto L1c
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "dig_n"
            boolean r1 = android.provider.Settings.System.putString(r1, r0, r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L1c
            return r2
        L15:
            java.lang.String r1 = "DeviceIdUtils"
            java.lang.String r2 = "Can not write settings"
            cn.jiguang.w.f.l(r1, r2)
        L1c:
            r1 = 0
            return r1
    }

    private static java.lang.String e(android.content.Context r2, java.lang.String r3) {
            r0 = 1
            java.lang.String r1 = "not write deviceId to SD"
            boolean r0 = cn.jiguang.internal.JConstants.isAndroidQ(r2, r0, r1)
            if (r0 == 0) goto La
            return r3
        La:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = cn.jiguang.av.p.a(r2, r0)
            if (r0 == 0) goto L3d
            java.lang.String r2 = cn.jiguang.av.a.g(r2)     // Catch: java.lang.Throwable -> L3d
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L36
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r1.<init>()     // Catch: java.lang.Throwable -> L3d
            r1.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = ".p"
            r1.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            cn.jiguang.av.i.b(r0, r3)     // Catch: java.lang.Throwable -> L3d
            return r3
        L36:
            java.lang.String r2 = "DeviceIdUtils"
            java.lang.String r3 = "can't get sdcard data path"
            cn.jiguang.w.f.l(r2, r3)     // Catch: java.lang.Throwable -> L3d
        L3d:
            r2 = 0
            return r2
    }

    private static java.lang.String f(android.content.Context r2, java.lang.String r3) {
            java.lang.String r2 = cn.jiguang.av.a.g(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L3b
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            java.lang.String r2 = cn.jiguang.av.i.c(r0)
            if (r2 == 0) goto L42
            java.lang.String r3 = "\n"
            int r3 = r2.indexOf(r3)
            if (r3 >= 0) goto L31
            java.lang.String r2 = r2.trim()
            return r2
        L31:
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r3)
            java.lang.String r2 = r2.trim()
            return r2
        L3b:
            java.lang.String r2 = "DeviceIdUtils"
            java.lang.String r3 = "can't get sdcard data path"
            cn.jiguang.w.f.l(r2, r3)
        L42:
            r2 = 0
            return r2
    }
}
