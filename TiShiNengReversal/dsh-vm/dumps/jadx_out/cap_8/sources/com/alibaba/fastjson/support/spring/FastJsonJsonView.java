package com.alibaba.fastjson.support.spring;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastJsonJsonView extends org.springframework.web.servlet.view.AbstractView {
    public static final java.lang.String DEFAULT_CONTENT_TYPE = "application/json;charset=UTF-8";

    @java.lang.Deprecated
    protected java.nio.charset.Charset charset;

    @java.lang.Deprecated
    protected java.lang.String dateFormat;
    private boolean disableCaching;
    private boolean extractValueFromSingleKeyModel;
    private com.alibaba.fastjson.support.config.FastJsonConfig fastJsonConfig;

    @java.lang.Deprecated
    protected com.alibaba.fastjson.serializer.SerializerFeature[] features;

    @java.lang.Deprecated
    protected com.alibaba.fastjson.serializer.SerializeFilter[] filters;
    private java.util.Set<java.lang.String> renderedAttributes;
    private boolean updateContentLength;

    public FastJsonJsonView() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            r2.charset = r0
            r0 = 0
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = new com.alibaba.fastjson.serializer.SerializerFeature[r0]
            r2.features = r1
            com.alibaba.fastjson.serializer.SerializeFilter[] r1 = new com.alibaba.fastjson.serializer.SerializeFilter[r0]
            r2.filters = r1
            r1 = 1
            r2.disableCaching = r1
            r2.updateContentLength = r1
            r2.extractValueFromSingleKeyModel = r0
            com.alibaba.fastjson.support.config.FastJsonConfig r1 = new com.alibaba.fastjson.support.config.FastJsonConfig
            r1.<init>()
            r2.fastJsonConfig = r1
            java.lang.String r1 = "application/json;charset=UTF-8"
            r2.setContentType(r1)
            r2.setExposePathVariables(r0)
            return
    }

    protected java.lang.Object filterModel(java.util.Map<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Set<java.lang.String> r1 = r4.renderedAttributes
            boolean r1 = org.springframework.util.CollectionUtils.isEmpty(r1)
            if (r1 != 0) goto L14
            java.util.Set<java.lang.String> r1 = r4.renderedAttributes
            goto L18
        L14:
            java.util.Set r1 = r5.keySet()
        L18:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L20:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof org.springframework.validation.BindingResult
            if (r3 != 0) goto L20
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r0.put(r3, r2)
            goto L20
        L4a:
            boolean r5 = r4.extractValueFromSingleKeyModel
            if (r5 == 0) goto L6e
            int r5 = r0.size()
            r1 = 1
            if (r5 != r1) goto L6e
            java.util.Set r5 = r0.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r5 = r5.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            return r5
        L6e:
            return r0
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

    public boolean isExtractValueFromSingleKeyModel() {
            r1 = this;
            boolean r0 = r1.extractValueFromSingleKeyModel
            return r0
    }

    protected void prepareResponse(javax.servlet.http.HttpServletRequest r3, javax.servlet.http.HttpServletResponse r4) {
            r2 = this;
            r2.setResponseContentType(r3, r4)
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r2.fastJsonConfig
            java.nio.charset.Charset r3 = r3.getCharset()
            java.lang.String r3 = r3.name()
            r4.setCharacterEncoding(r3)
            boolean r3 = r2.disableCaching
            if (r3 == 0) goto L29
            java.lang.String r3 = "Pragma"
            java.lang.String r0 = "no-cache"
            r4.addHeader(r3, r0)
            java.lang.String r3 = "Cache-Control"
            java.lang.String r0 = "no-cache, no-store, max-age=0"
            r4.addHeader(r3, r0)
            java.lang.String r3 = "Expires"
            r0 = 1
            r4.addDateHeader(r3, r0)
        L29:
            return
    }

    protected void renderMergedOutputModel(java.util.Map<java.lang.String, java.lang.Object> r9, javax.servlet.http.HttpServletRequest r10, javax.servlet.http.HttpServletResponse r11) throws java.lang.Exception {
            r8 = this;
            java.lang.Object r2 = r8.filterModel(r9)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.alibaba.fastjson.support.config.FastJsonConfig r9 = r8.fastJsonConfig
            java.nio.charset.Charset r1 = r9.getCharset()
            com.alibaba.fastjson.support.config.FastJsonConfig r9 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeConfig r3 = r9.getSerializeConfig()
            com.alibaba.fastjson.support.config.FastJsonConfig r9 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializeFilter[] r4 = r9.getSerializeFilters()
            com.alibaba.fastjson.support.config.FastJsonConfig r9 = r8.fastJsonConfig
            java.lang.String r5 = r9.getDateFormat()
            int r6 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            com.alibaba.fastjson.support.config.FastJsonConfig r9 = r8.fastJsonConfig
            com.alibaba.fastjson.serializer.SerializerFeature[] r7 = r9.getSerializerFeatures()
            int r9 = com.alibaba.fastjson.JSON.writeJSONString(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r10 = r8.updateContentLength
            if (r10 == 0) goto L34
            r11.setContentLength(r9)
        L34:
            javax.servlet.ServletOutputStream r9 = r11.getOutputStream()
            r0.writeTo(r9)
            r0.close()
            r9.flush()
            return
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

    public void setDisableCaching(boolean r1) {
            r0 = this;
            r0.disableCaching = r1
            return
    }

    public void setExtractValueFromSingleKeyModel(boolean r1) {
            r0 = this;
            r0.extractValueFromSingleKeyModel = r1
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

    public void setRenderedAttributes(java.util.Set<java.lang.String> r1) {
            r0 = this;
            r0.renderedAttributes = r1
            return
    }

    @java.lang.Deprecated
    public void setSerializerFeature(com.alibaba.fastjson.serializer.SerializerFeature... r2) {
            r1 = this;
            com.alibaba.fastjson.support.config.FastJsonConfig r0 = r1.fastJsonConfig
            r0.setSerializerFeatures(r2)
            return
    }

    public void setUpdateContentLength(boolean r1) {
            r0 = this;
            r0.updateContentLength = r1
            return
    }
}
