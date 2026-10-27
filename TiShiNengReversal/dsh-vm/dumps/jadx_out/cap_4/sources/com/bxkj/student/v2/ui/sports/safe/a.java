package com.bxkj.student.v2.ui.sports.safe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.v2.ui.sports.safe.a$a, reason: collision with other inner class name */
    class C0162a implements s.b.a {
        C0162a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // s.b.a
        public void a() {
                r1 = this;
                java.lang.String r0 = "requestQueryAllPackages->onSucceed"
                com.orhanobut.logger.j.c(r0)
                return
        }

        @Override // s.b.a
        public void b(@androidx.annotation.NonNull java.lang.String[] r1) {
                r0 = this;
                java.lang.String r1 = "requestQueryAllPackages->onRejectAndNoAsk"
                com.orhanobut.logger.j.c(r1)
                return
        }

        @Override // s.b.a
        public void c(@androidx.annotation.NonNull java.lang.String[] r1) {
                r0 = this;
                java.lang.String r1 = "requestQueryAllPackages->onReject"
                com.orhanobut.logger.j.c(r1)
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r10) {
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            r1 = 128(0x80, float:1.8E-43)
            java.util.List r1 = r0.getInstalledApplications(r1)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L10:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r1.next()
            android.content.pm.ApplicationInfo r4 = (android.content.pm.ApplicationInfo) r4
            java.lang.String r5 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            r6 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r5 = r0.getPackageInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            java.lang.String[] r5 = r5.requestedPermissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            if (r5 == 0) goto L10
            int r6 = r5.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            r7 = 0
        L2a:
            if (r7 >= r6) goto L10
            r8 = r5[r7]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            java.lang.String r9 = "android.permission.ACCESS_MOCK_LOCATION"
            boolean r8 = r8.equals(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            if (r8 == 0) goto L47
            java.lang.String r8 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            java.lang.String r9 = r10.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            boolean r8 = r8.equals(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            if (r8 != 0) goto L47
            int r3 = r3 + 1
            goto L47
        L45:
            r4 = move-exception
            goto L4a
        L47:
            int r7 = r7 + 1
            goto L2a
        L4a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got exception "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r4, r5)
            goto L10
        L65:
            if (r3 <= 0) goto L68
            r2 = 1
        L68:
            return r2
    }

    public static java.lang.String b(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            java.lang.CharSequence r1 = r1.getApplicationLabel(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            java.lang.String r1 = r1.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            return r1
        L13:
            return r2
    }

    public static java.util.List<java.lang.String> c(android.content.Context r4) {
            r0 = 0
            java.util.List r0 = d(r4, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = f(r4, r2)
            if (r3 != 0) goto Le
            java.lang.String r3 = "android.permission.ACCESS_MOCK_LOCATION"
            boolean r3 = e(r4, r2, r3)
            if (r3 == 0) goto Le
            java.lang.String r2 = b(r4, r2)
            r1.add(r2)
            goto Le
        L30:
            return r1
    }

    public static java.util.List<java.lang.String> d(android.content.Context r3, boolean r4) {
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r0 = r3.getRunningAppProcesses()     // Catch: java.lang.Exception -> L2b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L2b
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L2b
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L2b
            java.lang.String[] r1 = r1.pkgList     // Catch: java.lang.Exception -> L2b
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Exception -> L2b
            r4.addAll(r1)     // Catch: java.lang.Exception -> L2b
            goto L15
        L2b:
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.List r1 = r3.getRunningTasks(r0)     // Catch: java.lang.Exception -> L4d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L4d
        L35:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L4d
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L4d
            android.app.ActivityManager$RunningTaskInfo r2 = (android.app.ActivityManager.RunningTaskInfo) r2     // Catch: java.lang.Exception -> L4d
            android.content.ComponentName r2 = cn.jpush.android.ui.e.a(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L4d
            r4.add(r2)     // Catch: java.lang.Exception -> L4d
            goto L35
        L4d:
            java.util.List r3 = r3.getRunningServices(r0)     // Catch: java.lang.Exception -> L6b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L6b
        L55:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Exception -> L6b
            android.app.ActivityManager$RunningServiceInfo r0 = (android.app.ActivityManager.RunningServiceInfo) r0     // Catch: java.lang.Exception -> L6b
            android.content.ComponentName r0 = r0.service     // Catch: java.lang.Exception -> L6b
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L6b
            r4.add(r0)     // Catch: java.lang.Exception -> L6b
            goto L55
        L6b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            return r3
    }

    public static boolean e(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            java.lang.String[] r3 = r3.requestedPermissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r3 == 0) goto L20
            int r4 = r3.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            r0 = 0
        L11:
            if (r0 >= r4) goto L20
            r2 = r3[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            boolean r2 = r2.equals(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r2 == 0) goto L1d
            r3 = 1
            return r3
        L1d:
            int r0 = r0 + 1
            goto L11
        L20:
            return r1
    }

    public static boolean f(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            int r1 = r1.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L12
            return r2
        L12:
            return r0
    }

    public static void g(androidx.fragment.app.FragmentActivity r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1f
            s.b r0 = new s.b
            r0.<init>(r2)
            java.lang.String r2 = "android.permission.QUERY_ALL_PACKAGES"
            java.lang.String r1 = "android.permission.GET_INSTALLED_APPS"
            java.lang.String[] r2 = new java.lang.String[]{r2, r1}
            s.b r2 = r0.c(r2)
            com.bxkj.student.v2.ui.sports.safe.a$a r0 = new com.bxkj.student.v2.ui.sports.safe.a$a
            r0.<init>()
            r2.d(r0)
        L1f:
            return
    }
}
