package org.junit.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private int b(java.lang.Object r3, java.lang.Object r4, java.lang.String r5) {
            r2 = this;
            if (r3 != 0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "expected array was null"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.junit.a.d0(r0)
        L16:
            if (r4 != 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "actual array was null"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.junit.a.d0(r0)
        L2c:
            int r4 = java.lang.reflect.Array.getLength(r4)
            int r3 = java.lang.reflect.Array.getLength(r3)
            if (r4 == r3) goto L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "array lengths differed, expected.length="
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = " actual.length="
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            org.junit.a.d0(r4)
        L55:
            return r3
    }

    private boolean d(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto Le
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public void a(java.lang.String r7, java.lang.Object r8, java.lang.Object r9) throws org.junit.internal.ArrayComparisonFailure {
            r6 = this;
            if (r8 == r9) goto L59
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r9
            boolean r0 = java.util.Arrays.deepEquals(r1, r0)
            if (r0 == 0) goto L13
            goto L59
        L13:
            if (r7 != 0) goto L18
            java.lang.String r0 = ""
            goto L29
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L29:
            int r1 = r6.b(r8, r9, r0)
        L2d:
            if (r2 >= r1) goto L59
            java.lang.Object r3 = java.lang.reflect.Array.get(r8, r2)
            java.lang.Object r4 = java.lang.reflect.Array.get(r9, r2)
            boolean r5 = r6.d(r3)
            if (r5 == 0) goto L4c
            boolean r5 = r6.d(r4)
            if (r5 == 0) goto L4c
            r6.a(r7, r3, r4)     // Catch: org.junit.internal.ArrayComparisonFailure -> L47
            goto L4f
        L47:
            r7 = move-exception
            r7.addDimension(r2)
            throw r7
        L4c:
            r6.c(r3, r4)     // Catch: java.lang.AssertionError -> L52
        L4f:
            int r2 = r2 + 1
            goto L2d
        L52:
            r7 = move-exception
            org.junit.internal.ArrayComparisonFailure r8 = new org.junit.internal.ArrayComparisonFailure
            r8.<init>(r0, r7, r2)
            throw r8
        L59:
            return
    }

    protected abstract void c(java.lang.Object r1, java.lang.Object r2);
}
