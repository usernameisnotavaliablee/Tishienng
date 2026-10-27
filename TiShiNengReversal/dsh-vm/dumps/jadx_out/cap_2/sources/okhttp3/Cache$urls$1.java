package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$urls$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,838:1\n1#2:839\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Cache$urls$1 implements java.util.Iterator<java.lang.String>, l3.d {
    private boolean canRemove;
    private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> delegate;
    private java.lang.String nextUrl;

    Cache$urls$1(okhttp3.Cache r1) {
            r0 = this;
            r0.<init>()
            okhttp3.internal.cache.DiskLruCache r1 = r1.getCache$okhttp()
            java.util.Iterator r1 = r1.snapshots()
            r0.delegate = r1
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r5 = this;
            java.lang.String r0 = r5.nextUrl
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 0
            r5.canRemove = r0
        L9:
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L38
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate     // Catch: java.io.IOException -> L2f
            java.lang.Object r2 = r2.next()     // Catch: java.io.IOException -> L2f
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.io.IOException -> L2f
            r3 = r2
            okhttp3.internal.cache.DiskLruCache$Snapshot r3 = (okhttp3.internal.cache.DiskLruCache.Snapshot) r3     // Catch: java.lang.Throwable -> L31
            okio.Source r3 = r3.getSource(r0)     // Catch: java.lang.Throwable -> L31
            okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r3.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L31
            r5.nextUrl = r3     // Catch: java.lang.Throwable -> L31
            r3 = 0
            kotlin.io.b.a(r2, r3)     // Catch: java.io.IOException -> L2f
            return r1
        L2f:
            goto L9
        L31:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L33
        L33:
            r4 = move-exception
            kotlin.io.b.a(r2, r3)     // Catch: java.io.IOException -> L2f
            throw r4     // Catch: java.io.IOException -> L2f
        L38:
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.String next() {
            r1 = this;
            java.lang.String r0 = r1.next2()
            return r0
    }

    @Override // java.util.Iterator
    /* renamed from: next, reason: avoid collision after fix types in other method */
    public java.lang.String next2() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L12
            java.lang.String r0 = r2.nextUrl
            kotlin.jvm.internal.g0.m(r0)
            r1 = 0
            r2.nextUrl = r1
            r1 = 1
            r2.canRemove = r1
            return r0
        L12:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            boolean r0 = r2.canRemove
            if (r0 == 0) goto La
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r0 = r2.delegate
            r0.remove()
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remove() before next()"
            r0.<init>(r1)
            throw r0
    }
}
