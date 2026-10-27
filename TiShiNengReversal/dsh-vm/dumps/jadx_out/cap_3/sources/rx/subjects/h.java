package rx.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h<T> extends rx.subjects.f<T, T> {
    private final rx.subjects.g<T> b;
    private final rx.h.a c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.b<rx.subjects.g.c<T>> {
        final /* synthetic */ rx.subjects.g a;

        a(rx.subjects.g r1) {
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

        public void call(rx.subjects.g.c<T> r2) {
                r1 = this;
                rx.subjects.g r0 = r1.a
                java.lang.Object r0 = r0.c()
                r2.e(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements rx.functions.a {
        final /* synthetic */ rx.subjects.h a;

        b(rx.subjects.h r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void call() {
                r1 = this;
                rx.subjects.h r0 = r1.a
                r0.z7()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements rx.functions.a {
        final /* synthetic */ java.lang.Throwable a;
        final /* synthetic */ rx.subjects.h b;

        c(rx.subjects.h r1, java.lang.Throwable r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r2 = this;
                rx.subjects.h r0 = r2.b
                java.lang.Throwable r1 = r2.a
                r0.A7(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements rx.functions.a {
        final /* synthetic */ java.lang.Object a;
        final /* synthetic */ rx.subjects.h b;

        d(rx.subjects.h r1, java.lang.Object r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r2 = this;
                rx.subjects.h r0 = r2.b
                java.lang.Object r1 = r2.a
                r0.B7(r1)
                return
        }
    }

    protected h(rx.e.a<T> r1, rx.subjects.g<T> r2, rx.schedulers.d r3) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            rx.h$a r1 = r3.a()
            r0.c = r1
            return
    }

    public static <T> rx.subjects.h<T> y7(rx.schedulers.d r2) {
            rx.subjects.g r0 = new rx.subjects.g
            r0.<init>()
            rx.subjects.h$a r1 = new rx.subjects.h$a
            r1.<init>(r0)
            r0.d = r1
            r0.e = r1
            rx.subjects.h r1 = new rx.subjects.h
            r1.<init>(r0, r0, r2)
            return r1
    }

    void A7(java.lang.Throwable r5) {
            r4 = this;
            rx.subjects.g<T> r0 = r4.b
            boolean r1 = r0.b
            if (r1 == 0) goto L1a
            java.lang.Object r1 = rx.internal.operators.v.c(r5)
            rx.subjects.g$c[] r0 = r0.h(r1)
            int r1 = r0.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L1a
            r3 = r0[r2]
            r3.onError(r5)
            int r2 = r2 + 1
            goto L10
        L1a:
            return
    }

    void B7(T r5) {
            r4 = this;
            rx.subjects.g<T> r0 = r4.b
            rx.subjects.g$c[] r0 = r0.e()
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.onNext(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void C7(long r4) {
            r3 = this;
            rx.h$a r0 = r3.c
            rx.subjects.h$b r1 = new rx.subjects.h$b
            r1.<init>(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.e(r1, r4, r2)
            return
    }

    public void D7(java.lang.Throwable r3, long r4) {
            r2 = this;
            rx.h$a r0 = r2.c
            rx.subjects.h$c r1 = new rx.subjects.h$c
            r1.<init>(r2, r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.e(r1, r4, r3)
            return
    }

    public void E7(T r3, long r4) {
            r2 = this;
            rx.h$a r0 = r2.c
            rx.subjects.h$d r1 = new rx.subjects.h$d
            r1.<init>(r2, r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.e(r1, r4, r3)
            return
    }

    public void onCompleted() {
            r2 = this;
            r0 = 0
            r2.C7(r0)
            return
    }

    public void onError(java.lang.Throwable r3) {
            r2 = this;
            r0 = 0
            r2.D7(r3, r0)
            return
    }

    public void onNext(T r3) {
            r2 = this;
            r0 = 0
            r2.E7(r3, r0)
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

    void z7() {
            r4 = this;
            rx.subjects.g<T> r0 = r4.b
            boolean r1 = r0.b
            if (r1 == 0) goto L1a
            java.lang.Object r1 = rx.internal.operators.v.b()
            rx.subjects.g$c[] r0 = r0.h(r1)
            int r1 = r0.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L1a
            r3 = r0[r2]
            r3.onCompleted()
            int r2 = r2 + 1
            goto L10
        L1a:
            return
    }
}
