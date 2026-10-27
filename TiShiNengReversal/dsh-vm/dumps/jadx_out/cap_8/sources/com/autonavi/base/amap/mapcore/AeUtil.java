package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AeUtil {
    private static final java.lang.String AMAP_ASSETS_DB_CK_PATH = "ae/res.ck";
    private static final java.lang.String AMAP_GLOBAL_DB_NAME = "global.db";
    private static final java.lang.String AMAP_GLOBAL_SP_ITEM_MD5 = "amap_res_global_db_md5";
    private static final java.lang.String AMAP_GLOBAL_SP_NAME = "amap_res_global_db";
    private static final java.lang.String AMAP_INTERSECTION_ASSETS_DIR = "VM3DRes";
    public static final java.lang.String AMAP_RESZIP_TARGET_DIR_NAME = "res920";
    public static final java.lang.String CONFIGNAME = "GNaviConfig.xml";
    public static final boolean IS_AE = true;
    public static final java.lang.String RESZIPNAME = "res.zip";
    public static final java.lang.String ROOTPATH = "/amap/";
    public static final java.lang.String ROOT_DATA_PATH_NAME = "data_v6";
    public static final java.lang.String ROOT_DATA_PATH_OLD_NAME = "data";
    private static java.lang.String global_db_path;



    static {
            return
    }

    public AeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(java.lang.String r0, android.content.Context r1) {
            loadEngineRes(r0, r1)
            return
    }

    static /* synthetic */ void access$100(java.lang.String r0, java.lang.String r1, android.content.Context r2) {
            loadAndSaveIntersectionRes(r0, r1, r2)
            return
    }

    private static boolean checkEngineRes(java.io.File r5) {
            java.io.File[] r5 = r5.listFiles()
            r0 = 0
            if (r5 == 0) goto L23
            int r1 = r5.length
            if (r1 <= 0) goto L23
            int r1 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L23
            r3 = r5[r2]
            if (r3 == 0) goto L20
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "global.db"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L20
            r5 = 1
            return r5
        L20:
            int r2 = r2 + 1
            goto Lc
        L23:
            return r0
    }

    private static java.lang.String formatFileSeparator(java.lang.String r2) {
            if (r2 == 0) goto La
            java.lang.String r0 = "//"
            java.lang.String r1 = "/"
            java.lang.String r2 = r2.replace(r0, r1)
        La:
            return r2
    }

    private static java.lang.String getAssetsGlobalDbMd5(android.content.Context r2) {
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "ae/res.ck"
            byte[] r2 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static java.lang.String getGlobalDbPath() {
            java.lang.String r0 = com.autonavi.base.amap.mapcore.AeUtil.global_db_path
            return r0
    }

    public static void initCrashHandle(android.content.Context r8) {
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L31
            com.amap.api.col.3l.y5 r0 = com.amap.api.col.p0003l.y5.a(r0)     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.c(r8)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L30
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L30
            com.amap.api.col.3l.y5 r1 = com.amap.api.col.p0003l.y5.a(r0)     // Catch: java.lang.Throwable -> L31
            boolean r3 = r1.d(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r0.a()     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = r0.e()     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r0.f()     // Catch: java.lang.Throwable -> L31
            java.lang.String[] r7 = r0.i()     // Catch: java.lang.Throwable -> L31
            r2 = r8
            com.autonavi.amap.mapcore.MsgProcessor.nativeInitInfo(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L31
        L30:
            return
        L31:
            r0 = move-exception
            r8 = r0
            com.amap.api.col.p0003l.b3.D(r8)
            return
    }

    public static void initIntersectionRes(android.content.Context r3, com.autonavi.base.ae.gmap.GLMapEngine.InitParam r4) {
            java.lang.String r0 = com.autonavi.base.amap.mapcore.FileUtil.getMapBaseStorage(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = "/VM3DRes/"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L23
            r2.mkdir()
        L23:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L31
            r0.mkdir()
        L31:
            r4.mIntersectionResPath = r1
            java.lang.String r0 = formatFileSeparator(r1)
            r4.mIntersectionResPath = r0
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L50
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()     // Catch: java.lang.Exception -> L4f
            com.autonavi.base.amap.mapcore.AeUtil$2 r1 = new com.autonavi.base.amap.mapcore.AeUtil$2     // Catch: java.lang.Exception -> L4f
            r1.<init>(r4, r3)     // Catch: java.lang.Exception -> L4f
            r0.b(r1)     // Catch: java.lang.Exception -> L4f
        L4f:
            return
        L50:
            java.lang.String r0 = "map_assets/VM3DRes"
            java.lang.String r4 = r4.mIntersectionResPath
            loadAndSaveIntersectionRes(r0, r4, r3)
            return
    }

    public static com.autonavi.base.ae.gmap.GLMapEngine.InitParam initResource(android.content.Context r5) {
            java.lang.String r0 = com.autonavi.base.amap.mapcore.FileUtil.getMapBaseStorage(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = "/data_v6/"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L23
            r2.mkdir()
        L23:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L31
            r2.mkdir()
        L31:
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 != r3) goto L4a
            com.amap.api.col.3l.z2 r2 = com.amap.api.col.p0003l.z2.a()     // Catch: java.lang.Exception -> L48
            com.autonavi.base.amap.mapcore.AeUtil$1 r3 = new com.autonavi.base.amap.mapcore.AeUtil$1     // Catch: java.lang.Exception -> L48
            r3.<init>(r0, r5)     // Catch: java.lang.Exception -> L48
            r2.b(r3)     // Catch: java.lang.Exception -> L48
            goto L4d
        L48:
            goto L4d
        L4a:
            loadEngineRes(r0, r5)
        L4d:
            com.autonavi.base.ae.gmap.GLMapEngine$InitParam r2 = new com.autonavi.base.ae.gmap.GLMapEngine$InitParam
            r2.<init>()
            java.lang.String r3 = "ae/GNaviConfig.xml"
            byte[] r3 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r5, r3)
            r2.mRootPath = r0
            if (r3 == 0) goto L8c
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "utf-8"
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L76
            r2.mConfigContent = r0     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "data_v6"
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L6e
            goto L8c
        L6e:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "GNaviConfig.xml 和数据目录data_v6不匹配"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L76
            throw r0     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "initConfig error:"
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.amap.api.col.p0003l.y2.o(r5, r0)
        L8c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r0 = "/map/"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r2.mOfflineDataPath = r5
            r2.mP3dCrossPath = r1
            java.lang.String r5 = formatFileSeparator(r5)
            r2.mOfflineDataPath = r5
            java.lang.String r5 = r2.mRootPath
            java.lang.String r5 = formatFileSeparator(r5)
            r2.mRootPath = r5
            java.lang.String r5 = r2.mP3dCrossPath
            java.lang.String r5 = formatFileSeparator(r5)
            r2.mP3dCrossPath = r5
            return r2
    }

    private static void loadAndSaveIntersectionRes(java.lang.String r7, java.lang.String r8, android.content.Context r9) {
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Le
            r0.mkdirs()
        Le:
            android.content.res.AssetManager r0 = r9.getAssets()
            java.lang.String[] r0 = r0.list(r7)     // Catch: java.lang.Exception -> L42
            if (r0 != 0) goto L19
            goto L42
        L19:
            int r1 = r0.length     // Catch: java.lang.Exception -> L42
            r2 = 0
        L1b:
            if (r2 >= r1) goto L42
            r3 = r0[r2]     // Catch: java.lang.Exception -> L42
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L42
            r4.<init>(r8, r3)     // Catch: java.lang.Exception -> L42
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42
            r5.<init>()     // Catch: java.lang.Exception -> L42
            r5.append(r7)     // Catch: java.lang.Exception -> L42
            java.lang.String r6 = "/"
            r5.append(r6)     // Catch: java.lang.Exception -> L42
            r5.append(r3)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Exception -> L42
            readAssetsFileAndSave(r3, r4, r9)     // Catch: java.lang.Exception -> L42
            int r2 = r2 + 1
            goto L1b
        L42:
            return
    }

    private static void loadEngineRes(java.lang.String r10, android.content.Context r11) {
            java.lang.String r0 = "loadEngineRes error:"
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "res920"
            r1.<init>(r10, r2)
            boolean r10 = r1.exists()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r10 == 0) goto L18
            boolean r10 = r1.isDirectory()
            if (r10 != 0) goto L24
        L18:
            boolean r10 = r1.mkdirs()
            if (r10 == 0) goto L24
            java.lang.String r10 = getAssetsGlobalDbMd5(r11)
            r5 = 1
            goto L26
        L24:
            r10 = r3
            r5 = 0
        L26:
            java.lang.String r6 = "amap_res_global_db_md5"
            java.lang.String r7 = "amap_res_global_db"
            if (r5 != 0) goto L43
            java.lang.String r10 = getAssetsGlobalDbMd5(r11)
            java.lang.String r8 = ""
            java.lang.String r8 = com.amap.api.col.p0003l.r2.b(r11, r7, r6, r8)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L44
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L43
            goto L44
        L43:
            r2 = r5
        L44:
            if (r2 == 0) goto L47
            goto L4b
        L47:
            boolean r4 = checkEngineRes(r1)
        L4b:
            java.lang.String r5 = "/global.db"
            if (r4 != 0) goto Lb7
            android.content.res.AssetManager r4 = r11.getAssets()     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            java.lang.String r8 = "ae/res.zip"
            java.io.InputStream r3 = r4.open(r8)     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            java.lang.String r4 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            com.autonavi.base.amap.mapcore.FileUtil.decompress(r3, r4)     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            r4.append(r1)     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            r4.append(r5)     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            com.autonavi.base.amap.mapcore.AeUtil.global_db_path = r1     // Catch: java.lang.Throwable -> L79 java.lang.OutOfMemoryError -> L7b java.lang.Exception -> L7d
            if (r3 == 0) goto Lc8
        L73:
            r3.close()     // Catch: java.io.IOException -> L77
            goto Lc8
        L77:
            goto Lc8
        L79:
            r10 = move-exception
            goto Lb1
        L7b:
            r1 = move-exception
            goto L7f
        L7d:
            r1 = move-exception
            goto L98
        L7f:
            com.amap.api.col.p0003l.b3.D(r1)     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L79
            r4.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L79
            com.amap.api.col.p0003l.y2.o(r11, r0)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto Lc8
            goto L73
        L98:
            com.amap.api.col.p0003l.b3.D(r1)     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L79
            r4.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L79
            com.amap.api.col.p0003l.y2.o(r11, r0)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto Lc8
            goto L73
        Lb1:
            if (r3 == 0) goto Lb6
            r3.close()     // Catch: java.io.IOException -> Lb6
        Lb6:
            throw r10
        Lb7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.autonavi.base.amap.mapcore.AeUtil.global_db_path = r0
        Lc8:
            if (r2 == 0) goto Lcd
            com.amap.api.col.p0003l.r2.c(r11, r7, r6, r10)
        Lcd:
            return
    }

    public static boolean loadLib(android.content.Context r3) {
            boolean r3 = com.autonavi.config.a.f5878b     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            if (r3 != 0) goto Lc
            java.lang.String r3 = com.autonavi.config.a.a     // Catch: java.lang.Throwable -> Ld
            java.lang.System.loadLibrary(r3)     // Catch: java.lang.Throwable -> Ld
            com.autonavi.config.a.f5878b = r0     // Catch: java.lang.Throwable -> Ld
        Lc:
            return r0
        Ld:
            r3 = move-exception
            java.lang.String r0 = "AeUtil"
            java.lang.String r1 = "loadLib"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            com.amap.api.col.p0003l.b3.D(r3)
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "load so failed "
            r1.<init>(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.amap.api.col.p0003l.d3.l(r0, r3)
            r3 = 0
            return r3
    }

    public static void readAssetsFileAndSave(java.lang.String r3, java.lang.String r4, android.content.Context r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L4f
        L7:
            r0 = 0
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L40
            java.io.InputStream r3 = r5.open(r3)     // Catch: java.lang.Throwable -> L40
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L1f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            boolean r4 = r5.exists()     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto L23
            r5.delete()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r4 = r0
        L21:
            r0 = r3
            goto L42
        L23:
            r5.createNewFile()     // Catch: java.lang.Throwable -> L1f
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1f
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r5]     // Catch: java.lang.Throwable -> L3a
        L2f:
            r1 = 0
            int r2 = r3.read(r0, r1, r5)     // Catch: java.lang.Throwable -> L3a
            if (r2 <= 0) goto L3c
            r4.write(r0, r1, r2)     // Catch: java.lang.Throwable -> L3a
            goto L2f
        L3a:
            goto L21
        L3c:
            r3.close()     // Catch: java.io.IOException -> L4b
            goto L4b
        L40:
            r4 = r0
        L42:
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.io.IOException -> L48
            goto L49
        L48:
        L49:
            if (r4 == 0) goto L4f
        L4b:
            r4.close()     // Catch: java.io.IOException -> L4f
        L4f:
            return
    }
}
