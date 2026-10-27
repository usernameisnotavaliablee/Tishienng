package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum DeprecationLevelValue extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue ERROR = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue HIDDEN = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue WARNING = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] r0 = new kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[r0]
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue r1 = kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.WARNING
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue r1 = kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.ERROR
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue r1 = kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.HIDDEN
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue r0 = new kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue
            java.lang.String r1 = "WARNING"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.WARNING = r0
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue r0 = new kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue
            java.lang.String r1 = "ERROR"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.ERROR = r0
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue r0 = new kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue
            java.lang.String r1 = "HIDDEN"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.HIDDEN = r0
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.$ENTRIES = r0
            return
    }

    DeprecationLevelValue(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue> r0 = kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue r1 = (kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] values() {
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] r0 = kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[] r0 = (kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue[]) r0
            return r0
    }
}
