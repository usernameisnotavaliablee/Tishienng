package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class uf extends com.bytedance.embedapplog.l {
    private final android.content.Context up;

    uf(android.content.Context r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            r2.up = r3
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r5) {
            r4 = this;
            android.content.Context r0 = r4.up
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
            switch(r1) {
                case 120: goto L1e;
                case 240: goto L1b;
                case 260: goto L18;
                case 280: goto L18;
                case 300: goto L18;
                case 320: goto L18;
                case 340: goto L15;
                case 360: goto L15;
                case 400: goto L15;
                case 420: goto L15;
                case 440: goto L15;
                case 480: goto L15;
                case 560: goto L12;
                case 640: goto L12;
                default: goto Lf;
            }
        Lf:
            java.lang.String r2 = "mdpi"
            goto L20
        L12:
            java.lang.String r2 = "xxxhdpi"
            goto L20
        L15:
            java.lang.String r2 = "xxhdpi"
            goto L20
        L18:
            java.lang.String r2 = "xhdpi"
            goto L20
        L1b:
            java.lang.String r2 = "hdpi"
            goto L20
        L1e:
            java.lang.String r2 = "ldpi"
        L20:
            java.lang.String r3 = "density_dpi"
            r5.put(r3, r1)
            java.lang.String r1 = "display_density"
            r5.put(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.heightPixels
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r0 = r0.widthPixels
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "resolution"
            r5.put(r1, r0)
            r5 = 1
            return r5
    }
}
