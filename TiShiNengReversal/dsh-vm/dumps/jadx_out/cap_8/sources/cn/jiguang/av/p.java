package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class p {
    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.List<java.lang.String> a(android.content.Context r3, java.util.List<java.lang.String> r4) {
            if (r4 == 0) goto L29
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L29
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = a(r3, r1)
            if (r2 != 0) goto L12
            r0.add(r1)
            goto L12
        L28:
            return r0
        L29:
            r3 = 0
            return r3
    }

    public static boolean a(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L18
            r2 = 23
            r3 = 1
            if (r1 < r2) goto L35
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L18
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L18
            if (r1 < r2) goto L1a
            int r4 = androidx.core.app.q.a(r4, r5)     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L17
            return r3
        L17:
            return r0
        L18:
            r4 = move-exception
            goto L36
        L1a:
            java.lang.String r5 = cn.jiguang.av.f0.a(r5)     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L21
            return r3
        L21:
            java.lang.String r1 = "appops"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch: java.lang.Throwable -> L18
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L18
            int r4 = cn.jiguang.av.g0.a(r1, r5, r4)     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L34
            return r3
        L34:
            return r0
        L35:
            return r3
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "checkPermission error:"
            r5.append(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "PermissionUtils"
            cn.jiguang.w.f.i(r5, r4)
            return r0
    }

    public static boolean b(android.content.Context r4, java.lang.String r5) {
            if (r4 == 0) goto L40
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L40
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            android.content.pm.PackageInfo r4 = cn.jiguang.av.o.a(r4, r0)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L3f
            java.lang.String[] r4 = r4.requestedPermissions     // Catch: java.lang.Throwable -> L24
            int r0 = r4.length     // Catch: java.lang.Throwable -> L24
            r2 = 0
        L15:
            if (r2 >= r0) goto L3f
            r3 = r4[r2]     // Catch: java.lang.Throwable -> L24
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L21
            r4 = 1
            return r4
        L21:
            int r2 = r2 + 1
            goto L15
        L24:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "hasPermissionDefined error:"
            r5.append(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "PermissionUtils"
            cn.jiguang.w.f.j(r5, r4)
        L3f:
            return r1
        L40:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "empty params"
            r4.<init>(r5)
            throw r4
    }
}
