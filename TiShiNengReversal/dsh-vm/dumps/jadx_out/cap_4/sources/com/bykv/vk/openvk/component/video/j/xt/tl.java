package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class tl {
    private final java.io.RandomAccessFile j;

    static class j extends java.lang.Exception {
        j(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    tl(java.io.File r2, java.lang.String r3) throws com.bykv.vk.openvk.component.video.j.xt.tl.j {
            r1 = this;
            r1.<init>()
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.io.FileNotFoundException -> Lb
            r0.<init>(r2, r3)     // Catch: java.io.FileNotFoundException -> Lb
            r1.j = r0     // Catch: java.io.FileNotFoundException -> Lb
            return
        Lb:
            r2 = move-exception
            com.bykv.vk.openvk.component.video.j.xt.tl$j r3 = new com.bykv.vk.openvk.component.video.j.xt.tl$j
            r3.<init>(r2)
            throw r3
    }

    int j(byte[] r2) throws com.bykv.vk.openvk.component.video.j.xt.tl.j {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.j     // Catch: java.io.IOException -> L7
            int r2 = r0.read(r2)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            com.bykv.vk.openvk.component.video.j.xt.tl$j r0 = new com.bykv.vk.openvk.component.video.j.xt.tl$j
            r0.<init>(r2)
            throw r0
    }

    void j() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.j
            com.bykv.vk.openvk.component.video.j.cw.j.j(r0)
            return
    }

    void j(long r2) throws com.bykv.vk.openvk.component.video.j.xt.tl.j {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.j     // Catch: java.io.IOException -> L6
            r0.seek(r2)     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            com.bykv.vk.openvk.component.video.j.xt.tl$j r3 = new com.bykv.vk.openvk.component.video.j.xt.tl$j
            r3.<init>(r2)
            throw r3
    }

    void j(byte[] r2, int r3, int r4) throws com.bykv.vk.openvk.component.video.j.xt.tl.j {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.j     // Catch: java.io.IOException -> L6
            r0.write(r2, r3, r4)     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            com.bykv.vk.openvk.component.video.j.xt.tl$j r3 = new com.bykv.vk.openvk.component.video.j.xt.tl$j
            r3.<init>(r2)
            throw r3
    }
}
