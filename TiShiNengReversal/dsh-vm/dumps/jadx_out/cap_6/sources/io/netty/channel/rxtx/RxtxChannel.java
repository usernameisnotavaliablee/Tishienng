package io.netty.channel.rxtx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class RxtxChannel extends io.netty.channel.oio.OioByteStreamChannel {
    private static final io.netty.channel.rxtx.RxtxDeviceAddress LOCAL_ADDRESS = null;
    private final io.netty.channel.rxtx.RxtxChannelConfig config;
    private io.netty.channel.rxtx.RxtxDeviceAddress deviceAddress;
    private boolean open;
    private gnu.io.SerialPort serialPort;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.rxtx.RxtxChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class RxtxUnsafe extends io.netty.channel.AbstractChannel.AbstractUnsafe {
        final /* synthetic */ io.netty.channel.rxtx.RxtxChannel this$0;


        private RxtxUnsafe(io.netty.channel.rxtx.RxtxChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ RxtxUnsafe(io.netty.channel.rxtx.RxtxChannel r1, io.netty.channel.rxtx.RxtxChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ void access$100(io.netty.channel.rxtx.RxtxChannel.RxtxUnsafe r0, io.netty.channel.ChannelPromise r1) {
                r0.safeSetSuccess(r1)
                return
        }

        static /* synthetic */ void access$200(io.netty.channel.rxtx.RxtxChannel.RxtxUnsafe r0, io.netty.channel.ChannelPromise r1, java.lang.Throwable r2) {
                r0.safeSetFailure(r1, r2)
                return
        }

        static /* synthetic */ void access$300(io.netty.channel.rxtx.RxtxChannel.RxtxUnsafe r0) {
                r0.closeIfClosed()
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void connect(java.net.SocketAddress r5, java.net.SocketAddress r6, io.netty.channel.ChannelPromise r7) {
                r4 = this;
                boolean r0 = r7.setUncancellable()
                if (r0 == 0) goto L62
                boolean r0 = r4.ensureOpen(r7)
                if (r0 != 0) goto Ld
                goto L62
            Ld:
                io.netty.channel.rxtx.RxtxChannel r0 = r4.this$0     // Catch: java.lang.Throwable -> L3e
                boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L3e
                io.netty.channel.rxtx.RxtxChannel r1 = r4.this$0     // Catch: java.lang.Throwable -> L3e
                r1.doConnect(r5, r6)     // Catch: java.lang.Throwable -> L3e
                io.netty.channel.rxtx.RxtxChannel r5 = r4.this$0     // Catch: java.lang.Throwable -> L3e
                io.netty.channel.rxtx.RxtxChannelConfig r5 = r5.config()     // Catch: java.lang.Throwable -> L3e
                io.netty.channel.ChannelOption<java.lang.Integer> r6 = io.netty.channel.rxtx.RxtxChannelOption.WAIT_TIME     // Catch: java.lang.Throwable -> L3e
                java.lang.Object r5 = r5.getOption(r6)     // Catch: java.lang.Throwable -> L3e
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L3e
                int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L3e
                if (r5 <= 0) goto L40
                io.netty.channel.rxtx.RxtxChannel r6 = r4.this$0     // Catch: java.lang.Throwable -> L3e
                io.netty.channel.EventLoop r6 = r6.eventLoop()     // Catch: java.lang.Throwable -> L3e
                io.netty.channel.rxtx.RxtxChannel$RxtxUnsafe$1 r1 = new io.netty.channel.rxtx.RxtxChannel$RxtxUnsafe$1     // Catch: java.lang.Throwable -> L3e
                r1.<init>(r4, r7, r0)     // Catch: java.lang.Throwable -> L3e
                long r2 = (long) r5     // Catch: java.lang.Throwable -> L3e
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L3e
                r6.schedule(r1, r2, r5)     // Catch: java.lang.Throwable -> L3e
                return
            L3e:
                r5 = move-exception
                goto L5c
            L40:
                io.netty.channel.rxtx.RxtxChannel r5 = r4.this$0     // Catch: java.lang.Throwable -> L3e
                r5.doInit()     // Catch: java.lang.Throwable -> L3e
                r4.safeSetSuccess(r7)     // Catch: java.lang.Throwable -> L3e
                if (r0 != 0) goto L62
                io.netty.channel.rxtx.RxtxChannel r5 = r4.this$0     // Catch: java.lang.Throwable -> L3e
                boolean r5 = r5.isActive()     // Catch: java.lang.Throwable -> L3e
                if (r5 == 0) goto L62
                io.netty.channel.rxtx.RxtxChannel r5 = r4.this$0     // Catch: java.lang.Throwable -> L3e
                io.netty.channel.ChannelPipeline r5 = r5.pipeline()     // Catch: java.lang.Throwable -> L3e
                r5.fireChannelActive()     // Catch: java.lang.Throwable -> L3e
                return
            L5c:
                r4.safeSetFailure(r7, r5)
                r4.closeIfClosed()
            L62:
                return
        }
    }

    static {
            io.netty.channel.rxtx.RxtxDeviceAddress r0 = new io.netty.channel.rxtx.RxtxDeviceAddress
            java.lang.String r1 = "localhost"
            r0.<init>(r1)
            io.netty.channel.rxtx.RxtxChannel.LOCAL_ADDRESS = r0
            return
    }

    public RxtxChannel() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 1
            r1.open = r0
            io.netty.channel.rxtx.DefaultRxtxChannelConfig r0 = new io.netty.channel.rxtx.DefaultRxtxChannelConfig
            r0.<init>(r1)
            r1.config = r0
            return
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.rxtx.RxtxChannelConfig config() {
            r1 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.oio.OioByteStreamChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r3 = this;
            r0 = 0
            r3.open = r0
            r0 = 0
            super.doClose()     // Catch: java.lang.Throwable -> L16
            gnu.io.SerialPort r1 = r3.serialPort
            if (r1 == 0) goto L15
            r1.removeEventListener()
            gnu.io.SerialPort r1 = r3.serialPort
            r1.close()
            r3.serialPort = r0
        L15:
            return
        L16:
            r1 = move-exception
            gnu.io.SerialPort r2 = r3.serialPort
            if (r2 == 0) goto L27
            gnu.io.SerialPort r2 = r3.serialPort
            r2.removeEventListener()
            gnu.io.SerialPort r2 = r3.serialPort
            r2.close()
            r3.serialPort = r0
        L27:
            throw r1
    }

    @Override // io.netty.channel.oio.AbstractOioChannel
    protected void doConnect(java.net.SocketAddress r3, java.net.SocketAddress r4) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.rxtx.RxtxDeviceAddress r3 = (io.netty.channel.rxtx.RxtxDeviceAddress) r3
            java.lang.String r4 = r3.value()
            gnu.io.CommPortIdentifier r4 = gnu.io.CommPortIdentifier.getPortIdentifier(r4)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 1000(0x3e8, float:1.401E-42)
            gnu.io.CommPort r4 = r4.open(r0, r1)
            io.netty.channel.rxtx.RxtxChannelConfig r0 = r2.config()
            io.netty.channel.ChannelOption<java.lang.Integer> r1 = io.netty.channel.rxtx.RxtxChannelOption.READ_TIMEOUT
            java.lang.Object r0 = r0.getOption(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.enableReceiveTimeout(r0)
            r2.deviceAddress = r3
            gnu.io.SerialPort r4 = (gnu.io.SerialPort) r4
            r2.serialPort = r4
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r0 = this;
            r0.doClose()
            return
    }

    protected void doInit() throws java.lang.Exception {
            r6 = this;
            gnu.io.SerialPort r0 = r6.serialPort
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r6.config()
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.rxtx.RxtxChannelOption.BAUD_RATE
            java.lang.Object r1 = r1.getOption(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            io.netty.channel.rxtx.RxtxChannelConfig r2 = r6.config()
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Databits> r3 = io.netty.channel.rxtx.RxtxChannelOption.DATA_BITS
            java.lang.Object r2 = r2.getOption(r3)
            io.netty.channel.rxtx.RxtxChannelConfig$Databits r2 = (io.netty.channel.rxtx.RxtxChannelConfig.Databits) r2
            int r2 = r2.value()
            io.netty.channel.rxtx.RxtxChannelConfig r3 = r6.config()
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Stopbits> r4 = io.netty.channel.rxtx.RxtxChannelOption.STOP_BITS
            java.lang.Object r3 = r3.getOption(r4)
            io.netty.channel.rxtx.RxtxChannelConfig$Stopbits r3 = (io.netty.channel.rxtx.RxtxChannelConfig.Stopbits) r3
            int r3 = r3.value()
            io.netty.channel.rxtx.RxtxChannelConfig r4 = r6.config()
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Paritybit> r5 = io.netty.channel.rxtx.RxtxChannelOption.PARITY_BIT
            java.lang.Object r4 = r4.getOption(r5)
            io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r4 = (io.netty.channel.rxtx.RxtxChannelConfig.Paritybit) r4
            int r4 = r4.value()
            r0.setSerialPortParams(r1, r2, r3, r4)
            gnu.io.SerialPort r0 = r6.serialPort
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r6.config()
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.rxtx.RxtxChannelOption.DTR
            java.lang.Object r1 = r1.getOption(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.setDTR(r1)
            gnu.io.SerialPort r0 = r6.serialPort
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r6.config()
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.rxtx.RxtxChannelOption.RTS
            java.lang.Object r1 = r1.getOption(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.setRTS(r1)
            gnu.io.SerialPort r0 = r6.serialPort
            java.io.InputStream r0 = r0.getInputStream()
            gnu.io.SerialPort r1 = r6.serialPort
            java.io.OutputStream r1 = r1.getOutputStream()
            r6.activate(r0, r1)
            return
    }

    @Override // io.netty.channel.oio.AbstractOioByteChannel
    protected boolean isInputShutdown() {
            r1 = this;
            boolean r0 = r1.open
            r0 = r0 ^ 1
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.open
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.rxtx.RxtxDeviceAddress localAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.localAddress()
            io.netty.channel.rxtx.RxtxDeviceAddress r0 = (io.netty.channel.rxtx.RxtxDeviceAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress localAddress() {
            r1 = this;
            io.netty.channel.rxtx.RxtxDeviceAddress r0 = r1.localAddress()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected io.netty.channel.rxtx.RxtxDeviceAddress localAddress0() {
            r1 = this;
            io.netty.channel.rxtx.RxtxDeviceAddress r0 = io.netty.channel.rxtx.RxtxChannel.LOCAL_ADDRESS
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ java.net.SocketAddress localAddress0() {
            r1 = this;
            io.netty.channel.rxtx.RxtxDeviceAddress r0 = r1.localAddress0()
            return r0
    }

    @Override // io.netty.channel.oio.AbstractOioChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.rxtx.RxtxChannel$RxtxUnsafe r0 = new io.netty.channel.rxtx.RxtxChannel$RxtxUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.rxtx.RxtxDeviceAddress remoteAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.remoteAddress()
            io.netty.channel.rxtx.RxtxDeviceAddress r0 = (io.netty.channel.rxtx.RxtxDeviceAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress() {
            r1 = this;
            io.netty.channel.rxtx.RxtxDeviceAddress r0 = r1.remoteAddress()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected io.netty.channel.rxtx.RxtxDeviceAddress remoteAddress0() {
            r1 = this;
            io.netty.channel.rxtx.RxtxDeviceAddress r0 = r1.deviceAddress
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress0() {
            r1 = this;
            io.netty.channel.rxtx.RxtxDeviceAddress r0 = r1.remoteAddress0()
            return r0
    }

    @Override // io.netty.channel.oio.AbstractOioByteChannel
    protected io.netty.channel.ChannelFuture shutdownInput() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "shutdownInput"
            r0.<init>(r1)
            io.netty.channel.ChannelFuture r0 = r2.newFailedFuture(r0)
            return r0
    }
}
