package rx.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d<T> extends rx.subjects.f<T, T> {
    private static final java.lang.Object[] c = null;
    final rx.subjects.d.e<T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a<T> {
        void a(rx.subjects.d.b<T> r1);

        void complete();

        java.lang.Throwable error();

        void error(java.lang.Throwable r1);

        boolean isComplete();

        boolean isEmpty();

        T last();

        void next(T r1);

        int size();

        T[] toArray(T[] r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.g, rx.m {
        private static final long serialVersionUID = -5006209596735204567L;
        final rx.l<? super T> a;
        final java.util.concurrent.atomic.AtomicLong b;
        final rx.subjects.d.e<T> c;
        int d;
        int e;
        java.lang.Object f;

        public b(rx.l<? super T> r1, rx.subjects.d.e<T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.b = r1
                r0.c = r2
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L13
                java.util.concurrent.atomic.AtomicLong r0 = r3.b
                rx.internal.operators.a.b(r0, r4)
                rx.subjects.d$e<T> r4 = r3.c
                rx.subjects.d$a<T> r4 = r4.a
                r4.a(r3)
                return
            L13:
                if (r2 < 0) goto L16
                return
            L16:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= required but it was "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public void unsubscribe() {
                r1 = this;
                rx.subjects.d$e<T> r0 = r1.c
                r0.f(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> implements rx.subjects.d.a<T> {
        final int a;
        final long b;
        final rx.h c;
        volatile rx.subjects.d.c.a<T> d;
        rx.subjects.d.c.a<T> e;
        int f;
        volatile boolean g;
        java.lang.Throwable h;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class a<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.d.c.a<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T a;
            final long b;

            public a(T r1, long r2) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    r0.b = r2
                    return
            }
        }

        public c(int r4, long r5, rx.h r7) {
                r3 = this;
                r3.<init>()
                r3.a = r4
                rx.subjects.d$c$a r4 = new rx.subjects.d$c$a
                r0 = 0
                r1 = 0
                r4.<init>(r0, r1)
                r3.e = r4
                r3.d = r4
                r3.b = r5
                r3.c = r7
                return
        }

        @Override // rx.subjects.d.a
        public void a(rx.subjects.d.b<T> r18) {
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r1.getAndIncrement()
                if (r2 == 0) goto Lc
                goto La2
            Lc:
                rx.l<? super T> r2 = r1.a
                r4 = 1
            Lf:
                java.util.concurrent.atomic.AtomicLong r5 = r1.b
                long r5 = r5.get()
                java.lang.Object r7 = r1.f
                rx.subjects.d$c$a r7 = (rx.subjects.d.c.a) r7
                r8 = 0
                if (r7 != 0) goto L21
                rx.subjects.d$c$a r7 = r0.c()
            L21:
                r10 = r8
            L22:
                r12 = 0
                r13 = 0
                int r14 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r14 == 0) goto L61
                boolean r15 = r2.isUnsubscribed()
                if (r15 == 0) goto L31
                r1.f = r13
                return
            L31:
                boolean r15 = r0.g
                java.lang.Object r16 = r7.get()
                r3 = r16
                rx.subjects.d$c$a r3 = (rx.subjects.d.c.a) r3
                if (r3 != 0) goto L40
                r16 = 1
                goto L42
            L40:
                r16 = 0
            L42:
                if (r15 == 0) goto L54
                if (r16 == 0) goto L54
                r1.f = r13
                java.lang.Throwable r1 = r0.h
                if (r1 == 0) goto L50
                r2.onError(r1)
                return
            L50:
                r2.onCompleted()
                return
            L54:
                if (r16 == 0) goto L57
                goto L61
            L57:
                T r7 = r3.a
                r2.onNext(r7)
                r12 = 1
                long r10 = r10 + r12
                r7 = r3
                goto L22
            L61:
                if (r14 != 0) goto L87
                boolean r3 = r2.isUnsubscribed()
                if (r3 == 0) goto L6c
                r1.f = r13
                return
            L6c:
                boolean r3 = r0.g
                java.lang.Object r14 = r7.get()
                if (r14 != 0) goto L75
                r12 = 1
            L75:
                if (r3 == 0) goto L87
                if (r12 == 0) goto L87
                r1.f = r13
                java.lang.Throwable r1 = r0.h
                if (r1 == 0) goto L83
                r2.onError(r1)
                return
            L83:
                r2.onCompleted()
                return
            L87:
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L99
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r3 == 0) goto L99
                java.util.concurrent.atomic.AtomicLong r3 = r1.b
                rx.internal.operators.a.i(r3, r10)
            L99:
                r1.f = r7
                int r3 = -r4
                int r4 = r1.addAndGet(r3)
                if (r4 != 0) goto Lf
            La2:
                return
        }

        void b() {
                r8 = this;
                rx.h r0 = r8.c
                long r0 = r0.b()
                long r2 = r8.b
                long r0 = r0 - r2
                rx.subjects.d$c$a<T> r2 = r8.d
                r3 = r2
            Lc:
                java.lang.Object r4 = r3.get()
                rx.subjects.d$c$a r4 = (rx.subjects.d.c.a) r4
                if (r4 == 0) goto L1d
                long r5 = r4.b
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 <= 0) goto L1b
                goto L1d
            L1b:
                r3 = r4
                goto Lc
            L1d:
                if (r2 == r3) goto L21
                r8.d = r3
            L21:
                return
        }

        rx.subjects.d.c.a<T> c() {
                r7 = this;
                rx.h r0 = r7.c
                long r0 = r0.b()
                long r2 = r7.b
                long r0 = r0 - r2
                rx.subjects.d$c$a<T> r2 = r7.d
            Lb:
                java.lang.Object r3 = r2.get()
                rx.subjects.d$c$a r3 = (rx.subjects.d.c.a) r3
                if (r3 == 0) goto L1c
                long r4 = r3.b
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 <= 0) goto L1a
                goto L1c
            L1a:
                r2 = r3
                goto Lb
            L1c:
                return r2
        }

        @Override // rx.subjects.d.a
        public void complete() {
                r1 = this;
                r1.b()
                r0 = 1
                r1.g = r0
                return
        }

        @Override // rx.subjects.d.a
        public java.lang.Throwable error() {
                r1 = this;
                java.lang.Throwable r0 = r1.h
                return r0
        }

        @Override // rx.subjects.d.a
        public void error(java.lang.Throwable r1) {
                r0 = this;
                r0.b()
                r0.h = r1
                r1 = 1
                r0.g = r1
                return
        }

        @Override // rx.subjects.d.a
        public boolean isComplete() {
                r1 = this;
                boolean r0 = r1.g
                return r0
        }

        @Override // rx.subjects.d.a
        public boolean isEmpty() {
                r1 = this;
                rx.subjects.d$c$a r0 = r1.c()
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // rx.subjects.d.a
        public T last() {
                r2 = this;
                rx.subjects.d$c$a r0 = r2.c()
            L4:
                java.lang.Object r1 = r0.get()
                rx.subjects.d$c$a r1 = (rx.subjects.d.c.a) r1
                if (r1 == 0) goto Le
                r0 = r1
                goto L4
            Le:
                T r0 = r0.a
                return r0
        }

        @Override // rx.subjects.d.a
        public void next(T r9) {
                r8 = this;
                rx.h r0 = r8.c
                long r0 = r0.b()
                rx.subjects.d$c$a r2 = new rx.subjects.d$c$a
                r2.<init>(r9, r0)
                rx.subjects.d$c$a<T> r9 = r8.e
                r9.set(r2)
                r8.e = r2
                long r2 = r8.b
                long r0 = r0 - r2
                int r9 = r8.f
                rx.subjects.d$c$a<T> r2 = r8.d
                int r3 = r8.a
                if (r9 != r3) goto L24
                java.lang.Object r3 = r2.get()
                rx.subjects.d$c$a r3 = (rx.subjects.d.c.a) r3
                goto L27
            L24:
                int r9 = r9 + 1
                r3 = r2
            L27:
                java.lang.Object r4 = r3.get()
                rx.subjects.d$c$a r4 = (rx.subjects.d.c.a) r4
                if (r4 == 0) goto L3a
                long r5 = r4.b
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 <= 0) goto L36
                goto L3a
            L36:
                int r9 = r9 + (-1)
                r3 = r4
                goto L27
            L3a:
                r8.f = r9
                if (r3 == r2) goto L40
                r8.d = r3
            L40:
                return
        }

        @Override // rx.subjects.d.a
        public int size() {
                r3 = this;
                rx.subjects.d$c$a r0 = r3.c()
                java.lang.Object r0 = r0.get()
                rx.subjects.d$c$a r0 = (rx.subjects.d.c.a) r0
                r1 = 0
            Lb:
                if (r0 == 0) goto L1b
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L1b
                java.lang.Object r0 = r0.get()
                rx.subjects.d$c$a r0 = (rx.subjects.d.c.a) r0
                int r1 = r1 + 1
                goto Lb
            L1b:
                return r1
        }

        @Override // rx.subjects.d.a
        public T[] toArray(T[] r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                rx.subjects.d$c$a r1 = r3.c()
                java.lang.Object r1 = r1.get()
                rx.subjects.d$c$a r1 = (rx.subjects.d.c.a) r1
            Lf:
                if (r1 == 0) goto L1d
                T r2 = r1.a
                r0.add(r2)
                java.lang.Object r1 = r1.get()
                rx.subjects.d$c$a r1 = (rx.subjects.d.c.a) r1
                goto Lf
            L1d:
                java.lang.Object[] r4 = r0.toArray(r4)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.subjects.d$d, reason: collision with other inner class name */
    static final class C0055d<T> implements rx.subjects.d.a<T> {
        final int a;
        volatile rx.subjects.d.C0055d.a<T> b;
        rx.subjects.d.C0055d.a<T> c;
        int d;
        volatile boolean e;
        java.lang.Throwable f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.subjects.d$d$a */
        static final class a<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.d.C0055d.a<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T a;

            public a(T r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }
        }

        public C0055d(int r2) {
                r1 = this;
                r1.<init>()
                r1.a = r2
                rx.subjects.d$d$a r2 = new rx.subjects.d$d$a
                r0 = 0
                r2.<init>(r0)
                r1.c = r2
                r1.b = r2
                return
        }

        @Override // rx.subjects.d.a
        public void a(rx.subjects.d.b<T> r18) {
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r1.getAndIncrement()
                if (r2 == 0) goto Lc
                goto La0
            Lc:
                rx.l<? super T> r2 = r1.a
                r4 = 1
            Lf:
                java.util.concurrent.atomic.AtomicLong r5 = r1.b
                long r5 = r5.get()
                java.lang.Object r7 = r1.f
                rx.subjects.d$d$a r7 = (rx.subjects.d.C0055d.a) r7
                r8 = 0
                if (r7 != 0) goto L1f
                rx.subjects.d$d$a<T> r7 = r0.b
            L1f:
                r10 = r8
            L20:
                r12 = 0
                r13 = 0
                int r14 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r14 == 0) goto L5f
                boolean r15 = r2.isUnsubscribed()
                if (r15 == 0) goto L2f
                r1.f = r13
                return
            L2f:
                boolean r15 = r0.e
                java.lang.Object r16 = r7.get()
                r3 = r16
                rx.subjects.d$d$a r3 = (rx.subjects.d.C0055d.a) r3
                if (r3 != 0) goto L3e
                r16 = 1
                goto L40
            L3e:
                r16 = 0
            L40:
                if (r15 == 0) goto L52
                if (r16 == 0) goto L52
                r1.f = r13
                java.lang.Throwable r1 = r0.f
                if (r1 == 0) goto L4e
                r2.onError(r1)
                return
            L4e:
                r2.onCompleted()
                return
            L52:
                if (r16 == 0) goto L55
                goto L5f
            L55:
                T r7 = r3.a
                r2.onNext(r7)
                r12 = 1
                long r10 = r10 + r12
                r7 = r3
                goto L20
            L5f:
                if (r14 != 0) goto L85
                boolean r3 = r2.isUnsubscribed()
                if (r3 == 0) goto L6a
                r1.f = r13
                return
            L6a:
                boolean r3 = r0.e
                java.lang.Object r14 = r7.get()
                if (r14 != 0) goto L73
                r12 = 1
            L73:
                if (r3 == 0) goto L85
                if (r12 == 0) goto L85
                r1.f = r13
                java.lang.Throwable r1 = r0.f
                if (r1 == 0) goto L81
                r2.onError(r1)
                return
            L81:
                r2.onCompleted()
                return
            L85:
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L97
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r3 == 0) goto L97
                java.util.concurrent.atomic.AtomicLong r3 = r1.b
                rx.internal.operators.a.i(r3, r10)
            L97:
                r1.f = r7
                int r3 = -r4
                int r4 = r1.addAndGet(r3)
                if (r4 != 0) goto Lf
            La0:
                return
        }

        @Override // rx.subjects.d.a
        public void complete() {
                r1 = this;
                r0 = 1
                r1.e = r0
                return
        }

        @Override // rx.subjects.d.a
        public java.lang.Throwable error() {
                r1 = this;
                java.lang.Throwable r0 = r1.f
                return r0
        }

        @Override // rx.subjects.d.a
        public void error(java.lang.Throwable r1) {
                r0 = this;
                r0.f = r1
                r1 = 1
                r0.e = r1
                return
        }

        @Override // rx.subjects.d.a
        public boolean isComplete() {
                r1 = this;
                boolean r0 = r1.e
                return r0
        }

        @Override // rx.subjects.d.a
        public boolean isEmpty() {
                r1 = this;
                rx.subjects.d$d$a<T> r0 = r1.b
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // rx.subjects.d.a
        public T last() {
                r2 = this;
                rx.subjects.d$d$a<T> r0 = r2.b
            L2:
                java.lang.Object r1 = r0.get()
                rx.subjects.d$d$a r1 = (rx.subjects.d.C0055d.a) r1
                if (r1 == 0) goto Lc
                r0 = r1
                goto L2
            Lc:
                T r0 = r0.a
                return r0
        }

        @Override // rx.subjects.d.a
        public void next(T r2) {
                r1 = this;
                rx.subjects.d$d$a r0 = new rx.subjects.d$d$a
                r0.<init>(r2)
                rx.subjects.d$d$a<T> r2 = r1.c
                r2.set(r0)
                r1.c = r0
                int r2 = r1.d
                int r0 = r1.a
                if (r2 != r0) goto L1d
                rx.subjects.d$d$a<T> r2 = r1.b
                java.lang.Object r2 = r2.get()
                rx.subjects.d$d$a r2 = (rx.subjects.d.C0055d.a) r2
                r1.b = r2
                return
            L1d:
                int r2 = r2 + 1
                r1.d = r2
                return
        }

        @Override // rx.subjects.d.a
        public int size() {
                r3 = this;
                rx.subjects.d$d$a<T> r0 = r3.b
                java.lang.Object r0 = r0.get()
                rx.subjects.d$d$a r0 = (rx.subjects.d.C0055d.a) r0
                r1 = 0
            L9:
                if (r0 == 0) goto L19
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L19
                java.lang.Object r0 = r0.get()
                rx.subjects.d$d$a r0 = (rx.subjects.d.C0055d.a) r0
                int r1 = r1 + 1
                goto L9
            L19:
                return r1
        }

        @Override // rx.subjects.d.a
        public T[] toArray(T[] r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                rx.subjects.d$d$a<T> r1 = r3.b
                java.lang.Object r1 = r1.get()
                rx.subjects.d$d$a r1 = (rx.subjects.d.C0055d.a) r1
            Ld:
                if (r1 == 0) goto L1b
                T r2 = r1.a
                r0.add(r2)
                java.lang.Object r1 = r1.get()
                rx.subjects.d$d$a r1 = (rx.subjects.d.C0055d.a) r1
                goto Ld
            L1b:
                java.lang.Object[] r4 = r0.toArray(r4)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.d.b<T>[]> implements rx.e.a<T>, rx.f<T> {
        static final rx.subjects.d.b[] b = null;
        static final rx.subjects.d.b[] c = null;
        private static final long serialVersionUID = 5952362471246910544L;
        final rx.subjects.d.a<T> a;

        static {
                r0 = 0
                rx.subjects.d$b[] r1 = new rx.subjects.d.b[r0]
                rx.subjects.d.e.b = r1
                rx.subjects.d$b[] r0 = new rx.subjects.d.b[r0]
                rx.subjects.d.e.c = r0
                return
        }

        public e(rx.subjects.d.a<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                rx.subjects.d$b[] r1 = rx.subjects.d.e.b
                r0.lazySet(r1)
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r2) {
                r1 = this;
                rx.subjects.d$b r0 = new rx.subjects.d$b
                r0.<init>(r2, r1)
                r2.add(r0)
                r2.setProducer(r0)
                boolean r2 = r1.d(r0)
                if (r2 == 0) goto L1b
                boolean r2 = r0.isUnsubscribed()
                if (r2 == 0) goto L1b
                r1.f(r0)
                return
            L1b:
                rx.subjects.d$a<T> r2 = r1.a
                r2.a(r0)
                return
        }

        boolean d(rx.subjects.d.b<T> r5) {
                r4 = this;
            L0:
                java.lang.Object r0 = r4.get()
                rx.subjects.d$b[] r0 = (rx.subjects.d.b[]) r0
                rx.subjects.d$b[] r1 = rx.subjects.d.e.c
                r2 = 0
                if (r0 != r1) goto Lc
                return r2
            Lc:
                int r1 = r0.length
                int r3 = r1 + 1
                rx.subjects.d$b[] r3 = new rx.subjects.d.b[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                boolean r0 = r4.compareAndSet(r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        boolean e() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                rx.subjects.d$b[] r1 = rx.subjects.d.e.c
                if (r0 != r1) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        void f(rx.subjects.d.b<T> r7) {
                r6 = this;
            L0:
                java.lang.Object r0 = r6.get()
                rx.subjects.d$b[] r0 = (rx.subjects.d.b[]) r0
                rx.subjects.d$b[] r1 = rx.subjects.d.e.c
                if (r0 == r1) goto L3b
                rx.subjects.d$b[] r1 = rx.subjects.d.e.b
                if (r0 != r1) goto Lf
                goto L3b
            Lf:
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L12:
                if (r3 >= r1) goto L1c
                r4 = r0[r3]
                if (r4 != r7) goto L19
                goto L1d
            L19:
                int r3 = r3 + 1
                goto L12
            L1c:
                r3 = -1
            L1d:
                if (r3 >= 0) goto L20
                goto L3b
            L20:
                r4 = 1
                if (r1 != r4) goto L26
                rx.subjects.d$b[] r1 = rx.subjects.d.e.b
                goto L35
            L26:
                int r5 = r1 + (-1)
                rx.subjects.d$b[] r5 = new rx.subjects.d.b[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L35:
                boolean r0 = r6.compareAndSet(r0, r1)
                if (r0 == 0) goto L0
            L3b:
                return
        }

        public void onCompleted() {
                r5 = this;
                rx.subjects.d$a<T> r0 = r5.a
                r0.complete()
                rx.subjects.d$b[] r1 = rx.subjects.d.e.c
                java.lang.Object r1 = r5.getAndSet(r1)
                rx.subjects.d$b[] r1 = (rx.subjects.d.b[]) r1
                int r2 = r1.length
                r3 = 0
            Lf:
                if (r3 >= r2) goto L19
                r4 = r1[r3]
                r0.a(r4)
                int r3 = r3 + 1
                goto Lf
            L19:
                return
        }

        public void onError(java.lang.Throwable r6) {
                r5 = this;
                rx.subjects.d$a<T> r0 = r5.a
                r0.error(r6)
                rx.subjects.d$b[] r6 = rx.subjects.d.e.c
                java.lang.Object r6 = r5.getAndSet(r6)
                rx.subjects.d$b[] r6 = (rx.subjects.d.b[]) r6
                int r1 = r6.length
                r2 = 0
                r3 = 0
            L10:
                if (r3 >= r1) goto L26
                r4 = r6[r3]
                r0.a(r4)     // Catch: java.lang.Throwable -> L18
                goto L23
            L18:
                r4 = move-exception
                if (r2 != 0) goto L20
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
            L20:
                r2.add(r4)
            L23:
                int r3 = r3 + 1
                goto L10
            L26:
                rx.exceptions.a.d(r2)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                rx.subjects.d$a<T> r0 = r4.a
                r0.next(r5)
                java.lang.Object r5 = r4.get()
                rx.subjects.d$b[] r5 = (rx.subjects.d.b[]) r5
                int r1 = r5.length
                r2 = 0
            Ld:
                if (r2 >= r1) goto L17
                r3 = r5[r2]
                r0.a(r3)
                int r2 = r2 + 1
                goto Ld
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f<T> implements rx.subjects.d.a<T> {
        final int a;
        volatile int b;
        final java.lang.Object[] c;
        java.lang.Object[] d;
        int e;
        volatile boolean f;
        java.lang.Throwable g;

        public f(int r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                int r1 = r1 + 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.c = r1
                r0.d = r1
                return
        }

        @Override // rx.subjects.d.a
        public void a(rx.subjects.d.b<T> r21) {
                r20 = this;
                r0 = r20
                r1 = r21
                int r2 = r1.getAndIncrement()
                if (r2 == 0) goto Lc
                goto Lb0
            Lc:
                rx.l<? super T> r2 = r1.a
                int r3 = r0.a
                r5 = 1
            L11:
                java.util.concurrent.atomic.AtomicLong r6 = r1.b
                long r6 = r6.get()
                java.lang.Object r8 = r1.f
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                if (r8 != 0) goto L1f
                java.lang.Object[] r8 = r0.c
            L1f:
                int r9 = r1.e
                int r10 = r1.d
                r13 = 0
            L25:
                r15 = 0
                r16 = 1
                r4 = 0
                int r17 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r17 == 0) goto L6b
                boolean r18 = r2.isUnsubscribed()
                if (r18 == 0) goto L36
                r1.f = r4
                return
            L36:
                r18 = 0
                boolean r11 = r0.f
                int r12 = r0.b
                if (r10 != r12) goto L40
                r12 = 1
                goto L41
            L40:
                r12 = 0
            L41:
                if (r11 == 0) goto L53
                if (r12 == 0) goto L53
                r1.f = r4
                java.lang.Throwable r1 = r0.g
                if (r1 == 0) goto L4f
                r2.onError(r1)
                return
            L4f:
                r2.onCompleted()
                return
            L53:
                if (r12 == 0) goto L56
                goto L6d
            L56:
                if (r9 != r3) goto L5e
                r4 = r8[r9]
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                r8 = r4
                r9 = 0
            L5e:
                r4 = r8[r9]
                r2.onNext(r4)
                r11 = 1
                long r13 = r13 + r11
                int r9 = r9 + 1
                int r10 = r10 + 1
                goto L25
            L6b:
                r18 = 0
            L6d:
                if (r17 != 0) goto L91
                boolean r11 = r2.isUnsubscribed()
                if (r11 == 0) goto L78
                r1.f = r4
                return
            L78:
                boolean r11 = r0.f
                int r12 = r0.b
                if (r10 != r12) goto L7f
                r15 = 1
            L7f:
                if (r11 == 0) goto L91
                if (r15 == 0) goto L91
                r1.f = r4
                java.lang.Throwable r1 = r0.g
                if (r1 == 0) goto L8d
                r2.onError(r1)
                return
            L8d:
                r2.onCompleted()
                return
            L91:
                int r4 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
                if (r4 == 0) goto La3
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r4 == 0) goto La3
                java.util.concurrent.atomic.AtomicLong r4 = r1.b
                rx.internal.operators.a.i(r4, r13)
            La3:
                r1.d = r10
                r1.e = r9
                r1.f = r8
                int r4 = -r5
                int r5 = r1.addAndGet(r4)
                if (r5 != 0) goto L11
            Lb0:
                return
        }

        @Override // rx.subjects.d.a
        public void complete() {
                r1 = this;
                r0 = 1
                r1.f = r0
                return
        }

        @Override // rx.subjects.d.a
        public java.lang.Throwable error() {
                r1 = this;
                java.lang.Throwable r0 = r1.g
                return r0
        }

        @Override // rx.subjects.d.a
        public void error(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.f
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                r1.g = r2
                r2 = 1
                r1.f = r2
                return
        }

        @Override // rx.subjects.d.a
        public boolean isComplete() {
                r1 = this;
                boolean r0 = r1.f
                return r0
        }

        @Override // rx.subjects.d.a
        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.b
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // rx.subjects.d.a
        public T last() {
                r3 = this;
                int r0 = r3.b
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.Object[] r1 = r3.c
                int r2 = r3.a
            La:
                if (r0 < r2) goto L12
                r1 = r1[r2]
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                int r0 = r0 - r2
                goto La
            L12:
                int r0 = r0 + (-1)
                r0 = r1[r0]
                return r0
        }

        @Override // rx.subjects.d.a
        public void next(T r6) {
                r5 = this;
                boolean r0 = r5.f
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r5.e
                java.lang.Object[] r1 = r5.d
                int r2 = r1.length
                r3 = 1
                int r2 = r2 - r3
                if (r0 != r2) goto L1b
                int r2 = r1.length
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r4 = 0
                r2[r4] = r6
                r5.e = r3
                r1[r0] = r2
                r5.d = r2
                goto L20
            L1b:
                r1[r0] = r6
                int r0 = r0 + r3
                r5.e = r0
            L20:
                int r6 = r5.b
                int r6 = r6 + r3
                r5.b = r6
                return
        }

        @Override // rx.subjects.d.a
        public int size() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @Override // rx.subjects.d.a
        public T[] toArray(T[] r7) {
                r6 = this;
                int r0 = r6.b
                int r1 = r7.length
                if (r1 >= r0) goto L13
                java.lang.Class r7 = r7.getClass()
                java.lang.Class r7 = r7.getComponentType()
                java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r0)
                java.lang.Object[] r7 = (java.lang.Object[]) r7
            L13:
                java.lang.Object[] r1 = r6.c
                int r2 = r6.a
                r3 = 0
                r4 = 0
            L19:
                int r5 = r4 + r2
                if (r5 >= r0) goto L26
                java.lang.System.arraycopy(r1, r3, r7, r4, r2)
                r1 = r1[r2]
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r4 = r5
                goto L19
            L26:
                int r2 = r0 - r4
                java.lang.System.arraycopy(r1, r3, r7, r4, r2)
                int r1 = r7.length
                if (r1 <= r0) goto L31
                r1 = 0
                r7[r0] = r1
            L31:
                return r7
        }
    }

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            rx.subjects.d.c = r0
            return
    }

    d(rx.subjects.d.e<T> r1) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r1
            return
    }

    static <T> rx.subjects.d<T> A7() {
            rx.subjects.d$d r0 = new rx.subjects.d$d
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r1)
            rx.subjects.d$e r1 = new rx.subjects.d$e
            r1.<init>(r0)
            rx.subjects.d r0 = new rx.subjects.d
            r0.<init>(r1)
            return r0
    }

    static <T> rx.subjects.d<T> B7() {
            rx.subjects.d$c r0 = new rx.subjects.d$c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            rx.h r3 = rx.schedulers.c.d()
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r4, r1, r3)
            rx.subjects.d$e r1 = new rx.subjects.d$e
            r1.<init>(r0)
            rx.subjects.d r0 = new rx.subjects.d
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.subjects.d<T> C7(int r1) {
            rx.subjects.d$d r0 = new rx.subjects.d$d
            r0.<init>(r1)
            rx.subjects.d$e r1 = new rx.subjects.d$e
            r1.<init>(r0)
            rx.subjects.d r0 = new rx.subjects.d
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.subjects.d<T> D7(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            rx.subjects.d r1 = E7(r1, r3, r0, r4)
            return r1
    }

    public static <T> rx.subjects.d<T> E7(long r1, java.util.concurrent.TimeUnit r3, int r4, rx.h r5) {
            rx.subjects.d$c r0 = new rx.subjects.d$c
            long r1 = r3.toMillis(r1)
            r0.<init>(r4, r1, r5)
            rx.subjects.d$e r1 = new rx.subjects.d$e
            r1.<init>(r0)
            rx.subjects.d r2 = new rx.subjects.d
            r2.<init>(r1)
            return r2
    }

    public static <T> rx.subjects.d<T> y7() {
            r0 = 16
            rx.subjects.d r0 = z7(r0)
            return r0
    }

    public static <T> rx.subjects.d<T> z7(int r3) {
            if (r3 <= 0) goto L12
            rx.subjects.d$f r0 = new rx.subjects.d$f
            r0.<init>(r3)
            rx.subjects.d$e r3 = new rx.subjects.d$e
            r3.<init>(r0)
            rx.subjects.d r0 = new rx.subjects.d
            r0.<init>(r3)
            return r0
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "capacity > 0 required but it was "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public java.lang.Throwable F7() {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            boolean r0 = r0.e()
            if (r0 == 0) goto L11
            rx.subjects.d$e<T> r0 = r1.b
            rx.subjects.d$a<T> r0 = r0.a
            java.lang.Throwable r0 = r0.error()
            return r0
        L11:
            r0 = 0
            return r0
    }

    public T G7() {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            rx.subjects.d$a<T> r0 = r0.a
            java.lang.Object r0 = r0.last()
            return r0
    }

    public java.lang.Object[] H7() {
            r2 = this;
            java.lang.Object[] r0 = rx.subjects.d.c
            java.lang.Object[] r1 = r2.I7(r0)
            if (r1 != r0) goto Lc
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        Lc:
            return r1
    }

    public T[] I7(T[] r2) {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            rx.subjects.d$a<T> r0 = r0.a
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }

    public boolean J7() {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            rx.subjects.d$a<T> r0 = r0.a
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public boolean K7() {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            rx.subjects.d$e<T> r0 = r1.b
            rx.subjects.d$a<T> r0 = r0.a
            java.lang.Throwable r0 = r0.error()
            if (r0 != 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public boolean L7() {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            rx.subjects.d$e<T> r0 = r1.b
            rx.subjects.d$a<T> r0 = r0.a
            java.lang.Throwable r0 = r0.error()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public boolean M7() {
            r1 = this;
            boolean r0 = r1.J7()
            return r0
    }

    public int N7() {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            rx.subjects.d$a<T> r0 = r0.a
            int r0 = r0.size()
            return r0
    }

    int O7() {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            java.lang.Object r0 = r0.get()
            rx.subjects.d$b[] r0 = (rx.subjects.d.b[]) r0
            int r0 = r0.length
            return r0
    }

    public void onCompleted() {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            r0.onCompleted()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            r0.onError(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            r0.onNext(r2)
            return
    }

    @Override // rx.subjects.f
    public boolean w7() {
            r1 = this;
            rx.subjects.d$e<T> r0 = r1.b
            java.lang.Object r0 = r0.get()
            rx.subjects.d$b[] r0 = (rx.subjects.d.b[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
