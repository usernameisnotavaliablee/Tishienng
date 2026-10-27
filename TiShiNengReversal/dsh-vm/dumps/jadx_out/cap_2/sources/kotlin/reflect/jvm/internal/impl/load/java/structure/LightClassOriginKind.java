package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum LightClassOriginKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind BINARY = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind SOURCE = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] $values() {
            r0 = 2
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] r0 = new kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[r0]
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r1 = kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.SOURCE
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r1 = kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.BINARY
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r0 = new kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind
            java.lang.String r1 = "SOURCE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.SOURCE = r0
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r0 = new kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind
            java.lang.String r1 = "BINARY"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.BINARY = r0
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.$ENTRIES = r0
            return
    }

    LightClassOriginKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind> r0 = kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r1 = (kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] values() {
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] r0 = kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] r0 = (kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[]) r0
            return r0
    }
}
