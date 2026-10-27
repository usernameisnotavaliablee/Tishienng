package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r2) {
            java.lang.String r0 = b(r2)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "javascript:document.getElementsByClassName('"
            r0.append(r1)
            java.lang.String r2 = b(r2)
            r0.append(r2)
            java.lang.String r2 = "')[0].addEventListener('click',function(){local_obj.playing();return false;});"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L21:
            java.lang.String r2 = "javascript:"
            return r2
    }

    public static java.lang.String b(java.lang.String r1) {
            java.lang.String r0 = "letv"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lb
            java.lang.String r1 = "hv_ico_screen"
            return r1
        Lb:
            java.lang.String r0 = "youku"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L16
            java.lang.String r1 = "x-zoomin"
            return r1
        L16:
            java.lang.String r0 = "bilibili"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L21
            java.lang.String r1 = "icon-widescreen"
            return r1
        L21:
            java.lang.String r0 = "qq"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L2c
            java.lang.String r1 = "tvp_fullscreen_button"
            return r1
        L2c:
            r1 = 0
            return r1
    }
}
