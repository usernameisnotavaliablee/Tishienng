package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    private static final java.lang.String a = "";
    private static final java.lang.String b = "HexUtil";

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            goto L1b
        L7:
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Exception -> L12 java.io.UnsupportedEncodingException -> L17
            java.lang.String r1 = b(r1)     // Catch: java.lang.Exception -> L12 java.io.UnsupportedEncodingException -> L17
            return r1
        L12:
            r1 = move-exception
            r1.getMessage()
            goto L1b
        L17:
            r1 = move-exception
            r1.getMessage()
        L1b:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String b(byte[] r5) {
            if (r5 == 0) goto L2e
            int r0 = r5.length
            if (r0 != 0) goto L6
            goto L2e
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        Lc:
            int r2 = r5.length
            if (r1 >= r2) goto L29
            r2 = r5[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r3 = r2.length()
            r4 = 1
            if (r3 != r4) goto L23
            r3 = 48
            r0.append(r3)
        L23:
            r0.append(r2)
            int r1 = r1 + 1
            goto Lc
        L29:
            java.lang.String r5 = r0.toString()
            return r5
        L2e:
            java.lang.String r5 = ""
            return r5
    }

    public static byte[] c(java.lang.String r12) {
            java.lang.String r0 = "0x"
            java.lang.String r1 = "UTF-8"
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            r3 = 0
            if (r2 == 0) goto Le
            byte[] r12 = new byte[r3]
            return r12
        Le:
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r12 = r12.toUpperCase(r2)
            int r2 = r12.length()
            int r2 = r2 / 2
            byte[] r4 = new byte[r2]
            byte[] r12 = r12.getBytes(r1)     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r5 = 0
        L21:
            if (r5 >= r2) goto L83
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r6.<init>()     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r6.append(r0)     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            int r8 = r5 * 2
            r9 = r12[r8]     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r10 = 1
            byte[] r11 = new byte[r10]     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r11[r3] = r9     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r7.<init>(r11, r1)     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r6.append(r7)     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.Byte r6 = java.lang.Byte.decode(r6)     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            byte r6 = r6.byteValue()     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            int r6 = r6 << 4
            byte r6 = (byte) r6     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r7.<init>()     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r7.append(r0)     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            int r8 = r8 + 1
            r8 = r12[r8]     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            byte[] r10 = new byte[r10]     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r10[r3] = r8     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r9.<init>(r10, r1)     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r7.append(r9)     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.Byte r7 = java.lang.Byte.decode(r7)     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            byte r7 = r7.byteValue()     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r6 = r6 ^ r7
            byte r6 = (byte) r6     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r4[r5] = r6     // Catch: java.lang.Exception -> L76 java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            int r5 = r5 + 1
            goto L21
        L76:
            r12 = move-exception
            goto L7c
        L78:
            r12 = move-exception
            goto L80
        L7a:
            r12 = move-exception
            goto L80
        L7c:
            r12.getMessage()
            goto L83
        L80:
            r12.getMessage()
        L83:
            return r4
    }
}
