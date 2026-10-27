package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class Cache<E> {
    private static final java.util.concurrent.ScheduledFuture<?> CANCELLED = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.resolver.dns.Cache.Entries, java.util.concurrent.ScheduledFuture> FUTURE_UPDATER = null;
    static final int MAX_SUPPORTED_TTL_SECS = 0;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.resolver.dns.Cache<E>.Entries> resolveCache;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Entries extends java.util.concurrent.atomic.AtomicReference<java.util.List<E>> implements java.lang.Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        volatile java.util.concurrent.ScheduledFuture<?> expirationFuture;
        private final java.lang.String hostname;
        final /* synthetic */ io.netty.resolver.dns.Cache this$0;

        static {
                return
        }

        Entries(io.netty.resolver.dns.Cache r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                java.util.List r1 = java.util.Collections.EMPTY_LIST
                r0.<init>(r1)
                r0.hostname = r2
                return
        }

        private void scheduleCacheExpirationIfNeeded(int r7, io.netty.channel.EventLoop r8) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = io.netty.resolver.dns.Cache.access$000()
                java.lang.Object r0 = r0.get(r6)
                java.util.concurrent.ScheduledFuture r0 = (java.util.concurrent.ScheduledFuture) r0
                if (r0 == 0) goto L17
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
                long r1 = r0.getDelay(r1)
                long r3 = (long) r7
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L2e
            L17:
                long r1 = (long) r7
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
                io.netty.util.concurrent.ScheduledFuture r1 = r8.schedule(r6, r1, r3)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = io.netty.resolver.dns.Cache.access$000()
                boolean r2 = androidx.concurrent.futures.a.a(r2, r6, r0, r1)
                r3 = 1
                if (r2 == 0) goto L2f
                if (r0 == 0) goto L2e
                r0.cancel(r3)
            L2e:
                return
            L2f:
                r1.cancel(r3)
                goto L0
        }

        void add(E r6, int r7, io.netty.channel.EventLoop r8) {
                r5 = this;
                io.netty.resolver.dns.Cache r0 = r5.this$0
                boolean r0 = r0.shouldReplaceAll(r6)
                if (r0 != 0) goto L8e
            L8:
                java.lang.Object r0 = r5.get()
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L80
                r1 = 0
                java.lang.Object r2 = r0.get(r1)
                io.netty.resolver.dns.Cache r3 = r5.this$0
                boolean r2 = r3.shouldReplaceAll(r2)
                if (r2 == 0) goto L2f
                java.util.List r1 = java.util.Collections.singletonList(r6)
                boolean r0 = r5.compareAndSet(r0, r1)
                if (r0 == 0) goto L8
                r5.scheduleCacheExpirationIfNeeded(r7, r8)
                return
            L2f:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r0.size()
                int r3 = r3 + 1
                r2.<init>(r3)
            L3a:
                java.lang.Object r3 = r0.get(r1)
                io.netty.resolver.dns.Cache r4 = r5.this$0
                boolean r4 = r4.equals(r6, r3)
                if (r4 != 0) goto L53
                r2.add(r3)
                int r1 = r1 + 1
                int r3 = r0.size()
                if (r1 < r3) goto L3a
                r3 = 0
                goto L66
            L53:
                r2.add(r6)
            L56:
                int r1 = r1 + 1
                int r4 = r0.size()
                if (r1 >= r4) goto L66
                java.lang.Object r4 = r0.get(r1)
                r2.add(r4)
                goto L56
            L66:
                if (r3 != 0) goto L6b
                r2.add(r6)
            L6b:
                io.netty.resolver.dns.Cache r1 = r5.this$0
                java.lang.String r3 = r5.hostname
                r1.sortEntries(r3, r2)
                java.util.List r1 = java.util.Collections.unmodifiableList(r2)
                boolean r0 = r5.compareAndSet(r0, r1)
                if (r0 == 0) goto L8
                r5.scheduleCacheExpirationIfNeeded(r7, r8)
                return
            L80:
                java.util.List r1 = java.util.Collections.singletonList(r6)
                boolean r0 = r5.compareAndSet(r0, r1)
                if (r0 == 0) goto L8
                r5.scheduleCacheExpirationIfNeeded(r7, r8)
                return
            L8e:
                java.util.List r6 = java.util.Collections.singletonList(r6)
                r5.set(r6)
                r5.scheduleCacheExpirationIfNeeded(r7, r8)
                return
        }

        boolean clearAndCancel() {
                r3 = this;
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                java.lang.Object r0 = r3.getAndSet(r0)
                java.util.List r0 = (java.util.List) r0
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 == 0) goto L10
                return r1
            L10:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = io.netty.resolver.dns.Cache.access$000()
                java.util.concurrent.ScheduledFuture r2 = io.netty.resolver.dns.Cache.access$100()
                java.lang.Object r0 = r0.getAndSet(r3, r2)
                java.util.concurrent.ScheduledFuture r0 = (java.util.concurrent.ScheduledFuture) r0
                if (r0 == 0) goto L23
                r0.cancel(r1)
            L23:
                r0 = 1
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                io.netty.resolver.dns.Cache r0 = r2.this$0
                java.util.concurrent.ConcurrentMap r0 = io.netty.resolver.dns.Cache.access$200(r0)
                java.lang.String r1 = r2.hostname
                r0.remove(r1, r2)
                r2.clearAndCancel()
                return
        }
    }

    static {
            java.lang.Class<java.util.concurrent.ScheduledFuture> r0 = java.util.concurrent.ScheduledFuture.class
            java.lang.String r1 = "expirationFuture"
            java.lang.Class<io.netty.resolver.dns.Cache$Entries> r2 = io.netty.resolver.dns.Cache.Entries.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            io.netty.resolver.dns.Cache.FUTURE_UPDATER = r0
            io.netty.resolver.dns.Cache$1 r0 = new io.netty.resolver.dns.Cache$1
            r0.<init>()
            io.netty.resolver.dns.Cache.CANCELLED = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r1 = 730(0x2da, double:3.607E-321)
            long r0 = r0.toSeconds(r1)
            int r1 = (int) r0
            io.netty.resolver.dns.Cache.MAX_SUPPORTED_TTL_SECS = r1
            return
    }

    Cache() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r1.resolveCache = r0
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$000() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.resolver.dns.Cache$Entries, java.util.concurrent.ScheduledFuture> r0 = io.netty.resolver.dns.Cache.FUTURE_UPDATER
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$100() {
            java.util.concurrent.ScheduledFuture<?> r0 = io.netty.resolver.dns.Cache.CANCELLED
            return r0
    }

    static /* synthetic */ java.util.concurrent.ConcurrentMap access$200(io.netty.resolver.dns.Cache r0) {
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.resolver.dns.Cache<E>$Entries> r0 = r0.resolveCache
            return r0
    }

    final void cache(java.lang.String r3, E r4, int r5, io.netty.channel.EventLoop r6) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.resolver.dns.Cache<E>$Entries> r0 = r2.resolveCache
            java.lang.Object r0 = r0.get(r3)
            io.netty.resolver.dns.Cache$Entries r0 = (io.netty.resolver.dns.Cache.Entries) r0
            if (r0 != 0) goto L1a
            io.netty.resolver.dns.Cache$Entries r0 = new io.netty.resolver.dns.Cache$Entries
            r0.<init>(r2, r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.resolver.dns.Cache<E>$Entries> r1 = r2.resolveCache
            java.lang.Object r3 = r1.putIfAbsent(r3, r0)
            io.netty.resolver.dns.Cache$Entries r3 = (io.netty.resolver.dns.Cache.Entries) r3
            if (r3 == 0) goto L1a
            r0 = r3
        L1a:
            r0.add(r4, r5, r6)
            return
    }

    final void clear() {
            r2 = this;
        L0:
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.resolver.dns.Cache<E>$Entries> r0 = r2.resolveCache
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.resolver.dns.Cache<E>$Entries> r0 = r2.resolveCache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L0
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r0.remove()
            java.lang.Object r1 = r1.getValue()
            io.netty.resolver.dns.Cache$Entries r1 = (io.netty.resolver.dns.Cache.Entries) r1
            r1.clearAndCancel()
            goto L12
        L2b:
            return
    }

    final boolean clear(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.resolver.dns.Cache<E>$Entries> r0 = r1.resolveCache
            java.lang.Object r2 = r0.remove(r2)
            io.netty.resolver.dns.Cache$Entries r2 = (io.netty.resolver.dns.Cache.Entries) r2
            if (r2 == 0) goto L12
            boolean r2 = r2.clearAndCancel()
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    protected abstract boolean equals(E r1, E r2);

    final java.util.List<? extends E> get(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.resolver.dns.Cache<E>$Entries> r0 = r1.resolveCache
            java.lang.Object r2 = r0.get(r2)
            io.netty.resolver.dns.Cache$Entries r2 = (io.netty.resolver.dns.Cache.Entries) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.Object r2 = r2.get()
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    protected abstract boolean shouldReplaceAll(E r1);

    final int size() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.resolver.dns.Cache<E>$Entries> r0 = r1.resolveCache
            int r0 = r0.size()
            return r0
    }

    protected void sortEntries(java.lang.String r1, java.util.List<E> r2) {
            r0 = this;
            return
    }
}
