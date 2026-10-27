package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class o2<T> implements rx.e.b<T, rx.e<? extends T>> {
    final boolean a;
    final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        static final rx.internal.operators.o2<java.lang.Object> a = null;

        static {
                rx.internal.operators.o2 r0 = new rx.internal.operators.o2
                r1 = 1
                r2 = 2147483647(0x7fffffff, float:NaN)
                r0.<init>(r1, r2)
                rx.internal.operators.o2.a.a = r0
                return
        }

        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        static final rx.internal.operators.o2<java.lang.Object> a = null;

        static {
                rx.internal.operators.o2 r0 = new rx.internal.operators.o2
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r0.<init>(r1, r2)
                rx.internal.operators.o2.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends rx.l<T> {
        static final int f = 0;
        final rx.internal.operators.o2.e<T> a;
        final long b;
        volatile boolean c;
        volatile rx.internal.util.j d;
        int e;

        static {
                int r0 = rx.internal.util.j.d
                int r0 = r0 / 4
                rx.internal.operators.o2.c.f = r0
                return
        }

        public c(rx.internal.operators.o2.e<T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public void g(long r2) {
                r1 = this;
                int r0 = r1.e
                int r3 = (int) r2
                int r0 = r0 - r3
                int r2 = rx.internal.operators.o2.c.f
                if (r0 <= r2) goto Lb
                r1.e = r0
                return
            Lb:
                int r2 = rx.internal.util.j.d
                r1.e = r2
                int r2 = r2 - r0
                if (r2 <= 0) goto L16
                long r2 = (long) r2
                r1.request(r2)
            L16:
                return
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.c = r0
                rx.internal.operators.o2$e<T> r0 = r1.a
                r0.s()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.o2$e<T> r0 = r1.a
                java.util.Queue r0 = r0.P()
                r0.offer(r2)
                r2 = 1
                r1.c = r2
                rx.internal.operators.o2$e<T> r2 = r1.a
                r2.s()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.internal.operators.o2$e<T> r0 = r1.a
                r0.X(r1, r2)
                return
        }

        public void onStart() {
                r2 = this;
                int r0 = rx.internal.util.j.d
                r2.e = r0
                long r0 = (long) r0
                r2.request(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g {
        private static final long serialVersionUID = -1214379189873595503L;
        final rx.internal.operators.o2.e<T> a;

        public d(rx.internal.operators.o2.e<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public long a(int r3) {
                r2 = this;
                int r3 = -r3
                long r0 = (long) r3
                long r0 = r2.addAndGet(r0)
                return r0
        }

        public void request(long r6) {
                r5 = this;
                r0 = 0
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 <= 0) goto L1d
                long r0 = r5.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L14
                goto L1f
            L14:
                rx.internal.operators.a.b(r5, r6)
                rx.internal.operators.o2$e<T> r6 = r5.a
                r6.s()
                return
            L1d:
                if (r2 < 0) goto L20
            L1f:
                return
            L20:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "n >= 0 required"
                r6.<init>(r7)
                throw r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e<T> extends rx.l<rx.e<? extends T>> {
        static final rx.internal.operators.o2.c<?>[] r = null;
        final rx.l<? super T> a;
        final boolean b;
        final int c;
        rx.internal.operators.o2.d<T> d;
        volatile java.util.Queue<java.lang.Object> e;
        volatile rx.subscriptions.b f;
        volatile java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> g;
        volatile boolean h;
        boolean i;
        boolean j;
        final java.lang.Object k;
        volatile rx.internal.operators.o2.c<?>[] l;
        long m;
        long n;
        int o;
        final int p;
        int q;

        static {
                r0 = 0
                rx.internal.operators.o2$c[] r0 = new rx.internal.operators.o2.c[r0]
                rx.internal.operators.o2.e.r = r0
                return
        }

        public e(rx.l<? super T> r1, boolean r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r0.k = r1
                rx.internal.operators.o2$c<?>[] r1 = rx.internal.operators.o2.e.r
                r0.l = r1
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r3 != r1) goto L24
                r0.p = r1
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.request(r1)
                return
            L24:
                int r1 = r3 >> 1
                r2 = 1
                int r1 = java.lang.Math.max(r2, r1)
                r0.p = r1
                long r1 = (long) r3
                r0.request(r1)
                return
        }

        private void U() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> r1 = r3.g
                r0.<init>(r1)
                int r1 = r0.size()
                r2 = 1
                if (r1 != r2) goto L1b
                rx.l<? super T> r1 = r3.a
                r2 = 0
                java.lang.Object r0 = r0.get(r2)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r1.onError(r0)
                return
            L1b:
                rx.l<? super T> r1 = r3.a
                rx.exceptions.CompositeException r2 = new rx.exceptions.CompositeException
                r2.<init>(r0)
                r1.onError(r2)
                return
        }

        void A() {
                r2 = this;
                int r0 = r2.q
                int r0 = r0 + 1
                int r1 = r2.p
                if (r0 != r1) goto L10
                r1 = 0
                r2.q = r1
                long r0 = (long) r0
                r2.V(r0)
                return
            L10:
                r2.q = r0
                return
        }

        void B() {
                r22 = this;
                r1 = r22
                r2 = 0
                rx.l<? super T> r3 = r1.a     // Catch: java.lang.Throwable -> L5c
            L5:
                boolean r0 = r1.j()     // Catch: java.lang.Throwable -> L5c
                if (r0 == 0) goto Lc
                return
            Lc:
                java.util.Queue<java.lang.Object> r4 = r1.e     // Catch: java.lang.Throwable -> L5c
                rx.internal.operators.o2$d<T> r0 = r1.d     // Catch: java.lang.Throwable -> L5c
                long r5 = r0.get()     // Catch: java.lang.Throwable -> L5c
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 != 0) goto L1f
                r10 = 1
                goto L20
            L1f:
                r10 = 0
            L20:
                r11 = 1
                r14 = 0
                if (r4 == 0) goto L97
                r0 = 0
            L27:
                r16 = r5
                r6 = 0
                r5 = r0
                r0 = 0
            L2c:
                int r18 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r18 <= 0) goto L75
                java.lang.Object r18 = r4.poll()     // Catch: java.lang.Throwable -> L5c
                boolean r0 = r1.j()     // Catch: java.lang.Throwable -> L5c
                if (r0 == 0) goto L3b
                return
            L3b:
                if (r18 != 0) goto L40
                r0 = r18
                goto L75
            L40:
                java.lang.Object r0 = rx.internal.operators.v.e(r18)     // Catch: java.lang.Throwable -> L5c
                r3.onNext(r0)     // Catch: java.lang.Throwable -> L48
                goto L67
            L48:
                r0 = move-exception
                boolean r7 = r1.b     // Catch: java.lang.Throwable -> L5c
                if (r7 != 0) goto L60
                rx.exceptions.a.e(r0)     // Catch: java.lang.Throwable -> L5c
                r1.unsubscribe()     // Catch: java.lang.Throwable -> L58
                r3.onError(r0)     // Catch: java.lang.Throwable -> L58
                goto L193
            L58:
                r0 = move-exception
                r9 = 1
                goto L1a4
            L5c:
                r0 = move-exception
                r9 = 0
                goto L1a4
            L60:
                java.util.Queue r7 = r1.P()     // Catch: java.lang.Throwable -> L5c
                r7.offer(r0)     // Catch: java.lang.Throwable -> L5c
            L67:
                int r5 = r5 + 1
                int r6 = r6 + 1
                long r16 = r16 - r11
                r0 = r18
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L2c
            L75:
                if (r6 <= 0) goto L87
                if (r10 == 0) goto L7f
                r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L87
            L7f:
                rx.internal.operators.o2$d<T> r7 = r1.d     // Catch: java.lang.Throwable -> L5c
                long r6 = r7.a(r6)     // Catch: java.lang.Throwable -> L5c
                r16 = r6
            L87:
                int r6 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r6 == 0) goto L9a
                if (r0 != 0) goto L8e
                goto L9a
            L8e:
                r0 = r5
                r5 = r16
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L27
            L97:
                r16 = r5
                r5 = 0
            L9a:
                boolean r0 = r1.h     // Catch: java.lang.Throwable -> L5c
                java.util.Queue<java.lang.Object> r4 = r1.e     // Catch: java.lang.Throwable -> L5c
                rx.internal.operators.o2$c<?>[] r6 = r1.l     // Catch: java.lang.Throwable -> L5c
                int r7 = r6.length     // Catch: java.lang.Throwable -> L5c
                if (r0 == 0) goto Lc0
                if (r4 == 0) goto Lab
                boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5c
                if (r0 == 0) goto Lc0
            Lab:
                if (r7 != 0) goto Lc0
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> r0 = r1.g     // Catch: java.lang.Throwable -> L5c
                if (r0 == 0) goto Lbc
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5c
                if (r0 == 0) goto Lb8
                goto Lbc
            Lb8:
                r1.U()     // Catch: java.lang.Throwable -> L5c
                goto Lbf
            Lbc:
                r3.onCompleted()     // Catch: java.lang.Throwable -> L5c
            Lbf:
                return
            Lc0:
                if (r7 <= 0) goto L180
                r4 = r10
                long r9 = r1.n     // Catch: java.lang.Throwable -> L5c
                int r0 = r1.o     // Catch: java.lang.Throwable -> L5c
                if (r7 <= r0) goto Ld4
                r8 = r6[r0]     // Catch: java.lang.Throwable -> L5c
                r19 = r11
                long r11 = r8.b     // Catch: java.lang.Throwable -> L5c
                int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r8 == 0) goto Lf5
                goto Ld6
            Ld4:
                r19 = r11
            Ld6:
                if (r7 > r0) goto Ld9
                r0 = 0
            Ld9:
                r8 = 0
            Lda:
                if (r8 >= r7) goto Led
                r11 = r6[r0]     // Catch: java.lang.Throwable -> L5c
                long r11 = r11.b     // Catch: java.lang.Throwable -> L5c
                int r21 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r21 != 0) goto Le5
                goto Led
            Le5:
                int r0 = r0 + 1
                if (r0 != r7) goto Lea
                r0 = 0
            Lea:
                int r8 = r8 + 1
                goto Lda
            Led:
                r1.o = r0     // Catch: java.lang.Throwable -> L5c
                r8 = r6[r0]     // Catch: java.lang.Throwable -> L5c
                long r8 = r8.b     // Catch: java.lang.Throwable -> L5c
                r1.n = r8     // Catch: java.lang.Throwable -> L5c
            Lf5:
                r8 = 0
                r9 = 0
            Lf7:
                if (r8 >= r7) goto L177
                boolean r10 = r1.j()     // Catch: java.lang.Throwable -> L5c
                if (r10 == 0) goto L100
                return
            L100:
                r10 = r6[r0]     // Catch: java.lang.Throwable -> L5c
                r11 = 0
            L103:
                r12 = 0
            L104:
                int r21 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r21 <= 0) goto L137
                boolean r21 = r1.j()     // Catch: java.lang.Throwable -> L5c
                if (r21 == 0) goto L10f
                return
            L10f:
                rx.internal.util.j r13 = r10.d     // Catch: java.lang.Throwable -> L5c
                if (r13 != 0) goto L114
                goto L137
            L114:
                java.lang.Object r11 = r13.R()     // Catch: java.lang.Throwable -> L5c
                if (r11 != 0) goto L11b
                goto L137
            L11b:
                java.lang.Object r13 = rx.internal.operators.v.e(r11)     // Catch: java.lang.Throwable -> L5c
                r3.onNext(r13)     // Catch: java.lang.Throwable -> L127
                long r16 = r16 - r19
                int r12 = r12 + 1
                goto L104
            L127:
                r0 = move-exception
                rx.exceptions.a.e(r0)     // Catch: java.lang.Throwable -> L58
                r3.onError(r0)     // Catch: java.lang.Throwable -> L132
                r1.unsubscribe()     // Catch: java.lang.Throwable -> L58
                goto L193
            L132:
                r0 = move-exception
                r1.unsubscribe()     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L137:
                if (r12 <= 0) goto L14b
                if (r4 != 0) goto L142
                rx.internal.operators.o2$d<T> r13 = r1.d     // Catch: java.lang.Throwable -> L5c
                long r16 = r13.a(r12)     // Catch: java.lang.Throwable -> L5c
                goto L147
            L142:
                r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L147:
                long r12 = (long) r12     // Catch: java.lang.Throwable -> L5c
                r10.g(r12)     // Catch: java.lang.Throwable -> L5c
            L14b:
                int r12 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r12 == 0) goto L151
                if (r11 != 0) goto L103
            L151:
                boolean r11 = r10.c     // Catch: java.lang.Throwable -> L5c
                rx.internal.util.j r13 = r10.d     // Catch: java.lang.Throwable -> L5c
                if (r11 == 0) goto L16c
                if (r13 == 0) goto L15f
                boolean r11 = r13.B()     // Catch: java.lang.Throwable -> L5c
                if (r11 == 0) goto L16c
            L15f:
                r1.T(r10)     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r1.j()     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L169
                return
            L169:
                int r5 = r5 + 1
                r9 = 1
            L16c:
                if (r12 != 0) goto L16f
                goto L177
            L16f:
                int r0 = r0 + 1
                if (r0 != r7) goto L174
                r0 = 0
            L174:
                int r8 = r8 + 1
                goto Lf7
            L177:
                r1.o = r0     // Catch: java.lang.Throwable -> L5c
                r0 = r6[r0]     // Catch: java.lang.Throwable -> L5c
                long r6 = r0.b     // Catch: java.lang.Throwable -> L5c
                r1.n = r6     // Catch: java.lang.Throwable -> L5c
                goto L181
            L180:
                r9 = 0
            L181:
                if (r5 <= 0) goto L187
                long r4 = (long) r5     // Catch: java.lang.Throwable -> L5c
                r1.request(r4)     // Catch: java.lang.Throwable -> L5c
            L187:
                if (r9 == 0) goto L18b
                goto L5
            L18b:
                monitor-enter(r22)     // Catch: java.lang.Throwable -> L5c
                boolean r0 = r1.j     // Catch: java.lang.Throwable -> L19c
                if (r0 != 0) goto L197
                r1.i = r2     // Catch: java.lang.Throwable -> L194
                monitor-exit(r22)     // Catch: java.lang.Throwable -> L194
            L193:
                return
            L194:
                r0 = move-exception
                r9 = 1
                goto L19e
            L197:
                r1.j = r2     // Catch: java.lang.Throwable -> L19c
                monitor-exit(r22)     // Catch: java.lang.Throwable -> L19c
                goto L5
            L19c:
                r0 = move-exception
                r9 = 0
            L19e:
                monitor-exit(r22)     // Catch: java.lang.Throwable -> L1a2
                throw r0     // Catch: java.lang.Throwable -> L1a0
            L1a0:
                r0 = move-exception
                goto L1a4
            L1a2:
                r0 = move-exception
                goto L19e
            L1a4:
                if (r9 != 0) goto L1ae
                monitor-enter(r22)
                r1.i = r2     // Catch: java.lang.Throwable -> L1ab
                monitor-exit(r22)     // Catch: java.lang.Throwable -> L1ab
                goto L1ae
            L1ab:
                r0 = move-exception
                monitor-exit(r22)     // Catch: java.lang.Throwable -> L1ab
                throw r0
            L1ae:
                throw r0
        }

        protected void G(T r5, long r6) {
                r4 = this;
                r0 = 1
                r1 = 0
                rx.l<? super T> r2 = r4.a     // Catch: java.lang.Throwable -> L8
                r2.onNext(r5)     // Catch: java.lang.Throwable -> L8
                goto L23
            L8:
                r5 = move-exception
                boolean r2 = r4.b     // Catch: java.lang.Throwable -> L19
                if (r2 != 0) goto L1c
                rx.exceptions.a.e(r5)     // Catch: java.lang.Throwable -> L19
                r4.unsubscribe()     // Catch: java.lang.Throwable -> L17
                r4.onError(r5)     // Catch: java.lang.Throwable -> L17
                goto L49
            L17:
                r5 = move-exception
                goto L55
            L19:
                r5 = move-exception
                r0 = 0
                goto L55
            L1c:
                java.util.Queue r2 = r4.P()     // Catch: java.lang.Throwable -> L19
                r2.offer(r5)     // Catch: java.lang.Throwable -> L19
            L23:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r5 == 0) goto L31
                rx.internal.operators.o2$d<T> r5 = r4.d     // Catch: java.lang.Throwable -> L19
                r5.a(r0)     // Catch: java.lang.Throwable -> L19
            L31:
                int r5 = r4.q     // Catch: java.lang.Throwable -> L19
                int r5 = r5 + r0
                int r6 = r4.p     // Catch: java.lang.Throwable -> L19
                if (r5 != r6) goto L3f
                r4.q = r1     // Catch: java.lang.Throwable -> L19
                long r5 = (long) r5     // Catch: java.lang.Throwable -> L19
                r4.V(r5)     // Catch: java.lang.Throwable -> L19
                goto L41
            L3f:
                r4.q = r5     // Catch: java.lang.Throwable -> L19
            L41:
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L19
                boolean r5 = r4.j     // Catch: java.lang.Throwable -> L4a
                if (r5 != 0) goto L4c
                r4.i = r1     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            L49:
                return
            L4a:
                r5 = move-exception
                goto L53
            L4c:
                r4.j = r1     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
                r4.B()
                return
            L53:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
                throw r5     // Catch: java.lang.Throwable -> L17
            L55:
                if (r0 != 0) goto L5f
                monitor-enter(r4)
                r4.i = r1     // Catch: java.lang.Throwable -> L5c
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L5c
                goto L5f
            L5c:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L5c
                throw r5
            L5f:
                throw r5
        }

        protected void H(rx.internal.operators.o2.c<T> r5, T r6, long r7) {
                r4 = this;
                r0 = 1
                r1 = 0
                rx.l<? super T> r2 = r4.a     // Catch: java.lang.Throwable -> L8
                r2.onNext(r6)     // Catch: java.lang.Throwable -> L8
                goto L23
            L8:
                r6 = move-exception
                boolean r2 = r4.b     // Catch: java.lang.Throwable -> L19
                if (r2 != 0) goto L1c
                rx.exceptions.a.e(r6)     // Catch: java.lang.Throwable -> L19
                r5.unsubscribe()     // Catch: java.lang.Throwable -> L17
                r5.onError(r6)     // Catch: java.lang.Throwable -> L17
                goto L3e
            L17:
                r5 = move-exception
                goto L4a
            L19:
                r5 = move-exception
                r0 = 0
                goto L4a
            L1c:
                java.util.Queue r2 = r4.P()     // Catch: java.lang.Throwable -> L19
                r2.offer(r6)     // Catch: java.lang.Throwable -> L19
            L23:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r6 == 0) goto L31
                rx.internal.operators.o2$d<T> r6 = r4.d     // Catch: java.lang.Throwable -> L19
                r6.a(r0)     // Catch: java.lang.Throwable -> L19
            L31:
                r6 = 1
                r5.g(r6)     // Catch: java.lang.Throwable -> L19
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L19
                boolean r5 = r4.j     // Catch: java.lang.Throwable -> L3f
                if (r5 != 0) goto L41
                r4.i = r1     // Catch: java.lang.Throwable -> L3f
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            L3e:
                return
            L3f:
                r5 = move-exception
                goto L48
            L41:
                r4.j = r1     // Catch: java.lang.Throwable -> L3f
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
                r4.B()
                return
            L48:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
                throw r5     // Catch: java.lang.Throwable -> L17
            L4a:
                if (r0 != 0) goto L54
                monitor-enter(r4)
                r4.i = r1     // Catch: java.lang.Throwable -> L51
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
                goto L54
            L51:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
                throw r5
            L54:
                throw r5
        }

        rx.subscriptions.b N() {
                r2 = this;
                rx.subscriptions.b r0 = r2.f
                if (r0 != 0) goto L1e
                monitor-enter(r2)
                rx.subscriptions.b r0 = r2.f     // Catch: java.lang.Throwable -> L12
                if (r0 != 0) goto L14
                rx.subscriptions.b r0 = new rx.subscriptions.b     // Catch: java.lang.Throwable -> L12
                r0.<init>()     // Catch: java.lang.Throwable -> L12
                r2.f = r0     // Catch: java.lang.Throwable -> L12
                r1 = 1
                goto L15
            L12:
                r0 = move-exception
                goto L1c
            L14:
                r1 = 0
            L15:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
                if (r1 == 0) goto L1b
                r2.add(r0)
            L1b:
                return r0
            L1c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
                throw r0
            L1e:
                return r0
        }

        java.util.Queue<java.lang.Throwable> P() {
                r1 = this;
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> r0 = r1.g
                if (r0 != 0) goto L17
                monitor-enter(r1)
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> r0 = r1.g     // Catch: java.lang.Throwable -> L11
                if (r0 != 0) goto L13
                java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch: java.lang.Throwable -> L11
                r0.<init>()     // Catch: java.lang.Throwable -> L11
                r1.g = r0     // Catch: java.lang.Throwable -> L11
                goto L13
            L11:
                r0 = move-exception
                goto L15
            L13:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
                return r0
            L15:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
                throw r0
            L17:
                return r0
        }

        public void Q(rx.e<? extends T> r6) {
                r5 = this;
                if (r6 != 0) goto L3
                return
            L3:
                rx.e r0 = rx.e.S1()
                if (r6 != r0) goto Ld
                r5.A()
                return
            Ld:
                boolean r0 = r6 instanceof rx.internal.util.k
                if (r0 == 0) goto L1b
                rx.internal.util.k r6 = (rx.internal.util.k) r6
                java.lang.Object r6 = r6.y7()
                r5.W(r6)
                return
            L1b:
                rx.internal.operators.o2$c r0 = new rx.internal.operators.o2$c
                long r1 = r5.m
                r3 = 1
                long r3 = r3 + r1
                r5.m = r3
                r0.<init>(r5, r1)
                r5.g(r0)
                r6.J6(r0)
                r5.s()
                return
        }

        protected void R(T r3) {
                r2 = this;
                java.util.Queue<java.lang.Object> r0 = r2.e
                if (r0 != 0) goto L34
                int r0 = r2.c
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L13
                rx.internal.util.atomic.g r0 = new rx.internal.util.atomic.g
                int r1 = rx.internal.util.j.d
                r0.<init>(r1)
                goto L32
            L13:
                boolean r1 = rx.internal.util.unsafe.p.a(r0)
                if (r1 == 0) goto L2c
                boolean r1 = rx.internal.util.unsafe.n0.f()
                if (r1 == 0) goto L26
                rx.internal.util.unsafe.z r1 = new rx.internal.util.unsafe.z
                r1.<init>(r0)
            L24:
                r0 = r1
                goto L32
            L26:
                rx.internal.util.atomic.d r1 = new rx.internal.util.atomic.d
                r1.<init>(r0)
                goto L24
            L2c:
                rx.internal.util.atomic.SpscExactAtomicArrayQueue r1 = new rx.internal.util.atomic.SpscExactAtomicArrayQueue
                r1.<init>(r0)
                goto L24
            L32:
                r2.e = r0
            L34:
                java.lang.Object r1 = rx.internal.operators.v.j(r3)
                boolean r0 = r0.offer(r1)
                if (r0 != 0) goto L4d
                r2.unsubscribe()
                rx.exceptions.MissingBackpressureException r0 = new rx.exceptions.MissingBackpressureException
                r0.<init>()
                java.lang.Throwable r3 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r0, r3)
                r2.onError(r3)
            L4d:
                return
        }

        protected void S(rx.internal.operators.o2.c<T> r2, T r3) {
                r1 = this;
                rx.internal.util.j r0 = r2.d
                if (r0 != 0) goto Ld
                rx.internal.util.j r0 = rx.internal.util.j.j()
                r2.add(r0)
                r2.d = r0
            Ld:
                java.lang.Object r3 = rx.internal.operators.v.j(r3)     // Catch: java.lang.IllegalStateException -> L15 rx.exceptions.MissingBackpressureException -> L17
                r0.P(r3)     // Catch: java.lang.IllegalStateException -> L15 rx.exceptions.MissingBackpressureException -> L17
                return
            L15:
                r3 = move-exception
                goto L19
            L17:
                r3 = move-exception
                goto L26
            L19:
                boolean r0 = r2.isUnsubscribed()
                if (r0 != 0) goto L2c
                r2.unsubscribe()
                r2.onError(r3)
                goto L2c
            L26:
                r2.unsubscribe()
                r2.onError(r3)
            L2c:
                return
        }

        void T(rx.internal.operators.o2.c<T> r7) {
                r6 = this;
                rx.internal.util.j r0 = r7.d
                if (r0 == 0) goto L7
                r0.S()
            L7:
                rx.subscriptions.b r0 = r6.f
                r0.f(r7)
                java.lang.Object r0 = r6.k
                monitor-enter(r0)
                rx.internal.operators.o2$c<?>[] r1 = r6.l     // Catch: java.lang.Throwable -> L22
                int r2 = r1.length     // Catch: java.lang.Throwable -> L22
                r3 = 0
                r4 = 0
            L14:
                if (r4 >= r2) goto L24
                r5 = r1[r4]     // Catch: java.lang.Throwable -> L22
                boolean r5 = r7.equals(r5)     // Catch: java.lang.Throwable -> L22
                if (r5 == 0) goto L1f
                goto L25
            L1f:
                int r4 = r4 + 1
                goto L14
            L22:
                r7 = move-exception
                goto L44
            L24:
                r4 = -1
            L25:
                if (r4 >= 0) goto L29
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return
            L29:
                r7 = 1
                if (r2 != r7) goto L32
                rx.internal.operators.o2$c<?>[] r7 = rx.internal.operators.o2.e.r     // Catch: java.lang.Throwable -> L22
                r6.l = r7     // Catch: java.lang.Throwable -> L22
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return
            L32:
                int r5 = r2 + (-1)
                rx.internal.operators.o2$c[] r5 = new rx.internal.operators.o2.c[r5]     // Catch: java.lang.Throwable -> L22
                java.lang.System.arraycopy(r1, r3, r5, r3, r4)     // Catch: java.lang.Throwable -> L22
                int r3 = r4 + 1
                int r2 = r2 - r4
                int r2 = r2 - r7
                java.lang.System.arraycopy(r1, r3, r5, r4, r2)     // Catch: java.lang.Throwable -> L22
                r6.l = r5     // Catch: java.lang.Throwable -> L22
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return
            L44:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                throw r7
        }

        public void V(long r1) {
                r0 = this;
                r0.request(r1)
                return
        }

        void W(T r7) {
                r6 = this;
                rx.internal.operators.o2$d<T> r0 = r6.d
                long r0 = r0.get()
                r2 = 0
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L26
                monitor-enter(r6)
                rx.internal.operators.o2$d<T> r0 = r6.d     // Catch: java.lang.Throwable -> L20
                long r0 = r0.get()     // Catch: java.lang.Throwable -> L20
                boolean r5 = r6.i     // Catch: java.lang.Throwable -> L20
                if (r5 != 0) goto L22
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L22
                r2 = 1
                r6.i = r2     // Catch: java.lang.Throwable -> L20
                goto L22
            L20:
                r7 = move-exception
                goto L24
            L22:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L20
                goto L26
            L24:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L20
                throw r7
            L26:
                if (r2 == 0) goto L3e
                java.util.Queue<java.lang.Object> r2 = r6.e
                if (r2 == 0) goto L3a
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L33
                goto L3a
            L33:
                r6.R(r7)
                r6.B()
                return
            L3a:
                r6.G(r7, r0)
                return
            L3e:
                r6.R(r7)
                r6.s()
                return
        }

        void X(rx.internal.operators.o2.c<T> r7, T r8) {
                r6 = this;
                rx.internal.operators.o2$d<T> r0 = r6.d
                long r0 = r0.get()
                r2 = 0
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L26
                monitor-enter(r6)
                rx.internal.operators.o2$d<T> r0 = r6.d     // Catch: java.lang.Throwable -> L20
                long r0 = r0.get()     // Catch: java.lang.Throwable -> L20
                boolean r5 = r6.i     // Catch: java.lang.Throwable -> L20
                if (r5 != 0) goto L22
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L22
                r2 = 1
                r6.i = r2     // Catch: java.lang.Throwable -> L20
                goto L22
            L20:
                r7 = move-exception
                goto L24
            L22:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L20
                goto L26
            L24:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L20
                throw r7
            L26:
                if (r2 == 0) goto L3e
                rx.internal.util.j r2 = r7.d
                if (r2 == 0) goto L3a
                boolean r2 = r2.B()
                if (r2 == 0) goto L33
                goto L3a
            L33:
                r6.S(r7, r8)
                r6.B()
                return
            L3a:
                r6.H(r7, r8, r0)
                return
            L3e:
                r6.S(r7, r8)
                r6.s()
                return
        }

        void g(rx.internal.operators.o2.c<T> r6) {
                r5 = this;
                rx.subscriptions.b r0 = r5.N()
                r0.a(r6)
                java.lang.Object r0 = r5.k
                monitor-enter(r0)
                rx.internal.operators.o2$c<?>[] r1 = r5.l     // Catch: java.lang.Throwable -> L1b
                int r2 = r1.length     // Catch: java.lang.Throwable -> L1b
                int r3 = r2 + 1
                rx.internal.operators.o2$c[] r3 = new rx.internal.operators.o2.c[r3]     // Catch: java.lang.Throwable -> L1b
                r4 = 0
                java.lang.System.arraycopy(r1, r4, r3, r4, r2)     // Catch: java.lang.Throwable -> L1b
                r3[r2] = r6     // Catch: java.lang.Throwable -> L1b
                r5.l = r3     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                return
            L1b:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                throw r6
        }

        boolean j() {
                r3 = this;
                rx.l<? super T> r0 = r3.a
                boolean r0 = r0.isUnsubscribed()
                r1 = 1
                if (r0 == 0) goto La
                return r1
            La:
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> r0 = r3.g
                boolean r2 = r3.b
                if (r2 != 0) goto L24
                if (r0 == 0) goto L24
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L24
                r3.U()     // Catch: java.lang.Throwable -> L1f
                r3.unsubscribe()
                return r1
            L1f:
                r0 = move-exception
                r3.unsubscribe()
                throw r0
            L24:
                r0 = 0
                return r0
        }

        public void onCompleted() {
                r1 = this;
                r0 = 1
                r1.h = r0
                r1.s()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.Queue r0 = r1.P()
                r0.offer(r2)
                r2 = 1
                r1.h = r2
                r1.s()
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = (rx.e) r1
                r0.Q(r1)
                return
        }

        void s() {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.i     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Lc
                r2.j = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto L13
            Lc:
                r2.i = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                r2.B()
                return
            L13:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La
                throw r0
        }
    }

    o2(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static <T> rx.internal.operators.o2<T> a(boolean r0) {
            if (r0 == 0) goto L5
            rx.internal.operators.o2<java.lang.Object> r0 = rx.internal.operators.o2.a.a
            return r0
        L5:
            rx.internal.operators.o2<java.lang.Object> r0 = rx.internal.operators.o2.b.a
            return r0
    }

    public static <T> rx.internal.operators.o2<T> b(boolean r2, int r3) {
            if (r3 <= 0) goto L12
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r0) goto Lc
            rx.internal.operators.o2 r2 = a(r2)
            return r2
        Lc:
            rx.internal.operators.o2 r0 = new rx.internal.operators.o2
            r0.<init>(r2, r3)
            return r0
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "maxConcurrent > 0 required but it was "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<rx.e<? extends T>> call(rx.l<? super T> r4) {
            r3 = this;
            rx.internal.operators.o2$e r0 = new rx.internal.operators.o2$e
            boolean r1 = r3.a
            int r2 = r3.b
            r0.<init>(r4, r1, r2)
            rx.internal.operators.o2$d r1 = new rx.internal.operators.o2$d
            r1.<init>(r0)
            r0.d = r1
            r4.add(r0)
            r4.setProducer(r1)
            return r0
    }
}
