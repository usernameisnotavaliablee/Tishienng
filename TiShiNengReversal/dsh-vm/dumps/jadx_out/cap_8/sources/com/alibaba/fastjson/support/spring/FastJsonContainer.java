package com.alibaba.fastjson.support.spring;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastJsonContainer {
    private com.alibaba.fastjson.support.spring.PropertyPreFilters filters;
    private java.lang.Object value;

    FastJsonContainer(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public com.alibaba.fastjson.support.spring.PropertyPreFilters getFilters() {
            r1 = this;
            com.alibaba.fastjson.support.spring.PropertyPreFilters r0 = r1.filters
            return r0
    }

    public java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }

    public void setFilters(com.alibaba.fastjson.support.spring.PropertyPreFilters r1) {
            r0 = this;
            r0.filters = r1
            return
    }

    public void setValue(java.lang.Object r1) {
            r0 = this;
            r0.value = r1
            return
    }
}
