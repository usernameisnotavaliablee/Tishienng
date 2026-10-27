package com.alibaba.fastjson.support.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastJsonConfig {
    private java.nio.charset.Charset charset;
    private java.util.Map<java.lang.Class<?>, com.alibaba.fastjson.serializer.SerializeFilter> classSerializeFilters;
    private java.lang.String dateFormat;
    private com.alibaba.fastjson.parser.Feature[] features;
    private com.alibaba.fastjson.parser.ParserConfig parserConfig;
    private com.alibaba.fastjson.serializer.SerializeConfig serializeConfig;
    private com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilters;
    private com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatures;
    protected boolean writeContentLength;

    public FastJsonConfig() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.writeContentLength = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            r2.charset = r0
            com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.serializer.SerializeConfig.getGlobalInstance()
            r2.serializeConfig = r0
            com.alibaba.fastjson.parser.ParserConfig r0 = new com.alibaba.fastjson.parser.ParserConfig
            r0.<init>()
            r2.parserConfig = r0
            r0 = 0
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = new com.alibaba.fastjson.serializer.SerializerFeature[r0]
            r2.serializerFeatures = r1
            com.alibaba.fastjson.serializer.SerializeFilter[] r1 = new com.alibaba.fastjson.serializer.SerializeFilter[r0]
            r2.serializeFilters = r1
            com.alibaba.fastjson.parser.Feature[] r0 = new com.alibaba.fastjson.parser.Feature[r0]
            r2.features = r0
            return
    }

    public java.nio.charset.Charset getCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            return r0
    }

    public java.util.Map<java.lang.Class<?>, com.alibaba.fastjson.serializer.SerializeFilter> getClassSerializeFilters() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.alibaba.fastjson.serializer.SerializeFilter> r0 = r1.classSerializeFilters
            return r0
    }

    public java.lang.String getDateFormat() {
            r1 = this;
            java.lang.String r0 = r1.dateFormat
            return r0
    }

    public com.alibaba.fastjson.parser.Feature[] getFeatures() {
            r1 = this;
            com.alibaba.fastjson.parser.Feature[] r0 = r1.features
            return r0
    }

    public com.alibaba.fastjson.parser.ParserConfig getParserConfig() {
            r1 = this;
            com.alibaba.fastjson.parser.ParserConfig r0 = r1.parserConfig
            return r0
    }

    public com.alibaba.fastjson.serializer.SerializeConfig getSerializeConfig() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeConfig r0 = r1.serializeConfig
            return r0
    }

    public com.alibaba.fastjson.serializer.SerializeFilter[] getSerializeFilters() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeFilter[] r0 = r1.serializeFilters
            return r0
    }

    public com.alibaba.fastjson.serializer.SerializerFeature[] getSerializerFeatures() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = r1.serializerFeatures
            return r0
    }

    public boolean isWriteContentLength() {
            r1 = this;
            boolean r0 = r1.writeContentLength
            return r0
    }

    public void setCharset(java.nio.charset.Charset r1) {
            r0 = this;
            r0.charset = r1
            return
    }

    public void setClassSerializeFilters(java.util.Map<java.lang.Class<?>, com.alibaba.fastjson.serializer.SerializeFilter> r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.alibaba.fastjson.serializer.SerializeConfig r2 = r4.serializeConfig
            java.lang.Object r3 = r1.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Object r1 = r1.getValue()
            com.alibaba.fastjson.serializer.SerializeFilter r1 = (com.alibaba.fastjson.serializer.SerializeFilter) r1
            r2.addFilter(r3, r1)
            goto Lb
        L29:
            r4.classSerializeFilters = r5
            return
    }

    public void setDateFormat(java.lang.String r1) {
            r0 = this;
            r0.dateFormat = r1
            return
    }

    public void setFeatures(com.alibaba.fastjson.parser.Feature... r1) {
            r0 = this;
            r0.features = r1
            return
    }

    public void setParserConfig(com.alibaba.fastjson.parser.ParserConfig r1) {
            r0 = this;
            r0.parserConfig = r1
            return
    }

    public void setSerializeConfig(com.alibaba.fastjson.serializer.SerializeConfig r1) {
            r0 = this;
            r0.serializeConfig = r1
            return
    }

    public void setSerializeFilters(com.alibaba.fastjson.serializer.SerializeFilter... r1) {
            r0 = this;
            r0.serializeFilters = r1
            return
    }

    public void setSerializerFeatures(com.alibaba.fastjson.serializer.SerializerFeature... r1) {
            r0 = this;
            r0.serializerFeatures = r1
            return
    }

    public void setWriteContentLength(boolean r1) {
            r0 = this;
            r0.writeContentLength = r1
            return
    }
}
