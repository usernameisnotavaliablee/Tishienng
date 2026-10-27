package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class t {
    public t() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3) {
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
            return r1
    }

    public static java.lang.String b(java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            byte[] r7 = android.util.Base64.decode(r7, r0)     // Catch: java.lang.Exception -> L38
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L38
            r2.<init>()     // Catch: java.lang.Exception -> L38
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L38
            r3.<init>(r7)     // Catch: java.lang.Exception -> L38
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Exception -> L38
            r7.<init>(r3)     // Catch: java.lang.Exception -> L38
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch: java.lang.Exception -> L38
        L20:
            int r6 = r7.read(r5, r0, r4)     // Catch: java.lang.Exception -> L38
            if (r6 <= 0) goto L2a
            r2.write(r5, r0, r6)     // Catch: java.lang.Exception -> L38
            goto L20
        L2a:
            r7.close()     // Catch: java.lang.Exception -> L38
            r3.close()     // Catch: java.lang.Exception -> L38
            r2.close()     // Catch: java.lang.Exception -> L38
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L38
            return r7
        L38:
            return r1
    }
}
