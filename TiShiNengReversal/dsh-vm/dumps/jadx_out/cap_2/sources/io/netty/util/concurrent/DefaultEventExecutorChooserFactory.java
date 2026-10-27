package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DefaultEventExecutorChooserFactory implements io.netty.util.concurrent.EventExecutorChooserFactory {
    public static final io.netty.util.concurrent.DefaultEventExecutorChooserFactory INSTANCE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class GenericEventExecutorChooser implements io.netty.util.concurrent.EventExecutorChooserFactory.EventExecutorChooser {
        private final io.netty.util.concurrent.EventExecutor[] executors;
        private final java.util.concurrent.atomic.AtomicInteger idx;

        GenericEventExecutorChooser(io.netty.util.concurrent.EventExecutor[] r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.idx = r0
                r1.executors = r2
                return
        }

        @Override // io.netty.util.concurrent.EventExecutorChooserFactory.EventExecutorChooser
        public io.netty.util.concurrent.EventExecutor next() {
                r3 = this;
                io.netty.util.concurrent.EventExecutor[] r0 = r3.executors
                java.util.concurrent.atomic.AtomicInteger r1 = r3.idx
                int r1 = r1.getAndIncrement()
                io.netty.util.concurrent.EventExecutor[] r2 = r3.executors
                int r2 = r2.length
                int r1 = r1 % r2
                int r1 = java.lang.Math.abs(r1)
                r0 = r0[r1]
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PowerOfTwoEventExecutorChooser implements io.netty.util.concurrent.EventExecutorChooserFactory.EventExecutorChooser {
        private final io.netty.util.concurrent.EventExecutor[] executors;
        private final java.util.concurrent.atomic.AtomicInteger idx;

        PowerOfTwoEventExecutorChooser(io.netty.util.concurrent.EventExecutor[] r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.idx = r0
                r1.executors = r2
                return
        }

        @Override // io.netty.util.concurrent.EventExecutorChooserFactory.EventExecutorChooser
        public io.netty.util.concurrent.EventExecutor next() {
                r3 = this;
                io.netty.util.concurrent.EventExecutor[] r0 = r3.executors
                java.util.concurrent.atomic.AtomicInteger r1 = r3.idx
                int r1 = r1.getAndIncrement()
                io.netty.util.concurrent.EventExecutor[] r2 = r3.executors
                int r2 = r2.length
                int r2 = r2 + (-1)
                r1 = r1 & r2
                r0 = r0[r1]
                return r0
        }
    }

    static {
            io.netty.util.concurrent.DefaultEventExecutorChooserFactory r0 = new io.netty.util.concurrent.DefaultEventExecutorChooserFactory
            r0.<init>()
            io.netty.util.concurrent.DefaultEventExecutorChooserFactory.INSTANCE = r0
            return
    }

    private DefaultEventExecutorChooserFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isPowerOfTwo(int r1) {
            int r0 = -r1
            r0 = r0 & r1
            if (r0 != r1) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorChooserFactory
    public io.netty.util.concurrent.EventExecutorChooserFactory.EventExecutorChooser newChooser(io.netty.util.concurrent.EventExecutor[] r2) {
            r1 = this;
            int r0 = r2.length
            boolean r0 = isPowerOfTwo(r0)
            if (r0 == 0) goto Ld
            io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser r0 = new io.netty.util.concurrent.DefaultEventExecutorChooserFactory$PowerOfTwoEventExecutorChooser
            r0.<init>(r2)
            return r0
        Ld:
            io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser r0 = new io.netty.util.concurrent.DefaultEventExecutorChooserFactory$GenericEventExecutorChooser
            r0.<init>(r2)
            return r0
    }
}
