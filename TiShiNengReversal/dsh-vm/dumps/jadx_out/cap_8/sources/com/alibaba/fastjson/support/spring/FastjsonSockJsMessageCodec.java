package com.alibaba.fastjson.support.spring;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FastjsonSockJsMessageCodec extends org.springframework.web.socket.sockjs.frame.AbstractSockJsMessageCodec {
    public FastjsonSockJsMessageCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    protected char[] applyJsonQuoting(java.lang.String r3) {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r0.<init>()
            com.alibaba.fastjson.serializer.JSONSerializer r1 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch: java.lang.Throwable -> L15
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r1.write(r3)     // Catch: java.lang.Throwable -> L15
            char[] r3 = r0.toCharArrayForSpringWebSocket()     // Catch: java.lang.Throwable -> L15
            r0.close()
            return r3
        L15:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public java.lang.String[] decode(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    public java.lang.String[] decodeInputStream(java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            com.alibaba.fastjson.parser.Feature[] r0 = new com.alibaba.fastjson.parser.Feature[r0]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            java.lang.Object r3 = com.alibaba.fastjson.JSON.parseObject(r3, r1, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            return r3
    }
}
