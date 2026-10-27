package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ObjectArrayCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.ObjectArrayCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.ObjectArrayCodec r0 = new com.alibaba.fastjson.serializer.ObjectArrayCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.ObjectArrayCodec.instance = r0
            return
    }

    public ObjectArrayCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    private <T> T toObjectArray(com.alibaba.fastjson.parser.DefaultJSONParser r12, java.lang.Class<?> r13, com.alibaba.fastjson.JSONArray r14) {
            r11 = this;
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            int r1 = r14.size()
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r13, r1)
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r1) goto L65
            java.lang.Object r5 = r14.get(r4)
            if (r5 != r14) goto L1a
            java.lang.reflect.Array.set(r2, r4, r2)
            goto L62
        L1a:
            boolean r6 = r13.isArray()
            if (r6 == 0) goto L31
            boolean r6 = r13.isInstance(r5)
            if (r6 == 0) goto L27
            goto L2d
        L27:
            com.alibaba.fastjson.JSONArray r5 = (com.alibaba.fastjson.JSONArray) r5
            java.lang.Object r5 = r11.toObjectArray(r12, r13, r5)
        L2d:
            java.lang.reflect.Array.set(r2, r4, r5)
            goto L62
        L31:
            boolean r6 = r5 instanceof com.alibaba.fastjson.JSONArray
            if (r6 == 0) goto L54
            r6 = r5
            com.alibaba.fastjson.JSONArray r6 = (com.alibaba.fastjson.JSONArray) r6
            int r7 = r6.size()
            r8 = 0
            r9 = 0
        L3e:
            if (r8 >= r7) goto L4d
            java.lang.Object r10 = r6.get(r8)
            if (r10 != r14) goto L4a
            r6.set(r4, r2)
            r9 = 1
        L4a:
            int r8 = r8 + 1
            goto L3e
        L4d:
            if (r9 == 0) goto L54
            java.lang.Object[] r6 = r6.toArray()
            goto L55
        L54:
            r6 = r0
        L55:
            if (r6 != 0) goto L5f
            com.alibaba.fastjson.parser.ParserConfig r6 = r12.getConfig()
            java.lang.Object r6 = com.alibaba.fastjson.util.TypeUtils.cast(r5, r13, r6)
        L5f:
            java.lang.reflect.Array.set(r2, r4, r6)
        L62:
            int r4 = r4 + 1
            goto Le
        L65:
            r14.setRelatedArray(r2)
            r14.setComponentType(r13)
            return r2
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r8, java.lang.reflect.Type r9, java.lang.Object r10) {
            r7 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r8.lexer
            int r1 = r0.token()
            r2 = 8
            r3 = 16
            r4 = 0
            if (r1 != r2) goto L11
            r0.nextToken(r3)
            return r4
        L11:
            r2 = 4
            if (r1 == r2) goto L90
            r2 = 26
            if (r1 != r2) goto L1a
            goto L90
        L1a:
            boolean r0 = r9 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L7c
            java.lang.reflect.GenericArrayType r9 = (java.lang.reflect.GenericArrayType) r9
            java.lang.reflect.Type r9 = r9.getGenericComponentType()
            boolean r0 = r9 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L77
            r0 = r9
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            com.alibaba.fastjson.parser.ParseContext r1 = r8.getContext()
            java.lang.reflect.Type r1 = r1.type
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            r3 = 0
            if (r2 == 0) goto L6c
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r2 = r1.getRawType()
            boolean r5 = r2 instanceof java.lang.Class
            if (r5 == 0) goto L62
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.reflect.TypeVariable[] r2 = r2.getTypeParameters()
        L46:
            int r5 = r2.length
            if (r3 >= r5) goto L62
            r5 = r2[r3]
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = r0.getName()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5f
            java.lang.reflect.Type[] r4 = r1.getActualTypeArguments()
            r4 = r4[r3]
        L5f:
            int r3 = r3 + 1
            goto L46
        L62:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L69
            java.lang.Class r4 = (java.lang.Class) r4
            goto L83
        L69:
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            goto L83
        L6c:
            java.lang.reflect.Type[] r0 = r0.getBounds()
            r0 = r0[r3]
            java.lang.Class r4 = com.alibaba.fastjson.util.TypeUtils.getClass(r0)
            goto L83
        L77:
            java.lang.Class r4 = com.alibaba.fastjson.util.TypeUtils.getClass(r9)
            goto L83
        L7c:
            java.lang.Class r9 = (java.lang.Class) r9
            java.lang.Class r9 = r9.getComponentType()
            r4 = r9
        L83:
            com.alibaba.fastjson.JSONArray r0 = new com.alibaba.fastjson.JSONArray
            r0.<init>()
            r8.parseArray(r9, r0, r10)
            java.lang.Object r8 = r7.toObjectArray(r8, r4, r0)
            return r8
        L90:
            byte[] r8 = r0.bytesValue()
            r0.nextToken(r3)
            int r10 = r8.length
            if (r10 != 0) goto L9f
            java.lang.Class<byte[]> r10 = byte[].class
            if (r9 == r10) goto L9f
            return r4
        L9f:
            return r8
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 14
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(com.alibaba.fastjson.serializer.JSONSerializer r16, java.lang.Object r17, java.lang.Object r18, java.lang.reflect.Type r19, int r20) throws java.io.IOException {
            r15 = this;
            r1 = r16
            r0 = r17
            com.alibaba.fastjson.serializer.SerializeWriter r6 = r1.out
            r7 = r0
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            if (r0 != 0) goto L11
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            r6.writeNull(r0)
            return
        L11:
            int r2 = r7.length
            int r8 = r2 + (-1)
            r3 = -1
            if (r8 != r3) goto L1d
            java.lang.String r0 = "[]"
            r6.append(r0)
            return
        L1d:
            com.alibaba.fastjson.serializer.SerialContext r9 = r1.context
            r3 = 0
            r4 = r18
            r1.setContext(r9, r0, r4, r3)
            r0 = 91
            r6.append(r0)     // Catch: java.lang.Throwable -> L47
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch: java.lang.Throwable -> L47
            boolean r0 = r6.isEnabled(r0)     // Catch: java.lang.Throwable -> L47
            r10 = 93
            r11 = 44
            if (r0 == 0) goto L5e
            r1.incrementIndent()     // Catch: java.lang.Throwable -> L47
            r1.println()     // Catch: java.lang.Throwable -> L47
        L3c:
            if (r3 >= r2) goto L52
            if (r3 == 0) goto L4a
            r6.write(r11)     // Catch: java.lang.Throwable -> L47
            r1.println()     // Catch: java.lang.Throwable -> L47
            goto L4a
        L47:
            r0 = move-exception
            goto Lb6
        L4a:
            r0 = r7[r3]     // Catch: java.lang.Throwable -> L47
            r1.write(r0)     // Catch: java.lang.Throwable -> L47
            int r3 = r3 + 1
            goto L3c
        L52:
            r1.decrementIdent()     // Catch: java.lang.Throwable -> L47
            r1.println()     // Catch: java.lang.Throwable -> L47
            r6.write(r10)     // Catch: java.lang.Throwable -> L47
            r1.context = r9
            return
        L5e:
            r0 = 0
            r12 = r0
            r13 = 0
        L61:
            if (r13 >= r8) goto L95
            r2 = r7[r13]     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L6d
            java.lang.String r2 = "null,"
            r6.append(r2)     // Catch: java.lang.Throwable -> L47
            goto L92
        L6d:
            boolean r3 = r1.containsReference(r2)     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L77
            r1.writeReference(r2)     // Catch: java.lang.Throwable -> L47
            goto L8f
        L77:
            java.lang.Class r14 = r2.getClass()     // Catch: java.lang.Throwable -> L47
            if (r14 != r12) goto L84
            r4 = 0
            r5 = 0
            r3 = 0
            r0.write(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L47
            goto L8f
        L84:
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = r1.getObjectWriter(r14)     // Catch: java.lang.Throwable -> L47
            r4 = 0
            r5 = 0
            r3 = 0
            r0.write(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L47
            r12 = r14
        L8f:
            r6.append(r11)     // Catch: java.lang.Throwable -> L47
        L92:
            int r13 = r13 + 1
            goto L61
        L95:
            r0 = r7[r8]     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L9f
            java.lang.String r0 = "null]"
            r6.append(r0)     // Catch: java.lang.Throwable -> L47
            goto Lb3
        L9f:
            boolean r2 = r1.containsReference(r0)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto La9
            r1.writeReference(r0)     // Catch: java.lang.Throwable -> L47
            goto Lb0
        La9:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L47
            r1.writeWithFieldName(r0, r2)     // Catch: java.lang.Throwable -> L47
        Lb0:
            r6.append(r10)     // Catch: java.lang.Throwable -> L47
        Lb3:
            r1.context = r9
            return
        Lb6:
            r1.context = r9
            throw r0
    }
}
