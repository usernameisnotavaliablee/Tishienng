package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class SerializeFilterable {
    protected java.util.List<com.alibaba.fastjson.serializer.AfterFilter> afterFilters;
    protected java.util.List<com.alibaba.fastjson.serializer.BeforeFilter> beforeFilters;
    protected java.util.List<com.alibaba.fastjson.serializer.ContextValueFilter> contextValueFilters;
    protected java.util.List<com.alibaba.fastjson.serializer.LabelFilter> labelFilters;
    protected java.util.List<com.alibaba.fastjson.serializer.NameFilter> nameFilters;
    protected java.util.List<com.alibaba.fastjson.serializer.PropertyFilter> propertyFilters;
    protected java.util.List<com.alibaba.fastjson.serializer.PropertyPreFilter> propertyPreFilters;
    protected java.util.List<com.alibaba.fastjson.serializer.ValueFilter> valueFilters;
    protected boolean writeDirect;

    public SerializeFilterable() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.beforeFilters = r0
            r1.afterFilters = r0
            r1.propertyFilters = r0
            r1.valueFilters = r0
            r1.nameFilters = r0
            r1.propertyPreFilters = r0
            r1.labelFilters = r0
            r1.contextValueFilters = r0
            r0 = 1
            r1.writeDirect = r0
            return
    }

    public void addFilter(com.alibaba.fastjson.serializer.SerializeFilter r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L72
        L3:
            boolean r0 = r3 instanceof com.alibaba.fastjson.serializer.PropertyPreFilter
            if (r0 == 0) goto L11
            java.util.List r0 = r2.getPropertyPreFilters()
            r1 = r3
            com.alibaba.fastjson.serializer.PropertyPreFilter r1 = (com.alibaba.fastjson.serializer.PropertyPreFilter) r1
            r0.add(r1)
        L11:
            boolean r0 = r3 instanceof com.alibaba.fastjson.serializer.NameFilter
            if (r0 == 0) goto L1f
            java.util.List r0 = r2.getNameFilters()
            r1 = r3
            com.alibaba.fastjson.serializer.NameFilter r1 = (com.alibaba.fastjson.serializer.NameFilter) r1
            r0.add(r1)
        L1f:
            boolean r0 = r3 instanceof com.alibaba.fastjson.serializer.ValueFilter
            if (r0 == 0) goto L2d
            java.util.List r0 = r2.getValueFilters()
            r1 = r3
            com.alibaba.fastjson.serializer.ValueFilter r1 = (com.alibaba.fastjson.serializer.ValueFilter) r1
            r0.add(r1)
        L2d:
            boolean r0 = r3 instanceof com.alibaba.fastjson.serializer.ContextValueFilter
            if (r0 == 0) goto L3b
            java.util.List r0 = r2.getContextValueFilters()
            r1 = r3
            com.alibaba.fastjson.serializer.ContextValueFilter r1 = (com.alibaba.fastjson.serializer.ContextValueFilter) r1
            r0.add(r1)
        L3b:
            boolean r0 = r3 instanceof com.alibaba.fastjson.serializer.PropertyFilter
            if (r0 == 0) goto L49
            java.util.List r0 = r2.getPropertyFilters()
            r1 = r3
            com.alibaba.fastjson.serializer.PropertyFilter r1 = (com.alibaba.fastjson.serializer.PropertyFilter) r1
            r0.add(r1)
        L49:
            boolean r0 = r3 instanceof com.alibaba.fastjson.serializer.BeforeFilter
            if (r0 == 0) goto L57
            java.util.List r0 = r2.getBeforeFilters()
            r1 = r3
            com.alibaba.fastjson.serializer.BeforeFilter r1 = (com.alibaba.fastjson.serializer.BeforeFilter) r1
            r0.add(r1)
        L57:
            boolean r0 = r3 instanceof com.alibaba.fastjson.serializer.AfterFilter
            if (r0 == 0) goto L65
            java.util.List r0 = r2.getAfterFilters()
            r1 = r3
            com.alibaba.fastjson.serializer.AfterFilter r1 = (com.alibaba.fastjson.serializer.AfterFilter) r1
            r0.add(r1)
        L65:
            boolean r0 = r3 instanceof com.alibaba.fastjson.serializer.LabelFilter
            if (r0 == 0) goto L72
            java.util.List r0 = r2.getLabelFilters()
            com.alibaba.fastjson.serializer.LabelFilter r3 = (com.alibaba.fastjson.serializer.LabelFilter) r3
            r0.add(r3)
        L72:
            return
    }

    public boolean apply(com.alibaba.fastjson.serializer.JSONSerializer r3, java.lang.Object r4, java.lang.String r5, java.lang.Object r6) {
            r2 = this;
            java.util.List<com.alibaba.fastjson.serializer.PropertyFilter> r3 = r3.propertyFilters
            r0 = 0
            if (r3 == 0) goto L1c
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            com.alibaba.fastjson.serializer.PropertyFilter r1 = (com.alibaba.fastjson.serializer.PropertyFilter) r1
            boolean r1 = r1.apply(r4, r5, r6)
            if (r1 != 0) goto L9
            return r0
        L1c:
            java.util.List<com.alibaba.fastjson.serializer.PropertyFilter> r3 = r2.propertyFilters
            if (r3 == 0) goto L37
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r3.next()
            com.alibaba.fastjson.serializer.PropertyFilter r1 = (com.alibaba.fastjson.serializer.PropertyFilter) r1
            boolean r1 = r1.apply(r4, r5, r6)
            if (r1 != 0) goto L24
            return r0
        L37:
            r3 = 1
            return r3
    }

    public boolean applyName(com.alibaba.fastjson.serializer.JSONSerializer r4, java.lang.Object r5, java.lang.String r6) {
            r3 = this;
            java.util.List<com.alibaba.fastjson.serializer.PropertyPreFilter> r0 = r4.propertyPreFilters
            r1 = 0
            if (r0 == 0) goto L1c
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            com.alibaba.fastjson.serializer.PropertyPreFilter r2 = (com.alibaba.fastjson.serializer.PropertyPreFilter) r2
            boolean r2 = r2.apply(r4, r5, r6)
            if (r2 != 0) goto L9
            return r1
        L1c:
            java.util.List<com.alibaba.fastjson.serializer.PropertyPreFilter> r0 = r3.propertyPreFilters
            if (r0 == 0) goto L37
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            com.alibaba.fastjson.serializer.PropertyPreFilter r2 = (com.alibaba.fastjson.serializer.PropertyPreFilter) r2
            boolean r2 = r2.apply(r4, r5, r6)
            if (r2 != 0) goto L24
            return r1
        L37:
            r4 = 1
            return r4
    }

    public java.util.List<com.alibaba.fastjson.serializer.AfterFilter> getAfterFilters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.AfterFilter> r0 = r1.afterFilters
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.afterFilters = r0
            r0 = 0
            r1.writeDirect = r0
        Le:
            java.util.List<com.alibaba.fastjson.serializer.AfterFilter> r0 = r1.afterFilters
            return r0
    }

    public java.util.List<com.alibaba.fastjson.serializer.BeforeFilter> getBeforeFilters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.BeforeFilter> r0 = r1.beforeFilters
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.beforeFilters = r0
            r0 = 0
            r1.writeDirect = r0
        Le:
            java.util.List<com.alibaba.fastjson.serializer.BeforeFilter> r0 = r1.beforeFilters
            return r0
    }

    public java.util.List<com.alibaba.fastjson.serializer.ContextValueFilter> getContextValueFilters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.ContextValueFilter> r0 = r1.contextValueFilters
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.contextValueFilters = r0
            r0 = 0
            r1.writeDirect = r0
        Le:
            java.util.List<com.alibaba.fastjson.serializer.ContextValueFilter> r0 = r1.contextValueFilters
            return r0
    }

    public java.util.List<com.alibaba.fastjson.serializer.LabelFilter> getLabelFilters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.LabelFilter> r0 = r1.labelFilters
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.labelFilters = r0
            r0 = 0
            r1.writeDirect = r0
        Le:
            java.util.List<com.alibaba.fastjson.serializer.LabelFilter> r0 = r1.labelFilters
            return r0
    }

    public java.util.List<com.alibaba.fastjson.serializer.NameFilter> getNameFilters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.NameFilter> r0 = r1.nameFilters
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.nameFilters = r0
            r0 = 0
            r1.writeDirect = r0
        Le:
            java.util.List<com.alibaba.fastjson.serializer.NameFilter> r0 = r1.nameFilters
            return r0
    }

    public java.util.List<com.alibaba.fastjson.serializer.PropertyFilter> getPropertyFilters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.PropertyFilter> r0 = r1.propertyFilters
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.propertyFilters = r0
            r0 = 0
            r1.writeDirect = r0
        Le:
            java.util.List<com.alibaba.fastjson.serializer.PropertyFilter> r0 = r1.propertyFilters
            return r0
    }

    public java.util.List<com.alibaba.fastjson.serializer.PropertyPreFilter> getPropertyPreFilters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.PropertyPreFilter> r0 = r1.propertyPreFilters
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.propertyPreFilters = r0
            r0 = 0
            r1.writeDirect = r0
        Le:
            java.util.List<com.alibaba.fastjson.serializer.PropertyPreFilter> r0 = r1.propertyPreFilters
            return r0
    }

    public java.util.List<com.alibaba.fastjson.serializer.ValueFilter> getValueFilters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.ValueFilter> r0 = r1.valueFilters
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.valueFilters = r0
            r0 = 0
            r1.writeDirect = r0
        Le:
            java.util.List<com.alibaba.fastjson.serializer.ValueFilter> r0 = r1.valueFilters
            return r0
    }

    protected java.lang.String processKey(com.alibaba.fastjson.serializer.JSONSerializer r2, java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.NameFilter> r2 = r2.nameFilters
            if (r2 == 0) goto L19
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.next()
            com.alibaba.fastjson.serializer.NameFilter r0 = (com.alibaba.fastjson.serializer.NameFilter) r0
            java.lang.String r4 = r0.process(r3, r4, r5)
            goto L8
        L19:
            java.util.List<com.alibaba.fastjson.serializer.NameFilter> r2 = r1.nameFilters
            if (r2 == 0) goto L32
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.next()
            com.alibaba.fastjson.serializer.NameFilter r0 = (com.alibaba.fastjson.serializer.NameFilter) r0
            java.lang.String r4 = r0.process(r3, r4, r5)
            goto L21
        L32:
            return r4
    }

    protected java.lang.Object processValue(com.alibaba.fastjson.serializer.JSONSerializer r3, com.alibaba.fastjson.serializer.BeanContext r4, java.lang.Object r5, java.lang.String r6, java.lang.Object r7) {
            r2 = this;
            if (r7 == 0) goto L47
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r3.out
            boolean r0 = r0.writeNonStringValueAsString
            if (r0 != 0) goto L15
            if (r4 == 0) goto L1e
            int r0 = r4.getFeatures()
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringValueAsString
            int r1 = r1.mask
            r0 = r0 & r1
            if (r0 == 0) goto L1e
        L15:
            boolean r0 = r7 instanceof java.lang.Number
            if (r0 != 0) goto L2d
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L1e
            goto L2d
        L1e:
            if (r4 == 0) goto L47
            boolean r0 = r4.isJsonDirect()
            if (r0 == 0) goto L47
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = com.alibaba.fastjson.JSON.parse(r7)
            goto L47
        L2d:
            if (r0 == 0) goto L36
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.getFormat()
            goto L37
        L36:
            r0 = 0
        L37:
            if (r0 == 0) goto L43
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            r1.<init>(r0)
            java.lang.String r7 = r1.format(r7)
            goto L47
        L43:
            java.lang.String r7 = r7.toString()
        L47:
            java.util.List<com.alibaba.fastjson.serializer.ValueFilter> r0 = r3.valueFilters
            if (r0 == 0) goto L60
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            com.alibaba.fastjson.serializer.ValueFilter r1 = (com.alibaba.fastjson.serializer.ValueFilter) r1
            java.lang.Object r7 = r1.process(r5, r6, r7)
            goto L4f
        L60:
            java.util.List<com.alibaba.fastjson.serializer.ValueFilter> r0 = r2.valueFilters
            if (r0 == 0) goto L79
            java.util.Iterator r0 = r0.iterator()
        L68:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            com.alibaba.fastjson.serializer.ValueFilter r1 = (com.alibaba.fastjson.serializer.ValueFilter) r1
            java.lang.Object r7 = r1.process(r5, r6, r7)
            goto L68
        L79:
            java.util.List<com.alibaba.fastjson.serializer.ContextValueFilter> r3 = r3.contextValueFilters
            if (r3 == 0) goto L92
            java.util.Iterator r3 = r3.iterator()
        L81:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r3.next()
            com.alibaba.fastjson.serializer.ContextValueFilter r0 = (com.alibaba.fastjson.serializer.ContextValueFilter) r0
            java.lang.Object r7 = r0.process(r4, r5, r6, r7)
            goto L81
        L92:
            java.util.List<com.alibaba.fastjson.serializer.ContextValueFilter> r3 = r2.contextValueFilters
            if (r3 == 0) goto Lab
            java.util.Iterator r3 = r3.iterator()
        L9a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r3.next()
            com.alibaba.fastjson.serializer.ContextValueFilter r0 = (com.alibaba.fastjson.serializer.ContextValueFilter) r0
            java.lang.Object r7 = r0.process(r4, r5, r6, r7)
            goto L9a
        Lab:
            return r7
    }

    protected boolean writeDirect(com.alibaba.fastjson.serializer.JSONSerializer r2) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r2.out
            boolean r0 = r0.writeDirect
            if (r0 == 0) goto L10
            boolean r0 = r1.writeDirect
            if (r0 == 0) goto L10
            boolean r2 = r2.writeDirect
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
