package com.bykv.vk.component.ttvideo.mediakit.medialoader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LoaderEventInfo {
    public long bitrate;
    public long bytesLoaded;
    public int dataType;
    public long elapsedRealtimeMs;
    public long endOff;
    public java.lang.String fileHash;
    public long loadDurationMs;
    public java.util.HashMap<java.lang.String, java.lang.String> mHeaders;
    public long off;
    public int taskType;
    public int what;

    public LoaderEventInfo() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.what = r0
            r1 = 0
            r2.fileHash = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mHeaders = r1
            r2.taskType = r0
            r2.dataType = r0
            r0 = -1
            r2.bytesLoaded = r0
            r2.bitrate = r0
            r2.elapsedRealtimeMs = r0
            r2.loadDurationMs = r0
            r2.off = r0
            r2.endOff = r0
            return
    }
}
