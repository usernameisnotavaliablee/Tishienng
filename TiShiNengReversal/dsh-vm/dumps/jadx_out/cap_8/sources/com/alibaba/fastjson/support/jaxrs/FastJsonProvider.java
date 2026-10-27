package com.alibaba.fastjson.support.jaxrs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@javax.ws.rs.Produces({"*/*"})
@javax.ws.rs.ext.Provider
@javax.ws.rs.Consumes({"*/*"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastJsonProvider implements javax.ws.rs.ext.MessageBodyReader<java.lang.Object>, javax.ws.rs.ext.MessageBodyWriter<java.lang.Object> {

    @java.lang.Deprecated
    protected java.nio.charset.Charset charset;
    private java.lang.Class<?>[] clazzes;

    @java.lang.Deprecated
    protected java.lang.String dateFormat;
    private com.alibaba.fastjson.support.config.FastJsonConfig fastJsonConfig;

    @java.lang.Deprecated
    protected com.alibaba.fastjson.serializer.SerializerFeature[] features;

    @java.lang.Deprecated
    protected com.alibaba.fastjson.serializer.SerializeFilter[] filters;
    private boolean pretty;

    public FastJsonProvider() {
            r2 = this;
            r2.<init>()
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
            r0 = 0
            r2.clazzes = r0
            return
    }

    @java.lang.Deprecated
    public FastJsonProvider(java.lang.String r3) {
            r2 = this;
            r2.<init>()
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
            r1 = 0
            r2.clazzes = r1
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r0.setCharset(r3)
            return
    }

    public FastJsonProvider(java.lang.Class<?>[] r3) {
            r2 = this;
            r2.<init>()
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
            r2.clazzes = r3
            return
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

    public long getSize(java.lang.Object r1, java.lang.Class<?> r2, java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4, javax.ws.rs.core.MediaType r5) {
            r0 = this;
            r1 = -1
            return r1
    }

    protected boolean hasMatchingMediaType(javax.ws.rs.core.MediaType r4) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L40
            java.lang.String r4 = r4.getSubtype()
            java.lang.String r1 = "json"
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 != 0) goto L40
            java.lang.String r1 = "+json"
            boolean r1 = r4.endsWith(r1)
            if (r1 != 0) goto L40
            java.lang.String r1 = "javascript"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L40
            java.lang.String r1 = "x-javascript"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L40
            java.lang.String r1 = "x-json"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L40
            java.lang.String r1 = "x-www-form-urlencoded"
            boolean r2 = r1.equalsIgnoreCase(r4)
            if (r2 != 0) goto L40
            boolean r4 = r4.endsWith(r1)
            if (r4 == 0) goto L3e
            goto L40
        L3e:
            r4 = 0
            return r4
        L40:
            return r0
    }

    public boolean isReadable(java.lang.Class<?> r1, java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3, javax.ws.rs.core.MediaType r4) {
            r0 = this;
            boolean r2 = r0.hasMatchingMediaType(r4)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = r0.isValidType(r1, r3)
            return r1
    }

    protected boolean isValidType(java.lang.Class<?> r6, java.lang.annotation.Annotation[] r7) {
            r5 = this;
            r7 = 0
            if (r6 != 0) goto L4
            return r7
        L4:
            java.lang.Class<?>[] r0 = r5.clazzes
            r1 = 1
            if (r0 == 0) goto L16
            int r2 = r0.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L15
            r4 = r0[r3]
            if (r4 != r6) goto L12
            return r1
        L12:
            int r3 = r3 + 1
            goto Lb
        L15:
            return r7
        L16:
            return r1
    }

    public boolean isWriteable(java.lang.Class<?> r1, java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3, javax.ws.rs.core.MediaType r4) {
            r0 = this;
            boolean r2 = r0.hasMatchingMediaType(r4)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = r0.isValidType(r1, r3)
            return r1
    }

    public java.lang.Object readFrom(java.lang.Class<java.lang.Object> r1, java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3, javax.ws.rs.core.MediaType r4, javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.String> r5, java.io.InputStream r6) throws java.io.IOException, javax.ws.rs.WebApplicationException {
            r0 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r1 = r0.fastJsonConfig
            java.nio.charset.Charset r1 = r1.getCharset()
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r0.fastJsonConfig
            com.alibaba.fastjson.parser.Feature[] r3 = r3.getFeatures()
            java.lang.Object r1 = com.alibaba.fastjson.JSON.parseObject(r6, r1, r2, r3)
            return r1
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

    public com.alibaba.fastjson.support.jaxrs.FastJsonProvider setPretty(boolean r1) {
            r0 = this;
            r0.pretty = r1
            return r0
    }

    public void writeTo(java.lang.Object r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.lang.annotation.Annotation[] r12, javax.ws.rs.core.MediaType r13, javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.Object> r14, java.io.OutputStream r15) throws java.io.IOException, javax.ws.rs.WebApplicationException {
            r8 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r10 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializerFeature[] r10 = r10.getSerializerFeatures()
            boolean r11 = r8.pretty
            if (r11 == 0) goto L2e
            if (r10 != 0) goto L15
            r10 = 1
            com.alibaba.fastjson.serializer.SerializerFeature[] r10 = new com.alibaba.fastjson.serializer.SerializerFeature[r10]
            r11 = 0
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat
            r10[r11] = r12
            goto L29
        L15:
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.List r12 = java.util.Arrays.asList(r10)
            r11.<init>(r12)
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat
            r11.add(r12)
            java.lang.Object[] r10 = r11.toArray(r10)
            com.alibaba.fastjson.serializer.SerializerFeature[] r10 = (com.alibaba.fastjson.serializer.SerializerFeature[]) r10
        L29:
            com.alibaba.fastjson.support.config.FastJsonConfig r11 = r8.fastJsonConfig
            r11.setSerializerFeatures(r10)
        L2e:
            com.alibaba.fastjson.support.config.FastJsonConfig r10 = r8.fastJsonConfig
            java.nio.charset.Charset r1 = r10.getCharset()
            com.alibaba.fastjson.support.config.FastJsonConfig r10 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeConfig r3 = r10.getSerializeConfig()
            com.alibaba.fastjson.support.config.FastJsonConfig r10 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeFilter[] r4 = r10.getSerializeFilters()
            com.alibaba.fastjson.support.config.FastJsonConfig r10 = r8.fastJsonConfig
            java.lang.String r5 = r10.getDateFormat()
            int r6 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            com.alibaba.fastjson.support.config.FastJsonConfig r10 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializerFeature[] r7 = r10.getSerializerFeatures()
            r2 = r9
            r0 = r15
            int r9 = com.alibaba.fastjson.JSON.writeJSONString(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r10 = "Content-Length"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r14.add(r10, r9)
            r0.flush()
            return
    }
}
