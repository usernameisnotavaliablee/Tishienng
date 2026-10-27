package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class g0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.SinceKotlin(version = "1.4")
    public static class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private g0() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <T extends java.lang.Throwable> T A(T r1) {
            java.lang.Class<kotlin.jvm.internal.g0> r0 = kotlin.jvm.internal.g0.class
            java.lang.String r0 = r0.getName()
            java.lang.Throwable r1 = B(r1, r0)
            return r1
    }

    static <T extends java.lang.Throwable> T B(T r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return r5
    }

    public static java.lang.String C(java.lang.String r1, java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void D() {
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.Throwable r0 = A(r0)
            java.lang.AssertionError r0 = (java.lang.AssertionError) r0
            throw r0
    }

    public static void E(java.lang.String r1) {
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            java.lang.Throwable r1 = A(r0)
            java.lang.AssertionError r1 = (java.lang.AssertionError) r1
            throw r1
    }

    public static void F() {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            java.lang.Throwable r0 = A(r0)
            java.lang.IllegalArgumentException r0 = (java.lang.IllegalArgumentException) r0
            throw r0
    }

    public static void G(java.lang.String r1) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            java.lang.Throwable r1 = A(r0)
            java.lang.IllegalArgumentException r1 = (java.lang.IllegalArgumentException) r1
            throw r1
    }

    public static void H() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            java.lang.Throwable r0 = A(r0)
            java.lang.IllegalStateException r0 = (java.lang.IllegalStateException) r0
            throw r0
    }

    public static void I(java.lang.String r1) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            java.lang.Throwable r1 = A(r0)
            java.lang.IllegalStateException r1 = (java.lang.IllegalStateException) r1
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static void J() {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            java.lang.Throwable r0 = A(r0)
            java.lang.NullPointerException r0 = (java.lang.NullPointerException) r0
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static void K(java.lang.String r1) {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            java.lang.Throwable r1 = A(r0)
            java.lang.NullPointerException r1 = (java.lang.NullPointerException) r1
            throw r1
    }

    public static void L() {
            kotlin.KotlinNullPointerException r0 = new kotlin.KotlinNullPointerException
            r0.<init>()
            java.lang.Throwable r0 = A(r0)
            kotlin.KotlinNullPointerException r0 = (kotlin.KotlinNullPointerException) r0
            throw r0
    }

    public static void M(java.lang.String r1) {
            kotlin.KotlinNullPointerException r0 = new kotlin.KotlinNullPointerException
            r0.<init>(r1)
            java.lang.Throwable r1 = A(r0)
            kotlin.KotlinNullPointerException r1 = (kotlin.KotlinNullPointerException) r1
            throw r1
    }

    private static void N(java.lang.String r1) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = v(r1)
            r0.<init>(r1)
            java.lang.Throwable r1 = A(r0)
            java.lang.IllegalArgumentException r1 = (java.lang.IllegalArgumentException) r1
            throw r1
    }

    private static void O(java.lang.String r1) {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = v(r1)
            r0.<init>(r1)
            java.lang.Throwable r1 = A(r0)
            java.lang.NullPointerException r1 = (java.lang.NullPointerException) r1
            throw r1
    }

    public static void P() {
            java.lang.String r0 = "This function has a reified type parameter and thus can only be inlined at compilation time, not called directly."
            Q(r0)
            return
    }

    public static void Q(java.lang.String r1) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
    }

    public static void R(java.lang.String r1) {
            kotlin.UninitializedPropertyAccessException r0 = new kotlin.UninitializedPropertyAccessException
            r0.<init>(r1)
            java.lang.Throwable r1 = A(r0)
            kotlin.UninitializedPropertyAccessException r1 = (kotlin.UninitializedPropertyAccessException) r1
            throw r1
    }

    public static void S(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "lateinit property "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " has not been initialized"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            R(r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean a(double r2, java.lang.Double r4) {
            if (r4 == 0) goto Lc
            double r0 = r4.doubleValue()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean b(float r0, java.lang.Float r1) {
            if (r1 == 0) goto Lc
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean c(java.lang.Double r2, double r3) {
            if (r2 == 0) goto Lc
            double r0 = r2.doubleValue()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean d(java.lang.Double r5, java.lang.Double r6) {
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L8
            if (r6 != 0) goto L7
            return r1
        L7:
            return r0
        L8:
            if (r6 == 0) goto L17
            double r2 = r5.doubleValue()
            double r5 = r6.doubleValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L17
            return r1
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean e(java.lang.Float r0, float r1) {
            if (r0 == 0) goto Lc
            float r0 = r0.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean f(java.lang.Float r2, java.lang.Float r3) {
            r0 = 0
            r1 = 1
            if (r2 != 0) goto L8
            if (r3 != 0) goto L7
            return r1
        L7:
            return r0
        L8:
            if (r3 == 0) goto L17
            float r2 = r2.floatValue()
            float r3 = r3.floatValue()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L17
            return r1
        L17:
            return r0
    }

    public static boolean g(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static void h(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " must not be null"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            java.lang.Throwable r1 = A(r1)
            java.lang.IllegalStateException r1 = (java.lang.IllegalStateException) r1
            throw r1
    }

    public static void i(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            java.lang.Throwable r0 = A(r0)
            java.lang.IllegalStateException r0 = (java.lang.IllegalStateException) r0
            throw r0
    }

    public static void j(java.lang.Object r2, java.lang.String r3, java.lang.String r4) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field specified as non-null is null: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            java.lang.Throwable r2 = A(r2)
            java.lang.IllegalStateException r2 = (java.lang.IllegalStateException) r2
            throw r2
    }

    public static void k(java.lang.String r4) throws java.lang.ClassNotFoundException {
            r0 = 47
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> Lc
            return
        Lc:
            r0 = move-exception
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " is not found. Please update the Kotlin runtime to the latest version"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            java.lang.Throwable r4 = A(r1)
            java.lang.ClassNotFoundException r4 = (java.lang.ClassNotFoundException) r4
            throw r4
    }

    public static void l(java.lang.String r4, java.lang.String r5) throws java.lang.ClassNotFoundException {
            r0 = 47
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> Lc
            return
        Lc:
            r0 = move-exception
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " is not found: this code requires the Kotlin runtime of version at least "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            java.lang.Throwable r4 = A(r1)
            java.lang.ClassNotFoundException r4 = (java.lang.ClassNotFoundException) r4
            throw r4
    }

    public static void m(java.lang.Object r0) {
            if (r0 != 0) goto L5
            J()
        L5:
            return
    }

    public static void n(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            K(r1)
        L5:
            return
    }

    public static void o(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " must not be null"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            java.lang.Throwable r1 = A(r1)
            java.lang.NullPointerException r1 = (java.lang.NullPointerException) r1
            throw r1
    }

    public static void p(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            O(r1)
        L5:
            return
    }

    public static void q(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            N(r1)
        L5:
            return
    }

    public static void r(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            java.lang.Throwable r0 = A(r0)
            java.lang.IllegalStateException r0 = (java.lang.IllegalStateException) r0
            throw r0
    }

    public static void s(java.lang.Object r2, java.lang.String r3, java.lang.String r4) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Method specified as non-null returned null: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            java.lang.Throwable r2 = A(r2)
            java.lang.IllegalStateException r2 = (java.lang.IllegalStateException) r2
            throw r2
    }

    public static int t(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    public static int u(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            return r1
        L6:
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            r1 = 1
            return r1
    }

    private static java.lang.String v(java.lang.String r4) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.Class<kotlin.jvm.internal.g0> r1 = kotlin.jvm.internal.g0.class
            java.lang.String r1 = r1.getName()
            r2 = 0
        Lf:
            r3 = r0[r2]
            java.lang.String r3 = r3.getClassName()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1e
            int r2 = r2 + 1
            goto Lf
        L1e:
            r3 = r0[r2]
            java.lang.String r3 = r3.getClassName()
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L2d
            int r2 = r2 + 1
            goto L1e
        L2d:
            r0 = r0[r2]
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = r0.getMethodName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parameter specified as non-null is null: method "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", parameter "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    public static void w() {
            P()
            return
    }

    public static void x(java.lang.String r0) {
            Q(r0)
            return
    }

    public static void y(int r0, java.lang.String r1) {
            P()
            return
    }

    public static void z(int r0, java.lang.String r1, java.lang.String r2) {
            Q(r2)
            return
    }
}
