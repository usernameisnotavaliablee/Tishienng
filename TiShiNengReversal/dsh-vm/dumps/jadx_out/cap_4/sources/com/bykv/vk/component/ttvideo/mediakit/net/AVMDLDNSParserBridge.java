package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLDNSParserBridge implements com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener {
    private static final java.lang.String TAG = "AVMDLDNSParserBridge";
    private static boolean v2Usable = true;
    private long handle;
    public java.lang.String host;
    java.lang.String ipList;
    boolean isFinish;
    private java.util.concurrent.locks.Lock lock;

    static {
            return
    }

    public AVMDLDNSParserBridge() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.ipList = r0
            r0 = 0
            r2.isFinish = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.lock = r0
            r0 = 0
            r2.handle = r0
            return
    }

    private static native void _notifyParserResult(long r0, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6);

    private static native void _notifyParserResultV2(long r0, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6, int r7);

    private int parserResult(long r12, java.lang.String r14, int r15) {
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L8
            r12 = -1
            return r12
        L8:
            java.util.concurrent.locks.Lock r0 = r11.lock
            r0.lock()
            r11.handle = r12
            r12 = 1
            r13 = 0
            r1 = 0
            r11.host = r14     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r0 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r0 = r0.get(r14)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            if (r0 == 0) goto L8c
            java.lang.String r2 = r0.mIpList     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            r11.ipList = r2     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            java.lang.String r4 = "get result from cache expiredT:%d curT:%d "
            long r5 = r0.mExpiredTime     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L88
            r7[r13] = r5     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L88
            r7[r12] = r6     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L88
            java.lang.String.format(r4, r7)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            long r4 = r0.mExpiredTime     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L82
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L54
            java.lang.String r2 = "cache has expired need try call but not need listener"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4f
            java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4f
            r2 = 1
            goto L55
        L4b:
            r0 = move-exception
            r12 = r0
            goto Lc7
        L4f:
            r0 = move-exception
            r15 = r0
            r5 = r14
        L52:
            r2 = 1
            goto L96
        L54:
            r2 = 0
        L55:
            long r3 = r11.handle     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6e
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L7f
            if (r15 != r12) goto L71
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable = r13     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6e
            java.lang.String r6 = r11.ipList     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6e
            long r7 = r0.mExpiredTime     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6e
            r9 = 0
            r5 = r14
            _notifyParserResult(r3, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6b
            goto L80
        L6b:
            r0 = move-exception
        L6c:
            r15 = r0
            goto L96
        L6e:
            r0 = move-exception
            r5 = r14
            goto L6c
        L71:
            r5 = r14
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable = r12     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6b
            java.lang.String r6 = r11.ipList     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6b
            long r7 = r0.mExpiredTime     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6b
            int r10 = r0.mType     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6b
            r9 = 0
            _notifyParserResultV2(r3, r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L6b
            goto L80
        L7f:
            r5 = r14
        L80:
            r14 = 1
            goto L90
        L82:
            r0 = move-exception
            r5 = r14
            r15 = r0
            goto L52
        L86:
            r15 = r14
            goto L52
        L88:
            r0 = move-exception
            r5 = r14
            r14 = r0
            goto L86
        L8c:
            r5 = r14
            r14 = 0
            r1 = r11
            r2 = 1
        L90:
            java.util.concurrent.locks.Lock r15 = r11.lock
            r15.unlock()
            goto Lab
        L96:
            java.lang.String r14 = "AVMDLDNSParserBridge"
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L4b
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r14, r15)     // Catch: java.lang.Throwable -> L4b
            boolean r14 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable     // Catch: java.lang.Throwable -> L4b
            if (r14 == 0) goto La5
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable = r13     // Catch: java.lang.Throwable -> L4b
        La5:
            java.util.concurrent.locks.Lock r14 = r11.lock
            r14.unlock()
            r14 = 0
        Lab:
            if (r2 == 0) goto Lbd
            java.lang.Object[] r15 = new java.lang.Object[r12]
            r15[r13] = r1
            java.lang.String r0 = "call add host to parser listener:%s"
            java.lang.String.format(r0, r15)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r15 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.getInstance()
            r15.addHost(r5, r1)
        Lbd:
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r13] = r1
            java.lang.String r13 = "****call start end, listener:%s"
            java.lang.String.format(r13, r12)
            return r14
        Lc7:
            java.util.concurrent.locks.Lock r13 = r11.lock
            r13.unlock()
            throw r12
    }

    private void parserResult(int r17, java.lang.String r18, java.lang.String r19, long r20, java.lang.String r22, int r23, int r24) {
            r16 = this;
            r1 = r16
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.lock()
            r0 = 0
            boolean r2 = r1.isFinish     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 != 0) goto L8e
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.String r6 = "receive completion code:%d result:%s type:%d"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            boolean r8 = android.text.TextUtils.isEmpty(r19)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            if (r8 == 0) goto L23
            java.lang.String r8 = "null"
            goto L25
        L20:
            r0 = move-exception
            goto Lb4
        L23:
            r8 = r19
        L25:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r3[r0] = r7     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r3[r5] = r8     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r3[r4] = r9     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.String.format(r2, r6, r3)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            boolean r3 = android.text.TextUtils.isEmpty(r19)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r6 = 0
            if (r3 == 0) goto L66
            r3 = 5
            int r3 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.getIntValue(r3)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            if (r3 != r5) goto L66
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r3 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r10 = r18
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r3 = r3.getBackUpIp(r10)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            if (r3 == 0) goto L68
            java.lang.String r8 = r3.mIpList     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            int r3 = r3.mType     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.String r9 = "get backup ip, result:%s type:%d"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r12[r0] = r8     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r12[r5] = r11     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.String.format(r2, r9, r12)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r15 = r3
            r12 = r6
            r11 = r8
            goto L6e
        L66:
            r10 = r18
        L68:
            r11 = r19
            r12 = r20
            r15 = r23
        L6e:
            r1.ipList = r11     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r1.isFinish = r5     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            long r8 = r1.handle     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto La5
            r2 = r24
            if (r2 != r4) goto L84
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable = r5     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r14 = r22
            _notifyParserResultV2(r8, r10, r11, r12, r14, r15)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            goto La5
        L84:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable = r0     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r10 = r18
            r14 = r22
            _notifyParserResult(r8, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            goto La5
        L8e:
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.String r6 = "has finished not nedd cur completion code:%d result:%s expiredTime:%d"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.Long r8 = java.lang.Long.valueOf(r20)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r3[r0] = r7     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r3[r5] = r19     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            r3[r4] = r8     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
            java.lang.String.format(r2, r6, r3)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> Lab
        La5:
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.unlock()
            return
        Lab:
            boolean r2 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto Lb1
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable = r0     // Catch: java.lang.Throwable -> L20
        Lb1:
            r1.isFinish = r0     // Catch: java.lang.Throwable -> L20
            goto La5
        Lb4:
            java.util.concurrent.locks.Lock r2 = r1.lock
            r2.unlock()
            throw r0
    }

    public java.lang.String getBackUp(java.lang.String r3) {
            r2 = this;
            r0 = 5
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.getIntValue(r0)
            r1 = 1
            if (r0 != r1) goto L15
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r0 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r3 = r0.getBackUpIp(r3)
            if (r3 == 0) goto L15
            java.lang.String r3 = r3.mIpList
            return r3
        L15:
            r3 = 0
            return r3
    }

    public java.lang.String getResult() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.lock
            r0.lock()
            java.lang.String r0 = r2.ipList     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            return r0
        Ld:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            throw r0
    }

    boolean isFinish() {
            r1 = this;
            boolean r0 = r1.isFinish
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener
    public void onCompletion(int r10, java.lang.String r11, java.lang.String r12, long r13, java.lang.String r15, int r16) {
            r9 = this;
            boolean r1 = r9.isFinish
            if (r1 != 0) goto L14
            boolean r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable
            if (r1 == 0) goto L14
            r8 = 2
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r6 = r15
            r7 = r16
            r0.parserResult(r1, r2, r3, r4, r6, r7, r8)
        L14:
            boolean r1 = r9.isFinish
            if (r1 != 0) goto L24
            r8 = 1
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r6 = r15
            r7 = r16
            r0.parserResult(r1, r2, r3, r4, r6, r7, r8)
        L24:
            return
    }

    public void release() {
            r5 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            java.lang.String r3 = "----start release:%s"
            java.lang.String.format(r3, r1)
            java.util.concurrent.locks.Lock r1 = r5.lock
            r1.lock()
            r3 = 0
            r5.handle = r3     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.locks.Lock r1 = r5.lock
            r1.unlock()
            java.lang.String r1 = r5.host
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r1
            java.lang.String r1 = "remove host:%s"
            java.lang.String.format(r1, r3)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.getInstance()
            java.lang.String r3 = r5.host
            r1.removeHost(r3, r5)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            java.lang.String r1 = "****end call release:%s"
            java.lang.String.format(r1, r0)
            return
        L37:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r5.lock
            r1.unlock()
            throw r0
    }

    public int start(long r2, java.lang.String r4) {
            r1 = this;
            boolean r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserBridge.v2Usable
            if (r0 == 0) goto La
            r0 = 2
            int r0 = r1.parserResult(r2, r4, r0)
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 > 0) goto L13
            r0 = 1
            int r2 = r1.parserResult(r2, r4, r0)
            return r2
        L13:
            return r0
    }
}
