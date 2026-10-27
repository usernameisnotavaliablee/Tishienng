package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ArrayListTypeFieldDeserializer extends com.alibaba.fastjson.parser.deserializer.FieldDeserializer {
    private com.alibaba.fastjson.parser.deserializer.ObjectDeserializer deserializer;
    private int itemFastMatchToken;
    private final java.lang.reflect.Type itemType;

    public ArrayListTypeFieldDeserializer(com.alibaba.fastjson.parser.ParserConfig r3, java.lang.Class<?> r4, com.alibaba.fastjson.util.FieldInfo r5) {
            r2 = this;
            r2.<init>(r4, r5)
            java.lang.reflect.Type r3 = r5.fieldType
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L26
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r4 = 0
            r3 = r3[r4]
            boolean r5 = r3 instanceof java.lang.reflect.WildcardType
            if (r5 == 0) goto L23
            r5 = r3
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r5 = r5.getUpperBounds()
            int r0 = r5.length
            r1 = 1
            if (r0 != r1) goto L23
            r3 = r5[r4]
        L23:
            r2.itemType = r3
            return
        L26:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r2.itemType = r3
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 14
            return r0
    }

    public final void parseArray(com.alibaba.fastjson.parser.DefaultJSONParser r13, java.lang.reflect.Type r14, java.util.Collection r15) {
            r12 = this;
            java.lang.reflect.Type r0 = r12.itemType
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = r12.deserializer
            boolean r2 = r14 instanceof java.lang.reflect.ParameterizedType
            r3 = 0
            if (r2 == 0) goto Lbf
            boolean r2 = r0 instanceof java.lang.reflect.TypeVariable
            r4 = 0
            r5 = -1
            if (r2 == 0) goto L5e
            r2 = r0
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.reflect.ParameterizedType r14 = (java.lang.reflect.ParameterizedType) r14
            java.lang.reflect.Type r6 = r14.getRawType()
            boolean r6 = r6 instanceof java.lang.Class
            if (r6 == 0) goto L22
            java.lang.reflect.Type r4 = r14.getRawType()
            java.lang.Class r4 = (java.lang.Class) r4
        L22:
            if (r4 == 0) goto L44
            java.lang.reflect.TypeVariable[] r6 = r4.getTypeParameters()
            int r6 = r6.length
            r7 = 0
        L2a:
            if (r7 >= r6) goto L44
            java.lang.reflect.TypeVariable[] r8 = r4.getTypeParameters()
            r8 = r8[r7]
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = r2.getName()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L41
            goto L45
        L41:
            int r7 = r7 + 1
            goto L2a
        L44:
            r7 = -1
        L45:
            if (r7 == r5) goto Lbf
            java.lang.reflect.Type[] r14 = r14.getActualTypeArguments()
            r0 = r14[r7]
            java.lang.reflect.Type r14 = r12.itemType
            boolean r14 = r0.equals(r14)
            if (r14 != 0) goto Lbf
            com.alibaba.fastjson.parser.ParserConfig r14 = r13.getConfig()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = r14.getDeserializer(r0)
            goto Lbf
        L5e:
            boolean r2 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto Lbf
            r2 = r0
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r6 = r2.getActualTypeArguments()
            int r7 = r6.length
            r8 = 1
            if (r7 != r8) goto Lbf
            r7 = r6[r3]
            boolean r8 = r7 instanceof java.lang.reflect.TypeVariable
            if (r8 == 0) goto Lbf
            java.lang.reflect.TypeVariable r7 = (java.lang.reflect.TypeVariable) r7
            java.lang.reflect.ParameterizedType r14 = (java.lang.reflect.ParameterizedType) r14
            java.lang.reflect.Type r8 = r14.getRawType()
            boolean r8 = r8 instanceof java.lang.Class
            if (r8 == 0) goto L85
            java.lang.reflect.Type r4 = r14.getRawType()
            java.lang.Class r4 = (java.lang.Class) r4
        L85:
            if (r4 == 0) goto La7
            java.lang.reflect.TypeVariable[] r8 = r4.getTypeParameters()
            int r8 = r8.length
            r9 = 0
        L8d:
            if (r9 >= r8) goto La7
            java.lang.reflect.TypeVariable[] r10 = r4.getTypeParameters()
            r10 = r10[r9]
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = r7.getName()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto La4
            goto La8
        La4:
            int r9 = r9 + 1
            goto L8d
        La7:
            r9 = -1
        La8:
            if (r9 == r5) goto Lbf
            java.lang.reflect.Type[] r14 = r14.getActualTypeArguments()
            r14 = r14[r9]
            r6[r3] = r14
            com.alibaba.fastjson.util.ParameterizedTypeImpl r0 = new com.alibaba.fastjson.util.ParameterizedTypeImpl
            java.lang.reflect.Type r14 = r2.getOwnerType()
            java.lang.reflect.Type r2 = r2.getRawType()
            r0.<init>(r6, r14, r2)
        Lbf:
            com.alibaba.fastjson.parser.JSONLexer r14 = r13.lexer
            int r2 = r14.token()
            r4 = 14
            if (r2 != r4) goto L11d
            if (r1 != 0) goto Ldb
            com.alibaba.fastjson.parser.ParserConfig r1 = r13.getConfig()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = r1.getDeserializer(r0)
            r12.deserializer = r1
            int r2 = r1.getFastMatchToken()
            r12.itemFastMatchToken = r2
        Ldb:
            r2 = r1
            int r1 = r12.itemFastMatchToken
            r14.nextToken(r1)
        Le1:
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas
            boolean r1 = r14.isEnabled(r1)
            r4 = 16
            if (r1 == 0) goto Lf5
        Leb:
            int r1 = r14.token()
            if (r1 != r4) goto Lf5
            r14.nextToken()
            goto Leb
        Lf5:
            int r1 = r14.token()
            r5 = 15
            if (r1 != r5) goto L101
            r14.nextToken(r4)
            return
        L101:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r2.deserialze(r13, r0, r1)
            r15.add(r1)
            r13.checkListResolve(r15)
            int r1 = r14.token()
            if (r1 != r4) goto L11a
            int r1 = r12.itemFastMatchToken
            r14.nextToken(r1)
        L11a:
            int r3 = r3 + 1
            goto Le1
        L11d:
            if (r1 != 0) goto L129
            com.alibaba.fastjson.parser.ParserConfig r14 = r13.getConfig()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = r14.getDeserializer(r0)
            r12.deserializer = r1
        L129:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            java.lang.Object r14 = r1.deserialze(r13, r0, r14)
            r15.add(r14)
            r13.checkListResolve(r15)
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void parseField(com.alibaba.fastjson.parser.DefaultJSONParser r4, java.lang.Object r5, java.lang.reflect.Type r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
            r3 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.lexer
            int r1 = r0.token()
            r2 = 8
            if (r1 == r2) goto L3c
            r2 = 4
            if (r1 != r2) goto L18
            java.lang.String r0 = r0.stringVal()
            int r0 = r0.length()
            if (r0 != 0) goto L18
            goto L3c
        L18:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.alibaba.fastjson.parser.ParseContext r1 = r4.getContext()
            com.alibaba.fastjson.util.FieldInfo r2 = r3.fieldInfo
            java.lang.String r2 = r2.name
            r4.setContext(r1, r5, r2)
            r3.parseArray(r4, r6, r0)
            r4.setContext(r1)
            if (r5 != 0) goto L38
            com.alibaba.fastjson.util.FieldInfo r4 = r3.fieldInfo
            java.lang.String r4 = r4.name
            r7.put(r4, r0)
            return
        L38:
            r3.setValue(r5, r0)
            return
        L3c:
            r4 = 0
            r3.setValue(r5, r4)
            return
    }
}
