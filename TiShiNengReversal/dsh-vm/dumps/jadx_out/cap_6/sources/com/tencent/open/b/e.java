package com.tencent.open.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    protected static com.tencent.open.b.e a;

    protected e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.tencent.open.b.e a() {
            java.lang.Class<com.tencent.open.b.e> r0 = com.tencent.open.b.e.class
            monitor-enter(r0)
            com.tencent.open.b.e r1 = com.tencent.open.b.e.a     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.tencent.open.b.e r1 = new com.tencent.open.b.e     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.tencent.open.b.e.a = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.tencent.open.b.e r1 = com.tencent.open.b.e.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public void a(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Long r6, int r7, int r8, java.lang.String r9) {
            r0 = this;
            return
    }

    public void a(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r1 = this;
            r0 = r6
            r6 = r3
            r3 = r4
            r4 = r5
            r5 = r0
            android.os.Bundle r2 = com.tencent.open.utils.m.a(r2, r3, r4, r5, r6, r7)
            com.tencent.open.b.h r3 = com.tencent.open.b.h.a()
            r4 = 1
            r3.a(r2, r6, r4)
            return
    }

    public void a(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            r12 = this;
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r6 = ""
            java.lang.String r9 = ""
            r0 = r13
            r4 = r14
            r3 = r15
            r1 = r16
            r2 = r17
            r5 = r18
            r7 = r19
            r8 = r20
            android.os.Bundle r13 = com.tencent.open.utils.m.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.open.b.h r15 = com.tencent.open.b.h.a()
            r0 = 0
            r15.a(r13, r14, r0)
            return
    }

    public void a(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
            r12 = this;
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r0 = r13
            r4 = r14
            r3 = r15
            r1 = r16
            r2 = r17
            r5 = r18
            r6 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            android.os.Bundle r13 = com.tencent.open.utils.m.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.open.b.h r15 = com.tencent.open.b.h.a()
            r0 = 0
            r15.a(r13, r14, r0)
            return
    }
}
