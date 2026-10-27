package xyz.adscope.ad.publish;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class ASNPAdSDK {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.ad.publish.ASNPAdSDK$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InnerCallback implements xyz.adscope.ad.publish.IInitCallback {
        private final xyz.adscope.ad.publish.IInitCallback a;

        InnerCallback(xyz.adscope.ad.publish.IInitCallback r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // xyz.adscope.ad.publish.IInitCallback
        public void alreadyInit() {
                r1 = this;
                xyz.adscope.ad.publish.IInitCallback r0 = r1.a
                if (r0 == 0) goto L7
                r0.alreadyInit()
            L7:
                return
        }

        @Override // xyz.adscope.ad.publish.IInitCallback
        public void initFailed(int r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.ad.publish.IInitCallback r0 = r1.a
                if (r0 == 0) goto L7
                r0.initFailed(r2, r3)
            L7:
                return
        }

        @Override // xyz.adscope.ad.publish.IInitCallback
        public void initSuccess() {
                r1 = this;
                xyz.adscope.ad.publish.IInitCallback r0 = r1.a
                if (r0 == 0) goto L7
                r0.initSuccess()
            L7:
                return
        }

        @Override // xyz.adscope.ad.publish.IInitCallback
        public void initializing() {
                r1 = this;
                xyz.adscope.ad.publish.IInitCallback r0 = r1.a
                if (r0 == 0) goto L7
                r0.initializing()
            L7:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.ad.publish.ASNPAdSDK a;

        static {
                xyz.adscope.ad.publish.ASNPAdSDK r0 = new xyz.adscope.ad.publish.ASNPAdSDK
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.ad.publish.ASNPAdSDK.InstanceHolder.a = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.ad.publish.ASNPAdSDK a() {
                xyz.adscope.ad.publish.ASNPAdSDK r0 = xyz.adscope.ad.publish.ASNPAdSDK.InstanceHolder.a
                return r0
        }
    }

    private ASNPAdSDK() {
            r2 = this;
            r2.<init>()
            xyz.adscope.ad.publish.ASNPAdSDK r0 = xyz.adscope.ad.publish.ASNPAdSDK.InstanceHolder.a()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ ASNPAdSDK(xyz.adscope.ad.publish.ASNPAdSDK.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(xyz.adscope.ad.publish.IInitCallback r2, xyz.adscope.ad.o r3) {
            r1 = this;
            if (r2 == 0) goto L1d
            xyz.adscope.ad.o r0 = xyz.adscope.ad.o.c
            if (r3 != r0) goto La
            r2.initSuccess()
            return
        La:
            xyz.adscope.ad.o r0 = xyz.adscope.ad.o.d
            if (r3 != r0) goto L12
            r2.alreadyInit()
            return
        L12:
            int r0 = r3.b()
            java.lang.String r3 = r3.c()
            r2.initFailed(r0, r3)
        L1d:
            return
    }

    private boolean a(xyz.adscope.ad.publish.ASNPInitConfig r1) {
            r0 = this;
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.getAppId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static xyz.adscope.ad.publish.ASNPAdSDK getInstance() {
            xyz.adscope.ad.publish.ASNPAdSDK r0 = xyz.adscope.ad.publish.ASNPAdSDK.InstanceHolder.a()
            return r0
    }

    public java.lang.String getSDKVersionName() {
            r1 = this;
            java.lang.String r0 = xyz.adscope.ad.f0.c()
            return r0
    }

    public void init(android.content.Context r5, xyz.adscope.ad.publish.ASNPInitConfig r6, xyz.adscope.ad.publish.IInitCallback r7) {
            r4 = this;
            xyz.adscope.ad.publish.ASNPAdSDK$InnerCallback r0 = new xyz.adscope.ad.publish.ASNPAdSDK$InnerCallback
            r0.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "ASNP 版本 "
            r7.append(r1)
            java.lang.String r1 = xyz.adscope.ad.f0.c()
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "ASNPAdSDK"
            xyz.adscope.common.v2.log.SDKLog.i(r1, r7)
            java.lang.String r7 = "Common库 版本 5.2.1.3"
            xyz.adscope.common.v2.log.SDKLog.i(r1, r7)     // Catch: java.lang.Throwable -> L65
            boolean r7 = r4.a(r6)
            if (r7 == 0) goto L5f
            java.lang.String r7 = r6.getAppId()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            java.lang.String r7 = "ASNP 初始化... appID:%s"
            java.lang.String r7 = java.lang.String.format(r7, r2)
            xyz.adscope.common.v2.log.SDKLog.i(r1, r7)
            xyz.adscope.ad.s r7 = xyz.adscope.ad.s.a()
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            java.lang.Object r5 = r7.getOrCreateImplement(r5)
            xyz.adscope.ad.t1 r5 = (xyz.adscope.ad.t1) r5
            boolean r7 = r5.a()
            if (r7 != 0) goto L59
            r5.a(r6, r0)
            return
        L59:
            xyz.adscope.ad.o r5 = xyz.adscope.ad.o.d
            r4.a(r0, r5)
            return
        L5f:
            xyz.adscope.ad.o r5 = xyz.adscope.ad.o.g
            r4.a(r0, r5)
            return
        L65:
            xyz.adscope.ad.o r5 = xyz.adscope.ad.o.k
            r4.a(r0, r5)
            return
    }
}
