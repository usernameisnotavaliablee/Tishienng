package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AVMDLNetClient {
    public static final int METHOD_GET = 0;
    public static final int METHOD_POST = 1;

    public interface CompletionListener {
        void onCompletion(org.json.JSONObject r1, com.bykv.vk.component.ttvideo.mediakit.net.Error r2);
    }

    public AVMDLNetClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public void cancel() {
            r0 = this;
            return
    }

    public void startTask(java.lang.String r1, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient.CompletionListener r2) {
            r0 = this;
            return
    }

    public void startTask(java.lang.String r1, java.util.Map<java.lang.String, java.lang.String> r2, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient.CompletionListener r3) {
            r0 = this;
            return
    }

    public void startTask(java.lang.String r1, java.util.Map<java.lang.String, java.lang.String> r2, org.json.JSONObject r3, int r4, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient.CompletionListener r5) {
            r0 = this;
            return
    }
}
