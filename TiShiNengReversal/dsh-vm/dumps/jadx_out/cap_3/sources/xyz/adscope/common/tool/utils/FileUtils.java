package xyz.adscope.common.tool.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class FileUtils {
    public FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static long a(java.io.File[] r6) {
            int r0 = r6.length
            r1 = 0
            r3 = 0
        L4:
            if (r3 >= r0) goto L16
            r4 = r6[r3]
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L13
            long r4 = r4.length()
            long r1 = r1 + r4
        L13:
            int r3 = r3 + 1
            goto L4
        L16:
            return r1
    }

    private static java.util.List<java.io.File> a(java.io.File r4, java.util.List<java.io.File> r5) {
            java.io.File[] r4 = r4.listFiles()
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L1a
            r2 = r4[r1]
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L14
            a(r2, r5)
            goto L17
        L14:
            r5.add(r2)
        L17:
            int r1 = r1 + 1
            goto L6
        L1a:
            return r5
    }

    private static void a(java.io.File[] r6, java.util.Date r7) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L2f
            r3 = r6[r2]
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L2c
            long r4 = r3.lastModified()     // Catch: java.lang.Exception -> L2c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Exception -> L2c
            java.util.Date r4 = r0.parse(r4)     // Catch: java.lang.Exception -> L2c
            boolean r4 = r4.before(r7)     // Catch: java.lang.Exception -> L2c
            if (r4 == 0) goto L2c
            r3.delete()     // Catch: java.lang.Exception -> L2c
        L2c:
            int r2 = r2 + 1
            goto L9
        L2f:
            return
    }

    public static void deleteOldFiles(android.content.Context r10) {
            java.io.File r10 = getResourceCacheDirectory(r10)     // Catch: java.lang.Throwable -> L65
            boolean r0 = r10.exists()     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L65
            java.io.File[] r0 = r10.listFiles()     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L65
            long r1 = a(r0)     // Catch: java.lang.Throwable -> L65
            r3 = 524288000(0x1f400000, double:2.590326893E-315)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L33
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L65
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L65
            r4 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 - r4
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L65
            a(r0, r1)     // Catch: java.lang.Throwable -> L65
            java.io.File[] r0 = r10.listFiles()     // Catch: java.lang.Throwable -> L65
            long r1 = a(r0)     // Catch: java.lang.Throwable -> L65
        L33:
            r3 = 1
        L34:
            r4 = 262144000(0xfa00000, double:1.295163447E-315)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L65
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L65
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L65
            int r2 = r3 + (-1)
            double r6 = (double) r2     // Catch: java.lang.Throwable -> L65
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = java.lang.Math.pow(r8, r6)     // Catch: java.lang.Throwable -> L65
            int r2 = (int) r6     // Catch: java.lang.Throwable -> L65
            r6 = 7
            int r6 = r6 / r2
            r2 = 86400000(0x5265c00, float:7.82218E-36)
            int r6 = r6 * r2
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L65
            long r4 = r4 - r6
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L65
            a(r0, r1)     // Catch: java.lang.Throwable -> L65
            java.io.File[] r0 = r10.listFiles()     // Catch: java.lang.Throwable -> L65
            long r1 = a(r0)     // Catch: java.lang.Throwable -> L65
            int r3 = r3 + 1
            goto L34
        L65:
            return
    }

    public static java.io.File getAppRootPath(android.content.Context r0) {
            java.io.File r0 = r0.getFilesDir()
            return r0
    }

    public static java.io.File getExternalFileDirectory(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L22
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto L16
            boolean r1 = android.os.Environment.isExternalStorageRemovable()     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto L1a
        L16:
            java.io.File r0 = r3.getExternalFilesDir(r0)     // Catch: java.lang.Exception -> L22
        L1a:
            if (r0 != 0) goto L21
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Exception -> L22
            return r3
        L21:
            return r0
        L22:
            java.io.File r3 = r3.getFilesDir()
            return r3
    }

    public static java.util.List<java.io.File> getFileList(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = a(r0, r1)
            return r1
    }

    public static java.io.File getResourceCacheDirectory(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = "/asnp/material/"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L27
            r0.mkdirs()
        L27:
            return r0
    }

    public static java.lang.String readFileContent(java.io.File r3) {
            boolean r0 = r3.exists()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L26
            r1.<init>(r3)     // Catch: java.lang.Exception -> L26
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L26
            r3.<init>(r1)     // Catch: java.lang.Exception -> L26
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L26
            r2.<init>(r3)     // Catch: java.lang.Exception -> L26
        L1c:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Exception -> L26
            if (r3 == 0) goto L28
            r0.append(r3)     // Catch: java.lang.Exception -> L26
            goto L1c
        L26:
            r3 = move-exception
            goto L2c
        L28:
            r1.close()     // Catch: java.lang.Exception -> L26
            goto L42
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r1, r3)
        L42:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static boolean sdCardIsAvailable() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.<init>(r1)
            boolean r0 = r0.canWrite()
            return r0
        L1e:
            r0 = 0
            return r0
    }
}
