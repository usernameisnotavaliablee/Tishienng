package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmInline
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class IntIntPair {

    @kotlin.jvm.JvmField
    public final long packedValue;

    private /* synthetic */ IntIntPair(long r1) {
            r0 = this;
            r0.<init>()
            r0.packedValue = r1
            return
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.collection.IntIntPair m28boximpl(long r1) {
            androidx.collection.IntIntPair r0 = new androidx.collection.IntIntPair
            r0.<init>(r1)
            return r0
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m29component1impl(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r2 = (int) r1
            return r2
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m30component2impl(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r3 = (int) r2
            return r3
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m31constructorimpl(int r4, int r5) {
            long r0 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            long r4 = m32constructorimpl(r4)
            return r4
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m32constructorimpl(long r0) {
            return r0
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33equalsimpl(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof androidx.collection.IntIntPair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.collection.IntIntPair r6 = (androidx.collection.IntIntPair) r6
            long r2 = r6.m39unboximpl()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L11
            return r1
        L11:
            r4 = 1
            return r4
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m34equalsimpl0(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m35getFirstimpl(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r2 = (int) r1
            return r2
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
            return
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m36getSecondimpl(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r3 = (int) r2
            return r3
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m37hashCodeimpl(long r0) {
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m38toStringimpl(long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            int r1 = m35getFirstimpl(r2)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r2 = m36getSecondimpl(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.packedValue
            boolean r3 = m33equalsimpl(r0, r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.packedValue
            int r0 = m37hashCodeimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.packedValue
            java.lang.String r0 = m38toStringimpl(r0)
            return r0
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m39unboximpl() {
            r2 = this;
            long r0 = r2.packedValue
            return r0
    }
}
