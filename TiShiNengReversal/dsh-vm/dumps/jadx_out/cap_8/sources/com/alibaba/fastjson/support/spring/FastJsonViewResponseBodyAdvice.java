package com.alibaba.fastjson.support.spring;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@org.springframework.web.bind.annotation.ControllerAdvice
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastJsonViewResponseBodyAdvice implements org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice<java.lang.Object> {
    public FastJsonViewResponseBodyAdvice() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.alibaba.fastjson.support.spring.FastJsonContainer getOrCreateContainer(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.alibaba.fastjson.support.spring.FastJsonContainer
            if (r0 == 0) goto L7
            com.alibaba.fastjson.support.spring.FastJsonContainer r2 = (com.alibaba.fastjson.support.spring.FastJsonContainer) r2
            return r2
        L7:
            com.alibaba.fastjson.support.spring.FastJsonContainer r0 = new com.alibaba.fastjson.support.spring.FastJsonContainer
            r0.<init>(r2)
            return r0
    }

    public com.alibaba.fastjson.support.spring.FastJsonContainer beforeBodyWrite(java.lang.Object r1, org.springframework.core.MethodParameter r2, org.springframework.http.MediaType r3, java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> r4, org.springframework.http.server.ServerHttpRequest r5, org.springframework.http.server.ServerHttpResponse r6) {
            r0 = this;
            com.alibaba.fastjson.support.spring.FastJsonContainer r1 = r0.getOrCreateContainer(r1)
            r4 = r2
            r2 = r1
            r1 = r0
            r1.beforeBodyWriteInternal(r2, r3, r4, r5, r6)
            return r2
    }

    /* renamed from: beforeBodyWrite, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m2beforeBodyWrite(java.lang.Object r1, org.springframework.core.MethodParameter r2, org.springframework.http.MediaType r3, java.lang.Class r4, org.springframework.http.server.ServerHttpRequest r5, org.springframework.http.server.ServerHttpResponse r6) {
            r0 = this;
            com.alibaba.fastjson.support.spring.FastJsonContainer r1 = r0.beforeBodyWrite(r1, r2, r3, r4, r5, r6)
            return r1
    }

    protected void beforeBodyWriteInternal(com.alibaba.fastjson.support.spring.FastJsonContainer r5, org.springframework.http.MediaType r6, org.springframework.core.MethodParameter r7, org.springframework.http.server.ServerHttpRequest r8, org.springframework.http.server.ServerHttpResponse r9) {
            r4 = this;
            java.lang.Class<com.alibaba.fastjson.support.spring.annotation.FastJsonView> r6 = com.alibaba.fastjson.support.spring.annotation.FastJsonView.class
            java.lang.annotation.Annotation r6 = r7.getMethodAnnotation(r6)
            com.alibaba.fastjson.support.spring.annotation.FastJsonView r6 = (com.alibaba.fastjson.support.spring.annotation.FastJsonView) r6
            com.alibaba.fastjson.support.spring.annotation.FastJsonFilter[] r7 = r6.include()
            com.alibaba.fastjson.support.spring.annotation.FastJsonFilter[] r6 = r6.exclude()
            com.alibaba.fastjson.support.spring.PropertyPreFilters r8 = new com.alibaba.fastjson.support.spring.PropertyPreFilters
            r8.<init>()
            int r9 = r7.length
            r0 = 0
            r1 = 0
        L18:
            if (r1 >= r9) goto L2a
            r2 = r7[r1]
            java.lang.Class r3 = r2.clazz()
            java.lang.String[] r2 = r2.props()
            r8.addFilter(r3, r2)
            int r1 = r1 + 1
            goto L18
        L2a:
            int r7 = r6.length
            r9 = 0
        L2c:
            if (r9 >= r7) goto L44
            r1 = r6[r9]
            java.lang.Class r2 = r1.clazz()
            java.lang.String[] r3 = new java.lang.String[r0]
            com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter r2 = r8.addFilter(r2, r3)
            java.lang.String[] r1 = r1.props()
            r2.addExcludes(r1)
            int r9 = r9 + 1
            goto L2c
        L44:
            r5.setFilters(r8)
            return
    }

    public boolean supports(org.springframework.core.MethodParameter r2, java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> r3) {
            r1 = this;
            java.lang.Class<com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4> r0 = com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4.class
            boolean r3 = r0.isAssignableFrom(r3)
            if (r3 == 0) goto L12
            java.lang.Class<com.alibaba.fastjson.support.spring.annotation.FastJsonView> r3 = com.alibaba.fastjson.support.spring.annotation.FastJsonView.class
            boolean r2 = r2.hasMethodAnnotation(r3)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }
}
