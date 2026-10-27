package com.bykv.vk.component.ttvideo.model;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LiveInfoSource {
    public static final int INFO_SOURCE_DIRECT_URLS = 1;
    public static final int INFO_SOURCE_STREAM_DATA = 2;
    public static final int INFO_SOURCE_UNKNOWN = 0;
    private java.lang.String[] mAvailableURLs;
    private int mCurrentURLIndex;
    private int mEnableSR;
    private com.bykv.vk.component.ttvideo.model.LiveURL[] mPlayURLs;
    private int mSourceType;
    private com.bykv.vk.component.ttvideo.model.LiveStreamInfo mStreamInfo;

    public LiveInfoSource() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mEnableSR = r0
            return
    }

    public boolean adjustOriginBitRate(java.lang.String r2, java.lang.String r3, long r4) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.adjustOriginBitRate(r2, r3, r4)
            return r2
    }

    public org.json.JSONObject getAbrInfo() {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            org.json.JSONObject r0 = r0.getAbrInfo()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.String getAvLinesParams(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            java.lang.String r3 = r0.getAvLinesParams(r3, r4)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public long getBitrate(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            long r3 = r0.getBitrate(r3, r4)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public int getCheckSilenceInterval(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            int r3 = r0.getCheckSilenceInterval(r3, r4)
            return r3
        Lf:
            r3 = -1
            return r3
    }

    public java.lang.String getDefaultResolution() {
            r3 = this;
            int r0 = r3.mSourceType
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r3.mStreamInfo
            if (r0 != 0) goto Lc
            return r2
        Lc:
            java.lang.String r0 = r0.getDefaultResolution()
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getHTTPHeaders() {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            java.util.Map r0 = r0.getHTTPHeaders()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.String getLabelfromBitrate(long r3, java.lang.String r5) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            java.lang.String r3 = r0.getLabelfromBitrate(r3, r5)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public java.lang.String getMPDForFormat(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            java.lang.String r3 = r0.getMPDForFormat(r3, r4, r5, r6)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public java.lang.String getNextURL() {
            r1 = this;
            int r0 = r1.mCurrentURLIndex
            int r0 = r0 + 1
            r1.mCurrentURLIndex = r0
            java.lang.String r0 = r1.getPlayURL()
            return r0
    }

    public com.bykv.vk.component.ttvideo.model.LiveURL getPlayLiveURL() {
            r6 = this;
            com.bykv.vk.component.ttvideo.model.LiveURL[] r0 = r6.mPlayURLs
            r1 = 0
            if (r0 == 0) goto L17
            int r2 = r0.length
            if (r2 != 0) goto L9
            goto L17
        L9:
            int r2 = r0.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L17
            r4 = r0[r3]
            java.lang.String r5 = r4.mainURL
            if (r5 == 0) goto L14
            return r4
        L14:
            int r3 = r3 + 1
            goto Lb
        L17:
            return r1
    }

    public java.lang.String getPlayURL() {
            r3 = this;
            java.lang.String[] r0 = r3.mAvailableURLs
            if (r0 == 0) goto L12
            int r1 = r0.length
            if (r1 != 0) goto L8
            goto L12
        L8:
            int r1 = r3.mCurrentURLIndex
            int r2 = r0.length
            if (r1 >= r2) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            r0 = r0[r1]
            return r0
        L12:
            r0 = 0
            return r0
    }

    public com.bykv.vk.component.ttvideo.model.LiveURL getPlayURLByCodec(@androidx.annotation.NonNull java.lang.String r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L23
            com.bykv.vk.component.ttvideo.model.LiveURL[] r1 = r6.mPlayURLs
            if (r1 == 0) goto L23
            int r2 = r1.length
            if (r2 != 0) goto Lb
            goto L23
        Lb:
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L23
            r4 = r1[r3]
            java.lang.String r5 = r4.getVCodec()
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L20
            java.lang.String r5 = r4.mainURL
            if (r5 == 0) goto L20
            return r4
        L20:
            int r3 = r3 + 1
            goto Ld
        L23:
            return r0
    }

    public java.lang.String getPlayURLForResolution(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            java.lang.String r3 = r0.getStreamUrlForResolution(r3, r4, r5)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public java.lang.String getPortNum(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r0.getPortNum(r2, r3, r4)
            return r2
    }

    public java.lang.String getRuleIds() {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            java.lang.String r0 = r0.getRuleIds()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.String getSDKParams(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            java.lang.String r3 = r0.getSDKParams(r3, r4)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public boolean getSREnabled(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            int r1 = r2.mEnableSR
            boolean r3 = r0.getSREnabled(r3, r4, r1)
            return r3
    }

    public int getSRLongerSideUpperBound() {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            int r0 = r0.getSRLongerSideUpperBound()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getSRShorterSideUpperBound() {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            int r0 = r0.getSRShorterSideUpperBound()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.String getSessionID() {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            java.lang.String r0 = r0.getSessionID()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public org.json.JSONObject getSharpenParams(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            org.json.JSONObject r3 = r0.getSharpenParams(r3, r4)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public int getSourceType() {
            r1 = this;
            int r0 = r1.mSourceType
            return r0
    }

    public java.lang.String getSuggestFormat(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r0.getSuggestFormat(r2, r3)
            return r2
    }

    public java.lang.String getSuggestProtocol(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r0.getSuggestProtocol(r2, r3)
            return r2
    }

    public java.lang.String getVCodec(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            java.lang.String r3 = r0.getVCodec(r3, r4)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public boolean isABRListMatch() {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isABRListMatch()
            return r0
    }

    public boolean isCodecSame(java.lang.String r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.isCodecSame(r2)
            return r2
    }

    public boolean isEnableAdaptive(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            boolean r3 = r0.isEnableAdaptive(r3)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public boolean isSupportResolution(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            boolean r3 = r0.isSupport(r3)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public boolean isSupportSR(int r3, int r4, float r5) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            boolean r3 = r0.isSupportSR(r3, r4, r5)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public boolean isSupportSharpen(int r3, int r4) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 != r1) goto Lf
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto La
            goto Lf
        La:
            boolean r3 = r0.isSupportSharpen(r3, r4)
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.mCurrentURLIndex = r0
            r1 = 0
            r2.mAvailableURLs = r1
            r2.mStreamInfo = r1
            r2.mPlayURLs = r1
            r2.mEnableSR = r0
            return
    }

    public void setDefaultResolution(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mSourceType
            r1 = 2
            if (r0 == r1) goto L6
            goto La
        L6:
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r2.mStreamInfo
            if (r0 != 0) goto Lb
        La:
            return
        Lb:
            r0.setDefaultResolution(r3)
            return
    }

    public void setEnableOriginResolution(boolean r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 != 0) goto L5
            return
        L5:
            r0.setEnableOriginResolution(r2)
            return
    }

    public void setEnableSR(int r1) {
            r0 = this;
            r0.mEnableSR = r1
            return
    }

    public void setPlayURLs(com.bykv.vk.component.ttvideo.model.LiveURL[] r6) {
            r5 = this;
            r5.mPlayURLs = r6
            r0 = 0
            r5.mCurrentURLIndex = r0
            r1 = 1
            r5.mSourceType = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r6.length
        Le:
            if (r0 >= r2) goto L23
            r3 = r6[r0]
            java.lang.String r4 = r3.mainURL
            if (r4 == 0) goto L19
            r1.add(r4)
        L19:
            java.lang.String r3 = r3.backupURL
            if (r3 == 0) goto L20
            r1.add(r3)
        L20:
            int r0 = r0 + 1
            goto Le
        L23:
            int r6 = r1.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            r5.mAvailableURLs = r6
            r1.toArray(r6)
            return
    }

    public void setRequestParams(java.lang.String r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 == 0) goto L7
            r0.setRequestParams(r2)
        L7:
            return
    }

    public void setRequestParamsWithDNSIp(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 == 0) goto L7
            r0.setRequestParamsWithDNSIp(r2, r3, r4)
        L7:
            return
    }

    public void setRtcFallback(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 == 0) goto L7
            r0.setRtcFallback(r2)
        L7:
            return
    }

    public void setSourceType(int r1) {
            r0 = this;
            r0.mSourceType = r1
            return
    }

    public void setStreamInfo(com.bykv.vk.component.ttvideo.model.LiveStreamInfo r1) {
            r0 = this;
            r0.mStreamInfo = r1
            r1 = 0
            r0.mCurrentURLIndex = r1
            r1 = 2
            r0.mSourceType = r1
            return
    }

    public boolean setStreamInfoFlag(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.setFlag(r2)
            return r2
    }

    public void setTransportProtocol(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = r1.mStreamInfo
            if (r0 == 0) goto L7
            r0.setTransportProtocol(r2, r3)
        L7:
            return
    }
}
