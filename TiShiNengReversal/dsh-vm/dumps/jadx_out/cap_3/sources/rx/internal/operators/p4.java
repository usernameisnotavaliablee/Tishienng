package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class p4<T> implements rx.i.t<T> {
    final rx.e.a<T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        static final int d = 0;
        static final int e = 1;
        static final int f = 2;
        final rx.k<? super T> a;
        T b;
        int c;

        a(rx.k<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void onCompleted() {
                r2 = this;
                int r0 = r2.c
                if (r0 != 0) goto Lf
                rx.k<? super T> r0 = r2.a
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>()
                r0.onError(r1)
                return
            Lf:
                r1 = 1
                if (r0 != r1) goto L1f
                r0 = 2
                r2.c = r0
                T r0 = r2.b
                r1 = 0
                r2.b = r1
                rx.k<? super T> r1 = r2.a
                r1.d(r0)
            L1f:
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                int r0 = r2.c
                r1 = 2
                if (r0 != r1) goto L9
                rx.plugins.c.I(r3)
                return
            L9:
                r0 = 0
                r2.b = r0
                rx.k<? super T> r0 = r2.a
                r0.onError(r3)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                int r0 = r2.c
                r1 = 1
                if (r0 != 0) goto La
                r2.c = r1
                r2.b = r3
                return
            La:
                if (r0 != r1) goto L1b
                r3 = 2
                r2.c = r3
                rx.k<? super T> r3 = r2.a
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "The upstream produced more than one value"
                r0.<init>(r1)
                r3.onError(r0)
            L1b:
                return
        }
    }

    public p4(rx.e.a<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r2) {
            r1 = this;
            rx.internal.operators.p4$a r0 = new rx.internal.operators.p4$a
            r0.<init>(r2)
            r2.b(r0)
            rx.e$a<T> r2 = r1.a
            r2.call(r0)
            return
    }
}
