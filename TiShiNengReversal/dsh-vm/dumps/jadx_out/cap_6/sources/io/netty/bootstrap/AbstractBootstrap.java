package io.netty.bootstrap;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.channel.Channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractBootstrap<B extends io.netty.bootstrap.AbstractBootstrap<B, C>, C extends io.netty.channel.Channel> implements java.lang.Cloneable {
    private final java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> attrs;
    private volatile io.netty.bootstrap.ChannelFactory<? extends C> channelFactory;
    volatile io.netty.channel.EventLoopGroup group;
    private volatile io.netty.channel.ChannelHandler handler;
    private volatile java.net.SocketAddress localAddress;
    private final java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> options;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class PendingRegistrationPromise extends io.netty.channel.DefaultChannelPromise {
        private volatile boolean registered;

        PendingRegistrationPromise(io.netty.channel.Channel r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.DefaultChannelPromise
        protected io.netty.util.concurrent.EventExecutor executor() {
                r1 = this;
                boolean r0 = r1.registered
                if (r0 == 0) goto L9
                io.netty.util.concurrent.EventExecutor r0 = super.executor()
                return r0
            L9:
                io.netty.util.concurrent.GlobalEventExecutor r0 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
                return r0
        }

        void registered() {
                r1 = this;
                r0 = 1
                r1.registered = r0
                return
        }
    }

    AbstractBootstrap() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.options = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.attrs = r0
            return
    }

    AbstractBootstrap(io.netty.bootstrap.AbstractBootstrap<B, C> r5) {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.options = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r4.attrs = r1
            io.netty.channel.EventLoopGroup r2 = r5.group
            r4.group = r2
            io.netty.bootstrap.ChannelFactory<? extends C extends io.netty.channel.Channel> r2 = r5.channelFactory
            r4.channelFactory = r2
            io.netty.channel.ChannelHandler r2 = r5.handler
            r4.handler = r2
            java.net.SocketAddress r2 = r5.localAddress
            r4.localAddress = r2
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r2 = r5.options
            monitor-enter(r2)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r3 = r5.options     // Catch: java.lang.Throwable -> L37
            r0.putAll(r3)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r5.attrs
            monitor-enter(r0)
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r5 = r5.attrs     // Catch: java.lang.Throwable -> L34
            r1.putAll(r5)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r5
        L37:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r5
    }

    static /* synthetic */ void access$000(io.netty.channel.ChannelFuture r0, io.netty.channel.Channel r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            doBind0(r0, r1, r2, r3)
            return
    }

    static <K, V> java.util.Map<K, V> copiedMap(java.util.Map<K, V> r1) {
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.util.Map r0 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r0 = move-exception
            goto L18
        Ld:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            return r1
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    private io.netty.channel.ChannelFuture doBind(java.net.SocketAddress r7) {
            r6 = this;
            io.netty.channel.ChannelFuture r3 = r6.initAndRegister()
            io.netty.channel.Channel r4 = r3.channel()
            java.lang.Throwable r0 = r3.cause()
            if (r0 == 0) goto Lf
            return r3
        Lf:
            boolean r0 = r3.isDone()
            if (r0 == 0) goto L1d
            io.netty.channel.ChannelPromise r0 = r4.newPromise()
            doBind0(r3, r4, r7, r0)
            return r0
        L1d:
            io.netty.bootstrap.AbstractBootstrap$PendingRegistrationPromise r2 = new io.netty.bootstrap.AbstractBootstrap$PendingRegistrationPromise
            r2.<init>(r4)
            io.netty.bootstrap.AbstractBootstrap$1 r0 = new io.netty.bootstrap.AbstractBootstrap$1
            r1 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r3.addListener(r0)
            return r2
    }

    private static void doBind0(io.netty.channel.ChannelFuture r2, io.netty.channel.Channel r3, java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) {
            io.netty.channel.EventLoop r0 = r3.eventLoop()
            io.netty.bootstrap.AbstractBootstrap$2 r1 = new io.netty.bootstrap.AbstractBootstrap$2
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
    }

    private B self() {
            r0 = this;
            return r0
    }

    private static void setChannelOption(io.netty.channel.Channel r3, io.netty.channel.ChannelOption<?> r4, java.lang.Object r5, io.netty.util.internal.logging.InternalLogger r6) {
            io.netty.channel.ChannelConfig r0 = r3.config()     // Catch: java.lang.Throwable -> L10
            boolean r0 = r0.setOption(r4, r5)     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            java.lang.String r0 = "Unknown channel option '{}' for channel '{}'"
            r6.warn(r0, r4, r3)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            goto L13
        L12:
            return
        L13:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r4 = 2
            r1[r4] = r3
            r3 = 3
            r1[r3] = r0
            java.lang.String r3 = "Failed to set channel option '{}' with value '{}' for channel '{}'"
            r6.warn(r3, r1)
            return
    }

    static void setChannelOptions(io.netty.channel.Channel r2, java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r3, io.netty.util.internal.logging.InternalLogger r4) {
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            io.netty.channel.ChannelOption r1 = (io.netty.channel.ChannelOption) r1
            java.lang.Object r0 = r0.getValue()
            setChannelOption(r2, r1, r0, r4)
            goto L8
        L22:
            return
    }

    static void setChannelOptions(io.netty.channel.Channel r4, java.util.Map.Entry<io.netty.channel.ChannelOption<?>, java.lang.Object>[] r5, io.netty.util.internal.logging.InternalLogger r6) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L16
            r2 = r5[r1]
            java.lang.Object r3 = r2.getKey()
            io.netty.channel.ChannelOption r3 = (io.netty.channel.ChannelOption) r3
            java.lang.Object r2 = r2.getValue()
            setChannelOption(r4, r3, r2, r6)
            int r1 = r1 + 1
            goto L2
        L16:
            return
    }

    public <T> B attr(io.netty.util.AttributeKey<T> r3, T r4) {
            r2 = this;
            java.lang.String r0 = "key"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            if (r4 != 0) goto L14
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r2.attrs
            monitor-enter(r0)
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r4 = r2.attrs     // Catch: java.lang.Throwable -> L11
            r4.remove(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L1d
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
        L14:
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r2.attrs
            monitor-enter(r0)
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r1 = r2.attrs     // Catch: java.lang.Throwable -> L22
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
        L1d:
            io.netty.bootstrap.AbstractBootstrap r3 = r2.self()
            return r3
        L22:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3
    }

    final java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> attrs() {
            r1 = this;
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r1.attrs
            java.util.Map r0 = copiedMap(r0)
            return r0
    }

    final java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> attrs0() {
            r1 = this;
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r1.attrs
            return r0
    }

    public io.netty.channel.ChannelFuture bind() {
            r2 = this;
            r2.validate()
            java.net.SocketAddress r0 = r2.localAddress
            if (r0 == 0) goto Lc
            io.netty.channel.ChannelFuture r0 = r2.doBind(r0)
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "localAddress not set"
            r0.<init>(r1)
            throw r0
    }

    public io.netty.channel.ChannelFuture bind(int r2) {
            r1 = this;
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r2)
            io.netty.channel.ChannelFuture r2 = r1.bind(r0)
            return r2
    }

    public io.netty.channel.ChannelFuture bind(java.lang.String r1, int r2) {
            r0 = this;
            java.net.InetSocketAddress r1 = io.netty.util.internal.SocketUtils.socketAddress(r1, r2)
            io.netty.channel.ChannelFuture r1 = r0.bind(r1)
            return r1
    }

    public io.netty.channel.ChannelFuture bind(java.net.InetAddress r2, int r3) {
            r1 = this;
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r2, r3)
            io.netty.channel.ChannelFuture r2 = r1.bind(r0)
            return r2
    }

    public io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2) {
            r1 = this;
            r1.validate()
            java.lang.String r0 = "localAddress"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.net.SocketAddress r2 = (java.net.SocketAddress) r2
            io.netty.channel.ChannelFuture r2 = r1.doBind(r2)
            return r2
    }

    public B channel(java.lang.Class<? extends C> r3) {
            r2 = this;
            io.netty.channel.ReflectiveChannelFactory r0 = new io.netty.channel.ReflectiveChannelFactory
            java.lang.String r1 = "channelClass"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.Class r3 = (java.lang.Class) r3
            r0.<init>(r3)
            io.netty.bootstrap.AbstractBootstrap r3 = r2.channelFactory(r0)
            return r3
    }

    @java.lang.Deprecated
    public B channelFactory(io.netty.bootstrap.ChannelFactory<? extends C> r2) {
            r1 = this;
            java.lang.String r0 = "channelFactory"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.bootstrap.ChannelFactory<? extends C extends io.netty.channel.Channel> r0 = r1.channelFactory
            if (r0 != 0) goto L10
            r1.channelFactory = r2
            io.netty.bootstrap.AbstractBootstrap r2 = r1.self()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "channelFactory set already"
            r2.<init>(r0)
            throw r2
    }

    public B channelFactory(io.netty.channel.ChannelFactory<? extends C> r1) {
            r0 = this;
            io.netty.bootstrap.AbstractBootstrap r1 = r0.channelFactory(r1)
            return r1
    }

    final io.netty.bootstrap.ChannelFactory<? extends C> channelFactory() {
            r1 = this;
            io.netty.bootstrap.ChannelFactory<? extends C extends io.netty.channel.Channel> r0 = r1.channelFactory
            return r0
    }

    public abstract B clone();

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo0clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            io.netty.bootstrap.AbstractBootstrap r0 = r1.clone()
            return r0
    }

    public abstract io.netty.bootstrap.AbstractBootstrapConfig<B, C> config();

    public B group(io.netty.channel.EventLoopGroup r2) {
            r1 = this;
            java.lang.String r0 = "group"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.EventLoopGroup r0 = r1.group
            if (r0 != 0) goto L10
            r1.group = r2
            io.netty.bootstrap.AbstractBootstrap r2 = r1.self()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "group set already"
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public final io.netty.channel.EventLoopGroup group() {
            r1 = this;
            io.netty.channel.EventLoopGroup r0 = r1.group
            return r0
    }

    public B handler(io.netty.channel.ChannelHandler r2) {
            r1 = this;
            java.lang.String r0 = "handler"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.ChannelHandler r2 = (io.netty.channel.ChannelHandler) r2
            r1.handler = r2
            io.netty.bootstrap.AbstractBootstrap r2 = r1.self()
            return r2
    }

    final io.netty.channel.ChannelHandler handler() {
            r1 = this;
            io.netty.channel.ChannelHandler r0 = r1.handler
            return r0
    }

    abstract void init(io.netty.channel.Channel r1) throws java.lang.Exception;

    final io.netty.channel.ChannelFuture initAndRegister() {
            r4 = this;
            r0 = 0
            io.netty.bootstrap.ChannelFactory<? extends C extends io.netty.channel.Channel> r1 = r4.channelFactory     // Catch: java.lang.Throwable -> L2e
            io.netty.channel.Channel r0 = r1.newChannel()     // Catch: java.lang.Throwable -> L2e
            r4.init(r0)     // Catch: java.lang.Throwable -> L2e
            io.netty.bootstrap.AbstractBootstrapConfig r1 = r4.config()
            io.netty.channel.EventLoopGroup r1 = r1.group()
            io.netty.channel.ChannelFuture r1 = r1.register(r0)
            java.lang.Throwable r2 = r1.cause()
            if (r2 == 0) goto L2d
            boolean r2 = r0.isRegistered()
            if (r2 == 0) goto L26
            r0.close()
            return r1
        L26:
            io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
            r0.closeForcibly()
        L2d:
            return r1
        L2e:
            r1 = move-exception
            if (r0 == 0) goto L44
            io.netty.channel.Channel$Unsafe r2 = r0.unsafe()
            r2.closeForcibly()
            io.netty.channel.DefaultChannelPromise r2 = new io.netty.channel.DefaultChannelPromise
            io.netty.util.concurrent.GlobalEventExecutor r3 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            r2.<init>(r0, r3)
            io.netty.channel.ChannelPromise r0 = r2.setFailure(r1)
            return r0
        L44:
            io.netty.channel.DefaultChannelPromise r0 = new io.netty.channel.DefaultChannelPromise
            io.netty.bootstrap.FailedChannel r2 = new io.netty.bootstrap.FailedChannel
            r2.<init>()
            io.netty.util.concurrent.GlobalEventExecutor r3 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            r0.<init>(r2, r3)
            io.netty.channel.ChannelPromise r0 = r0.setFailure(r1)
            return r0
    }

    public B localAddress(int r2) {
            r1 = this;
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r2)
            io.netty.bootstrap.AbstractBootstrap r2 = r1.localAddress(r0)
            return r2
    }

    public B localAddress(java.lang.String r1, int r2) {
            r0 = this;
            java.net.InetSocketAddress r1 = io.netty.util.internal.SocketUtils.socketAddress(r1, r2)
            io.netty.bootstrap.AbstractBootstrap r1 = r0.localAddress(r1)
            return r1
    }

    public B localAddress(java.net.InetAddress r2, int r3) {
            r1 = this;
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r2, r3)
            io.netty.bootstrap.AbstractBootstrap r2 = r1.localAddress(r0)
            return r2
    }

    public B localAddress(java.net.SocketAddress r1) {
            r0 = this;
            r0.localAddress = r1
            io.netty.bootstrap.AbstractBootstrap r1 = r0.self()
            return r1
    }

    final java.net.SocketAddress localAddress() {
            r1 = this;
            java.net.SocketAddress r0 = r1.localAddress
            return r0
    }

    public <T> B option(io.netty.channel.ChannelOption<T> r3, T r4) {
            r2 = this;
            java.lang.String r0 = "option"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            if (r4 != 0) goto L14
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r2.options
            monitor-enter(r0)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r4 = r2.options     // Catch: java.lang.Throwable -> L11
            r4.remove(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L1d
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
        L14:
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r2.options
            monitor-enter(r0)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r1 = r2.options     // Catch: java.lang.Throwable -> L22
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
        L1d:
            io.netty.bootstrap.AbstractBootstrap r3 = r2.self()
            return r3
        L22:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3
    }

    final java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> options() {
            r1 = this;
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r1.options
            java.util.Map r0 = copiedMap(r0)
            return r0
    }

    final java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> options0() {
            r1 = this;
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r1.options
            return r0
    }

    public io.netty.channel.ChannelFuture register() {
            r1 = this;
            r1.validate()
            io.netty.channel.ChannelFuture r0 = r1.initAndRegister()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            io.netty.bootstrap.AbstractBootstrapConfig r1 = r2.config()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public B validate() {
            r2 = this;
            io.netty.channel.EventLoopGroup r0 = r2.group
            if (r0 == 0) goto L15
            io.netty.bootstrap.ChannelFactory<? extends C extends io.netty.channel.Channel> r0 = r2.channelFactory
            if (r0 == 0) goto Ld
            io.netty.bootstrap.AbstractBootstrap r0 = r2.self()
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "channel or channelFactory not set"
            r0.<init>(r1)
            throw r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "group not set"
            r0.<init>(r1)
            throw r0
    }
}
