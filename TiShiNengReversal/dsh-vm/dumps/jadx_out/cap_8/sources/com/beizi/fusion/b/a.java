package com.beizi.fusion.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static int a;

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a() {
            int r0 = com.beizi.fusion.b.a.a
            r1 = 0
            a(r1)
            return r0
    }

    public static com.beizi.fusion.model.AdSpacesBean a(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r0 = 0
            if (r3 == 0) goto L53
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L53
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L10
            goto L53
        L10:
            com.beizi.fusion.model.ResponseInfo r3 = com.beizi.fusion.model.ResponseInfo.getInstance(r3)
            boolean r5 = r3.isInit()
            if (r5 != 0) goto L1d
            r3.init()
        L1d:
            com.beizi.fusion.model.Manager r3 = r3.getManager()
            if (r3 == 0) goto L4f
            java.util.List r3 = r3.getAdSpaces()
            if (r3 == 0) goto L4a
            int r5 = r3.size()
            if (r5 <= 0) goto L4a
            r5 = 0
        L30:
            int r1 = r3.size()
            if (r5 >= r1) goto L4a
            java.lang.Object r1 = r3.get(r5)
            com.beizi.fusion.model.AdSpacesBean r1 = (com.beizi.fusion.model.AdSpacesBean) r1
            java.lang.String r2 = r1.getSpaceId()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L47
            return r1
        L47:
            int r5 = r5 + 1
            goto L30
        L4a:
            r3 = 2
            a(r3)
            return r0
        L4f:
            r3 = 1
            a(r3)
        L53:
            return r0
    }

    public static void a(int r0) {
            com.beizi.fusion.b.a.a = r0
            return
    }
}
