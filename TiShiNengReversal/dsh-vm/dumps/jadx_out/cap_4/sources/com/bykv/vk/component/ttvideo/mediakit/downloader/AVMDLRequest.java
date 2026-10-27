package com.bykv.vk.component.ttvideo.mediakit.downloader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLRequest {
    public static final int UrlStateIsForbidden = 1;
    public static final int UrlStateIsNormal = 0;
    public java.util.HashMap<java.lang.String, java.lang.String> headers;
    public int mCurlUrlIndex;
    public int mMaxTryCout;
    public int mOpenTimeOut;
    public int mRWTimeOut;
    public int[] mUrlErrCount;
    public int[] mUrlState;
    public long reqOff;
    public com.bytedance.sdk.component.xt.j.av response;
    public long size;
    public java.lang.String[] urls;

    public AVMDLRequest() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.urls = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.headers = r1
            r1 = -1
            r3.reqOff = r1
            r1 = 0
            r3.size = r1
            r3.response = r0
            r0 = 0
            r3.mCurlUrlIndex = r0
            r3.mMaxTryCout = r0
            r0 = 10
            r3.mOpenTimeOut = r0
            r3.mRWTimeOut = r0
            return
    }

    public AVMDLRequest(long r1, long r3, java.lang.String[] r5, java.lang.Object r6, int r7, int r8, int r9) {
            r0 = this;
            r0.<init>()
            r0.urls = r5
            java.util.HashMap r6 = (java.util.HashMap) r6
            r0.headers = r6
            r0.reqOff = r1
            r0.size = r3
            r1 = 0
            r0.response = r1
            r0.mUrlState = r1
            r1 = 0
            r0.mCurlUrlIndex = r1
            r0.mMaxTryCout = r7
            r0.mOpenTimeOut = r8
            r0.mRWTimeOut = r9
            if (r5 == 0) goto L42
            int r2 = r5.length
            if (r2 <= 0) goto L42
            int r2 = r5.length
            int[] r2 = new int[r2]
            r0.mUrlState = r2
            r2 = 0
        L26:
            int[] r3 = r0.mUrlState
            int r4 = r3.length
            if (r2 >= r4) goto L30
            r3[r2] = r1
            int r2 = r2 + 1
            goto L26
        L30:
            java.lang.String[] r2 = r0.urls
            int r2 = r2.length
            int[] r2 = new int[r2]
            r0.mUrlErrCount = r2
            r2 = 0
        L38:
            int[] r3 = r0.mUrlErrCount
            int r4 = r3.length
            if (r2 >= r4) goto L42
            r3[r2] = r1
            int r2 = r2 + 1
            goto L38
        L42:
            return
    }

    public AVMDLRequest(long r1, long r3, java.lang.String[] r5, java.util.HashMap<java.lang.String, java.lang.String> r6) {
            r0 = this;
            r0.<init>()
            r0.urls = r5
            r0.headers = r6
            r0.reqOff = r1
            r0.size = r3
            r1 = 0
            r0.response = r1
            r0.mUrlState = r1
            r1 = 0
            r0.mCurlUrlIndex = r1
            r0.mMaxTryCout = r1
            r2 = 10
            r0.mOpenTimeOut = r2
            r0.mRWTimeOut = r2
            if (r5 == 0) goto L30
            int r2 = r5.length
            if (r2 <= 0) goto L30
            int r2 = r5.length
            int[] r2 = new int[r2]
            r0.mUrlState = r2
            r2 = 0
        L26:
            int[] r3 = r0.mUrlState
            int r4 = r3.length
            if (r2 >= r4) goto L30
            r3[r2] = r1
            int r2 = r2 + 1
            goto L26
        L30:
            return
    }
}
