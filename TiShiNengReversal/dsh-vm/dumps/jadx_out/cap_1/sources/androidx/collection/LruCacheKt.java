package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LruCacheKt {
    @org.jetbrains.annotations.NotNull
    public static final <K, V> androidx.collection.LruCache<K, V> lruCache(int r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.n1> r4) {
            java.lang.String r0 = "sizeOf"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "create"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "onEntryRemoved"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.collection.LruCacheKt$lruCache$4 r0 = new androidx.collection.LruCacheKt$lruCache$4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ androidx.collection.LruCache lruCache$default(int r0, kotlin.jvm.functions.Function2 r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.functions.Function4 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            androidx.collection.LruCacheKt$lruCache$1 r1 = androidx.collection.LruCacheKt$lruCache$1.INSTANCE
        L6:
            r5 = r4 & 4
            if (r5 == 0) goto Lc
            androidx.collection.LruCacheKt$lruCache$2 r2 = androidx.collection.LruCacheKt$lruCache$2.INSTANCE
        Lc:
            r4 = r4 & 8
            if (r4 == 0) goto L12
            androidx.collection.LruCacheKt$lruCache$3 r3 = androidx.collection.LruCacheKt$lruCache$3.INSTANCE
        L12:
            java.lang.String r4 = "sizeOf"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "create"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "onEntryRemoved"
            kotlin.jvm.internal.g0.p(r3, r4)
            androidx.collection.LruCacheKt$lruCache$4 r4 = new androidx.collection.LruCacheKt$lruCache$4
            r4.<init>(r0, r1, r2, r3)
            return r4
    }
}
