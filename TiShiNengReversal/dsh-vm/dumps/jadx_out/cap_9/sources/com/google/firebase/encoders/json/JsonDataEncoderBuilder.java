package com.google.firebase.encoders.json;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class JsonDataEncoderBuilder implements com.google.firebase.encoders.config.EncoderConfig<com.google.firebase.encoders.json.JsonDataEncoderBuilder> {
    private static final com.google.firebase.encoders.ValueEncoder<java.lang.Boolean> BOOLEAN_ENCODER = null;
    private static final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> DEFAULT_FALLBACK_ENCODER = null;
    private static final com.google.firebase.encoders.ValueEncoder<java.lang.String> STRING_ENCODER = null;
    private static final com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder TIMESTAMP_ENCODER = null;
    private com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder;
    private boolean ignoreNullValues;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class TimestampEncoder implements com.google.firebase.encoders.ValueEncoder<java.util.Date> {
        private static final java.text.DateFormat rfc339 = null;

        static {
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
                java.util.Locale r2 = java.util.Locale.US
                r0.<init>(r1, r2)
                com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder.rfc339 = r0
                java.lang.String r1 = "UTC"
                java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
                r0.setTimeZone(r1)
                return
        }

        private TimestampEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ TimestampEncoder(com.google.firebase.encoders.json.JsonDataEncoderBuilder.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.NonNull com.google.firebase.encoders.ValueEncoderContext r2) throws java.io.IOException {
                r0 = this;
                java.util.Date r1 = (java.util.Date) r1
                com.google.firebase.encoders.ValueEncoderContext r2 = (com.google.firebase.encoders.ValueEncoderContext) r2
                r0.encode(r1, r2)
                return
        }

        public void encode(@androidx.annotation.NonNull java.util.Date r2, @androidx.annotation.NonNull com.google.firebase.encoders.ValueEncoderContext r3) throws java.io.IOException {
                r1 = this;
                java.text.DateFormat r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder.rfc339
                java.lang.String r2 = r0.format(r2)
                r3.add(r2)
                return
        }
    }

    static {
            com.google.firebase.encoders.ObjectEncoder r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$1.lambdaFactory$()
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.DEFAULT_FALLBACK_ENCODER = r0
            com.google.firebase.encoders.ValueEncoder r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$4.lambdaFactory$()
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.STRING_ENCODER = r0
            com.google.firebase.encoders.ValueEncoder r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$5.lambdaFactory$()
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.BOOLEAN_ENCODER = r0
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$TimestampEncoder r0 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder$TimestampEncoder
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.TIMESTAMP_ENCODER = r0
            return
    }

    public JsonDataEncoderBuilder() {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.objectEncoders = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.valueEncoders = r0
            com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.DEFAULT_FALLBACK_ENCODER
            r2.fallbackEncoder = r0
            r0 = 0
            r2.ignoreNullValues = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.google.firebase.encoders.ValueEncoder<java.lang.String> r1 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.STRING_ENCODER
            r2.registerEncoder2(r0, r1)
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            com.google.firebase.encoders.ValueEncoder<java.lang.Boolean> r1 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.BOOLEAN_ENCODER
            r2.registerEncoder2(r0, r1)
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$TimestampEncoder r1 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.TIMESTAMP_ENCODER
            r2.registerEncoder2(r0, r1)
            return
    }

    static /* synthetic */ java.util.Map access$100(com.google.firebase.encoders.json.JsonDataEncoderBuilder r0) {
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r0 = r0.objectEncoders
            return r0
    }

    static /* synthetic */ java.util.Map access$200(com.google.firebase.encoders.json.JsonDataEncoderBuilder r0) {
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r0 = r0.valueEncoders
            return r0
    }

    static /* synthetic */ com.google.firebase.encoders.ObjectEncoder access$300(com.google.firebase.encoders.json.JsonDataEncoderBuilder r0) {
            com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r0 = r0.fallbackEncoder
            return r0
    }

    static /* synthetic */ boolean access$400(com.google.firebase.encoders.json.JsonDataEncoderBuilder r0) {
            boolean r0 = r0.ignoreNullValues
            return r0
    }

    static /* synthetic */ void lambda$static$0(java.lang.Object r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
            com.google.firebase.encoders.EncodingException r3 = new com.google.firebase.encoders.EncodingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Couldn't find encoder for type "
            r0.append(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    static /* synthetic */ void lambda$static$1(java.lang.String r0, com.google.firebase.encoders.ValueEncoderContext r1) throws java.io.IOException {
            r1.add(r0)
            return
    }

    static /* synthetic */ void lambda$static$2(java.lang.Boolean r0, com.google.firebase.encoders.ValueEncoderContext r1) throws java.io.IOException {
            boolean r0 = r0.booleanValue()
            r1.add(r0)
            return
    }

    @androidx.annotation.NonNull
    public com.google.firebase.encoders.DataEncoder build() {
            r1 = this;
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$1 r0 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder$1
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.firebase.encoders.json.JsonDataEncoderBuilder configureWith(@androidx.annotation.NonNull com.google.firebase.encoders.config.Configurator r1) {
            r0 = this;
            r1.configure(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.firebase.encoders.json.JsonDataEncoderBuilder ignoreNullValues(boolean r1) {
            r0 = this;
            r0.ignoreNullValues = r1
            return r0
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder(@androidx.annotation.NonNull java.lang.Class r1, @androidx.annotation.NonNull com.google.firebase.encoders.ObjectEncoder r2) {
            r0 = this;
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r1 = r0.registerEncoder2(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder(@androidx.annotation.NonNull java.lang.Class r1, @androidx.annotation.NonNull com.google.firebase.encoders.ValueEncoder r2) {
            r0 = this;
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r1 = r0.registerEncoder2(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @androidx.annotation.NonNull
    /* renamed from: registerEncoder, reason: avoid collision after fix types in other method */
    public <T> com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder2(@androidx.annotation.NonNull java.lang.Class<T> r2, @androidx.annotation.NonNull com.google.firebase.encoders.ObjectEncoder<? super T> r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r0 = r1.objectEncoders
            r0.put(r2, r3)
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r3 = r1.valueEncoders
            r3.remove(r2)
            return r1
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @androidx.annotation.NonNull
    /* renamed from: registerEncoder, reason: avoid collision after fix types in other method */
    public <T> com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder2(@androidx.annotation.NonNull java.lang.Class<T> r2, @androidx.annotation.NonNull com.google.firebase.encoders.ValueEncoder<? super T> r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r0 = r1.valueEncoders
            r0.put(r2, r3)
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r3 = r1.objectEncoders
            r3.remove(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public com.google.firebase.encoders.json.JsonDataEncoderBuilder registerFallbackEncoder(@androidx.annotation.NonNull com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r1) {
            r0 = this;
            r0.fallbackEncoder = r1
            return r0
    }
}
