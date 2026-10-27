package com.ss.android.socialbase.appdownloader.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class tl extends java.lang.Exception {
    protected int cw;
    protected java.lang.Throwable j;
    protected int xt;

    public tl(java.lang.String r4, com.ss.android.socialbase.appdownloader.m.j.a r5, java.lang.Throwable r6) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            if (r4 != 0) goto Lb
            r4 = r1
            goto L1c
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " "
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L1c:
            r0.append(r4)
            if (r5 != 0) goto L23
            r4 = r1
            goto L3a
        L23:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "(position:"
            r4.<init>(r2)
            java.lang.String r2 = r5.r()
            r4.append(r2)
            java.lang.String r2 = ") "
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L3a:
            r0.append(r4)
            if (r6 != 0) goto L40
            goto L4e
        L40:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "caused by: "
            r4.<init>(r1)
            r4.append(r6)
            java.lang.String r1 = r4.toString()
        L4e:
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            r4 = -1
            r3.xt = r4
            r3.cw = r4
            if (r5 == 0) goto L6b
            int r4 = r5.cw()
            r3.xt = r4
            int r4 = r5.m()
            r3.cw = r4
        L6b:
            r3.j = r6
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
            r2 = this;
            java.lang.Throwable r0 = r2.j
            if (r0 != 0) goto L5
            return
        L5:
            java.io.PrintStream r0 = java.lang.System.err
            monitor-enter(r0)
            java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L17
            super.getMessage()     // Catch: java.lang.Throwable -> L17
            r1.getClass()     // Catch: java.lang.Throwable -> L17
            java.lang.Throwable r1 = r2.j     // Catch: java.lang.Throwable -> L17
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }
}
