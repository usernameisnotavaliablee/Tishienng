package com.bytedance.msdk.core.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up {
    private final int[] cw;
    private final java.lang.String j;
    private final float[] xt;

    public up(java.lang.String r5, org.json.JSONArray r6, org.json.JSONArray r7) {
            r4 = this;
            r4.<init>()
            r4.j = r5
            int r5 = r6.length()
            float[] r5 = new float[r5]
            r4.xt = r5
            int r5 = r7.length()
            int[] r5 = new int[r5]
            r4.cw = r5
            r5 = 0
            r0 = 0
        L17:
            int r1 = r6.length()
            if (r0 >= r1) goto L29
            float[] r1 = r4.xt
            double r2 = r6.optDouble(r0)
            float r2 = (float) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L17
        L29:
            int r6 = r7.length()
            if (r5 >= r6) goto L3a
            int[] r6 = r4.cw
            int r0 = r7.optInt(r5)
            r6[r5] = r0
            int r5 = r5 + 1
            goto L29
        L3a:
            return
    }

    public int j(float r7) {
            r6 = this;
            float[] r0 = r6.xt
            r1 = -1
            if (r0 == 0) goto L3d
            int r2 = r0.length
            if (r2 == 0) goto L3d
            int[] r2 = r6.cw
            if (r2 == 0) goto L3d
            int r2 = r2.length
            if (r2 != 0) goto L10
            goto L3d
        L10:
            int r0 = r0.length
            r2 = 0
        L12:
            if (r2 >= r0) goto L3d
            float[] r3 = r6.xt
            r4 = r3[r2]
            int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r5 <= 0) goto L2e
            int r5 = r2 + 1
            if (r5 >= r0) goto L2e
            r3 = r3[r5]
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 > 0) goto L2e
            int[] r7 = r6.cw
            int r0 = r7.length
            if (r2 >= r0) goto L3d
            r7 = r7[r2]
            return r7
        L2e:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3a
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 <= 0) goto L3a
            int[] r1 = r6.cw
            r1 = r1[r2]
        L3a:
            int r2 = r2 + 1
            goto L12
        L3d:
            return r1
    }
}
