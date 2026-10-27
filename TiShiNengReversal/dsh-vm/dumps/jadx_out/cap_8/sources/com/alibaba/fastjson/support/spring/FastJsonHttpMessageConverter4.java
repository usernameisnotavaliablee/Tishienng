package com.alibaba.fastjson.support.spring;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastJsonHttpMessageConverter4 extends org.springframework.http.converter.AbstractGenericHttpMessageConverter<java.lang.Object> {
    private com.alibaba.fastjson.support.config.FastJsonConfig fastJsonConfig;

    public FastJsonHttpMessageConverter4() {
            r1 = this;
            org.springframework.http.MediaType r0 = org.springframework.http.MediaType.ALL
            r1.<init>(r0)
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = new com.alibaba.fastjson.support.config.FastJsonConfig
            r0.<init>()
            r1.fastJsonConfig = r0
            return
    }

    public com.alibaba.fastjson.support.config.FastJsonConfig getFastJsonConfig() {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
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

    public void setFastJsonConfig(com.alibaba.fastjson.support.config.FastJsonConfig r1) {
            r0 = this;
            r0.fastJsonConfig = r1
            return
    }

    protected boolean supports(java.lang.Class<?> r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    protected void writeInternal(java.lang.Object r9, java.lang.reflect.Type r10, org.springframework.http.HttpOutputMessage r11) throws java.io.IOException, org.springframework.http.converter.HttpMessageNotWritableException {
            r8 = this;
            org.springframework.http.HttpHeaders r10 = r11.getHeaders()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.alibaba.fastjson.support.config.FastJsonConfig r1 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeFilter[] r1 = r1.getSerializeFilters()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.<init>(r1)
            boolean r1 = r9 instanceof com.alibaba.fastjson.support.spring.FastJsonContainer
            if (r1 == 0) goto L2d
            com.alibaba.fastjson.support.spring.FastJsonContainer r9 = (com.alibaba.fastjson.support.spring.FastJsonContainer) r9
            com.alibaba.fastjson.support.spring.PropertyPreFilters r1 = r9.getFilters()
            java.util.List r1 = r1.getFilters()
            r2.addAll(r1)
            java.lang.Object r9 = r9.getValue()
        L2d:
            int r1 = r2.size()
            com.alibaba.fastjson.serializer.SerializeFilter[] r1 = new com.alibaba.fastjson.serializer.SerializeFilter[r1]
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r8.fastJsonConfig
            java.nio.charset.Charset r3 = r3.getCharset()
            com.alibaba.fastjson.support.config.FastJsonConfig r4 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeConfig r4 = r4.getSerializeConfig()
            java.lang.Object[] r1 = r2.toArray(r1)
            com.alibaba.fastjson.serializer.SerializeFilter[] r1 = (com.alibaba.fastjson.serializer.SerializeFilter[]) r1
            com.alibaba.fastjson.support.config.FastJsonConfig r2 = r8.fastJsonConfig
            java.lang.String r5 = r2.getDateFormat()
            int r6 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            com.alibaba.fastjson.support.config.FastJsonConfig r2 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializerFeature[] r7 = r2.getSerializerFeatures()
            r2 = r4
            r4 = r1
            r1 = r3
            r3 = r2
            r2 = r9
            int r9 = com.alibaba.fastjson.JSON.writeJSONString(r0, r1, r2, r3, r4, r5, r6, r7)
            com.alibaba.fastjson.support.config.FastJsonConfig r1 = r8.fastJsonConfig
            boolean r1 = r1.isWriteContentLength()
            if (r1 == 0) goto L68
            long r1 = (long) r9
            r10.setContentLength(r1)
        L68:
            java.io.OutputStream r9 = r11.getBody()
            r0.writeTo(r9)
            r0.close()
            return
    }
}
