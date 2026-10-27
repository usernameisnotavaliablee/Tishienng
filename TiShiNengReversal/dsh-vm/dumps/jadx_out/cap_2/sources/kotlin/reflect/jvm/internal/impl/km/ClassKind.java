package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum ClassKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.km.ClassKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.ClassKind[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind ANNOTATION_CLASS = null;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind CLASS = null;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind COMPANION_OBJECT = null;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind ENUM_CLASS = null;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind ENUM_ENTRY = null;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind INTERFACE = null;
    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind OBJECT = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.km.internal.d flag;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.ClassKind[] $values() {
            r0 = 7
            kotlin.reflect.jvm.internal.impl.km.ClassKind[] r0 = new kotlin.reflect.jvm.internal.impl.km.ClassKind[r0]
            kotlin.reflect.jvm.internal.impl.km.ClassKind r1 = kotlin.reflect.jvm.internal.impl.km.ClassKind.CLASS
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.ClassKind r1 = kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.ClassKind r1 = kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_CLASS
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.ClassKind r1 = kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_ENTRY
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.ClassKind r1 = kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.ClassKind r1 = kotlin.reflect.jvm.internal.impl.km.ClassKind.OBJECT
            r2 = 5
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.km.ClassKind r1 = kotlin.reflect.jvm.internal.impl.km.ClassKind.COMPANION_OBJECT
            r2 = 6
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.km.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.km.ClassKind
            java.lang.String r1 = "CLASS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.ClassKind.CLASS = r0
            kotlin.reflect.jvm.internal.impl.km.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.km.ClassKind
            java.lang.String r1 = "INTERFACE"
            r2 = 1
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE = r0
            kotlin.reflect.jvm.internal.impl.km.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.km.ClassKind
            java.lang.String r1 = "ENUM_CLASS"
            r2 = 2
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_CLASS = r0
            kotlin.reflect.jvm.internal.impl.km.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.km.ClassKind
            java.lang.String r1 = "ENUM_ENTRY"
            r2 = 3
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_ENTRY = r0
            kotlin.reflect.jvm.internal.impl.km.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.km.ClassKind
            java.lang.String r1 = "ANNOTATION_CLASS"
            r2 = 4
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS = r0
            kotlin.reflect.jvm.internal.impl.km.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.km.ClassKind
            java.lang.String r1 = "OBJECT"
            r2 = 5
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.ClassKind.OBJECT = r0
            kotlin.reflect.jvm.internal.impl.km.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.km.ClassKind
            java.lang.String r1 = "COMPANION_OBJECT"
            r2 = 6
            r0.<init>(r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.km.ClassKind.COMPANION_OBJECT = r0
            kotlin.reflect.jvm.internal.impl.km.ClassKind[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.km.ClassKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.km.ClassKind.$ENTRIES = r0
            return
    }

    ClassKind(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3)
            kotlin.reflect.jvm.internal.impl.km.internal.d r2 = new kotlin.reflect.jvm.internal.impl.km.internal.d
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind> r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f
            java.lang.String r0 = "CLASS_KIND"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.<init>(r3, r4)
            r1.flag = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.reflect.jvm.internal.impl.km.ClassKind> getEntries() {
            kotlin.enums.a r0 = kotlin.reflect.jvm.internal.impl.km.ClassKind.$ENTRIES
            return r0
    }

    public static kotlin.reflect.jvm.internal.impl.km.ClassKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.ClassKind> r0 = kotlin.reflect.jvm.internal.impl.km.ClassKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.km.ClassKind r1 = (kotlin.reflect.jvm.internal.impl.km.ClassKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.km.ClassKind[] values() {
            kotlin.reflect.jvm.internal.impl.km.ClassKind[] r0 = kotlin.reflect.jvm.internal.impl.km.ClassKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.km.ClassKind[] r0 = (kotlin.reflect.jvm.internal.impl.km.ClassKind[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.internal.d getFlag$kotlin_metadata() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.internal.d r0 = r1.flag
            return r0
    }
}
