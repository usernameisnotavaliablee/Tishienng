package androidx.multidex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class MultiDexExtractor implements java.io.Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final java.lang.String DEX_PREFIX = "classes";
    static final java.lang.String DEX_SUFFIX = ".dex";
    private static final java.lang.String EXTRACTED_NAME_EXT = ".classes";
    static final java.lang.String EXTRACTED_SUFFIX = ".zip";
    private static final java.lang.String KEY_CRC = "crc";
    private static final java.lang.String KEY_DEX_CRC = "dex.crc.";
    private static final java.lang.String KEY_DEX_NUMBER = "dex.number";
    private static final java.lang.String KEY_DEX_TIME = "dex.time.";
    private static final java.lang.String KEY_TIME_STAMP = "timestamp";
    private static final java.lang.String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final java.lang.String PREFS_FILE = "multidex.version";
    private static final java.lang.String TAG = "MultiDex";
    private final java.nio.channels.FileLock cacheLock;
    private final java.io.File dexDir;
    private final java.nio.channels.FileChannel lockChannel;
    private final java.io.RandomAccessFile lockRaf;
    private final java.io.File sourceApk;
    private final long sourceCrc;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ExtractedDex extends java.io.File {
        public long crc;

        public ExtractedDex(java.io.File r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.crc = r1
                return
        }
    }

    MultiDexExtractor(java.io.File r3, java.io.File r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r3.getPath()
            r4.getPath()
            r2.sourceApk = r3
            r2.dexDir = r4
            long r0 = getZipCrc(r3)
            r2.sourceCrc = r0
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "MultiDex.lock"
            r3.<init>(r4, r0)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r4.<init>(r3, r0)
            r2.lockRaf = r4
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.lang.Error -> L36 java.lang.RuntimeException -> L38 java.io.IOException -> L3a
            r2.lockChannel = r4     // Catch: java.lang.Error -> L36 java.lang.RuntimeException -> L38 java.io.IOException -> L3a
            r3.getPath()     // Catch: java.lang.Error -> L3c java.lang.RuntimeException -> L3e java.io.IOException -> L40
            java.nio.channels.FileLock r4 = r4.lock()     // Catch: java.lang.Error -> L3c java.lang.RuntimeException -> L3e java.io.IOException -> L40
            r2.cacheLock = r4     // Catch: java.lang.Error -> L3c java.lang.RuntimeException -> L3e java.io.IOException -> L40
            r3.getPath()     // Catch: java.lang.Error -> L36 java.lang.RuntimeException -> L38 java.io.IOException -> L3a
            return
        L36:
            r3 = move-exception
            goto L47
        L38:
            r3 = move-exception
            goto L47
        L3a:
            r3 = move-exception
            goto L47
        L3c:
            r3 = move-exception
            goto L41
        L3e:
            r3 = move-exception
            goto L41
        L40:
            r3 = move-exception
        L41:
            java.nio.channels.FileChannel r4 = r2.lockChannel     // Catch: java.lang.Error -> L36 java.lang.RuntimeException -> L38 java.io.IOException -> L3a
            closeQuietly(r4)     // Catch: java.lang.Error -> L36 java.lang.RuntimeException -> L38 java.io.IOException -> L3a
            throw r3     // Catch: java.lang.Error -> L36 java.lang.RuntimeException -> L38 java.io.IOException -> L3a
        L47:
            java.io.RandomAccessFile r4 = r2.lockRaf
            closeQuietly(r4)
            throw r3
    }

    private void clearDexDir() {
            r5 = this;
            java.io.File r0 = r5.dexDir
            androidx.multidex.MultiDexExtractor$1 r1 = new androidx.multidex.MultiDexExtractor$1
            r1.<init>(r5)
            java.io.File[] r0 = r0.listFiles(r1)
            if (r0 != 0) goto L13
            java.io.File r0 = r5.dexDir
            r0.getPath()
            return
        L13:
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L2f
            r3 = r0[r2]
            r3.getPath()
            r3.length()
            boolean r4 = r3.delete()
            if (r4 != 0) goto L29
            r3.getPath()
            goto L2c
        L29:
            r3.getPath()
        L2c:
            int r2 = r2 + 1
            goto L15
        L2f:
            return
    }

    private static void closeQuietly(java.io.Closeable r0) {
            r0.close()     // Catch: java.io.IOException -> L3
        L3:
            return
    }

    private static void extract(java.util.zip.ZipFile r4, java.util.zip.ZipEntry r5, java.io.File r6, java.lang.String r7) throws java.io.IOException, java.io.FileNotFoundException {
            java.io.InputStream r4 = r4.getInputStream(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "tmp-"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = ".zip"
            java.io.File r1 = r6.getParentFile()
            java.io.File r7 = java.io.File.createTempFile(r7, r0, r1)
            r7.getPath()
            java.util.zip.ZipOutputStream r0 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> La0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> La0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La0
            r2.<init>(r7)     // Catch: java.lang.Throwable -> La0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La0
            java.util.zip.ZipEntry r1 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "classes.dex"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L56
            long r2 = r5.getTime()     // Catch: java.lang.Throwable -> L56
            r1.setTime(r2)     // Catch: java.lang.Throwable -> L56
            r0.putNextEntry(r1)     // Catch: java.lang.Throwable -> L56
            r5 = 16384(0x4000, float:2.2959E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L56
            int r1 = r4.read(r5)     // Catch: java.lang.Throwable -> L56
        L4a:
            r2 = -1
            if (r1 == r2) goto L58
            r2 = 0
            r0.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L56
            int r1 = r4.read(r5)     // Catch: java.lang.Throwable -> L56
            goto L4a
        L56:
            r5 = move-exception
            goto Lce
        L58:
            r0.closeEntry()     // Catch: java.lang.Throwable -> L56
            r0.close()     // Catch: java.lang.Throwable -> La0
            boolean r5 = r7.setReadOnly()     // Catch: java.lang.Throwable -> La0
            if (r5 == 0) goto La2
            r6.getPath()     // Catch: java.lang.Throwable -> La0
            boolean r5 = r7.renameTo(r6)     // Catch: java.lang.Throwable -> La0
            if (r5 == 0) goto L74
            closeQuietly(r4)
            r7.delete()
            return
        L74:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r0.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = "Failed to rename \""
            r0.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> La0
            r0.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = "\" to \""
            r0.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> La0
            r0.append(r6)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = "\""
            r0.append(r6)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> La0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La0
            throw r5     // Catch: java.lang.Throwable -> La0
        La0:
            r5 = move-exception
            goto Ld2
        La2:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r0.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = "Failed to mark readonly \""
            r0.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> La0
            r0.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = "\" (tmp of \""
            r0.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> La0
            r0.append(r6)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = "\")"
            r0.append(r6)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> La0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La0
            throw r5     // Catch: java.lang.Throwable -> La0
        Lce:
            r0.close()     // Catch: java.lang.Throwable -> La0
            throw r5     // Catch: java.lang.Throwable -> La0
        Ld2:
            closeQuietly(r4)
            r7.delete()
            throw r5
    }

    private static android.content.SharedPreferences getMultiDexPreferences(android.content.Context r2) {
            java.lang.String r0 = "multidex.version"
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    private static long getTimeStamp(java.io.File r4) {
            long r0 = r4.lastModified()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            r2 = 1
            long r0 = r0 - r2
        Ld:
            return r0
    }

    private static long getZipCrc(java.io.File r4) throws java.io.IOException {
            long r0 = androidx.multidex.ZipUtil.getZipCrc(r4)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            r2 = 1
            long r0 = r0 - r2
        Ld:
            return r0
    }

    private static boolean isModified(android.content.Context r7, java.io.File r8, long r9, java.lang.String r11) {
            android.content.SharedPreferences r7 = getMultiDexPreferences(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = "timestamp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = -1
            long r3 = r7.getLong(r0, r1)
            long r5 = getTimeStamp(r8)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L3f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            java.lang.String r11 = "crc"
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            long r7 = r7.getLong(r8, r1)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L3d
            goto L3f
        L3d:
            r7 = 0
            return r7
        L3f:
            r7 = 1
            return r7
    }

    private java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> loadExistingExtractions(android.content.Context r17, java.lang.String r18) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r0.sourceApk
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences r3 = getMultiDexPreferences(r17)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "dex.number"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            int r4 = r3.getInt(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4 + (-1)
            r5.<init>(r6)
            r6 = 2
        L3d:
            if (r6 > r4) goto L113
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            r7.append(r6)
            java.lang.String r8 = ".zip"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            androidx.multidex.MultiDexExtractor$ExtractedDex r8 = new androidx.multidex.MultiDexExtractor$ExtractedDex
            java.io.File r9 = r0.dexDir
            r8.<init>(r9, r7)
            boolean r7 = r8.isFile()
            if (r7 == 0) goto Lf3
            long r9 = getZipCrc(r8)
            r8.crc = r9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r9 = "dex.crc."
            r7.append(r9)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            r9 = -1
            long r11 = r3.getLong(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r13 = "dex.time."
            r7.append(r13)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            long r9 = r3.getLong(r7, r9)
            long r13 = r8.lastModified()
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 != 0) goto Lb2
            r7 = r2
            r17 = r3
            long r2 = r8.crc
            int r15 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r15 != 0) goto Lb2
            r5.add(r8)
            int r6 = r6 + 1
            r3 = r17
            r2 = r7
            goto L3d
        Lb2:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid extracted dex: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = " (key \""
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "\"), expected modification time: "
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = ", modification time: "
            r3.append(r1)
            r3.append(r13)
            java.lang.String r1 = ", expected crc: "
            r3.append(r1)
            r3.append(r11)
            java.lang.String r1 = ", file crc: "
            r3.append(r1)
            long r4 = r8.crc
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        Lf3:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Missing extracted secondary dex file '"
            r2.append(r3)
            java.lang.String r3 = r8.getPath()
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L113:
            return r5
    }

    private java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> performExtractions() throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = ".dex"
            java.lang.String r1 = "classes"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r12.sourceApk
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12.clearDexDir()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            java.io.File r5 = r12.sourceApk
            r4.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r5.<init>()     // Catch: java.lang.Throwable -> L79
            r5.append(r1)     // Catch: java.lang.Throwable -> L79
            r6 = 2
            r5.append(r6)     // Catch: java.lang.Throwable -> L79
            r5.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L79
            java.util.zip.ZipEntry r5 = r4.getEntry(r5)     // Catch: java.lang.Throwable -> L79
        L41:
            if (r5 == 0) goto Ld7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r7.<init>()     // Catch: java.lang.Throwable -> L79
            r7.append(r2)     // Catch: java.lang.Throwable -> L79
            r7.append(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.String r8 = ".zip"
            r7.append(r8)     // Catch: java.lang.Throwable -> L79
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L79
            androidx.multidex.MultiDexExtractor$ExtractedDex r8 = new androidx.multidex.MultiDexExtractor$ExtractedDex     // Catch: java.lang.Throwable -> L79
            java.io.File r9 = r12.dexDir     // Catch: java.lang.Throwable -> L79
            r8.<init>(r9, r7)     // Catch: java.lang.Throwable -> L79
            r3.add(r8)     // Catch: java.lang.Throwable -> L79
            r8.toString()     // Catch: java.lang.Throwable -> L79
            r7 = 0
            r9 = 0
            r10 = 0
        L67:
            r11 = 3
            if (r9 >= r11) goto L94
            if (r10 != 0) goto L94
            int r9 = r9 + 1
            extract(r4, r5, r8, r2)     // Catch: java.lang.Throwable -> L79
            long r10 = getZipCrc(r8)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            r8.crc = r10     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            r10 = 1
            goto L7f
        L79:
            r0 = move-exception
            goto Ldb
        L7b:
            r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L79
            r10 = 0
        L7f:
            r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L79
            r8.length()     // Catch: java.lang.Throwable -> L79
            if (r10 != 0) goto L67
            r8.delete()     // Catch: java.lang.Throwable -> L79
            boolean r11 = r8.exists()     // Catch: java.lang.Throwable -> L79
            if (r11 == 0) goto L67
            r8.getPath()     // Catch: java.lang.Throwable -> L79
            goto L67
        L94:
            if (r10 == 0) goto Laf
            int r6 = r6 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r5.<init>()     // Catch: java.lang.Throwable -> L79
            r5.append(r1)     // Catch: java.lang.Throwable -> L79
            r5.append(r6)     // Catch: java.lang.Throwable -> L79
            r5.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L79
            java.util.zip.ZipEntry r5 = r4.getEntry(r5)     // Catch: java.lang.Throwable -> L79
            goto L41
        Laf:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r1.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "Could not create zip file "
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L79
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            r1.append(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L79
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L79
        Ld7:
            r4.close()     // Catch: java.io.IOException -> Lda
        Lda:
            return r3
        Ldb:
            r4.close()     // Catch: java.io.IOException -> Lde
        Lde:
            throw r0
    }

    private static void putStoredApkInfo(android.content.Context r2, java.lang.String r3, long r4, long r6, java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> r8) {
            android.content.SharedPreferences r2 = getMultiDexPreferences(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "timestamp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.putLong(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r5 = "crc"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.putLong(r4, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r5 = "dex.number"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r5 = r8.size()
            int r5 = r5 + 1
            r2.putInt(r4, r5)
            java.util.Iterator r4 = r8.iterator()
            r5 = 2
        L4f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L92
            java.lang.Object r6 = r4.next()
            androidx.multidex.MultiDexExtractor$ExtractedDex r6 = (androidx.multidex.MultiDexExtractor.ExtractedDex) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r8 = "dex.crc."
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            long r0 = r6.crc
            r2.putLong(r7, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r8 = "dex.time."
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            long r0 = r6.lastModified()
            r2.putLong(r7, r0)
            int r5 = r5 + 1
            goto L4f
        L92:
            r2.commit()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileLock r0 = r1.cacheLock
            r0.release()
            java.nio.channels.FileChannel r0 = r1.lockChannel
            r0.close()
            java.io.RandomAccessFile r0 = r1.lockRaf
            r0.close()
            return
    }

    java.util.List<? extends java.io.File> load(android.content.Context r11, java.lang.String r12, boolean r13) throws java.io.IOException {
            r10 = this;
            java.io.File r0 = r10.sourceApk
            r0.getPath()
            java.nio.channels.FileLock r0 = r10.cacheLock
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L47
            if (r13 != 0) goto L31
            java.io.File r0 = r10.sourceApk
            long r1 = r10.sourceCrc
            boolean r0 = isModified(r11, r0, r1, r12)
            if (r0 != 0) goto L31
            java.util.List r0 = r10.loadExistingExtractions(r11, r12)     // Catch: java.io.IOException -> L1e
            goto L43
        L1e:
            java.util.List r9 = r10.performExtractions()
            java.io.File r0 = r10.sourceApk
            long r5 = getTimeStamp(r0)
            long r7 = r10.sourceCrc
            r3 = r11
            r4 = r12
            putStoredApkInfo(r3, r4, r5, r7, r9)
        L2f:
            r0 = r9
            goto L43
        L31:
            java.util.List r9 = r10.performExtractions()
            java.io.File r0 = r10.sourceApk
            long r5 = getTimeStamp(r0)
            long r7 = r10.sourceCrc
            r3 = r11
            r4 = r12
            putStoredApkInfo(r3, r4, r5, r7, r9)
            goto L2f
        L43:
            r0.size()
            return r0
        L47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MultiDexExtractor was closed"
            r0.<init>(r1)
            throw r0
    }
}
