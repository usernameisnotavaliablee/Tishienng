package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum KVariance extends java.lang.Enum<kotlin.reflect.KVariance> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.KVariance[] $VALUES = null;
    public static final kotlin.reflect.KVariance IN = null;
    public static final kotlin.reflect.KVariance INVARIANT = null;
    public static final kotlin.reflect.KVariance OUT = null;

    private static final /* synthetic */ kotlin.reflect.KVariance[] $values() {
            r0 = 3
            kotlin.reflect.KVariance[] r0 = new kotlin.reflect.KVariance[r0]
            kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.KVariance r0 = new kotlin.reflect.KVariance
            java.lang.String r1 = "INVARIANT"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.KVariance.INVARIANT = r0
            kotlin.reflect.KVariance r0 = new kotlin.reflect.KVariance
            java.lang.String r1 = "IN"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.KVariance.IN = r0
            kotlin.reflect.KVariance r0 = new kotlin.reflect.KVariance
            java.lang.String r1 = "OUT"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.KVariance.OUT = r0
            kotlin.reflect.KVariance[] r0 = $values()
            kotlin.reflect.KVariance.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.KVariance.$ENTRIES = r0
            return
    }

    KVariance(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.reflect.KVariance> getEntries() {
            kotlin.enums.a r0 = kotlin.reflect.KVariance.$ENTRIES
            return r0
    }

    public static kotlin.reflect.KVariance valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.KVariance> r0 = kotlin.reflect.KVariance.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.KVariance r1 = (kotlin.reflect.KVariance) r1
            return r1
    }

    public static kotlin.reflect.KVariance[] values() {
            kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.KVariance[] r0 = (kotlin.reflect.KVariance[]) r0
            return r0
    }
}
