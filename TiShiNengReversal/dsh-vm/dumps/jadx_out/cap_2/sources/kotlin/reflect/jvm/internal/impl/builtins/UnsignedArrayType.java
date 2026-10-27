package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum UnsignedArrayType extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType UBYTEARRAY = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType UINTARRAY = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType ULONGARRAY = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType USHORTARRAY = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.b classId;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] $values() {
            r0 = 4
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[r0]
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.UBYTEARRAY
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.USHORTARRAY
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.UINTARRAY
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.ULONGARRAY
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType
            kotlin.reflect.jvm.internal.impl.name.b$a r1 = kotlin.reflect.jvm.internal.impl.name.b.d
            java.lang.String r2 = "kotlin/UByteArray"
            r3 = 0
            r4 = 2
            r5 = 0
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.name.b.a.b(r1, r2, r3, r4, r5)
            java.lang.String r6 = "UBYTEARRAY"
            r0.<init>(r6, r3, r2)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.UBYTEARRAY = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType
            java.lang.String r2 = "kotlin/UShortArray"
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.name.b.a.b(r1, r2, r3, r4, r5)
            java.lang.String r6 = "USHORTARRAY"
            r7 = 1
            r0.<init>(r6, r7, r2)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.USHORTARRAY = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType
            java.lang.String r2 = "kotlin/UIntArray"
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.name.b.a.b(r1, r2, r3, r4, r5)
            java.lang.String r6 = "UINTARRAY"
            r0.<init>(r6, r4, r2)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.UINTARRAY = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType
            java.lang.String r2 = "kotlin/ULongArray"
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.name.b.a.b(r1, r2, r3, r4, r5)
            java.lang.String r2 = "ULONGARRAY"
            r3 = 3
            r0.<init>(r2, r3, r1)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.ULONGARRAY = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.$ENTRIES = r0
            return
    }

    UnsignedArrayType(java.lang.String r1, int r2, kotlin.reflect.jvm.internal.impl.name.b r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.classId = r3
            kotlin.reflect.jvm.internal.impl.name.f r1 = r3.h()
            r0.typeName = r1
            return
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType> r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r1 = (kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] values() {
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] r0 = (kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.typeName
            return r0
    }
}
