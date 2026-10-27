package xyz.adscope.common.tool.security;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GzipUtil {
    public GzipUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] compress(byte[] r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.io.IOException -> L10
            r1.<init>(r0)     // Catch: java.io.IOException -> L10
            r1.write(r2)     // Catch: java.io.IOException -> L10
            r1.close()     // Catch: java.io.IOException -> L10
        L10:
            byte[] r2 = r0.toByteArray()
            return r2
    }

    public static java.lang.String compressByteToString(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            java.lang.String r0 = "ISO-8859-1"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r2.write(r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r2.close()     // Catch: java.io.IOException -> L32
            goto L32
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            goto L21
        L1f:
            r0 = r2
            goto L27
        L21:
            r0 = r2
            goto L2d
        L23:
            r3 = move-exception
            goto L27
        L25:
            goto L2d
        L27:
            if (r0 == 0) goto L2c
            r0.close()     // Catch: java.io.IOException -> L2c
        L2c:
            throw r3
        L2d:
            if (r0 == 0) goto L32
            r0.close()     // Catch: java.io.IOException -> L32
        L32:
            java.lang.String r3 = new java.lang.String
            byte[] r0 = r1.toByteArray()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r3.<init>(r0, r1)
            return r3
    }

    public static java.lang.String compressForGzip(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L2d
            r0.<init>()     // Catch: java.lang.Exception -> L2d
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Exception -> L2d
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2d
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L2d
            r2.write(r3)     // Catch: java.lang.Exception -> L2d
            r2.close()     // Catch: java.lang.Exception -> L2d
            byte[] r3 = r0.toByteArray()     // Catch: java.lang.Exception -> L2d
            r0.flush()     // Catch: java.lang.Exception -> L2d
            r0.close()     // Catch: java.lang.Exception -> L2d
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)     // Catch: java.lang.Exception -> L2d
            return r3
        L2d:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "e : "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r0, r3)
            return r1
    }

    public static java.lang.String decompressForGzip(java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            byte[] r7 = android.util.Base64.decode(r7, r0)     // Catch: java.lang.Exception -> L2a
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L2a
            r2.<init>()     // Catch: java.lang.Exception -> L2a
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L2a
            r3.<init>(r7)     // Catch: java.lang.Exception -> L2a
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Exception -> L2a
            r7.<init>(r3)     // Catch: java.lang.Exception -> L2a
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch: java.lang.Exception -> L2a
        L20:
            int r6 = r7.read(r5, r0, r4)     // Catch: java.lang.Exception -> L2a
            if (r6 <= 0) goto L2c
            r2.write(r5, r0, r6)     // Catch: java.lang.Exception -> L2a
            goto L20
        L2a:
            r7 = move-exception
            goto L3a
        L2c:
            r7.close()     // Catch: java.lang.Exception -> L2a
            r3.close()     // Catch: java.lang.Exception -> L2a
            r2.close()     // Catch: java.lang.Exception -> L2a
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L2a
            return r7
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "e : "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r0, r7)
            return r1
    }

    public static byte[] uncompress(byte[] r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r4)
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> L1e
            r4.<init>(r1)     // Catch: java.io.IOException -> L1e
            r1 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L1e
        L13:
            int r2 = r4.read(r1)     // Catch: java.io.IOException -> L1e
            if (r2 < 0) goto L1e
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.io.IOException -> L1e
            goto L13
        L1e:
            byte[] r4 = r0.toByteArray()
            return r4
    }

    public static java.lang.String uncompressByteToString(java.lang.String r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            byte[] r7 = r7.getBytes(r2)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L45
        L1d:
            int r4 = r7.read(r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L45
            r5 = -1
            if (r4 == r5) goto L2b
            r5 = 0
            r1.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L45
            goto L1d
        L29:
            r0 = move-exception
            goto L38
        L2b:
            java.lang.String r3 = "ISO-8859-1"
            java.lang.String r0 = r1.toString(r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L45
            r7.close()     // Catch: java.io.IOException -> L34
        L34:
            r2.close()     // Catch: java.io.IOException -> L58
            goto L58
        L38:
            r6 = r0
            r0 = r7
            r7 = r6
            goto L5c
        L3c:
            r7 = move-exception
            goto L5c
        L3e:
            r7 = r0
            goto L45
        L40:
            r7 = move-exception
            r2 = r0
            goto L5c
        L43:
            r7 = r0
            r2 = r7
        L45:
            java.lang.String r3 = "common_log"
            java.lang.String r4 = "解压失败,eventCode:{},errorCode:{} : 2200 : 22001"
            xyz.adscope.common.tool.LogUtil.e(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L53
            r7.close()     // Catch: java.io.IOException -> L52
            goto L53
        L52:
        L53:
            if (r2 == 0) goto L58
            r2.close()     // Catch: java.io.IOException -> L58
        L58:
            r1.close()     // Catch: java.io.IOException -> L5b
        L5b:
            return r0
        L5c:
            if (r0 == 0) goto L63
            r0.close()     // Catch: java.io.IOException -> L62
            goto L63
        L62:
        L63:
            if (r2 == 0) goto L68
            r2.close()     // Catch: java.io.IOException -> L68
        L68:
            r1.close()     // Catch: java.io.IOException -> L6b
        L6b:
            throw r7
    }
}
