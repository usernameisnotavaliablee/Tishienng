package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVTime {
    public AVTime() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getFormatNow() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm ss:SSS"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }
}
