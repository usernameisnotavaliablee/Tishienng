package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class IPCache {
    private static final java.lang.String TAG = "AVMDLIPCache";
    private static com.bykv.vk.component.ttvideo.mediakit.net.IPCache mInstance = null;
    private static java.lang.String mNetExtraInfo = null;
    private static int mNetType = -1;
    private java.util.concurrent.locks.Lock backUplock;
    private java.util.concurrent.locks.Lock lock;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo> mBackUps;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo> mDNSRecord;

    static {
            return
    }

    private IPCache() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.mDNSRecord = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.mBackUps = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.lock = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.backUplock = r0
            return
    }

    public static com.bykv.vk.component.ttvideo.mediakit.net.IPCache getInstance() {
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r0 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.mInstance
            if (r0 != 0) goto L19
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.IPCache> r0 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r1 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r1 = new com.bykv.vk.component.ttvideo.mediakit.net.IPCache     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache.mInstance = r1     // Catch: java.lang.Throwable -> L13
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
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r0 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.mInstance
            return r0
    }

    public static void setCurNetExtraInfo(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache.mNetExtraInfo = r0
            return
    }

    public void clear() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.lock
            r0.lock()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo> r0 = r2.mDNSRecord     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            r0.clear()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L15
        Lf:
            java.util.concurrent.locks.Lock r0 = r2.lock
            r0.unlock()
            return
        L15:
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            throw r0
    }

    public com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo get(java.lang.String r6) {
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.concurrent.locks.Lock r0 = r5.lock
            r0.lock()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo> r0 = r5.mDNSRecord     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L19
            r1 = r0
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r1 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo) r1     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r6 = move-exception
            goto L6d
        L1b:
            if (r1 == 0) goto L67
            java.lang.String r0 = r1.mIpList     // Catch: java.lang.Throwable -> L19
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L67
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableBackUpIp     // Catch: java.lang.Throwable -> L19
            if (r0 <= 0) goto L67
            java.lang.String r0 = "enable backup try get backup ip for:%s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L19
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.Throwable -> L19
            java.lang.String.format(r0, r3)     // Catch: java.lang.Throwable -> L19
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r6 = r5.getBackUpIp(r6)     // Catch: java.lang.Throwable -> L19
            if (r6 == 0) goto L67
            java.lang.String r0 = r6.mIpList     // Catch: java.lang.Throwable -> L19
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L67
            java.lang.String r0 = "succ get backup ip:%s"
            java.lang.String r3 = r6.mIpList     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L19
            r2[r4] = r3     // Catch: java.lang.Throwable -> L19
            java.lang.String.format(r0, r2)     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r1.mIpList     // Catch: java.lang.Throwable -> L19
            r0.append(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = ","
            r0.append(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = r6.mIpList     // Catch: java.lang.Throwable -> L19
            r0.append(r6)     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L19
            r1.mIpList = r6     // Catch: java.lang.Throwable -> L19
        L67:
            java.util.concurrent.locks.Lock r6 = r5.lock
            r6.unlock()
            return r1
        L6d:
            java.util.concurrent.locks.Lock r0 = r5.lock
            r0.unlock()
            throw r6
    }

    public com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo getBackUpIp(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.concurrent.locks.Lock r0 = r1.backUplock
            r0.lock()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo> r0 = r1.mBackUps     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1b
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r2 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo) r2     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.locks.Lock r0 = r1.backUplock
            r0.unlock()
            return r2
        L1b:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.backUplock
            r0.unlock()
            throw r2
    }

    public java.lang.String getCurNetExtraInfo() {
            r1 = this;
            java.lang.String r0 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.mNetExtraInfo
            return r0
    }

    public int getCurNetType() {
            r1 = this;
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.mNetType
            return r0
    }

    public int getRecordSize() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.lock
            r0.lock()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo> r0 = r2.mDNSRecord     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r0 = move-exception
            goto L17
        L10:
            r0 = -1
        L11:
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            return r0
        L17:
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            throw r0
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    public void put(java.lang.String r11, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r12) {
            r10 = this;
            if (r12 == 0) goto Lab
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto La
            goto Lab
        La:
            java.util.concurrent.locks.Lock r0 = r10.lock
            r0.lock()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo> r0 = r10.mDNSRecord     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L90
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L71
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r0 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo) r0     // Catch: java.lang.Throwable -> L71
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableParallel     // Catch: java.lang.Throwable -> L71
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 <= 0) goto L74
            if (r0 == 0) goto L74
            int r1 = r12.mType     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L74
            int r6 = r0.mType     // Catch: java.lang.Throwable -> L71
            if (r6 <= r1) goto L74
            long r6 = r0.mExpiredTime     // Catch: java.lang.Throwable -> L71
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L71
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L74
            java.lang.String r1 = "put for host:%s enable parallel info.type:%d info.expiredT:%d cache.type:%d cache.expiredT:%d curT:%d info can not replace cache"
            int r6 = r12.mType     // Catch: java.lang.Throwable -> L71
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L71
            long r7 = r12.mExpiredTime     // Catch: java.lang.Throwable -> L71
            java.lang.Long r12 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L71
            int r7 = r0.mType     // Catch: java.lang.Throwable -> L71
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L71
            long r8 = r0.mExpiredTime     // Catch: java.lang.Throwable -> L71
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L71
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L71
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L71
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L71
            r9[r5] = r11     // Catch: java.lang.Throwable -> L71
            r9[r4] = r6     // Catch: java.lang.Throwable -> L71
            r9[r3] = r12     // Catch: java.lang.Throwable -> L71
            r9[r2] = r7     // Catch: java.lang.Throwable -> L71
            r11 = 4
            r9[r11] = r0     // Catch: java.lang.Throwable -> L71
            r11 = 5
            r9[r11] = r8     // Catch: java.lang.Throwable -> L71
            java.lang.String.format(r1, r9)     // Catch: java.lang.Throwable -> L71
            java.util.concurrent.locks.Lock r11 = r10.lock
            r11.unlock()
            return
        L71:
            r0 = move-exception
            r11 = r0
            goto La5
        L74:
            java.lang.String r0 = "put for host:%s type:%d ip:%s"
            java.lang.String r1 = r12.mHost     // Catch: java.lang.Throwable -> L71
            int r6 = r12.mType     // Catch: java.lang.Throwable -> L71
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = r12.mIpList     // Catch: java.lang.Throwable -> L71
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L71
            r2[r5] = r1     // Catch: java.lang.Throwable -> L71
            r2[r4] = r6     // Catch: java.lang.Throwable -> L71
            r2[r3] = r7     // Catch: java.lang.Throwable -> L71
            java.lang.String.format(r0, r2)     // Catch: java.lang.Throwable -> L71
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo> r0 = r10.mDNSRecord     // Catch: java.lang.Throwable -> L71
            r0.put(r11, r12)     // Catch: java.lang.Throwable -> L71
        L90:
            java.util.concurrent.locks.Lock r0 = r10.lock
            r0.unlock()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r1 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            java.lang.String r3 = r12.mIpList
            long r4 = r12.mExpiredTime
            r6 = 0
            int r7 = r12.mType
            r2 = r11
            r1.updateDNSInfo(r2, r3, r4, r6, r7)
            return
        La5:
            java.util.concurrent.locks.Lock r12 = r10.lock
            r12.unlock()
            throw r11
        Lab:
            return
    }

    public void putBackUpIp(java.lang.String r7, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r8) {
            r6 = this;
            if (r8 == 0) goto L3b
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L9
            goto L3b
        L9:
            java.util.concurrent.locks.Lock r0 = r6.backUplock
            r0.lock()
            java.lang.String r0 = "put backupip for host:%s type:%d ip:%s"
            java.lang.String r1 = r8.mHost     // Catch: java.lang.Throwable -> L34
            int r2 = r8.mType     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r8.mIpList     // Catch: java.lang.Throwable -> L34
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L34
            r5 = 0
            r4[r5] = r1     // Catch: java.lang.Throwable -> L34
            r1 = 1
            r4[r1] = r2     // Catch: java.lang.Throwable -> L34
            r1 = 2
            r4[r1] = r3     // Catch: java.lang.Throwable -> L34
            java.lang.String.format(r0, r4)     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo> r0 = r6.mBackUps     // Catch: java.lang.Throwable -> L34
            r0.put(r7, r8)     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.locks.Lock r7 = r6.backUplock
            r7.unlock()
            return
        L34:
            r7 = move-exception
            java.util.concurrent.locks.Lock r8 = r6.backUplock
            r8.unlock()
            throw r7
        L3b:
            return
    }

    public void setCurNetType(int r1) {
            r0 = this;
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache.mNetType = r1
            return
    }
}
