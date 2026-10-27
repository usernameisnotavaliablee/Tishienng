package k5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a<T> extends rx.l<T> implements rx.observers.a<T> {
    private final rx.observers.j<T> a;

    public a(rx.observers.j<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> k5.a<T> g(long r1) {
            rx.observers.j r0 = new rx.observers.j
            r0.<init>(r1)
            k5.a r1 = new k5.a
            r1.<init>(r0)
            r1.add(r0)
            return r1
    }

    public rx.observers.a<T> C(java.lang.Class<? extends java.lang.Throwable> r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.j(r2)
            return r1
    }

    public rx.observers.a<T> D() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.H()
            return r1
    }

    public final int E() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            int r0 = r0.E()
            return r0
    }

    public rx.observers.a<T> F() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.g()
            return r1
    }

    public rx.observers.a<T> I() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.G()
            return r1
    }

    public java.util.List<T> J() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            java.util.List r0 = r0.J()
            return r0
    }

    public rx.observers.a<T> K(int r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.T(r2)
            return r1
    }

    public rx.observers.a<T> L(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.Y(r2, r4)
            return r1
    }

    public final rx.observers.a<T> M(java.lang.Class<? extends java.lang.Throwable> r2, T... r3) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.U(r3)
            rx.observers.j<T> r3 = r1.a
            r3.j(r2)
            rx.observers.j<T> r2 = r1.a
            r2.N()
            return r1
    }

    public final rx.observers.a<T> O(rx.functions.a r1) {
            r0 = this;
            r1.call()
            return r0
    }

    public rx.observers.a<T> c() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.X()
            return r1
    }

    public final rx.observers.a<T> h(T r2, T... r3) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.V(r2, r3)
            return r1
    }

    public final rx.observers.a<T> i(T... r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.U(r2)
            rx.observers.j<T> r2 = r1.a
            r2.B()
            rx.observers.j<T> r2 = r1.a
            r2.g()
            return r1
    }

    public rx.observers.a<T> k() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.Q()
            return r1
    }

    public rx.observers.a<T> l() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.B()
            return r1
    }

    public java.util.List<java.lang.Throwable> m() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            java.util.List r0 = r0.m()
            return r0
    }

    public rx.observers.a<T> n(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.Z(r2, r4)
            return r1
    }

    public final rx.observers.a<T> o(int r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            boolean r3 = r0.a0(r2, r3, r5)
            if (r3 == 0) goto L9
            return r1
        L9:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Did not receive enough values in time. Expected: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", Actual: "
            r4.append(r2)
            rx.observers.j<T> r2 = r1.a
            int r2 = r2.E()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    public void onCompleted() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.onCompleted()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.onError(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.onNext(r2)
            return
    }

    public void onStart() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.onStart()
            return
    }

    public rx.observers.a<T> p() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.N()
            return r1
    }

    public rx.observers.a<T> q(java.util.List<T> r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.P(r2)
            return r1
    }

    public rx.observers.a<T> r(java.lang.Throwable r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.s(r2)
            return r1
    }

    public void setProducer(rx.g r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.setProducer(r2)
            return
    }

    public rx.observers.a<T> t(T r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.S(r2)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }

    public rx.observers.a<T> u() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.R()
            return r1
    }

    public rx.observers.a<T> v(T... r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.U(r2)
            return r1
    }

    public final int w() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            int r0 = r0.w()
            return r0
    }

    public rx.observers.a<T> x(long r2) {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            r0.h0(r2)
            return r1
    }

    public final rx.observers.a<T> y(java.lang.Class<? extends java.lang.Throwable> r3, java.lang.String r4, T... r5) {
            r2 = this;
            rx.observers.j<T> r0 = r2.a
            r0.U(r5)
            rx.observers.j<T> r5 = r2.a
            r5.j(r3)
            rx.observers.j<T> r3 = r2.a
            r3.N()
            rx.observers.j<T> r3 = r2.a
            java.util.List r3 = r3.m()
            r5 = 0
            java.lang.Object r3 = r3.get(r5)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r3 = r3.getMessage()
            if (r3 == r4) goto L4f
            if (r4 == 0) goto L2b
            boolean r5 = r4.equals(r3)
            if (r5 == 0) goto L2b
            goto L4f
        L2b:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error message differs. Expected: '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "', Received: '"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = "'"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
        L4f:
            return r2
    }

    public java.lang.Thread z() {
            r1 = this;
            rx.observers.j<T> r0 = r1.a
            java.lang.Thread r0 = r0.z()
            return r0
    }
}
