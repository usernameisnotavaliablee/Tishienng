package com.google.gson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    private static final java.lang.String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final com.google.gson.reflect.TypeToken<?> NULL_KEY_SURROGATE = null;
    final java.util.List<com.google.gson.TypeAdapterFactory> builderFactories;
    final java.util.List<com.google.gson.TypeAdapterFactory> builderHierarchyFactories;
    private final java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson.FutureTypeAdapter<?>>> calls;
    final boolean complexMapKeySerialization;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    final java.lang.String datePattern;
    final int dateStyle;
    final com.google.gson.internal.Excluder excluder;
    final java.util.List<com.google.gson.TypeAdapterFactory> factories;
    final com.google.gson.FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final boolean lenient;
    final com.google.gson.LongSerializationPolicy longSerializationPolicy;
    final boolean prettyPrinting;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final int timeStyle;
    private final java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> typeTokenCache;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class FutureTypeAdapter<T> extends com.google.gson.TypeAdapter<T> {
        private com.google.gson.TypeAdapter<T> delegate;

        FutureTypeAdapter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r2) throws java.io.IOException {
                r1 = this;
                com.google.gson.TypeAdapter<T> r0 = r1.delegate
                if (r0 == 0) goto L9
                java.lang.Object r2 = r0.read(r2)
                return r2
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>()
                throw r2
        }

        public void setDelegate(com.google.gson.TypeAdapter<T> r2) {
                r1 = this;
                com.google.gson.TypeAdapter<T> r0 = r1.delegate
                if (r0 != 0) goto L7
                r1.delegate = r2
                return
            L7:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r2, T r3) throws java.io.IOException {
                r1 = this;
                com.google.gson.TypeAdapter<T> r0 = r1.delegate
                if (r0 == 0) goto L8
                r0.write(r2, r3)
                return
            L8:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>()
                throw r2
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r0)
            com.google.gson.Gson.NULL_KEY_SURROGATE = r0
            return
    }

    public Gson() {
            r18 = this;
            com.google.gson.internal.Excluder r1 = com.google.gson.internal.Excluder.DEFAULT
            com.google.gson.FieldNamingPolicy r2 = com.google.gson.FieldNamingPolicy.IDENTITY
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            com.google.gson.LongSerializationPolicy r11 = com.google.gson.LongSerializationPolicy.DEFAULT
            r14 = 2
            java.util.List r15 = java.util.Collections.EMPTY_LIST
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 2
            r16 = r15
            r17 = r15
            r0 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    Gson(com.google.gson.internal.Excluder r5, com.google.gson.FieldNamingStrategy r6, java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, com.google.gson.LongSerializationPolicy r15, java.lang.String r16, int r17, int r18, java.util.List<com.google.gson.TypeAdapterFactory> r19, java.util.List<com.google.gson.TypeAdapterFactory> r20, java.util.List<com.google.gson.TypeAdapterFactory> r21) {
            r4 = this;
            r4.<init>()
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r1.<init>()
            r4.calls = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r4.typeTokenCache = r1
            r4.excluder = r5
            r4.fieldNamingStrategy = r6
            r4.instanceCreators = r7
            com.google.gson.internal.ConstructorConstructor r1 = new com.google.gson.internal.ConstructorConstructor
            r1.<init>(r7)
            r4.constructorConstructor = r1
            r4.serializeNulls = r8
            r4.complexMapKeySerialization = r9
            r4.generateNonExecutableJson = r10
            r4.htmlSafe = r11
            r4.prettyPrinting = r12
            r4.lenient = r13
            r4.serializeSpecialFloatingPointValues = r14
            r4.longSerializationPolicy = r15
            r8 = r16
            r4.datePattern = r8
            r8 = r17
            r4.dateStyle = r8
            r8 = r18
            r4.timeStyle = r8
            r8 = r19
            r4.builderFactories = r8
            r8 = r20
            r4.builderHierarchyFactories = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT_FACTORY
            r8.add(r10)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.ObjectTypeAdapter.FACTORY
            r8.add(r10)
            r8.add(r5)
            r10 = r21
            r8.addAll(r10)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.STRING_FACTORY
            r8.add(r10)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.INTEGER_FACTORY
            r8.add(r10)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN_FACTORY
            r8.add(r10)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.BYTE_FACTORY
            r8.add(r10)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY
            r8.add(r10)
            com.google.gson.TypeAdapter r7 = longAdapter(r15)
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.newFactory(r10, r2, r7)
            r8.add(r10)
            java.lang.Class<java.lang.Double> r10 = java.lang.Double.class
            com.google.gson.TypeAdapter r2 = r4.doubleAdapter(r14)
            java.lang.Class r3 = java.lang.Double.TYPE
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.newFactory(r3, r10, r2)
            r8.add(r10)
            java.lang.Class<java.lang.Float> r10 = java.lang.Float.class
            com.google.gson.TypeAdapter r0 = r4.floatAdapter(r14)
            java.lang.Class r2 = java.lang.Float.TYPE
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.newFactory(r2, r10, r0)
            r8.add(r10)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.NUMBER_FACTORY
            r8.add(r10)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_FACTORY
            r8.add(r10)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN_FACTORY
            r8.add(r10)
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r10 = java.util.concurrent.atomic.AtomicLong.class
            com.google.gson.TypeAdapter r0 = atomicLongAdapter(r7)
            com.google.gson.TypeAdapterFactory r10 = com.google.gson.internal.bind.TypeAdapters.newFactory(r10, r0)
            r8.add(r10)
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r10 = java.util.concurrent.atomic.AtomicLongArray.class
            com.google.gson.TypeAdapter r7 = atomicLongArrayAdapter(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.newFactory(r10, r7)
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER_FACTORY
            r8.add(r7)
            java.lang.Class<java.math.BigDecimal> r7 = java.math.BigDecimal.class
            com.google.gson.TypeAdapter<java.math.BigDecimal> r10 = com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.newFactory(r7, r10)
            r8.add(r7)
            java.lang.Class<java.math.BigInteger> r7 = java.math.BigInteger.class
            com.google.gson.TypeAdapter<java.math.BigInteger> r10 = com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.newFactory(r7, r10)
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.URL_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.URI_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.UUID_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.CURRENCY_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.LOCALE_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.BIT_SET_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.DateTypeAdapter.FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.CALENDAR_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TimeTypeAdapter.FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.SqlDateTypeAdapter.FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.TIMESTAMP_FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.ArrayTypeAdapter.FACTORY
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r7 = com.google.gson.internal.bind.TypeAdapters.CLASS_FACTORY
            r8.add(r7)
            com.google.gson.internal.bind.CollectionTypeAdapterFactory r7 = new com.google.gson.internal.bind.CollectionTypeAdapterFactory
            r7.<init>(r1)
            r8.add(r7)
            com.google.gson.internal.bind.MapTypeAdapterFactory r7 = new com.google.gson.internal.bind.MapTypeAdapterFactory
            r7.<init>(r1, r9)
            r8.add(r7)
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r7 = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory
            r7.<init>(r1)
            r4.jsonAdapterFactory = r7
            r8.add(r7)
            com.google.gson.TypeAdapterFactory r9 = com.google.gson.internal.bind.TypeAdapters.ENUM_FACTORY
            r8.add(r9)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory r9 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory
            r9.<init>(r1, r6, r5, r7)
            r8.add(r9)
            java.util.List r5 = java.util.Collections.unmodifiableList(r8)
            r4.factories = r5
            return
    }

    private static void assertFullConsumption(java.lang.Object r0, com.google.gson.stream.JsonReader r1) {
            if (r0 == 0) goto L21
            com.google.gson.stream.JsonToken r0 = r1.peek()     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
            if (r0 != r1) goto Lb
            goto L21
        Lb:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
            java.lang.String r1 = "JSON document was not fully consumed."
            r0.<init>(r1)     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
            throw r0     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
        L13:
            r0 = move-exception
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            r1.<init>(r0)
            throw r1
        L1a:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException
            r1.<init>(r0)
            throw r1
        L21:
            return
    }

    private static com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLong> atomicLongAdapter(com.google.gson.TypeAdapter<java.lang.Number> r1) {
            com.google.gson.Gson$4 r0 = new com.google.gson.Gson$4
            r0.<init>(r1)
            com.google.gson.TypeAdapter r1 = r0.nullSafe()
            return r1
    }

    private static com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLongArray> atomicLongArrayAdapter(com.google.gson.TypeAdapter<java.lang.Number> r1) {
            com.google.gson.Gson$5 r0 = new com.google.gson.Gson$5
            r0.<init>(r1)
            com.google.gson.TypeAdapter r1 = r0.nullSafe()
            return r1
    }

    static void checkValidFloatingPoint(double r2) {
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto Ld
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    private com.google.gson.TypeAdapter<java.lang.Number> doubleAdapter(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            com.google.gson.TypeAdapter<java.lang.Number> r1 = com.google.gson.internal.bind.TypeAdapters.DOUBLE
            return r1
        L5:
            com.google.gson.Gson$1 r1 = new com.google.gson.Gson$1
            r1.<init>(r0)
            return r1
    }

    private com.google.gson.TypeAdapter<java.lang.Number> floatAdapter(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            com.google.gson.TypeAdapter<java.lang.Number> r1 = com.google.gson.internal.bind.TypeAdapters.FLOAT
            return r1
        L5:
            com.google.gson.Gson$2 r1 = new com.google.gson.Gson$2
            r1.<init>(r0)
            return r1
    }

    private static com.google.gson.TypeAdapter<java.lang.Number> longAdapter(com.google.gson.LongSerializationPolicy r1) {
            com.google.gson.LongSerializationPolicy r0 = com.google.gson.LongSerializationPolicy.DEFAULT
            if (r1 != r0) goto L7
            com.google.gson.TypeAdapter<java.lang.Number> r1 = com.google.gson.internal.bind.TypeAdapters.LONG
            return r1
        L7:
            com.google.gson.Gson$3 r1 = new com.google.gson.Gson$3
            r1.<init>()
            return r1
    }

    public com.google.gson.internal.Excluder excluder() {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            return r0
    }

    public com.google.gson.FieldNamingStrategy fieldNamingStrategy() {
            r1 = this;
            com.google.gson.FieldNamingStrategy r0 = r1.fieldNamingStrategy
            return r0
    }

    public <T> T fromJson(com.google.gson.JsonElement r1, java.lang.Class<T> r2) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            java.lang.Object r1 = r0.fromJson(r1, r2)
            java.lang.Class r2 = com.google.gson.internal.Primitives.wrap(r2)
            java.lang.Object r1 = r2.cast(r1)
            return r1
    }

    public <T> T fromJson(com.google.gson.JsonElement r2, java.lang.reflect.Type r3) throws com.google.gson.JsonSyntaxException {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.google.gson.internal.bind.JsonTreeReader r0 = new com.google.gson.internal.bind.JsonTreeReader
            r0.<init>(r2)
            java.lang.Object r2 = r1.fromJson(r0, r3)
            return r2
    }

    public <T> T fromJson(com.google.gson.stream.JsonReader r5, java.lang.reflect.Type r6) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r4 = this;
            boolean r0 = r5.isLenient()
            r1 = 1
            r5.setLenient(r1)
            r5.peek()     // Catch: java.lang.Throwable -> L1c java.lang.AssertionError -> L1e java.io.IOException -> L20 java.lang.IllegalStateException -> L22 java.io.EOFException -> L24
            r1 = 0
            com.google.gson.reflect.TypeToken r6 = com.google.gson.reflect.TypeToken.get(r6)     // Catch: java.lang.Throwable -> L1c java.lang.AssertionError -> L1e java.io.IOException -> L20 java.lang.IllegalStateException -> L22 java.io.EOFException -> L24
            com.google.gson.TypeAdapter r6 = r4.getAdapter(r6)     // Catch: java.lang.Throwable -> L1c java.lang.AssertionError -> L1e java.io.IOException -> L20 java.lang.IllegalStateException -> L22 java.io.EOFException -> L24
            java.lang.Object r6 = r6.read(r5)     // Catch: java.lang.Throwable -> L1c java.lang.AssertionError -> L1e java.io.IOException -> L20 java.lang.IllegalStateException -> L22 java.io.EOFException -> L24
            r5.setLenient(r0)
            return r6
        L1c:
            r6 = move-exception
            goto L5a
        L1e:
            r6 = move-exception
            goto L26
        L20:
            r6 = move-exception
            goto L41
        L22:
            r6 = move-exception
            goto L47
        L24:
            r6 = move-exception
            goto L4d
        L26:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r2.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "AssertionError (GSON 2.8.5): "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r6.getMessage()     // Catch: java.lang.Throwable -> L1c
            r2.append(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L41:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L47:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L4d:
            if (r1 == 0) goto L54
            r5.setLenient(r0)
            r5 = 0
            return r5
        L54:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L5a:
            r5.setLenient(r0)
            throw r6
    }

    public <T> T fromJson(java.io.Reader r2, java.lang.Class<T> r3) throws com.google.gson.JsonSyntaxException, com.google.gson.JsonIOException {
            r1 = this;
            com.google.gson.stream.JsonReader r2 = r1.newJsonReader(r2)
            java.lang.Object r0 = r1.fromJson(r2, r3)
            assertFullConsumption(r0, r2)
            java.lang.Class r2 = com.google.gson.internal.Primitives.wrap(r3)
            java.lang.Object r2 = r2.cast(r0)
            return r2
    }

    public <T> T fromJson(java.io.Reader r1, java.lang.reflect.Type r2) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.stream.JsonReader r1 = r0.newJsonReader(r1)
            java.lang.Object r2 = r0.fromJson(r1, r2)
            assertFullConsumption(r2, r1)
            return r2
    }

    public <T> T fromJson(java.lang.String r1, java.lang.Class<T> r2) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            java.lang.Object r1 = r0.fromJson(r1, r2)
            java.lang.Class r2 = com.google.gson.internal.Primitives.wrap(r2)
            java.lang.Object r1 = r2.cast(r1)
            return r1
    }

    public <T> T fromJson(java.lang.String r2, java.lang.reflect.Type r3) throws com.google.gson.JsonSyntaxException {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            java.lang.Object r2 = r1.fromJson(r0, r3)
            return r2
    }

    public <T> com.google.gson.TypeAdapter<T> getAdapter(com.google.gson.reflect.TypeToken<T> r6) {
            r5 = this;
            java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> r0 = r5.typeTokenCache
            if (r6 != 0) goto L7
            com.google.gson.reflect.TypeToken<?> r1 = com.google.gson.Gson.NULL_KEY_SURROGATE
            goto L8
        L7:
            r1 = r6
        L8:
            java.lang.Object r0 = r0.get(r1)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r0 = r5.calls
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L27
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r1 = r5.calls
            r1.set(r0)
            r1 = 1
            goto L28
        L27:
            r1 = 0
        L28:
            java.lang.Object r2 = r0.get(r6)
            com.google.gson.Gson$FutureTypeAdapter r2 = (com.google.gson.Gson.FutureTypeAdapter) r2
            if (r2 == 0) goto L31
            return r2
        L31:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L64
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L64
            java.util.List<com.google.gson.TypeAdapterFactory> r3 = r5.factories     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L64
        L3f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L64
            com.google.gson.TypeAdapterFactory r4 = (com.google.gson.TypeAdapterFactory) r4     // Catch: java.lang.Throwable -> L64
            com.google.gson.TypeAdapter r4 = r4.create(r5, r6)     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L3f
            r2.setDelegate(r4)     // Catch: java.lang.Throwable -> L64
            java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> r2 = r5.typeTokenCache     // Catch: java.lang.Throwable -> L64
            r2.put(r6, r4)     // Catch: java.lang.Throwable -> L64
            r0.remove(r6)
            if (r1 == 0) goto L63
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r6 = r5.calls
            r6.remove()
        L63:
            return r4
        L64:
            r2 = move-exception
            goto L7d
        L66:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r3.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = "GSON (2.8.5) cannot handle "
            r3.append(r4)     // Catch: java.lang.Throwable -> L64
            r3.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L64
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L64
            throw r2     // Catch: java.lang.Throwable -> L64
        L7d:
            r0.remove(r6)
            if (r1 == 0) goto L87
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r6 = r5.calls
            r6.remove()
        L87:
            throw r2
    }

    public <T> com.google.gson.TypeAdapter<T> getAdapter(java.lang.Class<T> r1) {
            r0 = this;
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r1 = r0.getAdapter(r1)
            return r1
    }

    public <T> com.google.gson.TypeAdapter<T> getDelegateAdapter(com.google.gson.TypeAdapterFactory r4, com.google.gson.reflect.TypeToken<T> r5) {
            r3 = this;
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r3.factories
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto La
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r4 = r3.jsonAdapterFactory
        La:
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r3.factories
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            com.google.gson.TypeAdapterFactory r2 = (com.google.gson.TypeAdapterFactory) r2
            if (r1 != 0) goto L23
            if (r2 != r4) goto L11
            r1 = 1
            goto L11
        L23:
            com.google.gson.TypeAdapter r2 = r2.create(r3, r5)
            if (r2 == 0) goto L11
            return r2
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GSON cannot serialize "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    public boolean htmlSafe() {
            r1 = this;
            boolean r0 = r1.htmlSafe
            return r0
    }

    public com.google.gson.GsonBuilder newBuilder() {
            r1 = this;
            com.google.gson.GsonBuilder r0 = new com.google.gson.GsonBuilder
            r0.<init>(r1)
            return r0
    }

    public com.google.gson.stream.JsonReader newJsonReader(java.io.Reader r2) {
            r1 = this;
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader
            r0.<init>(r2)
            boolean r2 = r1.lenient
            r0.setLenient(r2)
            return r0
    }

    public com.google.gson.stream.JsonWriter newJsonWriter(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.generateNonExecutableJson
            if (r0 == 0) goto L9
            java.lang.String r0 = ")]}'\n"
            r2.write(r0)
        L9:
            com.google.gson.stream.JsonWriter r0 = new com.google.gson.stream.JsonWriter
            r0.<init>(r2)
            boolean r2 = r1.prettyPrinting
            if (r2 == 0) goto L17
            java.lang.String r2 = "  "
            r0.setIndent(r2)
        L17:
            boolean r2 = r1.serializeNulls
            r0.setSerializeNulls(r2)
            return r0
    }

    public boolean serializeNulls() {
            r1 = this;
            boolean r0 = r1.serializeNulls
            return r0
    }

    public java.lang.String toJson(com.google.gson.JsonElement r2) {
            r1 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1.toJson(r2, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.lang.String toJson(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L9
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            java.lang.String r2 = r1.toJson(r2)
            return r2
        L9:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r2 = r1.toJson(r2, r0)
            return r2
    }

    public java.lang.String toJson(java.lang.Object r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1.toJson(r2, r3, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public void toJson(com.google.gson.JsonElement r7, com.google.gson.stream.JsonWriter r8) throws com.google.gson.JsonIOException {
            r6 = this;
            boolean r0 = r8.isLenient()
            r1 = 1
            r8.setLenient(r1)
            boolean r1 = r8.isHtmlSafe()
            boolean r2 = r6.htmlSafe
            r8.setHtmlSafe(r2)
            boolean r2 = r8.getSerializeNulls()
            boolean r3 = r6.serializeNulls
            r8.setSerializeNulls(r3)
            com.google.gson.internal.Streams.write(r7, r8)     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L45
            r8.setLenient(r0)
            r8.setHtmlSafe(r1)
            r8.setSerializeNulls(r2)
            return
        L27:
            r7 = move-exception
            goto L4c
        L29:
            r7 = move-exception
            java.lang.AssertionError r3 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r4.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "AssertionError (GSON 2.8.5): "
            r4.append(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r7.getMessage()     // Catch: java.lang.Throwable -> L27
            r4.append(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L27
            r3.<init>(r4, r7)     // Catch: java.lang.Throwable -> L27
            throw r3     // Catch: java.lang.Throwable -> L27
        L45:
            r7 = move-exception
            com.google.gson.JsonIOException r3 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L27
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L27
            throw r3     // Catch: java.lang.Throwable -> L27
        L4c:
            r8.setLenient(r0)
            r8.setHtmlSafe(r1)
            r8.setSerializeNulls(r2)
            throw r7
    }

    public void toJson(com.google.gson.JsonElement r1, java.lang.Appendable r2) throws com.google.gson.JsonIOException {
            r0 = this;
            java.io.Writer r2 = com.google.gson.internal.Streams.writerForAppendable(r2)     // Catch: java.io.IOException -> Lc
            com.google.gson.stream.JsonWriter r2 = r0.newJsonWriter(r2)     // Catch: java.io.IOException -> Lc
            r0.toJson(r1, r2)     // Catch: java.io.IOException -> Lc
            return
        Lc:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            r2.<init>(r1)
            throw r2
    }

    public void toJson(java.lang.Object r2, java.lang.Appendable r3) throws com.google.gson.JsonIOException {
            r1 = this;
            if (r2 == 0) goto La
            java.lang.Class r0 = r2.getClass()
            r1.toJson(r2, r0, r3)
            return
        La:
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            r1.toJson(r2, r3)
            return
    }

    public void toJson(java.lang.Object r6, java.lang.reflect.Type r7, com.google.gson.stream.JsonWriter r8) throws com.google.gson.JsonIOException {
            r5 = this;
            com.google.gson.reflect.TypeToken r7 = com.google.gson.reflect.TypeToken.get(r7)
            com.google.gson.TypeAdapter r7 = r5.getAdapter(r7)
            boolean r0 = r8.isLenient()
            r1 = 1
            r8.setLenient(r1)
            boolean r1 = r8.isHtmlSafe()
            boolean r2 = r5.htmlSafe
            r8.setHtmlSafe(r2)
            boolean r2 = r8.getSerializeNulls()
            boolean r3 = r5.serializeNulls
            r8.setSerializeNulls(r3)
            r7.write(r8, r6)     // Catch: java.lang.Throwable -> L2f java.lang.AssertionError -> L31 java.io.IOException -> L4d
            r8.setLenient(r0)
            r8.setHtmlSafe(r1)
            r8.setSerializeNulls(r2)
            return
        L2f:
            r6 = move-exception
            goto L54
        L31:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r3.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "AssertionError (GSON 2.8.5): "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.getMessage()     // Catch: java.lang.Throwable -> L2f
            r3.append(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            r7.<init>(r3, r6)     // Catch: java.lang.Throwable -> L2f
            throw r7     // Catch: java.lang.Throwable -> L2f
        L4d:
            r6 = move-exception
            com.google.gson.JsonIOException r7 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L2f
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2f
            throw r7     // Catch: java.lang.Throwable -> L2f
        L54:
            r8.setLenient(r0)
            r8.setHtmlSafe(r1)
            r8.setSerializeNulls(r2)
            throw r6
    }

    public void toJson(java.lang.Object r1, java.lang.reflect.Type r2, java.lang.Appendable r3) throws com.google.gson.JsonIOException {
            r0 = this;
            java.io.Writer r3 = com.google.gson.internal.Streams.writerForAppendable(r3)     // Catch: java.io.IOException -> Lc
            com.google.gson.stream.JsonWriter r3 = r0.newJsonWriter(r3)     // Catch: java.io.IOException -> Lc
            r0.toJson(r1, r2, r3)     // Catch: java.io.IOException -> Lc
            return
        Lc:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            r2.<init>(r1)
            throw r2
    }

    public com.google.gson.JsonElement toJsonTree(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L5
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            return r2
        L5:
            java.lang.Class r0 = r2.getClass()
            com.google.gson.JsonElement r2 = r1.toJsonTree(r2, r0)
            return r2
    }

    public com.google.gson.JsonElement toJsonTree(java.lang.Object r2, java.lang.reflect.Type r3) {
            r1 = this;
            com.google.gson.internal.bind.JsonTreeWriter r0 = new com.google.gson.internal.bind.JsonTreeWriter
            r0.<init>()
            r1.toJson(r2, r3, r0)
            com.google.gson.JsonElement r2 = r0.get()
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{serializeNulls:"
            r0.<init>(r1)
            boolean r1 = r2.serializeNulls
            r0.append(r1)
            java.lang.String r1 = ",factories:"
            r0.append(r1)
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r2.factories
            r0.append(r1)
            java.lang.String r1 = ",instanceCreators:"
            r0.append(r1)
            com.google.gson.internal.ConstructorConstructor r1 = r2.constructorConstructor
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
