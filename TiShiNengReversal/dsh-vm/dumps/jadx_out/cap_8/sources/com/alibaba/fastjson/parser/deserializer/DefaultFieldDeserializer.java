package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DefaultFieldDeserializer extends com.alibaba.fastjson.parser.deserializer.FieldDeserializer {
    protected com.alibaba.fastjson.parser.deserializer.ObjectDeserializer fieldValueDeserilizer;

    public DefaultFieldDeserializer(com.alibaba.fastjson.parser.ParserConfig r1, java.lang.Class<?> r2, com.alibaba.fastjson.util.FieldInfo r3) {
            r0 = this;
            r0.<init>(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public int getFastMatchToken() {
            r1 = this;
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r1.fieldValueDeserilizer
            if (r0 == 0) goto L9
            int r0 = r0.getFastMatchToken()
            return r0
        L9:
            r0 = 2
            return r0
    }

    public com.alibaba.fastjson.parser.deserializer.ObjectDeserializer getFieldValueDeserilizer(com.alibaba.fastjson.parser.ParserConfig r4) {
            r3 = this;
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r3.fieldValueDeserilizer
            if (r0 != 0) goto L36
            com.alibaba.fastjson.util.FieldInfo r0 = r3.fieldInfo
            com.alibaba.fastjson.annotation.JSONField r0 = r0.getAnnotation()
            if (r0 == 0) goto L2a
            java.lang.Class r1 = r0.deserializeUsing()
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            if (r1 == r2) goto L2a
            java.lang.Class r4 = r0.deserializeUsing()
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.Exception -> L21
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r4 = (com.alibaba.fastjson.parser.deserializer.ObjectDeserializer) r4     // Catch: java.lang.Exception -> L21
            r3.fieldValueDeserilizer = r4     // Catch: java.lang.Exception -> L21
            goto L36
        L21:
            r4 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "create deserializeUsing ObjectDeserializer error"
            r0.<init>(r1, r4)
            throw r0
        L2a:
            com.alibaba.fastjson.util.FieldInfo r0 = r3.fieldInfo
            java.lang.Class<?> r1 = r0.fieldClass
            java.lang.reflect.Type r0 = r0.fieldType
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r4 = r4.getDeserializer(r1, r0)
            r3.fieldValueDeserilizer = r4
        L36:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r4 = r3.fieldValueDeserilizer
            return r4
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void parseField(com.alibaba.fastjson.parser.DefaultJSONParser r8, java.lang.Object r9, java.lang.reflect.Type r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
            r7 = this;
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r7.fieldValueDeserilizer
            if (r0 != 0) goto Lb
            com.alibaba.fastjson.parser.ParserConfig r0 = r8.getConfig()
            r7.getFieldValueDeserilizer(r0)
        Lb:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r7.fieldValueDeserilizer
            com.alibaba.fastjson.util.FieldInfo r1 = r7.fieldInfo
            java.lang.reflect.Type r1 = r1.fieldType
            boolean r2 = r10 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L2b
            com.alibaba.fastjson.parser.ParseContext r0 = r8.getContext()
            if (r0 == 0) goto L1d
            r0.type = r10
        L1d:
            java.lang.Class<?> r0 = r7.clazz
            java.lang.reflect.Type r1 = com.alibaba.fastjson.util.FieldInfo.getFieldType(r0, r10, r1)
            com.alibaba.fastjson.parser.ParserConfig r10 = r8.getConfig()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r10.getDeserializer(r1)
        L2b:
            r3 = r1
            boolean r10 = r0 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            if (r10 == 0) goto L40
            com.alibaba.fastjson.util.FieldInfo r10 = r7.fieldInfo
            int r1 = r10.parserFeatures
            if (r1 == 0) goto L40
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r0 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r0
            java.lang.String r10 = r10.name
            java.lang.Object r10 = r0.deserialze(r8, r3, r10, r1)
            r2 = r8
            goto L5e
        L40:
            com.alibaba.fastjson.util.FieldInfo r10 = r7.fieldInfo
            java.lang.String r5 = r10.format
            if (r5 == 0) goto L57
            boolean r1 = r0 instanceof com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer
            if (r1 == 0) goto L57
            r1 = r0
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer r1 = (com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer) r1
            java.lang.String r4 = r10.name
            int r6 = r10.parserFeatures
            r2 = r8
            java.lang.Object r10 = r1.deserialze(r2, r3, r4, r5, r6)
            goto L5e
        L57:
            r2 = r8
            java.lang.String r8 = r10.name
            java.lang.Object r10 = r0.deserialze(r2, r3, r8)
        L5e:
            boolean r8 = r10 instanceof byte[]
            r0 = 0
            if (r8 == 0) goto Lad
            com.alibaba.fastjson.util.FieldInfo r8 = r7.fieldInfo
            java.lang.String r8 = r8.format
            java.lang.String r1 = "gzip"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L7b
            com.alibaba.fastjson.util.FieldInfo r8 = r7.fieldInfo
            java.lang.String r8 = r8.format
            java.lang.String r1 = "gzip,base64"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto Lad
        L7b:
            byte[] r10 = (byte[]) r10
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> L9c
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L9c
            r1.<init>(r10)     // Catch: java.io.IOException -> L9c
            r8.<init>(r1)     // Catch: java.io.IOException -> L9c
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L9c
            r10.<init>()     // Catch: java.io.IOException -> L9c
        L8c:
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L9c
            int r3 = r8.read(r1)     // Catch: java.io.IOException -> L9c
            r4 = -1
            if (r3 != r4) goto L9f
            byte[] r10 = r10.toByteArray()     // Catch: java.io.IOException -> L9c
            goto Lad
        L9c:
            r0 = move-exception
            r8 = r0
            goto La5
        L9f:
            if (r3 <= 0) goto L8c
            r10.write(r1, r0, r3)     // Catch: java.io.IOException -> L9c
            goto L8c
        La5:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            java.lang.String r10 = "unzip bytes error."
            r9.<init>(r10, r8)
            throw r9
        Lad:
            int r8 = r2.getResolveStatus()
            r1 = 1
            if (r8 != r1) goto Lc4
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r8 = r2.getLastResolveTask()
            r8.fieldDeserializer = r7
            com.alibaba.fastjson.parser.ParseContext r9 = r2.getContext()
            r8.ownerContext = r9
            r2.setResolveStatus(r0)
            return
        Lc4:
            if (r9 != 0) goto Lce
            com.alibaba.fastjson.util.FieldInfo r8 = r7.fieldInfo
            java.lang.String r8 = r8.name
            r11.put(r8, r10)
            return
        Lce:
            r7.setValue(r9, r10)
            return
    }

    public void parseFieldUnwrapped(com.alibaba.fastjson.parser.DefaultJSONParser r1, java.lang.Object r2, java.lang.reflect.Type r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r0 = this;
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.String r2 = "TODO"
            r1.<init>(r2)
            throw r1
    }
}
