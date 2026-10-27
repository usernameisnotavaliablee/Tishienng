package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n1661#1:1851\n1661#1:1852\n1661#1:1853\n1715#1:1854\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1680#1:1851\n1682#1:1852\n1685#1:1853\n1721#1:1854\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final long[] EmptyGroup = null;

    @org.jetbrains.annotations.NotNull
    private static final androidx.collection.MutableScatterMap EmptyScatterMap = null;
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    static {
            r0 = 2
            long[] r0 = new long[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [-9187201950435737345, -1} // fill-array
            androidx.collection.ScatterMapKt.EmptyGroup = r0
            androidx.collection.MutableScatterMap r0 = new androidx.collection.MutableScatterMap
            r1 = 0
            r0.<init>(r1)
            androidx.collection.ScatterMapKt.EmptyScatterMap = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> androidx.collection.ScatterMap<K, V> emptyScatterMap() {
            androidx.collection.MutableScatterMap r0 = androidx.collection.ScatterMapKt.EmptyScatterMap
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    public static final int get(long r0) {
            int r0 = java.lang.Long.numberOfTrailingZeros(r0)
            int r0 = r0 >> 3
            return r0
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getBitmaskLsb$annotations() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getBitmaskMsb$annotations() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getSentinel$annotations() {
            return
    }

    public static final long group(@org.jetbrains.annotations.NotNull long[] r5, int r6) {
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r6 >> 3
            r6 = r6 & 7
            int r6 = r6 << 3
            r1 = r5[r0]
            long r1 = r1 >>> r6
            int r0 = r0 + 1
            r3 = r5[r0]
            int r5 = 64 - r6
            long r3 = r3 << r5
            long r5 = (long) r6
            long r5 = -r5
            r0 = 63
            long r5 = r5 >> r0
            long r5 = r5 & r3
            long r5 = r5 | r1
            return r5
    }

    public static final int h1(int r0) {
            int r0 = r0 >>> 7
            return r0
    }

    public static final int h2(int r0) {
            r0 = r0 & 127(0x7f, float:1.78E-43)
            return r0
    }

    public static final boolean hasNext(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L8
            r3 = 1
            return r3
        L8:
            r3 = 0
            return r3
    }

    public static final int hash(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            if (r1 == 0) goto L7
            int r1 = r1.hashCode()
            goto L8
        L7:
            r1 = 0
        L8:
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            return r1
    }

    public static final boolean isDeleted(@org.jetbrains.annotations.NotNull long[] r3, int r4) {
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r4 >> 3
            r0 = r3[r0]
            r3 = r4 & 7
            int r3 = r3 << 3
            long r3 = r0 >> r3
            r0 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r0
            r0 = 254(0xfe, double:1.255E-321)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public static final boolean isEmpty(@org.jetbrains.annotations.NotNull long[] r3, int r4) {
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r4 >> 3
            r0 = r3[r0]
            r3 = r4 & 7
            int r3 = r3 << 3
            long r3 = r0 >> r3
            r0 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r0
            r0 = 128(0x80, double:6.3E-322)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @kotlin.PublishedApi
    public static final boolean isFull(long r3) {
            r0 = 128(0x80, double:6.3E-322)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r3 = 1
            return r3
        L8:
            r3 = 0
            return r3
    }

    public static final boolean isFull(@org.jetbrains.annotations.NotNull long[] r3, int r4) {
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r4 >> 3
            r0 = r3[r0]
            r3 = r4 & 7
            int r3 = r3 << 3
            long r3 = r0 >> r3
            r0 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r0
            r0 = 128(0x80, double:6.3E-322)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public static final int loadedCapacity(int r1) {
            r0 = 7
            if (r1 != r0) goto L5
            r1 = 6
            return r1
        L5:
            int r0 = r1 / 8
            int r1 = r1 - r0
            return r1
    }

    @kotlin.PublishedApi
    public static final int lowestBitSet(long r0) {
            int r0 = java.lang.Long.numberOfTrailingZeros(r0)
            int r0 = r0 >> 3
            return r0
    }

    public static final long maskEmpty(long r3) {
            long r0 = ~r3
            r2 = 6
            long r0 = r0 << r2
            long r3 = r3 & r0
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r0
            return r3
    }

    @kotlin.PublishedApi
    public static final long maskEmptyOrDeleted(long r3) {
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r3 = r3 & r0
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r0
            return r3
    }

    @kotlin.PublishedApi
    public static final long match(long r4, int r6) {
            long r0 = (long) r6
            r2 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 * r2
            long r4 = r4 ^ r0
            long r0 = r4 - r2
            long r4 = ~r4
            long r4 = r4 & r0
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r0
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> androidx.collection.MutableScatterMap<K, V> mutableScatterMapOf() {
            androidx.collection.MutableScatterMap r0 = new androidx.collection.MutableScatterMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> androidx.collection.MutableScatterMap<K, V> mutableScatterMapOf(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableScatterMap r0 = new androidx.collection.MutableScatterMap
            int r1 = r2.length
            r0.<init>(r1)
            r0.putAll(r2)
            return r0
    }

    public static final long next(long r2) {
            r0 = 1
            long r0 = r2 - r0
            long r2 = r2 & r0
            return r2
    }

    public static final int nextCapacity(int r0) {
            if (r0 != 0) goto L4
            r0 = 6
            return r0
        L4:
            int r0 = r0 * 2
            int r0 = r0 + 1
            return r0
    }

    public static final int normalizeCapacity(int r1) {
            if (r1 <= 0) goto La
            r0 = -1
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = r0 >>> r1
            return r1
        La:
            r1 = 0
            return r1
    }

    @kotlin.PublishedApi
    public static final long readRawMetadata(@org.jetbrains.annotations.NotNull long[] r2, int r3) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r3 >> 3
            r0 = r2[r0]
            r2 = r3 & 7
            int r2 = r2 << 3
            long r2 = r0 >> r2
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r0
            return r2
    }

    public static final int unloadedCapacity(int r2) {
            r0 = 7
            if (r2 != r0) goto L6
            r2 = 8
            return r2
        L6:
            int r1 = r2 + (-1)
            int r1 = r1 / r0
            int r2 = r2 + r1
            return r2
    }

    public static final void writeRawMetadata(@org.jetbrains.annotations.NotNull long[] r5, int r6, long r7) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r6 >> 3
            r6 = r6 & 7
            int r6 = r6 << 3
            r1 = r5[r0]
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 << r6
            long r3 = ~r3
            long r1 = r1 & r3
            long r6 = r7 << r6
            long r6 = r6 | r1
            r5[r0] = r6
            return
    }
}
