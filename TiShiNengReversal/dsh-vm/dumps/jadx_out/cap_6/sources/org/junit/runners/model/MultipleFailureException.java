package org.junit.runners.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MultipleFailureException extends java.lang.Exception {
    private static final long serialVersionUID = 1;
    private final java.util.List<java.lang.Throwable> fErrors;

    public MultipleFailureException(java.util.List<java.lang.Throwable> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.fErrors = r0
            return
    }

    public static void assertEmpty(java.util.List<java.lang.Throwable> r2) throws java.lang.Exception {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Exception r2 = org.junit.internal.i.b(r2)
            throw r2
        L1a:
            org.junit.internal.runners.model.MultipleFailureException r0 = new org.junit.internal.runners.model.MultipleFailureException
            r0.<init>(r2)
            throw r0
    }

    public java.util.List<java.lang.Throwable> getFailures() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.fErrors
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.util.List<java.lang.Throwable> r1 = r7.fErrors
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "There were %d errors:"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            java.util.List<java.lang.Throwable> r1 = r7.fErrors
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r1.next()
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r3 = r3.getMessage()
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r5
            r6[r2] = r3
            java.lang.String r3 = "\n  %s(%s)"
            java.lang.String r3 = java.lang.String.format(r3, r6)
            r0.append(r3)
            goto L21
        L4a:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
