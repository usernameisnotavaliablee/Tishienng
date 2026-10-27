package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FileUtil {
    private static final int BUFFER = 1024;
    private static final java.lang.String FILE_PATH_ENTRY_BACK = "..";
    private static final java.lang.String FILE_PATH_ENTRY_SEPARATOR1 = "\\";
    private static final java.lang.String FILE_PATH_ENTRY_SEPARATOR2 = "%";
    private static final java.lang.String TAG = "FileUtil";
    private static final char UNIX_SEPARATOR = '/';
    private static final char WINDOWS_SEPARATOR = '\\';

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class UnZipFileBrake {
        public boolean mIsAborted;

        public UnZipFileBrake() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mIsAborted = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ZipCompressProgressListener {
        void onFinishProgress(long r1);
    }

    public FileUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkCanWrite(java.io.File r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.canWrite()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "amap.tmp"
            r1.<init>(r3, r2)
            r1.createNewFile()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r1.exists()
            if (r3 != 0) goto L1c
            return r0
        L1c:
            r1.delete()
            r3 = 1
            return r3
        L21:
            return r0
    }

    public static byte[] compress(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L3a
            int r1 = r3.length()
            if (r1 != 0) goto La
            goto L3a
        La:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            byte[] r3 = r3.getBytes(r4)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
            r2.write(r3)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
            r2.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
            safelyCloseFile(r2)
            goto L31
        L22:
            r3 = move-exception
            r0 = r2
            goto L36
        L25:
            r3 = move-exception
            r0 = r2
            goto L2b
        L28:
            r3 = move-exception
            goto L36
        L2a:
            r3 = move-exception
        L2b:
            r3.getMessage()     // Catch: java.lang.Throwable -> L28
            safelyCloseFile(r0)
        L31:
            byte[] r3 = r1.toByteArray()
            return r3
        L36:
            safelyCloseFile(r0)
            throw r3
        L3a:
            return r0
    }

    public static byte[] compress(byte[] r3) {
            r0 = 0
            if (r3 == 0) goto L33
            int r1 = r3.length
            if (r1 != 0) goto L7
            goto L33
        L7:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            r2.write(r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            r2.close()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            safelyCloseFile(r2)
            goto L2a
        L1b:
            r3 = move-exception
            r0 = r2
            goto L2f
        L1e:
            r3 = move-exception
            r0 = r2
            goto L24
        L21:
            r3 = move-exception
            goto L2f
        L23:
            r3 = move-exception
        L24:
            r3.getMessage()     // Catch: java.lang.Throwable -> L21
            safelyCloseFile(r0)
        L2a:
            byte[] r3 = r1.toByteArray()
            return r3
        L2f:
            safelyCloseFile(r0)
            throw r3
        L33:
            return r0
    }

    public static void createNoMediaFileIfNotExist(java.lang.String r0) {
            return
    }

    private static void decompress(java.io.File r9, java.io.File r10, java.util.zip.ZipInputStream r11, long r12, com.autonavi.base.amap.mapcore.FileUtil.ZipCompressProgressListener r14, com.autonavi.base.amap.mapcore.FileUtil.UnZipFileBrake r15) throws java.lang.Exception {
            r0 = 0
            r8 = 0
        L2:
            java.util.zip.ZipEntry r0 = r11.getNextEntry()
            if (r0 == 0) goto L61
            if (r15 == 0) goto L12
            boolean r1 = r15.mIsAborted
            if (r1 == 0) goto L12
            r11.closeEntry()
            return
        L12:
            java.lang.String r1 = r0.getName()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L5c
            boolean r2 = isSafeEntryName(r1)
            if (r2 != 0) goto L23
            goto L5c
        L23:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.getPath()
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = r0
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            fileProber(r0)
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L4e
            r0.mkdirs()
            goto L58
        L4e:
            long r2 = (long) r8
            r1 = r11
            r4 = r12
            r6 = r14
            r7 = r15
            int r0 = decompressFile(r0, r1, r2, r4, r6, r7)
            int r8 = r8 + r0
        L58:
            r11.closeEntry()
            goto L2
        L5c:
            if (r9 == 0) goto L61
            r9.delete()     // Catch: java.lang.Exception -> L61
        L61:
            return
    }

    public static void decompress(java.io.InputStream r3, java.lang.String r4) throws java.lang.Exception {
            r0 = 0
            r2 = 0
            decompress(r3, r4, r0, r2)
            return
    }

    private static void decompress(java.io.InputStream r9, java.lang.String r10, long r11, com.autonavi.base.amap.mapcore.FileUtil.ZipCompressProgressListener r13) throws java.lang.Exception {
            java.util.zip.CheckedInputStream r0 = new java.util.zip.CheckedInputStream
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            r0.<init>(r9, r1)
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream
            r4.<init>(r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r10)
            r8 = 0
            r2 = 0
            r5 = r11
            r7 = r13
            decompress(r2, r3, r4, r5, r7, r8)
            r4.close()
            r0.close()
            return
    }

    private static int decompressFile(java.io.File r8, java.util.zip.ZipInputStream r9, long r10, long r12, com.autonavi.base.amap.mapcore.FileUtil.ZipCompressProgressListener r14, com.autonavi.base.amap.mapcore.FileUtil.UnZipFileBrake r15) throws java.lang.Exception {
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r8)
            r0.<init>(r1)
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r8]
            r2 = 0
            r3 = 0
        L10:
            int r4 = r9.read(r1, r2, r8)
            r5 = -1
            if (r4 == r5) goto L3e
            if (r15 == 0) goto L21
            boolean r5 = r15.mIsAborted
            if (r5 == 0) goto L21
            r0.close()
            return r3
        L21:
            r0.write(r1, r2, r4)
            int r3 = r3 + r4
            r4 = 0
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 <= 0) goto L10
            if (r14 == 0) goto L10
            long r4 = (long) r3
            long r4 = r4 + r10
            r6 = 100
            long r4 = r4 * r6
            long r4 = r4 / r12
            if (r15 == 0) goto L3a
            boolean r6 = r15.mIsAborted
            if (r6 != 0) goto L10
        L3a:
            r14.onFinishProgress(r4)
            goto L10
        L3e:
            r0.close()
            return r3
    }

    public static boolean deleteFile(java.io.File r4) {
            r0 = 0
            if (r4 == 0) goto L41
            boolean r1 = r4.exists()
            if (r1 != 0) goto La
            goto L41
        La:
            boolean r1 = r4.isDirectory()
            if (r1 == 0) goto L3c
            java.io.File[] r1 = r4.listFiles()
            if (r1 == 0) goto L3c
            r2 = 0
        L17:
            int r3 = r1.length
            if (r2 >= r3) goto L3c
            r3 = r1[r2]
            boolean r3 = r3.isFile()
            if (r3 == 0) goto L2b
            r3 = r1[r2]
            boolean r3 = r3.delete()
            if (r3 != 0) goto L39
            return r0
        L2b:
            r3 = r1[r2]
            boolean r3 = deleteFile(r3)
            if (r3 != 0) goto L34
            return r0
        L34:
            r3 = r1[r2]
            r3.delete()
        L39:
            int r2 = r2 + 1
            goto L17
        L3c:
            r4.delete()
            r4 = 1
            return r4
        L41:
            return r0
    }

    private static void fileProber(java.io.File r1) {
            java.io.File r1 = r1.getParentFile()
            boolean r0 = r1.exists()
            if (r0 != 0) goto L10
            fileProber(r1)
            r1.mkdir()
        L10:
            return
    }

    public static java.lang.String getExternalStroragePath(android.content.Context r2) {
            if (r2 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            java.io.File r2 = r2.getExternalFilesDir(r1)
            java.lang.String r2 = r2.getAbsolutePath()
            r0.append(r2)
            char r2 = java.io.File.separatorChar
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public static java.lang.String getMapBaseStorage(android.content.Context r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "base_path"
            r2 = 0
            android.content.SharedPreferences r1 = r7.getSharedPreferences(r1, r2)
            java.lang.String r2 = com.amap.api.maps.MapsInitializer.sdcardDir
            java.lang.String r3 = "map_base_path_v44"
            if (r2 == 0) goto L2f
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 <= 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = com.amap.api.maps.MapsInitializer.sdcardDir
            r0.append(r2)
            char r2 = java.io.File.separatorChar
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L43
        L2f:
            java.lang.String r2 = ""
            java.lang.String r2 = r1.getString(r3, r2)
            java.lang.String r4 = getExternalStroragePath(r7)
            if (r2 == 0) goto L42
            boolean r4 = r2.contains(r4)
            if (r4 != 0) goto L42
            goto L43
        L42:
            r0 = r2
        L43:
            java.lang.String r2 = "/amap/"
            r4 = 2
            if (r0 == 0) goto L9d
            int r5 = r0.length()
            if (r5 <= r4) goto L9d
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L5c
            r5.mkdir()
        L5c:
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L9d
            boolean r5 = checkCanWrite(r5)
            if (r5 == 0) goto L69
            return r0
        L69:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r5 = r7.getCacheDir()
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L9d
            int r5 = r0.length()
            if (r5 <= r4) goto L9d
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L96
            r5.mkdir()
        L96:
            boolean r5 = r5.isDirectory()
            if (r5 == 0) goto L9d
            return r0
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = getExternalStroragePath(r7)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto Le0
            int r5 = r0.length()
            if (r5 <= r4) goto Le0
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            boolean r6 = r5.exists()
            if (r6 != 0) goto Lc6
            r5.mkdir()
        Lc6:
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto Le0
            boolean r5 = r5.canWrite()
            if (r5 == 0) goto Le0
            android.content.SharedPreferences$Editor r7 = r1.edit()
            r7.putString(r3, r0)
            r7.commit()
            createNoMediaFileIfNotExist(r0)
            return r0
        Le0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r7 = r7.getCacheDir()
            java.lang.String r7 = r7.toString()
            r0.append(r7)
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            if (r7 == 0) goto L110
            int r0 = r7.length()
            if (r0 <= r4) goto L110
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L10d
            r0.mkdir()
        L10d:
            r0.isDirectory()
        L110:
            return r7
    }

    public static java.lang.String getName(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            int r0 = indexOfLastSeparator(r1)
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            return r1
    }

    private static java.io.InputStream getZipInputStream(byte[] r1) throws java.io.IOException {
            if (r1 == 0) goto L1d
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto L1d
        L6:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            boolean r1 = isGzip(r1)
            if (r1 == 0) goto L17
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream
            r1.<init>(r0)
            return r1
        L17:
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
            r1.<init>(r0)
            return r1
        L1d:
            r1 = 0
            return r1
    }

    public static int indexOfLastSeparator(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = -1
            return r2
        L4:
            r0 = 47
            int r0 = r2.lastIndexOf(r0)
            r1 = 92
            int r2 = r2.lastIndexOf(r1)
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    public static boolean isGzip(byte[] r3) {
            r0 = 0
            r1 = r3[r0]
            int r1 = r1 << 8
            r2 = 1
            r3 = r3[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r1
            r1 = 8075(0x1f8b, float:1.1315E-41)
            if (r3 != r1) goto L10
            return r2
        L10:
            return r0
    }

    public static boolean isSafeEntryName(java.lang.String r1) {
            java.lang.String r0 = ".."
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "\\"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "%"
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L1a
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    private static byte[] readByteByStream(java.io.InputStream r4) throws java.io.IOException {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
        Ld:
            int r2 = r4.read(r0)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r3 = -1
            if (r2 == r3) goto L1d
            r3 = 0
            r1.write(r0, r3, r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            goto Ld
        L19:
            r4 = move-exception
            goto L26
        L1b:
            r4 = move-exception
            goto L25
        L1d:
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            safelyCloseFile(r1)
            return r4
        L25:
            throw r4     // Catch: java.lang.Throwable -> L19
        L26:
            safelyCloseFile(r1)
            throw r4
    }

    public static byte[] readFileContents(java.lang.String r6) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            boolean r6 = r1.exists()     // Catch: java.lang.Throwable -> L3d
            if (r6 != 0) goto L13
            safelyCloseFile(r0)
            safelyCloseFile(r0)
            return r0
        L13:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3d
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L3a
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
        L21:
            int r3 = r6.read(r1)     // Catch: java.lang.Throwable -> L2d
            r4 = -1
            if (r3 == r4) goto L2f
            r4 = 0
            r2.write(r1, r4, r3)     // Catch: java.lang.Throwable -> L2d
            goto L21
        L2d:
            r1 = move-exception
            goto L40
        L2f:
            byte[] r0 = r2.toByteArray()     // Catch: java.lang.Throwable -> L2d
            safelyCloseFile(r2)
            safelyCloseFile(r6)
            return r0
        L3a:
            r1 = move-exception
            r2 = r0
            goto L40
        L3d:
            r1 = move-exception
            r6 = r0
            r2 = r6
        L40:
            java.lang.String r3 = "FileUtil"
            java.lang.String r4 = "readFileContents"
            com.amap.api.col.p0003l.w5.p(r1, r3, r4)     // Catch: java.lang.Throwable -> L68
            com.amap.api.col.p0003l.b3.D(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = com.amap.api.col.p0003l.c3.f3067f     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "read file from disk failed "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L68
            r4.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L68
            com.amap.api.col.p0003l.d3.l(r3, r1)     // Catch: java.lang.Throwable -> L68
            safelyCloseFile(r2)
            safelyCloseFile(r6)
            return r0
        L68:
            r0 = move-exception
            safelyCloseFile(r2)
            safelyCloseFile(r6)
            throw r0
    }

    public static byte[] readFileContentsFromAssets(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "read file from assets failed "
            android.content.res.AssetManager r5 = r5.getAssets()
            r1 = 0
            java.io.InputStream r5 = r5.open(r6)     // Catch: java.lang.Throwable -> L2d java.lang.OutOfMemoryError -> L2f java.io.IOException -> L4a
            int r6 = r5.available()     // Catch: java.lang.Throwable -> L22 java.lang.OutOfMemoryError -> L25 java.io.IOException -> L27
            if (r6 != 0) goto L15
            safelyCloseFile(r5)
            return r1
        L15:
            byte[] r2 = new byte[r6]     // Catch: java.lang.Throwable -> L22 java.lang.OutOfMemoryError -> L25 java.io.IOException -> L27
            r3 = 0
        L18:
            if (r3 >= r6) goto L29
            int r4 = r6 - r3
            int r4 = r5.read(r2, r3, r4)     // Catch: java.lang.Throwable -> L22 java.lang.OutOfMemoryError -> L25 java.io.IOException -> L27
            int r3 = r3 + r4
            goto L18
        L22:
            r6 = move-exception
            r1 = r5
            goto L65
        L25:
            r6 = move-exception
            goto L31
        L27:
            r6 = move-exception
            goto L4c
        L29:
            safelyCloseFile(r5)
            return r2
        L2d:
            r6 = move-exception
            goto L65
        L2f:
            r6 = move-exception
            r5 = r1
        L31:
            java.lang.String r2 = com.amap.api.col.p0003l.c3.f3067f     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L22
            r3.append(r6)     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.p0003l.d3.l(r2, r6)     // Catch: java.lang.Throwable -> L22
            safelyCloseFile(r5)
            return r1
        L4a:
            r6 = move-exception
            r5 = r1
        L4c:
            java.lang.String r2 = com.amap.api.col.p0003l.c3.f3067f     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L22
            r3.append(r6)     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.p0003l.d3.l(r2, r6)     // Catch: java.lang.Throwable -> L22
            safelyCloseFile(r5)
            return r1
        L65:
            safelyCloseFile(r1)
            throw r6
    }

    public static byte[] readFileContentsFromAssetsByPreName(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
            r0 = 0
            if (r6 == 0) goto L3d
            if (r7 == 0) goto L3d
            if (r8 != 0) goto L8
            goto L3d
        L8:
            android.content.res.AssetManager r1 = r6.getAssets()
            java.lang.String[] r1 = r1.list(r7)     // Catch: java.io.IOException -> L3d
            if (r1 != 0) goto L13
            return r0
        L13:
            int r2 = r1.length     // Catch: java.io.IOException -> L3d
            r3 = 0
        L15:
            if (r3 >= r2) goto L3d
            r4 = r1[r3]     // Catch: java.io.IOException -> L3d
            if (r4 == 0) goto L3a
            boolean r5 = r4.contains(r8)     // Catch: java.io.IOException -> L3d
            if (r5 == 0) goto L3a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3d
            r8.<init>()     // Catch: java.io.IOException -> L3d
            r8.append(r7)     // Catch: java.io.IOException -> L3d
            java.lang.String r7 = "/"
            r8.append(r7)     // Catch: java.io.IOException -> L3d
            r8.append(r4)     // Catch: java.io.IOException -> L3d
            java.lang.String r7 = r8.toString()     // Catch: java.io.IOException -> L3d
            byte[] r6 = readFileContentsFromAssets(r6, r7)     // Catch: java.io.IOException -> L3d
            return r6
        L3a:
            int r3 = r3 + 1
            goto L15
        L3d:
            return r0
    }

    private static void safelyCloseFile(java.io.InputStream r1) {
            if (r1 == 0) goto Lf
            boolean r0 = r1 instanceof java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lc
            r0 = r1
            java.util.zip.ZipInputStream r0 = (java.util.zip.ZipInputStream) r0     // Catch: java.lang.Throwable -> Lf
            r0.closeEntry()     // Catch: java.lang.Throwable -> Lf
        Lc:
            r1.close()     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    private static void safelyCloseFile(java.io.OutputStream r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static void saveFileContents(java.lang.String r3, byte[] r4) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L15
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L15
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L15
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r3.write(r4)     // Catch: java.lang.Throwable -> L12
            safelyCloseFile(r3)
            return
        L12:
            r4 = move-exception
            r0 = r3
            goto L16
        L15:
            r4 = move-exception
        L16:
            java.lang.String r3 = "FileUtil"
            java.lang.String r1 = "saveFileContents"
            com.amap.api.col.p0003l.w5.p(r4, r3, r1)     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.p0003l.b3.D(r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = com.amap.api.col.p0003l.c3.f3067f     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "save file from disk failed "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L3b
            r1.append(r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L3b
            com.amap.api.col.p0003l.d3.l(r3, r4)     // Catch: java.lang.Throwable -> L3b
            safelyCloseFile(r0)
            return
        L3b:
            r3 = move-exception
            safelyCloseFile(r0)
            throw r3
    }

    public static byte[] uncompress(byte[] r5) {
            r0 = 0
            if (r5 == 0) goto L3b
            int r1 = r5.length
            if (r1 != 0) goto L7
            goto L3b
        L7:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.InputStream r5 = getZipInputStream(r5)     // Catch: java.lang.Throwable -> L2f
            if (r5 == 0) goto L2b
            r2 = 256(0x100, float:3.59E-43)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L21
        L16:
            int r3 = r5.read(r2)     // Catch: java.lang.Throwable -> L21
            if (r3 < 0) goto L23
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L21
            goto L16
        L21:
            r1 = move-exception
            goto L31
        L23:
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L21
            safelyCloseFile(r5)
            return r0
        L2b:
            safelyCloseFile(r5)
            goto L35
        L2f:
            r1 = move-exception
            r5 = r0
        L31:
            r1.getMessage()     // Catch: java.lang.Throwable -> L36
            goto L2b
        L35:
            return r0
        L36:
            r0 = move-exception
            safelyCloseFile(r5)
            throw r0
        L3b:
            return r0
    }

    public static android.util.Pair<java.lang.String, byte[]> uncompressToByte(byte[] r6) {
            r0 = 0
            if (r6 == 0) goto L64
            int r1 = r6.length
            if (r1 != 0) goto L7
            goto L64
        L7:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.InputStream r6 = getZipInputStream(r6)     // Catch: java.lang.Throwable -> L58
            boolean r2 = r6 instanceof java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            r2 = r6
            java.util.zip.ZipInputStream r2 = (java.util.zip.ZipInputStream) r2     // Catch: java.lang.Throwable -> L32
            java.util.zip.ZipEntry r2 = r2.getNextEntry()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L32
            boolean r3 = isSafeEntryName(r2)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L36
            java.lang.String r1 = "gzip name contains ../ "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L32
            r1.concat(r2)     // Catch: java.lang.Throwable -> L32
            safelyCloseFile(r6)
            return r0
        L32:
            r1 = move-exception
            goto L5a
        L34:
            java.lang.String r2 = ""
        L36:
            if (r6 == 0) goto L54
            r3 = 256(0x100, float:3.59E-43)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L32
        L3c:
            int r4 = r6.read(r3)     // Catch: java.lang.Throwable -> L32
            if (r4 < 0) goto L47
            r5 = 0
            r1.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L32
            goto L3c
        L47:
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L32
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> L32
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L32
            safelyCloseFile(r6)
            return r3
        L54:
            safelyCloseFile(r6)
            goto L5e
        L58:
            r1 = move-exception
            r6 = r0
        L5a:
            r1.getMessage()     // Catch: java.lang.Throwable -> L5f
            goto L54
        L5e:
            return r0
        L5f:
            r0 = move-exception
            safelyCloseFile(r6)
            throw r0
        L64:
            return r0
    }

    public static byte[] uncompressToByteArray(byte[] r6) {
            r0 = 0
            if (r6 == 0) goto L46
            int r1 = r6.length
            if (r1 != 0) goto L7
            goto L46
        L7:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r6)
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L35
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L35
            r3 = 256(0x100, float:3.59E-43)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L25
        L1a:
            int r4 = r6.read(r3)     // Catch: java.lang.Throwable -> L25
            if (r4 < 0) goto L27
            r5 = 0
            r1.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L25
            goto L1a
        L25:
            r3 = move-exception
            goto L37
        L27:
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L25
        L2b:
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r1)
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r2)
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r6)
            return r0
        L35:
            r3 = move-exception
            r6 = r0
        L37:
            com.amap.api.col.p0003l.b3.D(r3)     // Catch: java.lang.Throwable -> L3b
            goto L2b
        L3b:
            r0 = move-exception
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r1)
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r2)
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r6)
            throw r0
        L46:
            return r0
    }

    public static java.util.Map<java.lang.String, byte[]> uncompressToByteWithKeys(byte[] r8, java.lang.String[] r9) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r8 == 0) goto L78
            int r1 = r8.length
            if (r1 != 0) goto Lc
            goto L78
        Lc:
            r1 = 0
            java.io.InputStream r8 = getZipInputStream(r8)     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r8 instanceof java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L67
            r2 = r8
            java.util.zip.ZipInputStream r2 = (java.util.zip.ZipInputStream) r2     // Catch: java.lang.Throwable -> L3b
        L18:
            java.util.zip.ZipEntry r3 = r2.getNextEntry()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L67
            boolean r4 = r3.isDirectory()     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L63
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            boolean r4 = isSafeEntryName(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            if (r4 != 0) goto L3e
            java.lang.String r4 = "gzip name contains ../ "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            r4.concat(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            safelyCloseFile(r8)
            return r1
        L3b:
            r9 = move-exception
            r1 = r8
            goto L6c
        L3e:
            if (r9 != 0) goto L4a
            byte[] r4 = readByteByStream(r2)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            if (r4 == 0) goto L63
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            goto L63
        L4a:
            int r4 = r9.length     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            r5 = 0
        L4c:
            if (r5 >= r4) goto L63
            r6 = r9[r5]     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            boolean r7 = r3.equals(r6)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            if (r7 == 0) goto L60
            byte[] r3 = readByteByStream(r2)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            if (r3 == 0) goto L63
            r0.put(r6, r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L63
            goto L63
        L60:
            int r5 = r5 + 1
            goto L4c
        L63:
            r2.closeEntry()     // Catch: java.lang.Throwable -> L3b
            goto L18
        L67:
            safelyCloseFile(r8)
            goto L78
        L6b:
            r9 = move-exception
        L6c:
            r9.getMessage()     // Catch: java.lang.Throwable -> L73
            safelyCloseFile(r1)
            goto L78
        L73:
            r8 = move-exception
            safelyCloseFile(r1)
            throw r8
        L78:
            return r0
    }

    public static java.lang.String uncompressToString(byte[] r1) {
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = uncompressToString(r1, r0)
            return r1
    }

    public static java.lang.String uncompressToString(byte[] r5, java.lang.String r6) {
            r0 = 0
            if (r5 == 0) goto L3f
            int r1 = r5.length
            if (r1 != 0) goto L7
            goto L3f
        L7:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.InputStream r5 = getZipInputStream(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            if (r5 == 0) goto L2e
            r2 = 256(0x100, float:3.59E-43)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
        L16:
            int r3 = r5.read(r2)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            if (r3 < 0) goto L26
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            goto L16
        L21:
            r6 = move-exception
            r0 = r5
            goto L3b
        L24:
            r6 = move-exception
            goto L36
        L26:
            java.lang.String r6 = r1.toString(r6)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            safelyCloseFile(r5)
            return r6
        L2e:
            safelyCloseFile(r5)
            goto L3a
        L32:
            r6 = move-exception
            goto L3b
        L34:
            r6 = move-exception
            r5 = r0
        L36:
            r6.getMessage()     // Catch: java.lang.Throwable -> L21
            goto L2e
        L3a:
            return r0
        L3b:
            safelyCloseFile(r0)
            throw r6
        L3f:
            return r0
    }

    public static void writeDatasToFile(java.lang.String r3, byte[] r4) {
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r1 = 0
            if (r4 == 0) goto L4d
            int r2 = r4.length     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L46
            if (r2 != 0) goto L13
            goto L4d
        L13:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L46
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L46
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L46
            if (r3 == 0) goto L24
            r2.delete()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L46
            goto L24
        L22:
            r3 = move-exception
            goto L3f
        L24:
            r2.createNewFile()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L46
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L46
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L46
            r3.write(r4)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3d
            r3.flush()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3d
            r0.unlock()
            safelyCloseFile(r3)
            return
        L39:
            r4 = move-exception
            r1 = r3
            r3 = r4
            goto L3f
        L3d:
            r1 = r3
            goto L46
        L3f:
            r0.unlock()
            safelyCloseFile(r1)
            throw r3
        L46:
            r0.unlock()
            safelyCloseFile(r1)
            return
        L4d:
            r0.unlock()
            safelyCloseFile(r1)
            return
    }
}
