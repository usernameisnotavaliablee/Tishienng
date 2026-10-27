package com.beizi.fusion.sm.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a implements com.beizi.fusion.sm.b.b {
    private java.lang.String a;

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r0, com.beizi.fusion.sm.b.b r1) {
            com.beizi.fusion.sm.b.c r0 = com.beizi.fusion.sm.b.a.l.a(r0)
            r0.a(r1)
            return
    }

    public static boolean a(android.content.Context r0) {
            com.beizi.fusion.sm.b.c r0 = com.beizi.fusion.sm.b.a.l.a(r0)
            boolean r0 = r0.a()
            return r0
    }

    @Override // com.beizi.fusion.sm.b.b
    public void a(java.lang.Exception r1) {
            r0 = this;
            return
    }

    @Override // com.beizi.fusion.sm.b.b
    public void a(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L11
            com.beizi.fusion.sm.b.d r2 = new com.beizi.fusion.sm.b.d
            java.lang.String r0 = "OAID is empty"
            r2.<init>(r0)
            r1.a(r2)
            return
        L11:
            r1.a = r2
            return
    }
}
