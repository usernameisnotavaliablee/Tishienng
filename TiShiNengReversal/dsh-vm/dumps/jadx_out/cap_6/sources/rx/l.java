package rx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class l<T> implements rx.f<T>, rx.m {
    private static final long NOT_SET = Long.MIN_VALUE;
    private rx.g producer;
    private long requested;
    private final rx.l<?> subscriber;
    private final rx.internal.util.m subscriptions;

    protected l() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    protected l(rx.l<?> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    protected l(rx.l<?> r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r0 = -9223372036854775808
            r2.requested = r0
            r2.subscriber = r3
            if (r4 == 0) goto L10
            if (r3 == 0) goto L10
            rx.internal.util.m r3 = r3.subscriptions
            goto L15
        L10:
            rx.internal.util.m r3 = new rx.internal.util.m
            r3.<init>()
        L15:
            r2.subscriptions = r3
            return
    }

    private void f(long r6) {
            r5 = this;
            long r0 = r5.requested
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r5.requested = r6
            return
        Lb:
            long r0 = r0 + r6
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L1a
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.requested = r6
            return
        L1a:
            r5.requested = r0
            return
    }

    public final void add(rx.m r2) {
            r1 = this;
            rx.internal.util.m r0 = r1.subscriptions
            r0.a(r2)
            return
    }

    @Override // rx.m
    public final boolean isUnsubscribed() {
            r1 = this;
            rx.internal.util.m r0 = r1.subscriptions
            boolean r0 = r0.isUnsubscribed()
            return r0
    }

    public void onStart() {
            r0 = this;
            return
    }

    protected final void request(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L19
            monitor-enter(r3)
            rx.g r0 = r3.producer     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            r0.request(r4)
            return
        L10:
            r4 = move-exception
            goto L17
        L12:
            r3.f(r4)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            return
        L17:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r4
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "number requested cannot be negative: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setProducer(rx.g r7) {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.requested     // Catch: java.lang.Throwable -> L2a
            r6.producer = r7     // Catch: java.lang.Throwable -> L2a
            rx.l<?> r2 = r6.subscriber     // Catch: java.lang.Throwable -> L2a
            r3 = -9223372036854775808
            if (r2 == 0) goto L11
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L11
            r5 = 1
            goto L12
        L11:
            r5 = 0
        L12:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L19
            r2.setProducer(r7)
            return
        L19:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L26
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7.request(r0)
            return
        L26:
            r7.request(r0)
            return
        L2a:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            throw r7
    }

    @Override // rx.m
    public final void unsubscribe() {
            r1 = this;
            rx.internal.util.m r0 = r1.subscriptions
            r0.unsubscribe()
            return
    }
}
