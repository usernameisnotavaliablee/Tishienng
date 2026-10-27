package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i {
    public static final long a = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.a {
        long a;
        long b;
        long c;
        final /* synthetic */ long d;
        final /* synthetic */ long e;
        final /* synthetic */ rx.functions.a f;
        final /* synthetic */ rx.internal.subscriptions.SequentialSubscription g;
        final /* synthetic */ rx.internal.schedulers.i.b h;
        final /* synthetic */ rx.h.a i;
        final /* synthetic */ long j;

        a(long r1, long r3, rx.functions.a r5, rx.internal.subscriptions.SequentialSubscription r6, rx.internal.schedulers.i.b r7, rx.h.a r8, long r9) {
                r0 = this;
                r0.d = r1
                r0.e = r3
                r0.f = r5
                r0.g = r6
                r0.h = r7
                r0.i = r8
                r0.j = r9
                r0.<init>()
                r0.b = r1
                r0.c = r3
                return
        }

        public void call() {
                r11 = this;
                rx.functions.a r0 = r11.f
                r0.call()
                rx.internal.subscriptions.SequentialSubscription r0 = r11.g
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L62
                rx.internal.schedulers.i$b r0 = r11.h
                if (r0 == 0) goto L16
                long r0 = r0.a()
                goto L22
            L16:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                rx.h$a r1 = r11.i
                long r1 = r1.b()
                long r0 = r0.toNanos(r1)
            L22:
                long r2 = rx.internal.schedulers.i.a
                long r4 = r0 + r2
                long r6 = r11.b
                r8 = 1
                int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r10 < 0) goto L42
                long r4 = r11.j
                long r6 = r6 + r4
                long r6 = r6 + r2
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L37
                goto L42
            L37:
                long r2 = r11.c
                long r6 = r11.a
                long r6 = r6 + r8
                r11.a = r6
                long r6 = r6 * r4
                long r2 = r2 + r6
                goto L52
            L42:
                long r2 = r11.j
                long r4 = r0 + r2
                long r6 = r11.a
                long r6 = r6 + r8
                r11.a = r6
                long r2 = r2 * r6
                long r2 = r4 - r2
                r11.c = r2
                r2 = r4
            L52:
                r11.b = r0
                long r2 = r2 - r0
                rx.internal.subscriptions.SequentialSubscription r0 = r11.g
                rx.h$a r1 = r11.i
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
                rx.m r1 = r1.e(r11, r2, r4)
                r0.replace(r1)
            L62:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        long a();
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r1 = "rx.scheduler.drift-tolerance"
            r2 = 15
            java.lang.Long r1 = java.lang.Long.getLong(r1, r2)
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            rx.internal.schedulers.i.a = r0
            return
    }

    private i() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static rx.m a(rx.h.a r15, rx.functions.a r16, long r17, long r19, java.util.concurrent.TimeUnit r21, rx.internal.schedulers.i.b r22) {
            r0 = r17
            r2 = r21
            r3 = r19
            long r12 = r2.toNanos(r3)
            if (r22 == 0) goto L12
            long r3 = r22.a()
        L10:
            r4 = r3
            goto L1d
        L12:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r15.b()
            long r3 = r3.toNanos(r4)
            goto L10
        L1d:
            long r6 = r2.toNanos(r0)
            long r6 = r6 + r4
            rx.internal.subscriptions.SequentialSubscription r14 = new rx.internal.subscriptions.SequentialSubscription
            r14.<init>()
            rx.internal.subscriptions.SequentialSubscription r9 = new rx.internal.subscriptions.SequentialSubscription
            r9.<init>(r14)
            rx.internal.schedulers.i$a r3 = new rx.internal.schedulers.i$a
            r11 = r15
            r8 = r16
            r10 = r22
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)
            rx.m r15 = r15.e(r3, r0, r2)
            r14.replace(r15)
            return r9
    }
}
