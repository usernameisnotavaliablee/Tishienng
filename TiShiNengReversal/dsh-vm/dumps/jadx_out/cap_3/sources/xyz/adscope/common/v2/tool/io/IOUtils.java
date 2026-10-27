package xyz.adscope.common.v2.tool.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IOUtils {
    private static final int DEFAULT_BYTE_BUFFER = 8192;
    private static final java.lang.String DEFAULT_CHARSET = "UTF-8";

    private IOUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public static void flushQuietly(java.io.Flushable r0) {
            if (r0 == 0) goto L5
            r0.flush()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public static java.lang.String read(java.io.InputStream r1) {
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = read(r1, r0)
            return r1
    }

    public static java.lang.String read(java.io.InputStream r1, java.lang.String r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = toByteArray(r1)
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.String read(java.io.Reader r1) {
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = read(r1, r0)
            return r1
    }

    public static java.lang.String read(java.io.Reader r1, java.lang.String r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = toByteArray(r1)
            r0.<init>(r1, r2)
            return r0
    }

    private static byte[] toByteArray(java.io.InputStream r1) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            write(r1, r0)
            r0.close()
            byte[] r1 = r0.toByteArray()
            return r1
    }

    private static byte[] toByteArray(java.io.Reader r1) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            write(r1, r0)
            r0.close()
            byte[] r1 = r0.toByteArray()
            return r1
    }

    public static void write(java.io.InputStream r3, java.io.OutputStream r4) {
            r0 = 8192(0x2000, float:1.148E-41)
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

    public static void write(java.io.OutputStream r0, byte[] r1) {
            if (r1 == 0) goto L8
            r0.write(r1)
            r0.flush()
        L8:
            return
    }

    public static void write(java.io.Reader r1, java.io.OutputStream r2) {
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r2)
            write(r1, r0)
            return
    }

    public static void write(java.io.Reader r3, java.io.Writer r4) {
            r0 = 8192(0x2000, float:1.148E-41)
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

    public static void write(java.io.Writer r1, byte[] r2) {
            java.lang.String r0 = "UTF-8"
            write(r1, r2, r0)
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
}
