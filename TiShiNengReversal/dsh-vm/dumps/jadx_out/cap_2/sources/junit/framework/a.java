package junit.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a {
    protected a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void A(java.lang.Object r1, java.lang.Object r2) {
            r0 = 0
            B(r0, r1, r2)
            return
    }

    public static void B(java.lang.String r0, java.lang.Object r1, java.lang.Object r2) {
            if (r1 != r2) goto L5
            M(r0)
        L5:
            return
    }

    public static void C(java.lang.Object r2) {
            if (r2 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected: <null> but was: "
            r0.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            D(r0, r2)
        L1a:
            return
    }

    public static void D(java.lang.String r0, java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            G(r0, r1)
            return
    }

    public static void E(java.lang.Object r1, java.lang.Object r2) {
            r0 = 0
            F(r0, r1, r2)
            return
    }

    public static void F(java.lang.String r0, java.lang.Object r1, java.lang.Object r2) {
            if (r1 != r2) goto L3
            return
        L3:
            L(r0, r1, r2)
            return
    }

    public static void G(java.lang.String r0, boolean r1) {
            if (r1 != 0) goto L5
            J(r0)
        L5:
            return
    }

    public static void H(boolean r1) {
            r0 = 0
            G(r0, r1)
            return
    }

    public static void I() {
            r0 = 0
            J(r0)
            return
    }

    public static void J(java.lang.String r1) {
            if (r1 != 0) goto L8
            junit.framework.AssertionFailedError r1 = new junit.framework.AssertionFailedError
            r1.<init>()
            throw r1
        L8:
            junit.framework.AssertionFailedError r0 = new junit.framework.AssertionFailedError
            r0.<init>(r1)
            throw r0
    }

    public static void K(java.lang.String r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.String r0 = N(r0, r1, r2)
            J(r0)
            return
    }

    public static void L(java.lang.String r1, java.lang.Object r2, java.lang.Object r3) {
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
            J(r1)
            return
    }

    public static void M(java.lang.String r1) {
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
            J(r1)
            return
    }

    public static java.lang.String N(java.lang.String r1, java.lang.Object r2, java.lang.Object r3) {
            if (r1 == 0) goto L1a
            int r0 = r1.length()
            if (r0 <= 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            goto L1c
        L1a:
            java.lang.String r1 = ""
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "expected:<"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "> but was:<"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void b(byte r1, byte r2) {
            r0 = 0
            j(r0, r1, r2)
            return
    }

    public static void d(char r1, char r2) {
            r0 = 0
            k(r0, r1, r2)
            return
    }

    public static void e(double r7, double r9, double r11) {
            r0 = 0
            r1 = r7
            r3 = r9
            r5 = r11
            l(r0, r1, r3, r5)
            return
    }

    public static void f(float r1, float r2, float r3) {
            r0 = 0
            m(r0, r1, r2, r3)
            return
    }

    public static void g(int r1, int r2) {
            r0 = 0
            n(r0, r1, r2)
            return
    }

    public static void h(long r1, long r3) {
            r0 = 0
            o(r0, r1, r3)
            return
    }

    public static void i(java.lang.Object r1, java.lang.Object r2) {
            r0 = 0
            p(r0, r1, r2)
            return
    }

    public static void j(java.lang.String r0, byte r1, byte r2) {
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            p(r0, r1, r2)
            return
    }

    public static void k(java.lang.String r0, char r1, char r2) {
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            p(r0, r1, r2)
            return
    }

    public static void l(java.lang.String r3, double r4, double r6, double r8) {
            int r0 = java.lang.Double.compare(r4, r6)
            if (r0 != 0) goto L7
            goto L1e
        L7:
            double r0 = r4 - r6
            double r0 = java.lang.Math.abs(r0)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L1e
            java.lang.Double r8 = new java.lang.Double
            r8.<init>(r4)
            java.lang.Double r4 = new java.lang.Double
            r4.<init>(r6)
            K(r3, r8, r4)
        L1e:
            return
    }

    public static void m(java.lang.String r1, float r2, float r3, float r4) {
            int r0 = java.lang.Float.compare(r2, r3)
            if (r0 != 0) goto L7
            goto L1e
        L7:
            float r0 = r2 - r3
            float r0 = java.lang.Math.abs(r0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1e
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r2)
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r3)
            K(r1, r4, r2)
        L1e:
            return
    }

    public static void n(java.lang.String r0, int r1, int r2) {
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            p(r0, r1, r2)
            return
    }

    public static void o(java.lang.String r0, long r1, long r3) {
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            p(r0, r1, r2)
            return
    }

    public static void p(java.lang.String r1, java.lang.Object r2, java.lang.Object r3) {
            if (r2 != 0) goto L5
            if (r3 != 0) goto L5
            goto Ld
        L5:
            if (r2 == 0) goto Le
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto Le
        Ld:
            return
        Le:
            K(r1, r2, r3)
            return
    }

    public static void q(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            r(r0, r1, r2)
            return
    }

    public static void r(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            if (r2 != 0) goto L5
            if (r3 != 0) goto L5
            goto Ld
        L5:
            if (r2 == 0) goto Le
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto Le
        Ld:
            return
        Le:
            if (r1 != 0) goto L12
            java.lang.String r1 = ""
        L12:
            junit.framework.ComparisonFailure r0 = new junit.framework.ComparisonFailure
            r0.<init>(r1, r2, r3)
            throw r0
    }

    public static void s(java.lang.String r0, short r1, short r2) {
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            p(r0, r1, r2)
            return
    }

    public static void t(java.lang.String r0, boolean r1, boolean r2) {
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            p(r0, r1, r2)
            return
    }

    public static void u(short r1, short r2) {
            r0 = 0
            s(r0, r1, r2)
            return
    }

    public static void v(boolean r1, boolean r2) {
            r0 = 0
            t(r0, r1, r2)
            return
    }

    public static void w(java.lang.String r0, boolean r1) {
            r1 = r1 ^ 1
            G(r0, r1)
            return
    }

    public static void x(boolean r1) {
            r0 = 0
            w(r0, r1)
            return
    }

    public static void y(java.lang.Object r1) {
            r0 = 0
            z(r0, r1)
            return
    }

    public static void z(java.lang.String r0, java.lang.Object r1) {
            if (r1 == 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            G(r0, r1)
            return
    }
}
