package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d2 {
    public static com.acse.ottn.d2 a;

    public d2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.d2 b() {
            com.acse.ottn.d2 r0 = com.acse.ottn.d2.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.d2> r0 = com.acse.ottn.d2.class
            monitor-enter(r0)
            com.acse.ottn.d2 r1 = com.acse.ottn.d2.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.d2 r1 = new com.acse.ottn.d2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.d2.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.d2 r0 = com.acse.ottn.d2.a
            return r0
    }

    public void a() {
            r3 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "tb_lj_data"
            java.lang.String r2 = ""
            r0.b(r1, r2)
            return
    }

    public void a(com.acse.ottn.model.AccessiblityModel r3) {
            r2 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r3)
            java.lang.String r1 = "tb_lj_data"
            r0.b(r1, r3)
            return
    }

    public final java.lang.Object c() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.d2 r0 = com.acse.ottn.d2.a
            return r0
    }
}
