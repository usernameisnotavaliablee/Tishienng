package com.bykv.vk.component.ttvideo.network;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class IPCache {
    private static com.bykv.vk.component.ttvideo.network.IPCache mInstance = null;
    private static java.lang.String mNetExtraInfo = null;
    private static int mNetType = -1;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.network.IPCache.IpInfo> mIpRecord;

    static class IpInfo {
        public int count;
        public java.lang.String ipaddr;
        public long iptime;
        public boolean needUpdate;

        IpInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    private IPCache() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.mIpRecord = r0
            return
    }

    public static com.bykv.vk.component.ttvideo.network.IPCache getInstance() {
            com.bykv.vk.component.ttvideo.network.IPCache r0 = com.bykv.vk.component.ttvideo.network.IPCache.mInstance
            if (r0 != 0) goto L19
            java.lang.Class<com.bykv.vk.component.ttvideo.network.IPCache> r0 = com.bykv.vk.component.ttvideo.network.IPCache.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.network.IPCache r1 = com.bykv.vk.component.ttvideo.network.IPCache.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bykv.vk.component.ttvideo.network.IPCache r1 = new com.bykv.vk.component.ttvideo.network.IPCache     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bykv.vk.component.ttvideo.network.IPCache.mInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bykv.vk.component.ttvideo.network.IPCache r0 = com.bykv.vk.component.ttvideo.network.IPCache.mInstance
            return r0
    }

    public void clear() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.network.IPCache$IpInfo> r0 = r1.mIpRecord
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    public void disableIpAddress(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L14
        L3:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.network.IPCache$IpInfo> r0 = r1.mIpRecord
            if (r0 == 0) goto Le
            java.lang.Object r2 = r0.get(r2)
            com.bykv.vk.component.ttvideo.network.IPCache$IpInfo r2 = (com.bykv.vk.component.ttvideo.network.IPCache.IpInfo) r2
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L14
            r0 = 1
            r2.needUpdate = r0
        L14:
            return
    }

    public com.bykv.vk.component.ttvideo.network.IPCache.IpInfo get(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.network.IPCache$IpInfo> r0 = r1.mIpRecord
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.get(r2)
            com.bykv.vk.component.ttvideo.network.IPCache$IpInfo r2 = (com.bykv.vk.component.ttvideo.network.IPCache.IpInfo) r2
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public java.lang.String getCurNetExtraInfo() {
            r1 = this;
            java.lang.String r0 = com.bykv.vk.component.ttvideo.network.IPCache.mNetExtraInfo
            return r0
    }

    public int getCurNetType() {
            r1 = this;
            int r0 = com.bykv.vk.component.ttvideo.network.IPCache.mNetType
            return r0
    }

    public int getRecordSize() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.network.IPCache$IpInfo> r0 = r1.mIpRecord
            if (r0 == 0) goto L9
            int r0 = r0.size()
            return r0
        L9:
            r0 = -1
            return r0
    }

    public void put(java.lang.String r2, com.bykv.vk.component.ttvideo.network.IPCache.IpInfo r3) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.network.IPCache$IpInfo> r0 = r1.mIpRecord
            if (r0 == 0) goto L7
            r0.put(r2, r3)
        L7:
            return
    }

    public void setCurNetExtraInfo(java.lang.String r1) {
            r0 = this;
            com.bykv.vk.component.ttvideo.network.IPCache.mNetExtraInfo = r1
            return
    }

    public void setCurNetType(int r1) {
            r0 = this;
            com.bykv.vk.component.ttvideo.network.IPCache.mNetType = r1
            return
    }
}
