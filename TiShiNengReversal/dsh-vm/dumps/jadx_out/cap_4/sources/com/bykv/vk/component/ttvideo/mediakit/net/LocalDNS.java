package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LocalDNS extends com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS {
    private static final java.lang.String TAG = "LocalDNS";
    private static final int TIME_OUT = 10000;
    private java.net.InetAddress[] mAddress;
    private java.util.concurrent.Future mFuture;
    private boolean mRet;


    private static class MyRunnable implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS> mLocalDNSRef;

        public MyRunnable(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mLocalDNSRef = r0
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "----implement delayed check for local dns"
                java.lang.String.format(r2, r1)
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS> r1 = r10.mLocalDNSRef
                java.lang.Object r1 = r1.get()
                com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS r1 = (com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS) r1
                if (r1 != 0) goto L1a
                java.lang.String r1 = "****end implement delayed check for local dns, dns object null"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String.format(r1, r0)
                return
            L1a:
                boolean r2 = com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS.access$100(r1)
                if (r2 != 0) goto L3a
                r1.cancel()
                java.lang.String r2 = "****end implement delayed check cancel local dns,"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String.format(r2, r0)
                com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r3 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
                java.lang.String r5 = r1.mHostname
                r7 = 0
                java.lang.String r9 = r1.mId
                r4 = 0
                r6 = 0
                r3.<init>(r4, r5, r6, r7, r9)
                r1.notifyError(r3)
            L3a:
                return
        }
    }

    public LocalDNS(java.lang.String r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mRet = r1
            return
    }

    static /* synthetic */ java.net.InetAddress[] access$000(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS r0) {
            java.net.InetAddress[] r0 = r0.mAddress
            return r0
    }

    static /* synthetic */ java.net.InetAddress[] access$002(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS r0, java.net.InetAddress[] r1) {
            r0.mAddress = r1
            return r1
    }

    static /* synthetic */ boolean access$100(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS r0) {
            boolean r0 = r0.mRet
            return r0
    }

    static /* synthetic */ boolean access$102(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS r0, boolean r1) {
            r0.mRet = r1
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS
    public void cancel() {
            r2 = this;
            boolean r0 = r2.mCancelled
            if (r0 == 0) goto L5
            goto L12
        L5:
            r0 = 1
            r2.mCancelled = r0
            java.util.concurrent.Future r1 = r2.mFuture
            if (r1 == 0) goto L12
            r1.cancel(r0)
            r0 = 0
            r2.mFuture = r0
        L12:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS
    public void close() {
            r2 = this;
            super.close()
            java.util.concurrent.Future r0 = r2.mFuture
            if (r0 == 0) goto Le
            r1 = 1
            r0.cancel(r1)
            r0 = 0
            r2.mFuture = r0
        Le:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS
    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.mRet
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS
    public void start() {
            r10 = this;
            com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS$1 r0 = new com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS$1     // Catch: java.lang.Exception -> Lc
            r0.<init>(r10)     // Catch: java.lang.Exception -> Lc
            java.util.concurrent.Future r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLThreadPool.addExecuteTask(r0)     // Catch: java.lang.Exception -> Lc
            r10.mFuture = r0     // Catch: java.lang.Exception -> Lc
            goto L2d
        Lc:
            r0 = move-exception
            java.lang.String r1 = r10.mHostname
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "****end call local dns, exception:%s host:%s"
            java.lang.String.format(r0, r2)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r3 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            java.lang.String r5 = r10.mHostname
            r7 = 0
            java.lang.String r9 = r10.mId
            r4 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r9)
            r10.notifyError(r3)
        L2d:
            android.os.Handler r0 = r10.mHandler
            com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS$MyRunnable r1 = new com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS$MyRunnable
            r1.<init>(r10)
            r2 = 10000(0x2710, double:4.9407E-320)
            r0.postDelayed(r1, r2)
            return
    }
}
