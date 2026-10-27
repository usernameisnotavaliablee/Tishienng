package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class FileUtils {
    private static final java.util.regex.Pattern RESERVED_CHARS_PATTERN = null;
    private static final java.util.regex.Pattern SAFE_FILENAME_PATTERN = null;
    public static final int S_IRGRP = 32;
    public static final int S_IROTH = 4;
    public static final int S_IRUSR = 256;
    public static final int S_IRWXG = 56;
    public static final int S_IRWXO = 7;
    public static final int S_IRWXU = 448;
    public static final int S_IWGRP = 16;
    public static final int S_IWOTH = 2;
    public static final int S_IWUSR = 128;
    public static final int S_IXGRP = 8;
    public static final int S_IXOTH = 1;
    public static final int S_IXUSR = 64;

    static {
            java.lang.String r0 = "[\\w%+,./=_-]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.baidu.idl.face.platform.utils.FileUtils.SAFE_FILENAME_PATTERN = r0
            java.lang.String r0 = "[\\\\/:\\*\\?\\\"<>|]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.baidu.idl.face.platform.utils.FileUtils.RESERVED_CHARS_PATTERN = r0
            return
    }

    private FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void cleanDir(java.io.File r1) {
            r0 = 0
            deleteDir(r1, r0)
            return
    }

    public static void cleanDir(java.io.File r1, java.io.FileFilter r2) {
            r0 = 0
            deleteDir(r1, r0, r2)
            return
    }

    public static void cleanDir(java.io.File r1, java.io.FilenameFilter r2) {
            r0 = 0
            deleteDir(r1, r0, r2)
            return
    }

    public static long computeFolderSize(java.io.File r6) {
            r0 = 0
            if (r6 != 0) goto L5
            return r0
        L5:
            java.io.File[] r6 = r6.listFiles()
            if (r6 == 0) goto L30
            r2 = 0
        Lc:
            int r3 = r6.length
            if (r2 >= r3) goto L30
            r3 = r6[r2]
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L1d
            long r3 = r3.length()
        L1b:
            long r0 = r0 + r3
            goto L2d
        L1d:
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L2d
            long r4 = r3.length()
            long r0 = r0 + r4
            long r3 = computeFolderSize(r3)
            goto L1b
        L2d:
            int r2 = r2 + 1
            goto Lc
        L30:
            return r0
    }

    public static void copyDirectory(java.io.File r5, java.io.File r6) throws java.io.IOException {
            boolean r0 = r5.exists()
            if (r0 == 0) goto L38
            r6.mkdirs()
            java.io.File[] r5 = r5.listFiles()
            if (r5 != 0) goto L10
            goto L38
        L10:
            int r0 = r5.length
            r1 = 0
        L12:
            if (r1 >= r0) goto L38
            r2 = r5[r1]
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L29
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r2.getName()
            r3.<init>(r6, r4)
            copyDirectory(r2, r3)
            goto L35
        L29:
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r2.getName()
            r3.<init>(r6, r4)
            copyFile(r2, r3)
        L35:
            int r1 = r1 + 1
            goto L12
        L38:
            return
    }

    public static void copyFile(java.io.File r9, java.io.File r10) {
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L4b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L4b
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L42
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L42
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3a
            java.nio.channels.FileChannel r8 = r9.getChannel()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            long r6 = r3.size()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2d
            r4 = 0
            r3.transferTo(r4, r6, r8)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2d
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r2)
        L1f:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r3)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r9)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r8)
            return
        L29:
            r0 = move-exception
            r10 = r0
        L2b:
            r1 = r2
            goto L4f
        L2d:
            r1 = r2
            goto L5c
        L2f:
            r0 = move-exception
            r10 = r0
            r8 = r1
            goto L2b
        L33:
            r8 = r1
            goto L2d
        L35:
            r0 = move-exception
            r10 = r0
            r3 = r1
        L38:
            r8 = r3
            goto L2b
        L3a:
            r3 = r1
        L3b:
            r8 = r3
            goto L2d
        L3d:
            r0 = move-exception
            r10 = r0
            r9 = r1
            r3 = r9
            goto L38
        L42:
            r9 = r1
            r3 = r9
            goto L3b
        L45:
            r0 = move-exception
            r10 = r0
            r9 = r1
            r3 = r9
            r8 = r3
            goto L4f
        L4b:
            r9 = r1
            r3 = r9
            r8 = r3
            goto L5c
        L4f:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r3)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r9)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r8)
            throw r10
        L5c:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            goto L1f
    }

    public static void copyFile(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L1c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L1c
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L15
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L15
            com.baidu.idl.face.platform.utils.IoUtils.copyStream(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L15
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            return
        L12:
            r2 = move-exception
            r0 = r1
            goto L18
        L15:
            r0 = r1
            goto L1c
        L17:
            r2 = move-exception
        L18:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
            throw r2
        L1c:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
            return
    }

    public static java.io.File createCollectDirectory() {
            java.io.File r0 = getSDRootFile()
            if (r0 == 0) goto L1d
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1d
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "CollectBest"
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L1c
            r1.mkdirs()
        L1c:
            return r1
        L1d:
            r0 = 0
            return r0
    }

    public static void deleteDir(java.io.File r1) {
            r0 = 1
            deleteDir(r1, r0)
            return
    }

    public static void deleteDir(java.io.File r1, java.io.FileFilter r2) {
            r0 = 1
            deleteDir(r1, r0, r2)
            return
    }

    public static void deleteDir(java.io.File r1, java.io.FilenameFilter r2) {
            r0 = 1
            deleteDir(r1, r0, r2)
            return
    }

    public static void deleteDir(java.io.File r5, boolean r6) {
            if (r5 == 0) goto L2c
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L2c
            java.io.File[] r0 = r5.listFiles()
            if (r0 == 0) goto L27
            int r1 = r0.length
            if (r1 <= 0) goto L27
            int r1 = r0.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L21
            deleteDir(r3, r6)
            goto L24
        L21:
            r3.delete()
        L24:
            int r2 = r2 + 1
            goto L13
        L27:
            if (r6 == 0) goto L2c
            r5.delete()
        L2c:
            return
    }

    public static void deleteDir(java.io.File r5, boolean r6, java.io.FileFilter r7) {
            if (r5 == 0) goto L29
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L29
            java.io.File[] r0 = r5.listFiles(r7)
            if (r0 == 0) goto L24
            int r1 = r0.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L24
            r3 = r0[r2]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L1e
            deleteDir(r3, r6, r7)
            goto L21
        L1e:
            r3.delete()
        L21:
            int r2 = r2 + 1
            goto L10
        L24:
            if (r6 == 0) goto L29
            r5.delete()
        L29:
            return
    }

    public static void deleteDir(java.io.File r5, boolean r6, java.io.FilenameFilter r7) {
            if (r5 == 0) goto L29
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L29
            java.io.File[] r0 = r5.listFiles(r7)
            if (r0 == 0) goto L24
            int r1 = r0.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L24
            r3 = r0[r2]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L1e
            deleteDir(r3, r6, r7)
            goto L21
        L1e:
            r3.delete()
        L21:
            int r2 = r2 + 1
            goto L10
        L24:
            if (r6 == 0) goto L29
            r5.delete()
        L29:
            return
    }

    public static void deleteDir(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            deleteDir(r0)
            return
    }

    public static boolean deleteFileIfExist(java.io.File r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.exists()
            if (r1 == 0) goto Lf
            boolean r2 = r2.delete()
            return r2
        Lf:
            return r0
    }

    public static boolean deleteFileIfExist(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L18
            boolean r2 = r0.delete()
            return r2
        L18:
            return r1
    }

    public static void ensureDir(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L13
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L12
            r1.delete()
            r1.mkdirs()
        L12:
            return
        L13:
            r1.mkdirs()
            return
    }

    public static boolean ensureMkdir(java.io.File r6) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            r0 = 1
            r2 = 1
            r1 = r6
        L7:
            boolean r3 = r1.exists()
            if (r3 == 0) goto L35
            java.io.File r1 = new java.io.File
            java.lang.String r3 = r6.getParent()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r6.getName()
            r4.append(r5)
            java.lang.String r5 = "("
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ")"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r3, r4)
            int r2 = r2 + r0
            goto L7
        L35:
            boolean r6 = r1.mkdir()
            return r6
    }

    public static void ensureParent(java.io.File r1) {
            if (r1 == 0) goto L11
            java.io.File r1 = r1.getParentFile()
            if (r1 == 0) goto L11
            boolean r0 = r1.exists()
            if (r0 != 0) goto L11
            r1.mkdirs()
        L11:
            return
    }

    public static boolean existsFile(java.io.File r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.exists()
            if (r0 == 0) goto L10
            boolean r1 = r1.isFile()
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean existsFile(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = existsFile(r0)
            return r1
    }

    public static java.lang.String getExtension(java.io.File r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r1 = r1.getName()
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L17
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            return r1
        L17:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String getExtension(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.lang.String r1 = getExtension(r0)
            return r1
    }

    public static java.lang.String getFileNameWithoutExtension(java.io.File r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r2 = r2.getName()
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            if (r0 < 0) goto L15
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L15:
            return r2
    }

    public static java.lang.String getFileNameWithoutExtension(java.lang.String r2) {
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 == r1) goto Le
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        Le:
            return r2
    }

    public static java.lang.String getFileNameWithoutExtensionByPath(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.lang.String r1 = getFileNameWithoutExtension(r0)
            return r1
    }

    public static java.io.File getSDRootFile() {
            boolean r0 = isSdCardAvailable()
            if (r0 == 0) goto Lb
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static java.io.File getUserDir() {
            java.lang.String r0 = "user.dir"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            return r1
    }

    public static java.io.File getUserHome() {
            java.lang.String r0 = "user.home"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            return r1
    }

    public static boolean isFilenameSafe(java.io.File r1) {
            java.util.regex.Pattern r0 = com.baidu.idl.face.platform.utils.FileUtils.SAFE_FILENAME_PATTERN
            java.lang.String r1 = r1.getPath()
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    public static boolean isFilenameValid(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.regex.Pattern r0 = com.baidu.idl.face.platform.utils.FileUtils.RESERVED_CHARS_PATTERN
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.find()
            r1 = r1 ^ 1
            return r1
    }

    public static boolean isSdCardAvailable() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static java.io.FileOutputStream openNewFileOutput(java.io.File r1) throws java.io.IOException {
            deleteFileIfExist(r1)
            ensureParent(r1)
            r1.createNewFile()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            return r0
    }

    public static byte[] readAssetFileContent(android.content.res.AssetManager r3, java.lang.String r4) throws java.io.IOException {
            java.io.InputStream r3 = r3.open(r4)
            int r4 = r3.available()
            byte[] r0 = new byte[r4]
            int r1 = r3.read(r0)
            if (r1 != r4) goto L14
            r3.close()
            return r0
        L14:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "realSize is not equal to size: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " : "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public static java.lang.String readAssetFileUtf8String(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            byte[] r1 = readAssetFileContent(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            r2.<init>(r1, r0)
            return r2
    }

    public static java.util.Map<java.lang.String, java.lang.String> readConfig(java.io.File r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r7 = readFileText(r7)
            if (r7 == 0) goto L50
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L12
            goto L50
        L12:
            java.lang.String r1 = "\n"
            java.lang.String[] r7 = r7.split(r1)
            int r1 = r7.length
            r2 = 0
            r3 = 0
        L1b:
            if (r3 >= r1) goto L50
            r4 = r7[r3]
            java.lang.String r4 = r4.trim()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L2a
            goto L4d
        L2a:
            java.lang.String r5 = "#"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L33
            goto L4d
        L33:
            java.lang.String r5 = "="
            r6 = 2
            java.lang.String[] r4 = r4.split(r5, r6)
            int r5 = r4.length
            if (r5 < r6) goto L4d
            r5 = r4[r2]
            java.lang.String r5 = r5.trim()
            r6 = 1
            r4 = r4[r6]
            java.lang.String r4 = r4.trim()
            r0.put(r5, r4)
        L4d:
            int r3 = r3 + 1
            goto L1b
        L50:
            return r0
    }

    public static byte[] readFileBytes(java.io.File r2) {
            boolean r0 = existsFile(r2)
            r1 = 0
            if (r0 == 0) goto L22
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            byte[] r2 = com.baidu.idl.face.platform.utils.IoUtils.loadBytes(r0)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L1f
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
            return r2
        L14:
            r2 = move-exception
            r1 = r0
            goto L1b
        L17:
            r2 = move-exception
            goto L1b
        L19:
            r0 = r1
            goto L1f
        L1b:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            throw r2
        L1f:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
        L22:
            return r1
    }

    public static java.lang.String readFileText(java.io.File r2) {
            boolean r0 = existsFile(r2)
            r1 = 0
            if (r0 == 0) goto L22
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            java.lang.String r2 = com.baidu.idl.face.platform.utils.IoUtils.loadContent(r0)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L1f
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
            return r2
        L14:
            r2 = move-exception
            r1 = r0
            goto L1b
        L17:
            r2 = move-exception
            goto L1b
        L19:
            r0 = r1
            goto L1f
        L1b:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            throw r2
        L1f:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
        L22:
            return r1
    }

    public static java.lang.String readFileText(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.lang.String r1 = readFileText(r0)
            return r1
    }

    public static java.lang.String readFileText(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13
            java.lang.String r2 = com.baidu.idl.face.platform.utils.IoUtils.loadContent(r1, r3)     // Catch: java.lang.Throwable -> Le java.io.IOException -> L19
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            return r2
        Le:
            r2 = move-exception
            r0 = r1
            goto L15
        L11:
            r2 = move-exception
            goto L15
        L13:
            r1 = r0
            goto L19
        L15:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
            throw r2
        L19:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            return r0
    }

    public static void writeToFile(java.io.File r2, java.lang.String r3) {
            r0 = 0
            java.lang.String r1 = "utf-8"
            writeToFile(r2, r3, r0, r1)
            return
    }

    public static void writeToFile(java.io.File r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            writeToFile(r1, r2, r0, r3)
            return
    }

    public static void writeToFile(java.io.File r1, java.lang.String r2, boolean r3) {
            java.lang.String r0 = "utf-8"
            writeToFile(r1, r2, r3, r0)
            return
    }

    public static void writeToFile(java.io.File r3, java.lang.String r4, boolean r5, java.lang.String r6) {
            if (r3 == 0) goto L2b
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L9
            goto L2b
        L9:
            ensureParent(r3)
            r0 = 0
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            r1.write(r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            return
        L1e:
            r3 = move-exception
            r0 = r1
            goto L24
        L21:
            r0 = r1
            goto L28
        L23:
            r3 = move-exception
        L24:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
            throw r3
        L28:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
        L2b:
            return
    }

    public static final void writeToFile(java.io.File r2, byte[] r3) {
            if (r2 == 0) goto L22
            if (r3 != 0) goto L5
            goto L22
        L5:
            ensureParent(r2)
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1f
            r1.write(r3)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L18
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            return
        L15:
            r2 = move-exception
            r0 = r1
            goto L1b
        L18:
            r0 = r1
            goto L1f
        L1a:
            r2 = move-exception
        L1b:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
            throw r2
        L1f:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r0)
        L22:
            return
    }

    public static void writeToFileNio(java.io.File r9, byte[] r10) {
            r1 = 0
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            java.nio.channels.ReadableByteChannel r3 = java.nio.channels.Channels.newChannel(r0)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            java.nio.channels.FileChannel r2 = r8.getChannel()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2e
            int r9 = r10.length     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L28
            long r6 = (long) r9     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L28
            r4 = 0
            r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L28
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r8)
        L1d:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r3)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r2)
            return
        L24:
            r0 = move-exception
            r9 = r0
        L26:
            r1 = r8
            goto L3e
        L28:
            r1 = r8
            goto L48
        L2a:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L26
        L2e:
            r2 = r1
            goto L28
        L30:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L3e
        L34:
            r2 = r1
            goto L48
        L36:
            r0 = move-exception
            r9 = r0
            r2 = r1
            r3 = r2
            goto L3e
        L3b:
            r2 = r1
            r3 = r2
            goto L48
        L3e:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r3)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r2)
            throw r9
        L48:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            goto L1d
    }

    public static void writeToFileNio(java.io.InputStream r8, java.io.File r9) {
            r1 = 0
            int r0 = r8.available()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L39
            java.nio.channels.ReadableByteChannel r3 = java.nio.channels.Channels.newChannel(r8)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L39
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            java.nio.channels.FileChannel r2 = r8.getChannel()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2c
            r4 = 0
            long r6 = (long) r0
            r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L26
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r8)
        L1b:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r3)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r2)
            return
        L22:
            r0 = move-exception
            r9 = r0
        L24:
            r1 = r8
            goto L3c
        L26:
            r1 = r8
            goto L46
        L28:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L24
        L2c:
            r2 = r1
            goto L26
        L2e:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L3c
        L32:
            r2 = r1
            goto L46
        L34:
            r0 = move-exception
            r9 = r0
            r2 = r1
            r3 = r2
            goto L3c
        L39:
            r2 = r1
            r3 = r2
            goto L46
        L3c:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r3)
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r2)
            throw r9
        L46:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            goto L1b
    }
}
