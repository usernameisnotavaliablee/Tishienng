package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ac {
    public ac() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String a(int r5, int r6) {
            r4 = this;
            java.lang.String r0 = "u:r:untrusted_app"
            r1 = 26
            if (r6 >= r1) goto L8
            goto L8b
        L8:
            java.lang.String r2 = ":s0"
            if (r5 < r6) goto L1c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            return r5
        L1c:
            if (r5 >= r1) goto L30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r6 = "_25:s0"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
        L30:
            r3 = 27
            if (r6 != r3) goto L46
            if (r5 < r1) goto L8b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            return r5
        L46:
            r2 = 28
            java.lang.String r3 = "_27:s0"
            if (r6 == r2) goto L79
            r2 = 29
            if (r6 != r2) goto L51
            goto L79
        L51:
            r1 = 30
            if (r6 != r1) goto L8b
            if (r5 < r2) goto L69
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r6 = "_29:s0"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
        L69:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            return r5
        L79:
            if (r5 < r1) goto L8b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            return r5
        L8b:
            return r0
    }

    public boolean a() {
            r2 = this;
            int r0 = android.os.Process.myUid()
            r1 = 100000(0x186a0, float:1.4013E-40)
            int r0 = r0 / r1
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean a(android.content.Context r3) {
            r2 = this;
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L2c
            java.io.File r3 = r3.getParentFile()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L2c
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            r1.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L2c
            r1.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = ".."
            r1.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r0.canRead()     // Catch: java.lang.Throwable -> L2c
            return r3
        L2c:
            r3 = 0
            return r3
    }

    public java.lang.String b(android.content.Context r1) {
            r0 = this;
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> Ld
            java.io.File r1 = r1.getParentFile()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            java.lang.String r1 = ""
            return r1
    }

    public java.lang.String c(android.content.Context r9) {
            r8 = this;
            java.lang.String r0 = "/data/data"
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "currentActivityThread"
            java.lang.reflect.Method r2 = r2.getMethod(r3, r1)     // Catch: java.lang.Throwable -> L87
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Throwable -> L87
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "mPackages"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L87
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L87
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L87
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L87
            if (r3 <= 0) goto L87
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L87
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L87
        L37:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L87
            if (r3 == 0) goto L87
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L87
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L87
            if (r5 <= r4) goto L37
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r9.getPackageName()     // Catch: java.lang.Throwable -> L87
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L87
            if (r5 != 0) goto L37
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r6.<init>()     // Catch: java.lang.Throwable -> L87
            r6.append(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.String r7 = java.io.File.separator     // Catch: java.lang.Throwable -> L87
            r6.append(r7)     // Catch: java.lang.Throwable -> L87
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L87
            r6.append(r7)     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L87
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L87
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> L87
            if (r6 == 0) goto L37
            boolean r5 = r5.canWrite()     // Catch: java.lang.Throwable -> L87
            if (r5 == 0) goto L37
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> L87
            return r9
        L87:
            return r1
    }

    public org.json.JSONArray d(android.content.Context r9) {
            r8 = this;
            java.lang.String r0 = ".dex"
            java.lang.String r1 = ".so"
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lb8
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = "/proc/self/maps"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb8
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb8
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7e
            r4.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.Throwable -> L7e
        L1a:
            java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> L7e
            if (r5 == 0) goto La5
            java.lang.String r6 = "@Hw"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L1a
            java.lang.String r6 = ".apk@classes.dex"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L1a
            java.lang.String r6 = "WebViewGoogle"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L1a
            java.lang.String r6 = "FeatureFramework"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L1a
            java.lang.String r6 = "framework@oppo"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L1a
            java.lang.String r6 = "framework@mediatek"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L1a
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L7e
            r7 = 15
            if (r6 > r7) goto La5
            boolean r6 = r5.contains(r9)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r7 = "/data/"
            if (r6 != 0) goto L80
            boolean r6 = r5.contains(r7)     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L80
            boolean r6 = r5.contains(r1)     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L80
            int r6 = r5.indexOf(r7)     // Catch: java.lang.Throwable -> L7e
            int r7 = r5.indexOf(r1)     // Catch: java.lang.Throwable -> L7e
            int r7 = r7 + 3
            java.lang.String r5 = r5.substring(r6, r7)     // Catch: java.lang.Throwable -> L7e
            r4.add(r5)     // Catch: java.lang.Throwable -> L7e
            goto L1a
        L7e:
            goto Lba
        L80:
            boolean r6 = r5.contains(r9)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L1a
            boolean r6 = r5.contains(r7)     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L1a
            boolean r6 = r5.contains(r0)     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L1a
            int r6 = r5.indexOf(r7)     // Catch: java.lang.Throwable -> L7e
            int r7 = r5.indexOf(r0)     // Catch: java.lang.Throwable -> L7e
            int r7 = r7 + 4
            java.lang.String r5 = r5.substring(r6, r7)     // Catch: java.lang.Throwable -> L7e
            r4.add(r5)     // Catch: java.lang.Throwable -> L7e
            goto L1a
        La5:
            int r9 = r4.size()     // Catch: java.lang.Throwable -> L7e
            if (r9 <= 0) goto Lb4
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L7e
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L7e
            r3.close()     // Catch: java.io.IOException -> Lb3
        Lb3:
            return r9
        Lb4:
            r3.close()     // Catch: java.io.IOException -> Lbd
            goto Lbd
        Lb8:
            r3 = r2
        Lba:
            if (r3 == 0) goto Lbd
            goto Lb4
        Lbd:
            return r2
    }

    public int e(android.content.Context r8) {
            r7 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lcb
            r2 = 26
            if (r1 < r2) goto Lc6
            java.io.File r8 = r8.getFilesDir()     // Catch: java.lang.Throwable -> Lcb
            java.io.File r8 = r8.getParentFile()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "fk_w_"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lcb
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lcb
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcb
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r3.<init>()     // Catch: java.lang.Throwable -> Lcb
            r3.append(r8)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r8 = java.io.File.separator     // Catch: java.lang.Throwable -> Lcb
            r3.append(r8)     // Catch: java.lang.Throwable -> Lcb
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lcb
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lcb
            java.io.FileDescriptor r3 = r2.getFD()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = "descriptor"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> Lc4
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> Lc4
            r4.get(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r6 = "/proc/self/fd/%d"
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> Lc4
            r3.intValue()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lc4
            r4[r0] = r3     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = java.lang.String.format(r6, r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lc4
            java.nio.file.Path r3 = com.huawei.secure.android.common.util.g0.a(r3, r4)     // Catch: java.lang.Throwable -> Lc4
            java.nio.file.Path r3 = com.huawei.secure.android.common.util.h0.a(r3)     // Catch: java.lang.Throwable -> Lc4
            java.io.File r3 = com.kuaishou.weapon.p0.a0.a(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc4
            int r4 = r3.lastIndexOf(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = r3.substring(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r6.<init>()     // Catch: java.lang.Throwable -> Lc4
            r6.append(r8)     // Catch: java.lang.Throwable -> Lc4
            r6.append(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> Lc4
            boolean r8 = r4.equals(r8)     // Catch: java.lang.Throwable -> Lc4
            if (r8 != 0) goto L99
            r2.close()     // Catch: java.lang.Exception -> L98
        L98:
            return r5
        L99:
            java.lang.String r8 = ""
            java.lang.String r8 = r3.replace(r1, r8)     // Catch: java.lang.Throwable -> Lc4
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lc4
            r1.<init>(r8)     // Catch: java.lang.Throwable -> Lc4
            java.io.File r8 = r1.getParentFile()     // Catch: java.lang.Throwable -> Lc4
            boolean r8 = r8.canRead()     // Catch: java.lang.Throwable -> Lc4
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lc4
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lc4
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> Lc4
            if (r3 == 0) goto Lba
            r1.delete()     // Catch: java.lang.Throwable -> Lc4
        Lba:
            if (r8 == 0) goto Lc0
            r2.close()     // Catch: java.lang.Exception -> Lbf
        Lbf:
            return r5
        Lc0:
            r2.close()     // Catch: java.lang.Exception -> Lc3
        Lc3:
            return r0
        Lc4:
            goto Lcc
        Lc6:
            boolean r8 = r7.a(r8)     // Catch: java.lang.Throwable -> Lcb
            return r8
        Lcb:
            r2 = 0
        Lcc:
            if (r2 == 0) goto Ld1
            r2.close()     // Catch: java.lang.Exception -> Ld1
        Ld1:
            return r0
    }

    public boolean f(android.content.Context r5) {
            r4 = this;
            r0 = 0
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch: java.lang.Exception -> L30
            int r5 = r5.targetSdkVersion     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = "android.os.SELinux"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "getContext"
            r3 = 0
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L30
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L30
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L30
            java.lang.String r5 = r4.a(r5, r2)     // Catch: java.lang.Exception -> L30
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L27
            return r0
        L27:
            boolean r5 = r1.startsWith(r5)     // Catch: java.lang.Exception -> L30
            if (r5 == 0) goto L2e
            return r0
        L2e:
            r5 = 1
            return r5
        L30:
            return r0
    }
}
