package kotlin.reflect.jvm.internal.impl.types.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum TypeVariance extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.types.model.TypeVariance> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance IN = null;
    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance INV = null;
    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance OUT = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String presentation;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] r0 = new kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[r0]
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r1 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r1 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r1 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r0 = new kotlin.reflect.jvm.internal.impl.types.model.TypeVariance
            r1 = 0
            java.lang.String r2 = "in"
            java.lang.String r3 = "IN"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN = r0
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r0 = new kotlin.reflect.jvm.internal.impl.types.model.TypeVariance
            r1 = 1
            java.lang.String r2 = "out"
            java.lang.String r3 = "OUT"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT = r0
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r0 = new kotlin.reflect.jvm.internal.impl.types.model.TypeVariance
            r1 = 2
            java.lang.String r2 = ""
            java.lang.String r3 = "INV"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV = r0
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.$ENTRIES = r0
            return
    }

    TypeVariance(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.presentation = r3
            return
    }

    public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.model.TypeVariance> r0 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r1 = (kotlin.reflect.jvm.internal.impl.types.model.TypeVariance) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] values() {
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] r0 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] r0 = (kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[]) r0
            return r0
    }

    @Override // java.lang.Enum
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.presentation
            return r0
    }
}
