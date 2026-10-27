package com.bytedance.pangle.tl;

@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {

    public static class j {
        public final java.security.cert.X509Certificate[][] j;
        public final byte[] xt;

        public j(java.security.cert.X509Certificate[][] r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static com.bytedance.pangle.tl.xt.j j(java.io.RandomAccessFile r7, com.bytedance.pangle.tl.jy r8, boolean r9) throws java.lang.SecurityException, java.io.IOException {
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "X.509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch: java.security.cert.CertificateException -> L9c
            java.nio.ByteBuffer r4 = r8.j     // Catch: java.io.IOException -> L93
            java.nio.ByteBuffer r4 = com.bytedance.pangle.tl.m.j(r4)     // Catch: java.io.IOException -> L93
            r5 = 0
        L1c:
            boolean r6 = r4.hasRemaining()
            if (r6 == 0) goto L4e
            int r5 = r5 + 1
            java.nio.ByteBuffer r6 = com.bytedance.pangle.tl.m.j(r4)     // Catch: java.lang.SecurityException -> L30 java.nio.BufferUnderflowException -> L32 java.io.IOException -> L34
            java.security.cert.X509Certificate[] r6 = j(r6, r1, r3)     // Catch: java.lang.SecurityException -> L30 java.nio.BufferUnderflowException -> L32 java.io.IOException -> L34
            r2.add(r6)     // Catch: java.lang.SecurityException -> L30 java.nio.BufferUnderflowException -> L32 java.io.IOException -> L34
            goto L1c
        L30:
            r7 = move-exception
            goto L35
        L32:
            r7 = move-exception
            goto L35
        L34:
            r7 = move-exception
        L35:
            java.lang.SecurityException r8 = new java.lang.SecurityException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to parse/verify signer #"
            r9.<init>(r0)
            r9.append(r5)
            java.lang.String r0 = " block"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9, r7)
            throw r8
        L4e:
            if (r5 <= 0) goto L8b
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L83
            if (r9 == 0) goto L5b
            com.bytedance.pangle.tl.m.j(r1, r7, r8)
        L5b:
            boolean r9 = r1.containsKey(r0)
            if (r9 == 0) goto L70
            java.lang.Object r9 = r1.get(r0)
            byte[] r9 = (byte[]) r9
            long r0 = r7.length()
            byte[] r7 = com.bytedance.pangle.tl.m.j(r9, r0, r8)
            goto L71
        L70:
            r7 = 0
        L71:
            com.bytedance.pangle.tl.xt$j r8 = new com.bytedance.pangle.tl.xt$j
            int r9 = r2.size()
            java.security.cert.X509Certificate[][] r9 = new java.security.cert.X509Certificate[r9][]
            java.lang.Object[] r9 = r2.toArray(r9)
            java.security.cert.X509Certificate[][] r9 = (java.security.cert.X509Certificate[][]) r9
            r8.<init>(r9, r7)
            return r8
        L83:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r8 = "No content digests found"
            r7.<init>(r8)
            throw r7
        L8b:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r8 = "No signers found"
            r7.<init>(r8)
            throw r7
        L93:
            r7 = move-exception
            java.lang.SecurityException r8 = new java.lang.SecurityException
            java.lang.String r9 = "Failed to read list of signers"
            r8.<init>(r9, r7)
            throw r8
        L9c:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Failed to obtain X.509 CertificateFactory"
            r8.<init>(r9, r7)
            throw r8
    }

    private static void j(java.nio.ByteBuffer r4) throws java.lang.SecurityException, java.io.IOException {
        L0:
            boolean r0 = r4.hasRemaining()
            if (r0 == 0) goto L61
            java.nio.ByteBuffer r0 = com.bytedance.pangle.tl.m.j(r4)
            int r1 = r0.remaining()
            r2 = 4
            if (r1 < r2) goto L49
            int r1 = r0.getInt()
            r3 = -1091571699(0xffffffffbeeff00d, float:-0.46862832)
            if (r1 == r3) goto L1b
            goto L0
        L1b:
            int r1 = r0.remaining()
            if (r1 < r2) goto L31
            int r0 = r0.getInt()
            r1 = 3
            if (r0 == r1) goto L29
            goto L0
        L29:
            java.lang.SecurityException r4 = new java.lang.SecurityException
            java.lang.String r0 = "V2 signature indicates APK is signed using APK Signature Scheme v3, but none was found. Signature stripped?"
            r4.<init>(r0)
            throw r4
        L31:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "V2 Signature Scheme Stripping Protection Attribute  value too small. Expected 4 bytes, but found "
            r1.<init>(r2)
            int r0 = r0.remaining()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L49:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Remaining buffer too short to contain additional attribute ID. Remaining: "
            r1.<init>(r2)
            int r0 = r0.remaining()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L61:
            return
    }

    private static boolean j(int r1) {
            r0 = 513(0x201, float:7.19E-43)
            if (r1 == r0) goto L1d
            r0 = 514(0x202, float:7.2E-43)
            if (r1 == r0) goto L1d
            r0 = 769(0x301, float:1.078E-42)
            if (r1 == r0) goto L1d
            r0 = 1057(0x421, float:1.481E-42)
            if (r1 == r0) goto L1d
            r0 = 1059(0x423, float:1.484E-42)
            if (r1 == r0) goto L1d
            r0 = 1061(0x425, float:1.487E-42)
            if (r1 == r0) goto L1d
            switch(r1) {
                case 257: goto L1d;
                case 258: goto L1d;
                case 259: goto L1d;
                case 260: goto L1d;
                default: goto L1b;
            }
        L1b:
            r1 = 0
            return r1
        L1d:
            r1 = 1
            return r1
    }

    private static java.security.cert.X509Certificate[] j(java.nio.ByteBuffer r12, java.util.Map<java.lang.Integer, byte[]> r13, java.security.cert.CertificateFactory r14) throws java.lang.SecurityException, java.io.IOException {
            java.nio.ByteBuffer r0 = com.bytedance.pangle.tl.m.j(r12)
            java.nio.ByteBuffer r1 = com.bytedance.pangle.tl.m.j(r12)
            byte[] r12 = com.bytedance.pangle.tl.m.xt(r12)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = -1
            r5 = 0
            r8 = r5
            r6 = -1
            r7 = 0
        L17:
            boolean r9 = r1.hasRemaining()
            r10 = 8
            if (r9 == 0) goto L69
            int r7 = r7 + 1
            java.nio.ByteBuffer r9 = com.bytedance.pangle.tl.m.j(r1)     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            int r11 = r9.remaining()     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            if (r11 < r10) goto L51
            int r10 = r9.getInt()     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            r2.add(r11)     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            boolean r11 = j(r10)     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            if (r11 != 0) goto L3d
            goto L17
        L3d:
            if (r6 == r4) goto L4a
            int r11 = com.bytedance.pangle.tl.m.j(r10, r6)     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            if (r11 <= 0) goto L17
            goto L4a
        L46:
            r12 = move-exception
            goto L59
        L48:
            r12 = move-exception
            goto L59
        L4a:
            byte[] r6 = com.bytedance.pangle.tl.m.xt(r9)     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            r8 = r6
            r6 = r10
            goto L17
        L51:
            java.lang.SecurityException r12 = new java.lang.SecurityException     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            java.lang.String r13 = "Signature record too short"
            r12.<init>(r13)     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
            throw r12     // Catch: java.nio.BufferUnderflowException -> L46 java.io.IOException -> L48
        L59:
            java.lang.SecurityException r13 = new java.lang.SecurityException
            java.lang.String r14 = "Failed to parse signature record #"
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r14 = r14.concat(r0)
            r13.<init>(r14, r12)
            throw r13
        L69:
            if (r6 != r4) goto L7d
            if (r7 != 0) goto L75
            java.lang.SecurityException r12 = new java.lang.SecurityException
            java.lang.String r13 = "No signatures found"
            r12.<init>(r13)
            throw r12
        L75:
            java.lang.SecurityException r12 = new java.lang.SecurityException
            java.lang.String r13 = "No supported signatures found"
            r12.<init>(r13)
            throw r12
        L7d:
            java.lang.String r1 = com.bytedance.pangle.tl.m.cw(r6)
            android.util.Pair r4 = com.bytedance.pangle.tl.m.r(r6)
            java.lang.Object r7 = r4.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r4.second
            java.security.spec.AlgorithmParameterSpec r4 = (java.security.spec.AlgorithmParameterSpec) r4
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1)     // Catch: java.security.SignatureException -> La7 java.security.InvalidAlgorithmParameterException -> Laa java.security.InvalidKeyException -> Lad java.security.spec.InvalidKeySpecException -> Lb0 java.security.NoSuchAlgorithmException -> Lb3
            java.security.spec.X509EncodedKeySpec r9 = new java.security.spec.X509EncodedKeySpec     // Catch: java.security.SignatureException -> La7 java.security.InvalidAlgorithmParameterException -> Laa java.security.InvalidKeyException -> Lad java.security.spec.InvalidKeySpecException -> Lb0 java.security.NoSuchAlgorithmException -> Lb3
            r9.<init>(r12)     // Catch: java.security.SignatureException -> La7 java.security.InvalidAlgorithmParameterException -> Laa java.security.InvalidKeyException -> Lad java.security.spec.InvalidKeySpecException -> Lb0 java.security.NoSuchAlgorithmException -> Lb3
            java.security.PublicKey r1 = r1.generatePublic(r9)     // Catch: java.security.SignatureException -> La7 java.security.InvalidAlgorithmParameterException -> Laa java.security.InvalidKeyException -> Lad java.security.spec.InvalidKeySpecException -> Lb0 java.security.NoSuchAlgorithmException -> Lb3
            java.security.Signature r9 = java.security.Signature.getInstance(r7)     // Catch: java.security.SignatureException -> La7 java.security.InvalidAlgorithmParameterException -> Laa java.security.InvalidKeyException -> Lad java.security.spec.InvalidKeySpecException -> Lb0 java.security.NoSuchAlgorithmException -> Lb3
            r9.initVerify(r1)     // Catch: java.security.SignatureException -> La7 java.security.InvalidAlgorithmParameterException -> Laa java.security.InvalidKeyException -> Lad java.security.spec.InvalidKeySpecException -> Lb0 java.security.NoSuchAlgorithmException -> Lb3
            if (r4 == 0) goto Lb6
            r9.setParameter(r4)     // Catch: java.security.SignatureException -> La7 java.security.InvalidAlgorithmParameterException -> Laa java.security.InvalidKeyException -> Lad java.security.spec.InvalidKeySpecException -> Lb0 java.security.NoSuchAlgorithmException -> Lb3
            goto Lb6
        La7:
            r12 = move-exception
            goto L1dc
        Laa:
            r12 = move-exception
            goto L1dc
        Lad:
            r12 = move-exception
            goto L1dc
        Lb0:
            r12 = move-exception
            goto L1dc
        Lb3:
            r12 = move-exception
            goto L1dc
        Lb6:
            r9.update(r0)     // Catch: java.security.SignatureException -> La7 java.security.InvalidAlgorithmParameterException -> Laa java.security.InvalidKeyException -> Lad java.security.spec.InvalidKeySpecException -> Lb0 java.security.NoSuchAlgorithmException -> Lb3
            boolean r1 = r9.verify(r8)     // Catch: java.security.SignatureException -> La7 java.security.InvalidAlgorithmParameterException -> Laa java.security.InvalidKeyException -> Lad java.security.spec.InvalidKeySpecException -> Lb0 java.security.NoSuchAlgorithmException -> Lb3
            if (r1 == 0) goto L1c5
            r0.clear()
            java.nio.ByteBuffer r1 = com.bytedance.pangle.tl.m.j(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = 0
        Lcc:
            boolean r8 = r1.hasRemaining()
            if (r8 == 0) goto L10c
            int r7 = r7 + 1
            java.nio.ByteBuffer r8 = com.bytedance.pangle.tl.m.j(r1)     // Catch: java.nio.BufferUnderflowException -> Lf0 java.io.IOException -> Lf2
            int r9 = r8.remaining()     // Catch: java.nio.BufferUnderflowException -> Lf0 java.io.IOException -> Lf2
            if (r9 < r10) goto Lf4
            int r9 = r8.getInt()     // Catch: java.nio.BufferUnderflowException -> Lf0 java.io.IOException -> Lf2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch: java.nio.BufferUnderflowException -> Lf0 java.io.IOException -> Lf2
            r4.add(r11)     // Catch: java.nio.BufferUnderflowException -> Lf0 java.io.IOException -> Lf2
            if (r9 != r6) goto Lcc
            byte[] r5 = com.bytedance.pangle.tl.m.xt(r8)     // Catch: java.nio.BufferUnderflowException -> Lf0 java.io.IOException -> Lf2
            goto Lcc
        Lf0:
            r12 = move-exception
            goto Lfc
        Lf2:
            r12 = move-exception
            goto Lfc
        Lf4:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.nio.BufferUnderflowException -> Lf0 java.io.IOException -> Lf2
            java.lang.String r13 = "Record too short"
            r12.<init>(r13)     // Catch: java.nio.BufferUnderflowException -> Lf0 java.io.IOException -> Lf2
            throw r12     // Catch: java.nio.BufferUnderflowException -> Lf0 java.io.IOException -> Lf2
        Lfc:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Failed to parse digest record #"
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r14 = r14.concat(r0)
            r13.<init>(r14, r12)
            throw r13
        L10c:
            boolean r1 = r2.equals(r4)
            if (r1 == 0) goto L1bd
            int r1 = com.bytedance.pangle.tl.m.j(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r13 = r13.put(r2, r5)
            byte[] r13 = (byte[]) r13
            if (r13 == 0) goto L144
            boolean r13 = java.security.MessageDigest.isEqual(r13, r5)
            if (r13 == 0) goto L129
            goto L144
        L129:
            java.lang.SecurityException r12 = new java.lang.SecurityException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = com.bytedance.pangle.tl.m.xt(r1)
            r13.append(r14)
            java.lang.String r14 = " contents digest does not match the digest specified by a preceding signer"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L144:
            java.nio.ByteBuffer r13 = com.bytedance.pangle.tl.m.j(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L14e:
            boolean r4 = r13.hasRemaining()
            if (r4 == 0) goto L17f
            int r2 = r2 + 1
            byte[] r4 = com.bytedance.pangle.tl.m.xt(r13)
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L16e
            r5.<init>(r4)     // Catch: java.security.cert.CertificateException -> L16e
            java.security.cert.Certificate r5 = r14.generateCertificate(r5)     // Catch: java.security.cert.CertificateException -> L16e
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch: java.security.cert.CertificateException -> L16e
            com.bytedance.pangle.tl.av r6 = new com.bytedance.pangle.tl.av
            r6.<init>(r5, r4)
            r1.add(r6)
            goto L14e
        L16e:
            r12 = move-exception
            java.lang.SecurityException r13 = new java.lang.SecurityException
            java.lang.String r14 = "Failed to decode certificate #"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r14 = r14.concat(r0)
            r13.<init>(r14, r12)
            throw r13
        L17f:
            boolean r13 = r1.isEmpty()
            if (r13 != 0) goto L1b5
            java.lang.Object r13 = r1.get(r3)
            java.security.cert.X509Certificate r13 = (java.security.cert.X509Certificate) r13
            java.security.PublicKey r13 = r13.getPublicKey()
            byte[] r13 = r13.getEncoded()
            boolean r12 = java.util.Arrays.equals(r12, r13)
            if (r12 == 0) goto L1ad
            java.nio.ByteBuffer r12 = com.bytedance.pangle.tl.m.j(r0)
            j(r12)
            int r12 = r1.size()
            java.security.cert.X509Certificate[] r12 = new java.security.cert.X509Certificate[r12]
            java.lang.Object[] r12 = r1.toArray(r12)
            java.security.cert.X509Certificate[] r12 = (java.security.cert.X509Certificate[]) r12
            return r12
        L1ad:
            java.lang.SecurityException r12 = new java.lang.SecurityException
            java.lang.String r13 = "Public key mismatch between certificate and signature record"
            r12.<init>(r13)
            throw r12
        L1b5:
            java.lang.SecurityException r12 = new java.lang.SecurityException
            java.lang.String r13 = "No certificates listed"
            r12.<init>(r13)
            throw r12
        L1bd:
            java.lang.SecurityException r12 = new java.lang.SecurityException
            java.lang.String r13 = "Signature algorithms don't match between digests and signatures records"
            r12.<init>(r13)
            throw r12
        L1c5:
            java.lang.SecurityException r12 = new java.lang.SecurityException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            java.lang.String r14 = " signature did not verify"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L1dc:
            java.lang.SecurityException r13 = new java.lang.SecurityException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to verify "
            r14.<init>(r0)
            r14.append(r7)
            java.lang.String r0 = " signature"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14, r12)
            throw r13
    }

    public static java.security.cert.X509Certificate[][] j(java.io.RandomAccessFile r1, java.lang.String r2) throws com.bytedance.pangle.tl.ws, java.lang.SecurityException, java.io.IOException {
            java.util.HashMap<java.lang.String, android.util.SparseArray<com.bytedance.pangle.tl.jy>> r0 = com.bytedance.pangle.tl.m.j
            java.lang.Object r2 = r0.get(r2)
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            r0 = 1896449818(0x7109871a, float:6.810044E29)
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.pangle.tl.jy r2 = (com.bytedance.pangle.tl.jy) r2
            if (r2 == 0) goto L1b
            r0 = 1
            com.bytedance.pangle.tl.xt$j r1 = j(r1, r2, r0)
            java.security.cert.X509Certificate[][] r1 = r1.j
            return r1
        L1b:
            com.bytedance.pangle.tl.ws r1 = new com.bytedance.pangle.tl.ws
            java.lang.String r2 = "findVerifiedSigner, No APK Signature Scheme v2 signature in package"
            r1.<init>(r2)
            throw r1
    }
}
