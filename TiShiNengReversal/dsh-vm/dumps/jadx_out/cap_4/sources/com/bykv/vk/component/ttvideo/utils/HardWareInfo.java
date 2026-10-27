package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class HardWareInfo {
    private static final int ATOM = 1;
    public static final int CPU_FAMILY_ARM = 1;
    public static final int CPU_FAMILY_MIPS = 3;
    public static final int CPU_FAMILY_UNKNOWN = 0;
    public static final int CPU_FAMILY_X86 = 2;
    private static final int NEON = 0;
    private static int[] mArmArchitecture;
    private static int mCpuType;

    static {
            r0 = 3
            int[] r0 = new int[r0]
            com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture = r0
            return
    }

    public HardWareInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    private static long getAvailableStorageSize(android.content.Context r3) {
            r0 = -1
            if (r3 != 0) goto L5
            return r0
        L5:
            java.io.File r2 = android.os.Environment.getDataDirectory()
            if (r2 == 0) goto L17
            java.io.File r3 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r3)
            java.lang.String r3 = r3.getParent()
            long r0 = getDirectoryAvailableSize(r3)
        L17:
            return r0
    }

    public static int[] getCpuArchitecture() {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> Ld5
            java.lang.String r1 = "/proc/cpuinfo"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Ld5
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> Ld5
            r1.<init>(r0)     // Catch: java.lang.Exception -> Ld5
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> Ld5
            r2.<init>(r1)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r3 = "Processor"
            java.lang.String r4 = "Features"
            java.lang.String r5 = "model name"
            java.lang.String r6 = "cpu family"
        L19:
            java.lang.String r7 = r2.readLine()     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto Lc1
            java.lang.String r8 = "\t"
            java.lang.String r9 = ""
            java.lang.String r7 = r7.replace(r8, r9)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = ":"
            java.lang.String[] r7 = r7.split(r8)     // Catch: java.lang.Throwable -> L76
            int r8 = r7.length     // Catch: java.lang.Throwable -> L76
            r9 = 2
            if (r8 != r9) goto L19
            r8 = 0
            r10 = r7[r8]     // Catch: java.lang.Throwable -> L76
            java.lang.String r10 = r10.trim()     // Catch: java.lang.Throwable -> L76
            r11 = 1
            r7 = r7[r11]     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L76
            int r12 = r10.compareTo(r3)     // Catch: java.lang.Throwable -> L76
            if (r12 != 0) goto L87
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r9.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r10 = "ARMv"
            int r10 = r7.indexOf(r10)     // Catch: java.lang.Throwable -> L76
            int r10 = r10 + 4
        L52:
            int r12 = r7.length()     // Catch: java.lang.Throwable -> L76
            if (r10 >= r12) goto L78
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r12.<init>()     // Catch: java.lang.Throwable -> L76
            char r13 = r7.charAt(r10)     // Catch: java.lang.Throwable -> L76
            r12.append(r13)     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L76
            java.lang.String r13 = "\\d"
            boolean r13 = r12.matches(r13)     // Catch: java.lang.Throwable -> L76
            if (r13 == 0) goto L78
            r9.append(r12)     // Catch: java.lang.Throwable -> L76
            int r10 = r10 + 1
            goto L52
        L76:
            r3 = move-exception
            goto Lcb
        L78:
            int[] r7 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture     // Catch: java.lang.Throwable -> L76
            r7[r8] = r11     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L76
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Throwable -> L76
            r7[r11] = r8     // Catch: java.lang.Throwable -> L76
            goto L19
        L87:
            int r12 = r10.compareToIgnoreCase(r4)     // Catch: java.lang.Throwable -> L76
            if (r12 != 0) goto L9b
            java.lang.String r10 = "neon"
            boolean r7 = r7.contains(r10)     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L19
            int[] r7 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture     // Catch: java.lang.Throwable -> L76
            r7[r9] = r8     // Catch: java.lang.Throwable -> L76
            goto L19
        L9b:
            int r12 = r10.compareToIgnoreCase(r5)     // Catch: java.lang.Throwable -> L76
            if (r12 != 0) goto Lb1
            java.lang.String r10 = "Intel"
            boolean r7 = r7.contains(r10)     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L19
            int[] r7 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture     // Catch: java.lang.Throwable -> L76
            r7[r8] = r9     // Catch: java.lang.Throwable -> L76
            r7[r9] = r11     // Catch: java.lang.Throwable -> L76
            goto L19
        Lb1:
            int r8 = r10.compareToIgnoreCase(r6)     // Catch: java.lang.Throwable -> L76
            if (r8 != 0) goto L19
            int[] r8 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture     // Catch: java.lang.Throwable -> L76
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Throwable -> L76
            r8[r11] = r7     // Catch: java.lang.Throwable -> L76
            goto L19
        Lc1:
            r2.close()     // Catch: java.lang.Exception -> Ld5
            r1.close()     // Catch: java.lang.Exception -> Ld5
            r0.close()     // Catch: java.lang.Exception -> Ld5
            goto Ld9
        Lcb:
            r2.close()     // Catch: java.lang.Exception -> Ld5
            r1.close()     // Catch: java.lang.Exception -> Ld5
            r0.close()     // Catch: java.lang.Exception -> Ld5
            throw r3     // Catch: java.lang.Exception -> Ld5
        Ld5:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Ld9:
            int[] r0 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture
            return r0
    }

    public static int getCpuFamily() {
            int r0 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mCpuType
            if (r0 != 0) goto Le
            getCpuInfo()
            int[] r0 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture
            r1 = 0
            r0 = r0[r1]
            com.bykv.vk.component.ttvideo.utils.HardWareInfo.mCpuType = r0
        Le:
            int r0 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mCpuType
            return r0
    }

    public static int[] getCpuInfo() {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> Ld7
            java.lang.String r1 = "/proc/cpuinfo"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Ld7
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> Ld7
            r1.<init>(r0)     // Catch: java.lang.Exception -> Ld7
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> Ld7
            r2.<init>(r1)     // Catch: java.lang.Exception -> Ld7
            java.lang.String r3 = "processor"
            java.lang.String r4 = "features"
            java.lang.String r5 = "model name"
        L17:
            java.lang.String r6 = r2.readLine()     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto Lc3
            java.lang.String r7 = "\t"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.replaceAll(r7, r8)     // Catch: java.lang.Throwable -> L6b
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = r6.toLowerCase(r7)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = ":"
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Throwable -> L6b
            int r7 = r6.length     // Catch: java.lang.Throwable -> L6b
            r8 = 2
            if (r7 != r8) goto L17
            r7 = 0
            r9 = r6[r7]     // Catch: java.lang.Throwable -> L6b
            java.lang.String r9 = r9.trim()     // Catch: java.lang.Throwable -> L6b
            r10 = 1
            r6 = r6[r10]     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L17
            if (r9 == 0) goto L17
            int r11 = r9.compareTo(r3)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r12 = "intel"
            if (r11 != 0) goto L72
            java.lang.String r9 = "armv"
            boolean r9 = r6.contains(r9)     // Catch: java.lang.Throwable -> L6b
            if (r9 != 0) goto L6d
            java.lang.String r9 = "aarch64"
            boolean r9 = r6.contains(r9)     // Catch: java.lang.Throwable -> L6b
            if (r9 == 0) goto L60
            goto L6d
        L60:
            boolean r6 = r6.contains(r12)     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L17
            int[] r3 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture     // Catch: java.lang.Throwable -> L6b
            r3[r7] = r8     // Catch: java.lang.Throwable -> L6b
            goto Lc3
        L6b:
            r3 = move-exception
            goto Lcd
        L6d:
            int[] r3 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture     // Catch: java.lang.Throwable -> L6b
            r3[r7] = r10     // Catch: java.lang.Throwable -> L6b
            goto Lc3
        L72:
            int r11 = r9.compareToIgnoreCase(r4)     // Catch: java.lang.Throwable -> L6b
            if (r11 != 0) goto La6
            java.lang.String r8 = "neon"
            boolean r8 = r6.contains(r8)     // Catch: java.lang.Throwable -> L6b
            if (r8 != 0) goto La0
            java.lang.String r8 = "thumb"
            boolean r8 = r6.contains(r8)     // Catch: java.lang.Throwable -> L6b
            if (r8 != 0) goto La0
            java.lang.String r8 = "vfpv"
            boolean r8 = r6.contains(r8)     // Catch: java.lang.Throwable -> L6b
            if (r8 != 0) goto La0
            java.lang.String r8 = "asimd"
            boolean r8 = r6.contains(r8)     // Catch: java.lang.Throwable -> L6b
            if (r8 != 0) goto La0
            java.lang.String r8 = "simd"
            boolean r6 = r6.contains(r8)     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L17
        La0:
            int[] r6 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture     // Catch: java.lang.Throwable -> L6b
            r6[r7] = r10     // Catch: java.lang.Throwable -> L6b
            goto L17
        La6:
            int r9 = r9.compareToIgnoreCase(r5)     // Catch: java.lang.Throwable -> L6b
            if (r9 != 0) goto L17
            boolean r9 = r6.contains(r12)     // Catch: java.lang.Throwable -> L6b
            if (r9 == 0) goto Lb7
            int[] r3 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture     // Catch: java.lang.Throwable -> L6b
            r3[r7] = r8     // Catch: java.lang.Throwable -> L6b
            goto Lc3
        Lb7:
            java.lang.String r8 = "arm"
            boolean r6 = r6.contains(r8)     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L17
            int[] r3 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture     // Catch: java.lang.Throwable -> L6b
            r3[r7] = r10     // Catch: java.lang.Throwable -> L6b
        Lc3:
            r2.close()     // Catch: java.lang.Exception -> Ld7
            r1.close()     // Catch: java.lang.Exception -> Ld7
            r0.close()     // Catch: java.lang.Exception -> Ld7
            goto Ldb
        Lcd:
            r2.close()     // Catch: java.lang.Exception -> Ld7
            r1.close()     // Catch: java.lang.Exception -> Ld7
            r0.close()     // Catch: java.lang.Exception -> Ld7
            throw r3     // Catch: java.lang.Exception -> Ld7
        Ld7:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Ldb:
            int[] r0 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.mArmArchitecture
            return r0
    }

    private static long getDirectoryAvailableSize(java.lang.String r5) {
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.IllegalArgumentException -> L21
            r0.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L21
            boolean r5 = isAndroidJB2()     // Catch: java.lang.IllegalArgumentException -> L21
            if (r5 == 0) goto L14
            long r1 = r0.getBlockSizeLong()     // Catch: java.lang.IllegalArgumentException -> L21
            long r3 = r0.getAvailableBlocksLong()     // Catch: java.lang.IllegalArgumentException -> L21
            goto L1e
        L14:
            int r5 = r0.getBlockSize()     // Catch: java.lang.IllegalArgumentException -> L21
            long r1 = (long) r5     // Catch: java.lang.IllegalArgumentException -> L21
            int r5 = r0.getAvailableBlocks()     // Catch: java.lang.IllegalArgumentException -> L21
            long r3 = (long) r5
        L1e:
            long r1 = r1 * r3
            return r1
        L21:
            r0 = -1
            return r0
    }

    private static long getDirectoryTotalSize(java.lang.String r5) {
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.IllegalArgumentException -> L21
            r0.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L21
            boolean r5 = isAndroidJB2()     // Catch: java.lang.IllegalArgumentException -> L21
            if (r5 == 0) goto L14
            long r1 = r0.getBlockSizeLong()     // Catch: java.lang.IllegalArgumentException -> L21
            long r3 = r0.getBlockCountLong()     // Catch: java.lang.IllegalArgumentException -> L21
            goto L1e
        L14:
            int r5 = r0.getBlockSize()     // Catch: java.lang.IllegalArgumentException -> L21
            long r1 = (long) r5     // Catch: java.lang.IllegalArgumentException -> L21
            int r5 = r0.getBlockCount()     // Catch: java.lang.IllegalArgumentException -> L21
            long r3 = (long) r5
        L1e:
            long r1 = r1 * r3
            return r1
        L21:
            r0 = -1
            return r0
    }

    public static long getProcessCpuInfo() {
            r0 = 0
            r2 = 0
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r8 = "/proc/"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r7.append(r3)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r3 = "/stat"
            r7.append(r3)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r3 = 1000(0x3e8, float:1.401E-42)
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            r4.close()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            java.lang.String r3 = " "
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            r4.close()     // Catch: java.lang.Exception -> L3c
            goto L40
        L3c:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L40:
            r3 = 13
            r3 = r2[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L64
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L64
            r5 = 14
            r5 = r2[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L64
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L64
            long r3 = r3 + r5
            r5 = 15
            r5 = r2[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L64
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L64
            long r3 = r3 + r5
            r5 = 16
            r2 = r2[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L64
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L64
            long r3 = r3 + r0
            return r3
        L64:
            return r0
        L65:
            r0 = move-exception
            r2 = r4
            goto L6f
        L68:
            r2 = r4
            goto L7a
        L6b:
            r0 = move-exception
            goto L6f
        L6d:
            goto L7a
        L6f:
            if (r2 == 0) goto L79
            r2.close()     // Catch: java.lang.Exception -> L75
            goto L79
        L75:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L79:
            throw r0
        L7a:
            if (r2 == 0) goto L84
            r2.close()     // Catch: java.lang.Exception -> L80
            goto L84
        L80:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L84:
            return r0
    }

    public static long[] getSDCardSize(android.content.Context r5) {
            r0 = 2
            long[] r0 = new long[r0]
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r2 = "mounted"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1d
            long r1 = getAvailableStorageSize(r5)
            long r3 = getTotalStorageSize(r5)
            r5 = 0
            r0[r5] = r3
            r5 = 1
            r0[r5] = r1
        L1d:
            return r0
    }

    private static long getTotalStorageSize(android.content.Context r3) {
            r0 = -1
            if (r3 != 0) goto L5
            return r0
        L5:
            java.io.File r2 = android.os.Environment.getDataDirectory()
            if (r2 == 0) goto L17
            java.io.File r3 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r3)
            java.lang.String r3 = r3.getParent()
            long r0 = getDirectoryTotalSize(r3)
        L17:
            return r0
    }

    private static boolean isAndroidJB2() {
            r0 = 1
            return r0
    }
}
