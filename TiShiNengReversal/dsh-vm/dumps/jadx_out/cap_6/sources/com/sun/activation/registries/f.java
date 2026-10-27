package com.sun.activation.registries;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    private java.lang.String a;
    private java.util.Hashtable b;

    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.b = r0
            return
    }

    public f(java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r3.b = r0
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "iso-8859-1"
            r1.<init>(r4, r2)
            r0.<init>(r1)
            r3.d(r0)
            return
    }

    public f(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.b = r0
            r1.a = r2
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r1.a
            r2.<init>(r0)
            java.io.FileReader r0 = new java.io.FileReader
            r0.<init>(r2)
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L27
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L27
            r1.d(r2)     // Catch: java.lang.Throwable -> L27
            r0.close()     // Catch: java.io.IOException -> L26
        L26:
            return
        L27:
            r2 = move-exception
            r0.close()     // Catch: java.io.IOException -> L2b
        L2b:
            throw r2
    }

    private void d(java.io.BufferedReader r6) throws java.io.IOException {
            r5 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            java.lang.String r2 = r6.readLine()
            if (r2 != 0) goto Le
            if (r1 == 0) goto Ld
            r5.e(r1)
        Ld:
            return
        Le:
            if (r1 != 0) goto L11
            goto L1d
        L11:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L1d:
            int r1 = r2.length()
            int r3 = r2.length()
            if (r3 <= 0) goto L37
            int r1 = r1 + (-1)
            char r3 = r2.charAt(r1)
            r4 = 92
            if (r3 != r4) goto L37
            r3 = 0
            java.lang.String r1 = r2.substring(r3, r1)
            goto L2
        L37:
            r5.e(r2)
            goto L1
    }

    private void e(java.lang.String r9) {
            r8 = this;
            java.lang.String r9 = r9.trim()
            int r0 = r9.length()
            if (r0 != 0) goto Lc
            goto Lca
        Lc:
            r0 = 0
            char r0 = r9.charAt(r0)
            r1 = 35
            if (r0 != r1) goto L17
            goto Lca
        L17:
            r0 = 61
            int r0 = r9.indexOf(r0)
            java.lang.String r1 = "Added: "
            if (r0 <= 0) goto Lb4
            com.sun.activation.registries.a r0 = new com.sun.activation.registries.a
            r0.<init>(r9)
            r2 = 0
            r3 = r2
        L28:
            boolean r4 = r0.a()
            if (r4 != 0) goto L30
            goto Lca
        L30:
            java.lang.String r4 = r0.b()
            boolean r5 = r0.a()
            if (r5 == 0) goto L51
            java.lang.String r5 = r0.b()
            java.lang.String r6 = "="
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L51
            boolean r5 = r0.a()
            if (r5 == 0) goto L51
            java.lang.String r5 = r0.b()
            goto L52
        L51:
            r5 = r2
        L52:
            if (r5 != 0) goto L6c
            boolean r0 = com.sun.activation.registries.b.a()
            if (r0 == 0) goto Lca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bad .mime.types entry: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.sun.activation.registries.b.b(r9)
            return
        L6c:
            java.lang.String r6 = "type"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L76
            r3 = r5
            goto L28
        L76:
            java.lang.String r6 = "exts"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L28
            java.util.StringTokenizer r4 = new java.util.StringTokenizer
            java.lang.String r6 = ","
            r4.<init>(r5, r6)
        L85:
            boolean r5 = r4.hasMoreTokens()
            if (r5 != 0) goto L8c
            goto L28
        L8c:
            java.lang.String r5 = r4.nextToken()
            com.sun.activation.registries.e r6 = new com.sun.activation.registries.e
            r6.<init>(r3, r5)
            java.util.Hashtable r7 = r8.b
            r7.put(r5, r6)
            boolean r5 = com.sun.activation.registries.b.a()
            if (r5 == 0) goto L85
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.sun.activation.registries.b.b(r5)
            goto L85
        Lb4:
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r0.<init>(r9)
            int r9 = r0.countTokens()
            if (r9 != 0) goto Lc0
            goto Lca
        Lc0:
            java.lang.String r9 = r0.nextToken()
        Lc4:
            boolean r2 = r0.hasMoreTokens()
            if (r2 != 0) goto Lcb
        Lca:
            return
        Lcb:
            java.lang.String r2 = r0.nextToken()
            com.sun.activation.registries.e r3 = new com.sun.activation.registries.e
            r3.<init>(r9, r2)
            java.util.Hashtable r4 = r8.b
            r4.put(r2, r3)
            boolean r2 = com.sun.activation.registries.b.a()
            if (r2 == 0) goto Lc4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.sun.activation.registries.b.b(r2)
            goto Lc4
    }

    public void a(java.lang.String r3) {
            r2 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> Ld
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.io.IOException -> Ld
            r1.<init>(r3)     // Catch: java.io.IOException -> Ld
            r0.<init>(r1)     // Catch: java.io.IOException -> Ld
            r2.d(r0)     // Catch: java.io.IOException -> Ld
        Ld:
            return
    }

    public java.lang.String b(java.lang.String r1) {
            r0 = this;
            com.sun.activation.registries.e r1 = r0.c(r1)
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.b()
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public com.sun.activation.registries.e c(java.lang.String r2) {
            r1 = this;
            java.util.Hashtable r0 = r1.b
            java.lang.Object r2 = r0.get(r2)
            com.sun.activation.registries.e r2 = (com.sun.activation.registries.e) r2
            return r2
    }
}
