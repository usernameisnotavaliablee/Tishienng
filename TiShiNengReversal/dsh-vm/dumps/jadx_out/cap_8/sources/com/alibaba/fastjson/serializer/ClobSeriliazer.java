package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ClobSeriliazer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static final com.alibaba.fastjson.serializer.ClobSeriliazer instance = null;

    static {
            com.alibaba.fastjson.serializer.ClobSeriliazer r0 = new com.alibaba.fastjson.serializer.ClobSeriliazer
            r0.<init>()
            com.alibaba.fastjson.serializer.ClobSeriliazer.instance = r0
            return
    }

    public ClobSeriliazer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, int r7) throws java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L8
            r3.writeNull()     // Catch: java.sql.SQLException -> L6
            return
        L6:
            r3 = move-exception
            goto L36
        L8:
            java.sql.Clob r4 = (java.sql.Clob) r4     // Catch: java.sql.SQLException -> L6
            java.io.Reader r4 = r4.getCharacterStream()     // Catch: java.sql.SQLException -> L6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.sql.SQLException -> L6
            r5.<init>()     // Catch: java.sql.SQLException -> L6
            r6 = 2048(0x800, float:2.87E-42)
            char[] r7 = new char[r6]     // Catch: java.lang.Exception -> L2d
        L17:
            r0 = 0
            int r1 = r4.read(r7, r0, r6)     // Catch: java.lang.Exception -> L2d
            if (r1 >= 0) goto L29
            java.lang.String r5 = r5.toString()     // Catch: java.sql.SQLException -> L6
            r4.close()     // Catch: java.sql.SQLException -> L6
            r3.write(r5)     // Catch: java.sql.SQLException -> L6
            return
        L29:
            r5.append(r7, r0, r1)     // Catch: java.lang.Exception -> L2d
            goto L17
        L2d:
            r3 = move-exception
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException     // Catch: java.sql.SQLException -> L6
            java.lang.String r5 = "read string from reader error"
            r4.<init>(r5, r3)     // Catch: java.sql.SQLException -> L6
            throw r4     // Catch: java.sql.SQLException -> L6
        L36:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "write clob error"
            r4.<init>(r5, r3)
            throw r4
    }
}
