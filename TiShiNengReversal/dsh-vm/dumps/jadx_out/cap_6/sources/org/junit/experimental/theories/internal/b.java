package org.junit.experimental.theories.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private final java.util.List<org.junit.experimental.theories.PotentialAssignment> a;
    private final java.util.List<org.junit.experimental.theories.a> b;
    private final org.junit.runners.model.i c;

    private b(java.util.List<org.junit.experimental.theories.PotentialAssignment> r1, java.util.List<org.junit.experimental.theories.a> r2, org.junit.runners.model.i r3) {
            r0 = this;
            r0.<init>()
            r0.b = r2
            r0.a = r1
            r0.c = r3
            return
    }

    public static org.junit.experimental.theories.internal.b a(java.lang.reflect.Method r2, org.junit.runners.model.i r3) {
            java.lang.reflect.Constructor r0 = r3.l()
            java.util.List r0 = org.junit.experimental.theories.a.n(r0)
            java.util.ArrayList r2 = org.junit.experimental.theories.a.l(r2)
            r0.addAll(r2)
            org.junit.experimental.theories.internal.b r2 = new org.junit.experimental.theories.internal.b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.<init>(r1, r0, r3)
            return r2
    }

    private org.junit.experimental.theories.b c(java.lang.Class<? extends org.junit.experimental.theories.b> r9) throws java.lang.Exception {
            r8 = this;
            java.lang.reflect.Constructor[] r0 = r9.getConstructors()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r1) goto L2d
            r4 = r0[r3]
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r6 = r5.length
            r7 = 1
            if (r6 != r7) goto L2a
            r5 = r5[r2]
            java.lang.Class<org.junit.runners.model.i> r6 = org.junit.runners.model.i.class
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L2a
            org.junit.runners.model.i r9 = r8.c
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r2] = r9
            java.lang.Object r9 = r4.newInstance(r0)
            org.junit.experimental.theories.b r9 = (org.junit.experimental.theories.b) r9
            return r9
        L2a:
            int r3 = r3 + 1
            goto L7
        L2d:
            java.lang.Object r9 = r9.newInstance()
            org.junit.experimental.theories.b r9 = (org.junit.experimental.theories.b) r9
            return r9
    }

    private java.util.List<org.junit.experimental.theories.PotentialAssignment> d(org.junit.experimental.theories.a r3) {
            r2 = this;
            java.lang.Class r0 = r3.getType()
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L14
            org.junit.experimental.theories.internal.d r1 = new org.junit.experimental.theories.internal.d
            r1.<init>(r0)
            java.util.List r3 = r1.a(r3)
            return r3
        L14:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L28
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L28
        L25:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
        L28:
            org.junit.experimental.theories.internal.c r0 = new org.junit.experimental.theories.internal.c
            r0.<init>()
            java.util.List r3 = r0.a(r3)
            return r3
    }

    private int i() {
            r1 = this;
            org.junit.runners.model.i r0 = r1.c
            java.lang.reflect.Constructor r0 = r0.l()
            java.util.List r0 = org.junit.experimental.theories.a.n(r0)
            int r0 = r0.size()
            return r0
    }

    private org.junit.experimental.theories.b k(org.junit.experimental.theories.a r2) throws java.lang.Exception {
            r1 = this;
            java.lang.Class<org.junit.experimental.theories.ParametersSuppliedBy> r0 = org.junit.experimental.theories.ParametersSuppliedBy.class
            java.lang.annotation.Annotation r2 = r2.e(r0)
            org.junit.experimental.theories.ParametersSuppliedBy r2 = (org.junit.experimental.theories.ParametersSuppliedBy) r2
            if (r2 == 0) goto L13
            java.lang.Class r2 = r2.value()
            org.junit.experimental.theories.b r2 = r1.c(r2)
            return r2
        L13:
            org.junit.experimental.theories.internal.a r2 = new org.junit.experimental.theories.internal.a
            org.junit.runners.model.i r0 = r1.c
            r2.<init>(r0)
            return r2
    }

    public org.junit.experimental.theories.internal.b b(org.junit.experimental.theories.PotentialAssignment r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.junit.experimental.theories.PotentialAssignment> r1 = r4.a
            r0.<init>(r1)
            r0.add(r5)
            org.junit.experimental.theories.internal.b r5 = new org.junit.experimental.theories.internal.b
            java.util.List<org.junit.experimental.theories.a> r1 = r4.b
            r2 = 1
            int r3 = r1.size()
            java.util.List r1 = r1.subList(r2, r3)
            org.junit.runners.model.i r2 = r4.c
            r5.<init>(r0, r1, r2)
            return r5
    }

    public java.lang.Object[] e(int r5, int r6) throws org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException {
            r4 = this;
            int r0 = r6 - r5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r5
        L5:
            if (r1 >= r6) goto L1a
            int r2 = r1 - r5
            java.util.List<org.junit.experimental.theories.PotentialAssignment> r3 = r4.a
            java.lang.Object r3 = r3.get(r1)
            org.junit.experimental.theories.PotentialAssignment r3 = (org.junit.experimental.theories.PotentialAssignment) r3
            java.lang.Object r3 = r3.c()
            r0[r2] = r3
            int r1 = r1 + 1
            goto L5
        L1a:
            return r0
    }

    public java.lang.Object[] f() throws org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException {
            r2 = this;
            java.util.List<org.junit.experimental.theories.PotentialAssignment> r0 = r2.a
            int r0 = r0.size()
            r1 = 0
            java.lang.Object[] r0 = r2.e(r1, r0)
            return r0
    }

    public java.lang.Object[] g(boolean r4) throws org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException {
            r3 = this;
            java.util.List<org.junit.experimental.theories.PotentialAssignment> r4 = r3.a
            int r4 = r4.size()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1 = 0
        L9:
            if (r1 >= r4) goto L1c
            java.util.List<org.junit.experimental.theories.PotentialAssignment> r2 = r3.a
            java.lang.Object r2 = r2.get(r1)
            org.junit.experimental.theories.PotentialAssignment r2 = (org.junit.experimental.theories.PotentialAssignment) r2
            java.lang.String r2 = r2.b()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L9
        L1c:
            return r0
    }

    public java.lang.Object[] h() throws org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException {
            r2 = this;
            r0 = 0
            int r1 = r2.i()
            java.lang.Object[] r0 = r2.e(r0, r1)
            return r0
    }

    public java.lang.Object[] j() throws org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException {
            r2 = this;
            int r0 = r2.i()
            java.util.List<org.junit.experimental.theories.PotentialAssignment> r1 = r2.a
            int r1 = r1.size()
            java.lang.Object[] r0 = r2.e(r0, r1)
            return r0
    }

    public boolean l() {
            r1 = this;
            java.util.List<org.junit.experimental.theories.a> r0 = r1.b
            int r0 = r0.size()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public org.junit.experimental.theories.a m() {
            r2 = this;
            java.util.List<org.junit.experimental.theories.a> r0 = r2.b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.junit.experimental.theories.a r0 = (org.junit.experimental.theories.a) r0
            return r0
    }

    public java.util.List<org.junit.experimental.theories.PotentialAssignment> n() throws java.lang.Throwable {
            r3 = this;
            org.junit.experimental.theories.a r0 = r3.m()
            org.junit.experimental.theories.b r1 = r3.k(r0)
            java.util.List r1 = r1.a(r0)
            int r2 = r1.size()
            if (r2 != 0) goto L17
            java.util.List r0 = r3.d(r0)
            return r0
        L17:
            return r1
    }
}
