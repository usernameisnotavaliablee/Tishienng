package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum TypeComponentPosition extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition FLEXIBLE_LOWER = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition FLEXIBLE_UPPER = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition INFLEXIBLE = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[r0]
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition
            java.lang.String r1 = "FLEXIBLE_LOWER"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition
            java.lang.String r1 = "FLEXIBLE_UPPER"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition
            java.lang.String r1 = "INFLEXIBLE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.$ENTRIES = r0
            return
    }

    TypeComponentPosition(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition> r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] values() {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[]) r0
            return r0
    }
}
