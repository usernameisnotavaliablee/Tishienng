package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class q1<T, TClosing> implements rx.e.b<java.util.List<T>, T> {
    final rx.functions.o<? extends rx.e<? extends TClosing>> a;
    final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.functions.o<rx.e<? extends TClosing>> {
        final /* synthetic */ rx.e a;
        final /* synthetic */ rx.internal.operators.q1 b;

        a(rx.internal.operators.q1 r1, rx.e r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                rx.e r0 = r1.m21call()
                return r0
        }

        /* renamed from: call, reason: collision with other method in class */
        public rx.e<? extends TClosing> m21call() {
                r1 = this;
                rx.e r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<TClosing> {
        final /* synthetic */ rx.internal.operators.q1.c a;
        final /* synthetic */ rx.internal.operators.q1 b;

        b(rx.internal.operators.q1 r1, rx.internal.operators.q1.c r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.internal.operators.q1$c r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.q1$c r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(TClosing r1) {
                r0 = this;
                rx.internal.operators.q1$c r1 = r0.a
                r1.g()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c extends rx.l<T> {
        final rx.l<? super java.util.List<T>> a;
        java.util.List<T> b;
        boolean c;
        final /* synthetic */ rx.internal.operators.q1 d;

        public c(rx.internal.operators.q1 r1, rx.l<? super java.util.List<T>> r2) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r0.a = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                int r1 = r1.b
                r2.<init>(r1)
                r0.b = r2
                return
        }

        void g() {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.c     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                goto L36
            L9:
                java.util.List<T> r0 = r3.b     // Catch: java.lang.Throwable -> L7
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7
                rx.internal.operators.q1 r2 = r3.d     // Catch: java.lang.Throwable -> L7
                int r2 = r2.b     // Catch: java.lang.Throwable -> L7
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L7
                r3.b = r1     // Catch: java.lang.Throwable -> L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                rx.l<? super java.util.List<T>> r1 = r3.a     // Catch: java.lang.Throwable -> L1d
                r1.onNext(r0)     // Catch: java.lang.Throwable -> L1d
                return
            L1d:
                r0 = move-exception
                r3.unsubscribe()
                monitor-enter(r3)
                boolean r1 = r3.c     // Catch: java.lang.Throwable -> L28
                if (r1 == 0) goto L2a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
                return
            L28:
                r0 = move-exception
                goto L34
            L2a:
                r1 = 1
                r3.c = r1     // Catch: java.lang.Throwable -> L28
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
                rx.l<? super java.util.List<T>> r1 = r3.a
                rx.exceptions.a.f(r0, r1)
                return
            L34:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
                throw r0
            L36:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r0
        }

        public void onCompleted() {
                r2 = this;
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L20
                boolean r0 = r2.c     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                goto L22
            L9:
                r0 = 1
                r2.c = r0     // Catch: java.lang.Throwable -> L7
                java.util.List<T> r0 = r2.b     // Catch: java.lang.Throwable -> L7
                r1 = 0
                r2.b = r1     // Catch: java.lang.Throwable -> L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                rx.l<? super java.util.List<T>> r1 = r2.a     // Catch: java.lang.Throwable -> L20
                r1.onNext(r0)     // Catch: java.lang.Throwable -> L20
                rx.l<? super java.util.List<T>> r0 = r2.a
                r0.onCompleted()
                r2.unsubscribe()
                return
            L20:
                r0 = move-exception
                goto L24
            L22:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                throw r0     // Catch: java.lang.Throwable -> L20
            L24:
                rx.l<? super java.util.List<T>> r1 = r2.a
                rx.exceptions.a.f(r0, r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.c     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                goto L19
            L9:
                r0 = 1
                r1.c = r0     // Catch: java.lang.Throwable -> L7
                r0 = 0
                r1.b = r0     // Catch: java.lang.Throwable -> L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                rx.l<? super java.util.List<T>> r0 = r1.a
                r0.onError(r2)
                r1.unsubscribe()
                return
            L19:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        public void onNext(T r2) {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.c     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                goto L10
            L9:
                java.util.List<T> r0 = r1.b     // Catch: java.lang.Throwable -> L7
                r0.add(r2)     // Catch: java.lang.Throwable -> L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L10:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                throw r2
        }
    }

    public q1(rx.e<? extends TClosing> r2, int r3) {
            r1 = this;
            r1.<init>()
            rx.internal.operators.q1$a r0 = new rx.internal.operators.q1$a
            r0.<init>(r1, r2)
            r1.a = r0
            r1.b = r3
            return
    }

    public q1(rx.functions.o<? extends rx.e<? extends TClosing>> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super java.util.List<T>> r4) {
            r3 = this;
            rx.functions.o<? extends rx.e<? extends TClosing>> r0 = r3.a     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L21
            rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L21
            rx.internal.operators.q1$c r1 = new rx.internal.operators.q1$c
            rx.observers.g r2 = new rx.observers.g
            r2.<init>(r4)
            r1.<init>(r3, r2)
            rx.internal.operators.q1$b r2 = new rx.internal.operators.q1$b
            r2.<init>(r3, r1)
            r4.add(r2)
            r4.add(r1)
            r0.J6(r2)
            return r1
        L21:
            r0 = move-exception
            rx.exceptions.a.f(r0, r4)
            rx.l r4 = rx.observers.h.d()
            return r4
    }
}
