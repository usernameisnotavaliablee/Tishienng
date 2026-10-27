package rx.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a<T> extends rx.subjects.f<T, T> {
    final rx.subjects.g<T> b;
    volatile java.lang.Object c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.subjects.a$a, reason: collision with other inner class name */
    static class C0054a implements rx.functions.b<rx.subjects.g.c<T>> {
        final /* synthetic */ rx.subjects.g a;

        C0054a(rx.subjects.g r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.subjects.g$c r1 = (rx.subjects.g.c) r1
                r0.call(r1)
                return
        }

        public void call(rx.subjects.g.c<T> r4) {
                r3 = this;
                rx.subjects.g r0 = r3.a
                java.lang.Object r0 = r0.c()
                if (r0 == 0) goto L2e
                boolean r1 = rx.internal.operators.v.f(r0)
                if (r1 == 0) goto Lf
                goto L2e
            Lf:
                boolean r1 = rx.internal.operators.v.g(r0)
                if (r1 == 0) goto L1d
                java.lang.Throwable r0 = rx.internal.operators.v.d(r0)
                r4.onError(r0)
                return
            L1d:
                rx.l<? super T> r1 = r4.a
                rx.internal.producers.SingleProducer r2 = new rx.internal.producers.SingleProducer
                rx.l<? super T> r4 = r4.a
                java.lang.Object r0 = rx.internal.operators.v.e(r0)
                r2.<init>(r4, r0)
                r1.setProducer(r2)
                return
            L2e:
                r4.onCompleted()
                return
        }
    }

    protected a(rx.e.a<T> r1, rx.subjects.g<T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            return
    }

    public static <T> rx.subjects.a<T> y7() {
            rx.subjects.g r0 = new rx.subjects.g
            r0.<init>()
            rx.subjects.a$a r1 = new rx.subjects.a$a
            r1.<init>(r0)
            r0.e = r1
            rx.subjects.a r1 = new rx.subjects.a
            r1.<init>(r0, r0)
            return r1
    }

    public T A7() {
            r2 = this;
            java.lang.Object r0 = r2.c
            rx.subjects.g<T> r1 = r2.b
            java.lang.Object r1 = r1.c()
            boolean r1 = rx.internal.operators.v.g(r1)
            if (r1 != 0) goto L19
            boolean r1 = rx.internal.operators.v.h(r0)
            if (r1 == 0) goto L19
            java.lang.Object r0 = rx.internal.operators.v.e(r0)
            return r0
        L19:
            r0 = 0
            return r0
    }

    public boolean B7() {
            r1 = this;
            rx.subjects.g<T> r0 = r1.b
            java.lang.Object r0 = r0.c()
            if (r0 == 0) goto L10
            boolean r0 = rx.internal.operators.v.g(r0)
            if (r0 != 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean C7() {
            r1 = this;
            rx.subjects.g<T> r0 = r1.b
            java.lang.Object r0 = r0.c()
            boolean r0 = rx.internal.operators.v.g(r0)
            return r0
    }

    public boolean D7() {
            r2 = this;
            java.lang.Object r0 = r2.c
            rx.subjects.g<T> r1 = r2.b
            java.lang.Object r1 = r1.c()
            boolean r1 = rx.internal.operators.v.g(r1)
            if (r1 != 0) goto L16
            boolean r0 = rx.internal.operators.v.h(r0)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public void onCompleted() {
            r8 = this;
            rx.subjects.g<T> r0 = r8.b
            boolean r0 = r0.b
            if (r0 == 0) goto L37
            java.lang.Object r0 = r8.c
            if (r0 != 0) goto Le
            java.lang.Object r0 = rx.internal.operators.v.b()
        Le:
            rx.subjects.g<T> r1 = r8.b
            rx.subjects.g$c[] r1 = r1.h(r0)
            int r2 = r1.length
            r3 = 0
        L16:
            if (r3 >= r2) goto L37
            r4 = r1[r3]
            java.lang.Object r5 = rx.internal.operators.v.b()
            if (r0 != r5) goto L24
            r4.onCompleted()
            goto L34
        L24:
            rx.l<? super T> r5 = r4.a
            rx.internal.producers.SingleProducer r6 = new rx.internal.producers.SingleProducer
            rx.l<? super T> r4 = r4.a
            java.lang.Object r7 = rx.internal.operators.v.e(r0)
            r6.<init>(r4, r7)
            r5.setProducer(r6)
        L34:
            int r3 = r3 + 1
            goto L16
        L37:
            return
    }

    public void onError(java.lang.Throwable r6) {
            r5 = this;
            rx.subjects.g<T> r0 = r5.b
            boolean r0 = r0.b
            if (r0 == 0) goto L2c
            java.lang.Object r0 = rx.internal.operators.v.c(r6)
            rx.subjects.g<T> r1 = r5.b
            rx.subjects.g$c[] r0 = r1.h(r0)
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L13:
            if (r3 >= r1) goto L29
            r4 = r0[r3]
            r4.onError(r6)     // Catch: java.lang.Throwable -> L1b
            goto L26
        L1b:
            r4 = move-exception
            if (r2 != 0) goto L23
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L23:
            r2.add(r4)
        L26:
            int r3 = r3 + 1
            goto L13
        L29:
            rx.exceptions.a.d(r2)
        L2c:
            return
    }

    public void onNext(T r1) {
            r0 = this;
            java.lang.Object r1 = rx.internal.operators.v.j(r1)
            r0.c = r1
            return
    }

    @Override // rx.subjects.f
    public boolean w7() {
            r1 = this;
            rx.subjects.g<T> r0 = r1.b
            rx.subjects.g$c[] r0 = r0.e()
            int r0 = r0.length
            if (r0 <= 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public java.lang.Throwable z7() {
            r2 = this;
            rx.subjects.g<T> r0 = r2.b
            java.lang.Object r0 = r0.c()
            boolean r1 = rx.internal.operators.v.g(r0)
            if (r1 == 0) goto L11
            java.lang.Throwable r0 = rx.internal.operators.v.d(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }
}
