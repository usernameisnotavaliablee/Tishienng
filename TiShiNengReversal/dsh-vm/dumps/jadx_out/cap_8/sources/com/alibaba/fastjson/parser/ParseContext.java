package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ParseContext {
    public final java.lang.Object fieldName;
    public java.lang.Object object;
    public final com.alibaba.fastjson.parser.ParseContext parent;
    private transient java.lang.String path;
    public java.lang.reflect.Type type;

    public ParseContext(com.alibaba.fastjson.parser.ParseContext r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.parent = r1
            r0.object = r2
            r0.fieldName = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.path
            if (r0 != 0) goto L55
            com.alibaba.fastjson.parser.ParseContext r0 = r2.parent
            if (r0 != 0) goto Ld
            java.lang.String r0 = "$"
            r2.path = r0
            goto L55
        Ld:
            java.lang.Object r0 = r2.fieldName
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.alibaba.fastjson.parser.ParseContext r1 = r2.parent
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.Object r1 = r2.fieldName
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.path = r0
            goto L55
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.alibaba.fastjson.parser.ParseContext r1 = r2.parent
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.Object r1 = r2.fieldName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.path = r0
        L55:
            java.lang.String r0 = r2.path
            return r0
    }
}
