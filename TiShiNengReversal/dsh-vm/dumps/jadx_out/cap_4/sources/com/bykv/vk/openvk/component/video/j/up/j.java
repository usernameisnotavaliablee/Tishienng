package com.bykv.vk.openvk.component.video.j.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static final int j = 0;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            com.bykv.vk.openvk.component.video.j.up.j.j = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int j(long r4, long r6) {
            r0 = 0
            r2 = 0
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 <= 0) goto L14
            double r4 = (double) r4
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r0
            double r6 = (double) r6
            double r4 = r4 / r6
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            int r4 = (int) r4
            goto L15
        L14:
            r4 = 0
        L15:
            int r4 = java.lang.Math.max(r2, r4)
            r5 = 100
            int r4 = java.lang.Math.min(r4, r5)
            return r4
    }

    public static java.lang.String j(long r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 60000(0xea60, double:2.9644E-319)
            long r3 = r9 / r1
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r9 = r9 % r5
            long r9 = r9 % r1
            r1 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r1
            r1 = 0
            r5 = 0
            r6 = 10
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L1f
            r0.append(r3)
            goto L30
        L1f:
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 <= 0) goto L2a
            r0.append(r5)
            r0.append(r3)
            goto L30
        L2a:
            r0.append(r5)
            r0.append(r5)
        L30:
            java.lang.String r3 = ":"
            r0.append(r3)
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 < 0) goto L3d
            r0.append(r9)
            goto L4e
        L3d:
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 <= 0) goto L48
            r0.append(r5)
            r0.append(r9)
            goto L4e
        L48:
            r0.append(r5)
            r0.append(r5)
        L4e:
            java.lang.String r9 = r0.toString()
            return r9
    }

    public static void j(android.view.View r1, boolean r2) {
            if (r1 != 0) goto L3
            return
        L3:
            if (r2 == 0) goto La
            r2 = 0
            r1.setSystemUiVisibility(r2)
            return
        La:
            int r2 = com.bykv.vk.openvk.component.video.j.up.j.j
            r0 = 19
            if (r2 < r0) goto L16
            r2 = 3846(0xf06, float:5.39E-42)
            r1.setSystemUiVisibility(r2)
            return
        L16:
            r0 = 16
            if (r2 < r0) goto L1f
            r2 = 5
            r1.setSystemUiVisibility(r2)
            return
        L1f:
            r2 = 1
            r1.setSystemUiVisibility(r2)
            return
    }
}
