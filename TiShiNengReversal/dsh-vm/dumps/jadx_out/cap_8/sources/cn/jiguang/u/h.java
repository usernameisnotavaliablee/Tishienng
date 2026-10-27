package cn.jiguang.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h {
    private static java.lang.String a = "";

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f1474b;

    static {
            return
    }

    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2) {
            java.lang.String r0 = cn.jiguang.u.h.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = cn.jiguang.u.f.c()
            cn.jiguang.u.h.a = r0
        Le:
            java.lang.String r0 = cn.jiguang.u.h.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4e
            if (r2 == 0) goto L47
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L4e
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r1)     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L4e
            android.os.Bundle r2 = r2.metaData     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L4e
            java.lang.String r0 = "JPUSH_APPKEY"
            java.lang.String r2 = a(r2, r0)     // Catch: java.lang.Throwable -> L4e
            cn.jiguang.u.h.a = r2     // Catch: java.lang.Throwable -> L4e
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L4e
            java.lang.String r2 = cn.jiguang.u.h.a     // Catch: java.lang.Throwable -> L4e
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r2.toLowerCase(r0)     // Catch: java.lang.Throwable -> L4e
            cn.jiguang.u.h.a = r2     // Catch: java.lang.Throwable -> L4e
            goto L4e
        L47:
            java.lang.String r2 = "MetaInfoFetcher"
            java.lang.String r0 = "[getAppKey] context is null"
            cn.jiguang.t.b.b(r2, r0)     // Catch: java.lang.Throwable -> L4e
        L4e:
            java.lang.String r2 = cn.jiguang.u.h.a
            return r2
    }

    public static java.lang.String a(android.os.Bundle r1, java.lang.String r2) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String b(android.content.Context r3) {
            java.lang.String r0 = cn.jiguang.u.h.f1474b
            if (r0 != 0) goto L61
            if (r3 == 0) goto L61
            java.lang.String r0 = cn.jiguang.u.f.d(r3)     // Catch: java.lang.Throwable -> L61
            cn.jiguang.u.h.f1474b = r0     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "MetaInfoFetcher"
            if (r0 == 0) goto L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "get option channel - "
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = cn.jiguang.u.h.f1474b     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
        L1f:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L61
            cn.jiguang.t.b.c(r1, r3)     // Catch: java.lang.Throwable -> L61
            goto L61
        L27:
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L61
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r2)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L51
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L51
            java.lang.String r0 = "JPUSH_CHANNEL"
            java.lang.String r3 = a(r3, r0)     // Catch: java.lang.Throwable -> L61
            cn.jiguang.u.h.f1474b = r3     // Catch: java.lang.Throwable -> L61
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L51
            java.lang.String r3 = cn.jiguang.u.h.f1474b     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = cn.jiguang.u.j.b(r3)     // Catch: java.lang.Throwable -> L61
            cn.jiguang.u.h.f1474b = r3     // Catch: java.lang.Throwable -> L61
        L51:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "manifest:channel - "
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = cn.jiguang.u.h.f1474b     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            goto L1f
        L61:
            java.lang.String r3 = cn.jiguang.u.h.f1474b
            return r3
    }
}
