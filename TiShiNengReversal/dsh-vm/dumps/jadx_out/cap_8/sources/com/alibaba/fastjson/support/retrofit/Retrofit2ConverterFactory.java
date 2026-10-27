package com.alibaba.fastjson.support.retrofit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Retrofit2ConverterFactory extends retrofit2.g.a {
    private static final com.alibaba.fastjson.parser.Feature[] EMPTY_SERIALIZER_FEATURES = null;
    private static final okhttp3.MediaType MEDIA_TYPE = null;
    private int featureValues;
    private com.alibaba.fastjson.parser.Feature[] features;
    private com.alibaba.fastjson.parser.ParserConfig parserConfig;
    private com.alibaba.fastjson.serializer.SerializeConfig serializeConfig;
    private com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatures;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class RequestBodyConverter<T> implements retrofit2.g<T, okhttp3.RequestBody> {
        final /* synthetic */ com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory this$0;

        RequestBodyConverter(com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object convert(java.lang.Object r1) throws java.io.IOException {
                r0 = this;
                okhttp3.RequestBody r1 = r0.m1convert(r1)
                return r1
        }

        /* renamed from: convert, reason: collision with other method in class */
        public okhttp3.RequestBody m1convert(T r3) throws java.io.IOException {
                r2 = this;
                com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r0 = r2.this$0
                com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$400(r0)
                if (r0 != 0) goto Lb
                com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
                goto L11
            Lb:
                com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r0 = r2.this$0
                com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$400(r0)
            L11:
                com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r1 = r2.this$0
                com.alibaba.fastjson.serializer.SerializerFeature[] r1 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$500(r1)
                if (r1 != 0) goto L1c
                com.alibaba.fastjson.serializer.SerializerFeature[] r1 = com.alibaba.fastjson.serializer.SerializerFeature.EMPTY
                goto L22
            L1c:
                com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r1 = r2.this$0
                com.alibaba.fastjson.serializer.SerializerFeature[] r1 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$500(r1)
            L22:
                byte[] r3 = com.alibaba.fastjson.JSON.toJSONBytes(r3, r0, r1)
                okhttp3.MediaType r0 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$600()
                okhttp3.RequestBody r3 = okhttp3.RequestBody.create(r0, r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class ResponseBodyConverter<T> implements retrofit2.g<okhttp3.ResponseBody, T> {
        final /* synthetic */ com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory this$0;
        private java.lang.reflect.Type type;

        ResponseBodyConverter(com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r1, java.lang.reflect.Type r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.type = r2
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object convert(java.lang.Object r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Object r1 = r0.convert(r1)
                return r1
        }

        public T convert(okhttp3.ResponseBody r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = r6.string()     // Catch: java.lang.Throwable -> L21
                java.lang.reflect.Type r1 = r5.type     // Catch: java.lang.Throwable -> L21
                com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r2 = r5.this$0     // Catch: java.lang.Throwable -> L21
                com.alibaba.fastjson.parser.ParserConfig r2 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$000(r2)     // Catch: java.lang.Throwable -> L21
                com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r3 = r5.this$0     // Catch: java.lang.Throwable -> L21
                int r3 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$100(r3)     // Catch: java.lang.Throwable -> L21
                com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r4 = r5.this$0     // Catch: java.lang.Throwable -> L21
                com.alibaba.fastjson.parser.Feature[] r4 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$200(r4)     // Catch: java.lang.Throwable -> L21
                if (r4 == 0) goto L23
                com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r4 = r5.this$0     // Catch: java.lang.Throwable -> L21
                com.alibaba.fastjson.parser.Feature[] r4 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$200(r4)     // Catch: java.lang.Throwable -> L21
                goto L27
            L21:
                r0 = move-exception
                goto L2f
            L23:
                com.alibaba.fastjson.parser.Feature[] r4 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.access$300()     // Catch: java.lang.Throwable -> L21
            L27:
                java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L21
                r6.close()
                return r0
            L2f:
                r6.close()
                throw r0
        }
    }

    static {
            java.lang.String r0 = "application/json; charset=UTF-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.MEDIA_TYPE = r0
            r0 = 0
            com.alibaba.fastjson.parser.Feature[] r0 = new com.alibaba.fastjson.parser.Feature[r0]
            com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.EMPTY_SERIALIZER_FEATURES = r0
            return
    }

    public Retrofit2ConverterFactory() {
            r1 = this;
            r1.<init>()
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r1.parserConfig = r0
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r1.featureValues = r0
            return
    }

    static /* synthetic */ com.alibaba.fastjson.parser.ParserConfig access$000(com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r0) {
            com.alibaba.fastjson.parser.ParserConfig r0 = r0.parserConfig
            return r0
    }

    static /* synthetic */ int access$100(com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r0) {
            int r0 = r0.featureValues
            return r0
    }

    static /* synthetic */ com.alibaba.fastjson.parser.Feature[] access$200(com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r0) {
            com.alibaba.fastjson.parser.Feature[] r0 = r0.features
            return r0
    }

    static /* synthetic */ com.alibaba.fastjson.parser.Feature[] access$300() {
            com.alibaba.fastjson.parser.Feature[] r0 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.EMPTY_SERIALIZER_FEATURES
            return r0
    }

    static /* synthetic */ com.alibaba.fastjson.serializer.SerializeConfig access$400(com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r0) {
            com.alibaba.fastjson.serializer.SerializeConfig r0 = r0.serializeConfig
            return r0
    }

    static /* synthetic */ com.alibaba.fastjson.serializer.SerializerFeature[] access$500(com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory r0) {
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = r0.serializerFeatures
            return r0
    }

    static /* synthetic */ okhttp3.MediaType access$600() {
            okhttp3.MediaType r0 = com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory.MEDIA_TYPE
            return r0
    }

    public com.alibaba.fastjson.parser.ParserConfig getParserConfig() {
            r1 = this;
            com.alibaba.fastjson.parser.ParserConfig r0 = r1.parserConfig
            return r0
    }

    public int getParserFeatureValues() {
            r1 = this;
            int r0 = r1.featureValues
            return r0
    }

    public com.alibaba.fastjson.parser.Feature[] getParserFeatures() {
            r1 = this;
            com.alibaba.fastjson.parser.Feature[] r0 = r1.features
            return r0
    }

    public com.alibaba.fastjson.serializer.SerializeConfig getSerializeConfig() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeConfig r0 = r1.serializeConfig
            return r0
    }

    public com.alibaba.fastjson.serializer.SerializerFeature[] getSerializerFeatures() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = r1.serializerFeatures
            return r0
    }

    public retrofit2.g<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, java.lang.annotation.Annotation[] r3, retrofit2.d0 r4) {
            r0 = this;
            com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory$RequestBodyConverter r1 = new com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory$RequestBodyConverter
            r1.<init>(r0)
            return r1
    }

    public retrofit2.g<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.d0 r3) {
            r0 = this;
            com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory$ResponseBodyConverter r2 = new com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory$ResponseBodyConverter
            r2.<init>(r0, r1)
            return r2
    }

    public com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory setParserConfig(com.alibaba.fastjson.parser.ParserConfig r1) {
            r0 = this;
            r0.parserConfig = r1
            return r0
    }

    public com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory setParserFeatureValues(int r1) {
            r0 = this;
            r0.featureValues = r1
            return r0
    }

    public com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory setParserFeatures(com.alibaba.fastjson.parser.Feature[] r1) {
            r0 = this;
            r0.features = r1
            return r0
    }

    public com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory setSerializeConfig(com.alibaba.fastjson.serializer.SerializeConfig r1) {
            r0 = this;
            r0.serializeConfig = r1
            return r0
    }

    public com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory setSerializerFeatures(com.alibaba.fastjson.serializer.SerializerFeature[] r1) {
            r0 = this;
            r0.serializerFeatures = r1
            return r0
    }
}
