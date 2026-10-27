package com.baidu.idl.main.facesdk.statistic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DeviceInfoUtil {
    private static final java.io.FileFilter CPU_FILTER = null;
    private static final java.lang.String CurPath = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";


    static {
            com.baidu.idl.main.facesdk.statistic.DeviceInfoUtil$1 r0 = new com.baidu.idl.main.facesdk.statistic.DeviceInfoUtil$1
            r0.<init>()
            com.baidu.idl.main.facesdk.statistic.DeviceInfoUtil.CPU_FILTER = r0
            return
    }

    public DeviceInfoUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Integer getCPUBit() {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "Processor"
            java.lang.String r1 = getFieldFromCpuinfo(r1)     // Catch: java.io.IOException -> Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L24
            java.lang.String r0 = "aarch64"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L1e
            r0 = 64
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L24
        L1e:
            r0 = 32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L24:
            return r0
    }

    public static int getDeviceBasicFrequency() {
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L39 java.io.FileNotFoundException -> L3c
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L39 java.io.FileNotFoundException -> L3c
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e java.io.FileNotFoundException -> L31
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e java.io.FileNotFoundException -> L31
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23 java.io.FileNotFoundException -> L26
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23 java.io.FileNotFoundException -> L26
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23 java.io.FileNotFoundException -> L26
            r1.close()     // Catch: java.io.IOException -> L1c
        L1c:
            r2.close()     // Catch: java.io.IOException -> L64
            goto L64
        L21:
            r0 = move-exception
            goto L3f
        L23:
        L24:
            r0 = r1
            goto L4c
        L26:
        L27:
            r0 = r1
            goto L59
        L29:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
            goto L3f
        L2e:
            r2 = r0
            goto L24
        L31:
            r2 = r0
            goto L27
        L34:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L3f
        L39:
            r2 = r0
            goto L4c
        L3c:
            r2 = r0
            goto L59
        L3f:
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.io.IOException -> L45
            goto L46
        L45:
        L46:
            if (r2 == 0) goto L4b
            r2.close()     // Catch: java.io.IOException -> L4b
        L4b:
            throw r0
        L4c:
            if (r0 == 0) goto L53
            r0.close()     // Catch: java.io.IOException -> L52
            goto L53
        L52:
        L53:
            if (r2 == 0) goto L63
        L55:
            r2.close()     // Catch: java.io.IOException -> L63
            goto L63
        L59:
            if (r0 == 0) goto L60
            r0.close()     // Catch: java.io.IOException -> L5f
            goto L60
        L5f:
        L60:
            if (r2 == 0) goto L63
            goto L55
        L63:
            r0 = 0
        L64:
            return r0
    }

    public static java.lang.String getDeviceBoard() {
            java.lang.String r0 = android.os.Build.BOARD
            return r0
    }

    public static java.lang.String getDeviceBrand() {
            java.lang.String r0 = android.os.Build.BRAND
            return r0
    }

    public static java.lang.String getDeviceDevice() {
            java.lang.String r0 = android.os.Build.DEVICE
            return r0
    }

    public static java.lang.String getDeviceManufacturer() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            return r0
    }

    public static java.lang.String getDeviceModel() {
            java.lang.String r0 = android.os.Build.MODEL
            return r0
    }

    public static java.lang.String getDeviceProcessor() {
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "/proc/cpuinfo"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L22
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = ":\\s+"
            r2 = 2
            java.lang.String[] r0 = r0.split(r1, r2)     // Catch: java.lang.Throwable -> L22
            r1 = 0
        L18:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L22
            if (r1 >= r2) goto L1e
            int r1 = r1 + 1
            goto L18
        L1e:
            r1 = 1
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L22
            return r0
        L22:
            r0 = 0
            return r0
    }

    public static java.lang.String getDeviceProduct() {
            java.lang.String r0 = android.os.Build.PRODUCT
            return r0
    }

    public static int getDeviceSDK() {
            int r0 = android.os.Build.VERSION.SDK_INT
            return r0
    }

    public static java.lang.String getDeviceSerial() {
            java.lang.String r0 = android.os.Build.SERIAL
            return r0
    }

    public static java.lang.String getFieldFromCpuinfo(java.lang.String r3) throws java.io.IOException {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.FileReader r1 = new java.io.FileReader
            java.lang.String r2 = "/proc/cpuinfo"
            r1.<init>(r2)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "\\s*:\\s*(.*)"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
        L21:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L3c
            java.util.regex.Matcher r1 = r3.matcher(r1)     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r1.matches()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L21
            r3 = 1
            java.lang.String r3 = r1.group(r3)     // Catch: java.lang.Throwable -> L3a
            r0.close()
            return r3
        L3a:
            r3 = move-exception
            goto L41
        L3c:
            r0.close()
            r3 = 0
            return r3
        L41:
            r0.close()
            throw r3
    }

    public static int getNumberOfCPUCores() {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "/sys/devices/system/cpu/"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            java.io.FileFilter r1 = com.baidu.idl.main.facesdk.statistic.DeviceInfoUtil.CPU_FILTER     // Catch: java.lang.Throwable -> Lf
            java.io.File[] r0 = r0.listFiles(r1)     // Catch: java.lang.Throwable -> Lf
            int r0 = r0.length     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static long getRamInfo(android.content.Context r2) {
            java.lang.String r0 = "activity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            r2.getMemoryInfo(r0)
            long r0 = r0.totalMem
            return r0
    }

    public static java.lang.String getStorageInfo(android.content.Context r4, int r5) {
            java.lang.String r4 = getStoragePath(r4, r5)
            boolean r5 = isSDCardMount()
            if (r5 == 0) goto L59
            if (r4 == 0) goto L59
            java.lang.String r5 = r4.toString()
            java.lang.String r0 = ""
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L19
            goto L59
        L19:
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            android.os.StatFs r4 = new android.os.StatFs
            java.lang.String r5 = r5.getPath()
            r4.<init>(r5)
            long r0 = r4.getBlockCountLong()
            long r2 = r4.getBlockSizeLong()
            long r0 = r0 * r2
            long r4 = r4.getAvailableBlocksLong()
            long r4 = r4 * r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "可用/总共："
            r2.append(r3)
            java.lang.String r4 = java.lang.Long.toString(r4)
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            java.lang.String r4 = java.lang.Long.toString(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
        L59:
            java.lang.String r4 = "无外置SD卡"
            return r4
    }

    public static java.lang.String getStoragePath(android.content.Context r3, int r4) {
            java.lang.String r0 = "storage"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.os.storage.StorageManager r3 = (android.os.storage.StorageManager) r3
            r0 = 0
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "getVolumePaths"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L29
            java.lang.Object r3 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L29
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch: java.lang.Exception -> L29
            if (r4 == 0) goto L26
            r1 = 1
            if (r4 == r1) goto L1f
            goto L29
        L1f:
            int r2 = r3.length     // Catch: java.lang.Exception -> L29
            if (r2 <= r1) goto L25
            r3 = r3[r4]     // Catch: java.lang.Exception -> L29
            return r3
        L25:
            return r0
        L26:
            r3 = r3[r4]     // Catch: java.lang.Exception -> L29
            return r3
        L29:
            return r0
    }

    public static java.lang.String getSystemVersion() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            return r0
    }

    public static boolean isSDCardMount() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            return r0
    }
}
