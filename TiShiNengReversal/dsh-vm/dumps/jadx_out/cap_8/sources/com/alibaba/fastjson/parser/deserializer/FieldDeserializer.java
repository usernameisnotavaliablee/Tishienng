package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class FieldDeserializer {
    protected com.alibaba.fastjson.serializer.BeanContext beanContext;
    protected final java.lang.Class<?> clazz;
    public final com.alibaba.fastjson.util.FieldInfo fieldInfo;

    public FieldDeserializer(java.lang.Class<?> r1, com.alibaba.fastjson.util.FieldInfo r2) {
            r0 = this;
            r0.<init>()
            r0.clazz = r1
            r0.fieldInfo = r2
            return
    }

    public int getFastMatchToken() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract void parseField(com.alibaba.fastjson.parser.DefaultJSONParser r1, java.lang.Object r2, java.lang.reflect.Type r3, java.util.Map<java.lang.String, java.lang.Object> r4);

    public void setValue(java.lang.Object r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setValue(r1, r2)
            return
    }

    public void setValue(java.lang.Object r1, long r2) {
            r0 = this;
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.setValue(r1, r2)
            return
    }

    public void setValue(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            if (r9 != 0) goto Le
            com.alibaba.fastjson.util.FieldInfo r0 = r7.fieldInfo
            java.lang.Class<?> r0 = r0.fieldClass
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto Le
            goto L107
        Le:
            com.alibaba.fastjson.util.FieldInfo r0 = r7.fieldInfo     // Catch: java.lang.Exception -> L37
            java.lang.reflect.Method r1 = r0.method     // Catch: java.lang.Exception -> L37
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r3 = java.util.concurrent.atomic.AtomicBoolean.class
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r4 = java.util.concurrent.atomic.AtomicLong.class
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r5 = java.util.concurrent.atomic.AtomicInteger.class
            if (r1 == 0) goto L97
            boolean r6 = r0.getOnly     // Catch: java.lang.Exception -> L37
            if (r6 == 0) goto L8d
            java.lang.Class<?> r0 = r0.fieldClass     // Catch: java.lang.Exception -> L37
            r6 = 0
            if (r0 != r5) goto L3a
            java.lang.Object r8 = r1.invoke(r8, r6)     // Catch: java.lang.Exception -> L37
            java.util.concurrent.atomic.AtomicInteger r8 = (java.util.concurrent.atomic.AtomicInteger) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            java.util.concurrent.atomic.AtomicInteger r9 = (java.util.concurrent.atomic.AtomicInteger) r9     // Catch: java.lang.Exception -> L37
            int r9 = r9.get()     // Catch: java.lang.Exception -> L37
            r8.set(r9)     // Catch: java.lang.Exception -> L37
            return
        L37:
            r8 = move-exception
            goto L108
        L3a:
            if (r0 != r4) goto L4e
            java.lang.Object r8 = r1.invoke(r8, r6)     // Catch: java.lang.Exception -> L37
            java.util.concurrent.atomic.AtomicLong r8 = (java.util.concurrent.atomic.AtomicLong) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            java.util.concurrent.atomic.AtomicLong r9 = (java.util.concurrent.atomic.AtomicLong) r9     // Catch: java.lang.Exception -> L37
            long r0 = r9.get()     // Catch: java.lang.Exception -> L37
            r8.set(r0)     // Catch: java.lang.Exception -> L37
            return
        L4e:
            if (r0 != r3) goto L62
            java.lang.Object r8 = r1.invoke(r8, r6)     // Catch: java.lang.Exception -> L37
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9     // Catch: java.lang.Exception -> L37
            boolean r9 = r9.get()     // Catch: java.lang.Exception -> L37
            r8.set(r9)     // Catch: java.lang.Exception -> L37
            return
        L62:
            java.lang.Class r0 = r1.getReturnType()     // Catch: java.lang.Exception -> L37
            boolean r0 = r2.isAssignableFrom(r0)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L7a
            java.lang.Object r8 = r1.invoke(r8, r6)     // Catch: java.lang.Exception -> L37
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L37
            r8.putAll(r9)     // Catch: java.lang.Exception -> L37
            return
        L7a:
            java.lang.Object r8 = r1.invoke(r8, r6)     // Catch: java.lang.Exception -> L37
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            if (r9 == 0) goto L107
            r8.clear()     // Catch: java.lang.Exception -> L37
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Exception -> L37
            r8.addAll(r9)     // Catch: java.lang.Exception -> L37
            return
        L8d:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L37
            r2 = 0
            r0[r2] = r9     // Catch: java.lang.Exception -> L37
            r1.invoke(r8, r0)     // Catch: java.lang.Exception -> L37
            return
        L97:
            java.lang.reflect.Field r1 = r0.field     // Catch: java.lang.Exception -> L37
            boolean r6 = r0.getOnly     // Catch: java.lang.Exception -> L37
            if (r6 == 0) goto L102
            java.lang.Class<?> r0 = r0.fieldClass     // Catch: java.lang.Exception -> L37
            if (r0 != r5) goto Lb3
            java.lang.Object r8 = r1.get(r8)     // Catch: java.lang.Exception -> L37
            java.util.concurrent.atomic.AtomicInteger r8 = (java.util.concurrent.atomic.AtomicInteger) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            java.util.concurrent.atomic.AtomicInteger r9 = (java.util.concurrent.atomic.AtomicInteger) r9     // Catch: java.lang.Exception -> L37
            int r9 = r9.get()     // Catch: java.lang.Exception -> L37
            r8.set(r9)     // Catch: java.lang.Exception -> L37
            return
        Lb3:
            if (r0 != r4) goto Lc7
            java.lang.Object r8 = r1.get(r8)     // Catch: java.lang.Exception -> L37
            java.util.concurrent.atomic.AtomicLong r8 = (java.util.concurrent.atomic.AtomicLong) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            java.util.concurrent.atomic.AtomicLong r9 = (java.util.concurrent.atomic.AtomicLong) r9     // Catch: java.lang.Exception -> L37
            long r0 = r9.get()     // Catch: java.lang.Exception -> L37
            r8.set(r0)     // Catch: java.lang.Exception -> L37
            return
        Lc7:
            if (r0 != r3) goto Ldb
            java.lang.Object r8 = r1.get(r8)     // Catch: java.lang.Exception -> L37
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9     // Catch: java.lang.Exception -> L37
            boolean r9 = r9.get()     // Catch: java.lang.Exception -> L37
            r8.set(r9)     // Catch: java.lang.Exception -> L37
            return
        Ldb:
            boolean r0 = r2.isAssignableFrom(r0)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto Lef
            java.lang.Object r8 = r1.get(r8)     // Catch: java.lang.Exception -> L37
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L37
            r8.putAll(r9)     // Catch: java.lang.Exception -> L37
            return
        Lef:
            java.lang.Object r8 = r1.get(r8)     // Catch: java.lang.Exception -> L37
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L107
            if (r9 == 0) goto L107
            r8.clear()     // Catch: java.lang.Exception -> L37
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Exception -> L37
            r8.addAll(r9)     // Catch: java.lang.Exception -> L37
            return
        L102:
            if (r1 == 0) goto L107
            r1.set(r8, r9)     // Catch: java.lang.Exception -> L37
        L107:
            return
        L108:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "set property error, "
            r0.append(r1)
            com.alibaba.fastjson.util.FieldInfo r1 = r7.fieldInfo
            java.lang.String r1 = r1.name
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0, r8)
            throw r9
    }

    public void setValue(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            r0.setValue(r1, r2)
            return
    }

    public void setValue(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r1, r2)
            return
    }

    public void setWrappedValue(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.String r2 = "TODO"
            r1.<init>(r2)
            throw r1
    }
}
