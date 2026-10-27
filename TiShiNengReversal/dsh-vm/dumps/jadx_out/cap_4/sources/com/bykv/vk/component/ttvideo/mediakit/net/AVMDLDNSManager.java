package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLDNSManager {
    public static java.util.Map<java.lang.Integer, com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor> dnsMap;
    private static com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager mInstance;

    static {
            return
    }

    private AVMDLDNSManager() throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.dnsMap = r0
            r1.initDnsMap()
            return
    }

    public static com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager getInstance() {
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.mInstance
            if (r0 != 0) goto L20
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1c
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager r1 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.mInstance = r1     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            goto L1c
        L13:
            r1 = move-exception
            goto L1e
        L15:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L13
            r1 = 0
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.mInstance = r1     // Catch: java.lang.Throwable -> L13
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L20:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.mInstance
            return r0
    }

    private void initDnsMap() throws java.lang.Exception {
            r3 = this;
            com.bykv.vk.component.ttvideo.mediakit.net.DefaultConstructor r0 = new com.bykv.vk.component.ttvideo.mediakit.net.DefaultConstructor
            r0.<init>()
            java.util.Map<java.lang.Integer, com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor> r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.dnsMap
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r0)
            java.util.Map<java.lang.Integer, com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor> r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.dnsMap
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r0)
            java.util.Map<java.lang.Integer, com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor> r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.dnsMap
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r0)
            return
    }

    public synchronized com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor getCreateConstructor(int r3) throws java.lang.Exception {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Integer, com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.dnsMap     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            java.util.Map<java.lang.Integer, com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.dnsMap     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L1b
            com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor r3 = (com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor) r3     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            return r3
        L1b:
            r3 = move-exception
            goto L20
        L1d:
            monitor-exit(r2)
            r3 = 0
            return r3
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public synchronized void registerDnsConstructor(int r2, com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.dnsMap     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            goto L14
        Le:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}
