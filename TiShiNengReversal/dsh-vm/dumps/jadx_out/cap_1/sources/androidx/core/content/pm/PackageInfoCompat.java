package androidx.core.content.pm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PackageInfoCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        static android.content.pm.Signature[] getApkContentsSigners(@androidx.annotation.NonNull android.content.pm.SigningInfo r0) {
                android.content.pm.Signature[] r0 = r0.getApkContentsSigners()
                return r0
        }

        @androidx.annotation.DoNotInline
        static long getLongVersionCode(android.content.pm.PackageInfo r2) {
                long r0 = r2.getLongVersionCode()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        static android.content.pm.Signature[] getSigningCertificateHistory(@androidx.annotation.NonNull android.content.pm.SigningInfo r0) {
                android.content.pm.Signature[] r0 = r0.getSigningCertificateHistory()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean hasMultipleSigners(@androidx.annotation.NonNull android.content.pm.SigningInfo r0) {
                boolean r0 = r0.hasMultipleSigners()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean hasSigningCertificate(@androidx.annotation.NonNull android.content.pm.PackageManager r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull byte[] r2, int r3) {
                boolean r0 = r0.hasSigningCertificate(r1, r2, r3)
                return r0
        }
    }

    private PackageInfoCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean byteArrayContains(@androidx.annotation.NonNull byte[][] r4, @androidx.annotation.NonNull byte[] r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L12
            r3 = r4[r2]
            boolean r3 = java.util.Arrays.equals(r5, r3)
            if (r3 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    private static byte[] computeSHA256Digest(byte[] r2) {
            java.lang.String r0 = "SHA256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            byte[] r2 = r0.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Device doesn't support SHA256 cert checking"
            r0.<init>(r1, r2)
            throw r0
    }

    public static long getLongVersionCode(@androidx.annotation.NonNull android.content.pm.PackageInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            long r0 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getLongVersionCode(r2)
            return r0
        Lb:
            int r2 = r2.versionCode
            long r0 = (long) r2
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<android.content.pm.Signature> getSignatures(@androidx.annotation.NonNull android.content.pm.PackageManager r2, @androidx.annotation.NonNull java.lang.String r3) throws android.content.pm.PackageManager.NameNotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L20
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            android.content.pm.SigningInfo r2 = androidx.core.content.pm.a.a(r2)
            boolean r3 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.hasMultipleSigners(r2)
            if (r3 == 0) goto L1b
            android.content.pm.Signature[] r2 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getApkContentsSigners(r2)
            goto L28
        L1b:
            android.content.pm.Signature[] r2 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getSigningCertificateHistory(r2)
            goto L28
        L20:
            r0 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            android.content.pm.Signature[] r2 = r2.signatures
        L28:
            if (r2 != 0) goto L2d
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        L2d:
            java.util.List r2 = java.util.Arrays.asList(r2)
            return r2
    }

    public static boolean hasSignatures(@androidx.annotation.NonNull android.content.pm.PackageManager r7, @androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull @androidx.annotation.Size(min = 1) java.util.Map<byte[], java.lang.Integer> r9, boolean r10) throws android.content.pm.PackageManager.NameNotFoundException {
            boolean r0 = r9.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Set r0 = r9.keySet()
            java.util.Iterator r2 = r0.iterator()
        L10:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "Unsupported certificate type "
            r5 = 1
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r2.next()
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L66
            java.lang.Object r3 = r9.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L4f
            int r6 = r3.intValue()
            if (r6 == 0) goto L10
            if (r6 != r5) goto L32
            goto L10
        L32:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r3)
            java.lang.String r10 = " when verifying "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L4f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Type must be specified for cert when verifying "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L66:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Cert byte array cannot be null when verifying "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L7d:
            java.util.List r2 = getSignatures(r7, r8)
            if (r10 != 0) goto Lab
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r3 < r6) goto Lab
            java.util.Iterator r10 = r0.iterator()
        L8d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r10.next()
            byte[] r0 = (byte[]) r0
            java.lang.Object r2 = r9.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r0 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.hasSigningCertificate(r7, r8, r0, r2)
            if (r0 != 0) goto L8d
            return r1
        Laa:
            return r5
        Lab:
            int r7 = r2.size()
            if (r7 == 0) goto L13a
            int r7 = r9.size()
            int r8 = r2.size()
            if (r7 > r8) goto L13a
            if (r10 == 0) goto Lc8
            int r7 = r9.size()
            int r8 = r2.size()
            if (r7 == r8) goto Lc8
            goto L13a
        Lc8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r7 = r9.containsValue(r7)
            if (r7 == 0) goto Lf2
            int r7 = r2.size()
            byte[][] r7 = new byte[r7][]
            r8 = 0
        Ld9:
            int r10 = r2.size()
            if (r8 >= r10) goto Lf3
            java.lang.Object r10 = r2.get(r8)
            android.content.pm.Signature r10 = (android.content.pm.Signature) r10
            byte[] r10 = r10.toByteArray()
            byte[] r10 = computeSHA256Digest(r10)
            r7[r8] = r10
            int r8 = r8 + 1
            goto Ld9
        Lf2:
            r7 = 0
        Lf3:
            java.util.Iterator r8 = r0.iterator()
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L13a
            java.lang.Object r8 = r8.next()
            byte[] r8 = (byte[]) r8
            java.lang.Object r9 = r9.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r10 = r9.intValue()
            if (r10 == 0) goto L12d
            if (r10 != r5) goto L118
            boolean r7 = byteArrayContains(r7, r8)
            if (r7 != 0) goto L139
            return r1
        L118:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L12d:
            android.content.pm.Signature r7 = new android.content.pm.Signature
            r7.<init>(r8)
            boolean r7 = r2.contains(r7)
            if (r7 != 0) goto L139
            return r1
        L139:
            return r5
        L13a:
            return r1
    }
}
