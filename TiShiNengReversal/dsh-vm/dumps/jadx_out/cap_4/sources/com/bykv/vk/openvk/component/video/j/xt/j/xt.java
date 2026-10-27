package com.bykv.vk.openvk.component.video.j.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bykv.vk.openvk.component.video.j.xt.j.j {
    public final java.io.File j;


    @Override // com.bykv.vk.openvk.component.video.j.xt.j.j
    public java.io.File cw(java.lang.String r1) {
            r0 = this;
            java.io.File r1 = r0.up(r1)
            return r1
    }

    public void j() {
            r2 = this;
            com.bykv.vk.openvk.component.video.j.xt.j.xt$1 r0 = new com.bykv.vk.openvk.component.video.j.xt.j.xt$1
            java.lang.String r1 = "clear"
            r0.<init>(r2, r1)
            com.bykv.vk.openvk.component.video.j.cw.j.j(r0)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.j.j
    public java.io.File r(java.lang.String r1) {
            r0 = this;
            java.io.File r1 = r0.up(r1)
            return r1
    }

    java.io.File up(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.j
            r0.<init>(r1, r3)
            return r0
    }

    public void xt() {
            r4 = this;
            com.bykv.vk.openvk.component.video.j.xt.r r0 = com.bykv.vk.openvk.component.video.j.xt.r.cw()
            r0.r()
            android.content.Context r0 = com.bykv.vk.openvk.component.video.j.xt.up.getContext()
            if (r0 == 0) goto L15
            com.bykv.vk.openvk.component.video.j.xt.xt.cw r0 = com.bykv.vk.openvk.component.video.j.xt.xt.cw.j(r0)
            r1 = 1
            r0.j(r1)
        L15:
            java.io.File r0 = r4.j
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 0
        L1d:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            r3.delete()     // Catch: java.lang.Throwable -> L24
        L24:
            int r2 = r2 + 1
            goto L1d
        L27:
            return
    }
}
