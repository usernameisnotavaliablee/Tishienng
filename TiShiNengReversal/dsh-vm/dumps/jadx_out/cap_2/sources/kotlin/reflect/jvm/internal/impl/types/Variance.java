package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum Variance extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.types.Variance> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.Variance[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.types.Variance INVARIANT = null;
    public static final kotlin.reflect.jvm.internal.impl.types.Variance IN_VARIANCE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.Variance OUT_VARIANCE = null;
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String label;
    private final int superpositionFactor;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.Variance[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.types.Variance[] r0 = new kotlin.reflect.jvm.internal.impl.types.Variance[r0]
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = new kotlin.reflect.jvm.internal.impl.types.Variance
            r5 = 1
            r6 = 0
            java.lang.String r1 = "INVARIANT"
            r2 = 0
            java.lang.String r3 = ""
            r4 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT = r0
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = new kotlin.reflect.jvm.internal.impl.types.Variance
            r7 = -1
            java.lang.String r2 = "IN_VARIANCE"
            r3 = 1
            java.lang.String r4 = "in"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE = r1
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = new kotlin.reflect.jvm.internal.impl.types.Variance
            r7 = 1
            r8 = 1
            java.lang.String r3 = "OUT_VARIANCE"
            r4 = 2
            java.lang.String r5 = "out"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE = r2
            kotlin.reflect.jvm.internal.impl.types.Variance[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.types.Variance.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.types.Variance.$ENTRIES = r0
            return
    }

    Variance(java.lang.String r1, int r2, java.lang.String r3, boolean r4, boolean r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.label = r3
            r0.allowsInPosition = r4
            r0.allowsOutPosition = r5
            r0.superpositionFactor = r6
            return
    }

    public static kotlin.reflect.jvm.internal.impl.types.Variance valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.Variance> r0 = kotlin.reflect.jvm.internal.impl.types.Variance.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = (kotlin.reflect.jvm.internal.impl.types.Variance) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.types.Variance[] values() {
            kotlin.reflect.jvm.internal.impl.types.Variance[] r0 = kotlin.reflect.jvm.internal.impl.types.Variance.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.types.Variance[] r0 = (kotlin.reflect.jvm.internal.impl.types.Variance[]) r0
            return r0
    }

    public final boolean getAllowsOutPosition() {
            r1 = this;
            boolean r0 = r1.allowsOutPosition
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    @Override // java.lang.Enum
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }
}
