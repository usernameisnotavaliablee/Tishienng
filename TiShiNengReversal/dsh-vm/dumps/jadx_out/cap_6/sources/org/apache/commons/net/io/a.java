package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a extends java.io.BufferedReader {
    private static final char a = '\n';
    private static final char b = '\r';

    public a(java.io.Reader r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.io.BufferedReader
    public java.lang.String readLine() throws java.io.IOException {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r6.lock
            monitor-enter(r1)
            r2 = 0
            r3 = 0
        La:
            int r4 = r6.read()     // Catch: java.lang.Throwable -> L23
            r5 = -1
            if (r4 == r5) goto L31
            r5 = 1
            if (r3 == 0) goto L25
            r3 = 10
            if (r4 != r3) goto L25
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L23
            int r3 = r3 - r5
            java.lang.String r0 = r0.substring(r2, r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            return r0
        L23:
            r0 = move-exception
            goto L3e
        L25:
            r3 = 13
            if (r4 != r3) goto L2b
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L23
            r0.append(r4)     // Catch: java.lang.Throwable -> L23
            goto La
        L31:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 != 0) goto L3d
            r0 = 0
        L3d:
            return r0
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r0
    }
}
