package io.netty.channel.rxtx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface RxtxChannelConfig extends io.netty.channel.ChannelConfig {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Databits extends java.lang.Enum<io.netty.channel.rxtx.RxtxChannelConfig.Databits> {
        private static final /* synthetic */ io.netty.channel.rxtx.RxtxChannelConfig.Databits[] $VALUES = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Databits DATABITS_5 = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Databits DATABITS_6 = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Databits DATABITS_7 = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Databits DATABITS_8 = null;
        private final int value;

        static {
                io.netty.channel.rxtx.RxtxChannelConfig$Databits r0 = new io.netty.channel.rxtx.RxtxChannelConfig$Databits
                r1 = 5
                java.lang.String r2 = "DATABITS_5"
                r3 = 0
                r0.<init>(r2, r3, r1)
                io.netty.channel.rxtx.RxtxChannelConfig.Databits.DATABITS_5 = r0
                io.netty.channel.rxtx.RxtxChannelConfig$Databits r1 = new io.netty.channel.rxtx.RxtxChannelConfig$Databits
                r2 = 6
                java.lang.String r4 = "DATABITS_6"
                r5 = 1
                r1.<init>(r4, r5, r2)
                io.netty.channel.rxtx.RxtxChannelConfig.Databits.DATABITS_6 = r1
                io.netty.channel.rxtx.RxtxChannelConfig$Databits r2 = new io.netty.channel.rxtx.RxtxChannelConfig$Databits
                r4 = 7
                java.lang.String r6 = "DATABITS_7"
                r7 = 2
                r2.<init>(r6, r7, r4)
                io.netty.channel.rxtx.RxtxChannelConfig.Databits.DATABITS_7 = r2
                io.netty.channel.rxtx.RxtxChannelConfig$Databits r4 = new io.netty.channel.rxtx.RxtxChannelConfig$Databits
                r6 = 8
                java.lang.String r8 = "DATABITS_8"
                r9 = 3
                r4.<init>(r8, r9, r6)
                io.netty.channel.rxtx.RxtxChannelConfig.Databits.DATABITS_8 = r4
                r6 = 4
                io.netty.channel.rxtx.RxtxChannelConfig$Databits[] r6 = new io.netty.channel.rxtx.RxtxChannelConfig.Databits[r6]
                r6[r3] = r0
                r6[r5] = r1
                r6[r7] = r2
                r6[r9] = r4
                io.netty.channel.rxtx.RxtxChannelConfig.Databits.$VALUES = r6
                return
        }

        Databits(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static io.netty.channel.rxtx.RxtxChannelConfig.Databits valueOf(int r5) {
                io.netty.channel.rxtx.RxtxChannelConfig$Databits[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.value
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknown "
                r1.append(r2)
                java.lang.Class<io.netty.channel.rxtx.RxtxChannelConfig$Databits> r2 = io.netty.channel.rxtx.RxtxChannelConfig.Databits.class
                java.lang.String r2 = r2.getSimpleName()
                r1.append(r2)
                java.lang.String r2 = " value: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        public static io.netty.channel.rxtx.RxtxChannelConfig.Databits valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.channel.rxtx.RxtxChannelConfig$Databits> r0 = io.netty.channel.rxtx.RxtxChannelConfig.Databits.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.channel.rxtx.RxtxChannelConfig$Databits r1 = (io.netty.channel.rxtx.RxtxChannelConfig.Databits) r1
                return r1
        }

        public static io.netty.channel.rxtx.RxtxChannelConfig.Databits[] values() {
                io.netty.channel.rxtx.RxtxChannelConfig$Databits[] r0 = io.netty.channel.rxtx.RxtxChannelConfig.Databits.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.channel.rxtx.RxtxChannelConfig$Databits[] r0 = (io.netty.channel.rxtx.RxtxChannelConfig.Databits[]) r0
                return r0
        }

        public int value() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Paritybit extends java.lang.Enum<io.netty.channel.rxtx.RxtxChannelConfig.Paritybit> {
        private static final /* synthetic */ io.netty.channel.rxtx.RxtxChannelConfig.Paritybit[] $VALUES = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Paritybit EVEN = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Paritybit MARK = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Paritybit NONE = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Paritybit ODD = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Paritybit SPACE = null;
        private final int value;

        static {
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r0 = new io.netty.channel.rxtx.RxtxChannelConfig$Paritybit
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.NONE = r0
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r1 = new io.netty.channel.rxtx.RxtxChannelConfig$Paritybit
                java.lang.String r3 = "ODD"
                r4 = 1
                r1.<init>(r3, r4, r4)
                io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.ODD = r1
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r3 = new io.netty.channel.rxtx.RxtxChannelConfig$Paritybit
                java.lang.String r5 = "EVEN"
                r6 = 2
                r3.<init>(r5, r6, r6)
                io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.EVEN = r3
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r5 = new io.netty.channel.rxtx.RxtxChannelConfig$Paritybit
                java.lang.String r7 = "MARK"
                r8 = 3
                r5.<init>(r7, r8, r8)
                io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.MARK = r5
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r7 = new io.netty.channel.rxtx.RxtxChannelConfig$Paritybit
                java.lang.String r9 = "SPACE"
                r10 = 4
                r7.<init>(r9, r10, r10)
                io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.SPACE = r7
                r9 = 5
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit[] r9 = new io.netty.channel.rxtx.RxtxChannelConfig.Paritybit[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.$VALUES = r9
                return
        }

        Paritybit(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static io.netty.channel.rxtx.RxtxChannelConfig.Paritybit valueOf(int r5) {
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.value
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknown "
                r1.append(r2)
                java.lang.Class<io.netty.channel.rxtx.RxtxChannelConfig$Paritybit> r2 = io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.class
                java.lang.String r2 = r2.getSimpleName()
                r1.append(r2)
                java.lang.String r2 = " value: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        public static io.netty.channel.rxtx.RxtxChannelConfig.Paritybit valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.channel.rxtx.RxtxChannelConfig$Paritybit> r0 = io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r1 = (io.netty.channel.rxtx.RxtxChannelConfig.Paritybit) r1
                return r1
        }

        public static io.netty.channel.rxtx.RxtxChannelConfig.Paritybit[] values() {
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit[] r0 = io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.channel.rxtx.RxtxChannelConfig$Paritybit[] r0 = (io.netty.channel.rxtx.RxtxChannelConfig.Paritybit[]) r0
                return r0
        }

        public int value() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Stopbits extends java.lang.Enum<io.netty.channel.rxtx.RxtxChannelConfig.Stopbits> {
        private static final /* synthetic */ io.netty.channel.rxtx.RxtxChannelConfig.Stopbits[] $VALUES = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Stopbits STOPBITS_1 = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Stopbits STOPBITS_1_5 = null;
        public static final io.netty.channel.rxtx.RxtxChannelConfig.Stopbits STOPBITS_2 = null;
        private final int value;

        static {
                io.netty.channel.rxtx.RxtxChannelConfig$Stopbits r0 = new io.netty.channel.rxtx.RxtxChannelConfig$Stopbits
                java.lang.String r1 = "STOPBITS_1"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                io.netty.channel.rxtx.RxtxChannelConfig.Stopbits.STOPBITS_1 = r0
                io.netty.channel.rxtx.RxtxChannelConfig$Stopbits r1 = new io.netty.channel.rxtx.RxtxChannelConfig$Stopbits
                java.lang.String r4 = "STOPBITS_2"
                r5 = 2
                r1.<init>(r4, r3, r5)
                io.netty.channel.rxtx.RxtxChannelConfig.Stopbits.STOPBITS_2 = r1
                io.netty.channel.rxtx.RxtxChannelConfig$Stopbits r4 = new io.netty.channel.rxtx.RxtxChannelConfig$Stopbits
                java.lang.String r6 = "STOPBITS_1_5"
                r7 = 3
                r4.<init>(r6, r5, r7)
                io.netty.channel.rxtx.RxtxChannelConfig.Stopbits.STOPBITS_1_5 = r4
                io.netty.channel.rxtx.RxtxChannelConfig$Stopbits[] r6 = new io.netty.channel.rxtx.RxtxChannelConfig.Stopbits[r7]
                r6[r2] = r0
                r6[r3] = r1
                r6[r5] = r4
                io.netty.channel.rxtx.RxtxChannelConfig.Stopbits.$VALUES = r6
                return
        }

        Stopbits(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static io.netty.channel.rxtx.RxtxChannelConfig.Stopbits valueOf(int r5) {
                io.netty.channel.rxtx.RxtxChannelConfig$Stopbits[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.value
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknown "
                r1.append(r2)
                java.lang.Class<io.netty.channel.rxtx.RxtxChannelConfig$Stopbits> r2 = io.netty.channel.rxtx.RxtxChannelConfig.Stopbits.class
                java.lang.String r2 = r2.getSimpleName()
                r1.append(r2)
                java.lang.String r2 = " value: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        public static io.netty.channel.rxtx.RxtxChannelConfig.Stopbits valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.channel.rxtx.RxtxChannelConfig$Stopbits> r0 = io.netty.channel.rxtx.RxtxChannelConfig.Stopbits.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.channel.rxtx.RxtxChannelConfig$Stopbits r1 = (io.netty.channel.rxtx.RxtxChannelConfig.Stopbits) r1
                return r1
        }

        public static io.netty.channel.rxtx.RxtxChannelConfig.Stopbits[] values() {
                io.netty.channel.rxtx.RxtxChannelConfig$Stopbits[] r0 = io.netty.channel.rxtx.RxtxChannelConfig.Stopbits.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.channel.rxtx.RxtxChannelConfig$Stopbits[] r0 = (io.netty.channel.rxtx.RxtxChannelConfig.Stopbits[]) r0
                return r0
        }

        public int value() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    int getBaudrate();

    io.netty.channel.rxtx.RxtxChannelConfig.Databits getDatabits();

    io.netty.channel.rxtx.RxtxChannelConfig.Paritybit getParitybit();

    int getReadTimeout();

    io.netty.channel.rxtx.RxtxChannelConfig.Stopbits getStopbits();

    int getWaitTimeMillis();

    boolean isDtr();

    boolean isRts();

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setAutoClose(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setAutoRead(boolean r1);

    io.netty.channel.rxtx.RxtxChannelConfig setBaudrate(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setConnectTimeoutMillis(int r1);

    io.netty.channel.rxtx.RxtxChannelConfig setDatabits(io.netty.channel.rxtx.RxtxChannelConfig.Databits r1);

    io.netty.channel.rxtx.RxtxChannelConfig setDtr(boolean r1);

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    io.netty.channel.rxtx.RxtxChannelConfig setMaxMessagesPerRead(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1);

    io.netty.channel.rxtx.RxtxChannelConfig setParitybit(io.netty.channel.rxtx.RxtxChannelConfig.Paritybit r1);

    io.netty.channel.rxtx.RxtxChannelConfig setReadTimeout(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1);

    io.netty.channel.rxtx.RxtxChannelConfig setRts(boolean r1);

    io.netty.channel.rxtx.RxtxChannelConfig setStopbits(io.netty.channel.rxtx.RxtxChannelConfig.Stopbits r1);

    io.netty.channel.rxtx.RxtxChannelConfig setWaitTimeMillis(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setWriteBufferHighWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setWriteBufferLowWaterMark(int r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1);

    @Override // io.netty.channel.ChannelConfig
    io.netty.channel.rxtx.RxtxChannelConfig setWriteSpinCount(int r1);
}
