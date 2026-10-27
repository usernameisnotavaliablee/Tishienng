package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ASMDeserializerFactory implements com.alibaba.fastjson.asm.Opcodes {
    static final java.lang.String DefaultJSONParser = null;
    static final java.lang.String JSONLexerBase = null;
    public final com.alibaba.fastjson.util.ASMClassLoader classLoader;
    protected final java.util.concurrent.atomic.AtomicLong seed;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Context {
        static final int fieldName = 3;
        static final int parser = 1;
        static final int type = 2;
        private final com.alibaba.fastjson.util.JavaBeanInfo beanInfo;
        private final java.lang.String className;
        private final java.lang.Class<?> clazz;
        private com.alibaba.fastjson.util.FieldInfo[] fieldInfoList;
        private int variantIndex;
        private final java.util.Map<java.lang.String, java.lang.Integer> variants;

        public Context(java.lang.String r1, com.alibaba.fastjson.parser.ParserConfig r2, com.alibaba.fastjson.util.JavaBeanInfo r3, int r4) {
                r0 = this;
                r0.<init>()
                r2 = -1
                r0.variantIndex = r2
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                r0.variants = r2
                r0.className = r1
                java.lang.Class<?> r1 = r3.clazz
                r0.clazz = r1
                r0.variantIndex = r4
                r0.beanInfo = r3
                com.alibaba.fastjson.util.FieldInfo[] r1 = r3.fields
                r0.fieldInfoList = r1
                return
        }

        static /* synthetic */ com.alibaba.fastjson.util.JavaBeanInfo access$000(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r0) {
                com.alibaba.fastjson.util.JavaBeanInfo r0 = r0.beanInfo
                return r0
        }

        static /* synthetic */ int access$100(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r0) {
                int r0 = r0.variantIndex
                return r0
        }

        static /* synthetic */ com.alibaba.fastjson.util.FieldInfo[] access$200(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r0) {
                com.alibaba.fastjson.util.FieldInfo[] r0 = r0.fieldInfoList
                return r0
        }

        static /* synthetic */ com.alibaba.fastjson.util.FieldInfo[] access$202(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r0, com.alibaba.fastjson.util.FieldInfo[] r1) {
                r0.fieldInfoList = r1
                return r1
        }

        static /* synthetic */ java.lang.String access$300(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r0) {
                java.lang.String r0 = r0.className
                return r0
        }

        static /* synthetic */ java.lang.Class access$400(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r0) {
                java.lang.Class<?> r0 = r0.clazz
                return r0
        }

        public java.lang.Class<?> getInstClass() {
                r1 = this;
                com.alibaba.fastjson.util.JavaBeanInfo r0 = r1.beanInfo
                java.lang.Class<?> r0 = r0.builderClass
                if (r0 != 0) goto L8
                java.lang.Class<?> r0 = r1.clazz
            L8:
                return r0
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
            java.lang.Class<com.alibaba.fastjson.parser.DefaultJSONParser> r0 = com.alibaba.fastjson.parser.DefaultJSONParser.class
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser = r0
            java.lang.Class<com.alibaba.fastjson.parser.JSONLexerBase> r0 = com.alibaba.fastjson.parser.JSONLexerBase.class
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase = r0
            return
    }

    public ASMDeserializerFactory(java.lang.ClassLoader r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.seed = r0
            boolean r0 = r2 instanceof com.alibaba.fastjson.util.ASMClassLoader
            if (r0 == 0) goto L11
            com.alibaba.fastjson.util.ASMClassLoader r2 = (com.alibaba.fastjson.util.ASMClassLoader) r2
            goto L17
        L11:
            com.alibaba.fastjson.util.ASMClassLoader r0 = new com.alibaba.fastjson.util.ASMClassLoader
            r0.<init>(r2)
            r2 = r0
        L17:
            r1.classLoader = r2
            return
    }

    private void _batchSet(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r2, com.alibaba.fastjson.asm.MethodVisitor r3) {
            r1 = this;
            r0 = 1
            r1._batchSet(r2, r3, r0)
            return
    }

    private void _batchSet(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r5, com.alibaba.fastjson.asm.MethodVisitor r6, boolean r7) {
            r4 = this;
            com.alibaba.fastjson.util.FieldInfo[] r0 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r5)
            int r0 = r0.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L23
            com.alibaba.fastjson.asm.Label r2 = new com.alibaba.fastjson.asm.Label
            r2.<init>()
            if (r7 == 0) goto L12
            r4._isFlag(r6, r5, r1, r2)
        L12:
            com.alibaba.fastjson.util.FieldInfo[] r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r5)
            r3 = r3[r1]
            r4._loadAndSet(r5, r6, r3)
            if (r7 == 0) goto L20
            r6.visitLabel(r2)
        L20:
            int r1 = r1 + 1
            goto L6
        L23:
            return
    }

    private void _createInstance(com.alibaba.fastjson.asm.ClassWriter r9, com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r10) {
            r8 = this;
            com.alibaba.fastjson.util.JavaBeanInfo r0 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$000(r10)
            java.lang.reflect.Constructor<?> r0 = r0.defaultConstructor
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 != 0) goto L11
            return
        L11:
            com.alibaba.fastjson.asm.MethodWriter r1 = new com.alibaba.fastjson.asm.MethodWriter
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "(L"
            r0.append(r2)
            java.lang.String r2 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            r0.append(r2)
            java.lang.String r2 = ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            r6 = 0
            r7 = 0
            r3 = 1
            java.lang.String r4 = "createInstance"
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Class r9 = r10.getInstClass()
            java.lang.String r9 = com.alibaba.fastjson.util.ASMUtils.type(r9)
            r0 = 187(0xbb, float:2.62E-43)
            r1.visitTypeInsn(r0, r9)
            r9 = 89
            r1.visitInsn(r9)
            java.lang.Class r9 = r10.getInstClass()
            java.lang.String r9 = com.alibaba.fastjson.util.ASMUtils.type(r9)
            java.lang.String r10 = "<init>"
            java.lang.String r0 = "()V"
            r2 = 183(0xb7, float:2.56E-43)
            r1.visitMethodInsn(r2, r9, r10, r0)
            r9 = 176(0xb0, float:2.47E-43)
            r1.visitInsn(r9)
            r9 = 3
            r1.visitMaxs(r9, r9)
            r1.visitEnd()
            return
    }

    private void _createInstance(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r9, com.alibaba.fastjson.asm.MethodVisitor r10) {
            r8 = this;
            com.alibaba.fastjson.util.JavaBeanInfo r0 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$000(r9)
            java.lang.reflect.Constructor<?> r0 = r0.defaultConstructor
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            java.lang.String r2 = "instance"
            r3 = 58
            r4 = 183(0xb7, float:2.56E-43)
            if (r1 == 0) goto L3f
            java.lang.Class r1 = r9.getInstClass()
            java.lang.String r1 = com.alibaba.fastjson.util.ASMUtils.type(r1)
            r5 = 187(0xbb, float:2.62E-43)
            r10.visitTypeInsn(r5, r1)
            r1 = 89
            r10.visitInsn(r1)
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            java.lang.String r1 = "<init>"
            java.lang.String r5 = "()V"
            r10.visitMethodInsn(r4, r0, r1, r5)
            int r9 = r9.var(r2)
            r10.visitVarInsn(r3, r9)
            return
        L3f:
            r0 = 25
            r1 = 0
            r10.visitVarInsn(r0, r1)
            r5 = 1
            r10.visitVarInsn(r0, r5)
            r10.visitVarInsn(r0, r1)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r0 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            java.lang.String r1 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            java.lang.String r5 = "clazz"
            java.lang.String r6 = "Ljava/lang/Class;"
            r7 = 180(0xb4, float:2.52E-43)
            r10.visitFieldInsn(r7, r1, r5, r6)
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "(L"
            r1.append(r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            r1.append(r5)
            java.lang.String r5 = ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "createInstance"
            r10.visitMethodInsn(r4, r0, r5, r1)
            java.lang.Class r0 = r9.getInstClass()
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            r1 = 192(0xc0, float:2.69E-43)
            r10.visitTypeInsn(r1, r0)
            int r9 = r9.var(r2)
            r10.visitVarInsn(r3, r9)
            return
    }

    private void _deserObject(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r18, com.alibaba.fastjson.asm.MethodVisitor r19, com.alibaba.fastjson.util.FieldInfo r20, java.lang.Class<?> r21, int r22) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r17._getFieldDeser(r18, r19, r20)
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            com.alibaba.fastjson.asm.Label r4 = new com.alibaba.fastjson.asm.Label
            r4.<init>()
            int r5 = r2.parserFeatures
            com.alibaba.fastjson.parser.Feature r6 = com.alibaba.fastjson.parser.Feature.SupportArrayToBean
            int r6 = r6.mask
            r5 = r5 & r6
            java.lang.String r6 = "_asm"
            java.lang.String r8 = "(L"
            java.lang.String r9 = "deserialze"
            java.lang.String r10 = "(I)Ljava/lang/reflect/Type;"
            java.lang.String r11 = "getFieldType"
            r12 = 0
            r13 = 1
            r15 = 192(0xc0, float:2.69E-43)
            r7 = 25
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r16 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            if (r5 == 0) goto Lc8
            r5 = 89
            r1.visitInsn(r5)
            r5 = 193(0xc1, float:2.7E-43)
            java.lang.String r14 = com.alibaba.fastjson.util.ASMUtils.type(r16)
            r1.visitTypeInsn(r5, r14)
            r5 = 153(0x99, float:2.14E-43)
            r1.visitJumpInsn(r5, r3)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r16)
            r1.visitTypeInsn(r15, r5)
            r1.visitVarInsn(r7, r13)
            java.lang.reflect.Type r5 = r2.fieldType
            boolean r5 = r5 instanceof java.lang.Class
            if (r5 == 0) goto L5f
            java.lang.Class<?> r5 = r2.fieldClass
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.getType(r5)
            r1.visitLdcInsn(r5)
            goto L72
        L5f:
            r1.visitVarInsn(r7, r12)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r1.visitLdcInsn(r5)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r16)
            r14 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r14, r5, r11, r10)
        L72:
            java.lang.String r5 = r2.name
            r1.visitLdcInsn(r5)
            int r5 = r2.parserFeatures
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.visitLdcInsn(r5)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r16)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r8)
            java.lang.String r12 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            r14.append(r12)
            java.lang.String r12 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r14 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r14, r5, r9, r12)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r21)
            r1.visitTypeInsn(r15, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = r2.name
            r5.append(r12)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = r0.var(r5)
            r12 = 58
            r1.visitVarInsn(r12, r5)
            r5 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r5, r4)
            r1.visitLabel(r3)
        Lc8:
            r1.visitVarInsn(r7, r13)
            java.lang.reflect.Type r3 = r2.fieldType
            boolean r3 = r3 instanceof java.lang.Class
            if (r3 == 0) goto Ldf
            java.lang.Class<?> r3 = r2.fieldClass
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.desc(r3)
            com.alibaba.fastjson.asm.Type r3 = com.alibaba.fastjson.asm.Type.getType(r3)
            r1.visitLdcInsn(r3)
            goto Lf3
        Ldf:
            r3 = 0
            r1.visitVarInsn(r7, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r1.visitLdcInsn(r3)
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r16)
            r14 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r14, r3, r11, r10)
        Lf3:
            java.lang.String r3 = r2.name
            r1.visitLdcInsn(r3)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.ObjectDeserializer.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r7 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            r5.append(r7)
            java.lang.String r7 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r7 = 185(0xb9, float:2.59E-43)
            r1.visitMethodInsn(r7, r3, r9, r5)
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r21)
            r1.visitTypeInsn(r15, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.name
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            int r0 = r0.var(r2)
            r12 = 58
            r1.visitVarInsn(r12, r0)
            r1.visitLabel(r4)
            return
    }

    private void _deserialize_endCheck(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r5, com.alibaba.fastjson.asm.MethodVisitor r6, com.alibaba.fastjson.asm.Label r7) {
            r4 = this;
            java.lang.String r0 = "matchedCount"
            int r0 = r5.var(r0)
            r1 = 21
            r6.visitIntInsn(r1, r0)
            r0 = 158(0x9e, float:2.21E-43)
            r6.visitJumpInsn(r0, r7)
            java.lang.String r0 = "lexer"
            int r0 = r5.var(r0)
            r1 = 25
            r6.visitVarInsn(r1, r0)
            java.lang.String r0 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r1 = "token"
            java.lang.String r2 = "()I"
            r3 = 182(0xb6, float:2.55E-43)
            r6.visitMethodInsn(r3, r0, r1, r2)
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.visitLdcInsn(r0)
            r0 = 160(0xa0, float:2.24E-43)
            r6.visitJumpInsn(r0, r7)
            r4._quickNextTokenComma(r5, r6)
            return
    }

    private void _deserialze(com.alibaba.fastjson.asm.ClassWriter r29, com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r30) {
            r28 = this;
            r0 = r28
            r1 = r30
            r8 = 4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            com.alibaba.fastjson.util.FieldInfo[] r2 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r1)
            int r2 = r2.length
            if (r2 != 0) goto L11
            goto L3e
        L11:
            com.alibaba.fastjson.util.FieldInfo[] r2 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r1)
            int r3 = r2.length
            r10 = 0
            r4 = 0
        L18:
            if (r4 >= r3) goto L42
            r5 = r2[r4]
            java.lang.Class<?> r6 = r5.fieldClass
            java.lang.reflect.Type r5 = r5.fieldType
            java.lang.Class r7 = java.lang.Character.TYPE
            if (r6 != r7) goto L25
            goto L3e
        L25:
            java.lang.Class<java.util.Collection> r7 = java.util.Collection.class
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 == 0) goto L3f
            boolean r6 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L3e
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            r5 = r5[r10]
            boolean r5 = r5 instanceof java.lang.Class
            if (r5 == 0) goto L3e
            goto L3f
        L3e:
            return
        L3f:
            int r4 = r4 + 1
            goto L18
        L42:
            com.alibaba.fastjson.util.JavaBeanInfo r2 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$000(r1)
            com.alibaba.fastjson.util.FieldInfo[] r3 = r2.sortedFields
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$202(r1, r3)
            com.alibaba.fastjson.asm.MethodWriter r11 = new com.alibaba.fastjson.asm.MethodWriter
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "(L"
            r3.append(r4)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            r3.append(r5)
            java.lang.String r6 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"
            r3.append(r6)
            java.lang.String r15 = r3.toString()
            r16 = 0
            r17 = 0
            r13 = 1
            java.lang.String r14 = "deserialze"
            r12 = r29
            r11.<init>(r12, r13, r14, r15, r16, r17)
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            com.alibaba.fastjson.asm.Label r12 = new com.alibaba.fastjson.asm.Label
            r12.<init>()
            com.alibaba.fastjson.asm.Label r13 = new com.alibaba.fastjson.asm.Label
            r13.<init>()
            com.alibaba.fastjson.asm.Label r14 = new com.alibaba.fastjson.asm.Label
            r14.<init>()
            r0.defineVarLexer(r1, r11)
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            java.lang.String r15 = "lexer"
            int r7 = r1.var(r15)
            r10 = 25
            r11.visitVarInsn(r10, r7)
            java.lang.String r7 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r8 = "token"
            java.lang.String r10 = "()I"
            r18 = r14
            r14 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r14, r7, r8, r10)
            r8 = 14
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.visitLdcInsn(r8)
            r8 = 160(0xa0, float:2.24E-43)
            r11.visitJumpInsn(r8, r6)
            int r2 = r2.parserFeatures
            com.alibaba.fastjson.parser.Feature r8 = com.alibaba.fastjson.parser.Feature.SupportArrayToBean
            int r10 = r8.mask
            r2 = r2 & r10
            r10 = 21
            if (r2 != 0) goto Le2
            int r2 = r1.var(r15)
            r14 = 25
            r11.visitVarInsn(r14, r2)
            r2 = 4
            r11.visitVarInsn(r10, r2)
            int r2 = r8.mask
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.visitLdcInsn(r2)
            java.lang.String r2 = "isEnabled"
            java.lang.String r8 = "(II)Z"
            r14 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r14, r7, r2, r8)
            r2 = 153(0x99, float:2.14E-43)
            r11.visitJumpInsn(r2, r6)
        Le2:
            r2 = 0
            r14 = 25
            r11.visitVarInsn(r14, r2)
            r8 = 1
            r11.visitVarInsn(r14, r8)
            r2 = 2
            r11.visitVarInsn(r14, r2)
            r10 = 3
            r11.visitVarInsn(r14, r10)
            r11.visitInsn(r8)
            java.lang.String r14 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r5)
            java.lang.String r10 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r10 = 183(0xb7, float:2.56E-43)
            java.lang.String r8 = "deserialzeArrayMapping"
            r11.visitMethodInsn(r10, r14, r8, r2)
            r8 = 176(0xb0, float:2.47E-43)
            r11.visitInsn(r8)
            r11.visitLabel(r6)
            int r2 = r1.var(r15)
            r14 = 25
            r11.visitVarInsn(r14, r2)
            com.alibaba.fastjson.parser.Feature r2 = com.alibaba.fastjson.parser.Feature.SortFeidFastMatch
            int r2 = r2.mask
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.visitLdcInsn(r2)
            java.lang.String r2 = "isEnabled"
            java.lang.String r6 = "(I)Z"
            r10 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r10, r7, r2, r6)
            r2 = 153(0x99, float:2.14E-43)
            r11.visitJumpInsn(r2, r12)
            int r2 = r1.var(r15)
            r11.visitVarInsn(r14, r2)
            java.lang.Class r2 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$400(r1)
            java.lang.String r2 = r2.getName()
            r11.visitLdcInsn(r2)
            java.lang.String r2 = "scanType"
            java.lang.String r6 = "(Ljava/lang/String;)I"
            r11.visitMethodInsn(r10, r7, r2, r6)
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.visitLdcInsn(r2)
            r10 = 159(0x9f, float:2.23E-43)
            r11.visitJumpInsn(r10, r12)
            r2 = 1
            r14 = 25
            r11.visitVarInsn(r14, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "()"
            r2.append(r6)
            java.lang.Class<com.alibaba.fastjson.parser.ParseContext> r6 = com.alibaba.fastjson.parser.ParseContext.class
            java.lang.String r14 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.String r14 = "getContext"
            r8 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r8, r5, r14, r2)
            java.lang.String r2 = "mark_context"
            int r2 = r1.var(r2)
            r8 = 58
            r11.visitVarInsn(r8, r2)
            r2 = 3
            r11.visitInsn(r2)
            java.lang.String r2 = "matchedCount"
            int r2 = r1.var(r2)
            r14 = 54
            r11.visitVarInsn(r14, r2)
            r0._createInstance(r1, r11)
            r2 = 1
            r14 = 25
            r11.visitVarInsn(r14, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r14 = "()"
            r2.append(r14)
            java.lang.String r14 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.String r14 = "getContext"
            r10 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r10, r5, r14, r2)
            java.lang.String r2 = "context"
            int r2 = r1.var(r2)
            r11.visitVarInsn(r8, r2)
            r2 = 1
            r14 = 25
            r11.visitVarInsn(r14, r2)
            java.lang.String r2 = "context"
            int r2 = r1.var(r2)
            r11.visitVarInsn(r14, r2)
            java.lang.String r2 = "instance"
            int r2 = r1.var(r2)
            r11.visitVarInsn(r14, r2)
            r2 = 3
            r11.visitVarInsn(r14, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r10 = "("
            r2.append(r10)
            java.lang.String r10 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r2.append(r10)
            java.lang.String r10 = "Ljava/lang/Object;Ljava/lang/Object;)"
            r2.append(r10)
            java.lang.String r6 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "setContext"
            r10 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r10, r5, r6, r2)
            java.lang.String r2 = "childContext"
            int r2 = r1.var(r2)
            r11.visitVarInsn(r8, r2)
            int r2 = r1.var(r15)
            r14 = 25
            r11.visitVarInsn(r14, r2)
            r10 = 180(0xb4, float:2.52E-43)
            java.lang.String r14 = "matchStat"
            java.lang.String r2 = "I"
            r11.visitFieldInsn(r10, r7, r14, r2)
            r11.visitLdcInsn(r9)
            r5 = 159(0x9f, float:2.23E-43)
            r11.visitJumpInsn(r5, r13)
            r5 = 3
            r11.visitInsn(r5)
            int r6 = r1.var(r14)
            r7 = 54
            r11.visitIntInsn(r7, r6)
            com.alibaba.fastjson.util.FieldInfo[] r6 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r1)
            int r6 = r6.length
            r7 = 0
        L24c:
            if (r7 >= r6) goto L273
            r11.visitInsn(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "_asm_flag_"
            r5.append(r10)
            int r10 = r7 / 32
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            int r5 = r1.var(r5)
            r10 = 54
            r11.visitVarInsn(r10, r5)
            int r7 = r7 + 32
            r5 = 3
            r10 = 180(0xb4, float:2.52E-43)
            goto L24c
        L273:
            int r5 = r1.var(r15)
            r7 = 25
            r11.visitVarInsn(r7, r5)
            com.alibaba.fastjson.parser.Feature r5 = com.alibaba.fastjson.parser.Feature.InitStringFieldAsEmpty
            int r5 = r5.mask
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.visitLdcInsn(r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r7 = "isEnabled"
            java.lang.String r10 = "(I)Z"
            r8 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r8, r5, r7, r10)
            java.lang.String r5 = "initStringFieldAsEmpty"
            int r5 = r1.var(r5)
            r7 = 54
            r11.visitIntInsn(r7, r5)
            r5 = 0
        L29e:
            java.lang.String r8 = "_asm"
            if (r5 >= r6) goto L3e8
            com.alibaba.fastjson.util.FieldInfo[] r7 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r1)
            r7 = r7[r5]
            java.lang.Class<?> r10 = r7.fieldClass
            r21 = r12
            java.lang.Class r12 = java.lang.Boolean.TYPE
            if (r10 == r12) goto L2bc
            java.lang.Class r12 = java.lang.Byte.TYPE
            if (r10 == r12) goto L2bc
            java.lang.Class r12 = java.lang.Short.TYPE
            if (r10 == r12) goto L2bc
            java.lang.Class r12 = java.lang.Integer.TYPE
            if (r10 != r12) goto L2c7
        L2bc:
            r26 = r3
            r25 = r5
            r24 = r9
            r23 = r13
            r5 = 3
            goto L3bf
        L2c7:
            java.lang.Class r12 = java.lang.Long.TYPE
            if (r10 != r12) goto L2f5
            r10 = 9
            r11.visitInsn(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r7 = r7.name
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            r8 = 2
            int r7 = r1.var(r7, r8)
            r8 = 55
            r11.visitVarInsn(r8, r7)
        L2eb:
            r26 = r3
            r25 = r5
            r24 = r9
            r23 = r13
            goto L3dc
        L2f5:
            java.lang.Class r12 = java.lang.Float.TYPE
            if (r10 != r12) goto L319
            r10 = 11
            r11.visitInsn(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r7 = r7.name
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            int r7 = r1.var(r7)
            r8 = 56
            r11.visitVarInsn(r8, r7)
            goto L2eb
        L319:
            java.lang.Class r12 = java.lang.Double.TYPE
            if (r10 != r12) goto L33e
            r10 = 14
            r11.visitInsn(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r7 = r7.name
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            r8 = 2
            int r7 = r1.var(r7, r8)
            r8 = 57
            r11.visitVarInsn(r8, r7)
            goto L2eb
        L33e:
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            if (r10 != r12) goto L38d
            com.alibaba.fastjson.asm.Label r12 = new com.alibaba.fastjson.asm.Label
            r12.<init>()
            r22 = r10
            com.alibaba.fastjson.asm.Label r10 = new com.alibaba.fastjson.asm.Label
            r10.<init>()
            r23 = r13
            java.lang.String r13 = "initStringFieldAsEmpty"
            int r13 = r1.var(r13)
            r24 = r9
            r9 = 21
            r11.visitVarInsn(r9, r13)
            r9 = 153(0x99, float:2.14E-43)
            r11.visitJumpInsn(r9, r10)
            r0._setFlag(r11, r1, r5)
            int r9 = r1.var(r15)
            r13 = 25
            r11.visitVarInsn(r13, r9)
            java.lang.String r9 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r13 = "stringDefaultValue"
            r25 = r5
            java.lang.String r5 = "()Ljava/lang/String;"
            r26 = r3
            r3 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r3, r9, r13, r5)
            r3 = 167(0xa7, float:2.34E-43)
            r11.visitJumpInsn(r3, r12)
            r11.visitLabel(r10)
            r3 = 1
            r11.visitInsn(r3)
            r11.visitLabel(r12)
            goto L39b
        L38d:
            r26 = r3
            r25 = r5
            r24 = r9
            r22 = r10
            r23 = r13
            r3 = 1
            r11.visitInsn(r3)
        L39b:
            r3 = 192(0xc0, float:2.69E-43)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r22)
            r11.visitTypeInsn(r3, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r7.name
            r3.append(r5)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r5 = 58
            r11.visitVarInsn(r5, r3)
            goto L3dc
        L3bf:
            r11.visitInsn(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r7.name
            r3.append(r5)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r7 = 54
            r11.visitVarInsn(r7, r3)
        L3dc:
            int r5 = r25 + 1
            r12 = r21
            r13 = r23
            r9 = r24
            r3 = r26
            goto L29e
        L3e8:
            r21 = r12
            r23 = r13
            r7 = 0
        L3ed:
            r26 = r3
            r24 = r9
            if (r7 >= r6) goto L999
            com.alibaba.fastjson.util.FieldInfo[] r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r1)
            r3 = r3[r7]
            java.lang.Class<?> r5 = r3.fieldClass
            java.lang.reflect.Type r9 = r3.fieldType
            com.alibaba.fastjson.asm.Label r10 = new com.alibaba.fastjson.asm.Label
            r10.<init>()
            java.lang.Class r12 = java.lang.Boolean.TYPE
            java.lang.String r13 = "[C"
            r22 = r6
            java.lang.String r6 = "_asm_prefix__"
            if (r5 != r12) goto L45e
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldBoolean"
            java.lang.String r9 = "([C)Z"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 54
            r11.visitVarInsn(r5, r3)
        L458:
            r27 = r10
        L45a:
            r9 = 58
            goto L89e
        L45e:
            java.lang.Class r12 = java.lang.Byte.TYPE
            if (r5 != r12) goto L4af
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldInt"
            java.lang.String r9 = "([C)I"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 54
            r11.visitVarInsn(r5, r3)
            goto L458
        L4af:
            java.lang.Class r12 = java.lang.Short.TYPE
            if (r5 != r12) goto L501
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldInt"
            java.lang.String r9 = "([C)I"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 54
            r11.visitVarInsn(r5, r3)
            goto L458
        L501:
            java.lang.Class r12 = java.lang.Integer.TYPE
            if (r5 != r12) goto L553
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldInt"
            java.lang.String r9 = "([C)I"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 54
            r11.visitVarInsn(r5, r3)
            goto L458
        L553:
            java.lang.Class r12 = java.lang.Long.TYPE
            if (r5 != r12) goto L5a6
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldLong"
            java.lang.String r9 = "([C)J"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            r5 = 2
            int r3 = r1.var(r3, r5)
            r5 = 55
            r11.visitVarInsn(r5, r3)
            goto L458
        L5a6:
            java.lang.Class r12 = java.lang.Float.TYPE
            if (r5 != r12) goto L5f8
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldFloat"
            java.lang.String r9 = "([C)F"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 56
            r11.visitVarInsn(r5, r3)
            goto L458
        L5f8:
            java.lang.Class r12 = java.lang.Double.TYPE
            if (r5 != r12) goto L64b
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldDouble"
            java.lang.String r9 = "([C)D"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            r12 = 2
            int r3 = r1.var(r3, r12)
            r5 = 57
            r11.visitVarInsn(r5, r3)
            goto L458
        L64b:
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            if (r5 != r12) goto L69d
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldString"
            java.lang.String r9 = "([C)Ljava/lang/String;"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 58
            r11.visitVarInsn(r5, r3)
            goto L458
        L69d:
            java.lang.Class<int[]> r12 = int[].class
            if (r5 != r12) goto L6ef
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldIntArray"
            java.lang.String r9 = "([C)[I"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 58
            r11.visitVarInsn(r5, r3)
            goto L458
        L6ef:
            java.lang.Class<float[]> r12 = float[].class
            if (r5 != r12) goto L741
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldFloatArray"
            java.lang.String r9 = "([C)[F"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 58
            r11.visitVarInsn(r5, r3)
            goto L458
        L741:
            java.lang.Class<float[][]> r12 = float[][].class
            if (r5 != r12) goto L793
            int r5 = r1.var(r15)
            r9 = 25
            r11.visitVarInsn(r9, r5)
            r5 = 0
            r11.visitVarInsn(r9, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r3.name
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r9, r5, r6, r13)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanFieldFloatArray2"
            java.lang.String r9 = "([C)[[F"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r6, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 58
            r11.visitVarInsn(r5, r3)
            goto L458
        L793:
            boolean r12 = r5.isEnum()
            if (r12 == 0) goto L81e
            r9 = 25
            r12 = 0
            r11.visitVarInsn(r9, r12)
            r27 = r10
            int r10 = r1.var(r15)
            r11.visitVarInsn(r9, r10)
            r11.visitVarInsn(r9, r12)
            java.lang.String r9 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = r3.name
            r10.append(r12)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r10 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r10, r9, r6, r13)
            r0._getFieldDeser(r1, r11, r3)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r6 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            java.lang.String r6 = com.alibaba.fastjson.util.ASMUtils.type(r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            java.lang.String r10 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            r9.append(r10)
            java.lang.String r10 = ";[C"
            r9.append(r10)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r10 = com.alibaba.fastjson.parser.deserializer.ObjectDeserializer.class
            java.lang.String r10 = com.alibaba.fastjson.util.ASMUtils.desc(r10)
            r9.append(r10)
            java.lang.String r10 = ")Ljava/lang/Enum;"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "scanEnum"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r6, r10, r9)
            r6 = 192(0xc0, float:2.69E-43)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r5)
            r11.visitTypeInsn(r6, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r5 = 58
            r11.visitVarInsn(r5, r3)
            goto L45a
        L81e:
            r25 = r9
            r27 = r10
            java.lang.Class<java.util.Collection> r9 = java.util.Collection.class
            boolean r9 = r9.isAssignableFrom(r5)
            if (r9 == 0) goto L972
            int r9 = r1.var(r15)
            r10 = 25
            r11.visitVarInsn(r10, r9)
            r12 = 0
            r11.visitVarInsn(r10, r12)
            java.lang.String r9 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = r3.name
            r10.append(r12)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r10 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r10, r9, r6, r13)
            java.lang.Class r6 = com.alibaba.fastjson.util.TypeUtils.getCollectionItemClass(r25)
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            if (r6 != r9) goto L956
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.getType(r5)
            r11.visitLdcInsn(r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "([CLjava/lang/Class;)"
            r6.append(r9)
            java.lang.Class<java.util.Collection> r9 = java.util.Collection.class
            java.lang.String r9 = com.alibaba.fastjson.util.ASMUtils.desc(r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = "scanFieldStringArray"
            r12 = 182(0xb6, float:2.55E-43)
            r11.visitMethodInsn(r12, r5, r9, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            int r3 = r1.var(r3)
            r9 = 58
            r11.visitVarInsn(r9, r3)
        L89e:
            int r3 = r1.var(r15)
            r13 = 25
            r11.visitVarInsn(r13, r3)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            r10 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r10, r3, r14, r2)
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            r6 = 158(0x9e, float:2.21E-43)
            r11.visitJumpInsn(r6, r5)
            r0._setFlag(r11, r1, r7)
            r11.visitLabel(r5)
            int r5 = r1.var(r15)
            r11.visitVarInsn(r13, r5)
            r11.visitFieldInsn(r10, r3, r14, r2)
            r5 = 89
            r11.visitInsn(r5)
            int r5 = r1.var(r14)
            r6 = 54
            r11.visitVarInsn(r6, r5)
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.visitLdcInsn(r5)
            r5 = r26
            r6 = 159(0x9f, float:2.23E-43)
            r11.visitJumpInsn(r6, r5)
            int r6 = r1.var(r15)
            r11.visitVarInsn(r13, r6)
            r11.visitFieldInsn(r10, r3, r14, r2)
            r6 = 158(0x9e, float:2.21E-43)
            r10 = r27
            r11.visitJumpInsn(r6, r10)
            java.lang.String r6 = "matchedCount"
            int r6 = r1.var(r6)
            r12 = 21
            r11.visitVarInsn(r12, r6)
            r6 = 4
            r11.visitInsn(r6)
            r6 = 96
            r11.visitInsn(r6)
            java.lang.String r6 = "matchedCount"
            int r6 = r1.var(r6)
            r12 = 54
            r11.visitVarInsn(r12, r6)
            int r6 = r1.var(r15)
            r13 = 25
            r11.visitVarInsn(r13, r6)
            r6 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r6, r3, r14, r2)
            r9 = r24
            r11.visitLdcInsn(r9)
            r12 = r18
            r6 = 159(0x9f, float:2.23E-43)
            r11.visitJumpInsn(r6, r12)
            r11.visitLabel(r10)
            int r10 = r22 + (-1)
            if (r7 != r10) goto L94a
            int r10 = r1.var(r15)
            r11.visitVarInsn(r13, r10)
            r10 = 180(0xb4, float:2.52E-43)
            r11.visitFieldInsn(r10, r3, r14, r2)
            r11.visitLdcInsn(r9)
            r3 = 160(0xa0, float:2.24E-43)
            r11.visitJumpInsn(r3, r5)
        L94a:
            r3 = r11
            r11 = r2
            r2 = r3
            r10 = r4
            r3 = r5
            r6 = r7
            r13 = 2
            r19 = 159(0x9f, float:2.23E-43)
            r20 = 180(0xb4, float:2.52E-43)
            goto L98d
        L956:
            r9 = r11
            r11 = r2
            r2 = r9
            r10 = r4
            r12 = r18
            r9 = r24
            r13 = 2
            r19 = 159(0x9f, float:2.23E-43)
            r20 = 180(0xb4, float:2.52E-43)
            r4 = r3
            r3 = r26
            r0._deserialze_list_obj(r1, r2, r3, r4, r5, r6, r7)
            r6 = r7
            int r4 = r22 + (-1)
            if (r6 != r4) goto L98d
            r0._deserialize_endCheck(r1, r2, r3)
            goto L98d
        L972:
            r6 = r11
            r11 = r2
            r2 = r6
            r10 = r4
            r6 = r7
            r12 = r18
            r9 = r24
            r13 = 2
            r19 = 159(0x9f, float:2.23E-43)
            r20 = 180(0xb4, float:2.52E-43)
            r4 = r3
            r3 = r26
            r0._deserialze_obj(r1, r2, r3, r4, r5, r6)
            int r4 = r22 + (-1)
            if (r6 != r4) goto L98d
            r0._deserialize_endCheck(r1, r2, r3)
        L98d:
            int r7 = r6 + 1
            r4 = r11
            r11 = r2
            r2 = r4
            r4 = r10
            r18 = r12
            r6 = r22
            goto L3ed
        L999:
            r10 = r4
            r22 = r6
            r2 = r11
            r12 = r18
            r3 = r26
            r13 = 2
            r2.visitLabel(r12)
            java.lang.Class r4 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$400(r1)
            boolean r4 = r4.isInterface()
            if (r4 != 0) goto L9c0
            java.lang.Class r4 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$400(r1)
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isAbstract(r4)
            if (r4 != 0) goto L9c0
            r0._batchSet(r1, r2)
        L9c0:
            r4 = r23
            r2.visitLabel(r4)
            r0._setContext(r1, r2)
            java.lang.String r4 = "instance"
            int r4 = r1.var(r4)
            r9 = 25
            r2.visitVarInsn(r9, r4)
            com.alibaba.fastjson.util.JavaBeanInfo r4 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$000(r1)
            java.lang.reflect.Method r4 = r4.buildMethod
            if (r4 == 0) goto La05
            java.lang.Class r5 = r1.getInstClass()
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.type(r5)
            java.lang.String r6 = r4.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "()"
            r7.append(r8)
            java.lang.Class r4 = r4.getReturnType()
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r4)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r12 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r12, r5, r6, r4)
        La05:
            r4 = 176(0xb0, float:2.47E-43)
            r2.visitInsn(r4)
            r2.visitLabel(r3)
            r0._batchSet(r1, r2)
            r5 = 0
            r9 = 25
            r2.visitVarInsn(r9, r5)
            r3 = 1
            r2.visitVarInsn(r9, r3)
            r2.visitVarInsn(r9, r13)
            r5 = 3
            r2.visitVarInsn(r9, r5)
            java.lang.String r3 = "instance"
            int r3 = r1.var(r3)
            r2.visitVarInsn(r9, r3)
            r6 = 4
            r9 = 21
            r2.visitVarInsn(r9, r6)
            int r6 = r22 / 32
            if (r22 == 0) goto La3a
            int r3 = r22 % 32
            if (r3 == 0) goto La3a
            int r6 = r6 + 1
        La3a:
            r3 = 1
            if (r6 != r3) goto La42
            r3 = 4
            r2.visitInsn(r3)
            goto La47
        La42:
            r3 = 16
            r2.visitIntInsn(r3, r6)
        La47:
            r3 = 188(0xbc, float:2.63E-43)
            r4 = 10
            r2.visitIntInsn(r3, r4)
            r3 = 0
        La4f:
            if (r3 >= r6) goto La8c
            r4 = 89
            r2.visitInsn(r4)
            if (r3 != 0) goto La5d
            r5 = 3
            r2.visitInsn(r5)
            goto La6a
        La5d:
            r4 = 1
            if (r3 != r4) goto La65
            r4 = 4
            r2.visitInsn(r4)
            goto La6a
        La65:
            r4 = 16
            r2.visitIntInsn(r4, r3)
        La6a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "_asm_flag_"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            int r4 = r1.var(r4)
            r9 = 21
            r2.visitVarInsn(r9, r4)
            r4 = 79
            r2.visitInsn(r4)
            int r3 = r3 + 1
            goto La4f
        La8c:
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            r4.append(r5)
            java.lang.String r6 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "parseRest"
            r12 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r12, r3, r6, r4)
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$400(r1)
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            r4 = 192(0xc0, float:2.69E-43)
            r2.visitTypeInsn(r4, r3)
            r4 = 176(0xb0, float:2.47E-43)
            r2.visitInsn(r4)
            r3 = r21
            r2.visitLabel(r3)
            r9 = 25
            r12 = 0
            r2.visitVarInsn(r9, r12)
            r3 = 1
            r2.visitVarInsn(r9, r3)
            r2.visitVarInsn(r9, r13)
            r3 = 3
            r2.visitVarInsn(r9, r3)
            r6 = 4
            r9 = 21
            r2.visitVarInsn(r9, r6)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r5)
            java.lang.String r5 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 183(0xb7, float:2.56E-43)
            java.lang.String r6 = "deserialze"
            r2.visitMethodInsn(r5, r3, r6, r4)
            r4 = 176(0xb0, float:2.47E-43)
            r2.visitInsn(r4)
            r3 = 10
            int r1 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$100(r1)
            r2.visitMaxs(r3, r1)
            r2.visitEnd()
            return
    }

    private void _deserialzeArrayMapping(com.alibaba.fastjson.asm.ClassWriter r28, com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r29) {
            r27 = this;
            r0 = r27
            r1 = r29
            r6 = 14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 16
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            com.alibaba.fastjson.asm.MethodWriter r2 = new com.alibaba.fastjson.asm.MethodWriter
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "(L"
            r3.append(r4)
            java.lang.String r4 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            r3.append(r4)
            java.lang.String r4 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
            r3.append(r4)
            java.lang.String r14 = r3.toString()
            r15 = 0
            r16 = 0
            r12 = 1
            java.lang.String r13 = "deserialzeArrayMapping"
            r11 = r28
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.defineVarLexer(r1, r2)
            r0._createInstance(r1, r2)
            com.alibaba.fastjson.util.JavaBeanInfo r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$000(r1)
            com.alibaba.fastjson.util.FieldInfo[] r10 = r3.sortedFields
            int r11 = r10.length
            r5 = 0
        L44:
            java.lang.String r4 = "next"
            java.lang.String r13 = "getCurrent"
            java.lang.String r6 = "ch"
            java.lang.String r3 = "(I)V"
            java.lang.String r12 = "()C"
            java.lang.String r14 = "lexer"
            if (r5 >= r11) goto L733
            int r8 = r11 + (-1)
            if (r5 != r8) goto L58
            r8 = 1
            goto L59
        L58:
            r8 = 0
        L59:
            if (r8 == 0) goto L62
            r18 = 93
            r15 = 93
        L5f:
            r18 = r8
            goto L67
        L62:
            r18 = 44
            r15 = 44
            goto L5f
        L67:
            r8 = r10[r5]
            r19 = r10
            java.lang.Class<?> r10 = r8.fieldClass
            r20 = r11
            java.lang.reflect.Type r11 = r8.fieldType
            r21 = r11
            java.lang.Class r11 = java.lang.Byte.TYPE
            r22 = r9
            java.lang.String r9 = "_asm"
            if (r10 == r11) goto L83
            java.lang.Class r11 = java.lang.Short.TYPE
            if (r10 == r11) goto L83
            java.lang.Class r11 = java.lang.Integer.TYPE
            if (r10 != r11) goto L8d
        L83:
            r25 = r7
            r3 = r8
            r7 = r9
            r8 = r22
            r10 = 14
            goto L6f1
        L8d:
            java.lang.Class r11 = java.lang.Long.TYPE
            if (r10 != r11) goto Lcd
            int r3 = r1.var(r14)
            r4 = 25
            r2.visitVarInsn(r4, r3)
            r3 = 16
            r2.visitVarInsn(r3, r15)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r4 = "scanLong"
            java.lang.String r6 = "(C)J"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r3, r4, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.name
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r4 = 2
            int r3 = r1.var(r3, r4)
            r4 = 55
            r2.visitVarInsn(r4, r3)
        Lc5:
            r25 = r7
        Lc7:
            r8 = r22
        Lc9:
            r10 = 14
            goto L724
        Lcd:
            java.lang.Class r11 = java.lang.Boolean.TYPE
            if (r10 != r11) goto L105
            int r3 = r1.var(r14)
            r4 = 25
            r2.visitVarInsn(r4, r3)
            r3 = 16
            r2.visitVarInsn(r3, r15)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r4 = "scanBoolean"
            java.lang.String r6 = "(C)Z"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r3, r4, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.name
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r4 = 54
            r2.visitVarInsn(r4, r3)
            goto Lc5
        L105:
            java.lang.Class r11 = java.lang.Float.TYPE
            if (r10 != r11) goto L13d
            int r3 = r1.var(r14)
            r4 = 25
            r2.visitVarInsn(r4, r3)
            r3 = 16
            r2.visitVarInsn(r3, r15)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r4 = "scanFloat"
            java.lang.String r6 = "(C)F"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r3, r4, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.name
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r4 = 56
            r2.visitVarInsn(r4, r3)
            goto Lc5
        L13d:
            java.lang.Class r11 = java.lang.Double.TYPE
            if (r10 != r11) goto L177
            int r3 = r1.var(r14)
            r4 = 25
            r2.visitVarInsn(r4, r3)
            r3 = 16
            r2.visitVarInsn(r3, r15)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r4 = "scanDouble"
            java.lang.String r6 = "(C)D"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r3, r4, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.name
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r4 = 2
            int r3 = r1.var(r3, r4)
            r4 = 57
            r2.visitVarInsn(r4, r3)
            goto Lc5
        L177:
            java.lang.Class r11 = java.lang.Character.TYPE
            if (r10 != r11) goto L1bd
            int r3 = r1.var(r14)
            r4 = 25
            r2.visitVarInsn(r4, r3)
            r3 = 16
            r2.visitVarInsn(r3, r15)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r4 = "scanString"
            java.lang.String r6 = "(C)Ljava/lang/String;"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r3, r4, r6)
            r3 = 3
            r2.visitInsn(r3)
            java.lang.String r3 = "charAt"
            java.lang.String r4 = "(I)C"
            java.lang.String r6 = "java/lang/String"
            r2.visitMethodInsn(r10, r6, r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.name
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r4 = 54
            r2.visitVarInsn(r4, r3)
            goto Lc5
        L1bd:
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r23 = r5
            r5 = 58
            if (r10 != r11) goto L1fe
            int r3 = r1.var(r14)
            r4 = 25
            r2.visitVarInsn(r4, r3)
            r3 = 16
            r2.visitVarInsn(r3, r15)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r4 = "scanString"
            java.lang.String r6 = "(C)Ljava/lang/String;"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r3, r4, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.name
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r2.visitVarInsn(r5, r3)
            r25 = r7
        L1f8:
            r8 = r22
            r5 = r23
            goto Lc9
        L1fe:
            boolean r11 = r10.isEnum()
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r24 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            if (r11 == 0) goto L38d
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            com.alibaba.fastjson.asm.Label r4 = new com.alibaba.fastjson.asm.Label
            r4.<init>()
            com.alibaba.fastjson.asm.Label r11 = new com.alibaba.fastjson.asm.Label
            r11.<init>()
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            r25 = r7
            int r7 = r1.var(r14)
            r26 = r10
            r10 = 25
            r2.visitVarInsn(r10, r7)
            java.lang.String r7 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r7, r13, r12)
            r10 = 89
            r2.visitInsn(r10)
            int r10 = r1.var(r6)
            r12 = 54
            r2.visitVarInsn(r12, r10)
            r10 = 110(0x6e, float:1.54E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.visitLdcInsn(r10)
            r10 = 159(0x9f, float:2.23E-43)
            r2.visitJumpInsn(r10, r5)
            int r10 = r1.var(r6)
            r12 = 21
            r2.visitVarInsn(r12, r10)
            r10 = 34
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.visitLdcInsn(r10)
            r10 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r10, r3)
            r2.visitLabel(r5)
            int r5 = r1.var(r14)
            r10 = 25
            r2.visitVarInsn(r10, r5)
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r26)
            com.alibaba.fastjson.asm.Type r5 = com.alibaba.fastjson.asm.Type.getType(r5)
            r2.visitLdcInsn(r5)
            r5 = 1
            r2.visitVarInsn(r10, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "()"
            r10.append(r12)
            java.lang.Class<com.alibaba.fastjson.parser.SymbolTable> r12 = com.alibaba.fastjson.parser.SymbolTable.class
            java.lang.String r12 = com.alibaba.fastjson.util.ASMUtils.desc(r12)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.String r12 = "getSymbolTable"
            r13 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r13, r5, r12, r10)
            r5 = 16
            r2.visitVarInsn(r5, r15)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "(Ljava/lang/Class;"
            r5.append(r10)
            java.lang.Class<com.alibaba.fastjson.parser.SymbolTable> r10 = com.alibaba.fastjson.parser.SymbolTable.class
            java.lang.String r10 = com.alibaba.fastjson.util.ASMUtils.desc(r10)
            r5.append(r10)
            java.lang.String r10 = "C)Ljava/lang/Enum;"
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "scanEnum"
            r13 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r13, r7, r10, r5)
            r5 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r5, r11)
            r2.visitLabel(r3)
            int r3 = r1.var(r6)
            r12 = 21
            r2.visitVarInsn(r12, r3)
            r3 = 48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.visitLdcInsn(r3)
            r3 = 161(0xa1, float:2.26E-43)
            r2.visitJumpInsn(r3, r4)
            int r3 = r1.var(r6)
            r2.visitVarInsn(r12, r3)
            r3 = 57
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.visitLdcInsn(r3)
            r3 = 163(0xa3, float:2.28E-43)
            r2.visitJumpInsn(r3, r4)
            r0._getFieldDeser(r1, r2, r8)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.EnumDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.EnumDeserializer.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            r5 = 192(0xc0, float:2.69E-43)
            r2.visitTypeInsn(r5, r3)
            int r3 = r1.var(r14)
            r10 = 25
            r2.visitVarInsn(r10, r3)
            r3 = 16
            r2.visitVarInsn(r3, r15)
            java.lang.String r3 = "scanInt"
            java.lang.String r5 = "(C)I"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r7, r3, r5)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.EnumDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.EnumDeserializer.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            java.lang.String r5 = "valueOf"
            java.lang.String r6 = "(I)Ljava/lang/Enum;"
            r2.visitMethodInsn(r10, r3, r5, r6)
            r5 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r5, r11)
            r2.visitLabel(r4)
            r3 = 0
            r4 = 25
            r2.visitVarInsn(r4, r3)
            int r3 = r1.var(r14)
            r2.visitVarInsn(r4, r3)
            r3 = 16
            r2.visitVarInsn(r3, r15)
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r24)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "(L"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = ";C)Ljava/lang/Enum;"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "scanEnum"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r3, r5, r4)
            r2.visitLabel(r11)
            r3 = 192(0xc0, float:2.69E-43)
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.type(r26)
            r2.visitTypeInsn(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.name
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r4 = 58
            r2.visitVarInsn(r4, r3)
            goto L1f8
        L38d:
            r25 = r7
            r26 = r10
            java.lang.Class<java.util.Collection> r5 = java.util.Collection.class
            r6 = r26
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L5af
            java.lang.Class r5 = com.alibaba.fastjson.util.TypeUtils.getCollectionItemClass(r21)
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r5 != r7) goto L47e
            java.lang.Class<java.util.List> r3 = java.util.List.class
            if (r6 == r3) goto L3cb
            java.lang.Class<java.util.Collections> r3 = java.util.Collections.class
            if (r6 == r3) goto L3cb
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            if (r6 != r3) goto L3b0
            goto L3cb
        L3b0:
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            com.alibaba.fastjson.asm.Type r3 = com.alibaba.fastjson.asm.Type.getType(r3)
            r2.visitLdcInsn(r3)
            java.lang.Class<com.alibaba.fastjson.util.TypeUtils> r3 = com.alibaba.fastjson.util.TypeUtils.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            java.lang.String r4 = "createCollection"
            java.lang.String r5 = "(Ljava/lang/Class;)Ljava/util/Collection;"
            r6 = 184(0xb8, float:2.58E-43)
            r2.visitMethodInsn(r6, r3, r4, r5)
            goto L3ea
        L3cb:
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            r4 = 187(0xbb, float:2.62E-43)
            r2.visitTypeInsn(r4, r3)
            r10 = 89
            r2.visitInsn(r10)
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            java.lang.String r4 = "<init>"
            java.lang.String r5 = "()V"
            r6 = 183(0xb7, float:2.56E-43)
            r2.visitMethodInsn(r6, r3, r4, r5)
        L3ea:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.name
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r4 = 58
            r2.visitVarInsn(r4, r3)
            int r3 = r1.var(r14)
            r4 = 25
            r2.visitVarInsn(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r8.name
            r3.append(r5)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r2.visitVarInsn(r4, r3)
            r3 = 16
            r2.visitVarInsn(r3, r15)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r5 = "scanStringArray"
            java.lang.String r6 = "(Ljava/util/Collection;C)V"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r3, r5, r6)
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            int r6 = r1.var(r14)
            r2.visitVarInsn(r4, r6)
            java.lang.String r4 = "matchStat"
            java.lang.String r6 = "I"
            r7 = 180(0xb4, float:2.52E-43)
            r2.visitFieldInsn(r7, r3, r4, r6)
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.visitLdcInsn(r3)
            r10 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r10, r5)
            r3 = 1
            r2.visitInsn(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.name
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r4 = 58
            r2.visitVarInsn(r4, r3)
            r2.visitLabel(r5)
            r5 = r23
            r4 = r25
            goto L5ab
        L47e:
            com.alibaba.fastjson.asm.Label r7 = new com.alibaba.fastjson.asm.Label
            r7.<init>()
            int r10 = r1.var(r14)
            r11 = 25
            r2.visitVarInsn(r11, r10)
            java.lang.String r10 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r11 = "()I"
            java.lang.String r15 = "token"
            r18 = r5
            r5 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r5, r10, r15, r11)
            int r5 = r1.var(r15)
            r11 = 54
            r2.visitVarInsn(r11, r5)
            int r5 = r1.var(r15)
            r11 = 21
            r2.visitVarInsn(r11, r5)
            if (r23 != 0) goto L4b0
            r5 = 14
            goto L4b2
        L4b0:
            r5 = 16
        L4b2:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.visitLdcInsn(r5)
            r5 = 159(0x9f, float:2.23E-43)
            r2.visitJumpInsn(r5, r7)
            r5 = 1
            r11 = 25
            r2.visitVarInsn(r11, r5)
            int r5 = r1.var(r15)
            r11 = 21
            r2.visitVarInsn(r11, r5)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            java.lang.String r11 = "throwException"
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r5, r11, r3)
            r2.visitLabel(r7)
            com.alibaba.fastjson.asm.Label r7 = new com.alibaba.fastjson.asm.Label
            r7.<init>()
            com.alibaba.fastjson.asm.Label r11 = new com.alibaba.fastjson.asm.Label
            r11.<init>()
            r17 = r5
            int r5 = r1.var(r14)
            r21 = r9
            r9 = 25
            r2.visitVarInsn(r9, r5)
            r2.visitMethodInsn(r15, r10, r13, r12)
            r5 = 91
            r13 = 16
            r2.visitVarInsn(r13, r5)
            r5 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r5, r7)
            int r5 = r1.var(r14)
            r2.visitVarInsn(r9, r5)
            r2.visitMethodInsn(r15, r10, r4, r12)
            r4 = 87
            r2.visitInsn(r4)
            int r4 = r1.var(r14)
            r2.visitVarInsn(r9, r4)
            r4 = r25
            r2.visitLdcInsn(r4)
            java.lang.String r5 = "setToken"
            r2.visitMethodInsn(r15, r10, r5, r3)
            r5 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r5, r11)
            r2.visitLabel(r7)
            int r5 = r1.var(r14)
            r2.visitVarInsn(r9, r5)
            r2.visitLdcInsn(r4)
            java.lang.String r5 = "nextToken"
            r2.visitMethodInsn(r15, r10, r5, r3)
            r2.visitLabel(r11)
            r5 = r23
            r3 = 0
            r0._newCollection(r2, r6, r5, r3)
            r10 = 89
            r2.visitInsn(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r8.name
            r3.append(r6)
            r7 = r21
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r6 = 58
            r2.visitVarInsn(r6, r3)
            r3 = r18
            r0._getCollectionFieldItemDeser(r1, r2, r8, r3)
            r6 = 1
            r10 = 25
            r2.visitVarInsn(r10, r6)
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.desc(r3)
            com.alibaba.fastjson.asm.Type r3 = com.alibaba.fastjson.asm.Type.getType(r3)
            r2.visitLdcInsn(r3)
            r3 = 3
            r2.visitVarInsn(r10, r3)
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r24)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "(Ljava/util/Collection;"
            r6.append(r7)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r7 = com.alibaba.fastjson.parser.deserializer.ObjectDeserializer.class
            java.lang.String r7 = com.alibaba.fastjson.util.ASMUtils.desc(r7)
            r6.append(r7)
            java.lang.String r7 = "L"
            r6.append(r7)
            r7 = r17
            r6.append(r7)
            java.lang.String r7 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;)V"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "parseArray"
            r2.visitMethodInsn(r7, r3, r8, r6)
        L5ab:
            r25 = r4
            goto Lc7
        L5af:
            r7 = r9
            r5 = r23
            r4 = r25
            boolean r9 = r6.isArray()
            if (r9 == 0) goto L616
            int r9 = r1.var(r14)
            r10 = 25
            r2.visitVarInsn(r10, r9)
            r2.visitLdcInsn(r4)
            java.lang.String r9 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r11 = "nextToken"
            r13 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r13, r9, r11, r3)
            r3 = 1
            r2.visitVarInsn(r10, r3)
            r3 = 0
            r2.visitVarInsn(r10, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.visitLdcInsn(r3)
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r24)
            java.lang.String r9 = "getFieldType"
            java.lang.String r10 = "(I)Ljava/lang/reflect/Type;"
            r2.visitMethodInsn(r13, r3, r9, r10)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            java.lang.String r9 = "parseObject"
            java.lang.String r10 = "(Ljava/lang/reflect/Type;)Ljava/lang/Object;"
            r2.visitMethodInsn(r13, r3, r9, r10)
            r3 = 192(0xc0, float:2.69E-43)
            java.lang.String r6 = com.alibaba.fastjson.util.ASMUtils.type(r6)
            r2.visitTypeInsn(r3, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r8.name
            r3.append(r6)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r6 = 58
            r2.visitVarInsn(r6, r3)
            goto L5ab
        L616:
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            com.alibaba.fastjson.asm.Label r9 = new com.alibaba.fastjson.asm.Label
            r9.<init>()
            java.lang.Class<java.util.Date> r10 = java.util.Date.class
            if (r6 != r10) goto L697
            int r10 = r1.var(r14)
            r11 = 25
            r2.visitVarInsn(r11, r10)
            java.lang.String r10 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            r11 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r11, r10, r13, r12)
            r11 = 49
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r2.visitLdcInsn(r11)
            r11 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r11, r3)
            java.lang.Class<java.util.Date> r11 = java.util.Date.class
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r11)
            r12 = 187(0xbb, float:2.62E-43)
            r2.visitTypeInsn(r12, r11)
            r11 = 89
            r2.visitInsn(r11)
            int r11 = r1.var(r14)
            r12 = 25
            r2.visitVarInsn(r12, r11)
            r13 = 16
            r2.visitVarInsn(r13, r15)
            java.lang.String r11 = "scanLong"
            java.lang.String r12 = "(C)J"
            r13 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r13, r10, r11, r12)
            java.lang.Class<java.util.Date> r10 = java.util.Date.class
            java.lang.String r10 = com.alibaba.fastjson.util.ASMUtils.type(r10)
            java.lang.String r11 = "<init>"
            java.lang.String r12 = "(J)V"
            r13 = 183(0xb7, float:2.56E-43)
            r2.visitMethodInsn(r13, r10, r11, r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r8.name
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            int r7 = r1.var(r7)
            r10 = 58
            r2.visitVarInsn(r10, r7)
            r7 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r7, r9)
        L697:
            r2.visitLabel(r3)
            r10 = 14
            r0._quickNextToken(r1, r2, r10)
            r25 = r4
            r4 = r6
            r3 = r8
            r0._deserObject(r1, r2, r3, r4, r5)
            r3 = 0
            r4 = 25
            r2.visitVarInsn(r4, r3)
            int r3 = r1.var(r14)
            r2.visitVarInsn(r4, r3)
            if (r18 != 0) goto L6bb
            r8 = r22
            r2.visitLdcInsn(r8)
            goto L6c6
        L6bb:
            r8 = r22
            r3 = 15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.visitLdcInsn(r3)
        L6c6:
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r24)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "("
            r4.append(r6)
            java.lang.Class<com.alibaba.fastjson.parser.JSONLexer> r6 = com.alibaba.fastjson.parser.JSONLexer.class
            java.lang.String r6 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r4.append(r6)
            java.lang.String r6 = "I)V"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 183(0xb7, float:2.56E-43)
            java.lang.String r7 = "check"
            r2.visitMethodInsn(r6, r3, r7, r4)
            r2.visitLabel(r9)
            goto L724
        L6f1:
            int r4 = r1.var(r14)
            r11 = 25
            r2.visitVarInsn(r11, r4)
            r13 = 16
            r2.visitVarInsn(r13, r15)
            java.lang.String r4 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r6 = "scanInt"
            java.lang.String r9 = "(C)I"
            r13 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r13, r4, r6, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.name
            r4.append(r3)
            r4.append(r7)
            java.lang.String r3 = r4.toString()
            int r3 = r1.var(r3)
            r4 = 54
            r2.visitVarInsn(r4, r3)
        L724:
            int r5 = r5 + 1
            r9 = r8
            r10 = r19
            r11 = r20
            r7 = r25
            r6 = 14
            r8 = 16
            goto L44
        L733:
            r8 = r9
            r5 = 0
            r0._batchSet(r1, r2, r5)
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            com.alibaba.fastjson.asm.Label r7 = new com.alibaba.fastjson.asm.Label
            r7.<init>()
            com.alibaba.fastjson.asm.Label r9 = new com.alibaba.fastjson.asm.Label
            r9.<init>()
            com.alibaba.fastjson.asm.Label r10 = new com.alibaba.fastjson.asm.Label
            r10.<init>()
            int r11 = r1.var(r14)
            r15 = 25
            r2.visitVarInsn(r15, r11)
            java.lang.String r11 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r11, r13, r12)
            r13 = 89
            r2.visitInsn(r13)
            int r13 = r1.var(r6)
            r15 = 54
            r2.visitVarInsn(r15, r13)
            r13 = 44
            r15 = 16
            r2.visitVarInsn(r15, r13)
            r13 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r13, r7)
            int r13 = r1.var(r14)
            r15 = 25
            r2.visitVarInsn(r15, r13)
            r13 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r13, r11, r4, r12)
            r13 = 87
            r2.visitInsn(r13)
            int r13 = r1.var(r14)
            r2.visitVarInsn(r15, r13)
            r2.visitLdcInsn(r8)
            java.lang.String r13 = "setToken"
            r15 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r15, r11, r13, r3)
            r13 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r13, r10)
            r2.visitLabel(r7)
            int r7 = r1.var(r6)
            r13 = 21
            r2.visitVarInsn(r13, r7)
            r7 = 93
            r13 = 16
            r2.visitVarInsn(r13, r7)
            r13 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r13, r9)
            int r7 = r1.var(r14)
            r13 = 25
            r2.visitVarInsn(r13, r7)
            r2.visitMethodInsn(r15, r11, r4, r12)
            r7 = 87
            r2.visitInsn(r7)
            int r7 = r1.var(r14)
            r2.visitVarInsn(r13, r7)
            r7 = 15
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.visitLdcInsn(r7)
            java.lang.String r7 = "setToken"
            r2.visitMethodInsn(r15, r11, r7, r3)
            r13 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r13, r10)
            r2.visitLabel(r9)
            int r6 = r1.var(r6)
            r13 = 21
            r2.visitVarInsn(r13, r6)
            r6 = 26
            r13 = 16
            r2.visitVarInsn(r13, r6)
            r13 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r13, r5)
            int r6 = r1.var(r14)
            r13 = 25
            r2.visitVarInsn(r13, r6)
            r2.visitMethodInsn(r15, r11, r4, r12)
            r4 = 87
            r2.visitInsn(r4)
            int r4 = r1.var(r14)
            r2.visitVarInsn(r13, r4)
            r4 = 20
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.visitLdcInsn(r4)
            java.lang.String r4 = "setToken"
            r2.visitMethodInsn(r15, r11, r4, r3)
            r7 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r7, r10)
            r2.visitLabel(r5)
            int r4 = r1.var(r14)
            r2.visitVarInsn(r13, r4)
            r2.visitLdcInsn(r8)
            java.lang.String r4 = "nextToken"
            r2.visitMethodInsn(r15, r11, r4, r3)
            r2.visitLabel(r10)
            java.lang.String r3 = "instance"
            int r3 = r1.var(r3)
            r2.visitVarInsn(r13, r3)
            r3 = 176(0xb0, float:2.47E-43)
            r2.visitInsn(r3)
            r3 = 5
            int r1 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$100(r1)
            r2.visitMaxs(r3, r1)
            r2.visitEnd()
            return
    }

    private void _deserialze_list_obj(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r29, com.alibaba.fastjson.asm.MethodVisitor r30, com.alibaba.fastjson.asm.Label r31, com.alibaba.fastjson.util.FieldInfo r32, java.lang.Class<?> r33, java.lang.Class<?> r34, int r35) {
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r5 = r33
            r7 = r35
            com.alibaba.fastjson.asm.Label r8 = new com.alibaba.fastjson.asm.Label
            r8.<init>()
            java.lang.String r9 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r10 = "matchField"
            java.lang.String r11 = "([C)Z"
            r12 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r12, r9, r10, r11)
            r10 = 153(0x99, float:2.14E-43)
            r2.visitJumpInsn(r10, r8)
            r0._setFlag(r2, r1, r7)
            com.alibaba.fastjson.asm.Label r10 = new com.alibaba.fastjson.asm.Label
            r10.<init>()
            java.lang.String r11 = "lexer"
            int r13 = r1.var(r11)
            r14 = 25
            r2.visitVarInsn(r14, r13)
            java.lang.String r13 = "token"
            java.lang.String r15 = "()I"
            r2.visitMethodInsn(r12, r9, r13, r15)
            r16 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)
            r2.visitLdcInsn(r12)
            r12 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r12, r10)
            int r12 = r1.var(r11)
            r2.visitVarInsn(r14, r12)
            r12 = 16
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2.visitLdcInsn(r12)
            java.lang.String r12 = "nextToken"
            java.lang.String r14 = "(I)V"
            r6 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r6, r9, r12, r14)
            r6 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r6, r8)
            r2.visitLabel(r10)
            com.alibaba.fastjson.asm.Label r10 = new com.alibaba.fastjson.asm.Label
            r10.<init>()
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            r17 = r8
            com.alibaba.fastjson.asm.Label r8 = new com.alibaba.fastjson.asm.Label
            r8.<init>()
            int r4 = r1.var(r11)
            r3 = 25
            r2.visitVarInsn(r3, r4)
            r4 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r4, r9, r13, r15)
            r18 = 21
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r2.visitLdcInsn(r4)
            r4 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r4, r6)
            int r4 = r1.var(r11)
            r2.visitVarInsn(r3, r4)
            r4 = 14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.visitLdcInsn(r4)
            r4 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r4, r9, r12, r14)
            r4 = 1
            r0._newCollection(r2, r5, r7, r4)
            r4 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r4, r10)
            r2.visitLabel(r6)
            int r4 = r1.var(r11)
            r2.visitVarInsn(r3, r4)
            r4 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r4, r9, r13, r15)
            r6 = 14
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.visitLdcInsn(r6)
            r6 = 159(0x9f, float:2.23E-43)
            r2.visitJumpInsn(r6, r8)
            int r6 = r1.var(r11)
            r2.visitVarInsn(r3, r6)
            r2.visitMethodInsn(r4, r9, r13, r15)
            r3 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.visitLdcInsn(r4)
            r6 = r31
            r3 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r3, r6)
            r3 = 0
            r0._newCollection(r2, r5, r7, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = r32
            r20 = r13
            java.lang.String r13 = r6.name
            r3.append(r13)
            java.lang.String r13 = "_asm"
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            int r3 = r1.var(r3)
            r21 = r4
            r4 = 58
            r2.visitVarInsn(r4, r3)
            r3 = r34
            r0._getCollectionFieldItemDeser(r1, r2, r6, r3)
            r22 = r9
            r4 = 25
            r9 = 1
            r2.visitVarInsn(r4, r9)
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r3)
            com.alibaba.fastjson.asm.Type r4 = com.alibaba.fastjson.asm.Type.getType(r4)
            r2.visitLdcInsn(r4)
            r4 = 3
            r2.visitInsn(r4)
            java.lang.String r4 = "valueOf"
            java.lang.String r9 = "(I)Ljava/lang/Integer;"
            r23 = r12
            r12 = 184(0xb8, float:2.58E-43)
            r24 = r14
            java.lang.String r14 = "java/lang/Integer"
            r2.visitMethodInsn(r12, r14, r4, r9)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r4 = com.alibaba.fastjson.parser.deserializer.ObjectDeserializer.class
            java.lang.String r9 = com.alibaba.fastjson.util.ASMUtils.type(r4)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "(L"
            r12.append(r14)
            java.lang.String r14 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            r12.append(r14)
            r25 = r4
            java.lang.String r4 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            r12 = 185(0xb9, float:2.59E-43)
            r26 = r14
            java.lang.String r14 = "deserialze"
            r2.visitMethodInsn(r12, r9, r14, r4)
            java.lang.String r4 = "list_item_value"
            int r9 = r1.var(r4)
            r14 = 58
            r2.visitVarInsn(r14, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = r6.name
            r9.append(r14)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            int r9 = r1.var(r9)
            r14 = 25
            r2.visitVarInsn(r14, r9)
            int r9 = r1.var(r4)
            r2.visitVarInsn(r14, r9)
            boolean r9 = r5.isInterface()
            java.lang.String r14 = "(Ljava/lang/Object;)Z"
            java.lang.String r12 = "add"
            if (r9 == 0) goto L1a6
            java.lang.String r9 = com.alibaba.fastjson.util.ASMUtils.type(r5)
            r27 = r4
            r4 = 185(0xb9, float:2.59E-43)
            r2.visitMethodInsn(r4, r9, r12, r14)
            goto L1b1
        L1a6:
            r27 = r4
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.type(r5)
            r9 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r9, r4, r12, r14)
        L1b1:
            r4 = 87
            r2.visitInsn(r4)
            r9 = r17
            r4 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r4, r9)
            r2.visitLabel(r8)
            r4 = 0
            r0._newCollection(r2, r5, r7, r4)
            r2.visitLabel(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r6.name
            r4.append(r7)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            int r4 = r1.var(r4)
            r7 = 58
            r2.visitVarInsn(r7, r4)
            java.lang.Class<?> r4 = r6.fieldClass
            boolean r4 = com.alibaba.fastjson.parser.ParserConfig.isPrimitive2(r4)
            r0._getCollectionFieldItemDeser(r1, r2, r6, r3)
            java.lang.String r7 = "fastMatchToken"
            if (r4 == 0) goto L225
            java.lang.String r8 = com.alibaba.fastjson.util.ASMUtils.type(r25)
            java.lang.String r10 = "getFastMatchToken"
            r3 = 185(0xb9, float:2.59E-43)
            r2.visitMethodInsn(r3, r8, r10, r15)
            r3 = 54
            int r8 = r1.var(r7)
            r2.visitVarInsn(r3, r8)
            int r3 = r1.var(r11)
            r8 = 25
            r2.visitVarInsn(r8, r3)
            int r3 = r1.var(r7)
            r8 = 21
            r2.visitVarInsn(r8, r3)
            r35 = r4
            r3 = r22
            r10 = r23
            r4 = r24
            r8 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r8, r3, r10, r4)
        L221:
            r5 = 1
            r8 = 25
            goto L246
        L225:
            r35 = r4
            r3 = r22
            r10 = r23
            r4 = r24
            r8 = 87
            r2.visitInsn(r8)
            r8 = r21
            r2.visitLdcInsn(r8)
            r8 = 54
            int r5 = r1.var(r7)
            r2.visitVarInsn(r8, r5)
            r5 = 12
            r0._quickNextToken(r1, r2, r5)
            goto L221
        L246:
            r2.visitVarInsn(r8, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "()"
            r5.append(r8)
            java.lang.Class<com.alibaba.fastjson.parser.ParseContext> r8 = com.alibaba.fastjson.parser.ParseContext.class
            java.lang.String r8 = com.alibaba.fastjson.util.ASMUtils.desc(r8)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "getContext"
            r21 = r9
            r9 = r26
            r0 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r0, r9, r8, r5)
            java.lang.String r0 = "listContext"
            int r0 = r1.var(r0)
            r5 = 58
            r2.visitVarInsn(r5, r0)
            r5 = 1
            r8 = 25
            r2.visitVarInsn(r8, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r6.name
            r0.append(r5)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            int r0 = r1.var(r0)
            r2.visitVarInsn(r8, r0)
            java.lang.String r0 = r6.name
            r2.visitLdcInsn(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "(Ljava/lang/Object;Ljava/lang/Object;)"
            r0.append(r5)
            java.lang.Class<com.alibaba.fastjson.parser.ParseContext> r5 = com.alibaba.fastjson.parser.ParseContext.class
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "setContext"
            r8 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r8, r9, r5, r0)
            r8 = 87
            r2.visitInsn(r8)
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            r8 = 3
            r2.visitInsn(r8)
            java.lang.String r8 = "i"
            int r8 = r1.var(r8)
            r24 = r4
            r4 = 54
            r2.visitVarInsn(r4, r8)
            r2.visitLabel(r0)
            int r4 = r1.var(r11)
            r8 = 25
            r2.visitVarInsn(r8, r4)
            r8 = r20
            r4 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r4, r3, r8, r15)
            r4 = 15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.visitLdcInsn(r4)
            r4 = 159(0x9f, float:2.23E-43)
            r2.visitJumpInsn(r4, r5)
            r19 = r5
            r4 = 25
            r5 = 0
            r2.visitVarInsn(r4, r5)
            java.lang.String r4 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r23 = r10
            java.lang.String r10 = r6.name
            r5.append(r10)
            java.lang.String r10 = "_asm_list_item_deser__"
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = com.alibaba.fastjson.util.ASMUtils.desc(r25)
            r20 = r7
            r7 = 180(0xb4, float:2.52E-43)
            r2.visitFieldInsn(r7, r4, r5, r10)
            r4 = 25
            r5 = 1
            r2.visitVarInsn(r4, r5)
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r34)
            com.alibaba.fastjson.asm.Type r4 = com.alibaba.fastjson.asm.Type.getType(r4)
            r2.visitLdcInsn(r4)
            java.lang.String r4 = "i"
            int r4 = r1.var(r4)
            r5 = 21
            r2.visitVarInsn(r5, r4)
            java.lang.String r4 = "valueOf"
            java.lang.String r5 = "(I)Ljava/lang/Integer;"
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r10 = "java/lang/Integer"
            r2.visitMethodInsn(r7, r10, r4, r5)
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.type(r25)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "(L"
            r5.append(r7)
            r5.append(r9)
            java.lang.String r7 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "deserialze"
            r10 = 185(0xb9, float:2.59E-43)
            r2.visitMethodInsn(r10, r4, r7, r5)
            r4 = r27
            int r5 = r1.var(r4)
            r7 = 58
            r2.visitVarInsn(r7, r5)
            java.lang.String r5 = "i"
            int r5 = r1.var(r5)
            r7 = 1
            r2.visitIincInsn(r5, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r6.name
            r5.append(r7)
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            int r5 = r1.var(r5)
            r7 = 25
            r2.visitVarInsn(r7, r5)
            int r4 = r1.var(r4)
            r2.visitVarInsn(r7, r4)
            boolean r4 = r33.isInterface()
            if (r4 == 0) goto L3b4
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.type(r33)
            r10 = 185(0xb9, float:2.59E-43)
            r2.visitMethodInsn(r10, r4, r12, r14)
        L3b1:
            r4 = 87
            goto L3be
        L3b4:
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.type(r33)
            r5 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r5, r4, r12, r14)
            goto L3b1
        L3be:
            r2.visitInsn(r4)
            r5 = 1
            r2.visitVarInsn(r7, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r6.name
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            int r4 = r1.var(r4)
            r2.visitVarInsn(r7, r4)
            java.lang.String r4 = "checkListResolve"
            java.lang.String r5 = "(Ljava/util/Collection;)V"
            r6 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r6, r9, r4, r5)
            int r4 = r1.var(r11)
            r2.visitVarInsn(r7, r4)
            r2.visitMethodInsn(r6, r3, r8, r15)
            r4 = 16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.visitLdcInsn(r4)
            r4 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r4, r0)
            if (r35 == 0) goto L41e
            int r4 = r1.var(r11)
            r2.visitVarInsn(r7, r4)
            r4 = r20
            int r4 = r1.var(r4)
            r5 = 21
            r2.visitVarInsn(r5, r4)
            r10 = r23
            r4 = r24
            r2.visitMethodInsn(r6, r3, r10, r4)
            r4 = r28
        L41b:
            r5 = 167(0xa7, float:2.34E-43)
            goto L426
        L41e:
            r5 = 12
            r4 = r28
            r4._quickNextToken(r1, r2, r5)
            goto L41b
        L426:
            r2.visitJumpInsn(r5, r0)
            r0 = r19
            r2.visitLabel(r0)
            r5 = 1
            r2.visitVarInsn(r7, r5)
            java.lang.String r0 = "listContext"
            int r0 = r1.var(r0)
            r2.visitVarInsn(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "("
            r0.append(r5)
            java.lang.Class<com.alibaba.fastjson.parser.ParseContext> r5 = com.alibaba.fastjson.parser.ParseContext.class
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            r0.append(r5)
            java.lang.String r5 = ")V"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "setContext"
            r6 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r6, r9, r5, r0)
            int r0 = r1.var(r11)
            r14 = 25
            r2.visitVarInsn(r14, r0)
            r2.visitMethodInsn(r6, r3, r8, r15)
            r0 = 15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.visitLdcInsn(r0)
            r3 = r31
            r0 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r0, r3)
            r28._quickNextTokenComma(r29, r30)
            r9 = r21
            r2.visitLabel(r9)
            return
    }

    private void _deserialze_obj(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r16, com.alibaba.fastjson.asm.MethodVisitor r17, com.alibaba.fastjson.asm.Label r18, com.alibaba.fastjson.util.FieldInfo r19, java.lang.Class<?> r20, int r21) {
            r15 = this;
            r1 = r16
            r2 = r17
            r3 = r19
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            java.lang.String r4 = "lexer"
            int r4 = r1.var(r4)
            r7 = 25
            r2.visitVarInsn(r7, r4)
            r8 = 0
            r2.visitVarInsn(r7, r8)
            java.lang.String r4 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = r3.name
            r5.append(r9)
            java.lang.String r9 = "_asm_prefix__"
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r9 = "[C"
            r10 = 180(0xb4, float:2.52E-43)
            r2.visitFieldInsn(r10, r4, r5, r9)
            java.lang.String r4 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            java.lang.String r5 = "matchField"
            java.lang.String r9 = "([C)Z"
            r10 = 182(0xb6, float:2.55E-43)
            r2.visitMethodInsn(r10, r4, r5, r9)
            r4 = 154(0x9a, float:2.16E-43)
            r2.visitJumpInsn(r4, r0)
            r9 = 1
            r2.visitInsn(r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.name
            r4.append(r5)
            java.lang.String r5 = "_asm"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r4 = r1.var(r4)
            r11 = 58
            r2.visitVarInsn(r11, r4)
            r4 = 167(0xa7, float:2.34E-43)
            r2.visitJumpInsn(r4, r6)
            r2.visitLabel(r0)
            r5 = r21
            r15._setFlag(r2, r1, r5)
            java.lang.String r0 = "matchedCount"
            int r4 = r1.var(r0)
            r12 = 21
            r2.visitVarInsn(r12, r4)
            r4 = 4
            r2.visitInsn(r4)
            r4 = 96
            r2.visitInsn(r4)
            r4 = 54
            int r0 = r1.var(r0)
            r2.visitVarInsn(r4, r0)
            r0 = r15
            r4 = r20
            r0._deserObject(r1, r2, r3, r4, r5)
            r2.visitVarInsn(r7, r9)
            java.lang.String r0 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            java.lang.String r4 = "getResolveStatus"
            java.lang.String r5 = "()I"
            r2.visitMethodInsn(r10, r0, r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r2.visitLdcInsn(r4)
            r4 = 160(0xa0, float:2.24E-43)
            r2.visitJumpInsn(r4, r6)
            r2.visitVarInsn(r7, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "()"
            r4.append(r5)
            java.lang.Class<com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask> r12 = com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask.class
            java.lang.String r13 = com.alibaba.fastjson.util.ASMUtils.desc(r12)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = "getLastResolveTask"
            r2.visitMethodInsn(r10, r0, r13, r4)
            java.lang.String r4 = "resolveTask"
            int r13 = r1.var(r4)
            r2.visitVarInsn(r11, r13)
            int r11 = r1.var(r4)
            r2.visitVarInsn(r7, r11)
            r2.visitVarInsn(r7, r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            java.lang.Class<com.alibaba.fastjson.parser.ParseContext> r5 = com.alibaba.fastjson.parser.ParseContext.class
            java.lang.String r13 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = "getContext"
            r2.visitMethodInsn(r10, r0, r13, r11)
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r12)
            java.lang.String r13 = "ownerContext"
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            r14 = 181(0xb5, float:2.54E-43)
            r2.visitFieldInsn(r14, r11, r13, r5)
            int r1 = r1.var(r4)
            r2.visitVarInsn(r7, r1)
            r2.visitVarInsn(r7, r8)
            java.lang.String r1 = r3.name
            r2.visitLdcInsn(r1)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r1 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            java.lang.String r1 = com.alibaba.fastjson.util.ASMUtils.type(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "(Ljava/lang/String;)"
            r3.append(r4)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.FieldDeserializer> r4 = com.alibaba.fastjson.parser.deserializer.FieldDeserializer.class
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "getFieldDeserializer"
            r2.visitMethodInsn(r10, r1, r5, r3)
            java.lang.String r1 = com.alibaba.fastjson.util.ASMUtils.type(r12)
            java.lang.String r3 = "fieldDeserializer"
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r4)
            r2.visitFieldInsn(r14, r1, r3, r4)
            r2.visitVarInsn(r7, r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.visitLdcInsn(r1)
            java.lang.String r1 = "setResolveStatus"
            java.lang.String r3 = "(I)V"
            r2.visitMethodInsn(r10, r0, r1, r3)
            r2.visitLabel(r6)
            return
    }

    private void _getCollectionFieldItemDeser(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r12, com.alibaba.fastjson.asm.MethodVisitor r13, com.alibaba.fastjson.util.FieldInfo r14, java.lang.Class<?> r15) {
            r11 = this;
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            r1 = 25
            r2 = 0
            r13.visitVarInsn(r1, r2)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r14.name
            r4.append(r5)
            java.lang.String r5 = "_asm_list_item_deser__"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r6 = com.alibaba.fastjson.parser.deserializer.ObjectDeserializer.class
            java.lang.String r7 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r8 = 180(0xb4, float:2.52E-43)
            r13.visitFieldInsn(r8, r3, r4, r7)
            r3 = 199(0xc7, float:2.79E-43)
            r13.visitJumpInsn(r3, r0)
            r13.visitVarInsn(r1, r2)
            r3 = 1
            r13.visitVarInsn(r1, r3)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "()"
            r4.append(r7)
            java.lang.Class<com.alibaba.fastjson.parser.ParserConfig> r7 = com.alibaba.fastjson.parser.ParserConfig.class
            java.lang.String r9 = com.alibaba.fastjson.util.ASMUtils.desc(r7)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 182(0xb6, float:2.55E-43)
            java.lang.String r10 = "getConfig"
            r13.visitMethodInsn(r9, r3, r10, r4)
            java.lang.String r15 = com.alibaba.fastjson.util.ASMUtils.desc(r15)
            com.alibaba.fastjson.asm.Type r15 = com.alibaba.fastjson.asm.Type.getType(r15)
            r13.visitLdcInsn(r15)
            java.lang.String r15 = com.alibaba.fastjson.util.ASMUtils.type(r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "(Ljava/lang/reflect/Type;)"
            r3.append(r4)
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "getDeserializer"
            r13.visitMethodInsn(r9, r15, r4, r3)
            java.lang.String r15 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r14.name
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r7 = 181(0xb5, float:2.54E-43)
            r13.visitFieldInsn(r7, r15, r3, r4)
            r13.visitLabel(r0)
            r13.visitVarInsn(r1, r2)
            java.lang.String r12 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r12)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r14 = r14.name
            r15.append(r14)
            r15.append(r5)
            java.lang.String r14 = r15.toString()
            java.lang.String r15 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r13.visitFieldInsn(r8, r12, r14, r15)
            return
    }

    private void _getFieldDeser(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r12, com.alibaba.fastjson.asm.MethodVisitor r13, com.alibaba.fastjson.util.FieldInfo r14) {
            r11 = this;
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            r1 = 25
            r2 = 0
            r13.visitVarInsn(r1, r2)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r14.name
            r4.append(r5)
            java.lang.String r5 = "_asm_deser__"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r6 = com.alibaba.fastjson.parser.deserializer.ObjectDeserializer.class
            java.lang.String r7 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r8 = 180(0xb4, float:2.52E-43)
            r13.visitFieldInsn(r8, r3, r4, r7)
            r3 = 199(0xc7, float:2.79E-43)
            r13.visitJumpInsn(r3, r0)
            r13.visitVarInsn(r1, r2)
            r3 = 1
            r13.visitVarInsn(r1, r3)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "()"
            r4.append(r7)
            java.lang.Class<com.alibaba.fastjson.parser.ParserConfig> r7 = com.alibaba.fastjson.parser.ParserConfig.class
            java.lang.String r9 = com.alibaba.fastjson.util.ASMUtils.desc(r7)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 182(0xb6, float:2.55E-43)
            java.lang.String r10 = "getConfig"
            r13.visitMethodInsn(r9, r3, r10, r4)
            java.lang.Class<?> r3 = r14.fieldClass
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.desc(r3)
            com.alibaba.fastjson.asm.Type r3 = com.alibaba.fastjson.asm.Type.getType(r3)
            r13.visitLdcInsn(r3)
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.type(r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "(Ljava/lang/reflect/Type;)"
            r4.append(r7)
            java.lang.String r7 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "getDeserializer"
            r13.visitMethodInsn(r9, r3, r7, r4)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r14.name
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r9 = 181(0xb5, float:2.54E-43)
            r13.visitFieldInsn(r9, r3, r4, r7)
            r13.visitLabel(r0)
            r13.visitVarInsn(r1, r2)
            java.lang.String r12 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = r14.name
            r0.append(r14)
            r0.append(r5)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r13.visitFieldInsn(r8, r12, r14, r0)
            return
    }

    private void _init(com.alibaba.fastjson.asm.ClassWriter r16, com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r17) {
            r15 = this;
            r1 = r16
            com.alibaba.fastjson.util.FieldInfo[] r0 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r17)
            int r0 = r0.length
            r7 = 0
            r2 = 0
        L9:
            java.lang.String r8 = "[C"
            java.lang.String r9 = "_asm_prefix__"
            r10 = 1
            if (r2 >= r0) goto L32
            com.alibaba.fastjson.util.FieldInfo[] r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r17)
            r3 = r3[r2]
            com.alibaba.fastjson.asm.FieldWriter r4 = new com.alibaba.fastjson.asm.FieldWriter
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.name
            r5.append(r3)
            r5.append(r9)
            java.lang.String r3 = r5.toString()
            r4.<init>(r1, r10, r3, r8)
            r4.visitEnd()
            int r2 = r2 + 1
            goto L9
        L32:
            com.alibaba.fastjson.util.FieldInfo[] r0 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r17)
            int r0 = r0.length
            r2 = 0
        L38:
            if (r2 >= r0) goto L95
            com.alibaba.fastjson.util.FieldInfo[] r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r17)
            r3 = r3[r2]
            java.lang.Class<?> r4 = r3.fieldClass
            boolean r5 = r4.isPrimitive()
            if (r5 == 0) goto L49
            goto L92
        L49:
            java.lang.Class<java.util.Collection> r5 = java.util.Collection.class
            boolean r4 = r5.isAssignableFrom(r4)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r5 = com.alibaba.fastjson.parser.deserializer.ObjectDeserializer.class
            if (r4 == 0) goto L73
            com.alibaba.fastjson.asm.FieldWriter r4 = new com.alibaba.fastjson.asm.FieldWriter
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = r3.name
            r6.append(r3)
            java.lang.String r3 = "_asm_list_item_deser__"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            r4.<init>(r1, r10, r3, r5)
            r4.visitEnd()
            goto L92
        L73:
            com.alibaba.fastjson.asm.FieldWriter r4 = new com.alibaba.fastjson.asm.FieldWriter
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = r3.name
            r6.append(r3)
            java.lang.String r3 = "_asm_deser__"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = com.alibaba.fastjson.util.ASMUtils.desc(r5)
            r4.<init>(r1, r10, r3, r5)
            r4.visitEnd()
        L92:
            int r2 = r2 + 1
            goto L38
        L95:
            com.alibaba.fastjson.asm.MethodWriter r0 = new com.alibaba.fastjson.asm.MethodWriter
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "("
            r2.append(r11)
            java.lang.Class<com.alibaba.fastjson.parser.ParserConfig> r12 = com.alibaba.fastjson.parser.ParserConfig.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.desc(r12)
            r2.append(r3)
            java.lang.Class<com.alibaba.fastjson.util.JavaBeanInfo> r13 = com.alibaba.fastjson.util.JavaBeanInfo.class
            java.lang.String r3 = com.alibaba.fastjson.util.ASMUtils.desc(r13)
            r2.append(r3)
            java.lang.String r14 = ")V"
            r2.append(r14)
            java.lang.String r4 = r2.toString()
            r5 = 0
            r6 = 0
            r2 = 1
            java.lang.String r3 = "<init>"
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = 25
            r0.visitVarInsn(r1, r7)
            r0.visitVarInsn(r1, r10)
            r2 = 2
            r0.visitVarInsn(r1, r2)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r2 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            java.lang.String r2 = com.alibaba.fastjson.util.ASMUtils.type(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r12)
            r3.append(r4)
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r13)
            r3.append(r4)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            r4 = 183(0xb7, float:2.56E-43)
            java.lang.String r5 = "<init>"
            r0.visitMethodInsn(r4, r2, r5, r3)
            com.alibaba.fastjson.util.FieldInfo[] r2 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r17)
            int r2 = r2.length
            r3 = 0
        L100:
            if (r3 >= r2) goto L14e
            com.alibaba.fastjson.util.FieldInfo[] r4 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$200(r17)
            r4 = r4[r3]
            r0.visitVarInsn(r1, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "\""
            r5.append(r6)
            java.lang.String r6 = r4.name
            r5.append(r6)
            java.lang.String r6 = "\":"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.visitLdcInsn(r5)
            java.lang.String r5 = "toCharArray"
            java.lang.String r6 = "()[C"
            r10 = 182(0xb6, float:2.55E-43)
            java.lang.String r11 = "java/lang/String"
            r0.visitMethodInsn(r10, r11, r5, r6)
            java.lang.String r5 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context.access$300(r17)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = r4.name
            r6.append(r4)
            r6.append(r9)
            java.lang.String r4 = r6.toString()
            r6 = 181(0xb5, float:2.54E-43)
            r0.visitFieldInsn(r6, r5, r4, r8)
            int r3 = r3 + 1
            goto L100
        L14e:
            r1 = 177(0xb1, float:2.48E-43)
            r0.visitInsn(r1)
            r1 = 4
            r0.visitMaxs(r1, r1)
            r0.visitEnd()
            return
    }

    private void _isFlag(com.alibaba.fastjson.asm.MethodVisitor r3, com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r4, int r5, com.alibaba.fastjson.asm.Label r6) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "_asm_flag_"
            r0.append(r1)
            int r1 = r5 / 32
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r4 = r4.var(r0)
            r0 = 21
            r3.visitVarInsn(r0, r4)
            r4 = 1
            int r4 = r4 << r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.visitLdcInsn(r4)
            r4 = 126(0x7e, float:1.77E-43)
            r3.visitInsn(r4)
            r4 = 153(0x99, float:2.14E-43)
            r3.visitJumpInsn(r4, r6)
            return
    }

    private void _loadAndSet(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r8, com.alibaba.fastjson.asm.MethodVisitor r9, com.alibaba.fastjson.util.FieldInfo r10) {
            r7 = this;
            java.lang.Class<?> r0 = r10.fieldClass
            java.lang.reflect.Type r1 = r10.fieldType
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = 21
            java.lang.String r4 = "instance"
            java.lang.String r5 = "_asm"
            r6 = 25
            if (r0 != r2) goto L33
            int r0 = r8.var(r4)
            r9.visitVarInsn(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.name
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = r8.var(r0)
            r9.visitVarInsn(r3, r0)
            r7._set(r8, r9, r10)
            return
        L33:
            java.lang.Class r2 = java.lang.Byte.TYPE
            if (r0 == r2) goto L1cc
            java.lang.Class r2 = java.lang.Short.TYPE
            if (r0 == r2) goto L1cc
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r0 == r2) goto L1cc
            java.lang.Class r2 = java.lang.Character.TYPE
            if (r0 != r2) goto L45
            goto L1cc
        L45:
            java.lang.Class r2 = java.lang.Long.TYPE
            r3 = 2
            if (r0 != r2) goto Lb4
            int r0 = r8.var(r4)
            r9.visitVarInsn(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.name
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = r8.var(r0, r3)
            r1 = 22
            r9.visitVarInsn(r1, r0)
            java.lang.reflect.Method r0 = r10.method
            if (r0 == 0) goto L9c
            java.lang.Class r8 = r8.getInstClass()
            java.lang.String r8 = com.alibaba.fastjson.util.ASMUtils.type(r8)
            java.lang.reflect.Method r0 = r10.method
            java.lang.String r0 = r0.getName()
            java.lang.reflect.Method r1 = r10.method
            java.lang.String r1 = com.alibaba.fastjson.util.ASMUtils.desc(r1)
            r2 = 182(0xb6, float:2.55E-43)
            r9.visitMethodInsn(r2, r8, r0, r1)
            java.lang.reflect.Method r8 = r10.method
            java.lang.Class r8 = r8.getReturnType()
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L9b
            r8 = 87
            r9.visitInsn(r8)
        L9b:
            return
        L9c:
            java.lang.Class<?> r8 = r10.declaringClass
            java.lang.String r8 = com.alibaba.fastjson.util.ASMUtils.type(r8)
            java.lang.reflect.Field r0 = r10.field
            java.lang.String r0 = r0.getName()
            java.lang.Class<?> r10 = r10.fieldClass
            java.lang.String r10 = com.alibaba.fastjson.util.ASMUtils.desc(r10)
            r1 = 181(0xb5, float:2.54E-43)
            r9.visitFieldInsn(r1, r8, r0, r10)
            return
        Lb4:
            java.lang.Class r2 = java.lang.Float.TYPE
            if (r0 != r2) goto Ldd
            int r0 = r8.var(r4)
            r9.visitVarInsn(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.name
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = r8.var(r0)
            r1 = 23
            r9.visitVarInsn(r1, r0)
            r7._set(r8, r9, r10)
            return
        Ldd:
            java.lang.Class r2 = java.lang.Double.TYPE
            if (r0 != r2) goto L106
            int r0 = r8.var(r4)
            r9.visitVarInsn(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.name
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = r8.var(r0, r3)
            r1 = 24
            r9.visitVarInsn(r1, r0)
            r7._set(r8, r9, r10)
            return
        L106:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r0 != r2) goto L12d
            int r0 = r8.var(r4)
            r9.visitVarInsn(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.name
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = r8.var(r0)
            r9.visitVarInsn(r6, r0)
            r7._set(r8, r9, r10)
            return
        L12d:
            boolean r3 = r0.isEnum()
            if (r3 == 0) goto L156
            int r0 = r8.var(r4)
            r9.visitVarInsn(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.name
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = r8.var(r0)
            r9.visitVarInsn(r6, r0)
            r7._set(r8, r9, r10)
            return
        L156:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L1a9
            int r3 = r8.var(r4)
            r9.visitVarInsn(r6, r3)
            java.lang.Class r1 = com.alibaba.fastjson.util.TypeUtils.getCollectionItemClass(r1)
            if (r1 != r2) goto L18d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.name
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            int r1 = r8.var(r1)
            r9.visitVarInsn(r6, r1)
            r1 = 192(0xc0, float:2.69E-43)
            java.lang.String r0 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            r9.visitTypeInsn(r1, r0)
            goto L1a5
        L18d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.name
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = r8.var(r0)
            r9.visitVarInsn(r6, r0)
        L1a5:
            r7._set(r8, r9, r10)
            return
        L1a9:
            int r0 = r8.var(r4)
            r9.visitVarInsn(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.name
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = r8.var(r0)
            r9.visitVarInsn(r6, r0)
            r7._set(r8, r9, r10)
            return
        L1cc:
            int r0 = r8.var(r4)
            r9.visitVarInsn(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.name
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = r8.var(r0)
            r9.visitVarInsn(r3, r0)
            r7._set(r8, r9, r10)
            return
    }

    private void _newCollection(com.alibaba.fastjson.asm.MethodVisitor r9, java.lang.Class<?> r10, int r11, boolean r12) {
            r8 = this;
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = r10.isAssignableFrom(r0)
            java.lang.String r1 = "()V"
            java.lang.String r2 = "<init>"
            r3 = 183(0xb7, float:2.56E-43)
            r4 = 89
            r5 = 187(0xbb, float:2.62E-43)
            if (r0 == 0) goto L21
            if (r12 != 0) goto L21
            java.lang.String r11 = "java/util/ArrayList"
            r9.visitTypeInsn(r5, r11)
            r9.visitInsn(r4)
            r9.visitMethodInsn(r3, r11, r2, r1)
            goto Lcb
        L21:
            java.lang.Class<java.util.LinkedList> r0 = java.util.LinkedList.class
            boolean r6 = r10.isAssignableFrom(r0)
            if (r6 == 0) goto L3e
            if (r12 != 0) goto L3e
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            r9.visitTypeInsn(r5, r11)
            r9.visitInsn(r4)
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            r9.visitMethodInsn(r3, r11, r2, r1)
            goto Lcb
        L3e:
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            boolean r6 = r10.isAssignableFrom(r0)
            if (r6 == 0) goto L58
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            r9.visitTypeInsn(r5, r11)
            r9.visitInsn(r4)
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            r9.visitMethodInsn(r3, r11, r2, r1)
            goto Lcb
        L58:
            java.lang.Class<java.util.TreeSet> r6 = java.util.TreeSet.class
            boolean r7 = r10.isAssignableFrom(r6)
            if (r7 == 0) goto L72
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r6)
            r9.visitTypeInsn(r5, r11)
            r9.visitInsn(r4)
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r6)
            r9.visitMethodInsn(r3, r11, r2, r1)
            goto Lcb
        L72:
            java.lang.Class<java.util.LinkedHashSet> r6 = java.util.LinkedHashSet.class
            boolean r7 = r10.isAssignableFrom(r6)
            if (r7 == 0) goto L8c
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r6)
            r9.visitTypeInsn(r5, r11)
            r9.visitInsn(r4)
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r6)
            r9.visitMethodInsn(r3, r11, r2, r1)
            goto Lcb
        L8c:
            if (r12 == 0) goto La0
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            r9.visitTypeInsn(r5, r11)
            r9.visitInsn(r4)
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r0)
            r9.visitMethodInsn(r3, r11, r2, r1)
            goto Lcb
        La0:
            r12 = 25
            r0 = 0
            r9.visitVarInsn(r12, r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9.visitLdcInsn(r11)
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r11 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r11)
            java.lang.String r12 = "getFieldType"
            java.lang.String r0 = "(I)Ljava/lang/reflect/Type;"
            r1 = 182(0xb6, float:2.55E-43)
            r9.visitMethodInsn(r1, r11, r12, r0)
            java.lang.Class<com.alibaba.fastjson.util.TypeUtils> r11 = com.alibaba.fastjson.util.TypeUtils.class
            java.lang.String r11 = com.alibaba.fastjson.util.ASMUtils.type(r11)
            java.lang.String r12 = "createCollection"
            java.lang.String r0 = "(Ljava/lang/reflect/Type;)Ljava/util/Collection;"
            r1 = 184(0xb8, float:2.58E-43)
            r9.visitMethodInsn(r1, r11, r12, r0)
        Lcb:
            r11 = 192(0xc0, float:2.69E-43)
            java.lang.String r10 = com.alibaba.fastjson.util.ASMUtils.type(r10)
            r9.visitTypeInsn(r11, r10)
            return
    }

    private void _quickNextToken(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r10, com.alibaba.fastjson.asm.MethodVisitor r11, int r12) {
            r9 = this;
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            com.alibaba.fastjson.asm.Label r1 = new com.alibaba.fastjson.asm.Label
            r1.<init>()
            java.lang.String r2 = "lexer"
            int r3 = r10.var(r2)
            r4 = 25
            r11.visitVarInsn(r4, r3)
            java.lang.String r3 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            r5 = 182(0xb6, float:2.55E-43)
            java.lang.String r6 = "getCurrent"
            java.lang.String r7 = "()C"
            r11.visitMethodInsn(r5, r3, r6, r7)
            r6 = 12
            r8 = 16
            if (r12 != r6) goto L2c
            r6 = 123(0x7b, float:1.72E-43)
            r11.visitVarInsn(r8, r6)
            goto L35
        L2c:
            r6 = 14
            if (r12 != r6) goto L7f
            r6 = 91
            r11.visitVarInsn(r8, r6)
        L35:
            r6 = 160(0xa0, float:2.24E-43)
            r11.visitJumpInsn(r6, r0)
            int r6 = r10.var(r2)
            r11.visitVarInsn(r4, r6)
            java.lang.String r6 = "next"
            r11.visitMethodInsn(r5, r3, r6, r7)
            r6 = 87
            r11.visitInsn(r6)
            int r6 = r10.var(r2)
            r11.visitVarInsn(r4, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r11.visitLdcInsn(r6)
            java.lang.String r6 = "setToken"
            java.lang.String r7 = "(I)V"
            r11.visitMethodInsn(r5, r3, r6, r7)
            r6 = 167(0xa7, float:2.34E-43)
            r11.visitJumpInsn(r6, r1)
            r11.visitLabel(r0)
            int r10 = r10.var(r2)
            r11.visitVarInsn(r4, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11.visitLdcInsn(r10)
            java.lang.String r10 = "nextToken"
            r11.visitMethodInsn(r5, r3, r10, r7)
            r11.visitLabel(r1)
            return
        L7f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
    }

    private void _quickNextTokenComma(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r17, com.alibaba.fastjson.asm.MethodVisitor r18) {
            r16 = this;
            r0 = r17
            r1 = r18
            com.alibaba.fastjson.asm.Label r2 = new com.alibaba.fastjson.asm.Label
            r2.<init>()
            com.alibaba.fastjson.asm.Label r3 = new com.alibaba.fastjson.asm.Label
            r3.<init>()
            com.alibaba.fastjson.asm.Label r4 = new com.alibaba.fastjson.asm.Label
            r4.<init>()
            com.alibaba.fastjson.asm.Label r5 = new com.alibaba.fastjson.asm.Label
            r5.<init>()
            com.alibaba.fastjson.asm.Label r6 = new com.alibaba.fastjson.asm.Label
            r6.<init>()
            java.lang.String r7 = "lexer"
            int r8 = r0.var(r7)
            r9 = 25
            r1.visitVarInsn(r9, r8)
            java.lang.String r8 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            r10 = 182(0xb6, float:2.55E-43)
            java.lang.String r11 = "getCurrent"
            java.lang.String r12 = "()C"
            r1.visitMethodInsn(r10, r8, r11, r12)
            r11 = 89
            r1.visitInsn(r11)
            java.lang.String r11 = "ch"
            int r13 = r0.var(r11)
            r14 = 54
            r1.visitVarInsn(r14, r13)
            r13 = 44
            r14 = 16
            r1.visitVarInsn(r14, r13)
            r13 = 160(0xa0, float:2.24E-43)
            r1.visitJumpInsn(r13, r3)
            int r15 = r0.var(r7)
            r1.visitVarInsn(r9, r15)
            java.lang.String r15 = "next"
            r1.visitMethodInsn(r10, r8, r15, r12)
            r13 = 87
            r1.visitInsn(r13)
            int r13 = r0.var(r7)
            r1.visitVarInsn(r9, r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r1.visitLdcInsn(r13)
            java.lang.String r13 = "setToken"
            java.lang.String r9 = "(I)V"
            r1.visitMethodInsn(r10, r8, r13, r9)
            r10 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r10, r6)
            r1.visitLabel(r3)
            int r3 = r0.var(r11)
            r10 = 21
            r1.visitVarInsn(r10, r3)
            r3 = 125(0x7d, float:1.75E-43)
            r1.visitVarInsn(r14, r3)
            r3 = 160(0xa0, float:2.24E-43)
            r1.visitJumpInsn(r3, r4)
            int r3 = r0.var(r7)
            r14 = 25
            r1.visitVarInsn(r14, r3)
            r3 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r3, r8, r15, r12)
            r10 = 87
            r1.visitInsn(r10)
            int r10 = r0.var(r7)
            r1.visitVarInsn(r14, r10)
            r10 = 13
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.visitLdcInsn(r10)
            r1.visitMethodInsn(r3, r8, r13, r9)
            r10 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r10, r6)
            r1.visitLabel(r4)
            int r4 = r0.var(r11)
            r10 = 21
            r1.visitVarInsn(r10, r4)
            r4 = 93
            r10 = 16
            r1.visitVarInsn(r10, r4)
            r4 = 160(0xa0, float:2.24E-43)
            r1.visitJumpInsn(r4, r5)
            int r4 = r0.var(r7)
            r14 = 25
            r1.visitVarInsn(r14, r4)
            r1.visitMethodInsn(r3, r8, r15, r12)
            r10 = 87
            r1.visitInsn(r10)
            int r4 = r0.var(r7)
            r1.visitVarInsn(r14, r4)
            r4 = 15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.visitLdcInsn(r4)
            r1.visitMethodInsn(r3, r8, r13, r9)
            r10 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r10, r6)
            r1.visitLabel(r5)
            int r3 = r0.var(r11)
            r10 = 21
            r1.visitVarInsn(r10, r3)
            r3 = 26
            r10 = 16
            r1.visitVarInsn(r10, r3)
            r3 = 160(0xa0, float:2.24E-43)
            r1.visitJumpInsn(r3, r2)
            int r3 = r0.var(r7)
            r14 = 25
            r1.visitVarInsn(r14, r3)
            r3 = 20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.visitLdcInsn(r3)
            r3 = 182(0xb6, float:2.55E-43)
            r1.visitMethodInsn(r3, r8, r13, r9)
            r10 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r10, r6)
            r1.visitLabel(r2)
            int r0 = r0.var(r7)
            r1.visitVarInsn(r14, r0)
            java.lang.String r0 = "nextToken"
            java.lang.String r2 = "()V"
            r1.visitMethodInsn(r3, r8, r0, r2)
            r1.visitLabel(r6)
            return
    }

    private void _set(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r4, com.alibaba.fastjson.asm.MethodVisitor r5, com.alibaba.fastjson.util.FieldInfo r6) {
            r3 = this;
            java.lang.reflect.Method r4 = r6.method
            if (r4 == 0) goto L38
            java.lang.Class r0 = r4.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L11
            r0 = 185(0xb9, float:2.59E-43)
            goto L13
        L11:
            r0 = 182(0xb6, float:2.55E-43)
        L13:
            java.lang.Class<?> r1 = r6.declaringClass
            java.lang.String r1 = com.alibaba.fastjson.util.ASMUtils.type(r1)
            java.lang.String r2 = r4.getName()
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r4)
            r5.visitMethodInsn(r0, r1, r2, r4)
            java.lang.reflect.Method r4 = r6.method
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Void.TYPE
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L37
            r4 = 87
            r5.visitInsn(r4)
        L37:
            return
        L38:
            java.lang.Class<?> r4 = r6.declaringClass
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.type(r4)
            java.lang.reflect.Field r0 = r6.field
            java.lang.String r0 = r0.getName()
            java.lang.Class<?> r6 = r6.fieldClass
            java.lang.String r6 = com.alibaba.fastjson.util.ASMUtils.desc(r6)
            r1 = 181(0xb5, float:2.54E-43)
            r5.visitFieldInsn(r1, r4, r0, r6)
            return
    }

    private void _setContext(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r7, com.alibaba.fastjson.asm.MethodVisitor r8) {
            r6 = this;
            r0 = 1
            r1 = 25
            r8.visitVarInsn(r1, r0)
            java.lang.String r0 = "context"
            int r0 = r7.var(r0)
            r8.visitVarInsn(r1, r0)
            java.lang.String r0 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "("
            r2.append(r3)
            java.lang.Class<com.alibaba.fastjson.parser.ParseContext> r3 = com.alibaba.fastjson.parser.ParseContext.class
            java.lang.String r4 = com.alibaba.fastjson.util.ASMUtils.desc(r3)
            r2.append(r4)
            java.lang.String r4 = ")V"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 182(0xb6, float:2.55E-43)
            java.lang.String r5 = "setContext"
            r8.visitMethodInsn(r4, r0, r5, r2)
            com.alibaba.fastjson.asm.Label r0 = new com.alibaba.fastjson.asm.Label
            r0.<init>()
            java.lang.String r2 = "childContext"
            int r4 = r7.var(r2)
            r8.visitVarInsn(r1, r4)
            r4 = 198(0xc6, float:2.77E-43)
            r8.visitJumpInsn(r4, r0)
            int r2 = r7.var(r2)
            r8.visitVarInsn(r1, r2)
            java.lang.String r2 = "instance"
            int r7 = r7.var(r2)
            r8.visitVarInsn(r1, r7)
            java.lang.String r7 = com.alibaba.fastjson.util.ASMUtils.type(r3)
            java.lang.String r1 = "object"
            java.lang.String r2 = "Ljava/lang/Object;"
            r3 = 181(0xb5, float:2.54E-43)
            r8.visitFieldInsn(r3, r7, r1, r2)
            r8.visitLabel(r0)
            return
    }

    private void _setFlag(com.alibaba.fastjson.asm.MethodVisitor r4, com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r5, int r6) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "_asm_flag_"
            r0.append(r1)
            int r1 = r6 / 32
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 21
            int r2 = r5.var(r0)
            r4.visitVarInsn(r1, r2)
            r1 = 1
            int r6 = r1 << r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.visitLdcInsn(r6)
            r6 = 128(0x80, float:1.8E-43)
            r4.visitInsn(r6)
            r6 = 54
            int r5 = r5.var(r0)
            r4.visitVarInsn(r6, r5)
            return
    }

    private java.lang.Class<?> defineClassPublic(java.lang.String r2, byte[] r3, int r4, int r5) {
            r1 = this;
            com.alibaba.fastjson.util.ASMClassLoader r0 = r1.classLoader
            java.lang.Class r2 = r0.defineClassPublic(r2, r3, r4, r5)
            return r2
    }

    private void defineVarLexer(com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.Context r5, com.alibaba.fastjson.asm.MethodVisitor r6) {
            r4 = this;
            r0 = 25
            r1 = 1
            r6.visitVarInsn(r0, r1)
            java.lang.String r0 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.DefaultJSONParser
            java.lang.Class<com.alibaba.fastjson.parser.JSONLexer> r1 = com.alibaba.fastjson.parser.JSONLexer.class
            java.lang.String r1 = com.alibaba.fastjson.util.ASMUtils.desc(r1)
            r2 = 180(0xb4, float:2.52E-43)
            java.lang.String r3 = "lexer"
            r6.visitFieldInsn(r2, r0, r3, r1)
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r1 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.JSONLexerBase
            r6.visitTypeInsn(r0, r1)
            r0 = 58
            int r5 = r5.var(r3)
            r6.visitVarInsn(r0, r5)
            return
    }

    public com.alibaba.fastjson.parser.deserializer.ObjectDeserializer createJavaBeanDeserializer(com.alibaba.fastjson.parser.ParserConfig r11, com.alibaba.fastjson.util.JavaBeanInfo r12) throws java.lang.Exception {
            r10 = this;
            java.lang.Class<?> r0 = r12.clazz
            boolean r1 = r0.isPrimitive()
            if (r1 != 0) goto Lc2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FastjsonASMDeserializer_"
            r1.append(r2)
            java.util.concurrent.atomic.AtomicLong r2 = r10.seed
            long r2 = r2.incrementAndGet()
            r1.append(r2)
            java.lang.String r2 = "_"
            r1.append(r2)
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory> r1 = com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory.class
            java.lang.Package r1 = r1.getPackage()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 46
            r4 = 47
            java.lang.String r3 = r1.replace(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r7 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.alibaba.fastjson.asm.ClassWriter r4 = new com.alibaba.fastjson.asm.ClassWriter
            r4.<init>()
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r1 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            java.lang.String r8 = com.alibaba.fastjson.util.ASMUtils.type(r1)
            r9 = 0
            r5 = 49
            r6 = 33
            r4.visit(r5, r6, r7, r8, r9)
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context r1 = new com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context
            r2 = 3
            r1.<init>(r7, r11, r12, r2)
            r10._init(r4, r1)
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context r1 = new com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context
            r1.<init>(r7, r11, r12, r2)
            r10._createInstance(r4, r1)
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context r1 = new com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context
            r2 = 5
            r1.<init>(r7, r11, r12, r2)
            r10._deserialze(r4, r1)
            com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context r1 = new com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context
            r2 = 4
            r1.<init>(r7, r11, r12, r2)
            r10._deserialzeArrayMapping(r4, r1)
            byte[] r1 = r4.toByteArray()
            int r2 = r1.length
            r3 = 0
            java.lang.Class r0 = r10.defineClassPublic(r0, r1, r3, r2)
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class<com.alibaba.fastjson.parser.ParserConfig> r4 = com.alibaba.fastjson.parser.ParserConfig.class
            r2[r3] = r4
            java.lang.Class<com.alibaba.fastjson.util.JavaBeanInfo> r4 = com.alibaba.fastjson.util.JavaBeanInfo.class
            r5 = 1
            r2[r5] = r4
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            r1[r5] = r12
            java.lang.Object r11 = r0.newInstance(r1)
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r11 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r11
            return r11
        Lc2:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "not support type :"
            r12.append(r1)
            java.lang.String r0 = r0.getName()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }
}
