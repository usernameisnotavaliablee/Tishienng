package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmInline
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,85:1\n48#1:93\n54#1:95\n24#2,3:86\n22#3:89\n22#3:90\n22#3:91\n22#3:92\n22#3:94\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n83#1:93\n83#1:95\n42#1:86,3\n48#1:89\n54#1:90\n67#1:91\n81#1:92\n83#1:94\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FloatFloatPair {

    @kotlin.jvm.JvmField
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long r1) {
            r0 = this;
            r0.<init>()
            r0.packedValue = r1
            return
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.collection.FloatFloatPair m16boximpl(long r1) {
            androidx.collection.FloatFloatPair r0 = new androidx.collection.FloatFloatPair
            r0.<init>(r1)
            return r0
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m17component1impl(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r2 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r2)
            return r1
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m18component2impl(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r3 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r3)
            return r2
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m19constructorimpl(float r4, float r5) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            long r4 = m20constructorimpl(r4)
            return r4
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20constructorimpl(long r0) {
            return r0
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21equalsimpl(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof androidx.collection.FloatFloatPair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.collection.FloatFloatPair r6 = (androidx.collection.FloatFloatPair) r6
            long r2 = r6.m27unboximpl()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L11
            return r1
        L11:
            r4 = 1
            return r4
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22equalsimpl0(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m23getFirstimpl(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r2 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r2)
            return r1
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
            return
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m24getSecondimpl(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r3 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r3)
            return r2
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25hashCodeimpl(long r0) {
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m26toStringimpl(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            r1 = 32
            long r1 = r3 >> r1
            int r2 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r2)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r4 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r4)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.packedValue
            boolean r3 = m21equalsimpl(r0, r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.packedValue
            int r0 = m25hashCodeimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.packedValue
            java.lang.String r0 = m26toStringimpl(r0)
            return r0
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27unboximpl() {
            r2 = this;
            long r0 = r2.packedValue
            return r0
    }
}
