package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVErrorInfo {
    public static final java.lang.String CRASH = "crash";
    public static final java.lang.String ERROR = "error";
    private static java.lang.StringBuilder PHONE_INFO;

    public AVErrorInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setupErrorInfo(android.content.Context r0, java.lang.StringBuilder r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r4 = com.bykv.vk.component.ttvideo.utils.AVErrorInfo.PHONE_INFO
            if (r4 != 0) goto Le
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.bykv.vk.component.ttvideo.utils.AVErrorInfo.PHONE_INFO = r4
            setupPhoneInfo(r0, r4)
        Le:
            java.lang.StringBuilder r0 = com.bykv.vk.component.ttvideo.utils.AVErrorInfo.PHONE_INFO
            r1.append(r0)
            java.lang.String r0 = "\r\n"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r3)
            return
    }

    public static final void setupPhoneInfo(android.content.Context r9, java.lang.StringBuilder r10) {
            java.lang.String[] r0 = com.bykv.vk.component.ttvideo.utils.VersionInfo.getVersion()
            r1 = 2
            r2 = 1
            r3 = 0
            java.lang.String r4 = "\r\n"
            if (r0 == 0) goto L26
            r5 = r0[r3]
            r6 = r0[r2]
            r0 = r0[r1]
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r5
            r7[r2] = r6
            r7[r1] = r0
            java.lang.String r0 = "version:%s,%s,%s\r\n"
            java.lang.String r0 = java.lang.String.format(r0, r7)
            r10.append(r0)
            r10.append(r4)
        L26:
            long[] r0 = com.bykv.vk.component.ttvideo.utils.MemoryInfo.getRomMemroy()
            if (r0 == 0) goto L4c
            java.util.Locale r5 = java.util.Locale.US
            r6 = r0[r3]
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = r0[r2]
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r3] = r6
            r7[r2] = r0
            java.lang.String r0 = "rom memory totle:%d,availe:%d\r\n"
            java.lang.String r0 = java.lang.String.format(r5, r0, r7)
            r10.append(r0)
            r10.append(r4)
        L4c:
            long r5 = com.bykv.vk.component.ttvideo.utils.MemoryInfo.getAvailMemory(r9)
            long r7 = com.bykv.vk.component.ttvideo.utils.MemoryInfo.getTolalMemory()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r6[r3] = r7
            r6[r2] = r5
            java.lang.String r5 = "ram memory totle:%d,availe:%d\r\n"
            java.lang.String r5 = java.lang.String.format(r0, r5, r6)
            r10.append(r5)
            r10.append(r4)
            long[] r9 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.getSDCardSize(r9)
            if (r9 == 0) goto L94
            r5 = r9[r3]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = r9[r2]
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r9
            java.lang.String r9 = "sdcard totle:%d,availe:%d\r\n"
            java.lang.String r9 = java.lang.String.format(r0, r9, r1)
            r10.append(r9)
            r10.append(r4)
        L94:
            return
    }
}
