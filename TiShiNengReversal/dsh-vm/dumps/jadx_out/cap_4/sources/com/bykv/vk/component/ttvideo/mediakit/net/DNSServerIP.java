package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class DNSServerIP {
    private static final java.lang.String TAG = "DNSServerIP";
    private static final int UPDATE_PEROID = 300000;
    private static volatile java.lang.String mServerIP;
    private static volatile long mServerIPTime;


    public DNSServerIP() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.String access$002(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.mediakit.net.DNSServerIP.mServerIP = r0
            return r0
    }

    static /* synthetic */ long access$102(long r0) {
            com.bykv.vk.component.ttvideo.mediakit.net.DNSServerIP.mServerIPTime = r0
            return r0
    }

    public static java.lang.String getDNSServerIP() {
            updateDNSServerIP()
            java.lang.String r0 = com.bykv.vk.component.ttvideo.mediakit.net.DNSServerIP.mServerIP
            return r0
    }

    public static void updateDNSServerIP() {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = com.bykv.vk.component.ttvideo.mediakit.net.DNSServerIP.mServerIPTime
            long r0 = r0 - r2
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            return
        Lf:
            com.bykv.vk.component.ttvideo.mediakit.net.DNSServerIP$1 r0 = new com.bykv.vk.component.ttvideo.mediakit.net.DNSServerIP$1
            r0.<init>()
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLThreadPool.addExecuteTask(r0)
            return
    }
}
