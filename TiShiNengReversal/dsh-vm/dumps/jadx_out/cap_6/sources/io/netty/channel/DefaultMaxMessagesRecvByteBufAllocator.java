package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class DefaultMaxMessagesRecvByteBufAllocator implements io.netty.channel.MaxMessagesRecvByteBufAllocator {
    private volatile int maxMessagesPerRead;
    private volatile boolean respectMaybeMoreData;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public abstract class MaxMessageHandle implements io.netty.channel.RecvByteBufAllocator.ExtendedHandle {
        private int attemptedBytesRead;
        private io.netty.channel.ChannelConfig config;
        private final io.netty.util.UncheckedBooleanSupplier defaultMaybeMoreSupplier;
        private int lastBytesRead;
        private int maxMessagePerRead;
        private final boolean respectMaybeMoreData;
        final /* synthetic */ io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator this$0;
        private int totalBytesRead;
        private int totalMessages;


        public MaxMessageHandle(io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                boolean r1 = io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator.access$000(r1)
                r0.respectMaybeMoreData = r1
                io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator$MaxMessageHandle$1 r1 = new io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator$MaxMessageHandle$1
                r1.<init>(r0)
                r0.defaultMaybeMoreSupplier = r1
                return
        }

        static /* synthetic */ int access$100(io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator.MaxMessageHandle r0) {
                int r0 = r0.attemptedBytesRead
                return r0
        }

        static /* synthetic */ int access$200(io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator.MaxMessageHandle r0) {
                int r0 = r0.lastBytesRead
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public io.netty.buffer.ByteBuf allocate(io.netty.buffer.ByteBufAllocator r2) {
                r1 = this;
                int r0 = r1.guess()
                io.netty.buffer.ByteBuf r2 = r2.ioBuffer(r0)
                return r2
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int attemptedBytesRead() {
                r1 = this;
                int r0 = r1.attemptedBytesRead
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void attemptedBytesRead(int r1) {
                r0 = this;
                r0.attemptedBytesRead = r1
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public boolean continueReading() {
                r1 = this;
                io.netty.util.UncheckedBooleanSupplier r0 = r1.defaultMaybeMoreSupplier
                boolean r0 = r1.continueReading(r0)
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.ExtendedHandle
        public boolean continueReading(io.netty.util.UncheckedBooleanSupplier r2) {
                r1 = this;
                io.netty.channel.ChannelConfig r0 = r1.config
                boolean r0 = r0.isAutoRead()
                if (r0 == 0) goto L1e
                boolean r0 = r1.respectMaybeMoreData
                if (r0 == 0) goto L12
                boolean r2 = r2.get()
                if (r2 == 0) goto L1e
            L12:
                int r2 = r1.totalMessages
                int r0 = r1.maxMessagePerRead
                if (r2 >= r0) goto L1e
                int r2 = r1.totalBytesRead
                if (r2 <= 0) goto L1e
                r2 = 1
                return r2
            L1e:
                r2 = 0
                return r2
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public final void incMessagesRead(int r2) {
                r1 = this;
                int r0 = r1.totalMessages
                int r0 = r0 + r2
                r1.totalMessages = r0
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public final int lastBytesRead() {
                r1 = this;
                int r0 = r1.lastBytesRead
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void lastBytesRead(int r2) {
                r1 = this;
                r1.lastBytesRead = r2
                if (r2 <= 0) goto L9
                int r0 = r1.totalBytesRead
                int r0 = r0 + r2
                r1.totalBytesRead = r0
            L9:
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void readComplete() {
                r0 = this;
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void reset(io.netty.channel.ChannelConfig r1) {
                r0 = this;
                r0.config = r1
                io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator r1 = r0.this$0
                int r1 = r1.maxMessagesPerRead()
                r0.maxMessagePerRead = r1
                r1 = 0
                r0.totalBytesRead = r1
                r0.totalMessages = r1
                return
        }

        protected final int totalBytesRead() {
                r1 = this;
                int r0 = r1.totalBytesRead
                if (r0 >= 0) goto L7
                r0 = 2147483647(0x7fffffff, float:NaN)
            L7:
                return r0
        }
    }

    public DefaultMaxMessagesRecvByteBufAllocator() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public DefaultMaxMessagesRecvByteBufAllocator(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.respectMaybeMoreData = r0
            r1.maxMessagesPerRead(r2)
            return
    }

    static /* synthetic */ boolean access$000(io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator r0) {
            boolean r0 = r0.respectMaybeMoreData
            return r0
    }

    @Override // io.netty.channel.MaxMessagesRecvByteBufAllocator
    public int maxMessagesPerRead() {
            r1 = this;
            int r0 = r1.maxMessagesPerRead
            return r0
    }

    @Override // io.netty.channel.MaxMessagesRecvByteBufAllocator
    public io.netty.channel.MaxMessagesRecvByteBufAllocator maxMessagesPerRead(int r2) {
            r1 = this;
            java.lang.String r0 = "maxMessagesPerRead"
            io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r1.maxMessagesPerRead = r2
            return r1
    }

    public io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator respectMaybeMoreData(boolean r1) {
            r0 = this;
            r0.respectMaybeMoreData = r1
            return r0
    }

    public final boolean respectMaybeMoreData() {
            r1 = this;
            boolean r0 = r1.respectMaybeMoreData
            return r0
    }
}
