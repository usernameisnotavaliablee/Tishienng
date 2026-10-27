package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class WireFormat {
    static final int a = 0;
    static final int b = 0;
    static final int c = 0;
    static final int d = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum FieldType extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType> {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType BOOL = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType BYTES = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType DOUBLE = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType ENUM = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType FIXED32 = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType FIXED64 = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType FLOAT = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType GROUP = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType INT32 = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType INT64 = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType MESSAGE = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType SFIXED32 = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType SFIXED64 = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType SINT32 = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType SINT64 = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType STRING = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType UINT32 = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType UINT64 = null;
        private final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType javaType;
        private final int wireType;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum a extends kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType {
            a(java.lang.String r7, int r8, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType r9, int r10) {
                    r6 = this;
                    r5 = 0
                    r0 = r6
                    r1 = r7
                    r2 = r8
                    r3 = r9
                    r4 = r10
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum b extends kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType {
            b(java.lang.String r7, int r8, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType r9, int r10) {
                    r6 = this;
                    r5 = 0
                    r0 = r6
                    r1 = r7
                    r2 = r8
                    r3 = r9
                    r4 = r10
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum c extends kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType {
            c(java.lang.String r7, int r8, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType r9, int r10) {
                    r6 = this;
                    r5 = 0
                    r0 = r6
                    r1 = r7
                    r2 = r8
                    r3 = r9
                    r4 = r10
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum d extends kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType {
            d(java.lang.String r7, int r8, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType r9, int r10) {
                    r6 = this;
                    r5 = 0
                    r0 = r6
                    r1 = r7
                    r2 = r8
                    r3 = r9
                    r4 = r10
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        static {
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.DOUBLE
                java.lang.String r2 = "DOUBLE"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r1, r4)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.DOUBLE = r0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r1 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.FLOAT
                java.lang.String r5 = "FLOAT"
                r6 = 5
                r1.<init>(r5, r4, r2, r6)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FLOAT = r1
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r5 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG
                java.lang.String r7 = "INT64"
                r8 = 2
                r2.<init>(r7, r8, r5, r3)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT64 = r2
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r7 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                java.lang.String r9 = "UINT64"
                r10 = 3
                r7.<init>(r9, r10, r5, r3)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT64 = r7
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r11 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT
                java.lang.String r12 = "INT32"
                r13 = 4
                r9.<init>(r12, r13, r11, r3)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT32 = r9
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r12 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                java.lang.String r14 = "FIXED64"
                r12.<init>(r14, r6, r5, r4)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED64 = r12
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r14 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                java.lang.String r15 = "FIXED32"
                r16 = 4
                r13 = 6
                r14.<init>(r15, r13, r11, r6)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED32 = r14
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r15 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                r17 = 6
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r13 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BOOLEAN
                java.lang.String r4 = "BOOL"
                r6 = 7
                r15.<init>(r4, r6, r13, r3)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BOOL = r15
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$a r4 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$a
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r13 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.STRING
                r20 = 7
                java.lang.String r6 = "STRING"
                r3 = 8
                r4.<init>(r6, r3, r13, r8)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.STRING = r4
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$b r6 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$b
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r13 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE
                r22 = 8
                java.lang.String r3 = "GROUP"
                r8 = 9
                r6.<init>(r3, r8, r13, r10)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP = r6
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$c r3 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$c
                r24 = 9
                java.lang.String r8 = "MESSAGE"
                r25 = 3
                r10 = 10
                r26 = r0
                r0 = 2
                r3.<init>(r8, r10, r13, r0)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.MESSAGE = r3
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$d r8 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r13 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BYTE_STRING
                r27 = 10
                java.lang.String r10 = "BYTES"
                r28 = r1
                r1 = 11
                r8.<init>(r10, r1, r13, r0)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BYTES = r8
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                java.lang.String r10 = "UINT32"
                r13 = 12
                r1 = 0
                r29 = 11
                r0.<init>(r10, r13, r11, r1)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT32 = r0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                r30 = 12
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r13 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM
                r31 = r0
                java.lang.String r0 = "ENUM"
                r32 = r2
                r2 = 13
                r10.<init>(r0, r2, r13, r1)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM = r10
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                java.lang.String r1 = "SFIXED32"
                r13 = 14
                r2 = 5
                r33 = 13
                r0.<init>(r1, r13, r11, r2)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED32 = r0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r1 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                java.lang.String r2 = "SFIXED64"
                r34 = 14
                r13 = 15
                r35 = r0
                r0 = 1
                r1.<init>(r2, r13, r5, r0)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED64 = r1
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                java.lang.String r2 = "SINT32"
                r36 = 15
                r13 = 16
                r37 = r1
                r1 = 0
                r0.<init>(r2, r13, r11, r1)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT32 = r0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
                java.lang.String r11 = "SINT64"
                r21 = 16
                r13 = 17
                r2.<init>(r11, r13, r5, r1)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT64 = r2
                r5 = 18
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType[] r5 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType[r5]
                r5[r1] = r26
                r18 = 1
                r5[r18] = r28
                r23 = 2
                r5[r23] = r32
                r5[r25] = r7
                r5[r16] = r9
                r19 = 5
                r5[r19] = r12
                r5[r17] = r14
                r5[r20] = r15
                r5[r22] = r4
                r5[r24] = r6
                r5[r27] = r3
                r5[r29] = r8
                r5[r30] = r31
                r5[r33] = r10
                r5[r34] = r35
                r5[r36] = r37
                r5[r21] = r0
                r5[r13] = r2
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.$VALUES = r5
                return
        }

        FieldType(java.lang.String r1, int r2, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.javaType = r3
                r0.wireType = r4
                return
        }

        /* synthetic */ FieldType(java.lang.String r1, int r2, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType r3, int r4, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.a r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType> r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r1 = (kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType[] values() {
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType[] r0 = (kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType[]) r0
                return r0
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType getJavaType() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r0 = r1.javaType
                return r0
        }

        public int getWireType() {
                r1 = this;
                int r0 = r1.wireType
                return r0
        }

        public boolean isPackable() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum JavaType extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType> {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType BOOLEAN = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType BYTE_STRING = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType DOUBLE = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType ENUM = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType FLOAT = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType INT = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType LONG = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType MESSAGE = null;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType STRING = null;
        private final java.lang.Object defaultDefault;

        static {
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r0 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType
                r1 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "INT"
                r0.<init>(r3, r1, r2)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT = r0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType
                r3 = 0
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r4 = "LONG"
                r5 = 1
                r2.<init>(r4, r5, r3)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG = r2
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r3 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType
                r4 = 0
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                java.lang.String r6 = "FLOAT"
                r7 = 2
                r3.<init>(r6, r7, r4)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.FLOAT = r3
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r4 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType
                r8 = 0
                java.lang.Double r6 = java.lang.Double.valueOf(r8)
                java.lang.String r8 = "DOUBLE"
                r9 = 3
                r4.<init>(r8, r9, r6)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.DOUBLE = r4
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r6 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType
                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                java.lang.String r10 = "BOOLEAN"
                r11 = 4
                r6.<init>(r10, r11, r8)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BOOLEAN = r6
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r8 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType
                java.lang.String r10 = ""
                java.lang.String r12 = "STRING"
                r13 = 5
                r8.<init>(r12, r13, r10)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.STRING = r8
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r10 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType
                kotlin.reflect.jvm.internal.impl.protobuf.d r12 = kotlin.reflect.jvm.internal.impl.protobuf.d.a
                java.lang.String r14 = "BYTE_STRING"
                r15 = 6
                r10.<init>(r14, r15, r12)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BYTE_STRING = r10
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r12 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType
                java.lang.String r14 = "ENUM"
                r16 = 0
                r1 = 7
                r17 = 1
                r5 = 0
                r12.<init>(r14, r1, r5)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM = r12
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r14 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType
                r18 = 7
                java.lang.String r1 = "MESSAGE"
                r19 = 2
                r7 = 8
                r14.<init>(r1, r7, r5)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE = r14
                r1 = 9
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r1 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType[r1]
                r1[r16] = r0
                r1[r17] = r2
                r1[r19] = r3
                r1[r9] = r4
                r1[r11] = r6
                r1[r13] = r8
                r1[r15] = r10
                r1[r18] = r12
                r1[r7] = r14
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.$VALUES = r1
                return
        }

        JavaType(java.lang.String r1, int r2, java.lang.Object r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.defaultDefault = r3
                return
        }

        public static kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType> r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = (kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType[] values() {
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r0 = (kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
    }

    static {
            r0 = 1
            r1 = 3
            int r2 = c(r0, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.a = r2
            r2 = 4
            int r0 = c(r0, r2)
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.b = r0
            r0 = 0
            r2 = 2
            int r0 = c(r2, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.c = r0
            int r0 = c(r1, r2)
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.d = r0
            return
    }

    public static int a(int r0) {
            int r0 = r0 >>> 3
            return r0
    }

    static int b(int r0) {
            r0 = r0 & 7
            return r0
    }

    static int c(int r0, int r1) {
            int r0 = r0 << 3
            r0 = r0 | r1
            return r0
    }
}
