package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONLibDataFormatSerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public JSONLibDataFormatSerializer() {
            r0 = this;
            r0.<init>()
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
            com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject
            r3.<init>()
            int r4 = r2.getDate()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "date"
            r3.put2(r5, r4)
            int r4 = r2.getDay()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "day"
            r3.put2(r5, r4)
            int r4 = r2.getHours()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "hours"
            r3.put2(r5, r4)
            int r4 = r2.getMinutes()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "minutes"
            r3.put2(r5, r4)
            int r4 = r2.getMonth()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "month"
            r3.put2(r5, r4)
            int r4 = r2.getSeconds()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "seconds"
            r3.put2(r5, r4)
            long r4 = r2.getTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "time"
            r3.put2(r5, r4)
            int r4 = r2.getTimezoneOffset()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "timezoneOffset"
            r3.put2(r5, r4)
            int r2 = r2.getYear()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "year"
            r3.put2(r4, r2)
            r1.write(r3)
            return
    }
}
