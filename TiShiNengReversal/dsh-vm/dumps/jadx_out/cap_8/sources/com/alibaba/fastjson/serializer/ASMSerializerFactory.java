package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ASMSerializerFactory implements com.alibaba.fastjson.asm.Opcodes {
    static final java.lang.String JSONSerializer = null;
    static final java.lang.String JavaBeanSerializer = null;
    static final java.lang.String JavaBeanSerializer_desc = null;
    static final java.lang.String ObjectSerializer = null;
    static final java.lang.String ObjectSerializer_desc = null;
    static final java.lang.String SerialContext_desc = null;
    static final java.lang.String SerializeFilterable_desc = null;
    static final java.lang.String SerializeWriter = null;
    static final java.lang.String SerializeWriter_desc = null;
    protected final com.alibaba.fastjson.util.ASMClassLoader classLoader;
    private final java.util.concurrent.atomic.AtomicLong seed;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Context {
        static final int features = 5;
        static int fieldName = 6;
        static final int obj = 2;
        static int original = 7;
        static final int paramFieldName = 3;
        static final int paramFieldType = 4;
        static int processValue = 8;
        static final int serializer = 1;
        private final com.alibaba.fastjson.serializer.SerializeBeanInfo beanInfo;
        private final java.lang.String className;
        private final com.alibaba.fastjson.util.FieldInfo[] getters;
        private boolean nonContext;
        private int variantIndex;
        private java.util.Map<java.lang.String, java.lang.Integer> variants;
        private final boolean writeDirect;

        static {
                return
        }

        public Context(com.alibaba.fastjson.util.FieldInfo[] r2, com.alibaba.fastjson.serializer.SerializeBeanInfo r3, java.lang.String r4, boolean r5, boolean r6) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.variants = r0
                r0 = 9
                r1.variantIndex = r0
                r1.getters = r2
                r1.className = r4
                r1.beanInfo = r3
                r1.writeDirect = r5
                r1.nonContext = r6
                return
        }

        static /* synthetic */ boolean access$000(com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r0) {
                boolean r0 = r0.writeDirect
                return r0
        }

        static /* synthetic */ int access$100(com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r0) {
                int r0 = r0.variantIndex
                return r0
        }

        static /* synthetic */ boolean access$200(com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r0) {
                boolean r0 = r0.nonContext
                return r0
        }

        static /* synthetic */ java.lang.String access$300(com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r0) {
                java.lang.String r0 = r0.className
                return r0
        }

        static /* synthetic */ com.alibaba.fastjson.serializer.SerializeBeanInfo access$400(com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r0) {
                com.alibaba.fastjson.serializer.SerializeBeanInfo r0 = r0.beanInfo
                return r0
        }

        public int getFieldOrinal(java.lang.String r4) {
                r3 = this;
                com.alibaba.fastjson.util.FieldInfo[] r0 = r3.getters
                int r0 = r0.length
                r1 = 0
            L4:
                if (r1 >= r0) goto L16
                com.alibaba.fastjson.util.FieldInfo[] r2 = r3.getters
                r2 = r2[r1]
                java.lang.String r2 = r2.name
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L13
                return r1
            L13:
                int r1 = r1 + 1
                goto L4
            L16:
                r4 = -1
                return r4
        }

        public int var(java.lang.String r4) {
                r3 = this;
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.variants
                java.lang.Object r0 = r0.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 != 0) goto L19
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.variants
                int r1 = r3.variantIndex
                int r2 = r1 + 1
                r3.variantIndex = r2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.put(r4, r1)
            L19:
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.variants
                java.lang.Object r4 = r0.get(r4)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                return r4
        }

        public int var(java.lang.String r3, int r4) {
                r2 = this;
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.variants
                java.lang.Object r0 = r0.get(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 != 0) goto L1a
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.variants
                int r1 = r2.variantIndex
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.put(r3, r1)
                int r0 = r2.variantIndex
                int r0 = r0 + r4
                r2.variantIndex = r0
            L1a:
                java.util.Map<java.lang.String, java.lang.Integer> r4 = r2.variants
                java.lang.Object r3 = r4.get(r3)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                return r3
        }
    }

    static {
            java.lang.Class<com.alibaba.fastjson.serializer.JSONSerializer> r0 = com.alibaba.fastjson.serializer.JSONSerializer.class
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer = r0
            java.lang.Class<com.alibaba.fastjson.serializer.ObjectSerializer> r0 = com.alibaba.fastjson.serializer.ObjectSerializer.class
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "L"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ";"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer_desc = r1
            java.lang.Class<com.alibaba.fastjson.serializer.SerializeWriter> r1 = com.alibaba.fastjson.serializer.SerializeWriter.class
            java.lang.String r1 = com.alibaba.fastjson.util.ASMUtils.type(r1)
            com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter_desc = r1
            java.lang.Class<com.alibaba.fastjson.serializer.JavaBeanSerializer> r1 = com.alibaba.fastjson.serializer.JavaBeanSerializer.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r1)
            com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r1 = com.alibaba.fastjson.util.ASMUtils.type(r1)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer_desc = r0
            java.lang.Class<com.alibaba.fastjson.serializer.SerialContext> r0 = com.alibaba.fastjson.serializer.SerialContext.class
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r0)
            com.alibaba.fastjson.serializer.ASMSerializerFactory.SerialContext_desc = r0
            java.lang.Class<com.alibaba.fastjson.serializer.SerializeFilterable> r0 = com.alibaba.fastjson.serializer.SerializeFilterable.class
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r0)
            com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeFilterable_desc = r0
            return
    }

    public ASMSerializerFactory() {
            r1 = this;
            r1.<init>()
            com.alibaba.fastjson.util.ASMClassLoader r0 = new com.alibaba.fastjson.util.ASMClassLoader
            r0.<init>()
            r1.classLoader = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.seed = r0
            return
    }

    private void _after(com.alibaba.fastjson.asm.MethodVisitor r6, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r7) {
            r5 = this;
            r0 = 0
            r1 = 25
            r6.visitVarInsn(r1, r0)
            r0 = 1
            r6.visitVarInsn(r1, r0)
            r0 = 2
            r6.visitVarInsn(r1, r0)
            java.lang.String r0 = "seperator"
            int r1 = r7.var(r0)
            r2 = 21
            r6.visitVarInsn(r2, r1)
            java.lang.String r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "(L"
            r2.append(r3)
            java.lang.String r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r2.append(r3)
            java.lang.String r3 = ";Ljava/lang/Object;C)C"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 182(0xb6, float:2.55E-43)
            java.lang.String r4 = "writeAfter"
            r6.visitMethodInsn(r3, r1, r4, r2)
            r1 = 54
            int r7 = r7.var(r0)
            r6.visitVarInsn(r1, r7)
            return
    }

    private void _apply(com.alibaba.fastjson.asm.MethodVisitor r7, com.alibaba.fastjson.util.FieldInfo r8, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r9) {
            r6 = this;
            java.lang.Class<?> r8 = r8.fieldClass
            r0 = 0
            r1 = 25
            r7.visitVarInsn(r1, r0)
            r0 = 1
            r7.visitVarInsn(r1, r0)
            r0 = 2
            r7.visitVarInsn(r1, r0)
            int r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r7.visitVarInsn(r1, r2)
            java.lang.Class r2 = java.lang.Byte.TYPE
            r3 = 21
            java.lang.String r4 = "valueOf"
            r5 = 184(0xb8, float:2.58E-43)
            if (r8 != r2) goto L31
            java.lang.String r8 = "byte"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r3, r8)
            java.lang.String r8 = "java/lang/Byte"
            java.lang.String r9 = "(B)Ljava/lang/Byte;"
            r7.visitMethodInsn(r5, r8, r4, r9)
            goto L116
        L31:
            java.lang.Class r2 = java.lang.Short.TYPE
            if (r8 != r2) goto L47
            java.lang.String r8 = "short"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r3, r8)
            java.lang.String r8 = "java/lang/Short"
            java.lang.String r9 = "(S)Ljava/lang/Short;"
            r7.visitMethodInsn(r5, r8, r4, r9)
            goto L116
        L47:
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r8 != r2) goto L5d
            java.lang.String r8 = "int"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r3, r8)
            java.lang.String r8 = "java/lang/Integer"
            java.lang.String r9 = "(I)Ljava/lang/Integer;"
            r7.visitMethodInsn(r5, r8, r4, r9)
            goto L116
        L5d:
            java.lang.Class r2 = java.lang.Character.TYPE
            if (r8 != r2) goto L73
            java.lang.String r8 = "char"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r3, r8)
            java.lang.String r8 = "java/lang/Character"
            java.lang.String r9 = "(C)Ljava/lang/Character;"
            r7.visitMethodInsn(r5, r8, r4, r9)
            goto L116
        L73:
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r8 != r2) goto L8b
            java.lang.String r8 = "long"
            int r8 = r9.var(r8, r0)
            r9 = 22
            r7.visitVarInsn(r9, r8)
            java.lang.String r8 = "java/lang/Long"
            java.lang.String r9 = "(J)Ljava/lang/Long;"
            r7.visitMethodInsn(r5, r8, r4, r9)
            goto L116
        L8b:
            java.lang.Class r2 = java.lang.Float.TYPE
            if (r8 != r2) goto La3
            java.lang.String r8 = "float"
            int r8 = r9.var(r8)
            r9 = 23
            r7.visitVarInsn(r9, r8)
            java.lang.String r8 = "java/lang/Float"
            java.lang.String r9 = "(F)Ljava/lang/Float;"
            r7.visitMethodInsn(r5, r8, r4, r9)
            goto L116
        La3:
            java.lang.Class r2 = java.lang.Double.TYPE
            if (r8 != r2) goto Lba
            java.lang.String r8 = "double"
            int r8 = r9.var(r8, r0)
            r9 = 24
            r7.visitVarInsn(r9, r8)
            java.lang.String r8 = "java/lang/Double"
            java.lang.String r9 = "(D)Ljava/lang/Double;"
            r7.visitMethodInsn(r5, r8, r4, r9)
            goto L116
        Lba:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r8 != r0) goto Lcf
            java.lang.String r8 = "boolean"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r3, r8)
            java.lang.String r8 = "java/lang/Boolean"
            java.lang.String r9 = "(Z)Ljava/lang/Boolean;"
            r7.visitMethodInsn(r5, r8, r4, r9)
            goto L116
        Lcf:
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r8 != r0) goto Ldd
            java.lang.String r8 = "decimal"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r1, r8)
            goto L116
        Ldd:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r8 != r0) goto Leb
            java.lang.String r8 = "string"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r1, r8)
            goto L116
        Leb:
            boolean r0 = r8.isEnum()
            if (r0 == 0) goto Lfb
            java.lang.String r8 = "enum"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r1, r8)
            goto L116
        Lfb:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r8 = r0.isAssignableFrom(r8)
            if (r8 == 0) goto L10d
            java.lang.String r8 = "list"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r1, r8)
            goto L116
        L10d:
            java.lang.String r8 = "object"
            int r8 = r9.var(r8)
            r7.visitVarInsn(r1, r8)
        L116:
            java.lang.String r8 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "(L"
            r9.append(r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r9.append(r0)
            java.lang.String r0 = ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r0 = 182(0xb6, float:2.55E-43)
            java.lang.String r1 = "apply"
            r7.visitMethodInsn(r0, r8, r1, r9)
            return
    }

    private void _before(com.alibaba.fastjson.asm.MethodVisitor r6, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r7) {
            r5 = this;
            r0 = 0
            r1 = 25
            r6.visitVarInsn(r1, r0)
            r0 = 1
            r6.visitVarInsn(r1, r0)
            r0 = 2
            r6.visitVarInsn(r1, r0)
            java.lang.String r0 = "seperator"
            int r1 = r7.var(r0)
            r2 = 21
            r6.visitVarInsn(r2, r1)
            java.lang.String r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "(L"
            r2.append(r3)
            java.lang.String r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r2.append(r3)
            java.lang.String r3 = ";Ljava/lang/Object;C)C"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 182(0xb6, float:2.55E-43)
            java.lang.String r4 = "writeBefore"
            r6.visitMethodInsn(r3, r1, r4, r2)
            r1 = 54
            int r7 = r7.var(r0)
            r6.visitVarInsn(r1, r7)
            return
    }

    private void _decimal(java.lang.Class<?> r6, com.alibaba.fastjson.asm.MethodVisitor r7, com.alibaba.fastjson.util.FieldInfo r8, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r9) {
            r5 = this;
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            r5._nameApply(r7, r8, r9, r6)
            r5._get(r7, r9, r8)
            java.lang.String r0 = "decimal"
            int r1 = r9.var(r0)
            r2 = 58
            r7.visitVarInsn(r2, r1)
            r5._filters(r7, r8, r9, r6)
            com.alibaba.fastjson.asm.Label r1 = new com.alibaba.fastjson.asm.Label
            r1.<init>()
            com.alibaba.fastjson.asm.Label r2 = new com.alibaba.fastjson.asm.Label
            r2.<init>()
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            r7.visitLabel(r1)
            int r1 = r9.var(r0)
            r4 = 25
            r7.visitVarInsn(r4, r1)
            r1 = 199(0xc7, float:2.79E-43)
            r7.visitJumpInsn(r1, r2)
            r5._if_write_null(r7, r8, r9)
            r8 = 167(0xa7, float:2.34E-43)
            r7.visitJumpInsn(r8, r3)
            r7.visitLabel(r2)
            java.lang.String r1 = "out"
            int r1 = r9.var(r1)
            r7.visitVarInsn(r4, r1)
            java.lang.String r1 = "seperator"
            int r1 = r9.var(r1)
            r2 = 21
            r7.visitVarInsn(r2, r1)
            int r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r7.visitVarInsn(r4, r1)
            int r0 = r9.var(r0)
            r7.visitVarInsn(r4, r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r1 = "writeFieldValue"
            java.lang.String r2 = "(CLjava/lang/String;Ljava/math/BigDecimal;)V"
            r4 = 182(0xb6, float:2.55E-43)
            r7.visitMethodInsn(r4, r0, r1, r2)
            r5._seperator(r7, r9)
            r7.visitJumpInsn(r8, r3)
            r7.visitLabel(r3)
            r7.visitLabel(r6)
            return
    }

    private void _double(java.lang.Class<?> r5, com.alibaba.fastjson.asm.MethodVisitor r6, com.alibaba.fastjson.util.FieldInfo r7, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r8) {
            r4 = this;
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            r4._nameApply(r6, r7, r8, r5)
            r4._get(r6, r8, r7)
            java.lang.String r0 = "double"
            r1 = 2
            int r2 = r8.var(r0, r1)
            r3 = 57
            r6.visitVarInsn(r3, r2)
            r4._filters(r6, r7, r8, r5)
            java.lang.String r7 = "out"
            int r7 = r8.var(r7)
            r2 = 25
            r6.visitVarInsn(r2, r7)
            java.lang.String r7 = "seperator"
            int r7 = r8.var(r7)
            r3 = 21
            r6.visitVarInsn(r3, r7)
            int r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r6.visitVarInsn(r2, r7)
            r7 = 24
            int r0 = r8.var(r0, r1)
            r6.visitVarInsn(r7, r0)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r0 = "writeFieldValue"
            java.lang.String r1 = "(CLjava/lang/String;D)V"
            r2 = 182(0xb6, float:2.55E-43)
            r6.visitMethodInsn(r2, r7, r0, r1)
            r4._seperator(r6, r8)
            r6.visitLabel(r5)
            return
    }

    private void _enum(java.lang.Class<?> r10, com.alibaba.fastjson.asm.MethodVisitor r11, com.alibaba.fastjson.util.FieldInfo r12, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r13) {
            r9 = this;
            com.alibaba.fastjson.asm.Label r10 = new com.alibaba.fastjson.asm.Label
            r10.<init>()
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            com.alibaba.fastjson.asm.Label r1 = new com.alibaba.fastjson.asm.Label
            r1.<init>()
            r9._nameApply(r11, r12, r13, r1)
            r9._get(r11, r13, r12)
            r2 = 192(0xc0, float:2.69E-43)
            java.lang.String r3 = "java/lang/Enum"
            r11.visitTypeInsn(r2, r3)
            java.lang.String r2 = "enum"
            int r4 = r13.var(r2)
            r5 = 58
            r11.visitVarInsn(r5, r4)
            r9._filters(r11, r12, r13, r1)
            int r4 = r13.var(r2)
            r5 = 25
            r11.visitVarInsn(r5, r4)
            r4 = 199(0xc7, float:2.79E-43)
            r11.visitJumpInsn(r4, r10)
            r9._if_write_null(r11, r12, r13)
            r4 = 167(0xa7, float:2.34E-43)
            r11.visitJumpInsn(r4, r0)
            r11.visitLabel(r10)
            boolean r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r13)
            java.lang.String r4 = "seperator"
            r6 = 21
            java.lang.String r7 = "out"
            r8 = 182(0xb6, float:2.55E-43)
            if (r10 == 0) goto L7c
            int r10 = r13.var(r7)
            r11.visitVarInsn(r5, r10)
            int r10 = r13.var(r4)
            r11.visitVarInsn(r6, r10)
            int r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r11.visitVarInsn(r5, r10)
            int r10 = r13.var(r2)
            r11.visitVarInsn(r5, r10)
            java.lang.String r10 = "name"
            java.lang.String r12 = "()Ljava/lang/String;"
            r11.visitMethodInsn(r8, r3, r10, r12)
            java.lang.String r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r12 = "writeFieldValueStringWithDoubleQuote"
            java.lang.String r2 = "(CLjava/lang/String;Ljava/lang/String;)V"
            r11.visitMethodInsn(r8, r10, r12, r2)
            goto Ld9
        L7c:
            int r10 = r13.var(r7)
            r11.visitVarInsn(r5, r10)
            int r10 = r13.var(r4)
            r11.visitVarInsn(r6, r10)
            java.lang.String r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r3 = "write"
            java.lang.String r4 = "(I)V"
            r11.visitMethodInsn(r8, r10, r3, r4)
            int r3 = r13.var(r7)
            r11.visitVarInsn(r5, r3)
            int r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r11.visitVarInsn(r5, r3)
            r3 = 3
            r11.visitInsn(r3)
            java.lang.String r3 = "writeFieldName"
            java.lang.String r4 = "(Ljava/lang/String;Z)V"
            r11.visitMethodInsn(r8, r10, r3, r4)
            r10 = 1
            r11.visitVarInsn(r5, r10)
            int r10 = r13.var(r2)
            r11.visitVarInsn(r5, r10)
            int r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r11.visitVarInsn(r5, r10)
            java.lang.Class<?> r10 = r12.fieldClass
            java.lang.String r10 = com.alibaba.fastjson.util.ASMUtils.desc(r10)
            com.alibaba.fastjson.asm.Type r10 = com.alibaba.fastjson.asm.Type.getType(r10)
            r11.visitLdcInsn(r10)
            int r10 = r12.serialzeFeatures
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.visitLdcInsn(r10)
            java.lang.String r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r12 = "writeWithFieldName"
            java.lang.String r2 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            r11.visitMethodInsn(r8, r10, r12, r2)
        Ld9:
            r9._seperator(r11, r13)
            r11.visitLabel(r0)
            r11.visitLabel(r1)
            return
    }

    private void _filters(com.alibaba.fastjson.asm.MethodVisitor r5, com.alibaba.fastjson.util.FieldInfo r6, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r7, com.alibaba.fastjson.asm.Label r8) {
            r4 = this;
            boolean r0 = r6.fieldTransient
            if (r0 == 0) goto L2a
            java.lang.String r0 = "out"
            int r0 = r7.var(r0)
            r1 = 25
            r5.visitVarInsn(r1, r0)
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.SkipTransientField
            int r0 = r0.mask
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.visitLdcInsn(r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r1 = "isEnabled"
            java.lang.String r2 = "(I)Z"
            r3 = 182(0xb6, float:2.55E-43)
            r5.visitMethodInsn(r3, r0, r1, r2)
            r0 = 154(0x9a, float:2.16E-43)
            r5.visitJumpInsn(r0, r8)
        L2a:
            r4._notWriteDefault(r5, r6, r7, r8)
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r7)
            if (r0 == 0) goto L34
            return
        L34:
            r4._apply(r5, r6, r7)
            r0 = 153(0x99, float:2.14E-43)
            r5.visitJumpInsn(r0, r8)
            r4._processKey(r5, r6, r7)
            r4._processValue(r5, r6, r7, r8)
            return
    }

    private void _float(java.lang.Class<?> r4, com.alibaba.fastjson.asm.MethodVisitor r5, com.alibaba.fastjson.util.FieldInfo r6, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r7) {
            r3 = this;
            com.alibaba.fastjson.asm.Label r4 = new com.alibaba.fastjson.asm.Label
            r4.<init>()
            r3._nameApply(r5, r6, r7, r4)
            r3._get(r5, r7, r6)
            java.lang.String r0 = "float"
            int r1 = r7.var(r0)
            r2 = 56
            r5.visitVarInsn(r2, r1)
            r3._filters(r5, r6, r7, r4)
            java.lang.String r6 = "out"
            int r6 = r7.var(r6)
            r1 = 25
            r5.visitVarInsn(r1, r6)
            java.lang.String r6 = "seperator"
            int r6 = r7.var(r6)
            r2 = 21
            r5.visitVarInsn(r2, r6)
            int r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r5.visitVarInsn(r1, r6)
            r6 = 23
            int r0 = r7.var(r0)
            r5.visitVarInsn(r6, r0)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r0 = "writeFieldValue"
            java.lang.String r1 = "(CLjava/lang/String;F)V"
            r2 = 182(0xb6, float:2.55E-43)
            r5.visitMethodInsn(r2, r6, r0, r1)
            r3._seperator(r5, r7)
            r5.visitLabel(r4)
            return
    }

    private void _get(com.alibaba.fastjson.asm.MethodVisitor r6, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r7, com.alibaba.fastjson.util.FieldInfo r8) {
            r5 = this;
            java.lang.reflect.Method r0 = r8.method
            r1 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "entity"
            r3 = 25
            if (r0 == 0) goto L45
            int r7 = r7.var(r2)
            r6.visitVarInsn(r3, r7)
            java.lang.Class r7 = r0.getDeclaringClass()
            boolean r2 = r7.isInterface()
            if (r2 == 0) goto L1e
            r2 = 185(0xb9, float:2.59E-43)
            goto L20
        L1e:
            r2 = 182(0xb6, float:2.55E-43)
        L20:
            java.lang.String r7 = com.alibaba.fastjson.util.ASMUtils.type(r7)
            java.lang.String r3 = r0.getName()
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r0)
            r6.visitMethodInsn(r2, r7, r3, r4)
            java.lang.Class r7 = r0.getReturnType()
            java.lang.Class<?> r0 = r8.fieldClass
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L7a
            java.lang.Class<?> r7 = r8.fieldClass
            java.lang.String r7 = com.alibaba.fastjson.util.ASMUtils.type(r7)
            r6.visitTypeInsn(r1, r7)
            return
        L45:
            int r7 = r7.var(r2)
            r6.visitVarInsn(r3, r7)
            java.lang.reflect.Field r7 = r8.field
            java.lang.Class<?> r0 = r8.declaringClass
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            java.lang.String r2 = r7.getName()
            java.lang.Class r3 = r7.getType()
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.desc(r3)
            r4 = 180(0xb4, float:2.52E-43)
            r6.visitFieldInsn(r4, r0, r2, r3)
            java.lang.Class r7 = r7.getType()
            java.lang.Class<?> r0 = r8.fieldClass
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L7a
            java.lang.Class<?> r7 = r8.fieldClass
            java.lang.String r7 = com.alibaba.fastjson.util.ASMUtils.type(r7)
            r6.visitTypeInsn(r1, r7)
        L7a:
            return
    }

    private void _getFieldSer(com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r11, com.alibaba.fastjson.asm.MethodVisitor r12, com.alibaba.fastjson.util.FieldInfo r13) {
            r10 = this;
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            r1 = 25
            r2 = 0
            r12.visitVarInsn(r1, r2)
            java.lang.String r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r13.name
            r4.append(r5)
            java.lang.String r5 = "_asm_ser_"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer_desc
            r7 = 180(0xb4, float:2.52E-43)
            r12.visitFieldInsn(r7, r3, r4, r6)
            r3 = 199(0xc7, float:2.79E-43)
            r12.visitJumpInsn(r3, r0)
            r12.visitVarInsn(r1, r2)
            r3 = 1
            r12.visitVarInsn(r1, r3)
            java.lang.Class<?> r3 = r13.fieldClass
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.desc(r3)
            com.alibaba.fastjson.asm.Type r3 = com.alibaba.fastjson.asm.Type.getType(r3)
            r12.visitLdcInsn(r3)
            java.lang.String r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "(Ljava/lang/Class;)"
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r8 = 182(0xb6, float:2.55E-43)
            java.lang.String r9 = "getObjectWriter"
            r12.visitMethodInsn(r8, r3, r9, r4)
            java.lang.String r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = r13.name
            r4.append(r8)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r8 = 181(0xb5, float:2.54E-43)
            r12.visitFieldInsn(r8, r3, r4, r6)
            r12.visitLabel(r0)
            r12.visitVarInsn(r1, r2)
            java.lang.String r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = r13.name
            r0.append(r13)
            r0.append(r5)
            java.lang.String r13 = r0.toString()
            r12.visitFieldInsn(r7, r11, r13, r6)
            return
    }

    private void _getListFieldItemSer(com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r10, com.alibaba.fastjson.asm.MethodVisitor r11, com.alibaba.fastjson.util.FieldInfo r12, java.lang.Class<?> r13) {
            r9 = this;
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            r1 = 25
            r2 = 0
            r11.visitVarInsn(r1, r2)
            java.lang.String r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r12.name
            r4.append(r5)
            java.lang.String r5 = "_asm_list_item_ser_"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer_desc
            r7 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r7, r3, r4, r6)
            r3 = 199(0xc7, float:2.79E-43)
            r11.visitJumpInsn(r3, r0)
            r11.visitVarInsn(r1, r2)
            r3 = 1
            r11.visitVarInsn(r1, r3)
            java.lang.String r13 = com.alibaba.fastjson.util.ASMUtils.desc(r13)
            com.alibaba.fastjson.asm.Type r13 = com.alibaba.fastjson.asm.Type.getType(r13)
            r11.visitLdcInsn(r13)
            java.lang.String r13 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "(Ljava/lang/Class;)"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4 = 182(0xb6, float:2.55E-43)
            java.lang.String r8 = "getObjectWriter"
            r11.visitMethodInsn(r4, r13, r8, r3)
            java.lang.String r13 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r12.name
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4 = 181(0xb5, float:2.54E-43)
            r11.visitFieldInsn(r4, r13, r3, r6)
            r11.visitLabel(r0)
            r11.visitVarInsn(r1, r2)
            java.lang.String r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r12 = r12.name
            r13.append(r12)
            r13.append(r5)
            java.lang.String r12 = r13.toString()
            r11.visitFieldInsn(r7, r10, r12, r6)
            return
    }

    private void _if_write_null(com.alibaba.fastjson.asm.MethodVisitor r12, com.alibaba.fastjson.util.FieldInfo r13, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r14) {
            r11 = this;
            java.lang.Class<?> r0 = r13.fieldClass
            com.alibaba.fastjson.asm.Label r1 = new com.alibaba.fastjson.asm.Label
            r1.<init>()
            com.alibaba.fastjson.asm.Label r2 = new com.alibaba.fastjson.asm.Label
            r2.<init>()
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            com.alibaba.fastjson.asm.Label r4 = new com.alibaba.fastjson.asm.Label
            r4.<init>()
            r12.visitLabel(r1)
            com.alibaba.fastjson.annotation.JSONField r13 = r13.getAnnotation()
            r1 = 0
            if (r13 == 0) goto L29
            com.alibaba.fastjson.serializer.SerializerFeature[] r13 = r13.serialzeFeatures()
            int r13 = com.alibaba.fastjson.serializer.SerializerFeature.of(r13)
            goto L2a
        L29:
            r13 = 0
        L2a:
            int r5 = com.alibaba.fastjson.serializer.SerializerFeature.WRITE_MAP_NULL_FEATURES
            r6 = r13 & r5
            r7 = 182(0xb6, float:2.55E-43)
            java.lang.String r8 = "out"
            r9 = 25
            if (r6 != 0) goto L52
            int r6 = r14.var(r8)
            r12.visitVarInsn(r9, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r12.visitLdcInsn(r5)
            java.lang.String r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r6 = "isEnabled"
            java.lang.String r10 = "(I)Z"
            r12.visitMethodInsn(r7, r5, r6, r10)
            r5 = 153(0x99, float:2.14E-43)
            r12.visitJumpInsn(r5, r2)
        L52:
            r12.visitLabel(r3)
            int r3 = r14.var(r8)
            r12.visitVarInsn(r9, r3)
            java.lang.String r3 = "seperator"
            int r3 = r14.var(r3)
            r5 = 21
            r12.visitVarInsn(r5, r3)
            java.lang.String r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r5 = "write"
            java.lang.String r6 = "(I)V"
            r12.visitMethodInsn(r7, r3, r5, r6)
            r11._writeFieldName(r12, r14)
            int r5 = r14.var(r8)
            r12.visitVarInsn(r9, r5)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.visitLdcInsn(r13)
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            if (r0 == r13) goto Ld1
            java.lang.Class<java.lang.Character> r13 = java.lang.Character.class
            if (r0 != r13) goto L8a
            goto Ld1
        L8a:
            java.lang.Class<java.lang.Number> r13 = java.lang.Number.class
            boolean r13 = r13.isAssignableFrom(r0)
            if (r13 == 0) goto L9e
            com.alibaba.fastjson.serializer.SerializerFeature r13 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero
            int r13 = r13.mask
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.visitLdcInsn(r13)
            goto Ldc
        L9e:
            java.lang.Class<java.lang.Boolean> r13 = java.lang.Boolean.class
            if (r0 != r13) goto Lae
            com.alibaba.fastjson.serializer.SerializerFeature r13 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullBooleanAsFalse
            int r13 = r13.mask
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.visitLdcInsn(r13)
            goto Ldc
        Lae:
            java.lang.Class<java.util.Collection> r13 = java.util.Collection.class
            boolean r13 = r13.isAssignableFrom(r0)
            if (r13 != 0) goto Lc5
            boolean r13 = r0.isArray()
            if (r13 == 0) goto Lbd
            goto Lc5
        Lbd:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r12.visitLdcInsn(r13)
            goto Ldc
        Lc5:
            com.alibaba.fastjson.serializer.SerializerFeature r13 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            int r13 = r13.mask
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.visitLdcInsn(r13)
            goto Ldc
        Ld1:
            com.alibaba.fastjson.serializer.SerializerFeature r13 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty
            int r13 = r13.mask
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.visitLdcInsn(r13)
        Ldc:
            java.lang.String r13 = "writeNull"
            java.lang.String r0 = "(II)V"
            r12.visitMethodInsn(r7, r3, r13, r0)
            r11._seperator(r12, r14)
            r13 = 167(0xa7, float:2.34E-43)
            r12.visitJumpInsn(r13, r4)
            r12.visitLabel(r2)
            r12.visitLabel(r4)
            return
    }

    private void _int(java.lang.Class<?> r3, com.alibaba.fastjson.asm.MethodVisitor r4, com.alibaba.fastjson.util.FieldInfo r5, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r6, int r7, char r8) {
            r2 = this;
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            r2._nameApply(r4, r5, r6, r3)
            r2._get(r4, r6, r5)
            r0 = 54
            r4.visitVarInsn(r0, r7)
            r2._filters(r4, r5, r6, r3)
            java.lang.String r5 = "out"
            int r5 = r6.var(r5)
            r0 = 25
            r4.visitVarInsn(r0, r5)
            java.lang.String r5 = "seperator"
            int r5 = r6.var(r5)
            r1 = 21
            r4.visitVarInsn(r1, r5)
            int r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r4.visitVarInsn(r0, r5)
            r4.visitVarInsn(r1, r7)
            java.lang.String r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "(CLjava/lang/String;"
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = ")V"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 182(0xb6, float:2.55E-43)
            java.lang.String r0 = "writeFieldValue"
            r4.visitMethodInsn(r8, r5, r0, r7)
            r2._seperator(r4, r6)
            r4.visitLabel(r3)
            return
    }

    private void _labelApply(com.alibaba.fastjson.asm.MethodVisitor r3, com.alibaba.fastjson.util.FieldInfo r4, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r5, com.alibaba.fastjson.asm.Label r6) {
            r2 = this;
            r5 = 0
            r0 = 25
            r3.visitVarInsn(r0, r5)
            r5 = 1
            r3.visitVarInsn(r0, r5)
            java.lang.String r4 = r4.label
            r3.visitLdcInsn(r4)
            java.lang.String r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "(L"
            r5.append(r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r5.append(r0)
            java.lang.String r0 = ";Ljava/lang/String;)Z"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r0 = 182(0xb6, float:2.55E-43)
            java.lang.String r1 = "applyLabel"
            r3.visitMethodInsn(r0, r4, r1, r5)
            r4 = 153(0x99, float:2.14E-43)
            r3.visitJumpInsn(r4, r6)
            return
    }

    private void _list(java.lang.Class<?> r30, com.alibaba.fastjson.asm.MethodVisitor r31, com.alibaba.fastjson.util.FieldInfo r32, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r33) {
            r29 = this;
            r0 = r29
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.reflect.Type r4 = r2.fieldType
            java.lang.reflect.Type r4 = com.alibaba.fastjson.util.TypeUtils.getCollectionItemType(r4)
            boolean r5 = r4 instanceof java.lang.Class
            r6 = 0
            if (r5 == 0) goto L17
            r5 = r4
            java.lang.Class r5 = (java.lang.Class) r5
            goto L18
        L17:
            r5 = r6
        L18:
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r5 == r7) goto L22
            java.lang.Class<java.io.Serializable> r7 = java.io.Serializable.class
            if (r5 != r7) goto L21
            goto L22
        L21:
            r6 = r5
        L22:
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            com.alibaba.fastjson.asm.Label r7 = new com.alibaba.fastjson.asm.Label
            r7.<init>()
            com.alibaba.fastjson.asm.Label r8 = new com.alibaba.fastjson.asm.Label
            r8.<init>()
            r0._nameApply(r1, r2, r3, r5)
            r0._get(r1, r3, r2)
            r9 = 192(0xc0, float:2.69E-43)
            java.lang.String r10 = "java/util/List"
            r1.visitTypeInsn(r9, r10)
            java.lang.String r9 = "list"
            int r11 = r3.var(r9)
            r12 = 58
            r1.visitVarInsn(r12, r11)
            r0._filters(r1, r2, r3, r5)
            int r11 = r3.var(r9)
            r13 = 25
            r1.visitVarInsn(r13, r11)
            r11 = 199(0xc7, float:2.79E-43)
            r1.visitJumpInsn(r11, r7)
            r0._if_write_null(r1, r2, r3)
            r11 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r11, r8)
            r1.visitLabel(r7)
            java.lang.String r7 = "out"
            int r14 = r3.var(r7)
            r1.visitVarInsn(r13, r14)
            java.lang.String r14 = "seperator"
            int r14 = r3.var(r14)
            r15 = 21
            r1.visitVarInsn(r15, r14)
            java.lang.String r14 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            r12 = 182(0xb6, float:2.55E-43)
            java.lang.String r11 = "write"
            java.lang.String r15 = "(I)V"
            r1.visitMethodInsn(r12, r14, r11, r15)
            r0._writeFieldName(r1, r3)
            int r12 = r3.var(r9)
            r1.visitVarInsn(r13, r12)
            java.lang.String r12 = "()I"
            r13 = 185(0xb9, float:2.59E-43)
            r16 = r5
            java.lang.String r5 = "size"
            r1.visitMethodInsn(r13, r10, r5, r12)
            r12 = 54
            int r13 = r3.var(r5)
            r1.visitVarInsn(r12, r13)
            com.alibaba.fastjson.asm.Label r12 = new com.alibaba.fastjson.asm.Label
            r12.<init>()
            com.alibaba.fastjson.asm.Label r13 = new com.alibaba.fastjson.asm.Label
            r13.<init>()
            r17 = r8
            int r8 = r3.var(r5)
            r0 = 21
            r1.visitVarInsn(r0, r8)
            r0 = 3
            r1.visitInsn(r0)
            r0 = 160(0xa0, float:2.24E-43)
            r1.visitJumpInsn(r0, r12)
            int r0 = r3.var(r7)
            r8 = 25
            r1.visitVarInsn(r8, r0)
            java.lang.String r0 = "[]"
            r1.visitLdcInsn(r0)
            java.lang.String r0 = "(Ljava/lang/String;)V"
            r8 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r8, r14, r11, r0)
            r0 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r0, r13)
            r1.visitLabel(r12)
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r3)
            r8 = 1
            if (r0 != 0) goto L103
            r0 = 25
            r1.visitVarInsn(r0, r8)
            int r12 = r3.var(r9)
            r1.visitVarInsn(r0, r12)
            int r12 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r1.visitVarInsn(r0, r12)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r12 = "setContext"
            java.lang.String r8 = "(Ljava/lang/Object;Ljava/lang/Object;)V"
            r18 = r13
            r13 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r13, r0, r12, r8)
            goto L105
        L103:
            r18 = r13
        L105:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r4 != r0) goto L129
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r3)
            if (r0 == 0) goto L129
            int r0 = r3.var(r7)
            r8 = 25
            r1.visitVarInsn(r8, r0)
            int r0 = r3.var(r9)
            r1.visitVarInsn(r8, r0)
            java.lang.String r0 = "(Ljava/util/List;)V"
            r13 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r13, r14, r11, r0)
            r9 = 1
            goto L410
        L129:
            r8 = 25
            r13 = 182(0xb6, float:2.55E-43)
            int r0 = r3.var(r7)
            r1.visitVarInsn(r8, r0)
            r0 = 91
            r8 = 16
            r1.visitVarInsn(r8, r0)
            r1.visitMethodInsn(r13, r14, r11, r15)
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            com.alibaba.fastjson.asm.Label r12 = new com.alibaba.fastjson.asm.Label
            r12.<init>()
            com.alibaba.fastjson.asm.Label r13 = new com.alibaba.fastjson.asm.Label
            r13.<init>()
            r8 = 3
            r1.visitInsn(r8)
            r8 = 54
            r19 = r4
            java.lang.String r4 = "i"
            int r2 = r3.var(r4)
            r1.visitVarInsn(r8, r2)
            r1.visitLabel(r0)
            int r2 = r3.var(r4)
            r8 = 21
            r1.visitVarInsn(r8, r2)
            int r2 = r3.var(r5)
            r1.visitVarInsn(r8, r2)
            r2 = 162(0xa2, float:2.27E-43)
            r1.visitJumpInsn(r2, r13)
            int r2 = r3.var(r4)
            r1.visitVarInsn(r8, r2)
            r2 = 153(0x99, float:2.14E-43)
            r1.visitJumpInsn(r2, r12)
            int r2 = r3.var(r7)
            r8 = 25
            r1.visitVarInsn(r8, r2)
            r2 = 44
            r5 = 16
            r1.visitVarInsn(r5, r2)
            r2 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r2, r14, r11, r15)
            r1.visitLabel(r12)
            int r2 = r3.var(r9)
            r1.visitVarInsn(r8, r2)
            int r2 = r3.var(r4)
            r8 = 21
            r1.visitVarInsn(r8, r2)
            java.lang.String r2 = "get"
            java.lang.String r5 = "(I)Ljava/lang/Object;"
            r8 = 185(0xb9, float:2.59E-43)
            r1.visitMethodInsn(r8, r10, r2, r5)
            java.lang.String r2 = "list_item"
            int r5 = r3.var(r2)
            r8 = 58
            r1.visitVarInsn(r8, r5)
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            com.alibaba.fastjson.asm.Label r8 = new com.alibaba.fastjson.asm.Label
            r8.<init>()
            int r9 = r3.var(r2)
            r10 = 25
            r1.visitVarInsn(r10, r9)
            r9 = 199(0xc7, float:2.79E-43)
            r1.visitJumpInsn(r9, r8)
            int r9 = r3.var(r7)
            r1.visitVarInsn(r10, r9)
            java.lang.String r9 = "writeNull"
            java.lang.String r10 = "()V"
            r12 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r12, r14, r9, r10)
            r9 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r9, r5)
            r1.visitLabel(r8)
            com.alibaba.fastjson.asm.Label r8 = new com.alibaba.fastjson.asm.Label
            r8.<init>()
            com.alibaba.fastjson.asm.Label r9 = new com.alibaba.fastjson.asm.Label
            r9.<init>()
            java.lang.String r10 = "(I)Ljava/lang/Integer;"
            java.lang.String r12 = "valueOf"
            r20 = r14
            java.lang.String r14 = "java/lang/Integer"
            r21 = r15
            if (r6 == 0) goto L368
            int r22 = r6.getModifiers()
            boolean r22 = java.lang.reflect.Modifier.isPublic(r22)
            if (r22 == 0) goto L368
            int r15 = r3.var(r2)
            r23 = r7
            r7 = 25
            r1.visitVarInsn(r7, r15)
            java.lang.String r7 = "getClass"
            java.lang.String r15 = "()Ljava/lang/Class;"
            r24 = r13
            java.lang.String r13 = "java/lang/Object"
            r25 = r0
            r0 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r0, r13, r7, r15)
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            com.alibaba.fastjson.asm.Type r0 = com.alibaba.fastjson.asm.Type.getType(r0)
            r1.visitLdcInsn(r0)
            r0 = 166(0xa6, float:2.33E-43)
            r1.visitJumpInsn(r0, r9)
            r0 = r29
            r7 = r32
            r0._getListFieldItemSer(r3, r1, r7, r6)
            java.lang.String r13 = "list_item_desc"
            int r15 = r3.var(r13)
            r26 = r6
            r6 = 58
            r1.visitVarInsn(r6, r15)
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            com.alibaba.fastjson.asm.Label r15 = new com.alibaba.fastjson.asm.Label
            r15.<init>()
            boolean r27 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r3)
            if (r27 == 0) goto L2f6
            boolean r27 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r3)
            if (r27 == 0) goto L26f
            boolean r27 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r3)
            if (r27 == 0) goto L26f
            java.lang.String r27 = "writeDirectNonContext"
            r0 = r27
        L26c:
            r30 = r5
            goto L271
        L26f:
            r0 = r11
            goto L26c
        L271:
            int r5 = r3.var(r13)
            r27 = r9
            r9 = 25
            r1.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            r9 = 193(0xc1, float:2.7E-43)
            r1.visitTypeInsn(r9, r5)
            r9 = 153(0x99, float:2.14E-43)
            r1.visitJumpInsn(r9, r6)
            int r9 = r3.var(r13)
            r28 = r8
            r8 = 25
            r1.visitVarInsn(r8, r9)
            r9 = 192(0xc0, float:2.69E-43)
            r1.visitTypeInsn(r9, r5)
            r9 = 1
            r1.visitVarInsn(r8, r9)
            int r9 = r3.var(r2)
            r1.visitVarInsn(r8, r9)
            boolean r8 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r3)
            if (r8 == 0) goto L2ae
            r9 = 1
            r1.visitInsn(r9)
            goto L2bc
        L2ae:
            int r8 = r3.var(r4)
            r9 = 21
            r1.visitVarInsn(r9, r8)
            r8 = 184(0xb8, float:2.58E-43)
            r1.visitMethodInsn(r8, r14, r12, r10)
        L2bc:
            java.lang.String r8 = com.alibaba.fastjson.util.ASMUtils.desc(r26)
            com.alibaba.fastjson.asm.Type r8 = com.alibaba.fastjson.asm.Type.getType(r8)
            r1.visitLdcInsn(r8)
            int r8 = r7.serialzeFeatures
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.visitLdcInsn(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "(L"
            r8.append(r9)
            java.lang.String r9 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r8.append(r9)
            java.lang.String r9 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r9 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r9, r5, r0, r8)
            r0 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r0, r15)
            r1.visitLabel(r6)
            goto L2fc
        L2f6:
            r30 = r5
            r28 = r8
            r27 = r9
        L2fc:
            int r0 = r3.var(r13)
            r8 = 25
            r1.visitVarInsn(r8, r0)
            r9 = 1
            r1.visitVarInsn(r8, r9)
            int r0 = r3.var(r2)
            r1.visitVarInsn(r8, r0)
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r3)
            if (r0 == 0) goto L31a
            r1.visitInsn(r9)
            goto L328
        L31a:
            int r0 = r3.var(r4)
            r8 = 21
            r1.visitVarInsn(r8, r0)
            r8 = 184(0xb8, float:2.58E-43)
            r1.visitMethodInsn(r8, r14, r12, r10)
        L328:
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r26)
            com.alibaba.fastjson.asm.Type r0 = com.alibaba.fastjson.asm.Type.getType(r0)
            r1.visitLdcInsn(r0)
            int r0 = r7.serialzeFeatures
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.visitLdcInsn(r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "(L"
            r5.append(r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r5.append(r6)
            java.lang.String r6 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r8 = 185(0xb9, float:2.59E-43)
            r1.visitMethodInsn(r8, r0, r11, r5)
            r1.visitLabel(r15)
            r0 = r28
            r9 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r9, r0)
            r5 = r27
            goto L376
        L368:
            r25 = r0
            r30 = r5
            r26 = r6
            r23 = r7
            r0 = r8
            r24 = r13
            r7 = r32
            r5 = r9
        L376:
            r1.visitLabel(r5)
            r8 = 25
            r9 = 1
            r1.visitVarInsn(r8, r9)
            int r2 = r3.var(r2)
            r1.visitVarInsn(r8, r2)
            boolean r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r3)
            if (r2 == 0) goto L390
            r1.visitInsn(r9)
            goto L39e
        L390:
            int r2 = r3.var(r4)
            r8 = 21
            r1.visitVarInsn(r8, r2)
            r8 = 184(0xb8, float:2.58E-43)
            r1.visitMethodInsn(r8, r14, r12, r10)
        L39e:
            if (r26 == 0) goto L3ce
            int r2 = r26.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
            if (r2 == 0) goto L3ce
            r2 = r19
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = com.alibaba.fastjson.util.ASMUtils.desc(r2)
            com.alibaba.fastjson.asm.Type r2 = com.alibaba.fastjson.asm.Type.getType(r2)
            r1.visitLdcInsn(r2)
            int r2 = r7.serialzeFeatures
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.visitLdcInsn(r2)
            java.lang.String r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r5 = "writeWithFieldName"
            java.lang.String r6 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            r13 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r13, r2, r5, r6)
            goto L3d9
        L3ce:
            r13 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r5 = "writeWithFieldName"
            java.lang.String r6 = "(Ljava/lang/Object;Ljava/lang/Object;)V"
            r1.visitMethodInsn(r13, r2, r5, r6)
        L3d9:
            r1.visitLabel(r0)
            r0 = r30
            r1.visitLabel(r0)
            int r0 = r3.var(r4)
            r9 = 1
            r1.visitIincInsn(r0, r9)
            r0 = r25
            r2 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r2, r0)
            r0 = r24
            r1.visitLabel(r0)
            r0 = r23
            int r0 = r3.var(r0)
            r8 = 25
            r1.visitVarInsn(r8, r0)
            r0 = 93
            r5 = 16
            r1.visitVarInsn(r5, r0)
            r0 = r20
            r2 = r21
            r13 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r13, r0, r11, r2)
        L410:
            r1.visitVarInsn(r8, r9)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r2 = "popContext"
            java.lang.String r4 = "()V"
            r1.visitMethodInsn(r13, r0, r2, r4)
            r0 = r18
            r1.visitLabel(r0)
            r0 = r29
            r0._seperator(r1, r3)
            r2 = r17
            r1.visitLabel(r2)
            r2 = r16
            r1.visitLabel(r2)
            return
    }

    private void _long(java.lang.Class<?> r5, com.alibaba.fastjson.asm.MethodVisitor r6, com.alibaba.fastjson.util.FieldInfo r7, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r8) {
            r4 = this;
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            r4._nameApply(r6, r7, r8, r5)
            r4._get(r6, r8, r7)
            java.lang.String r0 = "long"
            r1 = 2
            int r2 = r8.var(r0, r1)
            r3 = 55
            r6.visitVarInsn(r3, r2)
            r4._filters(r6, r7, r8, r5)
            java.lang.String r7 = "out"
            int r7 = r8.var(r7)
            r2 = 25
            r6.visitVarInsn(r2, r7)
            java.lang.String r7 = "seperator"
            int r7 = r8.var(r7)
            r3 = 21
            r6.visitVarInsn(r3, r7)
            int r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r6.visitVarInsn(r2, r7)
            r7 = 22
            int r0 = r8.var(r0, r1)
            r6.visitVarInsn(r7, r0)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r0 = "writeFieldValue"
            java.lang.String r1 = "(CLjava/lang/String;J)V"
            r2 = 182(0xb6, float:2.55E-43)
            r6.visitMethodInsn(r2, r7, r0, r1)
            r4._seperator(r6, r8)
            r6.visitLabel(r5)
            return
    }

    private void _nameApply(com.alibaba.fastjson.asm.MethodVisitor r6, com.alibaba.fastjson.util.FieldInfo r7, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r8, com.alibaba.fastjson.asm.Label r9) {
            r5 = this;
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r8)
            r1 = 182(0xb6, float:2.55E-43)
            r2 = 25
            if (r0 != 0) goto L42
            r0 = 0
            r6.visitVarInsn(r2, r0)
            r0 = 1
            r6.visitVarInsn(r2, r0)
            r0 = 2
            r6.visitVarInsn(r2, r0)
            int r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r6.visitVarInsn(r2, r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "(L"
            r3.append(r4)
            java.lang.String r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r3.append(r4)
            java.lang.String r4 = ";Ljava/lang/Object;Ljava/lang/String;)Z"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "applyName"
            r6.visitMethodInsn(r1, r0, r4, r3)
            r0 = 153(0x99, float:2.14E-43)
            r6.visitJumpInsn(r0, r9)
            r5._labelApply(r6, r7, r8, r9)
        L42:
            java.lang.reflect.Field r7 = r7.field
            if (r7 != 0) goto L68
            java.lang.String r7 = "out"
            int r7 = r8.var(r7)
            r6.visitVarInsn(r2, r7)
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.IgnoreNonFieldGetter
            int r7 = r7.mask
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.visitLdcInsn(r7)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r8 = "isEnabled"
            java.lang.String r0 = "(I)Z"
            r6.visitMethodInsn(r1, r7, r8, r0)
            r7 = 154(0x9a, float:2.16E-43)
            r6.visitJumpInsn(r7, r9)
        L68:
            return
    }

    private void _notWriteDefault(com.alibaba.fastjson.asm.MethodVisitor r5, com.alibaba.fastjson.util.FieldInfo r6, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r7, com.alibaba.fastjson.asm.Label r8) {
            r4 = this;
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r7)
            if (r0 == 0) goto L7
            return
        L7:
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            java.lang.String r1 = "notWriteDefaultValue"
            int r1 = r7.var(r1)
            r2 = 21
            r5.visitVarInsn(r2, r1)
            r1 = 153(0x99, float:2.14E-43)
            r5.visitJumpInsn(r1, r0)
            java.lang.Class<?> r6 = r6.fieldClass
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r6 != r3) goto L30
            java.lang.String r6 = "boolean"
            int r6 = r7.var(r6)
            r5.visitVarInsn(r2, r6)
            r5.visitJumpInsn(r1, r8)
            goto Lba
        L30:
            java.lang.Class r3 = java.lang.Byte.TYPE
            if (r6 != r3) goto L42
            java.lang.String r6 = "byte"
            int r6 = r7.var(r6)
            r5.visitVarInsn(r2, r6)
            r5.visitJumpInsn(r1, r8)
            goto Lba
        L42:
            java.lang.Class r3 = java.lang.Short.TYPE
            if (r6 != r3) goto L53
            java.lang.String r6 = "short"
            int r6 = r7.var(r6)
            r5.visitVarInsn(r2, r6)
            r5.visitJumpInsn(r1, r8)
            goto Lba
        L53:
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r6 != r3) goto L64
            java.lang.String r6 = "int"
            int r6 = r7.var(r6)
            r5.visitVarInsn(r2, r6)
            r5.visitJumpInsn(r1, r8)
            goto Lba
        L64:
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r6 != r2) goto L81
            java.lang.String r6 = "long"
            int r6 = r7.var(r6)
            r7 = 22
            r5.visitVarInsn(r7, r6)
            r6 = 9
            r5.visitInsn(r6)
            r6 = 148(0x94, float:2.07E-43)
            r5.visitInsn(r6)
            r5.visitJumpInsn(r1, r8)
            goto Lba
        L81:
            java.lang.Class r2 = java.lang.Float.TYPE
            if (r6 != r2) goto L9e
            java.lang.String r6 = "float"
            int r6 = r7.var(r6)
            r7 = 23
            r5.visitVarInsn(r7, r6)
            r6 = 11
            r5.visitInsn(r6)
            r6 = 149(0x95, float:2.09E-43)
            r5.visitInsn(r6)
            r5.visitJumpInsn(r1, r8)
            goto Lba
        L9e:
            java.lang.Class r2 = java.lang.Double.TYPE
            if (r6 != r2) goto Lba
            java.lang.String r6 = "double"
            int r6 = r7.var(r6)
            r7 = 24
            r5.visitVarInsn(r7, r6)
            r6 = 14
            r5.visitInsn(r6)
            r6 = 151(0x97, float:2.12E-43)
            r5.visitInsn(r6)
            r5.visitJumpInsn(r1, r8)
        Lba:
            r5.visitLabel(r0)
            return
    }

    private void _object(java.lang.Class<?> r3, com.alibaba.fastjson.asm.MethodVisitor r4, com.alibaba.fastjson.util.FieldInfo r5, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r6) {
            r2 = this;
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            r2._nameApply(r4, r5, r6, r3)
            r2._get(r4, r6, r5)
            java.lang.String r0 = "object"
            int r0 = r6.var(r0)
            r1 = 58
            r4.visitVarInsn(r1, r0)
            r2._filters(r4, r5, r6, r3)
            r2._writeObject(r4, r5, r6, r3)
            r4.visitLabel(r3)
            return
    }

    private void _processKey(com.alibaba.fastjson.asm.MethodVisitor r8, com.alibaba.fastjson.util.FieldInfo r9, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r10) {
            r7 = this;
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            java.lang.String r1 = "hasNameFilters"
            int r1 = r10.var(r1)
            r2 = 21
            r8.visitVarInsn(r2, r1)
            r1 = 153(0x99, float:2.14E-43)
            r8.visitJumpInsn(r1, r0)
            java.lang.Class<?> r9 = r9.fieldClass
            r1 = 0
            r3 = 25
            r8.visitVarInsn(r3, r1)
            r1 = 1
            r8.visitVarInsn(r3, r1)
            r1 = 2
            r8.visitVarInsn(r3, r1)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r8.visitVarInsn(r3, r4)
            java.lang.Class r4 = java.lang.Byte.TYPE
            java.lang.String r5 = "valueOf"
            r6 = 184(0xb8, float:2.58E-43)
            if (r9 != r4) goto L44
            java.lang.String r9 = "byte"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r2, r9)
            java.lang.String r9 = "java/lang/Byte"
            java.lang.String r10 = "(B)Ljava/lang/Byte;"
            r8.visitMethodInsn(r6, r9, r5, r10)
            goto L129
        L44:
            java.lang.Class r4 = java.lang.Short.TYPE
            if (r9 != r4) goto L5a
            java.lang.String r9 = "short"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r2, r9)
            java.lang.String r9 = "java/lang/Short"
            java.lang.String r10 = "(S)Ljava/lang/Short;"
            r8.visitMethodInsn(r6, r9, r5, r10)
            goto L129
        L5a:
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r9 != r4) goto L70
            java.lang.String r9 = "int"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r2, r9)
            java.lang.String r9 = "java/lang/Integer"
            java.lang.String r10 = "(I)Ljava/lang/Integer;"
            r8.visitMethodInsn(r6, r9, r5, r10)
            goto L129
        L70:
            java.lang.Class r4 = java.lang.Character.TYPE
            if (r9 != r4) goto L86
            java.lang.String r9 = "char"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r2, r9)
            java.lang.String r9 = "java/lang/Character"
            java.lang.String r10 = "(C)Ljava/lang/Character;"
            r8.visitMethodInsn(r6, r9, r5, r10)
            goto L129
        L86:
            java.lang.Class r4 = java.lang.Long.TYPE
            if (r9 != r4) goto L9e
            java.lang.String r9 = "long"
            int r9 = r10.var(r9, r1)
            r10 = 22
            r8.visitVarInsn(r10, r9)
            java.lang.String r9 = "java/lang/Long"
            java.lang.String r10 = "(J)Ljava/lang/Long;"
            r8.visitMethodInsn(r6, r9, r5, r10)
            goto L129
        L9e:
            java.lang.Class r4 = java.lang.Float.TYPE
            if (r9 != r4) goto Lb6
            java.lang.String r9 = "float"
            int r9 = r10.var(r9)
            r10 = 23
            r8.visitVarInsn(r10, r9)
            java.lang.String r9 = "java/lang/Float"
            java.lang.String r10 = "(F)Ljava/lang/Float;"
            r8.visitMethodInsn(r6, r9, r5, r10)
            goto L129
        Lb6:
            java.lang.Class r4 = java.lang.Double.TYPE
            if (r9 != r4) goto Lcd
            java.lang.String r9 = "double"
            int r9 = r10.var(r9, r1)
            r10 = 24
            r8.visitVarInsn(r10, r9)
            java.lang.String r9 = "java/lang/Double"
            java.lang.String r10 = "(D)Ljava/lang/Double;"
            r8.visitMethodInsn(r6, r9, r5, r10)
            goto L129
        Lcd:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r9 != r1) goto Le2
            java.lang.String r9 = "boolean"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r2, r9)
            java.lang.String r9 = "java/lang/Boolean"
            java.lang.String r10 = "(Z)Ljava/lang/Boolean;"
            r8.visitMethodInsn(r6, r9, r5, r10)
            goto L129
        Le2:
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r9 != r1) goto Lf0
            java.lang.String r9 = "decimal"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r3, r9)
            goto L129
        Lf0:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r9 != r1) goto Lfe
            java.lang.String r9 = "string"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r3, r9)
            goto L129
        Lfe:
            boolean r1 = r9.isEnum()
            if (r1 == 0) goto L10e
            java.lang.String r9 = "enum"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r3, r9)
            goto L129
        L10e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            boolean r9 = r1.isAssignableFrom(r9)
            if (r9 == 0) goto L120
            java.lang.String r9 = "list"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r3, r9)
            goto L129
        L120:
            java.lang.String r9 = "object"
            int r9 = r10.var(r9)
            r8.visitVarInsn(r3, r9)
        L129:
            java.lang.String r9 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "(L"
            r10.append(r1)
            java.lang.String r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r10.append(r1)
            java.lang.String r1 = ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;"
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "processKey"
            r8.visitMethodInsn(r1, r9, r2, r10)
            r9 = 58
            int r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r8.visitVarInsn(r9, r10)
            r8.visitLabel(r0)
            return
    }

    private void _processValue(com.alibaba.fastjson.asm.MethodVisitor r17, com.alibaba.fastjson.util.FieldInfo r18, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r19, com.alibaba.fastjson.asm.Label r20) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            java.lang.Class<?> r4 = r1.fieldClass
            boolean r5 = r4.isPrimitive()
            r6 = 167(0xa7, float:2.34E-43)
            r7 = 1
            r8 = 21
            r9 = 89
            r10 = 58
            if (r5 == 0) goto L45
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            java.lang.String r11 = "checkValue"
            int r11 = r2.var(r11)
            r0.visitVarInsn(r8, r11)
            r11 = 154(0x9a, float:2.16E-43)
            r0.visitJumpInsn(r11, r5)
            r0.visitInsn(r7)
            r0.visitInsn(r9)
            int r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r11)
            int r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.processValue
            r0.visitVarInsn(r10, r11)
            r0.visitJumpInsn(r6, r3)
            r0.visitLabel(r5)
        L45:
            r5 = 25
            r11 = 0
            r0.visitVarInsn(r5, r11)
            r0.visitVarInsn(r5, r7)
            r0.visitVarInsn(r5, r11)
            java.lang.String r7 = r1.name
            int r7 = r2.getFieldOrinal(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.visitLdcInsn(r7)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "(I)"
            r11.append(r12)
            java.lang.Class<com.alibaba.fastjson.serializer.BeanContext> r12 = com.alibaba.fastjson.serializer.BeanContext.class
            java.lang.String r13 = com.alibaba.fastjson.util.ASMUtils.desc(r12)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r13 = 182(0xb6, float:2.55E-43)
            java.lang.String r14 = "getBeanContext"
            r0.visitMethodInsn(r13, r7, r14, r11)
            r11 = 2
            r0.visitVarInsn(r5, r11)
            int r14 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r0.visitVarInsn(r5, r14)
            java.lang.Class r14 = java.lang.Byte.TYPE
            java.lang.String r15 = "valueOf"
            r6 = 184(0xb8, float:2.58E-43)
            if (r4 != r14) goto La9
            java.lang.String r4 = "byte"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r8, r4)
            java.lang.String r4 = "java/lang/Byte"
            java.lang.String r8 = "(B)Ljava/lang/Byte;"
            r0.visitMethodInsn(r6, r4, r15, r8)
            r0.visitInsn(r9)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            goto L1fa
        La9:
            java.lang.Class r14 = java.lang.Short.TYPE
            if (r4 != r14) goto Lc7
            java.lang.String r4 = "short"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r8, r4)
            java.lang.String r4 = "java/lang/Short"
            java.lang.String r8 = "(S)Ljava/lang/Short;"
            r0.visitMethodInsn(r6, r4, r15, r8)
            r0.visitInsn(r9)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            goto L1fa
        Lc7:
            java.lang.Class r14 = java.lang.Integer.TYPE
            if (r4 != r14) goto Le5
            java.lang.String r4 = "int"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r8, r4)
            java.lang.String r4 = "java/lang/Integer"
            java.lang.String r8 = "(I)Ljava/lang/Integer;"
            r0.visitMethodInsn(r6, r4, r15, r8)
            r0.visitInsn(r9)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            goto L1fa
        Le5:
            java.lang.Class r14 = java.lang.Character.TYPE
            if (r4 != r14) goto L103
            java.lang.String r4 = "char"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r8, r4)
            java.lang.String r4 = "java/lang/Character"
            java.lang.String r8 = "(C)Ljava/lang/Character;"
            r0.visitMethodInsn(r6, r4, r15, r8)
            r0.visitInsn(r9)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            goto L1fa
        L103:
            java.lang.Class r14 = java.lang.Long.TYPE
            if (r4 != r14) goto L123
            java.lang.String r4 = "long"
            int r4 = r2.var(r4, r11)
            r8 = 22
            r0.visitVarInsn(r8, r4)
            java.lang.String r4 = "java/lang/Long"
            java.lang.String r8 = "(J)Ljava/lang/Long;"
            r0.visitMethodInsn(r6, r4, r15, r8)
            r0.visitInsn(r9)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            goto L1fa
        L123:
            java.lang.Class r14 = java.lang.Float.TYPE
            if (r4 != r14) goto L143
            java.lang.String r4 = "float"
            int r4 = r2.var(r4)
            r8 = 23
            r0.visitVarInsn(r8, r4)
            java.lang.String r4 = "java/lang/Float"
            java.lang.String r8 = "(F)Ljava/lang/Float;"
            r0.visitMethodInsn(r6, r4, r15, r8)
            r0.visitInsn(r9)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            goto L1fa
        L143:
            java.lang.Class r14 = java.lang.Double.TYPE
            if (r4 != r14) goto L163
            java.lang.String r4 = "double"
            int r4 = r2.var(r4, r11)
            r8 = 24
            r0.visitVarInsn(r8, r4)
            java.lang.String r4 = "java/lang/Double"
            java.lang.String r8 = "(D)Ljava/lang/Double;"
            r0.visitMethodInsn(r6, r4, r15, r8)
            r0.visitInsn(r9)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            goto L1fa
        L163:
            java.lang.Class r11 = java.lang.Boolean.TYPE
            if (r4 != r11) goto L181
            java.lang.String r4 = "boolean"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r8, r4)
            java.lang.String r4 = "java/lang/Boolean"
            java.lang.String r8 = "(Z)Ljava/lang/Boolean;"
            r0.visitMethodInsn(r6, r4, r15, r8)
            r0.visitInsn(r9)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            goto L1fa
        L181:
            java.lang.Class<java.math.BigDecimal> r6 = java.math.BigDecimal.class
            if (r4 != r6) goto L199
            java.lang.String r4 = "decimal"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r5, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r5, r4)
            goto L1fa
        L199:
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r4 != r6) goto L1b1
            java.lang.String r4 = "string"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r5, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r5, r4)
            goto L1fa
        L1b1:
            boolean r6 = r4.isEnum()
            if (r6 == 0) goto L1cb
            java.lang.String r4 = "enum"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r5, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r5, r4)
            goto L1fa
        L1cb:
            java.lang.Class<java.util.List> r6 = java.util.List.class
            boolean r4 = r6.isAssignableFrom(r4)
            if (r4 == 0) goto L1e7
            java.lang.String r4 = "list"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r5, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r5, r4)
            goto L1fa
        L1e7:
            java.lang.String r4 = "object"
            int r4 = r2.var(r4)
            r0.visitVarInsn(r5, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r10, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r5, r4)
        L1fa:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "(L"
            r4.append(r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r4.append(r6)
            java.lang.String r6 = ";"
            r4.append(r6)
            java.lang.String r6 = com.alibaba.fastjson.util.ASMUtils.desc(r12)
            r4.append(r6)
            java.lang.String r6 = "Ljava/lang/Object;Ljava/lang/String;"
            r4.append(r6)
            java.lang.String r6 = "Ljava/lang/Object;"
            r4.append(r6)
            java.lang.String r6 = ")Ljava/lang/Object;"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "processValue"
            r0.visitMethodInsn(r13, r7, r6, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.processValue
            r0.visitVarInsn(r10, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.original
            r0.visitVarInsn(r5, r4)
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.processValue
            r0.visitVarInsn(r5, r4)
            r4 = 165(0xa5, float:2.31E-43)
            r0.visitJumpInsn(r4, r3)
            r16._writeObject(r17, r18, r19, r20)
            r1 = r20
            r2 = 167(0xa7, float:2.34E-43)
            r0.visitJumpInsn(r2, r1)
            r0.visitLabel(r3)
            return
    }

    private void _seperator(com.alibaba.fastjson.asm.MethodVisitor r3, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r4) {
            r2 = this;
            r0 = 16
            r1 = 44
            r3.visitVarInsn(r0, r1)
            java.lang.String r0 = "seperator"
            int r4 = r4.var(r0)
            r0 = 54
            r3.visitVarInsn(r0, r4)
            return
    }

    private void _string(java.lang.Class<?> r9, com.alibaba.fastjson.asm.MethodVisitor r10, com.alibaba.fastjson.util.FieldInfo r11, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r12) {
            r8 = this;
            com.alibaba.fastjson.asm.Label r9 = new com.alibaba.fastjson.asm.Label
            r9.<init>()
            java.lang.String r0 = r11.name
            com.alibaba.fastjson.serializer.SerializeBeanInfo r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$400(r12)
            java.lang.String r1 = r1.typeKey
            boolean r0 = r0.equals(r1)
            r1 = 182(0xb6, float:2.55E-43)
            r2 = 25
            if (r0 == 0) goto L31
            r0 = 1
            r10.visitVarInsn(r2, r0)
            r0 = 4
            r10.visitVarInsn(r2, r0)
            r0 = 2
            r10.visitVarInsn(r2, r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r3 = "isWriteClassName"
            java.lang.String r4 = "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z"
            r10.visitMethodInsn(r1, r0, r3, r4)
            r0 = 154(0x9a, float:2.16E-43)
            r10.visitJumpInsn(r0, r9)
        L31:
            r8._nameApply(r10, r11, r12, r9)
            r8._get(r10, r12, r11)
            r0 = 58
            java.lang.String r3 = "string"
            int r4 = r12.var(r3)
            r10.visitVarInsn(r0, r4)
            r8._filters(r10, r11, r12, r9)
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            com.alibaba.fastjson.asm.Label r4 = new com.alibaba.fastjson.asm.Label
            r4.<init>()
            int r5 = r12.var(r3)
            r10.visitVarInsn(r2, r5)
            r5 = 199(0xc7, float:2.79E-43)
            r10.visitJumpInsn(r5, r0)
            r8._if_write_null(r10, r11, r12)
            r11 = 167(0xa7, float:2.34E-43)
            r10.visitJumpInsn(r11, r4)
            r10.visitLabel(r0)
            boolean r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r12)
            java.lang.String r0 = "(CLjava/lang/String;Ljava/lang/String;)V"
            java.lang.String r5 = "seperator"
            r6 = 21
            java.lang.String r7 = "out"
            if (r11 == 0) goto L96
            int r11 = r12.var(r7)
            r10.visitVarInsn(r2, r11)
            int r11 = r12.var(r5)
            r10.visitVarInsn(r6, r11)
            int r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r10.visitVarInsn(r2, r11)
            int r11 = r12.var(r3)
            r10.visitVarInsn(r2, r11)
            java.lang.String r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r2 = "writeFieldValueStringWithDoubleQuoteCheck"
            r10.visitMethodInsn(r1, r11, r2, r0)
            goto Lb7
        L96:
            int r11 = r12.var(r7)
            r10.visitVarInsn(r2, r11)
            int r11 = r12.var(r5)
            r10.visitVarInsn(r6, r11)
            int r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r10.visitVarInsn(r2, r11)
            int r11 = r12.var(r3)
            r10.visitVarInsn(r2, r11)
            java.lang.String r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r2 = "writeFieldValue"
            r10.visitMethodInsn(r1, r11, r2, r0)
        Lb7:
            r8._seperator(r10, r12)
            r10.visitLabel(r4)
            r10.visitLabel(r9)
            return
    }

    private void _writeFieldName(com.alibaba.fastjson.asm.MethodVisitor r5, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r6) {
            r4 = this;
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r6)
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "out"
            r3 = 25
            if (r0 == 0) goto L22
            int r6 = r6.var(r2)
            r5.visitVarInsn(r3, r6)
            int r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r5.visitVarInsn(r3, r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r0 = "writeFieldNameDirect"
            java.lang.String r2 = "(Ljava/lang/String;)V"
            r5.visitMethodInsn(r1, r6, r0, r2)
            return
        L22:
            int r6 = r6.var(r2)
            r5.visitVarInsn(r3, r6)
            int r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r5.visitVarInsn(r3, r6)
            r6 = 3
            r5.visitInsn(r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r0 = "writeFieldName"
            java.lang.String r2 = "(Ljava/lang/String;Z)V"
            r5.visitMethodInsn(r1, r6, r0, r2)
            return
    }

    private void _writeObject(com.alibaba.fastjson.asm.MethodVisitor r21, com.alibaba.fastjson.util.FieldInfo r22, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r23, com.alibaba.fastjson.asm.Label r24) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = r2.getFormat()
            java.lang.Class<?> r5 = r2.fieldClass
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            boolean r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r3)
            java.lang.String r8 = "object"
            r9 = 25
            if (r7 == 0) goto L25
            int r7 = r3.var(r8)
            r1.visitVarInsn(r9, r7)
            goto L2a
        L25:
            int r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.processValue
            r1.visitVarInsn(r9, r7)
        L2a:
            r7 = 89
            r1.visitInsn(r7)
            int r7 = r3.var(r8)
            r10 = 58
            r1.visitVarInsn(r10, r7)
            r7 = 199(0xc7, float:2.79E-43)
            r1.visitJumpInsn(r7, r6)
            r20._if_write_null(r21, r22, r23)
            r7 = 167(0xa7, float:2.34E-43)
            r11 = r24
            r1.visitJumpInsn(r7, r11)
            r1.visitLabel(r6)
            java.lang.String r6 = "out"
            int r6 = r3.var(r6)
            r1.visitVarInsn(r9, r6)
            java.lang.String r6 = "seperator"
            int r6 = r3.var(r6)
            r11 = 21
            r1.visitVarInsn(r11, r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r11 = "(I)V"
            r12 = 182(0xb6, float:2.55E-43)
            java.lang.String r13 = "write"
            r1.visitMethodInsn(r12, r6, r13, r11)
            r0._writeFieldName(r1, r3)
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            com.alibaba.fastjson.asm.Label r11 = new com.alibaba.fastjson.asm.Label
            r11.<init>()
            int r14 = r5.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            java.lang.String r15 = "Ljava/lang/reflect/Type;"
            java.lang.String r7 = "_asm_fieldType"
            if (r14 == 0) goto L1da
            boolean r14 = com.alibaba.fastjson.parser.ParserConfig.isPrimitive2(r5)
            if (r14 != 0) goto L1da
            int r14 = r3.var(r8)
            r1.visitVarInsn(r9, r14)
            java.lang.String r14 = "getClass"
            java.lang.String r10 = "()Ljava/lang/Class;"
            java.lang.String r9 = "java/lang/Object"
            r1.visitMethodInsn(r12, r9, r14, r10)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.getType(r5)
            r1.visitLdcInsn(r5)
            r5 = 166(0xa6, float:2.33E-43)
            r1.visitJumpInsn(r5, r11)
            r0._getFieldSer(r3, r1, r2)
            java.lang.String r5 = "fied_ser"
            int r9 = r3.var(r5)
            r10 = 58
            r1.visitVarInsn(r10, r9)
            com.alibaba.fastjson.asm.Label r9 = new com.alibaba.fastjson.asm.Label
            r9.<init>()
            com.alibaba.fastjson.asm.Label r10 = new com.alibaba.fastjson.asm.Label
            r10.<init>()
            int r14 = r3.var(r5)
            r12 = 25
            r1.visitVarInsn(r12, r14)
            java.lang.String r12 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            r14 = 193(0xc1, float:2.7E-43)
            r1.visitTypeInsn(r14, r12)
            r14 = 153(0x99, float:2.14E-43)
            r1.visitJumpInsn(r14, r9)
            int r14 = r2.serialzeFeatures
            r16 = r14
            com.alibaba.fastjson.serializer.SerializerFeature r14 = com.alibaba.fastjson.serializer.SerializerFeature.BeanToArray
            int r14 = r14.mask
            r14 = r16 & r14
            if (r14 == 0) goto Le5
            r14 = 1
            goto Le6
        Le5:
            r14 = 0
        Le6:
            boolean r16 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r3)
            if (r16 == 0) goto Lfa
            boolean r16 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r3)
            if (r16 == 0) goto Lfa
            if (r14 == 0) goto Lf7
            java.lang.String r14 = "writeAsArrayNonContext"
            goto L100
        Lf7:
            java.lang.String r14 = "writeDirectNonContext"
            goto L100
        Lfa:
            if (r14 == 0) goto Lff
            java.lang.String r14 = "writeAsArray"
            goto L100
        Lff:
            r14 = r13
        L100:
            int r0 = r3.var(r5)
            r16 = r4
            r4 = 25
            r1.visitVarInsn(r4, r0)
            r0 = 192(0xc0, float:2.69E-43)
            r1.visitTypeInsn(r0, r12)
            r0 = 1
            r1.visitVarInsn(r4, r0)
            int r0 = r3.var(r8)
            r1.visitVarInsn(r4, r0)
            int r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r1.visitVarInsn(r4, r0)
            r0 = 0
            r1.visitVarInsn(r4, r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r17 = r11
            java.lang.String r11 = r2.name
            r4.append(r11)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r11 = 180(0xb4, float:2.52E-43)
            r1.visitFieldInsn(r11, r0, r4, r15)
            int r0 = r2.serialzeFeatures
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.visitLdcInsn(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "(L"
            r0.append(r4)
            java.lang.String r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r0.append(r11)
            r18 = r6
            java.lang.String r6 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r19 = r13
            r13 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r13, r12, r14, r0)
            r0 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r0, r10)
            r1.visitLabel(r9)
            int r0 = r3.var(r5)
            r12 = 25
            r1.visitVarInsn(r12, r0)
            r0 = 1
            r1.visitVarInsn(r12, r0)
            int r0 = r3.var(r8)
            r1.visitVarInsn(r12, r0)
            int r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r1.visitVarInsn(r12, r0)
            r0 = 0
            r1.visitVarInsn(r12, r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = r2.name
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r1.visitFieldInsn(r9, r0, r5, r15)
            int r0 = r2.serialzeFeatures
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.visitLdcInsn(r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r11)
            r5.append(r6)
            java.lang.String r4 = r5.toString()
            r5 = 185(0xb9, float:2.59E-43)
            r6 = r19
            r1.visitMethodInsn(r5, r0, r6, r4)
            r1.visitLabel(r10)
            r0 = r18
            r4 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r4, r0)
            r4 = r17
            goto L1de
        L1da:
            r16 = r4
            r0 = r6
            r4 = r11
        L1de:
            r1.visitLabel(r4)
            r4 = 1
            r12 = 25
            r1.visitVarInsn(r12, r4)
            boolean r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r3)
            if (r4 == 0) goto L1f5
            int r4 = r3.var(r8)
            r1.visitVarInsn(r12, r4)
            goto L1fa
        L1f5:
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.processValue
            r1.visitVarInsn(r12, r4)
        L1fa:
            if (r16 == 0) goto L20d
            r4 = r16
            r1.visitLdcInsn(r4)
            java.lang.String r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r4 = "writeWithFormat"
            java.lang.String r5 = "(Ljava/lang/Object;Ljava/lang/String;)V"
            r13 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r13, r2, r4, r5)
            goto L270
        L20d:
            int r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r1.visitVarInsn(r12, r4)
            java.lang.reflect.Type r4 = r2.fieldType
            boolean r5 = r4 instanceof java.lang.Class
            java.lang.String r6 = "writeWithFieldName"
            if (r5 == 0) goto L22c
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isPrimitive()
            if (r4 == 0) goto L22c
            java.lang.String r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r4 = "(Ljava/lang/Object;Ljava/lang/Object;)V"
            r13 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r13, r2, r6, r4)
            goto L270
        L22c:
            java.lang.Class<?> r4 = r2.fieldClass
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L23e
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            com.alibaba.fastjson.asm.Type r4 = com.alibaba.fastjson.asm.Type.getType(r4)
            r1.visitLdcInsn(r4)
            goto L25e
        L23e:
            r4 = 0
            r12 = 25
            r1.visitVarInsn(r12, r4)
            java.lang.String r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = r2.name
            r5.append(r8)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r11 = 180(0xb4, float:2.52E-43)
            r1.visitFieldInsn(r11, r4, r5, r15)
        L25e:
            int r2 = r2.serialzeFeatures
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.visitLdcInsn(r2)
            java.lang.String r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r4 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            r13 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r13, r2, r6, r4)
        L270:
            r1.visitLabel(r0)
            r0 = r20
            r0._seperator(r1, r3)
            return
    }

    private void generateWriteAsArray(java.lang.Class<?> r33, com.alibaba.fastjson.asm.MethodVisitor r34, com.alibaba.fastjson.util.FieldInfo[] r35, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r36) throws java.lang.Exception {
            r32 = this;
            r0 = r32
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "out"
            int r5 = r3.var(r4)
            r6 = 25
            r1.visitVarInsn(r6, r5)
            r5 = 91
            r7 = 16
            r1.visitVarInsn(r7, r5)
            java.lang.String r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            r8 = 182(0xb6, float:2.55E-43)
            java.lang.String r9 = "write"
            java.lang.String r10 = "(I)V"
            r1.visitMethodInsn(r8, r5, r9, r10)
            int r11 = r2.length
            if (r11 != 0) goto L38
            int r2 = r3.var(r4)
            r1.visitVarInsn(r6, r2)
            r2 = 93
            r1.visitVarInsn(r7, r2)
            r1.visitMethodInsn(r8, r5, r9, r10)
            return
        L38:
            r5 = 0
        L39:
            if (r5 >= r11) goto L7ea
            int r12 = r11 + (-1)
            if (r5 != r12) goto L42
            r12 = 93
            goto L44
        L42:
            r12 = 44
        L44:
            r13 = r2[r5]
            java.lang.Class<?> r14 = r13.fieldClass
            java.lang.String r15 = r13.name
            r1.visitLdcInsn(r15)
            int r15 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r7 = 58
            r1.visitVarInsn(r7, r15)
            java.lang.Class r15 = java.lang.Byte.TYPE
            r7 = 89
            if (r14 == r15) goto L62
            java.lang.Class r15 = java.lang.Short.TYPE
            if (r14 == r15) goto L62
            java.lang.Class r15 = java.lang.Integer.TYPE
            if (r14 != r15) goto L6c
        L62:
            r0 = r4
            r19 = r5
            r4 = r10
            r20 = r11
            r15 = 25
            goto L7ba
        L6c:
            java.lang.Class r15 = java.lang.Long.TYPE
            if (r14 != r15) goto L9c
            int r14 = r3.var(r4)
            r1.visitVarInsn(r6, r14)
            r1.visitInsn(r7)
            r0._get(r1, r3, r13)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r13 = "writeLong"
            java.lang.String r14 = "(J)V"
            r1.visitMethodInsn(r8, r7, r13, r14)
            r13 = 16
            r1.visitVarInsn(r13, r12)
            r1.visitMethodInsn(r8, r7, r9, r10)
        L8e:
            r13 = r10
            r10 = r0
            r0 = r4
            r4 = r13
            r19 = r5
            r20 = r11
        L96:
            r13 = 16
            r15 = 25
            goto L7da
        L9c:
            java.lang.Class r15 = java.lang.Float.TYPE
            if (r14 != r15) goto Lc3
            int r14 = r3.var(r4)
            r1.visitVarInsn(r6, r14)
            r1.visitInsn(r7)
            r0._get(r1, r3, r13)
            r7 = 4
            r1.visitInsn(r7)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r13 = "writeFloat"
            java.lang.String r14 = "(FZ)V"
            r1.visitMethodInsn(r8, r7, r13, r14)
            r13 = 16
            r1.visitVarInsn(r13, r12)
            r1.visitMethodInsn(r8, r7, r9, r10)
            goto L8e
        Lc3:
            java.lang.Class r15 = java.lang.Double.TYPE
            if (r14 != r15) goto Lea
            int r14 = r3.var(r4)
            r1.visitVarInsn(r6, r14)
            r1.visitInsn(r7)
            r0._get(r1, r3, r13)
            r7 = 4
            r1.visitInsn(r7)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r13 = "writeDouble"
            java.lang.String r14 = "(DZ)V"
            r1.visitMethodInsn(r8, r7, r13, r14)
            r13 = 16
            r1.visitVarInsn(r13, r12)
            r1.visitMethodInsn(r8, r7, r9, r10)
            goto L8e
        Lea:
            java.lang.Class r15 = java.lang.Boolean.TYPE
            if (r14 != r15) goto L10b
            int r14 = r3.var(r4)
            r1.visitVarInsn(r6, r14)
            r1.visitInsn(r7)
            r0._get(r1, r3, r13)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r13 = "(Z)V"
            r1.visitMethodInsn(r8, r7, r9, r13)
            r13 = 16
            r1.visitVarInsn(r13, r12)
            r1.visitMethodInsn(r8, r7, r9, r10)
            goto L8e
        L10b:
            java.lang.Class r15 = java.lang.Character.TYPE
            r7 = 184(0xb8, float:2.58E-43)
            if (r14 != r15) goto L134
            int r14 = r3.var(r4)
            r1.visitVarInsn(r6, r14)
            r0._get(r1, r3, r13)
            java.lang.String r13 = "toString"
            java.lang.String r14 = "(C)Ljava/lang/String;"
            java.lang.String r15 = "java/lang/Character"
            r1.visitMethodInsn(r7, r15, r13, r14)
            r15 = 16
            r1.visitVarInsn(r15, r12)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r12 = "writeString"
            java.lang.String r13 = "(Ljava/lang/String;C)V"
            r1.visitMethodInsn(r8, r7, r12, r13)
            goto L8e
        L134:
            r15 = 16
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r14 != r7) goto L152
            int r7 = r3.var(r4)
            r1.visitVarInsn(r6, r7)
            r0._get(r1, r3, r13)
            r1.visitVarInsn(r15, r12)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r12 = "writeString"
            java.lang.String r13 = "(Ljava/lang/String;C)V"
            r1.visitMethodInsn(r8, r7, r12, r13)
            goto L8e
        L152:
            boolean r7 = r14.isEnum()
            if (r7 == 0) goto L17a
            int r7 = r3.var(r4)
            r1.visitVarInsn(r6, r7)
            r7 = 89
            r1.visitInsn(r7)
            r0._get(r1, r3, r13)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r13 = "writeEnum"
            java.lang.String r14 = "(Ljava/lang/Enum;)V"
            r1.visitMethodInsn(r8, r7, r13, r14)
            r13 = 16
            r1.visitVarInsn(r13, r12)
            r1.visitMethodInsn(r8, r7, r9, r10)
            goto L8e
        L17a:
            java.lang.Class<java.util.List> r7 = java.util.List.class
            boolean r7 = r7.isAssignableFrom(r14)
            java.lang.String r15 = "writeWithFieldName"
            java.lang.String r8 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            java.lang.String r6 = "(L"
            if (r7 == 0) goto L548
            java.lang.reflect.Type r7 = r13.fieldType
            boolean r14 = r7 instanceof java.lang.Class
            if (r14 == 0) goto L191
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            goto L19a
        L191:
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type[] r7 = r7.getActualTypeArguments()
            r14 = 0
            r7 = r7[r14]
        L19a:
            boolean r14 = r7 instanceof java.lang.Class
            if (r14 == 0) goto L1a5
            r14 = r7
            java.lang.Class r14 = (java.lang.Class) r14
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r14 != r2) goto L1a6
        L1a5:
            r14 = 0
        L1a6:
            r0._get(r1, r3, r13)
            r2 = 192(0xc0, float:2.69E-43)
            r19 = r5
            java.lang.String r5 = "java/util/List"
            r1.visitTypeInsn(r2, r5)
            java.lang.String r2 = "list"
            int r5 = r3.var(r2)
            r17 = r7
            r7 = 58
            r1.visitVarInsn(r7, r5)
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r14 != r5) goto L1ee
            boolean r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r3)
            if (r5 == 0) goto L1ee
            int r5 = r3.var(r4)
            r6 = 25
            r1.visitVarInsn(r6, r5)
            int r2 = r3.var(r2)
            r1.visitVarInsn(r6, r2)
            java.lang.String r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r5 = "(Ljava/util/List;)V"
            r6 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r6, r2, r9, r5)
            r0 = r4
            r4 = r10
            r20 = r11
            r21 = r12
            r13 = 16
            r15 = 25
            goto L531
        L1ee:
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            com.alibaba.fastjson.asm.Label r7 = new com.alibaba.fastjson.asm.Label
            r7.<init>()
            r20 = r11
            int r11 = r3.var(r2)
            r21 = r12
            r12 = 25
            r1.visitVarInsn(r12, r11)
            r11 = 199(0xc7, float:2.79E-43)
            r1.visitJumpInsn(r11, r7)
            int r11 = r3.var(r4)
            r1.visitVarInsn(r12, r11)
            java.lang.String r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r12 = "writeNull"
            r22 = r15
            java.lang.String r15 = "()V"
            r23 = r8
            r8 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r8, r11, r12, r15)
            r8 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r8, r5)
            r1.visitLabel(r7)
            int r7 = r3.var(r2)
            r12 = 25
            r1.visitVarInsn(r12, r7)
            java.lang.String r7 = "size"
            java.lang.String r8 = "()I"
            java.lang.String r15 = "java/util/List"
            r12 = 185(0xb9, float:2.59E-43)
            r1.visitMethodInsn(r12, r15, r7, r8)
            java.lang.String r7 = "size"
            int r7 = r3.var(r7)
            r8 = 54
            r1.visitVarInsn(r8, r7)
            int r7 = r3.var(r4)
            r12 = 25
            r1.visitVarInsn(r12, r7)
            r7 = 91
            r15 = 16
            r1.visitVarInsn(r15, r7)
            r8 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r8, r11, r9, r10)
            com.alibaba.fastjson.asm.Label r7 = new com.alibaba.fastjson.asm.Label
            r7.<init>()
            com.alibaba.fastjson.asm.Label r8 = new com.alibaba.fastjson.asm.Label
            r8.<init>()
            com.alibaba.fastjson.asm.Label r12 = new com.alibaba.fastjson.asm.Label
            r12.<init>()
            r15 = 3
            r1.visitInsn(r15)
            r15 = 54
            r24 = r5
            java.lang.String r5 = "i"
            r25 = r6
            int r6 = r3.var(r5)
            r1.visitVarInsn(r15, r6)
            r1.visitLabel(r7)
            int r6 = r3.var(r5)
            r15 = 21
            r1.visitVarInsn(r15, r6)
            java.lang.String r6 = "size"
            int r6 = r3.var(r6)
            r1.visitVarInsn(r15, r6)
            r6 = 162(0xa2, float:2.27E-43)
            r1.visitJumpInsn(r6, r12)
            int r6 = r3.var(r5)
            r1.visitVarInsn(r15, r6)
            r6 = 153(0x99, float:2.14E-43)
            r1.visitJumpInsn(r6, r8)
            int r6 = r3.var(r4)
            r15 = 25
            r1.visitVarInsn(r15, r6)
            r6 = 44
            r15 = 16
            r1.visitVarInsn(r15, r6)
            r6 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r6, r11, r9, r10)
            r1.visitLabel(r8)
            int r2 = r3.var(r2)
            r15 = 25
            r1.visitVarInsn(r15, r2)
            int r2 = r3.var(r5)
            r6 = 21
            r1.visitVarInsn(r6, r2)
            java.lang.String r2 = "get"
            java.lang.String r6 = "(I)Ljava/lang/Object;"
            java.lang.String r8 = "java/util/List"
            r15 = 185(0xb9, float:2.59E-43)
            r1.visitMethodInsn(r15, r8, r2, r6)
            java.lang.String r2 = "list_item"
            int r6 = r3.var(r2)
            r8 = 58
            r1.visitVarInsn(r8, r6)
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            com.alibaba.fastjson.asm.Label r8 = new com.alibaba.fastjson.asm.Label
            r8.<init>()
            int r15 = r3.var(r2)
            r26 = r10
            r10 = 25
            r1.visitVarInsn(r10, r15)
            r15 = 199(0xc7, float:2.79E-43)
            r1.visitJumpInsn(r15, r8)
            int r15 = r3.var(r4)
            r1.visitVarInsn(r10, r15)
            java.lang.String r10 = "writeNull"
            java.lang.String r15 = "()V"
            r27 = r4
            r4 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r4, r11, r10, r15)
            r4 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r4, r6)
            r1.visitLabel(r8)
            com.alibaba.fastjson.asm.Label r4 = new com.alibaba.fastjson.asm.Label
            r4.<init>()
            com.alibaba.fastjson.asm.Label r8 = new com.alibaba.fastjson.asm.Label
            r8.<init>()
            if (r14 == 0) goto L481
            int r10 = r14.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isPublic(r10)
            if (r10 == 0) goto L481
            int r10 = r3.var(r2)
            r15 = 25
            r1.visitVarInsn(r15, r10)
            java.lang.String r10 = "getClass"
            java.lang.String r15 = "()Ljava/lang/Class;"
            r28 = r11
            java.lang.String r11 = "java/lang/Object"
            r29 = r12
            r12 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r12, r11, r10, r15)
            java.lang.String r10 = com.alibaba.fastjson.util.ASMUtils.desc(r14)
            com.alibaba.fastjson.asm.Type r10 = com.alibaba.fastjson.asm.Type.getType(r10)
            r1.visitLdcInsn(r10)
            r10 = 166(0xa6, float:2.33E-43)
            r1.visitJumpInsn(r10, r8)
            r0._getListFieldItemSer(r3, r1, r13, r14)
            java.lang.String r10 = "list_item_desc"
            int r11 = r3.var(r10)
            r12 = 58
            r1.visitVarInsn(r12, r11)
            com.alibaba.fastjson.asm.Label r11 = new com.alibaba.fastjson.asm.Label
            r11.<init>()
            com.alibaba.fastjson.asm.Label r12 = new com.alibaba.fastjson.asm.Label
            r12.<init>()
            boolean r15 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r3)
            if (r15 == 0) goto L409
            int r15 = r3.var(r10)
            r16 = r14
            r14 = 25
            r1.visitVarInsn(r14, r15)
            java.lang.String r15 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            r14 = 193(0xc1, float:2.7E-43)
            r1.visitTypeInsn(r14, r15)
            r14 = 153(0x99, float:2.14E-43)
            r1.visitJumpInsn(r14, r11)
            int r14 = r3.var(r10)
            r0 = 25
            r1.visitVarInsn(r0, r14)
            r14 = 192(0xc0, float:2.69E-43)
            r1.visitTypeInsn(r14, r15)
            r14 = 1
            r1.visitVarInsn(r0, r14)
            int r14 = r3.var(r2)
            r1.visitVarInsn(r0, r14)
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r3)
            if (r0 == 0) goto L3b3
            r14 = 1
            r1.visitInsn(r14)
            r31 = r6
            r30 = r7
            goto L3cb
        L3b3:
            int r0 = r3.var(r5)
            r14 = 21
            r1.visitVarInsn(r14, r0)
            java.lang.String r0 = "valueOf"
            java.lang.String r14 = "(I)Ljava/lang/Integer;"
            r30 = r7
            java.lang.String r7 = "java/lang/Integer"
            r31 = r6
            r6 = 184(0xb8, float:2.58E-43)
            r1.visitMethodInsn(r6, r7, r0, r14)
        L3cb:
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r16)
            com.alibaba.fastjson.asm.Type r0 = com.alibaba.fastjson.asm.Type.getType(r0)
            r1.visitLdcInsn(r0)
            int r0 = r13.serialzeFeatures
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.visitLdcInsn(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r6 = r25
            r0.append(r6)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r0.append(r7)
            r7 = r23
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r14 = "writeAsArrayNonContext"
            r23 = r8
            r8 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r8, r15, r14, r0)
            r8 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r8, r12)
            r1.visitLabel(r11)
            goto L415
        L409:
            r31 = r6
            r30 = r7
            r16 = r14
            r7 = r23
            r6 = r25
            r23 = r8
        L415:
            int r0 = r3.var(r10)
            r15 = 25
            r1.visitVarInsn(r15, r0)
            r14 = 1
            r1.visitVarInsn(r15, r14)
            int r0 = r3.var(r2)
            r1.visitVarInsn(r15, r0)
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r3)
            if (r0 == 0) goto L433
            r1.visitInsn(r14)
            goto L447
        L433:
            int r0 = r3.var(r5)
            r14 = 21
            r1.visitVarInsn(r14, r0)
            java.lang.String r0 = "valueOf"
            java.lang.String r8 = "(I)Ljava/lang/Integer;"
            java.lang.String r10 = "java/lang/Integer"
            r11 = 184(0xb8, float:2.58E-43)
            r1.visitMethodInsn(r11, r10, r0, r8)
        L447:
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r16)
            com.alibaba.fastjson.asm.Type r0 = com.alibaba.fastjson.asm.Type.getType(r0)
            r1.visitLdcInsn(r0)
            int r0 = r13.serialzeFeatures
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.visitLdcInsn(r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            r15 = 185(0xb9, float:2.59E-43)
            r1.visitMethodInsn(r15, r0, r9, r6)
            r1.visitLabel(r12)
            r8 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r8, r4)
            r0 = r23
            goto L48c
        L481:
            r31 = r6
            r30 = r7
            r28 = r11
            r29 = r12
            r16 = r14
            r0 = r8
        L48c:
            r1.visitLabel(r0)
            r14 = 1
            r15 = 25
            r1.visitVarInsn(r15, r14)
            int r0 = r3.var(r2)
            r1.visitVarInsn(r15, r0)
            boolean r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r3)
            if (r0 == 0) goto L4a6
            r1.visitInsn(r14)
            goto L4ba
        L4a6:
            int r0 = r3.var(r5)
            r14 = 21
            r1.visitVarInsn(r14, r0)
            java.lang.String r0 = "valueOf"
            java.lang.String r2 = "(I)Ljava/lang/Integer;"
            java.lang.String r6 = "java/lang/Integer"
            r11 = 184(0xb8, float:2.58E-43)
            r1.visitMethodInsn(r11, r6, r0, r2)
        L4ba:
            if (r16 == 0) goto L4ea
            int r0 = r16.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L4ea
            r7 = r17
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r7)
            com.alibaba.fastjson.asm.Type r0 = com.alibaba.fastjson.asm.Type.getType(r0)
            r1.visitLdcInsn(r0)
            int r0 = r13.serialzeFeatures
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.visitLdcInsn(r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r2 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            r8 = r22
            r6 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r6, r0, r8, r2)
            goto L4f5
        L4ea:
            r8 = r22
            r6 = 182(0xb6, float:2.55E-43)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r2 = "(Ljava/lang/Object;Ljava/lang/Object;)V"
            r1.visitMethodInsn(r6, r0, r8, r2)
        L4f5:
            r1.visitLabel(r4)
            r0 = r31
            r1.visitLabel(r0)
            int r0 = r3.var(r5)
            r14 = 1
            r1.visitIincInsn(r0, r14)
            r0 = r30
            r8 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r8, r0)
            r0 = r29
            r1.visitLabel(r0)
            r0 = r27
            int r2 = r3.var(r0)
            r15 = 25
            r1.visitVarInsn(r15, r2)
            r2 = 93
            r13 = 16
            r1.visitVarInsn(r13, r2)
            r4 = r26
            r2 = r28
            r6 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r6, r2, r9, r4)
            r2 = r24
            r1.visitLabel(r2)
        L531:
            int r2 = r3.var(r0)
            r1.visitVarInsn(r15, r2)
            r12 = r21
            r1.visitVarInsn(r13, r12)
            java.lang.String r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            r1.visitMethodInsn(r6, r2, r9, r4)
            r10 = r32
            r8 = 182(0xb6, float:2.55E-43)
            goto L96
        L548:
            r0 = r4
            r19 = r5
            r7 = r8
            r4 = r10
            r20 = r11
            r8 = r15
            com.alibaba.fastjson.asm.Label r2 = new com.alibaba.fastjson.asm.Label
            r2.<init>()
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            r10 = r32
            r10._get(r1, r3, r13)
            r11 = 89
            r1.visitInsn(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = "field_"
            r11.append(r15)
            r17 = r14
            java.lang.Class<?> r14 = r13.fieldClass
            java.lang.String r14 = r14.getName()
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            int r11 = r3.var(r11)
            r14 = 58
            r1.visitVarInsn(r14, r11)
            r11 = 199(0xc7, float:2.79E-43)
            r1.visitJumpInsn(r11, r5)
            int r11 = r3.var(r0)
            r14 = 25
            r1.visitVarInsn(r14, r11)
            java.lang.String r11 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r14 = "writeNull"
            r26 = r4
            java.lang.String r4 = "()V"
            r21 = r12
            r12 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r12, r11, r14, r4)
            r4 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r4, r2)
            r1.visitLabel(r5)
            com.alibaba.fastjson.asm.Label r4 = new com.alibaba.fastjson.asm.Label
            r4.<init>()
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r15)
            java.lang.Class<?> r14 = r13.fieldClass
            java.lang.String r14 = r14.getName()
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            int r12 = r3.var(r12)
            r14 = 25
            r1.visitVarInsn(r14, r12)
            java.lang.String r12 = "getClass"
            java.lang.String r14 = "()Ljava/lang/Class;"
            r18 = r11
            java.lang.String r11 = "java/lang/Object"
            r27 = r0
            r0 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r0, r11, r12, r14)
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r17)
            com.alibaba.fastjson.asm.Type r0 = com.alibaba.fastjson.asm.Type.getType(r0)
            r1.visitLdcInsn(r0)
            r0 = 166(0xa6, float:2.33E-43)
            r1.visitJumpInsn(r0, r5)
            r10._getFieldSer(r3, r1, r13)
            java.lang.String r0 = "fied_ser"
            int r11 = r3.var(r0)
            r12 = 58
            r1.visitVarInsn(r12, r11)
            com.alibaba.fastjson.asm.Label r11 = new com.alibaba.fastjson.asm.Label
            r11.<init>()
            com.alibaba.fastjson.asm.Label r12 = new com.alibaba.fastjson.asm.Label
            r12.<init>()
            boolean r14 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r3)
            if (r14 == 0) goto L6a0
            int r14 = r17.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L6a0
            int r14 = r3.var(r0)
            r10 = 25
            r1.visitVarInsn(r10, r14)
            java.lang.String r14 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            r10 = 193(0xc1, float:2.7E-43)
            r1.visitTypeInsn(r10, r14)
            r10 = 153(0x99, float:2.14E-43)
            r1.visitJumpInsn(r10, r11)
            int r10 = r3.var(r0)
            r16 = r2
            r2 = 25
            r1.visitVarInsn(r2, r10)
            r10 = 192(0xc0, float:2.69E-43)
            r1.visitTypeInsn(r10, r14)
            r10 = 1
            r1.visitVarInsn(r2, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            java.lang.Class<?> r2 = r13.fieldClass
            java.lang.String r2 = r2.getName()
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            int r2 = r3.var(r2)
            r10 = 25
            r1.visitVarInsn(r10, r2)
            int r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r1.visitVarInsn(r10, r2)
            java.lang.String r2 = com.alibaba.fastjson.util.ASMUtils.desc(r17)
            com.alibaba.fastjson.asm.Type r2 = com.alibaba.fastjson.asm.Type.getType(r2)
            r1.visitLdcInsn(r2)
            int r2 = r13.serialzeFeatures
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.visitLdcInsn(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r2.append(r10)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r10 = "writeAsArrayNonContext"
            r22 = r8
            r8 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r8, r14, r10, r2)
            r8 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r8, r12)
            r1.visitLabel(r11)
            goto L6a4
        L6a0:
            r16 = r2
            r22 = r8
        L6a4:
            int r0 = r3.var(r0)
            r14 = 25
            r1.visitVarInsn(r14, r0)
            r10 = 1
            r1.visitVarInsn(r14, r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            java.lang.Class<?> r2 = r13.fieldClass
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r0 = r3.var(r0)
            r1.visitVarInsn(r14, r0)
            int r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r1.visitVarInsn(r14, r0)
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r17)
            com.alibaba.fastjson.asm.Type r0 = com.alibaba.fastjson.asm.Type.getType(r0)
            r1.visitLdcInsn(r0)
            int r0 = r13.serialzeFeatures
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.visitLdcInsn(r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r2.append(r6)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r7 = 185(0xb9, float:2.59E-43)
            r1.visitMethodInsn(r7, r0, r9, r2)
            r1.visitLabel(r12)
            r8 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r8, r4)
            r1.visitLabel(r5)
            java.lang.String r0 = r13.getFormat()
            r12 = 25
            r14 = 1
            r1.visitVarInsn(r12, r14)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.Class<?> r5 = r13.fieldClass
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            int r2 = r3.var(r2)
            r1.visitVarInsn(r12, r2)
            if (r0 == 0) goto L741
            r1.visitLdcInsn(r0)
            java.lang.String r0 = "writeWithFormat"
            java.lang.String r2 = "(Ljava/lang/Object;Ljava/lang/String;)V"
            r8 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r8, r6, r0, r2)
            goto L794
        L741:
            r8 = 182(0xb6, float:2.55E-43)
            int r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r1.visitVarInsn(r12, r0)
            java.lang.reflect.Type r0 = r13.fieldType
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L75e
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L75e
            java.lang.String r0 = "(Ljava/lang/Object;Ljava/lang/Object;)V"
            r2 = r22
            r1.visitMethodInsn(r8, r6, r2, r0)
            goto L794
        L75e:
            r2 = r22
            r0 = 0
            r15 = 25
            r1.visitVarInsn(r15, r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r13.name
            r5.append(r7)
            java.lang.String r7 = "_asm_fieldType"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "Ljava/lang/reflect/Type;"
            r8 = 180(0xb4, float:2.52E-43)
            r1.visitFieldInsn(r8, r0, r5, r7)
            int r0 = r13.serialzeFeatures
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.visitLdcInsn(r0)
            java.lang.String r0 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            r8 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r8, r6, r2, r0)
        L794:
            r1.visitLabel(r4)
            r0 = r16
            r1.visitLabel(r0)
            r0 = r27
            int r2 = r3.var(r0)
            r15 = 25
            r1.visitVarInsn(r15, r2)
            r12 = r21
            r13 = 16
            r1.visitVarInsn(r13, r12)
            r2 = r18
            r4 = r26
            r1.visitMethodInsn(r8, r2, r9, r4)
            r10 = r32
            r13 = 16
            goto L7da
        L7ba:
            int r2 = r3.var(r0)
            r1.visitVarInsn(r15, r2)
            r11 = 89
            r1.visitInsn(r11)
            r10 = r32
            r10._get(r1, r3, r13)
            java.lang.String r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r5 = "writeInt"
            r1.visitMethodInsn(r8, r2, r5, r4)
            r13 = 16
            r1.visitVarInsn(r13, r12)
            r1.visitMethodInsn(r8, r2, r9, r4)
        L7da:
            int r5 = r19 + 1
            r2 = r4
            r4 = r0
            r0 = r10
            r10 = r2
            r2 = r35
            r11 = r20
            r6 = 25
            r7 = 16
            goto L39
        L7ea:
            r10 = r0
            return
    }

    private void generateWriteMethod(java.lang.Class<?> r21, com.alibaba.fastjson.asm.MethodVisitor r22, com.alibaba.fastjson.util.FieldInfo[] r23, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r24) throws java.lang.Exception {
            r20 = this;
            r0 = r20
            r2 = r22
            r7 = r23
            r4 = r24
            com.alibaba.fastjson.asm.Label r8 = new com.alibaba.fastjson.asm.Label
            r8.<init>()
            int r9 = r7.length
            boolean r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r4)
            java.lang.String r5 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            java.lang.String r6 = "(I)Z"
            java.lang.String r10 = "isEnabled"
            java.lang.String r12 = "write"
            java.lang.String r11 = "(L"
            java.lang.String r13 = "out"
            r15 = 25
            if (r3 != 0) goto Lca
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            com.alibaba.fastjson.asm.Label r14 = new com.alibaba.fastjson.asm.Label
            r14.<init>()
            r17 = r8
            int r8 = r4.var(r13)
            r2.visitVarInsn(r15, r8)
            com.alibaba.fastjson.serializer.SerializerFeature r8 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat
            int r8 = r8.mask
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2.visitLdcInsn(r8)
            java.lang.String r8 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r8, r10, r6)
            r8 = 154(0x9a, float:2.16E-43)
            r2.visitJumpInsn(r8, r14)
            int r8 = r7.length
            r15 = 0
            r18 = 0
        L50:
            if (r15 >= r8) goto L5f
            r7 = r23[r15]
            java.lang.reflect.Method r7 = r7.method
            if (r7 == 0) goto L5a
            r18 = 1
        L5a:
            int r15 = r15 + 1
            r7 = r23
            goto L50
        L5f:
            if (r18 == 0) goto L82
            int r7 = r4.var(r13)
            r8 = 25
            r2.visitVarInsn(r8, r7)
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.IgnoreErrorGetter
            int r7 = r7.mask
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.visitLdcInsn(r7)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r7, r10, r6)
            r7 = 153(0x99, float:2.14E-43)
            r2.visitJumpInsn(r7, r3)
            goto L87
        L82:
            r7 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r7, r3)
        L87:
            r2.visitLabel(r14)
            r7 = 0
            r8 = 25
            r2.visitVarInsn(r8, r7)
            r7 = 1
            r2.visitVarInsn(r8, r7)
            r7 = 2
            r2.visitVarInsn(r8, r7)
            r7 = 3
            r2.visitVarInsn(r8, r7)
            r7 = 4
            r2.visitVarInsn(r8, r7)
            r7 = 5
            r8 = 21
            r2.visitVarInsn(r8, r7)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            java.lang.String r14 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r8.append(r14)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            r14 = 183(0xb7, float:2.56E-43)
            r2.visitMethodInsn(r14, r7, r12, r8)
            r7 = 177(0xb1, float:2.48E-43)
            r2.visitInsn(r7)
            r2.visitLabel(r3)
            goto Lcc
        Lca:
            r17 = r8
        Lcc:
            boolean r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r4)
            if (r3 != 0) goto L117
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            r7 = 0
            r8 = 25
            r2.visitVarInsn(r8, r7)
            r7 = 1
            r2.visitVarInsn(r8, r7)
            r7 = 2
            r2.visitVarInsn(r8, r7)
            r7 = 5
            r8 = 21
            r2.visitVarInsn(r8, r7)
            java.lang.String r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            java.lang.String r14 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r8.append(r14)
            java.lang.String r14 = ";Ljava/lang/Object;I)Z"
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            java.lang.String r14 = "writeReference"
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r7, r14, r8)
            r7 = 153(0x99, float:2.14E-43)
            r2.visitJumpInsn(r7, r3)
            r7 = 177(0xb1, float:2.48E-43)
            r2.visitInsn(r7)
            r2.visitLabel(r3)
        L117:
            boolean r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r4)
            if (r3 == 0) goto L129
            boolean r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r4)
            if (r3 == 0) goto L126
            java.lang.String r3 = "writeAsArrayNonContext"
            goto L12b
        L126:
            java.lang.String r3 = "writeAsArray"
            goto L12b
        L129:
            java.lang.String r3 = "writeAsArrayNormal"
        L12b:
            com.alibaba.fastjson.serializer.SerializeBeanInfo r7 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$400(r4)
            int r7 = r7.features
            com.alibaba.fastjson.serializer.SerializerFeature r8 = com.alibaba.fastjson.serializer.SerializerFeature.BeanToArray
            int r14 = r8.mask
            r7 = r7 & r14
            if (r7 != 0) goto L19b
            com.alibaba.fastjson.asm.Label r7 = new com.alibaba.fastjson.asm.Label
            r7.<init>()
            int r14 = r4.var(r13)
            r15 = 25
            r2.visitVarInsn(r15, r14)
            int r8 = r8.mask
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2.visitLdcInsn(r8)
            java.lang.String r8 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            r14 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r14, r8, r10, r6)
            r6 = 153(0x99, float:2.14E-43)
            r2.visitJumpInsn(r6, r7)
            r6 = 0
            r2.visitVarInsn(r15, r6)
            r6 = 1
            r2.visitVarInsn(r15, r6)
            r6 = 2
            r2.visitVarInsn(r15, r6)
            r6 = 3
            r2.visitVarInsn(r15, r6)
            r6 = 4
            r2.visitVarInsn(r15, r6)
            r6 = 5
            r8 = 21
            r2.visitVarInsn(r8, r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            java.lang.String r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r8.append(r10)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r6, r3, r5)
            r3 = 177(0xb1, float:2.48E-43)
            r2.visitInsn(r3)
            r2.visitLabel(r7)
            goto L1d9
        L19b:
            r7 = 0
            r8 = 25
            r2.visitVarInsn(r8, r7)
            r7 = 1
            r2.visitVarInsn(r8, r7)
            r7 = 2
            r2.visitVarInsn(r8, r7)
            r6 = 3
            r2.visitVarInsn(r8, r6)
            r6 = 4
            r2.visitVarInsn(r8, r6)
            r7 = 5
            r8 = 21
            r2.visitVarInsn(r8, r7)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$300(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            java.lang.String r8 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r6, r3, r5)
            r7 = 177(0xb1, float:2.48E-43)
            r2.visitInsn(r7)
        L1d9:
            boolean r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r4)
            java.lang.String r7 = "parent"
            java.lang.String r8 = "("
            if (r3 != 0) goto L24b
            r6 = 1
            r15 = 25
            r2.visitVarInsn(r15, r6)
            java.lang.String r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "()"
            r5.append(r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerialContext_desc
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "getContext"
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r3, r10, r5)
            r5 = 58
            int r10 = r4.var(r7)
            r2.visitVarInsn(r5, r10)
            r5 = 1
            r15 = 25
            r2.visitVarInsn(r15, r5)
            int r5 = r4.var(r7)
            r2.visitVarInsn(r15, r5)
            r5 = 2
            r2.visitVarInsn(r15, r5)
            r5 = 3
            r2.visitVarInsn(r15, r5)
            com.alibaba.fastjson.serializer.SerializeBeanInfo r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$400(r4)
            int r5 = r5.features
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.visitLdcInsn(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r6)
            java.lang.String r6 = "Ljava/lang/Object;Ljava/lang/Object;I)V"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "setContext"
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r3, r6, r5)
        L24b:
            boolean r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r4)
            if (r3 != 0) goto L309
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            r10 = 25
            r15 = 1
            r2.visitVarInsn(r10, r15)
            r15 = 4
            r2.visitVarInsn(r10, r15)
            r14 = 2
            r2.visitVarInsn(r10, r14)
            java.lang.String r14 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.String r10 = "isWriteClassName"
            java.lang.String r15 = "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z"
            r16 = r7
            r7 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r7, r14, r10, r15)
            r10 = 153(0x99, float:2.14E-43)
            r2.visitJumpInsn(r10, r5)
            r10 = 25
            r15 = 4
            r2.visitVarInsn(r10, r15)
            r15 = 2
            r2.visitVarInsn(r10, r15)
            java.lang.String r15 = "getClass"
            java.lang.String r10 = "()Ljava/lang/Class;"
            java.lang.String r1 = "java/lang/Object"
            r2.visitMethodInsn(r7, r1, r15, r10)
            r1 = 165(0xa5, float:2.31E-43)
            r2.visitJumpInsn(r1, r5)
            r2.visitLabel(r6)
            int r1 = r4.var(r13)
            r15 = 25
            r2.visitVarInsn(r15, r1)
            r1 = 123(0x7b, float:1.72E-43)
            r6 = 16
            r2.visitVarInsn(r6, r1)
            java.lang.String r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r6 = "(I)V"
            r2.visitMethodInsn(r7, r1, r12, r6)
            r7 = 0
            r2.visitVarInsn(r15, r7)
            r7 = 1
            r2.visitVarInsn(r15, r7)
            com.alibaba.fastjson.serializer.SerializeBeanInfo r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$400(r4)
            java.lang.String r1 = r1.typeKey
            if (r1 == 0) goto L2cd
            com.alibaba.fastjson.serializer.SerializeBeanInfo r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$400(r4)
            java.lang.String r1 = r1.typeKey
            r2.visitLdcInsn(r1)
        L2cb:
            r7 = 2
            goto L2d1
        L2cd:
            r2.visitInsn(r7)
            goto L2cb
        L2d1:
            r2.visitVarInsn(r15, r7)
            java.lang.String r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r11)
            r6.append(r14)
            java.lang.String r7 = ";Ljava/lang/String;Ljava/lang/Object;)V"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "writeClassName"
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r1, r7, r6)
            r1 = 44
            r6 = 16
            r2.visitVarInsn(r6, r1)
            r1 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r1, r3)
            r2.visitLabel(r5)
            r1 = 123(0x7b, float:1.72E-43)
            r2.visitVarInsn(r6, r1)
            r2.visitLabel(r3)
            goto L312
        L309:
            r16 = r7
            r1 = 123(0x7b, float:1.72E-43)
            r6 = 16
            r2.visitVarInsn(r6, r1)
        L312:
            java.lang.String r1 = "seperator"
            int r1 = r4.var(r1)
            r3 = 54
            r2.visitVarInsn(r3, r1)
            boolean r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r4)
            if (r1 != 0) goto L326
            r0._before(r2, r4)
        L326:
            boolean r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r4)
            if (r1 != 0) goto L3a8
            int r1 = r4.var(r13)
            r15 = 25
            r2.visitVarInsn(r15, r1)
            java.lang.String r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r5 = "isNotWriteDefaultValue"
            java.lang.String r6 = "()Z"
            r14 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r14, r1, r5, r6)
            java.lang.String r1 = "notWriteDefaultValue"
            int r1 = r4.var(r1)
            r2.visitVarInsn(r3, r1)
            r7 = 1
            r2.visitVarInsn(r15, r7)
            r7 = 0
            r2.visitVarInsn(r15, r7)
            java.lang.String r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeFilterable_desc
            r5.append(r6)
            java.lang.String r7 = ")Z"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "checkValue"
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r1, r7, r5)
            java.lang.String r5 = "checkValue"
            int r5 = r4.var(r5)
            r2.visitVarInsn(r3, r5)
            r7 = 1
            r15 = 25
            r2.visitVarInsn(r15, r7)
            r7 = 0
            r2.visitVarInsn(r15, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r6)
            java.lang.String r6 = ")Z"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "hasNameFilters"
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r1, r6, r5)
            java.lang.String r1 = "hasNameFilters"
            int r1 = r4.var(r1)
            r2.visitVarInsn(r3, r1)
            goto L3a9
        L3a8:
            r7 = 0
        L3a9:
            r14 = 0
        L3aa:
            if (r14 >= r9) goto L461
            r3 = r23[r14]
            java.lang.Class<?> r1 = r3.fieldClass
            java.lang.String r5 = r3.name
            r2.visitLdcInsn(r5)
            r5 = 58
            int r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.fieldName
            r2.visitVarInsn(r5, r6)
            java.lang.Class r5 = java.lang.Byte.TYPE
            if (r1 == r5) goto L3c8
            java.lang.Class r5 = java.lang.Short.TYPE
            if (r1 == r5) goto L3c8
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r1 != r5) goto L3cc
        L3c8:
            r5 = r21
            goto L44b
        L3cc:
            java.lang.Class r5 = java.lang.Long.TYPE
            if (r1 != r5) goto L3d7
            r5 = r21
            r0._long(r5, r2, r3, r4)
            goto L45d
        L3d7:
            r5 = r21
            java.lang.Class r6 = java.lang.Float.TYPE
            if (r1 != r6) goto L3e2
            r0._float(r5, r2, r3, r4)
            goto L45d
        L3e2:
            java.lang.Class r6 = java.lang.Double.TYPE
            if (r1 != r6) goto L3eb
            r0._double(r5, r2, r3, r4)
            goto L45d
        L3eb:
            java.lang.Class r6 = java.lang.Boolean.TYPE
            if (r1 != r6) goto L404
            java.lang.String r1 = "boolean"
            int r1 = r4.var(r1)
            r6 = 90
            r19 = r5
            r5 = r1
            r1 = r19
            r0._int(r1, r2, r3, r4, r5, r6)
            r0 = r20
            r2 = r22
            goto L45d
        L404:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L41b
            java.lang.String r0 = "char"
            int r5 = r4.var(r0)
            r6 = 67
            r0 = r20
            r1 = r21
            r2 = r22
            r0._int(r1, r2, r3, r4, r5, r6)
            r5 = r1
            goto L45d
        L41b:
            r0 = r20
            r5 = r21
            r2 = r22
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r1 != r6) goto L429
            r0._string(r5, r2, r3, r4)
            goto L45d
        L429:
            java.lang.Class<java.math.BigDecimal> r6 = java.math.BigDecimal.class
            if (r1 != r6) goto L431
            r0._decimal(r5, r2, r3, r4)
            goto L45d
        L431:
            java.lang.Class<java.util.List> r6 = java.util.List.class
            boolean r6 = r6.isAssignableFrom(r1)
            if (r6 == 0) goto L43d
            r0._list(r5, r2, r3, r4)
            goto L45d
        L43d:
            boolean r1 = r1.isEnum()
            if (r1 == 0) goto L447
            r0._enum(r5, r2, r3, r4)
            goto L45d
        L447:
            r0._object(r5, r2, r3, r4)
            goto L45d
        L44b:
            java.lang.String r1 = r1.getName()
            int r1 = r4.var(r1)
            r6 = 73
            r19 = r5
            r5 = r1
            r1 = r19
            r0._int(r1, r2, r3, r4, r5, r6)
        L45d:
            int r14 = r14 + 1
            goto L3aa
        L461:
            boolean r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r4)
            if (r1 != 0) goto L46a
            r0._after(r2, r4)
        L46a:
            com.alibaba.fastjson.asm.Label r1 = new com.alibaba.fastjson.asm.Label
            r1.<init>()
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            java.lang.String r5 = "seperator"
            int r5 = r4.var(r5)
            r6 = 21
            r2.visitVarInsn(r6, r5)
            r5 = 123(0x7b, float:1.72E-43)
            r6 = 16
            r2.visitIntInsn(r6, r5)
            r7 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r7, r1)
            int r7 = r4.var(r13)
            r15 = 25
            r2.visitVarInsn(r15, r7)
            r2.visitVarInsn(r6, r5)
            java.lang.String r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r7 = "(I)V"
            r14 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r14, r5, r12, r7)
            r2.visitLabel(r1)
            int r1 = r4.var(r13)
            r2.visitVarInsn(r15, r1)
            r1 = 125(0x7d, float:1.75E-43)
            r2.visitVarInsn(r6, r1)
            java.lang.String r1 = "(I)V"
            r2.visitMethodInsn(r14, r5, r12, r1)
            r2.visitLabel(r3)
            r1 = r17
            r2.visitLabel(r1)
            boolean r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$200(r4)
            if (r1 != 0) goto L4ee
            r7 = 1
            r2.visitVarInsn(r15, r7)
            r1 = r16
            int r1 = r4.var(r1)
            r2.visitVarInsn(r15, r1)
            java.lang.String r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerialContext_desc
            r3.append(r4)
            java.lang.String r4 = ")V"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "setContext"
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r1, r4, r3)
        L4ee:
            return
    }

    public com.alibaba.fastjson.serializer.JavaBeanSerializer createJavaBeanSerializer(com.alibaba.fastjson.serializer.SerializeBeanInfo r35) throws java.lang.Exception {
            r34 = this;
            r0 = r34
            r3 = r35
            java.lang.Class<?> r7 = r3.beanType
            boolean r1 = r7.isPrimitive()
            if (r1 != 0) goto L5dc
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r1 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r1)
            r8 = r1
            com.alibaba.fastjson.annotation.JSONType r8 = (com.alibaba.fastjson.annotation.JSONType) r8
            com.alibaba.fastjson.util.FieldInfo[] r9 = r3.fields
            int r1 = r9.length
            r2 = 0
        L19:
            if (r2 >= r1) goto L38
            r4 = r9[r2]
            java.lang.reflect.Field r5 = r4.field
            if (r5 != 0) goto L35
            java.lang.reflect.Method r4 = r4.method
            if (r4 == 0) goto L35
            java.lang.Class r4 = r4.getDeclaringClass()
            boolean r4 = r4.isInterface()
            if (r4 == 0) goto L35
            com.alibaba.fastjson.serializer.JavaBeanSerializer r1 = new com.alibaba.fastjson.serializer.JavaBeanSerializer
            r1.<init>(r7)
            return r1
        L35:
            int r2 = r2 + 1
            goto L19
        L38:
            com.alibaba.fastjson.util.FieldInfo[] r2 = r3.sortedFields
            com.alibaba.fastjson.util.FieldInfo[] r1 = r3.fields
            if (r2 != r1) goto L40
            r12 = 1
            goto L41
        L40:
            r12 = 0
        L41:
            int r1 = r2.length
            r4 = 256(0x100, float:3.59E-43)
            if (r1 <= r4) goto L4c
            com.alibaba.fastjson.serializer.JavaBeanSerializer r1 = new com.alibaba.fastjson.serializer.JavaBeanSerializer
            r1.<init>(r7)
            return r1
        L4c:
            int r1 = r2.length
            r4 = 0
        L4e:
            if (r4 >= r1) goto L69
            r5 = r2[r4]
            java.lang.reflect.Member r5 = r5.getMember()
            java.lang.String r5 = r5.getName()
            boolean r5 = com.alibaba.fastjson.util.ASMUtils.checkName(r5)
            if (r5 != 0) goto L66
            com.alibaba.fastjson.serializer.JavaBeanSerializer r1 = new com.alibaba.fastjson.serializer.JavaBeanSerializer
            r1.<init>(r7)
            return r1
        L66:
            int r4 = r4 + 1
            goto L4e
        L69:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "ASMSerializer_"
            r1.append(r4)
            java.util.concurrent.atomic.AtomicLong r4 = r0.seed
            long r4 = r4.incrementAndGet()
            r1.append(r4)
            java.lang.String r4 = "_"
            r1.append(r4)
            java.lang.String r4 = r7.getSimpleName()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Class<com.alibaba.fastjson.serializer.ASMSerializerFactory> r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.class
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 46
            r13 = 47
            java.lang.String r6 = r4.replace(r6, r13)
            r5.append(r6)
            java.lang.String r6 = "/"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r16 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "."
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.alibaba.fastjson.asm.ClassWriter r18 = new com.alibaba.fastjson.asm.ClassWriter
            r18.<init>()
            java.lang.String r17 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.String r4 = com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r14 = 49
            r15 = 33
            r13 = r18
            r18 = r4
            r13.visit(r14, r15, r16, r17, r18)
            r4 = r16
            int r5 = r2.length
            r6 = 0
        Le2:
            java.lang.String r14 = "Ljava/lang/reflect/Type;"
            java.lang.String r15 = "_asm_fieldType"
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r6 >= r5) goto L162
            r11 = r2[r6]
            r24 = r1
            java.lang.Class<?> r1 = r11.fieldClass
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto L15b
            java.lang.Class<?> r1 = r11.fieldClass
            if (r1 != r10) goto Lfb
            goto L15b
        Lfb:
            com.alibaba.fastjson.asm.FieldWriter r1 = new com.alibaba.fastjson.asm.FieldWriter
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = r11.name
            r10.append(r3)
            r10.append(r15)
            java.lang.String r3 = r10.toString()
            r10 = 1
            r1.<init>(r13, r10, r3, r14)
            r1.visitEnd()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<?> r3 = r11.fieldClass
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L13d
            com.alibaba.fastjson.asm.FieldWriter r1 = new com.alibaba.fastjson.asm.FieldWriter
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = r11.name
            r3.append(r10)
            java.lang.String r10 = "_asm_list_item_ser_"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer_desc
            r14 = 1
            r1.<init>(r13, r14, r3, r10)
            r1.visitEnd()
        L13d:
            com.alibaba.fastjson.asm.FieldWriter r1 = new com.alibaba.fastjson.asm.FieldWriter
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = r11.name
            r3.append(r10)
            java.lang.String r10 = "_asm_ser_"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r10 = com.alibaba.fastjson.serializer.ASMSerializerFactory.ObjectSerializer_desc
            r14 = 1
            r1.<init>(r13, r14, r3, r10)
            r1.visitEnd()
        L15b:
            int r6 = r6 + 1
            r3 = r35
            r1 = r24
            goto Le2
        L162:
            r24 = r1
            com.alibaba.fastjson.asm.MethodWriter r17 = new com.alibaba.fastjson.asm.MethodWriter
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "("
            r1.append(r3)
            java.lang.Class<com.alibaba.fastjson.serializer.SerializeBeanInfo> r11 = com.alibaba.fastjson.serializer.SerializeBeanInfo.class
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r11)
            r1.append(r5)
            java.lang.String r5 = ")V"
            r1.append(r5)
            java.lang.String r21 = r1.toString()
            r22 = 0
            r23 = 0
            r19 = 1
            java.lang.String r20 = "<init>"
            r18 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r1 = r17
            r13 = 25
            r6 = 0
            r1.visitVarInsn(r13, r6)
            r6 = 1
            r1.visitVarInsn(r13, r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.desc(r11)
            r13.append(r3)
            r13.append(r5)
            java.lang.String r3 = r13.toString()
            r5 = 183(0xb7, float:2.56E-43)
            java.lang.String r13 = "<init>"
            r1.visitMethodInsn(r5, r6, r13, r3)
            r3 = 0
        L1bb:
            int r6 = r2.length
            if (r3 >= r6) goto L243
            r6 = r2[r3]
            java.lang.Class<?> r13 = r6.fieldClass
            boolean r13 = r13.isPrimitive()
            if (r13 != 0) goto L1cc
            java.lang.Class<?> r13 = r6.fieldClass
            if (r13 != r10) goto L1d3
        L1cc:
            r19 = r2
            r20 = r3
            r13 = 183(0xb7, float:2.56E-43)
            goto L23b
        L1d3:
            r5 = 25
            r13 = 0
            r1.visitVarInsn(r5, r13)
            java.lang.reflect.Method r5 = r6.method
            if (r5 == 0) goto L209
            java.lang.Class<?> r5 = r6.declaringClass
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.getType(r5)
            r1.visitLdcInsn(r5)
            java.lang.reflect.Method r5 = r6.method
            java.lang.String r5 = r5.getName()
            r1.visitLdcInsn(r5)
            java.lang.Class<com.alibaba.fastjson.util.ASMUtils> r5 = com.alibaba.fastjson.util.ASMUtils.class
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r5)
            java.lang.String r13 = "getMethodType"
            r19 = r2
            java.lang.String r2 = "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;"
            r20 = r3
            r3 = 184(0xb8, float:2.58E-43)
            r1.visitMethodInsn(r3, r5, r13, r2)
            r13 = 183(0xb7, float:2.56E-43)
            goto L225
        L209:
            r19 = r2
            r20 = r3
            r5 = 25
            r13 = 0
            r1.visitVarInsn(r5, r13)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.visitLdcInsn(r2)
            java.lang.String r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.String r3 = "getFieldType"
            java.lang.String r5 = "(I)Ljava/lang/reflect/Type;"
            r13 = 183(0xb7, float:2.56E-43)
            r1.visitMethodInsn(r13, r2, r3, r5)
        L225:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.name
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r3 = 181(0xb5, float:2.54E-43)
            r1.visitFieldInsn(r3, r4, r2, r14)
        L23b:
            int r3 = r20 + 1
            r2 = r19
            r5 = 183(0xb7, float:2.56E-43)
            goto L1bb
        L243:
            r19 = r2
            r10 = 177(0xb1, float:2.48E-43)
            r1.visitInsn(r10)
            r13 = 4
            r1.visitMaxs(r13, r13)
            r1.visitEnd()
            if (r8 == 0) goto L266
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = r8.serialzeFeatures()
            int r2 = r1.length
            r3 = 0
        L259:
            if (r3 >= r2) goto L266
            r5 = r1[r3]
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect
            if (r5 != r6) goto L263
            r14 = 1
            goto L267
        L263:
            int r3 = r3 + 1
            goto L259
        L266:
            r14 = 0
        L267:
            r15 = 0
        L268:
            java.lang.String r2 = "entity"
            r3 = 192(0xc0, float:2.69E-43)
            r5 = 180(0xb4, float:2.52E-43)
            java.lang.String r25 = "java/io/IOException"
            r6 = 3
            java.lang.String r13 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"
            java.lang.String r10 = "(L"
            r26 = r8
            java.lang.String r8 = "out"
            r27 = r11
            if (r15 >= r6) goto L4ae
            java.lang.String r11 = "writeDirectNonContext"
            r29 = r12
            java.lang.String r12 = "writeNormal"
            if (r15 != 0) goto L28e
            java.lang.String r17 = "write"
            r6 = r14
            r1 = 180(0xb4, float:2.52E-43)
            r5 = 1
        L28b:
            r21 = 3
            goto L29f
        L28e:
            r1 = 1
            if (r15 != r1) goto L298
            r17 = r12
            r6 = r14
            r1 = 180(0xb4, float:2.52E-43)
            r5 = 0
            goto L28b
        L298:
            r17 = r11
            r1 = 180(0xb4, float:2.52E-43)
            r5 = 1
            r6 = 1
            goto L28b
        L29f:
            com.alibaba.fastjson.serializer.ASMSerializerFactory$Context r22 = new com.alibaba.fastjson.serializer.ASMSerializerFactory$Context
            r3 = r35
            r30 = r14
            r1 = r22
            r31 = r24
            r14 = 180(0xb4, float:2.52E-43)
            r24 = r15
            r15 = r2
            r2 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r20 = r17
            com.alibaba.fastjson.asm.MethodWriter r17 = new com.alibaba.fastjson.asm.MethodWriter
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            java.lang.String r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r3.append(r5)
            r3.append(r13)
            java.lang.String r21 = r3.toString()
            r22 = 0
            java.lang.String[] r23 = new java.lang.String[]{r25}
            r19 = 1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r3 = r17
            com.alibaba.fastjson.asm.Label r14 = new com.alibaba.fastjson.asm.Label
            r14.<init>()
            r17 = r6
            r32 = r9
            r6 = 2
            r9 = 25
            r3.visitVarInsn(r9, r6)
            r6 = 199(0xc7, float:2.79E-43)
            r3.visitJumpInsn(r6, r14)
            r6 = 1
            r3.visitVarInsn(r9, r6)
            java.lang.String r6 = "writeNull"
            java.lang.String r9 = "()V"
            r0 = 182(0xb6, float:2.55E-43)
            r3.visitMethodInsn(r0, r5, r6, r9)
            r6 = 177(0xb1, float:2.48E-43)
            r3.visitInsn(r6)
            r3.visitLabel(r14)
            r9 = 25
            r14 = 1
            r3.visitVarInsn(r9, r14)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter_desc
            r14 = 180(0xb4, float:2.52E-43)
            r3.visitFieldInsn(r14, r5, r8, r6)
            int r6 = r1.var(r8)
            r9 = 58
            r3.visitVarInsn(r9, r6)
            if (r29 != 0) goto L328
            boolean r19 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r1)
            if (r19 != 0) goto L328
            if (r26 == 0) goto L32c
            boolean r19 = r26.alphabetic()
            if (r19 == 0) goto L328
            goto L32c
        L328:
            r22 = r2
            r14 = 3
            goto L385
        L32c:
            com.alibaba.fastjson.asm.Label r9 = new com.alibaba.fastjson.asm.Label
            r9.<init>()
            int r14 = r1.var(r8)
            r6 = 25
            r3.visitVarInsn(r6, r14)
            java.lang.String r14 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r6 = "isSortField"
            r22 = r2
            java.lang.String r2 = "()Z"
            r3.visitMethodInsn(r0, r14, r6, r2)
            r2 = 154(0x9a, float:2.16E-43)
            r3.visitJumpInsn(r2, r9)
            r2 = 25
            r6 = 0
            r3.visitVarInsn(r2, r6)
            r14 = 1
            r3.visitVarInsn(r2, r14)
            r6 = 2
            r3.visitVarInsn(r2, r6)
            r14 = 3
            r3.visitVarInsn(r2, r14)
            r6 = 4
            r3.visitVarInsn(r2, r6)
            r2 = 5
            r6 = 21
            r3.visitVarInsn(r6, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r5)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "writeUnsorted"
            r3.visitMethodInsn(r0, r4, r6, r2)
            r6 = 177(0xb1, float:2.48E-43)
            r3.visitInsn(r6)
            r3.visitLabel(r9)
        L385:
            boolean r2 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$000(r1)
            if (r2 == 0) goto L461
            if (r17 != 0) goto L461
            com.alibaba.fastjson.asm.Label r2 = new com.alibaba.fastjson.asm.Label
            r2.<init>()
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            r9 = 0
            r14 = 25
            r3.visitVarInsn(r14, r9)
            r9 = 1
            r3.visitVarInsn(r14, r9)
            java.lang.String r9 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JavaBeanSerializer
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r5)
            java.lang.String r0 = ";)Z"
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            java.lang.String r14 = "writeDirect"
            r33 = r7
            r7 = 182(0xb6, float:2.55E-43)
            r3.visitMethodInsn(r7, r9, r14, r0)
            r0 = 154(0x9a, float:2.16E-43)
            r3.visitJumpInsn(r0, r6)
            r9 = 0
            r14 = 25
            r3.visitVarInsn(r14, r9)
            r9 = 1
            r3.visitVarInsn(r14, r9)
            r0 = 2
            r3.visitVarInsn(r14, r0)
            r0 = 3
            r3.visitVarInsn(r14, r0)
            r0 = 4
            r3.visitVarInsn(r14, r0)
            r0 = 5
            r7 = 21
            r3.visitVarInsn(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r5)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r7 = 182(0xb6, float:2.55E-43)
            r3.visitMethodInsn(r7, r4, r12, r0)
            r0 = 177(0xb1, float:2.48E-43)
            r3.visitInsn(r0)
            r3.visitLabel(r6)
            int r0 = r1.var(r8)
            r14 = 25
            r3.visitVarInsn(r14, r0)
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect
            int r0 = r0.mask
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.visitLdcInsn(r0)
            java.lang.String r0 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter
            java.lang.String r6 = "isEnabled"
            java.lang.String r7 = "(I)Z"
            r8 = 182(0xb6, float:2.55E-43)
            r3.visitMethodInsn(r8, r0, r6, r7)
            r0 = 153(0x99, float:2.14E-43)
            r3.visitJumpInsn(r0, r2)
            r6 = 0
            r3.visitVarInsn(r14, r6)
            r6 = 1
            r3.visitVarInsn(r14, r6)
            r6 = 2
            r3.visitVarInsn(r14, r6)
            r0 = 3
            r3.visitVarInsn(r14, r0)
            r0 = 4
            r3.visitVarInsn(r14, r0)
            r6 = 5
            r7 = 21
            r3.visitVarInsn(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            r6.append(r5)
            r6.append(r13)
            java.lang.String r5 = r6.toString()
            r7 = 182(0xb6, float:2.55E-43)
            r3.visitMethodInsn(r7, r4, r11, r5)
            r6 = 177(0xb1, float:2.48E-43)
            r3.visitInsn(r6)
            r3.visitLabel(r2)
        L45d:
            r2 = 2
            r14 = 25
            goto L467
        L461:
            r33 = r7
            r0 = 4
            r6 = 177(0xb1, float:2.48E-43)
            goto L45d
        L467:
            r3.visitVarInsn(r14, r2)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r33)
            r7 = 192(0xc0, float:2.69E-43)
            r3.visitTypeInsn(r7, r5)
            int r5 = r1.var(r15)
            r9 = 58
            r3.visitVarInsn(r9, r5)
            r7 = r34
            r2 = r22
            r9 = r33
            r28 = 2
            r7.generateWriteMethod(r9, r3, r2, r1)
            r3.visitInsn(r6)
            int r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$100(r1)
            int r1 = r1 + 2
            r5 = 7
            r3.visitMaxs(r5, r1)
            r3.visitEnd()
            int r15 = r24 + 1
            r19 = r2
            r0 = r7
            r7 = r9
            r8 = r26
            r11 = r27
            r12 = r29
            r14 = r30
            r24 = r31
            r9 = r32
            r10 = 177(0xb1, float:2.48E-43)
            r13 = 4
            goto L268
        L4ae:
            r15 = r2
            r32 = r9
            r29 = r12
            r30 = r14
            r2 = r19
            r31 = r24
            r9 = r7
            r7 = r0
            if (r29 != 0) goto L52c
            com.alibaba.fastjson.serializer.ASMSerializerFactory$Context r1 = new com.alibaba.fastjson.serializer.ASMSerializerFactory$Context
            r5 = 0
            r3 = r35
            r6 = r30
            r1.<init>(r2, r3, r4, r5, r6)
            com.alibaba.fastjson.asm.MethodWriter r17 = new com.alibaba.fastjson.asm.MethodWriter
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r3 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r0.append(r3)
            r0.append(r13)
            java.lang.String r21 = r0.toString()
            r22 = 0
            java.lang.String[] r23 = new java.lang.String[]{r25}
            r19 = 1
            java.lang.String r20 = "writeUnsorted"
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r0 = r17
            r5 = 25
            r14 = 1
            r0.visitVarInsn(r5, r14)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter_desc
            r14 = 180(0xb4, float:2.52E-43)
            r0.visitFieldInsn(r14, r3, r8, r6)
            int r3 = r1.var(r8)
            r6 = 58
            r0.visitVarInsn(r6, r3)
            r3 = 2
            r0.visitVarInsn(r5, r3)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r9)
            r11 = 192(0xc0, float:2.69E-43)
            r0.visitTypeInsn(r11, r5)
            int r5 = r1.var(r15)
            r0.visitVarInsn(r6, r5)
            r5 = r32
            r7.generateWriteMethod(r9, r0, r5, r1)
            r6 = 177(0xb1, float:2.48E-43)
            r0.visitInsn(r6)
            int r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$100(r1)
            int r1 = r1 + r3
            r5 = 7
            r0.visitMaxs(r5, r1)
            r0.visitEnd()
        L52c:
            r0 = 0
            r14 = 3
        L52e:
            if (r0 >= r14) goto L5ba
            if (r0 != 0) goto L53a
            java.lang.String r1 = "writeAsArray"
            r20 = r1
            r6 = r30
            r5 = 1
            goto L54b
        L53a:
            r6 = 1
            if (r0 != r6) goto L545
            java.lang.String r1 = "writeAsArrayNormal"
            r20 = r1
            r6 = r30
            r5 = 0
            goto L54b
        L545:
            java.lang.String r1 = "writeAsArrayNonContext"
            r20 = r1
            r5 = 1
            r6 = 1
        L54b:
            com.alibaba.fastjson.serializer.ASMSerializerFactory$Context r1 = new com.alibaba.fastjson.serializer.ASMSerializerFactory$Context
            r3 = r35
            r1.<init>(r2, r3, r4, r5, r6)
            com.alibaba.fastjson.asm.MethodWriter r17 = new com.alibaba.fastjson.asm.MethodWriter
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            java.lang.String r5 = com.alibaba.fastjson.serializer.ASMSerializerFactory.JSONSerializer
            r3.append(r5)
            r3.append(r13)
            java.lang.String r21 = r3.toString()
            r22 = 0
            java.lang.String[] r23 = new java.lang.String[]{r25}
            r19 = 1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r3 = r17
            r6 = 1
            r11 = 25
            r3.visitVarInsn(r11, r6)
            java.lang.String r6 = com.alibaba.fastjson.serializer.ASMSerializerFactory.SerializeWriter_desc
            r12 = 180(0xb4, float:2.52E-43)
            r3.visitFieldInsn(r12, r5, r8, r6)
            int r5 = r1.var(r8)
            r6 = 58
            r3.visitVarInsn(r6, r5)
            r5 = 2
            r3.visitVarInsn(r11, r5)
            r28 = 2
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r9)
            r11 = 192(0xc0, float:2.69E-43)
            r3.visitTypeInsn(r11, r5)
            int r5 = r1.var(r15)
            r3.visitVarInsn(r6, r5)
            r7.generateWriteAsArray(r9, r3, r2, r1)
            r5 = 177(0xb1, float:2.48E-43)
            r3.visitInsn(r5)
            int r1 = com.alibaba.fastjson.serializer.ASMSerializerFactory.Context.access$100(r1)
            int r1 = r1 + 2
            r5 = 7
            r3.visitMaxs(r5, r1)
            r3.visitEnd()
            int r0 = r0 + 1
            goto L52e
        L5ba:
            byte[] r0 = r18.toByteArray()
            com.alibaba.fastjson.util.ASMClassLoader r1 = r7.classLoader
            int r2 = r0.length
            r3 = r31
            r6 = 0
            java.lang.Class r0 = r1.defineClassPublic(r3, r0, r6, r2)
            r14 = 1
            java.lang.Class[] r1 = new java.lang.Class[r14]
            r1[r6] = r27
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r6] = r35
            java.lang.Object r0 = r0.newInstance(r1)
            com.alibaba.fastjson.serializer.JavaBeanSerializer r0 = (com.alibaba.fastjson.serializer.JavaBeanSerializer) r0
            return r0
        L5dc:
            r9 = r7
            r7 = r0
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupportd class "
            r1.append(r2)
            java.lang.String r2 = r9.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
