package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LocalDNSHosts {
    private static final java.lang.String TAG = "BatchParseLocalDNSHosts";
    private static final int TIME_OUT = 10000;
    private java.net.InetAddress[] mAddress;
    protected boolean mCancelled;
    private java.util.concurrent.Future mFuture;
    protected android.os.Handler mHandler;
    public java.lang.String[] mHosts;
    public java.lang.String mId;
    protected com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient mNetClient;
    private boolean mRet;


    private static class MyRunnable implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts> mLocalDNSRef;

        public MyRunnable(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mLocalDNSRef = r0
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "----implement delayed check for local dns"
                java.lang.String.format(r2, r1)
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts> r1 = r3.mLocalDNSRef
                java.lang.Object r1 = r1.get()
                com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts r1 = (com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts) r1
                if (r1 != 0) goto L1a
                java.lang.String r1 = "****end implement delayed check for local dns, dns object null"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String.format(r1, r0)
                return
            L1a:
                boolean r2 = com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts.access$100(r1)
                if (r2 != 0) goto L2a
                r1.cancel()
                java.lang.String r1 = "****end implement delayed check cancel local dns,"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String.format(r1, r0)
            L2a:
                return
        }
    }

    public LocalDNSHosts(java.lang.String[] r2, android.os.Handler r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mRet = r0
            r1.mCancelled = r0
            r0 = 0
            r1.mNetClient = r0
            r1.mHosts = r2
            r1.mHandler = r3
            return
    }

    static /* synthetic */ java.net.InetAddress[] access$000(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts r0) {
            java.net.InetAddress[] r0 = r0.mAddress
            return r0
    }

    static /* synthetic */ java.net.InetAddress[] access$002(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts r0, java.net.InetAddress[] r1) {
            r0.mAddress = r1
            return r1
    }

    static /* synthetic */ boolean access$100(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts r0) {
            boolean r0 = r0.mRet
            return r0
    }

    static /* synthetic */ boolean access$102(com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts r0, boolean r1) {
            r0.mRet = r1
            return r1
    }

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

    public void close() {
            r2 = this;
            java.util.concurrent.Future r0 = r2.mFuture
            if (r0 == 0) goto Lb
            r1 = 1
            r0.cancel(r1)
            r0 = 0
            r2.mFuture = r0
        Lb:
            return
    }

    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.mRet
            return r0
    }

    public void start() {
            r4 = this;
            com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts$1 r0 = new com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts$1     // Catch: java.lang.Exception -> Lc
            r0.<init>(r4)     // Catch: java.lang.Exception -> Lc
            java.util.concurrent.Future r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLThreadPool.addExecuteTask(r0)     // Catch: java.lang.Exception -> Lc
            r4.mFuture = r0     // Catch: java.lang.Exception -> Lc
            goto L18
        Lc:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "****end call local dns, exception:%s"
            java.lang.String.format(r0, r1)
        L18:
            android.os.Handler r0 = r4.mHandler
            com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts$MyRunnable r1 = new com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts$MyRunnable
            r1.<init>(r4)
            r2 = 10000(0x2710, double:4.9407E-320)
            r0.postDelayed(r1, r2)
            return
    }
}
