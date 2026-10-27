package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONPObject implements com.alibaba.fastjson.serializer.JSONSerializable {
    private static final int BrowserSecureMask = 0;
    public static java.lang.String SECURITY_PREFIX = "/**/";
    private java.lang.String function;
    private final java.util.List<java.lang.Object> parameters;

    static {
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserSecure
            int r0 = r0.mask
            com.alibaba.fastjson.JSONPObject.BrowserSecureMask = r0
            return
    }

    public JSONPObject() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.parameters = r0
            return
    }

    public JSONPObject(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.parameters = r0
            r1.function = r2
            return
    }

    public void addParameter(java.lang.Object r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.parameters
            r0.add(r2)
            return
    }

    public java.lang.String getFunction() {
            r1 = this;
            java.lang.String r0 = r1.function
            return r0
    }

    public java.util.List<java.lang.Object> getParameters() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.parameters
            return r0
    }

    public void setFunction(java.lang.String r1) {
            r0 = this;
            r0.function = r1
            return
    }

    public java.lang.String toJSONString() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r1)
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.JSONSerializable
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.reflect.Type r3, int r4) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r2 = r1.out
            int r3 = com.alibaba.fastjson.JSONPObject.BrowserSecureMask
            r4 = r4 & r3
            if (r4 != 0) goto Ld
            boolean r3 = r2.isEnabled(r3)
            if (r3 == 0) goto L12
        Ld:
            java.lang.String r3 = com.alibaba.fastjson.JSONPObject.SECURITY_PREFIX
            r2.write(r3)
        L12:
            java.lang.String r3 = r0.function
            r2.write(r3)
            r3 = 40
            r2.write(r3)
            r3 = 0
        L1d:
            java.util.List<java.lang.Object> r4 = r0.parameters
            int r4 = r4.size()
            if (r3 >= r4) goto L38
            if (r3 == 0) goto L2c
            r4 = 44
            r2.write(r4)
        L2c:
            java.util.List<java.lang.Object> r4 = r0.parameters
            java.lang.Object r4 = r4.get(r3)
            r1.write(r4)
            int r3 = r3 + 1
            goto L1d
        L38:
            r1 = 41
            r2.write(r1)
            return
    }
}
