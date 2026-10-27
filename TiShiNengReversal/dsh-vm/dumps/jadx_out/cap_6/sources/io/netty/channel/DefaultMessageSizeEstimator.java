package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultMessageSizeEstimator implements io.netty.channel.MessageSizeEstimator {
    public static final io.netty.channel.MessageSizeEstimator DEFAULT = null;
    private final io.netty.channel.MessageSizeEstimator.Handle handle;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.DefaultMessageSizeEstimator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class HandleImpl implements io.netty.channel.MessageSizeEstimator.Handle {
        private final int unknownSize;

        private HandleImpl(int r1) {
                r0 = this;
                r0.<init>()
                r0.unknownSize = r1
                return
        }

        /* synthetic */ HandleImpl(int r1, io.netty.channel.DefaultMessageSizeEstimator.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.MessageSizeEstimator.Handle
        public int size(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof io.netty.buffer.ByteBuf
                if (r0 == 0) goto Lb
                io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
                int r2 = r2.readableBytes()
                return r2
            Lb:
                boolean r0 = r2 instanceof io.netty.buffer.ByteBufHolder
                if (r0 == 0) goto L1a
                io.netty.buffer.ByteBufHolder r2 = (io.netty.buffer.ByteBufHolder) r2
                io.netty.buffer.ByteBuf r2 = r2.content()
                int r2 = r2.readableBytes()
                return r2
            L1a:
                boolean r2 = r2 instanceof io.netty.channel.FileRegion
                if (r2 == 0) goto L20
                r2 = 0
                return r2
            L20:
                int r2 = r1.unknownSize
                return r2
        }
    }

    static {
            io.netty.channel.DefaultMessageSizeEstimator r0 = new io.netty.channel.DefaultMessageSizeEstimator
            r1 = 8
            r0.<init>(r1)
            io.netty.channel.DefaultMessageSizeEstimator.DEFAULT = r0
            return
    }

    public DefaultMessageSizeEstimator(int r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "unknownSize"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r0)
            io.netty.channel.DefaultMessageSizeEstimator$HandleImpl r0 = new io.netty.channel.DefaultMessageSizeEstimator$HandleImpl
            r1 = 0
            r0.<init>(r3, r1)
            r2.handle = r0
            return
    }

    @Override // io.netty.channel.MessageSizeEstimator
    public io.netty.channel.MessageSizeEstimator.Handle newHandle() {
            r1 = this;
            io.netty.channel.MessageSizeEstimator$Handle r0 = r1.handle
            return r0
    }
}
