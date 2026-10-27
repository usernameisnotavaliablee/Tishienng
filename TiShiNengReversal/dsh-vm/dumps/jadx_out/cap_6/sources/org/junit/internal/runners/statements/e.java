package org.junit.internal.runners.statements;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e extends org.junit.runners.model.h {
    private final org.junit.runners.model.h a;
    private final java.lang.Object b;
    private final java.util.List<org.junit.runners.model.d> c;

    public e(org.junit.runners.model.h r1, java.util.List<org.junit.runners.model.d> r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.b = r3
            return
    }

    @Override // org.junit.runners.model.h
    public void a() throws java.lang.Throwable {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            org.junit.runners.model.h r2 = r7.a     // Catch: java.lang.Throwable -> L2a
            r2.a()     // Catch: java.lang.Throwable -> L2a
            java.util.List<org.junit.runners.model.d> r2 = r7.c
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()
            org.junit.runners.model.d r3 = (org.junit.runners.model.d) r3
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L25
            r3.l(r4, r5)     // Catch: java.lang.Throwable -> L25
            goto L11
        L25:
            r3 = move-exception
            r0.add(r3)
            goto L11
        L2a:
            r2 = move-exception
            r0.add(r2)     // Catch: java.lang.Throwable -> L51
            java.util.List<org.junit.runners.model.d> r2 = r7.c
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()
            org.junit.runners.model.d r3 = (org.junit.runners.model.d) r3
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L48
            r3.l(r4, r5)     // Catch: java.lang.Throwable -> L48
            goto L34
        L48:
            r3 = move-exception
            r0.add(r3)
            goto L34
        L4d:
            org.junit.runners.model.MultipleFailureException.assertEmpty(r0)
            return
        L51:
            r2 = move-exception
            java.util.List<org.junit.runners.model.d> r3 = r7.c
            java.util.Iterator r3 = r3.iterator()
        L58:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r3.next()
            org.junit.runners.model.d r4 = (org.junit.runners.model.d) r4
            java.lang.Object r5 = r7.b     // Catch: java.lang.Throwable -> L6c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L6c
            r4.l(r5, r6)     // Catch: java.lang.Throwable -> L6c
            goto L58
        L6c:
            r4 = move-exception
            r0.add(r4)
            goto L58
        L71:
            throw r2
    }
}
