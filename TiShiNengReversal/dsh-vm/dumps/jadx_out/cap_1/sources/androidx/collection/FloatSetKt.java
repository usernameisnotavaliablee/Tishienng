package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FloatSetKt {

    @org.jetbrains.annotations.NotNull
    private static final float[] EmptyFloatArray = null;

    @org.jetbrains.annotations.NotNull
    private static final androidx.collection.MutableFloatSet EmptyFloatSet = null;

    static {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 0
            r0.<init>(r1)
            androidx.collection.FloatSetKt.EmptyFloatSet = r0
            float[] r0 = new float[r1]
            androidx.collection.FloatSetKt.EmptyFloatArray = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.FloatSet emptyFloatSet() {
            androidx.collection.MutableFloatSet r0 = androidx.collection.FloatSetKt.EmptyFloatSet
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.FloatSet floatSetOf() {
            androidx.collection.MutableFloatSet r0 = androidx.collection.FloatSetKt.EmptyFloatSet
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.FloatSet floatSetOf(float r0) {
            androidx.collection.MutableFloatSet r0 = mutableFloatSetOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.FloatSet floatSetOf(float r0, float r1) {
            androidx.collection.MutableFloatSet r0 = mutableFloatSetOf(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.FloatSet floatSetOf(float r0, float r1, float r2) {
            androidx.collection.MutableFloatSet r0 = mutableFloatSetOf(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.FloatSet floatSetOf(@org.jetbrains.annotations.NotNull float... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final float[] getEmptyFloatArray() {
            float[] r0 = androidx.collection.FloatSetKt.EmptyFloatArray
            return r0
    }

    public static final int hash(float r1) {
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableFloatSet mutableFloatSetOf() {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableFloatSet mutableFloatSetOf(float r2) {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 1
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableFloatSet mutableFloatSetOf(float r2, float r3) {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 2
            r0.<init>(r1)
            r0.plusAssign(r2)
            r0.plusAssign(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableFloatSet mutableFloatSetOf(float r2, float r3, float r4) {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 3
            r0.<init>(r1)
            r0.plusAssign(r2)
            r0.plusAssign(r3)
            r0.plusAssign(r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableFloatSet mutableFloatSetOf(@org.jetbrains.annotations.NotNull float... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }
}
