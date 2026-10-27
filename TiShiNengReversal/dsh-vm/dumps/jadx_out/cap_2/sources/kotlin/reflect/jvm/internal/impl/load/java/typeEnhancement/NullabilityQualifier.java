package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum NullabilityQualifier extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier FORCE_FLEXIBILITY = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier NOT_NULL = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier NULLABLE = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[r0]
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier
            java.lang.String r1 = "FORCE_FLEXIBILITY"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier
            java.lang.String r1 = "NULLABLE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier
            java.lang.String r1 = "NOT_NULL"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.$ENTRIES = r0
            return
    }

    NullabilityQualifier(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier> r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] values() {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[]) r0
            return r0
    }
}
