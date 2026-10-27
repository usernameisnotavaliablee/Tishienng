package io.netty.channel.group;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultChannelGroup extends java.util.AbstractSet<io.netty.channel.Channel> implements io.netty.channel.group.ChannelGroup {
    private static final java.util.concurrent.atomic.AtomicInteger nextId = null;
    private volatile boolean closed;
    private final io.netty.util.concurrent.EventExecutor executor;
    private final java.lang.String name;
    private final java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> nonServerChannels;
    private final io.netty.channel.ChannelFutureListener remover;
    private final java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> serverChannels;
    private final boolean stayClosed;
    private final io.netty.channel.group.VoidChannelGroupFuture voidFuture;


    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            io.netty.channel.group.DefaultChannelGroup.nextId = r0
            return
    }

    public DefaultChannelGroup(io.netty.util.concurrent.EventExecutor r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultChannelGroup(io.netty.util.concurrent.EventExecutor r3, boolean r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "group-0x"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = io.netty.channel.group.DefaultChannelGroup.nextId
            int r1 = r1.incrementAndGet()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r3, r4)
            return
    }

    public DefaultChannelGroup(java.lang.String r2, io.netty.util.concurrent.EventExecutor r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultChannelGroup(java.lang.String r2, io.netty.util.concurrent.EventExecutor r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r1.serverChannels = r0
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r1.nonServerChannels = r0
            io.netty.channel.group.DefaultChannelGroup$1 r0 = new io.netty.channel.group.DefaultChannelGroup$1
            r0.<init>(r1)
            r1.remover = r0
            io.netty.channel.group.VoidChannelGroupFuture r0 = new io.netty.channel.group.VoidChannelGroupFuture
            r0.<init>(r1)
            r1.voidFuture = r0
            if (r2 == 0) goto L26
            r1.name = r2
            r1.executor = r3
            r1.stayClosed = r4
            return
        L26:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "name"
            r2.<init>(r3)
            throw r2
    }

    private static java.lang.Object safeDuplicate(java.lang.Object r1) {
            boolean r0 = r1 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            io.netty.buffer.ByteBuf r1 = r1.retainedDuplicate()
            return r1
        Lb:
            boolean r0 = r1 instanceof io.netty.buffer.ByteBufHolder
            if (r0 == 0) goto L16
            io.netty.buffer.ByteBufHolder r1 = (io.netty.buffer.ByteBufHolder) r1
            io.netty.buffer.ByteBufHolder r1 = r1.retainedDuplicate()
            return r1
        L16:
            java.lang.Object r1 = io.netty.util.ReferenceCountUtil.retain(r1)
            return r1
    }

    public boolean add(io.netty.channel.Channel r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.channel.ServerChannel
            if (r0 == 0) goto L7
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r3.serverChannels
            goto L9
        L7:
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r3.nonServerChannels
        L9:
            io.netty.channel.ChannelId r1 = r4.id()
            java.lang.Object r0 = r0.putIfAbsent(r1, r4)
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L21
            io.netty.channel.ChannelFuture r1 = r4.closeFuture()
            io.netty.channel.ChannelFutureListener r2 = r3.remover
            r1.addListener(r2)
        L21:
            boolean r1 = r3.stayClosed
            if (r1 == 0) goto L2c
            boolean r1 = r3.closed
            if (r1 == 0) goto L2c
            r4.close()
        L2c:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.nonServerChannels
            r0.clear()
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.serverChannels
            r0.clear()
            return
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture close() {
            r1 = this;
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.all()
            io.netty.channel.group.ChannelGroupFuture r0 = r1.close(r0)
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture close(io.netty.channel.group.ChannelMatcher r5) {
            r4 = this;
            if (r5 == 0) goto L62
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r4.size()
            r0.<init>(r1)
            boolean r1 = r4.stayClosed
            if (r1 == 0) goto L12
            r1 = 1
            r4.closed = r1
        L12:
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r4.serverChannels
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            boolean r3 = r5.matches(r2)
            if (r3 == 0) goto L1c
            io.netty.channel.ChannelFuture r3 = r2.close()
            r0.put(r2, r3)
            goto L1c
        L36:
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r4.nonServerChannels
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L40:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            boolean r3 = r5.matches(r2)
            if (r3 == 0) goto L40
            io.netty.channel.ChannelFuture r3 = r2.close()
            r0.put(r2, r3)
            goto L40
        L5a:
            io.netty.channel.group.DefaultChannelGroupFuture r5 = new io.netty.channel.group.DefaultChannelGroupFuture
            io.netty.util.concurrent.EventExecutor r1 = r4.executor
            r5.<init>(r4, r0, r1)
            return r5
        L62:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "matcher"
            r5.<init>(r0)
            throw r5
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.channel.group.ChannelGroup r3) {
            r2 = this;
            java.lang.String r0 = r2.name()
            java.lang.String r1 = r3.name()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            int r0 = java.lang.System.identityHashCode(r2)
            int r3 = java.lang.System.identityHashCode(r3)
            int r0 = r0 - r3
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.channel.group.ChannelGroup r1) {
            r0 = this;
            io.netty.channel.group.ChannelGroup r1 = (io.netty.channel.group.ChannelGroup) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.channel.ServerChannel
            if (r0 == 0) goto Lb
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.serverChannels
            boolean r2 = r0.containsValue(r2)
            return r2
        Lb:
            boolean r0 = r2 instanceof io.netty.channel.Channel
            if (r0 == 0) goto L16
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.nonServerChannels
            boolean r2 = r0.containsValue(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture deregister() {
            r1 = this;
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.all()
            io.netty.channel.group.ChannelGroupFuture r0 = r1.deregister(r0)
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture deregister(io.netty.channel.group.ChannelMatcher r5) {
            r4 = this;
            if (r5 == 0) goto L5b
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r4.serverChannels
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            boolean r3 = r5.matches(r2)
            if (r3 == 0) goto L15
            io.netty.channel.ChannelFuture r3 = r2.deregister()
            r0.put(r2, r3)
            goto L15
        L2f:
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r4.nonServerChannels
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            boolean r3 = r5.matches(r2)
            if (r3 == 0) goto L39
            io.netty.channel.ChannelFuture r3 = r2.deregister()
            r0.put(r2, r3)
            goto L39
        L53:
            io.netty.channel.group.DefaultChannelGroupFuture r5 = new io.netty.channel.group.DefaultChannelGroupFuture
            io.netty.util.concurrent.EventExecutor r1 = r4.executor
            r5.<init>(r4, r0, r1)
            return r5
        L5b:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "matcher"
            r5.<init>(r0)
            throw r5
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture disconnect() {
            r1 = this;
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.all()
            io.netty.channel.group.ChannelGroupFuture r0 = r1.disconnect(r0)
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture disconnect(io.netty.channel.group.ChannelMatcher r5) {
            r4 = this;
            if (r5 == 0) goto L5b
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r4.serverChannels
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            boolean r3 = r5.matches(r2)
            if (r3 == 0) goto L15
            io.netty.channel.ChannelFuture r3 = r2.disconnect()
            r0.put(r2, r3)
            goto L15
        L2f:
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r4.nonServerChannels
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            boolean r3 = r5.matches(r2)
            if (r3 == 0) goto L39
            io.netty.channel.ChannelFuture r3 = r2.disconnect()
            r0.put(r2, r3)
            goto L39
        L53:
            io.netty.channel.group.DefaultChannelGroupFuture r5 = new io.netty.channel.group.DefaultChannelGroupFuture
            io.netty.util.concurrent.EventExecutor r1 = r4.executor
            r5.<init>(r4, r0, r1)
            return r5
        L5b:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "matcher"
            r5.<init>(r0)
            throw r5
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.Channel find(io.netty.channel.ChannelId r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.nonServerChannels
            java.lang.Object r0 = r0.get(r2)
            io.netty.channel.Channel r0 = (io.netty.channel.Channel) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.serverChannels
            java.lang.Object r2 = r0.get(r2)
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            return r2
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroup flush() {
            r1 = this;
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.all()
            io.netty.channel.group.ChannelGroup r0 = r1.flush(r0)
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroup flush(io.netty.channel.group.ChannelMatcher r4) {
            r3 = this;
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r3.nonServerChannels
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            boolean r2 = r4.matches(r1)
            if (r2 == 0) goto La
            r1.flush()
            goto La
        L20:
            return r3
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture flushAndWrite(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.group.ChannelGroupFuture r1 = r0.writeAndFlush(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture flushAndWrite(java.lang.Object r1, io.netty.channel.group.ChannelMatcher r2) {
            r0 = this;
            io.netty.channel.group.ChannelGroupFuture r1 = r0.writeAndFlush(r1, r2)
            return r1
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = java.lang.System.identityHashCode(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.nonServerChannels
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.serverChannels
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<io.netty.channel.Channel> iterator() {
            r3 = this;
            io.netty.channel.group.CombinedIterator r0 = new io.netty.channel.group.CombinedIterator
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r3.serverChannels
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r2 = r3.nonServerChannels
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroup
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture newCloseFuture() {
            r1 = this;
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.all()
            io.netty.channel.group.ChannelGroupFuture r0 = r1.newCloseFuture(r0)
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture newCloseFuture(io.netty.channel.group.ChannelMatcher r5) {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r4.serverChannels
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            boolean r3 = r5.matches(r2)
            if (r3 == 0) goto L13
            io.netty.channel.ChannelFuture r3 = r2.closeFuture()
            r0.put(r2, r3)
            goto L13
        L2d:
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r4.nonServerChannels
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            boolean r3 = r5.matches(r2)
            if (r3 == 0) goto L37
            io.netty.channel.ChannelFuture r3 = r2.closeFuture()
            r0.put(r2, r3)
            goto L37
        L51:
            io.netty.channel.group.DefaultChannelGroupFuture r5 = new io.netty.channel.group.DefaultChannelGroupFuture
            io.netty.util.concurrent.EventExecutor r1 = r4.executor
            r5.<init>(r4, r0, r1)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.channel.ChannelId
            if (r0 == 0) goto L18
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.nonServerChannels
            java.lang.Object r0 = r0.remove(r2)
            io.netty.channel.Channel r0 = (io.netty.channel.Channel) r0
            if (r0 != 0) goto L3f
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.serverChannels
            java.lang.Object r2 = r0.remove(r2)
            r0 = r2
            io.netty.channel.Channel r0 = (io.netty.channel.Channel) r0
            goto L3f
        L18:
            boolean r0 = r2 instanceof io.netty.channel.Channel
            if (r0 == 0) goto L3e
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            boolean r0 = r2 instanceof io.netty.channel.ServerChannel
            if (r0 == 0) goto L30
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.serverChannels
            io.netty.channel.ChannelId r2 = r2.id()
            java.lang.Object r2 = r0.remove(r2)
            r0 = r2
            io.netty.channel.Channel r0 = (io.netty.channel.Channel) r0
            goto L3f
        L30:
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r1.nonServerChannels
            io.netty.channel.ChannelId r2 = r2.id()
            java.lang.Object r2 = r0.remove(r2)
            r0 = r2
            io.netty.channel.Channel r0 = (io.netty.channel.Channel) r0
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 != 0) goto L43
            r2 = 0
            return r2
        L43:
            io.netty.channel.ChannelFuture r2 = r0.closeFuture()
            io.netty.channel.ChannelFutureListener r0 = r1.remover
            r2.removeListener(r0)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r2 = this;
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r2.nonServerChannels
            int r0 = r0.size()
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r2.serverChannels
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r2.serverChannels
            java.util.Collection r1 = r1.values()
            r0.addAll(r1)
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r2.nonServerChannels
            java.util.Collection r1 = r1.values()
            r0.addAll(r1)
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r2.serverChannels
            java.util.Collection r1 = r1.values()
            r0.addAll(r1)
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r1 = r2.nonServerChannels
            java.util.Collection r1 = r1.values()
            r0.addAll(r1)
            java.lang.Object[] r3 = r0.toArray(r3)
            return r3
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = "(name: "
            r0.append(r1)
            java.lang.String r1 = r2.name()
            r0.append(r1)
            java.lang.String r1 = ", size: "
            r0.append(r1)
            int r1 = r2.size()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture write(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.all()
            io.netty.channel.group.ChannelGroupFuture r2 = r1.write(r2, r0)
            return r2
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture write(java.lang.Object r2, io.netty.channel.group.ChannelMatcher r3) {
            r1 = this;
            r0 = 0
            io.netty.channel.group.ChannelGroupFuture r2 = r1.write(r2, r3, r0)
            return r2
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture write(java.lang.Object r4, io.netty.channel.group.ChannelMatcher r5, boolean r6) {
            r3 = this;
            if (r4 == 0) goto L75
            if (r5 == 0) goto L6d
            if (r6 == 0) goto L31
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r6 = r3.nonServerChannels
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r6.next()
            io.netty.channel.Channel r0 = (io.netty.channel.Channel) r0
            boolean r1 = r5.matches(r0)
            if (r1 == 0) goto L10
            java.lang.Object r1 = safeDuplicate(r4)
            io.netty.channel.ChannelPromise r2 = r0.voidPromise()
            r0.write(r1, r2)
            goto L10
        L2e:
            io.netty.channel.group.VoidChannelGroupFuture r5 = r3.voidFuture
            goto L69
        L31:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            int r0 = r3.size()
            r6.<init>(r0)
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r3.nonServerChannels
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r0.next()
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            boolean r2 = r5.matches(r1)
            if (r2 == 0) goto L44
            java.lang.Object r2 = safeDuplicate(r4)
            io.netty.channel.ChannelFuture r2 = r1.write(r2)
            r6.put(r1, r2)
            goto L44
        L62:
            io.netty.channel.group.DefaultChannelGroupFuture r5 = new io.netty.channel.group.DefaultChannelGroupFuture
            io.netty.util.concurrent.EventExecutor r0 = r3.executor
            r5.<init>(r3, r6, r0)
        L69:
            io.netty.util.ReferenceCountUtil.release(r4)
            return r5
        L6d:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "matcher"
            r4.<init>(r5)
            throw r4
        L75:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "message"
            r4.<init>(r5)
            throw r4
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture writeAndFlush(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.all()
            io.netty.channel.group.ChannelGroupFuture r2 = r1.writeAndFlush(r2, r0)
            return r2
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture writeAndFlush(java.lang.Object r2, io.netty.channel.group.ChannelMatcher r3) {
            r1 = this;
            r0 = 0
            io.netty.channel.group.ChannelGroupFuture r2 = r1.writeAndFlush(r2, r3, r0)
            return r2
    }

    @Override // io.netty.channel.group.ChannelGroup
    public io.netty.channel.group.ChannelGroupFuture writeAndFlush(java.lang.Object r4, io.netty.channel.group.ChannelMatcher r5, boolean r6) {
            r3 = this;
            if (r4 == 0) goto L6b
            if (r6 == 0) goto L2f
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r6 = r3.nonServerChannels
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        Le:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r6.next()
            io.netty.channel.Channel r0 = (io.netty.channel.Channel) r0
            boolean r1 = r5.matches(r0)
            if (r1 == 0) goto Le
            java.lang.Object r1 = safeDuplicate(r4)
            io.netty.channel.ChannelPromise r2 = r0.voidPromise()
            r0.writeAndFlush(r1, r2)
            goto Le
        L2c:
            io.netty.channel.group.VoidChannelGroupFuture r5 = r3.voidFuture
            goto L67
        L2f:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            int r0 = r3.size()
            r6.<init>(r0)
            java.util.concurrent.ConcurrentMap<io.netty.channel.ChannelId, io.netty.channel.Channel> r0 = r3.nonServerChannels
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L42:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            boolean r2 = r5.matches(r1)
            if (r2 == 0) goto L42
            java.lang.Object r2 = safeDuplicate(r4)
            io.netty.channel.ChannelFuture r2 = r1.writeAndFlush(r2)
            r6.put(r1, r2)
            goto L42
        L60:
            io.netty.channel.group.DefaultChannelGroupFuture r5 = new io.netty.channel.group.DefaultChannelGroupFuture
            io.netty.util.concurrent.EventExecutor r0 = r3.executor
            r5.<init>(r3, r6, r0)
        L67:
            io.netty.util.ReferenceCountUtil.release(r4)
            return r5
        L6b:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "message"
            r4.<init>(r5)
            throw r4
    }
}
