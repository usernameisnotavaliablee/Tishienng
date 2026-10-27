package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3) {
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            if (r3 == 0) goto L16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
        L16:
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            int r3 = r3.nextInt()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            byte[] r3 = r3.getBytes()
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)
            return r3
    }

    public static java.lang.String b(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r2 = "T"
            if (r1 != 0) goto L13
            r0.append(r5)
            r0.append(r2)
        L13:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.Long.toString(r3)
            r0.append(r5)
            r0.append(r2)
            double r1 = java.lang.Math.random()
            r3 = 4679239875398991872(0x40efffe000000000, double:65535.0)
            double r1 = r1 * r3
            int r5 = (int) r1
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
