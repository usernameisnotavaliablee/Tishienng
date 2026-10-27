package c2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class c {
    private static final java.lang.String a = "";
    private static final java.lang.String b = "HexUtil";

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L14
            java.lang.String r3 = b(r3)     // Catch: java.io.UnsupportedEncodingException -> L14
            return r3
        L14:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "byte array 2 hex string exception : "
            r0.append(r2)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "HexUtil"
            c2.g.d(r0, r3)
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

    public static byte[] c(java.lang.String r13) {
            java.lang.String r0 = "HexUtil"
            java.lang.String r1 = "0x"
            java.lang.String r2 = "UTF-8"
            boolean r3 = android.text.TextUtils.isEmpty(r13)
            r4 = 0
            if (r3 == 0) goto L10
            byte[] r13 = new byte[r4]
            return r13
        L10:
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L98
            java.lang.String r13 = r13.toUpperCase(r3)     // Catch: java.lang.Throwable -> L98
            int r3 = r13.length()
            int r3 = r3 / 2
            byte[] r5 = new byte[r3]
            byte[] r13 = r13.getBytes(r2)     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r6 = 0
        L23:
            if (r6 >= r3) goto L7c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r7.<init>()     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r7.append(r1)     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            int r9 = r6 * 2
            r10 = r13[r9]     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r11 = 1
            byte[] r12 = new byte[r11]     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r12[r4] = r10     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r8.<init>(r12, r2)     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r7.append(r8)     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.Byte r7 = java.lang.Byte.decode(r7)     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            byte r7 = r7.byteValue()     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            int r7 = r7 << 4
            byte r7 = (byte) r7     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r8.<init>()     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r8.append(r1)     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            int r9 = r9 + 1
            r9 = r13[r9]     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            byte[] r11 = new byte[r11]     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r11[r4] = r9     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r10.<init>(r11, r2)     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r8.append(r10)     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            java.lang.Byte r8 = java.lang.Byte.decode(r8)     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            byte r8 = r8.byteValue()     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r7 = r7 ^ r8
            byte r7 = (byte) r7     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            r5[r6] = r7     // Catch: java.lang.NumberFormatException -> L78 java.io.UnsupportedEncodingException -> L7a
            int r6 = r6 + 1
            goto L23
        L78:
            r13 = move-exception
            goto L7d
        L7a:
            r13 = move-exception
            goto L7d
        L7c:
            return r5
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hex string 2 byte array exception : "
            r1.append(r2)
            java.lang.String r13 = r13.getMessage()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            c2.g.d(r0, r13)
            byte[] r13 = new byte[r4]
            return r13
        L98:
            r13 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hex string toUpperCase exception : "
            r1.append(r2)
            java.lang.String r13 = r13.getMessage()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            c2.g.d(r0, r13)
            byte[] r13 = new byte[r4]
            return r13
    }
}
