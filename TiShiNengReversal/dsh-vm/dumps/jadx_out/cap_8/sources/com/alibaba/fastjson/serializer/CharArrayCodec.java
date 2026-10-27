package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CharArrayCodec implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public CharArrayCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r5) {
            com.alibaba.fastjson.parser.JSONLexer r0 = r5.lexer
            int r1 = r0.token()
            r2 = 4
            r3 = 16
            if (r1 != r2) goto L17
            java.lang.String r5 = r0.stringVal()
            r0.nextToken(r3)
            char[] r5 = r5.toCharArray()
            return r5
        L17:
            int r1 = r0.token()
            r2 = 2
            if (r1 != r2) goto L2e
            java.lang.Number r5 = r0.integerValue()
            r0.nextToken(r3)
            java.lang.String r5 = r5.toString()
            char[] r5 = r5.toCharArray()
            return r5
        L2e:
            java.lang.Object r5 = r5.parse()
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L3d
            java.lang.String r5 = (java.lang.String) r5
            char[] r5 = r5.toCharArray()
            return r5
        L3d:
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L8a
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r0 = r5.iterator()
        L47:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L47
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            r2 = 1
            if (r1 != r2) goto L5f
            goto L47
        L5f:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "can not cast to char[]"
            r5.<init>(r0)
            throw r5
        L67:
            int r0 = r5.size()
            char[] r0 = new char[r0]
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
            r2 = 0
        L73:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L89
            java.lang.Object r3 = r5.next()
            int r4 = r2 + 1
            java.lang.String r3 = (java.lang.String) r3
            char r3 = r3.charAt(r1)
            r0[r2] = r3
            r2 = r4
            goto L73
        L89:
            return r0
        L8a:
            if (r5 != 0) goto L8e
            r5 = 0
            return r5
        L8e:
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r5)
            char[] r5 = r5.toCharArray()
            return r5
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r1, java.lang.reflect.Type r2, java.lang.Object r3) {
            r0 = this;
            java.lang.Object r1 = deserialze(r1)
            return r1
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 4
            return r0
    }
}
