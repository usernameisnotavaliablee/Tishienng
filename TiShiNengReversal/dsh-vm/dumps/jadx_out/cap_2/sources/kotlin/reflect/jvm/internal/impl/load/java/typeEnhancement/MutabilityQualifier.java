package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum MutabilityQualifier extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier MUTABLE = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier READ_ONLY = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] $values() {
            r0 = 2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[r0]
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier
            java.lang.String r1 = "READ_ONLY"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier
            java.lang.String r1 = "MUTABLE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.$ENTRIES = r0
            return
    }

    MutabilityQualifier(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier> r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] values() {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[]) r0
            return r0
    }
}
