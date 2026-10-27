package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f1<T> implements retrofit2.g<okhttp3.ResponseBody, T> {
    public final java.lang.reflect.Type a;

    public f1(java.lang.reflect.Type r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.lang.String a(java.lang.String r4) {
            java.lang.String r0 = "u"
            boolean r1 = r4.contains(r0)
            if (r1 != 0) goto L9
            return r4
        L9:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String[] r4 = r4.split(r0)
            r0 = 1
        L13:
            int r2 = r4.length
            if (r0 >= r2) goto L25
            r2 = r4[r0]
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r2, r3)
            char r2 = (char) r2
            r1.append(r2)
            int r0 = r0 + 1
            goto L13
        L25:
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static java.lang.String b(java.lang.String r5) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length()
            if (r1 >= r2) goto L3f
            char r2 = r5.charAt(r1)
            java.lang.String r3 = java.lang.Integer.toHexString(r2)
            int r3 = r3.length()
            r4 = 1
            if (r3 != r4) goto L34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "u0"
        L22:
            r3.append(r4)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            goto L3c
        L34:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "u"
            goto L22
        L3c:
            int r1 = r1 + 1
            goto L6
        L3f:
            java.lang.String r5 = "u02"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Matcher r5 = r5.matcher(r0)
            java.lang.String r0 = ""
            java.lang.String r5 = r5.replaceAll(r0)
            return r5
    }

    public T a(okhttp3.ResponseBody r3) throws java.io.IOException {
            r2 = this;
            okio.BufferedSource r3 = r3.source()
            okio.BufferedSource r3 = okio.Okio.buffer(r3)
            java.lang.String r0 = r3.readUtf8()
            r3.close()
            com.acse.ottn.f r3 = com.acse.ottn.f.b()
            java.lang.String r1 = "VbZFjAoPF6LCCQm6RgDs1g13mnJ8nAAA"
            java.lang.String r3 = r3.a(r0, r1)
            java.lang.reflect.Type r0 = r2.a
            r1 = 0
            com.alibaba.fastjson.parser.Feature[] r1 = new com.alibaba.fastjson.parser.Feature[r1]
            java.lang.Object r3 = com.alibaba.fastjson.JSON.parseObject(r3, r0, r1)
            return r3
    }

    public /* bridge */ /* synthetic */ java.lang.Object convert(java.lang.Object r1) throws java.io.IOException {
            r0 = this;
            okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
            java.lang.Object r1 = r0.a(r1)
            return r1
    }
}
