package xyz.adscope.common.v2.tool.str;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class SerialUtil {
    public SerialUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String generateAdRequestSessionID() {
            java.lang.String r0 = generateUUIDMd5()
            return r0
    }

    public static int generateCRCHex(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L1d
            byte[] r4 = r4.getBytes()
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r0.update(r4)
            long r0 = r0.getValue()
            r2 = 100
            long r0 = r0 % r2
            int r4 = (int) r0
            int r4 = r4 + 1
            return r4
        L1d:
            r4 = -1
            return r4
    }

    public static java.lang.String generateReportEventID() {
            java.lang.String r0 = generateUUIDMd5()
            return r0
    }

    public static java.lang.String generateStartSerialID() {
            java.lang.String r0 = generateUUIDMd5()
            return r0
    }

    private static java.lang.String generateUUIDMd5() {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L13
            return r0
        L13:
            return r1
    }
}
