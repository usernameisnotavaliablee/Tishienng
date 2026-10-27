package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class ChannelHandlerMask {
    private static final io.netty.util.concurrent.FastThreadLocal<java.util.Map<java.lang.Class<? extends io.netty.channel.ChannelHandler>, java.lang.Integer>> MASKS = null;
    private static final int MASK_ALL_INBOUND = 511;
    private static final int MASK_ALL_OUTBOUND = 130561;
    static final int MASK_BIND = 512;
    static final int MASK_CHANNEL_ACTIVE = 8;
    static final int MASK_CHANNEL_INACTIVE = 16;
    static final int MASK_CHANNEL_READ = 32;
    static final int MASK_CHANNEL_READ_COMPLETE = 64;
    static final int MASK_CHANNEL_REGISTERED = 2;
    static final int MASK_CHANNEL_UNREGISTERED = 4;
    static final int MASK_CHANNEL_WRITABILITY_CHANGED = 256;
    static final int MASK_CLOSE = 4096;
    static final int MASK_CONNECT = 1024;
    static final int MASK_DEREGISTER = 8192;
    static final int MASK_DISCONNECT = 2048;
    static final int MASK_EXCEPTION_CAUGHT = 1;
    static final int MASK_FLUSH = 65536;
    static final int MASK_READ = 16384;
    static final int MASK_USER_EVENT_TRIGGERED = 128;
    static final int MASK_WRITE = 32768;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @interface Skip {
    }

    static {
            java.lang.Class<io.netty.channel.ChannelHandlerMask> r0 = io.netty.channel.ChannelHandlerMask.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.ChannelHandlerMask.logger = r0
            io.netty.channel.ChannelHandlerMask$1 r0 = new io.netty.channel.ChannelHandlerMask$1
            r0.<init>()
            io.netty.channel.ChannelHandlerMask.MASKS = r0
            return
    }

    private ChannelHandlerMask() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.ChannelHandlerMask.logger
            return r0
    }

    private static boolean isSkippable(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class<?>... r3) throws java.lang.Exception {
            io.netty.channel.ChannelHandlerMask$2 r0 = new io.netty.channel.ChannelHandlerMask$2
            r0.<init>(r1, r2, r3)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    static int mask(java.lang.Class<? extends io.netty.channel.ChannelHandler> r2) {
            io.netty.util.concurrent.FastThreadLocal<java.util.Map<java.lang.Class<? extends io.netty.channel.ChannelHandler>, java.lang.Integer>> r0 = io.netty.channel.ChannelHandlerMask.MASKS
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r0.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L1b
            int r1 = mask0(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
        L1b:
            int r2 = r1.intValue()
            return r2
    }

    private static int mask0(java.lang.Class<? extends io.netty.channel.ChannelHandler> r11) {
            java.lang.Class<java.net.SocketAddress> r0 = java.net.SocketAddress.class
            java.lang.Class<io.netty.channel.ChannelPromise> r1 = io.netty.channel.ChannelPromise.class
            r2 = 1
            java.lang.Class<io.netty.channel.ChannelInboundHandler> r3 = io.netty.channel.ChannelInboundHandler.class
            boolean r3 = r3.isAssignableFrom(r11)     // Catch: java.lang.Exception -> L13f
            r4 = 2
            r5 = 0
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.Class<io.netty.channel.ChannelHandlerContext> r7 = io.netty.channel.ChannelHandlerContext.class
            if (r3 == 0) goto L93
            r3 = 511(0x1ff, float:7.16E-43)
            java.lang.String r8 = "channelRegistered"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L8e
            r9[r5] = r7     // Catch: java.lang.Exception -> L8e
            boolean r8 = isSkippable(r11, r8, r9)     // Catch: java.lang.Exception -> L8e
            if (r8 == 0) goto L23
            r3 = 509(0x1fd, float:7.13E-43)
        L23:
            java.lang.String r8 = "channelUnregistered"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L8a
            r9[r5] = r7     // Catch: java.lang.Exception -> L8a
            boolean r8 = isSkippable(r11, r8, r9)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto L31
            r3 = r3 & (-5)
        L31:
            java.lang.String r8 = "channelActive"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L8a
            r9[r5] = r7     // Catch: java.lang.Exception -> L8a
            boolean r8 = isSkippable(r11, r8, r9)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto L3f
            r3 = r3 & (-9)
        L3f:
            java.lang.String r8 = "channelInactive"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L8a
            r9[r5] = r7     // Catch: java.lang.Exception -> L8a
            boolean r8 = isSkippable(r11, r8, r9)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto L4d
            r3 = r3 & (-17)
        L4d:
            java.lang.String r8 = "channelRead"
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L8a
            r9[r5] = r7     // Catch: java.lang.Exception -> L8a
            r9[r2] = r6     // Catch: java.lang.Exception -> L8a
            boolean r8 = isSkippable(r11, r8, r9)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto L5d
            r3 = r3 & (-33)
        L5d:
            java.lang.String r8 = "channelReadComplete"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L8a
            r9[r5] = r7     // Catch: java.lang.Exception -> L8a
            boolean r8 = isSkippable(r11, r8, r9)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto L6b
            r3 = r3 & (-65)
        L6b:
            java.lang.String r8 = "channelWritabilityChanged"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L8a
            r9[r5] = r7     // Catch: java.lang.Exception -> L8a
            boolean r8 = isSkippable(r11, r8, r9)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto L79
            r3 = r3 & (-257(0xfffffffffffffeff, float:NaN))
        L79:
            java.lang.String r8 = "userEventTriggered"
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L8a
            r9[r5] = r7     // Catch: java.lang.Exception -> L8a
            r9[r2] = r6     // Catch: java.lang.Exception -> L8a
            boolean r8 = isSkippable(r11, r8, r9)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto L94
            r3 = r3 & (-129(0xffffffffffffff7f, float:NaN))
            goto L94
        L8a:
            r11 = move-exception
            r2 = r3
            goto L140
        L8e:
            r11 = move-exception
            r2 = 511(0x1ff, float:7.16E-43)
            goto L140
        L93:
            r3 = 1
        L94:
            java.lang.Class<io.netty.channel.ChannelOutboundHandler> r8 = io.netty.channel.ChannelOutboundHandler.class
            boolean r8 = r8.isAssignableFrom(r11)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto L12b
            r8 = 130561(0x1fe01, float:1.82955E-40)
            r3 = r3 | r8
            java.lang.String r8 = "bind"
            r9 = 3
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L8a
            r10[r5] = r7     // Catch: java.lang.Exception -> L8a
            r10[r2] = r0     // Catch: java.lang.Exception -> L8a
            r10[r4] = r1     // Catch: java.lang.Exception -> L8a
            boolean r8 = isSkippable(r11, r8, r10)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto Lb3
            r3 = r3 & (-513(0xfffffffffffffdff, float:NaN))
        Lb3:
            java.lang.String r8 = "connect"
            r10 = 4
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> L8a
            r10[r5] = r7     // Catch: java.lang.Exception -> L8a
            r10[r2] = r0     // Catch: java.lang.Exception -> L8a
            r10[r4] = r0     // Catch: java.lang.Exception -> L8a
            r10[r9] = r1     // Catch: java.lang.Exception -> L8a
            boolean r0 = isSkippable(r11, r8, r10)     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto Lc8
            r3 = r3 & (-1025(0xfffffffffffffbff, float:NaN))
        Lc8:
            java.lang.String r0 = "disconnect"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L8a
            r8[r5] = r7     // Catch: java.lang.Exception -> L8a
            r8[r2] = r1     // Catch: java.lang.Exception -> L8a
            boolean r0 = isSkippable(r11, r0, r8)     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto Ld8
            r3 = r3 & (-2049(0xfffffffffffff7ff, float:NaN))
        Ld8:
            java.lang.String r0 = "close"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L8a
            r8[r5] = r7     // Catch: java.lang.Exception -> L8a
            r8[r2] = r1     // Catch: java.lang.Exception -> L8a
            boolean r0 = isSkippable(r11, r0, r8)     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto Le8
            r3 = r3 & (-4097(0xffffffffffffefff, float:NaN))
        Le8:
            java.lang.String r0 = "deregister"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L8a
            r8[r5] = r7     // Catch: java.lang.Exception -> L8a
            r8[r2] = r1     // Catch: java.lang.Exception -> L8a
            boolean r0 = isSkippable(r11, r0, r8)     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto Lf8
            r3 = r3 & (-8193(0xffffffffffffdfff, float:NaN))
        Lf8:
            java.lang.String r0 = "read"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L8a
            r8[r5] = r7     // Catch: java.lang.Exception -> L8a
            boolean r0 = isSkippable(r11, r0, r8)     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L106
            r3 = r3 & (-16385(0xffffffffffffbfff, float:NaN))
        L106:
            java.lang.String r0 = "write"
            java.lang.Class[] r8 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L8a
            r8[r5] = r7     // Catch: java.lang.Exception -> L8a
            r8[r2] = r6     // Catch: java.lang.Exception -> L8a
            r8[r4] = r1     // Catch: java.lang.Exception -> L8a
            boolean r0 = isSkippable(r11, r0, r8)     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L11b
            r0 = -32769(0xffffffffffff7fff, float:NaN)
            r0 = r0 & r3
            r3 = r0
        L11b:
            java.lang.String r0 = "flush"
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L8a
            r1[r5] = r7     // Catch: java.lang.Exception -> L8a
            boolean r0 = isSkippable(r11, r0, r1)     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L12b
            r0 = -65537(0xfffffffffffeffff, float:NaN)
            r3 = r3 & r0
        L12b:
            java.lang.String r0 = "exceptionCaught"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L8a
            r1[r5] = r7     // Catch: java.lang.Exception -> L8a
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r1[r2] = r4     // Catch: java.lang.Exception -> L8a
            boolean r11 = isSkippable(r11, r0, r1)     // Catch: java.lang.Exception -> L8a
            if (r11 == 0) goto L13e
            r11 = r3 & (-2)
            return r11
        L13e:
            return r3
        L13f:
            r11 = move-exception
        L140:
            io.netty.util.internal.PlatformDependent.throwException(r11)
            return r2
    }
}
