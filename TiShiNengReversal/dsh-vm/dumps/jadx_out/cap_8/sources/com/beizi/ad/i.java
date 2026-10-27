package com.beizi.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface i {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<com.beizi.ad.i.a> {
        public static final com.beizi.ad.i.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.beizi.ad.i.a f6533b = null;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ com.beizi.ad.i.a[] f6534c = null;

        static {
                com.beizi.ad.i$a r0 = new com.beizi.ad.i$a
                java.lang.String r1 = "CONTENT"
                r2 = 0
                r0.<init>(r1, r2)
                com.beizi.ad.i.a.a = r0
                com.beizi.ad.i$a r1 = new com.beizi.ad.i$a
                java.lang.String r3 = "APP_INSTALL"
                r4 = 1
                r1.<init>(r3, r4)
                com.beizi.ad.i.a.f6533b = r1
                r3 = 2
                com.beizi.ad.i$a[] r3 = new com.beizi.ad.i.a[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.beizi.ad.i.a.f6534c = r3
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.beizi.ad.i.a valueOf(java.lang.String r1) {
                java.lang.Class<com.beizi.ad.i$a> r0 = com.beizi.ad.i.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.beizi.ad.i$a r1 = (com.beizi.ad.i.a) r1
                return r1
        }

        public static com.beizi.ad.i.a[] values() {
                com.beizi.ad.i$a[] r0 = com.beizi.ad.i.a.f6534c
                java.lang.Object r0 = r0.clone()
                com.beizi.ad.i$a[] r0 = (com.beizi.ad.i.a[]) r0
                return r0
        }
    }

    java.lang.String a();

    void a(android.content.Context r1, android.view.View r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7);

    void a(android.view.View r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, com.beizi.ad.internal.e.b r7);

    boolean a(android.view.View r1, com.beizi.ad.internal.e.b r2);

    boolean a(android.view.View r1, com.beizi.ad.internal.e.e r2);

    boolean a(android.view.View r1, java.util.List<android.view.View> r2, com.beizi.ad.internal.e.b r3);

    java.lang.String b();

    java.lang.String c();

    java.lang.String d();

    java.lang.String e();

    java.lang.String f();

    boolean g();

    void h();

    java.util.ArrayList<java.lang.String> i();

    java.util.ArrayList<java.lang.String> j();

    com.beizi.ad.internal.f.c.a k();

    com.beizi.ad.internal.f.c.a l();

    java.lang.String m();

    com.beizi.ad.lance.ApkBean n();
}
