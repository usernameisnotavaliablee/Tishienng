package okhttp3.internal.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$snapshots$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1120:1\n1#2:1121\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class DiskLruCache$snapshots$1 implements java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot>, l3.d {
    private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> delegate;
    private okhttp3.internal.cache.DiskLruCache.Snapshot nextSnapshot;
    private okhttp3.internal.cache.DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

    DiskLruCache$snapshots$1(okhttp3.internal.cache.DiskLruCache r2) {
            r1 = this;
            r1.this$0 = r2
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.LinkedHashMap r2 = r2.getLruEntries$okhttp()
            java.util.Collection r2 = r2.values()
            r0.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
            java.lang.String r0 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.delegate = r2
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r4 = this;
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r4.nextSnapshot
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
            monitor-enter(r0)
            boolean r2 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r2 == 0) goto L12
            monitor-exit(r0)
            return r3
        L12:
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Entry> r2 = r4.delegate     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L31
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Entry> r2 = r4.delegate     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.cache.DiskLruCache$Entry r2 = (okhttp3.internal.cache.DiskLruCache.Entry) r2     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L12
            okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r2.snapshot$okhttp()     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L2b
            goto L12
        L2b:
            r4.nextSnapshot = r2     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            return r1
        L2f:
            r1 = move-exception
            goto L35
        L31:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            return r3
        L35:
            monitor-exit(r0)
            throw r1
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ okhttp3.internal.cache.DiskLruCache.Snapshot next() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r1.next2()
            return r0
    }

    @Override // java.util.Iterator
    /* renamed from: next, reason: avoid collision after fix types in other method */
    public okhttp3.internal.cache.DiskLruCache.Snapshot next2() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L11
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r2.nextSnapshot
            r2.removeSnapshot = r0
            r1 = 0
            r2.nextSnapshot = r1
            kotlin.jvm.internal.g0.m(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r3 = this;
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r3.removeSnapshot
            if (r0 == 0) goto L18
            r1 = 0
            okhttp3.internal.cache.DiskLruCache r2 = r3.this$0     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L15
            java.lang.String r0 = r0.key()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L15
            r2.remove(r0)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L15
            r3.removeSnapshot = r1
            return
        L11:
            r0 = move-exception
            r3.removeSnapshot = r1
            throw r0
        L15:
            r3.removeSnapshot = r1
            return
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remove() before next()"
            r0.<init>(r1)
            throw r0
    }
}
