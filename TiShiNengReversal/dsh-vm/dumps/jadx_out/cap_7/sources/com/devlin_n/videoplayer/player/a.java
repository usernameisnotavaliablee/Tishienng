package com.devlin_n.videoplayer.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class a {
    private static com.danikula.videocache.i a;

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r0) {
            java.io.File r0 = g1.e.e(r0)
            boolean r0 = g1.e.b(r0)
            return r0
    }

    public static boolean b(android.content.Context r3, java.lang.String r4) {
            com.danikula.videocache.file.f r0 = new com.danikula.videocache.file.f
            r0.<init>()
            java.lang.String r4 = r0.generate(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r3.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            java.io.File r1 = g1.e.e(r1)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            r0.append(r4)
            java.lang.String r2 = ".download"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.io.File r3 = g1.e.e(r3)
            java.lang.String r3 = r3.getAbsolutePath()
            r2.append(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r3 = r2.toString()
            boolean r4 = g1.e.a(r0)
            if (r4 == 0) goto L62
            boolean r3 = g1.e.a(r3)
            if (r3 == 0) goto L62
            r3 = 1
            return r3
        L62:
            r3 = 0
            return r3
    }

    public static com.danikula.videocache.i c(android.content.Context r1) {
            com.danikula.videocache.i r0 = com.devlin_n.videoplayer.player.a.a
            if (r0 != 0) goto Lb
            com.danikula.videocache.i r1 = d(r1)
            com.devlin_n.videoplayer.player.a.a = r1
            return r1
        Lb:
            return r0
    }

    private static com.danikula.videocache.i d(android.content.Context r3) {
            com.danikula.videocache.i$b r0 = new com.danikula.videocache.i$b
            r0.<init>(r3)
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            com.danikula.videocache.i$b r3 = r0.h(r1)
            com.danikula.videocache.i r3 = r3.b()
            return r3
    }
}
