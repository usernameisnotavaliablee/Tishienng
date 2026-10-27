package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JavaObjectDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer instance = null;

    static {
            com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer
            r0.<init>()
            com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer.instance = r0
            return
    }

    public JavaObjectDeserializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r2, java.lang.reflect.Type r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L38
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            boolean r4 = r3 instanceof java.lang.reflect.TypeVariable
            if (r4 == 0) goto L17
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.reflect.Type[] r3 = r3.getBounds()
            r4 = 0
            r3 = r3[r4]
        L17:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.parseArray(r3, r4)
            boolean r2 = r3 instanceof java.lang.Class
            if (r2 == 0) goto L33
            java.lang.Class r3 = (java.lang.Class) r3
            int r2 = r4.size()
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4.toArray(r2)
            return r2
        L33:
            java.lang.Object[] r2 = r4.toArray()
            return r2
        L38:
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L49
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r3 == r0) goto L49
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            if (r3 == r0) goto L49
            java.lang.Object r2 = r2.parseObject(r3)
            return r2
        L49:
            java.lang.Object r2 = r2.parse(r4)
            return r2
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 12
            return r0
    }
}
