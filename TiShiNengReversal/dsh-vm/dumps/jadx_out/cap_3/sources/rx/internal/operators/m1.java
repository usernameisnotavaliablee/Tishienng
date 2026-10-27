package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class m1<T, Resource> implements rx.e.a<T> {
    private final rx.functions.o<Resource> a;
    private final rx.functions.p<? super Resource, ? extends rx.e<? extends T>> b;
    private final rx.functions.b<? super Resource> c;
    private final boolean d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<Resource> extends java.util.concurrent.atomic.AtomicBoolean implements rx.functions.a, rx.m {
        private static final long serialVersionUID = 4262875056400218316L;
        private rx.functions.b<? super Resource> a;
        private Resource b;

        a(rx.functions.b<? super Resource> r1, Resource r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r1 = 0
                r0.lazySet(r1)
                return
        }

        public void call() {
                r3 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L1b
                r0 = 0
                rx.functions.b<? super Resource> r1 = r3.a     // Catch: java.lang.Throwable -> L15
                Resource r2 = r3.b     // Catch: java.lang.Throwable -> L15
                r1.call(r2)     // Catch: java.lang.Throwable -> L15
                r3.b = r0
                r3.a = r0
                return
            L15:
                r1 = move-exception
                r3.b = r0
                r3.a = r0
                throw r1
            L1b:
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                boolean r0 = r1.get()
                return r0
        }

        public void unsubscribe() {
                r0 = this;
                r0.call()
                return
        }
    }

    public m1(rx.functions.o<Resource> r1, rx.functions.p<? super Resource, ? extends rx.e<? extends T>> r2, rx.functions.b<? super Resource> r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    private java.lang.Throwable a(rx.functions.a r1) {
            r0 = this;
            r1.call()     // Catch: java.lang.Throwable -> L5
            r1 = 0
            return r1
        L5:
            r1 = move-exception
            return r1
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r7) {
            r6 = this;
            rx.functions.o<Resource> r0 = r6.a     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L24
            rx.internal.operators.m1$a r1 = new rx.internal.operators.m1$a     // Catch: java.lang.Throwable -> L24
            rx.functions.b<? super Resource> r2 = r6.c     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L24
            r7.add(r1)     // Catch: java.lang.Throwable -> L24
            r2 = 1
            r3 = 0
            r4 = 2
            rx.functions.p<? super Resource, ? extends rx.e<? extends T>> r5 = r6.b     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r5.call(r0)     // Catch: java.lang.Throwable -> L52
            rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L52
            boolean r5 = r6.d     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L26
            rx.e r0 = r0.O1(r1)     // Catch: java.lang.Throwable -> L24
            goto L2a
        L24:
            r0 = move-exception
            goto L72
        L26:
            rx.e r0 = r0.G1(r1)     // Catch: java.lang.Throwable -> L24
        L2a:
            rx.l r5 = rx.observers.h.f(r7)     // Catch: java.lang.Throwable -> L32
            r0.J6(r5)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r0 = move-exception
            java.lang.Throwable r1 = r6.a(r1)     // Catch: java.lang.Throwable -> L24
            rx.exceptions.a.e(r0)     // Catch: java.lang.Throwable -> L24
            rx.exceptions.a.e(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L4e
            rx.exceptions.CompositeException r5 = new rx.exceptions.CompositeException     // Catch: java.lang.Throwable -> L24
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L24
            r4[r3] = r0     // Catch: java.lang.Throwable -> L24
            r4[r2] = r1     // Catch: java.lang.Throwable -> L24
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L24
            r7.onError(r5)     // Catch: java.lang.Throwable -> L24
            goto L75
        L4e:
            r7.onError(r0)     // Catch: java.lang.Throwable -> L24
            goto L75
        L52:
            r0 = move-exception
            java.lang.Throwable r1 = r6.a(r1)     // Catch: java.lang.Throwable -> L24
            rx.exceptions.a.e(r0)     // Catch: java.lang.Throwable -> L24
            rx.exceptions.a.e(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L6e
            rx.exceptions.CompositeException r5 = new rx.exceptions.CompositeException     // Catch: java.lang.Throwable -> L24
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L24
            r4[r3] = r0     // Catch: java.lang.Throwable -> L24
            r4[r2] = r1     // Catch: java.lang.Throwable -> L24
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L24
            r7.onError(r5)     // Catch: java.lang.Throwable -> L24
            goto L75
        L6e:
            r7.onError(r0)     // Catch: java.lang.Throwable -> L24
            goto L75
        L72:
            rx.exceptions.a.f(r0, r7)
        L75:
            return
    }
}
