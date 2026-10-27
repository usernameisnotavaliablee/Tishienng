package org.junit.runners.parameterized;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    private final java.lang.String a;
    private final org.junit.runners.model.i b;
    private final java.util.List<java.lang.Object> c;

    public d(java.lang.String r2, org.junit.runners.model.i r3, java.util.List<java.lang.Object> r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "The name is missing."
            d(r2, r0)
            java.lang.String r0 = "The test class is missing."
            d(r3, r0)
            java.lang.String r0 = "The parameters are missing."
            d(r4, r0)
            r1.a = r2
            r1.b = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.c = r2
            return
    }

    private static void d(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.util.List<java.lang.Object> b() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.c
            return r0
    }

    public org.junit.runners.model.i c() {
            r1 = this;
            org.junit.runners.model.i r0 = r1.b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            org.junit.runners.parameterized.d r5 = (org.junit.runners.parameterized.d) r5
            java.lang.String r2 = r4.a
            java.lang.String r3 = r5.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L34
            java.util.List<java.lang.Object> r2 = r4.c
            java.util.List<java.lang.Object> r3 = r5.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L34
            org.junit.runners.model.i r2 = r4.b
            org.junit.runners.model.i r5 = r5.b
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L34
            return r0
        L34:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 + 14747
            int r0 = r0 * 14747
            org.junit.runners.model.i r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 14747
            java.util.List<java.lang.Object> r1 = r2.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.junit.runners.model.i r1 = r2.b
            java.lang.String r1 = r1.k()
            r0.append(r1)
            java.lang.String r1 = " '"
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "' with parameters "
            r0.append(r1)
            java.util.List<java.lang.Object> r1 = r2.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
