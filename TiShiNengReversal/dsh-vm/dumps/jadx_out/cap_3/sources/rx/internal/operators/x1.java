package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class x1<T> implements rx.e.b<T, T> {
    final long a;
    final java.util.concurrent.TimeUnit b;
    final rx.h c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        boolean a;
        final /* synthetic */ rx.h.a b;
        final /* synthetic */ rx.l c;
        final /* synthetic */ rx.internal.operators.x1 d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.x1$a$a, reason: collision with other inner class name */
        class C0030a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.x1.a a;

            C0030a(rx.internal.operators.x1.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.operators.x1$a r0 = r2.a
                    boolean r1 = r0.a
                    if (r1 != 0) goto Le
                    r1 = 1
                    r0.a = r1
                    rx.l r0 = r0.c
                    r0.onCompleted()
                Le:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements rx.functions.a {
            final /* synthetic */ java.lang.Throwable a;
            final /* synthetic */ rx.internal.operators.x1.a b;

            b(rx.internal.operators.x1.a r1, java.lang.Throwable r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.operators.x1$a r0 = r2.b
                    boolean r1 = r0.a
                    if (r1 != 0) goto L17
                    r1 = 1
                    r0.a = r1
                    rx.l r0 = r0.c
                    java.lang.Throwable r1 = r2.a
                    r0.onError(r1)
                    rx.internal.operators.x1$a r0 = r2.b
                    rx.h$a r0 = r0.b
                    r0.unsubscribe()
                L17:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class c implements rx.functions.a {
            final /* synthetic */ java.lang.Object a;
            final /* synthetic */ rx.internal.operators.x1.a b;

            c(rx.internal.operators.x1.a r1, java.lang.Object r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.operators.x1$a r0 = r2.b
                    boolean r1 = r0.a
                    if (r1 != 0) goto Ld
                    rx.l r0 = r0.c
                    java.lang.Object r1 = r2.a
                    r0.onNext(r1)
                Ld:
                    return
            }
        }

        a(rx.internal.operators.x1 r1, rx.l r2, rx.h.a r3, rx.l r4) {
                r0 = this;
                r0.d = r1
                r0.b = r3
                r0.c = r4
                r0.<init>(r2)
                return
        }

        public void onCompleted() {
                r5 = this;
                rx.h$a r0 = r5.b
                rx.internal.operators.x1$a$a r1 = new rx.internal.operators.x1$a$a
                r1.<init>(r5)
                rx.internal.operators.x1 r2 = r5.d
                long r3 = r2.a
                java.util.concurrent.TimeUnit r2 = r2.b
                r0.e(r1, r3, r2)
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                rx.h$a r0 = r2.b
                rx.internal.operators.x1$a$b r1 = new rx.internal.operators.x1$a$b
                r1.<init>(r2, r3)
                r0.d(r1)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                rx.h$a r0 = r4.b
                rx.internal.operators.x1$a$c r1 = new rx.internal.operators.x1$a$c
                r1.<init>(r4, r5)
                rx.internal.operators.x1 r5 = r4.d
                long r2 = r5.a
                java.util.concurrent.TimeUnit r5 = r5.b
                r0.e(r1, r2, r5)
                return
        }
    }

    public x1(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r3) {
            r2 = this;
            rx.h r0 = r2.c
            rx.h$a r0 = r0.a()
            r3.add(r0)
            rx.internal.operators.x1$a r1 = new rx.internal.operators.x1$a
            r1.<init>(r2, r3, r0, r3)
            return r1
    }
}
