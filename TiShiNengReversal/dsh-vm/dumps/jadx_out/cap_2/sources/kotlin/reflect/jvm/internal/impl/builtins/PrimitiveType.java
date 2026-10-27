package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum PrimitiveType extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType BOOLEAN = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType BYTE = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType CHAR = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.a Companion = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType DOUBLE = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType FLOAT = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType INT = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType LONG = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> NUMBER_TYPES = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType SHORT = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s arrayTypeFqName$delegate;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.f arrayTypeName;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s typeFqName$delegate;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] $values() {
            r0 = 8
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] r0 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[r0]
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT
            r2 = 5
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG
            r2 = 6
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE
            r2 = 7
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
            java.lang.String r1 = "Boolean"
            java.lang.String r2 = "BOOLEAN"
            r3 = 0
            r0.<init>(r2, r3, r1)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN = r0
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
            java.lang.String r1 = "Char"
            java.lang.String r2 = "CHAR"
            r4 = 1
            r0.<init>(r2, r4, r1)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR = r0
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
            java.lang.String r2 = "Byte"
            java.lang.String r5 = "BYTE"
            r6 = 2
            r1.<init>(r5, r6, r2)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE = r1
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
            java.lang.String r5 = "Short"
            java.lang.String r7 = "SHORT"
            r8 = 3
            r2.<init>(r7, r8, r5)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT = r2
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r5 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
            java.lang.String r7 = "Int"
            java.lang.String r9 = "INT"
            r10 = 4
            r5.<init>(r9, r10, r7)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT = r5
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r7 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
            java.lang.String r9 = "Float"
            java.lang.String r11 = "FLOAT"
            r12 = 5
            r7.<init>(r11, r12, r9)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT = r7
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r9 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
            java.lang.String r11 = "Long"
            java.lang.String r13 = "LONG"
            r14 = 6
            r9.<init>(r13, r14, r11)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG = r9
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r11 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
            java.lang.String r13 = "Double"
            java.lang.String r15 = "DOUBLE"
            r16 = 0
            r3 = 7
            r11.<init>(r15, r3, r13)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE = r11
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] r13 = $values()
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.$VALUES = r13
            kotlin.enums.a r13 = kotlin.enums.c.c(r13)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.$ENTRIES = r13
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$a r13 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$a
            r15 = 0
            r13.<init>(r15)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.Companion = r13
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] r3 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[r3]
            r3[r16] = r0
            r3[r4] = r1
            r3[r6] = r2
            r3[r8] = r5
            r3[r10] = r7
            r3[r12] = r9
            r3[r14] = r11
            java.util.Set r0 = kotlin.collections.u1.u(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.NUMBER_TYPES = r0
            return
    }

    PrimitiveType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r3)
            java.lang.String r2 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.typeName = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "Array"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.arrayTypeName = r1
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.impl.builtins.k r2 = new kotlin.reflect.jvm.internal.impl.builtins.k
            r2.<init>(r0)
            kotlin.s r2 = kotlin.t.b(r1, r2)
            r0.typeFqName$delegate = r2
            kotlin.reflect.jvm.internal.impl.builtins.l r2 = new kotlin.reflect.jvm.internal.impl.builtins.l
            r2.<init>(r0)
            kotlin.s r1 = kotlin.t.b(r1, r2)
            r0.arrayTypeFqName$delegate = r1
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c accessor$PrimitiveType$lambda0(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0) {
            kotlin.reflect.jvm.internal.impl.name.c r0 = typeFqName_delegate$lambda$0(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c accessor$PrimitiveType$lambda1(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0) {
            kotlin.reflect.jvm.internal.impl.name.c r0 = arrayTypeFqName_delegate$lambda$1(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.name.c arrayTypeFqName_delegate$lambda$1(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1) {
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.B
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.arrayTypeName
            kotlin.reflect.jvm.internal.impl.name.c r1 = r0.b(r1)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.name.c typeFqName_delegate$lambda$0(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1) {
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.B
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.typeName
            kotlin.reflect.jvm.internal.impl.name.c r1 = r0.b(r1)
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] values() {
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] r0 = (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c getArrayTypeFqName() {
            r1 = this;
            kotlin.s r0 = r1.arrayTypeFqName$delegate
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.impl.name.c r0 = (kotlin.reflect.jvm.internal.impl.name.c) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f getArrayTypeName() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.arrayTypeName
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c getTypeFqName() {
            r1 = this;
            kotlin.s r0 = r1.typeFqName$delegate
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.impl.name.c r0 = (kotlin.reflect.jvm.internal.impl.name.c) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.typeName
            return r0
    }
}
