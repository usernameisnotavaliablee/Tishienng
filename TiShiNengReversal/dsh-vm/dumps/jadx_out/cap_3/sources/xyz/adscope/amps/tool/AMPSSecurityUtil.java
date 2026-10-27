package xyz.adscope.amps.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSSecurityUtil {
    public AMPSSecurityUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String compressEncrypt(java.lang.String r2) {
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Exception -> L12
            byte[] r2 = xyz.adscope.common.tool.security.GzipUtil.compress(r2)     // Catch: java.lang.Exception -> L12
            byte[] r2 = xyz.adscope.common.tool.security.AesUtil.encryptByte(r2)     // Catch: java.lang.Exception -> L12
            r0 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r0)     // Catch: java.lang.Exception -> L12
            return r2
        L12:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "amps_log_tag"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String decryptUncompress(java.lang.String r2) {
            r0 = 2
            byte[] r2 = android.util.Base64.decode(r2, r0)     // Catch: java.lang.Exception -> L13
            byte[] r2 = xyz.adscope.common.tool.security.AesUtil.decryptByte(r2)     // Catch: java.lang.Exception -> L13
            byte[] r2 = xyz.adscope.common.tool.security.GzipUtil.uncompress(r2)     // Catch: java.lang.Exception -> L13
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L13
            r0.<init>(r2)     // Catch: java.lang.Exception -> L13
            return r0
        L13:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "amps_log_tag"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String processCompressEncrypt(java.lang.String r4, java.lang.String r5) {
            r0 = 2
            byte[] r1 = r4.getBytes()     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = ","
            java.lang.String[] r5 = r5.split(r2)     // Catch: java.lang.Exception -> L2a
            int r2 = r5.length     // Catch: java.lang.Exception -> L2a
            if (r2 == r0) goto Lf
            return r4
        Lf:
            r4 = 0
            r4 = r5[r4]     // Catch: java.lang.Exception -> L2a
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L2a
            r2 = 1
            r5 = r5[r2]     // Catch: java.lang.Exception -> L2a
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L2a
            r2 = -1
            if (r4 != r2) goto L21
            goto L2c
        L21:
            r3 = 101(0x65, float:1.42E-43)
            if (r4 != r3) goto L2c
            byte[] r1 = xyz.adscope.common.tool.security.GzipUtil.compress(r1)     // Catch: java.lang.Exception -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L38
        L2c:
            if (r5 != r2) goto L2f
            goto L4f
        L2f:
            r4 = 1001(0x3e9, float:1.403E-42)
            if (r5 != r4) goto L4f
            byte[] r1 = xyz.adscope.common.tool.security.AesUtil.encryptByte(r1)     // Catch: java.lang.Exception -> L2a
            goto L4f
        L38:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "e : "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "amps_log_tag"
            xyz.adscope.common.tool.LogUtil.e(r5, r4)
            r1 = 0
        L4f:
            java.lang.String r4 = android.util.Base64.encodeToString(r1, r0)
            return r4
    }

    public static java.lang.String processUnCompressAndDecrypt(java.lang.String r3, java.lang.String r4) {
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r3, r0)     // Catch: java.lang.Exception -> L35
            java.lang.String r2 = ","
            java.lang.String[] r4 = r4.split(r2)     // Catch: java.lang.Exception -> L35
            int r2 = r4.length     // Catch: java.lang.Exception -> L35
            if (r2 == r0) goto Lf
            return r3
        Lf:
            r3 = 0
            r3 = r4[r3]     // Catch: java.lang.Exception -> L35
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L35
            r0 = 1
            r4 = r4[r0]     // Catch: java.lang.Exception -> L35
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L35
            r0 = -1
            if (r4 != r0) goto L21
            goto L29
        L21:
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r4 != r2) goto L29
            byte[] r1 = xyz.adscope.common.tool.security.AesUtil.decryptByte(r1)     // Catch: java.lang.Exception -> L35
        L29:
            if (r3 != r0) goto L2c
            goto L4d
        L2c:
            r4 = 101(0x65, float:1.42E-43)
            if (r3 != r4) goto L4d
            byte[] r1 = xyz.adscope.common.tool.security.GzipUtil.uncompress(r1)     // Catch: java.lang.Exception -> L35
            goto L4d
        L35:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "e : "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "amps_log_tag"
            xyz.adscope.common.tool.LogUtil.e(r4, r3)
            r1 = 0
        L4d:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            return r3
    }
}
