package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum KmVariance extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.km.KmVariance> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmVariance[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVariance IN = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVariance INVARIANT = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVariance OUT = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmVariance[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.km.KmVariance[] r0 = new kotlin.reflect.jvm.internal.impl.km.KmVariance[r0]
            kotlin.reflect.jvm.internal.impl.km.KmVariance r1 = kotlin.reflect.jvm.internal.impl.km.KmVariance.INVARIANT
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmVariance r1 = kotlin.reflect.jvm.internal.impl.km.KmVariance.IN
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmVariance r1 = kotlin.reflect.jvm.internal.impl.km.KmVariance.OUT
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.KmVariance r0 = new kotlin.reflect.jvm.internal.impl.km.KmVariance
            java.lang.String r1 = "INVARIANT"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVariance.INVARIANT = r0
            kotlin.reflect.jvm.internal.impl.km.KmVariance r0 = new kotlin.reflect.jvm.internal.impl.km.KmVariance
            java.lang.String r1 = "IN"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVariance.IN = r0
            kotlin.reflect.jvm.internal.impl.km.KmVariance r0 = new kotlin.reflect.jvm.internal.impl.km.KmVariance
            java.lang.String r1 = "OUT"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVariance.OUT = r0
            kotlin.reflect.jvm.internal.impl.km.KmVariance[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.km.KmVariance.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.km.KmVariance.$ENTRIES = r0
            return
    }

    KmVariance(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVariance valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.KmVariance> r0 = kotlin.reflect.jvm.internal.impl.km.KmVariance.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.km.KmVariance r1 = (kotlin.reflect.jvm.internal.impl.km.KmVariance) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVariance[] values() {
            kotlin.reflect.jvm.internal.impl.km.KmVariance[] r0 = kotlin.reflect.jvm.internal.impl.km.KmVariance.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.km.KmVariance[] r0 = (kotlin.reflect.jvm.internal.impl.km.KmVariance[]) r0
            return r0
    }
}
