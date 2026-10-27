package e2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private static final java.util.regex.Pattern a = null;
    private static final java.lang.String[] b = null;

    static {
            java.lang.String r0 = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            e2.d.a = r0
            java.lang.String r13 = "or"
            java.lang.String r14 = "org"
            java.lang.String r1 = "ac"
            java.lang.String r2 = "co"
            java.lang.String r3 = "com"
            java.lang.String r4 = "ed"
            java.lang.String r5 = "edu"
            java.lang.String r6 = "go"
            java.lang.String r7 = "gouv"
            java.lang.String r8 = "gov"
            java.lang.String r9 = "info"
            java.lang.String r10 = "lg"
            java.lang.String r11 = "ne"
            java.lang.String r12 = "net"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            e2.d.b = r0
            java.util.Arrays.sort(r0)
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void a(java.lang.String r4, java.security.cert.X509Certificate r5, boolean r6) throws javax.net.ssl.SSLException {
            java.lang.String[] r0 = d(r5)
            java.lang.String[] r5 = f(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cn is : "
            r1.append(r2)
            java.lang.String r2 = java.util.Arrays.toString(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = ""
            com.huawei.secure.android.common.ssl.util.h.b(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "san is : "
            r1.append(r3)
            java.lang.String r3 = java.util.Arrays.toString(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r2, r1)
            b(r4, r0, r5, r6)
            return
    }

    public static final void b(java.lang.String r5, java.lang.String[] r6, java.lang.String[] r7, boolean r8) throws javax.net.ssl.SSLException {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
            if (r6 == 0) goto L12
            int r2 = r6.length
            if (r2 <= 0) goto L12
            r6 = r6[r1]
            if (r6 == 0) goto L12
            r0.add(r6)
        L12:
            if (r7 == 0) goto L22
            int r6 = r7.length
            r2 = 0
        L16:
            if (r2 >= r6) goto L22
            r3 = r7[r2]
            if (r3 == 0) goto L1f
            r0.add(r3)
        L1f:
            int r2 = r2 + 1
            goto L16
        L22:
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto Lc9
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.String r7 = r5.trim()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r7 = r7.toLowerCase(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L3c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La7
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.String r3 = " <"
            r6.append(r3)
            r6.append(r2)
            r3 = 62
            r6.append(r3)
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L66
            java.lang.String r3 = " OR"
            r6.append(r3)
        L66:
            java.lang.String r3 = "*."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto La1
            r3 = 46
            r4 = 2
            int r3 = r2.indexOf(r3, r4)
            r4 = -1
            if (r3 == r4) goto La1
            boolean r3 = c(r2)
            if (r3 == 0) goto La1
            boolean r3 = g(r5)
            if (r3 != 0) goto La1
            r3 = 1
            java.lang.String r4 = r2.substring(r3)
            boolean r4 = r7.endsWith(r4)
            if (r4 == 0) goto L9f
            if (r8 == 0) goto L9f
            int r4 = e(r7)
            int r2 = e(r2)
            if (r4 != r2) goto L9d
            r2 = 1
            goto La5
        L9d:
            r2 = 0
            goto La5
        L9f:
            r2 = r4
            goto La5
        La1:
            boolean r2 = r7.equals(r2)
        La5:
            if (r2 == 0) goto L3c
        La7:
            if (r2 == 0) goto Laa
            return
        Laa:
            javax.net.ssl.SSLException r7 = new javax.net.ssl.SSLException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "hostname in certificate didn't match: <"
            r8.append(r0)
            r8.append(r5)
            java.lang.String r5 = "> !="
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            throw r7
        Lc9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Certificate for <"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = "> doesn't contain CN or DNS subjectAlt"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            javax.net.ssl.SSLException r6 = new javax.net.ssl.SSLException
            r6.<init>(r5)
            throw r6
    }

    public static boolean c(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 7
            r2 = 1
            if (r0 < r1) goto L26
            r1 = 9
            if (r0 > r1) goto L26
            int r0 = r0 + (-3)
            char r1 = r4.charAt(r0)
            r3 = 46
            if (r1 != r3) goto L26
            r1 = 2
            java.lang.String r4 = r4.substring(r1, r0)
            java.lang.String[] r0 = e2.d.b
            int r4 = java.util.Arrays.binarySearch(r0, r4)
            if (r4 >= 0) goto L24
            return r2
        L24:
            r4 = 0
            return r4
        L26:
            return r2
    }

    public static java.lang.String[] d(java.security.cert.X509Certificate r1) {
            e2.c r0 = new e2.c
            javax.security.auth.x500.X500Principal r1 = r1.getSubjectX500Principal()
            r0.<init>(r1)
            java.lang.String r1 = "cn"
            java.util.List r1 = r0.e(r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L1f
            int r0 = r1.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.toArray(r0)
            return r0
        L1f:
            r1 = 0
            return r1
    }

    public static int e(java.lang.String r4) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length()
            if (r0 >= r2) goto L15
            char r2 = r4.charAt(r0)
            r3 = 46
            if (r2 != r3) goto L12
            int r1 = r1 + 1
        L12:
            int r0 = r0 + 1
            goto L2
        L15:
            return r1
    }

    public static java.lang.String[] f(java.security.cert.X509Certificate r5) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
            java.util.Collection r5 = r5.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> Lb
            goto L14
        Lb:
            r5 = move-exception
            java.lang.String r2 = ""
            java.lang.String r3 = "Error parsing certificate."
            com.huawei.secure.android.common.ssl.util.h.c(r2, r3, r5)
            r5 = r1
        L14:
            if (r5 == 0) goto L3f
            java.util.Iterator r5 = r5.iterator()
        L1a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r5.next()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            java.lang.Object r3 = r2.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 2
            if (r3 != r4) goto L1a
            r3 = 1
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            goto L1a
        L3f:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L4f
            int r5 = r0.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            r0.toArray(r5)
            return r5
        L4f:
            return r1
    }

    private static boolean g(java.lang.String r1) {
            java.util.regex.Pattern r0 = e2.d.a
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }
}
