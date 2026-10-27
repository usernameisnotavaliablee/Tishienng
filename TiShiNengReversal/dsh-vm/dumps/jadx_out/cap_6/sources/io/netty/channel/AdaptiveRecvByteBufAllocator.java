package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AdaptiveRecvByteBufAllocator extends io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator {

    @java.lang.Deprecated
    public static final io.netty.channel.AdaptiveRecvByteBufAllocator DEFAULT = null;
    static final int DEFAULT_INITIAL = 1024;
    static final int DEFAULT_MAXIMUM = 65536;
    static final int DEFAULT_MINIMUM = 64;
    private static final int INDEX_DECREMENT = 1;
    private static final int INDEX_INCREMENT = 4;
    private static final int[] SIZE_TABLE = null;
    private final int initial;
    private final int maxIndex;
    private final int minIndex;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class HandleImpl extends io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator.MaxMessageHandle {
        private boolean decreaseNow;
        private int index;
        private final int maxIndex;
        private final int minIndex;
        private int nextReceiveBufferSize;
        final /* synthetic */ io.netty.channel.AdaptiveRecvByteBufAllocator this$0;

        HandleImpl(io.netty.channel.AdaptiveRecvByteBufAllocator r1, int r2, int r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.minIndex = r2
                r0.maxIndex = r3
                int r1 = io.netty.channel.AdaptiveRecvByteBufAllocator.access$000(r4)
                r0.index = r1
                int[] r1 = io.netty.channel.AdaptiveRecvByteBufAllocator.access$100()
                int r2 = r0.index
                r1 = r1[r2]
                r0.nextReceiveBufferSize = r1
                return
        }

        private void record(int r4) {
                r3 = this;
                int[] r0 = io.netty.channel.AdaptiveRecvByteBufAllocator.access$100()
                int r1 = r3.index
                int r1 = r1 + (-2)
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = r0[r1]
                if (r4 > r0) goto L31
                boolean r4 = r3.decreaseNow
                r0 = 1
                if (r4 == 0) goto L2e
                int r4 = r3.index
                int r4 = r4 - r0
                int r0 = r3.minIndex
                int r4 = java.lang.Math.max(r4, r0)
                r3.index = r4
                int[] r4 = io.netty.channel.AdaptiveRecvByteBufAllocator.access$100()
                int r0 = r3.index
                r4 = r4[r0]
                r3.nextReceiveBufferSize = r4
                r3.decreaseNow = r2
                return
            L2e:
                r3.decreaseNow = r0
                return
            L31:
                int r0 = r3.nextReceiveBufferSize
                if (r4 < r0) goto L4d
                int r4 = r3.index
                int r4 = r4 + 4
                int r0 = r3.maxIndex
                int r4 = java.lang.Math.min(r4, r0)
                r3.index = r4
                int[] r4 = io.netty.channel.AdaptiveRecvByteBufAllocator.access$100()
                int r0 = r3.index
                r4 = r4[r0]
                r3.nextReceiveBufferSize = r4
                r3.decreaseNow = r2
            L4d:
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int guess() {
                r1 = this;
                int r0 = r1.nextReceiveBufferSize
                return r0
        }

        @Override // io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator.MaxMessageHandle, io.netty.channel.RecvByteBufAllocator.Handle
        public void lastBytesRead(int r2) {
                r1 = this;
                int r0 = r1.attemptedBytesRead()
                if (r2 != r0) goto L9
                r1.record(r2)
            L9:
                super.lastBytesRead(r2)
                return
        }

        @Override // io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator.MaxMessageHandle, io.netty.channel.RecvByteBufAllocator.Handle
        public void readComplete() {
                r1 = this;
                int r0 = r1.totalBytesRead()
                r1.record(r0)
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 16
        L7:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 >= r2) goto L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.add(r2)
            int r1 = r1 + 16
            goto L7
        L15:
            if (r2 <= 0) goto L21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
            int r2 = r2 << 1
            goto L15
        L21:
            int r1 = r0.size()
            int[] r1 = new int[r1]
            io.netty.channel.AdaptiveRecvByteBufAllocator.SIZE_TABLE = r1
            r1 = 0
        L2a:
            int[] r2 = io.netty.channel.AdaptiveRecvByteBufAllocator.SIZE_TABLE
            int r3 = r2.length
            if (r1 >= r3) goto L3e
            java.lang.Object r3 = r0.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2a
        L3e:
            io.netty.channel.AdaptiveRecvByteBufAllocator r0 = new io.netty.channel.AdaptiveRecvByteBufAllocator
            r0.<init>()
            io.netty.channel.AdaptiveRecvByteBufAllocator.DEFAULT = r0
            return
    }

    public AdaptiveRecvByteBufAllocator() {
            r3 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 65536(0x10000, float:9.1835E-41)
            r2 = 64
            r3.<init>(r2, r0, r1)
            return
    }

    public AdaptiveRecvByteBufAllocator(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "minimum"
            io.netty.util.internal.ObjectUtil.checkPositive(r4, r0)
            if (r5 < r4) goto L46
            if (r6 < r5) goto L2f
            int r0 = getSizeTableIndex(r4)
            int[] r1 = io.netty.channel.AdaptiveRecvByteBufAllocator.SIZE_TABLE
            r2 = r1[r0]
            if (r2 >= r4) goto L1b
            int r0 = r0 + 1
            r3.minIndex = r0
            goto L1d
        L1b:
            r3.minIndex = r0
        L1d:
            int r4 = getSizeTableIndex(r6)
            r0 = r1[r4]
            if (r0 <= r6) goto L2a
            int r4 = r4 + (-1)
            r3.maxIndex = r4
            goto L2c
        L2a:
            r3.maxIndex = r4
        L2c:
            r3.initial = r5
            return
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "maximum: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L46:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "initial: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    static /* synthetic */ int access$000(int r0) {
            int r0 = getSizeTableIndex(r0)
            return r0
    }

    static /* synthetic */ int[] access$100() {
            int[] r0 = io.netty.channel.AdaptiveRecvByteBufAllocator.SIZE_TABLE
            return r0
    }

    private static int getSizeTableIndex(int r6) {
            int[] r0 = io.netty.channel.AdaptiveRecvByteBufAllocator.SIZE_TABLE
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 0
        L6:
            if (r0 >= r1) goto L9
            return r1
        L9:
            if (r0 != r1) goto Lc
            return r0
        Lc:
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            int[] r3 = io.netty.channel.AdaptiveRecvByteBufAllocator.SIZE_TABLE
            r4 = r3[r2]
            int r5 = r2 + 1
            r3 = r3[r5]
            if (r6 <= r3) goto L1c
            r1 = r5
            goto L6
        L1c:
            if (r6 >= r4) goto L22
            int r2 = r2 + (-1)
            r0 = r2
            goto L6
        L22:
            if (r6 != r4) goto L25
            return r2
        L25:
            return r5
    }

    @Override // io.netty.channel.RecvByteBufAllocator
    public io.netty.channel.RecvByteBufAllocator.Handle newHandle() {
            r4 = this;
            io.netty.channel.AdaptiveRecvByteBufAllocator$HandleImpl r0 = new io.netty.channel.AdaptiveRecvByteBufAllocator$HandleImpl
            int r1 = r4.minIndex
            int r2 = r4.maxIndex
            int r3 = r4.initial
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    @Override // io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator
    public io.netty.channel.AdaptiveRecvByteBufAllocator respectMaybeMoreData(boolean r1) {
            r0 = this;
            super.respectMaybeMoreData(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator
    public /* bridge */ /* synthetic */ io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator respectMaybeMoreData(boolean r1) {
            r0 = this;
            io.netty.channel.AdaptiveRecvByteBufAllocator r1 = r0.respectMaybeMoreData(r1)
            return r1
    }
}
