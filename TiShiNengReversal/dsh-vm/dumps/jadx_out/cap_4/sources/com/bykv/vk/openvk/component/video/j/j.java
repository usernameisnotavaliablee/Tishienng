package com.bykv.vk.openvk.component.video.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    public static int cw = 10;
    public static int j = 10;

    /* renamed from: r, reason: collision with root package name */
    public static int f1687r = 10;
    private static com.bykv.vk.openvk.component.video.api.j.xt up = null;
    public static int xt = 10;

    static {
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int cw() {
            int r0 = com.bykv.vk.openvk.component.video.j.j.xt
            return r0
    }

    public static void j() {
            com.bykv.vk.openvk.component.video.api.j.xt r0 = com.bykv.vk.openvk.component.video.j.j.up
            if (r0 == 0) goto L7
            r0.up()
        L7:
            return
    }

    public static void j(android.content.Context r1) {
            com.bykv.vk.openvk.component.video.api.m.j.j(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto Lc
            com.bykv.vk.openvk.component.video.j.xt.m.j.j()
        Lc:
            return
    }

    public static void j(com.bykv.vk.openvk.component.video.api.j.xt r0) {
            com.bykv.vk.openvk.component.video.j.j.up = r0
            return
    }

    public static void j(org.json.JSONObject r7) {
            java.lang.String r0 = "MediaConfig"
            if (r7 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "splash"
            r2 = 10
            int r1 = r7.optInt(r1, r2)     // Catch: java.lang.Throwable -> L2e
            com.bykv.vk.openvk.component.video.j.j.j = r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "reward"
            int r1 = r7.optInt(r1, r2)     // Catch: java.lang.Throwable -> L2e
            com.bykv.vk.openvk.component.video.j.j.xt = r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "brand"
            int r1 = r7.optInt(r1, r2)     // Catch: java.lang.Throwable -> L2e
            com.bykv.vk.openvk.component.video.j.j.cw = r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "other"
            int r7 = r7.optInt(r1, r2)     // Catch: java.lang.Throwable -> L2e
            com.bykv.vk.openvk.component.video.j.j.f1687r = r7     // Catch: java.lang.Throwable -> L2e
            int r1 = com.bykv.vk.openvk.component.video.j.j.j     // Catch: java.lang.Throwable -> L2e
            if (r1 >= 0) goto L30
            com.bykv.vk.openvk.component.video.j.j.j = r2     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r7 = move-exception
            goto L80
        L30:
            int r1 = com.bykv.vk.openvk.component.video.j.j.xt     // Catch: java.lang.Throwable -> L2e
            if (r1 >= 0) goto L36
            com.bykv.vk.openvk.component.video.j.j.xt = r2     // Catch: java.lang.Throwable -> L2e
        L36:
            int r1 = com.bykv.vk.openvk.component.video.j.j.cw     // Catch: java.lang.Throwable -> L2e
            if (r1 >= 0) goto L3c
            com.bykv.vk.openvk.component.video.j.j.cw = r2     // Catch: java.lang.Throwable -> L2e
        L3c:
            if (r7 >= 0) goto L40
            com.bykv.vk.openvk.component.video.j.j.f1687r = r2     // Catch: java.lang.Throwable -> L2e
        L40:
            int r7 = com.bykv.vk.openvk.component.video.j.j.j     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2e
            int r1 = com.bykv.vk.openvk.component.video.j.j.xt     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            int r2 = com.bykv.vk.openvk.component.video.j.j.cw     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            int r3 = com.bykv.vk.openvk.component.video.j.j.f1687r     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2e
            r4 = 8
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = "splash="
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L2e
            r5 = 1
            r4[r5] = r7     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = ",reward="
            r5 = 2
            r4[r5] = r7     // Catch: java.lang.Throwable -> L2e
            r7 = 3
            r4[r7] = r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = ",brand="
            r1 = 4
            r4[r1] = r7     // Catch: java.lang.Throwable -> L2e
            r7 = 5
            r4[r7] = r2     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = ",other="
            r1 = 6
            r4[r1] = r7     // Catch: java.lang.Throwable -> L2e
            r7 = 7
            r4[r7] = r3     // Catch: java.lang.Throwable -> L2e
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r4)     // Catch: java.lang.Throwable -> L2e
            return
        L80:
            java.lang.String r7 = r7.getMessage()
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r7)
            return
    }

    public static int r() {
            int r0 = com.bykv.vk.openvk.component.video.j.j.cw
            return r0
    }

    public static int up() {
            int r0 = com.bykv.vk.openvk.component.video.j.j.f1687r
            return r0
    }

    public static int xt() {
            int r0 = com.bykv.vk.openvk.component.video.j.j.j
            return r0
    }
}
