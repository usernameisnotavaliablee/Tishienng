package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SimpleDateFormatSerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    private final java.lang.String pattern;

    public SimpleDateFormatSerializer(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.pattern = r1
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            if (r2 != 0) goto L8
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            r1.writeNull()
            return
        L8:
            java.util.Date r2 = (java.util.Date) r2
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = r0.pattern
            java.util.Locale r5 = r1.locale
            r3.<init>(r4, r5)
            java.util.TimeZone r4 = r1.timeZone
            r3.setTimeZone(r4)
            java.lang.String r2 = r3.format(r2)
            r1.write(r2)
            return
    }
}
