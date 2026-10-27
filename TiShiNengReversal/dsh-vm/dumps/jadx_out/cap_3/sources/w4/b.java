package w4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class b {
    private java.util.Hashtable<java.lang.String, w4.b> a;
    private java.lang.String b;
    private w4.b c;

    public b() {
            r1 = this;
            r1.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.a = r0
            return
    }

    public w4.b a(java.lang.String r2) {
            r1 = this;
            java.util.Hashtable<java.lang.String, w4.b> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            w4.b r2 = (w4.b) r2
            return r2
    }

    public w4.b b() {
            r1 = this;
            w4.b r0 = r1.c
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public synchronized void d(java.io.InputStream r6) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3f
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L3a
        Lc:
            java.lang.String r0 = r6.readLine()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            java.lang.String r2 = " "
            java.lang.String[] r0 = r0.split(r2)     // Catch: java.lang.Throwable -> L2e
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2e
            r3 = 2
            if (r2 == r3) goto L1d
            goto Lc
        L1d:
            w4.b r2 = new w4.b     // Catch: java.lang.Throwable -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2e
            r3 = 1
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L2e
            r2.b = r3     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L2e
            r5.g(r0, r2)     // Catch: java.lang.Throwable -> L2e
            goto Lc
        L2e:
            r0 = move-exception
            goto L43
        L30:
            r1.close()     // Catch: java.lang.Throwable -> L38
            r6.close()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r5)
            return
        L38:
            r6 = move-exception
            goto L4e
        L3a:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L43
        L3f:
            r6 = move-exception
            r1 = r0
            r0 = r6
            r6 = r1
        L43:
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.lang.Throwable -> L38
        L48:
            if (r6 == 0) goto L4d
            r6.close()     // Catch: java.lang.Throwable -> L38
        L4d:
            throw r0     // Catch: java.lang.Throwable -> L38
        L4e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            throw r6
    }

    public synchronized void e(java.io.InputStream r11) throws java.io.IOException {
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L8b
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L86
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L86
        Lc:
            java.lang.String r0 = r11.readLine()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L7c
            java.lang.String r2 = " "
            java.lang.String[] r0 = r0.split(r2)     // Catch: java.lang.Throwable -> L48
            int r2 = r0.length     // Catch: java.lang.Throwable -> L48
            r3 = 2
            if (r2 == r3) goto L1d
            goto Lc
        L1d:
            r2 = 0
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L48
            r4 = 1
            r0 = r0[r4]     // Catch: java.lang.Throwable -> L48
            char[] r3 = r3.toCharArray()     // Catch: java.lang.Throwable -> L48
            r5 = r10
        L28:
            int r6 = r3.length     // Catch: java.lang.Throwable -> L48
            if (r2 >= r6) goto Lc
            char r6 = r3[r2]     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.toUpperCase()     // Catch: java.lang.Throwable -> L48
            w4.b r7 = r5.a(r6)     // Catch: java.lang.Throwable -> L48
            if (r7 != 0) goto L4a
            w4.b r7 = new w4.b     // Catch: java.lang.Throwable -> L48
            r7.<init>()     // Catch: java.lang.Throwable -> L48
            r5.g(r6, r7)     // Catch: java.lang.Throwable -> L48
            w4.b r7 = r5.a(r6)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r0 = move-exception
            goto L8f
        L4a:
            w4.b r6 = r7.b()     // Catch: java.lang.Throwable -> L48
            int r8 = r3.length     // Catch: java.lang.Throwable -> L48
            int r8 = r8 - r4
            if (r8 != r2) goto L55
            r7.b = r0     // Catch: java.lang.Throwable -> L48
            goto Lc
        L55:
            if (r6 != 0) goto L78
            int r6 = r3.length     // Catch: java.lang.Throwable -> L48
            int r6 = r6 - r4
            if (r6 == r2) goto L79
            w4.b r5 = new w4.b     // Catch: java.lang.Throwable -> L48
            r5.<init>()     // Catch: java.lang.Throwable -> L48
            r7.h(r5)     // Catch: java.lang.Throwable -> L48
            int r6 = r2 + 1
            char r6 = r3[r6]     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.toUpperCase()     // Catch: java.lang.Throwable -> L48
            w4.b r7 = new w4.b     // Catch: java.lang.Throwable -> L48
            r7.<init>()     // Catch: java.lang.Throwable -> L48
            r5.g(r6, r7)     // Catch: java.lang.Throwable -> L48
            goto L79
        L78:
            r5 = r6
        L79:
            int r2 = r2 + 1
            goto L28
        L7c:
            r1.close()     // Catch: java.lang.Throwable -> L84
            r11.close()     // Catch: java.lang.Throwable -> L84
            monitor-exit(r10)
            return
        L84:
            r11 = move-exception
            goto L9a
        L86:
            r11 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto L8f
        L8b:
            r11 = move-exception
            r1 = r0
            r0 = r11
            r11 = r1
        L8f:
            if (r1 == 0) goto L94
            r1.close()     // Catch: java.lang.Throwable -> L84
        L94:
            if (r11 == 0) goto L99
            r11.close()     // Catch: java.lang.Throwable -> L84
        L99:
            throw r0     // Catch: java.lang.Throwable -> L84
        L9a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            throw r11
    }

    public void f() throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = w4.a.a
            if (r0 == 0) goto L17
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L17
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            r2.e(r0)
        L17:
            return
    }

    public void g(java.lang.String r2, w4.b r3) {
            r1 = this;
            java.util.Hashtable<java.lang.String, w4.b> r0 = r1.a
            r0.put(r2, r3)
            return
    }

    public void h(w4.b r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void i(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
