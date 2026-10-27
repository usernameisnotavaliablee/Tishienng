package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PascalNameFilter implements com.alibaba.fastjson.serializer.NameFilter {
    public PascalNameFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.NameFilter
    public java.lang.String process(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            if (r2 == 0) goto L1b
            int r1 = r2.length()
            if (r1 != 0) goto L9
            goto L1b
        L9:
            char[] r1 = r2.toCharArray()
            r2 = 0
            char r3 = r1[r2]
            char r3 = java.lang.Character.toUpperCase(r3)
            r1[r2] = r3
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
        L1b:
            return r2
    }
}
