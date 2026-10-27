package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLDNSInfo {
    public java.lang.String mErrorStr;
    public long mExpiredTime;
    public java.lang.String mExtraInfo;
    public java.lang.String mHost;
    public java.lang.String[] mHosts;
    public java.lang.String mId;
    public java.lang.String mIpList;
    public int mType;

    public AVMDLDNSInfo(int r1, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.mType = r1
            r0.mHost = r2
            r0.mIpList = r3
            r0.mExpiredTime = r4
            r0.mId = r6
            return
    }

    public AVMDLDNSInfo(int r1, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.mType = r1
            r0.mHost = r2
            r0.mIpList = r3
            r0.mExpiredTime = r4
            r0.mId = r6
            r0.mErrorStr = r7
            return
    }

    public AVMDLDNSInfo(int r1, java.lang.String[] r2, java.lang.String r3, long r4, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.mType = r1
            r0.mHosts = r2
            r0.mIpList = r3
            r0.mExpiredTime = r4
            r0.mId = r6
            return
    }
}
