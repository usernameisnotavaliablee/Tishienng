package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChannelOption<T> extends io.netty.util.AbstractConstant<io.netty.channel.ChannelOption<T>> {
    public static final io.netty.channel.ChannelOption<io.netty.buffer.ByteBufAllocator> ALLOCATOR = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> ALLOW_HALF_CLOSURE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> AUTO_CLOSE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> AUTO_READ = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> CONNECT_TIMEOUT_MILLIS = null;

    @java.lang.Deprecated
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION = null;
    public static final io.netty.channel.ChannelOption<java.net.InetAddress> IP_MULTICAST_ADDR = null;
    public static final io.netty.channel.ChannelOption<java.net.NetworkInterface> IP_MULTICAST_IF = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> IP_MULTICAST_LOOP_DISABLED = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> IP_MULTICAST_TTL = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> IP_TOS = null;

    @java.lang.Deprecated
    public static final io.netty.channel.ChannelOption<java.lang.Integer> MAX_MESSAGES_PER_READ = null;
    public static final io.netty.channel.ChannelOption<io.netty.channel.MessageSizeEstimator> MESSAGE_SIZE_ESTIMATOR = null;
    public static final io.netty.channel.ChannelOption<io.netty.channel.RecvByteBufAllocator> RCVBUF_ALLOCATOR = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> SINGLE_EVENTEXECUTOR_PER_GROUP = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SO_BACKLOG = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> SO_BROADCAST = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> SO_KEEPALIVE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SO_LINGER = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SO_RCVBUF = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> SO_REUSEADDR = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SO_SNDBUF = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SO_TIMEOUT = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> TCP_NODELAY = null;

    @java.lang.Deprecated
    public static final io.netty.channel.ChannelOption<java.lang.Integer> WRITE_BUFFER_HIGH_WATER_MARK = null;

    @java.lang.Deprecated
    public static final io.netty.channel.ChannelOption<java.lang.Integer> WRITE_BUFFER_LOW_WATER_MARK = null;
    public static final io.netty.channel.ChannelOption<io.netty.channel.WriteBufferWaterMark> WRITE_BUFFER_WATER_MARK = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> WRITE_SPIN_COUNT = null;
    private static final io.netty.util.ConstantPool<io.netty.channel.ChannelOption<java.lang.Object>> pool = null;


    static {
            io.netty.channel.ChannelOption$1 r0 = new io.netty.channel.ChannelOption$1
            r0.<init>()
            io.netty.channel.ChannelOption.pool = r0
            java.lang.String r0 = "ALLOCATOR"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.ALLOCATOR = r0
            java.lang.String r0 = "RCVBUF_ALLOCATOR"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.RCVBUF_ALLOCATOR = r0
            java.lang.String r0 = "MESSAGE_SIZE_ESTIMATOR"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.MESSAGE_SIZE_ESTIMATOR = r0
            java.lang.String r0 = "CONNECT_TIMEOUT_MILLIS"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.CONNECT_TIMEOUT_MILLIS = r0
            java.lang.String r0 = "MAX_MESSAGES_PER_READ"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.MAX_MESSAGES_PER_READ = r0
            java.lang.String r0 = "WRITE_SPIN_COUNT"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.WRITE_SPIN_COUNT = r0
            java.lang.String r0 = "WRITE_BUFFER_HIGH_WATER_MARK"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.WRITE_BUFFER_HIGH_WATER_MARK = r0
            java.lang.String r0 = "WRITE_BUFFER_LOW_WATER_MARK"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.WRITE_BUFFER_LOW_WATER_MARK = r0
            java.lang.String r0 = "WRITE_BUFFER_WATER_MARK"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.WRITE_BUFFER_WATER_MARK = r0
            java.lang.String r0 = "ALLOW_HALF_CLOSURE"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.ALLOW_HALF_CLOSURE = r0
            java.lang.String r0 = "AUTO_READ"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.AUTO_READ = r0
            java.lang.String r0 = "AUTO_CLOSE"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.AUTO_CLOSE = r0
            java.lang.String r0 = "SO_BROADCAST"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.SO_BROADCAST = r0
            java.lang.String r0 = "SO_KEEPALIVE"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.SO_KEEPALIVE = r0
            java.lang.String r0 = "SO_SNDBUF"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.SO_SNDBUF = r0
            java.lang.String r0 = "SO_RCVBUF"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.SO_RCVBUF = r0
            java.lang.String r0 = "SO_REUSEADDR"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.SO_REUSEADDR = r0
            java.lang.String r0 = "SO_LINGER"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.SO_LINGER = r0
            java.lang.String r0 = "SO_BACKLOG"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.SO_BACKLOG = r0
            java.lang.String r0 = "SO_TIMEOUT"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.SO_TIMEOUT = r0
            java.lang.String r0 = "IP_TOS"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.IP_TOS = r0
            java.lang.String r0 = "IP_MULTICAST_ADDR"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.IP_MULTICAST_ADDR = r0
            java.lang.String r0 = "IP_MULTICAST_IF"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.IP_MULTICAST_IF = r0
            java.lang.String r0 = "IP_MULTICAST_TTL"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.IP_MULTICAST_TTL = r0
            java.lang.String r0 = "IP_MULTICAST_LOOP_DISABLED"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.IP_MULTICAST_LOOP_DISABLED = r0
            java.lang.String r0 = "TCP_NODELAY"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.TCP_NODELAY = r0
            java.lang.String r0 = "DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION = r0
            java.lang.String r0 = "SINGLE_EVENTEXECUTOR_PER_GROUP"
            io.netty.channel.ChannelOption r0 = valueOf(r0)
            io.netty.channel.ChannelOption.SINGLE_EVENTEXECUTOR_PER_GROUP = r0
            return
    }

    private ChannelOption(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ ChannelOption(int r1, java.lang.String r2, io.netty.channel.ChannelOption.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    protected ChannelOption(java.lang.String r2) {
            r1 = this;
            io.netty.util.ConstantPool<io.netty.channel.ChannelOption<java.lang.Object>> r0 = io.netty.channel.ChannelOption.pool
            int r0 = r0.nextId()
            r1.<init>(r0, r2)
            return
    }

    public static boolean exists(java.lang.String r1) {
            io.netty.util.ConstantPool<io.netty.channel.ChannelOption<java.lang.Object>> r0 = io.netty.channel.ChannelOption.pool
            boolean r1 = r0.exists(r1)
            return r1
    }

    @java.lang.Deprecated
    public static <T> io.netty.channel.ChannelOption<T> newInstance(java.lang.String r1) {
            io.netty.util.ConstantPool<io.netty.channel.ChannelOption<java.lang.Object>> r0 = io.netty.channel.ChannelOption.pool
            io.netty.util.Constant r1 = r0.newInstance(r1)
            io.netty.channel.ChannelOption r1 = (io.netty.channel.ChannelOption) r1
            return r1
    }

    public static <T> io.netty.channel.ChannelOption<T> valueOf(java.lang.Class<?> r1, java.lang.String r2) {
            io.netty.util.ConstantPool<io.netty.channel.ChannelOption<java.lang.Object>> r0 = io.netty.channel.ChannelOption.pool
            io.netty.util.Constant r1 = r0.valueOf(r1, r2)
            io.netty.channel.ChannelOption r1 = (io.netty.channel.ChannelOption) r1
            return r1
    }

    public static <T> io.netty.channel.ChannelOption<T> valueOf(java.lang.String r1) {
            io.netty.util.ConstantPool<io.netty.channel.ChannelOption<java.lang.Object>> r0 = io.netty.channel.ChannelOption.pool
            io.netty.util.Constant r1 = r0.valueOf(r1)
            io.netty.channel.ChannelOption r1 = (io.netty.channel.ChannelOption) r1
            return r1
    }

    public void validate(T r2) {
            r1 = this;
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "value"
            r2.<init>(r0)
            throw r2
    }
}
