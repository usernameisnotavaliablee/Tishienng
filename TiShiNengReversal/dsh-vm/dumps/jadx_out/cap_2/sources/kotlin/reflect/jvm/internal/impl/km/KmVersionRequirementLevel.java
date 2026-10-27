package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum KmVersionRequirementLevel extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel ERROR = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel HIDDEN = null;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel WARNING = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] r0 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[r0]
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r1 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.WARNING
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r1 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.ERROR
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r1 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.HIDDEN
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r0 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel
            java.lang.String r1 = "WARNING"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.WARNING = r0
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r0 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel
            java.lang.String r1 = "ERROR"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.ERROR = r0
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r0 = new kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel
            java.lang.String r1 = "HIDDEN"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.HIDDEN = r0
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.$ENTRIES = r0
            return
    }

    KmVersionRequirementLevel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel> r0 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r1 = (kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] values() {
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] r0 = kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[] r0 = (kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel[]) r0
            return r0
    }
}
