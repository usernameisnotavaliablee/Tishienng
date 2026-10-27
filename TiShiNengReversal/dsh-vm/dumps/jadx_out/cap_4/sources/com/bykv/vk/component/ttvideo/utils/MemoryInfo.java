package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MemoryInfo {
    private static long[] mRomMemroy;
    private static long mTotalMemorySize;

    static {
            return
    }

    public MemoryInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long getAvailMemory(android.content.Context r4) {
            java.lang.String r0 = "activity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            r4.getMemoryInfo(r0)
            long r0 = r0.availMem
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r2
            return r0
    }

    public static long[] getRomMemroy() {
            long[] r0 = com.bykv.vk.component.ttvideo.utils.MemoryInfo.mRomMemroy
            if (r0 != 0) goto L2c
            long r0 = getTotalInternalMemorySize()
            java.io.File r2 = android.os.Environment.getDataDirectory()
            android.os.StatFs r3 = new android.os.StatFs
            java.lang.String r2 = r2.getPath()
            r3.<init>(r2)
            int r2 = r3.getBlockSize()
            long r4 = (long) r2
            int r2 = r3.getAvailableBlocks()
            long r2 = (long) r2
            long r4 = r4 * r2
            r2 = 2
            long[] r2 = new long[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r4
            com.bykv.vk.component.ttvideo.utils.MemoryInfo.mRomMemroy = r2
        L2c:
            long[] r0 = com.bykv.vk.component.ttvideo.utils.MemoryInfo.mRomMemroy
            return r0
    }

    public static long getTolalMemory() {
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r0 = 8
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            if (r0 == 0) goto L16
            r1 = r0
        L16:
            r2.close()     // Catch: java.lang.Exception -> L1a
            goto L2e
        L1a:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            goto L2e
        L1f:
            r0 = move-exception
            r1 = r2
            goto L4a
        L22:
            r0 = move-exception
            goto L28
        L24:
            r0 = move-exception
            goto L4a
        L26:
            r0 = move-exception
            r2 = r1
        L28:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L2e
            goto L16
        L2e:
            r0 = 58
            int r0 = r1.indexOf(r0)
            r2 = 107(0x6b, float:1.5E-43)
            int r2 = r1.indexOf(r2)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0, r2)
            java.lang.String r0 = r0.trim()
            int r0 = java.lang.Integer.parseInt(r0)
            long r0 = (long) r0
            return r0
        L4a:
            if (r1 == 0) goto L54
            r1.close()     // Catch: java.lang.Exception -> L50
            goto L54
        L50:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L54:
            throw r0
    }

    public static long getTotalInternalMemorySize() {
            long r0 = com.bykv.vk.component.ttvideo.utils.MemoryInfo.mTotalMemorySize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L23
            java.io.File r0 = android.os.Environment.getDataDirectory()
            android.os.StatFs r1 = new android.os.StatFs
            java.lang.String r0 = r0.getPath()
            r1.<init>(r0)
            int r0 = r1.getBlockSize()
            long r2 = (long) r0
            int r0 = r1.getBlockCount()
            long r0 = (long) r0
            long r0 = r0 * r2
            com.bykv.vk.component.ttvideo.utils.MemoryInfo.mTotalMemorySize = r0
        L23:
            long r0 = com.bykv.vk.component.ttvideo.utils.MemoryInfo.mTotalMemorySize
            return r0
    }
}
