package com.bykv.vk.component.ttvideo.mediakit.medialoader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLDataLoaderNotifyInfo {
    public long code;
    public org.json.JSONObject jsonLog;
    public java.lang.String logExtraJsonStr;
    public java.lang.String logInfo;
    public java.lang.String logType;
    public long parameter;
    public int what;

    public AVMDLDataLoaderNotifyInfo() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.what = r0
            r0 = -1
            r2.code = r0
            r2.parameter = r0
            r0 = 0
            r2.logInfo = r0
            r2.jsonLog = r0
            return
    }

    public AVMDLDataLoaderNotifyInfo(int r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.what = r1
            long r1 = (long) r2
            r0.code = r1
            r1 = -1
            r0.parameter = r1
            r0.logInfo = r3
            r1 = 0
            r0.jsonLog = r1
            return
    }

    public void logToJson() {
            r3 = this;
            java.lang.String r0 = r3.logInfo
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.jsonLog = r0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = r3.logInfo     // Catch: java.lang.Exception -> L12
            r1.<init>(r2)     // Catch: java.lang.Exception -> L12
            r3.jsonLog = r1     // Catch: java.lang.Exception -> L12
            return
        L12:
            r3.jsonLog = r0
            return
    }
}
