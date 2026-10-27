package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class z {
    public static final java.lang.String[] a = null;
    public static final java.lang.String[] b = null;

    static {
            java.lang.String r0 = "@buglyAllChannel@"
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            com.tencent.bugly.proguard.z.a = r0
            java.lang.String r0 = "@buglyAllChannelPriority@"
            java.lang.String[] r0 = r0.split(r1)
            com.tencent.bugly.proguard.z.b = r0
            return
    }

    public z() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(int r7) {
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "/proc/"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            r2.append(r7)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "/cmdline"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            r0 = 512(0x200, float:7.17E-43)
            char[] r2 = new char[r0]     // Catch: java.lang.Throwable -> L2b
            r1.read(r2)     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            r4 = 0
        L22:
            if (r4 >= r0) goto L2d
            char r5 = r2[r4]     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2d
            int r4 = r4 + 1
            goto L22
        L2b:
            r0 = move-exception
            goto L3e
        L2d:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = r0.substring(r3, r4)     // Catch: java.lang.Throwable -> L2b
            r1.close()     // Catch: java.lang.Throwable -> L39
        L39:
            return r7
        L3a:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L3e:
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4a
            r1.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            return r7
        L4b:
            r7 = move-exception
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.lang.Throwable -> L51
        L51:
            throw r7
    }

    public static java.lang.String a(android.content.Context r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            java.lang.String r0 = "fail"
            return r0
    }

    public static java.util.List<java.lang.String> a(java.util.Map<java.lang.String, java.lang.String> r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "BUGLY_DISABLE"
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L31
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L15
            goto L31
        L15:
            java.lang.String r1 = ","
            java.lang.String[] r3 = r3.split(r1)     // Catch: java.lang.Throwable -> L2a
            r1 = 0
        L1c:
            int r2 = r3.length     // Catch: java.lang.Throwable -> L2a
            if (r1 >= r2) goto L2c
            r2 = r3[r1]     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L2a
            r3[r1] = r2     // Catch: java.lang.Throwable -> L2a
            int r1 = r1 + 1
            goto L1c
        L2a:
            r3 = move-exception
            goto L32
        L2c:
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch: java.lang.Throwable -> L2a
            return r3
        L31:
            return r0
        L32:
            com.tencent.bugly.proguard.al.a(r3)
            return r0
    }

    public static boolean a() {
            r0 = 1
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "sCurrentActivityThread"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L68
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = "mActivities"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L68
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L68
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L68
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L68
        L2b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L68
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = "android.app.ActivityThread$ActivityClientRecord"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "activity"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L68
            r3.setAccessible(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L68
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L68
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r4 = "mResumed"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L68
            r3.setAccessible(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L68
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L2b
            return r0
        L68:
            r1 = move-exception
            goto L6c
        L6a:
            r0 = 0
            return r0
        L6c:
            com.tencent.bugly.proguard.al.b(r1)
            return r0
    }

    public static boolean a(android.app.ActivityManager r4) {
            r0 = 1
            r1 = 0
            if (r4 != 0) goto Lc
            java.lang.String r4 = "is proc running, ActivityManager is null"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.c(r4, r1)
            return r0
        Lc:
            java.util.List r4 = r4.getRunningAppProcesses()
            if (r4 != 0) goto L1a
            java.lang.String r4 = "running proc info list is empty, my proc not running."
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.c(r4, r0)
            return r1
        L1a:
            int r2 = android.os.Process.myPid()
            java.util.Iterator r4 = r4.iterator()
        L22:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r4.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            int r3 = r3.pid
            if (r3 != r2) goto L22
            java.lang.String r4 = "my proc is running."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.c(r4, r1)
            return r0
        L3a:
            java.lang.String r4 = "proc not in running proc info list, my proc not running."
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.c(r4, r0)
            return r1
    }

    public static android.content.pm.PackageInfo b(android.content.Context r2) {
            java.lang.String r0 = a(r2)     // Catch: java.lang.Throwable -> Le
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r2 = move-exception
            com.tencent.bugly.proguard.al.a(r2)
            r2 = 0
            return r2
    }

    public static java.lang.String c(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L1b
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1f
            if (r2 == 0) goto L1f
            java.lang.CharSequence r2 = r1.getApplicationLabel(r2)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            return r2
        L1b:
            r2 = move-exception
            com.tencent.bugly.proguard.al.a(r2)
        L1f:
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> d(android.content.Context r11) {
            java.lang.String r0 = "BUGLY_AREA"
            java.lang.String r1 = "BUGLY_APP_BUILD_NO"
            java.lang.String r2 = "com.tencent.rdm.uuid"
            java.lang.String r3 = "BUGLY_ENABLE_DEBUG"
            java.lang.String r4 = "BUGLY_APP_VERSION"
            java.lang.String r5 = "BUGLY_APP_CHANNEL"
            java.lang.String r6 = "BUGLY_APPID"
            java.lang.String r7 = "BUGLY_DISABLE"
            r8 = 0
            if (r11 != 0) goto L14
            return r8
        L14:
            android.content.pm.PackageManager r9 = r11.getPackageManager()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r11 = r11.getPackageName()     // Catch: java.lang.Throwable -> L3b
            r10 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r11 = r9.getApplicationInfo(r11, r10)     // Catch: java.lang.Throwable -> L3b
            android.os.Bundle r9 = r11.metaData     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto La7
            java.util.HashMap r9 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3b
            r9.<init>()     // Catch: java.lang.Throwable -> L3b
            android.os.Bundle r10 = r11.metaData     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r10 = r10.get(r7)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L3d
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L3b
            r9.put(r7, r10)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r11 = move-exception
            goto La8
        L3d:
            android.os.Bundle r7 = r11.metaData     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L4c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3b
            r9.put(r6, r7)     // Catch: java.lang.Throwable -> L3b
        L4c:
            android.os.Bundle r6 = r11.metaData     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L5b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3b
            r9.put(r5, r6)     // Catch: java.lang.Throwable -> L3b
        L5b:
            android.os.Bundle r5 = r11.metaData     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L6a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3b
            r9.put(r4, r5)     // Catch: java.lang.Throwable -> L3b
        L6a:
            android.os.Bundle r4 = r11.metaData     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L79
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3b
            r9.put(r3, r4)     // Catch: java.lang.Throwable -> L3b
        L79:
            android.os.Bundle r3 = r11.metaData     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L88
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> L3b
        L88:
            android.os.Bundle r2 = r11.metaData     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L97
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3b
            r9.put(r1, r2)     // Catch: java.lang.Throwable -> L3b
        L97:
            android.os.Bundle r11 = r11.metaData     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Throwable -> L3b
            if (r11 == 0) goto La6
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L3b
            r9.put(r0, r11)     // Catch: java.lang.Throwable -> L3b
        La6:
            return r9
        La7:
            return r8
        La8:
            com.tencent.bugly.proguard.al.a(r11)
            return r8
    }
}
