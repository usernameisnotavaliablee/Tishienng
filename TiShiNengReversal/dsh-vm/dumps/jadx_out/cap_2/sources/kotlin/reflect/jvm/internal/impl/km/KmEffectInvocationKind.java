package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.contracts.ExperimentalContracts
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum KmEffectInvocationKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind AT_LEAST_ONCE = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind AT_MOST_ONCE = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind EXACTLY_ONCE = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] r0 = new kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[r0]
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind r1 = kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.AT_MOST_ONCE
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind r1 = kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.EXACTLY_ONCE
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind r1 = kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.AT_LEAST_ONCE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind r0 = new kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind
            java.lang.String r1 = "AT_MOST_ONCE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.AT_MOST_ONCE = r0
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind r0 = new kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind
            java.lang.String r1 = "EXACTLY_ONCE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.EXACTLY_ONCE = r0
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind r0 = new kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind
            java.lang.String r1 = "AT_LEAST_ONCE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.AT_LEAST_ONCE = r0
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.$ENTRIES = r0
            return
    }

    KmEffectInvocationKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind> r0 = kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind r1 = (kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] values() {
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] r0 = kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] r0 = (kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[]) r0
            return r0
    }
}
