package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IoUtils {
    private static final int BUFFER_SIZE = 1024;
    private static final int EOF = -1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ProgressListener {
        void progress(long r1, long r3);
    }

    public IoUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static void closeQuietly(java.net.ServerSocket r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static void closeQuietly(java.util.zip.ZipFile r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static void copyStream(java.io.InputStream r0, java.io.File r1) throws java.io.IOException {
            java.io.FileOutputStream r1 = com.baidu.idl.face.platform.utils.FileUtils.openNewFileOutput(r1)     // Catch: java.lang.Throwable -> Ld
            copyStream(r0, r1)     // Catch: java.lang.Throwable -> Lb
            closeQuietly(r1)
            return
        Lb:
            r0 = move-exception
            goto Lf
        Ld:
            r0 = move-exception
            r1 = 0
        Lf:
            closeQuietly(r1)
            throw r0
    }

    public static void copyStream(java.io.InputStream r0, java.io.File r1, long r2, com.baidu.idl.face.platform.utils.IoUtils.ProgressListener r4) throws java.io.IOException {
            java.io.FileOutputStream r1 = com.baidu.idl.face.platform.utils.FileUtils.openNewFileOutput(r1)     // Catch: java.lang.Throwable -> Ld
            copyStream(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> Lb
            closeQuietly(r1)
            return
        Lb:
            r0 = move-exception
            goto Lf
        Ld:
            r0 = move-exception
            r1 = 0
        Lf:
            closeQuietly(r1)
            throw r0
    }

    public static void copyStream(java.io.InputStream r3, java.io.OutputStream r4) throws java.io.IOException {
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L10
            r2 = 0
            r4.write(r0, r2, r1)
            goto L4
        L10:
            return
    }

    public static void copyStream(java.io.InputStream r5, java.io.OutputStream r6, long r7, com.baidu.idl.face.platform.utils.IoUtils.ProgressListener r9) throws java.io.IOException {
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
        L6:
            int r3 = r5.read(r0)
            r4 = -1
            if (r3 == r4) goto L19
            r4 = 0
            r6.write(r0, r4, r3)
            long r3 = (long) r3
            long r1 = r1 + r3
            if (r9 == 0) goto L6
            r9.progress(r1, r7)
            goto L6
        L19:
            return
    }

    public static byte[] loadBytes(java.io.InputStream r1) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            copyStream(r1, r0)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L15
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L15
            closeQuietly(r0)
            return r1
        L10:
            r1 = move-exception
            closeQuietly(r0)
            throw r1
        L15:
            closeQuietly(r0)
            r1 = 0
            return r1
    }

    public static java.lang.String loadContent(java.io.InputStream r1) throws java.io.IOException {
            r0 = 0
            java.lang.String r1 = loadContent(r1, r0)
            return r1
    }

    public static java.lang.String loadContent(java.io.InputStream r3, java.lang.String r4) throws java.io.IOException {
            if (r3 == 0) goto L32
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L10
            java.lang.String r4 = "file.encoding"
            java.lang.String r0 = "utf-8"
            java.lang.String r4 = java.lang.System.getProperty(r4, r0)
        L10:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r3, r4)
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            r4 = 4096(0x1000, float:5.74E-42)
            char[] r4 = new char[r4]
            int r1 = r0.read(r4)
        L22:
            if (r1 <= 0) goto L2d
            r2 = 0
            r3.write(r4, r2, r1)
            int r1 = r0.read(r4)
            goto L22
        L2d:
            java.lang.String r3 = r3.toString()
            return r3
        L32:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "stream may not be null."
            r3.<init>(r4)
            throw r3
    }
}
