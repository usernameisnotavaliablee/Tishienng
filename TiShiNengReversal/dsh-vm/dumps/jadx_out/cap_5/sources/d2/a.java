package d2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final java.lang.String a = "HiPkgSignManager";

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.pm.PackageInfo a(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> Ld
            if (r1 == 0) goto L29
            r0 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageArchiveInfo(r2, r0)     // Catch: java.lang.Exception -> Ld
            return r1
        Ld:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Exception : "
            r2.append(r0)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "HiPkgSignManager"
            r0 = 1
            com.huawei.secure.android.common.util.e.q(r2, r1, r0)
        L29:
            r1 = 0
            return r1
    }

    private static java.lang.String b(byte[] r6) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            int r0 = r6.length
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r2 = 0
        Lb:
            if (r2 >= r0) goto L3e
            r3 = r6[r2]
            r4 = r3 & 255(0xff, float:3.57E-43)
            r5 = 16
            if (r4 >= r5) goto L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "0"
            r3.append(r4)
            r4 = r6[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            goto L3b
        L32:
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
        L3b:
            int r2 = r2 + 1
            goto Lb
        L3e:
            java.lang.String r6 = r1.toString()
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r6 = r6.toUpperCase(r0)
            return r6
    }

    private static java.util.List<java.lang.String> c(android.content.pm.Signature[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L1f
            int r1 = r4.length
            if (r1 != 0) goto Lb
            goto L1f
        Lb:
            int r1 = r4.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1f
            r3 = r4[r2]
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = d(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Ld
        L1f:
            return r0
    }

    private static java.lang.String d(byte[] r2) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            byte[] r2 = r0.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            java.lang.String r2 = b(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            return r2
        Lf:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NoSuchAlgorithmException"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "HiPkgSignManager"
            com.huawei.secure.android.common.util.e.l(r0, r2)
            java.lang.String r2 = ""
            return r2
    }

    public static boolean e(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L38
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L38
            if (r2 == 0) goto L38
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L16
            goto L38
        L16:
            android.content.pm.PackageInfo r2 = a(r2, r4)
            if (r2 == 0) goto L38
            android.content.pm.Signature[] r4 = r2.signatures
            r4 = r4[r1]
            byte[] r4 = r4.toByteArray()
            java.lang.String r4 = d(r4)
            java.lang.String r2 = r2.packageName
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L38
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L38
            r2 = 1
            return r2
        L38:
            return r1
    }

    public static boolean f(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L18
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L18
            if (r1 != 0) goto Lf
            goto L18
        Lf:
            java.lang.String r1 = i(r1, r3)
            boolean r1 = r2.equalsIgnoreCase(r1)
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static boolean g(android.content.Context r3, java.util.List<java.lang.String> r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L4b
            if (r4 == 0) goto L4b
            if (r3 != 0) goto Lc
            goto L4b
        Lc:
            java.util.List r3 = j(r3, r5)
            if (r3 != 0) goto L13
            return r1
        L13:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r2)
            r5.add(r0)
            goto L1c
        L32:
            java.util.Iterator r3 = r3.iterator()
        L36:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L36
            return r1
        L49:
            r3 = 1
            return r3
        L4b:
            return r1
    }

    public static byte[] h(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = "HiPkgSignManager"
            r1 = 0
            if (r4 == 0) goto L5c
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto Lc
            goto L5c
        Lc:
            r2 = 1
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L24 android.content.pm.PackageManager.NameNotFoundException -> L26
            if (r4 == 0) goto L59
            r3 = 64
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch: java.lang.Exception -> L24 android.content.pm.PackageManager.NameNotFoundException -> L26
            if (r4 == 0) goto L59
            android.content.pm.Signature[] r4 = r4.signatures     // Catch: java.lang.Exception -> L24 android.content.pm.PackageManager.NameNotFoundException -> L26
            r4 = r4[r1]     // Catch: java.lang.Exception -> L24 android.content.pm.PackageManager.NameNotFoundException -> L26
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Exception -> L24 android.content.pm.PackageManager.NameNotFoundException -> L26
            return r4
        L24:
            r4 = move-exception
            goto L28
        L26:
            r4 = move-exception
            goto L41
        L28:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "Exception : "
            r5.append(r3)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.huawei.secure.android.common.util.e.q(r0, r4, r2)
            goto L59
        L41:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "PackageManager.NameNotFoundException : "
            r5.append(r3)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.huawei.secure.android.common.util.e.q(r0, r4, r2)
        L59:
            byte[] r4 = new byte[r1]
            return r4
        L5c:
            java.lang.String r4 = "packageName is null or context is null"
            com.huawei.secure.android.common.util.e.l(r0, r4)
            byte[] r4 = new byte[r1]
            return r4
    }

    public static java.lang.String i(android.content.Context r0, java.lang.String r1) {
            byte[] r0 = h(r0, r1)
            if (r0 == 0) goto Le
            int r1 = r0.length
            if (r1 <= 0) goto Le
            java.lang.String r0 = d(r0)
            return r0
        Le:
            java.lang.String r0 = ""
            return r0
    }

    public static java.util.List<java.lang.String> j(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L59
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L59
            r2 = 28
            if (r1 < r2) goto L3f
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L3e
            android.content.pm.SigningInfo r4 = androidx.core.content.pm.a.a(r3)     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L1a
            goto L3e
        L1a:
            android.content.pm.SigningInfo r4 = androidx.core.content.pm.a.a(r3)     // Catch: java.lang.Throwable -> L59
            boolean r4 = cn.jiguang.commons.L.g1.a(r4)     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L31
            android.content.pm.SigningInfo r3 = androidx.core.content.pm.a.a(r3)     // Catch: java.lang.Throwable -> L59
            android.content.pm.Signature[] r3 = cn.jiguang.commons.L.h1.a(r3)     // Catch: java.lang.Throwable -> L59
            java.util.List r3 = c(r3)     // Catch: java.lang.Throwable -> L59
            return r3
        L31:
            android.content.pm.SigningInfo r3 = androidx.core.content.pm.a.a(r3)     // Catch: java.lang.Throwable -> L59
            android.content.pm.Signature[] r3 = cn.jiguang.commons.L.i1.a(r3)     // Catch: java.lang.Throwable -> L59
            java.util.List r3 = c(r3)     // Catch: java.lang.Throwable -> L59
            return r3
        L3e:
            return r0
        L3f:
            r1 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L59
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L59
            int r4 = r3.length     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L59
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L54
            goto L59
        L54:
            java.util.List r3 = c(r3)     // Catch: java.lang.Throwable -> L59
            return r3
        L59:
            return r0
    }

    public static java.lang.String k(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L15
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Lb
            goto L15
        Lb:
            android.content.pm.PackageInfo r2 = a(r2, r3)
            if (r2 == 0) goto L14
            java.lang.String r2 = r2.packageName
            return r2
        L14:
            return r0
        L15:
            java.lang.String r2 = "HiPkgSignManager"
            java.lang.String r3 = "archiveFilePath is null or context is null"
            com.huawei.secure.android.common.util.e.l(r2, r3)
            return r0
    }

    public static byte[] l(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "HiPkgSignManager"
            r1 = 0
            if (r3 == 0) goto L25
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto Lc
            goto L25
        Lc:
            android.content.pm.PackageInfo r3 = a(r3, r4)
            if (r3 == 0) goto L1d
            android.content.pm.Signature[] r3 = r3.signatures
            r3 = r3[r1]
            if (r3 == 0) goto L22
            byte[] r3 = r3.toByteArray()
            return r3
        L1d:
            java.lang.String r3 = "PackageInfo is null "
            com.huawei.secure.android.common.util.e.l(r0, r3)
        L22:
            byte[] r3 = new byte[r1]
            return r3
        L25:
            java.lang.String r3 = "archiveFilePath is null or context is null"
            com.huawei.secure.android.common.util.e.l(r0, r3)
            byte[] r3 = new byte[r1]
            return r3
    }

    public static java.lang.String m(android.content.Context r0, java.lang.String r1) {
            byte[] r0 = l(r0, r1)
            if (r0 == 0) goto Le
            int r1 = r0.length
            if (r1 <= 0) goto Le
            java.lang.String r0 = d(r0)
            return r0
        Le:
            java.lang.String r0 = ""
            return r0
    }
}
