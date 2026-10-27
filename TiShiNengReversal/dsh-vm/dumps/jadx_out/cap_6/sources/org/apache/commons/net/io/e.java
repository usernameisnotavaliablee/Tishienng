package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class e extends java.io.Writer {
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private int a;
    private java.io.Writer b;

    public e(java.io.Writer r1) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r1
            r1 = 0
            r0.a = r1
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            java.io.Writer r1 = r4.b     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L2f
        Lb:
            int r2 = r4.a     // Catch: java.lang.Throwable -> L9
            r3 = 1
            if (r2 != r3) goto L16
            r2 = 10
            r1.write(r2)     // Catch: java.lang.Throwable -> L9
            goto L1e
        L16:
            r3 = 2
            if (r2 == r3) goto L1e
            java.lang.String r2 = "\r\n"
            r1.write(r2)     // Catch: java.lang.Throwable -> L9
        L1e:
            java.io.Writer r1 = r4.b     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = ".\r\n"
            r1.write(r2)     // Catch: java.lang.Throwable -> L9
            java.io.Writer r1 = r4.b     // Catch: java.lang.Throwable -> L9
            r1.flush()     // Catch: java.lang.Throwable -> L9
            r1 = 0
            r4.b = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            java.io.Writer r1 = r2.b     // Catch: java.lang.Throwable -> La
            r1.flush()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // java.io.Writer
    public void write(int r6) throws java.io.IOException {
            r5 = this;
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            r1 = 1
            r2 = 2
            r3 = 13
            r4 = 10
            if (r6 == r4) goto L31
            if (r6 == r3) goto L28
            r1 = 46
            if (r6 == r1) goto L12
            goto L1e
        L12:
            int r3 = r5.a     // Catch: java.lang.Throwable -> L1c
            if (r3 != r2) goto L1e
            java.io.Writer r2 = r5.b     // Catch: java.lang.Throwable -> L1c
            r2.write(r1)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r6 = move-exception
            goto L43
        L1e:
            r1 = 0
            r5.a = r1     // Catch: java.lang.Throwable -> L1c
            java.io.Writer r1 = r5.b     // Catch: java.lang.Throwable -> L1c
            r1.write(r6)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L28:
            r5.a = r1     // Catch: java.lang.Throwable -> L1c
            java.io.Writer r6 = r5.b     // Catch: java.lang.Throwable -> L1c
            r6.write(r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L31:
            int r6 = r5.a     // Catch: java.lang.Throwable -> L1c
            if (r6 == r1) goto L3a
            java.io.Writer r6 = r5.b     // Catch: java.lang.Throwable -> L1c
            r6.write(r3)     // Catch: java.lang.Throwable -> L1c
        L3a:
            java.io.Writer r6 = r5.b     // Catch: java.lang.Throwable -> L1c
            r6.write(r4)     // Catch: java.lang.Throwable -> L1c
            r5.a = r2     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r6
    }

    @Override // java.io.Writer
    public void write(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            char[] r1 = r1.toCharArray()
            r0.write(r1)
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            char[] r1 = r1.toCharArray()
            r0.write(r1, r2, r3)
            return
    }

    @Override // java.io.Writer
    public void write(char[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.Writer
    public void write(char[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
        L3:
            int r1 = r5 + (-1)
            if (r5 <= 0) goto L13
            int r5 = r4 + 1
            char r4 = r3[r4]     // Catch: java.lang.Throwable -> L11
            r2.write(r4)     // Catch: java.lang.Throwable -> L11
            r4 = r5
            r5 = r1
            goto L3
        L11:
            r3 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }
}
