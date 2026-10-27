package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum KmVersionRequirementVersionKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind API_VERSION = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind COMPILER_VERSION = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind LANGUAGE_VERSION = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind UNKNOWN = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] $values() {
            r0 = 4
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] r0 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[r0]
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r1 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.LANGUAGE_VERSION
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r1 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.COMPILER_VERSION
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r1 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.API_VERSION
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r1 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.UNKNOWN
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r0 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind
            java.lang.String r1 = "LANGUAGE_VERSION"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.LANGUAGE_VERSION = r0
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r0 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind
            java.lang.String r1 = "COMPILER_VERSION"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.COMPILER_VERSION = r0
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r0 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind
            java.lang.String r1 = "API_VERSION"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.API_VERSION = r0
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r0 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind
            java.lang.String r1 = "UNKNOWN"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.UNKNOWN = r0
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.$ENTRIES = r0
            return
    }

    KmVersionRequirementVersionKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind> r0 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r1 = (kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] values() {
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] r0 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[] r0 = (kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind[]) r0
            return r0
    }
}
