package com.alibaba.fastjson.support.spring;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastJsonHttpMessageConverter extends org.springframework.http.converter.AbstractHttpMessageConverter<java.lang.Object> implements org.springframework.http.converter.GenericHttpMessageConverter<java.lang.Object> {
    private java.nio.charset.Charset charset;

    @java.lang.Deprecated
    protected java.lang.String dateFormat;
    private com.alibaba.fastjson.support.config.FastJsonConfig fastJsonConfig;

    @java.lang.Deprecated
    protected com.alibaba.fastjson.serializer.SerializerFeature[] features;

    @java.lang.Deprecated
    protected com.alibaba.fastjson.serializer.SerializeFilter[] filters;

    public FastJsonHttpMessageConverter() {
            r2 = this;
            org.springframework.http.MediaType r0 = org.springframework.http.MediaType.ALL
            r2.<init>(r0)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            r2.charset = r0
            r0 = 0
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = new com.alibaba.fastjson.serializer.SerializerFeature[r0]
            r2.features = r1
            com.alibaba.fastjson.serializer.SerializeFilter[] r0 = new com.alibaba.fastjson.serializer.SerializeFilter[r0]
            r2.filters = r0
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = new com.alibaba.fastjson.support.config.FastJsonConfig
            r0.<init>()
            r2.fastJsonConfig = r0
            return
    }

    @java.lang.Deprecated
    public void addSerializeFilter(com.alibaba.fastjson.serializer.SerializeFilter r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r4.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeFilter[] r0 = r0.getSerializeFilters()
            int r0 = r0.length
            int r1 = r0 + 1
            com.alibaba.fastjson.serializer.SerializeFilter[] r1 = new com.alibaba.fastjson.serializer.SerializeFilter[r1]
            com.alibaba.fastjson.support.config.FastJsonConfig r2 = r4.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeFilter[] r2 = r2.getSerializeFilters()
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            r1[r0] = r5
            com.alibaba.fastjson.support.config.FastJsonConfig r5 = r4.fastJsonConfig
            r5.setSerializeFilters(r1)
            return
    }

    public boolean canRead(java.lang.reflect.Type r1, java.lang.Class<?> r2, org.springframework.http.MediaType r3) {
            r0 = this;
            boolean r1 = super.canRead(r2, r3)
            return r1
    }

    public boolean canWrite(java.lang.reflect.Type r1, java.lang.Class<?> r2, org.springframework.http.MediaType r3) {
            r0 = this;
            boolean r1 = super.canWrite(r2, r3)
            return r1
    }

    @java.lang.Deprecated
    public java.nio.charset.Charset getCharset() {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            java.nio.charset.Charset r0 = r0.getCharset()
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getDateFormat() {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            java.lang.String r0 = r0.getDateFormat()
            return r0
    }

    public com.alibaba.fastjson.support.config.FastJsonConfig getFastJsonConfig() {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            return r0
    }

    @java.lang.Deprecated
    public com.alibaba.fastjson.serializer.SerializerFeature[] getFeatures() {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = r0.getSerializerFeatures()
            return r0
    }

    @java.lang.Deprecated
    public com.alibaba.fastjson.serializer.SerializeFilter[] getFilters() {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeFilter[] r0 = r0.getSerializeFilters()
            return r0
    }

    public java.lang.Object read(java.lang.reflect.Type r2, java.lang.Class<?> r3, org.springframework.http.HttpInputMessage r4) throws java.io.IOException, org.springframework.http.converter.HttpMessageNotReadableException {
            r1 = this;
            java.io.InputStream r3 = r4.getBody()
            com.alibaba.fastjson.support.config.FastJsonConfig r4 = r1.fastJsonConfig
            java.nio.charset.Charset r4 = r4.getCharset()
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            com.alibaba.fastjson.parser.Feature[] r0 = r0.getFeatures()
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject(r3, r4, r2, r0)
            return r2
    }

    protected java.lang.Object readInternal(java.lang.Class<? extends java.lang.Object> r3, org.springframework.http.HttpInputMessage r4) throws java.io.IOException, org.springframework.http.converter.HttpMessageNotReadableException {
            r2 = this;
            java.io.InputStream r4 = r4.getBody()
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r2.fastJsonConfig
            java.nio.charset.Charset r0 = r0.getCharset()
            com.alibaba.fastjson.support.config.FastJsonConfig r1 = r2.fastJsonConfig
            com.alibaba.fastjson.parser.Feature[] r1 = r1.getFeatures()
            java.lang.Object r3 = com.alibaba.fastjson.JSON.parseObject(r4, r0, r3, r1)
            return r3
    }

    @java.lang.Deprecated
    public void setCharset(java.nio.charset.Charset r2) {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            r0.setCharset(r2)
            return
    }

    @java.lang.Deprecated
    public void setDateFormat(java.lang.String r2) {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            r0.setDateFormat(r2)
            return
    }

    public void setFastJsonConfig(com.alibaba.fastjson.support.config.FastJsonConfig r1) {
            r0 = this;
            r0.fastJsonConfig = r1
            return
    }

    @java.lang.Deprecated
    public void setFeatures(com.alibaba.fastjson.serializer.SerializerFeature... r2) {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            r0.setSerializerFeatures(r2)
            return
    }

    @java.lang.Deprecated
    public void setFilters(com.alibaba.fastjson.serializer.SerializeFilter... r2) {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            r0.setSerializeFilters(r2)
            return
    }

    protected boolean supports(java.lang.Class<?> r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void write(java.lang.Object r5, java.lang.reflect.Type r6, org.springframework.http.MediaType r7, org.springframework.http.HttpOutputMessage r8) throws java.io.IOException, org.springframework.http.converter.HttpMessageNotWritableException {
            r4 = this;
            org.springframework.http.HttpHeaders r6 = r8.getHeaders()
            org.springframework.http.MediaType r0 = r6.getContentType()
            if (r0 != 0) goto L21
            if (r7 == 0) goto L18
            boolean r0 = r7.isWildcardType()
            if (r0 != 0) goto L18
            boolean r0 = r7.isWildcardSubtype()
            if (r0 == 0) goto L1c
        L18:
            org.springframework.http.MediaType r7 = r4.getDefaultContentType(r5)
        L1c:
            if (r7 == 0) goto L21
            r6.setContentType(r7)
        L21:
            long r0 = r6.getContentLength()
            r2 = -1
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L3c
            org.springframework.http.MediaType r7 = r6.getContentType()
            java.lang.Long r7 = r4.getContentLength(r5, r7)
            if (r7 == 0) goto L3c
            long r0 = r7.longValue()
            r6.setContentLength(r0)
        L3c:
            r4.writeInternal(r5, r8)
            java.io.OutputStream r5 = r8.getBody()
            r5.flush()
            return
    }

    protected void writeInternal(java.lang.Object r10, org.springframework.http.HttpOutputMessage r11) throws java.io.IOException, org.springframework.http.converter.HttpMessageNotWritableException {
            r9 = this;
            org.springframework.http.HttpHeaders r0 = r11.getHeaders()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            if (r10 == 0) goto L3b
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "com.fasterxml.jackson.databind.node.ObjectNode"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3b
            java.lang.String r10 = r10.toString()
            java.io.OutputStream r11 = r11.getBody()
            byte[] r2 = r10.getBytes()
            r11.write(r2)
            com.alibaba.fastjson.support.config.FastJsonConfig r11 = r9.fastJsonConfig
            boolean r11 = r11.isWriteContentLength()
            if (r11 == 0) goto L73
            int r10 = r10.length()
            long r10 = (long) r10
            r0.setContentLength(r10)
            goto L73
        L3b:
            com.alibaba.fastjson.support.config.FastJsonConfig r2 = r9.fastJsonConfig
            java.nio.charset.Charset r2 = r2.getCharset()
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r9.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeConfig r4 = r3.getSerializeConfig()
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r9.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeFilter[] r5 = r3.getSerializeFilters()
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r9.fastJsonConfig
            java.lang.String r6 = r3.getDateFormat()
            int r7 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r9.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializerFeature[] r8 = r3.getSerializerFeatures()
            r3 = r10
            int r10 = com.alibaba.fastjson.JSON.writeJSONString(r1, r2, r3, r4, r5, r6, r7, r8)
            com.alibaba.fastjson.support.config.FastJsonConfig r2 = r9.fastJsonConfig
            boolean r2 = r2.isWriteContentLength()
            if (r2 == 0) goto L6c
            long r2 = (long) r10
            r0.setContentLength(r2)
        L6c:
            java.io.OutputStream r10 = r11.getBody()
            r1.writeTo(r10)
        L73:
            r1.close()
            return
    }
}
