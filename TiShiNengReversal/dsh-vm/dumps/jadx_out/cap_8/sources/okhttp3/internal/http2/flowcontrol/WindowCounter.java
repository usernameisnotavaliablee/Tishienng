package okhttp3.internal.http2.flowcontrol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class WindowCounter {
    private long acknowledged;
    private final int streamId;
    private long total;

    public WindowCounter(int r1) {
            r0 = this;
            r0.<init>()
            r0.streamId = r1
            return
    }

    public static /* synthetic */ void update$default(okhttp3.internal.http2.flowcontrol.WindowCounter r2, long r3, long r5, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            r0 = 0
            if (r8 == 0) goto L7
            r3 = r0
        L7:
            r7 = r7 & 2
            if (r7 == 0) goto Lc
            r5 = r0
        Lc:
            r2.update(r3, r5)
            return
    }

    public final long getAcknowledged() {
            r2 = this;
            long r0 = r2.acknowledged
            return r0
    }

    public final int getStreamId() {
            r1 = this;
            int r0 = r1.streamId
            return r0
    }

    public final long getTotal() {
            r2 = this;
            long r0 = r2.total
            return r0
    }

    public final synchronized long getUnacknowledged() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.total     // Catch: java.lang.Throwable -> L8
            long r2 = r4.acknowledged     // Catch: java.lang.Throwable -> L8
            long r0 = r0 - r2
            monitor-exit(r4)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WindowCounter(streamId="
            r0.append(r1)
            int r1 = r3.streamId
            r0.append(r1)
            java.lang.String r1 = ", total="
            r0.append(r1)
            long r1 = r3.total
            r0.append(r1)
            java.lang.String r1 = ", acknowledged="
            r0.append(r1)
            long r1 = r3.acknowledged
            r0.append(r1)
            java.lang.String r1 = ", unacknowledged="
            r0.append(r1)
            long r1 = r3.getUnacknowledged()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final synchronized void update(long r4, long r6) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L2d
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L25
            long r0 = r3.total     // Catch: java.lang.Throwable -> L23
            long r0 = r0 + r4
            r3.total = r0     // Catch: java.lang.Throwable -> L23
            long r4 = r3.acknowledged     // Catch: java.lang.Throwable -> L23
            long r4 = r4 + r6
            r3.acknowledged = r4     // Catch: java.lang.Throwable -> L23
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 > 0) goto L1b
            monitor-exit(r3)
            return
        L1b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Throwable -> L23
        L23:
            r4 = move-exception
            goto L35
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Throwable -> L23
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Throwable -> L23
        L35:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r4
    }
}
