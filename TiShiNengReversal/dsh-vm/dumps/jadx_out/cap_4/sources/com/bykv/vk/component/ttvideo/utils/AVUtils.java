package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVUtils {

    public static class ScaleInfo {
        public int h;

        /* renamed from: w, reason: collision with root package name */
        public int f1669w;

        /* renamed from: x, reason: collision with root package name */
        public int f1670x;

        /* renamed from: y, reason: collision with root package name */
        public int f1671y;

        public ScaleInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public AVUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.bykv.vk.component.ttvideo.utils.AVUtils.ScaleInfo getScaleInfoFromSize(float r3, float r4, float r5, float r6) {
            com.bykv.vk.component.ttvideo.utils.AVUtils$ScaleInfo r0 = new com.bykv.vk.component.ttvideo.utils.AVUtils$ScaleInfo
            r0.<init>()
            float r3 = r3 / r4
            int r4 = (int) r5
            r0.f1669w = r4
            float r4 = r5 / r3
            int r4 = (int) r4
            r0.h = r4
            float r4 = (float) r4
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L1b
            int r4 = (int) r6
            r0.h = r4
            float r3 = r3 * r6
            int r3 = (int) r3
            r0.f1669w = r3
        L1b:
            int r3 = r0.h
            float r4 = (float) r3
            float r4 = r4 - r6
            int r4 = (int) r4
            int r4 = r4 >> 1
            r0.f1671y = r4
            int r1 = r0.f1669w
            float r2 = (float) r1
            float r2 = r2 - r5
            int r2 = (int) r2
            int r2 = r2 >> 1
            r0.f1670x = r2
            float r3 = (float) r3
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L36
            int r3 = 0 - r4
            r0.f1671y = r3
        L36:
            float r3 = (float) r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L3f
            int r3 = 0 - r2
            r0.f1670x = r3
        L3f:
            return r0
    }
}
