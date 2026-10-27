package rx.internal.producers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a implements rx.g {
    static final rx.g g = null;
    long a;
    rx.g b;
    boolean c;
    long d;
    long e;
    rx.g f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.internal.producers.a$a, reason: collision with other inner class name */
    static class C0035a implements rx.g {
        C0035a() {
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
            rx.internal.producers.a$a r0 = new rx.internal.producers.a$a
            r0.<init>()
            rx.internal.producers.a.g = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public void a() {
            r14 = this;
        L0:
            monitor-enter(r14)
            long r0 = r14.d     // Catch: java.lang.Throwable -> L18
            long r2 = r14.e     // Catch: java.lang.Throwable -> L18
            rx.g r4 = r14.f     // Catch: java.lang.Throwable -> L18
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L1a
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 != 0) goto L1a
            if (r4 != 0) goto L1a
            r0 = 0
            r14.c = r0     // Catch: java.lang.Throwable -> L18
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            goto L63
        L1a:
            r14.d = r5     // Catch: java.lang.Throwable -> L18
            r14.e = r5     // Catch: java.lang.Throwable -> L18
            r8 = 0
            r14.f = r8     // Catch: java.lang.Throwable -> L18
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L18
            long r9 = r14.a
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L4a
            long r9 = r9 + r0
            int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r13 < 0) goto L47
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L37
            goto L47
        L37:
            long r9 = r9 - r2
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 < 0) goto L3f
            r14.a = r9
            goto L4a
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "more produced than requested"
            r0.<init>(r1)
            throw r0
        L47:
            r14.a = r11
            r9 = r11
        L4a:
            if (r4 == 0) goto L59
            rx.g r0 = rx.internal.producers.a.g
            if (r4 != r0) goto L53
            r14.b = r8
            goto L0
        L53:
            r14.b = r4
            r4.request(r9)
            goto L0
        L59:
            rx.g r2 = r14.b
            if (r2 == 0) goto L0
            if (r7 == 0) goto L0
            r2.request(r0)
            goto L0
        L63:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public void b(long r8) {
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L44
            monitor-enter(r7)
            boolean r2 = r7.c     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L14
            long r0 = r7.e     // Catch: java.lang.Throwable -> L12
            long r0 = r0 + r8
            r7.e = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r8 = move-exception
            goto L42
        L14:
            r2 = 1
            r7.c = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
            long r2 = r7.a     // Catch: java.lang.Throwable -> L2b
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            long r2 = r2 - r8
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 < 0) goto L2d
            r7.a = r2     // Catch: java.lang.Throwable -> L2b
            goto L35
        L2b:
            r8 = move-exception
            goto L39
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r9 = "more items arrived than were requested"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            throw r8     // Catch: java.lang.Throwable -> L2b
        L35:
            r7.a()     // Catch: java.lang.Throwable -> L2b
            return
        L39:
            monitor-enter(r7)
            r9 = 0
            r7.c = r9     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            throw r8
        L3f:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            throw r8
        L42:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
            throw r8
        L44:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "n > 0 required"
            r8.<init>(r9)
            throw r8
    }

    public void c(rx.g r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.c     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L10
            if (r3 != 0) goto Lc
            rx.g r3 = rx.internal.producers.a.g     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r3 = move-exception
            goto L2d
        Lc:
            r2.f = r3     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return
        L10:
            r0 = 1
            r2.c = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            r2.b = r3     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L20
            long r0 = r2.a     // Catch: java.lang.Throwable -> L1e
            r3.request(r0)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r3 = move-exception
            goto L24
        L20:
            r2.a()     // Catch: java.lang.Throwable -> L1e
            return
        L24:
            monitor-enter(r2)
            r0 = 0
            r2.c = r0     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3
        L2a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public void request(long r6) {
            r5 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L42
            if (r2 != 0) goto L9
            return
        L9:
            monitor-enter(r5)
            boolean r2 = r5.c     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            long r0 = r5.d     // Catch: java.lang.Throwable -> L15
            long r0 = r0 + r6
            r5.d = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r6 = move-exception
            goto L40
        L17:
            r2 = 1
            r5.c = r2     // Catch: java.lang.Throwable -> L15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15
            long r2 = r5.a     // Catch: java.lang.Throwable -> L31
            long r2 = r2 + r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L27
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L27:
            r5.a = r2     // Catch: java.lang.Throwable -> L31
            rx.g r0 = r5.b     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L33
            r0.request(r6)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r6 = move-exception
            goto L37
        L33:
            r5.a()     // Catch: java.lang.Throwable -> L31
            return
        L37:
            monitor-enter(r5)
            r7 = 0
            r5.c = r7     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            throw r6
        L3d:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            throw r6
        L40:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15
            throw r6
        L42:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "n >= 0 required"
            r6.<init>(r7)
            throw r6
    }
}
