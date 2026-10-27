package io.netty.channel.group;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DefaultChannelGroupFuture extends io.netty.util.concurrent.DefaultPromise<java.lang.Void> implements io.netty.channel.group.ChannelGroupFuture {
    private final io.netty.channel.ChannelFutureListener childListener;
    private int failureCount;
    private final java.util.Map<io.netty.channel.Channel, io.netty.channel.ChannelFuture> futures;
    private final io.netty.channel.group.ChannelGroup group;
    private int successCount;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultEntry<K, V> implements java.util.Map.Entry<K, V> {
        private final K key;
        private final V value;

        DefaultEntry(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r2
                return
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "read-only"
                r2.<init>(r0)
                throw r2
        }
    }

    DefaultChannelGroupFuture(io.netty.channel.group.ChannelGroup r2, java.util.Collection<io.netty.channel.ChannelFuture> r3, io.netty.util.concurrent.EventExecutor r4) {
            r1 = this;
            r1.<init>(r4)
            io.netty.channel.group.DefaultChannelGroupFuture$1 r4 = new io.netty.channel.group.DefaultChannelGroupFuture$1
            r4.<init>(r1)
            r1.childListener = r4
            if (r2 == 0) goto L61
            if (r3 == 0) goto L59
            r1.group = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r3.next()
            io.netty.channel.ChannelFuture r4 = (io.netty.channel.ChannelFuture) r4
            io.netty.channel.Channel r0 = r4.channel()
            r2.put(r0, r4)
            goto L19
        L2d:
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r1.futures = r2
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L3b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()
            io.netty.channel.ChannelFuture r3 = (io.netty.channel.ChannelFuture) r3
            io.netty.channel.ChannelFutureListener r4 = r1.childListener
            r3.addListener(r4)
            goto L3b
        L4d:
            java.util.Map<io.netty.channel.Channel, io.netty.channel.ChannelFuture> r2 = r1.futures
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L58
            r1.setSuccess0()
        L58:
            return
        L59:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "futures"
            r2.<init>(r3)
            throw r2
        L61:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "group"
            r2.<init>(r3)
            throw r2
    }

    DefaultChannelGroupFuture(io.netty.channel.group.ChannelGroup r1, java.util.Map<io.netty.channel.Channel, io.netty.channel.ChannelFuture> r2, io.netty.util.concurrent.EventExecutor r3) {
            r0 = this;
            r0.<init>(r3)
            io.netty.channel.group.DefaultChannelGroupFuture$1 r3 = new io.netty.channel.group.DefaultChannelGroupFuture$1
            r3.<init>(r0)
            r0.childListener = r3
            r0.group = r1
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            r0.futures = r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            io.netty.channel.ChannelFuture r2 = (io.netty.channel.ChannelFuture) r2
            io.netty.channel.ChannelFutureListener r3 = r0.childListener
            r2.addListener(r3)
            goto L1a
        L2c:
            java.util.Map<io.netty.channel.Channel, io.netty.channel.ChannelFuture> r1 = r0.futures
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L37
            r0.setSuccess0()
        L37:
            return
    }

    static /* synthetic */ int access$000(io.netty.channel.group.DefaultChannelGroupFuture r0) {
            int r0 = r0.successCount
            return r0
    }

    static /* synthetic */ int access$008(io.netty.channel.group.DefaultChannelGroupFuture r2) {
            int r0 = r2.successCount
            int r1 = r0 + 1
            r2.successCount = r1
            return r0
    }

    static /* synthetic */ int access$100(io.netty.channel.group.DefaultChannelGroupFuture r0) {
            int r0 = r0.failureCount
            return r0
    }

    static /* synthetic */ int access$108(io.netty.channel.group.DefaultChannelGroupFuture r2) {
            int r0 = r2.failureCount
            int r1 = r0 + 1
            r2.failureCount = r1
            return r0
    }

    static /* synthetic */ java.util.Map access$200(io.netty.channel.group.DefaultChannelGroupFuture r0) {
            java.util.Map<io.netty.channel.Channel, io.netty.channel.ChannelFuture> r0 = r0.futures
            return r0
    }

    static /* synthetic */ void access$300(io.netty.channel.group.DefaultChannelGroupFuture r0, io.netty.channel.group.ChannelGroupException r1) {
            r0.setFailure0(r1)
            return
    }

    static /* synthetic */ void access$400(io.netty.channel.group.DefaultChannelGroupFuture r0) {
            r0.setSuccess0()
            return
    }

    private void setFailure0(io.netty.channel.group.ChannelGroupException r1) {
            r0 = this;
            super.setFailure(r1)
            return
    }

    private void setSuccess0() {
            r1 = this;
            r0 = 0
            super.setSuccess(r0)
            return
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public /* bridge */ /* synthetic */ io.netty.channel.group.ChannelGroupFuture addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.DefaultChannelGroupFuture addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            super.addListener(r1)
            return r0
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m146addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.addListener(r1)
            return r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m147addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public /* bridge */ /* synthetic */ io.netty.channel.group.ChannelGroupFuture addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.DefaultChannelGroupFuture addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            super.addListeners(r1)
            return r0
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m148addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.addListeners(r1)
            return r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m149addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public /* bridge */ /* synthetic */ io.netty.channel.group.ChannelGroupFuture await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.DefaultChannelGroupFuture await() throws java.lang.InterruptedException {
            r0 = this;
            super.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m150await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m151await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public /* bridge */ /* synthetic */ io.netty.channel.group.ChannelGroupFuture awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.DefaultChannelGroupFuture awaitUninterruptibly() {
            r0 = this;
            super.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m152awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m153awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupException cause() {
            r1 = this;
            java.lang.Throwable r0 = super.cause()
            io.netty.channel.group.ChannelGroupException r0 = (io.netty.channel.group.ChannelGroupException) r0
            return r0
    }

    /* renamed from: cause, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Throwable m154cause() {
            r1 = this;
            io.netty.channel.group.ChannelGroupException r0 = r1.cause()
            return r0
    }

    protected void checkDeadLock() {
            r2 = this;
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            if (r0 == 0) goto L17
            io.netty.util.concurrent.ImmediateEventExecutor r1 = io.netty.util.concurrent.ImmediateEventExecutor.INSTANCE
            if (r0 == r1) goto L17
            boolean r0 = r0.inEventLoop()
            if (r0 != 0) goto L11
            goto L17
        L11:
            io.netty.util.concurrent.BlockingOperationException r0 = new io.netty.util.concurrent.BlockingOperationException
            r0.<init>()
            throw r0
        L17:
            return
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.ChannelFuture find(io.netty.channel.Channel r2) {
            r1 = this;
            java.util.Map<io.netty.channel.Channel, io.netty.channel.ChannelFuture> r0 = r1.futures
            java.lang.Object r2 = r0.get(r2)
            io.netty.channel.ChannelFuture r2 = (io.netty.channel.ChannelFuture) r2
            return r2
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroup group() {
            r1 = this;
            io.netty.channel.group.ChannelGroup r0 = r1.group
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public synchronized boolean isPartialFailure() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.failureCount     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            java.util.Map<io.netty.channel.Channel, io.netty.channel.ChannelFuture> r1 = r2.futures     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lf
            if (r0 == r1) goto L11
            r0 = 1
            goto L12
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = 0
        L12:
            monitor-exit(r2)
            return r0
        L14:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public synchronized boolean isPartialSuccess() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.successCount     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            java.util.Map<io.netty.channel.Channel, io.netty.channel.ChannelFuture> r1 = r2.futures     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lf
            if (r0 == r1) goto L11
            r0 = 1
            goto L12
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = 0
        L12:
            monitor-exit(r2)
            return r0
        L14:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture, java.lang.Iterable
    public java.util.Iterator<io.netty.channel.ChannelFuture> iterator() {
            r1 = this;
            java.util.Map<io.netty.channel.Channel, io.netty.channel.ChannelFuture> r0 = r1.futures
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public /* bridge */ /* synthetic */ io.netty.channel.group.ChannelGroupFuture removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.DefaultChannelGroupFuture removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            super.removeListener(r1)
            return r0
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m155removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.removeListener(r1)
            return r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m156removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public /* bridge */ /* synthetic */ io.netty.channel.group.ChannelGroupFuture removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.DefaultChannelGroupFuture removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            super.removeListeners(r1)
            return r0
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m157removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.removeListeners(r1)
            return r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m158removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.removeListeners(r1)
            return r1
    }

    public io.netty.channel.group.DefaultChannelGroupFuture setFailure(java.lang.Throwable r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    /* renamed from: setFailure, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m159setFailure(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.setFailure(r1)
            return r1
    }

    public io.netty.channel.group.DefaultChannelGroupFuture setSuccess(java.lang.Void r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise setSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            io.netty.channel.group.DefaultChannelGroupFuture r1 = r0.setSuccess(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public /* bridge */ /* synthetic */ io.netty.channel.group.ChannelGroupFuture sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.DefaultChannelGroupFuture sync() throws java.lang.InterruptedException {
            r0 = this;
            super.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m160sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m161sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public /* bridge */ /* synthetic */ io.netty.channel.group.ChannelGroupFuture syncUninterruptibly() {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.DefaultChannelGroupFuture syncUninterruptibly() {
            r0 = this;
            super.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m162syncUninterruptibly() {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m163syncUninterruptibly() {
            r1 = this;
            io.netty.channel.group.DefaultChannelGroupFuture r0 = r1.syncUninterruptibly()
            return r0
    }

    public boolean tryFailure(java.lang.Throwable r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    public /* bridge */ /* synthetic */ boolean trySuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            boolean r1 = r0.trySuccess(r1)
            return r1
    }

    public boolean trySuccess(java.lang.Void r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }
}
