package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AnnotationSerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static com.alibaba.fastjson.serializer.AnnotationSerializer instance;

    static {
            com.alibaba.fastjson.serializer.AnnotationSerializer r0 = new com.alibaba.fastjson.serializer.AnnotationSerializer
            r0.<init>()
            com.alibaba.fastjson.serializer.AnnotationSerializer.instance = r0
            return
    }

    public AnnotationSerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r4, java.lang.Object r5, java.lang.Object r6, java.lang.reflect.Type r7, int r8) throws java.io.IOException {
            r3 = this;
            java.lang.Class r6 = r5.getClass()
            java.lang.Class[] r6 = r6.getInterfaces()
            int r7 = r6.length
            r8 = 1
            if (r7 != r8) goto L59
            r7 = 0
            r8 = r6[r7]
            boolean r8 = r8.isAnnotation()
            if (r8 == 0) goto L59
            r6 = r6[r7]
            sun.reflect.annotation.AnnotationType r6 = sun.reflect.annotation.AnnotationType.getInstance(r6)
            java.util.Map r6 = r6.members()
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            int r8 = r6.size()
            r7.<init>(r8)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
            r0 = r8
        L32:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L48
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r2.invoke(r5, r8)     // Catch: java.lang.Throwable -> L48
        L48:
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = com.alibaba.fastjson.JSON.toJSON(r0)
            r7.put2(r1, r2)
            goto L32
        L56:
            r4.write(r7)
        L59:
            return
    }
}
