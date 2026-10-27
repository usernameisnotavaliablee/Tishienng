package cn.jiguang.api.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ProtocolUtil {
    private static final java.lang.String ENCODING_UTF_8 = "UTF-8";
    private static final java.lang.String TAG = "ProtocolUtil";

    public ProtocolUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void fillIntData(byte[] r2, int r3, int r4) {
            byte[] r3 = int2ByteArray(r3)
            r0 = 0
            r1 = 4
            java.lang.System.arraycopy(r3, r0, r2, r4, r1)
            return
    }

    public static void fillStringData(byte[] r2, java.lang.String r3, int r4) {
            byte[] r3 = r3.getBytes()
            r0 = 0
            int r1 = r3.length
            java.lang.System.arraycopy(r3, r0, r2, r4, r1)
            return
    }

    public static byte[] fixedStringToBytes(java.lang.String r2, int r3) {
            r0 = 4
            if (r2 == 0) goto L16
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc
            goto L16
        Lc:
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L13
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 != 0) goto L1c
        L16:
            byte[] r2 = new byte[r0]
            r2 = {x002a: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            return r2
        L1c:
            byte[] r0 = getDefaultByte(r3)
            int r1 = r2.length
            if (r1 <= r3) goto L24
            goto L25
        L24:
            int r3 = r2.length
        L25:
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    public static byte[] getBytes(java.nio.ByteBuffer r3) {
            r0 = 0
            int r1 = r3.remaining()     // Catch: java.lang.Exception -> L12 java.lang.NegativeArraySizeException -> L13
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L12 java.lang.NegativeArraySizeException -> L13
            java.nio.ByteBuffer r2 = r3.asReadOnlyBuffer()     // Catch: java.lang.Exception -> L12 java.lang.NegativeArraySizeException -> L13
            r2.flip()     // Catch: java.lang.Exception -> L12 java.lang.NegativeArraySizeException -> L13
            r3.get(r1)     // Catch: java.lang.Exception -> L12 java.lang.NegativeArraySizeException -> L13
            return r1
        L12:
            return r0
        L13:
            java.lang.String r3 = "ProtocolUtil"
            java.lang.String r1 = "[getBytes] - ByteBuffer error."
            cn.jiguang.at.d.c(r3, r1)
            return r0
    }

    public static byte[] getBytesConsumed(java.nio.ByteBuffer r2) {
            r0 = 0
            int r1 = r2.remaining()     // Catch: java.lang.Exception -> Lb java.lang.NegativeArraySizeException -> Lc
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> Lb java.lang.NegativeArraySizeException -> Lc
            r2.get(r1)     // Catch: java.lang.Exception -> Lb java.lang.NegativeArraySizeException -> Lc
            return r1
        Lb:
            return r0
        Lc:
            java.lang.String r2 = "ProtocolUtil"
            java.lang.String r1 = "[getBytesConsumed] - ByteBuffer error."
            cn.jiguang.at.d.c(r2, r1)
            return r0
    }

    public static byte[] getDefaultByte(int r3) {
            byte[] r0 = new byte[r3]
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r3) goto Lb
            r0[r1] = r1
            int r2 = r2 + 1
            goto L4
        Lb:
            return r0
    }

    public static java.lang.String getString(java.nio.ByteBuffer r1, int r2) {
            byte[] r2 = new byte[r2]
            r1.get(r2)
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Ld
            java.lang.String r0 = "UTF-8"
            r1.<init>(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> Ld
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static java.lang.String getTlv2(java.nio.ByteBuffer r2) {
            short r0 = r2.getShort()     // Catch: java.lang.Throwable -> L11
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L11
            r2.get(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "UTF-8"
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = 0
            return r2
    }

    public static java.lang.String getTlv2(java.nio.ByteBuffer r2, cn.jiguang.api.JResponse r3) {
            short r0 = cn.jiguang.api.utils.ByteBufferUtils.getShort(r2, r3)
            r1 = 0
            if (r0 >= 0) goto Lf
            java.lang.String r2 = "ProtocolUtil"
            java.lang.String r3 = "[getTlv2] - ByteBuffer error."
            cn.jiguang.at.d.c(r2, r3)
            return r1
        Lf:
            byte[] r0 = new byte[r0]
            cn.jiguang.api.utils.ByteBufferUtils.get(r2, r0, r3)
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            return r1
    }

    public static byte[] int2ByteArray(int r5) {
            int r0 = r5 >>> 24
            byte r0 = (byte) r0
            int r1 = r5 >>> 16
            byte r1 = (byte) r1
            int r2 = r5 >>> 8
            byte r2 = (byte) r2
            byte r5 = (byte) r5
            r3 = 4
            byte[] r3 = new byte[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r5
            return r3
    }

    public static byte[] long2ByteArray(long r9) {
            r0 = 56
            long r0 = r9 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r1 = 48
            long r1 = r9 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r2 = 40
            long r2 = r9 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            r3 = 32
            long r3 = r9 >>> r3
            int r4 = (int) r3
            byte r3 = (byte) r4
            r4 = 24
            long r4 = r9 >>> r4
            int r5 = (int) r4
            byte r4 = (byte) r5
            r5 = 16
            long r5 = r9 >>> r5
            int r6 = (int) r5
            byte r5 = (byte) r6
            r6 = 8
            long r7 = r9 >>> r6
            int r8 = (int) r7
            byte r7 = (byte) r8
            int r10 = (int) r9
            byte r9 = (byte) r10
            byte[] r10 = new byte[r6]
            r6 = 0
            r10[r6] = r0
            r0 = 1
            r10[r0] = r1
            r0 = 2
            r10[r0] = r2
            r0 = 3
            r10[r0] = r3
            r0 = 4
            r10[r0] = r4
            r0 = 5
            r10[r0] = r5
            r0 = 6
            r10[r0] = r7
            r0 = 7
            r10[r0] = r9
            return r10
    }

    public static byte[] short2ByteArray(short r3) {
            int r0 = r3 >>> 8
            byte r0 = (byte) r0
            byte r3 = (byte) r3
            r1 = 2
            byte[] r1 = new byte[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            return r1
    }

    public static byte[] tlv2ToByteArray(java.lang.String r5) {
            r0 = 2
            if (r5 == 0) goto L16
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Lc
            goto L16
        Lc:
            java.lang.String r1 = "UTF-8"
            byte[] r5 = r5.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L13
            goto L14
        L13:
            r5 = 0
        L14:
            if (r5 != 0) goto L1c
        L16:
            byte[] r5 = new byte[r0]
            r5 = {x002e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            return r5
        L1c:
            int r1 = r5.length
            short r1 = (short) r1
            int r2 = r1 + 2
            byte[] r2 = new byte[r2]
            byte[] r3 = short2ByteArray(r1)
            r4 = 0
            java.lang.System.arraycopy(r3, r4, r2, r4, r0)
            java.lang.System.arraycopy(r5, r4, r2, r0, r1)
            return r2
    }
}
