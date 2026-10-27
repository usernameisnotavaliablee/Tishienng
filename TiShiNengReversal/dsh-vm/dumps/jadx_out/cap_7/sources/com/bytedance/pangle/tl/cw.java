package com.bytedance.pangle.tl;

@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {

    /* renamed from: com.bytedance.pangle.tl.cw$cw, reason: collision with other inner class name */
    public static class C0013cw {
        public byte[] cw;
        public final java.security.cert.X509Certificate[] j;
        public final com.bytedance.pangle.tl.cw.xt xt;

        public C0013cw(java.security.cert.X509Certificate[] r1, com.bytedance.pangle.tl.cw.xt r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }
    }

    private static class j extends java.lang.Exception {
    }

    public static class xt {
        public final java.util.List<java.security.cert.X509Certificate> j;
        public final java.util.List<java.lang.Integer> xt;

        public xt(java.util.List<java.security.cert.X509Certificate> r1, java.util.List<java.lang.Integer> r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    private static com.bytedance.pangle.tl.cw.C0013cw j(java.io.RandomAccessFile r7, com.bytedance.pangle.tl.jy r8, boolean r9) throws java.lang.SecurityException, java.io.IOException {
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            java.lang.String r2 = "X.509"
            java.security.cert.CertificateFactory r2 = java.security.cert.CertificateFactory.getInstance(r2)     // Catch: java.security.cert.CertificateException -> L94
            java.nio.ByteBuffer r3 = r8.j     // Catch: java.io.IOException -> L8b
            java.nio.ByteBuffer r3 = com.bytedance.pangle.tl.m.j(r3)     // Catch: java.io.IOException -> L8b
            r4 = 0
            r5 = 0
        L18:
            boolean r6 = r3.hasRemaining()
            if (r6 == 0) goto L4a
            java.nio.ByteBuffer r6 = com.bytedance.pangle.tl.m.j(r3)     // Catch: java.lang.SecurityException -> L29 java.nio.BufferUnderflowException -> L2b java.io.IOException -> L2d com.bytedance.pangle.tl.cw.j -> L2f
            com.bytedance.pangle.tl.cw$cw r5 = j(r6, r1, r2)     // Catch: java.lang.SecurityException -> L29 java.nio.BufferUnderflowException -> L2b java.io.IOException -> L2d com.bytedance.pangle.tl.cw.j -> L2f
            int r4 = r4 + 1
            goto L18
        L29:
            r7 = move-exception
            goto L31
        L2b:
            r7 = move-exception
            goto L31
        L2d:
            r7 = move-exception
            goto L31
        L2f:
            goto L18
        L31:
            java.lang.SecurityException r8 = new java.lang.SecurityException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to parse/verify signer #"
            r9.<init>(r0)
            r9.append(r4)
            java.lang.String r0 = " block"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9, r7)
            throw r8
        L4a:
            if (r4 <= 0) goto L83
            if (r5 == 0) goto L83
            r2 = 1
            if (r4 != r2) goto L7b
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L73
            if (r9 == 0) goto L5c
            com.bytedance.pangle.tl.m.j(r1, r7, r8)
        L5c:
            boolean r9 = r1.containsKey(r0)
            if (r9 == 0) goto L72
            java.lang.Object r9 = r1.get(r0)
            byte[] r9 = (byte[]) r9
            long r0 = r7.length()
            byte[] r7 = com.bytedance.pangle.tl.m.j(r9, r0, r8)
            r5.cw = r7
        L72:
            return r5
        L73:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r8 = "No content digests found"
            r7.<init>(r8)
            throw r7
        L7b:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r8 = "APK Signature Scheme V3 only supports one signer: multiple signers found."
            r7.<init>(r8)
            throw r7
        L83:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r8 = "No signers found"
            r7.<init>(r8)
            throw r7
        L8b:
            r7 = move-exception
            java.lang.SecurityException r8 = new java.lang.SecurityException
            java.lang.String r9 = "Failed to read list of signers"
            r8.<init>(r9, r7)
            throw r8
        L94:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Failed to obtain X.509 CertificateFactory"
            r8.<init>(r9, r7)
            throw r8
    }

    public static com.bytedance.pangle.tl.cw.C0013cw j(java.io.RandomAccessFile r1, java.lang.String r2) throws java.io.IOException, com.bytedance.pangle.tl.ws {
            java.util.HashMap<java.lang.String, android.util.SparseArray<com.bytedance.pangle.tl.jy>> r0 = com.bytedance.pangle.tl.m.j
            java.lang.Object r2 = r0.get(r2)
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            r0 = -262969152(0xfffffffff05368c0, float:-2.6171189E29)
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.pangle.tl.jy r2 = (com.bytedance.pangle.tl.jy) r2
            if (r2 == 0) goto L19
            r0 = 1
            com.bytedance.pangle.tl.cw$cw r1 = j(r1, r2, r0)
            return r1
        L19:
            com.bytedance.pangle.tl.ws r1 = new com.bytedance.pangle.tl.ws
            java.lang.String r2 = "findVerifiedSigner, No APK Signature Scheme v3 signature in package"
            r1.<init>(r2)
            throw r1
    }

    private static com.bytedance.pangle.tl.cw.C0013cw j(java.nio.ByteBuffer r4, java.util.List<java.security.cert.X509Certificate> r5, java.security.cert.CertificateFactory r6) throws java.io.IOException {
            int r0 = r5.size()
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r5 = r5.toArray(r0)
            java.security.cert.X509Certificate[] r5 = (java.security.cert.X509Certificate[]) r5
            r0 = 0
        Ld:
            boolean r1 = r4.hasRemaining()
            if (r1 == 0) goto L87
            java.nio.ByteBuffer r1 = com.bytedance.pangle.tl.m.j(r4)
            int r2 = r1.remaining()
            r3 = 4
            if (r2 < r3) goto L6f
            int r2 = r1.getInt()
            r3 = 1000370060(0x3ba06f8c, float:0.00489611)
            if (r2 == r3) goto L28
            goto Ld
        L28:
            if (r0 != 0) goto L67
            com.bytedance.pangle.tl.cw$xt r0 = j(r1, r6)
            java.util.List<java.security.cert.X509Certificate> r1 = r0.j     // Catch: java.security.cert.CertificateEncodingException -> L5e
            int r1 = r1.size()     // Catch: java.security.cert.CertificateEncodingException -> L5e
            if (r1 <= 0) goto Ld
            java.util.List<java.security.cert.X509Certificate> r1 = r0.j     // Catch: java.security.cert.CertificateEncodingException -> L5e
            int r2 = r1.size()     // Catch: java.security.cert.CertificateEncodingException -> L5e
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)     // Catch: java.security.cert.CertificateEncodingException -> L5e
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1     // Catch: java.security.cert.CertificateEncodingException -> L5e
            byte[] r1 = r1.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L5e
            r2 = 0
            r2 = r5[r2]     // Catch: java.security.cert.CertificateEncodingException -> L5e
            byte[] r2 = r2.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L5e
            boolean r1 = java.util.Arrays.equals(r1, r2)     // Catch: java.security.cert.CertificateEncodingException -> L5e
            if (r1 == 0) goto L56
            goto Ld
        L56:
            java.lang.SecurityException r4 = new java.lang.SecurityException     // Catch: java.security.cert.CertificateEncodingException -> L5e
            java.lang.String r5 = "Terminal certificate in Proof-of-rotation record does not match APK signing certificate"
            r4.<init>(r5)     // Catch: java.security.cert.CertificateEncodingException -> L5e
            throw r4     // Catch: java.security.cert.CertificateEncodingException -> L5e
        L5e:
            r4 = move-exception
            java.lang.SecurityException r5 = new java.lang.SecurityException
            java.lang.String r6 = "Failed to encode certificate when comparing Proof-of-rotation record and signing certificate"
            r5.<init>(r6, r4)
            throw r5
        L67:
            java.lang.SecurityException r4 = new java.lang.SecurityException
            java.lang.String r5 = "Encountered multiple Proof-of-rotation records when verifying APK Signature Scheme v3 signature"
            r4.<init>(r5)
            throw r4
        L6f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Remaining buffer too short to contain additional attribute ID. Remaining: "
            r5.<init>(r6)
            int r6 = r1.remaining()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L87:
            com.bytedance.pangle.tl.cw$cw r4 = new com.bytedance.pangle.tl.cw$cw
            r4.<init>(r5, r0)
            return r4
    }

    private static com.bytedance.pangle.tl.cw.C0013cw j(java.nio.ByteBuffer r16, java.util.Map<java.lang.Integer, byte[]> r17, java.security.cert.CertificateFactory r18) throws java.lang.SecurityException, java.io.IOException, com.bytedance.pangle.tl.cw.j {
            r0 = r18
            java.nio.ByteBuffer r1 = com.bytedance.pangle.tl.m.j(r16)
            int r2 = r16.getInt()
            int r3 = r16.getInt()
            java.nio.ByteBuffer r4 = com.bytedance.pangle.tl.m.j(r16)
            byte[] r5 = com.bytedance.pangle.tl.m.xt(r16)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            r8 = -1
            r9 = 0
            r12 = r9
            r10 = -1
            r11 = 0
        L21:
            boolean r13 = r4.hasRemaining()
            r14 = 8
            if (r13 == 0) goto L73
            int r11 = r11 + 1
            java.nio.ByteBuffer r13 = com.bytedance.pangle.tl.m.j(r4)     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            int r15 = r13.remaining()     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            if (r15 < r14) goto L5b
            int r14 = r13.getInt()     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            r6.add(r15)     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            boolean r15 = j(r14)     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            if (r15 != 0) goto L47
            goto L21
        L47:
            if (r10 == r8) goto L54
            int r15 = com.bytedance.pangle.tl.m.j(r14, r10)     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            if (r15 <= 0) goto L21
            goto L54
        L50:
            r0 = move-exception
            goto L63
        L52:
            r0 = move-exception
            goto L63
        L54:
            byte[] r10 = com.bytedance.pangle.tl.m.xt(r13)     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            r12 = r10
            r10 = r14
            goto L21
        L5b:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            java.lang.String r1 = "Signature record too short"
            r0.<init>(r1)     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
            throw r0     // Catch: java.nio.BufferUnderflowException -> L50 java.io.IOException -> L52
        L63:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "Failed to parse signature record #"
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2, r0)
            throw r1
        L73:
            if (r10 != r8) goto L87
            if (r11 != 0) goto L7f
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No signatures found"
            r0.<init>(r1)
            throw r0
        L7f:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No supported signatures found"
            r0.<init>(r1)
            throw r0
        L87:
            java.lang.String r4 = com.bytedance.pangle.tl.m.cw(r10)
            android.util.Pair r8 = com.bytedance.pangle.tl.m.r(r10)
            java.lang.Object r11 = r8.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r8.second
            java.security.spec.AlgorithmParameterSpec r8 = (java.security.spec.AlgorithmParameterSpec) r8
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch: java.security.SignatureException -> Lb1 java.security.InvalidAlgorithmParameterException -> Lb4 java.security.InvalidKeyException -> Lb7 java.security.spec.InvalidKeySpecException -> Lba java.security.NoSuchAlgorithmException -> Lbd
            java.security.spec.X509EncodedKeySpec r13 = new java.security.spec.X509EncodedKeySpec     // Catch: java.security.SignatureException -> Lb1 java.security.InvalidAlgorithmParameterException -> Lb4 java.security.InvalidKeyException -> Lb7 java.security.spec.InvalidKeySpecException -> Lba java.security.NoSuchAlgorithmException -> Lbd
            r13.<init>(r5)     // Catch: java.security.SignatureException -> Lb1 java.security.InvalidAlgorithmParameterException -> Lb4 java.security.InvalidKeyException -> Lb7 java.security.spec.InvalidKeySpecException -> Lba java.security.NoSuchAlgorithmException -> Lbd
            java.security.PublicKey r4 = r4.generatePublic(r13)     // Catch: java.security.SignatureException -> Lb1 java.security.InvalidAlgorithmParameterException -> Lb4 java.security.InvalidKeyException -> Lb7 java.security.spec.InvalidKeySpecException -> Lba java.security.NoSuchAlgorithmException -> Lbd
            java.security.Signature r13 = java.security.Signature.getInstance(r11)     // Catch: java.security.SignatureException -> Lb1 java.security.InvalidAlgorithmParameterException -> Lb4 java.security.InvalidKeyException -> Lb7 java.security.spec.InvalidKeySpecException -> Lba java.security.NoSuchAlgorithmException -> Lbd
            r13.initVerify(r4)     // Catch: java.security.SignatureException -> Lb1 java.security.InvalidAlgorithmParameterException -> Lb4 java.security.InvalidKeyException -> Lb7 java.security.spec.InvalidKeySpecException -> Lba java.security.NoSuchAlgorithmException -> Lbd
            if (r8 == 0) goto Lc0
            r13.setParameter(r8)     // Catch: java.security.SignatureException -> Lb1 java.security.InvalidAlgorithmParameterException -> Lb4 java.security.InvalidKeyException -> Lb7 java.security.spec.InvalidKeySpecException -> Lba java.security.NoSuchAlgorithmException -> Lbd
            goto Lc0
        Lb1:
            r0 = move-exception
            goto L1f9
        Lb4:
            r0 = move-exception
            goto L1f9
        Lb7:
            r0 = move-exception
            goto L1f9
        Lba:
            r0 = move-exception
            goto L1f9
        Lbd:
            r0 = move-exception
            goto L1f9
        Lc0:
            r13.update(r1)     // Catch: java.security.SignatureException -> Lb1 java.security.InvalidAlgorithmParameterException -> Lb4 java.security.InvalidKeyException -> Lb7 java.security.spec.InvalidKeySpecException -> Lba java.security.NoSuchAlgorithmException -> Lbd
            boolean r4 = r13.verify(r12)     // Catch: java.security.SignatureException -> Lb1 java.security.InvalidAlgorithmParameterException -> Lb4 java.security.InvalidKeyException -> Lb7 java.security.spec.InvalidKeySpecException -> Lba java.security.NoSuchAlgorithmException -> Lbd
            if (r4 == 0) goto L1e2
            r1.clear()
            java.nio.ByteBuffer r4 = com.bytedance.pangle.tl.m.j(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r11 = 0
        Ld6:
            boolean r12 = r4.hasRemaining()
            if (r12 == 0) goto L116
            int r11 = r11 + 1
            java.nio.ByteBuffer r12 = com.bytedance.pangle.tl.m.j(r4)     // Catch: java.nio.BufferUnderflowException -> Lfa java.io.IOException -> Lfc
            int r13 = r12.remaining()     // Catch: java.nio.BufferUnderflowException -> Lfa java.io.IOException -> Lfc
            if (r13 < r14) goto Lfe
            int r13 = r12.getInt()     // Catch: java.nio.BufferUnderflowException -> Lfa java.io.IOException -> Lfc
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch: java.nio.BufferUnderflowException -> Lfa java.io.IOException -> Lfc
            r8.add(r15)     // Catch: java.nio.BufferUnderflowException -> Lfa java.io.IOException -> Lfc
            if (r13 != r10) goto Ld6
            byte[] r9 = com.bytedance.pangle.tl.m.xt(r12)     // Catch: java.nio.BufferUnderflowException -> Lfa java.io.IOException -> Lfc
            goto Ld6
        Lfa:
            r0 = move-exception
            goto L106
        Lfc:
            r0 = move-exception
            goto L106
        Lfe:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.nio.BufferUnderflowException -> Lfa java.io.IOException -> Lfc
            java.lang.String r1 = "Record too short"
            r0.<init>(r1)     // Catch: java.nio.BufferUnderflowException -> Lfa java.io.IOException -> Lfc
            throw r0     // Catch: java.nio.BufferUnderflowException -> Lfa java.io.IOException -> Lfc
        L106:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Failed to parse digest record #"
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2, r0)
            throw r1
        L116:
            boolean r4 = r6.equals(r8)
            if (r4 == 0) goto L1da
            int r4 = com.bytedance.pangle.tl.m.j(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r8 = r17
            java.lang.Object r6 = r8.put(r6, r9)
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L150
            boolean r6 = java.security.MessageDigest.isEqual(r6, r9)
            if (r6 == 0) goto L135
            goto L150
        L135:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.bytedance.pangle.tl.m.xt(r4)
            r1.append(r2)
            java.lang.String r2 = " contents digest does not match the digest specified by a preceding signer"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L150:
            java.nio.ByteBuffer r4 = com.bytedance.pangle.tl.m.j(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r8 = 0
        L15a:
            boolean r9 = r4.hasRemaining()
            if (r9 == 0) goto L18b
            int r8 = r8 + 1
            byte[] r9 = com.bytedance.pangle.tl.m.xt(r4)
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L17a
            r10.<init>(r9)     // Catch: java.security.cert.CertificateException -> L17a
            java.security.cert.Certificate r10 = r0.generateCertificate(r10)     // Catch: java.security.cert.CertificateException -> L17a
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch: java.security.cert.CertificateException -> L17a
            com.bytedance.pangle.tl.av r11 = new com.bytedance.pangle.tl.av
            r11.<init>(r10, r9)
            r6.add(r11)
            goto L15a
        L17a:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "Failed to decode certificate #"
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2, r0)
            throw r1
        L18b:
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L1d2
            java.lang.Object r4 = r6.get(r7)
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            java.security.PublicKey r4 = r4.getPublicKey()
            byte[] r4 = r4.getEncoded()
            boolean r4 = java.util.Arrays.equals(r5, r4)
            if (r4 == 0) goto L1ca
            int r4 = r1.getInt()
            if (r4 != r2) goto L1c2
            int r2 = r1.getInt()
            if (r2 != r3) goto L1ba
            java.nio.ByteBuffer r1 = com.bytedance.pangle.tl.m.j(r1)
            com.bytedance.pangle.tl.cw$cw r0 = j(r1, r6, r0)
            return r0
        L1ba:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "maxSdkVersion mismatch between signed and unsigned in v3 signer block."
            r0.<init>(r1)
            throw r0
        L1c2:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "minSdkVersion mismatch between signed and unsigned in v3 signer block."
            r0.<init>(r1)
            throw r0
        L1ca:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Public key mismatch between certificate and signature record"
            r0.<init>(r1)
            throw r0
        L1d2:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No certificates listed"
            r0.<init>(r1)
            throw r0
        L1da:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Signature algorithms don't match between digests and signatures records"
            r0.<init>(r1)
            throw r0
        L1e2:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = " signature did not verify"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1f9:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to verify "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r3 = " signature"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    private static com.bytedance.pangle.tl.cw.xt j(java.nio.ByteBuffer r14, java.security.cert.CertificateFactory r15) throws java.lang.SecurityException, java.io.IOException {
            java.lang.String r0 = " when verifying Proof-of-rotation record"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r14.getInt()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r4.<init>()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r5 = -1
            r6 = 0
        L17:
            boolean r7 = r14.hasRemaining()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            if (r7 == 0) goto Lf4
            int r3 = r3 + 1
            java.nio.ByteBuffer r7 = com.bytedance.pangle.tl.m.j(r14)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.nio.ByteBuffer r8 = com.bytedance.pangle.tl.m.j(r7)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            int r9 = r7.getInt()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            int r10 = r7.getInt()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            byte[] r7 = com.bytedance.pangle.tl.m.xt(r7)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            if (r6 == 0) goto L8e
            android.util.Pair r11 = com.bytedance.pangle.tl.m.r(r5)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.security.PublicKey r12 = r6.getPublicKey()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.Object r13 = r11.first     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.security.Signature r13 = java.security.Signature.getInstance(r13)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r13.initVerify(r12)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.Object r12 = r11.second     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            if (r12 == 0) goto L61
            java.security.spec.AlgorithmParameterSpec r12 = (java.security.spec.AlgorithmParameterSpec) r12     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r13.setParameter(r12)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            goto L61
        L52:
            r14 = move-exception
            goto Lfa
        L55:
            r14 = move-exception
            goto L111
        L58:
            r14 = move-exception
            goto L111
        L5b:
            r14 = move-exception
            goto L111
        L5e:
            r14 = move-exception
            goto L111
        L61:
            r13.update(r8)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            boolean r7 = r13.verify(r7)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            if (r7 == 0) goto L6b
            goto L8e
        L6b:
            java.lang.SecurityException r14 = new java.lang.SecurityException     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r1 = "Unable to verify signature of certificate #"
            r15.<init>(r1)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r15.append(r3)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r1 = " using "
            r15.append(r1)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.Object r1 = r11.first     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r15.append(r1)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r15.append(r0)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r15 = r15.toString()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r14.<init>(r15)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            throw r14     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
        L8e:
            r8.rewind()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            byte[] r7 = com.bytedance.pangle.tl.m.xt(r8)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            int r8 = r8.getInt()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            if (r6 == 0) goto Lb5
            if (r5 != r8) goto L9e
            goto Lb5
        L9e:
            java.lang.SecurityException r14 = new java.lang.SecurityException     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r1 = "Signing algorithm ID mismatch for certificate #"
            r15.<init>(r1)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r15.append(r3)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r15.append(r0)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r15 = r15.toString()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r14.<init>(r15)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            throw r14     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
        Lb5:
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r5.<init>(r7)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.security.cert.Certificate r5 = r15.generateCertificate(r5)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            com.bytedance.pangle.tl.av r6 = new com.bytedance.pangle.tl.av     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r6.<init>(r5, r7)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            boolean r5 = r4.contains(r6)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            if (r5 != 0) goto Ldb
            r4.add(r6)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r1.add(r6)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r2.add(r5)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r5 = r10
            goto L17
        Ldb:
            java.lang.SecurityException r14 = new java.lang.SecurityException     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r1 = "Encountered duplicate entries in Proof-of-rotation record at certificate #"
            r15.<init>(r1)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r15.append(r3)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r1 = ".  All signing certificates should be unique"
            r15.append(r1)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            java.lang.String r15 = r15.toString()     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            r14.<init>(r15)     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
            throw r14     // Catch: java.security.cert.CertificateException -> L52 java.security.SignatureException -> L55 java.security.InvalidAlgorithmParameterException -> L58 java.security.InvalidKeyException -> L5b java.security.NoSuchAlgorithmException -> L5e java.lang.Throwable -> L128
        Lf4:
            com.bytedance.pangle.tl.cw$xt r14 = new com.bytedance.pangle.tl.cw$xt
            r14.<init>(r1, r2)
            return r14
        Lfa:
            java.lang.SecurityException r15 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to decode certificate #"
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0, r14)
            throw r15
        L111:
            java.lang.SecurityException r15 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to verify signature over signed data for certificate #"
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0, r14)
            throw r15
        L128:
            r14 = move-exception
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Failed to parse Proof-of-rotation record"
            r15.<init>(r0, r14)
            throw r15
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
}
