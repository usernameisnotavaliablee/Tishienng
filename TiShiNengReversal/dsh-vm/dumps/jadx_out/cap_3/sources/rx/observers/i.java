package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class i<T> implements rx.f<T> {
    private static final rx.f<java.lang.Object> e = null;
    private final rx.f<T> a;
    private final java.util.List<T> b;
    private final java.util.List<java.lang.Throwable> c;
    private final java.util.List<rx.Notification<T>> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.f<java.lang.Object> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onCompleted() {
                r0 = this;
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                return
        }

        public void onNext(java.lang.Object r1) {
                r0 = this;
                return
        }
    }

    static {
            rx.observers.i$a r0 = new rx.observers.i$a
            r0.<init>()
            rx.observers.i.e = r0
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            rx.f<java.lang.Object> r0 = rx.observers.i.e
            r1.a = r0
            return
    }

    public i(rx.f<T> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            r1.a = r2
            return
    }

    public java.util.List<T> J() {
            r1 = this;
            java.util.List<T> r0 = r1.b
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public void d(java.util.List<T> r6) {
            r5 = this;
            java.util.List<T> r0 = r5.b
            int r0 = r0.size()
            int r1 = r6.size()
            if (r0 == r1) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Number of items does not match. Provided: "
            r0.append(r1)
            int r1 = r6.size()
            r0.append(r1)
            java.lang.String r1 = "  Actual: "
            r0.append(r1)
            java.util.List<T> r1 = r5.b
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ".\nProvided values: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = "\nActual values: "
            r0.append(r1)
            java.util.List<T> r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.f(r0)
        L49:
            r0 = 0
        L4a:
            int r1 = r6.size()
            if (r0 >= r1) goto Ld4
            java.lang.Object r1 = r6.get(r0)
            java.util.List<T> r2 = r5.b
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r3 = "Value at index: "
            if (r1 != 0) goto L80
            if (r2 == 0) goto Ld0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = " expected to be [null] but was: ["
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = "]\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5.f(r1)
            goto Ld0
        L80:
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto Ld0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = " expected to be ["
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = "] ("
            r4.append(r3)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = ") but was: ["
            r4.append(r1)
            r4.append(r2)
            r4.append(r3)
            if (r2 == 0) goto Lbf
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto Lc1
        Lbf:
            java.lang.String r1 = "null"
        Lc1:
            r4.append(r1)
            java.lang.String r1 = ")\n"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r5.f(r1)
        Ld0:
            int r0 = r0 + 1
            goto L4a
        Ld4:
            return
    }

    public void e() {
            r3 = this;
            java.util.List<java.lang.Throwable> r0 = r3.c
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Too many onError events: "
            r0.append(r2)
            java.util.List<java.lang.Throwable> r2 = r3.c
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.f(r0)
        L23:
            java.util.List<rx.Notification<T>> r0 = r3.d
            int r0 = r0.size()
            if (r0 <= r1) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Too many onCompleted events: "
            r0.append(r2)
            java.util.List<rx.Notification<T>> r2 = r3.d
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.f(r0)
        L45:
            java.util.List<rx.Notification<T>> r0 = r3.d
            int r0 = r0.size()
            if (r0 != r1) goto L5a
            java.util.List<java.lang.Throwable> r0 = r3.c
            int r0 = r0.size()
            if (r0 != r1) goto L5a
            java.lang.String r0 = "Received both an onError and onCompleted. Should be one or the other."
            r3.f(r0)
        L5a:
            java.util.List<rx.Notification<T>> r0 = r3.d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6f
            java.util.List<java.lang.Throwable> r0 = r3.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6f
            java.lang.String r0 = "No terminal events received."
            r3.f(r0)
        L6f:
            return
    }

    final void f(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length()
            int r1 = r1 + 32
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " ("
            r0.append(r6)
            java.util.List<rx.Notification<T>> r6 = r5.d
            int r6 = r6.size()
            r0.append(r6)
            java.lang.String r1 = " completion"
            r0.append(r1)
            r1 = 115(0x73, float:1.61E-43)
            r2 = 1
            if (r6 == r2) goto L29
            r0.append(r1)
        L29:
            r6 = 41
            r0.append(r6)
            java.util.List<java.lang.Throwable> r3 = r5.c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L51
            java.util.List<java.lang.Throwable> r3 = r5.c
            int r3 = r3.size()
            java.lang.String r4 = " (+"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = " error"
            r0.append(r4)
            if (r3 == r2) goto L4e
            r0.append(r1)
        L4e:
            r0.append(r6)
        L51:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            java.util.List<java.lang.Throwable> r0 = r5.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L81
            java.util.List<java.lang.Throwable> r0 = r5.c
            int r0 = r0.size()
            if (r0 != r2) goto L77
            java.util.List<java.lang.Throwable> r0 = r5.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r6.initCause(r0)
            goto L81
        L77:
            rx.exceptions.CompositeException r0 = new rx.exceptions.CompositeException
            java.util.List<java.lang.Throwable> r1 = r5.c
            r0.<init>(r1)
            r6.initCause(r0)
        L81:
            throw r6
    }

    public java.util.List<java.lang.Object> g() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<T> r1 = r2.b
            r0.add(r1)
            java.util.List<java.lang.Throwable> r1 = r2.c
            r0.add(r1)
            java.util.List<rx.Notification<T>> r1 = r2.d
            r0.add(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.util.List<rx.Notification<T>> j() {
            r1 = this;
            java.util.List<rx.Notification<T>> r0 = r1.d
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.util.List<java.lang.Throwable> m() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public void onCompleted() {
            r2 = this;
            java.util.List<rx.Notification<T>> r0 = r2.d
            rx.Notification r1 = rx.Notification.b()
            r0.add(r1)
            rx.f<T> r0 = r2.a
            r0.onCompleted()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.c
            r0.add(r2)
            rx.f<T> r0 = r1.a
            r0.onError(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            java.util.List<T> r0 = r1.b
            r0.add(r2)
            rx.f<T> r0 = r1.a
            r0.onNext(r2)
            return
    }
}
