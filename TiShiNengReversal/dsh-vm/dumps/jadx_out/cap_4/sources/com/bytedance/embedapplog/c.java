package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class c extends com.bytedance.embedapplog.l {
    private final android.content.Context up;

    c(android.content.Context r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r0)
            r1.up = r2
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r6) {
            r5 = this;
            android.content.Context r0 = r5.up
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "language"
            com.bytedance.embedapplog.wq.j(r6, r1, r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            int r0 = r0.getRawOffset()
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            int r0 = r0 / r1
            r1 = -12
            if (r0 >= r1) goto L27
            r0 = -12
        L27:
            r1 = 12
            if (r0 <= r1) goto L2d
            r0 = 12
        L2d:
            java.lang.String r1 = "timezone"
            r6.put(r1, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r1 = "region"
            com.bytedance.embedapplog.wq.j(r6, r1, r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = r0.getTimeZone()
            java.lang.String r1 = "tz_name"
            java.lang.String r2 = r0.getID()
            com.bytedance.embedapplog.wq.j(r6, r1, r2)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            int r0 = r0.getOffset(r1)
            java.lang.String r1 = "tz_offset"
            r6.put(r1, r0)
            r6 = 1
            return r6
    }
}
