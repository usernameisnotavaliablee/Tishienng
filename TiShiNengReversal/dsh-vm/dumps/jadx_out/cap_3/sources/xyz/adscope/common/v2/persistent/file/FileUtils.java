package xyz.adscope.common.v2.persistent.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class FileUtils {
    private FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean a(long r2, java.io.File r4) {
            long r0 = r4.lastModified()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    public static /* synthetic */ boolean b(java.lang.String r0, java.io.File r1, java.lang.String r2) {
            boolean r0 = r2.equals(r0)
            return r0
    }

    public static java.io.File createNewFile(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L13
            r0.createNewFile()     // Catch: java.io.IOException -> Lf
            return r0
        Lf:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
        L13:
            return r0
    }

    public static void deleteDirWithIgnore(java.io.File r4, java.util.Set<java.lang.String> r5) {
            if (r4 == 0) goto L32
            boolean r0 = r4.exists()
            if (r0 == 0) goto L32
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L32
            java.io.File[] r4 = r4.listFiles()
            if (r4 == 0) goto L32
            int r0 = r4.length
            r1 = 0
        L16:
            if (r1 >= r0) goto L32
            r2 = r4[r1]
            java.lang.String r3 = r2.getName()
            if (r5 == 0) goto L27
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L27
            goto L2f
        L27:
            r2.delete()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
        L2f:
            int r1 = r1 + 1
            goto L16
        L32:
            return
    }

    public static java.io.File[] filterFileByExpire(java.io.File r1, long r2) {
            if (r1 == 0) goto L18
            boolean r0 = r1.exists()
            if (r0 == 0) goto L18
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L18
            m5.a r0 = new m5.a
            r0.<init>(r2)
            java.io.File[] r1 = r1.listFiles(r0)
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static java.io.File[] filterFileByName(java.io.File r1, java.lang.String r2) {
            if (r1 == 0) goto L1e
            boolean r0 = r1.exists()
            if (r0 == 0) goto L1e
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L1e
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1e
            m5.b r0 = new m5.b
            r0.<init>(r2)
            java.io.File[] r1 = r1.listFiles(r0)
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public static java.util.List<java.io.File> getAllFile(java.io.File r2) {
            r0 = 0
            if (r2 == 0) goto L1a
            boolean r1 = r2.exists()
            if (r1 == 0) goto L1a
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L1a
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L1a
            java.util.List r2 = java.util.Arrays.asList(r2)
            return r2
        L1a:
            return r0
    }

    public static java.util.List<java.io.File> getAllFile(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.util.List r1 = getAllFile(r0)
            return r1
    }

    public static java.io.File getAppRootDir(android.content.Context r0) {
            java.io.File r0 = r0.getFilesDir()
            return r0
    }

    public static java.io.File getCacheFileDir(android.content.Context r0) {
            java.io.File r0 = r0.getCacheDir()
            return r0
    }

    public static long getFolderSizeByte(java.io.File r6) {
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 == 0) goto L28
            int r2 = r6.length
            r3 = 0
        La:
            if (r3 >= r2) goto L28
            r4 = r6[r3]
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L1a
            long r4 = r4.length()
        L18:
            long r0 = r0 + r4
            goto L25
        L1a:
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L25
            long r4 = getFolderSizeByte(r4)
            goto L18
        L25:
            int r3 = r3 + 1
            goto La
        L28:
            return r0
    }

    public static boolean hasFile(java.io.File r0, java.lang.String r1) {
            java.io.File[] r0 = filterFileByName(r0, r1)
            if (r0 == 0) goto Lb
            int r0 = r0.length
            if (r0 <= 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static java.lang.String readFileContent(java.io.File r2) {
            boolean r0 = r2.exists()
            r1 = 0
            if (r0 == 0) goto L30
            boolean r0 = r2.canRead()
            if (r0 == 0) goto L30
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            java.lang.String r2 = xyz.adscope.common.v2.tool.io.IOUtils.read(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1c
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            return r2
        L1a:
            r2 = move-exception
            goto L2c
        L1c:
            r2 = move-exception
            goto L22
        L1e:
            r2 = move-exception
            goto L2b
        L20:
            r2 = move-exception
            r0 = r1
        L22:
            xyz.adscope.common.v2.log.SDKLog.stack(r2)     // Catch: java.lang.Throwable -> L29
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            goto L30
        L29:
            r2 = move-exception
            r1 = r0
        L2b:
            r0 = r1
        L2c:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            throw r2
        L30:
            return r1
    }

    public static boolean storeCrashFormatFile(java.lang.String r5, long r6, java.lang.String r8) {
            java.lang.String r0 = "\r\n"
            java.io.File r5 = createNewFile(r5)
            r1 = 0
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4c
            r3 = 1
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4c
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            java.lang.String r6 = xyz.adscope.common.v2.tool.str.StringUtil.formatCrashLogDate(r6)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r5.write(r6)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r5.write(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r6 = "------------------crash----------------------"
            r5.write(r6)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r5.write(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r5.write(r8)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r5.write(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r6 = "-------------------end-----------------------"
            r5.write(r6)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r5.newLine()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r5)
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r2)
            return r3
        L39:
            r6 = move-exception
            goto L3d
        L3b:
            r6 = move-exception
            goto L3f
        L3d:
            r1 = r5
            goto L5e
        L3f:
            r1 = r2
            goto L4e
        L41:
            r5 = move-exception
            r6 = r5
            goto L5e
        L44:
            r5 = move-exception
            r6 = r5
            r5 = r1
            goto L3f
        L48:
            r5 = move-exception
            r6 = r5
            r5 = r1
            goto L5d
        L4c:
            r6 = move-exception
            r5 = r1
        L4e:
            xyz.adscope.common.v2.log.SDKLog.stack(r6)     // Catch: java.lang.Throwable -> L59
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r5)
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r1)
            r5 = 0
            return r5
        L59:
            r6 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
        L5d:
            r2 = r5
        L5e:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r1)
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r2)
            throw r6
    }

    public static void storeToFile(java.io.File r3, java.lang.String r4) {
            if (r3 == 0) goto L2a
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r2 = 1
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            byte[] r3 = r4.getBytes(r3)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            xyz.adscope.common.v2.tool.io.IOUtils.write(r1, r3)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r1)
            return
        L16:
            r3 = move-exception
            goto L26
        L18:
            r3 = move-exception
            r0 = r1
            goto L1e
        L1b:
            r3 = move-exception
            goto L25
        L1d:
            r3 = move-exception
        L1e:
            xyz.adscope.common.v2.log.SDKLog.stack(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r0)
            return
        L25:
            r1 = r0
        L26:
            xyz.adscope.common.v2.tool.io.IOUtils.closeQuietly(r1)
            throw r3
        L2a:
            return
    }

    public static void storeToFile(java.lang.String r0, java.lang.String r1) {
            java.io.File r0 = createNewFile(r0)
            storeToFile(r0, r1)
            return
    }
}
