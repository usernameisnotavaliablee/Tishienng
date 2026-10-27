package org.junit.experimental.theories.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ParameterizedAssertionError extends java.lang.AssertionError {
    private static final long serialVersionUID = 1;

    public ParameterizedAssertionError(java.lang.Throwable r3, java.lang.String r4, java.lang.Object... r5) {
            r2 = this;
            java.lang.String r0 = ", "
            java.lang.String r5 = join(r0, r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r4 = "%s(%s)"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r2.<init>(r4)
            r2.initCause(r3)
            return
    }

    public static java.lang.String join(java.lang.String r2, java.util.Collection<java.lang.Object> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = stringValueOf(r1)
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L9
            r0.append(r2)
            goto L9
        L24:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String join(java.lang.String r0, java.lang.Object... r1) {
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r0 = join(r0, r1)
            return r0
    }

    private static java.lang.String stringValueOf(java.lang.Object r0) {
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = "[toString failed]"
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.junit.experimental.theories.internal.ParameterizedAssertionError
            if (r0 == 0) goto L14
            java.lang.String r0 = r1.toString()
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            int r0 = r0.hashCode()
            return r0
    }
}
