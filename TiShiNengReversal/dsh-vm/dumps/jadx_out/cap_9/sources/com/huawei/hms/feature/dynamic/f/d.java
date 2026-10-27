package com.huawei.hms.feature.dynamic.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class d {
    public static final java.lang.String a = "SignVerifier";
    public static final java.lang.String b = "com.huawei.hms.fingerprint_signature";
    public static final java.lang.String c = "com.huawei.hms.sign_certchain";

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.pm.PackageInfo r2) {
            android.content.pm.Signature[] r2 = r2.signatures
            r0 = 0
            if (r2 == 0) goto L21
            int r1 = r2.length
            if (r1 != 0) goto L9
            goto L21
        L9:
            r1 = 0
            r2 = r2[r1]
            byte[] r2 = r2.toByteArray()
            if (r2 == 0) goto L20
            int r1 = r2.length
            if (r1 != 0) goto L16
            goto L20
        L16:
            byte[] r2 = a(r2)
            r0 = 1
            java.lang.String r2 = com.huawei.hms.feature.dynamic.f.b.b(r2, r0)
            return r2
        L20:
            return r0
        L21:
            java.lang.String r2 = "SignVerifier"
            java.lang.String r1 = "Failed to get application signature certificate fingerprint."
            com.huawei.hms.common.util.Logger.e(r2, r1)
            return r0
    }

    public static boolean a(android.content.Context r7, java.lang.String r8) {
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r0 = 192(0xc0, float:2.69E-43)
            android.content.pm.PackageInfo r7 = r7.getPackageArchiveInfo(r8, r0)
            r8 = 0
            java.lang.String r0 = "SignVerifier"
            if (r7 == 0) goto L9a
            android.content.pm.ApplicationInfo r1 = r7.applicationInfo
            if (r1 != 0) goto L15
            goto L9a
        L15:
            java.lang.String r2 = r7.packageName
            android.os.Bundle r1 = r1.metaData
            java.lang.String r3 = "Verify package "
            if (r1 != 0) goto L35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r2)
            java.lang.String r1 = " failed for metadata is null."
        L2a:
            r7.append(r1)
            java.lang.String r7 = r7.toString()
        L31:
            com.huawei.hms.common.util.Logger.e(r0, r7)
            return r8
        L35:
            java.lang.String r4 = "com.huawei.hms.fingerprint_signature"
            boolean r5 = r1.containsKey(r4)
            if (r5 != 0) goto L4b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r2)
            java.lang.String r1 = " failed for no signer."
            goto L2a
        L4b:
            java.lang.String r5 = "com.huawei.hms.sign_certchain"
            boolean r6 = r1.containsKey(r5)
            if (r6 != 0) goto L61
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r2)
            java.lang.String r1 = " failed for no cert chain."
            goto L2a
        L61:
            java.lang.String r7 = a(r7)
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 == 0) goto L6e
            java.lang.String r7 = "Get PackageSignature failed: null."
            goto L31
        L6e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "&"
            r3.append(r2)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.String r2 = r1.getString(r4)
            java.lang.String r1 = r1.getString(r5)
            boolean r7 = a(r2, r1, r7)
            if (r7 != 0) goto L93
            java.lang.String r7 = "Check CertChain failed."
            goto L31
        L93:
            java.lang.String r7 = "verify signature with cert chain success."
            com.huawei.hms.common.util.Logger.i(r0, r7)
            r7 = 1
            return r7
        L9a:
            java.lang.String r7 = "PackageArchiveInfo is null."
            goto L31
    }

    public static boolean a(java.lang.String r2) {
            java.lang.String r0 = "SignVerifier"
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> Lc java.util.zip.ZipException -> L12
            r1.<init>(r2)     // Catch: java.io.IOException -> Lc java.util.zip.ZipException -> L12
            r2 = 1
            r1.close()     // Catch: java.io.IOException -> Lc java.util.zip.ZipException -> L12
            return r2
        Lc:
            java.lang.String r2 = "Check module file IOException"
        Le:
            com.huawei.hms.common.util.Logger.w(r0, r2)
            goto L15
        L12:
            java.lang.String r2 = "Check module file ZipException: not a valid zip."
            goto Le
        L15:
            r2 = 0
            return r2
    }

    public static boolean a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            java.lang.String r2 = "SignVerifier"
            if (r0 != 0) goto L66
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L10
            goto L66
        L10:
            java.util.List r4 = com.huawei.hms.feature.dynamic.f.e.b(r4)
            int r0 = r4.size()
            if (r0 != 0) goto L20
            java.lang.String r3 = "CertChain is empty."
        L1c:
            com.huawei.hms.common.util.Logger.e(r2, r3)
            return r1
        L20:
            java.security.cert.X509Certificate r0 = com.huawei.hms.feature.dynamic.f.e.a()
            boolean r0 = com.huawei.hms.feature.dynamic.f.e.a(r0, r4)
            if (r0 != 0) goto L2d
            java.lang.String r3 = "failed to verify cert chain"
            goto L1c
        L2d:
            java.lang.Object r4 = r4.get(r1)
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            java.lang.String r0 = "Huawei CBG HMS Kit"
            boolean r0 = com.huawei.hms.feature.dynamic.f.e.a(r4, r0)
            if (r0 != 0) goto L3e
            java.lang.String r3 = "CN is invalid"
            goto L1c
        L3e:
            java.lang.String r0 = "Huawei CBG Cloud Security Signer"
            boolean r0 = com.huawei.hms.feature.dynamic.f.e.b(r4, r0)
            if (r0 != 0) goto L49
            java.lang.String r3 = "OU is invalid"
            goto L1c
        L49:
            java.lang.String r0 = "UTF-8"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L50
            goto L57
        L50:
            r5 = move-exception
            java.lang.String r0 = "checkCertChain UnsupportedEncodingException:"
            com.huawei.hms.common.util.Logger.e(r2, r0, r5)
            r5 = 0
        L57:
            byte[] r3 = com.huawei.hms.feature.dynamic.f.a.a(r3)
            boolean r3 = com.huawei.hms.feature.dynamic.f.e.a(r4, r5, r3)
            if (r3 != 0) goto L64
            java.lang.String r3 = "signature is invalid: "
            goto L1c
        L64:
            r3 = 1
            return r3
        L66:
            java.lang.String r3 = "Args is invalid."
            goto L1c
    }

    public static byte[] a(byte[] r2) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            byte[] r2 = r0.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NoSuchAlgorithmException"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "SignVerifier"
            com.huawei.hms.common.util.Logger.e(r0, r2)
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
    }

    public static boolean b(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            java.lang.String r1 = "SignVerifier"
            if (r3 == 0) goto L23
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto Lc
            goto L23
        Lc:
            boolean r2 = a(r4)
            if (r2 != 0) goto L18
            java.lang.String r3 = "The module file is in wrong format."
        L14:
            com.huawei.hms.common.util.Logger.e(r1, r3)
            return r0
        L18:
            boolean r3 = a(r3, r4)
            if (r3 != 0) goto L21
            java.lang.String r3 = "check signature failed."
            goto L14
        L21:
            r3 = 1
            return r3
        L23:
            java.lang.String r3 = "The context is null or module path is invalid."
            goto L14
    }
}
