package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum UnsignedType extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.builtins.UnsignedType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType UBYTE = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType UINT = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType ULONG = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType USHORT = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.b arrayClassId;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.b classId;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] $values() {
            r0 = 4
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[r0]
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.UBYTE
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.USHORT
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.UINT
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.ULONG
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType
            kotlin.reflect.jvm.internal.impl.name.b$a r1 = kotlin.reflect.jvm.internal.impl.name.b.d
            java.lang.String r2 = "kotlin/UByte"
            r3 = 0
            r4 = 2
            r5 = 0
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.name.b.a.b(r1, r2, r3, r4, r5)
            java.lang.String r6 = "UBYTE"
            r0.<init>(r6, r3, r2)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.UBYTE = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType
            java.lang.String r2 = "kotlin/UShort"
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.name.b.a.b(r1, r2, r3, r4, r5)
            java.lang.String r6 = "USHORT"
            r7 = 1
            r0.<init>(r6, r7, r2)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.USHORT = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType
            java.lang.String r2 = "kotlin/UInt"
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.name.b.a.b(r1, r2, r3, r4, r5)
            java.lang.String r6 = "UINT"
            r0.<init>(r6, r4, r2)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.UINT = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType r0 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType
            java.lang.String r2 = "kotlin/ULong"
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.name.b.a.b(r1, r2, r3, r4, r5)
            java.lang.String r2 = "ULONG"
            r3 = 3
            r0.<init>(r2, r3, r1)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.ULONG = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.$ENTRIES = r0
            return
    }

    UnsignedType(java.lang.String r2, int r3, kotlin.reflect.jvm.internal.impl.name.b r4) {
            r1 = this;
            r1.<init>(r2, r3)
            r1.classId = r4
            kotlin.reflect.jvm.internal.impl.name.f r2 = r4.h()
            r1.typeName = r2
            kotlin.reflect.jvm.internal.impl.name.b r3 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.name.c r4 = r4.f()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.b()
            r0.append(r2)
            java.lang.String r2 = "Array"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.name.f.h(r2)
            java.lang.String r0 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r3.<init>(r4, r2)
            r1.arrayClassId = r3
            return
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedType valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.UnsignedType> r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType r1 = (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] values() {
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] r0 = (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.b getArrayClassId() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.b r0 = r1.arrayClassId
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.b getClassId() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.b r0 = r1.classId
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.typeName
            return r0
    }
}
