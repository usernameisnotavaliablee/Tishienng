package com.google.gson.internal.bind;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.reflect.ReflectionAccessor accessor;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    private final com.google.gson.internal.Excluder excluder;
    private final com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Adapter<T> extends com.google.gson.TypeAdapter<T> {
        private final java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> boundFields;
        private final com.google.gson.internal.ObjectConstructor<T> constructor;

        Adapter(com.google.gson.internal.ObjectConstructor<T> r1, java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> r2) {
                r0 = this;
                r0.<init>()
                r0.constructor = r1
                r0.boundFields = r2
                return
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
                r3 = this;
                com.google.gson.stream.JsonToken r0 = r4.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r4.nextNull()
                r4 = 0
                return r4
            Ld:
                com.google.gson.internal.ObjectConstructor<T> r0 = r3.constructor
                java.lang.Object r0 = r0.construct()
                r4.beginObject()     // Catch: java.lang.IllegalAccessException -> L33 java.lang.IllegalStateException -> L35
            L16:
                boolean r1 = r4.hasNext()     // Catch: java.lang.IllegalAccessException -> L33 java.lang.IllegalStateException -> L35
                if (r1 == 0) goto L3b
                java.lang.String r1 = r4.nextName()     // Catch: java.lang.IllegalAccessException -> L33 java.lang.IllegalStateException -> L35
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r2 = r3.boundFields     // Catch: java.lang.IllegalAccessException -> L33 java.lang.IllegalStateException -> L35
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.IllegalAccessException -> L33 java.lang.IllegalStateException -> L35
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1     // Catch: java.lang.IllegalAccessException -> L33 java.lang.IllegalStateException -> L35
                if (r1 == 0) goto L37
                boolean r2 = r1.deserialized     // Catch: java.lang.IllegalAccessException -> L33 java.lang.IllegalStateException -> L35
                if (r2 != 0) goto L2f
                goto L37
            L2f:
                r1.read(r4, r0)     // Catch: java.lang.IllegalAccessException -> L33 java.lang.IllegalStateException -> L35
                goto L16
            L33:
                r4 = move-exception
                goto L3f
            L35:
                r4 = move-exception
                goto L45
            L37:
                r4.skipValue()     // Catch: java.lang.IllegalAccessException -> L33 java.lang.IllegalStateException -> L35
                goto L16
            L3b:
                r4.endObject()
                return r0
            L3f:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r4)
                throw r0
            L45:
                com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
                r0.<init>(r4)
                throw r0
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r4, T r5) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L6
                r4.nullValue()
                return
            L6:
                r4.beginObject()
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r0 = r3.boundFields     // Catch: java.lang.IllegalAccessException -> L2e
                java.util.Collection r0 = r0.values()     // Catch: java.lang.IllegalAccessException -> L2e
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L2e
            L13:
                boolean r1 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L2e
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()     // Catch: java.lang.IllegalAccessException -> L2e
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1     // Catch: java.lang.IllegalAccessException -> L2e
                boolean r2 = r1.writeField(r5)     // Catch: java.lang.IllegalAccessException -> L2e
                if (r2 == 0) goto L13
                java.lang.String r2 = r1.name     // Catch: java.lang.IllegalAccessException -> L2e
                r4.name(r2)     // Catch: java.lang.IllegalAccessException -> L2e
                r1.write(r4, r5)     // Catch: java.lang.IllegalAccessException -> L2e
                goto L13
            L2e:
                r4 = move-exception
                goto L34
            L30:
                r4.endObject()
                return
            L34:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>(r4)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class BoundField {
        final boolean deserialized;
        final java.lang.String name;
        final boolean serialized;

        protected BoundField(java.lang.String r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.serialized = r2
                r0.deserialized = r3
                return
        }

        abstract void read(com.google.gson.stream.JsonReader r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract boolean writeField(java.lang.Object r1) throws java.io.IOException, java.lang.IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r2, com.google.gson.FieldNamingStrategy r3, com.google.gson.internal.Excluder r4, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r5) {
            r1 = this;
            r1.<init>()
            com.google.gson.internal.reflect.ReflectionAccessor r0 = com.google.gson.internal.reflect.ReflectionAccessor.getInstance()
            r1.accessor = r0
            r1.constructorConstructor = r2
            r1.fieldNamingPolicy = r3
            r1.excluder = r4
            r1.jsonAdapterFactory = r5
            return
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField(com.google.gson.Gson r12, java.lang.reflect.Field r13, java.lang.String r14, com.google.gson.reflect.TypeToken<?> r15, boolean r16, boolean r17) {
            r11 = this;
            java.lang.Class r0 = r15.getRawType()
            boolean r10 = com.google.gson.internal.Primitives.isPrimitive(r0)
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r0 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r0 = r13.getAnnotation(r0)
            com.google.gson.annotations.JsonAdapter r0 = (com.google.gson.annotations.JsonAdapter) r0
            if (r0 == 0) goto L1b
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r2 = r11.jsonAdapterFactory
            com.google.gson.internal.ConstructorConstructor r3 = r11.constructorConstructor
            com.google.gson.TypeAdapter r0 = r2.getTypeAdapter(r3, r12, r15, r0)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L21
            r2 = 1
            r6 = 1
            goto L23
        L21:
            r2 = 0
            r6 = 0
        L23:
            if (r0 != 0) goto L29
            com.google.gson.TypeAdapter r0 = r12.getAdapter(r15)
        L29:
            r7 = r0
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1 r0 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1
            r1 = r11
            r8 = r12
            r5 = r13
            r2 = r14
            r9 = r15
            r3 = r16
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    static boolean excludeField(java.lang.reflect.Field r1, boolean r2, com.google.gson.internal.Excluder r3) {
            java.lang.Class r0 = r1.getType()
            boolean r0 = r3.excludeClass(r0, r2)
            if (r0 != 0) goto L12
            boolean r1 = r3.excludeField(r1, r2)
            if (r1 != 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> getBoundFields(com.google.gson.Gson r19, com.google.gson.reflect.TypeToken<?> r20, java.lang.Class<?> r21) {
            r18 = this;
            r0 = r18
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            boolean r1 = r21.isInterface()
            if (r1 == 0) goto Lf
            goto Lcb
        Lf:
            java.lang.reflect.Type r8 = r20.getType()
            r9 = r20
            r10 = r21
        L17:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r10 == r1) goto Lcb
            java.lang.reflect.Field[] r11 = r10.getDeclaredFields()
            int r12 = r11.length
            r13 = 0
            r14 = 0
        L22:
            if (r14 >= r12) goto Lb1
            r2 = r11[r14]
            r1 = 1
            boolean r1 = r0.excludeField(r2, r1)
            boolean r6 = r0.excludeField(r2, r13)
            if (r1 != 0) goto L36
            if (r6 != 0) goto L36
            r21 = r9
            goto L8d
        L36:
            com.google.gson.internal.reflect.ReflectionAccessor r3 = r0.accessor
            r3.makeAccessible(r2)
            java.lang.reflect.Type r3 = r9.getType()
            java.lang.reflect.Type r4 = r2.getGenericType()
            java.lang.reflect.Type r15 = com.google.gson.internal.C$Gson$Types.resolve(r3, r10, r4)
            java.util.List r3 = r0.getFieldNames(r2)
            int r4 = r3.size()
            r5 = 0
        L50:
            if (r13 >= r4) goto L88
            java.lang.Object r16 = r3.get(r13)
            java.lang.String r16 = (java.lang.String) r16
            if (r13 == 0) goto L5b
            r1 = 0
        L5b:
            r17 = r4
            com.google.gson.reflect.TypeToken r4 = com.google.gson.reflect.TypeToken.get(r15)
            r21 = r16
            r16 = r3
            r3 = r21
            r21 = r9
            r9 = r5
            r5 = r1
            r1 = r19
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r4 = r0.createBoundField(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r7.put(r3, r4)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r0
            if (r9 != 0) goto L7a
            goto L7b
        L7a:
            r0 = r9
        L7b:
            int r13 = r13 + 1
            r9 = r21
            r1 = r5
            r3 = r16
            r4 = r17
            r5 = r0
            r0 = r18
            goto L50
        L88:
            r21 = r9
            r9 = r5
            if (r9 != 0) goto L95
        L8d:
            int r14 = r14 + 1
            r13 = 0
            r0 = r18
            r9 = r21
            goto L22
        L95:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r9.name
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb1:
            r21 = r9
            java.lang.reflect.Type r0 = r21.getType()
            java.lang.reflect.Type r1 = r10.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.resolve(r0, r10, r1)
            com.google.gson.reflect.TypeToken r9 = com.google.gson.reflect.TypeToken.get(r0)
            java.lang.Class r10 = r9.getRawType()
            r0 = r18
            goto L17
        Lcb:
            return r7
    }

    private java.util.List<java.lang.String> getFieldNames(java.lang.reflect.Field r5) {
            r4 = this;
            java.lang.Class<com.google.gson.annotations.SerializedName> r0 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            com.google.gson.annotations.SerializedName r0 = (com.google.gson.annotations.SerializedName) r0
            if (r0 != 0) goto L15
            com.google.gson.FieldNamingStrategy r0 = r4.fieldNamingPolicy
            java.lang.String r5 = r0.translateName(r5)
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
        L15:
            java.lang.String r5 = r0.value()
            java.lang.String[] r0 = r0.alternate()
            int r1 = r0.length
            if (r1 != 0) goto L25
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
        L25:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            int r2 = r2 + 1
            r1.<init>(r2)
            r1.add(r5)
            int r5 = r0.length
            r2 = 0
        L32:
            if (r2 >= r5) goto L3c
            r3 = r0[r2]
            r1.add(r3)
            int r2 = r2 + 1
            goto L32
        L3c:
            return r1
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r4, com.google.gson.reflect.TypeToken<T> r5) {
            r3 = this;
            java.lang.Class r0 = r5.getRawType()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto Le
            r4 = 0
            return r4
        Le:
            com.google.gson.internal.ConstructorConstructor r1 = r3.constructorConstructor
            com.google.gson.internal.ObjectConstructor r1 = r1.get(r5)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter r2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
            java.util.Map r4 = r3.getBoundFields(r4, r5, r0)
            r2.<init>(r1, r4)
            return r2
    }

    public boolean excludeField(java.lang.reflect.Field r2, boolean r3) {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            boolean r2 = excludeField(r2, r3, r0)
            return r2
    }
}
