package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ScanUtil {
    public static final int CAMERA_INIT_ERROR = -1000;
    static final java.lang.String CONTEXT_METHOD = "initializeModule";
    static final java.lang.String CONTEXT_PATH = "com.huawei.hms.feature.DynamicModuleInitializer";
    static final java.lang.String CREATOR_PATH = "com.huawei.hms.scankit.Creator";
    public static final int ERROR_ABNORMAL_RESTART = 3;
    public static final int ERROR_INVALID_PARAM = 4;
    public static final int ERROR_NO_CAMERA_PERMISSION = 1;
    public static final int ERROR_NO_READ_PERMISSION = 2;
    private static final int LITE_VERSION = 10320300;
    private static final int MAX_BITMAP_SIZE = 52428800;
    static final java.lang.String MODULE_SCANKIT = "huawei_module_scankit";
    static final java.lang.String MODULE_SCANKIT_LOCAL = "huawei_module_scankit_local";
    private static final int NEW_VERSION = 21002300;
    public static final java.lang.String RESULT = "SCAN_RESULT";
    public static final java.lang.String RESULT_CODE = "SCAN_RESULT_CODE";
    public static final int SCAN_NO_DETECTED = 4096;
    public static final int SUCCESS = 0;
    private static final int WR_VERSION = 201000300;

    public ScanUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap buildBitmap(java.lang.String r6, int r7, int r8, int r9, com.huawei.hms.ml.scan.HmsBuildBitmapOption r10) throws com.huawei.hms.hmsscankit.WriterException {
            com.huawei.hms.scankit.p.c5 r0 = new com.huawei.hms.scankit.p.c5
            r0.<init>()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            android.graphics.Bitmap r6 = r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    private static com.huawei.hms.ml.scan.HmsScanResult checkHmsScan(com.huawei.hms.ml.scan.HmsScan[] r7, com.huawei.hms.ml.scan.HmsScanFrameOptions r8) {
            int r8 = r7.length
            r0 = 4096(0x1000, float:5.74E-42)
            if (r8 != 0) goto Lc
            com.huawei.hms.ml.scan.HmsScanResult r7 = new com.huawei.hms.ml.scan.HmsScanResult
            r8 = 0
            r7.<init>(r0, r8)
            return r7
        Lc:
            r8 = 0
            r1 = r7[r8]
            java.lang.String r1 = r1.getOriginalValue()
            java.lang.String r2 = ""
            if (r1 != r2) goto L2b
            r1 = r7[r8]
            double r3 = r1.getZoomValue()
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L2b
            com.huawei.hms.ml.scan.HmsScanResult r8 = new com.huawei.hms.ml.scan.HmsScanResult
            r0 = 4098(0x1002, float:5.743E-42)
            r8.<init>(r0, r7)
            return r8
        L2b:
            r1 = r7[r8]
            java.lang.String r1 = r1.getOriginalValue()
            if (r1 == r2) goto L39
            com.huawei.hms.ml.scan.HmsScanResult r0 = new com.huawei.hms.ml.scan.HmsScanResult
            r0.<init>(r8, r7)
            return r0
        L39:
            com.huawei.hms.ml.scan.HmsScanResult r8 = new com.huawei.hms.ml.scan.HmsScanResult
            r8.<init>(r0, r7)
            return r8
    }

    private static boolean checkVersion(int r4, int r5) {
            r0 = 1
            r1 = 201000300(0xbfb056c, float:9.668984E-32)
            r2 = 21002300(0x140783c, float:3.5351094E-38)
            r3 = 10320300(0x9d79ac, float:1.446182E-38)
            if (r4 != r3) goto L11
            if (r5 < r2) goto L10
            if (r5 != r1) goto L11
        L10:
            return r0
        L11:
            if (r4 == r3) goto L1a
            if (r4 < r2) goto L19
            if (r5 == r1) goto L19
            if (r5 >= r2) goto L1a
        L19:
            return r0
        L1a:
            r4 = 0
            return r4
    }

    public static android.graphics.Bitmap compressBitmap(android.content.Context r2, java.lang.String r3) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.graphics.BitmapFactory.decodeFile(r3, r0)
            dealBitmapFactoryOption(r2, r0)
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r3, r0)
            return r2
    }

    public static android.graphics.Bitmap compressBitmapForAndroid29(android.content.Context r10, java.lang.String r11) {
            java.lang.String r0 = "_id"
            java.lang.String r1 = "Exception"
            java.lang.String r2 = "exception"
            r3 = 0
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61 java.lang.NullPointerException -> L6b
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61 java.lang.NullPointerException -> L6b
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61 java.lang.NullPointerException -> L6b
            java.lang.String r7 = "_data=?"
            java.lang.String[] r8 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61 java.lang.NullPointerException -> L6b
            r9 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61 java.lang.NullPointerException -> L6b
            if (r4 == 0) goto L3a
            boolean r6 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            if (r6 == 0) goto L3a
            int r11 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            int r11 = r4.getInt(r11)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            android.net.Uri r11 = android.net.Uri.withAppendedPath(r5, r11)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
        L34:
            r3 = r11
            goto L58
        L36:
            r0 = move-exception
            r10 = r0
            r3 = r4
            goto L8d
        L3a:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            if (r0 == 0) goto L58
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            r0.<init>()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            java.lang.String r6 = "_data"
            r0.put(r6, r11)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            android.content.ContentResolver r11 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            android.net.Uri r11 = r11.insert(r5, r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L62 java.lang.NullPointerException -> L6c
            goto L34
        L58:
            if (r4 == 0) goto L7a
            r4.close()     // Catch: java.lang.Exception -> L77
            goto L7a
        L5e:
            r0 = move-exception
            r10 = r0
            goto L8d
        L61:
            r4 = r3
        L62:
            com.huawei.hms.scankit.p.o4.b(r2, r1)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L7a
            r4.close()     // Catch: java.lang.Exception -> L77
            goto L7a
        L6b:
            r4 = r3
        L6c:
            java.lang.String r11 = "NullPointerException"
            com.huawei.hms.scankit.p.o4.b(r2, r11)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L7a
            r4.close()     // Catch: java.lang.Exception -> L77
            goto L7a
        L77:
            com.huawei.hms.scankit.p.o4.b(r2, r1)
        L7a:
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options
            r11.<init>()
            r0 = 1
            r11.inJustDecodeBounds = r0
            getBitmapFromUri(r10, r3, r11)
            dealBitmapFactoryOption(r10, r11)
            android.graphics.Bitmap r10 = getBitmapFromUri(r10, r3, r11)
            return r10
        L8d:
            if (r3 == 0) goto L96
            r3.close()     // Catch: java.lang.Exception -> L93
            goto L96
        L93:
            com.huawei.hms.scankit.p.o4.b(r2, r1)
        L96:
            throw r10
    }

    private static void dealBitmapFactoryOption(android.content.Context r10, android.graphics.BitmapFactory.Options r11) {
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

    public static com.huawei.hms.ml.scan.HmsScanResult decode(android.content.Context r6, com.huawei.hms.ml.scan.HmsScanFrame r7, com.huawei.hms.ml.scan.HmsScanFrameOptions r8) {
            r0 = 4
            r1 = 0
            if (r7 == 0) goto L1a2
            android.graphics.YuvImage r2 = r7.getYuvImage()
            if (r2 != 0) goto L12
            android.graphics.Bitmap r2 = r7.getBitmap()
            if (r2 != 0) goto L12
            goto L1a2
        L12:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "frame height "
            r2.append(r3)
            int r3 = r7.getHeight()
            r2.append(r3)
            java.lang.String r3 = " width "
            r2.append(r3)
            int r3 = r7.getWidth()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Scankit"
            com.huawei.hms.scankit.p.o4.d(r3, r2)
            int r2 = r7.getHeight()
            int r4 = r7.getHeight()
            int r2 = r2 * r4
            r4 = 52428800(0x3200000, float:4.7019774E-37)
            if (r2 > r4) goto L174
            int r2 = r7.getHeight()
            int r4 = r7.getHeight()
            int r2 = r2 * r4
            if (r2 != 0) goto L54
            goto L174
        L54:
            int r2 = com.huawei.hms.hmsscankit.g.d     // Catch: java.lang.Exception -> L75
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r4) goto L60
            int r2 = com.huawei.hms.hmsscankit.g.a(r6)     // Catch: java.lang.Exception -> L75
            com.huawei.hms.hmsscankit.g.d = r2     // Catch: java.lang.Exception -> L75
        L60:
            int r2 = com.huawei.hms.hmsscankit.g.e     // Catch: java.lang.Exception -> L75
            if (r2 != r4) goto L7a
            android.content.Context r2 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L75
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Exception -> L75
            java.lang.String r4 = "huawei_module_scankit"
            int r2 = com.huawei.hms.feature.dynamic.DynamicModule.getRemoteVersion(r2, r4)     // Catch: java.lang.Exception -> L75
            com.huawei.hms.hmsscankit.g.e = r2     // Catch: java.lang.Exception -> L75
            goto L7a
        L75:
            java.lang.String r2 = "get remote version failed"
            com.huawei.hms.scankit.p.o4.b(r3, r2)
        L7a:
            if (r8 == 0) goto Lf4
            boolean r2 = r8.isMultiMode()
            if (r2 != 0) goto L83
            goto Lf4
        L83:
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r0 = new com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator
            r0.<init>()
            int r2 = r8.getType()
            int[] r3 = new int[r1]
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r0 = r0.setHmsScanTypes(r2, r3)
            boolean r2 = r8.isPhotoMode()
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r0 = r0.setPhotoMode(r2)
            boolean r8 = r8.isParseResult()
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r8 = r0.setParseResult(r8)
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r8 = r8.create()
            com.huawei.hms.ml.scan.HmsScan[] r6 = com.huawei.hms.hmsscankit.b.a(r6, r7, r8)
            int r7 = r6.length
            r8 = 4096(0x1000, float:5.74E-42)
            if (r7 != 0) goto Lb5
            com.huawei.hms.ml.scan.HmsScanResult r7 = new com.huawei.hms.ml.scan.HmsScanResult
            r7.<init>(r8, r6)
            return r7
        Lb5:
            int r7 = r6.length
            r0 = 1
            if (r7 != r0) goto Ld9
            r7 = r6[r1]
            double r2 = r7.getZoomValue()
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto Ld9
            r7 = r6[r1]
            java.lang.String r7 = r7.getOriginalValue()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto Ld9
            com.huawei.hms.ml.scan.HmsScanResult r7 = new com.huawei.hms.ml.scan.HmsScanResult
            r8 = 4098(0x1002, float:5.743E-42)
            r7.<init>(r8, r6)
            return r7
        Ld9:
            int r7 = r6.length
            if (r7 < r0) goto Lee
            r7 = r6[r1]
            java.lang.String r7 = r7.getOriginalValue()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Lee
            com.huawei.hms.ml.scan.HmsScanResult r7 = new com.huawei.hms.ml.scan.HmsScanResult
            r7.<init>(r1, r6)
            return r7
        Lee:
            com.huawei.hms.ml.scan.HmsScanResult r7 = new com.huawei.hms.ml.scan.HmsScanResult
            r7.<init>(r8, r6)
            return r7
        Lf4:
            if (r8 != 0) goto L100
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r2 = new com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator
            r2.<init>()
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2 = r2.create()
            goto L123
        L100:
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r2 = new com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator
            r2.<init>()
            int r3 = r8.getType()
            int[] r4 = new int[r1]
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r2 = r2.setHmsScanTypes(r3, r4)
            boolean r3 = r8.isPhotoMode()
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r2 = r2.setPhotoMode(r3)
            boolean r3 = r8.isParseResult()
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions$Creator r2 = r2.setParseResult(r3)
            com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2 = r2.create()
        L123:
            android.graphics.Bitmap r3 = r7.getBitmap()
            if (r3 == 0) goto L136
            android.graphics.Bitmap r7 = r7.getBitmap()
            com.huawei.hms.ml.scan.HmsScan[] r6 = com.huawei.hms.hmsscankit.f.a(r6, r7, r2)
            com.huawei.hms.ml.scan.HmsScanResult r6 = checkHmsScan(r6, r8)
            return r6
        L136:
            android.graphics.YuvImage r8 = r7.getYuvImage()
            if (r8 == 0) goto L16c
            int r8 = com.huawei.hms.hmsscankit.g.d
            int r8 = com.huawei.hms.hmsscankit.g.e
            int r8 = com.huawei.hms.hmsscankit.g.d
            int r0 = com.huawei.hms.hmsscankit.g.e
            boolean r8 = checkVersion(r8, r0)
            if (r8 == 0) goto L14f
            com.huawei.hms.ml.scan.HmsScanResult r6 = com.huawei.hms.hmsscankit.f.a(r6, r7, r2)
            return r6
        L14f:
            android.graphics.YuvImage r8 = r7.getYuvImage()
            byte[] r8 = r8.getYuvData()
            android.graphics.YuvImage r0 = r7.getYuvImage()
            int r0 = r0.getWidth()
            android.graphics.YuvImage r7 = r7.getYuvImage()
            int r7 = r7.getHeight()
            com.huawei.hms.ml.scan.HmsScanResult r6 = com.huawei.hms.hmsscankit.f.a(r6, r8, r0, r7, r2)
            return r6
        L16c:
            com.huawei.hms.ml.scan.HmsScanResult r6 = new com.huawei.hms.ml.scan.HmsScanResult
            com.huawei.hms.ml.scan.HmsScan[] r7 = new com.huawei.hms.ml.scan.HmsScan[r1]
            r6.<init>(r0, r7)
            return r6
        L174:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "input image is invalid:"
            r6.append(r8)
            int r8 = r7.getWidth()
            r6.append(r8)
            java.lang.String r8 = " "
            r6.append(r8)
            int r7 = r7.getHeight()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "ScanUtil"
            com.huawei.hms.scankit.p.o4.e(r7, r6)
            com.huawei.hms.ml.scan.HmsScanResult r6 = new com.huawei.hms.ml.scan.HmsScanResult
            com.huawei.hms.ml.scan.HmsScan[] r7 = new com.huawei.hms.ml.scan.HmsScan[r1]
            r6.<init>(r0, r7)
            return r6
        L1a2:
            com.huawei.hms.ml.scan.HmsScanResult r6 = new com.huawei.hms.ml.scan.HmsScanResult
            com.huawei.hms.ml.scan.HmsScan[] r7 = new com.huawei.hms.ml.scan.HmsScan[r1]
            r6.<init>(r0, r7)
            return r6
    }

    public static com.huawei.hms.ml.scan.HmsScan[] decodeWithBitmap(android.content.Context r2, android.graphics.Bitmap r3, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r4) {
            if (r3 == 0) goto L16
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            int r0 = r0 * r1
            r1 = 52428800(0x3200000, float:4.7019774E-37)
            if (r0 <= r1) goto L11
            goto L16
        L11:
            com.huawei.hms.ml.scan.HmsScan[] r2 = com.huawei.hms.hmsscankit.f.a(r2, r3, r4)
            return r2
        L16:
            if (r3 == 0) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "input image is too large:"
            r2.append(r4)
            int r3 = r3.getWidth()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ScanUtil"
            com.huawei.hms.scankit.p.o4.e(r3, r2)
        L32:
            r2 = 0
            com.huawei.hms.ml.scan.HmsScan[] r2 = new com.huawei.hms.ml.scan.HmsScan[r2]
            return r2
    }

    public static com.huawei.hms.ml.scan.HmsScan[] detectForHmsDector(android.content.Context r0, com.huawei.hms.mlsdk.common.MLFrame r1, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r2) {
            com.huawei.hms.ml.scan.HmsScan[] r0 = com.huawei.hms.hmsscankit.b.a(r0, r1, r2)
            return r0
    }

    private static android.graphics.Bitmap getBitmapFromUri(android.content.Context r3, android.net.Uri r4, android.graphics.BitmapFactory.Options r5) {
            java.lang.String r0 = "exception"
            r1 = 0
            if (r4 != 0) goto Ld
            java.lang.String r3 = "ScanBitmap"
            java.lang.String r4 = "uri == null"
            com.huawei.hms.scankit.p.o4.a(r3, r4)
            return r1
        Ld:
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L23 java.io.IOException -> L29 java.io.FileNotFoundException -> L2f
            java.lang.String r2 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r4, r2)     // Catch: java.lang.Exception -> L23 java.io.IOException -> L29 java.io.FileNotFoundException -> L2f
            java.io.FileDescriptor r4 = r3.getFileDescriptor()     // Catch: java.lang.Exception -> L23 java.io.IOException -> L29 java.io.FileNotFoundException -> L2f
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFileDescriptor(r4, r1, r5)     // Catch: java.lang.Exception -> L23 java.io.IOException -> L29 java.io.FileNotFoundException -> L2f
            r3.close()     // Catch: java.lang.Exception -> L23 java.io.IOException -> L29 java.io.FileNotFoundException -> L2f
            return r4
        L23:
            java.lang.String r3 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L34
        L29:
            java.lang.String r3 = "IOException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L34
        L2f:
            java.lang.String r3 = "FileNotFoundException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
        L34:
            return r1
    }

    public static boolean isScanAvailable(android.content.Context r0) {
            r0 = 1
            return r0
    }

    public static boolean selfPermissionGranted(android.content.Context r3, int r4, java.lang.String r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 23
            if (r0 < r2) goto L20
            if (r4 < r2) goto L17
            java.lang.String r4 = com.huawei.hms.scankit.p.w7.a(r5)
            if (r4 != 0) goto L10
            return r1
        L10:
            int r3 = androidx.core.app.q.a(r3, r5)
            if (r3 != 0) goto L1e
            goto L1d
        L17:
            int r3 = com.huawei.hms.scankit.p.w7.a(r3, r5)
            if (r3 != 0) goto L1e
        L1d:
            return r1
        L1e:
            r3 = 0
            return r3
        L20:
            return r1
    }

    public static int startScan(android.app.Activity r5, int r6, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r7) {
            java.lang.String r0 = "exception"
            java.lang.String r1 = "startScan before"
            java.lang.String r2 = "ScanUtil"
            com.huawei.hms.scankit.p.o4.d(r2, r1)
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.RuntimeException -> L1c android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.String r3 = r5.getPackageName()     // Catch: java.lang.RuntimeException -> L1c android.content.pm.PackageManager.NameNotFoundException -> L22
            r4 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r4)     // Catch: java.lang.RuntimeException -> L1c android.content.pm.PackageManager.NameNotFoundException -> L22
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.RuntimeException -> L1c android.content.pm.PackageManager.NameNotFoundException -> L22
            int r0 = r1.targetSdkVersion     // Catch: java.lang.RuntimeException -> L1c android.content.pm.PackageManager.NameNotFoundException -> L22
            goto L29
        L1c:
            java.lang.String r1 = "RuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L27
        L22:
            java.lang.String r1 = "NameNotFoundException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L27:
            r0 = 28
        L29:
            java.lang.String r1 = "android.permission.CAMERA"
            boolean r0 = selfPermissionGranted(r5, r0, r1)
            boolean r1 = com.huawei.hms.scankit.p.w7.c
            if (r1 != 0) goto L3a
            java.lang.String r5 = "startScan failed"
            com.huawei.hms.scankit.p.o4.d(r2, r5)
            r5 = 3
            return r5
        L3a:
            if (r0 != 0) goto L45
            if (r7 == 0) goto L43
            boolean r0 = r7.showGuide
            if (r0 == 0) goto L43
            goto L45
        L43:
            r5 = 1
            return r5
        L45:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.huawei.hms.hmsscankit.ScanKitActivity> r1 = com.huawei.hms.hmsscankit.ScanKitActivity.class
            r0.<init>(r5, r1)
            if (r7 == 0) goto L6a
            int r1 = r7.mode
            java.lang.String r3 = "ScanFormatValue"
            r0.putExtra(r3, r1)
            int r1 = r7.viewType
            java.lang.String r3 = "ScanViewValue"
            r0.putExtra(r3, r1)
            boolean r1 = r7.errorCheck
            java.lang.String r3 = "ScanErrorCheck"
            r0.putExtra(r3, r1)
            boolean r7 = r7.showGuide
            java.lang.String r1 = "ScanGuide"
            r0.putExtra(r1, r7)
        L6a:
            java.lang.String r7 = "startScan success"
            com.huawei.hms.scankit.p.o4.d(r2, r7)
            r7 = 0
            com.huawei.hms.scankit.p.w7.c = r7
            r5.startActivityForResult(r0, r6)
            return r7
    }
}
