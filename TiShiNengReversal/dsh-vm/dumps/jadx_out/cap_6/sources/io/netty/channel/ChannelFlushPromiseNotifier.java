package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ChannelFlushPromiseNotifier {
    private final java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint> flushCheckpoints;
    private final boolean tryNotify;
    private long writeCounter;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DefaultFlushCheckpoint implements io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint {
        private long checkpoint;
        private final io.netty.channel.ChannelPromise future;

        DefaultFlushCheckpoint(long r1, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                r0.<init>()
                r0.checkpoint = r1
                r0.future = r3
                return
        }

        @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
        public long flushCheckpoint() {
                r2 = this;
                long r0 = r2.checkpoint
                return r0
        }

        @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
        public void flushCheckpoint(long r1) {
                r0 = this;
                r0.checkpoint = r1
                return
        }

        @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
        public io.netty.channel.ChannelPromise promise() {
                r1 = this;
                io.netty.channel.ChannelPromise r0 = r1.future
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface FlushCheckpoint {
        long flushCheckpoint();

        void flushCheckpoint(long r1);

        io.netty.channel.ChannelPromise promise();
    }

    public ChannelFlushPromiseNotifier() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public ChannelFlushPromiseNotifier(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.flushCheckpoints = r0
            r1.tryNotify = r2
            return
    }

    private void notifyPromises0(java.lang.Throwable r9) {
            r8 = this;
            java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint> r0 = r8.flushCheckpoints
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
            r8.writeCounter = r1
            return
        Ld:
            long r3 = r8.writeCounter
        Lf:
            java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint> r0 = r8.flushCheckpoints
            java.lang.Object r0 = r0.peek()
            io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint r0 = (io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint) r0
            if (r0 != 0) goto L1c
            r8.writeCounter = r1
            goto L3b
        L1c:
            long r5 = r0.flushCheckpoint()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L64
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 <= 0) goto L3b
            java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint> r9 = r8.flushCheckpoints
            int r9 = r9.size()
            r5 = 1
            if (r9 != r5) goto L3b
            r8.writeCounter = r1
            long r5 = r0.flushCheckpoint()
            long r5 = r5 - r3
            r0.flushCheckpoint(r5)
        L3b:
            long r3 = r8.writeCounter
            r5 = 549755813888(0x8000000000, double:2.716154612436E-312)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L63
            r8.writeCounter = r1
            java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint> r9 = r8.flushCheckpoints
            java.util.Iterator r9 = r9.iterator()
        L4e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r9.next()
            io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint r0 = (io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint) r0
            long r1 = r0.flushCheckpoint()
            long r1 = r1 - r3
            r0.flushCheckpoint(r1)
            goto L4e
        L63:
            return
        L64:
            java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint> r5 = r8.flushCheckpoints
            r5.remove()
            io.netty.channel.ChannelPromise r0 = r0.promise()
            if (r9 != 0) goto L7b
            boolean r5 = r8.tryNotify
            if (r5 == 0) goto L77
            r0.trySuccess()
            goto Lf
        L77:
            r0.setSuccess()
            goto Lf
        L7b:
            boolean r5 = r8.tryNotify
            if (r5 == 0) goto L83
            r0.tryFailure(r9)
            goto Lf
        L83:
            r0.setFailure(r9)
            goto Lf
    }

    @java.lang.Deprecated
    public io.netty.channel.ChannelFlushPromiseNotifier add(io.netty.channel.ChannelPromise r3, int r4) {
            r2 = this;
            long r0 = (long) r4
            io.netty.channel.ChannelFlushPromiseNotifier r3 = r2.add(r3, r0)
            return r3
    }

    public io.netty.channel.ChannelFlushPromiseNotifier add(io.netty.channel.ChannelPromise r3, long r4) {
            r2 = this;
            if (r3 == 0) goto L24
            java.lang.String r0 = "pendingDataSize"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            long r0 = r2.writeCounter
            long r0 = r0 + r4
            boolean r4 = r3 instanceof io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
            if (r4 == 0) goto L19
            io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint r3 = (io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint) r3
            r3.flushCheckpoint(r0)
            java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint> r4 = r2.flushCheckpoints
            r4.add(r3)
            return r2
        L19:
            java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint> r4 = r2.flushCheckpoints
            io.netty.channel.ChannelFlushPromiseNotifier$DefaultFlushCheckpoint r5 = new io.netty.channel.ChannelFlushPromiseNotifier$DefaultFlushCheckpoint
            r5.<init>(r0, r3)
            r4.add(r5)
            return r2
        L24:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "promise"
            r3.<init>(r4)
            throw r3
    }

    public io.netty.channel.ChannelFlushPromiseNotifier increaseWriteCounter(long r3) {
            r2 = this;
            java.lang.String r0 = "delta"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r0)
            long r0 = r2.writeCounter
            long r0 = r0 + r3
            r2.writeCounter = r0
            return r2
    }

    @java.lang.Deprecated
    public io.netty.channel.ChannelFlushPromiseNotifier notifyFlushFutures() {
            r1 = this;
            io.netty.channel.ChannelFlushPromiseNotifier r0 = r1.notifyPromises()
            return r0
    }

    @java.lang.Deprecated
    public io.netty.channel.ChannelFlushPromiseNotifier notifyFlushFutures(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.ChannelFlushPromiseNotifier r1 = r0.notifyPromises(r1)
            return r1
    }

    @java.lang.Deprecated
    public io.netty.channel.ChannelFlushPromiseNotifier notifyFlushFutures(java.lang.Throwable r1, java.lang.Throwable r2) {
            r0 = this;
            io.netty.channel.ChannelFlushPromiseNotifier r1 = r0.notifyPromises(r1, r2)
            return r1
    }

    public io.netty.channel.ChannelFlushPromiseNotifier notifyPromises() {
            r1 = this;
            r0 = 0
            r1.notifyPromises0(r0)
            return r1
    }

    public io.netty.channel.ChannelFlushPromiseNotifier notifyPromises(java.lang.Throwable r3) {
            r2 = this;
            r2.notifyPromises()
        L3:
            java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint> r0 = r2.flushCheckpoints
            java.lang.Object r0 = r0.poll()
            io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint r0 = (io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint) r0
            if (r0 != 0) goto Le
            return r2
        Le:
            boolean r1 = r2.tryNotify
            if (r1 == 0) goto L1a
            io.netty.channel.ChannelPromise r0 = r0.promise()
            r0.tryFailure(r3)
            goto L3
        L1a:
            io.netty.channel.ChannelPromise r0 = r0.promise()
            r0.setFailure(r3)
            goto L3
    }

    public io.netty.channel.ChannelFlushPromiseNotifier notifyPromises(java.lang.Throwable r2, java.lang.Throwable r3) {
            r1 = this;
            r1.notifyPromises0(r2)
        L3:
            java.util.Queue<io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint> r2 = r1.flushCheckpoints
            java.lang.Object r2 = r2.poll()
            io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint r2 = (io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint) r2
            if (r2 != 0) goto Le
            return r1
        Le:
            boolean r0 = r1.tryNotify
            if (r0 == 0) goto L1a
            io.netty.channel.ChannelPromise r2 = r2.promise()
            r2.tryFailure(r3)
            goto L3
        L1a:
            io.netty.channel.ChannelPromise r2 = r2.promise()
            r2.setFailure(r3)
            goto L3
    }

    public long writeCounter() {
            r2 = this;
            long r0 = r2.writeCounter
            return r0
    }
}
