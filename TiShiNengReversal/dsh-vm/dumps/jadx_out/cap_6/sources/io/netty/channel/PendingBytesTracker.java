package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class PendingBytesTracker implements io.netty.channel.MessageSizeEstimator.Handle {
    private final io.netty.channel.MessageSizeEstimator.Handle estimatorHandle;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.PendingBytesTracker$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ChannelOutboundBufferPendingBytesTracker extends io.netty.channel.PendingBytesTracker {
        private final io.netty.channel.ChannelOutboundBuffer buffer;

        ChannelOutboundBufferPendingBytesTracker(io.netty.channel.ChannelOutboundBuffer r2, io.netty.channel.MessageSizeEstimator.Handle r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r3, r0)
                r1.buffer = r2
                return
        }

        @Override // io.netty.channel.PendingBytesTracker
        public void decrementPendingOutboundBytes(long r2) {
                r1 = this;
                io.netty.channel.ChannelOutboundBuffer r0 = r1.buffer
                r0.decrementPendingOutboundBytes(r2)
                return
        }

        @Override // io.netty.channel.PendingBytesTracker
        public void incrementPendingOutboundBytes(long r2) {
                r1 = this;
                io.netty.channel.ChannelOutboundBuffer r0 = r1.buffer
                r0.incrementPendingOutboundBytes(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultChannelPipelinePendingBytesTracker extends io.netty.channel.PendingBytesTracker {
        private final io.netty.channel.DefaultChannelPipeline pipeline;

        DefaultChannelPipelinePendingBytesTracker(io.netty.channel.DefaultChannelPipeline r3) {
                r2 = this;
                io.netty.channel.MessageSizeEstimator$Handle r0 = r3.estimatorHandle()
                r1 = 0
                r2.<init>(r0, r1)
                r2.pipeline = r3
                return
        }

        @Override // io.netty.channel.PendingBytesTracker
        public void decrementPendingOutboundBytes(long r2) {
                r1 = this;
                io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
                r0.decrementPendingOutboundBytes(r2)
                return
        }

        @Override // io.netty.channel.PendingBytesTracker
        public void incrementPendingOutboundBytes(long r2) {
                r1 = this;
                io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
                r0.incrementPendingOutboundBytes(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NoopPendingBytesTracker extends io.netty.channel.PendingBytesTracker {
        NoopPendingBytesTracker(io.netty.channel.MessageSizeEstimator.Handle r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // io.netty.channel.PendingBytesTracker
        public void decrementPendingOutboundBytes(long r1) {
                r0 = this;
                return
        }

        @Override // io.netty.channel.PendingBytesTracker
        public void incrementPendingOutboundBytes(long r1) {
                r0 = this;
                return
        }
    }

    private PendingBytesTracker(io.netty.channel.MessageSizeEstimator.Handle r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "estimatorHandle"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.MessageSizeEstimator$Handle r2 = (io.netty.channel.MessageSizeEstimator.Handle) r2
            r1.estimatorHandle = r2
            return
    }

    /* synthetic */ PendingBytesTracker(io.netty.channel.MessageSizeEstimator.Handle r1, io.netty.channel.PendingBytesTracker.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static io.netty.channel.PendingBytesTracker newTracker(io.netty.channel.Channel r2) {
            io.netty.channel.ChannelPipeline r0 = r2.pipeline()
            boolean r0 = r0 instanceof io.netty.channel.DefaultChannelPipeline
            if (r0 == 0) goto L14
            io.netty.channel.PendingBytesTracker$DefaultChannelPipelinePendingBytesTracker r0 = new io.netty.channel.PendingBytesTracker$DefaultChannelPipelinePendingBytesTracker
            io.netty.channel.ChannelPipeline r2 = r2.pipeline()
            io.netty.channel.DefaultChannelPipeline r2 = (io.netty.channel.DefaultChannelPipeline) r2
            r0.<init>(r2)
            return r0
        L14:
            io.netty.channel.Channel$Unsafe r0 = r2.unsafe()
            io.netty.channel.ChannelOutboundBuffer r0 = r0.outboundBuffer()
            io.netty.channel.ChannelConfig r2 = r2.config()
            io.netty.channel.MessageSizeEstimator r2 = r2.getMessageSizeEstimator()
            io.netty.channel.MessageSizeEstimator$Handle r2 = r2.newHandle()
            if (r0 != 0) goto L30
            io.netty.channel.PendingBytesTracker$NoopPendingBytesTracker r0 = new io.netty.channel.PendingBytesTracker$NoopPendingBytesTracker
            r0.<init>(r2)
            return r0
        L30:
            io.netty.channel.PendingBytesTracker$ChannelOutboundBufferPendingBytesTracker r1 = new io.netty.channel.PendingBytesTracker$ChannelOutboundBufferPendingBytesTracker
            r1.<init>(r0, r2)
            return r1
    }

    public abstract void decrementPendingOutboundBytes(long r1);

    public abstract void incrementPendingOutboundBytes(long r1);

    @Override // io.netty.channel.MessageSizeEstimator.Handle
    public final int size(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.MessageSizeEstimator$Handle r0 = r1.estimatorHandle
            int r2 = r0.size(r2)
            return r2
    }
}
