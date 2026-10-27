package com.alibaba.fastjson.support.spring;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PropertyPreFilters {
    private java.util.List<com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter> filters;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class MySimplePropertyPreFilter extends com.alibaba.fastjson.serializer.SimplePropertyPreFilter {
        final /* synthetic */ com.alibaba.fastjson.support.spring.PropertyPreFilters this$0;

        public MySimplePropertyPreFilter(com.alibaba.fastjson.support.spring.PropertyPreFilters r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
                r0.<init>(r1)
                return
        }

        public MySimplePropertyPreFilter(com.alibaba.fastjson.support.spring.PropertyPreFilters r1, java.lang.Class<?> r2, java.lang.String... r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                return
        }

        public MySimplePropertyPreFilter(com.alibaba.fastjson.support.spring.PropertyPreFilters r1, java.lang.String... r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        public com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter addExcludes(java.lang.String... r4) {
                r3 = this;
                r0 = 0
            L1:
                int r1 = r4.length
                if (r0 >= r1) goto L10
                java.util.Set r1 = r3.getExcludes()
                r2 = r4[r0]
                r1.add(r2)
                int r0 = r0 + 1
                goto L1
            L10:
                return r3
        }

        public com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter addIncludes(java.lang.String... r4) {
                r3 = this;
                r0 = 0
            L1:
                int r1 = r4.length
                if (r0 >= r1) goto L10
                java.util.Set r1 = r3.getIncludes()
                r2 = r4[r0]
                r1.add(r2)
                int r0 = r0 + 1
                goto L1
            L10:
                return r3
        }
    }

    public PropertyPreFilters() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.filters = r0
            return
    }

    public com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter addFilter() {
            r2 = this;
            com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter r0 = new com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter
            r0.<init>(r2)
            java.util.List<com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter> r1 = r2.filters
            r1.add(r0)
            return r0
    }

    public com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter addFilter(java.lang.Class<?> r2, java.lang.String... r3) {
            r1 = this;
            com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter r0 = new com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter
            r0.<init>(r1, r2, r3)
            java.util.List<com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter> r2 = r1.filters
            r2.add(r0)
            return r0
    }

    public com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter addFilter(java.lang.String... r2) {
            r1 = this;
            com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter r0 = new com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter
            r0.<init>(r1, r2)
            java.util.List<com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter> r2 = r1.filters
            r2.add(r0)
            return r0
    }

    public java.util.List<com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter> getFilters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter> r0 = r1.filters
            return r0
    }

    public void setFilters(java.util.List<com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter> r1) {
            r0 = this;
            r0.filters = r1
            return
    }

    public com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter[] toFilters() {
            r2 = this;
            java.util.List<com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter> r0 = r2.filters
            r1 = 0
            com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter[] r1 = new com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.alibaba.fastjson.support.spring.PropertyPreFilters$MySimplePropertyPreFilter[] r0 = (com.alibaba.fastjson.support.spring.PropertyPreFilters.MySimplePropertyPreFilter[]) r0
            return r0
    }
}
