package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g {
    com.huawei.hms.hatool.c1 a;
    com.huawei.hms.hatool.c1 b;
    android.content.Context c;
    java.lang.String d;

    public g(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.c = r1
        Lf:
            com.huawei.hms.hatool.c1 r1 = new com.huawei.hms.hatool.c1
            r1.<init>()
            r0.a = r1
            com.huawei.hms.hatool.c1 r1 = new com.huawei.hms.hatool.c1
            r1.<init>()
            r0.b = r1
            return
    }

    public com.huawei.hms.hatool.g a(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r1, r0)
            boolean r0 = com.huawei.hms.hatool.w0.d(r4)
            if (r0 != 0) goto L1e
            java.lang.String r4 = ""
        L1e:
            if (r3 == 0) goto L2f
            r0 = 1
            if (r3 == r0) goto L29
            java.lang.String r3 = "Builder.setCollectURL(int type,String collectURL): invalid type!"
            com.huawei.hms.hatool.j1.m(r1, r3)
            return r2
        L29:
            com.huawei.hms.hatool.c1 r3 = r2.b
            r3.i(r4)
            return r2
        L2f:
            com.huawei.hms.hatool.c1 r3 = r2.a
            r3.i(r4)
            return r2
    }

    public com.huawei.hms.hatool.g b(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "Builder.setAppID is execute"
            com.huawei.hms.hatool.j1.h(r0, r1)
            r2.d = r3
            return r2
    }

    @java.lang.Deprecated
    public com.huawei.hms.hatool.g c(boolean r3) {
            r2 = this;
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "Builder.setEnableImei(boolean isReportAndroidImei) is execute."
            com.huawei.hms.hatool.j1.h(r0, r1)
            com.huawei.hms.hatool.c1 r0 = r2.a
            com.huawei.hms.hatool.e0 r0 = r0.z()
            r0.b(r3)
            com.huawei.hms.hatool.c1 r0 = r2.b
            com.huawei.hms.hatool.e0 r0 = r0.z()
            r0.b(r3)
            return r2
    }

    public void d() {
            r3 = this;
            android.content.Context r0 = r3.c
            java.lang.String r1 = "hmsSdk"
            if (r0 != 0) goto Lc
            java.lang.String r0 = "analyticsConf create(): context is null,create failed!"
            com.huawei.hms.hatool.j1.e(r1, r0)
            return
        Lc:
            java.lang.String r0 = "Builder.create() is execute."
            com.huawei.hms.hatool.j1.h(r1, r0)
            com.huawei.hms.hatool.q1 r0 = new com.huawei.hms.hatool.q1
            java.lang.String r1 = "_hms_config_tag"
            r0.<init>(r1)
            com.huawei.hms.hatool.c1 r1 = new com.huawei.hms.hatool.c1
            com.huawei.hms.hatool.c1 r2 = r3.a
            r1.<init>(r2)
            r0.g(r1)
            com.huawei.hms.hatool.c1 r1 = new com.huawei.hms.hatool.c1
            com.huawei.hms.hatool.c1 r2 = r3.b
            r1.<init>(r2)
            r0.d(r1)
            com.huawei.hms.hatool.o0 r1 = com.huawei.hms.hatool.o0.a()
            android.content.Context r2 = r3.c
            r1.b(r2)
            com.huawei.hms.hatool.t r1 = com.huawei.hms.hatool.t.a()
            android.content.Context r2 = r3.c
            r1.c(r2)
            com.huawei.hms.hatool.a1 r1 = com.huawei.hms.hatool.a1.d()
            r1.a(r0)
            com.huawei.hms.hatool.o0 r0 = com.huawei.hms.hatool.o0.a()
            java.lang.String r1 = r3.d
            r0.c(r1)
            return
    }

    @java.lang.Deprecated
    public com.huawei.hms.hatool.g e(boolean r3) {
            r2 = this;
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "Builder.setEnableSN(boolean isReportSN) is execute."
            com.huawei.hms.hatool.j1.h(r0, r1)
            com.huawei.hms.hatool.c1 r0 = r2.a
            com.huawei.hms.hatool.e0 r0 = r0.z()
            r0.d(r3)
            com.huawei.hms.hatool.c1 r0 = r2.b
            com.huawei.hms.hatool.e0 r0 = r0.z()
            r0.d(r3)
            return r2
    }

    @java.lang.Deprecated
    public com.huawei.hms.hatool.g f(boolean r3) {
            r2 = this;
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "Builder.setEnableUDID(boolean isReportUDID) is execute."
            com.huawei.hms.hatool.j1.h(r0, r1)
            com.huawei.hms.hatool.c1 r0 = r2.a
            com.huawei.hms.hatool.e0 r0 = r0.z()
            r0.f(r3)
            com.huawei.hms.hatool.c1 r0 = r2.b
            com.huawei.hms.hatool.e0 r0 = r0.z()
            r0.f(r3)
            return r2
    }
}
