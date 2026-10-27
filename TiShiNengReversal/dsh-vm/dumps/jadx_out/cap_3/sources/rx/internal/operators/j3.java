package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class j3<T> implements rx.e.a<T> {
    final rx.h a;
    final rx.e<T> b;
    final boolean c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> implements rx.functions.a {
        final rx.l<? super T> a;
        final boolean b;
        final rx.h.a c;
        rx.e<T> d;
        java.lang.Thread e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.j3$a$a, reason: collision with other inner class name */
        class C0013a implements rx.g {
            final /* synthetic */ rx.g a;
            final /* synthetic */ rx.internal.operators.j3.a b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.internal.operators.j3$a$a$a, reason: collision with other inner class name */
            class C0014a implements rx.functions.a {
                final /* synthetic */ long a;
                final /* synthetic */ rx.internal.operators.j3.a.C0013a b;

                C0014a(rx.internal.operators.j3.a.C0013a r1, long r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                public void call() {
                        r3 = this;
                        rx.internal.operators.j3$a$a r0 = r3.b
                        rx.g r0 = r0.a
                        long r1 = r3.a
                        r0.request(r1)
                        return
                }
            }

            C0013a(rx.internal.operators.j3.a r1, rx.g r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void request(long r3) {
                    r2 = this;
                    rx.internal.operators.j3$a r0 = r2.b
                    java.lang.Thread r0 = r0.e
                    java.lang.Thread r1 = java.lang.Thread.currentThread()
                    if (r0 == r1) goto L1c
                    rx.internal.operators.j3$a r0 = r2.b
                    boolean r1 = r0.b
                    if (r1 != 0) goto L11
                    goto L1c
                L11:
                    rx.h$a r0 = r0.c
                    rx.internal.operators.j3$a$a$a r1 = new rx.internal.operators.j3$a$a$a
                    r1.<init>(r2, r3)
                    r0.d(r1)
                    return
                L1c:
                    rx.g r0 = r2.a
                    r0.request(r3)
                    return
            }
        }

        a(rx.l<? super T> r1, boolean r2, rx.h.a r3, rx.e<T> r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        public void call() {
                r2 = this;
                rx.e<T> r0 = r2.d
                r1 = 0
                r2.d = r1
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r2.e = r1
                r0.J6(r2)
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.l<? super T> r0 = r2.a     // Catch: java.lang.Throwable -> Lb
                r0.onCompleted()     // Catch: java.lang.Throwable -> Lb
                rx.h$a r0 = r2.c
                r0.unsubscribe()
                return
            Lb:
                r0 = move-exception
                rx.h$a r1 = r2.c
                r1.unsubscribe()
                throw r0
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a     // Catch: java.lang.Throwable -> Lb
                r0.onError(r2)     // Catch: java.lang.Throwable -> Lb
                rx.h$a r2 = r1.c
                r2.unsubscribe()
                return
            Lb:
                r2 = move-exception
                rx.h$a r0 = r1.c
                r0.unsubscribe()
                throw r2
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
                return
        }

        public void setProducer(rx.g r3) {
                r2 = this;
                rx.l<? super T> r0 = r2.a
                rx.internal.operators.j3$a$a r1 = new rx.internal.operators.j3$a$a
                r1.<init>(r2, r3)
                r0.setProducer(r1)
                return
        }
    }

    public j3(rx.e<T> r1, rx.h r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            r0.c = r3
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r5) {
            r4 = this;
            rx.h r0 = r4.a
            rx.h$a r0 = r0.a()
            rx.internal.operators.j3$a r1 = new rx.internal.operators.j3$a
            boolean r2 = r4.c
            rx.e<T> r3 = r4.b
            r1.<init>(r5, r2, r0, r3)
            r5.add(r1)
            r5.add(r0)
            r0.d(r1)
            return
    }
}
