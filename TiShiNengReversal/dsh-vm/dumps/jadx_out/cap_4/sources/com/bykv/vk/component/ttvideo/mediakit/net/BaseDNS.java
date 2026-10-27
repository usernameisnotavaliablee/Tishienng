package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BaseDNS {
    private static final java.lang.String TAG = "BaseDNS";
    protected boolean mCancelled;
    protected android.os.Handler mHandler;
    public java.lang.String mHostname;
    public java.lang.String mId;
    protected com.bykv.vk.component.ttvideo.mediakit.net.DNSCompletionListener mListener;
    protected com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient mNetClient;

    public BaseDNS(java.lang.String r3, android.os.Handler r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mCancelled = r0
            r0 = 0
            r2.mNetClient = r0
            r2.mHostname = r3
            r2.mHandler = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r0 = java.lang.System.nanoTime()
            java.lang.String r4 = java.lang.Long.toString(r0)
            r3.append(r4)
            int r4 = java.lang.System.identityHashCode(r2)
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.mId = r3
            return
    }

    public BaseDNS(java.lang.String r2, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r3, android.os.Handler r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCancelled = r0
            r0 = 0
            r1.mNetClient = r0
            r1.mHostname = r2
            r1.mHandler = r4
            if (r3 != 0) goto L13
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r3 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.getNetClient()
        L13:
            r1.mNetClient = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = java.lang.System.nanoTime()
            java.lang.String r3 = java.lang.Long.toString(r3)
            r2.append(r3)
            int r3 = java.lang.System.identityHashCode(r1)
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mId = r2
            return
    }

    public void cancel() {
            r0 = this;
            return
    }

    public void close() {
            r0 = this;
            return
    }

    public boolean isRunning() {
            r1 = this;
            r0 = 1
            return r0
    }

    protected void notifyCancelled() {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            r1 = 0
            r0.sendEmptyMessage(r1)
            return
    }

    protected void notifyError(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r3) {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            r1 = 2
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            android.os.Handler r0 = r2.mHandler
            r0.sendMessage(r3)
            return
    }

    protected void notifyRetry(com.bykv.vk.component.ttvideo.mediakit.net.Error r3) {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            r1 = 1
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            android.os.Handler r0 = r2.mHandler
            r0.sendMessage(r3)
            return
    }

    protected void notifySuccess(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r3) {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            r1 = 3
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            android.os.Handler r0 = r2.mHandler
            r0.sendMessage(r3)
            return
    }

    public void setCompletionListener(com.bykv.vk.component.ttvideo.mediakit.net.DNSCompletionListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    public void start() {
            r0 = this;
            return
    }
}
