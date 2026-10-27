package com.alibaba.fastjson.support.spring;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastJsonpHttpMessageConverter4 extends org.springframework.http.converter.AbstractGenericHttpMessageConverter<java.lang.Object> {
    private static final byte[] JSONP_FUNCTION_PREFIX_BYTES = null;
    private static final byte[] JSONP_FUNCTION_SUFFIX_BYTES = null;
    private com.alibaba.fastjson.support.config.FastJsonConfig fastJsonConfig;

    static {
            java.nio.charset.Charset r0 = com.alibaba.fastjson.util.IOUtils.UTF8
            java.lang.String r1 = "/**/"
            byte[] r1 = r1.getBytes(r0)
            com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4.JSONP_FUNCTION_PREFIX_BYTES = r1
            java.lang.String r1 = ");"
            byte[] r0 = r1.getBytes(r0)
            com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4.JSONP_FUNCTION_SUFFIX_BYTES = r0
            return
    }

    public FastJsonpHttpMessageConverter4() {
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

    protected void writeInternal(java.lang.Object r10, java.lang.reflect.Type r11, org.springframework.http.HttpOutputMessage r12) throws java.io.IOException, org.springframework.http.converter.HttpMessageNotWritableException {
            r9 = this;
            org.springframework.http.HttpHeaders r11 = r12.getHeaders()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            int r8 = r9.writePrefix(r0, r10)
            boolean r1 = r10 instanceof com.alibaba.fastjson.support.spring.MappingFastJsonValue
            if (r1 == 0) goto L1a
            r1 = r10
            com.alibaba.fastjson.support.spring.MappingFastJsonValue r1 = (com.alibaba.fastjson.support.spring.MappingFastJsonValue) r1
            java.lang.Object r1 = r1.getValue()
            r2 = r1
            goto L1b
        L1a:
            r2 = r10
        L1b:
            com.alibaba.fastjson.support.config.FastJsonConfig r1 = r9.fastJsonConfig
            java.nio.charset.Charset r1 = r1.getCharset()
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r9.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeConfig r3 = r3.getSerializeConfig()
            com.alibaba.fastjson.support.config.FastJsonConfig r4 = r9.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeFilter[] r4 = r4.getSerializeFilters()
            com.alibaba.fastjson.support.config.FastJsonConfig r5 = r9.fastJsonConfig
            java.lang.String r5 = r5.getDateFormat()
            int r6 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            com.alibaba.fastjson.support.config.FastJsonConfig r7 = r9.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializerFeature[] r7 = r7.getSerializerFeatures()
            int r1 = com.alibaba.fastjson.JSON.writeJSONString(r0, r1, r2, r3, r4, r5, r6, r7)
            int r8 = r8 + r1
            int r10 = r9.writeSuffix(r0, r10)
            int r8 = r8 + r10
            com.alibaba.fastjson.support.config.FastJsonConfig r10 = r9.fastJsonConfig
            boolean r10 = r10.isWriteContentLength()
            if (r10 == 0) goto L51
            long r1 = (long) r8
            r11.setContentLength(r1)
        L51:
            java.io.OutputStream r10 = r12.getBody()
            r0.writeTo(r10)
            r0.close()
            return
    }

    protected int writePrefix(java.io.ByteArrayOutputStream r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            boolean r0 = r4 instanceof com.alibaba.fastjson.support.spring.MappingFastJsonValue
            if (r0 == 0) goto Lb
            com.alibaba.fastjson.support.spring.MappingFastJsonValue r4 = (com.alibaba.fastjson.support.spring.MappingFastJsonValue) r4
            java.lang.String r4 = r4.getJsonpFunction()
            goto Lc
        Lb:
            r4 = 0
        Lc:
            if (r4 == 0) goto L31
            byte[] r0 = com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4.JSONP_FUNCTION_PREFIX_BYTES
            r3.write(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = "("
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.nio.charset.Charset r1 = com.alibaba.fastjson.util.IOUtils.UTF8
            byte[] r4 = r4.getBytes(r1)
            r3.write(r4)
            int r3 = r0.length
            int r4 = r4.length
            int r3 = r3 + r4
            return r3
        L31:
            r3 = 0
            return r3
    }

    protected int writeSuffix(java.io.ByteArrayOutputStream r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.alibaba.fastjson.support.spring.MappingFastJsonValue
            if (r0 == 0) goto Lb
            com.alibaba.fastjson.support.spring.MappingFastJsonValue r3 = (com.alibaba.fastjson.support.spring.MappingFastJsonValue) r3
            java.lang.String r3 = r3.getJsonpFunction()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 == 0) goto L15
            byte[] r3 = com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4.JSONP_FUNCTION_SUFFIX_BYTES
            r2.write(r3)
            int r2 = r3.length
            return r2
        L15:
            r2 = 0
            return r2
    }
}
