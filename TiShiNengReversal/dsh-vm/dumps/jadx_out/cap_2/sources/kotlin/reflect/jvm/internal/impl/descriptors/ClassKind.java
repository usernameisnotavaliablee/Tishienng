package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum ClassKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.descriptors.ClassKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind ANNOTATION_CLASS = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind CLASS = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind ENUM_CLASS = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind ENUM_ENTRY = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind INTERFACE = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind OBJECT = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String codeRepresentation;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] $values() {
            r0 = 6
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] r0 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[r0]
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT
            r2 = 5
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind
            r1 = 0
            java.lang.String r2 = "class"
            java.lang.String r3 = "CLASS"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS = r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind
            r1 = 1
            java.lang.String r2 = "interface"
            java.lang.String r3 = "INTERFACE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE = r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind
            r1 = 2
            java.lang.String r2 = "enum class"
            java.lang.String r3 = "ENUM_CLASS"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS = r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind
            r1 = 3
            r2 = 0
            java.lang.String r3 = "ENUM_ENTRY"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY = r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind
            r1 = 4
            java.lang.String r2 = "annotation class"
            java.lang.String r3 = "ANNOTATION_CLASS"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS = r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = new kotlin.reflect.jvm.internal.impl.descriptors.ClassKind
            r1 = 5
            java.lang.String r2 = "object"
            java.lang.String r3 = "OBJECT"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT = r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.$ENTRIES = r0
            return
    }

    ClassKind(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.codeRepresentation = r3
            return
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.ClassKind> r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] values() {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[]) r0
            return r0
    }

    public final boolean isSingleton() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT
            if (r1 == r0) goto Lb
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }
}
