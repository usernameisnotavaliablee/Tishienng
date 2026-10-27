package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class al {
    public al() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONObject a() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "persist.sys.virtual_camera_flag"
            java.lang.String r2 = "persist.sys.camera_type"
            java.lang.String r3 = "persist.sys.camera_rotation"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}     // Catch: java.lang.Exception -> L72
            r2 = 0
            r3 = 0
        L11:
            r4 = 3
            r5 = 1
            if (r3 >= r4) goto L38
            com.kuaishou.weapon.p0.aa r4 = com.kuaishou.weapon.p0.aa.a()     // Catch: java.lang.Exception -> L72
            r6 = r1[r3]     // Catch: java.lang.Exception -> L72
            java.lang.String r4 = r4.a(r6)     // Catch: java.lang.Exception -> L72
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L72
            if (r6 != 0) goto L35
            r6 = r1[r3]     // Catch: java.lang.Exception -> L72
            r7 = 46
            int r7 = r6.lastIndexOf(r7)     // Catch: java.lang.Exception -> L72
            int r7 = r7 + r5
            java.lang.String r5 = r6.substring(r7)     // Catch: java.lang.Exception -> L72
            r0.put(r5, r4)     // Catch: java.lang.Exception -> L72
        L35:
            int r3 = r3 + 1
            goto L11
        L38:
            java.lang.String r1 = "android.hardware.mockcamera.MockCamera"
            java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L42 java.lang.Exception -> L72
            java.lang.String r1 = "MockCamera"
            r0.put(r1, r5)     // Catch: java.lang.ClassNotFoundException -> L42 java.lang.Exception -> L72
        L42:
            java.lang.String r6 = "/sdcard/.imei.txt"
            java.lang.String r7 = "/sdcard/key.txt"
            java.lang.String r8 = "/sdcard/video/1.mp4"
            java.lang.String r9 = "/sdcard/video/test.txt"
            java.lang.String r10 = "/sdcard/video/.aa"
            java.lang.String r11 = "/sdcard/video/.new"
            java.lang.String r12 = "/sdcard/video/.old"
            java.lang.String[] r1 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Exception -> L72
            r3 = 2
        L55:
            r4 = 7
            if (r3 >= r4) goto L6b
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L72
            r6 = r1[r3]     // Catch: java.lang.Exception -> L72
            r4.<init>(r6)     // Catch: java.lang.Exception -> L72
            boolean r4 = r4.exists()     // Catch: java.lang.Exception -> L72
            if (r4 == 0) goto L68
            int r4 = r5 << r3
            r2 = r2 | r4
        L68:
            int r3 = r3 + 1
            goto L55
        L6b:
            if (r2 <= 0) goto L72
            java.lang.String r1 = "files"
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L72
        L72:
            return r0
    }

    public static boolean a(android.content.Context r5) {
            r5 = 0
            java.lang.String r0 = "/storage/emulated/0/DCIM/Camera/virtual.mp4"
            java.lang.String r1 = "/storage/emulated/0/DCIM/Camera1/virtual.mp4"
            java.lang.String r2 = "/storage/emulated/0/DCIM/Camera1/no-silent.jpg"
            java.lang.String r3 = "/storage/emulated/0/DCIM/Camera1/disable.jpg"
            java.lang.String r4 = "/storage/emulated/0/DCIM/Camera1/no_toast.jpg"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}     // Catch: java.lang.Exception -> L25
            r1 = 0
        L10:
            r2 = 5
            if (r1 >= r2) goto L25
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L25
            r3 = r0[r1]     // Catch: java.lang.Exception -> L25
            r2.<init>(r3)     // Catch: java.lang.Exception -> L25
            boolean r2 = r2.exists()     // Catch: java.lang.Exception -> L25
            if (r2 == 0) goto L22
            r5 = 1
            return r5
        L22:
            int r1 = r1 + 1
            goto L10
        L25:
            return r5
    }

    public static org.json.JSONObject b() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "/system/lib/.aa"
            java.lang.String r2 = "/sdcard/my/34.png"
            java.lang.String r3 = "/sdcard/my/do_not_change.txt"
            java.lang.String r4 = "/sdcard/my/34.mp4"
            java.lang.String r5 = "/sdcard/my/44.mp4"
            java.lang.String r6 = "/sdcard/QQ=99932701/"
            java.lang.String r7 = "/sdcard/QQ=99932701/Dict.txt"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}     // Catch: java.lang.Exception -> L36
            r2 = 0
            r3 = 0
        L19:
            r4 = 7
            if (r2 >= r4) goto L2f
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L36
            r5 = r1[r2]     // Catch: java.lang.Exception -> L36
            r4.<init>(r5)     // Catch: java.lang.Exception -> L36
            boolean r4 = r4.exists()     // Catch: java.lang.Exception -> L36
            if (r4 == 0) goto L2c
            r4 = 1
            int r4 = r4 << r2
            r3 = r3 | r4
        L2c:
            int r2 = r2 + 1
            goto L19
        L2f:
            if (r3 <= 0) goto L36
            java.lang.String r1 = "files"
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L36
        L36:
            return r0
    }

    public static org.json.JSONObject b(android.content.Context r6) {
            java.lang.String r0 = "/sdcard/my/44.mp4"
            java.lang.String r1 = "/system/lib/lic"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r1 = "com.yky"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            int r0 = com.kuaishou.weapon.p0.bp.a(r0)     // Catch: java.lang.Exception -> L34
            if (r0 <= 0) goto L1e
            java.lang.String r3 = "f"
            r2.put(r3, r0)     // Catch: java.lang.Exception -> L34
        L1e:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Exception -> L34
            r0 = 0
            r3 = 0
        L24:
            if (r3 > 0) goto L34
            r4 = r1[r0]     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r6.getApplicationInfo(r4, r0)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r4 = r1[r0]     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r5 = 1
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
        L31:
            int r3 = r3 + 1
            goto L24
        L34:
            return r2
    }

    public static int c() {
            java.lang.String r0 = "/system/lib.aa"
            java.lang.String r1 = "/system/lib/ccc"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
        La:
            r3 = 2
            if (r1 >= r3) goto L20
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L20
            r4 = r0[r1]     // Catch: java.lang.Exception -> L20
            r3.<init>(r4)     // Catch: java.lang.Exception -> L20
            boolean r3 = r3.exists()     // Catch: java.lang.Exception -> L20
            if (r3 == 0) goto L1d
            r3 = 1
            int r3 = r3 << r1
            r2 = r2 | r3
        L1d:
            int r1 = r1 + 1
            goto La
        L20:
            return r2
    }
}
