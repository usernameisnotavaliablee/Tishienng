package xyz.adscope.common.network.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IOUtils {
    public IOUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canRead(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.canRead()
            return r1
    }

    public static boolean canWrite(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.canWrite()
            return r1
    }

    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public static boolean contentEquals(java.io.InputStream r3, java.io.InputStream r4) {
            java.io.BufferedInputStream r3 = toBufferedInputStream(r3)
            java.io.BufferedInputStream r4 = toBufferedInputStream(r4)
            int r0 = r3.read()
        Lc:
            r1 = 0
            r2 = -1
            if (r2 == r0) goto L1c
            int r2 = r4.read()
            if (r0 == r2) goto L17
            return r1
        L17:
            int r0 = r3.read()
            goto Lc
        L1c:
            int r3 = r4.read()
            if (r3 != r2) goto L24
            r3 = 1
            return r3
        L24:
            return r1
    }

    public static boolean contentEquals(java.io.Reader r3, java.io.Reader r4) {
            java.io.BufferedReader r3 = toBufferedReader(r3)
            java.io.BufferedReader r4 = toBufferedReader(r4)
            int r0 = r3.read()
        Lc:
            r1 = 0
            r2 = -1
            if (r2 == r0) goto L1c
            int r2 = r4.read()
            if (r0 == r2) goto L17
            return r1
        L17:
            int r0 = r3.read()
            goto Lc
        L1c:
            int r3 = r4.read()
            if (r3 != r2) goto L24
            r3 = 1
            return r3
        L24:
            return r1
    }

    public static boolean contentEqualsIgnoreEOL(java.io.Reader r3, java.io.Reader r4) {
            java.io.BufferedReader r3 = toBufferedReader(r3)
            java.io.BufferedReader r4 = toBufferedReader(r4)
            java.lang.String r0 = r3.readLine()
            java.lang.String r1 = r4.readLine()
        L10:
            if (r0 == 0) goto L23
            if (r1 == 0) goto L23
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L23
            java.lang.String r0 = r3.readLine()
            java.lang.String r1 = r4.readLine()
            goto L10
        L23:
            if (r0 == 0) goto L2f
            if (r1 == 0) goto L2d
            boolean r3 = r0.equals(r1)
            if (r3 == 0) goto L2f
        L2d:
            r3 = 1
            return r3
        L2f:
            r3 = 0
            return r3
    }

    public static boolean createFile(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L11
            boolean r0 = r1.isFile()
            if (r0 == 0) goto Le
            r1 = 1
            return r1
        Le:
            delFileOrFolder(r1)
        L11:
            boolean r1 = r1.createNewFile()     // Catch: java.io.IOException -> L16
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static boolean createFile(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L10
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = createFile(r0)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean createFolder(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L11
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1.delete()
        L11:
            boolean r1 = r1.mkdirs()
            return r1
    }

    public static boolean createFolder(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L10
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = createFolder(r0)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean createNewFile(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L9
            delFileOrFolder(r1)
        L9:
            boolean r1 = r1.createNewFile()     // Catch: java.io.IOException -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean createNewFile(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L10
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = createNewFile(r0)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean createNewFolder(java.io.File r1) {
            boolean r0 = delFileOrFolder(r1)
            if (r0 == 0) goto Le
            boolean r1 = createFolder(r1)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean createNewFolder(java.lang.String r1) {
            boolean r0 = delFileOrFolder(r1)
            if (r0 == 0) goto Le
            boolean r1 = createFolder(r1)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean delFileOrFolder(java.io.File r4) {
            if (r4 == 0) goto L2e
            boolean r0 = r4.exists()
            if (r0 != 0) goto L9
            goto L2e
        L9:
            boolean r0 = r4.isFile()
            if (r0 == 0) goto L13
            r4.delete()
            goto L2e
        L13:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L2e
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L2b
            int r1 = r0.length
            r2 = 0
        L21:
            if (r2 >= r1) goto L2b
            r3 = r0[r2]
            delFileOrFolder(r3)
            int r2 = r2 + 1
            goto L21
        L2b:
            r4.delete()
        L2e:
            r4 = 1
            return r4
    }

    public static boolean delFileOrFolder(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = delFileOrFolder(r0)
            return r1
    }

    public static void flushQuietly(java.io.Flushable r0) {
            if (r0 == 0) goto L5
            r0.flush()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public static long getDirSize(java.lang.String r5) {
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Exception -> L10
            r0.<init>(r5)     // Catch: java.lang.Exception -> L10
            long r1 = r0.getBlockSizeLong()
            long r3 = r0.getAvailableBlocksLong()
            long r1 = r1 * r3
            return r1
        L10:
            r0 = 0
            return r0
    }

    public static java.util.List<java.lang.String> readLines(java.io.InputStream r1) {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1)
            java.util.List r1 = readLines(r0)
            return r1
    }

    public static java.util.List<java.lang.String> readLines(java.io.InputStream r0, java.lang.String r1) {
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            java.util.List r0 = readLines(r0, r1)
            return r0
    }

    public static java.util.List<java.lang.String> readLines(java.io.InputStream r1, java.nio.charset.Charset r2) {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r2)
            java.util.List r1 = readLines(r0)
            return r1
    }

    public static java.util.List<java.lang.String> readLines(java.io.Reader r2) {
            java.io.BufferedReader r2 = toBufferedReader(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r2.readLine()
        Ld:
            if (r1 == 0) goto L17
            r0.add(r1)
            java.lang.String r1 = r2.readLine()
            goto Ld
        L17:
            return r0
    }

    public static java.io.BufferedInputStream toBufferedInputStream(java.io.InputStream r1) {
            boolean r0 = r1 instanceof java.io.BufferedInputStream
            if (r0 == 0) goto L7
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            return r1
        L7:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r1)
            return r0
    }

    public static java.io.BufferedOutputStream toBufferedOutputStream(java.io.OutputStream r1) {
            boolean r0 = r1 instanceof java.io.BufferedOutputStream
            if (r0 == 0) goto L7
            java.io.BufferedOutputStream r1 = (java.io.BufferedOutputStream) r1
            return r1
        L7:
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r1)
            return r0
    }

    public static java.io.BufferedReader toBufferedReader(java.io.Reader r1) {
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto L7
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            return r1
        L7:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1)
            return r0
    }

    public static java.io.BufferedWriter toBufferedWriter(java.io.Writer r1) {
            boolean r0 = r1 instanceof java.io.BufferedWriter
            if (r0 == 0) goto L7
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            return r1
        L7:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r1)
            return r0
    }

    public static byte[] toByteArray(java.io.InputStream r1) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            write(r1, r0)
            r0.close()
            byte[] r1 = r0.toByteArray()
            return r1
    }

    public static byte[] toByteArray(java.io.InputStream r4, int r5) {
            if (r5 < 0) goto L39
            r0 = 0
            if (r5 != 0) goto L8
            byte[] r4 = new byte[r0]
            return r4
        L8:
            byte[] r1 = new byte[r5]
        La:
            if (r0 >= r5) goto L17
            int r2 = r5 - r0
            int r2 = r4.read(r1, r0, r2)
            r3 = -1
            if (r2 == r3) goto L17
            int r0 = r0 + r2
            goto La
        L17:
            if (r0 != r5) goto L1a
            return r1
        L1a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected byte count size. current: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", excepted: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            throw r4
        L39:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Size must be equal or greater than zero: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    public static byte[] toByteArray(java.io.Reader r1) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            write(r1, r0)
            r0.close()
            byte[] r1 = r0.toByteArray()
            return r1
    }

    public static byte[] toByteArray(java.io.Reader r0, java.lang.String r1) {
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = toByteArray(r0, r1)
            return r0
    }

    public static byte[] toByteArray(java.io.Reader r1, java.nio.charset.Charset r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            write(r1, r0, r2)
            r0.close()
            byte[] r1 = r0.toByteArray()
            return r1
    }

    public static byte[] toByteArray(java.lang.CharSequence r0) {
            if (r0 != 0) goto L6
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
        L6:
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            return r0
    }

    public static byte[] toByteArray(java.lang.CharSequence r0, java.lang.String r1) {
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = toByteArray(r0, r1)
            return r0
    }

    public static byte[] toByteArray(java.lang.CharSequence r0, java.nio.charset.Charset r1) {
            if (r0 != 0) goto L6
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
        L6:
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes(r1)
            return r0
    }

    public static char[] toCharArray(java.io.InputStream r1) {
            java.io.CharArrayWriter r0 = new java.io.CharArrayWriter
            r0.<init>()
            write(r1, r0)
            char[] r1 = r0.toCharArray()
            return r1
    }

    public static char[] toCharArray(java.io.InputStream r0, java.lang.String r1) {
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            char[] r0 = toCharArray(r0, r1)
            return r0
    }

    public static char[] toCharArray(java.io.InputStream r1, java.nio.charset.Charset r2) {
            java.io.CharArrayWriter r0 = new java.io.CharArrayWriter
            r0.<init>()
            write(r1, r0, r2)
            char[] r1 = r0.toCharArray()
            return r1
    }

    public static char[] toCharArray(java.io.Reader r1) {
            java.io.CharArrayWriter r0 = new java.io.CharArrayWriter
            r0.<init>()
            write(r1, r0)
            char[] r1 = r0.toCharArray()
            return r1
    }

    public static char[] toCharArray(java.lang.CharSequence r1) {
            java.io.CharArrayWriter r0 = new java.io.CharArrayWriter
            r0.<init>()
            write(r0, r1)
            char[] r1 = r0.toCharArray()
            return r1
    }

    public static java.io.InputStream toInputStream(java.lang.CharSequence r1) {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            java.lang.String r1 = r1.toString()
            byte[] r1 = r1.getBytes()
            r0.<init>(r1)
            return r0
    }

    public static java.io.InputStream toInputStream(java.lang.CharSequence r0, java.lang.String r1) {
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            java.io.InputStream r0 = toInputStream(r0, r1)
            return r0
    }

    public static java.io.InputStream toInputStream(java.lang.CharSequence r0, java.nio.charset.Charset r1) {
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes(r1)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r0)
            return r1
    }

    public static java.lang.String toString(java.io.InputStream r1) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = toByteArray(r1)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String toString(java.io.InputStream r1, java.lang.String r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = toByteArray(r1)
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.String toString(java.io.InputStream r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = toByteArray(r1)
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.String toString(java.io.Reader r1) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = toByteArray(r1)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String toString(java.io.Reader r1, java.lang.String r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = toByteArray(r1)
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.String toString(java.io.Reader r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = toByteArray(r1)
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.String toString(byte[] r1) {
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String toString(byte[] r0, java.lang.String r1) {
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            java.lang.String r0 = toString(r0, r1)
            return r0
    }

    public static java.lang.String toString(byte[] r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    public static void write(java.io.InputStream r3, java.io.OutputStream r4) {
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L13
            r2 = 0
            r4.write(r0, r2, r1)
            r4.flush()
            goto L4
        L13:
            return
    }

    public static void write(java.io.InputStream r0, java.io.OutputStream r1, java.lang.String r2) {
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(java.io.InputStream r1, java.io.OutputStream r2, java.nio.charset.Charset r3) {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r3)
            write(r0, r2)
            return
    }

    public static void write(java.io.InputStream r1, java.io.Writer r2) {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1)
            write(r0, r2)
            return
    }

    public static void write(java.io.InputStream r0, java.io.Writer r1, java.lang.String r2) {
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(java.io.InputStream r1, java.io.Writer r2, java.nio.charset.Charset r3) {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r3)
            write(r0, r2)
            return
    }

    public static void write(java.io.OutputStream r0, java.lang.CharSequence r1) {
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.toString()
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            r0.flush()
        L10:
            return
    }

    public static void write(java.io.OutputStream r0, java.lang.CharSequence r1, java.lang.String r2) {
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(java.io.OutputStream r0, java.lang.CharSequence r1, java.nio.charset.Charset r2) {
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.toString()
            byte[] r1 = r1.getBytes(r2)
            r0.write(r1)
            r0.flush()
        L10:
            return
    }

    public static void write(java.io.OutputStream r0, byte[] r1) {
            if (r1 == 0) goto L8
            r0.write(r1)
            r0.flush()
        L8:
            return
    }

    public static void write(java.io.OutputStream r1, char[] r2) {
            if (r2 == 0) goto L11
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            byte[] r2 = r0.getBytes()
            r1.write(r2)
            r1.flush()
        L11:
            return
    }

    public static void write(java.io.OutputStream r0, char[] r1, java.lang.String r2) {
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(java.io.OutputStream r1, char[] r2, java.nio.charset.Charset r3) {
            if (r2 == 0) goto L11
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            byte[] r2 = r0.getBytes(r3)
            r1.write(r2)
            r1.flush()
        L11:
            return
    }

    public static void write(java.io.Reader r1, java.io.OutputStream r2) {
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r2)
            write(r1, r0)
            return
    }

    public static void write(java.io.Reader r0, java.io.OutputStream r1, java.lang.String r2) {
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(java.io.Reader r1, java.io.OutputStream r2, java.nio.charset.Charset r3) {
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r2, r3)
            write(r1, r0)
            return
    }

    public static void write(java.io.Reader r3, java.io.Writer r4) {
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r0 = new char[r0]
        L4:
            int r1 = r3.read(r0)
            r2 = -1
            if (r2 == r1) goto L13
            r2 = 0
            r4.write(r0, r2, r1)
            r4.flush()
            goto L4
        L13:
            return
    }

    public static void write(java.io.Writer r0, java.lang.CharSequence r1) {
            if (r1 == 0) goto Lc
            java.lang.String r1 = r1.toString()
            r0.write(r1)
            r0.flush()
        Lc:
            return
    }

    public static void write(java.io.Writer r1, byte[] r2) {
            if (r2 == 0) goto Ld
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            r1.write(r0)
            r1.flush()
        Ld:
            return
    }

    public static void write(java.io.Writer r0, byte[] r1, java.lang.String r2) {
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(java.io.Writer r1, byte[] r2, java.nio.charset.Charset r3) {
            if (r2 == 0) goto Ld
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r3)
            r1.write(r0)
            r1.flush()
        Ld:
            return
    }

    public static void write(java.io.Writer r0, char[] r1) {
            if (r1 == 0) goto L8
            r0.write(r1)
            r0.flush()
        L8:
            return
    }
}
