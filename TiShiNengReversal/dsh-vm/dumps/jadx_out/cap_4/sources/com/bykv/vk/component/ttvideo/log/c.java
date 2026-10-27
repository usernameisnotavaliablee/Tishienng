package com.bykv.vk.component.ttvideo.log;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    public com.bykv.vk.component.ttvideo.log.a a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public int h;

    c(com.bykv.vk.component.ttvideo.log.a r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r2 = ""
            r0.c = r2
            r0.d = r2
            r0.e = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.h = r2
            r0.a = r1
            r1 = 0
            java.lang.String r1 = com.bykv.vk.component.ttvideo.utils.b.a(r1)
            r0.f = r1
            return
    }

    public void a() {
            r0 = this;
            r0.b()
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            java.lang.String r1 = com.bykv.vk.component.ttvideo.utils.b.b(r1)
            r0.f = r1
            return
    }

    public void b() {
            r2 = this;
            com.bykv.vk.component.ttvideo.log.a r0 = r2.a
            if (r0 == 0) goto L28
            java.util.Map r0 = r0.versionInfo()
            if (r0 == 0) goto L28
            java.lang.String r1 = "pc"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2.c = r1
            java.lang.String r1 = "sv"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2.d = r1
            java.lang.String r1 = "sdk_version"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r2.e = r0
        L28:
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            return
    }
}
