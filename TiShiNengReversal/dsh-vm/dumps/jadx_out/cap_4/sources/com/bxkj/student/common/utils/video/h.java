package com.bxkj.student.common.utils.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h {
    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap a(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 2
            android.graphics.Bitmap r1 = android.media.ThumbnailUtils.createVideoThumbnail(r1, r0)
            return r1
    }

    public static long b(java.lang.String r2) {
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r2)
            r2 = 9
            java.lang.String r2 = r0.extractMetadata(r2)
            if (r2 != 0) goto L12
            java.lang.String r2 = "0"
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "duration="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            long r0 = java.lang.Long.parseLong(r2)
            return r0
    }
}
