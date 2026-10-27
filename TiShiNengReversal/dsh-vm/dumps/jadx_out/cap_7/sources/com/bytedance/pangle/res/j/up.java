package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class up extends com.bytedance.pangle.res.j.oq {
    private long j;

    public up(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int j() {
            r5 = this;
            long r0 = r5.xt()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Ld
            int r1 = (int) r0
            return r1
        Ld:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The byte count "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " is too large to be converted to an int"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // com.bytedance.pangle.res.j.oq
    protected synchronized void j(int r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            if (r5 == r0) goto Le
            long r0 = r4.j     // Catch: java.lang.Throwable -> Lb
            long r2 = (long) r5     // Catch: java.lang.Throwable -> Lb
            long r0 = r0 + r2
            r4.j = r0     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb
            throw r5
        Le:
            monitor-exit(r4)
            return
    }

    @Override // com.bytedance.pangle.res.j.oq, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            long r3 = super.skip(r3)     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.j     // Catch: java.lang.Throwable -> Lc
            long r0 = r0 + r3
            r2.j = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r3
        Lc:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public synchronized long xt() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.j     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }
}
