package org.junit.internal.runners.statements;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.junit.runners.model.h {
    private final org.junit.runners.model.h a;
    private final java.lang.Class<? extends java.lang.Throwable> b;

    public a(org.junit.runners.model.h r1, java.lang.Class<? extends java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // org.junit.runners.model.h
    public void a() throws java.lang.Exception {
            r3 = this;
            org.junit.runners.model.h r0 = r3.a     // Catch: java.lang.Throwable -> L22 org.junit.internal.AssumptionViolatedException -> L24
            r0.a()     // Catch: java.lang.Throwable -> L22 org.junit.internal.AssumptionViolatedException -> L24
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected exception: "
            r1.append(r2)
            java.lang.Class<? extends java.lang.Throwable> r2 = r3.b
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L22:
            r0 = move-exception
            goto L26
        L24:
            r0 = move-exception
            goto L65
        L26:
            java.lang.Class<? extends java.lang.Throwable> r1 = r3.b
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L33
            return
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected exception, expected<"
            r1.append(r2)
            java.lang.Class<? extends java.lang.Throwable> r2 = r3.b
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = "> but was<"
            r1.append(r2)
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ">"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r1, r0)
            throw r2
        L65:
            throw r0
    }
}
