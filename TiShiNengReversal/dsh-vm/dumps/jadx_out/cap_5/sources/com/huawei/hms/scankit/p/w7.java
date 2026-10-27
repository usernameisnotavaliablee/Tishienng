package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class w7 {
    private static java.lang.String a = null;
    private static java.lang.String b = null;
    public static boolean c = true;

    static {
            return
    }

    public w7() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(int r3) {
            if (r3 > 0) goto L5
            r3 = 8191(0x1fff, float:1.1478E-41)
            return r3
        L5:
            int r0 = r3 + (-1)
            r0 = r0 & r3
            if (r0 != 0) goto Lb
            return r3
        Lb:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.AZTEC_SCAN_TYPE
            r1 = r3 & r0
            if (r1 == 0) goto L16
            int r0 = b(r0)
            goto L17
        L16:
            r0 = 0
        L17:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.CODABAR_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L22
            int r1 = b(r1)
            r0 = r0 | r1
        L22:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.CODE39_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L2d
            int r1 = b(r1)
            r0 = r0 | r1
        L2d:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.CODE93_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L38
            int r1 = b(r1)
            r0 = r0 | r1
        L38:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.CODE128_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L43
            int r1 = b(r1)
            r0 = r0 | r1
        L43:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.DATAMATRIX_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L4e
            int r1 = b(r1)
            r0 = r0 | r1
        L4e:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.EAN8_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L59
            int r1 = b(r1)
            r0 = r0 | r1
        L59:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.EAN13_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L64
            int r1 = b(r1)
            r0 = r0 | r1
        L64:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L6f
            int r1 = b(r1)
            r0 = r0 | r1
        L6f:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.ITF14_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L7a
            int r1 = b(r1)
            r0 = r0 | r1
        L7a:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.PDF417_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L85
            int r1 = b(r1)
            r0 = r0 | r1
        L85:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_A_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L90
            int r1 = b(r1)
            r0 = r0 | r1
        L90:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_E_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto L9b
            int r1 = b(r1)
            r0 = r0 | r1
        L9b:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.MULTI_FUNCTIONAL_SCAN_TYPE
            r2 = r3 & r1
            if (r2 == 0) goto La6
            int r1 = b(r1)
            r0 = r0 | r1
        La6:
            int r1 = com.huawei.hms.ml.scan.HmsScanBase.WX_SCAN_TYPE
            r3 = r3 & r1
            if (r3 == 0) goto Lb1
            int r3 = b(r1)
            r3 = r3 | r0
            return r3
        Lb1:
            return r0
    }

    public static int a(android.app.Activity r7) {
            r0 = -1
            java.lang.String r1 = "com.huawei.android.app.ActivityManagerEx"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "getActivityWindowMode"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L30
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L30
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L30
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L30
            r3[r6] = r7     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L23
            return r0
        L23:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = r7.intValue()
            return r7
        L30:
            return r0
    }

    public static int a(android.content.Context r2, java.lang.String r3) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            int r2 = r2.checkPermission(r3, r0, r1)
            r3 = -1
            if (r2 != r3) goto L10
            return r3
        L10:
            r2 = 0
            return r2
    }

    public static android.content.pm.ResolveInfo a(android.content.Intent r0, java.lang.String r1, android.app.Activity r2) {
            r0.setPackage(r1)
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            r2 = 0
            java.util.List r0 = r1.queryIntentActivities(r0, r2)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L19
            java.lang.Object r0 = r0.get(r2)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            return r0
        L19:
            r0 = 0
            return r0
    }

    public static android.graphics.Bitmap a(android.content.Context r4, android.content.Intent r5) {
            boolean r0 = b(r4)
            r1 = 0
            if (r0 != 0) goto L46
            java.lang.String r5 = b(r4, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L12
            return r1
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "compressBitmap above android 29"
            r2 = 28
            java.lang.String r3 = "ScanBitmap"
            if (r0 <= r2) goto L32
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            if (r0 == 0) goto L32
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            if (r0 <= r2) goto L32
            com.huawei.hms.scankit.p.o4.a(r3, r1)
            android.graphics.Bitmap r0 = com.huawei.hms.hmsscankit.ScanUtil.compressBitmapForAndroid29(r4, r5)
            goto L3b
        L32:
            java.lang.String r0 = "compressBitmap below android 29"
            com.huawei.hms.scankit.p.o4.a(r3, r0)
            android.graphics.Bitmap r0 = com.huawei.hms.hmsscankit.ScanUtil.compressBitmap(r4, r5)
        L3b:
            if (r0 != 0) goto L45
            com.huawei.hms.scankit.p.o4.a(r3, r1)
            android.graphics.Bitmap r4 = com.huawei.hms.hmsscankit.ScanUtil.compressBitmapForAndroid29(r4, r5)
            return r4
        L45:
            return r0
        L46:
            android.net.Uri r5 = r5.getData()
            if (r5 != 0) goto L4d
            return r1
        L4d:
            android.graphics.Bitmap r4 = a(r4, r5)
            if (r4 != 0) goto L54
            return r1
        L54:
            return r4
    }

    public static android.graphics.Bitmap a(android.content.Context r7, android.net.Uri r8) {
            java.lang.String r0 = "IOException in getImagePath"
            java.lang.String r1 = "ScankitUtils"
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r3 = 1
            r2.inJustDecodeBounds = r3
            android.content.Context r3 = r7.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            android.content.ContentResolver r3 = r3.getContentResolver()
            r4 = 0
            java.io.InputStream r8 = r3.openInputStream(r8)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            if (r8 == 0) goto L3b
            byte[] r3 = a(r8)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L44
            int r5 = r3.length     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L44
            r6 = 0
            android.graphics.BitmapFactory.decodeByteArray(r3, r6, r5, r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L44
            a(r7, r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L44
            int r7 = r3.length     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L44
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r3, r6, r7, r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L44
            r8.close()     // Catch: java.io.IOException -> L34
            return r7
        L34:
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            return r7
        L38:
            r7 = move-exception
            r4 = r8
            goto L53
        L3b:
            if (r8 == 0) goto L52
            r8.close()     // Catch: java.io.IOException -> L4f
            goto L52
        L41:
            r7 = move-exception
            goto L53
        L43:
            r8 = r4
        L44:
            java.lang.String r7 = "compressBitmapFromUri IOException"
            com.huawei.hms.scankit.p.o4.b(r1, r7)     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L52
            r8.close()     // Catch: java.io.IOException -> L4f
            goto L52
        L4f:
            com.huawei.hms.scankit.p.o4.b(r1, r0)
        L52:
            return r4
        L53:
            if (r4 == 0) goto L5c
            r4.close()     // Catch: java.io.IOException -> L59
            goto L5c
        L59:
            com.huawei.hms.scankit.p.o4.b(r1, r0)
        L5c:
            throw r7
    }

    public static android.graphics.Bitmap a(android.graphics.Bitmap r7, float r8) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            int r0 = r3 / 2
            float r0 = (float) r0
            int r1 = r4 / 2
            float r1 = (float) r1
            r5.setRotate(r8, r0, r1)
            r2 = 0
            r6 = 0
            r1 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            boolean r8 = r7.equals(r0)
            if (r8 == 0) goto L29
            goto L32
        L29:
            boolean r8 = r0.isRecycled()
            if (r8 != 0) goto L32
            r0.recycle()
        L32:
            return r7
    }

    public static android.graphics.Bitmap a(android.graphics.Bitmap r18, float r19, float r20) {
            r0 = 0
            int r1 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r1 <= 0) goto L62
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 > 0) goto La
            goto L62
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r0 / r19
            float r0 = r0 / r20
            int r5 = r18.getWidth()
            int r9 = r18.getHeight()
            float r2 = (float) r5
            float r2 = r2 * r19
            int r13 = (int) r2
            float r2 = (float) r9
            float r2 = r2 * r20
            int r10 = (int) r2
            int r2 = r5 * r9
            int[] r3 = new int[r2]
            r6 = 0
            r7 = 0
            r4 = 0
            r8 = r5
            r2 = r18
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
            int r2 = r13 * r10
            int[] r11 = new int[r2]
            r2 = 0
            r4 = 0
        L33:
            if (r4 >= r10) goto L50
            r6 = 0
        L36:
            if (r6 >= r13) goto L4d
            int r7 = r4 * r13
            int r7 = r7 + r6
            float r8 = (float) r4
            float r8 = r8 * r0
            int r8 = (int) r8
            int r8 = r8 * r5
            float r9 = (float) r6
            float r9 = r9 * r1
            int r9 = (int) r9
            int r8 = r8 + r9
            r8 = r3[r8]
            r11[r7] = r8
            int r6 = r6 + 1
            goto L36
        L4d:
            int r4 = r4 + 1
            goto L33
        L50:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r13, r10, r0)
            r14 = 0
            r15 = 0
            r12 = 0
            r16 = r13
            r17 = r10
            r10 = r0
            r10.setPixels(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L62:
            r0 = 0
            return r0
    }

    public static android.graphics.Bitmap a(android.graphics.Bitmap r1, int r2) {
            if (r2 == 0) goto L17
            r0 = 2
            if (r2 == r0) goto L10
            r0 = 3
            if (r2 == r0) goto L9
            return r1
        L9:
            r2 = 1127481344(0x43340000, float:180.0)
            android.graphics.Bitmap r1 = a(r1, r2)
            return r1
        L10:
            r2 = 1132920832(0x43870000, float:270.0)
            android.graphics.Bitmap r1 = a(r1, r2)
            return r1
        L17:
            r2 = 1119092736(0x42b40000, float:90.0)
            android.graphics.Bitmap r1 = a(r1, r2)
            return r1
    }

    public static android.graphics.Bitmap a(android.graphics.Bitmap r1, int r2, int r3) {
            int r0 = r1.getWidth()
            if (r0 <= 0) goto L20
            int r0 = r1.getHeight()
            if (r0 > 0) goto Ld
            goto L20
        Ld:
            float r2 = (float) r2
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r2 = r2 / r0
            float r3 = (float) r3
            int r0 = r1.getHeight()
            float r0 = (float) r0
            float r3 = r3 / r0
            android.graphics.Bitmap r1 = a(r1, r2, r3)
            return r1
        L20:
            r1 = 0
            return r1
    }

    private static java.lang.String a() {
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "navigationbar_is_min"
            if (r1 == 0) goto Lb
            return r2
        Lb:
            java.lang.String r1 = "HUAWEI"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L14
            return r2
        L14:
            java.lang.String r1 = "XIAOMI"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L1f
            java.lang.String r0 = "force_fsg_nav_bar"
            return r0
        L1f:
            java.lang.String r1 = "VIVO"
            boolean r1 = r0.equalsIgnoreCase(r1)
            java.lang.String r3 = "navigation_gesture_on"
            if (r1 == 0) goto L2a
            return r3
        L2a:
            java.lang.String r1 = "OPPO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L33
            return r3
        L33:
            return r2
    }

    private static java.lang.String a(android.content.Context r9, android.net.Uri r10, java.lang.String r11) {
            java.lang.String r0 = "ScankitUtils"
            java.lang.String r1 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            r8 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Exception -> L29 java.lang.IllegalStateException -> L2f
            r6 = 0
            r7 = 0
            r3 = r10
            r5 = r11
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L29 java.lang.IllegalStateException -> L2f
            if (r9 == 0) goto L28
            boolean r10 = r9.moveToFirst()
            if (r10 == 0) goto L25
            int r10 = r9.getColumnIndex(r1)
            java.lang.String r8 = r9.getString(r10)
        L25:
            r9.close()
        L28:
            return r8
        L29:
            java.lang.String r9 = "Exception in getImagePath"
            com.huawei.hms.scankit.p.o4.b(r0, r9)
            return r8
        L2f:
            java.lang.String r9 = "IllegalStateException in getImagePath"
            com.huawei.hms.scankit.p.o4.b(r0, r9)
            return r8
    }

    public static java.lang.String a(java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            java.lang.String r2 = cn.jiguang.av.f0.a(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    private static void a(android.content.Context r10, android.graphics.BitmapFactory.Options r11) {
            java.lang.String r0 = "exception"
            int r1 = r11.outWidth
            int r2 = r11.outHeight
            if (r1 == 0) goto L66
            if (r2 != 0) goto Lb
            goto L66
        Lb:
            if (r1 <= r2) goto Le
            r1 = r2
        Le:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 0
            r5 = 1
            if (r2 < r3) goto L38
            java.lang.String r2 = "activity"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch: java.lang.Exception -> L3c java.lang.NullPointerException -> L42
            android.app.ActivityManager r10 = (android.app.ActivityManager) r10     // Catch: java.lang.Exception -> L3c java.lang.NullPointerException -> L42
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> L3c java.lang.NullPointerException -> L42
            r2.<init>()     // Catch: java.lang.Exception -> L3c java.lang.NullPointerException -> L42
            r10.getMemoryInfo(r2)     // Catch: java.lang.Exception -> L3c java.lang.NullPointerException -> L42
            r6 = 4652218415073722368(0x4090000000000000, double:1024.0)
            r8 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = java.lang.Math.pow(r6, r8)     // Catch: java.lang.Exception -> L3c java.lang.NullPointerException -> L42
            long r2 = r2.totalMem     // Catch: java.lang.Exception -> L3c java.lang.NullPointerException -> L42
            double r2 = (double) r2
            double r2 = r2 / r6
            r6 = 4617878467915022336(0x4016000000000000, double:5.5)
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 >= 0) goto L3a
        L38:
            r10 = 1
            goto L48
        L3a:
            r10 = 0
            goto L48
        L3c:
            java.lang.String r10 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r10)
            goto L38
        L42:
            java.lang.String r10 = "NullPointerException"
            com.huawei.hms.scankit.p.o4.b(r0, r10)
            goto L38
        L48:
            if (r10 == 0) goto L4d
            r10 = 1200(0x4b0, float:1.682E-42)
            goto L4f
        L4d:
            r10 = 3000(0xbb8, float:4.204E-42)
        L4f:
            if (r1 <= r10) goto L59
            float r0 = (float) r1
            float r10 = (float) r10
            float r0 = r0 / r10
            int r10 = java.lang.Math.round(r0)
            goto L5a
        L59:
            r10 = 1
        L5a:
            r11.inSampleSize = r10
            r11.inJustDecodeBounds = r4
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            r11.inPreferredConfig = r10
            r11.inPurgeable = r5
            r11.inInputShareable = r5
        L66:
            return
    }

    public static boolean a(android.content.Context r3) {
            boolean r0 = b(r3)
            if (r0 != 0) goto L19
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = "android.permission.CAMERA"
            int r3 = r3.checkPermission(r2, r0, r1)
            if (r3 != 0) goto L17
            goto L19
        L17:
            r3 = 0
            return r3
        L19:
            r3 = 1
            return r3
    }

    public static boolean a(java.lang.String r2, android.app.Activity r3) {
            r0 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La
            goto L12
        La:
            java.lang.String r2 = "Utils"
            java.lang.String r3 = "NameNotFoundException Exception"
            com.huawei.hms.scankit.p.o4.d(r2, r3)
            r2 = 0
        L12:
            if (r2 == 0) goto L2c
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            int r2 = r2.flags
            r3 = r2 & 1
            r1 = 1
            if (r3 != r1) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            r2 = r2 & 128(0x80, float:1.8E-43)
            if (r2 != r1) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            if (r3 != 0) goto L2b
            if (r2 == 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            return r0
    }

    public static boolean a(byte[] r0, int r1) {
            if (r1 < 0) goto L7
            int r0 = r0.length
            if (r1 >= r0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static boolean a(float[] r0, int r1) {
            if (r1 < 0) goto L7
            int r0 = r0.length
            if (r1 >= r0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static boolean a(int[] r0, int r1) {
            if (r1 < 0) goto L7
            int r0 = r0.length
            if (r1 >= r0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static boolean a(java.lang.String[] r0, int r1) {
            if (r1 < 0) goto L7
            int r0 = r0.length
            if (r1 >= r0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static boolean a(byte[][] r0, int r1) {
            if (r1 < 0) goto L7
            int r0 = r0.length
            if (r1 >= r0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static boolean a(int[][] r0, int r1) {
            if (r1 < 0) goto L7
            int r0 = r0.length
            if (r1 >= r0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static byte[] a(java.io.InputStream r4) throws java.io.IOException {
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
        L9:
            int r2 = r4.read(r0)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r1.write(r0, r3, r2)
            goto L9
        L15:
            byte[] r4 = r1.toByteArray()
            r1.close()
            return r4
    }

    public static com.huawei.hms.ml.scan.HmsScan[] a(com.huawei.hms.ml.scan.HmsScan[] r3) {
            if (r3 == 0) goto L19
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L19
        L6:
            r0 = 0
        L7:
            int r1 = r3.length
            if (r0 >= r1) goto L19
            r1 = r3[r0]
            if (r1 == 0) goto L16
            int r2 = r1.scanType
            int r2 = b(r2)
            r1.scanType = r2
        L16:
            int r0 = r0 + 1
            goto L7
        L19:
            return r3
    }

    public static int b(int r1) {
            r0 = 8191(0x1fff, float:1.1478E-41)
            if (r1 != r0) goto L5
            return r0
        L5:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE
            if (r1 != r0) goto Lc
            r1 = 256(0x100, float:3.59E-43)
            return r1
        Lc:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.AZTEC_SCAN_TYPE
            if (r1 != r0) goto L13
            r1 = 4096(0x1000, float:5.74E-42)
            return r1
        L13:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.DATAMATRIX_SCAN_TYPE
            if (r1 != r0) goto L1a
            r1 = 16
            return r1
        L1a:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.PDF417_SCAN_TYPE
            if (r1 != r0) goto L21
            r1 = 2048(0x800, float:2.87E-42)
            return r1
        L21:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.CODE39_SCAN_TYPE
            if (r1 != r0) goto L27
            r1 = 2
            return r1
        L27:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.CODE93_SCAN_TYPE
            if (r1 != r0) goto L2d
            r1 = 4
            return r1
        L2d:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.CODE128_SCAN_TYPE
            if (r1 != r0) goto L33
            r1 = 1
            return r1
        L33:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.EAN13_SCAN_TYPE
            if (r1 != r0) goto L3a
            r1 = 32
            return r1
        L3a:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.EAN8_SCAN_TYPE
            if (r1 != r0) goto L41
            r1 = 64
            return r1
        L41:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.ITF14_SCAN_TYPE
            if (r1 != r0) goto L48
            r1 = 128(0x80, float:1.8E-43)
            return r1
        L48:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_A_SCAN_TYPE
            if (r1 != r0) goto L4f
            r1 = 512(0x200, float:7.17E-43)
            return r1
        L4f:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_E_SCAN_TYPE
            if (r1 != r0) goto L56
            r1 = 1024(0x400, float:1.435E-42)
            return r1
        L56:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.CODABAR_SCAN_TYPE
            if (r1 != r0) goto L5d
            r1 = 8
            return r1
        L5d:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.WX_SCAN_TYPE
            if (r1 != r0) goto L64
            r1 = 16384(0x4000, float:2.2959E-41)
            return r1
        L64:
            int r0 = com.huawei.hms.ml.scan.HmsScanBase.MULTI_FUNCTIONAL_SCAN_TYPE
            if (r1 != r0) goto L6a
            r1 = 8192(0x2000, float:1.148E-41)
        L6a:
            return r1
    }

    private static java.lang.String b(android.content.Context r5, android.content.Intent r6) {
            java.lang.String r0 = "ScankitUtils"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6)
            android.net.Uri r6 = r1.getData()
            boolean r1 = android.provider.DocumentsContract.isDocumentUri(r5, r6)
            r2 = 0
            if (r1 == 0) goto L6e
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r6)
            java.lang.String r3 = r6.getAuthority()
            java.lang.String r4 = "com.android.providers.media.documents"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L43
            java.lang.String r6 = ":"
            java.lang.String[] r6 = r1.split(r6)
            r0 = 1
            r6 = r6[r0]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "_id="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r5 = a(r5, r0, r6)
            return r5
        L43:
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r3 = "com.android.providers.downloads.documents"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L7f
            java.lang.String r6 = "content://downloads/public_downloads"
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> L62 java.lang.NumberFormatException -> L68
            long r3 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Exception -> L62 java.lang.NumberFormatException -> L68
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r6, r3)     // Catch: java.lang.Exception -> L62 java.lang.NumberFormatException -> L68
            java.lang.String r5 = a(r5, r6, r2)     // Catch: java.lang.Exception -> L62 java.lang.NumberFormatException -> L68
            return r5
        L62:
            java.lang.String r5 = "Exception in withAppendedId"
            com.huawei.hms.scankit.p.o4.b(r0, r5)
            return r2
        L68:
            java.lang.String r5 = "NumberFormatException in withAppendedId"
            com.huawei.hms.scankit.p.o4.b(r0, r5)
            return r2
        L6e:
            java.lang.String r0 = r6.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L7f
            java.lang.String r5 = a(r5, r6, r2)
            return r5
        L7f:
            return r2
    }

    public static boolean b() {
            r0 = 0
            java.lang.String r1 = "get"
            java.lang.String r2 = "sys.multiwin_for_camera"
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.String r4 = "UNKNOWN"
            java.lang.String r1 = com.huawei.hms.framework.common.SystemPropUtils.getProperty(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "-1"
            boolean r0 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L13
        L13:
            return r0
    }

    public static boolean b(android.app.Activity r1) {
            int r1 = a(r1)
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean b(android.content.Context r2) {
            java.lang.String r0 = com.huawei.hms.scankit.p.w7.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L22
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L22
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r1)     // Catch: java.lang.Throwable -> L22
            android.os.Bundle r2 = r2.metaData     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "scanExt"
            java.lang.String r1 = "unSet"
            java.lang.String r2 = r2.getString(r0, r1)     // Catch: java.lang.Throwable -> L22
            com.huawei.hms.scankit.p.w7.a = r2     // Catch: java.lang.Throwable -> L22
        L22:
            java.lang.String r2 = com.huawei.hms.scankit.p.w7.a
            java.lang.String r0 = "readUri"
            boolean r2 = r0.equals(r2)
            return r2
    }

    public static boolean c() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "HUAWEI"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L15
            java.lang.String r1 = "honor"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static boolean c(android.app.Activity r1) {
            android.view.WindowManager r1 = r1.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            if (r1 == 0) goto L14
            r0 = 2
            if (r1 != r0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static boolean c(android.content.Context r2) {
            boolean r0 = b(r2)
            if (r0 == 0) goto L1d
            java.lang.String r0 = com.huawei.hms.scankit.p.w7.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1d
            r0 = 0
            java.lang.String r1 = "scanExt"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r1, r0)
            java.lang.String r0 = "unSet"
            java.lang.String r2 = r2.getString(r1, r0)
            com.huawei.hms.scankit.p.w7.b = r2
        L1d:
            java.lang.String r2 = com.huawei.hms.scankit.p.w7.b
            java.lang.String r0 = "forbid"
            boolean r2 = r0.equals(r2)
            return r2
    }

    public static int d(android.content.Context r4) {
            android.content.res.Resources r0 = r4.getResources()
            if (r0 == 0) goto L1f
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "status_bar_height"
            int r0 = r0.getIdentifier(r3, r1, r2)
            if (r0 <= 0) goto L1f
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelSize(r0)
            return r4
        L1f:
            r4 = 0
            return r4
    }

    public static boolean d() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "ar"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r2 = "ur"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L23
            return r1
        L23:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r2 = "ug"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L34
            return r1
        L34:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r2 = "iw"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L45
            return r1
        L45:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r2 = "fa"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L56
            return r1
        L56:
            r0 = 0
            return r0
    }

    public static boolean e() {
            r0 = 0
            java.lang.String r1 = "get"
            java.lang.String r2 = "sys.hw_multiwin_for_camera"
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.String r4 = "UNKNOWN"
            java.lang.String r1 = com.huawei.hms.framework.common.SystemPropUtils.getProperty(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "-1"
            boolean r0 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L13
        L13:
            return r0
    }

    public static boolean e(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "hwMultiwindow-magic"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "hw-magic-windows"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L1d
            goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    public static boolean f() {
            java.lang.String r0 = android.os.Build.BRAND
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "samsung"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static boolean f(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L14
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L14
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = com.bytedance.pangle.wrapper.k0.a(r2)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public static boolean g(android.content.Context r4) {
            r4 = 0
            java.lang.String r0 = "get"
            java.lang.String r1 = "ro.hw.country"
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.String r3 = "UNKNOWN"
            java.lang.String r0 = com.huawei.hms.framework.common.SystemPropUtils.getProperty(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "CN"
            boolean r4 = r1.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L13
        L13:
            return r4
    }

    public static boolean h(android.content.Context r7) {
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            android.view.Display r7 = r7.getDefaultDisplay()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r7.getMetrics(r0)
            int r7 = r0.widthPixels
            float r7 = (float) r7
            float r1 = r0.xdpi
            float r7 = r7 / r1
            double r1 = (double) r7
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = java.lang.Math.pow(r1, r3)
            int r7 = r0.heightPixels
            float r7 = (float) r7
            float r0 = r0.ydpi
            float r7 = r7 / r0
            double r5 = (double) r7
            double r3 = java.lang.Math.pow(r5, r3)
            double r1 = r1 + r3
            double r0 = java.lang.Math.sqrt(r1)
            r2 = 4617878467915022336(0x4016000000000000, double:5.5)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L39
            r7 = 1
            return r7
        L39:
            r7 = 0
            return r7
    }

    public static boolean i(android.content.Context r7) {
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            android.view.Display r7 = r7.getDefaultDisplay()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r7.getMetrics(r0)
            int r7 = r0.widthPixels
            float r7 = (float) r7
            float r1 = r0.xdpi
            float r7 = r7 / r1
            double r1 = (double) r7
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = java.lang.Math.pow(r1, r3)
            int r7 = r0.heightPixels
            float r7 = (float) r7
            float r5 = r0.ydpi
            float r7 = r7 / r5
            double r5 = (double) r7
            double r3 = java.lang.Math.pow(r5, r3)
            int r7 = r0.widthPixels
            float r7 = (float) r7
            int r0 = r0.heightPixels
            float r0 = (float) r0
            float r7 = r7 / r0
            double r1 = r1 + r3
            double r0 = java.lang.Math.sqrt(r1)
            r2 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L47
            r0 = 1067869798(0x3fa66666, float:1.3)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L47
            r7 = 1
            return r7
        L47:
            r7 = 0
            return r7
    }

    public static boolean j(android.content.Context r7) {
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            android.view.Display r7 = r7.getDefaultDisplay()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r7.getMetrics(r0)
            int r7 = r0.widthPixels
            float r7 = (float) r7
            float r1 = r0.xdpi
            float r7 = r7 / r1
            double r1 = (double) r7
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = java.lang.Math.pow(r1, r3)
            int r7 = r0.heightPixels
            float r7 = (float) r7
            float r0 = r0.ydpi
            float r7 = r7 / r0
            double r5 = (double) r7
            double r3 = java.lang.Math.pow(r5, r3)
            double r1 = r1 + r3
            double r0 = java.lang.Math.sqrt(r1)
            r2 = 4619567317775286272(0x401c000000000000, double:7.0)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L39
            r7 = 1
            return r7
        L39:
            r7 = 0
            return r7
    }

    public static boolean k(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r0 = a()
            r1 = 0
            int r2 = android.provider.Settings.Global.getInt(r2, r0, r1)
            if (r2 != 0) goto L11
            r2 = 1
            return r2
        L11:
            return r1
    }
}
