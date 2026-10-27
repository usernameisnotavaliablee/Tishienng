package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class am {
    private static final java.lang.String a = "tun";
    private static final java.lang.String b = "ppp";
    private static int c;

    public am() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONArray a() {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "cat /proc/net/route"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L70
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L70
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L70
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L70
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6d
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L6d
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L43
        L28:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L52
            java.lang.String r4 = com.kuaishou.weapon.p0.bo.a(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "tun"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L43
            if (r5 != 0) goto L45
            java.lang.String r5 = "ppp"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L28
            goto L45
        L43:
            goto L6b
        L45:
            java.lang.String r5 = "\t"
            java.lang.String[] r4 = r4.split(r5)     // Catch: java.lang.Throwable -> L43
            r5 = 0
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L43
            r1.add(r4)     // Catch: java.lang.Throwable -> L43
            goto L28
        L52:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L43
        L56:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L64
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L43
            r0.put(r4)     // Catch: java.lang.Throwable -> L43
            goto L56
        L64:
            r3.close()     // Catch: java.io.IOException -> L67
        L67:
            r2.close()     // Catch: java.io.IOException -> L7c
            goto L7c
        L6b:
            r1 = r3
            goto L72
        L6d:
            r2 = r1
            goto L6b
        L70:
            r2 = r1
        L72:
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.io.IOException -> L78
            goto L79
        L78:
        L79:
            if (r2 == 0) goto L7c
            goto L67
        L7c:
            return r0
    }

    public static boolean a(android.content.Context r2) {
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1f
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto Lc
            return r0
        Lc:
            android.net.Network r1 = androidx.work.impl.constraints.trackers.a.a(r2)     // Catch: java.lang.Throwable -> L1f
            android.net.NetworkCapabilities r2 = r2.getNetworkCapabilities(r1)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1f
            r1 = 4
            boolean r2 = r2.hasTransport(r1)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1f
            r2 = 1
            return r2
        L1f:
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
            java.lang.String r0 = ""
        Le:
            return r0
    }

    public static java.lang.String b(android.content.Context r2) {
            java.lang.String r0 = ""
            org.json.JSONArray r1 = a()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto Ld
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L16
            return r2
        Ld:
            boolean r2 = a(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L16
            java.lang.String r2 = "[\"con\"]"
            return r2
        L16:
            return r0
    }

    public static int c() {
            int r0 = com.kuaishou.weapon.p0.am.c
            return r0
    }

    public static java.lang.String d() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            com.kuaishou.weapon.p0.am.c = r1     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = "AndroidCAStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.lang.Throwable -> Ld1
            if (r1 == 0) goto Lc2
            r2 = 0
            r1.load(r2, r2)     // Catch: java.lang.Throwable -> Ld1
            java.util.Enumeration r2 = r1.aliases()     // Catch: java.lang.Throwable -> Ld1
        L18:
            boolean r3 = r2.hasMoreElements()     // Catch: java.lang.Throwable -> Ld1
            if (r3 == 0) goto Lc2
            int r3 = com.kuaishou.weapon.p0.am.c     // Catch: java.lang.Throwable -> Ld1
            int r3 = r3 + 1
            com.kuaishou.weapon.p0.am.c = r3     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r3 = r2.nextElement()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Ld1
            java.security.cert.Certificate r3 = r1.getCertificate(r3)     // Catch: java.lang.Throwable -> Ld1
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: java.lang.Throwable -> Ld1
            java.security.Principal r4 = r3.getIssuerDN()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "2022"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto Lb0
            java.security.Principal r4 = r3.getIssuerDN()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "2023"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto Lb0
            java.security.Principal r4 = r3.getIssuerDN()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "HttpCanary"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto Lb0
            java.security.Principal r4 = r3.getIssuerDN()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "macbook"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto Lb0
            java.security.Principal r4 = r3.getIssuerDN()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "proxy"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto Lb0
            java.security.Principal r4 = r3.getIssuerDN()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "Proxy"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto Lb0
            java.security.Principal r4 = r3.getIssuerDN()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "local"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto Lb0
            java.security.Principal r4 = r3.getIssuerDN()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "github"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r4 == 0) goto L18
        Lb0:
            java.security.Principal r3 = r3.getIssuerDN()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> Ld1
            r0.append(r3)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r3 = "|"
            r0.append(r3)     // Catch: java.lang.Throwable -> Ld1
            goto L18
        Lc2:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Ld1
            if (r1 <= 0) goto Ld1
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Ld1
            int r1 = r1 + (-1)
            r0.deleteCharAt(r1)     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
