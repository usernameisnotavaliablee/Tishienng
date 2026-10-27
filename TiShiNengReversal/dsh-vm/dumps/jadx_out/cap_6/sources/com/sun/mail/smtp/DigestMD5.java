package com.sun.mail.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DigestMD5 {
    private static char[] digits;
    private java.lang.String clientResponse;
    private java.io.PrintStream debugout;
    private java.security.MessageDigest md5;
    private java.lang.String uri;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.sun.mail.smtp.DigestMD5.digits = r0
            return
    }

    public DigestMD5(java.io.PrintStream r1) {
            r0 = this;
            r0.<init>()
            r0.debugout = r1
            return
    }

    private static java.lang.String toHex(byte[] r7) {
            int r0 = r7.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 0
        L7:
            int r3 = r7.length
            if (r1 < r3) goto L10
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            return r7
        L10:
            r3 = r7[r1]
            r4 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r2 + 1
            char[] r6 = com.sun.mail.smtp.DigestMD5.digits
            int r4 = r4 >> 4
            char r4 = r6[r4]
            r0[r2] = r4
            int r2 = r2 + 2
            r3 = r3 & 15
            char r3 = r6[r3]
            r0[r5] = r3
            int r1 = r1 + 1
            goto L7
    }

    private java.util.Hashtable tokenize(java.lang.String r8) throws java.io.IOException {
            r7 = this;
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            byte[] r8 = r8.getBytes()
            java.io.StreamTokenizer r1 = new java.io.StreamTokenizer
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            com.sun.mail.util.BASE64DecoderStream r3 = new com.sun.mail.util.BASE64DecoderStream
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            int r5 = r8.length
            r6 = 4
            int r5 = r5 - r6
            r4.<init>(r8, r6, r5)
            r3.<init>(r4)
            r2.<init>(r3)
            r1.<init>(r2)
            r8 = 48
            r2 = 57
            r1.ordinaryChars(r8, r2)
            r1.wordChars(r8, r2)
            r8 = 0
        L2b:
            r2 = r8
        L2c:
            int r3 = r1.nextToken()
            r4 = -1
            if (r3 != r4) goto L34
            return r0
        L34:
            r4 = -3
            if (r3 == r4) goto L3c
            r4 = 34
            if (r3 == r4) goto L41
            goto L2c
        L3c:
            if (r2 != 0) goto L41
            java.lang.String r2 = r1.sval
            goto L2c
        L41:
            java.io.PrintStream r3 = r7.debugout
            if (r3 == 0) goto L48
            r3.getClass()
        L48:
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L6c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r4 = r0.get(r2)
            r3.append(r4)
            java.lang.String r4 = ","
            r3.append(r4)
            java.lang.String r4 = r1.sval
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.put(r2, r3)
            goto L2b
        L6c:
            java.lang.String r3 = r1.sval
            r0.put(r2, r3)
            goto L2b
    }

    public byte[] authClient(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) throws java.io.IOException {
            r7 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.sun.mail.util.BASE64EncoderStream r1 = new com.sun.mail.util.BASE64EncoderStream
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r0, r2)
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch: java.security.NoSuchAlgorithmException -> L1e6
            r2.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L1e6
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.security.NoSuchAlgorithmException -> L1e6
            r7.md5 = r3     // Catch: java.security.NoSuchAlgorithmException -> L1e6
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "smtp/"
            r4.<init>(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r7.uri = r4
            r4 = 32
            byte[] r4 = new byte[r4]
            java.io.PrintStream r5 = r7.debugout
            if (r5 == 0) goto L3a
            r5.getClass()
        L3a:
            java.util.Hashtable r12 = r7.tokenize(r12)
            if (r11 != 0) goto L56
            java.lang.String r11 = "realm"
            java.lang.Object r11 = r12.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L55
            java.util.StringTokenizer r8 = new java.util.StringTokenizer
            java.lang.String r5 = ","
            r8.<init>(r11, r5)
            java.lang.String r8 = r8.nextToken()
        L55:
            r11 = r8
        L56:
            java.lang.String r8 = "nonce"
            java.lang.Object r8 = r12.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r2.nextBytes(r4)
            r1.write(r4)
            r1.flush()
            java.lang.String r12 = r0.toString()
            r0.reset()
            java.security.MessageDigest r2 = r7.md5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r9)
            r4.<init>(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            r4.append(r11)
            r4.append(r5)
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            byte[] r10 = com.sun.mail.util.ASCIIUtility.getBytes(r10)
            byte[] r10 = r2.digest(r10)
            r2.update(r10)
            java.security.MessageDigest r10 = r7.md5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r8)
            r2.append(r5)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            byte[] r2 = com.sun.mail.util.ASCIIUtility.getBytes(r2)
            r10.update(r2)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.security.MessageDigest r2 = r7.md5
            byte[] r2 = r2.digest()
            java.lang.String r2 = toHex(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r10.<init>(r2)
            r10.append(r5)
            r10.append(r8)
            r10.append(r5)
            java.lang.String r2 = "00000001"
            r10.append(r2)
            r10.append(r5)
            r10.append(r12)
            r10.append(r5)
            java.lang.String r4 = "auth"
            r10.append(r4)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            r7.clientResponse = r10
            java.security.MessageDigest r10 = r7.md5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "AUTHENTICATE:"
            r5.<init>(r6)
            java.lang.String r6 = r7.uri
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            byte[] r5 = com.sun.mail.util.ASCIIUtility.getBytes(r5)
            r10.update(r5)
            java.security.MessageDigest r10 = r7.md5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = r7.clientResponse
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.<init>(r6)
            java.security.MessageDigest r6 = r7.md5
            byte[] r6 = r6.digest()
            java.lang.String r6 = toHex(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            byte[] r5 = com.sun.mail.util.ASCIIUtility.getBytes(r5)
            r10.update(r5)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r5 = "username=\""
            r10.<init>(r5)
            r10.append(r9)
            java.lang.String r9 = "\""
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r3.append(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r5 = ",realm=\""
            r10.<init>(r5)
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r3.append(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = ",qop="
            r10.<init>(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            r3.append(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = ",nc="
            r10.<init>(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r3.append(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = ",nonce=\""
            r10.<init>(r11)
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            r3.append(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = ",cnonce=\""
            r8.<init>(r10)
            r8.append(r12)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r3.append(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = ",digest-uri=\""
            r8.<init>(r10)
            java.lang.String r10 = r7.uri
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r3.append(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = ",response="
            r8.<init>(r9)
            java.security.MessageDigest r9 = r7.md5
            byte[] r9 = r9.digest()
            java.lang.String r9 = toHex(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r3.append(r8)
            java.io.PrintStream r8 = r7.debugout
            if (r8 == 0) goto L1d3
            r8.getClass()
        L1d3:
            java.lang.String r8 = r3.toString()
            byte[] r8 = com.sun.mail.util.ASCIIUtility.getBytes(r8)
            r1.write(r8)
            r1.flush()
            byte[] r8 = r0.toByteArray()
            return r8
        L1e6:
            r8 = move-exception
            java.io.PrintStream r9 = r7.debugout
            if (r9 == 0) goto L1f1
            r8.toString()
            r9.getClass()
        L1f1:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    public boolean authServer(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.util.Hashtable r4 = r3.tokenize(r4)
            java.security.MessageDigest r0 = r3.md5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ":"
            r1.<init>(r2)
            java.lang.String r2 = r3.uri
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            byte[] r1 = com.sun.mail.util.ASCIIUtility.getBytes(r1)
            r0.update(r1)
            java.security.MessageDigest r0 = r3.md5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r3.clientResponse
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.security.MessageDigest r2 = r3.md5
            byte[] r2 = r2.digest()
            java.lang.String r2 = toHex(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            byte[] r1 = com.sun.mail.util.ASCIIUtility.getBytes(r1)
            r0.update(r1)
            java.security.MessageDigest r0 = r3.md5
            byte[] r0 = r0.digest()
            java.lang.String r0 = toHex(r0)
            java.lang.String r1 = "rspauth"
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L63
            java.io.PrintStream r4 = r3.debugout
            if (r4 == 0) goto L61
            r4.getClass()
        L61:
            r4 = 0
            return r4
        L63:
            r4 = 1
            return r4
    }
}
