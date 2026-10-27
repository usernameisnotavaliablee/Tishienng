package androidx.core.util;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$4\n*L\n1#1,54:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LruCacheKt$lruCache$4<K, V> extends android.util.LruCache<K, V> {
    final /* synthetic */ kotlin.jvm.functions.Function1<K, V> $create;
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.n1> $onEntryRemoved;
    final /* synthetic */ kotlin.jvm.functions.Function2<K, V, java.lang.Integer> $sizeOf;

    public LruCacheKt$lruCache$4(int r1, kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> r2, kotlin.jvm.functions.Function1<? super K, ? extends V> r3, kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.n1> r4) {
            r0 = this;
            r0.$sizeOf = r2
            r0.$create = r3
            r0.$onEntryRemoved = r4
            r0.<init>(r1)
            return
    }

    @Override // android.util.LruCache
    @org.jetbrains.annotations.Nullable
    protected V create(@org.jetbrains.annotations.NotNull K r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<K, V> r0 = r1.$create
            java.lang.Object r2 = r0.invoke(r2)
            return r2
    }

    @Override // android.util.LruCache
    protected void entryRemoved(boolean r2, @org.jetbrains.annotations.NotNull K r3, @org.jetbrains.annotations.NotNull V r4, @org.jetbrains.annotations.Nullable V r5) {
            r1 = this;
            kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.n1> r0 = r1.$onEntryRemoved
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.invoke(r2, r3, r4, r5)
            return
    }

    @Override // android.util.LruCache
    protected int sizeOf(@org.jetbrains.annotations.NotNull K r2, @org.jetbrains.annotations.NotNull V r3) {
            r1 = this;
            kotlin.jvm.functions.Function2<K, V, java.lang.Integer> r0 = r1.$sizeOf
            java.lang.Object r2 = r0.invoke(r2, r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
    }
}
