package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class BackpressureDrainManager extends java.util.concurrent.atomic.AtomicLong implements rx.g {
    private static final long serialVersionUID = 2826241102729529449L;
    final rx.internal.util.BackpressureDrainManager.a actual;
    boolean emitting;
    java.lang.Throwable exception;
    volatile boolean terminated;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean accept(java.lang.Object r1);

        void e(java.lang.Throwable r1);

        java.lang.Object peek();

        java.lang.Object poll();
    }

    public BackpressureDrainManager(rx.internal.util.BackpressureDrainManager.a r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            return
    }

    public void drain() {
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.emitting     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto La
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L96
        La:
            r0 = 1
            r13.emitting = r0     // Catch: java.lang.Throwable -> L7
            boolean r1 = r13.terminated     // Catch: java.lang.Throwable -> L7
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7
            long r2 = r13.get()
            r4 = 0
            rx.internal.util.BackpressureDrainManager$a r5 = r13.actual     // Catch: java.lang.Throwable -> L33
        L17:
            r6 = 0
        L18:
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 > 0) goto L20
            if (r1 == 0) goto L3c
        L20:
            if (r1 == 0) goto L36
            java.lang.Object r10 = r5.peek()     // Catch: java.lang.Throwable -> L33
            if (r10 != 0) goto L30
            java.lang.Throwable r1 = r13.exception     // Catch: java.lang.Throwable -> L2e
            r5.e(r1)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r1 = move-exception
            goto L8b
        L30:
            if (r9 != 0) goto L36
            goto L3c
        L33:
            r1 = move-exception
            r0 = 0
            goto L8b
        L36:
            java.lang.Object r9 = r5.poll()     // Catch: java.lang.Throwable -> L33
            if (r9 != 0) goto L7e
        L3c:
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L33
            boolean r1 = r13.terminated     // Catch: java.lang.Throwable -> L75
            java.lang.Object r2 = r5.peek()     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L47
            r2 = 1
            goto L48
        L47:
            r2 = 0
        L48:
            long r9 = r13.get()     // Catch: java.lang.Throwable -> L75
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L61
            if (r2 != 0) goto L5f
            if (r1 != 0) goto L5f
            r13.emitting = r4     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L5d
            return
        L5d:
            r1 = move-exception
            goto L7c
        L5f:
            r2 = r11
            goto L73
        L61:
            int r3 = -r6
            long r9 = (long) r3
            long r9 = r13.addAndGet(r9)     // Catch: java.lang.Throwable -> L75
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L6d
            if (r2 != 0) goto L72
        L6d:
            if (r1 == 0) goto L78
            if (r2 == 0) goto L72
            goto L78
        L72:
            r2 = r9
        L73:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L75
            goto L17
        L75:
            r1 = move-exception
            r0 = 0
            goto L7c
        L78:
            r13.emitting = r4     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L5d
            return
        L7c:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L5d
            throw r1     // Catch: java.lang.Throwable -> L2e
        L7e:
            boolean r7 = r5.accept(r9)     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L85
            return
        L85:
            r7 = 1
            long r2 = r2 - r7
            int r6 = r6 + 1
            goto L18
        L8b:
            if (r0 != 0) goto L95
            monitor-enter(r13)
            r13.emitting = r4     // Catch: java.lang.Throwable -> L92
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L92
            goto L95
        L92:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L92
            throw r0
        L95:
            throw r1
        L96:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    public boolean isTerminated() {
            r1 = this;
            boolean r0 = r1.terminated
            return r0
    }

    public void request(long r11) {
            r10 = this;
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            goto L3a
        L7:
            long r2 = r10.get()
            r4 = 1
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = 0
        L13:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L1d
            goto L35
        L1d:
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 != 0) goto L23
            r6 = r11
            goto L2e
        L23:
            long r8 = r6 - r11
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L2b
        L29:
            r4 = r5
            goto L2e
        L2b:
            long r6 = r2 + r11
            goto L29
        L2e:
            boolean r2 = r10.compareAndSet(r2, r6)
            if (r2 == 0) goto L7
            r5 = r4
        L35:
            if (r5 == 0) goto L3a
            r10.drain()
        L3a:
            return
    }

    public void terminate() {
            r1 = this;
            r0 = 1
            r1.terminated = r0
            return
    }

    public void terminate(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.terminated
            if (r0 != 0) goto L9
            r1.exception = r2
            r2 = 1
            r1.terminated = r2
        L9:
            return
    }

    public void terminateAndDrain() {
            r1 = this;
            r0 = 1
            r1.terminated = r0
            r1.drain()
            return
    }

    public void terminateAndDrain(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.terminated
            if (r0 != 0) goto Lc
            r1.exception = r2
            r2 = 1
            r1.terminated = r2
            r1.drain()
        Lc:
            return
    }
}
