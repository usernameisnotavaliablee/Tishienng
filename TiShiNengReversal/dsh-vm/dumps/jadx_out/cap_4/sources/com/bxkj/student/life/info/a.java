package com.bxkj.student.life.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a implements cn.bluemobi.dylan.base.adapter.common.recyclerview.a<java.util.Map<java.lang.String, java.lang.Object>> {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* bridge */ /* synthetic */ int a(int r1, java.lang.Object r2) {
            r0 = this;
            java.util.Map r2 = (java.util.Map) r2
            int r1 = r0.c(r1, r2)
            return r1
    }

    public int b(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L7
            r2 = 2131493263(0x7f0c018f, float:1.8610001E38)
            return r2
        L7:
            r0 = 2
            if (r2 != r0) goto Le
            r2 = 2131493264(0x7f0c0190, float:1.8610003E38)
            return r2
        Le:
            r2 = 2131493262(0x7f0c018e, float:1.861E38)
            return r2
    }

    public int c(int r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
            r1 = this;
            java.lang.String r2 = "titleImg"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.util.List r2 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r2, r0)
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            int r2 = r2.size()
            return r2
    }
}
