package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class JSONStreamContext {
    static final int ArrayValue = 1005;
    static final int PropertyKey = 1002;
    static final int PropertyValue = 1003;
    static final int StartArray = 1004;
    static final int StartObject = 1001;
    protected final com.alibaba.fastjson.JSONStreamContext parent;
    protected int state;

    public JSONStreamContext(com.alibaba.fastjson.JSONStreamContext r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.parent = r1
            r0.state = r2
            return
    }
}
