package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class x {
    @androidx.annotation.NonNull
    public static java.lang.String a(int r0) {
            switch(r0) {
                case 1: goto L12;
                case 2: goto Lf;
                case 3: goto Lc;
                case 4: goto Lc;
                case 5: goto Lc;
                case 6: goto L9;
                case 7: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "audio/none"
            return r0
        L6:
            java.lang.String r0 = "audio/opus"
            return r0
        L9:
            java.lang.String r0 = "audio/vorbis"
            return r0
        Lc:
            java.lang.String r0 = "audio/mp4a-latm"
            return r0
        Lf:
            java.lang.String r0 = "audio/amr-wb"
            return r0
        L12:
            java.lang.String r0 = "audio/3gpp"
            return r0
    }

    public static int b(int r2) {
            r0 = 3
            if (r2 == r0) goto Lf
            r0 = 4
            r1 = 5
            if (r2 == r0) goto Le
            if (r2 == r1) goto Lb
            r2 = -1
            return r2
        Lb:
            r2 = 39
            return r2
        Le:
            return r1
        Lf:
            r2 = 2
            return r2
    }

    @androidx.annotation.NonNull
    public static java.lang.String c(int r0) {
            switch(r0) {
                case 1: goto L23;
                case 2: goto L1f;
                case 3: goto L1b;
                case 4: goto L17;
                case 5: goto L13;
                case 6: goto Lf;
                case 7: goto Lb;
                case 8: goto L7;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "video/none"
            return r0
        L7:
            java.lang.String r0 = "video/av01"
            return r0
        Lb:
            java.lang.String r0 = "video/dolby-vision"
            return r0
        Lf:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            return r0
        L13:
            java.lang.String r0 = "video/hevc"
            return r0
        L17:
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            return r0
        L1b:
            java.lang.String r0 = "video/mp4v-es"
            return r0
        L1f:
            java.lang.String r0 = "video/avc"
            return r0
        L23:
            java.lang.String r0 = "video/3gpp"
            return r0
    }
}
