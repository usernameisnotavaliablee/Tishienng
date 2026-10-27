package com.bytedance.pangle.tl;

@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.pangle.tl.az j(java.lang.String r16, int r17) throws com.bytedance.pangle.tl.i {
            r1 = r16
            r2 = r17
            java.lang.String r3 = "Failed to collect certificates from "
            java.lang.String r4 = " or newer for package "
            java.lang.String r5 = "No signature found in package of version "
            r6 = 4
            r7 = 3
            if (r2 > r7) goto L16a
            r8 = 0
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L147
            java.lang.String r0 = "r"
            r9.<init>(r1, r0)     // Catch: java.lang.Throwable -> L145 java.lang.Exception -> L147
            r0 = -262969152(0xfffffffff05368c0, float:-2.6171189E29)
            r10 = 1896449818(0x7109871a, float:6.810044E29)
            int[] r0 = new int[]{r0, r10}     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L12d
            com.bytedance.pangle.tl.m.j(r1, r9, r0)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L12d
            r10 = 1
            com.bytedance.pangle.tl.cw$cw r0 = com.bytedance.pangle.tl.cw.j(r9, r1)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            java.security.cert.Certificate[][] r11 = new java.security.cert.Certificate[r10][]     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            java.security.cert.X509Certificate[] r12 = r0.j     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            r13 = 0
            r11[r13] = r12     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            android.content.pm.Signature[] r11 = j(r11)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            com.bytedance.pangle.tl.cw$xt r12 = r0.xt     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            if (r12 == 0) goto L7e
            java.util.List<java.security.cert.X509Certificate> r8 = r12.j     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            android.content.pm.Signature[] r12 = new android.content.pm.Signature[r8]     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            com.bytedance.pangle.tl.cw$xt r14 = r0.xt     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            java.util.List<java.lang.Integer> r14 = r14.xt     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            int r14 = r14.size()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            int[] r14 = new int[r14]     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
        L49:
            if (r13 >= r8) goto L7c
            android.content.pm.Signature r15 = new android.content.pm.Signature     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            com.bytedance.pangle.tl.cw$xt r10 = r0.xt     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            java.util.List<java.security.cert.X509Certificate> r10 = r10.j     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            java.lang.Object r10 = r10.get(r13)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            byte[] r10 = r10.getEncoded()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            r15.<init>(r10)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            r12[r13] = r15     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            com.bytedance.pangle.tl.cw$xt r10 = r0.xt     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            java.util.List<java.lang.Integer> r10 = r10.xt     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            java.lang.Object r10 = r10.get(r13)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            r14[r13] = r10     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            int r13 = r13 + 1
            r10 = 1
            goto L49
        L74:
            r0 = move-exception
            r8 = r9
            goto L164
        L78:
            r0 = move-exception
            goto L88
        L7a:
            r0 = move-exception
            goto L9f
        L7c:
            r8 = r12
            goto L7f
        L7e:
            r14 = r8
        L7f:
            com.bytedance.pangle.tl.az r0 = new com.bytedance.pangle.tl.az     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            r0.<init>(r11, r7, r8, r14)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78 com.bytedance.pangle.tl.ws -> L7a
            r9.close()     // Catch: java.lang.Exception -> L87
        L87:
            return r0
        L88:
            com.bytedance.pangle.tl.i r2 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L74
            r4.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = " using APK Signature Scheme v3"
            r4.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L74
            r2.<init>(r6, r1, r0)     // Catch: java.lang.Throwable -> L74
            throw r2     // Catch: java.lang.Throwable -> L74
        L9f:
            if (r2 >= r7) goto L11d
            r7 = 2
            if (r2 > r7) goto L105
            java.security.cert.X509Certificate[][] r0 = com.bytedance.pangle.tl.xt.j(r9, r1)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> Lb5 com.bytedance.pangle.tl.ws -> Lb7
            android.content.pm.Signature[] r0 = j(r0)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> Lb5 com.bytedance.pangle.tl.ws -> Lb7
            com.bytedance.pangle.tl.az r8 = new com.bytedance.pangle.tl.az     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> Lb5 com.bytedance.pangle.tl.ws -> Lb7
            r8.<init>(r0, r7)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> Lb5 com.bytedance.pangle.tl.ws -> Lb7
            r9.close()     // Catch: java.lang.Exception -> Lb4
        Lb4:
            return r8
        Lb5:
            r0 = move-exception
            goto Lb9
        Lb7:
            r0 = move-exception
            goto Ld0
        Lb9:
            com.bytedance.pangle.tl.i r2 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L74
            r4.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = " using APK Signature Scheme v2"
            r4.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L74
            r2.<init>(r6, r1, r0)     // Catch: java.lang.Throwable -> L74
            throw r2     // Catch: java.lang.Throwable -> L74
        Ld0:
            if (r2 >= r7) goto Lf5
            r3 = 1
            if (r2 > r3) goto Ldd
            com.bytedance.pangle.tl.az r0 = com.bytedance.pangle.tl.j.j(r1, r3)     // Catch: java.lang.Throwable -> L74
            r9.close()     // Catch: java.lang.Exception -> Ldc
        Ldc:
            return r0
        Ldd:
            com.bytedance.pangle.tl.i r0 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L74
            r3.append(r2)     // Catch: java.lang.Throwable -> L74
            r3.append(r4)     // Catch: java.lang.Throwable -> L74
            r3.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L74
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        Lf5:
            com.bytedance.pangle.tl.i r2 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "No APK Signature Scheme v2 signature in package "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r3.concat(r1)     // Catch: java.lang.Throwable -> L74
            r2.<init>(r6, r1, r0)     // Catch: java.lang.Throwable -> L74
            throw r2     // Catch: java.lang.Throwable -> L74
        L105:
            com.bytedance.pangle.tl.i r0 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L74
            r3.append(r2)     // Catch: java.lang.Throwable -> L74
            r3.append(r4)     // Catch: java.lang.Throwable -> L74
            r3.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L74
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L11d:
            com.bytedance.pangle.tl.i r2 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "No APK Signature Scheme v3 signature in package "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r3.concat(r1)     // Catch: java.lang.Throwable -> L74
            r2.<init>(r6, r1, r0)     // Catch: java.lang.Throwable -> L74
            throw r2     // Catch: java.lang.Throwable -> L74
        L12d:
            r0 = move-exception
            com.bytedance.pangle.tl.i r2 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L74
            r4.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = " when findSignatureInfo at once"
            r4.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L74
            r2.<init>(r6, r1, r0)     // Catch: java.lang.Throwable -> L74
            throw r2     // Catch: java.lang.Throwable -> L74
        L145:
            r0 = move-exception
            goto L164
        L147:
            com.bytedance.pangle.tl.i r0 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L145
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L145
            java.lang.String r4 = "failed to read apk file, minSignatureSchemeVersion : "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L145
            r3.append(r2)     // Catch: java.lang.Throwable -> L145
            java.lang.String r2 = ", apkPath : "
            r3.append(r2)     // Catch: java.lang.Throwable -> L145
            r3.append(r1)     // Catch: java.lang.Throwable -> L145
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L145
            r2 = 6
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L145
            throw r0     // Catch: java.lang.Throwable -> L145
        L164:
            if (r8 == 0) goto L169
            r8.close()     // Catch: java.lang.Exception -> L169
        L169:
            throw r0
        L16a:
            com.bytedance.pangle.tl.i r0 = new com.bytedance.pangle.tl.i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r6, r1)
            throw r0
    }

    public static android.content.pm.Signature[] j(java.security.cert.Certificate[][] r6) throws java.security.cert.CertificateEncodingException {
            int r0 = r6.length
            android.content.pm.Signature[] r0 = new android.content.pm.Signature[r0]
            r1 = 0
            r2 = 0
        L5:
            int r3 = r6.length
            if (r2 >= r3) goto L5b
            boolean r3 = com.bytedance.pangle.util.g.r()
            if (r3 == 0) goto L49
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<java.security.cert.Certificate[]> r5 = java.security.cert.Certificate[].class
            r4[r1] = r5
            java.lang.Class<android.content.pm.Signature> r5 = android.content.pm.Signature.class
            java.lang.reflect.Constructor r4 = com.bytedance.pangle.xt.xt.j.j(r5, r4)
            if (r4 == 0) goto L20
            r4.setAccessible(r3)
        L20:
            if (r4 == 0) goto L58
            boolean r5 = r4.isAccessible()
            if (r5 == 0) goto L58
            r5 = r6[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            r3[r1] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            java.lang.Object r3 = r4.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            android.content.pm.Signature r3 = (android.content.pm.Signature) r3     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            r0[r2] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            goto L58
        L37:
            r3 = move-exception
            goto L3d
        L39:
            r3 = move-exception
            goto L41
        L3b:
            r3 = move-exception
            goto L45
        L3d:
            com.bytedance.sdk.openadsdk.api.m.j(r3)
            goto L58
        L41:
            com.bytedance.sdk.openadsdk.api.m.j(r3)
            goto L58
        L45:
            com.bytedance.sdk.openadsdk.api.m.j(r3)
            goto L58
        L49:
            android.content.pm.Signature r3 = new android.content.pm.Signature
            r4 = r6[r2]
            r4 = r4[r1]
            byte[] r4 = r4.getEncoded()
            r3.<init>(r4)
            r0[r2] = r3
        L58:
            int r2 = r2 + 1
            goto L5
        L5b:
            return r0
    }
}
