package com.bytedance.embedapplog.util;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTEncryptUtils {
    static {
            java.lang.String r0 = "tobEmbedEncrypt"
            com.bytedance.sdk.openadsdk.l.m.j(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L6
            return
        L6:
            r0 = move-exception
            com.bytedance.embedapplog.uc.xt(r0)
            return
    }

    public TTEncryptUtils() {
            r1 = this;
            r1.<init>()
            return
    }

    public static byte[] a(byte[] r0, int r1) {
            byte[] r0 = ttEncrypt(r0, r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static native byte[] ttEncrypt(byte[] r0, int r1);
}
