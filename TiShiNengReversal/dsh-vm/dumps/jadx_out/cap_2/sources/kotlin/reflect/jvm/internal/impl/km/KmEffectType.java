package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.contracts.ExperimentalContracts
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum KmEffectType extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.km.KmEffectType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmEffectType[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectType CALLS = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectType RETURNS_CONSTANT = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectType RETURNS_NOT_NULL = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmEffectType[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.km.KmEffectType[] r0 = new kotlin.reflect.jvm.internal.impl.km.KmEffectType[r0]
            kotlin.reflect.jvm.internal.impl.km.KmEffectType r1 = kotlin.reflect.jvm.internal.impl.km.KmEffectType.RETURNS_CONSTANT
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmEffectType r1 = kotlin.reflect.jvm.internal.impl.km.KmEffectType.CALLS
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmEffectType r1 = kotlin.reflect.jvm.internal.impl.km.KmEffectType.RETURNS_NOT_NULL
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.KmEffectType r0 = new kotlin.reflect.jvm.internal.impl.km.KmEffectType
            java.lang.String r1 = "RETURNS_CONSTANT"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmEffectType.RETURNS_CONSTANT = r0
            kotlin.reflect.jvm.internal.impl.km.KmEffectType r0 = new kotlin.reflect.jvm.internal.impl.km.KmEffectType
            java.lang.String r1 = "CALLS"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmEffectType.CALLS = r0
            kotlin.reflect.jvm.internal.impl.km.KmEffectType r0 = new kotlin.reflect.jvm.internal.impl.km.KmEffectType
            java.lang.String r1 = "RETURNS_NOT_NULL"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmEffectType.RETURNS_NOT_NULL = r0
            kotlin.reflect.jvm.internal.impl.km.KmEffectType[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.km.KmEffectType.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.km.KmEffectType.$ENTRIES = r0
            return
    }

    KmEffectType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmEffectType valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.KmEffectType> r0 = kotlin.reflect.jvm.internal.impl.km.KmEffectType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.km.KmEffectType r1 = (kotlin.reflect.jvm.internal.impl.km.KmEffectType) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmEffectType[] values() {
            kotlin.reflect.jvm.internal.impl.km.KmEffectType[] r0 = kotlin.reflect.jvm.internal.impl.km.KmEffectType.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.km.KmEffectType[] r0 = (kotlin.reflect.jvm.internal.impl.km.KmEffectType[]) r0
            return r0
    }
}
