package com.alibaba.fastjson.support.spring;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@org.springframework.web.bind.annotation.ControllerAdvice
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastJsonpResponseBodyAdvice implements org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice<java.lang.Object> {
    private static final java.util.regex.Pattern CALLBACK_PARAM_PATTERN = null;
    public static final java.lang.String[] DEFAULT_JSONP_QUERY_PARAM_NAMES = null;
    private final java.lang.String[] jsonpQueryParamNames;

    static {
            java.lang.String r0 = "[0-9A-Za-z_\\.]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.alibaba.fastjson.support.spring.FastJsonpResponseBodyAdvice.CALLBACK_PARAM_PATTERN = r0
            java.lang.String r0 = "callback"
            java.lang.String r1 = "jsonp"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.alibaba.fastjson.support.spring.FastJsonpResponseBodyAdvice.DEFAULT_JSONP_QUERY_PARAM_NAMES = r0
            return
    }

    public FastJsonpResponseBodyAdvice() {
            r1 = this;
            r1.<init>()
            java.lang.String[] r0 = com.alibaba.fastjson.support.spring.FastJsonpResponseBodyAdvice.DEFAULT_JSONP_QUERY_PARAM_NAMES
            r1.jsonpQueryParamNames = r0
            return
    }

    public FastJsonpResponseBodyAdvice(java.lang.String... r3) {
            r2 = this;
            r2.<init>()
            boolean r0 = org.springframework.util.ObjectUtils.isEmpty(r3)
            r0 = r0 ^ 1
            java.lang.String r1 = "At least one query param name is required"
            org.springframework.util.Assert.isTrue(r0, r1)
            r2.jsonpQueryParamNames = r3
            return
    }

    public java.lang.Object beforeBodyWrite(java.lang.Object r1, org.springframework.core.MethodParameter r2, org.springframework.http.MediaType r3, java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> r4, org.springframework.http.server.ServerHttpRequest r5, org.springframework.http.server.ServerHttpResponse r6) {
            r0 = this;
            com.alibaba.fastjson.support.spring.MappingFastJsonValue r1 = r0.getOrCreateContainer(r1)
            r4 = r2
            r2 = r1
            r1 = r0
            r1.beforeBodyWriteInternal(r2, r3, r4, r5, r6)
            return r2
    }

    public void beforeBodyWriteInternal(com.alibaba.fastjson.support.spring.MappingFastJsonValue r6, org.springframework.http.MediaType r7, org.springframework.core.MethodParameter r8, org.springframework.http.server.ServerHttpRequest r9, org.springframework.http.server.ServerHttpResponse r10) {
            r5 = this;
            r8 = r9
            org.springframework.http.server.ServletServerHttpRequest r8 = (org.springframework.http.server.ServletServerHttpRequest) r8
            javax.servlet.http.HttpServletRequest r8 = r8.getServletRequest()
            java.lang.String[] r0 = r5.jsonpQueryParamNames
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L2e
            r3 = r0[r2]
            java.lang.String r3 = r8.getParameter(r3)
            if (r3 == 0) goto L2b
            boolean r4 = r5.isValidJsonpQueryParam(r3)
            if (r4 != 0) goto L1c
            goto L2b
        L1c:
            org.springframework.http.MediaType r7 = r5.getContentType(r7, r9, r10)
            org.springframework.http.HttpHeaders r8 = r10.getHeaders()
            r8.setContentType(r7)
            r6.setJsonpFunction(r3)
            return
        L2b:
            int r2 = r2 + 1
            goto Lb
        L2e:
            return
    }

    protected org.springframework.http.MediaType getContentType(org.springframework.http.MediaType r1, org.springframework.http.server.ServerHttpRequest r2, org.springframework.http.server.ServerHttpResponse r3) {
            r0 = this;
            org.springframework.http.MediaType r1 = new org.springframework.http.MediaType
            java.lang.String r2 = "application"
            java.lang.String r3 = "javascript"
            r1.<init>(r2, r3)
            return r1
    }

    protected com.alibaba.fastjson.support.spring.MappingFastJsonValue getOrCreateContainer(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.alibaba.fastjson.support.spring.MappingFastJsonValue
            if (r0 == 0) goto L7
            com.alibaba.fastjson.support.spring.MappingFastJsonValue r2 = (com.alibaba.fastjson.support.spring.MappingFastJsonValue) r2
            return r2
        L7:
            com.alibaba.fastjson.support.spring.MappingFastJsonValue r0 = new com.alibaba.fastjson.support.spring.MappingFastJsonValue
            r0.<init>(r2)
            return r0
    }

    protected boolean isValidJsonpQueryParam(java.lang.String r2) {
            r1 = this;
            java.util.regex.Pattern r0 = com.alibaba.fastjson.support.spring.FastJsonpResponseBodyAdvice.CALLBACK_PARAM_PATTERN
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.matches()
            return r2
    }

    public boolean supports(org.springframework.core.MethodParameter r1, java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> r2) {
            r0 = this;
            java.lang.Class<com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4> r1 = com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4.class
            boolean r1 = r1.isAssignableFrom(r2)
            return r1
    }
}
