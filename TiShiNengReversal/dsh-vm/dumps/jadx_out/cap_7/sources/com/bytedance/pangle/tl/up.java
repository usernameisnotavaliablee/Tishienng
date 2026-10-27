package com.bytedance.pangle.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class up {
    public up() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean j(java.lang.String r11, java.lang.String r12) {
            java.lang.String r0 = "ApkSignatureVerify verify plugin signature error : "
            java.lang.String r1 = "Zeus/install_pangle"
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            boolean r2 = com.bytedance.pangle.util.g.j()     // Catch: com.bytedance.pangle.tl.i -> L18
            r4 = 1
            if (r2 == 0) goto L1a
            com.bytedance.pangle.tl.az r2 = com.bytedance.pangle.tl.r.j(r11, r4)     // Catch: com.bytedance.pangle.tl.i -> L18
            goto L1e
        L18:
            r12 = move-exception
            goto L82
        L1a:
            com.bytedance.pangle.tl.az r2 = com.bytedance.pangle.tl.j.j(r11, r4)     // Catch: com.bytedance.pangle.tl.i -> L18
        L1e:
            if (r2 == 0) goto L23
            android.content.pm.Signature[] r2 = r2.xt     // Catch: com.bytedance.pangle.tl.i -> L18
            goto L24
        L23:
            r2 = 0
        L24:
            com.bytedance.pangle.plugin.Plugin r12 = com.bytedance.pangle.Zeus.getPlugin(r12)
            java.lang.String r12 = r12.mSignature
            byte[] r12 = android.util.Base64.decode(r12, r3)
            if (r12 == 0) goto L74
            int r4 = r12.length
            if (r4 != 0) goto L34
            goto L74
        L34:
            int r4 = r2.length
            r5 = 0
            r6 = 0
        L37:
            if (r5 >= r4) goto L44
            r7 = r2[r5]
            byte[] r7 = r7.toByteArray()
            int r7 = r7.length
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L37
        L44:
            byte[] r4 = new byte[r6]
            int r5 = r2.length
            r6 = 0
            r7 = 0
        L49:
            if (r6 >= r5) goto L62
            r8 = r2[r6]
            byte[] r9 = r8.toByteArray()
            byte[] r10 = r8.toByteArray()
            int r10 = r10.length
            java.lang.System.arraycopy(r9, r3, r4, r7, r10)
            byte[] r8 = r8.toByteArray()
            int r8 = r8.length
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L49
        L62:
            boolean r12 = com.bytedance.pangle.tl.az.j(r4, r12)
            if (r12 != 0) goto L73
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r0.concat(r11)
            com.bytedance.pangle.log.ZeusLogger.w(r1, r11)
        L73:
            return r12
        L74:
            java.lang.String r12 = "ApkSignatureVerify get hostSignature error : "
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r12.concat(r11)
            com.bytedance.pangle.log.ZeusLogger.w(r1, r11)
            return r3
        L82:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r0.concat(r11)
            com.bytedance.pangle.log.ZeusLogger.w(r1, r11, r12)
            return r3
    }
}
