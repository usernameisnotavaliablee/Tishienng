package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface DNSCompletionListener {
    void onCancelled();

    void onCompletion(org.json.JSONObject r1, com.bykv.vk.component.ttvideo.mediakit.net.Error r2);

    void onRetry(com.bykv.vk.component.ttvideo.mediakit.net.Error r1);
}
