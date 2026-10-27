package com.bykv.vk.openvk.component.video.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m extends com.bykv.vk.openvk.component.video.j.xt.up.j {
    private com.bytedance.sdk.component.xt.j.av cw;

    public m(com.bytedance.sdk.component.xt.j.av r6, com.bykv.vk.openvk.component.video.j.xt.up.up r7) {
            r5 = this;
            r5.<init>()
            r5.cw = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.j = r0
            if (r6 == 0) goto L30
            com.bytedance.sdk.component.xt.j.m r6 = r6.ae()
            if (r6 == 0) goto L30
            r0 = 0
        L15:
            int r1 = r6.j()
            if (r0 >= r1) goto L30
            java.util.List<com.bykv.vk.openvk.component.video.j.xt.g$xt> r1 = r5.j
            com.bykv.vk.openvk.component.video.j.xt.g$xt r2 = new com.bykv.vk.openvk.component.video.j.xt.g$xt
            java.lang.String r3 = r6.j(r0)
            java.lang.String r4 = r6.xt(r0)
            r2.<init>(r3, r4)
            r1.add(r2)
            int r0 = r0 + 1
            goto L15
        L30:
            r5.xt = r7
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.up.j
    public java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> cw() {
            r1 = this;
            java.util.List<com.bykv.vk.openvk.component.video.j.xt.g$xt> r0 = r1.j
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.up.j
    public int j() {
            r1 = this;
            com.bytedance.sdk.component.xt.j.av r0 = r1.cw
            int r0 = r0.cw()
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.up.j
    public java.lang.String j(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.xt.g$xt r0 = r1.j(r2)
            if (r0 == 0) goto Ld
            com.bykv.vk.openvk.component.video.j.xt.g$xt r2 = r1.j(r2)
            java.lang.String r2 = r2.xt
            return r2
        Ld:
            return r3
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.up.j
    public java.lang.String m() {
            r1 = this;
            com.bytedance.sdk.component.xt.j.av r0 = r1.cw
            int r0 = r0.cw()
            java.lang.String r0 = r1.j(r0)
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.up.j
    public java.io.InputStream r() {
            r1 = this;
            com.bytedance.sdk.component.xt.j.av r0 = r1.cw
            com.bytedance.sdk.component.xt.j.i r0 = r0.m()
            java.io.InputStream r0 = r0.cw()
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.up.j
    public java.lang.String up() {
            r1 = this;
            com.bytedance.sdk.component.xt.j.av r0 = r1.cw
            if (r0 == 0) goto L15
            com.bytedance.sdk.component.xt.j.jy r0 = r0.tl()
            if (r0 == 0) goto L15
            com.bytedance.sdk.component.xt.j.av r0 = r1.cw
            com.bytedance.sdk.component.xt.j.jy r0 = r0.tl()
            java.lang.String r0 = r0.toString()
            return r0
        L15:
            java.lang.String r0 = "http/1.1"
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.xt.up.j
    public boolean xt() {
            r2 = this;
            com.bytedance.sdk.component.xt.j.av r0 = r2.cw
            int r0 = r0.cw()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L16
            com.bytedance.sdk.component.xt.j.av r0 = r2.cw
            int r0 = r0.cw()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }
}
