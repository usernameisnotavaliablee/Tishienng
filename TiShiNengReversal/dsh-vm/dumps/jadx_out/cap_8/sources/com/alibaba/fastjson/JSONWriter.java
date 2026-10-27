package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONWriter implements java.io.Closeable, java.io.Flushable {
    private com.alibaba.fastjson.JSONStreamContext context;
    private com.alibaba.fastjson.serializer.JSONSerializer serializer;
    private com.alibaba.fastjson.serializer.SerializeWriter writer;

    public JSONWriter(java.io.Writer r2) {
            r1 = this;
            r1.<init>()
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r0.<init>(r2)
            r1.writer = r0
            com.alibaba.fastjson.serializer.JSONSerializer r2 = new com.alibaba.fastjson.serializer.JSONSerializer
            r2.<init>(r0)
            r1.serializer = r2
            return
    }

    private void afterWriter() {
            r3 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r3.context
            if (r0 != 0) goto L5
            goto L19
        L5:
            int r1 = r0.state
            r2 = -1
            switch(r1) {
                case 1001: goto L13;
                case 1002: goto L10;
                case 1003: goto L13;
                case 1004: goto Ld;
                default: goto Lb;
            }
        Lb:
            r1 = -1
            goto L15
        Ld:
            r1 = 1005(0x3ed, float:1.408E-42)
            goto L15
        L10:
            r1 = 1003(0x3eb, float:1.406E-42)
            goto L15
        L13:
            r1 = 1002(0x3ea, float:1.404E-42)
        L15:
            if (r1 == r2) goto L19
            r0.state = r1
        L19:
            return
    }

    private void beforeWrite() {
            r3 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r3.context
            if (r0 != 0) goto L5
            goto L15
        L5:
            int r0 = r0.state
            r1 = 1002(0x3ea, float:1.404E-42)
            if (r0 == r1) goto L22
            r1 = 1003(0x3eb, float:1.406E-42)
            r2 = 44
            if (r0 == r1) goto L1c
            r1 = 1005(0x3ed, float:1.408E-42)
            if (r0 == r1) goto L16
        L15:
            return
        L16:
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r3.writer
            r0.write(r2)
            return
        L1c:
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r3.writer
            r0.write(r2)
            return
        L22:
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r3.writer
            r1 = 58
            r0.write(r1)
            return
    }

    private void beginStructure() {
            r4 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r4.context
            int r0 = r0.state
            switch(r0) {
                case 1001: goto L2d;
                case 1002: goto L26;
                case 1003: goto L7;
                case 1004: goto L2d;
                case 1005: goto L1e;
                default: goto L7;
            }
        L7:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "illegal state : "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L1e:
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r4.writer
            r1 = 44
            r0.write(r1)
            return
        L26:
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r4.writer
            r1 = 58
            r0.write(r1)
        L2d:
            return
    }

    private void endStructure() {
            r5 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r5.context
            com.alibaba.fastjson.JSONStreamContext r0 = r0.parent
            r5.context = r0
            if (r0 != 0) goto L9
            goto L23
        L9:
            int r1 = r0.state
            r2 = 1001(0x3e9, float:1.403E-42)
            r3 = 1002(0x3ea, float:1.404E-42)
            r4 = -1
            if (r1 == r2) goto L1f
            if (r1 == r3) goto L1d
            r2 = 1004(0x3ec, float:1.407E-42)
            if (r1 == r2) goto L1a
            r3 = -1
            goto L1f
        L1a:
            r3 = 1005(0x3ed, float:1.408E-42)
            goto L1f
        L1d:
            r3 = 1003(0x3eb, float:1.406E-42)
        L1f:
            if (r3 == r4) goto L23
            r0.state = r3
        L23:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.writer
            r0.close()
            return
    }

    public void config(com.alibaba.fastjson.serializer.SerializerFeature r2, boolean r3) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.writer
            r0.config(r2, r3)
            return
    }

    public void endArray() {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r2.writer
            r1 = 93
            r0.write(r1)
            r2.endStructure()
            return
    }

    public void endObject() {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r2.writer
            r1 = 125(0x7d, float:1.75E-43)
            r0.write(r1)
            r2.endStructure()
            return
    }

    @Override // java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.writer
            r0.flush()
            return
    }

    public void startArray() {
            r3 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r3.context
            if (r0 == 0) goto L7
            r3.beginStructure()
        L7:
            com.alibaba.fastjson.JSONStreamContext r0 = new com.alibaba.fastjson.JSONStreamContext
            com.alibaba.fastjson.JSONStreamContext r1 = r3.context
            r2 = 1004(0x3ec, float:1.407E-42)
            r0.<init>(r1, r2)
            r3.context = r0
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r3.writer
            r1 = 91
            r0.write(r1)
            return
    }

    public void startObject() {
            r3 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r3.context
            if (r0 == 0) goto L7
            r3.beginStructure()
        L7:
            com.alibaba.fastjson.JSONStreamContext r0 = new com.alibaba.fastjson.JSONStreamContext
            com.alibaba.fastjson.JSONStreamContext r1 = r3.context
            r2 = 1001(0x3e9, float:1.403E-42)
            r0.<init>(r1, r2)
            r3.context = r0
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r3.writer
            r1 = 123(0x7b, float:1.72E-43)
            r0.write(r1)
            return
    }

    @java.lang.Deprecated
    public void writeEndArray() {
            r0 = this;
            r0.endArray()
            return
    }

    @java.lang.Deprecated
    public void writeEndObject() {
            r0 = this;
            r0.endObject()
            return
    }

    public void writeKey(java.lang.String r1) {
            r0 = this;
            r0.writeObject(r1)
            return
    }

    public void writeObject(java.lang.Object r2) {
            r1 = this;
            r1.beforeWrite()
            com.alibaba.fastjson.serializer.JSONSerializer r0 = r1.serializer
            r0.write(r2)
            r1.afterWriter()
            return
    }

    public void writeObject(java.lang.String r2) {
            r1 = this;
            r1.beforeWrite()
            com.alibaba.fastjson.serializer.JSONSerializer r0 = r1.serializer
            r0.write(r2)
            r1.afterWriter()
            return
    }

    @java.lang.Deprecated
    public void writeStartArray() {
            r0 = this;
            r0.startArray()
            return
    }

    @java.lang.Deprecated
    public void writeStartObject() {
            r0 = this;
            r0.startObject()
            return
    }

    public void writeValue(java.lang.Object r1) {
            r0 = this;
            r0.writeObject(r1)
            return
    }
}
