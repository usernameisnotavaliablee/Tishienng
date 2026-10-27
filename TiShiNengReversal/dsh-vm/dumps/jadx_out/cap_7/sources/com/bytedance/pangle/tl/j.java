package com.bytedance.pangle.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private static final java.util.concurrent.atomic.AtomicReference<byte[]> j = null;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.bytedance.pangle.tl.j.j = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.pangle.tl.az j(java.lang.String r14, boolean r15) throws com.bytedance.pangle.tl.i {
            java.lang.String r1 = "Failed to collect certificates from "
            java.lang.String r0 = "AndroidManifest.xml"
            r2 = 4
            r3 = 0
            java.util.jar.JarFile r4 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L103 java.lang.RuntimeException -> L106 java.io.IOException -> L109 java.security.GeneralSecurityException -> L10b
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L103 java.lang.RuntimeException -> L106 java.io.IOException -> L109 java.security.GeneralSecurityException -> L10b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r3.<init>()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.util.jar.JarEntry r5 = r4.getJarEntry(r0)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r6 = "Package "
            if (r5 == 0) goto Leb
            java.security.cert.Certificate[][] r5 = j(r4, r5)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            boolean r7 = com.bytedance.pangle.util.r.j(r5)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            if (r7 != 0) goto Ld4
            android.content.pm.Signature[] r9 = com.bytedance.pangle.tl.r.j(r5)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            if (r15 == 0) goto Lc7
            java.util.Enumeration r15 = r4.entries()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
        L2c:
            boolean r5 = r15.hasMoreElements()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            if (r5 == 0) goto L65
            java.lang.Object r5 = r15.nextElement()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.util.jar.JarEntry r5 = (java.util.jar.JarEntry) r5     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            boolean r7 = r5.isDirectory()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            if (r7 != 0) goto L2c
            java.lang.String r7 = r5.getName()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r8 = "META-INF/"
            boolean r8 = r7.startsWith(r8)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            if (r8 != 0) goto L2c
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            if (r7 != 0) goto L2c
            r3.add(r5)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            goto L2c
        L54:
            r0 = move-exception
            r14 = r0
            r3 = r4
            goto L12b
        L59:
            r0 = move-exception
        L5a:
            r15 = r0
            r3 = r4
            goto L10e
        L5e:
            r0 = move-exception
            goto L5a
        L60:
            r0 = move-exception
            r15 = r0
            r3 = r4
            goto L11c
        L65:
            java.util.Iterator r15 = r3.iterator()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
        L69:
            boolean r0 = r15.hasNext()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r15.next()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.util.jar.JarEntry r0 = (java.util.jar.JarEntry) r0     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.security.cert.Certificate[][] r3 = j(r4, r0)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            boolean r5 = com.bytedance.pangle.util.r.j(r3)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            if (r5 != 0) goto La9
            android.content.pm.Signature[] r3 = com.bytedance.pangle.tl.r.j(r3)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            boolean r3 = com.bytedance.pangle.tl.az.j(r9, r3)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            if (r3 == 0) goto L8a
            goto L69
        L8a:
            com.bytedance.pangle.tl.i r15 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r3.append(r14)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r5 = " has mismatched certificates at entry "
            r3.append(r5)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r3.append(r0)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r3 = 3
            r15.<init>(r3, r0)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            throw r15     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
        La9:
            com.bytedance.pangle.tl.i r15 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r3.append(r14)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r5 = " has no certificates at entry "
            r3.append(r5)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r3.append(r0)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r15.<init>(r2, r0)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            throw r15     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
        Lc7:
            com.bytedance.pangle.tl.az r8 = new com.bytedance.pangle.tl.az     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r12 = 0
            r13 = 0
            r10 = 1
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r4.close()     // Catch: java.lang.Exception -> Ld3
        Ld3:
            return r8
        Ld4:
            com.bytedance.pangle.tl.i r15 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r0.append(r14)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r3 = " has no certificates at entry AndroidManifest.xml"
            r0.append(r3)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r15.<init>(r2, r0)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            throw r15     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
        Leb:
            com.bytedance.pangle.tl.i r15 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r0.append(r14)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r3 = " has no manifest"
            r0.append(r3)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            r3 = 1
            r15.<init>(r3, r0)     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
            throw r15     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e java.security.GeneralSecurityException -> L60
        L103:
            r0 = move-exception
            r14 = r0
            goto L12b
        L106:
            r0 = move-exception
        L107:
            r15 = r0
            goto L10e
        L109:
            r0 = move-exception
            goto L107
        L10b:
            r0 = move-exception
            r15 = r0
            goto L11c
        L10e:
            com.bytedance.pangle.tl.i r0 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L103
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L103
            java.lang.String r14 = r1.concat(r14)     // Catch: java.lang.Throwable -> L103
            r0.<init>(r2, r14, r15)     // Catch: java.lang.Throwable -> L103
            throw r0     // Catch: java.lang.Throwable -> L103
        L11c:
            com.bytedance.pangle.tl.i r0 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L103
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L103
            java.lang.String r14 = r1.concat(r14)     // Catch: java.lang.Throwable -> L103
            r1 = 2
            r0.<init>(r1, r14, r15)     // Catch: java.lang.Throwable -> L103
            throw r0     // Catch: java.lang.Throwable -> L103
        L12b:
            if (r3 == 0) goto L130
            r3.close()     // Catch: java.lang.Exception -> L130
        L130:
            throw r14
    }

    private static void j(java.io.InputStream r3) throws java.io.IOException {
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = com.bytedance.pangle.tl.j.j
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto Lf
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
        Lf:
            r1 = 0
            int r2 = r0.length
            int r1 = r3.read(r0, r1, r2)
            r2 = -1
            if (r1 != r2) goto Lf
            java.util.concurrent.atomic.AtomicReference<byte[]> r3 = com.bytedance.pangle.tl.j.j
            r3.set(r0)
            return
    }

    private static java.security.cert.Certificate[][] j(java.util.jar.JarFile r5, java.util.jar.JarEntry r6) throws com.bytedance.pangle.tl.i {
            r0 = 0
            java.io.InputStream r0 = r5.getInputStream(r6)     // Catch: java.lang.Throwable -> L1b java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            j(r0)     // Catch: java.lang.Throwable -> L1b java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            java.security.cert.Certificate[] r1 = r6.getCertificates()     // Catch: java.lang.Throwable -> L1b java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            r2 = 1
            java.security.cert.Certificate[][] r2 = new java.security.cert.Certificate[r2][]     // Catch: java.lang.Throwable -> L1b java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Throwable -> L1b java.lang.RuntimeException -> L1d java.io.IOException -> L1f
            if (r0 == 0) goto L1a
            r0.close()     // Catch: java.lang.Exception -> L17 java.lang.RuntimeException -> L18
        L17:
            return r2
        L18:
            r5 = move-exception
            throw r5
        L1a:
            return r2
        L1b:
            r5 = move-exception
            goto L41
        L1d:
            r1 = move-exception
            goto L20
        L1f:
            r1 = move-exception
        L20:
            com.bytedance.pangle.tl.i r2 = new com.bytedance.pangle.tl.i     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "Failed reading "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L1b
            r3.append(r6)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = " in "
            r3.append(r6)     // Catch: java.lang.Throwable -> L1b
            r3.append(r5)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L1b
            r6 = 5
            r2.<init>(r6, r5, r1)     // Catch: java.lang.Throwable -> L1b
            throw r2     // Catch: java.lang.Throwable -> L1b
        L41:
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.lang.RuntimeException -> L47 java.lang.Exception -> L49
            goto L49
        L47:
            r5 = move-exception
            throw r5
        L49:
            throw r5
    }
}
