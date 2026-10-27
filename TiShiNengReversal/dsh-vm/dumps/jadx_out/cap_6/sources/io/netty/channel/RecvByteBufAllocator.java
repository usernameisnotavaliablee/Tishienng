package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface RecvByteBufAllocator {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DelegatingHandle implements io.netty.channel.RecvByteBufAllocator.Handle {
        private final io.netty.channel.RecvByteBufAllocator.Handle delegate;

        public DelegatingHandle(io.netty.channel.RecvByteBufAllocator.Handle r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "delegate"
                java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
                io.netty.channel.RecvByteBufAllocator$Handle r2 = (io.netty.channel.RecvByteBufAllocator.Handle) r2
                r1.delegate = r2
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public io.netty.buffer.ByteBuf allocate(io.netty.buffer.ByteBufAllocator r2) {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                io.netty.buffer.ByteBuf r2 = r0.allocate(r2)
                return r2
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int attemptedBytesRead() {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                int r0 = r0.attemptedBytesRead()
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void attemptedBytesRead(int r2) {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                r0.attemptedBytesRead(r2)
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public boolean continueReading() {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                boolean r0 = r0.continueReading()
                return r0
        }

        protected final io.netty.channel.RecvByteBufAllocator.Handle delegate() {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int guess() {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                int r0 = r0.guess()
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void incMessagesRead(int r2) {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                r0.incMessagesRead(r2)
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int lastBytesRead() {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                int r0 = r0.lastBytesRead()
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void lastBytesRead(int r2) {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                r0.lastBytesRead(r2)
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void readComplete() {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                r0.readComplete()
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void reset(io.netty.channel.ChannelConfig r2) {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate
                r0.reset(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ExtendedHandle extends io.netty.channel.RecvByteBufAllocator.Handle {
        boolean continueReading(io.netty.util.UncheckedBooleanSupplier r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public interface Handle {
        io.netty.buffer.ByteBuf allocate(io.netty.buffer.ByteBufAllocator r1);

        int attemptedBytesRead();

        void attemptedBytesRead(int r1);

        boolean continueReading();

        int guess();

        void incMessagesRead(int r1);

        int lastBytesRead();

        void lastBytesRead(int r1);

        void readComplete();

        void reset(io.netty.channel.ChannelConfig r1);
    }

    io.netty.channel.RecvByteBufAllocator.Handle newHandle();
}
