package com.tencent.open.log;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f implements java.lang.Iterable<java.lang.String> {
    private java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> a;
    private java.util.concurrent.atomic.AtomicInteger b;

    public f() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.b = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r2.a = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.b = r0
            return
    }

    public int a() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.b
            int r0 = r0.get()
            return r0
    }

    public int a(java.lang.String r3) {
            r2 = this;
            int r0 = r3.length()
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r1 = r2.a
            r1.add(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = r2.b
            int r3 = r3.addAndGet(r0)
            return r3
    }

    public void a(java.io.Writer r11, char[] r12) throws java.io.IOException {
            r10 = this;
            if (r11 == 0) goto L45
            if (r12 == 0) goto L45
            int r0 = r12.length
            if (r0 != 0) goto L8
            goto L45
        L8:
            int r0 = r12.length
            java.util.Iterator r1 = r10.iterator()
            r2 = 0
            r4 = r0
            r3 = 0
        L10:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.length()
            r7 = 0
        L21:
            if (r6 <= 0) goto L10
            if (r4 <= r6) goto L27
            r8 = r6
            goto L28
        L27:
            r8 = r4
        L28:
            int r9 = r7 + r8
            r5.getChars(r7, r9, r12, r3)
            int r4 = r4 - r8
            int r3 = r3 + r8
            int r6 = r6 - r8
            if (r4 != 0) goto L3b
            r11.write(r12, r2, r0)     // Catch: java.lang.Exception -> L36
            goto L37
        L36:
        L37:
            r4 = r0
            r7 = r9
            r3 = 0
            goto L21
        L3b:
            r7 = r9
            goto L21
        L3d:
            if (r3 <= 0) goto L42
            r11.write(r12, r2, r3)     // Catch: java.lang.Exception -> L42
        L42:
            r11.flush()     // Catch: java.lang.Exception -> L45
        L45:
            return
    }

    public void b() {
            r2 = this;
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r2.a
            r0.clear()
            java.util.concurrent.atomic.AtomicInteger r0 = r2.b
            r1 = 0
            r0.set(r1)
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r1.a
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
