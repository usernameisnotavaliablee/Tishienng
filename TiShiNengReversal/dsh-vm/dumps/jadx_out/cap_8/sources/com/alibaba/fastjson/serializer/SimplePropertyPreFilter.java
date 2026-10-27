package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SimplePropertyPreFilter implements com.alibaba.fastjson.serializer.PropertyPreFilter {
    private final java.lang.Class<?> clazz;
    private final java.util.Set<java.lang.String> excludes;
    private final java.util.Set<java.lang.String> includes;
    private int maxLevel;

    public SimplePropertyPreFilter(java.lang.Class<?> r4, java.lang.String... r5) {
            r3 = this;
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.includes = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.excludes = r0
            r0 = 0
            r3.maxLevel = r0
            r3.clazz = r4
            int r4 = r5.length
        L17:
            if (r0 >= r4) goto L25
            r1 = r5[r0]
            if (r1 == 0) goto L22
            java.util.Set<java.lang.String> r2 = r3.includes
            r2.add(r1)
        L22:
            int r0 = r0 + 1
            goto L17
        L25:
            return
    }

    public SimplePropertyPreFilter(java.lang.String... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    @Override // com.alibaba.fastjson.serializer.PropertyPreFilter
    public boolean apply(com.alibaba.fastjson.serializer.JSONSerializer r4, java.lang.Object r5, java.lang.String r6) {
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Class<?> r1 = r3.clazz
            if (r1 == 0) goto Lf
            boolean r5 = r1.isInstance(r5)
            if (r5 != 0) goto Lf
            return r0
        Lf:
            java.util.Set<java.lang.String> r5 = r3.excludes
            boolean r5 = r5.contains(r6)
            r1 = 0
            if (r5 == 0) goto L19
            return r1
        L19:
            int r5 = r3.maxLevel
            if (r5 <= 0) goto L2b
            com.alibaba.fastjson.serializer.SerialContext r4 = r4.context
            r5 = 0
        L20:
            if (r4 == 0) goto L2b
            int r5 = r5 + r0
            int r2 = r3.maxLevel
            if (r5 <= r2) goto L28
            return r1
        L28:
            com.alibaba.fastjson.serializer.SerialContext r4 = r4.parent
            goto L20
        L2b:
            java.util.Set<java.lang.String> r4 = r3.includes
            int r4 = r4.size()
            if (r4 == 0) goto L3d
            java.util.Set<java.lang.String> r4 = r3.includes
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L3c
            goto L3d
        L3c:
            return r1
        L3d:
            return r0
    }

    public java.lang.Class<?> getClazz() {
            r1 = this;
            java.lang.Class<?> r0 = r1.clazz
            return r0
    }

    public java.util.Set<java.lang.String> getExcludes() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.excludes
            return r0
    }

    public java.util.Set<java.lang.String> getIncludes() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.includes
            return r0
    }

    public int getMaxLevel() {
            r1 = this;
            int r0 = r1.maxLevel
            return r0
    }

    public void setMaxLevel(int r1) {
            r0 = this;
            r0.maxLevel = r1
            return
    }
}
