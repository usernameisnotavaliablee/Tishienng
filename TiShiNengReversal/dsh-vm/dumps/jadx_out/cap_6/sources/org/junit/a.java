package org.junit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    protected a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void A(java.lang.String r1, long r2, long r4) {
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lf
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            f0(r1, r2, r3)
        Lf:
            return
    }

    public static void B(java.lang.String r1, java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = b0(r2, r3)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L1d
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L1d
            if (r1 != 0) goto L13
            java.lang.String r1 = ""
        L13:
            org.junit.ComparisonFailure r0 = new org.junit.ComparisonFailure
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            r0.<init>(r1, r2, r3)
            throw r0
        L1d:
            f0(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public static void C(java.lang.String r0, java.lang.Object[] r1, java.lang.Object[] r2) {
            g(r0, r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void D(java.lang.Object[] r0, java.lang.Object[] r1) {
            p(r0, r1)
            return
    }

    public static void E(java.lang.String r0, boolean r1) {
            r1 = r1 ^ 1
            Y(r0, r1)
            return
    }

    public static void F(boolean r1) {
            r0 = 0
            E(r0, r1)
            return
    }

    public static void G(double r7, double r9, double r11) {
            r0 = 0
            r1 = r7
            r3 = r9
            r5 = r11
            K(r0, r1, r3, r5)
            return
    }

    public static void H(float r1, float r2, float r3) {
            r0 = 0
            L(r0, r1, r2, r3)
            return
    }

    public static void I(long r1, long r3) {
            r0 = 0
            M(r0, r1, r3)
            return
    }

    public static void J(java.lang.Object r1, java.lang.Object r2) {
            r0 = 0
            N(r0, r1, r2)
            return
    }

    public static void K(java.lang.String r0, double r1, double r3, double r5) {
            boolean r1 = a0(r1, r3, r5)
            if (r1 != 0) goto Ld
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            e0(r0, r1)
        Ld:
            return
    }

    public static void L(java.lang.String r0, float r1, float r2, float r3) {
            boolean r1 = j0(r1, r2, r3)
            if (r1 != 0) goto Ld
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            e0(r0, r1)
        Ld:
            return
    }

    public static void M(java.lang.String r1, long r2, long r4) {
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            e0(r1, r2)
        Lb:
            return
    }

    public static void N(java.lang.String r0, java.lang.Object r1, java.lang.Object r2) {
            boolean r1 = b0(r1, r2)
            if (r1 == 0) goto L9
            e0(r0, r2)
        L9:
            return
    }

    public static void O(java.lang.Object r1) {
            r0 = 0
            P(r0, r1)
            return
    }

    public static void P(java.lang.String r0, java.lang.Object r1) {
            if (r1 == 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            Y(r0, r1)
            return
    }

    public static void Q(java.lang.Object r1, java.lang.Object r2) {
            r0 = 0
            R(r0, r1, r2)
            return
    }

    public static void R(java.lang.String r0, java.lang.Object r1, java.lang.Object r2) {
            if (r1 != r2) goto L5
            i0(r0)
        L5:
            return
    }

    public static void S(java.lang.Object r1) {
            r0 = 0
            T(r0, r1)
            return
    }

    public static void T(java.lang.String r0, java.lang.Object r1) {
            if (r1 != 0) goto L3
            return
        L3:
            g0(r0, r1)
            return
    }

    public static void U(java.lang.Object r1, java.lang.Object r2) {
            r0 = 0
            V(r0, r1, r2)
            return
    }

    public static void V(java.lang.String r0, java.lang.Object r1, java.lang.Object r2) {
            if (r1 != r2) goto L3
            return
        L3:
            h0(r0, r1, r2)
            return
    }

    public static <T> void W(T r1, org.hamcrest.j<? super T> r2) {
            java.lang.String r0 = ""
            X(r0, r1, r2)
            return
    }

    public static <T> void X(java.lang.String r0, T r1, org.hamcrest.j<? super T> r2) {
            org.hamcrest.k.b(r0, r1, r2)
            return
    }

    public static void Y(java.lang.String r0, boolean r1) {
            if (r1 != 0) goto L5
            d0(r0)
        L5:
            return
    }

    public static void Z(boolean r1) {
            r0 = 0
            Y(r0, r1)
            return
    }

    public static void a(java.lang.String r0, byte[] r1, byte[] r2) throws org.junit.internal.ArrayComparisonFailure {
            m0(r0, r1, r2)
            return
    }

    private static boolean a0(double r2, double r4, double r6) {
            int r0 = java.lang.Double.compare(r2, r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            double r2 = r2 - r4
            double r2 = java.lang.Math.abs(r2)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 > 0) goto L12
            return r1
        L12:
            r2 = 1
            return r2
    }

    public static void b(java.lang.String r0, char[] r1, char[] r2) throws org.junit.internal.ArrayComparisonFailure {
            m0(r0, r1, r2)
            return
    }

    private static boolean b0(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = n0(r0, r1)
            return r0
    }

    public static void c(java.lang.String r1, double[] r2, double[] r3, double r4) throws org.junit.internal.ArrayComparisonFailure {
            org.junit.internal.d r0 = new org.junit.internal.d
            r0.<init>(r4)
            r0.a(r1, r2, r3)
            return
    }

    public static void c0() {
            r0 = 0
            d0(r0)
            return
    }

    public static void d(java.lang.String r1, float[] r2, float[] r3, float r4) throws org.junit.internal.ArrayComparisonFailure {
            org.junit.internal.d r0 = new org.junit.internal.d
            r0.<init>(r4)
            r0.a(r1, r2, r3)
            return
    }

    public static void d0(java.lang.String r1) {
            if (r1 != 0) goto L8
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L8:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    public static void e(java.lang.String r0, int[] r1, int[] r2) throws org.junit.internal.ArrayComparisonFailure {
            m0(r0, r1, r2)
            return
    }

    private static void e0(java.lang.String r1, java.lang.Object r2) {
            if (r1 == 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ". "
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            goto L16
        L14:
            java.lang.String r1 = "Values should be different. "
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "Actual: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            d0(r1)
            return
    }

    public static void f(java.lang.String r0, long[] r1, long[] r2) throws org.junit.internal.ArrayComparisonFailure {
            m0(r0, r1, r2)
            return
    }

    private static void f0(java.lang.String r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.String r0 = k0(r0, r1, r2)
            d0(r0)
            return
    }

    public static void g(java.lang.String r0, java.lang.Object[] r1, java.lang.Object[] r2) throws org.junit.internal.ArrayComparisonFailure {
            m0(r0, r1, r2)
            return
    }

    private static void g0(java.lang.String r1, java.lang.Object r2) {
            if (r1 == 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            goto L16
        L14:
            java.lang.String r1 = ""
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "expected null, but was:<"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            d0(r1)
            return
    }

    public static void h(java.lang.String r0, short[] r1, short[] r2) throws org.junit.internal.ArrayComparisonFailure {
            m0(r0, r1, r2)
            return
    }

    private static void h0(java.lang.String r1, java.lang.Object r2, java.lang.Object r3) {
            if (r1 == 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            goto L16
        L14:
            java.lang.String r1 = ""
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "expected same:<"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "> was not:<"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            d0(r1)
            return
    }

    public static void i(java.lang.String r0, boolean[] r1, boolean[] r2) throws org.junit.internal.ArrayComparisonFailure {
            m0(r0, r1, r2)
            return
    }

    private static void i0(java.lang.String r1) {
            if (r1 == 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            goto L16
        L14:
            java.lang.String r1 = ""
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "expected not same"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            d0(r1)
            return
    }

    public static void j(byte[] r1, byte[] r2) {
            r0 = 0
            a(r0, r1, r2)
            return
    }

    private static boolean j0(float r2, float r3, float r4) {
            int r0 = java.lang.Float.compare(r2, r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L12
            return r1
        L12:
            r2 = 1
            return r2
    }

    public static void k(char[] r1, char[] r2) {
            r0 = 0
            b(r0, r1, r2)
            return
    }

    static java.lang.String k0(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            java.lang.String r0 = ""
            if (r3 == 0) goto L1b
            boolean r1 = r3.equals(r0)
            if (r1 != 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L1b:
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "expected: "
            r2.append(r0)
            java.lang.String r3 = l0(r4, r3)
            r2.append(r3)
            java.lang.String r3 = " but was: "
            r2.append(r3)
            java.lang.String r3 = l0(r5, r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            return r3
        L4e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r5 = "expected:<"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = "> but was:<"
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = ">"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            return r3
    }

    public static void l(double[] r1, double[] r2, double r3) {
            r0 = 0
            c(r0, r1, r2, r3)
            return
    }

    private static java.lang.String l0(java.lang.Object r1, java.lang.String r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto Ld
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "<"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void m(float[] r1, float[] r2, float r3) {
            r0 = 0
            d(r0, r1, r2, r3)
            return
    }

    private static void m0(java.lang.String r1, java.lang.Object r2, java.lang.Object r3) throws org.junit.internal.ArrayComparisonFailure {
            org.junit.internal.c r0 = new org.junit.internal.c
            r0.<init>()
            r0.a(r1, r2, r3)
            return
    }

    public static void n(int[] r1, int[] r2) {
            r0 = 0
            e(r0, r1, r2)
            return
    }

    private static boolean n0(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static void o(long[] r1, long[] r2) {
            r0 = 0
            f(r0, r1, r2)
            return
    }

    public static void p(java.lang.Object[] r1, java.lang.Object[] r2) {
            r0 = 0
            g(r0, r1, r2)
            return
    }

    public static void q(short[] r1, short[] r2) {
            r0 = 0
            h(r0, r1, r2)
            return
    }

    public static void r(boolean[] r1, boolean[] r2) {
            r0 = 0
            i(r0, r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void s(double r1, double r3) {
            r0 = 0
            x(r0, r1, r3)
            return
    }

    public static void t(double r7, double r9, double r11) {
            r0 = 0
            r1 = r7
            r3 = r9
            r5 = r11
            y(r0, r1, r3, r5)
            return
    }

    public static void u(float r1, float r2, float r3) {
            r0 = 0
            z(r0, r1, r2, r3)
            return
    }

    public static void v(long r1, long r3) {
            r0 = 0
            A(r0, r1, r3)
            return
    }

    public static void w(java.lang.Object r1, java.lang.Object r2) {
            r0 = 0
            B(r0, r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void x(java.lang.String r0, double r1, double r3) {
            java.lang.String r0 = "Use assertEquals(expected, actual, delta) to compare floating-point numbers"
            d0(r0)
            return
    }

    public static void y(java.lang.String r0, double r1, double r3, double r5) {
            boolean r5 = a0(r1, r3, r5)
            if (r5 == 0) goto L11
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            f0(r0, r1, r2)
        L11:
            return
    }

    public static void z(java.lang.String r0, float r1, float r2, float r3) {
            boolean r3 = j0(r1, r2, r3)
            if (r3 == 0) goto L11
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            f0(r0, r1, r2)
        L11:
            return
    }
}
