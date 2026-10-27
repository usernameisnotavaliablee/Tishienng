package rx.internal.producers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b<T> implements rx.g, rx.f<T> {
    static final rx.g j = null;
    final rx.l<? super T> a;
    boolean b;
    java.util.List<T> c;
    rx.g d;
    long e;
    long f;
    rx.g g;
    java.lang.Object h;
    volatile boolean i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.g {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public void request(long r1) {
                r0 = this;
                return
        }
    }

    static {
            rx.internal.producers.b$a r0 = new rx.internal.producers.b$a
            r0.<init>()
            rx.internal.producers.b.j = r0
            return
    }

    public b(rx.l<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    void d() {
            r19 = this;
            r1 = r19
            rx.l<? super T> r2 = r1.a
            r3 = 0
            r0 = 0
            r7 = r0
            r5 = r3
        L9:
            monitor-enter(r19)
            long r8 = r1.f     // Catch: java.lang.Throwable -> L23
            rx.g r10 = r1.g     // Catch: java.lang.Throwable -> L23
            java.lang.Object r11 = r1.h     // Catch: java.lang.Throwable -> L23
            java.util.List<T> r12 = r1.c     // Catch: java.lang.Throwable -> L23
            r13 = 1
            r14 = 0
            int r15 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r15 != 0) goto L26
            if (r10 != 0) goto L26
            if (r12 != 0) goto L26
            if (r11 != 0) goto L26
            r1.b = r14     // Catch: java.lang.Throwable -> L23
            r16 = 1
            goto L30
        L23:
            r0 = move-exception
            goto Ld3
        L26:
            r1.f = r3     // Catch: java.lang.Throwable -> L23
            r1.g = r0     // Catch: java.lang.Throwable -> L23
            r1.c = r0     // Catch: java.lang.Throwable -> L23
            r1.h = r0     // Catch: java.lang.Throwable -> L23
            r16 = 0
        L30:
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L23
            if (r16 == 0) goto L3d
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L6f
            if (r7 == 0) goto L6f
            r7.request(r5)
            return
        L3d:
            if (r12 == 0) goto L47
            boolean r16 = r12.isEmpty()
            if (r16 == 0) goto L46
            goto L47
        L46:
            r13 = 0
        L47:
            if (r11 == 0) goto L59
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            if (r11 == r14) goto L53
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            r2.onError(r11)
            return
        L53:
            if (r13 == 0) goto L59
            r2.onCompleted()
            return
        L59:
            if (r12 == 0) goto L84
            java.util.Iterator r11 = r12.iterator()
        L5f:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L7e
            java.lang.Object r13 = r11.next()
            boolean r14 = r2.isUnsubscribed()
            if (r14 == 0) goto L70
        L6f:
            return
        L70:
            boolean r14 = r1.i
            if (r14 == 0) goto L75
            goto L9
        L75:
            r2.onNext(r13)     // Catch: java.lang.Throwable -> L79
            goto L5f
        L79:
            r0 = move-exception
            rx.exceptions.a.g(r0, r2, r13)
            return
        L7e:
            int r11 = r12.size()
            long r11 = (long) r11
            goto L85
        L84:
            r11 = r3
        L85:
            long r13 = r1.e
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 == 0) goto Lb1
            if (r15 == 0) goto L99
            long r13 = r13 + r8
            int r18 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r18 >= 0) goto L99
            r13 = r16
        L99:
            int r18 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r18 == 0) goto Laf
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 == 0) goto Laf
            long r13 = r13 - r11
            int r11 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r11 < 0) goto La7
            goto Laf
        La7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "More produced than requested"
            r0.<init>(r2)
            throw r0
        Laf:
            r1.e = r13
        Lb1:
            if (r10 == 0) goto Lc8
            rx.g r8 = rx.internal.producers.b.j
            if (r10 != r8) goto Lbb
            r1.d = r0
            goto L9
        Lbb:
            r1.d = r10
            int r8 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r8 == 0) goto L9
            long r5 = rx.internal.operators.a.a(r5, r13)
        Lc5:
            r7 = r10
            goto L9
        Lc8:
            rx.g r10 = r1.d
            if (r10 == 0) goto L9
            if (r15 == 0) goto L9
            long r5 = rx.internal.operators.a.a(r5, r8)
            goto Lc5
        Ld3:
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    public void onCompleted() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lb
            r1.h = r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            goto L17
        Ld:
            r0 = 1
            r1.b = r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            rx.l<? super T> r0 = r1.a
            r0.onCompleted()
            return
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public void onError(java.lang.Throwable r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.b     // Catch: java.lang.Throwable -> La
            r1 = 1
            if (r0 == 0) goto Lc
            r2.h = r3     // Catch: java.lang.Throwable -> La
            r0 = 0
            goto Lf
        La:
            r3 = move-exception
            goto L1b
        Lc:
            r2.b = r1     // Catch: java.lang.Throwable -> La
            r0 = 1
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L18
            rx.l<? super T> r0 = r2.a
            r0.onError(r3)
            return
        L18:
            r2.i = r1
            return
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public void onNext(T r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.b     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L19
            java.util.List<T> r0 = r4.c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
            r4.c = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r5 = move-exception
            goto L42
        L14:
            r0.add(r5)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L19:
            r0 = 1
            r4.b = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            rx.l<? super T> r0 = r4.a     // Catch: java.lang.Throwable -> L33
            r0.onNext(r5)     // Catch: java.lang.Throwable -> L33
            long r0 = r4.e     // Catch: java.lang.Throwable -> L33
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L35
            r2 = 1
            long r0 = r0 - r2
            r4.e = r0     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r5 = move-exception
            goto L39
        L35:
            r4.d()     // Catch: java.lang.Throwable -> L33
            return
        L39:
            monitor-enter(r4)
            r0 = 0
            r4.b = r0     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L3f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L42:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
    }

    public void request(long r7) {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L40
            if (r2 != 0) goto L9
            goto L33
        L9:
            monitor-enter(r6)
            boolean r2 = r6.b     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            long r0 = r6.f     // Catch: java.lang.Throwable -> L15
            long r0 = r0 + r7
            r6.f = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r7 = move-exception
            goto L3e
        L17:
            r2 = 1
            r6.b = r2     // Catch: java.lang.Throwable -> L15
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L15
            rx.g r2 = r6.d
            long r3 = r6.e     // Catch: java.lang.Throwable -> L34
            long r3 = r3 + r7
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L29
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L29:
            r6.e = r3     // Catch: java.lang.Throwable -> L34
            r6.d()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L33
            r2.request(r7)
        L33:
            return
        L34:
            r7 = move-exception
            monitor-enter(r6)
            r8 = 0
            r6.b = r8     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3b
            throw r7
        L3b:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3b
            throw r7
        L3e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L15
            throw r7
        L40:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "n >= 0 required"
            r7.<init>(r8)
            throw r7
    }

    public void setProducer(rx.g r6) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.b     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            if (r6 == 0) goto L8
            goto La
        L8:
            rx.g r6 = rx.internal.producers.b.j     // Catch: java.lang.Throwable -> Le
        La:
            r5.g = r6     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r6 = move-exception
            goto L31
        L10:
            r0 = 1
            r5.b = r0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            r5.d = r6
            long r0 = r5.e
            r5.d()     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L26
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L26
            r6.request(r0)
        L26:
            return
        L27:
            r6 = move-exception
            monitor-enter(r5)
            r0 = 0
            r5.b = r0     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
            throw r6
        L2e:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
            throw r6
        L31:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            throw r6
    }
}
